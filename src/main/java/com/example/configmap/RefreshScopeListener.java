package com.example.configmap;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class RefreshScopeListener implements ApplicationListener<RefreshScopeRefreshedEvent> {
    private final List<RefreshScheduler> refreshSchedulers;

    @Override
    public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
        refreshSchedulers.forEach(RefreshScheduler::materializeAfterRefresh);
    }
}

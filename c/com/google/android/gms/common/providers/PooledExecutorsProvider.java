package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

public class PooledExecutorsProvider {
    private static PooledExecutorFactory zzvs;

    public interface PooledExecutorFactory {
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    public static PooledExecutorFactory createDefaultFactory() {
        return new zza();
    }

    public static synchronized PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            if (zzvs == null) {
                zzvs = createDefaultFactory();
            }
            pooledExecutorFactory = zzvs;
        }
        return pooledExecutorFactory;
    }

    public static synchronized void setInstance(PooledExecutorFactory pooledExecutorFactory) {
        synchronized (PooledExecutorsProvider.class) {
            PooledExecutorFactory pooledExecutorFactory2 = zzvs;
            zzvs = pooledExecutorFactory;
        }
    }
}

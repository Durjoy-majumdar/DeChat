package androidx.camera.core.internal;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.internal.c */
public final /* synthetic */ class C16560c {
    /* renamed from: a */
    public static Executor m15602a(ThreadConfig threadConfig) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
    }

    /* renamed from: b */
    public static Executor m15603b(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }
}

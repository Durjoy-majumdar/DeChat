package androidx.camera.core.internal;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.internal.a */
public final /* synthetic */ class C16558a {
    /* renamed from: a */
    public static Executor m15596a(IoConfig ioConfig) {
        return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR);
    }

    /* renamed from: b */
    public static Executor m15597b(IoConfig ioConfig, Executor executor) {
        return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, executor);
    }
}

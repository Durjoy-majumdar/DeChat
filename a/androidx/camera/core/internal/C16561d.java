package androidx.camera.core.internal;

import androidx.camera.core.UseCase;

/* renamed from: androidx.camera.core.internal.d */
public final /* synthetic */ class C16561d {
    /* renamed from: a */
    public static UseCase.EventCallback m15605a(UseCaseEventConfig useCaseEventConfig) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK);
    }

    /* renamed from: b */
    public static UseCase.EventCallback m15606b(UseCaseEventConfig useCaseEventConfig, UseCase.EventCallback eventCallback) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
    }
}

package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

public final /* synthetic */ class SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f338314d;

    /* renamed from: e */
    public final /* synthetic */ WindowLayoutInfo f338315e;

    public /* synthetic */ SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f338314d = windowLayoutChangeCallbackWrapper;
        this.f338315e = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m168903accept$lambda0(this.f338314d, this.f338315e);
    }
}

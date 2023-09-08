package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.p */
public final class C80451p implements C80406g {
    public void off() {
        String a = C80415l.f235359c.mo111904a();
        StringBuilder sb = new StringBuilder();
        sb.append("OverlayWindowLifecycleOwner: OFF, hasOverlay = ");
        OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
        sb.append(overlayWindowLifecycleOwner.hasOverlayWindow());
        sb.append(", hasVisible = ");
        sb.append(overlayWindowLifecycleOwner.hasVisibleWindow());
        C118672d.m167353c(a, sb.toString(), new Object[0]);
    }

    /* renamed from: on */
    public void mo60742on() {
        String a = C80415l.f235359c.mo111904a();
        StringBuilder sb = new StringBuilder();
        sb.append("OverlayWindowLifecycleOwner: ON, hasOverlay = ");
        OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
        sb.append(overlayWindowLifecycleOwner.hasOverlayWindow());
        sb.append(", hasVisible = ");
        sb.append(overlayWindowLifecycleOwner.hasVisibleWindow());
        C118672d.m167353c(a, sb.toString(), new Object[0]);
    }

    public boolean serial() {
        return true;
    }
}

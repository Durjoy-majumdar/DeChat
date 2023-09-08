package com.tencent.p014mm.plugin.voip.video.camera.prev;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.video.ObservableSurfaceView;
import p156gj.C107825d;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.plugin.voip.video.camera.prev.CaptureView */
public class CaptureView extends ObservableSurfaceView {
    public CaptureView(Context context) {
        super(context);
        m143752a();
    }

    /* renamed from: a */
    private void m143752a() {
        C107825d dVar = C107835h0.f322845b;
        if (!dVar.f322805d || dVar.f322804c != 8) {
            setNeedSetType(true);
        }
    }

    public CaptureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m143752a();
    }

    public CaptureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m143752a();
    }
}

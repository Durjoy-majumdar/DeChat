package com.tencent.map.lib.models;

import android.os.Handler;
import android.os.Looper;
import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.mapsdk.internal.C113889km;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;

public class OverlayListenerInfo {
    private VectorOverlay.OnVectorOverlayLoadListener innerListener = new VectorOverlay.OnVectorOverlayLoadListener() {
        public final void onVectorOverlayLoaded(final boolean z) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener = OverlayListenerInfo.this.outterVectorOverlayLoadListener;
                    if (onVectorOverlayLoadListener != null) {
                        onVectorOverlayLoadListener.onVectorOverlayLoaded(z);
                        C113889km.m157545b(C0949kl.f2254x, "TMS vetorOverlay loaded status: " + z);
                    }
                }
            });
        }
    };
    public VectorOverlay.OnVectorOverlayClickListener outterVectorOverlayClickListener;
    public VectorOverlay.OnVectorOverlayLoadListener outterVectorOverlayLoadListener;

    public VectorOverlay.OnVectorOverlayClickListener getOutterVectorOverlayClickListener() {
        return this.outterVectorOverlayClickListener;
    }

    public void setOutterVectorOverlayClickListener(VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.outterVectorOverlayClickListener = onVectorOverlayClickListener;
    }

    public void setOutterVectorOverlayLoadListener(VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.outterVectorOverlayLoadListener = onVectorOverlayLoadListener;
    }
}

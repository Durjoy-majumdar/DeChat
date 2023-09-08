package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.w1 */
public class C85654w1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f249614d;

    /* renamed from: e */
    public final /* synthetic */ VideoTextureView f249615e;

    public C85654w1(VideoTextureView videoTextureView, Surface surface) {
        this.f249615e = videoTextureView;
        this.f249614d = surface;
    }

    public void run() {
        try {
            Surface surface = this.f249614d;
            if (surface != null && surface.isValid()) {
                Log.m105925i("MicroMsg.VideoTextureView", "%d release surface [%d]", Integer.valueOf(this.f249615e.hashCode()), Integer.valueOf(this.f249614d.hashCode()));
                this.f249614d.release();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "release Surface error", new Object[0]);
        }
    }
}

package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.x1 */
public class C96894x1 extends Thread {

    /* renamed from: d */
    public final /* synthetic */ MediaPlayer f283888d;

    /* renamed from: e */
    public final /* synthetic */ VideoTextureView f283889e;

    public C96894x1(VideoTextureView videoTextureView, MediaPlayer mediaPlayer) {
        this.f283889e = videoTextureView;
        this.f283888d = mediaPlayer;
    }

    public void run() {
        try {
            if (this.f283888d != null) {
                Log.m105925i("MicroMsg.VideoTextureView", "%d another thread to release player[%s]", Integer.valueOf(this.f283889e.hashCode()), this.f283888d);
                this.f283888d.stop();
                this.f283888d.release();
            }
        } catch (Exception unused) {
        }
    }
}

package com.tencent.p014mm.plugin.game.media.background;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;

/* renamed from: com.tencent.mm.plugin.game.media.background.GameFakeVideoView */
public class GameFakeVideoView extends VideoPlayerTextureView {
    public GameFakeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        super.mo150035G(surfaceTexture);
        C96875r0.C96876a aVar = this.f318496w;
        if (aVar != null) {
            aVar.mo76207M0(getCurrentPosition(), getDuration());
        }
    }

    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
    }

    public GameFakeVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public GameFakeVideoView(Context context) {
        super(context, (AttributeSet) null);
    }
}

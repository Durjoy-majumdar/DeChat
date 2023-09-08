package com.tencent.thumbplayer.api;

import android.graphics.SurfaceTexture;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils;
import com.tencent.thumbplayer.core.common.TPVideoPacket;
import com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback;
import com.tencent.thumbplayer.core.player.TPNativePlayerSurface;
import com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo;

public final class TPSurface extends TPNativePlayerSurface {
    private ITPNativePlayerSurfaceCallback mITPSurfaceCallback;
    /* access modifiers changed from: private */
    public ITPSurfaceListener mPlayerSurfaceListener = null;

    public TPSurface(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        C200581 r1 = new ITPNativePlayerSurfaceCallback() {
            public void onFlush() {
                ITPSurfaceListener access$000 = TPSurface.this.mPlayerSurfaceListener;
                if (access$000 != null) {
                    access$000.onFlush();
                }
            }

            public void onRenderInfo(TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo) {
                ITPSurfaceListener access$000 = TPSurface.this.mPlayerSurfaceListener;
                if (access$000 != null) {
                    access$000.onRenderInfo(TPThumbPlayerUtils.convert2TPPlayerSurfaceRenderInfo(tPNativePlayerSurfaceRenderInfo));
                }
            }

            public void onVideoPacket(TPVideoPacket tPVideoPacket, long j) {
                ITPSurfaceListener access$000 = TPSurface.this.mPlayerSurfaceListener;
                if (access$000 != null) {
                    access$000.onVideoPacket(TPThumbPlayerUtils.convert2TPVideoPacketBuffer(tPVideoPacket), j);
                }
            }
        };
        this.mITPSurfaceCallback = r1;
        super.setTPSurfaceCallback(r1);
    }

    public void finalize() {
        release();
        super.finalize();
    }

    public void setSurfaceListener(ITPSurfaceListener iTPSurfaceListener) {
        this.mPlayerSurfaceListener = iTPSurfaceListener;
    }
}

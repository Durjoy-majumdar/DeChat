package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u2 */
public class C105708u2 extends MMTextureView implements TextureView.SurfaceTextureListener {
    /* renamed from: E */
    public static int[] m141913E(byte[] bArr, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = i / 4;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 4;
            byte b = bArr[i4];
            int i5 = (((b >> 4) & 15) * 16) + (b & 15);
            byte b2 = bArr[i4 + 1];
            int i6 = (((b2 >> 4) & 15) * 16) + (b2 & 15);
            byte b3 = bArr[i4 + 2];
            int i7 = (((b3 >> 4) & 15) * 16) + (b3 & 15);
            byte b4 = bArr[i4 + 3];
            iArr[i3] = (((((b4 >> 4) & 15) * 16) + (b4 & 15)) << 24) | (i7 << 16) | (i6 << 8) | i5;
        }
        return iArr;
    }

    public int getMemberId() {
        return 0;
    }

    public String getOpenId() {
        return null;
    }

    public int getViewId() {
        return 0;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureAvailable, surface:");
        sb.append(surfaceTexture == null ? "isNull" : "nonNull");
        sb.append(", viewId:");
        sb.append(0);
        sb.append(", openId:");
        sb.append((String) null);
        sb.append(", mId:");
        sb.append(0);
        sb.append(", width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        Log.m105924i("MicroMsg.Multitalk.ILinkVideoView", sb.toString());
        mo82024B();
        try {
            Canvas lockCanvas = lockCanvas();
            lockCanvas.drawColor(-16777216);
            unlockCanvasAndPost(lockCanvas);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Multitalk.ILinkVideoView", e, "drawColor for background, unlockCanvasAndPost crash", new Object[0]);
        }
        synchronized (this) {
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.Multitalk.ILinkVideoView", "onSurfaceTextureDestroyed, viewId:0, openId:null, mId:0");
        synchronized (this) {
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.Multitalk.ILinkVideoView", "onSurfaceTextureSizeChanged, viewId:" + 0 + ", openId:" + null + ", mId:" + 0 + ", width:" + i + ", height:" + i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* renamed from: com.tencent.liteav.videobase.frame.c */
public final class C17221c {

    /* renamed from: a */
    private int f46567a = -1;

    /* renamed from: a */
    public final void mo20190a() {
        if (this.f46567a == -1) {
            this.f46567a = OpenGlUtils.generateFrameBufferId();
        }
    }

    /* renamed from: b */
    public final void mo20192b() {
        OpenGlUtils.bindFramebuffer(36160, this.f46567a);
    }

    /* renamed from: c */
    public final void mo20193c() {
        int i = this.f46567a;
        if (i == -1) {
            LiteavLog.m16896d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.detachTextureFromFrameBuffer(i);
        }
    }

    /* renamed from: d */
    public final void mo20194d() {
        int i = this.f46567a;
        if (i != -1) {
            OpenGlUtils.deleteFrameBuffer(i);
            this.f46567a = -1;
        }
    }

    /* renamed from: a */
    public final void mo20191a(int i) {
        int i2 = this.f46567a;
        if (i2 == -1) {
            LiteavLog.m16896d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.attachTextureToFrameBuffer(i, i2);
        }
    }
}

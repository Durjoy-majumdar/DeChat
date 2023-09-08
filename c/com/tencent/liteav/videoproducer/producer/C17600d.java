package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.os.Looper;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.producer.d */
public final class C17600d extends OrientationEventListener implements C113473t.C113474a {

    /* renamed from: a */
    private final C17601a f47875a;

    /* renamed from: b */
    private final Display f47876b;

    /* renamed from: c */
    private Rotation f47877c;

    /* renamed from: d */
    private int f47878d;

    /* renamed from: e */
    private C113473t f47879e;

    /* renamed from: com.tencent.liteav.videoproducer.producer.d$a */
    public interface C17601a {
        /* renamed from: a */
        void mo20917a(Rotation rotation, int i);
    }

    public C17600d(Context context, C17601a aVar) {
        super(context);
        this.f47875a = aVar;
        this.f47876b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private static int m17810a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i != 2) {
            return i != 3 ? 0 : 270;
        }
        return 180;
    }

    /* renamed from: b */
    private void m17811b() {
        C17601a aVar = this.f47875a;
        if (aVar != null) {
            aVar.mo20917a(this.f47877c, m17810a(this.f47878d));
        }
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        int rotation = this.f47876b.getRotation();
        if (this.f47878d != rotation) {
            this.f47878d = rotation;
            m17811b();
        }
    }

    public final void disable() {
        super.disable();
        C113473t tVar = this.f47879e;
        if (tVar != null) {
            tVar.mo169973a();
            this.f47879e = null;
        }
    }

    public final void enable() {
        super.enable();
        if (this.f47879e == null) {
            C113473t tVar = new C113473t(Looper.getMainLooper(), this);
            this.f47879e = tVar;
            tVar.mo169974a(0, 1000);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOrientationChanged(int r2) {
        /*
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L_0x0004
            return
        L_0x0004:
            r0 = 45
            if (r2 <= r0) goto L_0x001d
            r0 = 135(0x87, float:1.89E-43)
            if (r2 > r0) goto L_0x000f
            com.tencent.liteav.videobase.utils.Rotation r2 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90
            goto L_0x001f
        L_0x000f:
            r0 = 225(0xe1, float:3.15E-43)
            if (r2 > r0) goto L_0x0016
            com.tencent.liteav.videobase.utils.Rotation r2 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_180
            goto L_0x001f
        L_0x0016:
            r0 = 315(0x13b, float:4.41E-43)
            if (r2 > r0) goto L_0x001d
            com.tencent.liteav.videobase.utils.Rotation r2 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270
            goto L_0x001f
        L_0x001d:
            com.tencent.liteav.videobase.utils.Rotation r2 = com.tencent.liteav.videobase.utils.Rotation.NORMAL
        L_0x001f:
            com.tencent.liteav.videobase.utils.Rotation r0 = r1.f47877c
            if (r0 == r2) goto L_0x0030
            r1.f47877c = r2
            android.view.Display r2 = r1.f47876b
            int r2 = r2.getRotation()
            r1.f47878d = r2
            r1.m17811b()
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17600d.onOrientationChanged(int):void");
    }
}

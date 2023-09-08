package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.C17221c;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videobase.utils.j */
public final class C17251j {

    /* renamed from: a */
    public TakeSnapshotListener f46629a;

    /* renamed from: b */
    private final String f46630b;

    /* renamed from: c */
    private C17234j f46631c;

    /* renamed from: d */
    private C17223e f46632d;

    /* renamed from: e */
    private boolean f46633e = false;

    /* renamed from: f */
    private final C17221c f46634f = new C17221c();

    /* renamed from: g */
    private ExecutorService f46635g;

    /* renamed from: h */
    private int f46636h = 0;

    /* renamed from: i */
    private int f46637i = 0;

    public C17251j(String str) {
        this.f46630b = "SnapshotTaker_" + str + "_" + hashCode();
    }

    /* renamed from: a */
    public final void mo20231a(C17223e eVar) {
        int i;
        LiteavLog.m16901i(this.f46630b, "initialize");
        if (this.f46632d == null) {
            this.f46632d = new C17223e();
            this.f46633e = true;
        } else {
            this.f46632d = eVar;
        }
        if (this.f46635g == null) {
            this.f46635g = new ThreadPoolExecutor(0, 1, 5, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.f46634f.mo20190a();
        int i2 = this.f46636h;
        if (i2 != 0 && (i = this.f46637i) != 0 && this.f46631c == null) {
            this.f46631c = new C17234j(i2, i);
        }
    }

    /* renamed from: a */
    public final void mo20229a(int i, int i2) {
        if (i != this.f46636h || i2 != this.f46637i) {
            String str = this.f46630b;
            LiteavLog.m16901i(str, "setSize width=" + i + ", height=" + i2);
            C17234j jVar = this.f46631c;
            if (jVar != null) {
                jVar.mo20209a();
                this.f46631c = null;
            }
            this.f46631c = new C17234j(i, i2);
            this.f46636h = i;
            this.f46637i = i2;
        }
    }

    /* renamed from: a */
    public final void mo20228a() {
        LiteavLog.m16901i(this.f46630b, "uninitialize");
        TakeSnapshotListener takeSnapshotListener = this.f46629a;
        if (takeSnapshotListener != null) {
            takeSnapshotListener.onComplete((Bitmap) null);
            this.f46629a = null;
        }
        C17223e eVar = this.f46632d;
        if (eVar != null && this.f46633e) {
            eVar.mo20184a();
            this.f46632d.mo20187b();
            this.f46632d = null;
            this.f46633e = false;
        }
        ExecutorService executorService = this.f46635g;
        if (executorService != null) {
            executorService.shutdown();
            this.f46635g = null;
        }
        C17234j jVar = this.f46631c;
        if (jVar != null) {
            jVar.mo20209a();
            this.f46631c = null;
        }
        this.f46634f.mo20194d();
    }

    /* renamed from: a */
    public final void mo20230a(PixelFrame pixelFrame) {
        int i;
        C17223e eVar;
        if (this.f46629a != null && pixelFrame != null) {
            int i2 = this.f46636h;
            if (i2 == 0 || (i = this.f46637i) == 0) {
                LiteavLog.m16905w(this.f46630b, "snapshot when surface height or width is zero!");
            } else if (this.f46631c == null || (eVar = this.f46632d) == null) {
                String str = this.f46630b;
                LiteavLog.m16905w(str, "snapshot:  mGLTexturePool= " + this.f46632d + ", mPixelFrameRender = " + this.f46632d);
            } else {
                C17222d a = eVar.mo20199a(i2, i);
                this.f46631c.mo20210a(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, a);
                this.f46634f.mo20191a(a.mo20195a());
                this.f46634f.mo20192b();
                int i3 = this.f46636h;
                int i4 = this.f46637i;
                TakeSnapshotListener takeSnapshotListener = this.f46629a;
                if (takeSnapshotListener == null || this.f46635g == null) {
                    String str2 = this.f46630b;
                    LiteavLog.m16901i(str2, "snapshot listener = " + takeSnapshotListener + ", mExecutorService = " + this.f46635g);
                } else {
                    ByteBuffer order = ByteBuffer.allocateDirect(i3 * i4 * 4).order(ByteOrder.nativeOrder());
                    order.position(0);
                    OpenGlUtils.readPixels(0, 0, i3, i4, order);
                    try {
                        this.f46635g.execute(C104522k.m139839a(order, i3, i4, takeSnapshotListener));
                    } catch (Exception e) {
                        String str3 = this.f46630b;
                        LiteavLog.m16905w(str3, "mExecutorService execute exception: " + e.toString());
                        takeSnapshotListener.onComplete((Bitmap) null);
                    }
                }
                this.f46629a = null;
                OpenGlUtils.bindFramebuffer(36160, 0);
                this.f46634f.mo20193c();
                a.release();
            }
        }
    }
}

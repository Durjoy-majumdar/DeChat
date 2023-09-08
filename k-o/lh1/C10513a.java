package lh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51390tf3;
import te3.C51474u01;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$getCropPosition$2", mo125469f = "ScreenShotView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lh1.a */
public final class C10513a extends C91594j implements C32227p<C0000n0, C15601d<? super int[]>, Object> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f31750d;

    /* renamed from: e */
    public final /* synthetic */ boolean f31751e;

    /* renamed from: f */
    public final /* synthetic */ C51474u01 f31752f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10513a(Bitmap bitmap, boolean z, C51474u01 u012, C15601d<? super C10513a> dVar) {
        super(2, dVar);
        this.f31750d = bitmap;
        this.f31751e = z;
        this.f31752f = u012;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10513a(this.f31750d, this.f31751e, this.f31752f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10513a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C51474u01 u012;
        C51390tf3 tf32;
        C51390tf3 tf33;
        int i;
        int i2;
        ResultKt.throwOnFailure(obj);
        float width = ((float) this.f31750d.getWidth()) / ((float) this.f31750d.getHeight());
        if (!(this.f31751e || (tf32 = (u012 = this.f31752f).f142521n) == null || (tf33 = u012.f142522o) == null)) {
            float f = 0.0f;
            if ((tf33 != null ? tf33.f142199d : 0.0f) - (tf32 != null ? tf32.f142199d : 0.0f) > 0.0f) {
                if ((tf33 != null ? tf33.f142200e : 0.0f) - (tf32 != null ? tf32.f142200e : 0.0f) > 0.0f && (i = u012.f142526s) != 0 && (i2 = u012.f142527t) != 0 && ((double) Math.abs((((float) i2) / ((float) i)) - width)) < ((double) width) * 0.1d) {
                    C51474u01 u013 = this.f31752f;
                    C51390tf3 tf34 = u013.f142522o;
                    float f2 = tf34 != null ? tf34.f142199d : 0.0f;
                    C51390tf3 tf35 = u013.f142521n;
                    float width2 = (f2 - (tf35 != null ? tf35.f142199d : 0.0f)) * ((float) this.f31750d.getWidth());
                    C51390tf3 tf36 = this.f31752f.f142521n;
                    float width3 = (tf36 != null ? tf36.f142199d : 0.0f) * ((float) this.f31750d.getWidth());
                    C51474u01 u014 = this.f31752f;
                    C51390tf3 tf37 = u014.f142522o;
                    float f3 = tf37 != null ? tf37.f142200e : 0.0f;
                    C51390tf3 tf38 = u014.f142521n;
                    float height = (f3 - (tf38 != null ? tf38.f142200e : 0.0f)) * ((float) this.f31750d.getHeight());
                    C51390tf3 tf39 = this.f31752f.f142522o;
                    if (tf39 != null) {
                        f = tf39.f142200e;
                    }
                    return new int[]{(int) width3, (int) width2, (int) ((1.0f - f) * ((float) this.f31750d.getHeight())), (int) height};
                }
            }
        }
        if (!this.f31751e) {
            int i3 = (width > 1.7777778f ? 1 : (width == 1.7777778f ? 0 : -1));
            if (!(i3 == 0)) {
                int i4 = (width > 0.5625f ? 1 : (width == 0.5625f ? 0 : -1));
                if (!(i4 == 0)) {
                    if (this.f31750d.getWidth() > this.f31750d.getHeight()) {
                        if (i3 < 0) {
                            int width4 = this.f31750d.getWidth();
                            int i5 = (int) (((float) width4) / 1.7777778f);
                            return new int[]{0, width4, (this.f31750d.getHeight() - i5) / 2, i5};
                        }
                        int height2 = this.f31750d.getHeight();
                        int i6 = (int) (((float) height2) * 1.7777778f);
                        return new int[]{(this.f31750d.getWidth() - i6) / 2, i6, 0, height2};
                    } else if (i4 < 0) {
                        int width5 = this.f31750d.getWidth();
                        int i7 = (int) (((float) width5) / 0.5625f);
                        return new int[]{0, width5, (this.f31750d.getHeight() - i7) / 2, i7};
                    } else {
                        int height3 = this.f31750d.getHeight();
                        int i8 = (int) (((float) height3) * 0.5625f);
                        return new int[]{(this.f31750d.getWidth() - i8) / 2, i8, 0, height3};
                    }
                }
            }
        }
        return new int[]{0, this.f31750d.getWidth(), 0, this.f31750d.getHeight()};
    }
}

package x82;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import x82.C112075a;

/* renamed from: x82.f0 */
public final class C112093f0 {

    /* renamed from: a */
    public Context f335591a;

    /* renamed from: b */
    public C112075a f335592b;

    /* renamed from: c */
    public C112095g f335593c;

    /* renamed from: d */
    public final int f335594d = 4;

    /* renamed from: e */
    public final int f335595e = 1;

    /* renamed from: f */
    public View f335596f;

    /* renamed from: g */
    public TextView f335597g;

    /* renamed from: h */
    public TextView f335598h;

    /* renamed from: i */
    public int f335599i = 4;

    /* renamed from: j */
    public MTimerHandler f335600j = new MTimerHandler(new C112094a(this), true);

    /* renamed from: x82.f0$a */
    public static final class C112094a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C112093f0 f335601d;

        public C112094a(C112093f0 f0Var) {
            this.f335601d = f0Var;
        }

        public final boolean onTimerExpired() {
            C112093f0 f0Var = this.f335601d;
            int i = f0Var.f335599i;
            if (i > f0Var.f335595e) {
                f0Var.f335599i = i - 1;
                f0Var.mo163797a();
                return true;
            }
            C112075a.C112076a.m152803a(f0Var.f335592b, C112075a.C112077b.SCREEN_READY_UI_FINISH, (Bundle) null, 2, (Object) null);
            return false;
        }
    }

    public C112093f0(Context context, C112075a aVar, C112095g gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335591a = context;
        this.f335592b = aVar;
        this.f335593c = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r1.getResources();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163797a() {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f335597g
            if (r0 != 0) goto L_0x0005
            goto L_0x000e
        L_0x0005:
            int r1 = r3.f335599i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
        L_0x000e:
            android.widget.TextView r0 = r3.f335598h
            if (r0 != 0) goto L_0x0013
            goto L_0x0029
        L_0x0013:
            android.content.Context r1 = r3.f335591a
            if (r1 == 0) goto L_0x0025
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0025
            r2 = 2131834399(0x7f11361f, float:1.9301907E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.setText(r1)
        L_0x0029:
            android.widget.TextView r0 = r3.f335597g
            r1 = 1069547520(0x3fc00000, float:1.5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r0.setScaleX(r1)
        L_0x0033:
            android.widget.TextView r0 = r3.f335597g
            if (r0 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0.setScaleY(r1)
        L_0x003b:
            android.widget.TextView r0 = r3.f335597g
            if (r0 == 0) goto L_0x005e
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x005e
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            if (r0 == 0) goto L_0x005e
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            if (r0 == 0) goto L_0x005e
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            if (r0 == 0) goto L_0x005e
            r0.start()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112093f0.mo163797a():void");
    }
}

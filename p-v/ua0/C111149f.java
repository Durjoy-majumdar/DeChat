package ua0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import iy3.C60641c;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.ResultKt;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60690y0;
import p196ln.C76708i;
import p436a1.C103229d0;
import p436a1.C103230e;
import p436a1.C103274x;
import p560i2.C108329n;
import p560i2.C33181m;
import p835c1.C104231f;
import p835c1.C104233g;
import rx3.C13598b0;
import wx3.C15601d;
import yl0.C91489i;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ua0.f */
public final class C111149f extends C106969c implements C24725u1 {

    /* renamed from: i */
    public final C0000n0 f332858i;

    /* renamed from: j */
    public final String f332859j;

    /* renamed from: n */
    public final boolean f332860n;

    /* renamed from: o */
    public final C60690y0 f332861o = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);

    /* renamed from: p */
    public C103229d0 f332862p;

    /* renamed from: q */
    public C53973z1 f332863q;

    /* renamed from: r */
    public float f332864r = 1.0f;

    /* renamed from: s */
    public C103274x f332865s;

    /* renamed from: t */
    public long f332866t;

    /* renamed from: u */
    public long f332867u;

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.painter.MMAvatarPainter$refreshBitmap$1", mo125469f = "MMAvatarPainter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ua0.f$a */
    public static final class C111150a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111149f f332868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111150a(C111149f fVar, C15601d<? super C111150a> dVar) {
            super(2, dVar);
            this.f332868d = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111150a(this.f332868d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111150a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Class cls = C76708i.class;
            ResultKt.throwOnFailure(obj);
            if (this.f332868d.f332860n) {
                C111149f fVar = this.f332868d;
                String str = fVar.f332859j;
                long j = fVar.f332867u;
                bitmap = ((C76708i) C86312j.m106911c(cls)).mo106846sO(str, (int) (j >> 32), C33181m.m39966b(j), 0);
            } else {
                bitmap = ((C76708i) C86312j.m106911c(cls)).N50(this.f332868d.f332859j);
            }
            if (bitmap == null) {
                bitmap = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            }
            if (bitmap != null) {
                C111149f fVar2 = this.f332868d;
                fVar2.f332862p = C103230e.m136642b(bitmap);
                fVar2.f332866t = C108329n.m146743a(bitmap.getWidth(), bitmap.getHeight());
            }
            C111149f fVar3 = this.f332868d;
            ((C108494d2) fVar3.f332861o).setValue(Integer.valueOf(((Number) ((C108494d2) fVar3.f332861o).getValue()).intValue() + 1));
            return C13598b0.f38549a;
        }
    }

    public C111149f(C0000n0 n0Var, String str, boolean z) {
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(str, "userName");
        this.f332858i = n0Var;
        this.f332859j = str;
        this.f332860n = z;
        long a = C108329n.m146743a(0, 0);
        this.f332866t = a;
        this.f332867u = a;
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f332864r = f;
        return true;
    }

    /* renamed from: b */
    public void mo51625b() {
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        Log.m105924i("MMAvatarPainter", "onRemembered() called " + this.f332859j + ", loadHd: " + this.f332860n);
        if (this.f332862p == null) {
            mo162887j();
        }
    }

    /* renamed from: d */
    public void mo51627d() {
        Log.m105924i("MMAvatarPainter", "onForgotten() called " + this.f332859j + ", loadHd: " + this.f332860n);
        C53973z1 z1Var = this.f332863q;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f332863q = null;
        this.f332862p = null;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f332865s = xVar;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111149f)) {
            return false;
        }
        C111149f fVar = (C111149f) obj;
        return C87412m.m108589b(this.f332862p, fVar.f332862p) && C33181m.m39965a(this.f332866t, fVar.f332866t);
    }

    /* renamed from: h */
    public long mo84458h() {
        C103229d0 d0Var = this.f332862p;
        if (d0Var != null) {
            return C112546l.m153761a((float) d0Var.getWidth(), (float) d0Var.getHeight());
        }
        int i = C112545k.f336975d;
        return C112545k.f336974c;
    }

    public int hashCode() {
        C103229d0 d0Var = this.f332862p;
        int hashCode = d0Var != null ? d0Var.hashCode() : 0;
        long j = this.f332866t;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C13598b0 b0Var;
        C87412m.m108594g(fVar, "<this>");
        this.f332867u = C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(fVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(fVar.mo145819e())));
        ((Number) ((C108494d2) this.f332861o).getValue()).intValue();
        C103229d0 d0Var = this.f332862p;
        if (d0Var != null) {
            C104231f.C104232a.m139083b(fVar, d0Var, 0, this.f332866t, 0, this.f332867u, this.f332864r, (C104233g) null, this.f332865s, 0, 0, C91489i.CTRL_INDEX, (Object) null);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null && this.f332860n && this.f332863q == null) {
            mo162887j();
        }
    }

    /* renamed from: j */
    public final void mo162887j() {
        Log.m105924i("MMAvatarPainter", "refreshBitmap() called " + this.f332859j + ", loadHd: " + this.f332860n);
        if ((!this.f332860n || ((int) (this.f332867u >> 32)) != 0) && C33181m.m39966b(this.f332867u) != 0) {
            C53973z1 z1Var = this.f332863q;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f332863q = C53895h.m60466d(this.f332858i, C53872d1.f151119c, (C53934p0) null, new C111150a(this, (C15601d<? super C111150a>) null), 2, (Object) null);
        }
    }

    public String toString() {
        return "MMAvatarPainter(image=" + this.f332862p + ", srcSize=" + C33181m.m39967c(this.f332866t) + ')';
    }
}

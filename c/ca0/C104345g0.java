package ca0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import org.libpag.PAGView;
import p175j0.C108504h;
import p175j0.C33487v1;
import p583k2.C108846c;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: ca0.g0 */
public final class C104345g0 {

    /* renamed from: ca0.g0$a */
    public /* synthetic */ class C92384a extends C24565l implements C32226l<Context, PAGView> {

        /* renamed from: d */
        public static final C92384a f264361d = new C92384a();

        public C92384a() {
            super(1, PAGView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
        }

        public Object invoke(Object obj) {
            return new PAGView((Context) obj);
        }
    }

    /* renamed from: ca0.g0$b */
    public static final class C92385b extends C87413o implements C32226l<PAGView, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f264362d;

        /* renamed from: e */
        public final /* synthetic */ String f264363e;

        /* renamed from: f */
        public final /* synthetic */ C92387h0 f264364f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92385b(C8477a0 a0Var, String str, C92387h0 h0Var) {
            super(1);
            this.f264362d = a0Var;
            this.f264363e = str;
            this.f264364f = h0Var;
        }

        public Object invoke(Object obj) {
            PAGView pAGView = (PAGView) obj;
            C87412m.m108594g(pAGView, LocaleUtil.ITALIAN);
            C8477a0 a0Var = this.f264362d;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                pAGView.setPath(this.f264363e);
                C92387h0 h0Var = this.f264364f;
                h0Var.getClass();
                pAGView.setRepeatCount(0);
                pAGView.play();
                h0Var.f264369d = pAGView;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.g0$c */
    public static final class C92386c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f264365d;

        /* renamed from: e */
        public final /* synthetic */ C92387h0 f264366e;

        /* renamed from: f */
        public final /* synthetic */ int f264367f;

        /* renamed from: g */
        public final /* synthetic */ int f264368g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92386c(String str, C92387h0 h0Var, int i, int i2) {
            super(2);
            this.f264365d = str;
            this.f264366e = h0Var;
            this.f264367f = i;
            this.f264368g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104345g0.m139321a(this.f264365d, this.f264366e, (C108504h) obj, this.f264367f | 1, this.f264368g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m139321a(String str, C92387h0 h0Var, C108504h hVar, int i, int i2) {
        int i3;
        C87412m.m108594g(str, "path");
        C108504h z = hVar.mo51623z(-1740681195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (z.mo51619x(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 == 2 && (i3 & 91) == 18 && z.mo51575a()) {
            z.mo51581d();
        } else {
            z.mo51559J();
            if ((i & 1) != 0 && !z.mo51582e()) {
                z.mo51581d();
            } else if (i4 != 0) {
                z.mo51557H(1058318404);
                z.mo51557H(-492369756);
                Object q = z.mo51606q();
                int i5 = C108504h.f324828a;
                if (q == C108504h.C60656a.f172772a) {
                    q = new C92387h0();
                    z.mo51553F(q);
                }
                z.mo51565P();
                h0Var = (C92387h0) q;
                z.mo51565P();
            }
            z.mo51555G();
            C108846c.m147713a(C92384a.f264361d, (C65503j) null, new C92385b(new C8477a0(), str, h0Var), z, 0, 2);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C92386c(str, h0Var, i, i2));
        }
    }
}

package xk1;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11184p0;
import nj3.C76912y0;
import o40.C61926c;
import qg1.C12224i;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51885ww0;
import te3.C64373fs0;
import tf0.C64916p1;

/* renamed from: xk1.u2 */
public final class C15782u2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15771r2 f42542d;

    /* renamed from: xk1.u2$a */
    public static final class C15783a implements C12224i.C12225a {

        /* renamed from: a */
        public final /* synthetic */ C15771r2 f42543a;

        /* renamed from: xk1.u2$a$a */
        public static final class C15784a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f42544d;

            /* renamed from: e */
            public final /* synthetic */ C15771r2 f42545e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15784a(int i, C15771r2 r2Var) {
                super(0);
                this.f42544d = i;
                this.f42545e = r2Var;
            }

            public Object invoke() {
                if (this.f42544d == -200067) {
                    C15771r2 r2Var = this.f42545e;
                    r2Var.mo14488e3();
                    C64373fs0 fs02 = (C64373fs0) C110818d0.m150916N(r2Var.f42519s);
                    if (fs02 != null) {
                        r2Var.f42520t = fs02.f183215f;
                    }
                    r2Var.mo14487d3();
                } else {
                    C76912y0.makeText((Context) this.f42545e.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e_t), 0).show();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: xk1.u2$a$b */
        public static final class C15785b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C15771r2 f42546d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15785b(C15771r2 r2Var) {
                super(0);
                this.f42546d = r2Var;
            }

            public Object invoke() {
                Class cls = C64916p1.class;
                C15771r2 r2Var = this.f42546d;
                r2Var.mo14488e3();
                C64373fs0 fs02 = (C64373fs0) C110818d0.m150916N(r2Var.f42519s);
                if (fs02 != null) {
                    r2Var.f42520t = fs02.f183215f;
                }
                r2Var.mo14487d3();
                ((C64916p1) C86312j.m106911c(cls)).Vm0("FinderLiveVisitorRoleUIC.MENU_ID_DELETE_ROLE");
                ((C64916p1) C86312j.m106911c(cls)).mo9108z2().mo58458b(65536, 9);
                return C13598b0.f38549a;
            }
        }

        public C15783a(C15771r2 r2Var) {
            this.f42543a = r2Var;
        }

        /* renamed from: a */
        public void mo11956a(int i, int i2, String str) {
            C61926c.m72668M(new C15784a(i2, this.f42543a));
        }

        /* renamed from: b */
        public void mo11957b(C51885ww0 ww02) {
            C87412m.m108594g(ww02, "resp");
            C61926c.m72668M(new C15785b(this.f42543a));
        }
    }

    public C15782u2(C15771r2 r2Var) {
        this.f42542d = r2Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 10001) {
            new C12224i(new C15783a(this.f42542d)).mo9225i();
        }
        C77407n nVar = this.f42542d.f42514n;
        if (nVar != null) {
            nVar.mo107572p();
        }
    }
}

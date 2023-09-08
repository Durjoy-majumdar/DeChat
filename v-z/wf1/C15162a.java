package wf1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cl1.C0690t1;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: wf1.a */
public final class C15162a extends UIComponent {

    /* renamed from: g */
    public static final C15163a f41297g = new C15163a((C8480h) null);

    /* renamed from: d */
    public String f41298d = "";

    /* renamed from: e */
    public boolean f41299e = true;

    /* renamed from: f */
    public final C13601g f41300f;

    /* renamed from: wf1.a$a */
    public static final class C15163a {
        public C15163a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo14114a(C0690t1 t1Var, NeatTextView neatTextView) {
            String str;
            C87412m.m108594g(t1Var, "whiteSlice");
            C87412m.m108594g(neatTextView, "descTv");
            if (t1Var.mo653f3()) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dep);
                C87412m.m108593f(str, "{\n                    MM…_title)\n                }");
            } else {
                boolean z = true;
                if (t1Var.f1630j == 1) {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9s);
                    C87412m.m108593f(str, "{\n                    MM…earsal)\n                }");
                } else {
                    if (!C61926c.m72696u(t1Var.f1629i, 2) || C61926c.m72696u(t1Var.f1629i, 5)) {
                        z = false;
                    }
                    if (z) {
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n_0);
                        C87412m.m108593f(str, "{\n                    MM…atroom)\n                }");
                    } else if (C61926c.m72696u(t1Var.f1629i, 7)) {
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n_3);
                        C87412m.m108593f(str, "{  //主播分享逻辑暂时没有了，不加入，等要做…st_new)\n                }");
                    } else {
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_2);
                        C87412m.m108593f(str, "{\n                    MM…public)\n                }");
                    }
                }
            }
            neatTextView.mo104279b(str);
        }
    }

    /* renamed from: wf1.a$b */
    public static final class C15164b extends C87413o implements C32224a<C15221m0> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15164b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41301d = appCompatActivity;
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f41301d).mo75002a(C15221m0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ingCustomUIC::class.java)");
            return (C15221m0) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15162a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41300f = C36568h.m40985a(new C15164b(appCompatActivity));
    }

    /* renamed from: c3 */
    public final C15221m0 mo14113c3() {
        return (C15221m0) ((C36570n) this.f41300f).getValue();
    }
}

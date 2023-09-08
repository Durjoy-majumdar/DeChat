package wt1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p602ly.C109440d;
import p623nr.C76956i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import st1.C77761h0;

/* renamed from: wt1.h0 */
public final class C78670h0 extends UIComponent {

    /* renamed from: d */
    public String f230370d;

    /* renamed from: e */
    public final C13601g f230371e = C36568h.m40985a(C78685c.f230388d);

    /* renamed from: f */
    public final C54219z<C78680b> f230372f = new C54219z<>();

    /* renamed from: g */
    public final C54219z<C78671a> f230373g = new C54219z<>();

    /* renamed from: wt1.h0$a */
    public static abstract class C78671a {

        /* renamed from: wt1.h0$a$a */
        public static final class C78672a extends C78671a {

            /* renamed from: a */
            public static final C78672a f230374a = new C78672a();
        }

        /* renamed from: wt1.h0$a$b */
        public static final class C78673b extends C78671a {

            /* renamed from: a */
            public static final C78673b f230375a = new C78673b();
        }

        /* renamed from: wt1.h0$a$c */
        public static final class C78674c extends C78671a {

            /* renamed from: a */
            public static final C78674c f230376a = new C78674c();
        }

        /* renamed from: wt1.h0$a$d */
        public static final class C78675d extends C78671a {

            /* renamed from: a */
            public final String f230377a;

            /* renamed from: b */
            public final String f230378b;

            public C78675d(String str, String str2) {
                this.f230377a = str;
                this.f230378b = str2;
            }
        }

        /* renamed from: wt1.h0$a$e */
        public static final class C78676e extends C78671a {

            /* renamed from: a */
            public static final C78676e f230379a = new C78676e();
        }

        /* renamed from: wt1.h0$a$f */
        public static final class C78677f extends C78671a {

            /* renamed from: a */
            public final int f230380a;

            public C78677f(int i) {
                this.f230380a = i;
            }
        }

        /* renamed from: wt1.h0$a$g */
        public static final class C78678g extends C78671a {

            /* renamed from: a */
            public final String f230381a;

            public C78678g(String str) {
                C87412m.m108594g(str, "pwd");
                this.f230381a = str;
            }
        }

        /* renamed from: wt1.h0$a$h */
        public static final class C78679h extends C78671a {

            /* renamed from: a */
            public final String f230382a;

            public C78679h(String str) {
                C87412m.m108594g(str, "challenge");
                this.f230382a = str;
            }
        }
    }

    /* renamed from: wt1.h0$b */
    public static abstract class C78680b {

        /* renamed from: wt1.h0$b$a */
        public static final class C78681a extends C78680b {

            /* renamed from: a */
            public static final C78681a f230383a = new C78681a();
        }

        /* renamed from: wt1.h0$b$b */
        public static final class C78682b extends C78680b {

            /* renamed from: a */
            public final String f230384a;

            public C78682b(String str) {
                this.f230384a = str;
            }
        }

        /* renamed from: wt1.h0$b$c */
        public static final class C78683c extends C78680b {

            /* renamed from: a */
            public final String f230385a;

            /* renamed from: b */
            public final String f230386b;

            public C78683c(String str, String str2) {
                this.f230385a = str;
                this.f230386b = str2;
            }
        }

        /* renamed from: wt1.h0$b$d */
        public static final class C78684d extends C78680b {

            /* renamed from: a */
            public static final C78684d f230387a = new C78684d();
        }
    }

    /* renamed from: wt1.h0$c */
    public static final class C78685c extends C87413o implements C32224a<C76956i> {

        /* renamed from: d */
        public static final C78685c f230388d = new C78685c();

        public C78685c() {
            super(0);
        }

        public Object invoke() {
            return ((C109440d) C86312j.m106911c(C109440d.class)).mo160182Uq();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78670h0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo108628c3(C78680b bVar) {
        this.f230372f.setValue(bVar);
    }

    /* renamed from: d3 */
    public final void mo108629d3(C78671a aVar) {
        this.f230373g.setValue(aVar);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((WalletBaseUI) activity).addSceneEndListener(1586);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((WalletBaseUI) activity2).addSceneEndListener(1638);
        this.f230372f.observe(getActivity(), new C78695m0(this));
        this.f230373g.observe(getActivity(), new C78687i0(this));
        mo108629d3(C78671a.C78674c.f230376a);
    }

    public void onDestroy() {
        super.onDestroy();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((WalletBaseUI) activity).removeSceneEndListener(1586);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((WalletBaseUI) activity2).removeSceneEndListener(1638);
        C77761h0.IML.mo107896a();
        Object value = ((C36570n) this.f230371e).getValue();
        C87412m.m108593f(value, "<get-mSoterManager>(...)");
        ((C76956i) value).cancel();
    }
}

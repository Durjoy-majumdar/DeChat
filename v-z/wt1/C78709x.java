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

/* renamed from: wt1.x */
public final class C78709x extends UIComponent {

    /* renamed from: d */
    public String f230417d;

    /* renamed from: e */
    public final C13601g f230418e = C36568h.m40985a(C78724c.f230434d);

    /* renamed from: f */
    public final C54219z<C78719b> f230419f = new C54219z<>();

    /* renamed from: g */
    public final C54219z<C78710a> f230420g = new C54219z<>();

    /* renamed from: wt1.x$a */
    public static abstract class C78710a {

        /* renamed from: wt1.x$a$a */
        public static final class C78711a extends C78710a {

            /* renamed from: a */
            public static final C78711a f230421a = new C78711a();
        }

        /* renamed from: wt1.x$a$b */
        public static final class C78712b extends C78710a {

            /* renamed from: a */
            public static final C78712b f230422a = new C78712b();
        }

        /* renamed from: wt1.x$a$c */
        public static final class C78713c extends C78710a {

            /* renamed from: a */
            public static final C78713c f230423a = new C78713c();
        }

        /* renamed from: wt1.x$a$d */
        public static final class C78714d extends C78710a {

            /* renamed from: a */
            public final String f230424a;

            /* renamed from: b */
            public final String f230425b;

            public C78714d(String str, String str2) {
                this.f230424a = str;
                this.f230425b = str2;
            }
        }

        /* renamed from: wt1.x$a$e */
        public static final class C78715e extends C78710a {

            /* renamed from: a */
            public static final C78715e f230426a = new C78715e();
        }

        /* renamed from: wt1.x$a$f */
        public static final class C78716f extends C78710a {
            public C78716f(int i) {
            }
        }

        /* renamed from: wt1.x$a$g */
        public static final class C78717g extends C78710a {

            /* renamed from: a */
            public final String f230427a;

            public C78717g(String str) {
                C87412m.m108594g(str, "pwd");
                this.f230427a = str;
            }
        }

        /* renamed from: wt1.x$a$h */
        public static final class C78718h extends C78710a {

            /* renamed from: a */
            public final String f230428a;

            public C78718h(String str) {
                C87412m.m108594g(str, "challenge");
                this.f230428a = str;
            }
        }
    }

    /* renamed from: wt1.x$b */
    public static abstract class C78719b {

        /* renamed from: wt1.x$b$a */
        public static final class C78720a extends C78719b {

            /* renamed from: a */
            public static final C78720a f230429a = new C78720a();
        }

        /* renamed from: wt1.x$b$b */
        public static final class C78721b extends C78719b {

            /* renamed from: a */
            public final String f230430a;

            public C78721b(String str) {
                this.f230430a = str;
            }
        }

        /* renamed from: wt1.x$b$c */
        public static final class C78722c extends C78719b {

            /* renamed from: a */
            public final String f230431a;

            /* renamed from: b */
            public final String f230432b;

            public C78722c(String str, String str2) {
                this.f230431a = str;
                this.f230432b = str2;
            }
        }

        /* renamed from: wt1.x$b$d */
        public static final class C78723d extends C78719b {

            /* renamed from: a */
            public static final C78723d f230433a = new C78723d();
        }
    }

    /* renamed from: wt1.x$c */
    public static final class C78724c extends C87413o implements C32224a<C76956i> {

        /* renamed from: d */
        public static final C78724c f230434d = new C78724c();

        public C78724c() {
            super(0);
        }

        public Object invoke() {
            return ((C109440d) C86312j.m106911c(C109440d.class)).mo160182Uq();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78709x(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo108647c3(C78719b bVar) {
        this.f230419f.setValue(bVar);
    }

    /* renamed from: d3 */
    public final void mo108648d3(C78710a aVar) {
        this.f230420g.setValue(aVar);
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
        this.f230419f.observe(getActivity(), new C78662d0(this));
        this.f230420g.observe(getActivity(), new C78726z(this));
        mo108648d3(C78710a.C78713c.f230423a);
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
        Object value = ((C36570n) this.f230418e).getValue();
        C87412m.m108593f(value, "<get-mSoterManager>(...)");
        ((C76956i) value).cancel();
    }
}

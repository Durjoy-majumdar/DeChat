package xi3;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xi3.n */
public final class C118882n extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.n$a */
    public static final class C118883a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C118882n f356142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118883a(C118882n nVar) {
            super(1);
            this.f356142d = nVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f356142d.getContext().getString(C0966R.string.gqm);
            C87412m.m108593f(string, "context.getString(R.string.media_history_trans)");
            return string;
        }
    }

    /* renamed from: xi3.n$b */
    public static final class C118884b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C118882n f356143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118884b(C118882n nVar) {
            super(1);
            this.f356143d = nVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f356143d.getContext().getString(C0966R.string.gqk);
            C87412m.m108593f(string, "context.getString(R.string.media_history_fav)");
            return string;
        }
    }

    /* renamed from: xi3.n$c */
    public static final class C118885c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C118882n f356144d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118885c(C118882n nVar) {
            super(1);
            this.f356144d = nVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f356144d.getContext().getString(C0966R.string.gqj);
            C87412m.m108593f(string, "context.getString(R.string.media_history_del)");
            return string;
        }
    }

    /* renamed from: xi3.n$d */
    public static final class C118886d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C118882n f356145d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118886d(C118882n nVar) {
            super(1);
            this.f356145d = nVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f356145d.getContext().getString(C0966R.string.gql);
            C87412m.m108593f(string, "context.getString(R.string.media_history_sava)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118882n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.kth).view(C0966R.C0970id.kth).desc((C32226l<? super View, String>) new C118883a(this));
        root(C0966R.C0970id.cud).view(C0966R.C0970id.cud).desc((C32226l<? super View, String>) new C118884b(this));
        root(C0966R.C0970id.c0a).view(C0966R.C0970id.c0a).desc((C32226l<? super View, String>) new C118885c(this));
        root(C0966R.C0970id.j0m).view(C0966R.C0970id.j0m).desc((C32226l<? super View, String>) new C118886d(this));
    }
}

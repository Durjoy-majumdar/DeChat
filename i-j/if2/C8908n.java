package if2;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77407n;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: if2.n */
public final class C8908n extends UIComponent {

    /* renamed from: d */
    public final C13601g f28192d;

    /* renamed from: if2.n$a */
    public static final class C8909a extends C87413o implements C32224a<NewBizInfoAuthMainUI> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8909a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28193d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f28193d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI");
            return (NewBizInfoAuthMainUI) appCompatActivity;
        }
    }

    /* renamed from: if2.n$b */
    public static final class C8910b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8908n f28194d;

        public C8910b(C8908n nVar) {
            this.f28194d = nVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C8908n nVar = this.f28194d;
            C77407n nVar2 = new C77407n((Context) nVar.getContext(), 1, true);
            nVar2.f225771i = C8911o.f28195d;
            nVar2.f225782p = new C8912p(nVar);
            nVar2.mo107573q();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8908n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f28192d = C36568h.m40985a(new C8909a(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).addTextOptionMenu(0, "测试", new C8910b(this));
        }
    }
}

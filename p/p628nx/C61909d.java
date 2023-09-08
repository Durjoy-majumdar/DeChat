package p628nx;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import p640ox.C77049b;

/* renamed from: nx.d */
public final class C61909d extends UIComponent {

    /* renamed from: d */
    public UIComponent f176016d = ((C77049b) C86312j.m106911c(C77049b.class)).Hs0(getActivity());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61909d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateBefore(Bundle bundle) {
        this.f176016d.onCreateBefore(bundle);
    }

    public void onNewIntent(Intent intent) {
        this.f176016d.onNewIntent(intent);
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
        this.f176016d.onStartActivityForResult(intent, i, bundle);
    }
}

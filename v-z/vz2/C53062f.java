package vz2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import qy2.C47904x;

/* renamed from: vz2.f */
public final class C53062f extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53062f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72669hl();
    }

    public void onPostDestroyed() {
        super.onPostDestroyed();
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72666aw();
    }
}

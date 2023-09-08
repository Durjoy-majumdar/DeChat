package vz2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import qy2.C47904x;

/* renamed from: vz2.b */
public final class C53061b extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53061b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72665af();
    }

    public void onDestroy() {
        super.onDestroy();
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72660Dj();
    }
}

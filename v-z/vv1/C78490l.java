package vv1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import kv1.C99252h;
import p255vr.C78470h;
import yb2.C15946a;

/* renamed from: vv1.l */
public final class C78490l extends C15946a {

    /* renamed from: d */
    public String f229926d = "";

    /* renamed from: e */
    public String f229927e = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78490l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo108452g3(int i) {
        ((C78470h) C86312j.m106911c(C78470h.class)).mo108303yr(this.f229926d, String.valueOf(C99252h.f291030c), "", "", 3, this.f229927e, 0, 4, "", i);
    }

    public void onCreateAfter(Bundle bundle) {
        mo108452g3(1);
    }

    public void onFinished() {
        mo108452g3(2);
    }
}

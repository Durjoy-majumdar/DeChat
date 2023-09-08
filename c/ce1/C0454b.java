package ce1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11396b;
import te3.C51270sn1;
import te3.C52271zj0;

/* renamed from: ce1.b */
public final class C0454b extends C11396b<C51270sn1> {
    /* renamed from: a */
    public String mo495a() {
        String str;
        C52271zj0 zj02;
        C51270sn1 sn12 = (C51270sn1) this.f33539a;
        if (sn12 == null || (zj02 = sn12.f141633w) == null || (str = zj02.f146010i) == null) {
            str = this.f33540b;
        }
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public void mo496b(AppCompatActivity appCompatActivity) {
        String str;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Intent intent = appCompatActivity.getIntent();
        if (intent == null || (str = intent.getStringExtra("key_cover_url")) == null) {
            str = "";
        }
        this.f33540b = str;
    }
}

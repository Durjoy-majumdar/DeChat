package mo1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import aw0.C103928o;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import p646pn.C110234e;

/* renamed from: mo1.v */
public final class C11057v extends C11059w {

    /* renamed from: e */
    public boolean f32816e;

    /* renamed from: f */
    public boolean f32817f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11057v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo11197c3() {
        this.f32817f = false;
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(false);
    }

    public boolean onBackPressed() {
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32816e = getIntent().getIntExtra("report_scene", -1) == 19;
        this.f32817f = getIntent().getBooleanExtra("key_hide_float_ball", false);
    }

    public void onPause() {
        super.onPause();
        if (this.f32816e && getIntent().getBooleanExtra("key_hide_float_ball", false)) {
            ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f32817f) {
            ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
            C103928o.m138641a(true, false, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11057v(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}

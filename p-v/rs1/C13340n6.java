package rs1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import os1.C62153d;

@C113200q(initialMode = 2)
/* renamed from: rs1.n6 */
public final class C13340n6 extends UIComponent {

    /* renamed from: d */
    public boolean f37836d;

    /* renamed from: e */
    public final C62153d f37837e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13340n6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        this.f37837e = (C62153d) a;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("Finder.LocationUIC", "[onActivityResult] requestCode=" + i + " resultCode=" + i2);
        if (i == 563) {
            this.f37837e.mo9105q2(false);
        } else if (i == 564) {
            this.f37836d = this.f37837e.mo9103H();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean H = this.f37837e.mo9103H();
        this.f37836d = H;
        if (H) {
            this.f37837e.mo9105q2(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f37836d) {
            boolean H = this.f37837e.mo9103H();
            this.f37836d = H;
            if (H) {
                this.f37837e.mo9105q2(false);
            }
        }
    }
}

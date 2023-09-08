package xk1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: xk1.h */
public final class C15737h extends UIComponent {

    /* renamed from: d */
    public final String f42453d = "Finder.FinderGameLiveAuthPostLiveUIC";

    /* renamed from: e */
    public String f42454e = "";

    /* renamed from: f */
    public String f42455f = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15737h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("KEY_POST_LIVE_APPID");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f42454e = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_POST_LIVE_JSON");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f42455f = str;
        String str2 = this.f42453d;
        Log.m105924i(str2, "appid:" + this.f42454e + ", json:" + this.f42455f);
    }
}

package p591ky;

import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import p602ly.C76737c;
import pv2.C35701m;
import qv2.C110476d;

@C86522b
/* renamed from: ky.d */
public class C34117d extends C86301e implements C76737c {
    /* renamed from: n6 */
    public void mo59454n6(boolean z, boolean z2, C35701m mVar) {
        C110476d.m150375a(z, z2, mVar);
    }

    public boolean p40() {
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference == null) {
            return false;
        }
        return defaultPreference.getBoolean("init_success", false);
    }

    /* renamed from: ve */
    public boolean mo59456ve() {
        return Build.VERSION.SDK_INT >= 28 && !C110476d.f330374a && C110476d.f330375b == 2;
    }
}

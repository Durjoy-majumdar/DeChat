package p785zx;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw0.C116541b;
import cw0.C116542c;
import di3.C86301e;
import ei3.C86522b;
import p003ay.C0235b;
import p156gj.C87203t;
import p823sg.C90193h;

@C86522b
/* renamed from: zx.b */
public class C119182b extends C86301e implements C0235b {
    /* renamed from: AZ */
    public boolean mo257AZ(Context context, Intent intent) {
        return C116541b.m164358h(context, intent);
    }

    /* renamed from: CY */
    public Pair<Integer, Integer> mo258CY(Context context, String str, boolean z, boolean z2, C0235b.C0236a aVar) {
        return C116542c.m164371h(context, str, z, z2, aVar);
    }

    /* renamed from: Ce */
    public String mo259Ce(String str, String str2) {
        return C116541b.m164357g(str, str2);
    }

    /* renamed from: E7 */
    public String mo260E7(String str, String str2) {
        return C90193h.m112878f((C90193h.m112878f(str.getBytes()) + C116541b.m164357g(str2, str)).getBytes());
    }

    /* renamed from: KE */
    public void mo261KE(Context context, Intent intent, boolean z) {
        C116541b.m164351a(context, intent, (String) null, (String) null, z);
    }

    /* renamed from: Me */
    public String mo262Me(String str) {
        return C116542c.m164367d(str, C87203t.m108270f(true));
    }

    /* renamed from: ah */
    public String mo263ah(String str, boolean z) {
        if (str != null && str.length() > 0) {
            Log.m105925i("MicroMsg.ShortcutUtil", "process name: %s", Util.getProcessNameByPid(MMApplicationContext.getContext(), Process.myPid()));
            C87203t.f252876a = true;
            Log.m105924i("MicroMsg.DeviceInfo", "allowGetSensitiveDataFromSys");
            String g = C116541b.m164357g(str, z ? C87203t.m108266b() : C87203t.m108270f(true));
            if (!Util.isNullOrNil(g)) {
                return "shortcut_" + C116541b.m164363m(g.getBytes());
            }
        }
        return null;
    }

    /* renamed from: fu */
    public String mo264fu(byte[] bArr) {
        return C116541b.m164363m(bArr);
    }

    /* renamed from: iH */
    public String mo265iH(String str) {
        return C116542c.m164367d(str, C87203t.m108266b());
    }

    /* renamed from: qf */
    public void mo266qf(Context context, int i, int i2, boolean z, String str, boolean z2) {
        C116542c.m164370g(context, i, i2, z, str, z2);
    }

    public void rb0(Context context, Intent intent) {
        C116541b.m164351a(context, intent, (String) null, (String) null, false);
    }

    /* renamed from: rs */
    public void mo268rs() {
        C116542c.m164369f();
    }

    /* renamed from: vd */
    public void mo269vd(Context context, Intent intent, String str, String str2, boolean z) {
        C116541b.m164351a(context, intent, str, str2, z);
    }
}

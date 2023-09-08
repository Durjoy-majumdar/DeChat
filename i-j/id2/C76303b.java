package id2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import f40.C86709a0;
import gy3.C87412m;
import kd2.C76555c;
import kd2.C76559f;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import p156gj.C87203t;
import te3.C49335eu3;
import te3.C51335t24;
import te3.C64694s24;
import y43.C79029b0;

/* renamed from: id2.b */
public final class C76303b extends C89132b<C51335t24> {

    /* renamed from: j */
    public static boolean f223503j;

    /* renamed from: i */
    public final String f223504i;

    public C76303b(String str, String str2, int i) {
        String str3;
        C87412m.m108594g(str, "bindSerial");
        C87412m.m108594g(str2, "bankType");
        this.f223504i = str;
        C64694s24 s242 = new C64694s24();
        String zx02 = C69963m.wx0().zx0(196617);
        String e = C76559f.m92109e();
        String zx03 = C69963m.wx0().zx0(196628);
        zx03 = TextUtils.isEmpty(zx03) ? C87203t.m108273i() : zx03;
        String str4 = "" + (System.currentTimeMillis() / ((long) 1000));
        int random = ((int) (Math.random() * ((double) 1000000))) + 1000000;
        if (TextUtils.isEmpty(e)) {
            str3 = zx03 + '&' + str4 + '&' + random;
        } else {
            str3 = zx03 + '&' + str4 + '&' + random + '&' + e;
        }
        String c = C75105d.m90074e().mo104800c(zx02, str3);
        String str5 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, (Object) null);
        int b = C69963m.wx0().vx0().mo96260b();
        s242.f185315d = zx02;
        s242.f185316e = str3;
        s242.f185317f = c;
        s242.f185319h = str2;
        s242.f185318g = str;
        s242.f185321j = str5 != null ? Integer.parseInt(str5) : 0;
        s242.f185320i = i;
        s242.f185322n = b;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = s242;
        bVar.f127067b = new C51335t24();
        bVar.f127069d = 7140;
        bVar.f127068c = "/cgi-bin/mmpay-bin/offlinesetpayment";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        this.f256791h = true;
        Log.m105924i("MicroMsg.CgiSetOfflinePayment", "do setpayment: " + str2 + ", " + str + ", " + b);
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        Bankcard f;
        C51335t24 t242 = (C51335t24) eu32;
        if (i == 0 && i2 == 0) {
            if ((t242 != null && t242.f141910d == 0) && (f = C79029b0.vx0().wx0().mo91324f(this.f223504i)) != null) {
                C76555c cVar = C76555c.f224079a;
                String str2 = f.field_bindSerial;
                C87412m.m108593f(str2, "it.field_bindSerial");
                C76555c.C76556a aVar = C76555c.f224080b;
                if (aVar != null) {
                    aVar.mo106799a(str2);
                } else {
                    C87412m.m108603p("sImpl");
                    throw null;
                }
            }
        }
        f223503j = false;
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C51335t24>> mo9225i() {
        f223503j = true;
        C89059e<C89132b.C89134c<C51335t24>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }
}

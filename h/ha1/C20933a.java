package ha1;

import android.view.View;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import gy3.C87412m;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.Map;
import kj2.C117407d;
import n91.C117614e;
import t91.C64208c;
import te3.xr4;

/* renamed from: ha1.a */
public final class C20933a {

    /* renamed from: a */
    public static boolean f59282a;

    /* renamed from: b */
    public static boolean f59283b;

    /* renamed from: c */
    public static final C20934a f59284c = new C20934a();

    /* renamed from: ha1.a$a */
    public static final class C20934a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (objArr != null && objArr.length >= 2) {
                C64208c.f181953c = false;
                Preference preference = objArr[1];
                C87412m.m108592e(preference, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.Preference");
                Preference preference2 = preference;
                C20933a.f59282a = C87412m.m108589b("jd_market_entrance", preference2.f121285r);
                C20933a.f59283b = C87412m.m108589b("find_friends_by_qrcode", preference2.f121285r);
                if (C87412m.m108589b("find_friends_by_finder", preference2.f121285r)) {
                    Log.m105924i("HABBYGE-MALI.FindMoreFriendUIMonitor", "Finder, 19354, 1");
                    C117407d.INSTANCE.mo160131h(19354, 1);
                }
                String str4 = preference2.f121285r;
                C87412m.m108593f(str4, "pref.key");
                xr4 xr4 = new xr4();
                xr4.f354547d = str4;
                xr4.f354555o = System.currentTimeMillis();
                xr4.f354548e = str4;
                xr4.f354550g = C116711b.m164583h(obj != null ? obj.getClass().getName() : null);
                xr4.f354554n = obj != null ? obj.hashCode() : -1;
                String str5 = xr4.f354550g;
                xr4.f354551h = str5;
                xr4.f354552i = 1;
                xr4.f354549f = str5;
                xr4.f354561u = 0;
                Map<String, WeakReference<View>> map = C117614e.f351842a;
                C117614e.f351846e.mo33861a((View) null, xr4);
            }
        }
    }
}

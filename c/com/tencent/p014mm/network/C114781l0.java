package com.tencent.p014mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C7624i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.network.l0 */
public final class C114781l0 {

    /* renamed from: j */
    public static C114781l0 f344160j;

    /* renamed from: k */
    public static boolean f344161k;

    /* renamed from: a */
    public C114786m0 f344162a;

    /* renamed from: b */
    public C114787n0 f344163b;

    /* renamed from: c */
    public Context f344164c;

    /* renamed from: d */
    public MMHandler f344165d;

    /* renamed from: e */
    public List<C114782a> f344166e = new ArrayList();

    /* renamed from: f */
    public C114803y f344167f;

    /* renamed from: g */
    public C114776i0 f344168g;

    /* renamed from: h */
    public C114771g0 f344169h;

    /* renamed from: i */
    public C114769f0 f344170i;

    /* renamed from: com.tencent.mm.network.l0$a */
    public interface C114782a {
        /* renamed from: a */
        void mo174259a(Context context, boolean z, String str, String str2);
    }

    /* renamed from: a */
    public static C114803y m161554a() {
        return m161562i().f344167f;
    }

    /* renamed from: b */
    public static Context m161555b() {
        return m161562i().f344164c;
    }

    /* renamed from: c */
    public static MMHandler m161556c() {
        return m161562i().f344165d;
    }

    /* renamed from: d */
    public static C114771g0 m161557d() {
        return m161562i().f344169h;
    }

    /* renamed from: e */
    public static C114786m0 m161558e() {
        return m161562i().f344162a;
    }

    /* renamed from: f */
    public static C114776i0 m161559f() {
        return m161562i().f344168g;
    }

    /* renamed from: g */
    public static C114787n0 m161560g() {
        return m161562i().f344163b;
    }

    /* renamed from: h */
    public static SharedPreferences m161561h() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("notify_key_pref_no_account");
        if (!MultiProcessMMKV.isTransported("notify_key_pref_no_account")) {
            MultiProcessMMKV.transport2MMKV(MMApplicationContext.getContext().getSharedPreferences("notify_key_pref_no_account", 4), mmkv);
        }
        String string = mmkv.getString("login_weixin_username", "");
        if (Util.isNullOrNil(string)) {
            string = C7624i3.f25910c.mo19a("login_weixin_username", "");
            if (!Util.isNullOrNil(string)) {
                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("notify_key_pref_no_account");
                if (!MultiProcessMMKV.isTransported("notify_key_pref_no_account")) {
                    MultiProcessMMKV.transport2MMKV(MMApplicationContext.getContext().getSharedPreferences("notify_key_pref_no_account", 4), mmkv2);
                }
                mmkv2.edit().putString("login_weixin_username", string).commit();
            }
        }
        if (string != null) {
            string = string.replace("[\\/\\\\]", "#").trim();
        }
        String str = "notify_key_pref" + string;
        MultiProcessMMKV mmkv3 = MultiProcessMMKV.getMMKV(str);
        if (!MultiProcessMMKV.isTransported(str)) {
            MultiProcessMMKV.transport2MMKV(MMApplicationContext.getContext().getSharedPreferences(str, 4), mmkv3);
        }
        return mmkv3;
    }

    /* renamed from: i */
    public static C114781l0 m161562i() {
        if (f344160j == null) {
            f344160j = new C114781l0();
        }
        return f344160j;
    }

    /* renamed from: j */
    public static void m161563j(Context context, boolean z, String str, String str2) {
        Iterator it = ((ArrayList) m161562i().f344166e).iterator();
        while (it.hasNext()) {
            ((C114782a) it.next()).mo174259a(context, z, str, str2);
        }
    }
}

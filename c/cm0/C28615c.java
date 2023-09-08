package cm0;

import a70.C112760b;
import android.content.SharedPreferences;
import com.tencent.mapsdk.internal.C0938ej;
import com.tencent.p014mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cm0.c */
public class C28615c {

    /* renamed from: c */
    public static final String f78517c = (C112760b.m154216X() + "files/wxofflinevoicenew/");

    /* renamed from: d */
    public static C28615c f78518d;

    /* renamed from: a */
    public Set<String> f78519a;

    /* renamed from: b */
    public Object f78520b = new Object();

    /* renamed from: a */
    public static MultiProcessMMKV m38293a() {
        return MultiProcessMMKV.getMMKV("voice_offline_res_new");
    }

    /* renamed from: b */
    public static C28615c m38294b() {
        if (f78518d == null) {
            f78518d = new C28615c();
        }
        return f78518d;
    }

    /* renamed from: c */
    public static String m38295c(String str) {
        MultiProcessMMKV a = m38293a();
        return a.getString(str + C0938ej.f2166u, "");
    }

    /* renamed from: f */
    public static void m38296f(String str) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new ReInitVoiceOffLineSynthesizerEvent().publish();
    }

    /* renamed from: d */
    public final void mo56096d() {
        if (this.f78519a == null) {
            this.f78519a = new HashSet();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, "");
            if (!Util.isNullOrNil(str)) {
                for (String add : str.split(",")) {
                    this.f78519a.add(add);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo56097e(String str, String str2, String str3, String str4) {
        synchronized (this.f78520b) {
            Log.m105925i("MicroMsg.OfflineVoice.VoiceOffLineHelper", "saveVoiceOfflineLanguageResId, resId :%s、path:%s、md5:%s,version:%s", str, str2, str3, str4);
            mo56096d();
            m38293a().edit().putString(str, str2).commit();
            if (Util.isEqual(str, "0")) {
                m38293a().edit().putString("0-1_md5", str3).commit();
                m38293a().edit().putString("0-1_version", Util.nullAs(str4, "")).commit();
                return true;
            }
            SharedPreferences.Editor edit = m38293a().edit();
            edit.putString(str + C0938ej.f2166u, str3).commit();
            SharedPreferences.Editor edit2 = m38293a().edit();
            edit2.putString(str + C0938ej.f2165t, Util.nullAs(str4, "")).commit();
            if (((HashSet) this.f78519a).contains(str)) {
                return true;
            }
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC;
            StringBuilder sb = new StringBuilder((String) i.mo119685f(aVar, ""));
            if (((HashSet) this.f78519a).size() <= 0) {
                sb.append(str);
            } else {
                sb.append(",");
                sb.append(str);
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar, sb.toString());
            boolean add = ((HashSet) this.f78519a).add(str);
            return add;
        }
    }
}

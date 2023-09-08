package nj2;

import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import z04.C112550d0;

/* renamed from: nj2.j */
public final class C109750j {

    /* renamed from: a */
    public static final C109750j f328484a = new C109750j();

    /* renamed from: b */
    public static boolean f328485b;

    /* renamed from: c */
    public static final Set<Long> f328486c = new LinkedHashSet();

    /* renamed from: d */
    public static final List<C72963f4> f328487d = new ArrayList();

    /* renamed from: e */
    public static MultiProcessMMKV f328488e = MultiProcessMMKV.getMMKV("mmkv_ringtone_appmsg_info" + C86709a0.m107523b().mo121111i());

    /* renamed from: f */
    public static MultiProcessMMKV f328489f = MultiProcessMMKV.getMMKV("mmkv_ringtone_calling_info" + C86709a0.m107523b().mo121111i());

    /* renamed from: g */
    public static HashMap<String, String> f328490g = new HashMap<>();

    /* renamed from: nj2.j$a */
    public static final class C109751a {

        /* renamed from: a */
        public String f328491a;

        /* renamed from: b */
        public long f328492b;

        /* renamed from: c */
        public boolean f328493c;
    }

    /* renamed from: b */
    public static Set m149064b(C109750j jVar, String str, boolean z, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = null;
        }
        jVar.getClass();
        if (z) {
            MultiProcessMMKV multiProcessMMKV = f328488e;
            return multiProcessMMKV.getStringSet(str + "called", set);
        }
        MultiProcessMMKV multiProcessMMKV2 = f328488e;
        return multiProcessMMKV2.getStringSet(str + "calling", set);
    }

    /* renamed from: a */
    public final String mo160989a(Set<String> set) {
        String str = null;
        if (set == null) {
            return null;
        }
        long j = 0;
        for (String str2 : set) {
            long j2 = f328484a.mo160993f(str2).f328492b;
            if (j <= j2) {
                str = str2;
                j = j2;
            }
        }
        return str;
    }

    /* renamed from: c */
    public final String[] mo160990c() {
        Character ch;
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_remind_reveicer_update_ringtone_wording, "");
        if (!Util.isNullOrNil(Y60)) {
            try {
                C104289g gVar = new C104289g(Y60);
                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                Log.m105925i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", applicationLanguage);
                String optString = gVar.optString(applicationLanguage);
                C87412m.m108593f(optString, "result");
                int i = 0;
                while (true) {
                    if (i >= optString.length()) {
                        ch = null;
                        break;
                    }
                    char charAt = optString.charAt(i);
                    if (charAt == 65509) {
                        ch = Character.valueOf(charAt);
                        break;
                    }
                    i++;
                }
                if (ch == null) {
                    return null;
                }
                ch.charValue();
                return new String[]{optString.subSequence(0, C112550d0.m153768D(optString, 65509, 0, false, 6, (Object) null)).toString(), optString.subSequence(C112550d0.m153768D(optString, 65509, 0, false, 6, (Object) null) + 1, optString.length()).toString()};
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.QuickRingtoneHelper", e, "getMultitalkNavpopWording error", new Object[0]);
            }
        }
        String string = MMApplicationContext.getContext().getString(C0966R.string.kig);
        C87412m.m108593f(string, "getContext().getString(R…ingtone_quick_tip_called)");
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.kif);
        C87412m.m108593f(string2, "getContext().getString(R…ringtone_link_tip_update)");
        return new String[]{string, string2};
    }

    /* renamed from: d */
    public final String[] mo160991d() {
        Character ch;
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_remind_caller_set_ringtone_wording, "");
        if (!Util.isNullOrNil(Y60)) {
            try {
                C104289g gVar = new C104289g(Y60);
                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                Log.m105925i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", applicationLanguage);
                String optString = gVar.optString(applicationLanguage);
                C87412m.m108593f(optString, "result");
                int i = 0;
                while (true) {
                    if (i >= optString.length()) {
                        ch = null;
                        break;
                    }
                    char charAt = optString.charAt(i);
                    if (charAt == 65509) {
                        ch = Character.valueOf(charAt);
                        break;
                    }
                    i++;
                }
                if (ch == null) {
                    return null;
                }
                ch.charValue();
                return new String[]{optString.subSequence(0, C112550d0.m153768D(optString, 65509, 0, false, 6, (Object) null)).toString(), optString.subSequence(C112550d0.m153768D(optString, 65509, 0, false, 6, (Object) null) + 1, optString.length()).toString()};
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.QuickRingtoneHelper", e, "getMultitalkNavpopWording error", new Object[0]);
            }
        }
        String string = MMApplicationContext.getContext().getString(C0966R.string.kih);
        C87412m.m108593f(string, "getContext().getString(R…ngtone_quick_tip_calling)");
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.kie);
        C87412m.m108593f(string2, "getContext().getString(R…g.voip_ringtone_link_tip)");
        return new String[]{string, string2};
    }

    /* renamed from: e */
    public final void mo160992e(C72963f4 f4Var, String str, String str2) {
        C87412m.m108594g(f4Var, "msgInfo");
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "feedId");
        if (f328485b) {
            Set<Long> set = f328486c;
            if (!set.contains(Long.valueOf(f4Var.getMsgId()))) {
                set.add(Long.valueOf(f4Var.getMsgId()));
                ((ArrayList) f328487d).add(f4Var);
            }
        }
    }

    /* renamed from: f */
    public final C109751a mo160993f(String str) {
        C109751a aVar = new C109751a();
        C104289g gVar = new C104289g(str);
        aVar.f328491a = gVar.getString("ringtoneId");
        aVar.f328492b = gVar.getLong("tick");
        aVar.f328493c = gVar.getBoolean("linkToSetting");
        return aVar;
    }

    /* renamed from: g */
    public final void mo160994g(String str, boolean z, Set<String> set) {
        if (z) {
            MultiProcessMMKV multiProcessMMKV = f328488e;
            multiProcessMMKV.putStringSet(str + "called", set);
            return;
        }
        MultiProcessMMKV multiProcessMMKV2 = f328488e;
        multiProcessMMKV2.putStringSet(str + "calling", set);
    }
}

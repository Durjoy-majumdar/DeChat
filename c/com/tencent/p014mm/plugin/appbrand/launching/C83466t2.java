package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WAAppTaskUpdateResultAfterVersionFallBackStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81396z3;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83430q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.concurrent.ConcurrentHashMap;
import ki0.C33914i;
import ki0.C33915j;
import rx3.C13603j;
import wi0.C90975b0;
import wi0.C90978e0;
import zp0.C91828f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.t2 */
public final class C83466t2 {

    /* renamed from: a */
    public static final C83466t2 f243898a = new C83466t2();

    /* renamed from: b */
    public static final ConcurrentHashMap<C29585a, WxaAttributes> f243899b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<C29585a, Long> f243900c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<C29585a, Long> f243901d = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$a */
    public static abstract class C29585a {

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$a$a */
        public static final class C29586a extends C29585a {

            /* renamed from: a */
            public final String f80513a;

            public C29586a(String str) {
                C87412m.m108594g(str, "value");
                this.f80513a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!C87412m.m108589b(C29586a.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.LaunchTimeoutFallbackBackupWxaAttrUtils.KEY.APPID");
                return C87412m.m108589b(this.f80513a, ((C29586a) obj).f80513a);
            }

            public int hashCode() {
                return this.f80513a.hashCode();
            }

            public String toString() {
                return "APPID(value=" + this.f80513a + ')';
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$a$b */
        public static final class C29587b extends C29585a {

            /* renamed from: a */
            public final String f80514a;

            public C29587b(String str) {
                C87412m.m108594g(str, "value");
                this.f80514a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!C87412m.m108589b(C29587b.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.LaunchTimeoutFallbackBackupWxaAttrUtils.KEY.USERNAME");
                return C87412m.m108589b(this.f80514a, ((C29587b) obj).f80514a);
            }

            public int hashCode() {
                return this.f80514a.hashCode();
            }

            public String toString() {
                return "USERNAME(value=" + this.f80514a + ')';
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$b */
    public static final class C83467b {

        /* renamed from: a */
        public static final ConcurrentHashMap<String, WAAppTaskVersionFallBackActionStruct> f243902a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public static final ConcurrentHashMap<String, Integer> f243903b = new ConcurrentHashMap<>();

        /* renamed from: a */
        public static final void m102429a(String str, boolean z, long j) {
            C87412m.m108594g(str, "instanceId");
            WAAppTaskVersionFallBackActionStruct remove = f243902a.remove(str);
            if (remove != null) {
                WAAppTaskUpdateResultAfterVersionFallBackStruct wAAppTaskUpdateResultAfterVersionFallBackStruct = new WAAppTaskUpdateResultAfterVersionFallBackStruct();
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236419d = wAAppTaskUpdateResultAfterVersionFallBackStruct.mo86045b("Appid", remove.f236431d, true);
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236420e = wAAppTaskUpdateResultAfterVersionFallBackStruct.mo86045b("Username", remove.f236432e, true);
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236421f = wAAppTaskUpdateResultAfterVersionFallBackStruct.mo86045b("InstanceId", remove.f236440m, true);
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236422g = remove.f236433f;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236423h = remove.f236434g;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236424i = remove.f236435h;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236425j = z ? 1 : 0;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236426k = j;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236427l = remove.f236437j;
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236428m = wAAppTaskUpdateResultAfterVersionFallBackStruct.mo86045b("NetType", remove.f236438k, true);
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236429n = remove.f236439l;
                Integer remove2 = f243903b.remove(str);
                if (remove2 == null) {
                    remove2 = 10000;
                }
                wAAppTaskUpdateResultAfterVersionFallBackStruct.f236430o = (long) remove2.intValue();
                wAAppTaskUpdateResultAfterVersionFallBackStruct.mo86054n();
            }
        }

        /* renamed from: b */
        public static final void m102430b(String str, int i) {
            C87412m.m108594g(str, "instanceId");
            f243903b.put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$c */
    public static abstract class C83468c {

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$c$a */
        public static final class C83469a extends C83468c {

            /* renamed from: a */
            public final long f243904a;

            public C83469a(long j) {
                this.f243904a = j;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C83469a) && this.f243904a == ((C83469a) obj).f243904a;
            }

            public int hashCode() {
                long j = this.f243904a;
                return (int) (j ^ (j >>> 32));
            }

            public String toString() {
                return "FallbackIfTimeout[" + this.f243904a + "ms]";
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.t2$c$b */
        public static final class C83470b extends C83468c {

            /* renamed from: a */
            public static final C83470b f243905a = new C83470b();

            public String toString() {
                return "NoFallback";
            }
        }
    }

    /* renamed from: a */
    public static final boolean m102422a(String str, WxaAttributes wxaAttributes) {
        WxaAttributes mL;
        C33914i jo;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_support_launch_fallback_min_version, 1) == 0 || wxaAttributes == null) {
            return false;
        }
        String str2 = wxaAttributes.field_appId;
        String str3 = wxaAttributes.field_username;
        WxaAttributes.C81628a m2 = wxaAttributes.mo113940m2();
        int i = m2 != null ? m2.f239505u : 0;
        C33915j jVar = (C33915j) C81161g2.Bx0(C33915j.class);
        int i2 = (jVar == null || (jo = jVar.mo59363jo(str3)) == null) ? 0 : jo.field_launchFallbackDirectlyMinVersion;
        int max = Math.max(i, i2);
        if (max <= 0 || (mL = ((C90975b0) C81161g2.Bx0(C90975b0.class)).mo114011mL(str2, new String[0])) == null) {
            return false;
        }
        C87412m.m108593f(str2, "appId");
        WxaAttributes.WxaVersionInfo o2 = mL.mo113942o2();
        C7335d c = C86312j.m106911c(C81396z3.class);
        C87412m.m108593f(c, "getService(WxaVersionPag…IndexStorage::class.java)");
        boolean a = C83430q.m102386a(str2, o2, str, (C81396z3) c);
        Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfCanDirectFallbackForMinVersionDeclared(minVersion:" + max + ", minVersionInAttr:" + i + ", minVersionInSyncNotify:" + i2 + ", appId:" + str2 + ", path:" + str + "), return " + a);
        return a;
    }

    /* renamed from: b */
    public static final boolean m102423b(String str, String str2) {
        C29585a aVar;
        String str3 = str;
        String str4 = str2;
        if (!(str4 == null || str2.length() == 0)) {
            aVar = new C29585a.C29586a(str4);
        } else {
            if (str3 == null || str.length() == 0) {
                return false;
            }
            aVar = new C29585a.C29587b(str3);
        }
        ConcurrentHashMap<C29585a, Long> concurrentHashMap = f243901d;
        if (concurrentHashMap.contains(aVar)) {
            WxaAttributes.C81629c.C81630a d = f243898a.mo115747d(aVar, "[UpdateNewWxaAttrsFailure]", true);
            if (d == null) {
                return false;
            }
            long j = d.f239510B;
            Long remove = concurrentHashMap.remove(aVar);
            if (remove == null) {
                remove = 0L;
            }
            long longValue = remove.longValue();
            if (Util.nowMilliSecond() - longValue <= j) {
                Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [UpdateNewWxaAttrsFailure] interval[" + j + "ms] lastFailureTimestamp[" + longValue + "] key[" + aVar + ']');
                return true;
            }
        }
        WxaAttributes.C81629c.C81630a d2 = f243898a.mo115747d(aVar, "[MissedAppPkgFailure]", false);
        if (d2 == null) {
            return false;
        }
        long j2 = d2.f239510B;
        Long remove2 = f243900c.remove(aVar);
        if (remove2 == null) {
            remove2 = 0L;
        }
        long longValue2 = remove2.longValue();
        Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [MissedAppPkgFailure] interval[" + j2 + "ms] lastFailureTimestamp[" + longValue2 + "] key[" + aVar + ']');
        return Util.nowMilliSecond() - longValue2 <= j2;
    }

    /* renamed from: c */
    public static final void m102424c(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "clearLaunchFailedTimestamp(username:" + str + ", appId:" + str2 + ')');
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            f243900c.remove(new C29585a.C29587b(str));
            f243901d.remove(new C29585a.C29587b(str));
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            f243900c.remove(new C29585a.C29586a(str2));
            f243901d.remove(new C29585a.C29586a(str2));
        }
    }

    /* renamed from: e */
    public static final boolean m102425e() {
        return C91828f.m115345a() != 4;
    }

    /* renamed from: g */
    public static final void m102426g(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "removeWxaAttributesCache(username:" + str + ", appId:" + str2 + ')');
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            f243899b.remove(new C29585a.C29587b(str));
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            f243899b.remove(new C29585a.C29586a(str2));
        }
    }

    /* renamed from: d */
    public final WxaAttributes.C81629c.C81630a mo115747d(C29585a aVar, String str, boolean z) {
        WxaAttributes.C81629c.C81630a aVar2;
        WxaAttributes.C81629c.C81630a aVar3;
        WxaAttributes wxaAttributes;
        WxaAttributes.C81629c n2;
        WxaAttributes.C81629c n25;
        WxaAttributes wxaAttributes2 = f243899b.get(aVar);
        if (wxaAttributes2 == null || (n25 = wxaAttributes2.mo113941n2()) == null || (aVar2 = n25.f239507a) == null) {
            if (z) {
                C90978e0 Cx0 = C81161g2.Cx0();
                if (Cx0 == null) {
                    aVar2 = null;
                } else {
                    if (aVar instanceof C29585a.C29587b) {
                        wxaAttributes = Cx0.mo114000LL(((C29585a.C29587b) aVar).f80514a, "dynamicInfo");
                    } else if (aVar instanceof C29585a.C29586a) {
                        wxaAttributes = Cx0.mo114011mL(((C29585a.C29586a) aVar).f80513a, "dynamicInfo");
                    } else {
                        throw new C13603j();
                    }
                    if (!(wxaAttributes == null || (n2 = wxaAttributes.mo113941n2()) == null)) {
                        aVar3 = n2.f239507a;
                        aVar2 = aVar3;
                    }
                }
            }
            aVar3 = null;
            aVar2 = aVar3;
        }
        if (aVar2 == null) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "getDynamicSettings with key:" + aVar + ", reason:" + str + ", get settings:" + f243898a.mo115748f(aVar2));
        return aVar2;
    }

    /* renamed from: f */
    public final String mo115748f(WxaAttributes.C81629c.C81630a aVar) {
        return "{OpenWxaWaitUpdateMaxMicSec:" + aVar.f239538z + ", OpenWxaWaitUpdateMaxMicSecForWeakNet:" + aVar.f239509A + ", NextTryOpenWxaDisMicSec:" + aVar.f239510B + '}';
    }
}

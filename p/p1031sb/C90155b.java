package p1031sb;

import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import p1042u.C111055b;
import p1042u.C111059i;
import wi0.C90980f0;

/* renamed from: sb.b */
public class C90155b implements MStorage.IOnStorageChange {

    /* renamed from: f */
    public static C90155b f258853f;

    /* renamed from: g */
    public static String[] f258854g = {"username", "appId", "versionInfo", "appInfo", "smallHeadURL", "nickname"};

    /* renamed from: d */
    public final Map<String, AppBrandInitConfigLU> f258855d = new C111055b();

    /* renamed from: e */
    public final Map<String, String> f258856e = new C111055b();

    /* renamed from: d */
    public static void m112816d() {
        synchronized (C90155b.class) {
            f258853f = null;
        }
    }

    /* renamed from: a */
    public AppBrandInitConfigLU mo113991a(WxaAttributes wxaAttributes) {
        if (wxaAttributes == null) {
            return null;
        }
        AppBrandInitConfigLU appBrandInitConfigLU = new AppBrandInitConfigLU();
        appBrandInitConfigLU.f234839s = wxaAttributes.field_username;
        appBrandInitConfigLU.f239362d = wxaAttributes.field_appId;
        appBrandInitConfigLU.f239363e = wxaAttributes.field_nickname;
        appBrandInitConfigLU.f239364f = wxaAttributes.field_smallHeadURL;
        if (wxaAttributes.mo113940m2() != null) {
            appBrandInitConfigLU.f234841u = wxaAttributes.mo113940m2().f239488d;
            appBrandInitConfigLU.f239368j = wxaAttributes.mo113940m2().f239498n;
            appBrandInitConfigLU.f239369n = wxaAttributes.mo113940m2().f239499o;
            appBrandInitConfigLU.f239370o = wxaAttributes.mo113940m2().f239502r;
            ArrayList<String> arrayList = new ArrayList<>();
            List<String> list = wxaAttributes.mo113940m2().f239496l;
            if (list != null) {
                arrayList.addAll(list);
            }
            appBrandInitConfigLU.f234821U0 = arrayList;
        } else {
            Log.m105921e("Luggage.WXA.AppBrandInitConfigHelper", "assembleConfig username[%s] appId[%s], NULL appInfo", wxaAttributes.field_username, wxaAttributes.field_appId);
        }
        if (wxaAttributes.mo113942o2() != null) {
            appBrandInitConfigLU.f234803G = wxaAttributes.mo113942o2().f239454f;
            appBrandInitConfigLU.f234802F = wxaAttributes.mo113942o2().f239452d;
            appBrandInitConfigLU.f234804H = wxaAttributes.mo113942o2();
        } else {
            Log.m105921e("Luggage.WXA.AppBrandInitConfigHelper", "assembleConfig username[%s] appId[%s], NULL versionInfo", wxaAttributes.field_username, wxaAttributes.field_appId);
        }
        appBrandInitConfigLU.f234805I = wxaAttributes.field_passThroughInfo;
        appBrandInitConfigLU.f234806J = wxaAttributes.field_stablePassThroughInfo;
        return appBrandInitConfigLU;
    }

    /* renamed from: b */
    public AppBrandInitConfigLU mo113992b(String str) {
        AppBrandInitConfigLU appBrandInitConfigLU;
        if (Util.isNullOrNil(str)) {
            if (BuildInfo.DEBUG) {
                Assert.fail("appId cant be EMPTY");
            }
            Log.m105928w("Luggage.WXA.AppBrandInitConfigHelper", "obtainByAppId with EMPTY appId");
            return null;
        }
        synchronized (this.f258855d) {
            appBrandInitConfigLU = (AppBrandInitConfigLU) ((C111059i) this.f258855d).remove(str);
        }
        if (appBrandInitConfigLU == null) {
            appBrandInitConfigLU = mo113991a(C90980f0.m114143b().mo125058c(str, f258854g));
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(appBrandInitConfigLU == null ? -1 : appBrandInitConfigLU.f234802F);
            Log.m105925i("Luggage.WXA.AppBrandInitConfigHelper", "obtainByAppId appId:%s, get from db, appVersion:%d", objArr);
        } else {
            Log.m105925i("Luggage.WXA.AppBrandInitConfigHelper", "obtainByAppId appId:%s, get from memory, appVersion:%d", str, Integer.valueOf(appBrandInitConfigLU.f234802F));
        }
        return appBrandInitConfigLU;
    }

    /* renamed from: c */
    public final AppBrandInitConfigLU mo124411c(String str) {
        String str2;
        if (!Util.isNullOrNil(str)) {
            synchronized (this.f258856e) {
                str2 = (String) ((C111059i) this.f258856e).get(str);
            }
            if (!Util.isNullOrNil(str2)) {
                return mo113992b(str2);
            }
            AppBrandInitConfigLU a = mo113991a(C90980f0.m114143b().mo125059d(str, f258854g));
            if (a == null) {
                return a;
            }
            synchronized (this.f258856e) {
                ((C111059i) this.f258856e).put(str, a.f239362d);
            }
            return a;
        } else if (!BuildInfo.DEBUG) {
            return null;
        } else {
            Assert.assertTrue("username cant be EMPTY", false);
            return null;
        }
    }

    /* renamed from: e */
    public final void mo124412e(String str, AppBrandInitConfigLU appBrandInitConfigLU) {
        if (appBrandInitConfigLU != null && !Util.isNullOrNil(appBrandInitConfigLU.f239362d)) {
            Log.m105925i("Luggage.WXA.AppBrandInitConfigHelper", "stash username:%s, appId:%s, appVersion:%d, stack:%s", str, appBrandInitConfigLU.f239362d, Integer.valueOf(appBrandInitConfigLU.f234802F), android.util.Log.getStackTraceString(new Throwable()));
            synchronized (this.f258855d) {
                ((C111059i) this.f258855d).put(appBrandInitConfigLU.f239362d, appBrandInitConfigLU);
            }
            if (!Util.isNullOrNil(str)) {
                synchronized (this.f258856e) {
                    ((C111059i) this.f258856e).put(str, appBrandInitConfigLU.f239362d);
                }
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (MStorageEventData.EventType.SINGLE.equals(str)) {
            if (String.class.isInstance(mStorageEventData.obj)) {
                String valueOf = String.valueOf(mStorageEventData.obj);
                if (!Util.isNullOrNil(valueOf)) {
                    try {
                        mo124411c(valueOf);
                    } catch (RuntimeException e) {
                        Log.printErrStackTrace("Luggage.WXA.AppBrandInitConfigHelper", e, "onNotifyChange event[%s] username[%s]", str, valueOf);
                        synchronized (this.f258856e) {
                            String str2 = (String) ((C111059i) this.f258856e).remove(valueOf);
                            if (!TextUtils.isEmpty(str2)) {
                                synchronized (this.f258855d) {
                                    ((C111059i) this.f258855d).remove(str2);
                                }
                            }
                        }
                    }
                }
            }
        } else if (MStorageEventData.EventType.BATCH.equals(str)) {
            synchronized (this.f258855d) {
                ((C111059i) this.f258855d).clear();
            }
        }
    }
}

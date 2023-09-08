package i81;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import i81.C87679g;
import j20.C117293c;
import p156gj.C87203t;

/* renamed from: i81.d */
public final class C87676d implements C117293c {

    /* renamed from: a */
    public String f253952a;

    /* renamed from: b */
    public String f253953b;

    /* renamed from: c */
    public String f253954c;

    /* renamed from: d */
    public String f253955d;

    /* renamed from: e */
    public String f253956e;

    /* renamed from: a */
    public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        Object obj2 = obj;
        Object[] objArr2 = objArr;
        Log.m105918d("MicroMsg.SensitiveApiCallPatch", "hook call " + str8 + " from " + str6 + '#' + str7);
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87412m.m108592e(obj2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) obj2;
        if (str8 == null) {
            return null;
        }
        switch (str4.hashCode()) {
            case -1384328005:
                if (!str8.equals("getAllCellInfo")) {
                    return null;
                }
                C87679g.C87680a aVar = C87679g.f253958a;
                C87412m.m108593f(applicationContext, "gContext");
                if (C87679g.C87680a.m109073a(aVar, applicationContext)) {
                    return telephonyManager.getAllCellInfo();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case -1107875961:
                if (!str8.equals("getDeviceId")) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    C87679g.C87680a aVar2 = C87679g.f253958a;
                    C87412m.m108593f(applicationContext, "gContext");
                    if (C87679g.C87680a.m109074b(aVar2, applicationContext)) {
                        return C87203t.m108270f(false);
                    }
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case -75445954:
                if (!str8.equals("getImei")) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    C87679g.C87680a aVar3 = C87679g.f253958a;
                    C87412m.m108593f(applicationContext, "gContext");
                    if (C87679g.C87680a.m109074b(aVar3, applicationContext)) {
                        Integer valueOf = objArr2 != null ? Integer.valueOf(objArr2.length) : null;
                        if (valueOf != null && valueOf.intValue() == 0) {
                            String str9 = this.f253953b;
                            if (str9 != null) {
                                return str9;
                            }
                            String imei = telephonyManager.getImei();
                            this.f253953b = imei;
                            return imei;
                        } else if (valueOf == null || valueOf.intValue() != 1) {
                            return null;
                        } else {
                            String str10 = this.f253954c;
                            if (str10 != null) {
                                return str10;
                            }
                            Object obj3 = objArr2[0];
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.Int");
                            String imei2 = telephonyManager.getImei(((Integer) obj3).intValue());
                            this.f253954c = imei2;
                            return imei2;
                        }
                    }
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case -75334359:
                if (!str8.equals("getMeid")) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    C87679g.C87680a aVar4 = C87679g.f253958a;
                    C87412m.m108593f(applicationContext, "gContext");
                    if (C87679g.C87680a.m109074b(aVar4, applicationContext)) {
                        Integer valueOf2 = objArr2 != null ? Integer.valueOf(objArr2.length) : null;
                        if (valueOf2 != null && valueOf2.intValue() == 0) {
                            String str11 = this.f253955d;
                            if (str11 != null) {
                                return str11;
                            }
                            String meid = telephonyManager.getMeid();
                            this.f253955d = meid;
                            return meid;
                        } else if (valueOf2 == null || valueOf2.intValue() != 1) {
                            return null;
                        } else {
                            String str12 = this.f253956e;
                            if (str12 != null) {
                                return str12;
                            }
                            Object obj4 = objArr2[0];
                            C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Int");
                            String meid2 = telephonyManager.getMeid(((Integer) obj4).intValue());
                            this.f253956e = meid2;
                            return meid2;
                        }
                    }
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case 702848429:
                if (!str8.equals("getCellLocation")) {
                    return null;
                }
                C87679g.C87680a aVar5 = C87679g.f253958a;
                C87412m.m108593f(applicationContext, "gContext");
                if (C87679g.C87680a.m109073a(aVar5, applicationContext)) {
                    return telephonyManager.getCellLocation();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case 964598576:
                if (!str8.equals("getLine1Number")) {
                    return null;
                }
                C87679g.C87680a aVar6 = C87679g.f253958a;
                C87412m.m108593f(applicationContext, "gContext");
                if (C87679g.C87680a.m109074b(aVar6, applicationContext)) {
                    return telephonyManager.getLine1Number();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case 1954344473:
                if (!str8.equals("getSubscriberId")) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    C87679g.C87680a aVar7 = C87679g.f253958a;
                    C87412m.m108593f(applicationContext, "gContext");
                    if (C87679g.C87680a.m109074b(aVar7, applicationContext)) {
                        String str13 = this.f253952a;
                        if (str13 != null) {
                            return str13;
                        }
                        String subscriberId = telephonyManager.getSubscriberId();
                        this.f253952a = subscriberId;
                        return subscriberId;
                    }
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            default:
                return null;
        }
    }
}

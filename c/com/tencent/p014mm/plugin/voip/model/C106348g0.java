package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipExceptionReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C30534j;
import com.tencent.p014mm.plugin.voip.widget.InviteRemindDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import java.util.HashMap;
import java.util.Map;
import l33.C109247e;
import nj3.C76879j;
import p447aw.C103918d;
import qo3.C77426q;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.g0 */
public class C106348g0 {

    /* renamed from: a */
    public static boolean f317314a;

    /* renamed from: b */
    public static DialogInterface.OnClickListener f317315b = new g0$$o();

    /* renamed from: a */
    public static void m143240a(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.VoipPluginManager", "talker is null");
            return;
        }
        int m = C86709a0.m107524d().mo123467m();
        Log.m105918d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + m);
        if (m != 4 && m != 6) {
            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 4, 0);
            C76879j.m92742m(context, C0966R.string.f360087a11, C0966R.string.khz, f317315b);
        } else if (!f317314a) {
            try {
                Map<String, C30534j.C30535a> b = C30534j.C30535a.m39121b((String) C86709a0.m107535s().mo121142i().mo119684e(77829, (Object) null));
                if (b != null) {
                    if (b.size() > 0) {
                        if (b.containsKey(str)) {
                            C30534j.C30535a aVar = b.get(str);
                            aVar.f82261a++;
                            b.put(str, aVar);
                        } else {
                            C30534j.C30535a aVar2 = new C30534j.C30535a();
                            aVar2.f82261a++;
                            b.put(str, aVar2);
                        }
                    }
                    C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(b));
                    for (Map.Entry next : b.entrySet()) {
                        C30534j.C30535a aVar3 = (C30534j.C30535a) next.getValue();
                        Log.m105918d("MicroMsg.VoipPluginManager", "val1 " + aVar3.f82261a + " " + aVar3.f82262b + "name " + ((String) next.getKey()));
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    C30534j.C30535a aVar4 = new C30534j.C30535a();
                    aVar4.f82261a++;
                    hashMap.put(str, aVar4);
                    C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(hashMap));
                    for (Map.Entry entry : hashMap.entrySet()) {
                        C30534j.C30535a aVar5 = (C30534j.C30535a) entry.getValue();
                        Log.m105918d("MicroMsg.VoipPluginManager", "val2 " + aVar5.f82261a + " " + aVar5.f82262b + "  name " + ((String) entry.getKey()));
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipPluginManager", e, "", new Object[0]);
            }
            InviteRemindDialog.m39126E7(context, str, 1);
            m143245f();
        } else {
            C106350h0 xx02 = C109247e.xx0();
            xx02.getClass();
            Class cls = C75700k0.class;
            Log.m105924i("MicroMsg.Voip.VoipService", "startVoiceCall, toUser:" + str);
            if (Util.isNullOrNil(str)) {
                return;
            }
            if (System.currentTimeMillis() - xx02.f317339h < 2000 && System.currentTimeMillis() - xx02.f317339h > 0) {
                return;
            }
            if (System.currentTimeMillis() - xx02.f317342k >= xx02.f317343l || System.currentTimeMillis() - xx02.f317342k <= 0) {
                xx02.f317339h = System.currentTimeMillis();
                if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str) != null) {
                    if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str).mo62920o3()) {
                        C77426q qVar = new C77426q(MMApplicationContext.getContext());
                        qVar.mo107595g(context.getString(C0966R.string.mzh));
                        qVar.mo107602n(context.getString(C0966R.string.f8028zq));
                        qVar.mo107600l(new h0$$c());
                        qVar.mo107603o();
                        return;
                    }
                    xx02.mo152595I(context, str, xx02.mo152616o(), true, false, false);
                    VoipEvent voipEvent = new VoipEvent();
                    voipEvent.f194019d.f194022b = 7;
                    voipEvent.publish();
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
            C76879j.m92742m(context, C0966R.string.kip, C0966R.string.kjt, (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: b */
    public static long m143241b(String str, String str2, boolean z, long j, int i) {
        Log.m105924i("MicroMsg.VoipPluginManager", "insertRecallTip() called with: talker = [" + str + "], reason = [" + str2 + "], isVideoCall = [" + z + "], createTimeMin = [" + j + "], errorCode = [" + i + "]");
        C72963f4 f4Var = new C72963f4();
        f4Var.setType(10000);
        f4Var.mo108733M2(Math.max(C75604z3.m90843o(str), j + 1));
        f4Var.mo100991d(6);
        f4Var.mo108732L2(str2 + "  <a href=\"weixin://voip/callagain/?username=" + str + "&isvideocall=" + z + "\">" + MMApplicationContext.getContext().getString(C0966R.string.kev) + "</a>");
        f4Var.mo108743W2(f4Var.f230723F | 8);
        VoipExceptionReportStruct voipExceptionReportStruct = new VoipExceptionReportStruct();
        voipExceptionReportStruct.f156893d = (long) i;
        voipExceptionReportStruct.mo86054n();
        if (str == null || str.equals("")) {
            return 0;
        }
        f4Var.mo108749c3(str);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        return f4Var.getCreateTime();
    }

    /* renamed from: c */
    public static boolean m143242c() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(20480, -1)).longValue();
            if (longValue < 0) {
                return false;
            }
            long j = currentTimeMillis - longValue;
            Log.m105918d("MicroMsg.VoipPluginManager", "diff is" + j);
            return j < 21600000;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m143243d(String str, String str2, int i, int i2, String str3) {
        m143244e(str, str2, i, i2, str3, false, (C32226l<Long, Void>) null);
    }

    /* renamed from: e */
    public static void m143244e(String str, String str2, int i, int i2, String str3, boolean z, C32226l<Long, Void> lVar) {
        C106369n w = C109247e.xx0().mo152624w();
        ((C119157j) C119157j.f356862d).mo183875f(new g0$$g(str, i, str3, str2, i2, z, w, lVar));
    }

    /* renamed from: f */
    public static void m143245f() {
        VoipEvent voipEvent = new VoipEvent();
        voipEvent.f194019d.f194022b = 8;
        voipEvent.publish();
    }

    /* renamed from: g */
    public static void m143246g() {
        C86709a0.m107535s().mo121142i().mo119676J(20480, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: h */
    public static void m143247h(Context context, String str) {
        Class cls = C103918d.class;
        f317314a = false;
        try {
            C72963f4 Mx0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Mx0(str);
            if (Mx0 != null) {
                Mx0.getCreateTime();
                Uri uri = C91617n.f262467a;
                f317314a = true;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoipPluginManager", e, "", new Object[0]);
        }
        if (((C103918d) C86312j.m106911c(cls)).mo125775MJ(context, "android.permission.CAMERA", 19, "", "", new g0$$a(context))) {
            if (((C103918d) C86312j.m106911c(cls)).mo125775MJ(context, "android.permission.RECORD_AUDIO", 82, "", "", new g0$$f(context))) {
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.VoipPluginManager", "talker is null");
                    return;
                }
                int m = C86709a0.m107524d().mo123467m();
                Log.m105918d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + m);
                if (m != 4 && m != 6) {
                    C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 4, 0);
                    C76879j.m92742m(context, C0966R.string.f360087a11, C0966R.string.khz, f317315b);
                } else if (!f317314a) {
                    try {
                        Map<String, C30534j.C30535a> b = C30534j.C30535a.m39121b((String) C86709a0.m107535s().mo121142i().mo119684e(77829, (Object) null));
                        if (b != null) {
                            if (b.size() > 0) {
                                if (b.containsKey(str)) {
                                    C30534j.C30535a aVar = b.get(str);
                                    aVar.f82261a++;
                                    b.put(str, aVar);
                                } else {
                                    C30534j.C30535a aVar2 = new C30534j.C30535a();
                                    aVar2.f82261a++;
                                    b.put(str, aVar2);
                                }
                            }
                            C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(b));
                            for (Map.Entry next : b.entrySet()) {
                                C30534j.C30535a aVar3 = (C30534j.C30535a) next.getValue();
                                Log.m105918d("MicroMsg.VoipPluginManager", "val1 " + aVar3.f82261a + " " + aVar3.f82262b + "name " + ((String) next.getKey()));
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            C30534j.C30535a aVar4 = new C30534j.C30535a();
                            aVar4.f82261a++;
                            hashMap.put(str, aVar4);
                            C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(hashMap));
                            for (Map.Entry entry : hashMap.entrySet()) {
                                C30534j.C30535a aVar5 = (C30534j.C30535a) entry.getValue();
                                Log.m105918d("MicroMsg.VoipPluginManager", "val2 " + aVar5.f82261a + " " + aVar5.f82262b + "  name " + ((String) entry.getKey()));
                            }
                        }
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.VoipPluginManager", e2, "", new Object[0]);
                    }
                    InviteRemindDialog.m39126E7(context, str, 0);
                    m143245f();
                } else if (NetStatusUtil.isWifi(context) || m143242c()) {
                    C109247e.xx0().mo152594H(context, str);
                } else {
                    C109247e.xx0().mo152594H(context, str);
                }
            }
        }
    }
}

package com.tencent.p014mm.plugin.game;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.game.report.C40304b;
import com.tencent.p014mm.game.report.C40311f;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.commlib.util.C30081b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import cz1.C45227d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import js0.C9512b;
import org.json.JSONException;
import org.json.JSONObject;
import p168i6.C8850b;
import p763ym.C79138l;
import sw1.C48477m;
import sw1.C48483p;
import sw1.C48484q;
import u10.C52415a;
import u10.C52416b;
import uy1.C52642c;
import v10.C52735e;
import wx1.C53217b;
import xy1.C53472h;
import y10.C15928a;

@C86522b
/* renamed from: com.tencent.mm.plugin.game.i */
public class C41875i extends C86301e implements C48477m {

    /* renamed from: d */
    public boolean f112825d = false;

    /* renamed from: e */
    public boolean f112826e = false;

    /* renamed from: Ba */
    public void mo65659Ba(Context context, String str, String str2) {
        ((C40304b) C52415a.m58668a()).getClass();
        Log.m105918d("MicroMsg.GameReportImpl", "reportRegToWx, appId = " + str + ", pkgName = " + str2);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameReportImpl", "reportRegToWx fail, appId is null");
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = str;
        PackageInfo a = C9512b.m9207a(context, str2);
        if (a != null) {
            i = a.versionCode;
        }
        objArr[1] = Integer.valueOf(i);
        objArr[2] = C15928a.m14855b();
        objArr[3] = Long.valueOf(System.currentTimeMillis() / 1000);
        nVar.mo160131h(10534, objArr);
    }

    public void Hb0(Context context) {
        if (context != null) {
            context.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
        }
    }

    public String I30() {
        return C42046d.m45745d(MMApplicationContext.getContext());
    }

    public void P60(String str, String str2, int i, String str3) {
        ((C40304b) C52415a.m58668a()).getClass();
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.GameReportImpl", "null open or null username");
            return;
        }
        C115669n.INSTANCE.mo160131h(10738, str, str2, str, str3);
    }

    public void Q70(int i, int i2) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        C45227d vY = ((C53472h) C86312j.m106911c(C53472h.class)).mo70731vY();
        if (vY == null) {
            try {
                jSONObject.put("interactive", "20002");
                jSONObject.put("chatmsg_num", String.valueOf(i2));
            } catch (JSONException unused) {
            }
            i3 = 200;
        } else {
            int i4 = vY.f122566d;
            try {
                JSONObject jSONObject2 = new JSONObject(vY.f122565c);
                try {
                    jSONObject2.put("chatmsg_num", String.valueOf(i2));
                    i3 = i4;
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    Log.printErrStackTrace("MicroMsg.GameDelegateImpl", e, "", new Object[0]);
                    i3 = i4;
                    C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, 1, 0, (String) null, 0, i3, (String) null, (String) null, C40314g.m43482a("resource", String.valueOf(i), jSONObject.toString(), (Map) null));
                }
            } catch (JSONException e2) {
                e = e2;
                Log.printErrStackTrace("MicroMsg.GameDelegateImpl", e, "", new Object[0]);
                i3 = i4;
                C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, 1, 0, (String) null, 0, i3, (String) null, (String) null, C40314g.m43482a("resource", String.valueOf(i), jSONObject.toString(), (Map) null));
            }
        }
        C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, 1, 0, (String) null, 0, i3, (String) null, (String) null, C40314g.m43482a("resource", String.valueOf(i), jSONObject.toString(), (Map) null));
    }

    public void Rw0(Context context, String str, String str2, String str3, int i, String str4, int i2) {
        ((C40304b) C52415a.m58668a()).getClass();
        Log.m105918d("MicroMsg.GameReportImpl", "reportMsgClick, appId = " + str + ", pkgName = " + str2);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameReportImpl", "reportDelGameMsg fail, appId is null");
            return;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Object[] objArr = new Object[9];
        objArr[0] = str;
        PackageInfo a = C9512b.m9207a(context, str2);
        objArr[1] = Integer.valueOf(a == null ? 0 : a.versionCode);
        objArr[2] = C15928a.m14855b();
        objArr[3] = str3;
        objArr[4] = Integer.valueOf(i);
        objArr[5] = str4;
        objArr[6] = Integer.valueOf(i2);
        objArr[7] = 0;
        objArr[8] = Integer.valueOf(C15928a.m14854a(context));
        C40311f.m43479a(C52416b.m58673a(10583, objArr));
    }

    /* renamed from: Uw */
    public void mo65665Uw(Context context, String str, String str2, String str3, int i, int i2, int i3, String str4, long j, String str5, String str6) {
        ((C40304b) C52415a.m58668a()).mo62982d(context, str, str2, str3, i, i2, i3, str4, j, str5, str6, 0);
    }

    /* renamed from: bX */
    public void mo65666bX(Context context, String str, String str2, int i, int i2, String str3, int i3) {
        ((C40304b) C52415a.m58668a()).getClass();
        Log.m105918d("MicroMsg.GameReportImpl", "rejectGameMsg, fromUserName = " + str + ", appId = " + str2 + ", msgType = " + i + ", scene = " + i2 + ", actionName = " + str3);
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.GameReportImpl", "rejectGameMsg fail, appId is null");
            return;
        }
        C115669n.INSTANCE.mo160131h(10546, str, str2, Integer.valueOf(i), C15928a.m14855b(), Integer.valueOf(i2), str3, Integer.valueOf(i3));
    }

    public void dn0(Context context, String str, int i, int i2, int i3) {
        ((C40304b) C52415a.m58668a()).getClass();
        Log.m105918d("MicroMsg.GameReportImpl", "reportGameDetail, appId = " + str + ", scene = " + i2);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameReportImpl", "reportGameDetail fail, appId is null");
            return;
        }
        C115669n.INSTANCE.mo160131h(10700, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: e */
    public void mo65668e(String str, int i, long j) {
        C53217b.f148462a.mo73891h(str, i, j);
    }

    public boolean ju0(Context context) {
        try {
            return C41853c.m45377k();
        } catch (Exception unused) {
            return true;
        }
    }

    public void m00(long j, int i, String str) {
        C42119w Ow = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(j);
        if (Ow != null) {
            Ow.mo66075l2();
            Log.m105919d("MicroMsg.GameDelegateImpl", "gamelog.reddot, finder, exposure, reportGameEntranceExposure: %s", Ow.field_gameMsgId);
            HashMap hashMap = new HashMap();
            hashMap.put("reddot_strategy", C30081b.m38959a() ? "1" : "0");
            hashMap.put("channel", Integer.toString(Ow.field_channel));
            hashMap.put("other_score", Util.nullAsNil(str));
            String a = C40314g.m43482a("resource", String.valueOf(i), Ow.f113474g2, hashMap);
            if (Ow.field_needReport) {
                C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, 1, 0, Ow.field_appId, 0, Ow.f113470e2, Ow.field_gameMsgId, Ow.f113472f2, a);
                C115669n.INSTANCE.idkeyStat(858, 2, 1, false);
            }
        }
    }

    public void va0(boolean z) {
        if (!this.f112826e) {
            Class cls = C52735e.class;
            boolean z2 = false;
            if (((C52735e) C86312j.m106911c(cls)).mo61269fe(C32735h.C32737c.game_luggage, true) && ((C52735e) C86312j.m106911c(cls)).mo61269fe(C32735h.C32737c.preload_game_webcore, false)) {
                Log.m105924i("MicroMsg.GameDelegateImpl", "hit expt preload");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(939, 4, 1);
                if (C8850b.m8679b(MMApplicationContext.getContext()) < 2014) {
                    Log.m105924i("MicroMsg.GameDelegateImpl", "device score smaller than 2014");
                    nVar.mo175913w(939, 5, 1);
                } else {
                    if (System.currentTimeMillis() - MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0).getLong("game_index_last_visit_time", 0) > 21600000) {
                        Log.m105924i("MicroMsg.GameDelegateImpl", "larger than 6 hours");
                        if (z) {
                            C42119w k = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar().mo65982k();
                            if (k == null || System.currentTimeMillis() - (k.field_receiveTime * 1000) > 21600000) {
                                Log.m105924i("MicroMsg.GameDelegateImpl", "red dot larger than 6 hours");
                                nVar.mo175913w(939, 7, 1);
                            }
                        } else {
                            nVar.mo175913w(939, 6, 1);
                        }
                    }
                    if (ChannelUtil.isGPVersion()) {
                        Log.m105924i("MicroMsg.GameDelegateImpl", ConstValue.INIT_CONFIG_KEY_ISGPVERSION);
                        nVar.mo175913w(939, 8, 1);
                    } else if (Util.isNullOrNil(C52642c.m58989g())) {
                        nVar.mo175913w(939, 9, 1);
                    } else {
                        z2 = true;
                    }
                }
            }
            this.f112825d = z2;
            this.f112826e = true;
        }
        if (this.f112825d) {
            String g = C52642c.m58989g();
            if (!Util.isNullOrNil(g)) {
                Log.m105924i("MicroMsg.GameDelegateImpl", "preload");
                NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new NotifyGameWebviewOperationEvent();
                notifyGameWebviewOperationEvent.f9355d.f9356a = 3;
                Intent intent = new Intent();
                intent.putExtra("rawUrl", g);
                notifyGameWebviewOperationEvent.f9355d.f9358c = intent;
                notifyGameWebviewOperationEvent.publish();
            }
        }
    }

    /* renamed from: zj */
    public void mo65672zj(Context context, String str, String str2, int i, int i2, String str3, long j, String str4, int i3) {
        String str5 = str;
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str5);
        if (appInfo != null) {
            C52415a a = C52415a.m58668a();
            boolean k = appInfo.mo69359k();
            ((C40304b) a).getClass();
            Log.m105918d("MicroMsg.GameReportImpl", "reportReadMsg, appId = " + str5);
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.GameReportImpl", "reportReadMsg fail, appId is null");
                return;
            }
            String bigInteger = new BigInteger("00FFFFFFFFFFFFFFFF", 16).and(BigInteger.valueOf(j)).toString();
            Log.m105918d("MicroMsg.GameReportUtil", "reportReadMsg, unsignedlonglong = " + bigInteger);
            Log.m105925i("MicroMsg.reportReadMsg", "%s,%s,%s,%s,%s,%s,%s,%s,%d", str5, bigInteger, str2, Integer.valueOf(i), str3, Integer.valueOf(i2), Integer.valueOf(k ? 1 : 0), str4, Integer.valueOf(i3));
            C115669n.INSTANCE.mo160131h(10532, str5, bigInteger, str2, Integer.valueOf(i), str3, Integer.valueOf(i2), Integer.valueOf(k), str4, Integer.valueOf(i3));
        }
    }
}

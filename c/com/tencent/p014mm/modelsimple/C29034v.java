package com.tencent.p014mm.modelsimple;

import android.content.SharedPreferences;
import com.tencent.p014mm.autogen.events.APPHasInitEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48782az1;
import te3.C48929bz1;

/* renamed from: com.tencent.mm.modelsimple.v */
public class C29034v extends C117747y implements C1311n {

    /* renamed from: h */
    public static Map<String, Long> f79567h = new HashMap();

    /* renamed from: i */
    public static Map<String, String> f79568i;

    /* renamed from: d */
    public final C47350c f79569d;

    /* renamed from: e */
    public C11385n f79570e;

    /* renamed from: f */
    public boolean f79571f = false;

    /* renamed from: g */
    public IListener<APPHasInitEvent> f79572g;

    public C29034v(int i, boolean z) {
        String[] split;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48782az1();
        bVar.f127067b = new C48929bz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getdisasterinfo";
        bVar.f127069d = 775;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f79569d = a;
        a.f127059e = 1;
        ((C48782az1) a.f127055a.f127080a).f130849d = i;
        this.f79571f = z;
        synchronized (this) {
            if (f79568i == null) {
                Log.m105924i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
                f79568i = new HashMap();
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("disaster_pref", 4);
                String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
                if (!Util.isNullOrNil(string) && (split = string.split(";")) != null && split.length > 0) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    String str = "";
                    for (String split2 : split) {
                        String[] split3 = split2.split(",");
                        try {
                            if (Util.getLong(split3[0], 0) > 0) {
                                if (Util.secondsToNow(Util.getLong(split3[1], 0)) < 86400) {
                                    String string2 = sharedPreferences.getString(split3[0], "");
                                    if (!Util.isNullOrNil(string2)) {
                                        str = str + split3[0] + "," + split3[1] + ";";
                                        ((HashMap) f79568i).put(split3[0], string2);
                                    }
                                } else {
                                    edit.remove(split3[0]).commit();
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", e.getMessage());
                        }
                    }
                    edit.putString("disaster_new_noticeid_list_key", str).commit();
                    Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", str, f79567h);
                }
                Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", f79568i);
            }
        }
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", Integer.valueOf(i), Boolean.valueOf(this.f79571f), Util.getStack());
    }

    /* renamed from: j1 */
    public static void m38532j1(C29034v vVar, String str, String str2) {
        vVar.getClass();
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("disaster_pref", 4);
        String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
        if (!Util.isNullOrNil(string)) {
            string = string + ";";
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.putString("disaster_new_noticeid_list_key", string + str + "," + Util.nowSecond());
        edit.commit();
        ((HashMap) f79568i).put(str, str2);
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz saveDisasterNotice newNoticeIdList[%s], noticeId[%s], content[%s]", sharedPreferences.getString("disaster_new_noticeid_list_key", ""), str, sharedPreferences.getString(str, ""));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C48782az1 az12 = (C48782az1) this.f79569d.f127055a.f127080a;
        Map<String, Long> map = f79567h;
        long nullAs = Util.nullAs((Long) ((HashMap) map).get("" + az12.f130849d), 0);
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", Integer.valueOf(az12.f130849d), Long.valueOf(nullAs), f79567h);
        if (nullAs == 0 || Util.ticksToNow(nullAs) >= 1800000) {
            Map<String, String> map2 = f79568i;
            String nullAs2 = Util.nullAs((String) ((HashMap) map2).get("" + az12.f130849d), "");
            if (!Util.isNullOrNil(nullAs2)) {
                Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", Integer.valueOf(az12.f130849d), nullAs2);
                C86709a0.m107525e().postToWorker(new NetSceneGetDisasterInfo$1(this, nullAs2, false));
                return -1;
            }
            this.f79570e = nVar;
            return dispatch(gVar, this.f79569d, this);
        }
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", Integer.valueOf(az12.f130849d));
        return -1;
    }

    public int getType() {
        return 775;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107525e().postToWorker(new NetSceneGetDisasterInfo$1(this, ((C48929bz1) this.f79569d.f127056b.f127083a).f131413d, true));
        }
        this.f79570e.onSceneEnd(i2, i3, str, this);
    }
}

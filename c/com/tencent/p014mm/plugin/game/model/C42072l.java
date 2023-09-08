package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sw1.C48483p;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.l */
public class C42072l {

    /* renamed from: a */
    public static C42072l f113359a;

    /* renamed from: com.tencent.mm.plugin.game.model.l$a */
    public static class C42073a {

        /* renamed from: a */
        public long f113360a = 0;

        /* renamed from: b */
        public long f113361b = 0;

        /* renamed from: c */
        public int f113362c = -10;

        /* renamed from: d */
        public List<String> f113363d = new ArrayList();

        /* renamed from: b */
        public static C42073a m45773b(String str) {
            C42073a aVar = new C42073a();
            if (Util.isNullOrNil(str)) {
                return aVar;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f113360a = jSONObject.optLong("startTime", 0);
                aVar.f113361b = jSONObject.optLong("endTime", 0);
                aVar.f113362c = jSONObject.optInt("basicType", -10);
                JSONArray optJSONArray = jSONObject.optJSONArray("msgIdList");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ((ArrayList) aVar.f113363d).add(optJSONArray.optString(i));
                    }
                }
            } catch (JSONException unused) {
            }
            return aVar;
        }

        /* renamed from: a */
        public String mo66039a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.f113360a);
                jSONObject.put("endTime", this.f113361b);
                jSONObject.put("basicType", this.f113362c);
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) this.f113363d).iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("msgIdList", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.l$b */
    public static class C42074b {

        /* renamed from: a */
        public String f113364a = "HEAD";

        /* renamed from: b */
        public String f113365b;
    }

    /* renamed from: a */
    public static void m45770a(List<String> list, boolean z) {
        JSONArray jSONArray;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_FUNCTION_MSG_DELETED_STRING;
        if (!Util.isNullOrNil((List) list)) {
            String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, ""));
            int i = 0;
            try {
                jSONArray = !Util.isNullOrNil(nullAsNil) ? new JSONArray(nullAsNil) : new JSONArray();
            } catch (JSONException e) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                Log.printErrStackTrace("MicroMsg.GameControlCmdParser", e, "", new Object[0]);
                jSONArray = null;
            }
            if (jSONArray != null) {
                Iterator<String> it = list.iterator();
                while (true) {
                    boolean z2 = true;
                    if (it.hasNext()) {
                        String next = it.next();
                        if (jSONArray.length() > 100) {
                            jSONArray.remove(i);
                        }
                        jSONArray.put(next);
                        C42036a0 ar = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar();
                        Class cls = C48484q.class;
                        C42119w m = ar.mo65984m();
                        if (m != null && Util.nullAsNil(m.field_gameMsgId).equals(next)) {
                            ar.mo65977f(C42036a0.C42037a.GAME_REDDOT_EXIT_REVOKE);
                        }
                        C42119w bD = ((C48484q) C86312j.m106911c(cls)).xi0().mo66004bD(next);
                        if (bD == null || !next.equals(bD.field_gameMsgId)) {
                            Object[] objArr = new Object[1];
                            objArr[i] = next;
                            Log.m105925i("MicroMsg.GameMessageService", "dont have msgId:%s for delete", objArr);
                            bD = new C42119w();
                            bD.field_gameMsgId = next;
                            z2 = false;
                        } else {
                            ((C48484q) C86312j.m106911c(cls)).xi0().delete(bD, new String[i]);
                        }
                        int i2 = z2 ? 101 : 102;
                        if (z) {
                            C40314g.m43485d(MMApplicationContext.getContext(), 0, 0, 0, 403, i2, bD.field_appId, 0, bD.f113470e2, bD.field_gameMsgId, bD.f113472f2, C40314g.m43482a("resource", String.valueOf(bD.f113491q1.f113527a), bD.f113474g2, (Map) null));
                        }
                        i = 0;
                    } else {
                        String jSONArray2 = jSONArray.toString();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONArray2);
                        Log.m105925i("MicroMsg.GameControlCmdParser", "gamelog.srv_msg, service, ctrl_msg, delete_msg, deleted msg list:%s", jSONArray2);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static List<String> m45771b(String str, String str2, Map<String, String> map) {
        String str3;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i == 0) {
                str3 = str + "." + str2;
            } else {
                str3 = str + "." + str2 + i;
            }
            if (!map.containsKey(str3)) {
                return arrayList;
            }
            i++;
            String str4 = map.get(str3);
            if (!Util.isNullOrNil(str4)) {
                arrayList.add(str4);
            }
        }
    }

    /* renamed from: c */
    public static void m45772c(String str, Map<String, String> map, JSONObject jSONObject) {
        String str2 = ".sysmsg.control_command.auto_run_switch." + str;
        if (map.containsKey(str2)) {
            try {
                jSONObject.put(str, Util.getInt(map.get(str2), 0));
            } catch (JSONException unused) {
            }
        }
    }
}

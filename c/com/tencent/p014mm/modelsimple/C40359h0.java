package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import p537gq.C32496d;
import p645pj.C47509i;
import te3.eb4;
import te3.fb4;
import te3.gb4;
import te3.hb4;

/* renamed from: com.tencent.mm.modelsimple.h0 */
public class C40359h0 extends C117747y implements C1311n {

    /* renamed from: g */
    public static HashSet<Long> f108457g = new HashSet<>();

    /* renamed from: d */
    public final String f108458d;

    /* renamed from: e */
    public final C47350c f108459e;

    /* renamed from: f */
    public C11385n f108460f;

    public C40359h0(String str, int i, int i2, LinkedList<hb4> linkedList) {
        this.f108458d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fb4();
        bVar.f127067b = new gb4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/statusnotify";
        bVar.f127069d = 251;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108459e = a;
        fb4 fb4 = (fb4) a.f127055a.f127080a;
        fb4.f133399e = C75592q0.m90789s();
        fb4.f133398d = i;
        fb4.f133400f = str;
        fb4.f133401g = "" + System.currentTimeMillis();
        if (linkedList != null && linkedList.size() == i2) {
            fb4.f133402h = i2;
            fb4.f133403i.addAll(linkedList);
        }
        Log.m105918d("MicroMsg.NetSceneStatusNotify", "summerstatus toUserName = " + str + " unreadChatListCount = " + fb4.f133403i.size());
    }

    /* renamed from: j1 */
    public static boolean m43528j1() {
        long Cs0 = ((C32496d) C86312j.m106911c(C32496d.class)).Cs0();
        if (C31543z5.m39453c() - Cs0 < 259200000) {
            return true;
        }
        Log.m105925i("MicroMsg.NetSceneStatusNotify", "lastLoginTime:%s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, Cs0 / 1000));
        return false;
    }

    /* renamed from: k1 */
    public static void m43529k1(String str, int i) {
        C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(str);
        if (Ex0 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("messageSvrId", Long.toString(Ex0.mo108774y2()));
                jSONObject.put("MsgCreateTime", Long.toString(Ex0.getCreateTime()));
                m43531m1(str, i, "lastMessage", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: l1 */
    public static void m43530l1(String str, int i) {
        Log.m105925i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s", str, Integer.valueOf(i));
        if (Util.isNullOrNil(str) || !C86709a0.m107523b().mo121114l()) {
            return;
        }
        if (!C45628s0.m50812z(str) || C72996z1.m85830a5(str)) {
            m43529k1(str, i);
        }
    }

    /* renamed from: m1 */
    public static void m43531m1(String str, int i, String str2, String str3) {
        boolean z = false;
        Log.m105925i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s %s %s", str, Integer.valueOf(i), str2, str3);
        if (!Util.isNullOrNil(str) && !C45628s0.m50812z(str) && C86709a0.m107523b().mo121114l()) {
            if (!(i == 2 && C47509i.m52838a().mo107404b("StatusNotifyForbidEnterSession", 0) == 1)) {
                z = true;
            }
            if (z && m43528j1()) {
                C86709a0.m107529k().f251779b.mo123460f(new C40359h0(str, i, str2, str3));
            }
        }
    }

    /* renamed from: n1 */
    public static void m43532n1(C72963f4 f4Var, int i, int i2) {
        if (f4Var != null) {
            Log.m105925i("MicroMsg.NetSceneStatusNotify", "enterShareCardMessageStatusSession %s %s %s", f4Var.mo108768t(), Integer.valueOf(i), Integer.valueOf(i2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("messageSvrId", Long.toString(f4Var.mo108774y2()));
                jSONObject.put("shareCardMessageStatus", Long.toString((long) i2));
                m43531m1(f4Var.mo108768t(), i, "shareCardMessageStatus", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o1 */
    public static void m43533o1(C72963f4 f4Var) {
        C86709a0.m107528h();
        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, Boolean.TRUE)).booleanValue()) {
            Log.m105924i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]autoSyncState close");
        } else if (f108457g.contains(Long.valueOf(f4Var.getMsgId()))) {
            Log.m105925i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd: has send cmd: msgSvrId:%d, msgLocalId:%d", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.getMsgId()));
        } else {
            f108457g.add(Long.valueOf(f4Var.getMsgId()));
            if (C86709a0.m107523b().mo121114l()) {
                StringBuilder sb = new StringBuilder();
                sb.append("<![CDATA[<downloadList>");
                sb.append("<downloadItem>");
                sb.append("<username>");
                sb.append(f4Var.mo108768t());
                sb.append("</username>");
                sb.append("<msgsvrid>");
                sb.append(f4Var.mo108774y2());
                sb.append("</msgsvrid>");
                sb.append("</downloadItem>");
                sb.append("</downloadList>]]>");
                String sb4 = sb.toString();
                Log.m105925i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd:msgID:%d,  %s", Long.valueOf(f4Var.getMsgId()), sb);
                if (m43528j1()) {
                    C86709a0.m107529k().f251779b.mo123460f(new C40359h0(C75592q0.m90789s(), 11, "DownloadFile", sb4));
                }
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108460f = nVar;
        return dispatch(gVar, this.f108459e, this);
    }

    public int getType() {
        return 251;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneStatusNotify", "StatusNotify Error. userName=" + this.f108458d + ", errType=" + i2 + ", errCode=" + i3 + ",errMsg=" + str);
        this.f108460f.onSceneEnd(i2, i3, str, this);
    }

    public C40359h0(String str, int i, String str2, String str3) {
        this.f108458d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fb4();
        bVar.f127067b = new gb4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/statusnotify";
        bVar.f127069d = 251;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108459e = a;
        fb4 fb4 = (fb4) a.f127055a.f127080a;
        fb4.f133399e = C75592q0.m90789s();
        fb4.f133398d = i;
        fb4.f133400f = str;
        fb4.f133401g = "" + System.currentTimeMillis();
        eb4 eb4 = new eb4();
        fb4.f133404j = eb4;
        eb4.f132839d = str2;
        eb4.f132840e = str3;
    }
}

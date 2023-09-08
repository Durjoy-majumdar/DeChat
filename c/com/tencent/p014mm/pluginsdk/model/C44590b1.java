package com.tencent.p014mm.pluginsdk.model;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p011cm.C28611c;
import tc2.C118418g;
import te3.C51018qv3;
import te3.lq4;
import te3.lx4;
import te3.mq4;
import te3.oq4;
import te3.pq4;
import yh0.C39021b;

/* renamed from: com.tencent.mm.pluginsdk.model.b1 */
public class C44590b1 extends C117747y implements C1311n, C28611c {

    /* renamed from: d */
    public C11385n f120895d;

    /* renamed from: e */
    public final C47350c f120896e;

    /* renamed from: f */
    public List<String> f120897f;

    /* renamed from: g */
    public int f120898g;

    /* renamed from: h */
    public String f120899h;

    /* renamed from: i */
    public HashMap<String, Object> f120900i;

    public C44590b1(int i, String str, String str2, int i2, String str3, int i3) {
        this.f120897f = null;
        this.f120898g = 0;
        this.f120900i = new HashMap<>();
        Assert.assertTrue("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", i == 3);
        LinkedList linkedList = new LinkedList();
        this.f120897f = linkedList;
        linkedList.add(str);
        this.f120898g = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new oq4());
        bVar.mo72407e(new pq4());
        bVar.mo72409g("/cgi-bin/micromsg-bin/verifyuser");
        bVar.mo72404b(137);
        bVar.mo72406d(44);
        bVar.mo72408f(1000000044);
        C47350c a = bVar.mo72403a();
        this.f120896e = a;
        oq4 oq4 = (oq4) a.mo72394a();
        oq4.f139319d = i;
        oq4.f139322g = "";
        LinkedList<lq4> linkedList2 = new LinkedList<>();
        lq4 lq4 = new lq4();
        lq4.f137587d = str;
        lq4.f137588e = str2;
        lq4.f137589f = C39021b.wx0().vx0().mo57650Lo(str, i2);
        lq4.f137591h = str3;
        if (i3 > 0) {
            lq4.f137590g = i3;
        }
        linkedList2.add(lq4);
        oq4.f139321f = linkedList2;
        oq4.f139320e = linkedList2.size();
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(Integer.valueOf(i2));
        oq4.f139324i = linkedList3;
        oq4.f139323h = linkedList3.size();
        C118418g gVar = C118418g.INSTANCE;
        if (gVar.An0("ie_ver_usr")) {
            gVar.mo175826kl("ie_ver_usr");
        }
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(gVar.vu0("ie_ver_usr"));
        lx4.f354115d = qv32;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] wcstf set on verifyuser , len: %s", Integer.valueOf(qv32.mo73347d()));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(gVar.bw0("ce_ver_usr"));
        lx4.f354116e = qv33;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] wcste set on verifyuser , len: %s", Integer.valueOf(qv33.mo73347d()));
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(gVar.mo175821hd());
        lx4.f354117f = qv34;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] ccData set on verifyuser , len: %s", Integer.valueOf(qv34.mo73347d()));
        String gF = gVar.mo175819gF("ce_ver_usr");
        if (gF != null) {
            C51018qv3 qv35 = new C51018qv3();
            qv35.mo73350k(gF.getBytes());
            lx4.f354122n = qv35;
        }
        try {
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(lx4.toByteArray());
            oq4.f139328p = qv36;
        } catch (Throwable unused) {
        }
        Log.m105925i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify user:%d scene:%d ticket:%s anti:%s, friendFlag:%d", Integer.valueOf(oq4.f139321f.size()), Integer.valueOf(oq4.f139324i.size()), str2, lq4.f137589f, Integer.valueOf(i3));
    }

    /* renamed from: E */
    public List<String> mo56088E() {
        return this.f120897f;
    }

    /* renamed from: J */
    public void mo69382J(int i) {
        Iterator<lq4> it = ((oq4) this.f120896e.f127055a.f127080a).f139321f.iterator();
        while (it.hasNext()) {
            it.next().f137599s = i;
        }
    }

    /* renamed from: L */
    public Object mo56089L(String str) {
        return this.f120900i.get(str);
    }

    /* renamed from: P */
    public void mo56090P(String str, Object obj) {
        this.f120900i.put(str, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f127056b;
     */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo56091T0() {
        /*
            r1 = this;
            ob0.c r0 = r1.f120896e
            if (r0 == 0) goto L_0x000f
            ob0.c$d r0 = r0.f127056b
            if (r0 == 0) goto L_0x000f
            pe3.a r0 = r0.f127083a
            te3.pq4 r0 = (te3.pq4) r0
            java.lang.String r0 = r0.f139905d
            return r0
        L_0x000f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C44590b1.mo56091T0():java.lang.String");
    }

    /* renamed from: a1 */
    public void mo56092a1(mq4 mq4) {
        if (mq4 != null) {
            Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "setBizReportInfo SubScene:%d, MpScene:%d, SceneNote:%s, finderBuffer:%s", Integer.valueOf(mq4.f138158d), Integer.valueOf(mq4.f138160f), mq4.f138159e, mq4.f138162h);
            Iterator<lq4> it = ((oq4) this.f120896e.f127055a.f127080a).f139321f.iterator();
            while (it.hasNext()) {
                lq4 next = it.next();
                try {
                    C51018qv3 qv32 = new C51018qv3();
                    qv32.mo73350k(mq4.toByteArray());
                    next.f137600t = qv32;
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.NetSceneVerifyUser.dkverify", "setBizReportInfo %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: b1 */
    public List<String> mo56093b1() {
        return null;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f120895d = nVar;
        return dispatch(gVar, this.f120896e, this);
    }

    public int getType() {
        return 30;
    }

    /* renamed from: j1 */
    public void mo69383j1(boolean z) {
        oq4 oq4 = (oq4) this.f120896e.f127055a.f127080a;
        if (z) {
            oq4.f139329q = 1;
        } else {
            oq4.f139329q = 0;
        }
    }

    /* renamed from: k1 */
    public void mo69384k1(String str, String str2) {
        Iterator<lq4> it = ((oq4) this.f120896e.f127055a.f127080a).f139321f.iterator();
        while (it.hasNext()) {
            lq4 next = it.next();
            next.f137592i = str;
            next.f137593j = str2;
        }
    }

    /* renamed from: m0 */
    public String mo56094m0() {
        return null;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105921e("MicroMsg.NetSceneVerifyUser.dkverify", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f120895d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: q */
    public void mo69385q(String str) {
        Iterator<lq4> it = ((oq4) this.f120896e.f127055a.f127080a).f139321f.iterator();
        while (it.hasNext()) {
            it.next().f137598r = str;
        }
    }

    /* renamed from: v0 */
    public int mo56095v0() {
        return this.f120898g;
    }

    public C44590b1(int i, List<String> list, List<Integer> list2, List<String> list3, String str, String str2, Map<String, Integer> map, String str3, String str4) {
        this(i, list, list2, list3, str, str2, map, str3, str4, (String) null);
    }

    public C44590b1(int i, List<String> list, List<Integer> list2, List<String> list3, String str, String str2, Map<String, Integer> map, String str3, String str4, String str5) {
        List<String> list4;
        String str6;
        int i2 = i;
        List<String> list5 = list;
        List<Integer> list6 = list2;
        String str7 = str;
        Map<String, Integer> map2 = map;
        String str8 = str3;
        String str9 = str4;
        this.f120897f = null;
        this.f120898g = 0;
        this.f120900i = new HashMap<>();
        Assert.assertTrue("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", i2 != 3);
        this.f120898g = i2;
        this.f120897f = list5;
        if (list3 == null || list3.size() == 0) {
            list4 = new LinkedList<>();
        } else {
            list4 = list3;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new oq4());
        bVar.mo72407e(new pq4());
        bVar.mo72409g("/cgi-bin/micromsg-bin/verifyuser");
        bVar.mo72404b(137);
        bVar.mo72406d(44);
        bVar.mo72408f(1000000044);
        this.f120896e = bVar.mo72403a();
        if (list4.size() > 0) {
            if (list4.size() != list.size()) {
                Log.m105921e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", Integer.valueOf(list4.size()), Integer.valueOf(list.size()));
            } else {
                for (int i3 = 0; i3 < list4.size(); i3++) {
                    C39021b.wx0().vx0().mo57651jo(list5.get(i3), 2147483633, list4.get(i3));
                }
            }
        }
        if (i2 == 2) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                list4.add(Util.nullAs(C39021b.wx0().vx0().mo57650Lo(list5.get(i4), 2147483633), ""));
            }
        }
        oq4 oq4 = (oq4) this.f120896e.mo72394a();
        oq4.f139319d = i2;
        oq4.f139322g = str7;
        this.f120899h = str7;
        if (!Util.isNullOrNil(str5)) {
            oq4.f139330r = str5;
        }
        LinkedList<lq4> linkedList = new LinkedList<>();
        for (int i5 = 0; i5 < list.size(); i5++) {
            lq4 lq4 = new lq4();
            lq4.f137587d = list5.get(i5);
            if (str2 == null) {
                str6 = "";
            } else {
                str6 = str2;
            }
            lq4.f137588e = str6;
            String nullAs = Util.nullAs(C39021b.wx0().vx0().mo57650Lo(lq4.f137587d, list6.get(i5).intValue()), "");
            lq4.f137589f = nullAs;
            if (TextUtils.isEmpty(nullAs) && list4.size() > i5) {
                lq4.f137589f = list4.get(i5);
            }
            lq4.f137591h = str8;
            if (map2 != null && map2.containsKey(lq4.f137587d)) {
                lq4.f137590g = map2.get(lq4.f137587d).intValue();
            }
            lq4.f137595o = str9;
            Log.m105925i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%s idx:%s user:%s anti:%s chatroom:%s, reportInfo:%s, friendflag:%d", Integer.valueOf(this.f120898g), Integer.valueOf(i5), lq4.f137587d, lq4.f137589f, str8, str9, Integer.valueOf(lq4.f137590g));
            linkedList.add(lq4);
        }
        oq4.f139321f = linkedList;
        oq4.f139320e = linkedList.size();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.addAll(list6);
        oq4.f139324i = linkedList2;
        oq4.f139323h = linkedList2.size();
        C118418g gVar = C118418g.INSTANCE;
        if (gVar.An0("ie_ver_usr")) {
            gVar.mo175826kl("ie_ver_usr");
        }
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(gVar.vu0("ie_ver_usr"));
        lx4.f354115d = qv32;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] wcstf set on verifyuser , len: %s", Integer.valueOf(qv32.mo73347d()));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(gVar.bw0("ce_ver_usr"));
        lx4.f354116e = qv33;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] wcste set on verifyuser , len: %s", Integer.valueOf(qv33.mo73347d()));
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(gVar.mo175821hd());
        lx4.f354117f = qv34;
        Log.m105919d("MicroMsg.NetSceneVerifyUser.dkverify", "[debug] ccData set on verifyuser , len: %s", Integer.valueOf(qv34.mo73347d()));
        String gF = gVar.mo175819gF("ce_ver_usr");
        if (gF != null) {
            C51018qv3 qv35 = new C51018qv3();
            qv35.mo73350k(gF.getBytes());
            lx4.f354122n = qv35;
        }
        try {
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(lx4.toByteArray());
            oq4.f139328p = qv36;
        } catch (Throwable unused) {
        }
        Log.m105925i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%d scene:%d user:%d antitickets:%s chatroom:%s stack:%s", Integer.valueOf(this.f120898g), Integer.valueOf(oq4.f139321f.size()), Integer.valueOf(oq4.f139324i.size()), Util.listToString(list4, ","), str8, Util.getStack());
    }

    public C44590b1(int i, List<String> list, List<Integer> list2, String str, String str2, Map<String, Integer> map, String str3) {
        this(i, list, list2, (List<String>) null, str, str2, map, str3, "");
    }

    public C44590b1(int i, String str, String str2, int i2) {
        this(i, str, str2, i2, (String) null, 0);
    }

    public C44590b1(int i, List<String> list, List<Integer> list2, String str, String str2) {
        this(i, list, list2, (List<String>) null, str, str2, (Map<String, Integer>) null, (String) null, "");
    }
}

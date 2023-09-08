package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75570d3;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C7628p0;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C48936c04;
import te3.C51163rv3;
import te3.C52318zw2;
import te3.C64249b04;
import te3.C78020yw2;

/* renamed from: com.tencent.mm.plugin.voip.model.i */
public class C71579i extends C117747y implements C1311n {

    /* renamed from: h */
    public static final List<C75570d3> f207458h = new ArrayList();

    /* renamed from: i */
    public static final Set<Long> f207459i = new HashSet();

    /* renamed from: d */
    public C11385n f207460d;

    /* renamed from: e */
    public C47350c f207461e;

    /* renamed from: f */
    public long f207462f;

    /* renamed from: g */
    public final List<C72963f4> f207463g = new LinkedList();

    public C71579i(String str, String str2, int i, int i2) {
        Log.m105918d("MicroMsg.NetSceneSendMsg", "dktext :" + Util.getStack());
        if (!Util.isNullOrNil(str)) {
            C72963f4 f4Var = new C72963f4();
            boolean z = true;
            f4Var.mo100991d(1);
            f4Var.mo108749c3(str);
            f4Var.mo108733M2(C75604z3.m90843o(str));
            f4Var.mo108740T2(1);
            f4Var.mo108732L2(str2);
            f4Var.setType(i);
            long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            this.f207462f = my02;
            Assert.assertTrue(my02 == -1 ? false : z);
            Log.m105924i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.f207462f);
            if ((i2 & 4) != 0) {
                ((HashSet) f207459i).add(Long.valueOf(this.f207462f));
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Class cls = C75700k0.class;
        this.f207460d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64249b04();
        bVar.f127067b = new C48936c04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newsendmsg";
        bVar.f127069d = 522;
        bVar.f127070e = 237;
        bVar.f127071f = 1000000237;
        C47350c a = bVar.mo72403a();
        this.f207461e = a;
        C64249b04 b042 = (C64249b04) a.f127055a.f127080a;
        ArrayList arrayList = (ArrayList) ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ox0(Integer.MAX_VALUE);
        if (arrayList.size() == 0) {
            Log.m105924i("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        ((LinkedList) this.f207463g).clear();
        for (int i = 0; i < arrayList.size(); i++) {
            C72963f4 f4Var = (C72963f4) arrayList.get(i);
            if (f4Var.mo108769t2() == 1) {
                C78020yw2 yw22 = new C78020yw2();
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = f4Var.mo108768t();
                rv32.f141176e = true;
                yw22.f228642d = rv32;
                yw22.f228645g = (int) (f4Var.getCreateTime() / 1000);
                yw22.f228644f = f4Var.getType();
                yw22.f228643e = f4Var.getContent();
                yw22.f228646h = C7628p0.m7761a(C75592q0.m90789s(), f4Var.getCreateTime()).hashCode();
                yw22.f228647i = C75569c4.m90672e((C72963f4) null);
                if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(f4Var.mo108768t())) {
                    yw22.f228648j = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(f4Var.mo108768t());
                }
                b042.f182206e.add(yw22);
                b042.f182205d = b042.f182206e.size();
                ((LinkedList) this.f207463g).add(f4Var);
            }
        }
        int dispatch = dispatch(gVar, this.f207461e, this);
        if (dispatch < 0) {
            for (int i2 = 0; i2 < ((LinkedList) this.f207463g).size(); i2++) {
                mo98754j1(i2);
            }
        }
        return dispatch;
    }

    public int getType() {
        return 522;
    }

    /* renamed from: j1 */
    public final void mo98754j1(int i) {
        C72963f4 f4Var = (C72963f4) ((LinkedList) this.f207463g).get(i);
        f4Var.mo100991d(5);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
        Iterator it = ((ArrayList) f207458h).iterator();
        while (it.hasNext()) {
            ((C75570d3) it.next()).mo102659f3(f4Var.mo108768t(), f4Var.getContent());
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneSendMsg", "onGYNetEnd errtype:" + i2 + " errcode:" + i3);
        C48936c04 c042 = (C48936c04) this.f207461e.f127056b.f127083a;
        if (c042 != null && (i2 == 4 || (i2 == 0 && i3 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(c042.f131434f);
        }
        if (i2 == 0 && i3 == 0) {
            LinkedList<C52318zw2> linkedList = c042.f131433e;
            if (((LinkedList) this.f207463g).size() == linkedList.size()) {
                int i4 = 0;
                while (i4 < linkedList.size()) {
                    C52318zw2 zw22 = linkedList.get(i4);
                    if (zw22.f146252d != 0) {
                        Log.m105920e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + zw22.f146252d);
                        mo98754j1(i4);
                        this.f207460d.onSceneEnd(4, zw22.f146252d, str, this);
                        return;
                    }
                    Class cls = C75700k0.class;
                    long msgId = ((C72963f4) ((LinkedList) this.f207463g).get(i4)).getMsgId();
                    Log.m105924i("MicroMsg.NetSceneSendMsg", "msg local id = " + msgId + ", SvrId = " + zw22.f146259n + " sent successfully!");
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(msgId);
                    b002.mo108745Y2(zw22.f146259n);
                    b002.mo100991d(2);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(msgId, b002);
                    i4++;
                }
                Log.m105924i("MicroMsg.NetSceneSendMsg", "total " + i4 + " msgs sent successfully");
            }
            int doScene = doScene(dispatcher(), this.f207460d);
            if (doScene == -2) {
                this.f207460d.onSceneEnd(0, 0, str, this);
            } else if (doScene < 0) {
                this.f207460d.onSceneEnd(3, -1, str, this);
            }
        } else {
            for (int i5 = 0; i5 < ((LinkedList) this.f207463g).size(); i5++) {
                mo98754j1(i5);
            }
            this.f207460d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return ((LinkedList) this.f207463g).size() > 0 ? y$$d.EOk : y$$d.EFailed;
    }
}

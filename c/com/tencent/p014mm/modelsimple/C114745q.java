package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import p823sg.C90196p;
import qe3.C118177c0;
import qe3.C89631w;

/* renamed from: com.tencent.mm.modelsimple.q */
public class C114745q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f344013d;

    /* renamed from: e */
    public C114799u f344014e;

    /* renamed from: f */
    public String f344015f = "";

    /* renamed from: g */
    public byte[] f344016g;

    /* renamed from: com.tencent.mm.modelsimple.q$a */
    public static class C114746a extends C117746w {

        /* renamed from: a */
        public final C118177c0.C118178a f344017a = new C118177c0.C118178a();

        /* renamed from: b */
        public final C118177c0.C118179b f344018b = new C118177c0.C118179b();

        public C89631w.C89634d getReqObjImp() {
            return this.f344017a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f344018b;
        }

        public int getType() {
            return 10;
        }

        public String getUri() {
            return null;
        }
    }

    public C114745q(int i, List<String> list, byte[] bArr) {
        Assert.assertTrue((list == null || list.size() <= 0 || bArr == null) ? false : true);
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String str = list.get(0);
        for (int i2 = 1; i2 < list.size(); i2++) {
            str = str + "," + list.get(i2).trim();
        }
        C114746a aVar = new C114746a();
        this.f344014e = aVar;
        C118177c0.C118178a aVar2 = (C118177c0.C118178a) aVar.getReqObj();
        aVar2.mo182980c(i);
        aVar2.mo182979b(0);
        aVar2.mo182982e(currentTimeMillis);
        aVar2.mo182981d(str);
        aVar2.mo182978a(bArr);
        Log.m105918d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: cmdId=" + i + " seq=" + currentTimeMillis);
        Log.m105918d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: lstReceiver=" + str + " status = " + C90196p.m112884a(bArr));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f344013d = nVar;
        return dispatch(gVar, this.f344014e, this);
    }

    public int getType() {
        return 10;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f344013d.onSceneEnd(i2, i3, str, this);
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public C114745q(C89631w.C89636e eVar) {
        C118177c0.C118179b bVar = (C118177c0.C118179b) eVar;
        this.f344015f = bVar.f353300d;
        this.f344016g = bVar.f353301e;
    }
}

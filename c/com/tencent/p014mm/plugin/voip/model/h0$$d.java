package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import java.util.LinkedList;
import pe3.C89349b;
import s33.C101529h;
import te3.C101864x23;
import te3.np4;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.h0$$d */
public class h0$$d extends C29060q.C29061a {

    /* renamed from: d */
    public final /* synthetic */ C106350h0 f317361d;

    public h0$$d(C106350h0 h0Var) {
        this.f317361d = h0Var;
    }

    public void onNetworkChange(int i) {
        Log.m105918d("MicroMsg.Voip.VoipService", "network status change from " + i);
        C106350h0 h0Var = this.f317361d;
        if (h0Var.f317334c && i == 4) {
            C106377r rVar = h0Var.f317332a.f317396a;
            if (rVar.f317461L == 0) {
                rVar.f317461L = rVar.f317500x.f317638h;
            }
            int e = C112597j.m153940e(MMApplicationContext.getContext());
            if (e != rVar.f317461L) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + rVar.f317461L + " to " + e);
                try {
                    byte[] bArr = new byte[4];
                    bArr[0] = (byte) e;
                    int appCmd = rVar.f317500x.setAppCmd(301, bArr, 4);
                    if (appCmd < 0) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + e + "fail:" + appCmd + ", [roomid=" + rVar.f317500x.f317662p + ", roomkey=" + rVar.f317500x.f317665q + "]");
                    }
                    np4 np4 = new np4();
                    np4.f332185d = 3;
                    np4.f332186e = new C89349b(bArr, 0, 1);
                    rVar.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                } catch (Exception unused) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
                }
                rVar.f317461L = e;
            }
            C106359m0 m0Var = this.f317361d.f317332a;
            m0Var.getClass();
            LinkedList linkedList = new LinkedList();
            m0Var.f317396a.f317500x.mo152762c(linkedList);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < linkedList.size(); i4++) {
                if (((C101864x23) linkedList.get(i4)).f299815g == 5 || ((C101864x23) linkedList.get(i4)).f299815g == 6) {
                    i3++;
                }
                if (((C101864x23) linkedList.get(i4)).f299815g == 4) {
                    i2++;
                }
            }
            v2protocal v2protocal = m0Var.f317396a.f317500x;
            v2protocal.f317657n0 = m0Var.f317396a.f317500x.f317657n0 + "|redirect:" + i2 + XVFSFile.PATH_SEPARATOR + i3;
            v2protocal v2protocal2 = m0Var.f317396a.f317500x;
            C101529h hVar = new C101529h(v2protocal2.f317656n, v2protocal2.f317665q, v2protocal2.f317662p, 0, 0, (int[]) null, linkedList);
            C106401z zVar = m0Var.f317396a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317761P = System.currentTimeMillis();
            hVar.mo88544n1();
        }
    }
}

package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import te3.hs4;
import te3.is4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.g1 */
public class C105630g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f314110d;

    /* renamed from: e */
    public final /* synthetic */ String f314111e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314112f;

    public C105630g1(C105724z zVar, ArrayList arrayList, String str) {
        this.f314112f = zVar;
        this.f314110d = arrayList;
        this.f314111e = str;
    }

    public void run() {
        C105724z zVar = this.f314112f;
        ArrayList arrayList = this.f314110d;
        String str = this.f314111e;
        zVar.getClass();
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "enter inviteSync. %s, %s, %d, %b", arrayList, str, Integer.valueOf(zVar.f314401n), Boolean.valueOf(zVar.f314371V));
        if (zVar.f314401n == 1 || zVar.f314371V) {
            Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: already in room!");
            return;
        }
        zVar.f314388f.mo150552d();
        zVar.f314388f.f314256d = str;
        zVar.f314376X0 = zVar.f314362Q0;
        zVar.f314405p = new String("wechat");
        zVar.f314403o = C105724z.C85291s.ReasonUnknown;
        zVar.f314423x0 = false;
        zVar.f314379Z = false;
        zVar.f314380Z0 = C105724z.C105743t.ILinkMemberRoleCreate;
        zVar.f314371V = true;
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(((C105683r) it.next()).f314239c);
        }
        C42574q qVar = zVar.f314394i;
        String str2 = zVar.f314366S0;
        qVar.getClass();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new hs4();
        bVar.f127067b = new is4();
        bVar.f127069d = 6916;
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtcreate";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        hs4 hs4 = (hs4) a.f127055a.f127080a;
        hs4.f134865d = str2;
        hs4.f134866e = linkedList;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C105685r1(zVar));
    }
}

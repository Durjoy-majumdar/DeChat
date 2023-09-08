package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.FileUtils;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import te3.C50468mz;
import te3.at4;
import te3.bt4;
import te3.et4;
import te3.ss4;
import te3.ts4;
import te3.us4;
import te3.vs4;
import te3.ws4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.q */
public class C42574q {
    /* renamed from: a */
    public C47350c mo66667a(int i, String str, long j, String str2, String str3, String str4, LinkedList<et4> linkedList, LinkedList<C50468mz> linkedList2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ss4();
        bVar.f127067b = new ts4();
        bVar.f127069d = FileUtils.S_IRWXU;
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtinvite";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        et4 et4 = new et4();
        et4.f133116d = str3;
        et4.f133117e = str4;
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        ss4 ss4 = (ss4) a.f127055a.f127080a;
        ss4.f141726e = et4;
        ss4.f141725d = str;
        ss4.f141728g = str2;
        ss4.f141727f = j;
        LinkedList<us4> linkedList3 = new LinkedList<>();
        Iterator<C50468mz> it = linkedList2.iterator();
        while (it.hasNext()) {
            C50468mz next = it.next();
            us4 us4 = new us4();
            us4.f143112e = next.f138290e;
            Iterator<et4> it4 = linkedList.iterator();
            while (it4.hasNext()) {
                et4 next2 = it4.next();
                if (next.f138289d.equals(next2.f133117e)) {
                    us4.f143111d = next2;
                }
            }
            linkedList3.add(us4);
        }
        Log.m105925i("MicroMsg.Multitalk.ILinkCGIImp", "invite member cnt:%d", Integer.valueOf(linkedList3.size()));
        ss4.f141729h = linkedList3;
        ss4.f141730i = linkedList;
        return a;
    }

    /* renamed from: b */
    public C47350c mo66668b(int i, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vs4();
        bVar.f127067b = new ws4();
        bVar.f127069d = 6931;
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtjoin";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        vs4 vs4 = (vs4) a.f127055a.f127080a;
        vs4.f143682d = str;
        vs4.f143683e = str2;
        return a;
    }

    /* renamed from: c */
    public C47350c mo66669c(int i, String str, String str2, long j, String str3, String str4, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new at4();
        bVar.f127067b = new bt4();
        bVar.f127069d = 10283;
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtscreensharingsecuritycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        et4 et4 = new et4();
        et4.f133116d = str3;
        et4.f133117e = str4;
        C47350c a = bVar.mo72403a();
        at4 at4 = (at4) a.f127055a.f127080a;
        at4.f130766e = et4;
        at4.f130765d = str;
        at4.f130768g = str2;
        at4.f130767f = j;
        at4.f130769h = str5;
        return a;
    }
}

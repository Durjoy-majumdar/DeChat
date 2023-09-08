package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fd3.C97867h;
import fd3.C97872k;
import ic3.C27512d;
import java.util.Map;
import ob0.C11385n;
import ob0.C89137b0;
import p1081gi.C98121d;
import p494dp.C97505b;
import p663qo.C101211h;
import xc3.C102616b;
import xc3.C102617c;
import zt3.C119157j;

public class v$$b implements C97867h.C97868a {

    /* renamed from: a */
    public final /* synthetic */ C98435v f288716a;

    /* renamed from: hd0.v$$b$a */
    public class C98436a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f288717d;

        public C98436a(String str) {
            this.f288717d = str;
        }

        public void run() {
            if (!v$$b.this.f288716a.mo137767k1(this.f288717d).equals(this.f288717d)) {
                C86013q1.m106447h(v$$b.this.f288716a.mo137767k1(this.f288717d));
                Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "delete thumbPath %s", this.f288717d);
            }
        }
    }

    public v$$b(C98435v vVar) {
        this.f288716a = vVar;
    }

    /* renamed from: a */
    public void mo127086a(int i, String str) {
        Log.m105921e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, errCode:%s, uploadID:%s", Integer.valueOf(i), str);
        Log.m105921e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, uploadId:%s", str);
        C98429r0.m127799E(this.f288716a.f288700f);
        C98435v vVar = this.f288716a;
        vVar.f288698d.onSceneEnd(3, i, "", vVar);
    }

    /* renamed from: b */
    public void mo127087b(C97872k.C97873a aVar) {
        C98432t tVar;
        C98121d dVar;
        C97872k.C97873a aVar2 = aVar;
        Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", aVar2.f287110b, aVar2.f287109a, Long.valueOf(aVar2.f287112d));
        C98121d dVar2 = new C98121d();
        dVar2.field_aesKey = aVar2.f287110b;
        dVar2.field_fileId = aVar2.f287109a;
        dVar2.field_filemd5 = aVar2.f287111c;
        dVar2.field_fileLength = aVar2.f287112d;
        String q = C98398h0.Bx0().mo137728q(this.f288716a.f288700f);
        String r = C98398h0.Bx0().mo137729r(this.f288716a.f288700f);
        dVar2.field_thumbimgLength = (int) C86013q1.m106451l(this.f288716a.mo137767k1(r));
        dVar2.field_filecrc = ((C101211h) C86312j.m106911c(C101211h.class)).mo140288dC(q);
        dVar2.field_toUser = this.f288716a.f288705n.mo137707k();
        ((C119157j) C119157j.f356862d).mo183875f(new C98436a(r));
        C98435v vVar = this.f288716a;
        vVar.f288705n = C98429r0.m127818i(vVar.f288700f);
        if (Util.isNullOrNil(this.f288716a.f288705n.mo137705i())) {
            String str = ((((("<msg><videomsg aeskey=\"" + dVar2.field_aesKey + "\" cdnthumbaeskey=\"" + dVar2.field_aesKey + "\" cdnvideourl=\"" + dVar2.field_fileId + "\" ") + "cdnthumburl=\"" + dVar2.field_fileId + "\" ") + "length=\"" + dVar2.field_fileLength + "\" ") + "cdnthumblength=\"" + dVar2.field_thumbimgLength + "\"/>") + Util.nullAs(this.f288716a.f288705n.f288543K, "")) + "</msg>";
            Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cgi callback new build cgiInfo:%s", this.f288716a.mo137769m1(), str);
            C98408n0 n0Var = this.f288716a.f288705n;
            n0Var.f288575v = str;
            C98429r0.m127808N(n0Var);
        }
        C98435v vVar2 = this.f288716a;
        if (vVar2.f288707p != null) {
            String i = vVar2.f288705n.mo137705i();
            if (!Util.isNullOrNil(i)) {
                C98442x0 b = C98442x0.f288734i.mo137781b(i);
                int indexOf = i.indexOf("/>");
                if (indexOf != -1 && (b == null || Util.isNullOrNil(b.f288740d))) {
                    String str2 = ((((i.substring(0, indexOf) + "cdnrawvideourl=\"" + dVar2.field_fileId + "\" ") + "cdnrawvideoaeskey=\"" + dVar2.field_aesKey + "\" ") + "rawlength=\"" + dVar2.field_fileLength + "\"/>") + Util.nullAs(this.f288716a.f288705n.f288543K, "")) + "</msg>";
                    Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cgi origin file callback  reBuild cgiInfo:%s", this.f288716a.mo137769m1(), str2);
                    C98408n0 n0Var2 = this.f288716a.f288705n;
                    n0Var2.f288575v = str2;
                    C98429r0.m127808N(n0Var2);
                }
            }
        }
        Map<String, String> parseXml = XmlParser.parseXml(this.f288716a.f288705n.mo137705i(), "msg", (String) null);
        if (parseXml != null) {
            C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(this.f288716a.f288700f), parseXml.get(".msg.videomsg.$cdnvideourl"), parseXml.get(".msg.videomsg.$aeskey"));
            if (this.f288716a.f288707p != null) {
                C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(this.f288716a.f288706o), parseXml.get(".msg.videomsg.$cdnrawvideourl"), parseXml.get(".msg.videomsg.$cdnrawvideoaeskey"));
            }
        }
        if (Util.isNullOrNil(this.f288716a.f288706o)) {
            C98435v vVar3 = this.f288716a;
            String str3 = vVar3.f288705n.f288546N;
            vVar3.f288706o = str3;
            if (!Util.isNullOrNil(str3)) {
                C98435v vVar4 = this.f288716a;
                vVar4.f288707p = C98429r0.m127818i(vVar4.f288706o);
                C98435v vVar5 = this.f288716a;
                C98408n0 n0Var3 = vVar5.f288707p;
                if (n0Var3 != null) {
                    vVar5.f288708q = dVar2;
                    if (n0Var3 != null) {
                        String q2 = C98398h0.Bx0().mo137728q(vVar5.f288706o);
                        C97867h hVar = new C97867h();
                        hVar.f287089h = vVar5.f288705n.f288567n;
                        hVar.f287084c = vVar5.f288710s;
                        hVar.f287083b = 2;
                        hVar.f287082a = 4;
                        hVar.f287085d = q2;
                        C102616b L50 = ((C102617c) C86312j.m106911c(C102617c.class)).L50();
                        vVar5.f288709r = L50;
                        L50.mo137188a(true);
                        vVar5.f288709r.mo137189b(hVar);
                        Log.m105918d("MicroMsg.NetSceneUploadVideoOriginCgi", "uploadOriginVideo file path = " + q2);
                        return;
                    }
                    return;
                }
            }
        }
        C98435v vVar6 = this.f288716a;
        C98408n0 n0Var4 = vVar6.f288705n;
        if (n0Var4.f288576w == 4) {
            vVar6.f288703i = dVar2;
            if (n0Var4 == null) {
                Log.m105928w("MicroMsg.NetSceneUploadVideoOriginCgi", "onlyDoUpload, video info is null !");
            } else {
                C98121d dVar3 = vVar6.f288708q;
                if (dVar3 != null) {
                    dVar = dVar2;
                    dVar2 = dVar3;
                } else {
                    dVar = null;
                }
                C27512d dVar4 = new C27512d();
                dVar4.mo141099d(n0Var4.mo137705i());
                if (!dVar2.mo137409b() || !Util.isNullOrNil(dVar2.field_aesKey)) {
                    vVar6.mo137768l1(n0Var4, dVar2, dVar);
                } else {
                    Log.m105924i("MicroMsg.NetSceneUploadVideoOriginCgi", "onlyDoUpload, upload by cdn hit md5, do md5 check");
                    ((C97505b) C86312j.m106911c(C97505b.class)).mo136779zN(dVar2.field_fileId, dVar2.field_filemd5, dVar2.field_mp4identifymd5, dVar2.field_filecrc, new v$$a(vVar6, dVar4, n0Var4, dVar2, dVar));
                }
            }
            C98435v vVar7 = this.f288716a;
            vVar7.f288698d.onSceneEnd(0, 0, "", vVar7);
            if (!C98429r0.m127831v() || this.f288716a.f288702h == null) {
                this.f288716a.f288704j.mo127120a(0, 0);
                return;
            }
            return;
        }
        C89137b0 d = C86709a0.m107524d();
        C98435v vVar8 = this.f288716a;
        if (vVar8.f288708q == null) {
            tVar = new C98432t(vVar8.f288700f, vVar8.f288702h, C98435v.m127850j1(vVar8), dVar2, this.f288716a.f288704j);
        } else {
            String str4 = vVar8.f288700f;
            String str5 = vVar8.f288702h;
            int j1 = C98435v.m127850j1(vVar8);
            C98435v vVar9 = this.f288716a;
            tVar = new C98432t(str4, str5, j1, vVar9.f288708q, dVar2, vVar9.f288704j);
        }
        d.mo123460f(tVar);
    }

    /* renamed from: c */
    public void mo127088c(float f, long j) {
        C98435v vVar = this.f288716a;
        vVar.f288705n = C98429r0.m127818i(vVar.f288700f);
        C98435v vVar2 = this.f288716a;
        C98408n0 n0Var = vVar2.f288705n;
        if (n0Var == null || n0Var.f288562i == 105) {
            int i = n0Var == null ? -1 : n0Var.f288562i;
            Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s info is null or has paused, status:%d", vVar2.mo137769m1(), Integer.valueOf(i));
            C102616b bVar = this.f288716a.f288709r;
            if (bVar != null) {
                bVar.mo137190c();
            }
            C11385n nVar = this.f288716a.f288698d;
            nVar.onSceneEnd(3, 0, "info is null or has paused, status" + i, this.f288716a);
            this.f288716a.f288704j.mo127120a(3, 0);
            return;
        }
        C98408n0 n0Var2 = vVar2.f288707p;
        if (n0Var2 != null) {
            if (((long) n0Var2.f288557d) > j) {
                Log.m105929w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra originFileInfo cdnEndProc error oldpos:%d newpos:%d", vVar2.mo137769m1(), Integer.valueOf(this.f288716a.f288707p.f288557d), Long.valueOf(j));
                return;
            }
            n0Var2.f288564k = Util.nowSecond();
            C98408n0 n0Var3 = this.f288716a.f288707p;
            n0Var3.f288557d = (int) j;
            n0Var3.f288548P = 1032;
            C98429r0.m127808N(n0Var3);
        } else if (((long) n0Var.f288557d) > j) {
            Log.m105929w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", vVar2.mo137769m1(), Integer.valueOf(this.f288716a.f288705n.f288557d), Long.valueOf(j));
        } else {
            n0Var.f288564k = Util.nowSecond();
            C98408n0 n0Var4 = this.f288716a.f288705n;
            n0Var4.f288557d = (int) j;
            n0Var4.f288548P = 1032;
            C98429r0.m127808N(n0Var4);
        }
    }
}

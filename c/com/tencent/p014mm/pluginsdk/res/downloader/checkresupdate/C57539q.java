package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.network.C114799u;
import ob0.C117746w;
import qe3.C101127f;
import qe3.C47808e0;
import qe3.C62603d0;
import qe3.C89631w;
import te3.C51297su;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.q */
public class C57539q extends C115894p {

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.q$a */
    public static class C57540a extends C117746w {

        /* renamed from: a */
        public final C62603d0 f164782a = new C62603d0();

        /* renamed from: b */
        public final C47808e0 f164783b = new C47808e0();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f164782a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f164783b;
        }

        public int getType() {
            return C101127f.f296015a ? 784 : 722;
        }

        public String getUri() {
            return C101127f.f296015a ? "/cgi-bin/micromsg-bin/secencryptcheckresupdate" : "/cgi-bin/micromsg-bin/encryptcheckresupdate";
        }
    }

    public int getType() {
        return C101127f.f296015a ? 784 : 722;
    }

    /* renamed from: j1 */
    public C114799u mo81281j1() {
        C57540a aVar = new C57540a();
        C62603d0 d0Var = aVar.f164782a;
        d0Var.setUin(0);
        d0Var.f177796a.f186064e.f185852d.f185293d.addAll(this.f347755e);
        return aVar;
    }

    /* renamed from: k1 */
    public String mo81282k1() {
        return "MicroMsg.NetSceneEncryptCheckResUpdate";
    }

    /* renamed from: l1 */
    public C51297su mo81283l1(C114799u uVar) {
        return ((C57540a) uVar).f164783b.f128366a;
    }
}

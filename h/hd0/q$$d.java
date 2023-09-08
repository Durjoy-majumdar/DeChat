package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fd3.C97867h;
import fd3.C97872k;
import java.util.Map;
import ob0.C89137b0;
import p1081gi.C98121d;
import p663qo.C101211h;
import zt3.C119157j;

public class q$$d implements C97867h.C97868a {

    /* renamed from: a */
    public final /* synthetic */ C98415q f288650a;

    /* renamed from: hd0.q$$d$a */
    public class C98421a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f288651d;

        public C98421a(String str) {
            this.f288651d = str;
        }

        public void run() {
            if (!q$$d.this.f288650a.mo137746m1(this.f288651d).equals(this.f288651d)) {
                C86013q1.m106447h(q$$d.this.f288650a.mo137746m1(this.f288651d));
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", this.f288651d);
            }
        }
    }

    /* renamed from: hd0.q$$d$b */
    public class C98422b implements C92834j {

        /* renamed from: a */
        public final /* synthetic */ C98408n0 f288653a;

        /* renamed from: hd0.q$$d$b$a */
        public class C98423a implements Runnable {
            public C98423a() {
            }

            public void run() {
                C98422b bVar = C98422b.this;
                q$$d.this.f288650a.f288627q = false;
                C98408n0 n0Var = bVar.f288653a;
                n0Var.f288562i = 104;
                n0Var.f288563j = Util.nowSecond();
                C98422b.this.f288653a.f288564k = Util.nowSecond();
                C98408n0 n0Var2 = C98422b.this.f288653a;
                n0Var2.f288557d = 0;
                n0Var2.f288548P = 1800;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", q$$d.this.f288650a.mo137749p1(), Boolean.valueOf(q$$d.this.f288650a.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(C98422b.this.f288653a.f288563j));
                C98415q qVar = q$$d.this.f288650a;
                qVar.doScene(qVar.dispatcher(), q$$d.this.f288650a.f288617d);
            }
        }

        public C98422b(C98408n0 n0Var) {
            this.f288653a = n0Var;
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            if (i == 4 && i2 == 102) {
                C86709a0.m107525e().postToWorker(new C98423a());
                return;
            }
            C98415q qVar = q$$d.this.f288650a;
            qVar.f288617d.onSceneEnd(i, i2, "", qVar);
        }
    }

    public q$$d(C98415q qVar) {
        this.f288650a = qVar;
    }

    /* renamed from: a */
    public void mo127086a(int i, String str) {
        Log.m105921e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", Integer.valueOf(i), str);
        C98429r0.m127799E(this.f288650a.f288619f);
        C98415q qVar = this.f288650a;
        qVar.f288617d.onSceneEnd(3, i, "", qVar);
    }

    /* renamed from: b */
    public void mo127087b(C97872k.C97873a aVar) {
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", aVar.f287110b, aVar.f287109a, Long.valueOf(aVar.f287112d));
        Util.nowMilliSecond();
        long j = this.f288650a.f288629s;
        C98121d dVar = new C98121d();
        dVar.field_aesKey = aVar.f287110b;
        dVar.field_fileId = aVar.f287109a;
        dVar.field_filemd5 = aVar.f287111c;
        dVar.field_fileLength = aVar.f287112d;
        String q = C98398h0.Bx0().mo137728q(this.f288650a.f288619f);
        String r = C98398h0.Bx0().mo137729r(this.f288650a.f288619f);
        dVar.field_thumbimgLength = (int) C86013q1.m106451l(this.f288650a.mo137746m1(r));
        dVar.field_filecrc = ((C101211h) C86312j.m106911c(C101211h.class)).mo140288dC(q);
        dVar.field_toUser = this.f288650a.f288624n.mo137707k();
        ((C119157j) C119157j.f356862d).mo183875f(new C98421a(r));
        C98408n0 i = C98429r0.m127818i(this.f288650a.f288619f);
        if (Util.isNullOrNil(i.mo137705i())) {
            String str = ((((("<msg><videomsg aeskey=\"" + dVar.field_aesKey + "\" cdnthumbaeskey=\"" + dVar.field_aesKey + "\" cdnvideourl=\"" + dVar.field_fileId + "\" ") + "cdnthumburl=\"" + dVar.field_fileId + "\" ") + "length=\"" + dVar.field_fileLength + "\" ") + "cdnthumblength=\"" + dVar.field_thumbimgLength + "\"/>") + Util.nullAs(i.f288543K, "")) + "</msg>";
            Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", this.f288650a.mo137749p1(), str);
            i.f288575v = str;
            C98429r0.m127808N(i);
        }
        Map<String, String> parseXml = XmlParser.parseXml(i.mo137705i(), "msg", (String) null);
        if (parseXml != null) {
            C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(this.f288650a.f288619f), parseXml.get(".msg.videomsg.$cdnvideourl"), parseXml.get(".msg.videomsg.$aeskey"));
        }
        if (i.f288576w == 4) {
            C98415q.m127767j1(this.f288650a, dVar);
            C98415q qVar = this.f288650a;
            qVar.f288617d.onSceneEnd(0, 0, "", qVar);
            this.f288650a.mo137748o1(dVar);
            return;
        }
        C89137b0 d = C86709a0.m107524d();
        C98415q qVar2 = this.f288650a;
        d.mo123460f(new C98432t(qVar2.f288619f, qVar2.mo137744k1(), dVar, new C98422b(i)));
    }

    /* renamed from: c */
    public void mo127088c(float f, long j) {
        C98408n0 i = C98429r0.m127818i(this.f288650a.f288619f);
        if (i == null) {
            Log.m105921e("MicroMsg.NetSceneUploadVideo", "%s info is null", this.f288650a.mo137749p1());
        } else if (((long) i.f288557d) > j) {
            Log.m105929w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", this.f288650a.mo137749p1(), Integer.valueOf(i.f288557d), Long.valueOf(j));
        } else {
            i.f288564k = Util.nowSecond();
            i.f288557d = (int) j;
            i.f288548P = 1032;
            C98429r0.m127808N(i);
        }
    }
}

package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fd3.C97867h;
import fd3.C97872k;
import ob0.C89137b0;
import p1081gi.C98121d;
import zt3.C119157j;

public class q$$b implements C97867h.C97868a {

    /* renamed from: a */
    public final /* synthetic */ C98415q f288641a;

    /* renamed from: hd0.q$$b$a */
    public class C98416a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f288642d;

        public C98416a(String str) {
            this.f288642d = str;
        }

        public void run() {
            if (!q$$b.this.f288641a.mo137746m1(this.f288642d).equals(this.f288642d)) {
                C86013q1.m106447h(q$$b.this.f288641a.mo137746m1(this.f288642d));
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", this.f288642d);
            }
        }
    }

    /* renamed from: hd0.q$$b$b */
    public class C98417b implements C92834j {

        /* renamed from: hd0.q$$b$b$a */
        public class C98418a implements Runnable {
            public C98418a() {
            }

            public void run() {
                C98415q qVar = q$$b.this.f288641a;
                qVar.f288627q = false;
                C98408n0 n0Var = qVar.f288624n;
                n0Var.f288562i = 104;
                n0Var.f288563j = Util.nowSecond();
                q$$b.this.f288641a.f288624n.f288564k = Util.nowSecond();
                C98408n0 n0Var2 = q$$b.this.f288641a.f288624n;
                n0Var2.f288557d = 0;
                n0Var2.f288548P = 1800;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", q$$b.this.f288641a.mo137749p1(), Boolean.valueOf(q$$b.this.f288641a.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(q$$b.this.f288641a.f288624n.f288563j));
                C98415q qVar2 = q$$b.this.f288641a;
                qVar2.doScene(qVar2.dispatcher(), q$$b.this.f288641a.f288617d);
            }
        }

        public C98417b() {
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            if (i == 4 && i2 == 102) {
                C86709a0.m107525e().postToWorker(new C98418a());
                return;
            }
            C98415q qVar = q$$b.this.f288641a;
            qVar.f288617d.onSceneEnd(i, i2, "", qVar);
        }
    }

    public q$$b(C98415q qVar) {
        this.f288641a = qVar;
    }

    /* renamed from: a */
    public void mo127086a(int i, String str) {
        Log.m105921e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", Integer.valueOf(i), str);
        C98429r0.m127799E(this.f288641a.f288619f);
        C98415q qVar = this.f288641a;
        qVar.f288617d.onSceneEnd(3, i, "", qVar);
    }

    /* renamed from: b */
    public void mo127087b(C97872k.C97873a aVar) {
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", aVar.f287110b, aVar.f287109a, Long.valueOf(aVar.f287112d));
        C98121d dVar = new C98121d();
        dVar.field_aesKey = aVar.f287110b;
        dVar.field_fileId = aVar.f287109a;
        dVar.field_filemd5 = aVar.f287111c;
        dVar.field_fileLength = aVar.f287112d;
        String r = C98398h0.Bx0().mo137729r(this.f288641a.f288619f);
        dVar.field_thumbimgLength = (int) C86013q1.m106451l(this.f288641a.mo137746m1(r));
        dVar.field_toUser = this.f288641a.f288624n.mo137707k();
        ((C119157j) C119157j.f356862d).mo183875f(new C98416a(r));
        C89137b0 d = C86709a0.m107524d();
        C98415q qVar = this.f288641a;
        d.mo123460f(new C98435v(qVar.f288619f, qVar.mo137744k1(), dVar, new C98417b()));
    }

    /* renamed from: c */
    public void mo127088c(float f, long j) {
    }
}

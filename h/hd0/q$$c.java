package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ig3.C98690l;
import ig3.C98692n;
import java.io.ByteArrayOutputStream;
import ob0.C11385n;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p206nj.C76861g;
import p663qo.C101213l;
import zt3.C119157j;

public class q$$c implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C98415q f288646d;

    /* renamed from: hd0.q$$c$a */
    public class C98419a implements C92834j {

        /* renamed from: a */
        public final /* synthetic */ C98121d f288647a;

        /* renamed from: hd0.q$$c$a$a */
        public class C98420a implements Runnable {
            public C98420a() {
            }

            public void run() {
                C98415q qVar = q$$c.this.f288646d;
                qVar.f288627q = false;
                C98408n0 n0Var = qVar.f288624n;
                n0Var.f288562i = 104;
                n0Var.f288563j = Util.nowSecond();
                q$$c.this.f288646d.f288624n.f288564k = Util.nowSecond();
                C98408n0 n0Var2 = q$$c.this.f288646d.f288624n;
                n0Var2.f288557d = 0;
                n0Var2.f288548P = 1800;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", q$$c.this.f288646d.mo137749p1(), Boolean.valueOf(q$$c.this.f288646d.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(q$$c.this.f288646d.f288624n.f288563j));
                C98415q qVar2 = q$$c.this.f288646d;
                qVar2.doScene(qVar2.dispatcher(), q$$c.this.f288646d.f288617d);
            }
        }

        public C98419a(C98121d dVar) {
            this.f288647a = dVar;
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            if (i == 4 && i2 == 102) {
                C86709a0.m107525e().postToWorker(new C98420a());
                return;
            }
            C98384a.m127689a(q$$c.this.f288646d.f288624n, 0);
            q$$c.this.f288646d.mo137748o1(this.f288647a);
            C98415q qVar = q$$c.this.f288646d;
            qVar.f288624n = C98429r0.m127818i(qVar.f288619f);
            C98415q qVar2 = q$$c.this.f288646d;
            C98408n0 n0Var = qVar2.f288624n;
            if (n0Var != null && n0Var.f288562i == 105) {
                qVar2.f288622i = 0 - (C76861g.m92658a() + 10000);
            }
            C98415q qVar3 = q$$c.this.f288646d;
            qVar3.f288617d.onSceneEnd(i, i2, "", qVar3);
        }
    }

    public q$$c(C98415q qVar) {
        this.f288646d = qVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        int i2;
        int i3;
        int i4 = i;
        C98121d dVar2 = dVar;
        Log.m105919d("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", this.f288646d.mo137749p1(), str, Integer.valueOf(i), cVar, dVar2);
        if (i4 == -21005) {
            Log.m105919d("MicroMsg.NetSceneUploadVideo", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", str);
            return 0;
        } else if (i4 != 0) {
            C98429r0.m127799E(this.f288646d.f288619f);
            C98692n.f289404a.mo138104e((String) null, this.f288646d.f288619f, 3, 0, 0, 0, 0, false, i);
            C98415q qVar = this.f288646d;
            qVar.f288617d.onSceneEnd(3, i4, "", qVar);
            return 0;
        } else {
            String str2 = "";
            C98415q qVar2 = this.f288646d;
            qVar2.f288624n = C98429r0.m127818i(qVar2.f288619f);
            C98415q qVar3 = this.f288646d;
            C98408n0 n0Var = qVar3.f288624n;
            if (n0Var == null || n0Var.f288562i == 105) {
                int i5 = n0Var == null ? -1 : n0Var.f288562i;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", qVar3.mo137749p1(), Integer.valueOf(i5));
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(this.f288646d.f288628r);
                C98415q qVar4 = this.f288646d;
                if (qVar4.f288624n != null) {
                    C98692n nVar = C98692n.f289404a;
                    String str3 = qVar4.f288619f;
                    if (str3 != null) {
                        ((C119157j) C119157j.f356862d).mo183884o(new C98690l(str3));
                    }
                    i2 = i5;
                    i3 = 0;
                } else {
                    i2 = i5;
                    i3 = 0;
                    C98692n.f289404a.mo138104e((String) null, qVar4.f288619f, 5, 0, 0, 0, 0, false, i);
                }
                C11385n nVar2 = this.f288646d.f288617d;
                nVar2.onSceneEnd(3, i4, "info is null or has paused, status" + i2, this.f288646d);
                return i3;
            }
            if (dVar2 != null) {
                if (dVar2.field_retCode != 0) {
                    Log.m105921e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", qVar3.mo137749p1(), Integer.valueOf(dVar2.field_retCode), dVar2.field_arg, dVar2.field_transInfo);
                    C98429r0.m127799E(this.f288646d.f288619f);
                    C98692n.f289404a.mo138104e((String) null, this.f288646d.f288619f, 3, 0, 0, 0, 0, false, dVar2.field_retCode);
                    C98415q qVar5 = this.f288646d;
                    qVar5.f288617d.onSceneEnd(3, dVar2.field_retCode, str2, qVar5);
                } else {
                    C92855q0 f = C92855q0.m117113f();
                    C98415q qVar6 = this.f288646d;
                    f.f267460C = qVar6.f288619f;
                    f.f267461D = 0;
                    f.f267462E = dVar2;
                    f.f267466I = qVar6.f288627q;
                    f.f267463F = new C98419a(dVar2);
                    f.f295194h = 20;
                    f.mo140195a().mo123694a();
                }
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}

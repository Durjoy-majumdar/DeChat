package k33;

import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45617o3;
import eb0.C45622p3;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import te3.C50808pb2;
import te3.C51739vt3;

/* renamed from: k33.h */
public class C46648h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125590d;

    /* renamed from: e */
    public final C114799u f125591e;

    /* renamed from: f */
    public String f125592f = "";

    /* renamed from: g */
    public int f125593g = 0;

    /* renamed from: h */
    public String f125594h = "";

    /* renamed from: k33.h$a */
    public class C46649a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f125595d;

        /* renamed from: k33.h$a$a */
        public class C46650a implements C11385n {
            public C46650a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C46648h hVar = C46648h.this;
                    hVar.doScene(hVar.dispatcher(), C46648h.this.f125590d);
                    return;
                }
                C46648h hVar2 = C46648h.this;
                hVar2.f125590d.onSceneEnd(i, i2, "", hVar2);
            }
        }

        public C46649a(int i) {
            this.f125595d = i;
        }

        public void run() {
            new C40371t(this.f125595d).doScene(C46648h.this.dispatcher(), new C46650a());
        }
    }

    public C46648h(int i, String str) {
        C46642b bVar = new C46642b();
        this.f125591e = bVar;
        Log.m105925i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", Integer.valueOf(i), str);
        C50808pb2 pb22 = ((C45617o3) bVar.getReqObj()).f123383a;
        pb22.f139691d = i;
        pb22.f139692e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125590d = nVar;
        return dispatch(gVar, this.f125591e, this);
    }

    public int getType() {
        return 616;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRsaGetVoicePrintResource", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C45622p3 p3Var = (C45622p3) uVar.getRespObj();
        if (i2 == 4 && i3 == -102) {
            int i4 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i4));
            C86709a0.m107525e().postToWorker(new C46649a(i4));
        } else if (i2 == 0 || i3 == 0) {
            C51739vt3 vt32 = p3Var.f123388a.f140235d;
            if (vt32 != null) {
                this.f125592f = new String(vt32.f143693e.f140574f.f257327a);
                int i5 = p3Var.f123388a.f140235d.f143692d;
                this.f125593g = i5;
                Log.m105919d("MicroMsg.NetSceneRsaGetVoicePrintResource", "resid %d mVertifyKey %s mtext %s", Integer.valueOf(i5), this.f125594h, this.f125592f);
            } else {
                Log.m105920e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
            }
            this.f125590d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f125590d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}

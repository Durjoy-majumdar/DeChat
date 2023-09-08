package k33;

import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C116746l3;
import eb0.C45624q3;
import eb0.C45627r3;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import te3.C51373tb2;
import te3.C51522ub2;

/* renamed from: k33.f */
public class C46645f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125583d;

    /* renamed from: e */
    public final C114799u f125584e;

    /* renamed from: f */
    public String f125585f = "";

    /* renamed from: g */
    public int f125586g = 2;

    /* renamed from: k33.f$a */
    public class C46646a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f125587d;

        /* renamed from: k33.f$a$a */
        public class C46647a implements C11385n {
            public C46647a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C46645f fVar = C46645f.this;
                    fVar.doScene(fVar.dispatcher(), C46645f.this.f125583d);
                    return;
                }
                C46645f fVar2 = C46645f.this;
                fVar2.f125583d.onSceneEnd(i, i2, "", fVar2);
            }
        }

        public C46646a(int i) {
            this.f125587d = i;
        }

        public void run() {
            new C40371t(this.f125587d).doScene(C46645f.this.dispatcher(), new C46647a());
        }
    }

    public C46645f(int i, String str) {
        C46643c cVar = new C46643c();
        this.f125584e = cVar;
        C51373tb2 tb22 = ((C45624q3) cVar.getReqObj()).f123391a;
        tb22.f142100d = str;
        tb22.f142101e = i;
        Log.m105925i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", Integer.valueOf(i), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125583d = nVar;
        return dispatch(gVar, this.f125584e, this);
    }

    public int getType() {
        return C1884v4.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C45627r3 r3Var = (C45627r3) uVar.getRespObj();
        this.f125585f = r3Var.f123394a.f142721d;
        Log.m105918d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " mTicket: " + this.f125585f);
        if (i2 == 4 && i3 == -301) {
            C51522ub2 ub22 = r3Var.f123394a;
            C116746l3.m164676c(true, ub22.f142722e, ub22.f142724g, ub22.f142723f, true, 0);
            int i4 = this.f125586g - 1;
            this.f125586g = i4;
            if (i4 <= 0) {
                Log.m105918d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "reach redirect limit, invoke callback");
                this.f125583d.onSceneEnd(3, -1, "", this);
                return;
            }
            Log.m105918d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "redirect IDC");
            doScene(dispatcher(), this.f125583d);
        } else if (i2 == 4 && i3 == -102) {
            int i5 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i5));
            C86709a0.m107525e().postToWorker(new C46646a(i5));
        } else if (i2 == 0 || i3 == 0) {
            this.f125583d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f125583d.onSceneEnd(i2, i3, str, this);
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

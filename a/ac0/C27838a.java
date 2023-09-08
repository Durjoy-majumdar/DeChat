package ac0;

import android.os.Message;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C97625j3;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;

/* renamed from: ac0.a */
public class C27838a extends C117747y implements C1311n {

    /* renamed from: d */
    public C72963f4 f76953d;

    /* renamed from: e */
    public C11385n f76954e;

    /* renamed from: f */
    public MMHandler f76955f = new C27839a();

    /* renamed from: ac0.a$a */
    public class C27839a extends MMHandler {
        public C27839a() {
        }

        public void handleMessage(Message message) {
            C27838a.this.onGYNetEnd(999, 0, 0, "", (C114799u) null, (byte[]) null);
        }
    }

    public C27838a(String str, String str2, String str3) {
        C72963f4 f4Var = new C72963f4();
        this.f76953d = f4Var;
        boolean z = true;
        f4Var.mo100991d(1);
        this.f76953d.mo108749c3(str2);
        this.f76953d.mo108733M2(C75604z3.m90843o(str2));
        this.f76953d.mo108740T2(1);
        this.f76953d.mo108732L2(str3);
        this.f76953d.setType(C45628s0.m50810y(str2));
        long my02 = ((C72972g4) C97625j3.m125812b().mo105911z()).my0(this.f76953d);
        Assert.assertTrue(my02 == -1 ? false : z);
        Log.m105924i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = " + my02);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f76954e = nVar;
        Log.m105924i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.f76953d.getMsgId());
        this.f76955f.sendEmptyMessageDelayed(0, 500);
        return 999;
    }

    public int getType() {
        return 522;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneSendMsgFake", "recv local msg, msgId = " + this.f76953d.getMsgId());
        this.f76953d.mo100991d(2);
        C72963f4 f4Var = this.f76953d;
        f4Var.mo108733M2(C75604z3.m90841m(f4Var.mo108768t(), System.currentTimeMillis() / 1000));
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f76953d.getMsgId(), this.f76953d);
        this.f76954e.onSceneEnd(0, 0, str, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}

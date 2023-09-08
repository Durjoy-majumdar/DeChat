package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.pluginsdk.model.app.C96766k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: com.tencent.mm.pluginsdk.model.app.o1 */
public class C96771o1 implements C96766k1.C96767a {

    /* renamed from: a */
    public final /* synthetic */ NetSceneUploadAppAttach f283503a;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.o1$a */
    public class C96772a implements Runnable {
        public C96772a() {
        }

        public void run() {
            NetSceneUploadAppAttach netSceneUploadAppAttach = C96771o1.this.f283503a;
            netSceneUploadAppAttach.f283447o = false;
            netSceneUploadAppAttach.f283441f.field_createTime = Util.nowMilliSecond();
            C96771o1.this.f283503a.f283441f.field_lastModifyTime = Util.nowSecond();
            C72683d dVar = C96771o1.this.f283503a.f283441f;
            dVar.field_offset = 0;
            dVar.field_status = 101;
            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", Boolean.valueOf(C96771o1.this.f283503a.f283447o), Boolean.valueOf(C72709y1.vx0().update(C96771o1.this.f283503a.f283441f, new String[0])), Long.valueOf(C96771o1.this.f283503a.f283441f.field_createTime));
            NetSceneUploadAppAttach netSceneUploadAppAttach2 = C96771o1.this.f283503a;
            netSceneUploadAppAttach2.doScene(netSceneUploadAppAttach2.dispatcher(), C96771o1.this.f283503a.f283440e);
        }
    }

    public C96771o1(NetSceneUploadAppAttach netSceneUploadAppAttach) {
        this.f283503a = netSceneUploadAppAttach;
    }

    /* renamed from: a */
    public void mo135032a(int i, int i2) {
        Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 4 && i2 == 102) {
            C86709a0.m107525e().postToWorker(new C96772a());
            return;
        }
        NetSceneUploadAppAttach netSceneUploadAppAttach = this.f283503a;
        netSceneUploadAppAttach.f283440e.onSceneEnd(i, i2, "", netSceneUploadAppAttach);
    }
}

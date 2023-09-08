package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C96766k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.pluginsdk.model.app.m1 */
public class C96768m1 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C98121d f283499d;

    /* renamed from: e */
    public final /* synthetic */ NetSceneUploadAppAttach f283500e;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.m1$a */
    public class C96769a implements C96766k1.C96767a {
        public C96769a() {
        }

        /* renamed from: a */
        public void mo135032a(int i, int i2) {
            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (!(i == 0 && i2 == 0)) {
                C72695v.m85055H(C96768m1.this.f283500e.f283441f.systemRowid);
            }
            NetSceneUploadAppAttach netSceneUploadAppAttach = C96768m1.this.f283500e;
            netSceneUploadAppAttach.f283440e.onSceneEnd(i, i2, "", netSceneUploadAppAttach);
        }
    }

    public C96768m1(NetSceneUploadAppAttach netSceneUploadAppAttach, C98121d dVar) {
        this.f283500e = netSceneUploadAppAttach;
        this.f283499d = dVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "cdn callback: %s, %s", str, Integer.valueOf(i));
        if (i != 0) {
            C72695v.m85055H(this.f283500e.f283441f.systemRowid);
            NetSceneUploadAppAttach netSceneUploadAppAttach = this.f283500e;
            netSceneUploadAppAttach.f283440e.onSceneEnd(3, i, "", netSceneUploadAppAttach);
            return 0;
        }
        if (cVar != null) {
            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "cdn callback progress: %s, %s, %s", Integer.valueOf(cVar.field_status), Long.valueOf(cVar.field_finishedLength), Long.valueOf(cVar.field_toltalLength));
        }
        if (dVar != null) {
            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "cdn callback result: %s, %s", Integer.valueOf(dVar.field_retCode), dVar.f287615g);
            if (dVar.field_retCode == 0) {
                this.f283500e.f283441f.field_status = 199;
                C72709y1.vx0().update(this.f283500e.f283441f, new String[0]);
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f283500e.f283441f.field_msgInfoId);
                b002.mo108732L2(C68070l.C68072b.m80420s(C68070l.C68072b.m80422u(b002.getContent(), (String) null), this.f283500e.f283441f.field_mediaSvrId, dVar));
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                NetSceneUploadAppAttach netSceneUploadAppAttach2 = this.f283500e;
                C72683d dVar2 = netSceneUploadAppAttach2.f283441f;
                C97625j3.m125815e().mo123460f(new C96766k1(dVar2.field_msgInfoId, true, this.f283499d, new C96769a(), netSceneUploadAppAttach2.f283448p, dVar2));
            } else {
                C72695v.m85055H(this.f283500e.f283441f.systemRowid);
                NetSceneUploadAppAttach netSceneUploadAppAttach3 = this.f283500e;
                netSceneUploadAppAttach3.f283440e.onSceneEnd(3, dVar.field_retCode, "", netSceneUploadAppAttach3);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}

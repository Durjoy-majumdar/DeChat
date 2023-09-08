package com.tencent.p014mm.p136ui.chatting;

import android.os.Looper;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import ub1.C78142a;

/* renamed from: com.tencent.mm.ui.chatting.r3 */
public class C73840r3 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C72683d f216678d;

    /* renamed from: e */
    public final /* synthetic */ C78142a f216679e;

    /* renamed from: f */
    public final /* synthetic */ Object f216680f;

    /* renamed from: g */
    public final /* synthetic */ C73764n3 f216681g;

    /* renamed from: com.tencent.mm.ui.chatting.r3$a */
    public class C73841a implements Runnable {
        public C73841a() {
        }

        public void run() {
            C73840r3 r3Var = C73840r3.this;
            r3Var.f216681g.mo102816d(r3Var.f216680f, r3Var.f216679e);
        }
    }

    public C73840r3(C73764n3 n3Var, C72683d dVar, C78142a aVar, Object obj) {
        this.f216681g = n3Var;
        this.f216678d = dVar;
        this.f216679e = aVar;
        this.f216680f = obj;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (i == 0 && cVar != null) {
            this.f216678d.field_offset = cVar.field_finishedLength;
            C72709y1.vx0().update(this.f216678d, new String[0]);
        }
        if (i == 0 && dVar != null && dVar.field_retCode == 0) {
            C72683d dVar2 = this.f216678d;
            dVar2.field_status = 199;
            dVar2.field_offset = dVar2.field_totalLen;
            C72709y1.vx0().update(this.f216678d, new String[0]);
            this.f216679e.f228992d.mo100991d(3);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f216679e.f228992d.getMsgId(), this.f216679e.f228992d);
            new MMHandler(Looper.getMainLooper()).post(new C73841a());
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

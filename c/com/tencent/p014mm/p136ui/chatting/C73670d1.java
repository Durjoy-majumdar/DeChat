package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.ui.chatting.d1 */
public class C73670d1 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f216311d;

    /* renamed from: e */
    public final /* synthetic */ C72683d f216312e;

    /* renamed from: f */
    public final /* synthetic */ Context f216313f;

    /* renamed from: g */
    public final /* synthetic */ String f216314g;

    /* renamed from: h */
    public final /* synthetic */ C72963f4 f216315h;

    /* renamed from: i */
    public final /* synthetic */ boolean f216316i;

    /* renamed from: com.tencent.mm.ui.chatting.d1$a */
    public class C73671a implements Runnable {
        public C73671a() {
        }

        public void run() {
            C73670d1 d1Var = C73670d1.this;
            C74343y0.m88749H(d1Var.f216313f, d1Var.f216314g, d1Var.f216315h, d1Var.f216316i);
        }
    }

    public C73670d1(C68070l.C68072b bVar, C72683d dVar, Context context, String str, C72963f4 f4Var, boolean z) {
        this.f216311d = bVar;
        this.f216312e = dVar;
        this.f216313f = context;
        this.f216314g = str;
        this.f216315h = f4Var;
        this.f216316i = z;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C72683d dVar2;
        if (i == 0 && dVar != null && dVar.field_retCode == 0) {
            if (!Util.isNullOrNil(this.f216311d.f195650z) && (dVar2 = this.f216312e) != null) {
                dVar2.field_status = 199;
                dVar2.field_offset = dVar2.field_totalLen;
                C72709y1.vx0().update(this.f216312e, new String[0]);
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f216312e.field_msgInfoId);
                b002.mo100991d(3);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            }
            new MMHandler(Looper.getMainLooper()).post(new C73671a());
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

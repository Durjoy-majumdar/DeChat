package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.ui.chatting.component.u0 */
public class C73603u0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C72683d f216137d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f216138e;

    /* renamed from: f */
    public final /* synthetic */ HashSet f216139f;

    /* renamed from: g */
    public final /* synthetic */ C73588r0 f216140g;

    public C73603u0(C73588r0 r0Var, C72683d dVar, C72963f4 f4Var, HashSet hashSet) {
        this.f216140g = r0Var;
        this.f216137d = dVar;
        this.f216138e = f4Var;
        this.f216139f = hashSet;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (i == 0 && cVar != null) {
            this.f216137d.field_offset = cVar.field_finishedLength;
            C72709y1.vx0().update(this.f216137d, new String[0]);
        }
        if (i == 0 && dVar != null && dVar.field_retCode == 0) {
            Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d", Long.valueOf(this.f216138e.getMsgId()));
            C72683d dVar2 = this.f216137d;
            dVar2.field_status = 199;
            dVar2.field_offset = dVar2.field_totalLen;
            C72709y1.vx0().update(this.f216137d, new String[0]);
            this.f216138e.mo100991d(3);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f216138e.getMsgId(), this.f216138e);
            this.f216139f.remove(Long.valueOf(this.f216138e.getMsgId()));
            this.f216140g.mo102574a(this.f216139f);
        }
        if (!(i == 0 && (dVar == null || dVar.field_retCode == 0))) {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(this.f216138e.getMsgId());
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
            Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d, error(%d,%d)", objArr);
            this.f216139f.remove(Long.valueOf(this.f216138e.getMsgId()));
            this.f216140g.mo102574a(this.f216139f);
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

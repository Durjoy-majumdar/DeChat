package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C97184i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p1081gi.C98121d;
import t90.C77878b;
import te3.C51900wz3;
import te3.C64791vz3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.w1 */
public class C72703w1 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C72683d f211544d;

    /* renamed from: e */
    public final /* synthetic */ long f211545e;

    /* renamed from: f */
    public final /* synthetic */ String f211546f;

    /* renamed from: g */
    public final /* synthetic */ String f211547g;

    /* renamed from: h */
    public final /* synthetic */ C72704x1 f211548h;

    public C72703w1(C72704x1 x1Var, C72683d dVar, long j, String str, String str2) {
        this.f211548h = x1Var;
        this.f211544d = dVar;
        this.f211545e = j;
        this.f211546f = str;
        this.f211547g = str2;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C47350c cVar2 = cVar;
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.SceneAppMsg", "sendFileUploadMsgCallback type:%d errType:%d errCode:%d errMsg:%s msgId:%s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), Util.nullAs(str, ""), Long.valueOf(this.f211544d.field_msgInfoId));
        C64791vz3 vz32 = (C64791vz3) cVar2.f127055a.f127080a;
        if (vz32 != null) {
            String str2 = vz32.f186026e;
            if (Util.isEqual(str2, this.f211544d.field_msgInfoId + "")) {
                if (i == 0 && i2 == 0) {
                    C51900wz3 wz32 = (C51900wz3) cVar2.f127056b.f127083a;
                    if (wz32 != null) {
                        Log.m105925i("MicroMsg.SceneAppMsg", "FileUploadToken:%s NewMsgId:%s msgId:%s", wz32.f144368d, Long.valueOf(wz32.f144369e), vz32.f186026e);
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(Util.safeParseLong(vz32.f186026e));
                        if (b002.getMsgId() == 0) {
                            Log.m105921e("MicroMsg.SceneAppMsg", "sendFileUploadMsgCallback msg:%s no exist!", vz32.f186026e);
                            return 0;
                        }
                        C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(b002.getContent()), (String) null);
                        C77878b bVar = new C77878b();
                        String str3 = wz32.f144368d;
                        C87412m.m108594g(str3, "<set-?>");
                        bVar.f226902c = str3;
                        bVar.f226901b = wz32.f144369e;
                        u.mo93545f(bVar);
                        b002.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                        b002.mo100991d(2);
                        b002.mo108745Y2(wz32.f144369e);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                        ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(u, b002, 1));
                        this.f211548h.mo100172e(this.f211544d, b002, this.f211545e, this.f211546f, this.f211547g);
                    }
                } else {
                    C72695v.m85055H(this.f211544d.systemRowid);
                }
            }
        }
        return 0;
    }
}

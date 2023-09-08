package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.storage.C72963f4;
import hp3.C87581a;
import ob0.C89132b;
import te3.C49598gr;

/* renamed from: com.tencent.mm.ui.chatting.component.g4 */
public class C44822g4 implements C87581a<Object, C89132b.C89134c<C49598gr>> {

    /* renamed from: a */
    public final /* synthetic */ C72963f4 f121639a;

    /* renamed from: b */
    public final /* synthetic */ C73452c4 f121640b;

    public C44822g4(C73452c4 c4Var, C72963f4 f4Var) {
        this.f121640b = c4Var;
        this.f121639a = f4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            int r0 = r10.f256793a
            r1 = 1
            r2 = 0
            java.lang.String r3 = "MicroMsg.RemittanceRevokeComponent"
            if (r0 != 0) goto L_0x0181
            int r0 = r10.f256794b
            if (r0 != 0) goto L_0x0181
            T r0 = r10.f256796d
            if (r0 != 0) goto L_0x001b
            com.tencent.mm.ui.chatting.component.c4 r10 = r9.f121640b
            ck3.b r10 = r10.f215752d
            r10.mo91561b()
            goto L_0x0190
        L_0x001b:
            te3.gr r0 = (te3.C49598gr) r0
            int r4 = r0.f134203d
            if (r4 == 0) goto L_0x0093
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f134204e
            r4[r2] = r0
            java.lang.String r0 = "show alert dialog: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r4)
            com.tencent.mm.ui.chatting.component.c4 r0 = r9.f121640b
            ck3.b r0 = r0.f215752d
            android.app.Activity r0 = r0.mo91565f()
            qo3.a r3 = new qo3.a
            r3.<init>()
            T r4 = r10.f256796d
            te3.gr r4 = (te3.C49598gr) r4
            java.lang.String r4 = r4.f134204e
            r3.f225660q = r4
            r4 = 2131821557(0x7f1103f5, float:1.927586E38)
            android.content.res.Resources r5 = al3.C0086a.m38a(r0)
            java.lang.String r4 = r5.getString(r4)
            r3.f225663t = r4
            T r4 = r10.f256796d
            te3.gr r4 = (te3.C49598gr) r4
            te3.b54 r4 = r4.f134206g
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = r4.f130957d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0083
            T r4 = r10.f256796d
            te3.gr r4 = (te3.C49598gr) r4
            te3.b54 r4 = r4.f134206g
            java.lang.String r4 = r4.f130958e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0083
            T r4 = r10.f256796d
            te3.gr r4 = (te3.C49598gr) r4
            te3.b54 r4 = r4.f134206g
            java.lang.String r5 = r4.f130958e
            r3.f225663t = r5
            java.lang.String r4 = r4.f130957d
            r3.f225664u = r4
            com.tencent.mm.ui.chatting.component.f4 r4 = new com.tencent.mm.ui.chatting.component.f4
            r4.<init>(r9, r10)
            r3.f225620C = r4
            r3.f225641X = r1
        L_0x0083:
            qo3.g r10 = new qo3.g
            r1 = 2131887328(0x7f1204e0, float:1.940926E38)
            r10.<init>(r0, r1)
            r10.mo107525e(r3)
            r10.show()
            goto L_0x0186
        L_0x0093:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f134205f
            r4[r2] = r0
            java.lang.String r0 = "revoke_ticket: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
            T r0 = r10.f256796d
            te3.gr r0 = (te3.C49598gr) r0
            java.lang.String r0 = r0.f134205f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0167
            com.tencent.mm.ui.chatting.component.c4 r10 = r9.f121640b
            com.tencent.mm.storage.f4 r0 = r9.f121639a
            r10.getClass()
            java.lang.Class<ru.h> r4 = p680ru.C77569h.class
            java.lang.String r5 = "do revoke local remittance msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            r0.mo108740T2(r2)
            r3 = 268445456(0x10002710, float:2.5273642E-29)
            r0.setType(r3)
            ck3.b r3 = r10.f215752d
            android.content.res.Resources r3 = r3.mo91572m()
            r5 = 2131823642(0x7f110c1a, float:1.928009E38)
            java.lang.String r3 = r3.getString(r5)
            r0.mo108732L2(r3)
            ck3.b r10 = r10.f215752d
            android.content.res.Resources r10 = r10.mo91572m()
            java.lang.String r10 = r10.getString(r5)
            r0.f230762x0 = r10
            r0.f230755r = r1
            int r10 = r0.f230723F
            r10 = r10 | 4
            r0.mo108743W2(r10)
            eb0.c r10 = eb0.C97625j3.m125812b()
            g62.l r10 = r10.mo105911z()
            long r5 = r0.getMsgId()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            r10.xy0(r5, r0)
            com.tencent.mm.autogen.events.RevokeNativeMsgEvent r10 = new com.tencent.mm.autogen.events.RevokeNativeMsgEvent
            r10.<init>()
            com.tencent.mm.autogen.events.RevokeNativeMsgEvent$a r3 = r10.f78950d
            long r5 = r0.getMsgId()
            r3.f78951a = r5
            r10.publish()
            java.lang.Class<u72.c> r10 = u72.C78135c.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            u72.c r10 = (u72.C78135c) r10
            long r5 = r0.getMsgId()
            long r7 = r0.mo108774y2()
            r10.mo108113Hb(r5, r7)
            eb0.c r10 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r10 = r10.mo105906u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5 = 290818(0x47002, float:4.07523E-40)
            java.lang.Object r10 = r10.mo119684e(r5, r3)
            if (r10 == 0) goto L_0x0138
            java.lang.String r10 = r10.toString()
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)
            goto L_0x0139
        L_0x0138:
            r10 = 0
        L_0x0139:
            int r10 = r10 + r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.mo119676J(r5, r10)
            boolean r10 = r0.mo101020w3()
            if (r10 == 0) goto L_0x015d
            di3.d r10 = di3.C86312j.m106911c(r4)
            ru.h r10 = (p680ru.C77569h) r10
            int r1 = com.tencent.p014mm.message.C40339m.m43520a(r0)
            r10.mo35231KK(r0, r1)
            goto L_0x0186
        L_0x015d:
            di3.d r10 = di3.C86312j.m106911c(r4)
            ru.h r10 = (p680ru.C77569h) r10
            r10.Oi0(r0)
            goto L_0x0186
        L_0x0167:
            com.tencent.mm.ui.chatting.component.c4 r0 = r9.f121640b
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.s0> r2 = zj3.C53793s0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.s0 r0 = (zj3.C53793s0) r0
            com.tencent.mm.storage.f4 r2 = r9.f121639a
            T r10 = r10.f256796d
            te3.gr r10 = (te3.C49598gr) r10
            java.lang.String r10 = r10.f134205f
            r0.mo74367R4(r2, r10)
            goto L_0x0187
        L_0x0181:
            java.lang.String r10 = "net error, do skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r10)
        L_0x0186:
            r1 = 0
        L_0x0187:
            if (r1 != 0) goto L_0x0190
            com.tencent.mm.ui.chatting.component.c4 r10 = r9.f121640b
            ck3.b r10 = r10.f215752d
            r10.mo91561b()
        L_0x0190:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44822g4.call(java.lang.Object):java.lang.Object");
    }
}

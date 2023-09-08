package com.tencent.p014mm.p136ui.chatting.component.biz;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.c */
public class C44808c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizComponent f121607d;

    public C44808c(BizComponent bizComponent) {
        this.f121607d = bizComponent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            com.tencent.mm.ui.chatting.component.biz.BizComponent r0 = r12.f121607d
            ck3.b r1 = r0.f215752d
            java.lang.Class<zj3.l> r2 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.l r1 = (zj3.C79368l) r1
            int r2 = r1.getCount()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0020
            int r2 = r1.getCount()
            int r2 = r2 - r4
            com.tencent.mm.storage.f4 r1 = r1.getItem(r2)
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            r2 = 2
            r5 = 0
            if (r1 != 0) goto L_0x0026
            goto L_0x005e
        L_0x0026:
            int r6 = r1.getType()
            r7 = 721420337(0x2b000031, float:4.5475E-13)
            if (r6 != r7) goto L_0x0031
            r3 = 2
            goto L_0x005f
        L_0x0031:
            int r6 = r1.getType()
            r7 = 318767153(0x13000031, float:1.6155966E-27)
            if (r6 != r7) goto L_0x005e
            java.lang.String r6 = r1.getContent()
            java.lang.String r7 = "msg"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r7, r3)
            if (r3 == 0) goto L_0x005e
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x004d
            goto L_0x005e
        L_0x004d:
            java.lang.String r6 = ".msg.appmsg.mmreader.category.item.template_op_type"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r6 = -1
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r6)
            if (r3 != r2) goto L_0x005e
            r3 = 1
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x0066
            long r6 = r1.mo108774y2()
            goto L_0x0068
        L_0x0066:
            r6 = 0
        L_0x0068:
            r1 = 3
            java.lang.Object[] r8 = new java.lang.Object[r1]
            long r9 = r0.f121571o
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r5] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r8[r4] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r8[r2] = r9
            java.lang.String r9 = "MicroMsg.ChattingUI.BizComponent"
            java.lang.String r10 = "alvinluo reportEnterNotifyMessage enterTime: %d, msgId: %d, businessType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r8)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 20567(0x5057, float:2.882E-41)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r10 = r0.f121571o
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r1[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r2] = r0
            r8.mo160131h(r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.biz.C44808c.run():void");
    }
}

package y43;

import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import w53.C53081a;

/* renamed from: y43.s */
public class C15934s extends IStaticListener<WCPayWalletBufferEvent> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
        /*
            r9 = this;
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent r10 = (com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent) r10
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = eb0.C75592q0.m90784n()
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r3 = r10.f9579e
            r3.f9590a = r2
            r3 = 4
            r4 = -1
            r5 = 1
            java.lang.String r6 = "MicroMsg.HandleWCPayWalletBufferListener"
            if (r1 != r3) goto L_0x0108
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$a r1 = r10.f9578d
            int r7 = r1.f9588i
            r8 = 2
            if (r0 != r7) goto L_0x00eb
            java.lang.String r1 = r1.f9587h
            java.lang.String r7 = "fetch"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = "do fetch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.lang.String r1 = ""
            if (r0 == r5) goto L_0x008f
            if (r0 == r8) goto L_0x007a
            if (r0 == r3) goto L_0x0065
            r3 = 8
            if (r0 == r3) goto L_0x0050
            goto L_0x00a3
        L_0x0050:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r3, r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00a3
        L_0x0065:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r3, r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00a3
        L_0x007a:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r3, r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00a3
        L_0x008f:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r3, r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x00a3:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x00b2
            y43.q r0 = new y43.q
            r0.<init>(r9, r10, r1)
            r9.mo14586d(r10, r0)
            goto L_0x0121
        L_0x00b2:
            java.lang.String r0 = "fetch empty buffer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r0 = r10.f9579e
            r1 = -2
            r0.f9590a = r1
            goto L_0x011a
        L_0x00bd:
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$a r1 = r10.f9578d
            java.lang.String r1 = r1.f9587h
            java.lang.String r3 = "save"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = "do save"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            y43.r r1 = new y43.r
            r1.<init>(r9, r0, r10)
            r9.mo14586d(r10, r1)
            goto L_0x0121
        L_0x00d8:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$a r1 = r10.f9578d
            java.lang.String r1 = r1.f9587h
            r0[r2] = r1
            java.lang.String r1 = "wrong action: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r0 = r10.f9579e
            r0.f9590a = r4
            goto L_0x011a
        L_0x00eb:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$a r0 = r10.f9578d
            int r0 = r0.f9588i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = "wrong region, client: %s, req: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r0 = r10.f9579e
            r0.f9590a = r4
            goto L_0x011a
        L_0x0108:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "wrong type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r0 = r10.f9579e
            r0.f9590a = r4
        L_0x011a:
            com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b r10 = r10.f9579e
            java.lang.Runnable r10 = r10.f9592c
            r10.run()
        L_0x0121:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y43.C15934s.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* renamed from: d */
    public final void mo14586d(WCPayWalletBufferEvent wCPayWalletBufferEvent, C11385n nVar) {
        Log.m105924i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1767, nVar);
        WCPayWalletBufferEvent.C1159a aVar = wCPayWalletBufferEvent.f9578d;
        Log.m105925i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", aVar.f9580a, aVar.f9585f, aVar.f9581b, aVar.f9582c, aVar.f9583d, aVar.f9584e, aVar.f9586g);
        C53081a aVar2 = new C53081a(aVar.f9580a, aVar.f9585f, aVar.f9581b, aVar.f9582c, aVar.f9583d, aVar.f9584e, aVar.f9586g);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(aVar2);
    }
}

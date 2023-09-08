package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.i */
public class C67856i extends IStaticListener<NotifyGroupTodoEvent> {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r7.f193762d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent r7 = (com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent) r7
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            r1 = 0
            if (r7 == 0) goto L_0x0087
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r2 = r7.f193762d
            int r3 = r2.f193763a
            if (r3 != 0) goto L_0x0087
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r2.f193764b
            r4[r1] = r5
            java.lang.String r2 = r2.f193765c
            r5 = 1
            r4[r5] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r2] = r3
            java.lang.String r2 = "MicroMsg.NotifyGroupTodoEventIListener"
            java.lang.String r3 = "NotifyGroupTodoEvent %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r2 = r7.f193762d
            java.lang.String r2 = r2.f193764b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85807K5(r2)
            if (r2 == 0) goto L_0x0087
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r3 = r7.f193762d
            java.lang.String r3 = r3.f193764b
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r3)
            if (r2 != 0) goto L_0x0066
            com.tencent.mm.storage.h2 r2 = new com.tencent.mm.storage.h2
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r7 = r7.f193762d
            java.lang.String r7 = r7.f193764b
            r2.<init>(r7)
            long r3 = java.lang.System.currentTimeMillis()
            r2.mo108793N2(r3)
            k40.a r7 = f40.C86709a0.m107533q(r0)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.v3 r7 = r7.mo96094Ku()
            com.tencent.mm.storage.i2 r7 = (com.tencent.p014mm.storage.C44660i2) r7
            r7.mo69751W(r2)
        L_0x0066:
            r2.mo108800V2(r5)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = g62.C45881a.m51165b(r2, r5, r3)
            r2.mo101161T2(r3)
            k40.a r7 = f40.C86709a0.m107533q(r0)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.v3 r7 = r7.mo96094Ku()
            java.lang.String r0 = r2.getUsername()
            com.tencent.mm.storage.i2 r7 = (com.tencent.p014mm.storage.C44660i2) r7
            r7.mo69774l0(r2, r0, r1)
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.plugin.listener.C67856i.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

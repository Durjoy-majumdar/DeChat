package hn2;

import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: hn2.f */
public final class C8617f extends IStaticListener<ConfigUpdatedEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ Exception -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[Catch:{ Exception -> 0x0050 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.ConfigUpdatedEvent r7 = (com.tencent.p014mm.autogen.events.ConfigUpdatedEvent) r7
            java.lang.String r0 = "file_list"
            java.lang.String r1 = "event"
            gy3.C87412m.m108594g(r7, r1)
            com.tencent.mm.autogen.events.ConfigUpdatedEvent$a r7 = r7.f9044d
            java.lang.String r7 = r7.f9045a
            java.lang.String r1 = "clicfg_oneshot_file_list"
            boolean r7 = gy3.C87412m.m108589b(r7, r1)
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x0019
            r2 = 0
            goto L_0x005a
        L_0x0019:
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0050 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ Exception -> 0x0050 }
            java.lang.String r4 = ""
            java.lang.String r7 = r7.mo58776F5(r1, r4)     // Catch:{ Exception -> 0x0050 }
            if (r7 == 0) goto L_0x0032
            int r1 = r7.length()     // Catch:{ Exception -> 0x0050 }
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            if (r1 == 0) goto L_0x0036
            goto L_0x005a
        L_0x0036:
            java.lang.String r1 = "oneshot_action"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ Exception -> 0x0050 }
            r4 = 0
            java.lang.String r5 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0050 }
            boolean r5 = gy3.C87412m.m108589b(r7, r5)     // Catch:{ Exception -> 0x0050 }
            if (r5 == 0) goto L_0x0049
            goto L_0x005a
        L_0x0049:
            r1.encode((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ Exception -> 0x0050 }
            hn2.C117099c.m165129a(r4)     // Catch:{ Exception -> 0x0050 }
            goto L_0x005a
        L_0x0050:
            r7 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "MicroMsg.ListFile"
            java.lang.String r3 = "Cannot list files"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r3, r0)
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hn2.C8617f.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

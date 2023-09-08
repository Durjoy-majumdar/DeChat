package p697tm;

import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: tm.w1 */
public class C78042w1 extends IStaticListener<UpdateWxaOptionsEvent> {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r0.f239696d.update(r0.getTableName(), r4, java.lang.String.format("%s=?", new java.lang.Object[]{"username"}), new java.lang.String[]{r3}) > 0) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent r11 = (com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent) r11
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0099
        L_0x000b:
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$a r0 = r11.f193994d
            java.lang.String r0 = r0.f193996a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0017
            goto L_0x0099
        L_0x0017:
            com.tencent.mm.plugin.appbrand.config.j r0 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100182g()
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$a r2 = r11.f193994d
            java.lang.String r3 = r2.f193996a
            int r4 = r2.f193998c
            int r2 = r2.f193997b
            r5 = 1
            if (r2 != r5) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r0.getClass()
            wi0.e0 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            r0.getClass()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r7 = "appOpt"
            if (r6 == 0) goto L_0x003c
            goto L_0x007a
        L_0x003c:
            java.lang.String[] r6 = new java.lang.String[]{r7}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r6 = r0.mo114000LL(r3, r6)
            if (r6 != 0) goto L_0x0047
            goto L_0x007a
        L_0x0047:
            int r6 = r6.field_appOpt
            if (r2 != 0) goto L_0x004e
            int r2 = ~r4
            r2 = r2 & r6
            goto L_0x0050
        L_0x004e:
            r2 = r4 | r6
        L_0x0050:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r7, r2)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r0.f239696d
            java.lang.String r6 = r0.getTableName()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = "username"
            r8[r1] = r9
            java.lang.String r9 = "%s=?"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.String[] r9 = new java.lang.String[r5]
            r9[r1] = r3
            int r2 = r2.update(r6, r4, r8, r9)
            if (r2 <= 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x0095
            java.lang.String[] r2 = new java.lang.String[]{r7}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo114000LL(r3, r2)
            com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent r2 = new com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent
            r2.<init>()
            com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent$a r4 = r2.f193781d
            r4.f193782a = r3
            int r0 = r0.field_appOpt
            r4.f193783b = r0
            r2.publish()
        L_0x0095:
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$b r11 = r11.f193995e
            r11.f193999a = r5
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p697tm.C78042w1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

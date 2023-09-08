package com.tencent.p014mm.plugin.game.luggage.report;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/game/luggage/report/PageTimeReport27743$registerReportListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LiteAppShowStatusChangeEvent;", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1 */
public final class PageTimeReport27743$registerReportListener$1 extends IListener<LiteAppShowStatusChangeEvent> {
    public PageTimeReport27743$registerReportListener$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be A[Catch:{ JSONException -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r21) {
        /*
            r20 = this;
            r0 = r21
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent r0 = (com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent) r0
            java.lang.String r1 = "event"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a r1 = r0.f107623d
            if (r1 != 0) goto L_0x0010
        L_0x000d:
            r2 = 0
            goto L_0x00e7
        L_0x0010:
            java.lang.Long r1 = r1.f107626c
            java.lang.String r4 = "event.data.appPtr"
            gy3.C87412m.m108593f(r1, r4)
            long r4 = r1.longValue()
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a r1 = r0.f107623d
            java.lang.Long r1 = r1.f107627d
            java.lang.String r6 = "event.data.pageId"
            gy3.C87412m.m108593f(r1, r6)
            long r6 = r1.longValue()
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a r1 = r0.f107623d
            boolean r8 = r1.f107628e
            if (r8 == 0) goto L_0x005f
            java.util.List<com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$a> r1 = com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.f113097e
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$a r3 = (com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.C41991a) r3
            java.lang.String r8 = r3.f113099a
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a r9 = r0.f107623d
            java.lang.String r9 = r9.f107624a
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0034
            long r8 = r3.f113103e
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0034
            long r8 = r3.f113104f
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0034
            long r8 = java.lang.System.currentTimeMillis()
            r3.f113100b = r8
            goto L_0x0034
        L_0x005f:
            java.lang.String r1 = r1.f107625b
            if (r1 == 0) goto L_0x000d
            java.lang.String r8 = ""
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x006c
            goto L_0x000d
        L_0x006c:
            long r8 = java.lang.System.currentTimeMillis()
            java.util.List<com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$a> r1 = com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.f113097e
            java.util.Iterator r1 = r1.iterator()
        L_0x0076:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r10 = r1.next()
            com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$a r10 = (com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.C41991a) r10
            java.lang.String r11 = r10.f113099a
            com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a r12 = r0.f107623d
            java.lang.String r12 = r12.f107624a
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x0076
            long r11 = r10.f113103e
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0076
            long r11 = r10.f113104f
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x0076
            java.util.HashMap<java.lang.String, java.lang.String> r11 = com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.f113096d
            java.lang.String r12 = r10.f113102d
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r13 = "a8keyScene"
            r14 = 32
            r12.put(r13, r14)     // Catch:{ JSONException -> 0x00c3 }
            if (r11 == 0) goto L_0x00bb
            int r13 = r11.length()     // Catch:{ JSONException -> 0x00c3 }
            if (r13 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r13 = 0
            goto L_0x00bc
        L_0x00bb:
            r13 = 1
        L_0x00bc:
            if (r13 != 0) goto L_0x00c3
            java.lang.String r13 = "ext"
            r12.put(r13, r11)     // Catch:{ JSONException -> 0x00c3 }
        L_0x00c3:
            java.lang.String r11 = r12.toString()
            java.lang.String r19 = y10.C15928a.m14857d(r11)
            com.tencent.p014mm.plugin.game.commlib.util.C41864d.m45389f()
            com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743 r12 = com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743.f113093a
            long r13 = r10.f113100b
            long r13 = r8 - r13
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            int r13 = (int) r13
            r14 = 0
            long r2 = r10.f113101c
            java.lang.String r10 = r10.f113102d
            r16 = r2
            r18 = r10
            r12.mo65887a(r13, r14, r16, r18, r19)
            goto L_0x0076
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

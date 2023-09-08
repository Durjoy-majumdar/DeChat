package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetConvEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/conversation/FolderHelper$convBoxEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/GetConvEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.conversation.FolderHelper$convBoxEventListener$1 */
public final class FolderHelper$convBoxEventListener$1 extends IListener<GetConvEvent> {

    /* renamed from: d */
    public final /* synthetic */ FolderHelper f219437d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderHelper$convBoxEventListener$1(FolderHelper folderHelper, C40008f fVar) {
        super(fVar);
        this.f219437d = folderHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0166, code lost:
        if (r2 == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (r2 == null) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.tencent.mm.autogen.events.GetConvEvent r1 = (com.tencent.p014mm.autogen.events.GetConvEvent) r1
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.mm.autogen.events.GetConvEvent$a r2 = r1.f107586d
            int r3 = r2.f107590c
            r4 = 1
            if (r3 != 0) goto L_0x01a5
            com.tencent.mm.ui.conversation.FolderHelper r2 = r0.f219437d
            com.tencent.mm.ui.conversation.p r2 = r2.f219405d
            r6 = 0
            java.lang.String r3 = "MicroMsg.FolderHelper"
            if (r2 == 0) goto L_0x0190
            android.util.SparseArray[] r2 = r2.mo104615n()
            if (r2 == 0) goto L_0x0190
            java.lang.Object r2 = sx3.C110823p.m150978D(r2)
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            if (r2 == 0) goto L_0x0190
            com.tencent.mm.ui.conversation.FolderHelper r8 = r0.f219437d
            com.tencent.mm.ui.conversation.p r9 = r8.f219405d
            if (r9 == 0) goto L_0x006b
            java.util.HashMap r9 = r9.mo104614l()
            if (r9 == 0) goto L_0x006b
            java.util.Collection r9 = r9.values()
            if (r9 == 0) goto L_0x006b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0045:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0066
            java.lang.Object r12 = r9.next()
            r13 = r12
            com.tencent.mm.storage.h2 r13 = (com.tencent.p014mm.storage.C72976h2) r13
            eb0.c r14 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r14 = r14.mo105908w()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            boolean r13 = r14.mo69754Z(r13)
            if (r13 == 0) goto L_0x0045
            r11.add(r12)
            goto L_0x0045
        L_0x0066:
            int r9 = r11.size()
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            int r11 = r2.size()
            java.lang.String r12 = "conversationboxservice"
            if (r11 < 0) goto L_0x00aa
            r13 = 0
            r14 = 0
        L_0x0076:
            java.lang.Object r15 = r2.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            int r5 = r8.f219420v
            int r5 = r5 + r9
            if (r13 >= r5) goto L_0x00a5
            com.tencent.mm.storage.h2 r5 = r8.mo103789l(r15)
            if (r5 == 0) goto L_0x008c
            java.lang.String r5 = r5.mo108782C2()
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            boolean r5 = gy3.C87412m.m108589b(r5, r12)
            if (r5 != 0) goto L_0x00a3
            boolean r5 = gy3.C87412m.m108589b(r15, r12)
            if (r5 != 0) goto L_0x00a3
            com.tencent.mm.autogen.events.GetConvEvent$a r5 = r1.f107586d
            java.lang.String r5 = r5.f107589b
            boolean r5 = gy3.C87412m.m108589b(r15, r5)
            if (r5 == 0) goto L_0x00a5
        L_0x00a3:
            int r14 = r14 + 1
        L_0x00a5:
            if (r13 == r11) goto L_0x00ab
            int r13 = r13 + 1
            goto L_0x0076
        L_0x00aa:
            r14 = 0
        L_0x00ab:
            int r5 = r8.f219420v
            int r5 = r5 + r9
            java.lang.Object r5 = r2.get(r5)
            boolean r5 = gy3.C87412m.m108589b(r5, r12)
            if (r5 == 0) goto L_0x00ba
            int r14 = r14 + 1
        L_0x00ba:
            int r5 = r8.f219420v
            int r9 = r9 + r5
            int r9 = r9 + r14
            java.lang.Object r5 = r2.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x0135
            com.tencent.mm.storage.h2 r5 = r8.mo103789l(r5)
            if (r5 == 0) goto L_0x011c
            com.tencent.mm.autogen.events.GetConvEvent$a r15 = r1.f107586d
            if (r15 == 0) goto L_0x00e2
            com.tencent.mm.ui.conversation.k1 r15 = r15.f107588a
            if (r15 == 0) goto L_0x00e2
            long r16 = r5.mo108821o2()
            r18 = r11
            long r10 = r16 + r12
            r15.mo32880b(r10)
            goto L_0x00e4
        L_0x00e2:
            r18 = r11
        L_0x00e4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "updateConvTime: "
            r10.append(r11)
            long r12 = r5.mo108821o2()
            r10.append(r12)
            java.lang.String r11 = ", talker: "
            r10.append(r11)
            java.lang.String r5 = r5.getUsername()
            r10.append(r5)
            java.lang.String r5 = ", position: "
            r10.append(r5)
            r10.append(r9)
            java.lang.String r5 = ", offset: "
            r10.append(r5)
            r10.append(r14)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x011f
        L_0x011c:
            r18 = r11
            r5 = 0
        L_0x011f:
            if (r5 != 0) goto L_0x0132
            com.tencent.mm.autogen.events.GetConvEvent$a r5 = r1.f107586d
            if (r5 == 0) goto L_0x012c
            com.tencent.mm.ui.conversation.k1 r5 = r5.f107588a
            if (r5 == 0) goto L_0x012c
            r5.mo32880b(r6)
        L_0x012c:
            java.lang.String r5 = "updateConvTime: 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r5)
        L_0x0132:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0138
        L_0x0135:
            r18 = r11
            r5 = 0
        L_0x0138:
            if (r5 != 0) goto L_0x018d
            r5 = r18
            if (r5 >= r4) goto L_0x0140
            r10 = 0
            goto L_0x0142
        L_0x0140:
            int r10 = r5 + -1
        L_0x0142:
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x017a
            com.tencent.mm.storage.h2 r2 = r8.mo103789l(r2)
            if (r2 == 0) goto L_0x0168
            com.tencent.mm.autogen.events.GetConvEvent$a r5 = r1.f107586d
            if (r5 == 0) goto L_0x0165
            com.tencent.mm.ui.conversation.k1 r5 = r5.f107588a
            if (r5 == 0) goto L_0x0165
            long r8 = r2.mo108821o2()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 - r10
            r5.mo32880b(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            if (r2 != 0) goto L_0x0178
        L_0x0168:
            com.tencent.mm.autogen.events.GetConvEvent$a r2 = r1.f107586d
            if (r2 == 0) goto L_0x0176
            com.tencent.mm.ui.conversation.k1 r2 = r2.f107588a
            if (r2 == 0) goto L_0x0176
            r2.mo32880b(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0177
        L_0x0176:
            r5 = 0
        L_0x0177:
            r2 = r5
        L_0x0178:
            if (r2 != 0) goto L_0x0187
        L_0x017a:
            com.tencent.mm.autogen.events.GetConvEvent$a r2 = r1.f107586d
            if (r2 == 0) goto L_0x0187
            com.tencent.mm.ui.conversation.k1 r2 = r2.f107588a
            if (r2 == 0) goto L_0x0187
            r2.mo32880b(r6)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0187:
            java.lang.String r2 = "updateConvTime: 0, pos item is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
        L_0x018d:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            if (r5 != 0) goto L_0x01e5
            com.tencent.mm.autogen.events.GetConvEvent$a r1 = r1.f107586d
            if (r1 == 0) goto L_0x019e
            com.tencent.mm.ui.conversation.k1 r1 = r1.f107588a
            if (r1 == 0) goto L_0x019e
            r1.mo32880b(r6)
        L_0x019e:
            java.lang.String r1 = "updateConvTime: 0, pos is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            goto L_0x01e5
        L_0x01a5:
            if (r3 != r4) goto L_0x01e5
            com.tencent.mm.ui.conversation.k1 r1 = r2.f107588a
            if (r1 == 0) goto L_0x01e5
            com.tencent.mm.ui.conversation.FolderHelper r2 = r0.f219437d
            com.tencent.mm.ui.conversation.p r2 = r2.f219405d
            if (r2 == 0) goto L_0x01e1
            java.util.HashMap r2 = r2.mo104614l()
            if (r2 == 0) goto L_0x01e1
            java.util.Collection r2 = r2.values()
            if (r2 == 0) goto L_0x01e1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01c6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01e2
            java.lang.Object r3 = r2.next()
            r6 = r3
            com.tencent.mm.storage.h2 r6 = (com.tencent.p014mm.storage.C72976h2) r6
            java.lang.String r6 = r6.getUsername()
            boolean r6 = rb0.C47984k.m53340n(r6)
            if (r6 == 0) goto L_0x01c6
            r5.add(r3)
            goto L_0x01c6
        L_0x01e1:
            r5 = 0
        L_0x01e2:
            r1.mo102389a(r5)
        L_0x01e5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper$convBoxEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

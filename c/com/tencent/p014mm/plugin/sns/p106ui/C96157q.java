package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.q */
public abstract class C96157q implements C95778f1 {

    /* renamed from: a */
    public ArrayList<String> f280903a = new ArrayList<>();

    /* renamed from: b */
    public int f280904b = 0;

    /* renamed from: b */
    public void mo132253b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
        SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133779j(com.tencent.p014mm.plugin.sns.model.C94945s2 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "packageGroupInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.BaseWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r12.f280904b
            r13.getClass()
            java.lang.String r3 = "setVisibilityLabel"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.UploadPackHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.UploadPackHelper"
            java.lang.String r9 = "setVisibilityLabel %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            com.tencent.mm.protocal.protobuf.SnsObject r6 = r13.f275202i
            int r9 = r6.ExtFlag
            r2 = r2 | r9
            r6.ExtFlag = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.util.ArrayList<java.lang.String> r2 = r12.f280903a
            java.lang.String r3 = "setLabelInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            if (r2 == 0) goto L_0x0109
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0043
            goto L_0x0109
        L_0x0043:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x004c:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0075
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x005f
            goto L_0x004c
        L_0x005f:
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x006b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x006b }
            r6.add(r9)     // Catch:{ Exception -> 0x006b }
            goto L_0x004c
        L_0x006b:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = "setLabelInfo error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r9, r11, r10)
            goto L_0x004c
        L_0x0075:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.intListToString(r6)
            r2[r8] = r9
            java.lang.String r9 = "setLabelInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r2)
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            int r2 = r2.ExtFlag
            java.lang.String r7 = "checkHaveBlackContactListOrTagListByExtFlag"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            r10 = r2 & 2
            if (r10 <= 0) goto L_0x00a0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            goto L_0x00a7
        L_0x00a0:
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 <= 0) goto L_0x00a9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
        L_0x00a7:
            r2 = 1
            goto L_0x00ad
        L_0x00a9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            r2 = 0
        L_0x00ad:
            if (r2 == 0) goto L_0x00cb
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            int r5 = r6.size()
            r2.BlackContactTagIdListCount = r5
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            r2.BlackContactTagIdList = r6
            te3.lv2 r2 = r13.f275200g
            int r5 = r6.size()
            r2.f298739M = r5
            te3.lv2 r13 = r13.f275200g
            java.util.LinkedList<java.lang.Integer> r13 = r13.f298740N
            r13.addAll(r6)
            goto L_0x0105
        L_0x00cb:
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            int r2 = r2.ExtFlag
            java.lang.String r7 = "checkHaveGroupContactListOrTagListByExtFlag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            r10 = r2 & 4
            if (r10 <= 0) goto L_0x00dc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            goto L_0x00e8
        L_0x00dc:
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 <= 0) goto L_0x00e4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            goto L_0x00e8
        L_0x00e4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            r5 = 0
        L_0x00e8:
            if (r5 == 0) goto L_0x0105
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            int r5 = r6.size()
            r2.GroupContactTagIdListCount = r5
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r13.f275202i
            r2.GroupContactTagIdList = r6
            te3.lv2 r2 = r13.f275200g
            int r5 = r6.size()
            r2.f298741P = r5
            te3.lv2 r13 = r13.f275200g
            java.util.LinkedList<java.lang.Integer> r13 = r13.f298742Q
            r13.addAll(r6)
        L_0x0105:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x010c
        L_0x0109:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x010c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96157q.mo133779j(com.tencent.mm.plugin.sns.model.s2):void");
    }
}

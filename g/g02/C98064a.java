package g02;

import android.os.Build;
import android.provider.Settings;
import aw0.C103925l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.Vector;
import p646pn.C110234e;

/* renamed from: g02.a */
public final class C98064a {

    /* renamed from: a */
    public static final C98064a f287510a = new C98064a();

    /* renamed from: a */
    public static final int m126668a() {
        if (C85875k4.m106163T()) {
            return 1000;
        }
        if (Build.VERSION.SDK_INT >= 23 ? Settings.canDrawOverlays(MMApplicationContext.getContext()) : true) {
            return 5 - ((Vector) C103925l.m138630d(((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149148x())).size();
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.tencent.mm.plugin.handoff.model.HandOffFile] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.tencent.mm.plugin.handoff.model.HandOffMP] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.tencent.mm.plugin.handoff.model.HandOffMG] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.handoff.model.HandOff mo137360b(com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo r21) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r1, r0)
            r2 = 0
            te3.j13 r0 = r1.field_showData     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = r0.f183756i     // Catch:{ Exception -> 0x0101 }
            goto L_0x0010
        L_0x000f:
            r3 = r2
        L_0x0010:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0015
            r3 = r4
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            java.lang.String r5 = r0.f183752e     // Catch:{ Exception -> 0x0101 }
            goto L_0x001b
        L_0x001a:
            r5 = r2
        L_0x001b:
            if (r5 != 0) goto L_0x001f
            r6 = r4
            goto L_0x0020
        L_0x001f:
            r6 = r5
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.f183751d     // Catch:{ Exception -> 0x0101 }
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            r0 = r4
        L_0x0029:
            long r14 = r1.field_createTime     // Catch:{ Exception -> 0x0101 }
            int r5 = r1.field_type     // Catch:{ Exception -> 0x0101 }
            r7 = 4
            r8 = 1
            java.lang.String r13 = "field_id"
            if (r5 == r8) goto L_0x008e
            r9 = 2
            if (r5 == r9) goto L_0x0046
            if (r5 == r7) goto L_0x003e
            r4 = r2
        L_0x0039:
            r0 = r13
            r18 = r14
            goto L_0x00f0
        L_0x003e:
            com.tencent.mm.plugin.handoff.model.HandOffFile$b r0 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.Companion     // Catch:{ Exception -> 0x0101 }
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = r0.mo129301c(r1)     // Catch:{ Exception -> 0x0101 }
            r4 = r0
            goto L_0x0039
        L_0x0046:
            te3.i25 r5 = new te3.i25     // Catch:{ Exception -> 0x0101 }
            r5.<init>()     // Catch:{ Exception -> 0x0101 }
            byte[] r7 = r1.field_data     // Catch:{ Exception -> 0x0101 }
            r5.parseFrom(r7)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r7 = r5.f135052f     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x005c
            boolean r7 = z04.C112551y.m153811k(r7)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r8 = 0
        L_0x005c:
            if (r8 != 0) goto L_0x0061
            java.lang.String r4 = r5.f135052f     // Catch:{ Exception -> 0x0101 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r5 = r5.f135051e     // Catch:{ Exception -> 0x0101 }
            if (r5 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r5
        L_0x0067:
            r7 = r4
            com.tencent.mm.plugin.handoff.model.HandOffURL r4 = new com.tencent.mm.plugin.handoff.model.HandOffURL     // Catch:{ Exception -> 0x0101 }
            java.lang.String r5 = "showUrl"
            gy3.C87412m.m108593f(r7, r5)     // Catch:{ Exception -> 0x0101 }
            r9 = 2
            r10 = 0
            r11 = 0
            java.lang.String r12 = r1.field_id     // Catch:{ Exception -> 0x0101 }
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ Exception -> 0x0101 }
            r16 = 48
            r17 = 0
            r5 = r4
            r8 = r3
            r3 = r13
            r13 = r16
            r18 = r14
            r14 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0101 }
            r4.setNickname(r0)     // Catch:{ Exception -> 0x0101 }
            r0 = r3
            goto L_0x00f0
        L_0x008e:
            r18 = r14
            r15 = r13
            te3.i5 r5 = new te3.i5     // Catch:{ Exception -> 0x0101 }
            r5.<init>()     // Catch:{ Exception -> 0x0101 }
            byte[] r6 = r1.field_data     // Catch:{ Exception -> 0x0101 }
            r5.parseFrom(r6)     // Catch:{ Exception -> 0x0101 }
            int r6 = r5.f259569g     // Catch:{ Exception -> 0x0101 }
            if (r6 != r7) goto L_0x00c7
            com.tencent.mm.plugin.handoff.model.HandOffMG r17 = new com.tencent.mm.plugin.handoff.model.HandOffMG     // Catch:{ Exception -> 0x0101 }
            java.lang.String r6 = r5.f259566d     // Catch:{ Exception -> 0x0101 }
            if (r6 != 0) goto L_0x00a7
            r8 = r4
            goto L_0x00a8
        L_0x00a7:
            r8 = r6
        L_0x00a8:
            java.lang.String r9 = ""
            java.lang.String r5 = r5.f259567e     // Catch:{ Exception -> 0x0101 }
            if (r5 != 0) goto L_0x00b0
            r10 = r4
            goto L_0x00b1
        L_0x00b0:
            r10 = r5
        L_0x00b1:
            r11 = 2
            r12 = 0
            r13 = 0
            java.lang.String r14 = r1.field_id     // Catch:{ Exception -> 0x0101 }
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x0101 }
            r4 = 192(0xc0, float:2.69E-43)
            r16 = 0
            r5 = r17
            r6 = r3
            r7 = r0
            r0 = r15
            r15 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0101 }
            goto L_0x00ee
        L_0x00c7:
            com.tencent.mm.plugin.handoff.model.HandOffMP r17 = new com.tencent.mm.plugin.handoff.model.HandOffMP     // Catch:{ Exception -> 0x0101 }
            java.lang.String r6 = r5.f259566d     // Catch:{ Exception -> 0x0101 }
            if (r6 != 0) goto L_0x00cf
            r8 = r4
            goto L_0x00d0
        L_0x00cf:
            r8 = r6
        L_0x00d0:
            java.lang.String r9 = ""
            java.lang.String r5 = r5.f259567e     // Catch:{ Exception -> 0x0101 }
            if (r5 != 0) goto L_0x00d8
            r10 = r4
            goto L_0x00d9
        L_0x00d8:
            r10 = r5
        L_0x00d9:
            r11 = 2
            r12 = 0
            r13 = 0
            java.lang.String r14 = r1.field_id     // Catch:{ Exception -> 0x0101 }
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x0101 }
            r4 = 192(0xc0, float:2.69E-43)
            r16 = 0
            r5 = r17
            r6 = r3
            r7 = r0
            r0 = r15
            r15 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0101 }
        L_0x00ee:
            r4 = r17
        L_0x00f0:
            if (r4 == 0) goto L_0x0100
            java.lang.String r3 = r1.field_id     // Catch:{ Exception -> 0x0101 }
            gy3.C87412m.m108593f(r3, r0)     // Catch:{ Exception -> 0x0101 }
            r4.setKey(r3)     // Catch:{ Exception -> 0x0101 }
            r5 = r18
            r4.setCreateTime(r5)     // Catch:{ Exception -> 0x0101 }
            r2 = r4
        L_0x0100:
            return r2
        L_0x0101:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parse multiTaskInfo[id:"
            r3.append(r4)
            java.lang.String r4 = r1.field_id
            r3.append(r4)
            java.lang.String r4 = ", type:"
            r3.append(r4)
            int r1 = r1.field_type
            r3.append(r1)
            java.lang.String r1 = "] fail:"
            r3.append(r1)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "MicroMsg.BallHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g02.C98064a.mo137360b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo):com.tencent.mm.plugin.handoff.model.HandOff");
    }
}

package pe2;

import com.tencent.p014mm.autogen.mmdata.rpt.PreloadClientReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import i21.C98590g;
import ke2.C99129c;
import kj2.C117407d;
import te2.C101750g;
import xe2.C102630a;

@C86522b
/* renamed from: pe2.b */
public final class C100783b extends C86301e implements C98590g {
    /* renamed from: Bl */
    public void mo137959Bl(long j, String str, boolean z, long j2) {
        C87412m.m108594g(str, "fromUser");
        PreloadClientReportStruct preloadClientReportStruct = new PreloadClientReportStruct();
        preloadClientReportStruct.f265765d = 3;
        preloadClientReportStruct.f265766e = 4;
        preloadClientReportStruct.mo126623s(str);
        preloadClientReportStruct.mo126624t(String.valueOf(j));
        long j3 = 1;
        preloadClientReportStruct.f265770i = 1;
        preloadClientReportStruct.f265774m = j2 / ((long) 1000);
        if (z) {
            j3 = 2;
        }
        preloadClientReportStruct.f265773l = j3;
        if (C101750g.f297828a.mo141183c(4, str) != 0) {
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C102630a d3 = cVar.f290673z.mo142287d3(j + "_4");
            if (!(d3 == null || d3.mo142481v2() == d3.mo142475q2())) {
                preloadClientReportStruct.f265770i = 2;
                preloadClientReportStruct.f265773l = 2;
            }
        }
        String p = preloadClientReportStruct.mo1005p();
        Log.m105925i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C file receive:%s", p);
        C117407d.INSTANCE.kvStat(27004, p);
    }

    /* renamed from: DO */
    public void mo137960DO(long j, String str, long j2, long j3, long j4) {
        C87412m.m108594g(str, "fromUser");
        PreloadClientReportStruct preloadClientReportStruct = new PreloadClientReportStruct();
        preloadClientReportStruct.f265765d = 1;
        preloadClientReportStruct.f265766e = 4;
        preloadClientReportStruct.mo126623s(str);
        preloadClientReportStruct.mo126624t(String.valueOf(j));
        preloadClientReportStruct.f265770i = j2;
        preloadClientReportStruct.f265773l = j3;
        preloadClientReportStruct.f265774m = j4 / ((long) 1000);
        String p = preloadClientReportStruct.mo1005p();
        Log.m105925i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C file click:%s", p);
        C117407d.INSTANCE.kvStat(27004, p);
    }

    /* renamed from: JT */
    public void mo137961JT(long j, long j2, String str, long j3, long j4, long j5, long j6) {
        String str2 = str;
        C87412m.m108594g(str, "fromUser");
        PreloadClientReportStruct preloadClientReportStruct = new PreloadClientReportStruct();
        preloadClientReportStruct.f265765d = 11;
        preloadClientReportStruct.f265766e = j;
        preloadClientReportStruct.mo126623s(str);
        preloadClientReportStruct.mo126624t(String.valueOf(j2));
        preloadClientReportStruct.f265771j = j3;
        preloadClientReportStruct.f265772k = j4;
        preloadClientReportStruct.f265774m = j6 / ((long) 1000);
        preloadClientReportStruct.f265775n = j5;
        String p = preloadClientReportStruct.mo1005p();
        Log.m105925i("MicroMsg.PreloadReportFeatureService", "report 27004 c2c msg pre download start:%s", p);
        C117407d.INSTANCE.kvStat(27004, p);
    }

    /* renamed from: Mq */
    public void mo137962Mq(long j, String str, long j2, long j3, boolean z, long j4, boolean z2) {
        String str2 = str;
        C87412m.m108594g(str, "fromUser");
        PreloadClientReportStruct preloadClientReportStruct = new PreloadClientReportStruct();
        long j5 = 1;
        preloadClientReportStruct.f265765d = z2 ? 4 : 1;
        if (z) {
            j5 = 2;
        }
        preloadClientReportStruct.f265766e = j5;
        preloadClientReportStruct.mo126623s(str);
        preloadClientReportStruct.mo126624t(String.valueOf(j));
        preloadClientReportStruct.f265770i = j2;
        preloadClientReportStruct.f265773l = j3;
        preloadClientReportStruct.f265774m = j4 / ((long) 1000);
        String p = preloadClientReportStruct.mo1005p();
        Log.m105925i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C image click:%s", p);
        C117407d.INSTANCE.kvStat(27004, p);
    }

    public void bq0(long j, long j2, String str, long j3, long j4, long j5, long j6) {
        String str2 = str;
        C87412m.m108594g(str, "fromUser");
        PreloadClientReportStruct preloadClientReportStruct = new PreloadClientReportStruct();
        preloadClientReportStruct.f265765d = 12;
        preloadClientReportStruct.f265766e = j;
        preloadClientReportStruct.mo126623s(str);
        preloadClientReportStruct.mo126624t(String.valueOf(j2));
        preloadClientReportStruct.f265771j = j3;
        preloadClientReportStruct.f265772k = j4;
        preloadClientReportStruct.f265774m = j6 / ((long) 1000);
        preloadClientReportStruct.f265775n = j5;
        String p = preloadClientReportStruct.mo1005p();
        Log.m105925i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C msg pre download end:%s", p);
        C117407d.INSTANCE.kvStat(27004, p);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r0 != 7) goto L_0x007f;
     */
    /* renamed from: pp */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137964pp(long r20, java.lang.String r22, long r23, long r25, long r27, boolean r29) {
        /*
            r19 = this;
            r0 = r22
            java.lang.String r1 = "fromUser"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct
            r1.<init>()
            r2 = 4
            r4 = 1
            if (r29 == 0) goto L_0x0014
            r6 = r2
            goto L_0x0015
        L_0x0014:
            r6 = r4
        L_0x0015:
            r1.f265765d = r6
            r6 = 3
            r1.f265766e = r6
            r1.mo126623s(r0)
            java.lang.String r8 = java.lang.String.valueOf(r20)
            r1.mo126624t(r8)
            te2.g$b r8 = te2.C101750g.f297828a
            r9 = 3
            int r0 = r8.mo141183c(r9, r0)
            r8 = 1
            r10 = -1
            if (r0 != 0) goto L_0x0033
            r2 = r10
            goto L_0x0080
        L_0x0033:
            java.lang.Class<ke2.c> r0 = ke2.C99129c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            xe2.b r0 = r0.f290673z
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = r20
            r12.append(r13)
            java.lang.String r13 = "_3"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            xe2.a r0 = r0.mo142287d3(r12)
            if (r0 == 0) goto L_0x007f
            int r12 = r0.getStatus()
            r13 = 2
            if (r12 != r8) goto L_0x006e
            long r15 = r0.mo142481v2()
            long r17 = r0.mo142475q2()
            int r12 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x006e
            goto L_0x007d
        L_0x006e:
            int r0 = r0.getStatus()
            r12 = 2
            if (r0 == r12) goto L_0x007d
            if (r0 == r9) goto L_0x007b
            r6 = 7
            if (r0 == r6) goto L_0x0080
            goto L_0x007f
        L_0x007b:
            r2 = r6
            goto L_0x0080
        L_0x007d:
            r2 = r13
            goto L_0x0080
        L_0x007f:
            r2 = r4
        L_0x0080:
            r1.f265770i = r2
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r4 = r27 / r4
            r1.f265774m = r4
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            r2 = r23
            r1.f265770i = r2
        L_0x0091:
            r2 = r25
            r1.f265773l = r2
            java.lang.String r0 = r1.mo1005p()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "MicroMsg.PreloadReportFeatureService"
            java.lang.String r3 = "report 27004 C2C video click:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 27004(0x697c, float:3.784E-41)
            r1.kvStat(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe2.C100783b.mo137964pp(long, java.lang.String, long, long, long, boolean):void");
    }
}

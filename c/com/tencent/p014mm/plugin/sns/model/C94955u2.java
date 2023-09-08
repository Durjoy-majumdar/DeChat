package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.sns.model.u2 */
public final class C94955u2 {

    /* renamed from: e */
    public static final C94956a f275271e = new C94956a((C8480h) null);

    /* renamed from: a */
    public final String f275272a;

    /* renamed from: b */
    public long f275273b;

    /* renamed from: c */
    public long f275274c;

    /* renamed from: d */
    public int f275275d;

    /* renamed from: com.tencent.mm.plugin.sns.model.u2$a */
    public static final class C94956a {

        /* renamed from: com.tencent.mm.plugin.sns.model.u2$a$a */
        public static final class C94957a extends C87413o implements C32224a<C94955u2> {

            /* renamed from: d */
            public static final C94957a f275276d = new C94957a();

            public C94957a() {
                super(0);
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion$analyzeWsFoldData$result$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion$analyzeWsFoldData$result$2");
                C94955u2 u2Var = new C94955u2("", -1, -1, 0);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion$analyzeWsFoldData$result$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion$analyzeWsFoldData$result$2");
                return u2Var;
            }
        }

        public C94956a(C8480h hVar) {
        }

        /* JADX WARNING: type inference failed for: r9v2, types: [com.tencent.mm.plugin.sns.model.u2$a$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.sns.model.C94955u2 mo131291a(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = "analyzeWsFoldData"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.WsFoldData$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "[analyzeWsFoldData] content = "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.SnsWsFoldManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                if (r11 == 0) goto L_0x005e
                java.lang.String r2 = ","
                java.lang.String[] r4 = new java.lang.String[]{r2}
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                java.util.List r11 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)
                com.tencent.mm.plugin.sns.model.u2 r9 = new com.tencent.mm.plugin.sns.model.u2
                r2 = 0
                java.lang.Object r2 = r11.get(r2)
                r3 = r2
                java.lang.String r3 = (java.lang.String) r3
                r2 = 1
                java.lang.Object r2 = r11.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                long r4 = java.lang.Long.parseLong(r2)
                r2 = 2
                java.lang.Object r2 = r11.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                long r6 = java.lang.Long.parseLong(r2)
                r2 = 3
                java.lang.Object r11 = r11.get(r2)
                java.lang.String r11 = (java.lang.String) r11
                int r8 = java.lang.Integer.parseInt(r11)
                r2 = r9
                r2.<init>(r3, r4, r6, r8)
                goto L_0x0060
            L_0x005e:
                com.tencent.mm.plugin.sns.model.u2$a$a r9 = com.tencent.p014mm.plugin.sns.model.C94955u2.C94956a.C94957a.f275276d
            L_0x0060:
                java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.WsFoldData"
                gy3.C87412m.m108592e(r9, r11)
                com.tencent.mm.plugin.sns.model.u2 r9 = (com.tencent.p014mm.plugin.sns.model.C94955u2) r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94955u2.C94956a.mo131291a(java.lang.String):com.tencent.mm.plugin.sns.model.u2");
        }
    }

    public C94955u2(String str, long j, long j2, int i) {
        C87412m.m108594g(str, "userName");
        this.f275272a = str;
        this.f275273b = j;
        this.f275274c = j2;
        this.f275275d = i;
    }

    /* renamed from: a */
    public final int mo131286a() {
        SnsMethodCalculate.markStartTimeMs("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        int i = this.f275275d;
        SnsMethodCalculate.markEndTimeMs("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return i;
    }

    /* renamed from: b */
    public final void mo131287b(long j) {
        SnsMethodCalculate.markStartTimeMs("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f275273b = j;
        SnsMethodCalculate.markEndTimeMs("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return true;
        } else if (!(obj instanceof C94955u2)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        } else {
            C94955u2 u2Var = (C94955u2) obj;
            if (!C87412m.m108589b(this.f275272a, u2Var.f275272a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
                return false;
            } else if (this.f275273b != u2Var.f275273b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
                return false;
            } else if (this.f275274c != u2Var.f275274c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
                return false;
            } else {
                int i = this.f275275d;
                int i2 = u2Var.f275275d;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        long j = this.f275273b;
        long j2 = this.f275274c;
        int hashCode = (((((this.f275272a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f275275d;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        String str = this.f275272a + ',' + this.f275273b + ',' + this.f275274c + ',' + this.f275275d;
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return str;
    }
}

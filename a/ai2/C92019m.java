package ai2;

import android.graphics.Matrix;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p213oh.C11412b;
import pe3.C47465a;
import te3.C101807lr2;

/* renamed from: ai2.m */
public final class C92019m extends C92007a {

    /* renamed from: g */
    public String f263459g;

    /* renamed from: h */
    public String f263460h;

    /* renamed from: i */
    public float f263461i;

    /* renamed from: j */
    public float f263462j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92019m(String str, String str2, float f, float f2, Matrix matrix) {
        super(C92011d.f263438g);
        C87412m.m108594g(str, "cityName");
        C87412m.m108594g(str2, "poiName");
        C87412m.m108594g(matrix, "matrix");
        this.f263459g = str;
        this.f263460h = str2;
        this.f263462j = f2;
        this.f263461i = f;
        this.f263407f = matrix;
        String mVar = toString();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.LocationItem", mVar, (Object[]) null);
    }

    public C47465a toProtoBuf() {
        C101807lr2 lr22 = new C101807lr2();
        lr22.f298721d = this.f263459g;
        lr22.f298722e = this.f263460h;
        lr22.f298723f = mo125864f(this.f263407f);
        lr22.f298724g = this.f263461i;
        lr22.f298725h = this.f263462j;
        return lr22;
    }

    public String toString() {
        return '[' + hashCode() + "]poiName:" + this.f263460h + " cityName:" + this.f263459g;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ IOException -> 0x006e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92019m(te3.C64339ea r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.LocationItem"
            java.lang.String r1 = "proto"
            gy3.C87412m.m108594g(r7, r1)
            ai2.d r1 = ai2.C92011d.TEXT
            r6.<init>(r1)
            java.lang.String r1 = ""
            r6.f263459g = r1
            r6.f263460h = r1
            r2 = 0
            te3.lr2 r3 = new te3.lr2     // Catch:{ IOException -> 0x006e }
            r3.<init>()     // Catch:{ IOException -> 0x006e }
            te3.qv3 r7 = r7.f182948e     // Catch:{ IOException -> 0x006e }
            pe3.b r7 = r7.f140574f     // Catch:{ IOException -> 0x006e }
            byte[] r7 = r7.f257327a     // Catch:{ IOException -> 0x006e }
            r4 = 0
            if (r7 != 0) goto L_0x0024
        L_0x0022:
            r3 = r4
            goto L_0x0035
        L_0x0024:
            r3.parseFrom(r7)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0035
        L_0x0028:
            r7 = move-exception
            java.lang.String r3 = "safeParser"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x006e }
            r5[r2] = r7     // Catch:{ IOException -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r1, r5)     // Catch:{ IOException -> 0x006e }
            goto L_0x0022
        L_0x0035:
            if (r3 == 0) goto L_0x0064
            java.lang.String r7 = r3.f298721d     // Catch:{ IOException -> 0x006e }
            java.lang.String r1 = "it.cityName"
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ IOException -> 0x006e }
            r6.f263459g = r7     // Catch:{ IOException -> 0x006e }
            java.lang.String r7 = r3.f298722e     // Catch:{ IOException -> 0x006e }
            java.lang.String r1 = "it.poiName"
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ IOException -> 0x006e }
            r6.f263460h = r7     // Catch:{ IOException -> 0x006e }
            float r7 = r3.f298724g     // Catch:{ IOException -> 0x006e }
            r6.f263461i = r7     // Catch:{ IOException -> 0x006e }
            float r7 = r3.f298725h     // Catch:{ IOException -> 0x006e }
            r6.f263462j = r7     // Catch:{ IOException -> 0x006e }
            android.graphics.Matrix r7 = r6.f263407f     // Catch:{ IOException -> 0x006e }
            te3.wr4 r1 = r3.f298723f     // Catch:{ IOException -> 0x006e }
            java.lang.String r3 = "it.matrix"
            gy3.C87412m.m108593f(r1, r3)     // Catch:{ IOException -> 0x006e }
            float[] r1 = r6.mo125865g(r1)     // Catch:{ IOException -> 0x006e }
            r7.setValues(r1)     // Catch:{ IOException -> 0x006e }
        L_0x0064:
            java.lang.String r7 = r6.toString()     // Catch:{ IOException -> 0x006e }
            int r1 = p213oh.C11412b.f33577a     // Catch:{ IOException -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r4)     // Catch:{ IOException -> 0x006e }
            goto L_0x0078
        L_0x006e:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = p213oh.C11412b.f33577a
            java.lang.String r2 = "LocationItem parse error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r2, r1)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai2.C92019m.<init>(te3.ea):void");
    }
}

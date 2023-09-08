package ai2;

import android.graphics.Matrix;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import p213oh.C11412b;
import pe3.C47465a;
import te3.C101805l70;

/* renamed from: ai2.f */
public final class C92012f extends C92007a {

    /* renamed from: g */
    public IEmojiInfo f263446g;

    /* renamed from: h */
    public Matrix f263447h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C92012f(IEmojiInfo iEmojiInfo, Matrix matrix, Matrix matrix2, int i, C8480h hVar) {
        this(iEmojiInfo, (i & 2) != 0 ? new Matrix() : matrix, (i & 4) != 0 ? new Matrix() : matrix2);
    }

    public C47465a toProtoBuf() {
        String str;
        String name;
        C101805l70 l702 = new C101805l70();
        IEmojiInfo iEmojiInfo = this.f263446g;
        String str2 = "";
        if (iEmojiInfo == null || (str = iEmojiInfo.getMd5()) == null) {
            str = str2;
        }
        l702.f298709d = str;
        IEmojiInfo iEmojiInfo2 = this.f263446g;
        if (!(iEmojiInfo2 == null || (name = iEmojiInfo2.getName()) == null)) {
            str2 = name;
        }
        l702.f298710e = str2;
        l702.f298711f = mo125864f(this.f263407f);
        l702.f298712g = mo125864f(this.f263447h);
        l702.f298713h = mo125863e();
        return l702;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(hashCode());
        sb.append("]md5:");
        IEmojiInfo iEmojiInfo = this.f263446g;
        String str = null;
        sb.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        sb.append(" name:");
        IEmojiInfo iEmojiInfo2 = this.f263446g;
        if (iEmojiInfo2 != null) {
            str = iEmojiInfo2.getName();
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92012f(IEmojiInfo iEmojiInfo, Matrix matrix, Matrix matrix2) {
        super(C92011d.EMOJI);
        C87412m.m108594g(matrix, "showMatrix");
        C87412m.m108594g(matrix2, "editorMatrix");
        Matrix matrix3 = new Matrix();
        this.f263447h = matrix3;
        this.f263446g = iEmojiInfo;
        matrix3.set(matrix);
        this.f263407f.set(matrix2);
        String fVar = toString();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.EmojiItem", fVar, (Object[]) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[Catch:{ IOException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92012f(te3.C64339ea r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.EmojiItem"
            java.lang.String r1 = "proto"
            gy3.C87412m.m108594g(r9, r1)
            ai2.d r1 = ai2.C92011d.EMOJI
            r8.<init>(r1)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r8.f263447h = r1
            r1 = 0
            te3.l70 r2 = new te3.l70     // Catch:{ IOException -> 0x0082 }
            r2.<init>()     // Catch:{ IOException -> 0x0082 }
            te3.qv3 r9 = r9.f182948e     // Catch:{ IOException -> 0x0082 }
            pe3.b r9 = r9.f140574f     // Catch:{ IOException -> 0x0082 }
            byte[] r9 = r9.f257327a     // Catch:{ IOException -> 0x0082 }
            r3 = 0
            if (r9 != 0) goto L_0x0024
            goto L_0x0036
        L_0x0024:
            r2.parseFrom(r9)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0037
        L_0x0028:
            r9 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.String r4 = ""
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0082 }
            r5[r1] = r9     // Catch:{ IOException -> 0x0082 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r5)     // Catch:{ IOException -> 0x0082 }
        L_0x0036:
            r2 = r3
        L_0x0037:
            if (r2 == 0) goto L_0x008c
            java.lang.Class<bq.z0> r9 = p008bq.C92293z0.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ IOException -> 0x0082 }
            bq.z0 r9 = (p008bq.C92293z0) r9     // Catch:{ IOException -> 0x0082 }
            java.lang.String r4 = r2.f298709d     // Catch:{ IOException -> 0x0082 }
            com.tencent.mm.api.IEmojiInfo r9 = r9.mo126035H2(r4)     // Catch:{ IOException -> 0x0082 }
            r8.f263446g = r9     // Catch:{ IOException -> 0x0082 }
            android.graphics.Matrix r9 = r8.f263447h     // Catch:{ IOException -> 0x0082 }
            te3.wr4 r4 = r2.f298712g     // Catch:{ IOException -> 0x0082 }
            java.lang.String r5 = "it.showMatrix"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ IOException -> 0x0082 }
            float[] r4 = r8.mo125865g(r4)     // Catch:{ IOException -> 0x0082 }
            r9.setValues(r4)     // Catch:{ IOException -> 0x0082 }
            android.graphics.Matrix r9 = r8.f263407f     // Catch:{ IOException -> 0x0082 }
            te3.wr4 r4 = r2.f298711f     // Catch:{ IOException -> 0x0082 }
            java.lang.String r5 = "it.editorMatrix"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ IOException -> 0x0082 }
            float[] r4 = r8.mo125865g(r4)     // Catch:{ IOException -> 0x0082 }
            r9.setValues(r4)     // Catch:{ IOException -> 0x0082 }
            te3.d70 r9 = r2.f298713h     // Catch:{ IOException -> 0x0082 }
            if (r9 == 0) goto L_0x0078
            ci2.d r2 = r8.f263404c     // Catch:{ IOException -> 0x0082 }
            long r4 = r9.f298084d     // Catch:{ IOException -> 0x0082 }
            long r6 = r9.f298085e     // Catch:{ IOException -> 0x0082 }
            r2.mo146050d(r4, r6)     // Catch:{ IOException -> 0x0082 }
        L_0x0078:
            java.lang.String r9 = r8.toString()     // Catch:{ IOException -> 0x0082 }
            int r2 = p213oh.C11412b.f33577a     // Catch:{ IOException -> 0x0082 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r3)     // Catch:{ IOException -> 0x0082 }
            goto L_0x008c
        L_0x0082:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = p213oh.C11412b.f33577a
            java.lang.String r2 = "EmojiItem parse error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r2, r1)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai2.C92012f.<init>(te3.ea):void");
    }
}

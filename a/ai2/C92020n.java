package ai2;

import android.graphics.Matrix;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import pe3.C47465a;
import te3.C48900bs2;
import te3.C49044cs2;
import te3.wr4;

/* renamed from: ai2.n */
public final class C92020n extends C92007a {

    /* renamed from: g */
    public ArrayList<C49044cs2> f263463g;

    /* renamed from: h */
    public long f263464h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92020n(List<? extends C49044cs2> list, Matrix matrix) {
        super(C92011d.LYRICS);
        C87412m.m108594g(list, "lyricsInfo");
        C87412m.m108594g(matrix, "matrix");
        ArrayList<C49044cs2> arrayList = new ArrayList<>();
        this.f263463g = arrayList;
        arrayList.clear();
        this.f263463g.addAll(list);
        this.f263407f.set(matrix);
    }

    /* renamed from: i */
    public final void mo125920i(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C49044cs2> arrayList2 = this.f263463g;
        ArrayList arrayList3 = new ArrayList();
        for (T next : arrayList2) {
            if (((C49044cs2) next).f131929e < j) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
        this.f263463g.clear();
        this.f263463g.addAll(arrayList);
    }

    public C47465a toProtoBuf() {
        C48900bs2 bs22 = new C48900bs2();
        float[] fArr = new float[9];
        wr4 wr4 = new wr4();
        this.f263407f.getValues(fArr);
        for (int i = 0; i < 9; i++) {
            wr4.f144239d.add(Float.valueOf(fArr[i]));
        }
        bs22.f131285d.addAll(this.f263463g);
        bs22.f131286e = wr4;
        bs22.f131287f = this.f263464h;
        return bs22;
    }

    public String toString() {
        return '[' + hashCode() + "]lyrics size:" + this.f263463g.size();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C92020n(List<? extends C49044cs2> list, long j) {
        this(list, new Matrix());
        C87412m.m108594g(list, "lyricsInfo");
        this.f263464h = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ IOException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92020n(te3.C64339ea r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.LyricsItem"
            java.lang.String r1 = "proto"
            gy3.C87412m.m108594g(r7, r1)
            ai2.d r1 = ai2.C92011d.LYRICS
            r6.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f263463g = r1
            r1 = 0
            te3.bs2 r2 = new te3.bs2     // Catch:{ IOException -> 0x0063 }
            r2.<init>()     // Catch:{ IOException -> 0x0063 }
            te3.qv3 r7 = r7.f182948e     // Catch:{ IOException -> 0x0063 }
            pe3.b r7 = r7.f140574f     // Catch:{ IOException -> 0x0063 }
            byte[] r7 = r7.f257327a     // Catch:{ IOException -> 0x0063 }
            r3 = 0
            if (r7 != 0) goto L_0x0025
        L_0x0023:
            r2 = r3
            goto L_0x0038
        L_0x0025:
            r2.parseFrom(r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0038
        L_0x0029:
            r7 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.String r4 = ""
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0063 }
            r5[r1] = r7     // Catch:{ IOException -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r5)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0023
        L_0x0038:
            if (r2 == 0) goto L_0x006b
            java.util.ArrayList<te3.cs2> r7 = r6.f263463g     // Catch:{ IOException -> 0x0063 }
            r7.clear()     // Catch:{ IOException -> 0x0063 }
            java.util.ArrayList<te3.cs2> r7 = r6.f263463g     // Catch:{ IOException -> 0x0063 }
            java.util.LinkedList<te3.cs2> r3 = r2.f131285d     // Catch:{ IOException -> 0x0063 }
            r7.addAll(r3)     // Catch:{ IOException -> 0x0063 }
            android.graphics.Matrix r7 = r6.f263407f     // Catch:{ IOException -> 0x0063 }
            te3.wr4 r3 = r2.f131286e     // Catch:{ IOException -> 0x0063 }
            java.lang.String r4 = "it.matrix"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ IOException -> 0x0063 }
            float[] r3 = r6.mo125865g(r3)     // Catch:{ IOException -> 0x0063 }
            r7.setValues(r3)     // Catch:{ IOException -> 0x0063 }
            long r2 = r2.f131287f     // Catch:{ IOException -> 0x0063 }
            r6.f263464h = r2     // Catch:{ IOException -> 0x0063 }
            java.lang.String r7 = r6.toString()     // Catch:{ IOException -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ IOException -> 0x0063 }
            goto L_0x006b
        L_0x0063:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "LocationItem parse error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r2, r1)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai2.C92020n.<init>(te3.ea):void");
    }
}

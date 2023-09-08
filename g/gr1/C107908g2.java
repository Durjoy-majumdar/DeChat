package gr1;

import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import r80.C110538r;
import s80.C110779b;

/* renamed from: gr1.g2 */
public final class C107908g2 extends C110538r {

    /* renamed from: n0 */
    public final String f323098n0 = "Finder.FinderVideoRemuxer";

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107908g2(java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, android.graphics.Rect r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, long r41, long r43, boolean r45, boolean r46, int r47, int r48, boolean r49, int r50, fy3.C32226l<? super java.lang.Float, rx3.C13598b0> r51, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r52, int r53, int r54) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r40
            r15 = r41
            r17 = r43
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r6 = r53
            r7 = r54
            r27 = r0
            java.lang.String r0 = "filePath"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "outputFilePath"
            r1 = r32
            gy3.C87412m.m108594g(r1, r0)
            r1 = r29
            r0 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "Finder.FinderVideoRemuxer"
            r1 = r28
            r1.f323098n0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C107908g2.<init>(java.lang.String, java.lang.String, int, java.lang.String, android.graphics.Rect, int, int, int, int, int, int, int, long, long, boolean, boolean, int, int, boolean, int, fy3.l, fy3.l, int, int):void");
    }

    /* renamed from: i */
    public C110779b mo158336i() {
        C107907f2 f2Var = this.f330604o ? new C107907f2(this.f330613x, this.f330614y, this.f330591h, this.f330593i, 2, 4) : new C107907f2(this.f330613x, this.f330614y, this.f330591h, this.f330593i, 1, 4);
        Rect rect = this.f330585e;
        C87412m.m108591d(rect);
        f2Var.f331401u = rect;
        int i = this.f330587f;
        int i2 = this.f330589g;
        f2Var.f323096w = i;
        f2Var.f323097x = i2;
        String str = f2Var.f323095v;
        Log.m105924i(str, "setVideoSize: " + i + ", " + i2);
        String str2 = this.f323098n0;
        Log.m105924i(str2, "videoWidth: " + this.f330587f + ", videoHeight: " + this.f330589g + ", cropRect:" + this.f330585e);
        return f2Var;
    }
}

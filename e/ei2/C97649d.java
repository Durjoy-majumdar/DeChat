package ei2;

import bi2.C92262a;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;

/* renamed from: ei2.d */
public final class C97649d {

    /* renamed from: a */
    public float[] f286431a;

    /* renamed from: b */
    public float[] f286432b;

    /* renamed from: c */
    public List<C92262a> f286433c;

    /* renamed from: d */
    public int f286434d;

    /* renamed from: e */
    public int f286435e;

    /* renamed from: f */
    public int f286436f;

    /* renamed from: g */
    public int f286437g;

    /* renamed from: h */
    public int f286438h;

    /* renamed from: i */
    public boolean f286439i;

    /* renamed from: j */
    public String f286440j;

    public C97649d(float[] fArr, float[] fArr2, List<C92262a> list, int i, int i2, int i3, int i4, int i5, boolean z, String str) {
        C87412m.m108594g(fArr, "drawingRect");
        C87412m.m108594g(list, "editorItems");
        C87412m.m108594g(str, "blurBgPath");
        this.f286431a = fArr;
        this.f286432b = fArr2;
        this.f286433c = list;
        this.f286434d = i;
        this.f286435e = i2;
        this.f286436f = i3;
        this.f286437g = i4;
        this.f286438h = i5;
        this.f286439i = z;
        this.f286440j = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97649d)) {
            return false;
        }
        C97649d dVar = (C97649d) obj;
        return C87412m.m108589b(this.f286431a, dVar.f286431a) && C87412m.m108589b(this.f286432b, dVar.f286432b) && C87412m.m108589b(this.f286433c, dVar.f286433c) && this.f286434d == dVar.f286434d && this.f286435e == dVar.f286435e && this.f286436f == dVar.f286436f && this.f286437g == dVar.f286437g && this.f286438h == dVar.f286438h && this.f286439i == dVar.f286439i && C87412m.m108589b(this.f286440j, dVar.f286440j);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f286431a) * 31;
        float[] fArr = this.f286432b;
        int hashCode2 = (((((((((((((hashCode + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + this.f286433c.hashCode()) * 31) + this.f286434d) * 31) + this.f286435e) * 31) + this.f286436f) * 31) + this.f286437g) * 31) + this.f286438h) * 31;
        boolean z = this.f286439i;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f286440j.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("RetrieverData(drawingRect=");
        String arrays = Arrays.toString(this.f286431a);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", validRect=");
        float[] fArr = this.f286432b;
        if (fArr != null) {
            str = Arrays.toString(fArr);
            C87412m.m108593f(str, "toString(this)");
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", editorItems=");
        sb.append(this.f286433c);
        sb.append(", width=");
        sb.append(this.f286434d);
        sb.append(", height=");
        sb.append(this.f286435e);
        sb.append(", videoWidth=");
        sb.append(this.f286436f);
        sb.append(", videoHeight=");
        sb.append(this.f286437g);
        sb.append(", rotate=");
        sb.append(this.f286438h);
        sb.append(", isForMix=");
        sb.append(this.f286439i);
        sb.append(", blurBgPath='");
        sb.append(this.f286440j);
        sb.append("')");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C97649d(float[] r14, float[] r15, java.util.List r16, int r17, int r18, int r19, int r20, int r21, boolean r22, java.lang.String r23, int r24, gy3.C8480h r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r4 = r1
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r1 = 0
            r11 = 0
            goto L_0x0013
        L_0x0011:
            r11 = r22
        L_0x0013:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = ""
            r12 = r0
            goto L_0x001d
        L_0x001b:
            r12 = r23
        L_0x001d:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.C97649d.<init>(float[], float[], java.util.List, int, int, int, int, int, boolean, java.lang.String, int, gy3.h):void");
    }
}

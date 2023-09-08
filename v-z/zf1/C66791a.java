package zf1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: zf1.a */
public final class C66791a {

    /* renamed from: a */
    public final ArrayList<Integer> f191888a;

    /* renamed from: b */
    public final int f191889b;

    /* renamed from: c */
    public final byte[] f191890c;

    /* renamed from: d */
    public final FinderObject f191891d;

    public C66791a(ArrayList<Integer> arrayList, int i, byte[] bArr, FinderObject finderObject) {
        C87412m.m108594g(arrayList, "tabList");
        this.f191888a = arrayList;
        this.f191889b = i;
        this.f191890c = bArr;
        this.f191891d = finderObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66791a)) {
            return false;
        }
        C66791a aVar = (C66791a) obj;
        return C87412m.m108589b(this.f191888a, aVar.f191888a) && this.f191889b == aVar.f191889b && C87412m.m108589b(this.f191890c, aVar.f191890c) && C87412m.m108589b(this.f191891d, aVar.f191891d);
    }

    public int hashCode() {
        int hashCode = ((this.f191888a.hashCode() * 31) + this.f191889b) * 31;
        byte[] bArr = this.f191890c;
        int i = 0;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        FinderObject finderObject = this.f191891d;
        if (finderObject != null) {
            i = finderObject.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ConfigData(tabList=" + this.f191888a + ", bizScene=" + this.f191889b + ", extBuff=" + Arrays.toString(this.f191890c) + ", lastSelectedObject=" + this.f191891d + ')';
    }
}

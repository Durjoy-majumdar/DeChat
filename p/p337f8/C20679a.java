package p337f8;

import java.util.ArrayList;
import java.util.List;
import p333e8.C20530d;
import p333e8.C20537k;
import p333e8.C20541m;
import p396x6.C23015n;

/* renamed from: f8.a */
public final class C20679a {

    /* renamed from: a */
    public final List<byte[]> f58427a;

    /* renamed from: b */
    public final int f58428b;

    /* renamed from: c */
    public final int f58429c;

    /* renamed from: d */
    public final int f58430d;

    /* renamed from: e */
    public final float f58431e;

    public C20679a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f58427a = list;
        this.f58428b = i;
        this.f58429c = i2;
        this.f58430d = i3;
        this.f58431e = f;
    }

    /* renamed from: a */
    public static C20679a m22613a(C20541m mVar) {
        float f;
        int i;
        int i2;
        try {
            mVar.mo32114y(4);
            int n = (mVar.mo32103n() & 3) + 1;
            if (n != 3) {
                ArrayList arrayList = new ArrayList();
                int n2 = mVar.mo32103n() & 31;
                for (int i3 = 0; i3 < n2; i3++) {
                    int s = mVar.mo32108s();
                    int i4 = mVar.f57810b;
                    mVar.mo32114y(s);
                    byte[] bArr = mVar.f57809a;
                    byte[] bArr2 = new byte[(s + 4)];
                    System.arraycopy(C20530d.f57774a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i4, bArr2, 4, s);
                    arrayList.add(bArr2);
                }
                int n3 = mVar.mo32103n();
                for (int i5 = 0; i5 < n3; i5++) {
                    int s2 = mVar.mo32108s();
                    int i6 = mVar.f57810b;
                    mVar.mo32114y(s2);
                    byte[] bArr3 = mVar.f57809a;
                    byte[] bArr4 = new byte[(s2 + 4)];
                    System.arraycopy(C20530d.f57774a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i6, bArr4, 4, s2);
                    arrayList.add(bArr4);
                }
                if (n2 > 0) {
                    C20537k.C20539b d = C20537k.m22257d((byte[]) arrayList.get(0), n, ((byte[]) arrayList.get(0)).length);
                    int i7 = d.f57796b;
                    int i8 = d.f57797c;
                    f = d.f57798d;
                    i2 = i7;
                    i = i8;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C20679a(arrayList, n, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C23015n("Error parsing AVC config", e);
        }
    }
}

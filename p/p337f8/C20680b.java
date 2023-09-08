package p337f8;

import java.util.Collections;
import java.util.List;
import p333e8.C20537k;
import p333e8.C20541m;
import p396x6.C23015n;

/* renamed from: f8.b */
public final class C20680b {

    /* renamed from: a */
    public final List<byte[]> f58432a;

    /* renamed from: b */
    public final int f58433b;

    public C20680b(List<byte[]> list, int i) {
        this.f58432a = list;
        this.f58433b = i;
    }

    /* renamed from: a */
    public static C20680b m22614a(C20541m mVar) {
        try {
            mVar.mo32114y(21);
            int n = mVar.mo32103n() & 3;
            int n2 = mVar.mo32103n();
            int i = mVar.f57810b;
            int i2 = 0;
            for (int i3 = 0; i3 < n2; i3++) {
                mVar.mo32114y(1);
                int s = mVar.mo32108s();
                for (int i4 = 0; i4 < s; i4++) {
                    int s2 = mVar.mo32108s();
                    i2 += s2 + 4;
                    mVar.mo32114y(s2);
                }
            }
            mVar.mo32113x(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < n2; i6++) {
                mVar.mo32114y(1);
                int s3 = mVar.mo32108s();
                for (int i7 = 0; i7 < s3; i7++) {
                    int s4 = mVar.mo32108s();
                    System.arraycopy(C20537k.f57788a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(mVar.f57809a, mVar.f57810b, bArr, i8, s4);
                    i5 = i8 + s4;
                    mVar.mo32114y(s4);
                }
            }
            return new C20680b(i2 == 0 ? null : Collections.singletonList(bArr), n + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C23015n("Error parsing HEVC config", e);
        }
    }
}

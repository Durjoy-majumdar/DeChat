package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fh0 */
public class C64365fh0 extends C47465a {

    /* renamed from: d */
    public int f183133d;

    /* renamed from: e */
    public C52271zj0 f183134e;

    /* renamed from: f */
    public float f183135f;

    /* renamed from: g */
    public C64494kj0 f183136g;

    /* renamed from: h */
    public LinkedList<C64775vi0> f183137h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64365fh0)) {
            return false;
        }
        C64365fh0 fh02 = (C64365fh0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183133d), Integer.valueOf(fh02.f183133d)) && C46238a.m51546a(this.f183134e, fh02.f183134e) && C46238a.m51546a(Float.valueOf(this.f183135f), Float.valueOf(fh02.f183135f)) && C46238a.m51546a(this.f183136g, fh02.f183136g) && C46238a.m51546a(this.f183137h, fh02.f183137h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183133d);
            C52271zj0 zj02 = this.f183134e;
            if (zj02 != null) {
                aVar.mo74322i(2, zj02.computeSize());
                this.f183134e.writeFields(aVar);
            }
            aVar.mo74317d(3, this.f183135f);
            C64494kj0 kj02 = this.f183136g;
            if (kj02 != null) {
                aVar.mo74322i(4, kj02.computeSize());
                this.f183136g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f183137h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183133d) + 0;
            C52271zj0 zj03 = this.f183134e;
            if (zj03 != null) {
                e += C52418a.m58682i(2, zj03.computeSize());
            }
            int d = e + C52418a.m58677d(3, this.f183135f);
            C64494kj0 kj03 = this.f183136g;
            if (kj03 != null) {
                d += C52418a.m58682i(4, kj03.computeSize());
            }
            return d + C52418a.m58680g(5, 8, this.f183137h);
        } else if (i == 2) {
            this.f183137h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64365fh0 fh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fh02.f183133d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52271zj0 zj04 = new C52271zj0();
                    if (bArr != null && bArr.length > 0) {
                        zj04.parseFrom(bArr);
                    }
                    fh02.f183134e = zj04;
                }
                return 0;
            } else if (intValue == 3) {
                fh02.f183135f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64494kj0 kj04 = new C64494kj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kj04.parseFrom(bArr2);
                    }
                    fh02.f183136g = kj04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C64775vi0 vi02 = new C64775vi0();
                    if (bArr3 != null && bArr3.length > 0) {
                        vi02.parseFrom(bArr3);
                    }
                    fh02.f183137h.add(vi02);
                }
                return 0;
            }
        }
    }
}

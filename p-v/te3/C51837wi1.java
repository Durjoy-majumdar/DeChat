package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wi1 */
public class C51837wi1 extends C47465a {

    /* renamed from: d */
    public int f144067d;

    /* renamed from: e */
    public C51978xi1 f144068e;

    /* renamed from: f */
    public LinkedList<C51978xi1> f144069f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51837wi1)) {
            return false;
        }
        C51837wi1 wi12 = (C51837wi1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144067d), Integer.valueOf(wi12.f144067d)) && C46238a.m51546a(this.f144068e, wi12.f144068e) && C46238a.m51546a(this.f144069f, wi12.f144069f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144067d);
            C51978xi1 xi12 = this.f144068e;
            if (xi12 != null) {
                aVar.mo74322i(2, xi12.computeSize());
                this.f144068e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f144069f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144067d) + 0;
            C51978xi1 xi13 = this.f144068e;
            if (xi13 != null) {
                e += C52418a.m58682i(2, xi13.computeSize());
            }
            return e + C52418a.m58680g(3, 8, this.f144069f);
        } else if (i == 2) {
            this.f144069f.clear();
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
            C51837wi1 wi12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wi12.f144067d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51978xi1 xi14 = new C51978xi1();
                    if (bArr != null && bArr.length > 0) {
                        xi14.parseFrom(bArr);
                    }
                    wi12.f144068e = xi14;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51978xi1 xi15 = new C51978xi1();
                    if (bArr2 != null && bArr2.length > 0) {
                        xi15.parseFrom(bArr2);
                    }
                    wi12.f144069f.add(xi15);
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sf0 */
public class C51235sf0 extends C47465a {

    /* renamed from: d */
    public int f141468d;

    /* renamed from: e */
    public C52145yo1 f141469e;

    /* renamed from: f */
    public C50110kc1 f141470f;

    /* renamed from: g */
    public C49040cr0 f141471g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51235sf0)) {
            return false;
        }
        C51235sf0 sf02 = (C51235sf0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141468d), Integer.valueOf(sf02.f141468d)) && C46238a.m51546a(this.f141469e, sf02.f141469e) && C46238a.m51546a(this.f141470f, sf02.f141470f) && C46238a.m51546a(this.f141471g, sf02.f141471g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141468d);
            C52145yo1 yo12 = this.f141469e;
            if (yo12 != null) {
                aVar.mo74322i(2, yo12.computeSize());
                this.f141469e.writeFields(aVar);
            }
            C50110kc1 kc12 = this.f141470f;
            if (kc12 != null) {
                aVar.mo74322i(3, kc12.computeSize());
                this.f141470f.writeFields(aVar);
            }
            C49040cr0 cr02 = this.f141471g;
            if (cr02 != null) {
                aVar.mo74322i(4, cr02.computeSize());
                this.f141471g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141468d) + 0;
            C52145yo1 yo13 = this.f141469e;
            if (yo13 != null) {
                e += C52418a.m58682i(2, yo13.computeSize());
            }
            C50110kc1 kc13 = this.f141470f;
            if (kc13 != null) {
                e += C52418a.m58682i(3, kc13.computeSize());
            }
            C49040cr0 cr03 = this.f141471g;
            return cr03 != null ? e + C52418a.m58682i(4, cr03.computeSize()) : e;
        } else if (i == 2) {
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
            C51235sf0 sf02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sf02.f141468d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52145yo1 yo14 = new C52145yo1();
                    if (bArr != null && bArr.length > 0) {
                        yo14.parseFrom(bArr);
                    }
                    sf02.f141469e = yo14;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50110kc1 kc14 = new C50110kc1();
                    if (bArr2 != null && bArr2.length > 0) {
                        kc14.parseFrom(bArr2);
                    }
                    sf02.f141470f = kc14;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C49040cr0 cr04 = new C49040cr0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cr04.parseFrom(bArr3);
                    }
                    sf02.f141471g = cr04;
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p12 */
public class C50768p12 extends C47465a {

    /* renamed from: d */
    public int f139527d;

    /* renamed from: e */
    public C49697hf2 f139528e;

    /* renamed from: f */
    public String f139529f;

    /* renamed from: g */
    public int f139530g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50768p12)) {
            return false;
        }
        C50768p12 p122 = (C50768p12) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139527d), Integer.valueOf(p122.f139527d)) && C46238a.m51546a(this.f139528e, p122.f139528e) && C46238a.m51546a(this.f139529f, p122.f139529f) && C46238a.m51546a(Integer.valueOf(this.f139530g), Integer.valueOf(p122.f139530g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139527d);
            C49697hf2 hf22 = this.f139528e;
            if (hf22 != null) {
                aVar.mo74322i(2, hf22.computeSize());
                this.f139528e.writeFields(aVar);
            }
            String str = this.f139529f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f139530g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139527d) + 0;
            C49697hf2 hf23 = this.f139528e;
            if (hf23 != null) {
                e += C52418a.m58682i(2, hf23.computeSize());
            }
            String str2 = this.f139529f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f139530g);
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
            C50768p12 p122 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p122.f139527d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr != null && bArr.length > 0) {
                        hf24.parseFrom(bArr);
                    }
                    p122.f139528e = hf24;
                }
                return 0;
            } else if (intValue == 3) {
                p122.f139529f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                p122.f139530g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

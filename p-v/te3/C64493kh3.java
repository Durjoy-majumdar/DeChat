package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kh3 */
public class C64493kh3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64470jh3> f183942d = new LinkedList<>();

    /* renamed from: e */
    public String f183943e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64493kh3)) {
            return false;
        }
        C64493kh3 kh32 = (C64493kh3) aVar;
        return C46238a.m51546a(this.f183942d, kh32.f183942d) && C46238a.m51546a(this.f183943e, kh32.f183943e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f183942d);
            String str = this.f183943e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f183942d) + 0;
            String str2 = this.f183943e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f183942d.clear();
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
            C64493kh3 kh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64470jh3 jh32 = new C64470jh3();
                    if (bArr != null && bArr.length > 0) {
                        jh32.parseFrom(bArr);
                    }
                    kh32.f183942d.add(jh32);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kh32.f183943e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

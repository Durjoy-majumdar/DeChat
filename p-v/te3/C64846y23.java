package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y23 */
public class C64846y23 extends C47465a {

    /* renamed from: d */
    public int f186438d;

    /* renamed from: e */
    public LinkedList<C22521pi1> f186439e = new LinkedList<>();

    /* renamed from: f */
    public String f186440f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64846y23)) {
            return false;
        }
        C64846y23 y232 = (C64846y23) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186438d), Integer.valueOf(y232.f186438d)) && C46238a.m51546a(this.f186439e, y232.f186439e) && C46238a.m51546a(this.f186440f, y232.f186440f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186438d);
            aVar.mo74320g(2, 8, this.f186439e);
            String str = this.f186440f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186438d) + 0 + C52418a.m58680g(2, 8, this.f186439e);
            String str2 = this.f186440f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f186439e.clear();
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
            C64846y23 y232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y232.f186438d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C22521pi1 pi12 = new C22521pi1();
                    if (bArr != null && bArr.length > 0) {
                        pi12.parseFrom(bArr);
                    }
                    y232.f186439e.add(pi12);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                y232.f186440f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

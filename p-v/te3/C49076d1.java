package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d1 */
public class C49076d1 extends C47465a {

    /* renamed from: d */
    public String f132056d;

    /* renamed from: e */
    public LinkedList<C49111d83> f132057e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C48971c83> f132058f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49076d1)) {
            return false;
        }
        C49076d1 d1Var = (C49076d1) aVar;
        return C46238a.m51546a(this.f132056d, d1Var.f132056d) && C46238a.m51546a(this.f132057e, d1Var.f132057e) && C46238a.m51546a(this.f132058f, d1Var.f132058f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132056d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f132057e);
            aVar.mo74320g(3, 8, this.f132058f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132056d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f132057e) + C52418a.m58680g(3, 8, this.f132058f);
        } else if (i == 2) {
            this.f132057e.clear();
            this.f132058f.clear();
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
            C49076d1 d1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d1Var.f132056d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49111d83 d832 = new C49111d83();
                    if (bArr != null && bArr.length > 0) {
                        d832.parseFrom(bArr);
                    }
                    d1Var.f132057e.add(d832);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48971c83 c832 = new C48971c83();
                    if (bArr2 != null && bArr2.length > 0) {
                        c832.parseFrom(bArr2);
                    }
                    d1Var.f132058f.add(c832);
                }
                return 0;
            }
        }
    }
}

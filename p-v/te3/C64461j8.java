package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j8 */
public class C64461j8 extends C47465a {

    /* renamed from: d */
    public String f183765d;

    /* renamed from: e */
    public String f183766e;

    /* renamed from: f */
    public LinkedList<C64439i8> f183767f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64461j8)) {
            return false;
        }
        C64461j8 j8Var = (C64461j8) aVar;
        return C46238a.m51546a(this.f183765d, j8Var.f183765d) && C46238a.m51546a(this.f183766e, j8Var.f183766e) && C46238a.m51546a(this.f183767f, j8Var.f183767f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183765d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183766e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f183767f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f183765d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f183766e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f183767f);
        } else if (i == 2) {
            this.f183767f.clear();
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
            C64461j8 j8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j8Var.f183765d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j8Var.f183766e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64439i8 i8Var = new C64439i8();
                    if (bArr != null && bArr.length > 0) {
                        i8Var.parseFrom(bArr);
                    }
                    j8Var.f183767f.add(i8Var);
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ke3 */
public class C50121ke3 extends C47465a {

    /* renamed from: d */
    public String f136719d;

    /* renamed from: e */
    public LinkedList<C50253le3> f136720e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C51097re3> f136721f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C51097re3> f136722g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50121ke3)) {
            return false;
        }
        C50121ke3 ke32 = (C50121ke3) aVar;
        return C46238a.m51546a(this.f136719d, ke32.f136719d) && C46238a.m51546a(this.f136720e, ke32.f136720e) && C46238a.m51546a(this.f136721f, ke32.f136721f) && C46238a.m51546a(this.f136722g, ke32.f136722g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136719d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f136720e);
            aVar.mo74320g(3, 8, this.f136721f);
            aVar.mo74320g(4, 8, this.f136722g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f136719d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f136720e) + C52418a.m58680g(3, 8, this.f136721f) + C52418a.m58680g(4, 8, this.f136722g);
        } else if (i == 2) {
            this.f136720e.clear();
            this.f136721f.clear();
            this.f136722g.clear();
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
            C50121ke3 ke32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ke32.f136719d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50253le3 le32 = new C50253le3();
                    if (bArr != null && bArr.length > 0) {
                        le32.parseFrom(bArr);
                    }
                    ke32.f136720e.add(le32);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51097re3 re32 = new C51097re3();
                    if (bArr2 != null && bArr2.length > 0) {
                        re32.parseFrom(bArr2);
                    }
                    ke32.f136721f.add(re32);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51097re3 re33 = new C51097re3();
                    if (bArr3 != null && bArr3.length > 0) {
                        re33.parseFrom(bArr3);
                    }
                    ke32.f136722g.add(re33);
                }
                return 0;
            }
        }
    }
}

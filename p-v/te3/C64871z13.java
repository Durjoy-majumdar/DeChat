package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z13 */
public class C64871z13 extends C47465a {

    /* renamed from: d */
    public int f186618d;

    /* renamed from: e */
    public String f186619e;

    /* renamed from: f */
    public C64821x13 f186620f;

    /* renamed from: g */
    public String f186621g;

    /* renamed from: h */
    public int f186622h;

    /* renamed from: i */
    public boolean f186623i;

    /* renamed from: j */
    public String f186624j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64871z13)) {
            return false;
        }
        C64871z13 z132 = (C64871z13) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186618d), Integer.valueOf(z132.f186618d)) && C46238a.m51546a(this.f186619e, z132.f186619e) && C46238a.m51546a(this.f186620f, z132.f186620f) && C46238a.m51546a(this.f186621g, z132.f186621g) && C46238a.m51546a(Integer.valueOf(this.f186622h), Integer.valueOf(z132.f186622h)) && C46238a.m51546a(Boolean.valueOf(this.f186623i), Boolean.valueOf(z132.f186623i)) && C46238a.m51546a(this.f186624j, z132.f186624j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186618d);
            String str = this.f186619e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64821x13 x132 = this.f186620f;
            if (x132 != null) {
                aVar.mo74322i(3, x132.computeSize());
                this.f186620f.writeFields(aVar);
            }
            String str2 = this.f186621g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f186622h);
            aVar.mo74314a(6, this.f186623i);
            String str3 = this.f186624j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186618d) + 0;
            String str4 = this.f186619e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            C64821x13 x133 = this.f186620f;
            if (x133 != null) {
                e += C52418a.m58682i(3, x133.computeSize());
            }
            String str5 = this.f186621g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int e2 = e + C52418a.m58678e(5, this.f186622h) + C52418a.m58674a(6, this.f186623i);
            String str6 = this.f186624j;
            return str6 != null ? e2 + C52418a.m58683j(7, str6) : e2;
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
            C64871z13 z132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    z132.f186618d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    z132.f186619e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64821x13 x134 = new C64821x13();
                        if (bArr != null && bArr.length > 0) {
                            x134.parseFrom(bArr);
                        }
                        z132.f186620f = x134;
                    }
                    return 0;
                case 4:
                    z132.f186621g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    z132.f186622h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    z132.f186623i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    z132.f186624j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

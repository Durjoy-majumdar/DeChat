package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ke0 */
public class C50118ke0 extends C47465a {

    /* renamed from: d */
    public int f136681d;

    /* renamed from: e */
    public String f136682e;

    /* renamed from: f */
    public String f136683f;
    public C50250le0 field_area_info;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50118ke0)) {
            return false;
        }
        C50118ke0 ke02 = (C50118ke0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136681d), Integer.valueOf(ke02.f136681d)) && C46238a.m51546a(this.field_area_info, ke02.field_area_info) && C46238a.m51546a(this.f136682e, ke02.f136682e) && C46238a.m51546a(this.f136683f, ke02.f136683f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136681d);
            C50250le0 le02 = this.field_area_info;
            if (le02 != null) {
                aVar.mo74322i(2, le02.computeSize());
                this.field_area_info.writeFields(aVar);
            }
            String str = this.f136682e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136683f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136681d) + 0;
            C50250le0 le03 = this.field_area_info;
            if (le03 != null) {
                e += C52418a.m58682i(2, le03.computeSize());
            }
            String str3 = this.f136682e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f136683f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C50118ke0 ke02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ke02.f136681d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50250le0 le04 = new C50250le0();
                    if (bArr != null && bArr.length > 0) {
                        le04.parseFrom(bArr);
                    }
                    ke02.field_area_info = le04;
                }
                return 0;
            } else if (intValue == 3) {
                ke02.f136682e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ke02.f136683f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

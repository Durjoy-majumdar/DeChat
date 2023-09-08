package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ki4 extends C47465a {

    /* renamed from: d */
    public int f136810d;

    /* renamed from: e */
    public String f136811e;

    /* renamed from: f */
    public String f136812f;

    /* renamed from: g */
    public int f136813g;

    /* renamed from: h */
    public long f136814h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ki4)) {
            return false;
        }
        ki4 ki4 = (ki4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136810d), Integer.valueOf(ki4.f136810d)) && C46238a.m51546a(this.f136811e, ki4.f136811e) && C46238a.m51546a(this.f136812f, ki4.f136812f) && C46238a.m51546a(Integer.valueOf(this.f136813g), Integer.valueOf(ki4.f136813g)) && C46238a.m51546a(Long.valueOf(this.f136814h), Long.valueOf(ki4.f136814h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136810d);
            String str = this.f136811e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136812f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f136813g);
            aVar.mo74321h(5, this.f136814h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136810d) + 0;
            String str3 = this.f136811e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f136812f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f136813g) + C52418a.m58681h(5, this.f136814h);
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
            ki4 ki4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ki4.f136810d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ki4.f136811e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ki4.f136812f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ki4.f136813g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ki4.f136814h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}

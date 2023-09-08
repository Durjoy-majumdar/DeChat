package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fk4 extends C47465a {

    /* renamed from: d */
    public C89349b f133568d;

    /* renamed from: e */
    public String f133569e;

    /* renamed from: f */
    public C89349b f133570f;

    /* renamed from: g */
    public int f133571g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fk4)) {
            return false;
        }
        fk4 fk4 = (fk4) aVar;
        return C46238a.m51546a(this.f133568d, fk4.f133568d) && C46238a.m51546a(this.f133569e, fk4.f133569e) && C46238a.m51546a(this.f133570f, fk4.f133570f) && C46238a.m51546a(Integer.valueOf(this.f133571g), Integer.valueOf(fk4.f133571g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f133568d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            String str = this.f133569e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar2 = this.f133570f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            aVar.mo74318e(4, this.f133571g);
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f133568d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            String str2 = this.f133569e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar4 = this.f133570f;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(3, bVar4);
            }
            return i2 + C52418a.m58678e(4, this.f133571g);
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
            fk4 fk4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fk4.f133568d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                fk4.f133569e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fk4.f133570f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fk4.f133571g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

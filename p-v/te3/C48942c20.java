package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c20 */
public class C48942c20 extends C47465a {

    /* renamed from: d */
    public String f131452d;

    /* renamed from: e */
    public int f131453e;

    /* renamed from: f */
    public C89349b f131454f;

    /* renamed from: g */
    public int f131455g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48942c20)) {
            return false;
        }
        C48942c20 c202 = (C48942c20) aVar;
        return C46238a.m51546a(this.f131452d, c202.f131452d) && C46238a.m51546a(Integer.valueOf(this.f131453e), Integer.valueOf(c202.f131453e)) && C46238a.m51546a(this.f131454f, c202.f131454f) && C46238a.m51546a(Integer.valueOf(this.f131455g), Integer.valueOf(c202.f131455g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131452d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131453e);
            C89349b bVar = this.f131454f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f131455g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131452d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f131453e);
            C89349b bVar2 = this.f131454f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f131455g);
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
            C48942c20 c202 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c202.f131452d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                c202.f131453e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                c202.f131454f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c202.f131455g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rd1 */
public class C51092rd1 extends C47465a {

    /* renamed from: d */
    public String f140839d;

    /* renamed from: e */
    public String f140840e;

    /* renamed from: f */
    public int f140841f;

    /* renamed from: g */
    public int f140842g;

    /* renamed from: h */
    public C89349b f140843h;

    /* renamed from: i */
    public int f140844i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51092rd1)) {
            return false;
        }
        C51092rd1 rd12 = (C51092rd1) aVar;
        return C46238a.m51546a(this.f140839d, rd12.f140839d) && C46238a.m51546a(this.f140840e, rd12.f140840e) && C46238a.m51546a(Integer.valueOf(this.f140841f), Integer.valueOf(rd12.f140841f)) && C46238a.m51546a(Integer.valueOf(this.f140842g), Integer.valueOf(rd12.f140842g)) && C46238a.m51546a(this.f140843h, rd12.f140843h) && C46238a.m51546a(Integer.valueOf(this.f140844i), Integer.valueOf(rd12.f140844i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140839d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140840e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f140841f);
            aVar.mo74318e(4, this.f140842g);
            C89349b bVar = this.f140843h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f140844i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140839d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140840e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f140841f) + C52418a.m58678e(4, this.f140842g);
            C89349b bVar2 = this.f140843h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58678e(6, this.f140844i);
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
            C51092rd1 rd12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rd12.f140839d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rd12.f140840e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rd12.f140841f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rd12.f140842g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rd12.f140843h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    rd12.f140844i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

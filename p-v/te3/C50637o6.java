package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o6 */
public class C50637o6 extends C47465a {

    /* renamed from: d */
    public String f138970d;

    /* renamed from: e */
    public String f138971e;

    /* renamed from: f */
    public int f138972f;

    /* renamed from: g */
    public int f138973g;

    /* renamed from: h */
    public long f138974h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50637o6)) {
            return false;
        }
        C50637o6 o6Var = (C50637o6) aVar;
        return C46238a.m51546a(this.f138970d, o6Var.f138970d) && C46238a.m51546a(this.f138971e, o6Var.f138971e) && C46238a.m51546a(Integer.valueOf(this.f138972f), Integer.valueOf(o6Var.f138972f)) && C46238a.m51546a(Integer.valueOf(this.f138973g), Integer.valueOf(o6Var.f138973g)) && C46238a.m51546a(Long.valueOf(this.f138974h), Long.valueOf(o6Var.f138974h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138970d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138971e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f138972f);
            aVar.mo74318e(4, this.f138973g);
            aVar.mo74321h(5, this.f138974h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138970d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138971e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f138972f) + C52418a.m58678e(4, this.f138973g) + C52418a.m58681h(5, this.f138974h);
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
            C50637o6 o6Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o6Var.f138970d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                o6Var.f138971e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                o6Var.f138972f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                o6Var.f138973g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o6Var.f138974h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}

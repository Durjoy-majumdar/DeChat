package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ni4 extends C47465a {

    /* renamed from: d */
    public String f138619d;

    /* renamed from: e */
    public String f138620e;

    /* renamed from: f */
    public int f138621f;

    /* renamed from: g */
    public int f138622g;

    /* renamed from: h */
    public float f138623h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ni4)) {
            return false;
        }
        ni4 ni4 = (ni4) aVar;
        return C46238a.m51546a(this.f138619d, ni4.f138619d) && C46238a.m51546a(this.f138620e, ni4.f138620e) && C46238a.m51546a(Integer.valueOf(this.f138621f), Integer.valueOf(ni4.f138621f)) && C46238a.m51546a(Integer.valueOf(this.f138622g), Integer.valueOf(ni4.f138622g)) && C46238a.m51546a(Float.valueOf(this.f138623h), Float.valueOf(ni4.f138623h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138619d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138620e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f138621f);
                aVar.mo74318e(4, this.f138622g);
                aVar.mo74317d(5, this.f138623h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Text");
        } else if (i == 1) {
            String str3 = this.f138619d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138620e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f138621f) + C52418a.m58678e(4, this.f138622g) + C52418a.m58677d(5, this.f138623h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138619d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Text");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ni4 ni4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ni4.f138619d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ni4.f138620e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ni4.f138621f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ni4.f138622g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ni4.f138623h = aVar3.mo141628f(intValue);
                return 0;
            }
        }
    }
}

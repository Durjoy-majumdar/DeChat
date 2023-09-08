package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mq4 extends C47465a {

    /* renamed from: d */
    public int f138158d;

    /* renamed from: e */
    public String f138159e;

    /* renamed from: f */
    public int f138160f;

    /* renamed from: g */
    public String f138161g;

    /* renamed from: h */
    public String f138162h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mq4)) {
            return false;
        }
        mq4 mq4 = (mq4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138158d), Integer.valueOf(mq4.f138158d)) && C46238a.m51546a(this.f138159e, mq4.f138159e) && C46238a.m51546a(Integer.valueOf(this.f138160f), Integer.valueOf(mq4.f138160f)) && C46238a.m51546a(this.f138161g, mq4.f138161g) && C46238a.m51546a(this.f138162h, mq4.f138162h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138158d);
            String str = this.f138159e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138160f);
            String str2 = this.f138161g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f138162h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138158d) + 0;
            String str4 = this.f138159e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f138160f);
            String str5 = this.f138161g;
            if (str5 != null) {
                e2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f138162h;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            mq4 mq4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mq4.f138158d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mq4.f138159e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mq4.f138160f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mq4.f138161g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                mq4.f138162h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

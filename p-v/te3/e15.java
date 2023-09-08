package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class e15 extends C47465a {

    /* renamed from: d */
    public int f132625d;

    /* renamed from: e */
    public String f132626e;

    /* renamed from: f */
    public String f132627f;

    /* renamed from: g */
    public String f132628g;

    /* renamed from: h */
    public int f132629h;

    /* renamed from: i */
    public C89349b f132630i;

    /* renamed from: j */
    public boolean f132631j;

    /* renamed from: n */
    public boolean f132632n;

    /* renamed from: o */
    public boolean f132633o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e15)) {
            return false;
        }
        e15 e15 = (e15) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132625d), Integer.valueOf(e15.f132625d)) && C46238a.m51546a(this.f132626e, e15.f132626e) && C46238a.m51546a(this.f132627f, e15.f132627f) && C46238a.m51546a(this.f132628g, e15.f132628g) && C46238a.m51546a(Integer.valueOf(this.f132629h), Integer.valueOf(e15.f132629h)) && C46238a.m51546a(this.f132630i, e15.f132630i) && C46238a.m51546a(Boolean.valueOf(this.f132631j), Boolean.valueOf(e15.f132631j)) && C46238a.m51546a(Boolean.valueOf(this.f132632n), Boolean.valueOf(e15.f132632n)) && C46238a.m51546a(Boolean.valueOf(this.f132633o), Boolean.valueOf(e15.f132633o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132626e == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f132627f == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f132628g != null) {
                aVar.mo74318e(1, this.f132625d);
                String str = this.f132626e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132627f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132628g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f132629h);
                C89349b bVar = this.f132630i;
                if (bVar != null) {
                    aVar.mo74315b(6, bVar);
                }
                aVar.mo74314a(7, this.f132631j);
                aVar.mo74314a(8, this.f132632n);
                aVar.mo74314a(9, this.f132633o);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132625d) + 0;
            String str4 = this.f132626e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f132627f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f132628g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f132629h);
            C89349b bVar2 = this.f132630i;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(6, bVar2);
            }
            return e2 + C52418a.m58674a(7, this.f132631j) + C52418a.m58674a(8, this.f132632n) + C52418a.m58674a(9, this.f132633o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132626e == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f132627f == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f132628g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            e15 e15 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e15.f132625d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    e15.f132626e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e15.f132627f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e15.f132628g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e15.f132629h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    e15.f132630i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    e15.f132631j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    e15.f132632n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    e15.f132633o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

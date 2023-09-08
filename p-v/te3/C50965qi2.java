package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qi2 */
public class C50965qi2 extends C47465a {

    /* renamed from: d */
    public int f140327d;

    /* renamed from: e */
    public C51163rv3 f140328e;

    /* renamed from: f */
    public String f140329f;

    /* renamed from: g */
    public String f140330g;

    /* renamed from: h */
    public String f140331h;

    /* renamed from: i */
    public int f140332i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50965qi2)) {
            return false;
        }
        C50965qi2 qi22 = (C50965qi2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140327d), Integer.valueOf(qi22.f140327d)) && C46238a.m51546a(this.f140328e, qi22.f140328e) && C46238a.m51546a(this.f140329f, qi22.f140329f) && C46238a.m51546a(this.f140330g, qi22.f140330g) && C46238a.m51546a(this.f140331h, qi22.f140331h) && C46238a.m51546a(Integer.valueOf(this.f140332i), Integer.valueOf(qi22.f140332i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f140328e != null) {
                aVar.mo74318e(1, this.f140327d);
                C51163rv3 rv32 = this.f140328e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f140328e.writeFields(aVar);
                }
                String str = this.f140329f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f140330g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f140331h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f140332i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: NickName");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140327d) + 0;
            C51163rv3 rv33 = this.f140328e;
            if (rv33 != null) {
                e += C52418a.m58682i(2, rv33.computeSize());
            }
            String str4 = this.f140329f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f140330g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f140331h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f140332i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140328e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: NickName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50965qi2 qi22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qi22.f140327d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv34.mo73356d(bArr);
                        }
                        qi22.f140328e = rv34;
                    }
                    return 0;
                case 3:
                    qi22.f140329f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qi22.f140330g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qi22.f140331h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qi22.f140332i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

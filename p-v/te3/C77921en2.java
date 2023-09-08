package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.en2 */
public class C77921en2 extends C101820nt3 {

    /* renamed from: d */
    public int f227250d;

    /* renamed from: e */
    public float f227251e;

    /* renamed from: f */
    public float f227252f;

    /* renamed from: g */
    public int f227253g;

    /* renamed from: h */
    public String f227254h;

    /* renamed from: i */
    public String f227255i;

    /* renamed from: j */
    public int f227256j;

    /* renamed from: n */
    public String f227257n;

    /* renamed from: o */
    public int f227258o;

    /* renamed from: p */
    public int f227259p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77921en2)) {
            return false;
        }
        C77921en2 en22 = (C77921en2) aVar;
        return C46238a.m51546a(this.BaseRequest, en22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f227250d), Integer.valueOf(en22.f227250d)) && C46238a.m51546a(Float.valueOf(this.f227251e), Float.valueOf(en22.f227251e)) && C46238a.m51546a(Float.valueOf(this.f227252f), Float.valueOf(en22.f227252f)) && C46238a.m51546a(Integer.valueOf(this.f227253g), Integer.valueOf(en22.f227253g)) && C46238a.m51546a(this.f227254h, en22.f227254h) && C46238a.m51546a(this.f227255i, en22.f227255i) && C46238a.m51546a(Integer.valueOf(this.f227256j), Integer.valueOf(en22.f227256j)) && C46238a.m51546a(this.f227257n, en22.f227257n) && C46238a.m51546a(Integer.valueOf(this.f227258o), Integer.valueOf(en22.f227258o)) && C46238a.m51546a(Integer.valueOf(this.f227259p), Integer.valueOf(en22.f227259p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f227250d);
            aVar.mo74317d(3, this.f227251e);
            aVar.mo74317d(4, this.f227252f);
            aVar.mo74318e(5, this.f227253g);
            String str = this.f227254h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f227255i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f227256j);
            String str3 = this.f227257n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f227258o);
            aVar.mo74318e(11, this.f227259p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f227250d) + C52418a.m58677d(3, this.f227251e) + C52418a.m58677d(4, this.f227252f) + C52418a.m58678e(5, this.f227253g);
            String str4 = this.f227254h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            String str5 = this.f227255i;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            int e2 = e + C52418a.m58678e(8, this.f227256j);
            String str6 = this.f227257n;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58678e(10, this.f227258o) + C52418a.m58678e(11, this.f227259p);
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
            C77921en2 en22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        en22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    en22.f227250d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    en22.f227251e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    en22.f227252f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    en22.f227253g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    en22.f227254h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    en22.f227255i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    en22.f227256j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    en22.f227257n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    en22.f227258o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    en22.f227259p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

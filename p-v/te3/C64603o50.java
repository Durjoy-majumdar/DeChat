package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o50 */
public class C64603o50 extends C101820nt3 {

    /* renamed from: d */
    public String f184620d;

    /* renamed from: e */
    public int f184621e;

    /* renamed from: f */
    public String f184622f;

    /* renamed from: g */
    public String f184623g;

    /* renamed from: h */
    public int f184624h;

    /* renamed from: i */
    public int f184625i;

    /* renamed from: j */
    public int f184626j;

    /* renamed from: n */
    public String f184627n;

    /* renamed from: o */
    public int f184628o;

    /* renamed from: p */
    public int f184629p;

    /* renamed from: q */
    public int f184630q;

    /* renamed from: r */
    public long f184631r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64603o50)) {
            return false;
        }
        C64603o50 o502 = (C64603o50) aVar;
        return C46238a.m51546a(this.BaseRequest, o502.BaseRequest) && C46238a.m51546a(this.f184620d, o502.f184620d) && C46238a.m51546a(Integer.valueOf(this.f184621e), Integer.valueOf(o502.f184621e)) && C46238a.m51546a(this.f184622f, o502.f184622f) && C46238a.m51546a(this.f184623g, o502.f184623g) && C46238a.m51546a(Integer.valueOf(this.f184624h), Integer.valueOf(o502.f184624h)) && C46238a.m51546a(Integer.valueOf(this.f184625i), Integer.valueOf(o502.f184625i)) && C46238a.m51546a(Integer.valueOf(this.f184626j), Integer.valueOf(o502.f184626j)) && C46238a.m51546a(this.f184627n, o502.f184627n) && C46238a.m51546a(Integer.valueOf(this.f184628o), Integer.valueOf(o502.f184628o)) && C46238a.m51546a(Integer.valueOf(this.f184629p), Integer.valueOf(o502.f184629p)) && C46238a.m51546a(Integer.valueOf(this.f184630q), Integer.valueOf(o502.f184630q)) && C46238a.m51546a(Long.valueOf(this.f184631r), Long.valueOf(o502.f184631r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f184620d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f184621e);
            String str2 = this.f184622f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f184623g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f184624h);
            aVar.mo74318e(7, this.f184625i);
            aVar.mo74318e(8, this.f184626j);
            String str4 = this.f184627n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74318e(10, this.f184628o);
            aVar.mo74318e(11, this.f184629p);
            aVar.mo74318e(12, this.f184630q);
            aVar.mo74321h(13, this.f184631r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str5 = this.f184620d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            int e = i3 + C52418a.m58678e(3, this.f184621e);
            String str6 = this.f184622f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f184623g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f184624h) + C52418a.m58678e(7, this.f184625i) + C52418a.m58678e(8, this.f184626j);
            String str8 = this.f184627n;
            if (str8 != null) {
                e2 += C52418a.m58683j(9, str8);
            }
            return e2 + C52418a.m58678e(10, this.f184628o) + C52418a.m58678e(11, this.f184629p) + C52418a.m58678e(12, this.f184630q) + C52418a.m58681h(13, this.f184631r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64603o50 o502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        o502.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o502.f184620d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o502.f184621e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o502.f184622f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o502.f184623g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o502.f184624h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    o502.f184625i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    o502.f184626j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    o502.f184627n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    o502.f184628o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    o502.f184629p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    o502.f184630q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    o502.f184631r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

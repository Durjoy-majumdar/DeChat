package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fq3 */
public class C64372fq3 extends C101820nt3 {

    /* renamed from: d */
    public String f183204d;

    /* renamed from: e */
    public String f183205e;

    /* renamed from: f */
    public int f183206f;

    /* renamed from: g */
    public String f183207g;

    /* renamed from: h */
    public String f183208h;

    /* renamed from: i */
    public String f183209i;

    /* renamed from: j */
    public String f183210j;

    /* renamed from: n */
    public String f183211n;

    /* renamed from: o */
    public int f183212o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64372fq3)) {
            return false;
        }
        C64372fq3 fq32 = (C64372fq3) aVar;
        return C46238a.m51546a(this.BaseRequest, fq32.BaseRequest) && C46238a.m51546a(this.f183204d, fq32.f183204d) && C46238a.m51546a(this.f183205e, fq32.f183205e) && C46238a.m51546a(Integer.valueOf(this.f183206f), Integer.valueOf(fq32.f183206f)) && C46238a.m51546a(this.f183207g, fq32.f183207g) && C46238a.m51546a(this.f183208h, fq32.f183208h) && C46238a.m51546a(this.f183209i, fq32.f183209i) && C46238a.m51546a(this.f183210j, fq32.f183210j) && C46238a.m51546a(this.f183211n, fq32.f183211n) && C46238a.m51546a(Integer.valueOf(this.f183212o), Integer.valueOf(fq32.f183212o));
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
            String str = this.f183204d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183205e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f183206f);
            String str3 = this.f183207g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183208h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f183209i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f183210j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f183211n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74318e(10, this.f183212o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f183204d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183205e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f183206f);
            String str10 = this.f183207g;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f183208h;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f183209i;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f183210j;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f183211n;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            return e + C52418a.m58678e(10, this.f183212o);
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
            C64372fq3 fq32 = objArr[1];
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
                        fq32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fq32.f183204d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fq32.f183205e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fq32.f183206f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fq32.f183207g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fq32.f183208h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fq32.f183209i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fq32.f183210j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    fq32.f183211n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fq32.f183212o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

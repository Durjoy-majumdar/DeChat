package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qk2 */
public class C64660qk2 extends C101820nt3 {

    /* renamed from: d */
    public String f185052d;

    /* renamed from: e */
    public String f185053e;

    /* renamed from: f */
    public String f185054f;

    /* renamed from: g */
    public int f185055g;

    /* renamed from: h */
    public String f185056h;

    /* renamed from: i */
    public String f185057i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64660qk2)) {
            return false;
        }
        C64660qk2 qk22 = (C64660qk2) aVar;
        return C46238a.m51546a(this.BaseRequest, qk22.BaseRequest) && C46238a.m51546a(this.f185052d, qk22.f185052d) && C46238a.m51546a(this.f185053e, qk22.f185053e) && C46238a.m51546a(this.f185054f, qk22.f185054f) && C46238a.m51546a(Integer.valueOf(this.f185055g), Integer.valueOf(qk22.f185055g)) && C46238a.m51546a(this.f185056h, qk22.f185056h) && C46238a.m51546a(this.f185057i, qk22.f185057i);
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
            String str = this.f185052d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185053e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185054f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f185055g);
            String str4 = this.f185056h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185057i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f185052d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f185053e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185054f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int e = i2 + C52418a.m58678e(5, this.f185055g);
            String str9 = this.f185056h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f185057i;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C64660qk2 qk22 = objArr[1];
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
                        qk22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qk22.f185052d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qk22.f185053e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qk22.f185054f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qk22.f185055g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qk22.f185056h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qk22.f185057i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

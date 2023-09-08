package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mm4 extends C101820nt3 {

    /* renamed from: d */
    public int f184357d;

    /* renamed from: e */
    public int f184358e;

    /* renamed from: f */
    public int f184359f;

    /* renamed from: g */
    public int f184360g;

    /* renamed from: h */
    public int f184361h;

    /* renamed from: i */
    public String f184362i;

    /* renamed from: j */
    public int f184363j;

    /* renamed from: n */
    public String f184364n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mm4)) {
            return false;
        }
        mm4 mm4 = (mm4) aVar;
        return C46238a.m51546a(this.BaseRequest, mm4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184357d), Integer.valueOf(mm4.f184357d)) && C46238a.m51546a(Integer.valueOf(this.f184358e), Integer.valueOf(mm4.f184358e)) && C46238a.m51546a(Integer.valueOf(this.f184359f), Integer.valueOf(mm4.f184359f)) && C46238a.m51546a(Integer.valueOf(this.f184360g), Integer.valueOf(mm4.f184360g)) && C46238a.m51546a(Integer.valueOf(this.f184361h), Integer.valueOf(mm4.f184361h)) && C46238a.m51546a(this.f184362i, mm4.f184362i) && C46238a.m51546a(Integer.valueOf(this.f184363j), Integer.valueOf(mm4.f184363j)) && C46238a.m51546a(this.f184364n, mm4.f184364n);
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
            aVar.mo74318e(2, this.f184357d);
            aVar.mo74318e(3, this.f184358e);
            aVar.mo74318e(4, this.f184359f);
            aVar.mo74318e(5, this.f184360g);
            aVar.mo74318e(6, this.f184361h);
            String str = this.f184362i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f184363j);
            String str2 = this.f184364n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184357d) + C52418a.m58678e(3, this.f184358e) + C52418a.m58678e(4, this.f184359f) + C52418a.m58678e(5, this.f184360g) + C52418a.m58678e(6, this.f184361h);
            String str3 = this.f184362i;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            int e2 = e + C52418a.m58678e(8, this.f184363j);
            String str4 = this.f184364n;
            return str4 != null ? e2 + C52418a.m58683j(9, str4) : e2;
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
            mm4 mm4 = objArr[1];
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
                        mm4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mm4.f184357d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mm4.f184358e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mm4.f184359f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mm4.f184360g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mm4.f184361h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mm4.f184362i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mm4.f184363j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mm4.f184364n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

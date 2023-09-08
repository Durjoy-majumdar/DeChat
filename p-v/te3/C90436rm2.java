package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rm2 */
public class C90436rm2 extends C47465a {

    /* renamed from: d */
    public int f259816d;

    /* renamed from: e */
    public String f259817e;

    /* renamed from: f */
    public boolean f259818f;

    /* renamed from: g */
    public String f259819g;

    /* renamed from: h */
    public String f259820h;

    /* renamed from: i */
    public p65 f259821i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90436rm2)) {
            return false;
        }
        C90436rm2 rm22 = (C90436rm2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f259816d), Integer.valueOf(rm22.f259816d)) && C46238a.m51546a(this.f259817e, rm22.f259817e) && C46238a.m51546a(Boolean.valueOf(this.f259818f), Boolean.valueOf(rm22.f259818f)) && C46238a.m51546a(this.f259819g, rm22.f259819g) && C46238a.m51546a(this.f259820h, rm22.f259820h) && C46238a.m51546a(this.f259821i, rm22.f259821i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f259816d);
            String str = this.f259817e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f259818f);
            String str2 = this.f259819g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259820h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            p65 p65 = this.f259821i;
            if (p65 != null) {
                aVar.mo74322i(6, p65.computeSize());
                this.f259821i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f259816d) + 0;
            String str4 = this.f259817e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int a = e + C52418a.m58674a(3, this.f259818f);
            String str5 = this.f259819g;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f259820h;
            if (str6 != null) {
                a += C52418a.m58683j(5, str6);
            }
            p65 p652 = this.f259821i;
            return p652 != null ? a + C52418a.m58682i(6, p652.computeSize()) : a;
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
            C90436rm2 rm22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rm22.f259816d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    rm22.f259817e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rm22.f259818f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    rm22.f259819g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rm22.f259820h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        p65 p653 = new p65();
                        if (bArr != null && bArr.length > 0) {
                            p653.parseFrom(bArr);
                        }
                        rm22.f259821i = p653;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

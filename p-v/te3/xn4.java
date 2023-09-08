package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class xn4 extends C49335eu3 {

    /* renamed from: d */
    public String f144761d;

    /* renamed from: e */
    public int f144762e;

    /* renamed from: f */
    public int f144763f;

    /* renamed from: g */
    public int f144764g;

    /* renamed from: h */
    public long f144765h;

    /* renamed from: i */
    public String f144766i;

    /* renamed from: j */
    public String f144767j;

    /* renamed from: n */
    public int f144768n;

    /* renamed from: o */
    public boolean f144769o;

    /* renamed from: p */
    public boolean f144770p;

    /* renamed from: q */
    public String f144771q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xn4)) {
            return false;
        }
        xn4 xn4 = (xn4) aVar;
        return C46238a.m51546a(this.BaseResponse, xn4.BaseResponse) && C46238a.m51546a(this.f144761d, xn4.f144761d) && C46238a.m51546a(Integer.valueOf(this.f144762e), Integer.valueOf(xn4.f144762e)) && C46238a.m51546a(Integer.valueOf(this.f144763f), Integer.valueOf(xn4.f144763f)) && C46238a.m51546a(Integer.valueOf(this.f144764g), Integer.valueOf(xn4.f144764g)) && C46238a.m51546a(Long.valueOf(this.f144765h), Long.valueOf(xn4.f144765h)) && C46238a.m51546a(this.f144766i, xn4.f144766i) && C46238a.m51546a(this.f144767j, xn4.f144767j) && C46238a.m51546a(Integer.valueOf(this.f144768n), Integer.valueOf(xn4.f144768n)) && C46238a.m51546a(Boolean.valueOf(this.f144769o), Boolean.valueOf(xn4.f144769o)) && C46238a.m51546a(Boolean.valueOf(this.f144770p), Boolean.valueOf(xn4.f144770p)) && C46238a.m51546a(this.f144771q, xn4.f144771q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f144761d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f144762e);
                aVar.mo74318e(4, this.f144763f);
                aVar.mo74318e(5, this.f144764g);
                aVar.mo74321h(6, this.f144765h);
                String str2 = this.f144766i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f144767j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f144768n);
                aVar.mo74314a(10, this.f144769o);
                aVar.mo74314a(11, this.f144770p);
                String str4 = this.f144771q;
                if (str4 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str4);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            String str5 = this.f144761d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            int e = i3 + C52418a.m58678e(3, this.f144762e) + C52418a.m58678e(4, this.f144763f) + C52418a.m58678e(5, this.f144764g) + C52418a.m58681h(6, this.f144765h);
            String str6 = this.f144766i;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            String str7 = this.f144767j;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            int e2 = e + C52418a.m58678e(9, this.f144768n) + C52418a.m58674a(10, this.f144769o) + C52418a.m58674a(11, this.f144770p);
            String str8 = this.f144771q;
            return str8 != null ? e2 + C52418a.m58683j(12, str8) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            xn4 xn4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        xn4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xn4.f144761d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xn4.f144762e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    xn4.f144763f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    xn4.f144764g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xn4.f144765h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    xn4.f144766i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xn4.f144767j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xn4.f144768n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    xn4.f144769o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    xn4.f144770p = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    xn4.f144771q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

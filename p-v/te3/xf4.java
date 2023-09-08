package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class xf4 extends C47465a {

    /* renamed from: d */
    public String f299886d;

    /* renamed from: e */
    public int f299887e;

    /* renamed from: f */
    public int f299888f;

    /* renamed from: g */
    public wr4 f299889g;

    /* renamed from: h */
    public int f299890h;

    /* renamed from: i */
    public C101769d70 f299891i;

    /* renamed from: j */
    public String f299892j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xf4)) {
            return false;
        }
        xf4 xf4 = (xf4) aVar;
        return C46238a.m51546a(this.f299886d, xf4.f299886d) && C46238a.m51546a(Integer.valueOf(this.f299887e), Integer.valueOf(xf4.f299887e)) && C46238a.m51546a(Integer.valueOf(this.f299888f), Integer.valueOf(xf4.f299888f)) && C46238a.m51546a(this.f299889g, xf4.f299889g) && C46238a.m51546a(Integer.valueOf(this.f299890h), Integer.valueOf(xf4.f299890h)) && C46238a.m51546a(this.f299891i, xf4.f299891i) && C46238a.m51546a(this.f299892j, xf4.f299892j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299886d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: text");
            } else if (this.f299889g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f299887e);
                aVar.mo74318e(3, this.f299888f);
                wr4 wr4 = this.f299889g;
                if (wr4 != null) {
                    aVar.mo74322i(4, wr4.computeSize());
                    this.f299889g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f299890h);
                C101769d70 d702 = this.f299891i;
                if (d702 != null) {
                    aVar.mo74322i(6, d702.computeSize());
                    this.f299891i.writeFields(aVar);
                }
                String str2 = this.f299892j;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i == 1) {
            String str3 = this.f299886d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f299887e) + C52418a.m58678e(3, this.f299888f);
            wr4 wr42 = this.f299889g;
            if (wr42 != null) {
                e += C52418a.m58682i(4, wr42.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f299890h);
            C101769d70 d703 = this.f299891i;
            if (d703 != null) {
                e2 += C52418a.m58682i(6, d703.computeSize());
            }
            String str4 = this.f299892j;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299886d == null) {
                throw new C52419b("Not all required fields were included: text");
            } else if (this.f299889g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            xf4 xf4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xf4.f299886d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xf4.f299887e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xf4.f299888f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        wr4 wr43 = new wr4();
                        if (bArr != null && bArr.length > 0) {
                            wr43.parseFrom(bArr);
                        }
                        xf4.f299889g = wr43;
                    }
                    return 0;
                case 5:
                    xf4.f299890h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101769d70 d704 = new C101769d70();
                        if (bArr2 != null && bArr2.length > 0) {
                            d704.parseFrom(bArr2);
                        }
                        xf4.f299891i = d704;
                    }
                    return 0;
                case 7:
                    xf4.f299892j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

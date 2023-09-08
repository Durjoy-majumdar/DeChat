package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nz3 */
public class C64596nz3 extends C49335eu3 {

    /* renamed from: d */
    public String f184588d;

    /* renamed from: e */
    public String f184589e;

    /* renamed from: f */
    public String f184590f;

    /* renamed from: g */
    public int f184591g;

    /* renamed from: h */
    public String f184592h;

    /* renamed from: i */
    public int f184593i;

    /* renamed from: j */
    public int f184594j;

    /* renamed from: n */
    public long f184595n;

    /* renamed from: o */
    public String f184596o;

    /* renamed from: p */
    public String f184597p;

    /* renamed from: q */
    public int f184598q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64596nz3)) {
            return false;
        }
        C64596nz3 nz32 = (C64596nz3) aVar;
        return C46238a.m51546a(this.BaseResponse, nz32.BaseResponse) && C46238a.m51546a(this.f184588d, nz32.f184588d) && C46238a.m51546a(this.f184589e, nz32.f184589e) && C46238a.m51546a(this.f184590f, nz32.f184590f) && C46238a.m51546a(Integer.valueOf(this.f184591g), Integer.valueOf(nz32.f184591g)) && C46238a.m51546a(this.f184592h, nz32.f184592h) && C46238a.m51546a(Integer.valueOf(this.f184593i), Integer.valueOf(nz32.f184593i)) && C46238a.m51546a(Integer.valueOf(this.f184594j), Integer.valueOf(nz32.f184594j)) && C46238a.m51546a(Long.valueOf(this.f184595n), Long.valueOf(nz32.f184595n)) && C46238a.m51546a(this.f184596o, nz32.f184596o) && C46238a.m51546a(this.f184597p, nz32.f184597p) && C46238a.m51546a(Integer.valueOf(this.f184598q), Integer.valueOf(nz32.f184598q));
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
                String str = this.f184588d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f184589e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f184590f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f184591g);
                String str4 = this.f184592h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.f184593i);
                aVar.mo74318e(8, this.f184594j);
                aVar.mo74321h(9, this.f184595n);
                String str5 = this.f184596o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f184597p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74318e(12, this.f184598q);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            String str7 = this.f184588d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184589e;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f184590f;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            int e = i3 + C52418a.m58678e(5, this.f184591g);
            String str10 = this.f184592h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            int e2 = e + C52418a.m58678e(7, this.f184593i) + C52418a.m58678e(8, this.f184594j) + C52418a.m58681h(9, this.f184595n);
            String str11 = this.f184596o;
            if (str11 != null) {
                e2 += C52418a.m58683j(10, str11);
            }
            String str12 = this.f184597p;
            if (str12 != null) {
                e2 += C52418a.m58683j(11, str12);
            }
            return e2 + C52418a.m58678e(12, this.f184598q);
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
            C64596nz3 nz32 = objArr[1];
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
                        nz32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    nz32.f184588d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nz32.f184589e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nz32.f184590f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nz32.f184591g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nz32.f184592h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nz32.f184593i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nz32.f184594j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nz32.f184595n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    nz32.f184596o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    nz32.f184597p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    nz32.f184598q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

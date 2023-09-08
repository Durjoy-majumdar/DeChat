package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zn3 */
public class C52287zn3 extends C49335eu3 {

    /* renamed from: d */
    public int f146130d;

    /* renamed from: e */
    public String f146131e;

    /* renamed from: f */
    public String f146132f;

    /* renamed from: g */
    public String f146133g;

    /* renamed from: h */
    public C89349b f146134h;

    /* renamed from: i */
    public int f146135i;

    /* renamed from: j */
    public int f146136j;

    /* renamed from: n */
    public int f146137n;

    /* renamed from: o */
    public int f146138o;

    /* renamed from: p */
    public String f146139p;

    /* renamed from: q */
    public String f146140q;

    /* renamed from: r */
    public String f146141r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52287zn3)) {
            return false;
        }
        C52287zn3 zn32 = (C52287zn3) aVar;
        return C46238a.m51546a(this.BaseResponse, zn32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f146130d), Integer.valueOf(zn32.f146130d)) && C46238a.m51546a(this.f146131e, zn32.f146131e) && C46238a.m51546a(this.f146132f, zn32.f146132f) && C46238a.m51546a(this.f146133g, zn32.f146133g) && C46238a.m51546a(this.f146134h, zn32.f146134h) && C46238a.m51546a(Integer.valueOf(this.f146135i), Integer.valueOf(zn32.f146135i)) && C46238a.m51546a(Integer.valueOf(this.f146136j), Integer.valueOf(zn32.f146136j)) && C46238a.m51546a(Integer.valueOf(this.f146137n), Integer.valueOf(zn32.f146137n)) && C46238a.m51546a(Integer.valueOf(this.f146138o), Integer.valueOf(zn32.f146138o)) && C46238a.m51546a(this.f146139p, zn32.f146139p) && C46238a.m51546a(this.f146140q, zn32.f146140q) && C46238a.m51546a(this.f146141r, zn32.f146141r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f146130d);
                String str = this.f146131e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f146132f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f146133g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                C89349b bVar = this.f146134h;
                if (bVar != null) {
                    aVar.mo74315b(6, bVar);
                }
                aVar.mo74318e(7, this.f146135i);
                aVar.mo74318e(8, this.f146136j);
                aVar.mo74318e(9, this.f146137n);
                aVar.mo74318e(10, this.f146138o);
                String str4 = this.f146139p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                String str5 = this.f146140q;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                String str6 = this.f146141r;
                if (str6 != null) {
                    aVar.mo74323j(13, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f146130d);
            String str7 = this.f146131e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f146132f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f146133g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C89349b bVar2 = this.f146134h;
            if (bVar2 != null) {
                e += C52418a.m58675b(6, bVar2);
            }
            int e2 = e + C52418a.m58678e(7, this.f146135i) + C52418a.m58678e(8, this.f146136j) + C52418a.m58678e(9, this.f146137n) + C52418a.m58678e(10, this.f146138o);
            String str10 = this.f146139p;
            if (str10 != null) {
                e2 += C52418a.m58683j(11, str10);
            }
            String str11 = this.f146140q;
            if (str11 != null) {
                e2 += C52418a.m58683j(12, str11);
            }
            String str12 = this.f146141r;
            return str12 != null ? e2 + C52418a.m58683j(13, str12) : e2;
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
            C52287zn3 zn32 = objArr[1];
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
                        zn32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    zn32.f146130d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zn32.f146131e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zn32.f146132f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zn32.f146133g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zn32.f146134h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    zn32.f146135i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zn32.f146136j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zn32.f146137n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    zn32.f146138o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    zn32.f146139p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    zn32.f146140q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zn32.f146141r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

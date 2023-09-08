package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r12 */
public class C77989r12 extends C49335eu3 {

    /* renamed from: d */
    public int f228142d = 0;

    /* renamed from: e */
    public String f228143e = "ok";

    /* renamed from: f */
    public String f228144f;

    /* renamed from: g */
    public boolean f228145g;

    /* renamed from: h */
    public String f228146h;

    /* renamed from: i */
    public String f228147i;

    /* renamed from: j */
    public String f228148j;

    /* renamed from: n */
    public String f228149n;

    /* renamed from: o */
    public String f228150o;

    /* renamed from: p */
    public String f228151p;

    /* renamed from: q */
    public LinkedList<C78004vf2> f228152q = new LinkedList<>();

    /* renamed from: r */
    public boolean f228153r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77989r12)) {
            return false;
        }
        C77989r12 r122 = (C77989r12) aVar;
        return C46238a.m51546a(this.BaseResponse, r122.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228142d), Integer.valueOf(r122.f228142d)) && C46238a.m51546a(this.f228143e, r122.f228143e) && C46238a.m51546a(this.f228144f, r122.f228144f) && C46238a.m51546a(Boolean.valueOf(this.f228145g), Boolean.valueOf(r122.f228145g)) && C46238a.m51546a(this.f228146h, r122.f228146h) && C46238a.m51546a(this.f228147i, r122.f228147i) && C46238a.m51546a(this.f228148j, r122.f228148j) && C46238a.m51546a(this.f228149n, r122.f228149n) && C46238a.m51546a(this.f228150o, r122.f228150o) && C46238a.m51546a(this.f228151p, r122.f228151p) && C46238a.m51546a(this.f228152q, r122.f228152q) && C46238a.m51546a(Boolean.valueOf(this.f228153r), Boolean.valueOf(r122.f228153r));
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
                aVar.mo74318e(2, this.f228142d);
                String str = this.f228143e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f228144f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74314a(6, this.f228145g);
                String str3 = this.f228146h;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f228147i;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f228148j;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f228149n;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                String str7 = this.f228150o;
                if (str7 != null) {
                    aVar.mo74323j(11, str7);
                }
                String str8 = this.f228151p;
                if (str8 != null) {
                    aVar.mo74323j(12, str8);
                }
                aVar.mo74320g(13, 8, this.f228152q);
                aVar.mo74314a(14, this.f228153r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228142d);
            String str9 = this.f228143e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f228144f;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            int a = e + C52418a.m58674a(6, this.f228145g);
            String str11 = this.f228146h;
            if (str11 != null) {
                a += C52418a.m58683j(7, str11);
            }
            String str12 = this.f228147i;
            if (str12 != null) {
                a += C52418a.m58683j(8, str12);
            }
            String str13 = this.f228148j;
            if (str13 != null) {
                a += C52418a.m58683j(9, str13);
            }
            String str14 = this.f228149n;
            if (str14 != null) {
                a += C52418a.m58683j(10, str14);
            }
            String str15 = this.f228150o;
            if (str15 != null) {
                a += C52418a.m58683j(11, str15);
            }
            String str16 = this.f228151p;
            if (str16 != null) {
                a += C52418a.m58683j(12, str16);
            }
            return a + C52418a.m58680g(13, 8, this.f228152q) + C52418a.m58674a(14, this.f228153r);
        } else if (i2 == 2) {
            this.f228152q.clear();
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
            C77989r12 r122 = objArr[1];
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
                        r122.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    r122.f228142d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    r122.f228143e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    r122.f228144f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r122.f228145g = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    r122.f228146h = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r122.f228147i = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r122.f228148j = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    r122.f228149n = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    r122.f228150o = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    r122.f228151p = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C78004vf2 vf22 = new C78004vf2();
                        if (bArr2 != null && bArr2.length > 0) {
                            vf22.parseFrom(bArr2);
                        }
                        r122.f228152q.add(vf22);
                    }
                    return 0;
                case 14:
                    r122.f228153r = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

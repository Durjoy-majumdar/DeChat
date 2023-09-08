package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nu */
public class C64592nu extends C49335eu3 {

    /* renamed from: d */
    public int f184557d;

    /* renamed from: e */
    public String f184558e;

    /* renamed from: f */
    public String f184559f;

    /* renamed from: g */
    public C64607oc3 f184560g;

    /* renamed from: h */
    public String f184561h;

    /* renamed from: i */
    public boolean f184562i;

    /* renamed from: j */
    public String f184563j;

    /* renamed from: n */
    public String f184564n;

    /* renamed from: o */
    public String f184565o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64592nu)) {
            return false;
        }
        C64592nu nuVar = (C64592nu) aVar;
        return C46238a.m51546a(this.BaseResponse, nuVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f184557d), Integer.valueOf(nuVar.f184557d)) && C46238a.m51546a(this.f184558e, nuVar.f184558e) && C46238a.m51546a(this.f184559f, nuVar.f184559f) && C46238a.m51546a(this.f184560g, nuVar.f184560g) && C46238a.m51546a(this.f184561h, nuVar.f184561h) && C46238a.m51546a(Boolean.valueOf(this.f184562i), Boolean.valueOf(nuVar.f184562i)) && C46238a.m51546a(this.f184563j, nuVar.f184563j) && C46238a.m51546a(this.f184564n, nuVar.f184564n) && C46238a.m51546a(this.f184565o, nuVar.f184565o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f184557d);
                String str = this.f184558e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f184559f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C64607oc3 oc32 = this.f184560g;
                if (oc32 != null) {
                    aVar.mo74322i(5, oc32.computeSize());
                    this.f184560g.writeFields(aVar);
                }
                String str3 = this.f184561h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74314a(7, this.f184562i);
                String str4 = this.f184563j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f184564n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f184565o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184557d);
            String str7 = this.f184558e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f184559f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            C64607oc3 oc33 = this.f184560g;
            if (oc33 != null) {
                e += C52418a.m58682i(5, oc33.computeSize());
            }
            String str9 = this.f184561h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            int a = e + C52418a.m58674a(7, this.f184562i);
            String str10 = this.f184563j;
            if (str10 != null) {
                a += C52418a.m58683j(8, str10);
            }
            String str11 = this.f184564n;
            if (str11 != null) {
                a += C52418a.m58683j(9, str11);
            }
            String str12 = this.f184565o;
            return str12 != null ? a + C52418a.m58683j(10, str12) : a;
        } else if (i == 2) {
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64592nu nuVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        nuVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    nuVar.f184557d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nuVar.f184558e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nuVar.f184559f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64607oc3 oc34 = new C64607oc3();
                        if (bArr2 != null && bArr2.length > 0) {
                            oc34.parseFrom(bArr2);
                        }
                        nuVar.f184560g = oc34;
                    }
                    return 0;
                case 6:
                    nuVar.f184561h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nuVar.f184562i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    nuVar.f184563j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    nuVar.f184564n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nuVar.f184565o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

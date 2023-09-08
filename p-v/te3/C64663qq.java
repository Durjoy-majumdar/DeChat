package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qq */
public class C64663qq extends C49335eu3 {

    /* renamed from: d */
    public int f185063d;

    /* renamed from: e */
    public String f185064e;

    /* renamed from: f */
    public String f185065f;

    /* renamed from: g */
    public String f185066g;

    /* renamed from: h */
    public String f185067h;

    /* renamed from: i */
    public int f185068i;

    /* renamed from: j */
    public String f185069j;

    /* renamed from: n */
    public String f185070n;

    /* renamed from: o */
    public String f185071o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64663qq)) {
            return false;
        }
        C64663qq qqVar = (C64663qq) aVar;
        return C46238a.m51546a(this.BaseResponse, qqVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f185063d), Integer.valueOf(qqVar.f185063d)) && C46238a.m51546a(this.f185064e, qqVar.f185064e) && C46238a.m51546a(this.f185065f, qqVar.f185065f) && C46238a.m51546a(this.f185066g, qqVar.f185066g) && C46238a.m51546a(this.f185067h, qqVar.f185067h) && C46238a.m51546a(Integer.valueOf(this.f185068i), Integer.valueOf(qqVar.f185068i)) && C46238a.m51546a(this.f185069j, qqVar.f185069j) && C46238a.m51546a(this.f185070n, qqVar.f185070n) && C46238a.m51546a(this.f185071o, qqVar.f185071o);
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
                aVar.mo74318e(2, this.f185063d);
                String str = this.f185064e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f185065f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f185066g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f185067h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.f185068i);
                String str5 = this.f185069j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f185070n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.f185071o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185063d);
            String str8 = this.f185064e;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f185065f;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f185066g;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f185067h;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f185068i);
            String str12 = this.f185069j;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f185070n;
            if (str13 != null) {
                e2 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f185071o;
            return str14 != null ? e2 + C52418a.m58683j(10, str14) : e2;
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
            C64663qq qqVar = objArr[1];
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
                        qqVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    qqVar.f185063d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qqVar.f185064e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qqVar.f185065f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qqVar.f185066g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qqVar.f185067h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qqVar.f185068i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qqVar.f185069j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    qqVar.f185070n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    qqVar.f185071o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

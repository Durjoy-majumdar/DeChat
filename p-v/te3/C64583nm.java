package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nm */
public class C64583nm extends C49335eu3 {

    /* renamed from: d */
    public String f184485d;

    /* renamed from: e */
    public String f184486e;

    /* renamed from: f */
    public String f184487f;

    /* renamed from: g */
    public int f184488g;

    /* renamed from: h */
    public long f184489h;

    /* renamed from: i */
    public String f184490i;

    /* renamed from: j */
    public String f184491j;

    /* renamed from: n */
    public String f184492n;

    /* renamed from: o */
    public int f184493o;

    /* renamed from: p */
    public int f184494p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64583nm)) {
            return false;
        }
        C64583nm nmVar = (C64583nm) aVar;
        return C46238a.m51546a(this.BaseResponse, nmVar.BaseResponse) && C46238a.m51546a(this.f184485d, nmVar.f184485d) && C46238a.m51546a(this.f184486e, nmVar.f184486e) && C46238a.m51546a(this.f184487f, nmVar.f184487f) && C46238a.m51546a(Integer.valueOf(this.f184488g), Integer.valueOf(nmVar.f184488g)) && C46238a.m51546a(Long.valueOf(this.f184489h), Long.valueOf(nmVar.f184489h)) && C46238a.m51546a(this.f184490i, nmVar.f184490i) && C46238a.m51546a(this.f184491j, nmVar.f184491j) && C46238a.m51546a(this.f184492n, nmVar.f184492n) && C46238a.m51546a(Integer.valueOf(this.f184493o), Integer.valueOf(nmVar.f184493o)) && C46238a.m51546a(Integer.valueOf(this.f184494p), Integer.valueOf(nmVar.f184494p));
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
                String str = this.f184485d;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f184486e;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f184487f;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(9, this.f184488g);
                aVar.mo74321h(10, this.f184489h);
                String str4 = this.f184490i;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                String str5 = this.f184491j;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                String str6 = this.f184492n;
                if (str6 != null) {
                    aVar.mo74323j(13, str6);
                }
                aVar.mo74318e(14, this.f184493o);
                aVar.mo74318e(15, this.f184494p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str7 = this.f184485d;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f184486e;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f184487f;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            int e = i2 + C52418a.m58678e(9, this.f184488g) + C52418a.m58681h(10, this.f184489h);
            String str10 = this.f184490i;
            if (str10 != null) {
                e += C52418a.m58683j(11, str10);
            }
            String str11 = this.f184491j;
            if (str11 != null) {
                e += C52418a.m58683j(12, str11);
            }
            String str12 = this.f184492n;
            if (str12 != null) {
                e += C52418a.m58683j(13, str12);
            }
            return e + C52418a.m58678e(14, this.f184493o) + C52418a.m58678e(15, this.f184494p);
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
            C64583nm nmVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    nmVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 3) {
                nmVar.f184485d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                nmVar.f184486e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                switch (intValue) {
                    case 9:
                        nmVar.f184488g = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        nmVar.f184489h = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        nmVar.f184490i = aVar3.mo141633k(intValue);
                        return 0;
                    case 12:
                        nmVar.f184491j = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        nmVar.f184492n = aVar3.mo141633k(intValue);
                        return 0;
                    case 14:
                        nmVar.f184493o = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        nmVar.f184494p = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                nmVar.f184487f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

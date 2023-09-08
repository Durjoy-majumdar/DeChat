package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jk2 */
public class C90421jk2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f259628d;

    /* renamed from: e */
    public String f259629e;

    /* renamed from: f */
    public LinkedList<C90437rw3> f259630f = new LinkedList<>();

    /* renamed from: g */
    public String f259631g;

    /* renamed from: h */
    public String f259632h;

    /* renamed from: i */
    public String f259633i;

    /* renamed from: j */
    public String f259634j;

    /* renamed from: n */
    public String f259635n;

    /* renamed from: o */
    public int f259636o;

    /* renamed from: p */
    public String f259637p;

    /* renamed from: q */
    public String f259638q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90421jk2)) {
            return false;
        }
        C90421jk2 jk22 = (C90421jk2) aVar;
        return C46238a.m51546a(this.BaseResponse, jk22.BaseResponse) && C46238a.m51546a(this.f259628d, jk22.f259628d) && C46238a.m51546a(this.f259629e, jk22.f259629e) && C46238a.m51546a(this.f259630f, jk22.f259630f) && C46238a.m51546a(this.f259631g, jk22.f259631g) && C46238a.m51546a(this.f259632h, jk22.f259632h) && C46238a.m51546a(this.f259633i, jk22.f259633i) && C46238a.m51546a(this.f259634j, jk22.f259634j) && C46238a.m51546a(this.f259635n, jk22.f259635n) && C46238a.m51546a(Integer.valueOf(this.f259636o), Integer.valueOf(jk22.f259636o)) && C46238a.m51546a(this.f259637p, jk22.f259637p) && C46238a.m51546a(this.f259638q, jk22.f259638q);
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
                C49713hj2 hj22 = this.f259628d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f259628d.writeFields(aVar);
                }
                String str = this.f259629e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f259630f);
                String str2 = this.f259631g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259632h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f259633i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f259634j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f259635n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                aVar.mo74318e(10, this.f259636o);
                String str7 = this.f259637p;
                if (str7 != null) {
                    aVar.mo74323j(11, str7);
                }
                String str8 = this.f259638q;
                if (str8 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str8);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            C49713hj2 hj23 = this.f259628d;
            if (hj23 != null) {
                i3 += C52418a.m58682i(2, hj23.computeSize());
            }
            String str9 = this.f259629e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            int g = i3 + C52418a.m58680g(4, 8, this.f259630f);
            String str10 = this.f259631g;
            if (str10 != null) {
                g += C52418a.m58683j(5, str10);
            }
            String str11 = this.f259632h;
            if (str11 != null) {
                g += C52418a.m58683j(6, str11);
            }
            String str12 = this.f259633i;
            if (str12 != null) {
                g += C52418a.m58683j(7, str12);
            }
            String str13 = this.f259634j;
            if (str13 != null) {
                g += C52418a.m58683j(8, str13);
            }
            String str14 = this.f259635n;
            if (str14 != null) {
                g += C52418a.m58683j(9, str14);
            }
            int e = g + C52418a.m58678e(10, this.f259636o);
            String str15 = this.f259637p;
            if (str15 != null) {
                e += C52418a.m58683j(11, str15);
            }
            String str16 = this.f259638q;
            return str16 != null ? e + C52418a.m58683j(12, str16) : e;
        } else if (i2 == 2) {
            this.f259630f.clear();
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
            C90421jk2 jk22 = objArr[1];
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
                        jk22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49713hj2 hj24 = new C49713hj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hj24.parseFrom(bArr2);
                        }
                        jk22.f259628d = hj24;
                    }
                    return 0;
                case 3:
                    jk22.f259629e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C90437rw3 rw32 = new C90437rw3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rw32.parseFrom(bArr3);
                        }
                        jk22.f259630f.add(rw32);
                    }
                    return 0;
                case 5:
                    jk22.f259631g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jk22.f259632h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jk22.f259633i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jk22.f259634j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jk22.f259635n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jk22.f259636o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jk22.f259637p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jk22.f259638q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

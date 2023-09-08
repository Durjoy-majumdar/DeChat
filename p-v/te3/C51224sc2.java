package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sc2 */
public class C51224sc2 extends C49335eu3 {

    /* renamed from: d */
    public long f141431d;

    /* renamed from: e */
    public long f141432e;

    /* renamed from: f */
    public String f141433f;

    /* renamed from: g */
    public String f141434g;

    /* renamed from: h */
    public boolean f141435h = false;

    /* renamed from: i */
    public String f141436i;

    /* renamed from: j */
    public C51310sx f141437j;

    /* renamed from: n */
    public d35 f141438n;

    /* renamed from: o */
    public boolean f141439o = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51224sc2)) {
            return false;
        }
        C51224sc2 sc22 = (C51224sc2) aVar;
        return C46238a.m51546a(this.BaseResponse, sc22.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f141431d), Long.valueOf(sc22.f141431d)) && C46238a.m51546a(Long.valueOf(this.f141432e), Long.valueOf(sc22.f141432e)) && C46238a.m51546a(this.f141433f, sc22.f141433f) && C46238a.m51546a(this.f141434g, sc22.f141434g) && C46238a.m51546a(Boolean.valueOf(this.f141435h), Boolean.valueOf(sc22.f141435h)) && C46238a.m51546a(this.f141436i, sc22.f141436i) && C46238a.m51546a(this.f141437j, sc22.f141437j) && C46238a.m51546a(this.f141438n, sc22.f141438n) && C46238a.m51546a(Boolean.valueOf(this.f141439o), Boolean.valueOf(sc22.f141439o));
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
                aVar.mo74321h(2, this.f141431d);
                aVar.mo74321h(3, this.f141432e);
                String str = this.f141433f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f141434g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74314a(6, this.f141435h);
                String str3 = this.f141436i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                C51310sx sxVar = this.f141437j;
                if (sxVar != null) {
                    aVar.mo74322i(8, sxVar.computeSize());
                    this.f141437j.writeFields(aVar);
                }
                d35 d35 = this.f141438n;
                if (d35 != null) {
                    aVar.mo74322i(9, d35.computeSize());
                    this.f141438n.writeFields(aVar);
                }
                aVar.mo74314a(10, this.f141439o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i3 + C52418a.m58681h(2, this.f141431d) + C52418a.m58681h(3, this.f141432e);
            String str4 = this.f141433f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f141434g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            int a = h + C52418a.m58674a(6, this.f141435h);
            String str6 = this.f141436i;
            if (str6 != null) {
                a += C52418a.m58683j(7, str6);
            }
            C51310sx sxVar2 = this.f141437j;
            if (sxVar2 != null) {
                a += C52418a.m58682i(8, sxVar2.computeSize());
            }
            d35 d352 = this.f141438n;
            if (d352 != null) {
                a += C52418a.m58682i(9, d352.computeSize());
            }
            return a + C52418a.m58674a(10, this.f141439o);
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
            C51224sc2 sc22 = objArr[1];
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
                        sc22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    sc22.f141431d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    sc22.f141432e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    sc22.f141433f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sc22.f141434g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sc22.f141435h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    sc22.f141436i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51310sx sxVar3 = new C51310sx();
                        if (bArr2 != null && bArr2.length > 0) {
                            sxVar3.parseFrom(bArr2);
                        }
                        sc22.f141437j = sxVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        d35 d353 = new d35();
                        if (bArr3 != null && bArr3.length > 0) {
                            d353.parseFrom(bArr3);
                        }
                        sc22.f141438n = d353;
                    }
                    return 0;
                case 10:
                    sc22.f141439o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

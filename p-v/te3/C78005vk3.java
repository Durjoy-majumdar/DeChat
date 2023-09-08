package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vk3 */
public class C78005vk3 extends C49335eu3 {

    /* renamed from: d */
    public int f228317d;

    /* renamed from: e */
    public String f228318e;

    /* renamed from: f */
    public int f228319f;

    /* renamed from: g */
    public String f228320g;

    /* renamed from: h */
    public String f228321h;

    /* renamed from: i */
    public C77940he2 f228322i;

    /* renamed from: j */
    public String f228323j;

    /* renamed from: n */
    public String f228324n;

    /* renamed from: o */
    public C52159yr2 f228325o;

    /* renamed from: p */
    public String f228326p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78005vk3)) {
            return false;
        }
        C78005vk3 vk32 = (C78005vk3) aVar;
        return C46238a.m51546a(this.BaseResponse, vk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228317d), Integer.valueOf(vk32.f228317d)) && C46238a.m51546a(this.f228318e, vk32.f228318e) && C46238a.m51546a(Integer.valueOf(this.f228319f), Integer.valueOf(vk32.f228319f)) && C46238a.m51546a(this.f228320g, vk32.f228320g) && C46238a.m51546a(this.f228321h, vk32.f228321h) && C46238a.m51546a(this.f228322i, vk32.f228322i) && C46238a.m51546a(this.f228323j, vk32.f228323j) && C46238a.m51546a(this.f228324n, vk32.f228324n) && C46238a.m51546a(this.f228325o, vk32.f228325o) && C46238a.m51546a(this.f228326p, vk32.f228326p);
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
                aVar.mo74318e(2, this.f228317d);
                String str = this.f228318e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f228319f);
                String str2 = this.f228320g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f228321h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                C77940he2 he22 = this.f228322i;
                if (he22 != null) {
                    aVar.mo74322i(7, he22.computeSize());
                    this.f228322i.writeFields(aVar);
                }
                String str4 = this.f228323j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f228324n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                C52159yr2 yr22 = this.f228325o;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f228325o.writeFields(aVar);
                }
                String str6 = this.f228326p;
                if (str6 != null) {
                    aVar.mo74323j(100, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228317d);
            String str7 = this.f228318e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            int e2 = e + C52418a.m58678e(4, this.f228319f);
            String str8 = this.f228320g;
            if (str8 != null) {
                e2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f228321h;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            C77940he2 he23 = this.f228322i;
            if (he23 != null) {
                e2 += C52418a.m58682i(7, he23.computeSize());
            }
            String str10 = this.f228323j;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            String str11 = this.f228324n;
            if (str11 != null) {
                e2 += C52418a.m58683j(9, str11);
            }
            C52159yr2 yr23 = this.f228325o;
            if (yr23 != null) {
                e2 += C52418a.m58682i(99, yr23.computeSize());
            }
            String str12 = this.f228326p;
            return str12 != null ? e2 + C52418a.m58683j(100, str12) : e2;
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
            C78005vk3 vk32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 99) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr != null && bArr.length > 0) {
                        yr24.parseFrom(bArr);
                    }
                    vk32.f228325o = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr2 != null && bArr2.length > 0) {
                                jaVar3.parseFrom(bArr2);
                            }
                            vk32.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        vk32.f228317d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        vk32.f228318e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        vk32.f228319f = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        vk32.f228320g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        vk32.f228321h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C77940he2 he24 = new C77940he2();
                            if (bArr3 != null && bArr3.length > 0) {
                                he24.parseFrom(bArr3);
                            }
                            vk32.f228322i = he24;
                        }
                        return 0;
                    case 8:
                        vk32.f228323j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        vk32.f228324n = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                vk32.f228326p = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

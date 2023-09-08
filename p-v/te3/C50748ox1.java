package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ox1 */
public class C50748ox1 extends C49335eu3 {

    /* renamed from: d */
    public String f139421d;

    /* renamed from: e */
    public int f139422e;

    /* renamed from: f */
    public String f139423f;

    /* renamed from: g */
    public int f139424g;

    /* renamed from: h */
    public int f139425h;

    /* renamed from: i */
    public long f139426i;

    /* renamed from: j */
    public C49054cv3 f139427j;

    /* renamed from: n */
    public String f139428n;

    /* renamed from: o */
    public C48768av3 f139429o;

    /* renamed from: p */
    public int f139430p;

    /* renamed from: q */
    public String f139431q;

    /* renamed from: r */
    public C51018qv3 f139432r;

    /* renamed from: s */
    public C51018qv3 f139433s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50748ox1)) {
            return false;
        }
        C50748ox1 ox12 = (C50748ox1) aVar;
        return C46238a.m51546a(this.BaseResponse, ox12.BaseResponse) && C46238a.m51546a(this.f139421d, ox12.f139421d) && C46238a.m51546a(Integer.valueOf(this.f139422e), Integer.valueOf(ox12.f139422e)) && C46238a.m51546a(this.f139423f, ox12.f139423f) && C46238a.m51546a(Integer.valueOf(this.f139424g), Integer.valueOf(ox12.f139424g)) && C46238a.m51546a(Integer.valueOf(this.f139425h), Integer.valueOf(ox12.f139425h)) && C46238a.m51546a(Long.valueOf(this.f139426i), Long.valueOf(ox12.f139426i)) && C46238a.m51546a(this.f139427j, ox12.f139427j) && C46238a.m51546a(this.f139428n, ox12.f139428n) && C46238a.m51546a(this.f139429o, ox12.f139429o) && C46238a.m51546a(Integer.valueOf(this.f139430p), Integer.valueOf(ox12.f139430p)) && C46238a.m51546a(this.f139431q, ox12.f139431q) && C46238a.m51546a(this.f139432r, ox12.f139432r) && C46238a.m51546a(this.f139433s, ox12.f139433s);
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
                String str = this.f139421d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f139422e);
                String str2 = this.f139423f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74318e(5, this.f139424g);
                aVar.mo74318e(6, this.f139425h);
                aVar.mo74321h(7, this.f139426i);
                C49054cv3 cv32 = this.f139427j;
                if (cv32 != null) {
                    aVar.mo74322i(8, cv32.computeSize());
                    this.f139427j.writeFields(aVar);
                }
                String str3 = this.f139428n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                C48768av3 av32 = this.f139429o;
                if (av32 != null) {
                    aVar.mo74322i(10, av32.computeSize());
                    this.f139429o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f139430p);
                String str4 = this.f139431q;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                C51018qv3 qv32 = this.f139432r;
                if (qv32 != null) {
                    aVar.mo74322i(13, qv32.computeSize());
                    this.f139432r.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f139433s;
                if (qv33 != null) {
                    aVar.mo74322i(14, qv33.computeSize());
                    this.f139433s.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str5 = this.f139421d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            int e = i3 + C52418a.m58678e(3, this.f139422e);
            String str6 = this.f139423f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f139424g) + C52418a.m58678e(6, this.f139425h) + C52418a.m58681h(7, this.f139426i);
            C49054cv3 cv33 = this.f139427j;
            if (cv33 != null) {
                e2 += C52418a.m58682i(8, cv33.computeSize());
            }
            String str7 = this.f139428n;
            if (str7 != null) {
                e2 += C52418a.m58683j(9, str7);
            }
            C48768av3 av33 = this.f139429o;
            if (av33 != null) {
                e2 += C52418a.m58682i(10, av33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(11, this.f139430p);
            String str8 = this.f139431q;
            if (str8 != null) {
                e3 += C52418a.m58683j(12, str8);
            }
            C51018qv3 qv34 = this.f139432r;
            if (qv34 != null) {
                e3 += C52418a.m58682i(13, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f139433s;
            return qv35 != null ? e3 + C52418a.m58682i(14, qv35.computeSize()) : e3;
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
            C50748ox1 ox12 = objArr[1];
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
                        ox12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ox12.f139421d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ox12.f139422e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ox12.f139423f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ox12.f139424g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ox12.f139425h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ox12.f139426i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49054cv3 cv34 = new C49054cv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            cv34.parseFrom(bArr2);
                        }
                        ox12.f139427j = cv34;
                    }
                    return 0;
                case 9:
                    ox12.f139428n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48768av3 av34 = new C48768av3();
                        if (bArr3 != null && bArr3.length > 0) {
                            av34.parseFrom(bArr3);
                        }
                        ox12.f139429o = av34;
                    }
                    return 0;
                case 11:
                    ox12.f139430p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ox12.f139431q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv36.mo73348f(bArr4);
                        }
                        ox12.f139432r = qv36;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv37.mo73348f(bArr5);
                        }
                        ox12.f139433s = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hl3 */
public class C77943hl3 extends C49335eu3 {

    /* renamed from: d */
    public int f227578d = 268513600;

    /* renamed from: e */
    public String f227579e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public long f227580f;

    /* renamed from: g */
    public String f227581g;

    /* renamed from: h */
    public LinkedList<C64541m> f227582h = new LinkedList<>();

    /* renamed from: i */
    public String f227583i;

    /* renamed from: j */
    public String f227584j;

    /* renamed from: n */
    public C51046r14 f227585n;

    /* renamed from: o */
    public String f227586o;

    /* renamed from: p */
    public C77970o f227587p;

    /* renamed from: q */
    public C77933g43 f227588q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77943hl3)) {
            return false;
        }
        C77943hl3 hl32 = (C77943hl3) aVar;
        return C46238a.m51546a(this.BaseResponse, hl32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227578d), Integer.valueOf(hl32.f227578d)) && C46238a.m51546a(this.f227579e, hl32.f227579e) && C46238a.m51546a(Long.valueOf(this.f227580f), Long.valueOf(hl32.f227580f)) && C46238a.m51546a(this.f227581g, hl32.f227581g) && C46238a.m51546a(this.f227582h, hl32.f227582h) && C46238a.m51546a(this.f227583i, hl32.f227583i) && C46238a.m51546a(this.f227584j, hl32.f227584j) && C46238a.m51546a(this.f227585n, hl32.f227585n) && C46238a.m51546a(this.f227586o, hl32.f227586o) && C46238a.m51546a(this.f227587p, hl32.f227587p) && C46238a.m51546a(this.f227588q, hl32.f227588q);
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
                aVar.mo74318e(2, this.f227578d);
                String str = this.f227579e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f227580f);
                String str2 = this.f227581g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74320g(6, 8, this.f227582h);
                String str3 = this.f227583i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f227584j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                C51046r14 r142 = this.f227585n;
                if (r142 != null) {
                    aVar.mo74322i(9, r142.computeSize());
                    this.f227585n.writeFields(aVar);
                }
                String str5 = this.f227586o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                C77970o oVar = this.f227587p;
                if (oVar != null) {
                    aVar.mo74322i(11, oVar.computeSize());
                    this.f227587p.writeFields(aVar);
                }
                C77933g43 g432 = this.f227588q;
                if (g432 == null) {
                    return 0;
                }
                aVar.mo74322i(12, g432.computeSize());
                this.f227588q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f227578d);
            String str6 = this.f227579e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            int h = i3 + C52418a.m58681h(4, this.f227580f);
            String str7 = this.f227581g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            int g = h + C52418a.m58680g(6, 8, this.f227582h);
            String str8 = this.f227583i;
            if (str8 != null) {
                g += C52418a.m58683j(7, str8);
            }
            String str9 = this.f227584j;
            if (str9 != null) {
                g += C52418a.m58683j(8, str9);
            }
            C51046r14 r143 = this.f227585n;
            if (r143 != null) {
                g += C52418a.m58682i(9, r143.computeSize());
            }
            String str10 = this.f227586o;
            if (str10 != null) {
                g += C52418a.m58683j(10, str10);
            }
            C77970o oVar2 = this.f227587p;
            if (oVar2 != null) {
                g += C52418a.m58682i(11, oVar2.computeSize());
            }
            C77933g43 g433 = this.f227588q;
            return g433 != null ? g + C52418a.m58682i(12, g433.computeSize()) : g;
        } else if (i2 == 2) {
            this.f227582h.clear();
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
            C77943hl3 hl32 = objArr[1];
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
                        hl32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hl32.f227578d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hl32.f227579e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hl32.f227580f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    hl32.f227581g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64541m mVar = new C64541m();
                        if (bArr2 != null && bArr2.length > 0) {
                            mVar.parseFrom(bArr2);
                        }
                        hl32.f227582h.add(mVar);
                    }
                    return 0;
                case 7:
                    hl32.f227583i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hl32.f227584j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51046r14 r144 = new C51046r14();
                        if (bArr3 != null && bArr3.length > 0) {
                            r144.parseFrom(bArr3);
                        }
                        hl32.f227585n = r144;
                    }
                    return 0;
                case 10:
                    hl32.f227586o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C77970o oVar3 = new C77970o();
                        if (bArr4 != null && bArr4.length > 0) {
                            oVar3.parseFrom(bArr4);
                        }
                        hl32.f227587p = oVar3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C77933g43 g434 = new C77933g43();
                        if (bArr5 != null && bArr5.length > 0) {
                            g434.parseFrom(bArr5);
                        }
                        hl32.f227588q = g434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

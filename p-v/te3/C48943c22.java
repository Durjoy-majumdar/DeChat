package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c22 */
public class C48943c22 extends C49335eu3 {

    /* renamed from: d */
    public long f131456d;

    /* renamed from: e */
    public String f131457e;

    /* renamed from: f */
    public String f131458f;

    /* renamed from: g */
    public C51310sx f131459g;

    /* renamed from: h */
    public C49028cn3 f131460h;

    /* renamed from: i */
    public String f131461i;

    /* renamed from: j */
    public boolean f131462j = true;

    /* renamed from: n */
    public h35 f131463n;

    /* renamed from: o */
    public long f131464o;

    /* renamed from: p */
    public C50292lo2 f131465p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48943c22)) {
            return false;
        }
        C48943c22 c222 = (C48943c22) aVar;
        return C46238a.m51546a(this.BaseResponse, c222.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f131456d), Long.valueOf(c222.f131456d)) && C46238a.m51546a(this.f131457e, c222.f131457e) && C46238a.m51546a(this.f131458f, c222.f131458f) && C46238a.m51546a(this.f131459g, c222.f131459g) && C46238a.m51546a(this.f131460h, c222.f131460h) && C46238a.m51546a(this.f131461i, c222.f131461i) && C46238a.m51546a(Boolean.valueOf(this.f131462j), Boolean.valueOf(c222.f131462j)) && C46238a.m51546a(this.f131463n, c222.f131463n) && C46238a.m51546a(Long.valueOf(this.f131464o), Long.valueOf(c222.f131464o)) && C46238a.m51546a(this.f131465p, c222.f131465p);
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
                aVar.mo74321h(2, this.f131456d);
                String str = this.f131457e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f131458f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C51310sx sxVar = this.f131459g;
                if (sxVar != null) {
                    aVar.mo74322i(5, sxVar.computeSize());
                    this.f131459g.writeFields(aVar);
                }
                C49028cn3 cn32 = this.f131460h;
                if (cn32 != null) {
                    aVar.mo74322i(6, cn32.computeSize());
                    this.f131460h.writeFields(aVar);
                }
                String str3 = this.f131461i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                aVar.mo74314a(8, this.f131462j);
                h35 h35 = this.f131463n;
                if (h35 != null) {
                    aVar.mo74322i(9, h35.computeSize());
                    this.f131463n.writeFields(aVar);
                }
                aVar.mo74321h(10, this.f131464o);
                C50292lo2 lo22 = this.f131465p;
                if (lo22 == null) {
                    return 0;
                }
                aVar.mo74322i(11, lo22.computeSize());
                this.f131465p.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58681h(2, this.f131456d);
            String str4 = this.f131457e;
            if (str4 != null) {
                i3 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f131458f;
            if (str5 != null) {
                i3 += C52418a.m58683j(4, str5);
            }
            C51310sx sxVar2 = this.f131459g;
            if (sxVar2 != null) {
                i3 += C52418a.m58682i(5, sxVar2.computeSize());
            }
            C49028cn3 cn33 = this.f131460h;
            if (cn33 != null) {
                i3 += C52418a.m58682i(6, cn33.computeSize());
            }
            String str6 = this.f131461i;
            if (str6 != null) {
                i3 += C52418a.m58683j(7, str6);
            }
            int a = i3 + C52418a.m58674a(8, this.f131462j);
            h35 h352 = this.f131463n;
            if (h352 != null) {
                a += C52418a.m58682i(9, h352.computeSize());
            }
            int h = a + C52418a.m58681h(10, this.f131464o);
            C50292lo2 lo23 = this.f131465p;
            return lo23 != null ? h + C52418a.m58682i(11, lo23.computeSize()) : h;
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
            C48943c22 c222 = objArr[1];
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
                        c222.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    c222.f131456d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    c222.f131457e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c222.f131458f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51310sx sxVar3 = new C51310sx();
                        if (bArr2 != null && bArr2.length > 0) {
                            sxVar3.parseFrom(bArr2);
                        }
                        c222.f131459g = sxVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49028cn3 cn34 = new C49028cn3();
                        if (bArr3 != null && bArr3.length > 0) {
                            cn34.parseFrom(bArr3);
                        }
                        c222.f131460h = cn34;
                    }
                    return 0;
                case 7:
                    c222.f131461i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    c222.f131462j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        h35 h353 = new h35();
                        if (bArr4 != null && bArr4.length > 0) {
                            h353.parseFrom(bArr4);
                        }
                        c222.f131463n = h353;
                    }
                    return 0;
                case 10:
                    c222.f131464o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50292lo2 lo24 = new C50292lo2();
                        if (bArr5 != null && bArr5.length > 0) {
                            lo24.parseFrom(bArr5);
                        }
                        c222.f131465p = lo24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

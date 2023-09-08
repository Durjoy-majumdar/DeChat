package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o01 */
public class C50617o01 extends C49335eu3 {

    /* renamed from: d */
    public C52204z21 f138872d;

    /* renamed from: e */
    public C89349b f138873e;

    /* renamed from: f */
    public int f138874f;

    /* renamed from: g */
    public C49225e31 f138875g;

    /* renamed from: h */
    public long f138876h;

    /* renamed from: i */
    public int f138877i;

    /* renamed from: j */
    public String f138878j;

    /* renamed from: n */
    public int f138879n;

    /* renamed from: o */
    public String f138880o;

    /* renamed from: p */
    public int f138881p;

    /* renamed from: q */
    public C64432hx2 f138882q;

    /* renamed from: r */
    public C64641px2 f138883r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50617o01)) {
            return false;
        }
        C50617o01 o012 = (C50617o01) aVar;
        return C46238a.m51546a(this.BaseResponse, o012.BaseResponse) && C46238a.m51546a(this.f138872d, o012.f138872d) && C46238a.m51546a(this.f138873e, o012.f138873e) && C46238a.m51546a(Integer.valueOf(this.f138874f), Integer.valueOf(o012.f138874f)) && C46238a.m51546a(this.f138875g, o012.f138875g) && C46238a.m51546a(Long.valueOf(this.f138876h), Long.valueOf(o012.f138876h)) && C46238a.m51546a(Integer.valueOf(this.f138877i), Integer.valueOf(o012.f138877i)) && C46238a.m51546a(this.f138878j, o012.f138878j) && C46238a.m51546a(Integer.valueOf(this.f138879n), Integer.valueOf(o012.f138879n)) && C46238a.m51546a(this.f138880o, o012.f138880o) && C46238a.m51546a(Integer.valueOf(this.f138881p), Integer.valueOf(o012.f138881p)) && C46238a.m51546a(this.f138882q, o012.f138882q) && C46238a.m51546a(this.f138883r, o012.f138883r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C52204z21 z212 = this.f138872d;
            if (z212 != null) {
                aVar.mo74322i(2, z212.computeSize());
                this.f138872d.writeFields(aVar);
            }
            C89349b bVar = this.f138873e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f138874f);
            C49225e31 e312 = this.f138875g;
            if (e312 != null) {
                aVar.mo74322i(5, e312.computeSize());
                this.f138875g.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f138876h);
            aVar.mo74318e(7, this.f138877i);
            String str = this.f138878j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74318e(9, this.f138879n);
            String str2 = this.f138880o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            aVar.mo74318e(11, this.f138881p);
            C64432hx2 hx22 = this.f138882q;
            if (hx22 != null) {
                aVar.mo74322i(12, hx22.computeSize());
                this.f138882q.writeFields(aVar);
            }
            C64641px2 px22 = this.f138883r;
            if (px22 == null) {
                return 0;
            }
            aVar.mo74322i(13, px22.computeSize());
            this.f138883r.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            C52204z21 z213 = this.f138872d;
            if (z213 != null) {
                i3 += C52418a.m58682i(2, z213.computeSize());
            }
            C89349b bVar2 = this.f138873e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int e = i3 + C52418a.m58678e(4, this.f138874f);
            C49225e31 e313 = this.f138875g;
            if (e313 != null) {
                e += C52418a.m58682i(5, e313.computeSize());
            }
            int h = e + C52418a.m58681h(6, this.f138876h) + C52418a.m58678e(7, this.f138877i);
            String str3 = this.f138878j;
            if (str3 != null) {
                h += C52418a.m58683j(8, str3);
            }
            int e2 = h + C52418a.m58678e(9, this.f138879n);
            String str4 = this.f138880o;
            if (str4 != null) {
                e2 += C52418a.m58683j(10, str4);
            }
            int e3 = e2 + C52418a.m58678e(11, this.f138881p);
            C64432hx2 hx23 = this.f138882q;
            if (hx23 != null) {
                e3 += C52418a.m58682i(12, hx23.computeSize());
            }
            C64641px2 px23 = this.f138883r;
            return px23 != null ? e3 + C52418a.m58682i(13, px23.computeSize()) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50617o01 o012 = objArr[1];
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
                        o012.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52204z21 z214 = new C52204z21();
                        if (bArr2 != null && bArr2.length > 0) {
                            z214.parseFrom(bArr2);
                        }
                        o012.f138872d = z214;
                    }
                    return 0;
                case 3:
                    o012.f138873e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    o012.f138874f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49225e31 e314 = new C49225e31();
                        if (bArr3 != null && bArr3.length > 0) {
                            e314.parseFrom(bArr3);
                        }
                        o012.f138875g = e314;
                    }
                    return 0;
                case 6:
                    o012.f138876h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    o012.f138877i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    o012.f138878j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    o012.f138879n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    o012.f138880o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    o012.f138881p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64432hx2 hx24 = new C64432hx2();
                        if (bArr4 != null && bArr4.length > 0) {
                            hx24.parseFrom(bArr4);
                        }
                        o012.f138882q = hx24;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64641px2 px24 = new C64641px2();
                        if (bArr5 != null && bArr5.length > 0) {
                            px24.parseFrom(bArr5);
                        }
                        o012.f138883r = px24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

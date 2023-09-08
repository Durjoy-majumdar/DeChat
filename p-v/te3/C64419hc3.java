package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hc3 */
public class C64419hc3 extends C49335eu3 {

    /* renamed from: d */
    public int f183465d;

    /* renamed from: e */
    public String f183466e;

    /* renamed from: f */
    public az4 f183467f;

    /* renamed from: g */
    public xy4 f183468g;

    /* renamed from: h */
    public qy4 f183469h;

    /* renamed from: i */
    public yy4 f183470i;

    /* renamed from: j */
    public int f183471j;

    /* renamed from: n */
    public boolean f183472n;

    /* renamed from: o */
    public String f183473o;

    /* renamed from: p */
    public LinkedList<String> f183474p = new LinkedList<>();

    /* renamed from: q */
    public uy4 f183475q;

    /* renamed from: r */
    public C50536nf3 f183476r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64419hc3)) {
            return false;
        }
        C64419hc3 hc32 = (C64419hc3) aVar;
        return C46238a.m51546a(this.BaseResponse, hc32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f183465d), Integer.valueOf(hc32.f183465d)) && C46238a.m51546a(this.f183466e, hc32.f183466e) && C46238a.m51546a(this.f183467f, hc32.f183467f) && C46238a.m51546a(this.f183468g, hc32.f183468g) && C46238a.m51546a(this.f183469h, hc32.f183469h) && C46238a.m51546a(this.f183470i, hc32.f183470i) && C46238a.m51546a(Integer.valueOf(this.f183471j), Integer.valueOf(hc32.f183471j)) && C46238a.m51546a(Boolean.valueOf(this.f183472n), Boolean.valueOf(hc32.f183472n)) && C46238a.m51546a(this.f183473o, hc32.f183473o) && C46238a.m51546a(this.f183474p, hc32.f183474p) && C46238a.m51546a(this.f183475q, hc32.f183475q) && C46238a.m51546a(this.f183476r, hc32.f183476r);
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
                aVar.mo74318e(2, this.f183465d);
                String str = this.f183466e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                az4 az4 = this.f183467f;
                if (az4 != null) {
                    aVar.mo74322i(4, az4.computeSize());
                    this.f183467f.writeFields(aVar);
                }
                xy4 xy4 = this.f183468g;
                if (xy4 != null) {
                    aVar.mo74322i(5, xy4.computeSize());
                    this.f183468g.writeFields(aVar);
                }
                qy4 qy4 = this.f183469h;
                if (qy4 != null) {
                    aVar.mo74322i(6, qy4.computeSize());
                    this.f183469h.writeFields(aVar);
                }
                yy4 yy4 = this.f183470i;
                if (yy4 != null) {
                    aVar.mo74322i(7, yy4.computeSize());
                    this.f183470i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f183471j);
                aVar.mo74314a(9, this.f183472n);
                String str2 = this.f183473o;
                if (str2 != null) {
                    aVar.mo74323j(10, str2);
                }
                aVar.mo74320g(11, 1, this.f183474p);
                uy4 uy4 = this.f183475q;
                if (uy4 != null) {
                    aVar.mo74322i(12, uy4.computeSize());
                    this.f183475q.writeFields(aVar);
                }
                C50536nf3 nf32 = this.f183476r;
                if (nf32 != null) {
                    aVar.mo74322i(13, nf32.computeSize());
                    this.f183476r.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f183465d);
            String str3 = this.f183466e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            az4 az42 = this.f183467f;
            if (az42 != null) {
                e += C52418a.m58682i(4, az42.computeSize());
            }
            xy4 xy42 = this.f183468g;
            if (xy42 != null) {
                e += C52418a.m58682i(5, xy42.computeSize());
            }
            qy4 qy42 = this.f183469h;
            if (qy42 != null) {
                e += C52418a.m58682i(6, qy42.computeSize());
            }
            yy4 yy42 = this.f183470i;
            if (yy42 != null) {
                e += C52418a.m58682i(7, yy42.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f183471j) + C52418a.m58674a(9, this.f183472n);
            String str4 = this.f183473o;
            if (str4 != null) {
                e2 += C52418a.m58683j(10, str4);
            }
            int g = e2 + C52418a.m58680g(11, 1, this.f183474p);
            uy4 uy42 = this.f183475q;
            if (uy42 != null) {
                g += C52418a.m58682i(12, uy42.computeSize());
            }
            C50536nf3 nf33 = this.f183476r;
            return nf33 != null ? g + C52418a.m58682i(13, nf33.computeSize()) : g;
        } else if (i2 == 2) {
            this.f183474p.clear();
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
            C64419hc3 hc32 = objArr[1];
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
                        hc32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hc32.f183465d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hc32.f183466e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        az4 az43 = new az4();
                        if (bArr2 != null && bArr2.length > 0) {
                            az43.parseFrom(bArr2);
                        }
                        hc32.f183467f = az43;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        xy4 xy43 = new xy4();
                        if (bArr3 != null && bArr3.length > 0) {
                            xy43.parseFrom(bArr3);
                        }
                        hc32.f183468g = xy43;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        qy4 qy43 = new qy4();
                        if (bArr4 != null && bArr4.length > 0) {
                            qy43.parseFrom(bArr4);
                        }
                        hc32.f183469h = qy43;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        yy4 yy43 = new yy4();
                        if (bArr5 != null && bArr5.length > 0) {
                            yy43.parseFrom(bArr5);
                        }
                        hc32.f183470i = yy43;
                    }
                    return 0;
                case 8:
                    hc32.f183471j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hc32.f183472n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    hc32.f183473o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    hc32.f183474p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        uy4 uy43 = new uy4();
                        if (bArr6 != null && bArr6.length > 0) {
                            uy43.parseFrom(bArr6);
                        }
                        hc32.f183475q = uy43;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C50536nf3 nf34 = new C50536nf3();
                        if (bArr7 != null && bArr7.length > 0) {
                            nf34.parseFrom(bArr7);
                        }
                        hc32.f183476r = nf34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.go0 */
public class C49585go0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C49765hx0> f134155d = new LinkedList<>();

    /* renamed from: e */
    public long f134156e;

    /* renamed from: f */
    public LinkedList<C49765hx0> f134157f = new LinkedList<>();

    /* renamed from: g */
    public long f134158g;

    /* renamed from: h */
    public int f134159h;

    /* renamed from: i */
    public int f134160i;

    /* renamed from: j */
    public C49765hx0 f134161j;

    /* renamed from: n */
    public C89349b f134162n;

    /* renamed from: o */
    public int f134163o;

    /* renamed from: p */
    public int f134164p;

    /* renamed from: q */
    public LinkedList<C51349t61> f134165q = new LinkedList<>();

    /* renamed from: r */
    public long f134166r;

    /* renamed from: s */
    public String f134167s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49585go0)) {
            return false;
        }
        C49585go0 go02 = (C49585go0) aVar;
        return C46238a.m51546a(this.BaseResponse, go02.BaseResponse) && C46238a.m51546a(this.f134155d, go02.f134155d) && C46238a.m51546a(Long.valueOf(this.f134156e), Long.valueOf(go02.f134156e)) && C46238a.m51546a(this.f134157f, go02.f134157f) && C46238a.m51546a(Long.valueOf(this.f134158g), Long.valueOf(go02.f134158g)) && C46238a.m51546a(Integer.valueOf(this.f134159h), Integer.valueOf(go02.f134159h)) && C46238a.m51546a(Integer.valueOf(this.f134160i), Integer.valueOf(go02.f134160i)) && C46238a.m51546a(this.f134161j, go02.f134161j) && C46238a.m51546a(this.f134162n, go02.f134162n) && C46238a.m51546a(Integer.valueOf(this.f134163o), Integer.valueOf(go02.f134163o)) && C46238a.m51546a(Integer.valueOf(this.f134164p), Integer.valueOf(go02.f134164p)) && C46238a.m51546a(this.f134165q, go02.f134165q) && C46238a.m51546a(Long.valueOf(this.f134166r), Long.valueOf(go02.f134166r)) && C46238a.m51546a(this.f134167s, go02.f134167s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f134155d);
            aVar.mo74321h(3, this.f134156e);
            aVar.mo74320g(4, 8, this.f134157f);
            aVar.mo74321h(5, this.f134158g);
            aVar.mo74318e(6, this.f134159h);
            aVar.mo74318e(7, this.f134160i);
            C49765hx0 hx02 = this.f134161j;
            if (hx02 != null) {
                aVar.mo74322i(8, hx02.computeSize());
                this.f134161j.writeFields(aVar);
            }
            C89349b bVar = this.f134162n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            aVar.mo74318e(10, this.f134163o);
            aVar.mo74318e(11, this.f134164p);
            aVar.mo74320g(12, 8, this.f134165q);
            aVar.mo74321h(13, this.f134166r);
            String str = this.f134167s;
            if (str != null) {
                aVar.mo74323j(14, str);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f134155d) + C52418a.m58681h(3, this.f134156e) + C52418a.m58680g(4, 8, this.f134157f) + C52418a.m58681h(5, this.f134158g) + C52418a.m58678e(6, this.f134159h) + C52418a.m58678e(7, this.f134160i);
            C49765hx0 hx03 = this.f134161j;
            if (hx03 != null) {
                g += C52418a.m58682i(8, hx03.computeSize());
            }
            C89349b bVar2 = this.f134162n;
            if (bVar2 != null) {
                g += C52418a.m58675b(9, bVar2);
            }
            int e = g + C52418a.m58678e(10, this.f134163o) + C52418a.m58678e(11, this.f134164p) + C52418a.m58680g(12, 8, this.f134165q) + C52418a.m58681h(13, this.f134166r);
            String str2 = this.f134167s;
            return str2 != null ? e + C52418a.m58683j(14, str2) : e;
        } else if (i2 == 2) {
            this.f134155d.clear();
            this.f134157f.clear();
            this.f134165q.clear();
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
            C49585go0 go02 = objArr[1];
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
                        go02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49765hx0 hx04 = new C49765hx0();
                        if (bArr2 != null && bArr2.length > 0) {
                            hx04.parseFrom(bArr2);
                        }
                        go02.f134155d.add(hx04);
                    }
                    return 0;
                case 3:
                    go02.f134156e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49765hx0 hx05 = new C49765hx0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hx05.parseFrom(bArr3);
                        }
                        go02.f134157f.add(hx05);
                    }
                    return 0;
                case 5:
                    go02.f134158g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    go02.f134159h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    go02.f134160i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49765hx0 hx06 = new C49765hx0();
                        if (bArr4 != null && bArr4.length > 0) {
                            hx06.parseFrom(bArr4);
                        }
                        go02.f134161j = hx06;
                    }
                    return 0;
                case 9:
                    go02.f134162n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    go02.f134163o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    go02.f134164p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51349t61 t612 = new C51349t61();
                        if (bArr5 != null && bArr5.length > 0) {
                            t612.parseFrom(bArr5);
                        }
                        go02.f134165q.add(t612);
                    }
                    return 0;
                case 13:
                    go02.f134166r = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    go02.f134167s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

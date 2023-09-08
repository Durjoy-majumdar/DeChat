package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mo0 */
public class C50427mo0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50767p11> f138125d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f138126e;

    /* renamed from: f */
    public int f138127f;

    /* renamed from: g */
    public int f138128g;

    /* renamed from: h */
    public C51909x11 f138129h;

    /* renamed from: i */
    public LinkedList<C51328t11> f138130i = new LinkedList<>();

    /* renamed from: j */
    public C48830ba3 f138131j;

    /* renamed from: n */
    public C50381mc0 f138132n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50427mo0)) {
            return false;
        }
        C50427mo0 mo02 = (C50427mo0) aVar;
        return C46238a.m51546a(this.BaseResponse, mo02.BaseResponse) && C46238a.m51546a(this.f138125d, mo02.f138125d) && C46238a.m51546a(this.f138126e, mo02.f138126e) && C46238a.m51546a(Integer.valueOf(this.f138127f), Integer.valueOf(mo02.f138127f)) && C46238a.m51546a(Integer.valueOf(this.f138128g), Integer.valueOf(mo02.f138128g)) && C46238a.m51546a(this.f138129h, mo02.f138129h) && C46238a.m51546a(this.f138130i, mo02.f138130i) && C46238a.m51546a(this.f138131j, mo02.f138131j) && C46238a.m51546a(this.f138132n, mo02.f138132n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f138125d);
            C89349b bVar = this.f138126e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f138127f);
            aVar.mo74318e(5, this.f138128g);
            C51909x11 x112 = this.f138129h;
            if (x112 != null) {
                aVar.mo74322i(6, x112.computeSize());
                this.f138129h.writeFields(aVar);
            }
            aVar.mo74320g(7, 8, this.f138130i);
            C48830ba3 ba32 = this.f138131j;
            if (ba32 != null) {
                aVar.mo74322i(9, ba32.computeSize());
                this.f138131j.writeFields(aVar);
            }
            C50381mc0 mc02 = this.f138132n;
            if (mc02 != null) {
                aVar.mo74322i(10, mc02.computeSize());
                this.f138132n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138125d);
            C89349b bVar2 = this.f138126e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f138127f) + C52418a.m58678e(5, this.f138128g);
            C51909x11 x113 = this.f138129h;
            if (x113 != null) {
                e += C52418a.m58682i(6, x113.computeSize());
            }
            int g2 = e + C52418a.m58680g(7, 8, this.f138130i);
            C48830ba3 ba33 = this.f138131j;
            if (ba33 != null) {
                g2 += C52418a.m58682i(9, ba33.computeSize());
            }
            C50381mc0 mc03 = this.f138132n;
            return mc03 != null ? g2 + C52418a.m58682i(10, mc03.computeSize()) : g2;
        } else if (i == 2) {
            this.f138125d.clear();
            this.f138130i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50427mo0 mo02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        mo02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50767p11 p112 = new C50767p11();
                        if (bArr2 != null && bArr2.length > 0) {
                            p112.parseFrom(bArr2);
                        }
                        mo02.f138125d.add(p112);
                    }
                    return 0;
                case 3:
                    mo02.f138126e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    mo02.f138127f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mo02.f138128g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51909x11 x114 = new C51909x11();
                        if (bArr3 != null && bArr3.length > 0) {
                            x114.parseFrom(bArr3);
                        }
                        mo02.f138129h = x114;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51328t11 t112 = new C51328t11();
                        if (bArr4 != null && bArr4.length > 0) {
                            t112.parseFrom(bArr4);
                        }
                        mo02.f138130i.add(t112);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C48830ba3 ba34 = new C48830ba3();
                        if (bArr5 != null && bArr5.length > 0) {
                            ba34.parseFrom(bArr5);
                        }
                        mo02.f138131j = ba34;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C50381mc0 mc04 = new C50381mc0();
                        if (bArr6 != null && bArr6.length > 0) {
                            mc04.parseFrom(bArr6);
                        }
                        mo02.f138132n = mc04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

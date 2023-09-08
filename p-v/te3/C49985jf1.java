package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jf1 */
public class C49985jf1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49839if1> f136091d = new LinkedList<>();

    /* renamed from: e */
    public C49552gf1 f136092e;

    /* renamed from: f */
    public C49696hf1 f136093f;

    /* renamed from: g */
    public C49696hf1 f136094g;

    /* renamed from: h */
    public C51967xf3 f136095h;

    /* renamed from: i */
    public LinkedList<C48996cf1> f136096i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C49138df1> f136097j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49985jf1)) {
            return false;
        }
        C49985jf1 jf12 = (C49985jf1) aVar;
        return C46238a.m51546a(this.f136091d, jf12.f136091d) && C46238a.m51546a(this.f136092e, jf12.f136092e) && C46238a.m51546a(this.f136093f, jf12.f136093f) && C46238a.m51546a(this.f136094g, jf12.f136094g) && C46238a.m51546a(this.f136095h, jf12.f136095h) && C46238a.m51546a(this.f136096i, jf12.f136096i) && C46238a.m51546a(this.f136097j, jf12.f136097j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f136091d);
            C49552gf1 gf12 = this.f136092e;
            if (gf12 != null) {
                aVar.mo74322i(2, gf12.computeSize());
                this.f136092e.writeFields(aVar);
            }
            C49696hf1 hf12 = this.f136093f;
            if (hf12 != null) {
                aVar.mo74322i(3, hf12.computeSize());
                this.f136093f.writeFields(aVar);
            }
            C49696hf1 hf13 = this.f136094g;
            if (hf13 != null) {
                aVar.mo74322i(4, hf13.computeSize());
                this.f136094g.writeFields(aVar);
            }
            C51967xf3 xf32 = this.f136095h;
            if (xf32 != null) {
                aVar.mo74322i(5, xf32.computeSize());
                this.f136095h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f136096i);
            aVar.mo74320g(7, 8, this.f136097j);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f136091d) + 0;
            C49552gf1 gf13 = this.f136092e;
            if (gf13 != null) {
                g += C52418a.m58682i(2, gf13.computeSize());
            }
            C49696hf1 hf14 = this.f136093f;
            if (hf14 != null) {
                g += C52418a.m58682i(3, hf14.computeSize());
            }
            C49696hf1 hf15 = this.f136094g;
            if (hf15 != null) {
                g += C52418a.m58682i(4, hf15.computeSize());
            }
            C51967xf3 xf33 = this.f136095h;
            if (xf33 != null) {
                g += C52418a.m58682i(5, xf33.computeSize());
            }
            return g + C52418a.m58680g(6, 8, this.f136096i) + C52418a.m58680g(7, 8, this.f136097j);
        } else if (i == 2) {
            this.f136091d.clear();
            this.f136096i.clear();
            this.f136097j.clear();
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
            C49985jf1 jf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49839if1 if12 = new C49839if1();
                        if (bArr != null && bArr.length > 0) {
                            if12.parseFrom(bArr);
                        }
                        jf12.f136091d.add(if12);
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49552gf1 gf14 = new C49552gf1();
                        if (bArr2 != null && bArr2.length > 0) {
                            gf14.parseFrom(bArr2);
                        }
                        jf12.f136092e = gf14;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C49696hf1 hf16 = new C49696hf1();
                        if (bArr3 != null && bArr3.length > 0) {
                            hf16.parseFrom(bArr3);
                        }
                        jf12.f136093f = hf16;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C49696hf1 hf17 = new C49696hf1();
                        if (bArr4 != null && bArr4.length > 0) {
                            hf17.parseFrom(bArr4);
                        }
                        jf12.f136094g = hf17;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C51967xf3 xf34 = new C51967xf3();
                        if (bArr5 != null && bArr5.length > 0) {
                            xf34.parseFrom(bArr5);
                        }
                        jf12.f136095h = xf34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C48996cf1 cf12 = new C48996cf1();
                        if (bArr6 != null && bArr6.length > 0) {
                            cf12.parseFrom(bArr6);
                        }
                        jf12.f136096i.add(cf12);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i8 = 0; i8 < size7; i8++) {
                        byte[] bArr7 = j7.get(i8);
                        C49138df1 df12 = new C49138df1();
                        if (bArr7 != null && bArr7.length > 0) {
                            df12.parseFrom(bArr7);
                        }
                        jf12.f136097j.add(df12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

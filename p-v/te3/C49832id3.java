package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.id3 */
public class C49832id3 extends C47465a {

    /* renamed from: d */
    public C51975xh2 f135244d;

    /* renamed from: e */
    public zf4 f135245e;

    /* renamed from: f */
    public zf4 f135246f;

    /* renamed from: g */
    public LinkedList<C48741ao> f135247g = new LinkedList<>();

    /* renamed from: h */
    public C49794i33 f135248h;

    /* renamed from: i */
    public LinkedList<C49794i33> f135249i = new LinkedList<>();

    /* renamed from: j */
    public C49690hd3 f135250j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49832id3)) {
            return false;
        }
        C49832id3 id32 = (C49832id3) aVar;
        return C46238a.m51546a(this.f135244d, id32.f135244d) && C46238a.m51546a(this.f135245e, id32.f135245e) && C46238a.m51546a(this.f135246f, id32.f135246f) && C46238a.m51546a(this.f135247g, id32.f135247g) && C46238a.m51546a(this.f135248h, id32.f135248h) && C46238a.m51546a(this.f135249i, id32.f135249i) && C46238a.m51546a(this.f135250j, id32.f135250j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51975xh2 xh22 = this.f135244d;
            if (xh22 != null) {
                aVar.mo74322i(1, xh22.computeSize());
                this.f135244d.writeFields(aVar);
            }
            zf4 zf4 = this.f135245e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f135245e.writeFields(aVar);
            }
            zf4 zf42 = this.f135246f;
            if (zf42 != null) {
                aVar.mo74322i(3, zf42.computeSize());
                this.f135246f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f135247g);
            C49794i33 i332 = this.f135248h;
            if (i332 != null) {
                aVar.mo74322i(5, i332.computeSize());
                this.f135248h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f135249i);
            C49690hd3 hd32 = this.f135250j;
            if (hd32 != null) {
                aVar.mo74322i(7, hd32.computeSize());
                this.f135250j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51975xh2 xh23 = this.f135244d;
            if (xh23 != null) {
                i2 = 0 + C52418a.m58682i(1, xh23.computeSize());
            }
            zf4 zf43 = this.f135245e;
            if (zf43 != null) {
                i2 += C52418a.m58682i(2, zf43.computeSize());
            }
            zf4 zf44 = this.f135246f;
            if (zf44 != null) {
                i2 += C52418a.m58682i(3, zf44.computeSize());
            }
            int g = i2 + C52418a.m58680g(4, 8, this.f135247g);
            C49794i33 i333 = this.f135248h;
            if (i333 != null) {
                g += C52418a.m58682i(5, i333.computeSize());
            }
            int g2 = g + C52418a.m58680g(6, 8, this.f135249i);
            C49690hd3 hd33 = this.f135250j;
            return hd33 != null ? g2 + C52418a.m58682i(7, hd33.computeSize()) : g2;
        } else if (i == 2) {
            this.f135247g.clear();
            this.f135249i.clear();
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
            C49832id3 id32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr != null && bArr.length > 0) {
                            xh24.parseFrom(bArr);
                        }
                        id32.f135244d = xh24;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        zf4 zf45 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf45.parseFrom(bArr2);
                        }
                        id32.f135245e = zf45;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        zf4 zf46 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf46.parseFrom(bArr3);
                        }
                        id32.f135246f = zf46;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48741ao aoVar = new C48741ao();
                        if (bArr4 != null && bArr4.length > 0) {
                            aoVar.parseFrom(bArr4);
                        }
                        id32.f135247g.add(aoVar);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49794i33 i334 = new C49794i33();
                        if (bArr5 != null && bArr5.length > 0) {
                            i334.parseFrom(bArr5);
                        }
                        id32.f135248h = i334;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C49794i33 i335 = new C49794i33();
                        if (bArr6 != null && bArr6.length > 0) {
                            i335.parseFrom(bArr6);
                        }
                        id32.f135249i.add(i335);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C49690hd3 hd34 = new C49690hd3();
                        if (bArr7 != null && bArr7.length > 0) {
                            hd34.parseFrom(bArr7);
                        }
                        id32.f135250j = hd34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

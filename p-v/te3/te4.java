package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class te4 extends C47465a {

    /* renamed from: d */
    public C51975xh2 f142182d;

    /* renamed from: e */
    public LinkedList<zf4> f142183e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<zf4> f142184f = new LinkedList<>();

    /* renamed from: g */
    public C51975xh2 f142185g;

    /* renamed from: h */
    public C50162kp3 f142186h;

    /* renamed from: i */
    public String f142187i;

    /* renamed from: j */
    public C49118da3 f142188j;

    /* renamed from: n */
    public C50456mv3 f142189n;

    /* renamed from: o */
    public C50315lv3 f142190o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof te4)) {
            return false;
        }
        te4 te4 = (te4) aVar;
        return C46238a.m51546a(this.f142182d, te4.f142182d) && C46238a.m51546a(this.f142183e, te4.f142183e) && C46238a.m51546a(this.f142184f, te4.f142184f) && C46238a.m51546a(this.f142185g, te4.f142185g) && C46238a.m51546a(this.f142186h, te4.f142186h) && C46238a.m51546a(this.f142187i, te4.f142187i) && C46238a.m51546a(this.f142188j, te4.f142188j) && C46238a.m51546a(this.f142189n, te4.f142189n) && C46238a.m51546a(this.f142190o, te4.f142190o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51975xh2 xh22 = this.f142182d;
            if (xh22 != null) {
                aVar.mo74322i(1, xh22.computeSize());
                this.f142182d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f142183e);
            aVar.mo74320g(3, 8, this.f142184f);
            C51975xh2 xh23 = this.f142185g;
            if (xh23 != null) {
                aVar.mo74322i(4, xh23.computeSize());
                this.f142185g.writeFields(aVar);
            }
            C50162kp3 kp32 = this.f142186h;
            if (kp32 != null) {
                aVar.mo74322i(5, kp32.computeSize());
                this.f142186h.writeFields(aVar);
            }
            String str = this.f142187i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C49118da3 da32 = this.f142188j;
            if (da32 != null) {
                aVar.mo74322i(7, da32.computeSize());
                this.f142188j.writeFields(aVar);
            }
            C50456mv3 mv32 = this.f142189n;
            if (mv32 != null) {
                aVar.mo74322i(8, mv32.computeSize());
                this.f142189n.writeFields(aVar);
            }
            C50315lv3 lv32 = this.f142190o;
            if (lv32 != null) {
                aVar.mo74322i(9, lv32.computeSize());
                this.f142190o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51975xh2 xh24 = this.f142182d;
            if (xh24 != null) {
                i2 = 0 + C52418a.m58682i(1, xh24.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f142183e) + C52418a.m58680g(3, 8, this.f142184f);
            C51975xh2 xh25 = this.f142185g;
            if (xh25 != null) {
                g += C52418a.m58682i(4, xh25.computeSize());
            }
            C50162kp3 kp33 = this.f142186h;
            if (kp33 != null) {
                g += C52418a.m58682i(5, kp33.computeSize());
            }
            String str2 = this.f142187i;
            if (str2 != null) {
                g += C52418a.m58683j(6, str2);
            }
            C49118da3 da33 = this.f142188j;
            if (da33 != null) {
                g += C52418a.m58682i(7, da33.computeSize());
            }
            C50456mv3 mv33 = this.f142189n;
            if (mv33 != null) {
                g += C52418a.m58682i(8, mv33.computeSize());
            }
            C50315lv3 lv33 = this.f142190o;
            return lv33 != null ? g + C52418a.m58682i(9, lv33.computeSize()) : g;
        } else if (i == 2) {
            this.f142183e.clear();
            this.f142184f.clear();
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
            te4 te4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51975xh2 xh26 = new C51975xh2();
                        if (bArr != null && bArr.length > 0) {
                            xh26.parseFrom(bArr);
                        }
                        te4.f142182d = xh26;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        zf4 zf4 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf4.parseFrom(bArr2);
                        }
                        te4.f142183e.add(zf4);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        zf4 zf42 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf42.parseFrom(bArr3);
                        }
                        te4.f142184f.add(zf42);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51975xh2 xh27 = new C51975xh2();
                        if (bArr4 != null && bArr4.length > 0) {
                            xh27.parseFrom(bArr4);
                        }
                        te4.f142185g = xh27;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50162kp3 kp34 = new C50162kp3();
                        if (bArr5 != null && bArr5.length > 0) {
                            kp34.parseFrom(bArr5);
                        }
                        te4.f142186h = kp34;
                    }
                    return 0;
                case 6:
                    te4.f142187i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C49118da3 da34 = new C49118da3();
                        if (bArr6 != null && bArr6.length > 0) {
                            da34.parseFrom(bArr6);
                        }
                        te4.f142188j = da34;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            mv34.parseFrom(bArr7);
                        }
                        te4.f142189n = mv34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C50315lv3 lv34 = new C50315lv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            lv34.parseFrom(bArr8);
                        }
                        te4.f142190o = lv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v40 */
public class C51643v40 extends C47465a {

    /* renamed from: d */
    public boolean f143290d;

    /* renamed from: e */
    public String f143291e;

    /* renamed from: f */
    public C51975xh2 f143292f;

    /* renamed from: g */
    public zf4 f143293g;

    /* renamed from: h */
    public LinkedList<zf4> f143294h = new LinkedList<>();

    /* renamed from: i */
    public boolean f143295i;

    /* renamed from: j */
    public int f143296j;

    /* renamed from: n */
    public C48730al f143297n;

    /* renamed from: o */
    public C48730al f143298o;

    /* renamed from: p */
    public zf4 f143299p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51643v40)) {
            return false;
        }
        C51643v40 v402 = (C51643v40) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f143290d), Boolean.valueOf(v402.f143290d)) && C46238a.m51546a(this.f143291e, v402.f143291e) && C46238a.m51546a(this.f143292f, v402.f143292f) && C46238a.m51546a(this.f143293g, v402.f143293g) && C46238a.m51546a(this.f143294h, v402.f143294h) && C46238a.m51546a(Boolean.valueOf(this.f143295i), Boolean.valueOf(v402.f143295i)) && C46238a.m51546a(Integer.valueOf(this.f143296j), Integer.valueOf(v402.f143296j)) && C46238a.m51546a(this.f143297n, v402.f143297n) && C46238a.m51546a(this.f143298o, v402.f143298o) && C46238a.m51546a(this.f143299p, v402.f143299p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f143290d);
            String str = this.f143291e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C51975xh2 xh22 = this.f143292f;
            if (xh22 != null) {
                aVar.mo74322i(3, xh22.computeSize());
                this.f143292f.writeFields(aVar);
            }
            zf4 zf4 = this.f143293g;
            if (zf4 != null) {
                aVar.mo74322i(4, zf4.computeSize());
                this.f143293g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f143294h);
            aVar.mo74314a(6, this.f143295i);
            aVar.mo74318e(7, this.f143296j);
            C48730al alVar = this.f143297n;
            if (alVar != null) {
                aVar.mo74322i(8, alVar.computeSize());
                this.f143297n.writeFields(aVar);
            }
            C48730al alVar2 = this.f143298o;
            if (alVar2 != null) {
                aVar.mo74322i(9, alVar2.computeSize());
                this.f143298o.writeFields(aVar);
            }
            zf4 zf42 = this.f143299p;
            if (zf42 != null) {
                aVar.mo74322i(10, zf42.computeSize());
                this.f143299p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f143290d) + 0;
            String str2 = this.f143291e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            C51975xh2 xh23 = this.f143292f;
            if (xh23 != null) {
                a += C52418a.m58682i(3, xh23.computeSize());
            }
            zf4 zf43 = this.f143293g;
            if (zf43 != null) {
                a += C52418a.m58682i(4, zf43.computeSize());
            }
            int g = a + C52418a.m58680g(5, 8, this.f143294h) + C52418a.m58674a(6, this.f143295i) + C52418a.m58678e(7, this.f143296j);
            C48730al alVar3 = this.f143297n;
            if (alVar3 != null) {
                g += C52418a.m58682i(8, alVar3.computeSize());
            }
            C48730al alVar4 = this.f143298o;
            if (alVar4 != null) {
                g += C52418a.m58682i(9, alVar4.computeSize());
            }
            zf4 zf44 = this.f143299p;
            return zf44 != null ? g + C52418a.m58682i(10, zf44.computeSize()) : g;
        } else if (i == 2) {
            this.f143294h.clear();
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
            C51643v40 v402 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v402.f143290d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    v402.f143291e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr != null && bArr.length > 0) {
                            xh24.parseFrom(bArr);
                        }
                        v402.f143292f = xh24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        zf4 zf45 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf45.parseFrom(bArr2);
                        }
                        v402.f143293g = zf45;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        zf4 zf46 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf46.parseFrom(bArr3);
                        }
                        v402.f143294h.add(zf46);
                    }
                    return 0;
                case 6:
                    v402.f143295i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    v402.f143296j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C48730al alVar5 = new C48730al();
                        if (bArr4 != null && bArr4.length > 0) {
                            alVar5.parseFrom(bArr4);
                        }
                        v402.f143297n = alVar5;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C48730al alVar6 = new C48730al();
                        if (bArr5 != null && bArr5.length > 0) {
                            alVar6.parseFrom(bArr5);
                        }
                        v402.f143298o = alVar6;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        zf4 zf47 = new zf4();
                        if (bArr6 != null && bArr6.length > 0) {
                            zf47.parseFrom(bArr6);
                        }
                        v402.f143299p = zf47;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

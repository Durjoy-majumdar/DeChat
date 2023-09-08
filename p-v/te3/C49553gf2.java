package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gf2 */
public class C49553gf2 extends C47465a {

    /* renamed from: d */
    public C48730al f134016d;

    /* renamed from: e */
    public C51975xh2 f134017e;

    /* renamed from: f */
    public zf4 f134018f;

    /* renamed from: g */
    public zf4 f134019g;

    /* renamed from: h */
    public C49587go2 f134020h;

    /* renamed from: i */
    public LinkedList<C48730al> f134021i = new LinkedList<>();

    /* renamed from: j */
    public String f134022j;

    /* renamed from: n */
    public C49418ff2 f134023n;

    /* renamed from: o */
    public C49278ef2 f134024o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49553gf2)) {
            return false;
        }
        C49553gf2 gf22 = (C49553gf2) aVar;
        return C46238a.m51546a(this.f134016d, gf22.f134016d) && C46238a.m51546a(this.f134017e, gf22.f134017e) && C46238a.m51546a(this.f134018f, gf22.f134018f) && C46238a.m51546a(this.f134019g, gf22.f134019g) && C46238a.m51546a(this.f134020h, gf22.f134020h) && C46238a.m51546a(this.f134021i, gf22.f134021i) && C46238a.m51546a(this.f134022j, gf22.f134022j) && C46238a.m51546a(this.f134023n, gf22.f134023n) && C46238a.m51546a(this.f134024o, gf22.f134024o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48730al alVar = this.f134016d;
            if (alVar != null) {
                aVar.mo74322i(1, alVar.computeSize());
                this.f134016d.writeFields(aVar);
            }
            C51975xh2 xh22 = this.f134017e;
            if (xh22 != null) {
                aVar.mo74322i(2, xh22.computeSize());
                this.f134017e.writeFields(aVar);
            }
            zf4 zf4 = this.f134018f;
            if (zf4 != null) {
                aVar.mo74322i(3, zf4.computeSize());
                this.f134018f.writeFields(aVar);
            }
            zf4 zf42 = this.f134019g;
            if (zf42 != null) {
                aVar.mo74322i(4, zf42.computeSize());
                this.f134019g.writeFields(aVar);
            }
            C49587go2 go22 = this.f134020h;
            if (go22 != null) {
                aVar.mo74322i(5, go22.computeSize());
                this.f134020h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f134021i);
            String str = this.f134022j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            C49418ff2 ff22 = this.f134023n;
            if (ff22 != null) {
                aVar.mo74322i(8, ff22.computeSize());
                this.f134023n.writeFields(aVar);
            }
            C49278ef2 ef22 = this.f134024o;
            if (ef22 != null) {
                aVar.mo74322i(9, ef22.computeSize());
                this.f134024o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48730al alVar2 = this.f134016d;
            if (alVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, alVar2.computeSize());
            }
            C51975xh2 xh23 = this.f134017e;
            if (xh23 != null) {
                i2 += C52418a.m58682i(2, xh23.computeSize());
            }
            zf4 zf43 = this.f134018f;
            if (zf43 != null) {
                i2 += C52418a.m58682i(3, zf43.computeSize());
            }
            zf4 zf44 = this.f134019g;
            if (zf44 != null) {
                i2 += C52418a.m58682i(4, zf44.computeSize());
            }
            C49587go2 go23 = this.f134020h;
            if (go23 != null) {
                i2 += C52418a.m58682i(5, go23.computeSize());
            }
            int g = i2 + C52418a.m58680g(6, 8, this.f134021i);
            String str2 = this.f134022j;
            if (str2 != null) {
                g += C52418a.m58683j(7, str2);
            }
            C49418ff2 ff23 = this.f134023n;
            if (ff23 != null) {
                g += C52418a.m58682i(8, ff23.computeSize());
            }
            C49278ef2 ef23 = this.f134024o;
            return ef23 != null ? g + C52418a.m58682i(9, ef23.computeSize()) : g;
        } else if (i == 2) {
            this.f134021i.clear();
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
            C49553gf2 gf22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48730al alVar3 = new C48730al();
                        if (bArr != null && bArr.length > 0) {
                            alVar3.parseFrom(bArr);
                        }
                        gf22.f134016d = alVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xh24.parseFrom(bArr2);
                        }
                        gf22.f134017e = xh24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        zf4 zf45 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf45.parseFrom(bArr3);
                        }
                        gf22.f134018f = zf45;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        zf4 zf46 = new zf4();
                        if (bArr4 != null && bArr4.length > 0) {
                            zf46.parseFrom(bArr4);
                        }
                        gf22.f134019g = zf46;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49587go2 go24 = new C49587go2();
                        if (bArr5 != null && bArr5.length > 0) {
                            go24.parseFrom(bArr5);
                        }
                        gf22.f134020h = go24;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C48730al alVar4 = new C48730al();
                        if (bArr6 != null && bArr6.length > 0) {
                            alVar4.parseFrom(bArr6);
                        }
                        gf22.f134021i.add(alVar4);
                    }
                    return 0;
                case 7:
                    gf22.f134022j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C49418ff2 ff24 = new C49418ff2();
                        if (bArr7 != null && bArr7.length > 0) {
                            ff24.parseFrom(bArr7);
                        }
                        gf22.f134023n = ff24;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C49278ef2 ef24 = new C49278ef2();
                        if (bArr8 != null && bArr8.length > 0) {
                            ef24.parseFrom(bArr8);
                        }
                        gf22.f134024o = ef24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

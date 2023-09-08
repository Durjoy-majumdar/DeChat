package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class yv4 extends C101820nt3 {

    /* renamed from: d */
    public xv4 f332367d;

    /* renamed from: e */
    public xv4 f332368e;

    /* renamed from: f */
    public xv4 f332369f;

    /* renamed from: g */
    public xv4 f332370g;

    /* renamed from: h */
    public long f332371h;

    /* renamed from: i */
    public xv4 f332372i;

    /* renamed from: j */
    public int f332373j;

    /* renamed from: n */
    public LinkedList<C51163rv3> f332374n = new LinkedList<>();

    /* renamed from: o */
    public int f332375o;

    /* renamed from: p */
    public LinkedList<C51163rv3> f332376p = new LinkedList<>();

    /* renamed from: q */
    public int f332377q;

    /* renamed from: r */
    public LinkedList<C51163rv3> f332378r = new LinkedList<>();

    /* renamed from: s */
    public int f332379s;

    /* renamed from: t */
    public LinkedList<C51163rv3> f332380t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yv4)) {
            return false;
        }
        yv4 yv4 = (yv4) aVar;
        return C46238a.m51546a(this.BaseRequest, yv4.BaseRequest) && C46238a.m51546a(this.f332367d, yv4.f332367d) && C46238a.m51546a(this.f332368e, yv4.f332368e) && C46238a.m51546a(this.f332369f, yv4.f332369f) && C46238a.m51546a(this.f332370g, yv4.f332370g) && C46238a.m51546a(Long.valueOf(this.f332371h), Long.valueOf(yv4.f332371h)) && C46238a.m51546a(this.f332372i, yv4.f332372i) && C46238a.m51546a(Integer.valueOf(this.f332373j), Integer.valueOf(yv4.f332373j)) && C46238a.m51546a(this.f332374n, yv4.f332374n) && C46238a.m51546a(Integer.valueOf(this.f332375o), Integer.valueOf(yv4.f332375o)) && C46238a.m51546a(this.f332376p, yv4.f332376p) && C46238a.m51546a(Integer.valueOf(this.f332377q), Integer.valueOf(yv4.f332377q)) && C46238a.m51546a(this.f332378r, yv4.f332378r) && C46238a.m51546a(Integer.valueOf(this.f332379s), Integer.valueOf(yv4.f332379s)) && C46238a.m51546a(this.f332380t, yv4.f332380t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f332367d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                xv4 xv4 = this.f332367d;
                if (xv4 != null) {
                    aVar.mo74322i(2, xv4.computeSize());
                    this.f332367d.writeFields(aVar);
                }
                xv4 xv42 = this.f332368e;
                if (xv42 != null) {
                    aVar.mo74322i(3, xv42.computeSize());
                    this.f332368e.writeFields(aVar);
                }
                xv4 xv43 = this.f332369f;
                if (xv43 != null) {
                    aVar.mo74322i(4, xv43.computeSize());
                    this.f332369f.writeFields(aVar);
                }
                xv4 xv44 = this.f332370g;
                if (xv44 != null) {
                    aVar.mo74322i(5, xv44.computeSize());
                    this.f332370g.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f332371h);
                xv4 xv45 = this.f332372i;
                if (xv45 != null) {
                    aVar.mo74322i(7, xv45.computeSize());
                    this.f332372i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f332373j);
                aVar.mo74320g(9, 8, this.f332374n);
                aVar.mo74318e(10, this.f332375o);
                aVar.mo74320g(11, 8, this.f332376p);
                aVar.mo74318e(12, this.f332377q);
                aVar.mo74320g(13, 8, this.f332378r);
                aVar.mo74318e(14, this.f332379s);
                aVar.mo74320g(15, 8, this.f332380t);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            xv4 xv46 = this.f332367d;
            if (xv46 != null) {
                i3 += C52418a.m58682i(2, xv46.computeSize());
            }
            xv4 xv47 = this.f332368e;
            if (xv47 != null) {
                i3 += C52418a.m58682i(3, xv47.computeSize());
            }
            xv4 xv48 = this.f332369f;
            if (xv48 != null) {
                i3 += C52418a.m58682i(4, xv48.computeSize());
            }
            xv4 xv49 = this.f332370g;
            if (xv49 != null) {
                i3 += C52418a.m58682i(5, xv49.computeSize());
            }
            int h = i3 + C52418a.m58681h(6, this.f332371h);
            xv4 xv410 = this.f332372i;
            if (xv410 != null) {
                h += C52418a.m58682i(7, xv410.computeSize());
            }
            return h + C52418a.m58678e(8, this.f332373j) + C52418a.m58680g(9, 8, this.f332374n) + C52418a.m58678e(10, this.f332375o) + C52418a.m58680g(11, 8, this.f332376p) + C52418a.m58678e(12, this.f332377q) + C52418a.m58680g(13, 8, this.f332378r) + C52418a.m58678e(14, this.f332379s) + C52418a.m58680g(15, 8, this.f332380t);
        } else if (i2 == 2) {
            this.f332374n.clear();
            this.f332376p.clear();
            this.f332378r.clear();
            this.f332380t.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f332367d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            yv4 yv4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        yv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        xv4 xv411 = new xv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            xv411.parseFrom(bArr2);
                        }
                        yv4.f332367d = xv411;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        xv4 xv412 = new xv4();
                        if (bArr3 != null && bArr3.length > 0) {
                            xv412.parseFrom(bArr3);
                        }
                        yv4.f332368e = xv412;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        xv4 xv413 = new xv4();
                        if (bArr4 != null && bArr4.length > 0) {
                            xv413.parseFrom(bArr4);
                        }
                        yv4.f332369f = xv413;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        xv4 xv414 = new xv4();
                        if (bArr5 != null && bArr5.length > 0) {
                            xv414.parseFrom(bArr5);
                        }
                        yv4.f332370g = xv414;
                    }
                    return 0;
                case 6:
                    yv4.f332371h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        xv4 xv415 = new xv4();
                        if (bArr6 != null && bArr6.length > 0) {
                            xv415.parseFrom(bArr6);
                        }
                        yv4.f332372i = xv415;
                    }
                    return 0;
                case 8:
                    yv4.f332373j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            rv32.mo73356d(bArr7);
                        }
                        yv4.f332374n.add(rv32);
                    }
                    return 0;
                case 10:
                    yv4.f332375o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51163rv3 rv33 = new C51163rv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            rv33.mo73356d(bArr8);
                        }
                        yv4.f332376p.add(rv33);
                    }
                    return 0;
                case 12:
                    yv4.f332377q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            rv34.mo73356d(bArr9);
                        }
                        yv4.f332378r.add(rv34);
                    }
                    return 0;
                case 14:
                    yv4.f332379s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51163rv3 rv35 = new C51163rv3();
                        if (bArr10 != null && bArr10.length > 0) {
                            rv35.mo73356d(bArr10);
                        }
                        yv4.f332380t.add(rv35);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

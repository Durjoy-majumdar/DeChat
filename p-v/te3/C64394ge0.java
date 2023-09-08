package te3;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ge0 */
public class C64394ge0 extends C47465a {

    /* renamed from: d */
    public int f183308d;

    /* renamed from: e */
    public C64736tq2 f183309e;

    /* renamed from: f */
    public C64267br2 f183310f;

    /* renamed from: g */
    public FinderFeedReportObject f183311g;

    /* renamed from: h */
    public C64447ih1 f183312h;

    /* renamed from: i */
    public C50271lj0 f183313i;

    /* renamed from: j */
    public C64267br2 f183314j;

    /* renamed from: n */
    public C64267br2 f183315n;

    /* renamed from: o */
    public C64532lq2 f183316o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64394ge0)) {
            return false;
        }
        C64394ge0 ge02 = (C64394ge0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183308d), Integer.valueOf(ge02.f183308d)) && C46238a.m51546a(this.f183309e, ge02.f183309e) && C46238a.m51546a(this.f183310f, ge02.f183310f) && C46238a.m51546a(this.f183311g, ge02.f183311g) && C46238a.m51546a(this.f183312h, ge02.f183312h) && C46238a.m51546a(this.f183313i, ge02.f183313i) && C46238a.m51546a(this.f183314j, ge02.f183314j) && C46238a.m51546a(this.f183315n, ge02.f183315n) && C46238a.m51546a(this.f183316o, ge02.f183316o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183308d);
            C64736tq2 tq22 = this.f183309e;
            if (tq22 != null) {
                aVar.mo74322i(2, tq22.computeSize());
                this.f183309e.writeFields(aVar);
            }
            C64267br2 br22 = this.f183310f;
            if (br22 != null) {
                aVar.mo74322i(3, br22.computeSize());
                this.f183310f.writeFields(aVar);
            }
            FinderFeedReportObject finderFeedReportObject = this.f183311g;
            if (finderFeedReportObject != null) {
                aVar.mo74322i(4, finderFeedReportObject.computeSize());
                this.f183311g.writeFields(aVar);
            }
            C64447ih1 ih12 = this.f183312h;
            if (ih12 != null) {
                aVar.mo74322i(5, ih12.computeSize());
                this.f183312h.writeFields(aVar);
            }
            C50271lj0 lj02 = this.f183313i;
            if (lj02 != null) {
                aVar.mo74322i(6, lj02.computeSize());
                this.f183313i.writeFields(aVar);
            }
            C64267br2 br23 = this.f183314j;
            if (br23 != null) {
                aVar.mo74322i(7, br23.computeSize());
                this.f183314j.writeFields(aVar);
            }
            C64267br2 br24 = this.f183315n;
            if (br24 != null) {
                aVar.mo74322i(8, br24.computeSize());
                this.f183315n.writeFields(aVar);
            }
            C64532lq2 lq22 = this.f183316o;
            if (lq22 != null) {
                aVar.mo74322i(9, lq22.computeSize());
                this.f183316o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183308d) + 0;
            C64736tq2 tq23 = this.f183309e;
            if (tq23 != null) {
                e += C52418a.m58682i(2, tq23.computeSize());
            }
            C64267br2 br25 = this.f183310f;
            if (br25 != null) {
                e += C52418a.m58682i(3, br25.computeSize());
            }
            FinderFeedReportObject finderFeedReportObject2 = this.f183311g;
            if (finderFeedReportObject2 != null) {
                e += C52418a.m58682i(4, finderFeedReportObject2.computeSize());
            }
            C64447ih1 ih13 = this.f183312h;
            if (ih13 != null) {
                e += C52418a.m58682i(5, ih13.computeSize());
            }
            C50271lj0 lj03 = this.f183313i;
            if (lj03 != null) {
                e += C52418a.m58682i(6, lj03.computeSize());
            }
            C64267br2 br26 = this.f183314j;
            if (br26 != null) {
                e += C52418a.m58682i(7, br26.computeSize());
            }
            C64267br2 br27 = this.f183315n;
            if (br27 != null) {
                e += C52418a.m58682i(8, br27.computeSize());
            }
            C64532lq2 lq23 = this.f183316o;
            return lq23 != null ? e + C52418a.m58682i(9, lq23.computeSize()) : e;
        } else if (i == 2) {
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
            C64394ge0 ge02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ge02.f183308d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64736tq2 tq24 = new C64736tq2();
                        if (bArr != null && bArr.length > 0) {
                            tq24.parseFrom(bArr);
                        }
                        ge02.f183309e = tq24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64267br2 br28 = new C64267br2();
                        if (bArr2 != null && bArr2.length > 0) {
                            br28.parseFrom(bArr2);
                        }
                        ge02.f183310f = br28;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        FinderFeedReportObject finderFeedReportObject3 = new FinderFeedReportObject();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderFeedReportObject3.parseFrom(bArr3);
                        }
                        ge02.f183311g = finderFeedReportObject3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C64447ih1 ih14 = new C64447ih1();
                        if (bArr4 != null && bArr4.length > 0) {
                            ih14.parseFrom(bArr4);
                        }
                        ge02.f183312h = ih14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C50271lj0 lj04 = new C50271lj0();
                        if (bArr5 != null && bArr5.length > 0) {
                            lj04.parseFrom(bArr5);
                        }
                        ge02.f183313i = lj04;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C64267br2 br29 = new C64267br2();
                        if (bArr6 != null && bArr6.length > 0) {
                            br29.parseFrom(bArr6);
                        }
                        ge02.f183314j = br29;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i8 = 0; i8 < size7; i8++) {
                        byte[] bArr7 = j7.get(i8);
                        C64267br2 br210 = new C64267br2();
                        if (bArr7 != null && bArr7.length > 0) {
                            br210.parseFrom(bArr7);
                        }
                        ge02.f183315n = br210;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i9 = 0; i9 < size8; i9++) {
                        byte[] bArr8 = j8.get(i9);
                        C64532lq2 lq24 = new C64532lq2();
                        if (bArr8 != null && bArr8.length > 0) {
                            lq24.parseFrom(bArr8);
                        }
                        ge02.f183316o = lq24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

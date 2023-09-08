package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yy0 */
public class C52183yy0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145569d;

    /* renamed from: e */
    public long f145570e;

    /* renamed from: f */
    public long f145571f;

    /* renamed from: g */
    public C89349b f145572g;

    /* renamed from: h */
    public String f145573h;

    /* renamed from: i */
    public int f145574i;

    /* renamed from: j */
    public C49326es1 f145575j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52183yy0)) {
            return false;
        }
        C52183yy0 yy02 = (C52183yy0) aVar;
        return C46238a.m51546a(this.BaseRequest, yy02.BaseRequest) && C46238a.m51546a(this.f145569d, yy02.f145569d) && C46238a.m51546a(Long.valueOf(this.f145570e), Long.valueOf(yy02.f145570e)) && C46238a.m51546a(Long.valueOf(this.f145571f), Long.valueOf(yy02.f145571f)) && C46238a.m51546a(this.f145572g, yy02.f145572g) && C46238a.m51546a(this.f145573h, yy02.f145573h) && C46238a.m51546a(Integer.valueOf(this.f145574i), Integer.valueOf(yy02.f145574i)) && C46238a.m51546a(this.f145575j, yy02.f145575j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f145569d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145569d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f145570e);
            aVar.mo74321h(4, this.f145571f);
            C89349b bVar = this.f145572g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str = this.f145573h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f145574i);
            C49326es1 es12 = this.f145575j;
            if (es12 != null) {
                aVar.mo74322i(9, es12.computeSize());
                this.f145575j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145569d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f145570e) + C52418a.m58681h(4, this.f145571f);
            C89349b bVar2 = this.f145572g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            String str2 = this.f145573h;
            if (str2 != null) {
                h += C52418a.m58683j(6, str2);
            }
            int e = h + C52418a.m58678e(7, this.f145574i);
            C49326es1 es13 = this.f145575j;
            return es13 != null ? e + C52418a.m58682i(9, es13.computeSize()) : e;
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
            C52183yy0 yy02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        yy02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        yy02.f145569d = ig04;
                    }
                    return 0;
                case 3:
                    yy02.f145570e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    yy02.f145571f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    yy02.f145572g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    yy02.f145573h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    yy02.f145574i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49326es1 es14 = new C49326es1();
                        if (bArr3 != null && bArr3.length > 0) {
                            es14.parseFrom(bArr3);
                        }
                        yy02.f145575j = es14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

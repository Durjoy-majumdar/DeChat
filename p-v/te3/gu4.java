package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gu4 extends C49335eu3 {

    /* renamed from: d */
    public long f134280d;

    /* renamed from: e */
    public long f134281e;

    /* renamed from: f */
    public LinkedList<au4> f134282f = new LinkedList<>();

    /* renamed from: g */
    public int f134283g;

    /* renamed from: h */
    public int f134284h;

    /* renamed from: i */
    public int f134285i;

    /* renamed from: j */
    public int f134286j;

    /* renamed from: n */
    public int f134287n;

    /* renamed from: o */
    public int f134288o;

    /* renamed from: p */
    public int f134289p;

    /* renamed from: q */
    public C89349b f134290q;

    /* renamed from: r */
    public int f134291r;

    /* renamed from: s */
    public LinkedList<au4> f134292s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gu4)) {
            return false;
        }
        gu4 gu4 = (gu4) aVar;
        return C46238a.m51546a(this.BaseResponse, gu4.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f134280d), Long.valueOf(gu4.f134280d)) && C46238a.m51546a(Long.valueOf(this.f134281e), Long.valueOf(gu4.f134281e)) && C46238a.m51546a(this.f134282f, gu4.f134282f) && C46238a.m51546a(Integer.valueOf(this.f134283g), Integer.valueOf(gu4.f134283g)) && C46238a.m51546a(Integer.valueOf(this.f134284h), Integer.valueOf(gu4.f134284h)) && C46238a.m51546a(Integer.valueOf(this.f134285i), Integer.valueOf(gu4.f134285i)) && C46238a.m51546a(Integer.valueOf(this.f134286j), Integer.valueOf(gu4.f134286j)) && C46238a.m51546a(Integer.valueOf(this.f134287n), Integer.valueOf(gu4.f134287n)) && C46238a.m51546a(Integer.valueOf(this.f134288o), Integer.valueOf(gu4.f134288o)) && C46238a.m51546a(Integer.valueOf(this.f134289p), Integer.valueOf(gu4.f134289p)) && C46238a.m51546a(this.f134290q, gu4.f134290q) && C46238a.m51546a(Integer.valueOf(this.f134291r), Integer.valueOf(gu4.f134291r)) && C46238a.m51546a(this.f134292s, gu4.f134292s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f134280d);
                aVar.mo74321h(3, this.f134281e);
                aVar.mo74320g(4, 8, this.f134282f);
                aVar.mo74318e(5, this.f134283g);
                aVar.mo74318e(6, this.f134284h);
                aVar.mo74318e(7, this.f134285i);
                aVar.mo74318e(8, this.f134286j);
                aVar.mo74318e(9, this.f134287n);
                aVar.mo74318e(10, this.f134288o);
                aVar.mo74318e(11, this.f134289p);
                C89349b bVar = this.f134290q;
                if (bVar != null) {
                    aVar.mo74315b(12, bVar);
                }
                aVar.mo74318e(13, this.f134291r);
                aVar.mo74320g(14, 8, this.f134292s);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f134280d) + C52418a.m58681h(3, this.f134281e) + C52418a.m58680g(4, 8, this.f134282f) + C52418a.m58678e(5, this.f134283g) + C52418a.m58678e(6, this.f134284h) + C52418a.m58678e(7, this.f134285i) + C52418a.m58678e(8, this.f134286j) + C52418a.m58678e(9, this.f134287n) + C52418a.m58678e(10, this.f134288o) + C52418a.m58678e(11, this.f134289p);
            C89349b bVar2 = this.f134290q;
            if (bVar2 != null) {
                h += C52418a.m58675b(12, bVar2);
            }
            return h + C52418a.m58678e(13, this.f134291r) + C52418a.m58680g(14, 8, this.f134292s);
        } else if (i2 == 2) {
            this.f134282f.clear();
            this.f134292s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            gu4 gu4 = objArr[1];
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
                        gu4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    gu4.f134280d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    gu4.f134281e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        au4 au4 = new au4();
                        if (bArr2 != null && bArr2.length > 0) {
                            au4.parseFrom(bArr2);
                        }
                        gu4.f134282f.add(au4);
                    }
                    return 0;
                case 5:
                    gu4.f134283g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gu4.f134284h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gu4.f134285i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gu4.f134286j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    gu4.f134287n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    gu4.f134288o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    gu4.f134289p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    gu4.f134290q = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    gu4.f134291r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        au4 au42 = new au4();
                        if (bArr3 != null && bArr3.length > 0) {
                            au42.parseFrom(bArr3);
                        }
                        gu4.f134292s.add(au42);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u70 */
public class C51502u70 extends C47465a {

    /* renamed from: d */
    public LinkedList<ym4> f142636d = new LinkedList<>();

    /* renamed from: e */
    public int f142637e;

    /* renamed from: f */
    public boolean f142638f = false;

    /* renamed from: g */
    public int f142639g = 0;

    /* renamed from: h */
    public int f142640h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51502u70)) {
            return false;
        }
        C51502u70 u702 = (C51502u70) aVar;
        return C46238a.m51546a(this.f142636d, u702.f142636d) && C46238a.m51546a(Integer.valueOf(this.f142637e), Integer.valueOf(u702.f142637e)) && C46238a.m51546a(Boolean.valueOf(this.f142638f), Boolean.valueOf(u702.f142638f)) && C46238a.m51546a(Integer.valueOf(this.f142639g), Integer.valueOf(u702.f142639g)) && C46238a.m51546a(Integer.valueOf(this.f142640h), Integer.valueOf(u702.f142640h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f142636d);
            aVar.mo74318e(2, this.f142637e);
            aVar.mo74314a(3, this.f142638f);
            aVar.mo74318e(4, this.f142639g);
            aVar.mo74318e(5, this.f142640h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f142636d) + 0 + C52418a.m58678e(2, this.f142637e) + C52418a.m58674a(3, this.f142638f) + C52418a.m58678e(4, this.f142639g) + C52418a.m58678e(5, this.f142640h);
        } else {
            if (i == 2) {
                this.f142636d.clear();
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
                C51502u70 u702 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ym4 ym4 = new ym4();
                        if (bArr != null && bArr.length > 0) {
                            ym4.parseFrom(bArr);
                        }
                        u702.f142636d.add(ym4);
                    }
                    return 0;
                } else if (intValue == 2) {
                    u702.f142637e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    u702.f142638f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 4) {
                    u702.f142639g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    u702.f142640h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}

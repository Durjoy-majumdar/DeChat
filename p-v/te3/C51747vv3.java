package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vv3 */
public class C51747vv3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51145rr2> f143732d = new LinkedList<>();

    /* renamed from: e */
    public boolean f143733e;

    /* renamed from: f */
    public boolean f143734f;

    /* renamed from: g */
    public boolean f143735g;

    /* renamed from: h */
    public boolean f143736h;

    /* renamed from: i */
    public boolean f143737i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51747vv3)) {
            return false;
        }
        C51747vv3 vv32 = (C51747vv3) aVar;
        return C46238a.m51546a(this.f143732d, vv32.f143732d) && C46238a.m51546a(Boolean.valueOf(this.f143733e), Boolean.valueOf(vv32.f143733e)) && C46238a.m51546a(Boolean.valueOf(this.f143734f), Boolean.valueOf(vv32.f143734f)) && C46238a.m51546a(Boolean.valueOf(this.f143735g), Boolean.valueOf(vv32.f143735g)) && C46238a.m51546a(Boolean.valueOf(this.f143736h), Boolean.valueOf(vv32.f143736h)) && C46238a.m51546a(Boolean.valueOf(this.f143737i), Boolean.valueOf(vv32.f143737i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f143732d);
            aVar.mo74314a(2, this.f143733e);
            aVar.mo74314a(3, this.f143734f);
            aVar.mo74314a(4, this.f143735g);
            aVar.mo74314a(5, this.f143736h);
            aVar.mo74314a(6, this.f143737i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f143732d) + 0 + C52418a.m58674a(2, this.f143733e) + C52418a.m58674a(3, this.f143734f) + C52418a.m58674a(4, this.f143735g) + C52418a.m58674a(5, this.f143736h) + C52418a.m58674a(6, this.f143737i);
        } else {
            if (i == 2) {
                this.f143732d.clear();
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
                C51747vv3 vv32 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C51145rr2 rr22 = new C51145rr2();
                            if (bArr != null && bArr.length > 0) {
                                rr22.parseFrom(bArr);
                            }
                            vv32.f143732d.add(rr22);
                        }
                        return 0;
                    case 2:
                        vv32.f143733e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        vv32.f143734f = aVar3.mo141625c(intValue);
                        return 0;
                    case 4:
                        vv32.f143735g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        vv32.f143736h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        vv32.f143737i = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}

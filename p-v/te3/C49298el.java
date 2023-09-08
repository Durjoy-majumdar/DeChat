package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.el */
public class C49298el extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f132989d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C89349b> f132990e = new LinkedList<>();

    /* renamed from: f */
    public boolean f132991f;

    /* renamed from: g */
    public LinkedList<C50974ql> f132992g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49298el)) {
            return false;
        }
        C49298el elVar = (C49298el) aVar;
        return C46238a.m51546a(this.f132989d, elVar.f132989d) && C46238a.m51546a(this.f132990e, elVar.f132990e) && C46238a.m51546a(Boolean.valueOf(this.f132991f), Boolean.valueOf(elVar.f132991f)) && C46238a.m51546a(this.f132992g, elVar.f132992g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 2, this.f132989d);
            aVar.mo74320g(2, 6, this.f132990e);
            aVar.mo74314a(3, this.f132991f);
            aVar.mo74320g(4, 8, this.f132992g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 2, this.f132989d) + 0 + C52418a.m58680g(2, 6, this.f132990e) + C52418a.m58674a(3, this.f132991f) + C52418a.m58680g(4, 8, this.f132992g);
        } else {
            if (i == 2) {
                this.f132989d.clear();
                this.f132990e.clear();
                this.f132992g.clear();
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
                C49298el elVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    elVar.f132989d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                } else if (intValue == 2) {
                    elVar.f132990e.add(aVar3.mo141626d(intValue));
                    return 0;
                } else if (intValue == 3) {
                    elVar.f132991f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50974ql qlVar = new C50974ql();
                        if (bArr != null && bArr.length > 0) {
                            qlVar.parseFrom(bArr);
                        }
                        elVar.f132992g.add(qlVar);
                    }
                    return 0;
                }
            }
        }
    }
}

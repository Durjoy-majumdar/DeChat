package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tl1 */
public class C51412tl1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51124rl1> f142275d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64629pl1> f142276e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Long> f142277f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C52231z81> f142278g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51412tl1)) {
            return false;
        }
        C51412tl1 tl12 = (C51412tl1) aVar;
        return C46238a.m51546a(this.f142275d, tl12.f142275d) && C46238a.m51546a(this.f142276e, tl12.f142276e) && C46238a.m51546a(this.f142277f, tl12.f142277f) && C46238a.m51546a(this.f142278g, tl12.f142278g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f142275d);
            aVar.mo74320g(2, 8, this.f142276e);
            aVar.mo74320g(3, 3, this.f142277f);
            aVar.mo74320g(4, 8, this.f142278g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f142275d) + 0 + C52418a.m58680g(2, 8, this.f142276e) + C52418a.m58680g(3, 3, this.f142277f) + C52418a.m58680g(4, 8, this.f142278g);
        } else {
            if (i == 2) {
                this.f142275d.clear();
                this.f142276e.clear();
                this.f142277f.clear();
                this.f142278g.clear();
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
                C51412tl1 tl12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51124rl1 rl12 = new C51124rl1();
                        if (bArr != null && bArr.length > 0) {
                            rl12.parseFrom(bArr);
                        }
                        tl12.f142275d.add(rl12);
                    }
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64629pl1 pl12 = new C64629pl1();
                        if (bArr2 != null && bArr2.length > 0) {
                            pl12.parseFrom(bArr2);
                        }
                        tl12.f142276e.add(pl12);
                    }
                    return 0;
                } else if (intValue == 3) {
                    tl12.f142277f.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C52231z81 z812 = new C52231z81();
                        if (bArr3 != null && bArr3.length > 0) {
                            z812.parseFrom(bArr3);
                        }
                        tl12.f142278g.add(z812);
                    }
                    return 0;
                }
            }
        }
    }
}

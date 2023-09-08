package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wu3 */
public class C51879wu3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50744ow2> f144294d = new LinkedList<>();

    /* renamed from: e */
    public String f144295e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51879wu3)) {
            return false;
        }
        C51879wu3 wu32 = (C51879wu3) aVar;
        return C46238a.m51546a(this.f144294d, wu32.f144294d) && C46238a.m51546a(this.f144295e, wu32.f144295e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f144294d);
            String str = this.f144295e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f144294d) + 0;
            String str2 = this.f144295e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f144294d.clear();
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
            C51879wu3 wu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50744ow2 ow22 = new C50744ow2();
                    if (bArr != null && bArr.length > 0) {
                        ow22.parseFrom(bArr);
                    }
                    wu32.f144294d.add(ow22);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                wu32.f144295e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

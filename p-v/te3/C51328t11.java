package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t11 */
public class C51328t11 extends C47465a {

    /* renamed from: d */
    public String f141897d;

    /* renamed from: e */
    public LinkedList<C50767p11> f141898e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51328t11)) {
            return false;
        }
        C51328t11 t112 = (C51328t11) aVar;
        return C46238a.m51546a(this.f141897d, t112.f141897d) && C46238a.m51546a(this.f141898e, t112.f141898e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141897d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f141898e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f141897d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f141898e);
        } else if (i == 2) {
            this.f141898e.clear();
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
            C51328t11 t112 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t112.f141897d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p112 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p112.parseFrom(bArr);
                    }
                    t112.f141898e.add(p112);
                }
                return 0;
            }
        }
    }
}

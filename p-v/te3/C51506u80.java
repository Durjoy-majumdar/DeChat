package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u80 */
public class C51506u80 extends C47465a {

    /* renamed from: d */
    public long f142657d;

    /* renamed from: e */
    public String f142658e;

    /* renamed from: f */
    public LinkedList<C51357t80> f142659f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51506u80)) {
            return false;
        }
        C51506u80 u802 = (C51506u80) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142657d), Long.valueOf(u802.f142657d)) && C46238a.m51546a(this.f142658e, u802.f142658e) && C46238a.m51546a(this.f142659f, u802.f142659f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142657d);
            String str = this.f142658e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f142659f);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f142657d) + 0;
            String str2 = this.f142658e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58680g(3, 8, this.f142659f);
        } else if (i == 2) {
            this.f142659f.clear();
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
            C51506u80 u802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u802.f142657d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                u802.f142658e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51357t80 t802 = new C51357t80();
                    if (bArr != null && bArr.length > 0) {
                        t802.parseFrom(bArr);
                    }
                    u802.f142659f.add(t802);
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.t03 */
public class C51325t03 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50850pm2> f141885d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51325t03) && C46238a.m51546a(this.f141885d, ((C51325t03) aVar).f141885d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f141885d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f141885d) + 0;
        } else {
            if (i == 2) {
                this.f141885d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C51325t03 t032 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50850pm2 pm22 = new C50850pm2();
                    if (bArr != null && bArr.length > 0) {
                        pm22.parseFrom(bArr);
                    }
                    t032.f141885d.add(pm22);
                }
                return 0;
            }
        }
    }
}

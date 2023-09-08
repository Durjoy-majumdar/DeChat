package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.f33 */
public class C49374f33 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52065y40> f133271d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49374f33) && C46238a.m51546a(this.f133271d, ((C49374f33) aVar).f133271d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f133271d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133271d) + 0;
        } else {
            if (i == 2) {
                this.f133271d.clear();
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
                C49374f33 f332 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52065y40 y402 = new C52065y40();
                    if (bArr != null && bArr.length > 0) {
                        y402.parseFrom(bArr);
                    }
                    f332.f133271d.add(y402);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "items", this.f133271d, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

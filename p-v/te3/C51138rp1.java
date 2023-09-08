package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.rp1 */
public class C51138rp1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51279sp1> f141071d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51138rp1) && C46238a.m51546a(this.f141071d, ((C51138rp1) aVar).f141071d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f141071d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f141071d) + 0;
        } else {
            if (i == 2) {
                this.f141071d.clear();
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
                C51138rp1 rp12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51279sp1 sp12 = new C51279sp1();
                    if (bArr != null && bArr.length > 0) {
                        sp12.parseFrom(bArr);
                    }
                    rp12.f141071d.add(sp12);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "DocInfo", this.f141071d, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

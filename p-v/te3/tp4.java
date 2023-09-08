package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class tp4 extends C47465a {

    /* renamed from: d */
    public int f142323d;

    /* renamed from: e */
    public LinkedList<sp4> f142324e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tp4)) {
            return false;
        }
        tp4 tp4 = (tp4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142323d), Integer.valueOf(tp4.f142323d)) && C46238a.m51546a(this.f142324e, tp4.f142324e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142323d);
            aVar.mo74320g(2, 8, this.f142324e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142323d) + 0 + C52418a.m58680g(2, 8, this.f142324e);
        } else {
            if (i == 2) {
                this.f142324e.clear();
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
                tp4 tp4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tp4.f142323d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        sp4 sp4 = new sp4();
                        if (bArr != null && bArr.length > 0) {
                            sp4.parseFrom(bArr);
                        }
                        tp4.f142324e.add(sp4);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142323d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Count", valueOf, false);
            aVar.mo71655d(jSONObject, "List", this.f142324e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uv3 */
public class C51604uv3 extends C47465a {

    /* renamed from: d */
    public int f143158d;

    /* renamed from: e */
    public LinkedList<C51454tv3> f143159e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51604uv3)) {
            return false;
        }
        C51604uv3 uv32 = (C51604uv3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143158d), Integer.valueOf(uv32.f143158d)) && C46238a.m51546a(this.f143159e, uv32.f143159e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143158d);
            aVar.mo74320g(2, 8, this.f143159e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f143158d) + 0 + C52418a.m58680g(2, 8, this.f143159e);
        } else {
            if (i == 2) {
                this.f143159e.clear();
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
                C51604uv3 uv32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    uv32.f143158d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51454tv3 tv32 = new C51454tv3();
                        if (bArr != null && bArr.length > 0) {
                            tv32.parseFrom(bArr);
                        }
                        uv32.f143159e.add(tv32);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f143158d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Count", valueOf, false);
            aVar.mo71655d(jSONObject, "List", this.f143159e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y40 */
public class C52065y40 extends C47465a {

    /* renamed from: d */
    public String f145108d;

    /* renamed from: e */
    public int f145109e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52065y40)) {
            return false;
        }
        C52065y40 y402 = (C52065y40) aVar;
        return C46238a.m51546a(this.f145108d, y402.f145108d) && C46238a.m51546a(Integer.valueOf(this.f145109e), Integer.valueOf(y402.f145109e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145108d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145109e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145108d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f145109e);
        } else if (i == 2) {
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
            C52065y40 y402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y402.f145108d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                y402.f145109e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f145108d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "word", str, false);
            aVar.mo71655d(jSONObject, "update_time", Integer.valueOf(this.f145109e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

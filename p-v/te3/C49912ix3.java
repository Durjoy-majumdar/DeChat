package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ix3 */
public class C49912ix3 extends C47465a {

    /* renamed from: d */
    public int f135735d;

    /* renamed from: e */
    public int f135736e;

    /* renamed from: f */
    public int f135737f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49912ix3)) {
            return false;
        }
        C49912ix3 ix32 = (C49912ix3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135735d), Integer.valueOf(ix32.f135735d)) && C46238a.m51546a(Integer.valueOf(this.f135736e), Integer.valueOf(ix32.f135736e)) && C46238a.m51546a(Integer.valueOf(this.f135737f), Integer.valueOf(ix32.f135737f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135735d);
            aVar.mo74318e(2, this.f135736e);
            aVar.mo74318e(3, this.f135737f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135735d) + 0 + C52418a.m58678e(2, this.f135736e) + C52418a.m58678e(3, this.f135737f);
        } else {
            if (i == 2) {
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
                C49912ix3 ix32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ix32.f135735d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ix32.f135736e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    ix32.f135737f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f135735d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Entry", valueOf, false);
            aVar.mo71655d(jSONObject, "Timestamp", Integer.valueOf(this.f135736e), false);
            aVar.mo71655d(jSONObject, "OpType", Integer.valueOf(this.f135737f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e13 */
public class C64336e13 extends C47465a {

    /* renamed from: d */
    public long f182918d;

    /* renamed from: e */
    public long f182919e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64336e13)) {
            return false;
        }
        C64336e13 e132 = (C64336e13) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182918d), Long.valueOf(e132.f182918d)) && C46238a.m51546a(Long.valueOf(this.f182919e), Long.valueOf(e132.f182919e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182918d);
            aVar.mo74321h(2, this.f182919e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f182918d) + 0 + C52418a.m58681h(2, this.f182919e);
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
                C64336e13 e132 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    e132.f182918d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    e132.f182919e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f182918d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "startBrowseTimestamp", valueOf, false);
            aVar.mo71655d(jSONObject, "duration", Long.valueOf(this.f182919e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

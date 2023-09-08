package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yy2 */
public class C52185yy2 extends C47465a {

    /* renamed from: d */
    public long f145577d;

    /* renamed from: e */
    public long f145578e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52185yy2)) {
            return false;
        }
        C52185yy2 yy22 = (C52185yy2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145577d), Long.valueOf(yy22.f145577d)) && C46238a.m51546a(Long.valueOf(this.f145578e), Long.valueOf(yy22.f145578e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145577d);
            aVar.mo74321h(2, this.f145578e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f145577d) + 0 + C52418a.m58681h(2, this.f145578e);
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
                C52185yy2 yy22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    yy22.f145577d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    yy22.f145578e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f145577d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BitMask", valueOf, false);
            aVar.mo71655d(jSONObject, "BitVal", Long.valueOf(this.f145578e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

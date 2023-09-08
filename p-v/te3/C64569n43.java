package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n43 */
public class C64569n43 extends C47465a {

    /* renamed from: d */
    public int f184430d;

    /* renamed from: e */
    public long f184431e;

    /* renamed from: f */
    public long f184432f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64569n43)) {
            return false;
        }
        C64569n43 n432 = (C64569n43) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184430d), Integer.valueOf(n432.f184430d)) && C46238a.m51546a(Long.valueOf(this.f184431e), Long.valueOf(n432.f184431e)) && C46238a.m51546a(Long.valueOf(this.f184432f), Long.valueOf(n432.f184432f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184430d);
            aVar.mo74321h(2, this.f184431e);
            aVar.mo74321h(3, this.f184432f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184430d) + 0 + C52418a.m58681h(2, this.f184431e) + C52418a.m58681h(3, this.f184432f);
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
                C64569n43 n432 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    n432.f184430d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    n432.f184431e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    n432.f184432f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f184430d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "field", valueOf, false);
            aVar.mo71655d(jSONObject, "from", Long.valueOf(this.f184431e), false);
            aVar.mo71655d(jSONObject, "to", Long.valueOf(this.f184432f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f13 */
public class C110961f13 extends C47465a {

    /* renamed from: d */
    public long f331966d;

    /* renamed from: e */
    public long f331967e;

    /* renamed from: f */
    public long f331968f;

    /* renamed from: g */
    public long f331969g;

    /* renamed from: h */
    public long f331970h;

    /* renamed from: i */
    public boolean f331971i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110961f13)) {
            return false;
        }
        C110961f13 f132 = (C110961f13) aVar;
        return C46238a.m51546a(Long.valueOf(this.f331966d), Long.valueOf(f132.f331966d)) && C46238a.m51546a(Long.valueOf(this.f331967e), Long.valueOf(f132.f331967e)) && C46238a.m51546a(Long.valueOf(this.f331968f), Long.valueOf(f132.f331968f)) && C46238a.m51546a(Long.valueOf(this.f331969g), Long.valueOf(f132.f331969g)) && C46238a.m51546a(Long.valueOf(this.f331970h), Long.valueOf(f132.f331970h)) && C46238a.m51546a(Boolean.valueOf(this.f331971i), Boolean.valueOf(f132.f331971i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(12, this.f331966d);
            aVar.mo74321h(1, this.f331967e);
            aVar.mo74321h(2, this.f331968f);
            aVar.mo74321h(3, this.f331969g);
            aVar.mo74321h(4, this.f331970h);
            aVar.mo74314a(5, this.f331971i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(12, this.f331966d) + 0 + C52418a.m58681h(1, this.f331967e) + C52418a.m58681h(2, this.f331968f) + C52418a.m58681h(3, this.f331969g) + C52418a.m58681h(4, this.f331970h) + C52418a.m58674a(5, this.f331971i);
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
                C110961f13 f132 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    f132.f331967e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    f132.f331968f = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    f132.f331969g = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 4) {
                    f132.f331970h = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 5) {
                    f132.f331971i = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 12) {
                    return -1;
                } else {
                    f132.f331966d = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f331966d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "enterEduTimestamp", valueOf, false);
            aVar.mo71655d(jSONObject, "eduType", Long.valueOf(this.f331967e), false);
            aVar.mo71655d(jSONObject, "exitType", Long.valueOf(this.f331968f), false);
            aVar.mo71655d(jSONObject, "duration", Long.valueOf(this.f331969g), false);
            aVar.mo71655d(jSONObject, "listEduType", Long.valueOf(this.f331970h), false);
            aVar.mo71655d(jSONObject, "isExposed", Boolean.valueOf(this.f331971i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

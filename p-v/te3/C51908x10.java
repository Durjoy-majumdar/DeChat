package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x10 */
public class C51908x10 extends C47465a {

    /* renamed from: d */
    public boolean f144396d;

    /* renamed from: e */
    public boolean f144397e = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51908x10)) {
            return false;
        }
        C51908x10 x102 = (C51908x10) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f144396d), Boolean.valueOf(x102.f144396d)) && C46238a.m51546a(Boolean.valueOf(this.f144397e), Boolean.valueOf(x102.f144397e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f144396d);
            aVar.mo74314a(2, this.f144397e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f144396d) + 0 + C52418a.m58674a(2, this.f144397e);
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
                C51908x10 x102 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    x102.f144396d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    x102.f144397e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean valueOf = Boolean.valueOf(this.f144396d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ISDisplay", valueOf, false);
            aVar.mo71655d(jSONObject, "IsRdm", Boolean.valueOf(this.f144397e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

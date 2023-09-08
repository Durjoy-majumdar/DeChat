package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xx */
public class C52032xx extends C47465a {

    /* renamed from: d */
    public int f145009d;

    /* renamed from: e */
    public String f145010e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52032xx)) {
            return false;
        }
        C52032xx xxVar = (C52032xx) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145009d), Integer.valueOf(xxVar.f145009d)) && C46238a.m51546a(this.f145010e, xxVar.f145010e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145009d);
            String str = this.f145010e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145009d) + 0;
            String str2 = this.f145010e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C52032xx xxVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xxVar.f145009d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                xxVar.f145010e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f145009d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Action", valueOf, false);
            aVar.mo71655d(jSONObject, "Username", this.f145010e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

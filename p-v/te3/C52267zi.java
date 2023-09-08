package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zi */
public class C52267zi extends C47465a {

    /* renamed from: d */
    public String f145966d;

    /* renamed from: e */
    public String f145967e;

    /* renamed from: f */
    public String f145968f;

    /* renamed from: g */
    public int f145969g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52267zi)) {
            return false;
        }
        C52267zi ziVar = (C52267zi) aVar;
        return C46238a.m51546a(this.f145966d, ziVar.f145966d) && C46238a.m51546a(this.f145967e, ziVar.f145967e) && C46238a.m51546a(this.f145968f, ziVar.f145968f) && C46238a.m51546a(Integer.valueOf(this.f145969g), Integer.valueOf(ziVar.f145969g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145966d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145967e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f145968f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f145969g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f145966d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f145967e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f145968f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f145969g);
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
            C52267zi ziVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ziVar.f145966d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ziVar.f145967e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ziVar.f145968f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ziVar.f145969g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f145966d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Query", str, false);
            aVar.mo71655d(jSONObject, "ContextId", this.f145967e, false);
            aVar.mo71655d(jSONObject, "Url", this.f145968f, false);
            aVar.mo71655d(jSONObject, "Type", Integer.valueOf(this.f145969g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

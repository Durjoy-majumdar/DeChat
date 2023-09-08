package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.if3 */
public class C64445if3 extends C47465a {

    /* renamed from: d */
    public String f183684d;

    /* renamed from: e */
    public String f183685e;

    /* renamed from: f */
    public String f183686f;

    /* renamed from: g */
    public long f183687g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64445if3)) {
            return false;
        }
        C64445if3 if32 = (C64445if3) aVar;
        return C46238a.m51546a(this.f183684d, if32.f183684d) && C46238a.m51546a(this.f183685e, if32.f183685e) && C46238a.m51546a(this.f183686f, if32.f183686f) && C46238a.m51546a(Long.valueOf(this.f183687g), Long.valueOf(if32.f183687g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183684d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183685e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183686f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f183687g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f183684d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f183685e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f183686f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f183687g);
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
            C64445if3 if32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                if32.f183684d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                if32.f183685e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                if32.f183686f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                if32.f183687g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f183684d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "userName", str, false);
            aVar.mo71655d(jSONObject, "avatarUrl", this.f183685e, false);
            aVar.mo71655d(jSONObject, "displayName", this.f183686f, false);
            aVar.mo71655d(jSONObject, "selectTime", Long.valueOf(this.f183687g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vn3 */
public class C51716vn3 extends C47465a {

    /* renamed from: d */
    public String f143595d;

    /* renamed from: e */
    public String f143596e;

    /* renamed from: f */
    public int f143597f;

    /* renamed from: g */
    public int f143598g = 0;

    /* renamed from: h */
    public String f143599h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51716vn3)) {
            return false;
        }
        C51716vn3 vn32 = (C51716vn3) aVar;
        return C46238a.m51546a(this.f143595d, vn32.f143595d) && C46238a.m51546a(this.f143596e, vn32.f143596e) && C46238a.m51546a(Integer.valueOf(this.f143597f), Integer.valueOf(vn32.f143597f)) && C46238a.m51546a(Integer.valueOf(this.f143598g), Integer.valueOf(vn32.f143598g)) && C46238a.m51546a(this.f143599h, vn32.f143599h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143595d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143596e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f143597f);
            aVar.mo74318e(4, this.f143598g);
            String str3 = this.f143599h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f143595d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143596e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f143597f) + C52418a.m58678e(4, this.f143598g);
            String str6 = this.f143599h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C51716vn3 vn32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vn32.f143595d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vn32.f143596e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vn32.f143597f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                vn32.f143598g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vn32.f143599h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f143595d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Summary", str, false);
            aVar.mo71655d(jSONObject, "RedPointMsgId", this.f143596e, false);
            aVar.mo71655d(jSONObject, "RedPointInvalidTime", Integer.valueOf(this.f143597f), false);
            aVar.mo71655d(jSONObject, "NoCache", Integer.valueOf(this.f143598g), false);
            aVar.mo71655d(jSONObject, "CallBackStr", this.f143599h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

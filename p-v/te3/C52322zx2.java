package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zx2 */
public class C52322zx2 extends C47465a {

    /* renamed from: d */
    public String f146268d;

    /* renamed from: e */
    public int f146269e;

    /* renamed from: f */
    public int f146270f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52322zx2)) {
            return false;
        }
        C52322zx2 zx22 = (C52322zx2) aVar;
        return C46238a.m51546a(this.f146268d, zx22.f146268d) && C46238a.m51546a(Integer.valueOf(this.f146269e), Integer.valueOf(zx22.f146269e)) && C46238a.m51546a(Integer.valueOf(this.f146270f), Integer.valueOf(zx22.f146270f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146268d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f146269e);
            aVar.mo74318e(3, this.f146270f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f146268d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f146269e) + C52418a.m58678e(3, this.f146270f);
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
            C52322zx2 zx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zx22.f146268d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                zx22.f146269e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                zx22.f146270f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f146268d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "optScope", str, false);
            aVar.mo71655d(jSONObject, "optState", Integer.valueOf(this.f146269e), false);
            aVar.mo71655d(jSONObject, "optAvatarId", Integer.valueOf(this.f146270f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

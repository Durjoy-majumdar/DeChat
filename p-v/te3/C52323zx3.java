package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zx3 */
public class C52323zx3 extends C47465a {

    /* renamed from: d */
    public String f146271d;

    /* renamed from: e */
    public long f146272e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52323zx3)) {
            return false;
        }
        C52323zx3 zx32 = (C52323zx3) aVar;
        return C46238a.m51546a(this.f146271d, zx32.f146271d) && C46238a.m51546a(Long.valueOf(this.f146272e), Long.valueOf(zx32.f146272e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146271d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f146272e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Query");
        } else if (i == 1) {
            String str2 = this.f146271d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f146272e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146271d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Query");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52323zx3 zx32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zx32.f146271d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                zx32.f146272e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f146271d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Query", str, false);
            aVar.mo71655d(jSONObject, "Timestamp", Long.valueOf(this.f146272e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

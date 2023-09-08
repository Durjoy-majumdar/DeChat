package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c13 */
public class C64272c13 extends C47465a {

    /* renamed from: d */
    public long f182352d;

    /* renamed from: e */
    public long f182353e;

    /* renamed from: f */
    public String f182354f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64272c13)) {
            return false;
        }
        C64272c13 c132 = (C64272c13) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182352d), Long.valueOf(c132.f182352d)) && C46238a.m51546a(Long.valueOf(this.f182353e), Long.valueOf(c132.f182353e)) && C46238a.m51546a(this.f182354f, c132.f182354f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182352d);
            aVar.mo74321h(2, this.f182353e);
            String str = this.f182354f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f182352d) + 0 + C52418a.m58681h(2, this.f182353e);
            String str2 = this.f182354f;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
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
            C64272c13 c132 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c132.f182352d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                c132.f182353e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c132.f182354f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f182352d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "addType", valueOf, false);
            aVar.mo71655d(jSONObject, "status", Long.valueOf(this.f182353e), false);
            aVar.mo71655d(jSONObject, "itemSubId", this.f182354f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.by1 */
public class C48925by1 extends C47465a {

    /* renamed from: d */
    public int f131385d;

    /* renamed from: e */
    public int f131386e;

    /* renamed from: f */
    public long f131387f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48925by1)) {
            return false;
        }
        C48925by1 by12 = (C48925by1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131385d), Integer.valueOf(by12.f131385d)) && C46238a.m51546a(Integer.valueOf(this.f131386e), Integer.valueOf(by12.f131386e)) && C46238a.m51546a(Long.valueOf(this.f131387f), Long.valueOf(by12.f131387f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131385d);
            aVar.mo74318e(2, this.f131386e);
            aVar.mo74321h(3, this.f131387f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131385d) + 0 + C52418a.m58678e(2, this.f131386e) + C52418a.m58681h(3, this.f131387f);
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
                C48925by1 by12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    by12.f131385d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    by12.f131386e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    by12.f131387f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f131385d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Type", valueOf, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f131386e), false);
            aVar.mo71655d(jSONObject, "Version", Long.valueOf(this.f131387f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

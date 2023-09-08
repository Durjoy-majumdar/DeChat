package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.m */
public class C65490m extends C47465a {

    /* renamed from: d */
    public int f188445d;

    /* renamed from: e */
    public int f188446e;

    /* renamed from: f */
    public boolean f188447f;

    /* renamed from: g */
    public int f188448g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65490m)) {
            return false;
        }
        C65490m mVar = (C65490m) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f188445d), Integer.valueOf(mVar.f188445d)) && C46238a.m51546a(Integer.valueOf(this.f188446e), Integer.valueOf(mVar.f188446e)) && C46238a.m51546a(Boolean.valueOf(this.f188447f), Boolean.valueOf(mVar.f188447f)) && C46238a.m51546a(Integer.valueOf(this.f188448g), Integer.valueOf(mVar.f188448g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f188445d);
            aVar.mo74318e(2, this.f188446e);
            aVar.mo74314a(3, this.f188447f);
            aVar.mo74318e(4, this.f188448g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f188445d) + 0 + C52418a.m58678e(2, this.f188446e) + C52418a.m58674a(3, this.f188447f) + C52418a.m58678e(4, this.f188448g);
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
                C65490m mVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mVar.f188445d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    mVar.f188446e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    mVar.f188447f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    mVar.f188448g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f188445d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "scaleType", valueOf, false);
            aVar.mo71655d(jSONObject, "pullDownScene", Integer.valueOf(this.f188446e), false);
            aVar.mo71655d(jSONObject, "isPreviewVideo", Boolean.valueOf(this.f188447f), false);
            aVar.mo71655d(jSONObject, "statusCreateTime", Integer.valueOf(this.f188448g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wv */
public class C64816wv extends C47465a {

    /* renamed from: d */
    public int f186212d;

    /* renamed from: e */
    public int f186213e;

    /* renamed from: f */
    public int f186214f;

    /* renamed from: g */
    public boolean f186215g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64816wv)) {
            return false;
        }
        C64816wv wvVar = (C64816wv) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186212d), Integer.valueOf(wvVar.f186212d)) && C46238a.m51546a(Integer.valueOf(this.f186213e), Integer.valueOf(wvVar.f186213e)) && C46238a.m51546a(Integer.valueOf(this.f186214f), Integer.valueOf(wvVar.f186214f)) && C46238a.m51546a(Boolean.valueOf(this.f186215g), Boolean.valueOf(wvVar.f186215g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186212d);
            aVar.mo74318e(2, this.f186213e);
            aVar.mo74318e(3, this.f186214f);
            aVar.mo74314a(4, this.f186215g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186212d) + 0 + C52418a.m58678e(2, this.f186213e) + C52418a.m58678e(3, this.f186214f) + C52418a.m58674a(4, this.f186215g);
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
                C64816wv wvVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wvVar.f186212d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    wvVar.f186213e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    wvVar.f186214f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    wvVar.f186215g = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f186212d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BizSwitch", valueOf, false);
            aVar.mo71655d(jSONObject, "WeappSwitch", Integer.valueOf(this.f186213e), false);
            aVar.mo71655d(jSONObject, "FinderSwitch", Integer.valueOf(this.f186214f), false);
            aVar.mo71655d(jSONObject, "ChildModeSwitch", Boolean.valueOf(this.f186215g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yu3 */
public class C52171yu3 extends C47465a {

    /* renamed from: d */
    public long f145516d;

    /* renamed from: e */
    public String f145517e;

    /* renamed from: f */
    public int f145518f;

    /* renamed from: g */
    public int f145519g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52171yu3)) {
            return false;
        }
        C52171yu3 yu32 = (C52171yu3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145516d), Long.valueOf(yu32.f145516d)) && C46238a.m51546a(this.f145517e, yu32.f145517e) && C46238a.m51546a(Integer.valueOf(this.f145518f), Integer.valueOf(yu32.f145518f)) && C46238a.m51546a(Integer.valueOf(this.f145519g), Integer.valueOf(yu32.f145519g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145516d);
            String str = this.f145517e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145518f);
            aVar.mo74318e(4, this.f145519g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f145516d) + 0;
            String str2 = this.f145517e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f145518f) + C52418a.m58678e(4, this.f145519g);
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
            C52171yu3 yu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yu32.f145516d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                yu32.f145517e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yu32.f145518f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                yu32.f145519g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f145516d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "FinderObjectId", valueOf, false);
            aVar.mo71655d(jSONObject, "FinderNonceId", this.f145517e, false);
            aVar.mo71655d(jSONObject, "StartTs", Integer.valueOf(this.f145518f), false);
            aVar.mo71655d(jSONObject, "EndTs", Integer.valueOf(this.f145519g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

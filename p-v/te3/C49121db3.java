package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.db3 */
public class C49121db3 extends C47465a {

    /* renamed from: d */
    public String f132219d;

    /* renamed from: e */
    public String f132220e;

    /* renamed from: f */
    public String f132221f;

    /* renamed from: g */
    public String f132222g;

    /* renamed from: h */
    public String f132223h;

    /* renamed from: i */
    public int f132224i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49121db3)) {
            return false;
        }
        C49121db3 db32 = (C49121db3) aVar;
        return C46238a.m51546a(this.f132219d, db32.f132219d) && C46238a.m51546a(this.f132220e, db32.f132220e) && C46238a.m51546a(this.f132221f, db32.f132221f) && C46238a.m51546a(this.f132222g, db32.f132222g) && C46238a.m51546a(this.f132223h, db32.f132223h) && C46238a.m51546a(Integer.valueOf(this.f132224i), Integer.valueOf(db32.f132224i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132219d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132220e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132221f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132222g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132223h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f132224i);
            return 0;
        } else if (i == 1) {
            String str6 = this.f132219d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f132220e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f132221f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f132222g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f132223h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f132224i);
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
            C49121db3 db32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    db32.f132219d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    db32.f132220e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    db32.f132221f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    db32.f132222g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    db32.f132223h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    db32.f132224i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f132219d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "DocId", str, false);
            aVar.mo71655d(jSONObject, "Title", this.f132220e, false);
            aVar.mo71655d(jSONObject, "Desc", this.f132221f, false);
            aVar.mo71655d(jSONObject, "IconUrl", this.f132222g, false);
            aVar.mo71655d(jSONObject, "Source", this.f132223h, false);
            aVar.mo71655d(jSONObject, "Duration", Integer.valueOf(this.f132224i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

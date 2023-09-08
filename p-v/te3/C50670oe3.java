package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oe3 */
public class C50670oe3 extends C47465a {

    /* renamed from: d */
    public String f139118d;

    /* renamed from: e */
    public String f139119e;

    /* renamed from: f */
    public String f139120f;

    /* renamed from: g */
    public String f139121g;

    /* renamed from: h */
    public float f139122h;

    /* renamed from: i */
    public float f139123i;

    /* renamed from: j */
    public String f139124j;

    /* renamed from: n */
    public long f139125n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50670oe3)) {
            return false;
        }
        C50670oe3 oe32 = (C50670oe3) aVar;
        return C46238a.m51546a(this.f139118d, oe32.f139118d) && C46238a.m51546a(this.f139119e, oe32.f139119e) && C46238a.m51546a(this.f139120f, oe32.f139120f) && C46238a.m51546a(this.f139121g, oe32.f139121g) && C46238a.m51546a(Float.valueOf(this.f139122h), Float.valueOf(oe32.f139122h)) && C46238a.m51546a(Float.valueOf(this.f139123i), Float.valueOf(oe32.f139123i)) && C46238a.m51546a(this.f139124j, oe32.f139124j) && C46238a.m51546a(Long.valueOf(this.f139125n), Long.valueOf(oe32.f139125n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139118d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139119e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139120f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f139121g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74317d(5, this.f139122h);
            aVar.mo74317d(6, this.f139123i);
            String str5 = this.f139124j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74321h(8, this.f139125n);
            return 0;
        } else if (i == 1) {
            String str6 = this.f139118d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f139119e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f139120f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f139121g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int d = i2 + C52418a.m58677d(5, this.f139122h) + C52418a.m58677d(6, this.f139123i);
            String str10 = this.f139124j;
            if (str10 != null) {
                d += C52418a.m58683j(7, str10);
            }
            return d + C52418a.m58681h(8, this.f139125n);
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
            C50670oe3 oe32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oe32.f139118d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    oe32.f139119e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    oe32.f139120f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oe32.f139121g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oe32.f139122h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    oe32.f139123i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    oe32.f139124j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    oe32.f139125n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f139118d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "PoiID", str, false);
            aVar.mo71655d(jSONObject, "Country", this.f139119e, false);
            aVar.mo71655d(jSONObject, "City", this.f139120f, false);
            aVar.mo71655d(jSONObject, "PoiName", this.f139121g, false);
            aVar.mo71655d(jSONObject, "Latitude", Float.valueOf(this.f139122h), false);
            aVar.mo71655d(jSONObject, "Longitude", Float.valueOf(this.f139123i), false);
            aVar.mo71655d(jSONObject, "PoiQuery", this.f139124j, false);
            aVar.mo71655d(jSONObject, "SnsID", Long.valueOf(this.f139125n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

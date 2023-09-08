package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bn2 */
public class C48884bn2 extends C47465a {

    /* renamed from: d */
    public float f131219d;

    /* renamed from: e */
    public float f131220e;

    /* renamed from: f */
    public int f131221f;

    /* renamed from: g */
    public String f131222g;

    /* renamed from: h */
    public String f131223h;

    /* renamed from: i */
    public int f131224i;

    /* renamed from: j */
    public String f131225j;

    /* renamed from: n */
    public int f131226n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48884bn2)) {
            return false;
        }
        C48884bn2 bn22 = (C48884bn2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f131219d), Float.valueOf(bn22.f131219d)) && C46238a.m51546a(Float.valueOf(this.f131220e), Float.valueOf(bn22.f131220e)) && C46238a.m51546a(Integer.valueOf(this.f131221f), Integer.valueOf(bn22.f131221f)) && C46238a.m51546a(this.f131222g, bn22.f131222g) && C46238a.m51546a(this.f131223h, bn22.f131223h) && C46238a.m51546a(Integer.valueOf(this.f131224i), Integer.valueOf(bn22.f131224i)) && C46238a.m51546a(this.f131225j, bn22.f131225j) && C46238a.m51546a(Integer.valueOf(this.f131226n), Integer.valueOf(bn22.f131226n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f131219d);
            aVar.mo74317d(2, this.f131220e);
            aVar.mo74318e(3, this.f131221f);
            String str = this.f131222g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f131223h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f131224i);
            String str3 = this.f131225j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f131226n);
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f131219d) + 0 + C52418a.m58677d(2, this.f131220e) + C52418a.m58678e(3, this.f131221f);
            String str4 = this.f131222g;
            if (str4 != null) {
                d += C52418a.m58683j(4, str4);
            }
            String str5 = this.f131223h;
            if (str5 != null) {
                d += C52418a.m58683j(5, str5);
            }
            int e = d + C52418a.m58678e(6, this.f131224i);
            String str6 = this.f131225j;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            return e + C52418a.m58678e(8, this.f131226n);
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
            C48884bn2 bn22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bn22.f131219d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    bn22.f131220e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    bn22.f131221f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bn22.f131222g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bn22.f131223h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bn22.f131224i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bn22.f131225j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bn22.f131226n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Float valueOf = Float.valueOf(this.f131219d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Longitude", valueOf, false);
            aVar.mo71655d(jSONObject, "Latitude", Float.valueOf(this.f131220e), false);
            aVar.mo71655d(jSONObject, "Precision", Integer.valueOf(this.f131221f), false);
            aVar.mo71655d(jSONObject, "MacAddr", this.f131222g, false);
            aVar.mo71655d(jSONObject, "CellId", this.f131223h, false);
            aVar.mo71655d(jSONObject, "GPSSource", Integer.valueOf(this.f131224i), false);
            aVar.mo71655d(jSONObject, "Address", this.f131225j, false);
            aVar.mo71655d(jSONObject, "AddrFlag", Integer.valueOf(this.f131226n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

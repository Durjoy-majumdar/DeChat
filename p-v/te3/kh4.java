package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class kh4 extends C47465a {

    /* renamed from: d */
    public String f136793d;

    /* renamed from: e */
    public long f136794e;

    /* renamed from: f */
    public int f136795f;

    /* renamed from: g */
    public int f136796g;

    /* renamed from: h */
    public int f136797h;

    /* renamed from: i */
    public LinkedList<String> f136798i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kh4)) {
            return false;
        }
        kh4 kh4 = (kh4) aVar;
        return C46238a.m51546a(this.f136793d, kh4.f136793d) && C46238a.m51546a(Long.valueOf(this.f136794e), Long.valueOf(kh4.f136794e)) && C46238a.m51546a(Integer.valueOf(this.f136795f), Integer.valueOf(kh4.f136795f)) && C46238a.m51546a(Integer.valueOf(this.f136796g), Integer.valueOf(kh4.f136796g)) && C46238a.m51546a(Integer.valueOf(this.f136797h), Integer.valueOf(kh4.f136797h)) && C46238a.m51546a(this.f136798i, kh4.f136798i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136793d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f136794e);
            aVar.mo74318e(3, this.f136795f);
            aVar.mo74318e(4, this.f136796g);
            aVar.mo74318e(5, this.f136797h);
            aVar.mo74320g(6, 1, this.f136798i);
            return 0;
        } else if (i == 1) {
            String str2 = this.f136793d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f136794e) + C52418a.m58678e(3, this.f136795f) + C52418a.m58678e(4, this.f136796g) + C52418a.m58678e(5, this.f136797h) + C52418a.m58680g(6, 1, this.f136798i);
        } else if (i == 2) {
            this.f136798i.clear();
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
            kh4 kh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kh4.f136793d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kh4.f136794e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    kh4.f136795f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kh4.f136796g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kh4.f136797h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kh4.f136798i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136793d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Content", str, false);
            aVar.mo71655d(jSONObject, "SaveTs", Long.valueOf(this.f136794e), false);
            aVar.mo71655d(jSONObject, "DirectShowTs", Integer.valueOf(this.f136795f), false);
            aVar.mo71655d(jSONObject, "ShowAndRefreshTs", Integer.valueOf(this.f136796g), false);
            aVar.mo71655d(jSONObject, "Category", Integer.valueOf(this.f136797h), false);
            aVar.mo71655d(jSONObject, "DocidList", this.f136798i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

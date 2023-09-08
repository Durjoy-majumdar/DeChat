package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cu2 */
public class C49051cu2 extends C47465a {

    /* renamed from: d */
    public int f131964d;

    /* renamed from: e */
    public String f131965e;

    /* renamed from: f */
    public long f131966f;

    /* renamed from: g */
    public long f131967g;

    /* renamed from: h */
    public int f131968h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49051cu2)) {
            return false;
        }
        C49051cu2 cu22 = (C49051cu2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131964d), Integer.valueOf(cu22.f131964d)) && C46238a.m51546a(this.f131965e, cu22.f131965e) && C46238a.m51546a(Long.valueOf(this.f131966f), Long.valueOf(cu22.f131966f)) && C46238a.m51546a(Long.valueOf(this.f131967g), Long.valueOf(cu22.f131967g)) && C46238a.m51546a(Integer.valueOf(this.f131968h), Integer.valueOf(cu22.f131968h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131964d);
            String str = this.f131965e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f131966f);
            aVar.mo74321h(4, this.f131967g);
            aVar.mo74318e(5, this.f131968h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131964d) + 0;
            String str2 = this.f131965e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58681h(3, this.f131966f) + C52418a.m58681h(4, this.f131967g) + C52418a.m58678e(5, this.f131968h);
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
            C49051cu2 cu22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cu22.f131964d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                cu22.f131965e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cu22.f131966f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                cu22.f131967g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cu22.f131968h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f131964d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Scene", valueOf, false);
            aVar.mo71655d(jSONObject, "Json", this.f131965e, false);
            aVar.mo71655d(jSONObject, "Interval", Long.valueOf(this.f131966f), false);
            aVar.mo71655d(jSONObject, "LastCacheSecond", Long.valueOf(this.f131967g), false);
            aVar.mo71655d(jSONObject, "IsPreload", Integer.valueOf(this.f131968h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

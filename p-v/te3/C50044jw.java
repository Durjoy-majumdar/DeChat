package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jw */
public class C50044jw extends C47465a {

    /* renamed from: d */
    public int f136355d;

    /* renamed from: e */
    public String f136356e;

    /* renamed from: f */
    public int f136357f;

    /* renamed from: g */
    public int f136358g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50044jw)) {
            return false;
        }
        C50044jw jwVar = (C50044jw) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136355d), Integer.valueOf(jwVar.f136355d)) && C46238a.m51546a(this.f136356e, jwVar.f136356e) && C46238a.m51546a(Integer.valueOf(this.f136357f), Integer.valueOf(jwVar.f136357f)) && C46238a.m51546a(Integer.valueOf(this.f136358g), Integer.valueOf(jwVar.f136358g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136355d);
            String str = this.f136356e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f136357f);
            aVar.mo74318e(4, this.f136358g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136355d) + 0;
            String str2 = this.f136356e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f136357f) + C52418a.m58678e(4, this.f136358g);
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
            C50044jw jwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jwVar.f136355d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                jwVar.f136356e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                jwVar.f136357f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                jwVar.f136358g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f136355d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Type", valueOf, false);
            aVar.mo71655d(jSONObject, "Title", this.f136356e, false);
            aVar.mo71655d(jSONObject, "ClickIndex", Integer.valueOf(this.f136357f), false);
            aVar.mo71655d(jSONObject, "SearchBarIndex", Integer.valueOf(this.f136358g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

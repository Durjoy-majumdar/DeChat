package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pd4 extends C47465a {

    /* renamed from: d */
    public String f139710d;

    /* renamed from: e */
    public String f139711e;

    /* renamed from: f */
    public C89349b f139712f;

    /* renamed from: g */
    public String f139713g;

    /* renamed from: h */
    public int f139714h;

    /* renamed from: i */
    public C89349b f139715i;

    /* renamed from: j */
    public String f139716j;

    /* renamed from: n */
    public String f139717n;

    /* renamed from: o */
    public String f139718o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pd4)) {
            return false;
        }
        pd4 pd4 = (pd4) aVar;
        return C46238a.m51546a(this.f139710d, pd4.f139710d) && C46238a.m51546a(this.f139711e, pd4.f139711e) && C46238a.m51546a(this.f139712f, pd4.f139712f) && C46238a.m51546a(this.f139713g, pd4.f139713g) && C46238a.m51546a(Integer.valueOf(this.f139714h), Integer.valueOf(pd4.f139714h)) && C46238a.m51546a(this.f139715i, pd4.f139715i) && C46238a.m51546a(this.f139716j, pd4.f139716j) && C46238a.m51546a(this.f139717n, pd4.f139717n) && C46238a.m51546a(this.f139718o, pd4.f139718o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139710d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139711e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C89349b bVar = this.f139712f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str3 = this.f139713g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f139714h);
            C89349b bVar2 = this.f139715i;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            String str4 = this.f139716j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f139717n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f139718o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f139710d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f139711e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            C89349b bVar3 = this.f139712f;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(3, bVar3);
            }
            String str9 = this.f139713g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f139714h);
            C89349b bVar4 = this.f139715i;
            if (bVar4 != null) {
                e += C52418a.m58675b(6, bVar4);
            }
            String str10 = this.f139716j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f139717n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f139718o;
            return str12 != null ? e + C52418a.m58683j(9, str12) : e;
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
            pd4 pd4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pd4.f139710d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pd4.f139711e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pd4.f139712f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    pd4.f139713g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pd4.f139714h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pd4.f139715i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    pd4.f139716j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pd4.f139717n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pd4.f139718o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f139710d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Word", str, false);
            aVar.mo71655d(jSONObject, "DocId", this.f139711e, false);
            aVar.mo71655d(jSONObject, "DebugInfo", this.f139712f, false);
            aVar.mo71655d(jSONObject, "CacheJsonResult", this.f139713g, false);
            aVar.mo71655d(jSONObject, "JumpType", Integer.valueOf(this.f139714h), false);
            aVar.mo71655d(jSONObject, "JumpUrl", this.f139715i, false);
            aVar.mo71655d(jSONObject, "Label", this.f139716j, false);
            aVar.mo71655d(jSONObject, "ExtInfo", this.f139717n, false);
            aVar.mo71655d(jSONObject, "wordHighlight", this.f139718o, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

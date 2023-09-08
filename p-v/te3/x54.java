package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x54 extends C47465a {

    /* renamed from: d */
    public String f144466d;

    /* renamed from: e */
    public String f144467e;

    /* renamed from: f */
    public String f144468f;

    /* renamed from: g */
    public int f144469g;

    /* renamed from: h */
    public int f144470h;

    /* renamed from: i */
    public String f144471i;

    /* renamed from: j */
    public String f144472j;

    /* renamed from: n */
    public String f144473n;

    /* renamed from: o */
    public String f144474o;

    /* renamed from: p */
    public String f144475p;

    /* renamed from: q */
    public int f144476q;

    /* renamed from: r */
    public int f144477r;

    /* renamed from: s */
    public int f144478s;

    /* renamed from: t */
    public int f144479t;

    /* renamed from: u */
    public int f144480u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x54)) {
            return false;
        }
        x54 x54 = (x54) aVar;
        return C46238a.m51546a(this.f144466d, x54.f144466d) && C46238a.m51546a(this.f144467e, x54.f144467e) && C46238a.m51546a(this.f144468f, x54.f144468f) && C46238a.m51546a(Integer.valueOf(this.f144469g), Integer.valueOf(x54.f144469g)) && C46238a.m51546a(Integer.valueOf(this.f144470h), Integer.valueOf(x54.f144470h)) && C46238a.m51546a(this.f144471i, x54.f144471i) && C46238a.m51546a(this.f144472j, x54.f144472j) && C46238a.m51546a(this.f144473n, x54.f144473n) && C46238a.m51546a(this.f144474o, x54.f144474o) && C46238a.m51546a(this.f144475p, x54.f144475p) && C46238a.m51546a(Integer.valueOf(this.f144476q), Integer.valueOf(x54.f144476q)) && C46238a.m51546a(Integer.valueOf(this.f144477r), Integer.valueOf(x54.f144477r)) && C46238a.m51546a(Integer.valueOf(this.f144478s), Integer.valueOf(x54.f144478s)) && C46238a.m51546a(Integer.valueOf(this.f144479t), Integer.valueOf(x54.f144479t)) && C46238a.m51546a(Integer.valueOf(this.f144480u), Integer.valueOf(x54.f144480u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144466d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f144467e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f144468f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.f144469g);
                aVar.mo74318e(5, this.f144470h);
                String str4 = this.f144471i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f144472j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f144473n;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f144474o;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                String str8 = this.f144475p;
                if (str8 != null) {
                    aVar.mo74323j(10, str8);
                }
                aVar.mo74318e(11, this.f144476q);
                aVar.mo74318e(12, this.f144477r);
                aVar.mo74318e(13, this.f144478s);
                aVar.mo74318e(14, this.f144479t);
                aVar.mo74318e(15, this.f144480u);
                return 0;
            }
            throw new C52419b("Not all required fields were included: PickedWord");
        } else if (i2 == 1) {
            String str9 = this.f144466d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f144467e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f144468f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            int e = i3 + C52418a.m58678e(4, this.f144469g) + C52418a.m58678e(5, this.f144470h);
            String str12 = this.f144471i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f144472j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f144473n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            String str15 = this.f144474o;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            String str16 = this.f144475p;
            if (str16 != null) {
                e += C52418a.m58683j(10, str16);
            }
            return e + C52418a.m58678e(11, this.f144476q) + C52418a.m58678e(12, this.f144477r) + C52418a.m58678e(13, this.f144478s) + C52418a.m58678e(14, this.f144479t) + C52418a.m58678e(15, this.f144480u);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f144466d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: PickedWord");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            x54 x54 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x54.f144466d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    x54.f144467e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x54.f144468f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x54.f144469g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    x54.f144470h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    x54.f144471i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x54.f144472j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    x54.f144473n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    x54.f144474o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    x54.f144475p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    x54.f144476q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    x54.f144477r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    x54.f144478s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    x54.f144479t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    x54.f144480u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f144466d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "PickedWord", str, false);
            aVar.mo71655d(jSONObject, "PrefixText", this.f144467e, false);
            aVar.mo71655d(jSONObject, "SuffixText", this.f144468f, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f144469g), false);
            aVar.mo71655d(jSONObject, "MainIndex", Integer.valueOf(this.f144470h), false);
            aVar.mo71655d(jSONObject, "Url", this.f144471i, false);
            aVar.mo71655d(jSONObject, "Title", this.f144472j, false);
            aVar.mo71655d(jSONObject, "SubPickedWord", this.f144473n, false);
            aVar.mo71655d(jSONObject, "SubPrefixText", this.f144474o, false);
            aVar.mo71655d(jSONObject, "SubSuffixText", this.f144475p, false);
            aVar.mo71655d(jSONObject, "SubIndex", Integer.valueOf(this.f144476q), false);
            aVar.mo71655d(jSONObject, "TagNewLineBefore", Integer.valueOf(this.f144477r), false);
            aVar.mo71655d(jSONObject, "TagNewLineAfter", Integer.valueOf(this.f144478s), false);
            aVar.mo71655d(jSONObject, "TagNewLineBeforeSub", Integer.valueOf(this.f144479t), false);
            aVar.mo71655d(jSONObject, "TagNewLineAfterSub", Integer.valueOf(this.f144480u), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

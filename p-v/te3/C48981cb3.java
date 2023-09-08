package te3;

import com.google.android.gms.actions.SearchIntents;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cb3 */
public class C48981cb3 extends C47465a {

    /* renamed from: d */
    public int f131623d;

    /* renamed from: e */
    public String f131624e;

    /* renamed from: f */
    public String f131625f;

    /* renamed from: g */
    public String f131626g;

    /* renamed from: h */
    public int f131627h;

    /* renamed from: i */
    public String f131628i;

    /* renamed from: j */
    public String f131629j;

    /* renamed from: n */
    public String f131630n;

    /* renamed from: o */
    public String f131631o;

    /* renamed from: p */
    public String f131632p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48981cb3)) {
            return false;
        }
        C48981cb3 cb32 = (C48981cb3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131623d), Integer.valueOf(cb32.f131623d)) && C46238a.m51546a(this.f131624e, cb32.f131624e) && C46238a.m51546a(this.f131625f, cb32.f131625f) && C46238a.m51546a(this.f131626g, cb32.f131626g) && C46238a.m51546a(Integer.valueOf(this.f131627h), Integer.valueOf(cb32.f131627h)) && C46238a.m51546a(this.f131628i, cb32.f131628i) && C46238a.m51546a(this.f131629j, cb32.f131629j) && C46238a.m51546a(this.f131630n, cb32.f131630n) && C46238a.m51546a(this.f131631o, cb32.f131631o) && C46238a.m51546a(this.f131632p, cb32.f131632p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131623d);
            String str = this.f131624e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131625f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131626g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f131627h);
            String str4 = this.f131628i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f131629j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f131630n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f131631o;
            if (str7 != null) {
                aVar.mo74323j(100, str7);
            }
            String str8 = this.f131632p;
            if (str8 != null) {
                aVar.mo74323j(101, str8);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131623d) + 0;
            String str9 = this.f131624e;
            if (str9 != null) {
                e += C52418a.m58683j(2, str9);
            }
            String str10 = this.f131625f;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            String str11 = this.f131626g;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            int e2 = e + C52418a.m58678e(5, this.f131627h);
            String str12 = this.f131628i;
            if (str12 != null) {
                e2 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f131629j;
            if (str13 != null) {
                e2 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f131630n;
            if (str14 != null) {
                e2 += C52418a.m58683j(8, str14);
            }
            String str15 = this.f131631o;
            if (str15 != null) {
                e2 += C52418a.m58683j(100, str15);
            }
            String str16 = this.f131632p;
            return str16 != null ? e2 + C52418a.m58683j(101, str16) : e2;
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
            C48981cb3 cb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 100) {
                cb32.f131631o = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 101) {
                switch (intValue) {
                    case 1:
                        cb32.f131623d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        cb32.f131624e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        cb32.f131625f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        cb32.f131626g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        cb32.f131627h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        cb32.f131628i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        cb32.f131629j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        cb32.f131630n = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                cb32.f131632p = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f131623d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ActionType", valueOf, false);
            aVar.mo71655d(jSONObject, "JumpUrl", this.f131624e, false);
            aVar.mo71655d(jSONObject, "UserName", this.f131625f, false);
            aVar.mo71655d(jSONObject, "WeappPath", this.f131626g, false);
            aVar.mo71655d(jSONObject, "WeappVersion", Integer.valueOf(this.f131627h), false);
            aVar.mo71655d(jSONObject, "SceneNote", this.f131628i, false);
            aVar.mo71655d(jSONObject, "CtrlInfo", this.f131629j, false);
            aVar.mo71655d(jSONObject, "MusicObjectXmlDesc", this.f131630n, false);
            aVar.mo71655d(jSONObject, SearchIntents.EXTRA_QUERY, this.f131631o, false);
            aVar.mo71655d(jSONObject, "extParamStr", this.f131632p, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

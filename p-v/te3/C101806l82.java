package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l82 */
public class C101806l82 extends C47465a {

    /* renamed from: d */
    public int f298714d;

    /* renamed from: e */
    public String f298715e;

    /* renamed from: f */
    public String f298716f;

    /* renamed from: g */
    public String f298717g;

    /* renamed from: h */
    public int f298718h;

    /* renamed from: i */
    public String f298719i;

    /* renamed from: j */
    public String f298720j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101806l82)) {
            return false;
        }
        C101806l82 l822 = (C101806l82) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298714d), Integer.valueOf(l822.f298714d)) && C46238a.m51546a(this.f298715e, l822.f298715e) && C46238a.m51546a(this.f298716f, l822.f298716f) && C46238a.m51546a(this.f298717g, l822.f298717g) && C46238a.m51546a(Integer.valueOf(this.f298718h), Integer.valueOf(l822.f298718h)) && C46238a.m51546a(this.f298719i, l822.f298719i) && C46238a.m51546a(this.f298720j, l822.f298720j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298714d);
            String str = this.f298715e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298716f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298717g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f298718h);
            String str4 = this.f298719i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f298720j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298714d) + 0;
            String str6 = this.f298715e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f298716f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f298717g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f298718h);
            String str9 = this.f298719i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f298720j;
            return str10 != null ? e2 + C52418a.m58683j(7, str10) : e2;
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
            C101806l82 l822 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l822.f298714d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    l822.f298715e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l822.f298716f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l822.f298717g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l822.f298718h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    l822.f298719i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    l822.f298720j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f298714d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Scene", valueOf, false);
            aVar.mo71655d(jSONObject, "SessionId", this.f298715e, false);
            aVar.mo71655d(jSONObject, "RequestId", this.f298716f, false);
            aVar.mo71655d(jSONObject, "SearchId", this.f298717g, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f298718h), false);
            aVar.mo71655d(jSONObject, "Query", this.f298719i, false);
            aVar.mo71655d(jSONObject, "Content", this.f298720j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

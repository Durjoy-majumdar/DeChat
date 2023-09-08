package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qk */
public class C50971qk extends C47465a {

    /* renamed from: d */
    public String f140354d;

    /* renamed from: e */
    public String f140355e;

    /* renamed from: f */
    public String f140356f;

    /* renamed from: g */
    public String f140357g;

    /* renamed from: h */
    public int f140358h;

    /* renamed from: i */
    public String f140359i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50971qk)) {
            return false;
        }
        C50971qk qkVar = (C50971qk) aVar;
        return C46238a.m51546a(this.f140354d, qkVar.f140354d) && C46238a.m51546a(this.f140355e, qkVar.f140355e) && C46238a.m51546a(this.f140356f, qkVar.f140356f) && C46238a.m51546a(this.f140357g, qkVar.f140357g) && C46238a.m51546a(Integer.valueOf(this.f140358h), Integer.valueOf(qkVar.f140358h)) && C46238a.m51546a(this.f140359i, qkVar.f140359i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140354d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: ProductId");
            } else if (this.f140355e == null) {
                throw new C52419b("Not all required fields were included: ProductName");
            } else if (this.f140356f == null) {
                throw new C52419b("Not all required fields were included: SellerName");
            } else if (this.f140357g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f140355e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f140356f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f140357g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f140358h);
                String str5 = this.f140359i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SellerUserName");
            }
        } else if (i == 1) {
            String str6 = this.f140354d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f140355e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f140356f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f140357g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f140358h);
            String str10 = this.f140359i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140354d == null) {
                throw new C52419b("Not all required fields were included: ProductId");
            } else if (this.f140355e == null) {
                throw new C52419b("Not all required fields were included: ProductName");
            } else if (this.f140356f == null) {
                throw new C52419b("Not all required fields were included: SellerName");
            } else if (this.f140357g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SellerUserName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50971qk qkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qkVar.f140354d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qkVar.f140355e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qkVar.f140356f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qkVar.f140357g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qkVar.f140358h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qkVar.f140359i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f140354d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ProductId", str, false);
            aVar.mo71655d(jSONObject, "ProductName", this.f140355e, false);
            aVar.mo71655d(jSONObject, "SellerName", this.f140356f, false);
            aVar.mo71655d(jSONObject, "SellerUserName", this.f140357g, false);
            aVar.mo71655d(jSONObject, "Price", Integer.valueOf(this.f140358h), false);
            aVar.mo71655d(jSONObject, "ProductImgUrl", this.f140359i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

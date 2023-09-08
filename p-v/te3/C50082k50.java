package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k50 */
public class C50082k50 extends C47465a {

    /* renamed from: d */
    public C49613gu3 f136559d;

    /* renamed from: e */
    public String f136560e;

    /* renamed from: f */
    public String f136561f;

    /* renamed from: g */
    public int f136562g;

    /* renamed from: h */
    public String f136563h;

    /* renamed from: i */
    public String f136564i;

    /* renamed from: j */
    public int f136565j;

    /* renamed from: n */
    public String f136566n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50082k50)) {
            return false;
        }
        C50082k50 k502 = (C50082k50) aVar;
        return C46238a.m51546a(this.f136559d, k502.f136559d) && C46238a.m51546a(this.f136560e, k502.f136560e) && C46238a.m51546a(this.f136561f, k502.f136561f) && C46238a.m51546a(Integer.valueOf(this.f136562g), Integer.valueOf(k502.f136562g)) && C46238a.m51546a(this.f136563h, k502.f136563h) && C46238a.m51546a(this.f136564i, k502.f136564i) && C46238a.m51546a(Integer.valueOf(this.f136565j), Integer.valueOf(k502.f136565j)) && C46238a.m51546a(this.f136566n, k502.f136566n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49613gu3 gu32 = this.f136559d;
            if (gu32 != null) {
                aVar.mo74322i(1, gu32.computeSize());
                this.f136559d.writeFields(aVar);
            }
            String str = this.f136560e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136561f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f136562g);
            String str3 = this.f136563h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f136564i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f136565j);
            String str5 = this.f136566n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            C49613gu3 gu33 = this.f136559d;
            if (gu33 != null) {
                i2 = 0 + C52418a.m58682i(1, gu33.computeSize());
            }
            String str6 = this.f136560e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f136561f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f136562g);
            String str8 = this.f136563h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f136564i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            int e2 = e + C52418a.m58678e(7, this.f136565j);
            String str10 = this.f136566n;
            return str10 != null ? e2 + C52418a.m58683j(8, str10) : e2;
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
            C50082k50 k502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49613gu3 gu34 = new C49613gu3();
                        if (bArr != null && bArr.length > 0) {
                            gu34.parseFrom(bArr);
                        }
                        k502.f136559d = gu34;
                    }
                    return 0;
                case 2:
                    k502.f136560e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k502.f136561f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k502.f136562g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    k502.f136563h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k502.f136564i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k502.f136565j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    k502.f136566n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49613gu3 gu32 = this.f136559d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "CommContent", gu32, false);
            aVar.mo71655d(jSONObject, "JumpUrl", this.f136560e, false);
            aVar.mo71655d(jSONObject, "Date", this.f136561f, false);
            aVar.mo71655d(jSONObject, "JumpType", Integer.valueOf(this.f136562g), false);
            aVar.mo71655d(jSONObject, "UserName", this.f136563h, false);
            aVar.mo71655d(jSONObject, "WeappPath", this.f136564i, false);
            aVar.mo71655d(jSONObject, "WeappVersion", Integer.valueOf(this.f136565j), false);
            aVar.mo71655d(jSONObject, "SceneNote", this.f136566n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

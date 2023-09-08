package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oy3 */
public class C50755oy3 extends C49335eu3 {

    /* renamed from: d */
    public int f139450d;

    /* renamed from: e */
    public String f139451e;

    /* renamed from: f */
    public String f139452f;

    /* renamed from: g */
    public int f139453g;

    /* renamed from: h */
    public String f139454h;

    /* renamed from: i */
    public String f139455i;

    /* renamed from: j */
    public String f139456j;

    /* renamed from: n */
    public String f139457n;

    /* renamed from: o */
    public int f139458o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50755oy3)) {
            return false;
        }
        C50755oy3 oy32 = (C50755oy3) aVar;
        return C46238a.m51546a(this.BaseResponse, oy32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139450d), Integer.valueOf(oy32.f139450d)) && C46238a.m51546a(this.f139451e, oy32.f139451e) && C46238a.m51546a(this.f139452f, oy32.f139452f) && C46238a.m51546a(Integer.valueOf(this.f139453g), Integer.valueOf(oy32.f139453g)) && C46238a.m51546a(this.f139454h, oy32.f139454h) && C46238a.m51546a(this.f139455i, oy32.f139455i) && C46238a.m51546a(this.f139456j, oy32.f139456j) && C46238a.m51546a(this.f139457n, oy32.f139457n) && C46238a.m51546a(Integer.valueOf(this.f139458o), Integer.valueOf(oy32.f139458o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f139450d);
            String str = this.f139451e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139452f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f139453g);
            String str3 = this.f139454h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f139455i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f139456j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f139457n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f139458o);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139450d);
            String str7 = this.f139451e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f139452f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f139453g);
            String str9 = this.f139454h;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f139455i;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f139456j;
            if (str11 != null) {
                e2 += C52418a.m58683j(8, str11);
            }
            String str12 = this.f139457n;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            return e2 + C52418a.m58678e(10, this.f139458o);
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
            C50755oy3 oy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        oy32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    oy32.f139450d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oy32.f139451e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oy32.f139452f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oy32.f139453g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    oy32.f139454h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    oy32.f139455i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    oy32.f139456j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    oy32.f139457n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    oy32.f139458o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
            aVar.mo71655d(jSONObject, "JumpType", Integer.valueOf(this.f139450d), false);
            aVar.mo71655d(jSONObject, "UserName", this.f139451e, false);
            aVar.mo71655d(jSONObject, "WeappUrl", this.f139452f, false);
            aVar.mo71655d(jSONObject, "VersionType", Integer.valueOf(this.f139453g), false);
            aVar.mo71655d(jSONObject, "Appid", this.f139454h, false);
            aVar.mo71655d(jSONObject, "NickName", this.f139455i, false);
            aVar.mo71655d(jSONObject, "JumpUrl", this.f139456j, false);
            aVar.mo71655d(jSONObject, "WebviewJson", this.f139457n, false);
            aVar.mo71655d(jSONObject, "Version", Integer.valueOf(this.f139458o), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

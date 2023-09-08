package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class y54 extends C49335eu3 {

    /* renamed from: d */
    public String f145128d;

    /* renamed from: e */
    public int f145129e;

    /* renamed from: f */
    public int f145130f;

    /* renamed from: g */
    public String f145131g;

    /* renamed from: h */
    public String f145132h;

    /* renamed from: i */
    public int f145133i;

    /* renamed from: j */
    public String f145134j;

    /* renamed from: n */
    public C89349b f145135n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y54)) {
            return false;
        }
        y54 y54 = (y54) aVar;
        return C46238a.m51546a(this.BaseResponse, y54.BaseResponse) && C46238a.m51546a(this.f145128d, y54.f145128d) && C46238a.m51546a(Integer.valueOf(this.f145129e), Integer.valueOf(y54.f145129e)) && C46238a.m51546a(Integer.valueOf(this.f145130f), Integer.valueOf(y54.f145130f)) && C46238a.m51546a(this.f145131g, y54.f145131g) && C46238a.m51546a(this.f145132h, y54.f145132h) && C46238a.m51546a(Integer.valueOf(this.f145133i), Integer.valueOf(y54.f145133i)) && C46238a.m51546a(this.f145134j, y54.f145134j) && C46238a.m51546a(this.f145135n, y54.f145135n);
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
            String str = this.f145128d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145129e);
            aVar.mo74318e(4, this.f145130f);
            String str2 = this.f145131g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f145132h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f145133i);
            String str4 = this.f145134j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            C89349b bVar = this.f145135n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f145128d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f145129e) + C52418a.m58678e(4, this.f145130f);
            String str6 = this.f145131g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f145132h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            int e2 = e + C52418a.m58678e(7, this.f145133i);
            String str8 = this.f145134j;
            if (str8 != null) {
                e2 += C52418a.m58683j(8, str8);
            }
            C89349b bVar2 = this.f145135n;
            return bVar2 != null ? e2 + C52418a.m58675b(9, bVar2) : e2;
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
            y54 y54 = objArr[1];
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
                        y54.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    y54.f145128d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    y54.f145129e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    y54.f145130f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    y54.f145131g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    y54.f145132h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    y54.f145133i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    y54.f145134j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    y54.f145135n = aVar3.mo141626d(intValue);
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
            aVar.mo71655d(jSONObject, "PickedWord", this.f145128d, false);
            aVar.mo71655d(jSONObject, "PrefixOffset", Integer.valueOf(this.f145129e), false);
            aVar.mo71655d(jSONObject, "SuffixOffset", Integer.valueOf(this.f145130f), false);
            aVar.mo71655d(jSONObject, "PrefixText", this.f145131g, false);
            aVar.mo71655d(jSONObject, "SuffixText", this.f145132h, false);
            aVar.mo71655d(jSONObject, "PickedType", Integer.valueOf(this.f145133i), false);
            aVar.mo71655d(jSONObject, "SearchId", this.f145134j, false);
            aVar.mo71655d(jSONObject, "ExtQueryInfo", this.f145135n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

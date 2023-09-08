package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eu2 */
public class C49334eu2 extends C49335eu3 {

    /* renamed from: d */
    public String f133123d;

    /* renamed from: e */
    public int f133124e;

    /* renamed from: f */
    public String f133125f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49334eu2)) {
            return false;
        }
        C49334eu2 eu22 = (C49334eu2) aVar;
        return C46238a.m51546a(this.BaseResponse, eu22.BaseResponse) && C46238a.m51546a(this.f133123d, eu22.f133123d) && C46238a.m51546a(Integer.valueOf(this.f133124e), Integer.valueOf(eu22.f133124e)) && C46238a.m51546a(this.f133125f, eu22.f133125f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133123d != null) {
                C49966ja jaVar = this.BaseResponse;
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f133123d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f133124e);
                String str2 = this.f133125f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Json");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f133123d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f133124e);
            String str4 = this.f133125f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133123d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Json");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49334eu2 eu22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    eu22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eu22.f133123d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                eu22.f133124e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                eu22.f133125f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
            aVar.mo71655d(jSONObject, "Json", this.f133123d, false);
            aVar.mo71655d(jSONObject, "TimevalSec", Integer.valueOf(this.f133124e), false);
            aVar.mo71655d(jSONObject, "SearchId", this.f133125f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

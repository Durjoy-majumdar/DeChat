package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oh4 extends C49335eu3 {

    /* renamed from: d */
    public String f139186d;

    /* renamed from: e */
    public boolean f139187e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oh4)) {
            return false;
        }
        oh4 oh4 = (oh4) aVar;
        return C46238a.m51546a(this.BaseResponse, oh4.BaseResponse) && C46238a.m51546a(this.f139186d, oh4.f139186d) && C46238a.m51546a(Boolean.valueOf(this.f139187e), Boolean.valueOf(oh4.f139187e));
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
            String str = this.f139186d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f139187e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f139186d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f139187e);
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
            oh4 oh4 = objArr[1];
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
                    oh4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                oh4.f139186d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                oh4.f139187e = aVar3.mo141625c(intValue);
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
            aVar.mo71655d(jSONObject, "RequestId", this.f139186d, false);
            aVar.mo71655d(jSONObject, "HasDeleteComment", Boolean.valueOf(this.f139187e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

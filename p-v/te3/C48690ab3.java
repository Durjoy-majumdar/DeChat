package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ab3 */
public class C48690ab3 extends C49335eu3 {

    /* renamed from: d */
    public int f130418d;

    /* renamed from: e */
    public String f130419e;

    /* renamed from: f */
    public int f130420f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48690ab3)) {
            return false;
        }
        C48690ab3 ab32 = (C48690ab3) aVar;
        return C46238a.m51546a(this.BaseResponse, ab32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130418d), Integer.valueOf(ab32.f130418d)) && C46238a.m51546a(this.f130419e, ab32.f130419e) && C46238a.m51546a(Integer.valueOf(this.f130420f), Integer.valueOf(ab32.f130420f));
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
            aVar.mo74318e(2, this.f130418d);
            String str = this.f130419e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f130420f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130418d);
            String str2 = this.f130419e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f130420f);
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
            C48690ab3 ab32 = objArr[1];
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
                    ab32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ab32.f130418d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ab32.f130419e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ab32.f130420f = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "CacheExpireTime", Integer.valueOf(this.f130418d), false);
            aVar.mo71655d(jSONObject, "PassKey", this.f130419e, false);
            aVar.mo71655d(jSONObject, "PassKeyValidTime", Integer.valueOf(this.f130420f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

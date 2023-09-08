package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kz0 */
public class C50195kz0 extends C49335eu3 {

    /* renamed from: d */
    public int f137104d;

    /* renamed from: e */
    public LinkedList<C48862bj> f137105e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50195kz0)) {
            return false;
        }
        C50195kz0 kz02 = (C50195kz0) aVar;
        return C46238a.m51546a(this.BaseResponse, kz02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137104d), Integer.valueOf(kz02.f137104d)) && C46238a.m51546a(this.f137105e, kz02.f137105e);
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
            aVar.mo74318e(2, this.f137104d);
            aVar.mo74320g(3, 8, this.f137105e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137104d) + C52418a.m58680g(3, 8, this.f137105e);
        } else if (i == 2) {
            this.f137105e.clear();
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
            C50195kz0 kz02 = objArr[1];
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
                    kz02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kz02.f137104d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48862bj bjVar = new C48862bj();
                    if (bArr2 != null && bArr2.length > 0) {
                        bjVar.parseFrom(bArr2);
                    }
                    kz02.f137105e.add(bjVar);
                }
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
            aVar.mo71655d(jSONObject, "next_interval_ms", Integer.valueOf(this.f137104d), false);
            aVar.mo71655d(jSONObject, "box_readdot_list", this.f137105e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

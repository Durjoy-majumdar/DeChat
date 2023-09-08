package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class y45 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<a85> f145115d = new LinkedList<>();

    /* renamed from: e */
    public int f145116e;

    /* renamed from: f */
    public LinkedList<String> f145117f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y45)) {
            return false;
        }
        y45 y45 = (y45) aVar;
        return C46238a.m51546a(this.BaseResponse, y45.BaseResponse) && C46238a.m51546a(this.f145115d, y45.f145115d) && C46238a.m51546a(Integer.valueOf(this.f145116e), Integer.valueOf(y45.f145116e)) && C46238a.m51546a(this.f145117f, y45.f145117f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f145115d);
                aVar.mo74318e(3, this.f145116e);
                aVar.mo74320g(4, 1, this.f145117f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f145115d) + C52418a.m58678e(3, this.f145116e) + C52418a.m58680g(4, 1, this.f145117f);
        } else if (i == 2) {
            this.f145115d.clear();
            this.f145117f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            y45 y45 = objArr[1];
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
                    y45.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    a85 a85 = new a85();
                    if (bArr2 != null && bArr2.length > 0) {
                        a85.parseFrom(bArr2);
                    }
                    y45.f145115d.add(a85);
                }
                return 0;
            } else if (intValue == 3) {
                y45.f145116e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                y45.f145117f.add(aVar3.mo141633k(intValue));
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
            aVar.mo71655d(jSONObject, "wxa_item_list", this.f145115d, false);
            aVar.mo71655d(jSONObject, "status", Integer.valueOf(this.f145116e), false);
            aVar.mo71655d(jSONObject, "all_shown_scope_list", this.f145117f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

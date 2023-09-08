package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ox3 */
public class C50750ox3 extends C49335eu3 {

    /* renamed from: d */
    public C50274lk f139435d;

    /* renamed from: e */
    public int f139436e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50750ox3)) {
            return false;
        }
        C50750ox3 ox32 = (C50750ox3) aVar;
        return C46238a.m51546a(this.BaseResponse, ox32.BaseResponse) && C46238a.m51546a(this.f139435d, ox32.f139435d) && C46238a.m51546a(Integer.valueOf(this.f139436e), Integer.valueOf(ox32.f139436e));
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
            C50274lk lkVar = this.f139435d;
            if (lkVar != null) {
                aVar.mo74322i(2, lkVar.computeSize());
                this.f139435d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139436e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50274lk lkVar2 = this.f139435d;
            if (lkVar2 != null) {
                i2 += C52418a.m58682i(2, lkVar2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f139436e);
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
            C50750ox3 ox32 = objArr[1];
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
                    ox32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50274lk lkVar3 = new C50274lk();
                    if (bArr2 != null && bArr2.length > 0) {
                        lkVar3.parseFrom(bArr2);
                    }
                    ox32.f139435d = lkVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ox32.f139436e = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "Content", this.f139435d, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f139436e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

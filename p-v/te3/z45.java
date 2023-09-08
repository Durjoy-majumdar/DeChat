package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z45 extends C101820nt3 {

    /* renamed from: d */
    public String f145694d;

    /* renamed from: e */
    public int f145695e;

    /* renamed from: f */
    public int f145696f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z45)) {
            return false;
        }
        z45 z45 = (z45) aVar;
        return C46238a.m51546a(this.BaseRequest, z45.BaseRequest) && C46238a.m51546a(this.f145694d, z45.f145694d) && C46238a.m51546a(Integer.valueOf(this.f145695e), Integer.valueOf(z45.f145695e)) && C46238a.m51546a(Integer.valueOf(this.f145696f), Integer.valueOf(z45.f145696f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f145694d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145695e);
            aVar.mo74318e(4, this.f145696f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f145694d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f145695e) + C52418a.m58678e(4, this.f145696f);
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
            z45 z45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    z45.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z45.f145694d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                z45.f145695e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z45.f145696f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "username", this.f145694d, false);
            aVar.mo71655d(jSONObject, "last_update_time", Integer.valueOf(this.f145695e), false);
            aVar.mo71655d(jSONObject, "record_count", Integer.valueOf(this.f145696f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

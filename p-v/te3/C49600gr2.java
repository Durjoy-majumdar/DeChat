package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gr2 */
public class C49600gr2 extends C49335eu3 {

    /* renamed from: d */
    public C49322er2 f134209d;

    /* renamed from: e */
    public C49374f33 f134210e;

    /* renamed from: f */
    public int f134211f;

    /* renamed from: g */
    public int f134212g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49600gr2)) {
            return false;
        }
        C49600gr2 gr22 = (C49600gr2) aVar;
        return C46238a.m51546a(this.BaseResponse, gr22.BaseResponse) && C46238a.m51546a(this.f134209d, gr22.f134209d) && C46238a.m51546a(this.f134210e, gr22.f134210e) && C46238a.m51546a(Integer.valueOf(this.f134211f), Integer.valueOf(gr22.f134211f)) && C46238a.m51546a(Integer.valueOf(this.f134212g), Integer.valueOf(gr22.f134212g));
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
            C49322er2 er22 = this.f134209d;
            if (er22 != null) {
                aVar.mo74322i(2, er22.computeSize());
                this.f134209d.writeFields(aVar);
            }
            C49374f33 f332 = this.f134210e;
            if (f332 != null) {
                aVar.mo74322i(3, f332.computeSize());
                this.f134210e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f134211f);
            aVar.mo74318e(5, this.f134212g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49322er2 er23 = this.f134209d;
            if (er23 != null) {
                i2 += C52418a.m58682i(2, er23.computeSize());
            }
            C49374f33 f333 = this.f134210e;
            if (f333 != null) {
                i2 += C52418a.m58682i(3, f333.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f134211f) + C52418a.m58678e(5, this.f134212g);
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
            C49600gr2 gr22 = objArr[1];
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
                    gr22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49322er2 er24 = new C49322er2();
                    if (bArr2 != null && bArr2.length > 0) {
                        er24.parseFrom(bArr2);
                    }
                    gr22.f134209d = er24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49374f33 f334 = new C49374f33();
                    if (bArr3 != null && bArr3.length > 0) {
                        f334.parseFrom(bArr3);
                    }
                    gr22.f134210e = f334;
                }
                return 0;
            } else if (intValue == 4) {
                gr22.f134211f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gr22.f134212g = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "dict", this.f134209d, false);
            aVar.mo71655d(jSONObject, "network_dict", this.f134210e, false);
            aVar.mo71655d(jSONObject, "timeval_sec", Integer.valueOf(this.f134211f), false);
            aVar.mo71655d(jSONObject, "second_box_height", Integer.valueOf(this.f134212g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

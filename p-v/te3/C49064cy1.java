package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cy1 */
public class C49064cy1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50962qi> f132021d = new LinkedList<>();

    /* renamed from: e */
    public int f132022e;

    /* renamed from: f */
    public int f132023f;

    /* renamed from: g */
    public int f132024g;

    /* renamed from: h */
    public long f132025h;

    /* renamed from: i */
    public int f132026i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49064cy1)) {
            return false;
        }
        C49064cy1 cy12 = (C49064cy1) aVar;
        return C46238a.m51546a(this.BaseResponse, cy12.BaseResponse) && C46238a.m51546a(this.f132021d, cy12.f132021d) && C46238a.m51546a(Integer.valueOf(this.f132022e), Integer.valueOf(cy12.f132022e)) && C46238a.m51546a(Integer.valueOf(this.f132023f), Integer.valueOf(cy12.f132023f)) && C46238a.m51546a(Integer.valueOf(this.f132024g), Integer.valueOf(cy12.f132024g)) && C46238a.m51546a(Long.valueOf(this.f132025h), Long.valueOf(cy12.f132025h)) && C46238a.m51546a(Integer.valueOf(this.f132026i), Integer.valueOf(cy12.f132026i));
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
            aVar.mo74320g(2, 8, this.f132021d);
            aVar.mo74318e(3, this.f132022e);
            aVar.mo74318e(4, this.f132023f);
            aVar.mo74318e(5, this.f132024g);
            aVar.mo74321h(6, this.f132025h);
            aVar.mo74318e(7, this.f132026i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f132021d) + C52418a.m58678e(3, this.f132022e) + C52418a.m58678e(4, this.f132023f) + C52418a.m58678e(5, this.f132024g) + C52418a.m58681h(6, this.f132025h) + C52418a.m58678e(7, this.f132026i);
        } else if (i == 2) {
            this.f132021d.clear();
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
            C49064cy1 cy12 = objArr[1];
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
                        cy12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50962qi qiVar = new C50962qi();
                        if (bArr2 != null && bArr2.length > 0) {
                            qiVar.parseFrom(bArr2);
                        }
                        cy12.f132021d.add(qiVar);
                    }
                    return 0;
                case 3:
                    cy12.f132022e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cy12.f132023f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cy12.f132024g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    cy12.f132025h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    cy12.f132026i = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "Items", this.f132021d, false);
            aVar.mo71655d(jSONObject, "ContinueFlag", Integer.valueOf(this.f132022e), false);
            aVar.mo71655d(jSONObject, "Total", Integer.valueOf(this.f132023f), false);
            aVar.mo71655d(jSONObject, "UpdateFlag", Integer.valueOf(this.f132024g), false);
            aVar.mo71655d(jSONObject, "Version", Long.valueOf(this.f132025h), false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f132026i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

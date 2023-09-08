package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class q25 extends C49335eu3 {

    /* renamed from: d */
    public int f140106d;

    /* renamed from: e */
    public int f140107e;

    /* renamed from: f */
    public String f140108f;

    /* renamed from: g */
    public C51716vn3 f140109g;

    /* renamed from: h */
    public C50987qn3 f140110h;

    /* renamed from: i */
    public int f140111i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q25)) {
            return false;
        }
        q25 q25 = (q25) aVar;
        return C46238a.m51546a(this.BaseResponse, q25.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140106d), Integer.valueOf(q25.f140106d)) && C46238a.m51546a(Integer.valueOf(this.f140107e), Integer.valueOf(q25.f140107e)) && C46238a.m51546a(this.f140108f, q25.f140108f) && C46238a.m51546a(this.f140109g, q25.f140109g) && C46238a.m51546a(this.f140110h, q25.f140110h) && C46238a.m51546a(Integer.valueOf(this.f140111i), Integer.valueOf(q25.f140111i));
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
            aVar.mo74318e(2, this.f140106d);
            aVar.mo74318e(3, this.f140107e);
            String str = this.f140108f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C51716vn3 vn32 = this.f140109g;
            if (vn32 != null) {
                aVar.mo74322i(5, vn32.computeSize());
                this.f140109g.writeFields(aVar);
            }
            C50987qn3 qn32 = this.f140110h;
            if (qn32 != null) {
                aVar.mo74322i(6, qn32.computeSize());
                this.f140110h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f140111i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140106d) + C52418a.m58678e(3, this.f140107e);
            String str2 = this.f140108f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            C51716vn3 vn33 = this.f140109g;
            if (vn33 != null) {
                e += C52418a.m58682i(5, vn33.computeSize());
            }
            C50987qn3 qn33 = this.f140110h;
            if (qn33 != null) {
                e += C52418a.m58682i(6, qn33.computeSize());
            }
            return e + C52418a.m58678e(7, this.f140111i);
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
            q25 q25 = objArr[1];
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
                        q25.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    q25.f140106d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    q25.f140107e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    q25.f140108f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51716vn3 vn34 = new C51716vn3();
                        if (bArr2 != null && bArr2.length > 0) {
                            vn34.parseFrom(bArr2);
                        }
                        q25.f140109g = vn34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50987qn3 qn34 = new C50987qn3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qn34.parseFrom(bArr3);
                        }
                        q25.f140110h = qn34;
                    }
                    return 0;
                case 7:
                    q25.f140111i = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "UpdateCode", Integer.valueOf(this.f140106d), false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f140107e), false);
            aVar.mo71655d(jSONObject, "Json", this.f140108f, false);
            aVar.mo71655d(jSONObject, "Plugin", this.f140109g, false);
            aVar.mo71655d(jSONObject, "ClientCache", this.f140110h, false);
            aVar.mo71655d(jSONObject, "RedDotTimeStamp", Integer.valueOf(this.f140111i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

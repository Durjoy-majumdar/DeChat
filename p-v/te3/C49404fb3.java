package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fb3 */
public class C49404fb3 extends C49335eu3 {

    /* renamed from: d */
    public String f133390d;

    /* renamed from: e */
    public qd4 f133391e;

    /* renamed from: f */
    public LinkedList<C51119rk> f133392f = new LinkedList<>();

    /* renamed from: g */
    public String f133393g;

    /* renamed from: h */
    public String f133394h;

    /* renamed from: i */
    public String f133395i;

    /* renamed from: j */
    public qd4 f133396j;

    /* renamed from: n */
    public String f133397n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49404fb3)) {
            return false;
        }
        C49404fb3 fb32 = (C49404fb3) aVar;
        return C46238a.m51546a(this.BaseResponse, fb32.BaseResponse) && C46238a.m51546a(this.f133390d, fb32.f133390d) && C46238a.m51546a(this.f133391e, fb32.f133391e) && C46238a.m51546a(this.f133392f, fb32.f133392f) && C46238a.m51546a(this.f133393g, fb32.f133393g) && C46238a.m51546a(this.f133394h, fb32.f133394h) && C46238a.m51546a(this.f133395i, fb32.f133395i) && C46238a.m51546a(this.f133396j, fb32.f133396j) && C46238a.m51546a(this.f133397n, fb32.f133397n);
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
            String str = this.f133390d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            qd4 qd4 = this.f133391e;
            if (qd4 != null) {
                aVar.mo74322i(3, qd4.computeSize());
                this.f133391e.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f133392f);
            String str2 = this.f133393g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f133394h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f133395i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            qd4 qd42 = this.f133396j;
            if (qd42 != null) {
                aVar.mo74322i(8, qd42.computeSize());
                this.f133396j.writeFields(aVar);
            }
            String str5 = this.f133397n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str6 = this.f133390d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            qd4 qd43 = this.f133391e;
            if (qd43 != null) {
                i2 += C52418a.m58682i(3, qd43.computeSize());
            }
            int g = i2 + C52418a.m58680g(4, 8, this.f133392f);
            String str7 = this.f133393g;
            if (str7 != null) {
                g += C52418a.m58683j(5, str7);
            }
            String str8 = this.f133394h;
            if (str8 != null) {
                g += C52418a.m58683j(6, str8);
            }
            String str9 = this.f133395i;
            if (str9 != null) {
                g += C52418a.m58683j(7, str9);
            }
            qd4 qd44 = this.f133396j;
            if (qd44 != null) {
                g += C52418a.m58682i(8, qd44.computeSize());
            }
            String str10 = this.f133397n;
            return str10 != null ? g + C52418a.m58683j(9, str10) : g;
        } else if (i == 2) {
            this.f133392f.clear();
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
            C49404fb3 fb32 = objArr[1];
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
                        fb32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fb32.f133390d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        qd4 qd45 = new qd4();
                        if (bArr2 != null && bArr2.length > 0) {
                            qd45.parseFrom(bArr2);
                        }
                        fb32.f133391e = qd45;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51119rk rkVar = new C51119rk();
                        if (bArr3 != null && bArr3.length > 0) {
                            rkVar.parseFrom(bArr3);
                        }
                        fb32.f133392f.add(rkVar);
                    }
                    return 0;
                case 5:
                    fb32.f133393g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fb32.f133394h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fb32.f133395i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        qd4 qd46 = new qd4();
                        if (bArr4 != null && bArr4.length > 0) {
                            qd46.parseFrom(bArr4);
                        }
                        fb32.f133396j = qd46;
                    }
                    return 0;
                case 9:
                    fb32.f133397n = aVar3.mo141633k(intValue);
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
            aVar.mo71655d(jSONObject, "SearchId", this.f133390d, false);
            aVar.mo71655d(jSONObject, "SugResult", this.f133391e, false);
            aVar.mo71655d(jSONObject, "BusinessResults", this.f133392f, false);
            aVar.mo71655d(jSONObject, "MoreText", this.f133393g, false);
            aVar.mo71655d(jSONObject, "GuideText", this.f133394h, false);
            aVar.mo71655d(jSONObject, "PardusInfo", this.f133395i, false);
            aVar.mo71655d(jSONObject, "RelatedResult", this.f133396j, false);
            aVar.mo71655d(jSONObject, "JsonResult", this.f133397n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hn0 */
public class C49727hn0 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f134742d;

    /* renamed from: e */
    public LinkedList<C52013xs0> f134743e = new LinkedList<>();

    /* renamed from: f */
    public int f134744f;

    /* renamed from: g */
    public boolean f134745g;

    /* renamed from: h */
    public boolean f134746h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49727hn0)) {
            return false;
        }
        C49727hn0 hn02 = (C49727hn0) aVar;
        return C46238a.m51546a(this.BaseResponse, hn02.BaseResponse) && C46238a.m51546a(this.f134742d, hn02.f134742d) && C46238a.m51546a(this.f134743e, hn02.f134743e) && C46238a.m51546a(Integer.valueOf(this.f134744f), Integer.valueOf(hn02.f134744f)) && C46238a.m51546a(Boolean.valueOf(this.f134745g), Boolean.valueOf(hn02.f134745g)) && C46238a.m51546a(Boolean.valueOf(this.f134746h), Boolean.valueOf(hn02.f134746h));
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
            C89349b bVar = this.f134742d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74320g(3, 8, this.f134743e);
            aVar.mo74318e(4, this.f134744f);
            aVar.mo74314a(5, this.f134745g);
            aVar.mo74314a(6, this.f134746h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f134742d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58680g(3, 8, this.f134743e) + C52418a.m58678e(4, this.f134744f) + C52418a.m58674a(5, this.f134745g) + C52418a.m58674a(6, this.f134746h);
        } else if (i == 2) {
            this.f134743e.clear();
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
            C49727hn0 hn02 = objArr[1];
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
                        hn02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hn02.f134742d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52013xs0 xs02 = new C52013xs0();
                        if (bArr2 != null && bArr2.length > 0) {
                            xs02.parseFrom(bArr2);
                        }
                        hn02.f134743e.add(xs02);
                    }
                    return 0;
                case 4:
                    hn02.f134744f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hn02.f134745g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    hn02.f134746h = aVar3.mo141625c(intValue);
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
            aVar.mo71655d(jSONObject, "last_buffer", this.f134742d, false);
            aVar.mo71655d(jSONObject, "app_msg_list", this.f134743e, false);
            aVar.mo71655d(jSONObject, "next_interval_ms", Integer.valueOf(this.f134744f), false);
            aVar.mo71655d(jSONObject, "has_new_msg", Boolean.valueOf(this.f134745g), false);
            aVar.mo71655d(jSONObject, "need_clear_msg", Boolean.valueOf(this.f134746h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

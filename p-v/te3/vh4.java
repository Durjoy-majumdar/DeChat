package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vh4 extends C47465a {

    /* renamed from: d */
    public String f185896d;

    /* renamed from: e */
    public String f185897e;

    /* renamed from: f */
    public LinkedList<C64467je0> f185898f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vh4)) {
            return false;
        }
        vh4 vh4 = (vh4) aVar;
        return C46238a.m51546a(this.f185896d, vh4.f185896d) && C46238a.m51546a(this.f185897e, vh4.f185897e) && C46238a.m51546a(this.f185898f, vh4.f185898f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185897e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f185898f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f185896d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185897e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f185898f);
        } else if (i == 2) {
            this.f185898f.clear();
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
            vh4 vh4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vh4.f185896d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vh4.f185897e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64467je0 je02 = new C64467je0();
                    if (bArr != null && bArr.length > 0) {
                        je02.parseFrom(bArr);
                    }
                    vh4.f185898f.add(je02);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f185896d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "feedbackDetailWording", str, false);
            aVar.mo71655d(jSONObject, "feedbackDetailUrl", this.f185897e, false);
            aVar.mo71655d(jSONObject, "feedbackItemList", this.f185898f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

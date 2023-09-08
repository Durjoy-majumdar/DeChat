package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w75 extends C47465a {

    /* renamed from: d */
    public String f143915d;

    /* renamed from: e */
    public String f143916e;

    /* renamed from: f */
    public String f143917f;

    /* renamed from: g */
    public LinkedList<C51309sw3> f143918g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w75)) {
            return false;
        }
        w75 w75 = (w75) aVar;
        return C46238a.m51546a(this.f143915d, w75.f143915d) && C46238a.m51546a(this.f143916e, w75.f143916e) && C46238a.m51546a(this.f143917f, w75.f143917f) && C46238a.m51546a(this.f143918g, w75.f143918g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143915d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143916e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143917f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 8, this.f143918g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f143915d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143916e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143917f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 8, this.f143918g);
        } else if (i == 2) {
            this.f143918g.clear();
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
            w75 w75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w75.f143915d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                w75.f143916e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                w75.f143917f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51309sw3 sw32 = new C51309sw3();
                    if (bArr != null && bArr.length > 0) {
                        sw32.parseFrom(bArr);
                    }
                    w75.f143918g.add(sw32);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f143915d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appid", str, false);
            aVar.mo71655d(jSONObject, "nick_name", this.f143916e, false);
            aVar.mo71655d(jSONObject, "icon_url", this.f143917f, false);
            aVar.mo71655d(jSONObject, "scope_item_list", this.f143918g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

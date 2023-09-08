package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class a85 extends C47465a {

    /* renamed from: d */
    public String f130371d;

    /* renamed from: e */
    public LinkedList<y75> f130372e = new LinkedList<>();

    /* renamed from: f */
    public int f130373f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a85)) {
            return false;
        }
        a85 a85 = (a85) aVar;
        return C46238a.m51546a(this.f130371d, a85.f130371d) && C46238a.m51546a(this.f130372e, a85.f130372e) && C46238a.m51546a(Integer.valueOf(this.f130373f), Integer.valueOf(a85.f130373f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130371d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f130372e);
            aVar.mo74318e(3, this.f130373f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f130371d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f130372e) + C52418a.m58678e(3, this.f130373f);
        } else if (i == 2) {
            this.f130372e.clear();
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
            a85 a85 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a85.f130371d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    y75 y75 = new y75();
                    if (bArr != null && bArr.length > 0) {
                        y75.parseFrom(bArr);
                    }
                    a85.f130372e.add(y75);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                a85.f130373f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f130371d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "username", str, false);
            aVar.mo71655d(jSONObject, "scope_item_list", this.f130372e, false);
            aVar.mo71655d(jSONObject, "update_time", Integer.valueOf(this.f130373f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v75 extends C47465a {

    /* renamed from: d */
    public w75 f143381d;

    /* renamed from: e */
    public LinkedList<w75> f143382e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v75)) {
            return false;
        }
        v75 v75 = (v75) aVar;
        return C46238a.m51546a(this.f143381d, v75.f143381d) && C46238a.m51546a(this.f143382e, v75.f143382e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            w75 w75 = this.f143381d;
            if (w75 != null) {
                aVar.mo74322i(1, w75.computeSize());
                this.f143381d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f143382e);
            return 0;
        } else if (i == 1) {
            w75 w752 = this.f143381d;
            if (w752 != null) {
                i2 = 0 + C52418a.m58682i(1, w752.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f143382e);
        } else if (i == 2) {
            this.f143382e.clear();
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
            v75 v75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    w75 w753 = new w75();
                    if (bArr != null && bArr.length > 0) {
                        w753.parseFrom(bArr);
                    }
                    v75.f143381d = w753;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    w75 w754 = new w75();
                    if (bArr2 != null && bArr2.length > 0) {
                        w754.parseFrom(bArr2);
                    }
                    v75.f143382e.add(w754);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            w75 w75 = this.f143381d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "wxa_item", w75, false);
            aVar.mo71655d(jSONObject, "plugin_item_list", this.f143382e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

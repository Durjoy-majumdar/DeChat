package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e85 extends C47465a {

    /* renamed from: d */
    public String f182940d;

    /* renamed from: e */
    public LinkedList<f85> f182941e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e85)) {
            return false;
        }
        e85 e85 = (e85) aVar;
        return C46238a.m51546a(this.f182940d, e85.f182940d) && C46238a.m51546a(this.f182941e, e85.f182941e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182940d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f182941e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f182940d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f182941e);
        } else if (i == 2) {
            this.f182941e.clear();
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
            e85 e85 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e85.f182940d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    f85 f85 = new f85();
                    if (bArr != null && bArr.length > 0) {
                        f85.parseFrom(bArr);
                    }
                    e85.f182941e.add(f85);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f182940d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "activityName", str, false);
            aVar.mo71655d(jSONObject, "layoutList", this.f182941e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qx */
public class C51024qx extends C47465a {

    /* renamed from: d */
    public int f140593d;

    /* renamed from: e */
    public LinkedList<C50886px> f140594e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51024qx)) {
            return false;
        }
        C51024qx qxVar = (C51024qx) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140593d), Integer.valueOf(qxVar.f140593d)) && C46238a.m51546a(this.f140594e, qxVar.f140594e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140593d);
            aVar.mo74320g(2, 8, this.f140594e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f140593d) + 0 + C52418a.m58680g(2, 8, this.f140594e);
        } else {
            if (i == 2) {
                this.f140594e.clear();
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
                C51024qx qxVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    qxVar.f140593d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50886px pxVar = new C50886px();
                        if (bArr != null && bArr.length > 0) {
                            pxVar.parseFrom(bArr);
                        }
                        qxVar.f140594e.add(pxVar);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f140593d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Count", valueOf, false);
            aVar.mo71655d(jSONObject, "List", this.f140594e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

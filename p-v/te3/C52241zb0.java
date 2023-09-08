package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zb0 */
public class C52241zb0 extends C47465a {

    /* renamed from: d */
    public pd4 f145785d;

    /* renamed from: e */
    public int f145786e;

    /* renamed from: f */
    public long f145787f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52241zb0)) {
            return false;
        }
        C52241zb0 zb02 = (C52241zb0) aVar;
        return C46238a.m51546a(this.f145785d, zb02.f145785d) && C46238a.m51546a(Integer.valueOf(this.f145786e), Integer.valueOf(zb02.f145786e)) && C46238a.m51546a(Long.valueOf(this.f145787f), Long.valueOf(zb02.f145787f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            pd4 pd4 = this.f145785d;
            if (pd4 != null) {
                aVar.mo74322i(1, pd4.computeSize());
                this.f145785d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f145786e);
            aVar.mo74321h(3, this.f145787f);
            return 0;
        } else if (i == 1) {
            pd4 pd42 = this.f145785d;
            if (pd42 != null) {
                i2 = 0 + C52418a.m58682i(1, pd42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145786e) + C52418a.m58681h(3, this.f145787f);
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
            C52241zb0 zb02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    pd4 pd43 = new pd4();
                    if (bArr != null && bArr.length > 0) {
                        pd43.parseFrom(bArr);
                    }
                    zb02.f145785d = pd43;
                }
                return 0;
            } else if (intValue == 2) {
                zb02.f145786e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                zb02.f145787f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            pd4 pd4 = this.f145785d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Item", pd4, false);
            aVar.mo71655d(jSONObject, "Index", Integer.valueOf(this.f145786e), false);
            aVar.mo71655d(jSONObject, "SearchId", Long.valueOf(this.f145787f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

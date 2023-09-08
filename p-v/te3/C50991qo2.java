package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qo2 */
public class C50991qo2 extends C47465a {

    /* renamed from: d */
    public long f140438d;

    /* renamed from: e */
    public LinkedList<C51977xi> f140439e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50991qo2)) {
            return false;
        }
        C50991qo2 qo22 = (C50991qo2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140438d), Long.valueOf(qo22.f140438d)) && C46238a.m51546a(this.f140439e, qo22.f140439e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140438d);
            aVar.mo74320g(2, 8, this.f140439e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f140438d) + 0 + C52418a.m58680g(2, 8, this.f140439e);
        } else {
            if (i == 2) {
                this.f140439e.clear();
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
                C50991qo2 qo22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    qo22.f140438d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51977xi xiVar = new C51977xi();
                        if (bArr != null && bArr.length > 0) {
                            xiVar.parseFrom(bArr);
                        }
                        qo22.f140439e.add(xiVar);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f140438d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "live_id", valueOf, false);
            aVar.mo71655d(jSONObject, "boxContextList", this.f140439e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class t25 extends C47465a {

    /* renamed from: d */
    public long f185477d;

    /* renamed from: e */
    public C64342ej f185478e;

    /* renamed from: f */
    public int f185479f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t25)) {
            return false;
        }
        t25 t25 = (t25) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185477d), Long.valueOf(t25.f185477d)) && C46238a.m51546a(this.f185478e, t25.f185478e) && C46238a.m51546a(Integer.valueOf(this.f185479f), Integer.valueOf(t25.f185479f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185477d);
            C64342ej ejVar = this.f185478e;
            if (ejVar != null) {
                aVar.mo74322i(2, ejVar.computeSize());
                this.f185478e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f185479f);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f185477d) + 0;
            C64342ej ejVar2 = this.f185478e;
            if (ejVar2 != null) {
                h += C52418a.m58682i(2, ejVar2.computeSize());
            }
            return h + C52418a.m58678e(3, this.f185479f);
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
            t25 t25 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t25.f185477d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64342ej ejVar3 = new C64342ej();
                    if (bArr != null && bArr.length > 0) {
                        ejVar3.parseFrom(bArr);
                    }
                    t25.f185478e = ejVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t25.f185479f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f185477d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ctrl_type", valueOf, false);
            aVar.mo71655d(jSONObject, "widget_url_info", this.f185478e, false);
            aVar.mo71655d(jSONObject, "publiclibversion", Integer.valueOf(this.f185479f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

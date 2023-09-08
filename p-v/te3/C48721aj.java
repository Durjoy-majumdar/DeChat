package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aj */
public class C48721aj extends C47465a {

    /* renamed from: d */
    public C50317lw0 f130560d;

    /* renamed from: e */
    public C89349b f130561e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48721aj)) {
            return false;
        }
        C48721aj ajVar = (C48721aj) aVar;
        return C46238a.m51546a(this.f130560d, ajVar.f130560d) && C46238a.m51546a(this.f130561e, ajVar.f130561e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50317lw0 lw02 = this.f130560d;
            if (lw02 != null) {
                aVar.mo74322i(1, lw02.computeSize());
                this.f130560d.writeFields(aVar);
            }
            C89349b bVar = this.f130561e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            C50317lw0 lw03 = this.f130560d;
            if (lw03 != null) {
                i2 = 0 + C52418a.m58682i(1, lw03.computeSize());
            }
            C89349b bVar2 = this.f130561e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
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
            C48721aj ajVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50317lw0 lw04 = new C50317lw0();
                    if (bArr != null && bArr.length > 0) {
                        lw04.parseFrom(bArr);
                    }
                    ajVar.f130560d = lw04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ajVar.f130561e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C50317lw0 lw02 = this.f130560d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "box_id", lw02, false);
            aVar.mo71655d(jSONObject, "last_buffer", this.f130561e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

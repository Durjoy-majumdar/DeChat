package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bj */
public class C48862bj extends C47465a {

    /* renamed from: d */
    public C50317lw0 f131138d;

    /* renamed from: e */
    public boolean f131139e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48862bj)) {
            return false;
        }
        C48862bj bjVar = (C48862bj) aVar;
        return C46238a.m51546a(this.f131138d, bjVar.f131138d) && C46238a.m51546a(Boolean.valueOf(this.f131139e), Boolean.valueOf(bjVar.f131139e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50317lw0 lw02 = this.f131138d;
            if (lw02 != null) {
                aVar.mo74322i(1, lw02.computeSize());
                this.f131138d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f131139e);
            return 0;
        } else if (i == 1) {
            C50317lw0 lw03 = this.f131138d;
            if (lw03 != null) {
                i2 = 0 + C52418a.m58682i(1, lw03.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f131139e);
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
            C48862bj bjVar = objArr[1];
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
                    bjVar.f131138d = lw04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bjVar.f131139e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C50317lw0 lw02 = this.f131138d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "box_id", lw02, false);
            aVar.mo71655d(jSONObject, "has_unread_msg", Boolean.valueOf(this.f131139e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

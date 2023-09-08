package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.za3 */
public class C64875za3 extends C47465a {

    /* renamed from: d */
    public C48884bn2 f186649d;

    /* renamed from: e */
    public C64816wv f186650e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64875za3)) {
            return false;
        }
        C64875za3 za32 = (C64875za3) aVar;
        return C46238a.m51546a(this.f186649d, za32.f186649d) && C46238a.m51546a(this.f186650e, za32.f186650e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48884bn2 bn22 = this.f186649d;
            if (bn22 != null) {
                aVar.mo74322i(1, bn22.computeSize());
                this.f186649d.writeFields(aVar);
            }
            C64816wv wvVar = this.f186650e;
            if (wvVar != null) {
                aVar.mo74322i(2, wvVar.computeSize());
                this.f186650e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48884bn2 bn23 = this.f186649d;
            if (bn23 != null) {
                i2 = 0 + C52418a.m58682i(1, bn23.computeSize());
            }
            C64816wv wvVar2 = this.f186650e;
            return wvVar2 != null ? i2 + C52418a.m58682i(2, wvVar2.computeSize()) : i2;
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
            C64875za3 za32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48884bn2 bn24 = new C48884bn2();
                    if (bArr != null && bArr.length > 0) {
                        bn24.parseFrom(bArr);
                    }
                    za32.f186649d = bn24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64816wv wvVar3 = new C64816wv();
                    if (bArr2 != null && bArr2.length > 0) {
                        wvVar3.parseFrom(bArr2);
                    }
                    za32.f186650e = wvVar3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C48884bn2 bn22 = this.f186649d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Location", bn22, false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f186650e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

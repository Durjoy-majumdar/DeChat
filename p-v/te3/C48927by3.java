package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.by3 */
public class C48927by3 extends C47465a {

    /* renamed from: d */
    public long f131390d;

    /* renamed from: e */
    public String f131391e;

    /* renamed from: f */
    public C48884bn2 f131392f;

    /* renamed from: g */
    public int f131393g;

    /* renamed from: h */
    public LinkedList<zo4> f131394h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48927by3)) {
            return false;
        }
        C48927by3 by32 = (C48927by3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131390d), Long.valueOf(by32.f131390d)) && C46238a.m51546a(this.f131391e, by32.f131391e) && C46238a.m51546a(this.f131392f, by32.f131392f) && C46238a.m51546a(Integer.valueOf(this.f131393g), Integer.valueOf(by32.f131393g)) && C46238a.m51546a(this.f131394h, by32.f131394h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131391e != null) {
                aVar.mo74321h(1, this.f131390d);
                String str = this.f131391e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C48884bn2 bn22 = this.f131392f;
                if (bn22 != null) {
                    aVar.mo74322i(3, bn22.computeSize());
                    this.f131392f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f131393g);
                aVar.mo74320g(5, 8, this.f131394h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131390d) + 0;
            String str2 = this.f131391e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            C48884bn2 bn23 = this.f131392f;
            if (bn23 != null) {
                h += C52418a.m58682i(3, bn23.computeSize());
            }
            return h + C52418a.m58678e(4, this.f131393g) + C52418a.m58680g(5, 8, this.f131394h);
        } else if (i == 2) {
            this.f131394h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131391e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48927by3 by32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                by32.f131390d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                by32.f131391e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48884bn2 bn24 = new C48884bn2();
                    if (bArr != null && bArr.length > 0) {
                        bn24.parseFrom(bArr);
                    }
                    by32.f131392f = bn24;
                }
                return 0;
            } else if (intValue == 4) {
                by32.f131393g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    zo4 zo4 = new zo4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zo4.parseFrom(bArr2);
                    }
                    by32.f131394h.add(zo4);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f131390d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BusinessType", valueOf, false);
            aVar.mo71655d(jSONObject, "KeyWord", this.f131391e, false);
            aVar.mo71655d(jSONObject, "Location", this.f131392f, false);
            aVar.mo71655d(jSONObject, "RequestSrc", Integer.valueOf(this.f131393g), false);
            aVar.mo71655d(jSONObject, "MatchUserList", this.f131394h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

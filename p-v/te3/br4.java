package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class br4 extends C47465a {

    /* renamed from: d */
    public int f131278d;

    /* renamed from: e */
    public C51273so f131279e;

    /* renamed from: f */
    public C51273so f131280f;

    /* renamed from: g */
    public int f131281g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof br4)) {
            return false;
        }
        br4 br4 = (br4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131278d), Integer.valueOf(br4.f131278d)) && C46238a.m51546a(this.f131279e, br4.f131279e) && C46238a.m51546a(this.f131280f, br4.f131280f) && C46238a.m51546a(Integer.valueOf(this.f131281g), Integer.valueOf(br4.f131281g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131278d);
            C51273so soVar = this.f131279e;
            if (soVar != null) {
                aVar.mo74322i(4, soVar.computeSize());
                this.f131279e.writeFields(aVar);
            }
            C51273so soVar2 = this.f131280f;
            if (soVar2 != null) {
                aVar.mo74322i(5, soVar2.computeSize());
                this.f131280f.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f131281g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131278d) + 0;
            C51273so soVar3 = this.f131279e;
            if (soVar3 != null) {
                e += C52418a.m58682i(4, soVar3.computeSize());
            }
            C51273so soVar4 = this.f131280f;
            if (soVar4 != null) {
                e += C52418a.m58682i(5, soVar4.computeSize());
            }
            return e + C52418a.m58678e(6, this.f131281g);
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
            br4 br4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                br4.f131278d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51273so soVar5 = new C51273so();
                    if (bArr != null && bArr.length > 0) {
                        soVar5.parseFrom(bArr);
                    }
                    br4.f131279e = soVar5;
                }
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51273so soVar6 = new C51273so();
                    if (bArr2 != null && bArr2.length > 0) {
                        soVar6.parseFrom(bArr2);
                    }
                    br4.f131280f = soVar6;
                }
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                br4.f131281g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f131278d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "CdnScene", valueOf, false);
            aVar.mo71655d(jSONObject, "CtnInfo", this.f131279e, false);
            aVar.mo71655d(jSONObject, "MpInfo", this.f131280f, false);
            aVar.mo71655d(jSONObject, "CdnSourceType", Integer.valueOf(this.f131281g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

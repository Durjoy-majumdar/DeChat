package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class f05 extends C47465a {

    /* renamed from: d */
    public C49613gu3 f133221d;

    /* renamed from: e */
    public String f133222e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof f05)) {
            return false;
        }
        f05 f05 = (f05) aVar;
        return C46238a.m51546a(this.f133221d, f05.f133221d) && C46238a.m51546a(this.f133222e, f05.f133222e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49613gu3 gu32 = this.f133221d;
            if (gu32 != null) {
                aVar.mo74322i(1, gu32.computeSize());
                this.f133221d.writeFields(aVar);
            }
            String str = this.f133222e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C49613gu3 gu33 = this.f133221d;
            if (gu33 != null) {
                i2 = 0 + C52418a.m58682i(1, gu33.computeSize());
            }
            String str2 = this.f133222e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            f05 f05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49613gu3 gu34 = new C49613gu3();
                    if (bArr != null && bArr.length > 0) {
                        gu34.parseFrom(bArr);
                    }
                    f05.f133221d = gu34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                f05.f133222e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49613gu3 gu32 = this.f133221d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "CommContent", gu32, false);
            aVar.mo71655d(jSONObject, "UserName", this.f133222e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

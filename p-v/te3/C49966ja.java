package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ja */
public class C49966ja extends C47465a {

    /* renamed from: d */
    public int f135955d;

    /* renamed from: e */
    public C51163rv3 f135956e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49966ja)) {
            return false;
        }
        C49966ja jaVar = (C49966ja) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135955d), Integer.valueOf(jaVar.f135955d)) && C46238a.m51546a(this.f135956e, jaVar.f135956e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135955d);
            C51163rv3 rv32 = this.f135956e;
            if (rv32 != null) {
                aVar.mo74322i(2, rv32.computeSize());
                this.f135956e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135955d) + 0;
            C51163rv3 rv33 = this.f135956e;
            return rv33 != null ? e + C52418a.m58682i(2, rv33.computeSize()) : e;
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
            C49966ja jaVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jaVar.f135955d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    jaVar.f135956e = rv34;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f135955d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Ret", valueOf, false);
            aVar.mo71655d(jSONObject, "ErrMsg", this.f135956e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

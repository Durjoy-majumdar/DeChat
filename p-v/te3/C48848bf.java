package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bf */
public class C48848bf extends C47465a {

    /* renamed from: d */
    public C49275ef f131073d;

    /* renamed from: e */
    public String f131074e;

    /* renamed from: f */
    public String f131075f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48848bf)) {
            return false;
        }
        C48848bf bfVar = (C48848bf) aVar;
        return C46238a.m51546a(this.f131073d, bfVar.f131073d) && C46238a.m51546a(this.f131074e, bfVar.f131074e) && C46238a.m51546a(this.f131075f, bfVar.f131075f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49275ef efVar = this.f131073d;
            if (efVar != null) {
                aVar.mo74322i(1, efVar.computeSize());
                this.f131073d.writeFields(aVar);
            }
            String str = this.f131074e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131075f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            C49275ef efVar2 = this.f131073d;
            if (efVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, efVar2.computeSize());
            }
            String str3 = this.f131074e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f131075f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C48848bf bfVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49275ef efVar3 = new C49275ef();
                    if (bArr != null && bArr.length > 0) {
                        efVar3.parseFrom(bArr);
                    }
                    bfVar.f131073d = efVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bfVar.f131074e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bfVar.f131075f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

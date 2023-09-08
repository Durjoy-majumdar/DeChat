package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ud */
public class C51528ud extends C47465a {

    /* renamed from: d */
    public C51378td f142778d;

    /* renamed from: e */
    public int f142779e;

    /* renamed from: f */
    public String f142780f;

    /* renamed from: g */
    public String f142781g;

    /* renamed from: h */
    public LinkedList<C51378td> f142782h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51528ud)) {
            return false;
        }
        C51528ud udVar = (C51528ud) aVar;
        return C46238a.m51546a(this.f142778d, udVar.f142778d) && C46238a.m51546a(Integer.valueOf(this.f142779e), Integer.valueOf(udVar.f142779e)) && C46238a.m51546a(this.f142780f, udVar.f142780f) && C46238a.m51546a(this.f142781g, udVar.f142781g) && C46238a.m51546a(this.f142782h, udVar.f142782h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51378td tdVar = this.f142778d;
            if (tdVar != null) {
                aVar.mo74322i(1, tdVar.computeSize());
                this.f142778d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f142779e);
            String str = this.f142780f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f142781g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74320g(5, 8, this.f142782h);
            return 0;
        } else if (i == 1) {
            C51378td tdVar2 = this.f142778d;
            if (tdVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, tdVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142779e);
            String str3 = this.f142780f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f142781g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58680g(5, 8, this.f142782h);
        } else if (i == 2) {
            this.f142782h.clear();
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
            C51528ud udVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51378td tdVar3 = new C51378td();
                    if (bArr != null && bArr.length > 0) {
                        tdVar3.parseFrom(bArr);
                    }
                    udVar.f142778d = tdVar3;
                }
                return 0;
            } else if (intValue == 2) {
                udVar.f142779e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                udVar.f142780f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                udVar.f142781g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51378td tdVar4 = new C51378td();
                    if (bArr2 != null && bArr2.length > 0) {
                        tdVar4.parseFrom(bArr2);
                    }
                    udVar.f142782h.add(tdVar4);
                }
                return 0;
            }
        }
    }
}

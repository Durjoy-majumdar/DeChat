package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.d */
public class C47561d extends C47465a {

    /* renamed from: d */
    public C47589h f127629d;

    /* renamed from: e */
    public String f127630e;

    /* renamed from: f */
    public String f127631f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47561d)) {
            return false;
        }
        C47561d dVar = (C47561d) aVar;
        return C46238a.m51546a(this.f127629d, dVar.f127629d) && C46238a.m51546a(this.f127630e, dVar.f127630e) && C46238a.m51546a(this.f127631f, dVar.f127631f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127630e != null) {
                C47589h hVar = this.f127629d;
                if (hVar != null) {
                    aVar.mo74322i(1, hVar.computeSize());
                    this.f127629d.writeFields(aVar);
                }
                String str = this.f127630e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f127631f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AdURL");
        } else if (i == 1) {
            C47589h hVar2 = this.f127629d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            String str3 = this.f127630e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f127631f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127630e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AdURL");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47561d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47589h hVar3 = new C47589h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    dVar.f127629d = hVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dVar.f127630e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                dVar.f127631f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q */
public class C47652q extends C47465a {

    /* renamed from: d */
    public String f127933d;

    /* renamed from: e */
    public int f127934e;

    /* renamed from: f */
    public C47554c f127935f;

    /* renamed from: g */
    public C47650p4 f127936g;

    /* renamed from: h */
    public int f127937h;

    /* renamed from: i */
    public String f127938i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47652q)) {
            return false;
        }
        C47652q qVar = (C47652q) aVar;
        return C46238a.m51546a(this.f127933d, qVar.f127933d) && C46238a.m51546a(Integer.valueOf(this.f127934e), Integer.valueOf(qVar.f127934e)) && C46238a.m51546a(this.f127935f, qVar.f127935f) && C46238a.m51546a(this.f127936g, qVar.f127936g) && C46238a.m51546a(Integer.valueOf(this.f127937h), Integer.valueOf(qVar.f127937h)) && C46238a.m51546a(this.f127938i, qVar.f127938i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127933d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f127934e);
            C47554c cVar = this.f127935f;
            if (cVar != null) {
                aVar.mo74322i(3, cVar.computeSize());
                this.f127935f.writeFields(aVar);
            }
            C47650p4 p4Var = this.f127936g;
            if (p4Var != null) {
                aVar.mo74322i(4, p4Var.computeSize());
                this.f127936g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f127937h);
            String str2 = this.f127938i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f127933d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f127934e);
            C47554c cVar2 = this.f127935f;
            if (cVar2 != null) {
                e += C52418a.m58682i(3, cVar2.computeSize());
            }
            C47650p4 p4Var2 = this.f127936g;
            if (p4Var2 != null) {
                e += C52418a.m58682i(4, p4Var2.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f127937h);
            String str4 = this.f127938i;
            return str4 != null ? e2 + C52418a.m58683j(6, str4) : e2;
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
            C47652q qVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qVar.f127933d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qVar.f127934e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47554c cVar3 = new C47554c();
                        if (bArr != null && bArr.length > 0) {
                            cVar3.parseFrom(bArr);
                        }
                        qVar.f127935f = cVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47650p4 p4Var3 = new C47650p4();
                        if (bArr2 != null && bArr2.length > 0) {
                            p4Var3.parseFrom(bArr2);
                        }
                        qVar.f127936g = p4Var3;
                    }
                    return 0;
                case 5:
                    qVar.f127937h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qVar.f127938i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

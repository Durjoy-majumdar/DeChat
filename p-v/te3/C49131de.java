package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.de */
public class C49131de extends C101820nt3 {

    /* renamed from: d */
    public long f132259d;

    /* renamed from: e */
    public String f132260e;

    /* renamed from: f */
    public String f132261f;

    /* renamed from: g */
    public long f132262g;

    /* renamed from: h */
    public int f132263h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49131de)) {
            return false;
        }
        C49131de deVar = (C49131de) aVar;
        return C46238a.m51546a(this.BaseRequest, deVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f132259d), Long.valueOf(deVar.f132259d)) && C46238a.m51546a(this.f132260e, deVar.f132260e) && C46238a.m51546a(this.f132261f, deVar.f132261f) && C46238a.m51546a(Long.valueOf(this.f132262g), Long.valueOf(deVar.f132262g)) && C46238a.m51546a(Integer.valueOf(this.f132263h), Integer.valueOf(deVar.f132263h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f132259d);
            String str = this.f132260e;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f132261f;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(18, this.f132262g);
            aVar.mo74318e(22, this.f132263h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f132259d);
            String str3 = this.f132260e;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            String str4 = this.f132261f;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            return h + C52418a.m58681h(18, this.f132262g) + C52418a.m58678e(22, this.f132263h);
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
            C49131de deVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    deVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                deVar.f132259d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                deVar.f132260e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                deVar.f132261f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 18) {
                deVar.f132262g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 22) {
                return -1;
            } else {
                deVar.f132263h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

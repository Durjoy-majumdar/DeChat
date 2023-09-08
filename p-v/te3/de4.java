package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class de4 extends C47465a {

    /* renamed from: d */
    public int f132271d;

    /* renamed from: e */
    public int f132272e;

    /* renamed from: f */
    public String f132273f;

    /* renamed from: g */
    public C51492u40 f132274g;

    /* renamed from: h */
    public C51492u40 f132275h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof de4)) {
            return false;
        }
        de4 de4 = (de4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132271d), Integer.valueOf(de4.f132271d)) && C46238a.m51546a(Integer.valueOf(this.f132272e), Integer.valueOf(de4.f132272e)) && C46238a.m51546a(this.f132273f, de4.f132273f) && C46238a.m51546a(this.f132274g, de4.f132274g) && C46238a.m51546a(this.f132275h, de4.f132275h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132271d);
            aVar.mo74318e(2, this.f132272e);
            String str = this.f132273f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51492u40 u402 = this.f132274g;
            if (u402 != null) {
                aVar.mo74322i(4, u402.computeSize());
                this.f132274g.writeFields(aVar);
            }
            C51492u40 u403 = this.f132275h;
            if (u403 != null) {
                aVar.mo74322i(5, u403.computeSize());
                this.f132275h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132271d) + 0 + C52418a.m58678e(2, this.f132272e);
            String str2 = this.f132273f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51492u40 u404 = this.f132274g;
            if (u404 != null) {
                e += C52418a.m58682i(4, u404.computeSize());
            }
            C51492u40 u405 = this.f132275h;
            return u405 != null ? e + C52418a.m58682i(5, u405.computeSize()) : e;
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
            de4 de4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                de4.f132271d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                de4.f132272e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                de4.f132273f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51492u40 u406 = new C51492u40();
                    if (bArr != null && bArr.length > 0) {
                        u406.parseFrom(bArr);
                    }
                    de4.f132274g = u406;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51492u40 u407 = new C51492u40();
                    if (bArr2 != null && bArr2.length > 0) {
                        u407.parseFrom(bArr2);
                    }
                    de4.f132275h = u407;
                }
                return 0;
            }
        }
    }
}

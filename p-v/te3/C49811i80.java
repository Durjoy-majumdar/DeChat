package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i80 */
public class C49811i80 extends C47465a {

    /* renamed from: d */
    public int f135159d;

    /* renamed from: e */
    public String f135160e;

    /* renamed from: f */
    public C49670h80 f135161f;

    /* renamed from: g */
    public String f135162g;

    /* renamed from: h */
    public C50795p80 f135163h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49811i80)) {
            return false;
        }
        C49811i80 i802 = (C49811i80) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135159d), Integer.valueOf(i802.f135159d)) && C46238a.m51546a(this.f135160e, i802.f135160e) && C46238a.m51546a(this.f135161f, i802.f135161f) && C46238a.m51546a(this.f135162g, i802.f135162g) && C46238a.m51546a(this.f135163h, i802.f135163h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135159d);
            String str = this.f135160e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49670h80 h802 = this.f135161f;
            if (h802 != null) {
                aVar.mo74322i(3, h802.computeSize());
                this.f135161f.writeFields(aVar);
            }
            String str2 = this.f135162g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C50795p80 p802 = this.f135163h;
            if (p802 != null) {
                aVar.mo74322i(5, p802.computeSize());
                this.f135163h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135159d) + 0;
            String str3 = this.f135160e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            C49670h80 h803 = this.f135161f;
            if (h803 != null) {
                e += C52418a.m58682i(3, h803.computeSize());
            }
            String str4 = this.f135162g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C50795p80 p803 = this.f135163h;
            return p803 != null ? e + C52418a.m58682i(5, p803.computeSize()) : e;
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
            C49811i80 i802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i802.f135159d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                i802.f135160e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49670h80 h804 = new C49670h80();
                    if (bArr != null && bArr.length > 0) {
                        h804.parseFrom(bArr);
                    }
                    i802.f135161f = h804;
                }
                return 0;
            } else if (intValue == 4) {
                i802.f135162g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50795p80 p804 = new C50795p80();
                    if (bArr2 != null && bArr2.length > 0) {
                        p804.parseFrom(bArr2);
                    }
                    i802.f135163h = p804;
                }
                return 0;
            }
        }
    }
}

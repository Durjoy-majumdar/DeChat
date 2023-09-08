package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xj3 */
public class C118479xj3 extends C47465a {

    /* renamed from: d */
    public String f354532d;

    /* renamed from: e */
    public int f354533e;

    /* renamed from: f */
    public String f354534f;

    /* renamed from: g */
    public C64761ux2 f354535g;

    /* renamed from: h */
    public C118461r00 f354536h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118479xj3)) {
            return false;
        }
        C118479xj3 xj32 = (C118479xj3) aVar;
        return C46238a.m51546a(this.f354532d, xj32.f354532d) && C46238a.m51546a(Integer.valueOf(this.f354533e), Integer.valueOf(xj32.f354533e)) && C46238a.m51546a(this.f354534f, xj32.f354534f) && C46238a.m51546a(this.f354535g, xj32.f354535g) && C46238a.m51546a(this.f354536h, xj32.f354536h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354532d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f354533e);
            String str2 = this.f354534f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C64761ux2 ux22 = this.f354535g;
            if (ux22 != null) {
                aVar.mo74322i(4, ux22.computeSize());
                this.f354535g.writeFields(aVar);
            }
            C118461r00 r002 = this.f354536h;
            if (r002 != null) {
                aVar.mo74322i(5, r002.computeSize());
                this.f354536h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f354532d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f354533e);
            String str4 = this.f354534f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            C64761ux2 ux23 = this.f354535g;
            if (ux23 != null) {
                e += C52418a.m58682i(4, ux23.computeSize());
            }
            C118461r00 r003 = this.f354536h;
            return r003 != null ? e + C52418a.m58682i(5, r003.computeSize()) : e;
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
            C118479xj3 xj32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xj32.f354532d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xj32.f354533e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xj32.f354534f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64761ux2 ux24 = new C64761ux2();
                    if (bArr != null && bArr.length > 0) {
                        ux24.parseFrom(bArr);
                    }
                    xj32.f354535g = ux24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118461r00 r004 = new C118461r00();
                    if (bArr2 != null && bArr2.length > 0) {
                        r004.parseFrom(bArr2);
                    }
                    xj32.f354536h = r004;
                }
                return 0;
            }
        }
    }
}

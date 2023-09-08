package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r00 */
public class C118461r00 extends C47465a {

    /* renamed from: d */
    public String f354294d;

    /* renamed from: e */
    public C118479xj3 f354295e;

    /* renamed from: f */
    public C118479xj3 f354296f;

    /* renamed from: g */
    public int f354297g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118461r00)) {
            return false;
        }
        C118461r00 r002 = (C118461r00) aVar;
        return C46238a.m51546a(this.f354294d, r002.f354294d) && C46238a.m51546a(this.f354295e, r002.f354295e) && C46238a.m51546a(this.f354296f, r002.f354296f) && C46238a.m51546a(Integer.valueOf(this.f354297g), Integer.valueOf(r002.f354297g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354294d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C118479xj3 xj32 = this.f354295e;
            if (xj32 != null) {
                aVar.mo74322i(2, xj32.computeSize());
                this.f354295e.writeFields(aVar);
            }
            C118479xj3 xj33 = this.f354296f;
            if (xj33 != null) {
                aVar.mo74322i(3, xj33.computeSize());
                this.f354296f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f354297g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f354294d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C118479xj3 xj34 = this.f354295e;
            if (xj34 != null) {
                i2 += C52418a.m58682i(2, xj34.computeSize());
            }
            C118479xj3 xj35 = this.f354296f;
            if (xj35 != null) {
                i2 += C52418a.m58682i(3, xj35.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f354297g);
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
            C118461r00 r002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r002.f354294d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118479xj3 xj36 = new C118479xj3();
                    if (bArr != null && bArr.length > 0) {
                        xj36.parseFrom(bArr);
                    }
                    r002.f354295e = xj36;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118479xj3 xj37 = new C118479xj3();
                    if (bArr2 != null && bArr2.length > 0) {
                        xj37.parseFrom(bArr2);
                    }
                    r002.f354296f = xj37;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r002.f354297g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

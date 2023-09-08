package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mb3 */
public class C64551mb3 extends C47465a {

    /* renamed from: d */
    public int f184273d;

    /* renamed from: e */
    public int f184274e;

    /* renamed from: f */
    public C51018qv3 f184275f;

    /* renamed from: g */
    public int f184276g;

    /* renamed from: h */
    public C51018qv3 f184277h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64551mb3)) {
            return false;
        }
        C64551mb3 mb32 = (C64551mb3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184273d), Integer.valueOf(mb32.f184273d)) && C46238a.m51546a(Integer.valueOf(this.f184274e), Integer.valueOf(mb32.f184274e)) && C46238a.m51546a(this.f184275f, mb32.f184275f) && C46238a.m51546a(Integer.valueOf(this.f184276g), Integer.valueOf(mb32.f184276g)) && C46238a.m51546a(this.f184277h, mb32.f184277h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184273d);
            aVar.mo74318e(2, this.f184274e);
            C51018qv3 qv32 = this.f184275f;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f184275f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f184276g);
            C51018qv3 qv33 = this.f184277h;
            if (qv33 != null) {
                aVar.mo74322i(5, qv33.computeSize());
                this.f184277h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184273d) + 0 + C52418a.m58678e(2, this.f184274e);
            C51018qv3 qv34 = this.f184275f;
            if (qv34 != null) {
                e += C52418a.m58682i(3, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f184276g);
            C51018qv3 qv35 = this.f184277h;
            return qv35 != null ? e2 + C52418a.m58682i(5, qv35.computeSize()) : e2;
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
            C64551mb3 mb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mb32.f184273d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mb32.f184274e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv36.mo73348f(bArr);
                    }
                    mb32.f184275f = qv36;
                }
                return 0;
            } else if (intValue == 4) {
                mb32.f184276g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv37.mo73348f(bArr2);
                    }
                    mb32.f184277h = qv37;
                }
                return 0;
            }
        }
    }
}

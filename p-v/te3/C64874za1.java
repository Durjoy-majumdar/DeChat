package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.za1 */
public class C64874za1 extends C47465a {

    /* renamed from: d */
    public C64460j21 f186646d;

    /* renamed from: e */
    public C64460j21 f186647e;

    /* renamed from: f */
    public String f186648f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64874za1)) {
            return false;
        }
        C64874za1 za12 = (C64874za1) aVar;
        return C46238a.m51546a(this.f186646d, za12.f186646d) && C46238a.m51546a(this.f186647e, za12.f186647e) && C46238a.m51546a(this.f186648f, za12.f186648f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64460j21 j212 = this.f186646d;
            if (j212 != null) {
                aVar.mo74322i(1, j212.computeSize());
                this.f186646d.writeFields(aVar);
            }
            C64460j21 j213 = this.f186647e;
            if (j213 != null) {
                aVar.mo74322i(2, j213.computeSize());
                this.f186647e.writeFields(aVar);
            }
            String str = this.f186648f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C64460j21 j214 = this.f186646d;
            if (j214 != null) {
                i2 = 0 + C52418a.m58682i(1, j214.computeSize());
            }
            C64460j21 j215 = this.f186647e;
            if (j215 != null) {
                i2 += C52418a.m58682i(2, j215.computeSize());
            }
            String str2 = this.f186648f;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C64874za1 za12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64460j21 j216 = new C64460j21();
                    if (bArr != null && bArr.length > 0) {
                        j216.parseFrom(bArr);
                    }
                    za12.f186646d = j216;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64460j21 j217 = new C64460j21();
                    if (bArr2 != null && bArr2.length > 0) {
                        j217.parseFrom(bArr2);
                    }
                    za12.f186647e = j217;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                za12.f186648f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

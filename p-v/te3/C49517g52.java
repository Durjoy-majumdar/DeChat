package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g52 */
public class C49517g52 extends C47465a {

    /* renamed from: d */
    public C49382f52 f133865d;

    /* renamed from: e */
    public int f133866e;

    /* renamed from: f */
    public C49237e52 f133867f;

    /* renamed from: g */
    public C89349b f133868g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49517g52)) {
            return false;
        }
        C49517g52 g522 = (C49517g52) aVar;
        return C46238a.m51546a(this.f133865d, g522.f133865d) && C46238a.m51546a(Integer.valueOf(this.f133866e), Integer.valueOf(g522.f133866e)) && C46238a.m51546a(this.f133867f, g522.f133867f) && C46238a.m51546a(this.f133868g, g522.f133868g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49382f52 f522 = this.f133865d;
            if (f522 != null) {
                aVar.mo74322i(1, f522.computeSize());
                this.f133865d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133866e);
            C49237e52 e522 = this.f133867f;
            if (e522 != null) {
                aVar.mo74322i(3, e522.computeSize());
                this.f133867f.writeFields(aVar);
            }
            C89349b bVar = this.f133868g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49382f52 f523 = this.f133865d;
            if (f523 != null) {
                i2 = 0 + C52418a.m58682i(1, f523.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133866e);
            C49237e52 e523 = this.f133867f;
            if (e523 != null) {
                e += C52418a.m58682i(3, e523.computeSize());
            }
            C89349b bVar2 = this.f133868g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C49517g52 g522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49382f52 f524 = new C49382f52();
                    if (bArr != null && bArr.length > 0) {
                        f524.parseFrom(bArr);
                    }
                    g522.f133865d = f524;
                }
                return 0;
            } else if (intValue == 2) {
                g522.f133866e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49237e52 e524 = new C49237e52();
                    if (bArr2 != null && bArr2.length > 0) {
                        e524.parseFrom(bArr2);
                    }
                    g522.f133867f = e524;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                g522.f133868g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

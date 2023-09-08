package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k00 */
public class C50059k00 extends C47465a {

    /* renamed from: d */
    public int f136486d;

    /* renamed from: e */
    public C50312lu3 f136487e;

    /* renamed from: f */
    public C50456mv3 f136488f;

    /* renamed from: g */
    public C50746ox f136489g;

    /* renamed from: h */
    public LinkedList<C50746ox> f136490h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50059k00)) {
            return false;
        }
        C50059k00 k002 = (C50059k00) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136486d), Integer.valueOf(k002.f136486d)) && C46238a.m51546a(this.f136487e, k002.f136487e) && C46238a.m51546a(this.f136488f, k002.f136488f) && C46238a.m51546a(this.f136489g, k002.f136489g) && C46238a.m51546a(this.f136490h, k002.f136490h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136486d);
            C50312lu3 lu32 = this.f136487e;
            if (lu32 != null) {
                aVar.mo74322i(2, lu32.computeSize());
                this.f136487e.writeFields(aVar);
            }
            C50456mv3 mv32 = this.f136488f;
            if (mv32 != null) {
                aVar.mo74322i(3, mv32.computeSize());
                this.f136488f.writeFields(aVar);
            }
            C50746ox oxVar = this.f136489g;
            if (oxVar != null) {
                aVar.mo74322i(4, oxVar.computeSize());
                this.f136489g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f136490h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136486d) + 0;
            C50312lu3 lu33 = this.f136487e;
            if (lu33 != null) {
                e += C52418a.m58682i(2, lu33.computeSize());
            }
            C50456mv3 mv33 = this.f136488f;
            if (mv33 != null) {
                e += C52418a.m58682i(3, mv33.computeSize());
            }
            C50746ox oxVar2 = this.f136489g;
            if (oxVar2 != null) {
                e += C52418a.m58682i(4, oxVar2.computeSize());
            }
            return e + C52418a.m58680g(5, 8, this.f136490h);
        } else if (i == 2) {
            this.f136490h.clear();
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
            C50059k00 k002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k002.f136486d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50312lu3 lu34 = new C50312lu3();
                    if (bArr != null && bArr.length > 0) {
                        lu34.parseFrom(bArr);
                    }
                    k002.f136487e = lu34;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        mv34.parseFrom(bArr2);
                    }
                    k002.f136488f = mv34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C50746ox oxVar3 = new C50746ox();
                    if (bArr3 != null && bArr3.length > 0) {
                        oxVar3.parseFrom(bArr3);
                    }
                    k002.f136489g = oxVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C50746ox oxVar4 = new C50746ox();
                    if (bArr4 != null && bArr4.length > 0) {
                        oxVar4.parseFrom(bArr4);
                    }
                    k002.f136490h.add(oxVar4);
                }
                return 0;
            }
        }
    }
}

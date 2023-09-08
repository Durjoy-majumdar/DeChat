package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j31 */
public class C49936j31 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50742ow0> f135840d = new LinkedList<>();

    /* renamed from: e */
    public C64323dq2 f135841e;

    /* renamed from: f */
    public int f135842f;

    /* renamed from: g */
    public String f135843g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49936j31)) {
            return false;
        }
        C49936j31 j312 = (C49936j31) aVar;
        return C46238a.m51546a(this.f135840d, j312.f135840d) && C46238a.m51546a(this.f135841e, j312.f135841e) && C46238a.m51546a(Integer.valueOf(this.f135842f), Integer.valueOf(j312.f135842f)) && C46238a.m51546a(this.f135843g, j312.f135843g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135840d);
            C64323dq2 dq22 = this.f135841e;
            if (dq22 != null) {
                aVar.mo74322i(2, dq22.computeSize());
                this.f135841e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f135842f);
            String str = this.f135843g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f135840d) + 0;
            C64323dq2 dq23 = this.f135841e;
            if (dq23 != null) {
                g += C52418a.m58682i(2, dq23.computeSize());
            }
            int e = g + C52418a.m58678e(3, this.f135842f);
            String str2 = this.f135843g;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f135840d.clear();
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
            C49936j31 j312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50742ow0 ow02 = new C50742ow0();
                    if (bArr != null && bArr.length > 0) {
                        ow02.parseFrom(bArr);
                    }
                    j312.f135840d.add(ow02);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64323dq2 dq24 = new C64323dq2();
                    if (bArr2 != null && bArr2.length > 0) {
                        dq24.parseFrom(bArr2);
                    }
                    j312.f135841e = dq24;
                }
                return 0;
            } else if (intValue == 3) {
                j312.f135842f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                j312.f135843g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sh0 */
public class C51243sh0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51108rh0> f141509d = new LinkedList<>();

    /* renamed from: e */
    public int f141510e;

    /* renamed from: f */
    public C89349b f141511f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51243sh0)) {
            return false;
        }
        C51243sh0 sh02 = (C51243sh0) aVar;
        return C46238a.m51546a(this.f141509d, sh02.f141509d) && C46238a.m51546a(Integer.valueOf(this.f141510e), Integer.valueOf(sh02.f141510e)) && C46238a.m51546a(this.f141511f, sh02.f141511f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141509d);
            aVar.mo74318e(2, this.f141510e);
            C89349b bVar = this.f141511f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141509d) + 0 + C52418a.m58678e(2, this.f141510e);
            C89349b bVar2 = this.f141511f;
            return bVar2 != null ? g + C52418a.m58675b(3, bVar2) : g;
        } else if (i == 2) {
            this.f141509d.clear();
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
            C51243sh0 sh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51108rh0 rh02 = new C51108rh0();
                    if (bArr != null && bArr.length > 0) {
                        rh02.parseFrom(bArr);
                    }
                    sh02.f141509d.add(rh02);
                }
                return 0;
            } else if (intValue == 2) {
                sh02.f141510e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sh02.f141511f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

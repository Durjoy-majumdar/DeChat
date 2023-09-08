package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qa1 */
public class C50934qa1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51215sa1> f140205d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f140206e;

    /* renamed from: f */
    public int f140207f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50934qa1)) {
            return false;
        }
        C50934qa1 qa12 = (C50934qa1) aVar;
        return C46238a.m51546a(this.f140205d, qa12.f140205d) && C46238a.m51546a(this.f140206e, qa12.f140206e) && C46238a.m51546a(Integer.valueOf(this.f140207f), Integer.valueOf(qa12.f140207f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f140205d);
            C89349b bVar = this.f140206e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f140207f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f140205d) + 0;
            C89349b bVar2 = this.f140206e;
            if (bVar2 != null) {
                g += C52418a.m58675b(2, bVar2);
            }
            return g + C52418a.m58678e(3, this.f140207f);
        } else if (i == 2) {
            this.f140205d.clear();
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
            C50934qa1 qa12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51215sa1 sa12 = new C51215sa1();
                    if (bArr != null && bArr.length > 0) {
                        sa12.parseFrom(bArr);
                    }
                    qa12.f140205d.add(sa12);
                }
                return 0;
            } else if (intValue == 2) {
                qa12.f140206e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qa12.f140207f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

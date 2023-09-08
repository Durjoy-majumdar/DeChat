package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ze2 */
public class C110976ze2 extends C47465a {

    /* renamed from: d */
    public C89349b f332381d;

    /* renamed from: e */
    public int f332382e;

    /* renamed from: f */
    public LinkedList<C110957bf2> f332383f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<Integer> f332384g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110976ze2)) {
            return false;
        }
        C110976ze2 ze22 = (C110976ze2) aVar;
        return C46238a.m51546a(this.f332381d, ze22.f332381d) && C46238a.m51546a(Integer.valueOf(this.f332382e), Integer.valueOf(ze22.f332382e)) && C46238a.m51546a(this.f332383f, ze22.f332383f) && C46238a.m51546a(this.f332384g, ze22.f332384g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f332381d;
            if (bVar != null) {
                if (bVar != null) {
                    aVar.mo74315b(1, bVar);
                }
                aVar.mo74318e(2, this.f332382e);
                aVar.mo74320g(3, 8, this.f332383f);
                aVar.mo74320g(4, 2, this.f332384g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: RawBuf");
        } else if (i == 1) {
            C89349b bVar2 = this.f332381d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58678e(2, this.f332382e) + C52418a.m58680g(3, 8, this.f332383f) + C52418a.m58680g(4, 2, this.f332384g);
        } else if (i == 2) {
            this.f332383f.clear();
            this.f332384g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f332381d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: RawBuf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C110976ze2 ze22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ze22.f332381d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                ze22.f332382e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C110957bf2 bf22 = new C110957bf2();
                    if (bArr != null && bArr.length > 0) {
                        bf22.parseFrom(bArr);
                    }
                    ze22.f332383f.add(bf22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ze22.f332384g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}

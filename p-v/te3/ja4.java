package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ja4 extends C47465a {

    /* renamed from: d */
    public LinkedList<ha4> f135970d = new LinkedList<>();

    /* renamed from: e */
    public int f135971e;

    /* renamed from: f */
    public int f135972f;

    /* renamed from: g */
    public C89349b f135973g;

    /* renamed from: h */
    public int f135974h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ja4)) {
            return false;
        }
        ja4 ja4 = (ja4) aVar;
        return C46238a.m51546a(this.f135970d, ja4.f135970d) && C46238a.m51546a(Integer.valueOf(this.f135971e), Integer.valueOf(ja4.f135971e)) && C46238a.m51546a(Integer.valueOf(this.f135972f), Integer.valueOf(ja4.f135972f)) && C46238a.m51546a(this.f135973g, ja4.f135973g) && C46238a.m51546a(Integer.valueOf(this.f135974h), Integer.valueOf(ja4.f135974h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135973g != null) {
                aVar.mo74320g(1, 8, this.f135970d);
                aVar.mo74318e(2, this.f135971e);
                aVar.mo74318e(3, this.f135972f);
                C89349b bVar = this.f135973g;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74318e(5, this.f135974h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ctx");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f135970d) + 0 + C52418a.m58678e(2, this.f135971e) + C52418a.m58678e(3, this.f135972f);
            C89349b bVar2 = this.f135973g;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            return g + C52418a.m58678e(5, this.f135974h);
        } else if (i == 2) {
            this.f135970d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135973g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ctx");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ja4 ja4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ha4 ha4 = new ha4();
                    if (bArr != null && bArr.length > 0) {
                        ha4.parseFrom(bArr);
                    }
                    ja4.f135970d.add(ha4);
                }
                return 0;
            } else if (intValue == 2) {
                ja4.f135971e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ja4.f135972f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ja4.f135973g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ja4.f135974h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

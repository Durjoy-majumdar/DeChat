package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.g */
public class C63396g extends C47465a {

    /* renamed from: d */
    public int f179847d;

    /* renamed from: e */
    public int f179848e;

    /* renamed from: f */
    public LinkedList<C63391b> f179849f = new LinkedList<>();

    /* renamed from: g */
    public C89349b f179850g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63396g)) {
            return false;
        }
        C63396g gVar = (C63396g) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179847d), Integer.valueOf(gVar.f179847d)) && C46238a.m51546a(Integer.valueOf(this.f179848e), Integer.valueOf(gVar.f179848e)) && C46238a.m51546a(this.f179849f, gVar.f179849f) && C46238a.m51546a(this.f179850g, gVar.f179850g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179847d);
            aVar.mo74318e(2, this.f179848e);
            aVar.mo74320g(3, 8, this.f179849f);
            C89349b bVar = this.f179850g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179847d) + 0 + C52418a.m58678e(2, this.f179848e) + C52418a.m58680g(3, 8, this.f179849f);
            C89349b bVar2 = this.f179850g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
        } else if (i == 2) {
            this.f179849f.clear();
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
            C63396g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gVar.f179847d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                gVar.f179848e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C63391b bVar3 = new C63391b();
                    if (bArr != null && bArr.length > 0) {
                        bVar3.parseFrom(bArr);
                    }
                    gVar.f179849f.add(bVar3);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gVar.f179850g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

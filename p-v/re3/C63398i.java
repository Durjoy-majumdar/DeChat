package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.i */
public class C63398i extends C47465a {

    /* renamed from: d */
    public int f179859d;

    /* renamed from: e */
    public int f179860e;

    /* renamed from: f */
    public int f179861f;

    /* renamed from: g */
    public LinkedList<C63394e> f179862g = new LinkedList<>();

    /* renamed from: h */
    public C89349b f179863h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63398i)) {
            return false;
        }
        C63398i iVar = (C63398i) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179859d), Integer.valueOf(iVar.f179859d)) && C46238a.m51546a(Integer.valueOf(this.f179860e), Integer.valueOf(iVar.f179860e)) && C46238a.m51546a(Integer.valueOf(this.f179861f), Integer.valueOf(iVar.f179861f)) && C46238a.m51546a(this.f179862g, iVar.f179862g) && C46238a.m51546a(this.f179863h, iVar.f179863h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179859d);
            aVar.mo74318e(2, this.f179860e);
            aVar.mo74318e(3, this.f179861f);
            aVar.mo74320g(4, 8, this.f179862g);
            C89349b bVar = this.f179863h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179859d) + 0 + C52418a.m58678e(2, this.f179860e) + C52418a.m58678e(3, this.f179861f) + C52418a.m58680g(4, 8, this.f179862g);
            C89349b bVar2 = this.f179863h;
            return bVar2 != null ? e + C52418a.m58675b(5, bVar2) : e;
        } else if (i == 2) {
            this.f179862g.clear();
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
            C63398i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iVar.f179859d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                iVar.f179860e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                iVar.f179861f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C63394e eVar = new C63394e();
                    if (bArr != null && bArr.length > 0) {
                        eVar.parseFrom(bArr);
                    }
                    iVar.f179862g.add(eVar);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                iVar.f179863h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

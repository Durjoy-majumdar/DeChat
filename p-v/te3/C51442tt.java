package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tt */
public class C51442tt extends C47465a {

    /* renamed from: d */
    public LinkedList<C51953xc0> f142385d = new LinkedList<>();

    /* renamed from: e */
    public int f142386e;

    /* renamed from: f */
    public C50524nd0 f142387f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51442tt)) {
            return false;
        }
        C51442tt ttVar = (C51442tt) aVar;
        return C46238a.m51546a(this.f142385d, ttVar.f142385d) && C46238a.m51546a(Integer.valueOf(this.f142386e), Integer.valueOf(ttVar.f142386e)) && C46238a.m51546a(this.f142387f, ttVar.f142387f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f142385d);
            aVar.mo74318e(2, this.f142386e);
            C50524nd0 nd02 = this.f142387f;
            if (nd02 != null) {
                aVar.mo74322i(3, nd02.computeSize());
                this.f142387f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f142385d) + 0 + C52418a.m58678e(2, this.f142386e);
            C50524nd0 nd03 = this.f142387f;
            return nd03 != null ? g + C52418a.m58682i(3, nd03.computeSize()) : g;
        } else if (i == 2) {
            this.f142385d.clear();
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
            C51442tt ttVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51953xc0 xc02 = new C51953xc0();
                    if (bArr != null && bArr.length > 0) {
                        xc02.parseFrom(bArr);
                    }
                    ttVar.f142385d.add(xc02);
                }
                return 0;
            } else if (intValue == 2) {
                ttVar.f142386e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50524nd0 nd04 = new C50524nd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd04.parseFrom(bArr2);
                    }
                    ttVar.f142387f = nd04;
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ho4 extends C47465a {

    /* renamed from: d */
    public String f134796d;

    /* renamed from: e */
    public LinkedList<we4> f134797e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<we4> f134798f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C22498fy> f134799g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ho4)) {
            return false;
        }
        ho4 ho4 = (ho4) aVar;
        return C46238a.m51546a(this.f134796d, ho4.f134796d) && C46238a.m51546a(this.f134797e, ho4.f134797e) && C46238a.m51546a(this.f134798f, ho4.f134798f) && C46238a.m51546a(this.f134799g, ho4.f134799g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134796d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f134797e);
            aVar.mo74320g(3, 8, this.f134798f);
            aVar.mo74320g(4, 8, this.f134799g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f134796d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f134797e) + C52418a.m58680g(3, 8, this.f134798f) + C52418a.m58680g(4, 8, this.f134799g);
        } else if (i == 2) {
            this.f134797e.clear();
            this.f134798f.clear();
            this.f134799g.clear();
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
            ho4 ho4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ho4.f134796d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    we4 we4 = new we4();
                    if (bArr != null && bArr.length > 0) {
                        we4.parseFrom(bArr);
                    }
                    ho4.f134797e.add(we4);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    we4 we42 = new we4();
                    if (bArr2 != null && bArr2.length > 0) {
                        we42.parseFrom(bArr2);
                    }
                    ho4.f134798f.add(we42);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C22498fy fyVar = new C22498fy();
                    if (bArr3 != null && bArr3.length > 0) {
                        fyVar.parseFrom(bArr3);
                    }
                    ho4.f134799g.add(fyVar);
                }
                return 0;
            }
        }
    }
}

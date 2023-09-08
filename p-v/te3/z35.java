package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z35 extends C47465a {

    /* renamed from: d */
    public String f145676d;

    /* renamed from: e */
    public int f145677e;

    /* renamed from: f */
    public LinkedList<String> f145678f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<v35> f145679g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<String> f145680h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z35)) {
            return false;
        }
        z35 z35 = (z35) aVar;
        return C46238a.m51546a(this.f145676d, z35.f145676d) && C46238a.m51546a(Integer.valueOf(this.f145677e), Integer.valueOf(z35.f145677e)) && C46238a.m51546a(this.f145678f, z35.f145678f) && C46238a.m51546a(this.f145679g, z35.f145679g) && C46238a.m51546a(this.f145680h, z35.f145680h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145676d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145677e);
            aVar.mo74320g(3, 1, this.f145678f);
            aVar.mo74320g(4, 8, this.f145679g);
            aVar.mo74320g(5, 1, this.f145680h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145676d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f145677e) + C52418a.m58680g(3, 1, this.f145678f) + C52418a.m58680g(4, 8, this.f145679g) + C52418a.m58680g(5, 1, this.f145680h);
        } else if (i == 2) {
            this.f145678f.clear();
            this.f145679g.clear();
            this.f145680h.clear();
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
            z35 z35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z35.f145676d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                z35.f145677e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                z35.f145678f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    v35 v35 = new v35();
                    if (bArr != null && bArr.length > 0) {
                        v35.parseFrom(bArr);
                    }
                    z35.f145679g.add(v35);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                z35.f145680h.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}

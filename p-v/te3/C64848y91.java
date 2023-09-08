package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y91 */
public class C64848y91 extends C47465a {

    /* renamed from: d */
    public int f186453d;

    /* renamed from: e */
    public String f186454e;

    /* renamed from: f */
    public LinkedList<C64848y91> f186455f = new LinkedList<>();

    /* renamed from: g */
    public C64848y91 f186456g;

    /* renamed from: h */
    public int f186457h;

    /* renamed from: i */
    public int f186458i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64848y91)) {
            return false;
        }
        C64848y91 y912 = (C64848y91) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186453d), Integer.valueOf(y912.f186453d)) && C46238a.m51546a(this.f186454e, y912.f186454e) && C46238a.m51546a(this.f186455f, y912.f186455f) && C46238a.m51546a(this.f186456g, y912.f186456g) && C46238a.m51546a(Integer.valueOf(this.f186457h), Integer.valueOf(y912.f186457h)) && C46238a.m51546a(Integer.valueOf(this.f186458i), Integer.valueOf(y912.f186458i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186453d);
            String str = this.f186454e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f186455f);
            C64848y91 y912 = this.f186456g;
            if (y912 != null) {
                aVar.mo74322i(4, y912.computeSize());
                this.f186456g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f186457h);
            aVar.mo74318e(6, this.f186458i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186453d) + 0;
            String str2 = this.f186454e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            int g = e + C52418a.m58680g(3, 8, this.f186455f);
            C64848y91 y913 = this.f186456g;
            if (y913 != null) {
                g += C52418a.m58682i(4, y913.computeSize());
            }
            return g + C52418a.m58678e(5, this.f186457h) + C52418a.m58678e(6, this.f186458i);
        } else if (i == 2) {
            this.f186455f.clear();
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
            C64848y91 y914 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y914.f186453d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    y914.f186454e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64848y91 y915 = new C64848y91();
                        if (bArr != null && bArr.length > 0) {
                            y915.parseFrom(bArr);
                        }
                        y914.f186455f.add(y915);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64848y91 y916 = new C64848y91();
                        if (bArr2 != null && bArr2.length > 0) {
                            y916.parseFrom(bArr2);
                        }
                        y914.f186456g = y916;
                    }
                    return 0;
                case 5:
                    y914.f186457h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    y914.f186458i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

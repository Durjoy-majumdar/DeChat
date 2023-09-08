package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q93 */
public class C90432q93 extends C47465a {

    /* renamed from: d */
    public String f259754d;

    /* renamed from: e */
    public String f259755e;

    /* renamed from: f */
    public LinkedList<C90430p93> f259756f = new LinkedList<>();

    /* renamed from: g */
    public int f259757g;

    /* renamed from: h */
    public String f259758h;

    /* renamed from: i */
    public LinkedList<C90432q93> f259759i = new LinkedList<>();

    /* renamed from: j */
    public int f259760j;

    /* renamed from: n */
    public int f259761n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90432q93)) {
            return false;
        }
        C90432q93 q932 = (C90432q93) aVar;
        return C46238a.m51546a(this.f259754d, q932.f259754d) && C46238a.m51546a(this.f259755e, q932.f259755e) && C46238a.m51546a(this.f259756f, q932.f259756f) && C46238a.m51546a(Integer.valueOf(this.f259757g), Integer.valueOf(q932.f259757g)) && C46238a.m51546a(this.f259758h, q932.f259758h) && C46238a.m51546a(this.f259759i, q932.f259759i) && C46238a.m51546a(Integer.valueOf(this.f259760j), Integer.valueOf(q932.f259760j)) && C46238a.m51546a(Integer.valueOf(this.f259761n), Integer.valueOf(q932.f259761n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259754d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259755e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f259756f);
            aVar.mo74318e(4, this.f259757g);
            String str3 = this.f259758h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74320g(6, 8, this.f259759i);
            aVar.mo74318e(7, this.f259760j);
            aVar.mo74318e(8, this.f259761n);
            return 0;
        } else if (i == 1) {
            String str4 = this.f259754d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f259755e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f259756f) + C52418a.m58678e(4, this.f259757g);
            String str6 = this.f259758h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            return g + C52418a.m58680g(6, 8, this.f259759i) + C52418a.m58678e(7, this.f259760j) + C52418a.m58678e(8, this.f259761n);
        } else if (i == 2) {
            this.f259756f.clear();
            this.f259759i.clear();
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
            C90432q93 q932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q932.f259754d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    q932.f259755e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90430p93 p932 = new C90430p93();
                        if (bArr != null && bArr.length > 0) {
                            p932.parseFrom(bArr);
                        }
                        q932.f259756f.add(p932);
                    }
                    return 0;
                case 4:
                    q932.f259757g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    q932.f259758h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C90432q93 q933 = new C90432q93();
                        if (bArr2 != null && bArr2.length > 0) {
                            q933.parseFrom(bArr2);
                        }
                        q932.f259759i.add(q933);
                    }
                    return 0;
                case 7:
                    q932.f259760j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    q932.f259761n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

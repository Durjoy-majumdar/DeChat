package p788aj;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: aj.a */
public class C39607a extends C47465a {

    /* renamed from: d */
    public LinkedList<C39608b> f106335d = new LinkedList<>();

    /* renamed from: e */
    public int f106336e;

    /* renamed from: f */
    public int f106337f;

    /* renamed from: g */
    public int f106338g;

    /* renamed from: h */
    public int f106339h;

    /* renamed from: i */
    public String f106340i;

    /* renamed from: j */
    public int f106341j;

    /* renamed from: n */
    public int f106342n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39607a)) {
            return false;
        }
        C39607a aVar2 = (C39607a) aVar;
        return C46238a.m51546a(this.f106335d, aVar2.f106335d) && C46238a.m51546a(Integer.valueOf(this.f106336e), Integer.valueOf(aVar2.f106336e)) && C46238a.m51546a(Integer.valueOf(this.f106337f), Integer.valueOf(aVar2.f106337f)) && C46238a.m51546a(Integer.valueOf(this.f106338g), Integer.valueOf(aVar2.f106338g)) && C46238a.m51546a(Integer.valueOf(this.f106339h), Integer.valueOf(aVar2.f106339h)) && C46238a.m51546a(this.f106340i, aVar2.f106340i) && C46238a.m51546a(Integer.valueOf(this.f106341j), Integer.valueOf(aVar2.f106341j)) && C46238a.m51546a(Integer.valueOf(this.f106342n), Integer.valueOf(aVar2.f106342n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f106335d);
            aVar.mo74318e(2, this.f106336e);
            aVar.mo74318e(3, this.f106337f);
            aVar.mo74318e(4, this.f106338g);
            aVar.mo74318e(5, this.f106339h);
            String str = this.f106340i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f106341j);
            aVar.mo74318e(8, this.f106342n);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f106335d) + 0 + C52418a.m58678e(2, this.f106336e) + C52418a.m58678e(3, this.f106337f) + C52418a.m58678e(4, this.f106338g) + C52418a.m58678e(5, this.f106339h);
            String str2 = this.f106340i;
            if (str2 != null) {
                g += C52418a.m58683j(6, str2);
            }
            return g + C52418a.m58678e(7, this.f106341j) + C52418a.m58678e(8, this.f106342n);
        } else if (i == 2) {
            this.f106335d.clear();
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
            C39607a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C39608b bVar = new C39608b();
                        if (bArr != null && bArr.length > 0) {
                            bVar.parseFrom(bArr);
                        }
                        aVar4.f106335d.add(bVar);
                    }
                    return 0;
                case 2:
                    aVar4.f106336e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    aVar4.f106337f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    aVar4.f106338g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    aVar4.f106339h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    aVar4.f106340i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    aVar4.f106341j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    aVar4.f106342n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

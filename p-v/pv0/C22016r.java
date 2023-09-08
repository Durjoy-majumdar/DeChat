package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.r */
public class C22016r extends C47465a {

    /* renamed from: d */
    public String f62300d;

    /* renamed from: e */
    public long f62301e;

    /* renamed from: f */
    public long f62302f;

    /* renamed from: g */
    public int f62303g;

    /* renamed from: h */
    public int f62304h;

    /* renamed from: i */
    public long f62305i;

    /* renamed from: j */
    public C100966p f62306j;

    /* renamed from: n */
    public int f62307n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22016r)) {
            return false;
        }
        C22016r rVar = (C22016r) aVar;
        return C46238a.m51546a(this.f62300d, rVar.f62300d) && C46238a.m51546a(Long.valueOf(this.f62301e), Long.valueOf(rVar.f62301e)) && C46238a.m51546a(Long.valueOf(this.f62302f), Long.valueOf(rVar.f62302f)) && C46238a.m51546a(Integer.valueOf(this.f62303g), Integer.valueOf(rVar.f62303g)) && C46238a.m51546a(Integer.valueOf(this.f62304h), Integer.valueOf(rVar.f62304h)) && C46238a.m51546a(Long.valueOf(this.f62305i), Long.valueOf(rVar.f62305i)) && C46238a.m51546a(this.f62306j, rVar.f62306j) && C46238a.m51546a(Integer.valueOf(this.f62307n), Integer.valueOf(rVar.f62307n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f62300d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f62301e);
                aVar.mo74321h(3, this.f62302f);
                aVar.mo74318e(4, this.f62303g);
                aVar.mo74318e(5, this.f62304h);
                aVar.mo74321h(6, this.f62305i);
                C100966p pVar = this.f62306j;
                if (pVar != null) {
                    aVar.mo74322i(7, pVar.computeSize());
                    this.f62306j.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f62307n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            String str2 = this.f62300d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int h = i2 + C52418a.m58681h(2, this.f62301e) + C52418a.m58681h(3, this.f62302f) + C52418a.m58678e(4, this.f62303g) + C52418a.m58678e(5, this.f62304h) + C52418a.m58681h(6, this.f62305i);
            C100966p pVar2 = this.f62306j;
            if (pVar2 != null) {
                h += C52418a.m58682i(7, pVar2.computeSize());
            }
            return h + C52418a.m58678e(8, this.f62307n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f62300d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22016r rVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rVar.f62300d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rVar.f62301e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    rVar.f62302f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    rVar.f62303g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rVar.f62304h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rVar.f62305i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C100966p pVar3 = new C100966p();
                        if (bArr != null && bArr.length > 0) {
                            pVar3.parseFrom(bArr);
                        }
                        rVar.f62306j = pVar3;
                    }
                    return 0;
                case 8:
                    rVar.f62307n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

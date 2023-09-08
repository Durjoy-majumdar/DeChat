package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.q */
public class C22015q extends C47465a {

    /* renamed from: d */
    public String f62292d;

    /* renamed from: e */
    public long f62293e;

    /* renamed from: f */
    public long f62294f;

    /* renamed from: g */
    public long f62295g;

    /* renamed from: h */
    public C100966p f62296h;

    /* renamed from: i */
    public long f62297i;

    /* renamed from: j */
    public int f62298j;

    /* renamed from: n */
    public String f62299n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22015q)) {
            return false;
        }
        C22015q qVar = (C22015q) aVar;
        return C46238a.m51546a(this.f62292d, qVar.f62292d) && C46238a.m51546a(Long.valueOf(this.f62293e), Long.valueOf(qVar.f62293e)) && C46238a.m51546a(Long.valueOf(this.f62294f), Long.valueOf(qVar.f62294f)) && C46238a.m51546a(Long.valueOf(this.f62295g), Long.valueOf(qVar.f62295g)) && C46238a.m51546a(this.f62296h, qVar.f62296h) && C46238a.m51546a(Long.valueOf(this.f62297i), Long.valueOf(qVar.f62297i)) && C46238a.m51546a(Integer.valueOf(this.f62298j), Integer.valueOf(qVar.f62298j)) && C46238a.m51546a(this.f62299n, qVar.f62299n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f62292d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f62293e);
                aVar.mo74321h(3, this.f62294f);
                aVar.mo74321h(4, this.f62295g);
                C100966p pVar = this.f62296h;
                if (pVar != null) {
                    aVar.mo74322i(5, pVar.computeSize());
                    this.f62296h.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f62297i);
                aVar.mo74318e(7, this.f62298j);
                String str2 = this.f62299n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            String str3 = this.f62292d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f62293e) + C52418a.m58681h(3, this.f62294f) + C52418a.m58681h(4, this.f62295g);
            C100966p pVar2 = this.f62296h;
            if (pVar2 != null) {
                h += C52418a.m58682i(5, pVar2.computeSize());
            }
            int h2 = h + C52418a.m58681h(6, this.f62297i) + C52418a.m58678e(7, this.f62298j);
            String str4 = this.f62299n;
            return str4 != null ? h2 + C52418a.m58683j(8, str4) : h2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f62292d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22015q qVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qVar.f62292d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qVar.f62293e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    qVar.f62294f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    qVar.f62295g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C100966p pVar3 = new C100966p();
                        if (bArr != null && bArr.length > 0) {
                            pVar3.parseFrom(bArr);
                        }
                        qVar.f62296h = pVar3;
                    }
                    return 0;
                case 6:
                    qVar.f62297i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    qVar.f62298j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qVar.f62299n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

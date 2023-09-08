package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ap2 */
public class C64238ap2 extends C47465a {

    /* renamed from: d */
    public long f182124d;

    /* renamed from: e */
    public long f182125e;

    /* renamed from: f */
    public String f182126f;

    /* renamed from: g */
    public String f182127g;

    /* renamed from: h */
    public String f182128h;

    /* renamed from: i */
    public String f182129i;

    /* renamed from: j */
    public C64273c21 f182130j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64238ap2)) {
            return false;
        }
        C64238ap2 ap22 = (C64238ap2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182124d), Long.valueOf(ap22.f182124d)) && C46238a.m51546a(Long.valueOf(this.f182125e), Long.valueOf(ap22.f182125e)) && C46238a.m51546a(this.f182126f, ap22.f182126f) && C46238a.m51546a(this.f182127g, ap22.f182127g) && C46238a.m51546a(this.f182128h, ap22.f182128h) && C46238a.m51546a(this.f182129i, ap22.f182129i) && C46238a.m51546a(this.f182130j, ap22.f182130j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182124d);
            aVar.mo74321h(2, this.f182125e);
            String str = this.f182126f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f182127g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f182128h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f182129i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C64273c21 c212 = this.f182130j;
            if (c212 != null) {
                aVar.mo74322i(7, c212.computeSize());
                this.f182130j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f182124d) + 0 + C52418a.m58681h(2, this.f182125e);
            String str5 = this.f182126f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f182127g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f182128h;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f182129i;
            if (str8 != null) {
                h += C52418a.m58683j(6, str8);
            }
            C64273c21 c213 = this.f182130j;
            return c213 != null ? h + C52418a.m58682i(7, c213.computeSize()) : h;
        } else if (i == 2) {
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
            C64238ap2 ap22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ap22.f182124d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ap22.f182125e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ap22.f182126f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ap22.f182127g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ap22.f182128h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ap22.f182129i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64273c21 c214 = new C64273c21();
                        if (bArr != null && bArr.length > 0) {
                            c214.parseFrom(bArr);
                        }
                        ap22.f182130j = c214;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

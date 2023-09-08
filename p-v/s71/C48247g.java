package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.g */
public class C48247g extends C48250j {

    /* renamed from: e */
    public int f129251e;

    /* renamed from: f */
    public int f129252f;

    /* renamed from: g */
    public int f129253g;

    /* renamed from: h */
    public int f129254h;

    /* renamed from: i */
    public int f129255i;

    /* renamed from: j */
    public String f129256j;

    /* renamed from: n */
    public int f129257n;

    /* renamed from: o */
    public String f129258o;

    /* renamed from: p */
    public String f129259p;

    /* renamed from: q */
    public int f129260q;

    /* renamed from: r */
    public int f129261r;

    /* renamed from: s */
    public String f129262s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48247g)) {
            return false;
        }
        C48247g gVar = (C48247g) aVar;
        return C46238a.m51546a(this.f129267d, gVar.f129267d) && C46238a.m51546a(Integer.valueOf(this.f129251e), Integer.valueOf(gVar.f129251e)) && C46238a.m51546a(Integer.valueOf(this.f129252f), Integer.valueOf(gVar.f129252f)) && C46238a.m51546a(Integer.valueOf(this.f129253g), Integer.valueOf(gVar.f129253g)) && C46238a.m51546a(Integer.valueOf(this.f129254h), Integer.valueOf(gVar.f129254h)) && C46238a.m51546a(Integer.valueOf(this.f129255i), Integer.valueOf(gVar.f129255i)) && C46238a.m51546a(this.f129256j, gVar.f129256j) && C46238a.m51546a(Integer.valueOf(this.f129257n), Integer.valueOf(gVar.f129257n)) && C46238a.m51546a(this.f129258o, gVar.f129258o) && C46238a.m51546a(this.f129259p, gVar.f129259p) && C46238a.m51546a(Integer.valueOf(this.f129260q), Integer.valueOf(gVar.f129260q)) && C46238a.m51546a(Integer.valueOf(this.f129261r), Integer.valueOf(gVar.f129261r)) && C46238a.m51546a(this.f129262s, gVar.f129262s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C48245e eVar = this.f129267d;
            if (eVar != null) {
                if (eVar != null) {
                    aVar.mo74322i(1, eVar.computeSize());
                    this.f129267d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f129251e);
                aVar.mo74318e(3, this.f129252f);
                aVar.mo74318e(4, this.f129253g);
                aVar.mo74318e(5, this.f129254h);
                aVar.mo74318e(6, this.f129255i);
                String str = this.f129256j;
                if (str != null) {
                    aVar.mo74323j(11, str);
                }
                aVar.mo74318e(12, this.f129257n);
                String str2 = this.f129258o;
                if (str2 != null) {
                    aVar.mo74323j(13, str2);
                }
                String str3 = this.f129259p;
                if (str3 != null) {
                    aVar.mo74323j(14, str3);
                }
                aVar.mo74318e(15, this.f129260q);
                aVar.mo74318e(16, this.f129261r);
                String str4 = this.f129262s;
                if (str4 != null) {
                    aVar.mo74323j(17, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C48245e eVar2 = this.f129267d;
            if (eVar2 != null) {
                i3 = C52418a.m58682i(1, eVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f129251e) + C52418a.m58678e(3, this.f129252f) + C52418a.m58678e(4, this.f129253g) + C52418a.m58678e(5, this.f129254h) + C52418a.m58678e(6, this.f129255i);
            String str5 = this.f129256j;
            if (str5 != null) {
                e += C52418a.m58683j(11, str5);
            }
            int e2 = e + C52418a.m58678e(12, this.f129257n);
            String str6 = this.f129258o;
            if (str6 != null) {
                e2 += C52418a.m58683j(13, str6);
            }
            String str7 = this.f129259p;
            if (str7 != null) {
                e2 += C52418a.m58683j(14, str7);
            }
            int e3 = e2 + C52418a.m58678e(15, this.f129260q) + C52418a.m58678e(16, this.f129261r);
            String str8 = this.f129262s;
            return str8 != null ? e3 + C52418a.m58683j(17, str8) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129267d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48247g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C48245e eVar3 = new C48245e();
                        if (bArr != null && bArr.length > 0) {
                            eVar3.parseFrom(bArr);
                        }
                        gVar.f129267d = eVar3;
                    }
                    return 0;
                case 2:
                    gVar.f129251e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gVar.f129252f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gVar.f129253g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gVar.f129254h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gVar.f129255i = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    gVar.f129256j = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    gVar.f129257n = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    gVar.f129258o = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    gVar.f129259p = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    gVar.f129260q = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    gVar.f129261r = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    gVar.f129262s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

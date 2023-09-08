package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.at0 */
public class C64243at0 extends C47465a {

    /* renamed from: d */
    public String f182145d;

    /* renamed from: e */
    public int f182146e;

    /* renamed from: f */
    public String f182147f;

    /* renamed from: g */
    public String f182148g;

    /* renamed from: h */
    public C89349b f182149h;

    /* renamed from: i */
    public C64756up2 f182150i;

    /* renamed from: j */
    public C64756up2 f182151j;

    /* renamed from: n */
    public String f182152n;

    /* renamed from: o */
    public int f182153o;

    /* renamed from: p */
    public C89349b f182154p;

    /* renamed from: q */
    public long f182155q;

    /* renamed from: r */
    public C89349b f182156r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64243at0)) {
            return false;
        }
        C64243at0 at02 = (C64243at0) aVar;
        return C46238a.m51546a(this.f182145d, at02.f182145d) && C46238a.m51546a(Integer.valueOf(this.f182146e), Integer.valueOf(at02.f182146e)) && C46238a.m51546a(this.f182147f, at02.f182147f) && C46238a.m51546a(this.f182148g, at02.f182148g) && C46238a.m51546a(this.f182149h, at02.f182149h) && C46238a.m51546a(this.f182150i, at02.f182150i) && C46238a.m51546a(this.f182151j, at02.f182151j) && C46238a.m51546a(this.f182152n, at02.f182152n) && C46238a.m51546a(Integer.valueOf(this.f182153o), Integer.valueOf(at02.f182153o)) && C46238a.m51546a(this.f182154p, at02.f182154p) && C46238a.m51546a(Long.valueOf(this.f182155q), Long.valueOf(at02.f182155q)) && C46238a.m51546a(this.f182156r, at02.f182156r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182145d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182146e);
            String str2 = this.f182147f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182148g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C89349b bVar = this.f182149h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C64756up2 up22 = this.f182150i;
            if (up22 != null) {
                aVar.mo74322i(6, up22.computeSize());
                this.f182150i.writeFields(aVar);
            }
            C64756up2 up23 = this.f182151j;
            if (up23 != null) {
                aVar.mo74322i(7, up23.computeSize());
                this.f182151j.writeFields(aVar);
            }
            String str4 = this.f182152n;
            if (str4 != null) {
                aVar.mo74323j(101, str4);
            }
            aVar.mo74318e(102, this.f182153o);
            C89349b bVar2 = this.f182154p;
            if (bVar2 != null) {
                aVar.mo74315b(103, bVar2);
            }
            aVar.mo74321h(104, this.f182155q);
            C89349b bVar3 = this.f182156r;
            if (bVar3 != null) {
                aVar.mo74315b(105, bVar3);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182145d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f182146e);
            String str6 = this.f182147f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f182148g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            C89349b bVar4 = this.f182149h;
            if (bVar4 != null) {
                e += C52418a.m58675b(5, bVar4);
            }
            C64756up2 up24 = this.f182150i;
            if (up24 != null) {
                e += C52418a.m58682i(6, up24.computeSize());
            }
            C64756up2 up25 = this.f182151j;
            if (up25 != null) {
                e += C52418a.m58682i(7, up25.computeSize());
            }
            String str8 = this.f182152n;
            if (str8 != null) {
                e += C52418a.m58683j(101, str8);
            }
            int e2 = e + C52418a.m58678e(102, this.f182153o);
            C89349b bVar5 = this.f182154p;
            if (bVar5 != null) {
                e2 += C52418a.m58675b(103, bVar5);
            }
            int h = e2 + C52418a.m58681h(104, this.f182155q);
            C89349b bVar6 = this.f182156r;
            return bVar6 != null ? h + C52418a.m58675b(105, bVar6) : h;
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
            C64243at0 at02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    at02.f182145d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    at02.f182146e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    at02.f182147f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    at02.f182148g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    at02.f182149h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64756up2 up26 = new C64756up2();
                        if (bArr != null && bArr.length > 0) {
                            up26.parseFrom(bArr);
                        }
                        at02.f182150i = up26;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64756up2 up27 = new C64756up2();
                        if (bArr2 != null && bArr2.length > 0) {
                            up27.parseFrom(bArr2);
                        }
                        at02.f182151j = up27;
                    }
                    return 0;
                default:
                    switch (intValue) {
                        case 101:
                            at02.f182152n = aVar3.mo141633k(intValue);
                            return 0;
                        case 102:
                            at02.f182153o = aVar3.mo141629g(intValue);
                            return 0;
                        case 103:
                            at02.f182154p = aVar3.mo141626d(intValue);
                            return 0;
                        case 104:
                            at02.f182155q = aVar3.mo141631i(intValue);
                            return 0;
                        case 105:
                            at02.f182156r = aVar3.mo141626d(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}

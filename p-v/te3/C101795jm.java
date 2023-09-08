package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jm */
public class C101795jm extends C47465a {

    /* renamed from: d */
    public int f298537d;

    /* renamed from: e */
    public int f298538e;

    /* renamed from: f */
    public int f298539f;

    /* renamed from: g */
    public int f298540g;

    /* renamed from: h */
    public int f298541h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f298542i = new LinkedList<>();

    /* renamed from: j */
    public String f298543j;

    /* renamed from: n */
    public C51018qv3 f298544n;

    /* renamed from: o */
    public int f298545o;

    /* renamed from: p */
    public int f298546p;

    /* renamed from: q */
    public LinkedList<C51163rv3> f298547q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<C50148km> f298548r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C50148km> f298549s = new LinkedList<>();

    /* renamed from: t */
    public int f298550t;

    /* renamed from: u */
    public int f298551u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101795jm)) {
            return false;
        }
        C101795jm jmVar = (C101795jm) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298537d), Integer.valueOf(jmVar.f298537d)) && C46238a.m51546a(Integer.valueOf(this.f298538e), Integer.valueOf(jmVar.f298538e)) && C46238a.m51546a(Integer.valueOf(this.f298539f), Integer.valueOf(jmVar.f298539f)) && C46238a.m51546a(Integer.valueOf(this.f298540g), Integer.valueOf(jmVar.f298540g)) && C46238a.m51546a(Integer.valueOf(this.f298541h), Integer.valueOf(jmVar.f298541h)) && C46238a.m51546a(this.f298542i, jmVar.f298542i) && C46238a.m51546a(this.f298543j, jmVar.f298543j) && C46238a.m51546a(this.f298544n, jmVar.f298544n) && C46238a.m51546a(Integer.valueOf(this.f298545o), Integer.valueOf(jmVar.f298545o)) && C46238a.m51546a(Integer.valueOf(this.f298546p), Integer.valueOf(jmVar.f298546p)) && C46238a.m51546a(this.f298547q, jmVar.f298547q) && C46238a.m51546a(this.f298548r, jmVar.f298548r) && C46238a.m51546a(this.f298549s, jmVar.f298549s) && C46238a.m51546a(Integer.valueOf(this.f298550t), Integer.valueOf(jmVar.f298550t)) && C46238a.m51546a(Integer.valueOf(this.f298551u), Integer.valueOf(jmVar.f298551u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f298544n != null) {
                aVar.mo74318e(1, this.f298537d);
                aVar.mo74318e(2, this.f298538e);
                aVar.mo74318e(3, this.f298539f);
                aVar.mo74318e(4, this.f298540g);
                aVar.mo74318e(5, this.f298541h);
                aVar.mo74320g(6, 8, this.f298542i);
                String str = this.f298543j;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                C51018qv3 qv32 = this.f298544n;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f298544n.writeFields(aVar);
                }
                aVar.mo74318e(9, this.f298545o);
                aVar.mo74318e(10, this.f298546p);
                aVar.mo74320g(11, 8, this.f298547q);
                aVar.mo74320g(12, 8, this.f298548r);
                aVar.mo74320g(13, 8, this.f298549s);
                aVar.mo74318e(14, this.f298550t);
                aVar.mo74318e(15, this.f298551u);
                return 0;
            }
            throw new C52419b("Not all required fields were included: AuthKey");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f298537d) + 0 + C52418a.m58678e(2, this.f298538e) + C52418a.m58678e(3, this.f298539f) + C52418a.m58678e(4, this.f298540g) + C52418a.m58678e(5, this.f298541h) + C52418a.m58680g(6, 8, this.f298542i);
            String str2 = this.f298543j;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            C51018qv3 qv33 = this.f298544n;
            if (qv33 != null) {
                e += C52418a.m58682i(8, qv33.computeSize());
            }
            return e + C52418a.m58678e(9, this.f298545o) + C52418a.m58678e(10, this.f298546p) + C52418a.m58680g(11, 8, this.f298547q) + C52418a.m58680g(12, 8, this.f298548r) + C52418a.m58680g(13, 8, this.f298549s) + C52418a.m58678e(14, this.f298550t) + C52418a.m58678e(15, this.f298551u);
        } else if (i2 == 2) {
            this.f298542i.clear();
            this.f298547q.clear();
            this.f298548r.clear();
            this.f298549s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298544n != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AuthKey");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101795jm jmVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jmVar.f298537d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    jmVar.f298538e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jmVar.f298539f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jmVar.f298540g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jmVar.f298541h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv32.mo73356d(bArr);
                        }
                        jmVar.f298542i.add(rv32);
                    }
                    return 0;
                case 7:
                    jmVar.f298543j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        jmVar.f298544n = qv34;
                    }
                    return 0;
                case 9:
                    jmVar.f298545o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jmVar.f298546p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv33 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv33.mo73356d(bArr3);
                        }
                        jmVar.f298547q.add(rv33);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50148km kmVar = new C50148km();
                        if (bArr4 != null && bArr4.length > 0) {
                            kmVar.parseFrom(bArr4);
                        }
                        jmVar.f298548r.add(kmVar);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50148km kmVar2 = new C50148km();
                        if (bArr5 != null && bArr5.length > 0) {
                            kmVar2.parseFrom(bArr5);
                        }
                        jmVar.f298549s.add(kmVar2);
                    }
                    return 0;
                case 14:
                    jmVar.f298550t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jmVar.f298551u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

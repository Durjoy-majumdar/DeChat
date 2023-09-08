package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jf */
public class C49983jf extends C47465a {

    /* renamed from: d */
    public int f136073d;

    /* renamed from: e */
    public int f136074e;

    /* renamed from: f */
    public String f136075f;

    /* renamed from: g */
    public String f136076g;

    /* renamed from: h */
    public String f136077h;

    /* renamed from: i */
    public String f136078i;

    /* renamed from: j */
    public int f136079j;

    /* renamed from: n */
    public int f136080n;

    /* renamed from: o */
    public int f136081o;

    /* renamed from: p */
    public int f136082p;

    /* renamed from: q */
    public C50751oy f136083q;

    /* renamed from: r */
    public int f136084r;

    /* renamed from: s */
    public int f136085s;

    /* renamed from: t */
    public int f136086t = 0;

    /* renamed from: u */
    public int f136087u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49983jf)) {
            return false;
        }
        C49983jf jfVar = (C49983jf) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136073d), Integer.valueOf(jfVar.f136073d)) && C46238a.m51546a(Integer.valueOf(this.f136074e), Integer.valueOf(jfVar.f136074e)) && C46238a.m51546a(this.f136075f, jfVar.f136075f) && C46238a.m51546a(this.f136076g, jfVar.f136076g) && C46238a.m51546a(this.f136077h, jfVar.f136077h) && C46238a.m51546a(this.f136078i, jfVar.f136078i) && C46238a.m51546a(Integer.valueOf(this.f136079j), Integer.valueOf(jfVar.f136079j)) && C46238a.m51546a(Integer.valueOf(this.f136080n), Integer.valueOf(jfVar.f136080n)) && C46238a.m51546a(Integer.valueOf(this.f136081o), Integer.valueOf(jfVar.f136081o)) && C46238a.m51546a(Integer.valueOf(this.f136082p), Integer.valueOf(jfVar.f136082p)) && C46238a.m51546a(this.f136083q, jfVar.f136083q) && C46238a.m51546a(Integer.valueOf(this.f136084r), Integer.valueOf(jfVar.f136084r)) && C46238a.m51546a(Integer.valueOf(this.f136085s), Integer.valueOf(jfVar.f136085s)) && C46238a.m51546a(Integer.valueOf(this.f136086t), Integer.valueOf(jfVar.f136086t)) && C46238a.m51546a(Integer.valueOf(this.f136087u), Integer.valueOf(jfVar.f136087u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136073d);
            aVar.mo74318e(2, this.f136074e);
            String str = this.f136075f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136076g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f136077h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f136078i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f136079j);
            aVar.mo74318e(8, this.f136080n);
            aVar.mo74318e(9, this.f136081o);
            aVar.mo74318e(10, this.f136082p);
            C50751oy oyVar = this.f136083q;
            if (oyVar != null) {
                aVar.mo74322i(11, oyVar.computeSize());
                this.f136083q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f136084r);
            aVar.mo74318e(13, this.f136085s);
            aVar.mo74318e(14, this.f136086t);
            aVar.mo74318e(15, this.f136087u);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f136073d) + 0 + C52418a.m58678e(2, this.f136074e);
            String str5 = this.f136075f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f136076g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f136077h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f136078i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            int e2 = e + C52418a.m58678e(7, this.f136079j) + C52418a.m58678e(8, this.f136080n) + C52418a.m58678e(9, this.f136081o) + C52418a.m58678e(10, this.f136082p);
            C50751oy oyVar2 = this.f136083q;
            if (oyVar2 != null) {
                e2 += C52418a.m58682i(11, oyVar2.computeSize());
            }
            return e2 + C52418a.m58678e(12, this.f136084r) + C52418a.m58678e(13, this.f136085s) + C52418a.m58678e(14, this.f136086t) + C52418a.m58678e(15, this.f136087u);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49983jf jfVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jfVar.f136073d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    jfVar.f136074e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jfVar.f136075f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jfVar.f136076g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jfVar.f136077h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jfVar.f136078i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jfVar.f136079j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jfVar.f136080n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jfVar.f136081o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jfVar.f136082p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50751oy oyVar3 = new C50751oy();
                        if (bArr != null && bArr.length > 0) {
                            oyVar3.parseFrom(bArr);
                        }
                        jfVar.f136083q = oyVar3;
                    }
                    return 0;
                case 12:
                    jfVar.f136084r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    jfVar.f136085s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    jfVar.f136086t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jfVar.f136087u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

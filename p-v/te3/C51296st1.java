package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.st1 */
public class C51296st1 extends C47465a {

    /* renamed from: d */
    public int f141738d;

    /* renamed from: e */
    public String f141739e;

    /* renamed from: f */
    public String f141740f;

    /* renamed from: g */
    public String f141741g;

    /* renamed from: h */
    public String f141742h;

    /* renamed from: i */
    public String f141743i;

    /* renamed from: j */
    public int f141744j;

    /* renamed from: n */
    public int f141745n;

    /* renamed from: o */
    public int f141746o;

    /* renamed from: p */
    public int f141747p;

    /* renamed from: q */
    public C51018qv3 f141748q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51296st1)) {
            return false;
        }
        C51296st1 st12 = (C51296st1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141738d), Integer.valueOf(st12.f141738d)) && C46238a.m51546a(this.f141739e, st12.f141739e) && C46238a.m51546a(this.f141740f, st12.f141740f) && C46238a.m51546a(this.f141741g, st12.f141741g) && C46238a.m51546a(this.f141742h, st12.f141742h) && C46238a.m51546a(this.f141743i, st12.f141743i) && C46238a.m51546a(Integer.valueOf(this.f141744j), Integer.valueOf(st12.f141744j)) && C46238a.m51546a(Integer.valueOf(this.f141745n), Integer.valueOf(st12.f141745n)) && C46238a.m51546a(Integer.valueOf(this.f141746o), Integer.valueOf(st12.f141746o)) && C46238a.m51546a(Integer.valueOf(this.f141747p), Integer.valueOf(st12.f141747p)) && C46238a.m51546a(this.f141748q, st12.f141748q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141738d);
            String str = this.f141739e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141740f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141741g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141742h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f141743i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f141744j);
            aVar.mo74318e(9, this.f141745n);
            aVar.mo74318e(11, this.f141746o);
            aVar.mo74318e(12, this.f141747p);
            C51018qv3 qv32 = this.f141748q;
            if (qv32 != null) {
                aVar.mo74322i(13, qv32.computeSize());
                this.f141748q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141738d) + 0;
            String str6 = this.f141739e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f141740f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f141741g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f141742h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f141743i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            int e2 = e + C52418a.m58678e(8, this.f141744j) + C52418a.m58678e(9, this.f141745n) + C52418a.m58678e(11, this.f141746o) + C52418a.m58678e(12, this.f141747p);
            C51018qv3 qv33 = this.f141748q;
            return qv33 != null ? e2 + C52418a.m58682i(13, qv33.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51296st1 st12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    st12.f141738d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    st12.f141739e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    st12.f141740f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    st12.f141741g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    st12.f141742h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    st12.f141743i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    st12.f141744j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    st12.f141745n = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    st12.f141746o = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    st12.f141747p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        st12.f141748q = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uq3 */
public class C101851uq3 extends C47465a {

    /* renamed from: d */
    public int f299626d;

    /* renamed from: e */
    public String f299627e;

    /* renamed from: f */
    public String f299628f;

    /* renamed from: g */
    public int f299629g;

    /* renamed from: h */
    public int f299630h;

    /* renamed from: i */
    public int f299631i;

    /* renamed from: j */
    public wt4 f299632j;

    /* renamed from: n */
    public wt4 f299633n;

    /* renamed from: o */
    public int f299634o;

    /* renamed from: p */
    public int f299635p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101851uq3)) {
            return false;
        }
        C101851uq3 uq32 = (C101851uq3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299626d), Integer.valueOf(uq32.f299626d)) && C46238a.m51546a(this.f299627e, uq32.f299627e) && C46238a.m51546a(this.f299628f, uq32.f299628f) && C46238a.m51546a(Integer.valueOf(this.f299629g), Integer.valueOf(uq32.f299629g)) && C46238a.m51546a(Integer.valueOf(this.f299630h), Integer.valueOf(uq32.f299630h)) && C46238a.m51546a(Integer.valueOf(this.f299631i), Integer.valueOf(uq32.f299631i)) && C46238a.m51546a(this.f299632j, uq32.f299632j) && C46238a.m51546a(this.f299633n, uq32.f299633n) && C46238a.m51546a(Integer.valueOf(this.f299634o), Integer.valueOf(uq32.f299634o)) && C46238a.m51546a(Integer.valueOf(this.f299635p), Integer.valueOf(uq32.f299635p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299626d);
            String str = this.f299627e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f299628f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f299629g);
            aVar.mo74318e(5, this.f299630h);
            aVar.mo74318e(6, this.f299631i);
            wt4 wt4 = this.f299632j;
            if (wt4 != null) {
                aVar.mo74322i(7, wt4.computeSize());
                this.f299632j.writeFields(aVar);
            }
            wt4 wt42 = this.f299633n;
            if (wt42 != null) {
                aVar.mo74322i(8, wt42.computeSize());
                this.f299633n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f299634o);
            aVar.mo74318e(10, this.f299635p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299626d) + 0;
            String str3 = this.f299627e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f299628f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f299629g) + C52418a.m58678e(5, this.f299630h) + C52418a.m58678e(6, this.f299631i);
            wt4 wt43 = this.f299632j;
            if (wt43 != null) {
                e2 += C52418a.m58682i(7, wt43.computeSize());
            }
            wt4 wt44 = this.f299633n;
            if (wt44 != null) {
                e2 += C52418a.m58682i(8, wt44.computeSize());
            }
            return e2 + C52418a.m58678e(9, this.f299634o) + C52418a.m58678e(10, this.f299635p);
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
            C101851uq3 uq32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uq32.f299626d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    uq32.f299627e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    uq32.f299628f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uq32.f299629g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uq32.f299630h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    uq32.f299631i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        wt4 wt45 = new wt4();
                        if (bArr != null && bArr.length > 0) {
                            wt45.parseFrom(bArr);
                        }
                        uq32.f299632j = wt45;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        wt4 wt46 = new wt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            wt46.parseFrom(bArr2);
                        }
                        uq32.f299633n = wt46;
                    }
                    return 0;
                case 9:
                    uq32.f299634o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    uq32.f299635p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

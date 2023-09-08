package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d31 */
public class C49088d31 extends C47465a {

    /* renamed from: d */
    public int f132087d;

    /* renamed from: e */
    public LinkedList<C52204z21> f132088e = new LinkedList<>();

    /* renamed from: f */
    public long f132089f;

    /* renamed from: g */
    public long f132090g;

    /* renamed from: h */
    public String f132091h;

    /* renamed from: i */
    public int f132092i;

    /* renamed from: j */
    public C89349b f132093j;

    /* renamed from: n */
    public String f132094n;

    /* renamed from: o */
    public LinkedList<C51729vr2> f132095o = new LinkedList<>();

    /* renamed from: p */
    public int f132096p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49088d31)) {
            return false;
        }
        C49088d31 d312 = (C49088d31) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132087d), Integer.valueOf(d312.f132087d)) && C46238a.m51546a(this.f132088e, d312.f132088e) && C46238a.m51546a(Long.valueOf(this.f132089f), Long.valueOf(d312.f132089f)) && C46238a.m51546a(Long.valueOf(this.f132090g), Long.valueOf(d312.f132090g)) && C46238a.m51546a(this.f132091h, d312.f132091h) && C46238a.m51546a(Integer.valueOf(this.f132092i), Integer.valueOf(d312.f132092i)) && C46238a.m51546a(this.f132093j, d312.f132093j) && C46238a.m51546a(this.f132094n, d312.f132094n) && C46238a.m51546a(this.f132095o, d312.f132095o) && C46238a.m51546a(Integer.valueOf(this.f132096p), Integer.valueOf(d312.f132096p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132087d);
            aVar.mo74320g(2, 8, this.f132088e);
            aVar.mo74321h(3, this.f132089f);
            aVar.mo74321h(4, this.f132090g);
            String str = this.f132091h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(7, this.f132092i);
            C89349b bVar = this.f132093j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str2 = this.f132094n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74320g(10, 8, this.f132095o);
            aVar.mo74318e(11, this.f132096p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132087d) + 0 + C52418a.m58680g(2, 8, this.f132088e) + C52418a.m58681h(3, this.f132089f) + C52418a.m58681h(4, this.f132090g);
            String str3 = this.f132091h;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            int e2 = e + C52418a.m58678e(7, this.f132092i);
            C89349b bVar2 = this.f132093j;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(8, bVar2);
            }
            String str4 = this.f132094n;
            if (str4 != null) {
                e2 += C52418a.m58683j(9, str4);
            }
            return e2 + C52418a.m58680g(10, 8, this.f132095o) + C52418a.m58678e(11, this.f132096p);
        } else if (i == 2) {
            this.f132088e.clear();
            this.f132095o.clear();
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
            C49088d31 d312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d312.f132087d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52204z21 z212 = new C52204z21();
                        if (bArr != null && bArr.length > 0) {
                            z212.parseFrom(bArr);
                        }
                        d312.f132088e.add(z212);
                    }
                    return 0;
                case 3:
                    d312.f132089f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    d312.f132090g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    d312.f132091h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    d312.f132092i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    d312.f132093j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    d312.f132094n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51729vr2 vr22 = new C51729vr2();
                        if (bArr2 != null && bArr2.length > 0) {
                            vr22.parseFrom(bArr2);
                        }
                        d312.f132095o.add(vr22);
                    }
                    return 0;
                case 11:
                    d312.f132096p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

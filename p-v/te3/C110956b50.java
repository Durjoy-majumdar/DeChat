package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b50 */
public class C110956b50 extends C47465a {

    /* renamed from: d */
    public int f331878d;

    /* renamed from: e */
    public String f331879e;

    /* renamed from: f */
    public String f331880f;

    /* renamed from: g */
    public int f331881g;

    /* renamed from: h */
    public int f331882h;

    /* renamed from: i */
    public int f331883i;

    /* renamed from: j */
    public wt4 f331884j;

    /* renamed from: n */
    public int f331885n;

    /* renamed from: o */
    public LinkedList<kv4> f331886o = new LinkedList<>();

    /* renamed from: p */
    public int f331887p;

    /* renamed from: q */
    public int f331888q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110956b50)) {
            return false;
        }
        C110956b50 b502 = (C110956b50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f331878d), Integer.valueOf(b502.f331878d)) && C46238a.m51546a(this.f331879e, b502.f331879e) && C46238a.m51546a(this.f331880f, b502.f331880f) && C46238a.m51546a(Integer.valueOf(this.f331881g), Integer.valueOf(b502.f331881g)) && C46238a.m51546a(Integer.valueOf(this.f331882h), Integer.valueOf(b502.f331882h)) && C46238a.m51546a(Integer.valueOf(this.f331883i), Integer.valueOf(b502.f331883i)) && C46238a.m51546a(this.f331884j, b502.f331884j) && C46238a.m51546a(Integer.valueOf(this.f331885n), Integer.valueOf(b502.f331885n)) && C46238a.m51546a(this.f331886o, b502.f331886o) && C46238a.m51546a(Integer.valueOf(this.f331887p), Integer.valueOf(b502.f331887p)) && C46238a.m51546a(Integer.valueOf(this.f331888q), Integer.valueOf(b502.f331888q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f331878d);
            String str = this.f331879e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f331880f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f331881g);
            aVar.mo74318e(5, this.f331882h);
            aVar.mo74318e(6, this.f331883i);
            wt4 wt4 = this.f331884j;
            if (wt4 != null) {
                aVar.mo74322i(7, wt4.computeSize());
                this.f331884j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f331885n);
            aVar.mo74320g(9, 8, this.f331886o);
            aVar.mo74318e(10, this.f331887p);
            aVar.mo74318e(11, this.f331888q);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f331878d) + 0;
            String str3 = this.f331879e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f331880f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f331881g) + C52418a.m58678e(5, this.f331882h) + C52418a.m58678e(6, this.f331883i);
            wt4 wt42 = this.f331884j;
            if (wt42 != null) {
                e2 += C52418a.m58682i(7, wt42.computeSize());
            }
            return e2 + C52418a.m58678e(8, this.f331885n) + C52418a.m58680g(9, 8, this.f331886o) + C52418a.m58678e(10, this.f331887p) + C52418a.m58678e(11, this.f331888q);
        } else if (i == 2) {
            this.f331886o.clear();
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
            C110956b50 b502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b502.f331878d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    b502.f331879e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    b502.f331880f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b502.f331881g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    b502.f331882h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    b502.f331883i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        wt4 wt43 = new wt4();
                        if (bArr != null && bArr.length > 0) {
                            wt43.parseFrom(bArr);
                        }
                        b502.f331884j = wt43;
                    }
                    return 0;
                case 8:
                    b502.f331885n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        kv4 kv4 = new kv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            kv4.parseFrom(bArr2);
                        }
                        b502.f331886o.add(kv4);
                    }
                    return 0;
                case 10:
                    b502.f331887p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    b502.f331888q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

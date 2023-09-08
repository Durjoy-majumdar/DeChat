package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u63 */
public class C51500u63 extends C47465a {

    /* renamed from: d */
    public String f142620d;

    /* renamed from: e */
    public int f142621e;

    /* renamed from: f */
    public C51654v63 f142622f;

    /* renamed from: g */
    public int f142623g;

    /* renamed from: h */
    public C51792w63 f142624h;

    /* renamed from: i */
    public int f142625i;

    /* renamed from: j */
    public int f142626j;

    /* renamed from: n */
    public int f142627n;

    /* renamed from: o */
    public int f142628o;

    /* renamed from: p */
    public String f142629p;

    /* renamed from: q */
    public int f142630q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51500u63)) {
            return false;
        }
        C51500u63 u632 = (C51500u63) aVar;
        return C46238a.m51546a(this.f142620d, u632.f142620d) && C46238a.m51546a(Integer.valueOf(this.f142621e), Integer.valueOf(u632.f142621e)) && C46238a.m51546a(this.f142622f, u632.f142622f) && C46238a.m51546a(Integer.valueOf(this.f142623g), Integer.valueOf(u632.f142623g)) && C46238a.m51546a(this.f142624h, u632.f142624h) && C46238a.m51546a(Integer.valueOf(this.f142625i), Integer.valueOf(u632.f142625i)) && C46238a.m51546a(Integer.valueOf(this.f142626j), Integer.valueOf(u632.f142626j)) && C46238a.m51546a(Integer.valueOf(this.f142627n), Integer.valueOf(u632.f142627n)) && C46238a.m51546a(Integer.valueOf(this.f142628o), Integer.valueOf(u632.f142628o)) && C46238a.m51546a(this.f142629p, u632.f142629p) && C46238a.m51546a(Integer.valueOf(this.f142630q), Integer.valueOf(u632.f142630q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142620d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f142621e);
            C51654v63 v632 = this.f142622f;
            if (v632 != null) {
                aVar.mo74322i(3, v632.computeSize());
                this.f142622f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f142623g);
            C51792w63 w632 = this.f142624h;
            if (w632 != null) {
                aVar.mo74322i(5, w632.computeSize());
                this.f142624h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f142625i);
            aVar.mo74318e(7, this.f142626j);
            aVar.mo74318e(8, this.f142627n);
            aVar.mo74318e(9, this.f142628o);
            String str2 = this.f142629p;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            aVar.mo74318e(11, this.f142630q);
            return 0;
        } else if (i == 1) {
            String str3 = this.f142620d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f142621e);
            C51654v63 v633 = this.f142622f;
            if (v633 != null) {
                e += C52418a.m58682i(3, v633.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f142623g);
            C51792w63 w633 = this.f142624h;
            if (w633 != null) {
                e2 += C52418a.m58682i(5, w633.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(6, this.f142625i) + C52418a.m58678e(7, this.f142626j) + C52418a.m58678e(8, this.f142627n) + C52418a.m58678e(9, this.f142628o);
            String str4 = this.f142629p;
            if (str4 != null) {
                e3 += C52418a.m58683j(10, str4);
            }
            return e3 + C52418a.m58678e(11, this.f142630q);
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
            C51500u63 u632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u632.f142620d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    u632.f142621e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51654v63 v634 = new C51654v63();
                        if (bArr != null && bArr.length > 0) {
                            v634.parseFrom(bArr);
                        }
                        u632.f142622f = v634;
                    }
                    return 0;
                case 4:
                    u632.f142623g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51792w63 w634 = new C51792w63();
                        if (bArr2 != null && bArr2.length > 0) {
                            w634.parseFrom(bArr2);
                        }
                        u632.f142624h = w634;
                    }
                    return 0;
                case 6:
                    u632.f142625i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u632.f142626j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u632.f142627n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    u632.f142628o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    u632.f142629p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    u632.f142630q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

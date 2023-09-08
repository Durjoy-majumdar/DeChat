package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m60 */
public class C50359m60 extends C47465a {

    /* renamed from: d */
    public String f137866d;

    /* renamed from: e */
    public int f137867e;

    /* renamed from: f */
    public LinkedList<C52266zh3> f137868f = new LinkedList<>();

    /* renamed from: g */
    public int f137869g;

    /* renamed from: h */
    public C50545nh3 f137870h;

    /* renamed from: i */
    public int f137871i;

    /* renamed from: j */
    public String f137872j;

    /* renamed from: n */
    public C50077k40 f137873n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50359m60)) {
            return false;
        }
        C50359m60 m602 = (C50359m60) aVar;
        return C46238a.m51546a(this.f137866d, m602.f137866d) && C46238a.m51546a(Integer.valueOf(this.f137867e), Integer.valueOf(m602.f137867e)) && C46238a.m51546a(this.f137868f, m602.f137868f) && C46238a.m51546a(Integer.valueOf(this.f137869g), Integer.valueOf(m602.f137869g)) && C46238a.m51546a(this.f137870h, m602.f137870h) && C46238a.m51546a(Integer.valueOf(this.f137871i), Integer.valueOf(m602.f137871i)) && C46238a.m51546a(this.f137872j, m602.f137872j) && C46238a.m51546a(this.f137873n, m602.f137873n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137866d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137867e);
            aVar.mo74320g(3, 8, this.f137868f);
            aVar.mo74318e(4, this.f137869g);
            C50545nh3 nh32 = this.f137870h;
            if (nh32 != null) {
                aVar.mo74322i(5, nh32.computeSize());
                this.f137870h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f137871i);
            String str2 = this.f137872j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C50077k40 k402 = this.f137873n;
            if (k402 != null) {
                aVar.mo74322i(8, k402.computeSize());
                this.f137873n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f137866d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f137867e) + C52418a.m58680g(3, 8, this.f137868f) + C52418a.m58678e(4, this.f137869g);
            C50545nh3 nh33 = this.f137870h;
            if (nh33 != null) {
                e += C52418a.m58682i(5, nh33.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f137871i);
            String str4 = this.f137872j;
            if (str4 != null) {
                e2 += C52418a.m58683j(7, str4);
            }
            C50077k40 k403 = this.f137873n;
            return k403 != null ? e2 + C52418a.m58682i(8, k403.computeSize()) : e2;
        } else if (i == 2) {
            this.f137868f.clear();
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
            C50359m60 m602 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m602.f137866d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m602.f137867e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52266zh3 zh32 = new C52266zh3();
                        if (bArr != null && bArr.length > 0) {
                            zh32.parseFrom(bArr);
                        }
                        m602.f137868f.add(zh32);
                    }
                    return 0;
                case 4:
                    m602.f137869g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50545nh3 nh34 = new C50545nh3();
                        if (bArr2 != null && bArr2.length > 0) {
                            nh34.parseFrom(bArr2);
                        }
                        m602.f137870h = nh34;
                    }
                    return 0;
                case 6:
                    m602.f137871i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    m602.f137872j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50077k40 k404 = new C50077k40();
                        if (bArr3 != null && bArr3.length > 0) {
                            k404.parseFrom(bArr3);
                        }
                        m602.f137873n = k404;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

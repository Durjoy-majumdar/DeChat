package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a91 */
public class C48682a91 extends C47465a {

    /* renamed from: d */
    public int f130377d;

    /* renamed from: e */
    public int f130378e;

    /* renamed from: f */
    public String f130379f;

    /* renamed from: g */
    public String f130380g;

    /* renamed from: h */
    public LinkedList<C52231z81> f130381h = new LinkedList<>();

    /* renamed from: i */
    public int f130382i;

    /* renamed from: j */
    public LinkedList<String> f130383j = new LinkedList<>();

    /* renamed from: n */
    public C89349b f130384n;

    /* renamed from: o */
    public int f130385o;

    /* renamed from: p */
    public C51942x91 f130386p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48682a91)) {
            return false;
        }
        C48682a91 a912 = (C48682a91) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130377d), Integer.valueOf(a912.f130377d)) && C46238a.m51546a(Integer.valueOf(this.f130378e), Integer.valueOf(a912.f130378e)) && C46238a.m51546a(this.f130379f, a912.f130379f) && C46238a.m51546a(this.f130380g, a912.f130380g) && C46238a.m51546a(this.f130381h, a912.f130381h) && C46238a.m51546a(Integer.valueOf(this.f130382i), Integer.valueOf(a912.f130382i)) && C46238a.m51546a(this.f130383j, a912.f130383j) && C46238a.m51546a(this.f130384n, a912.f130384n) && C46238a.m51546a(Integer.valueOf(this.f130385o), Integer.valueOf(a912.f130385o)) && C46238a.m51546a(this.f130386p, a912.f130386p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130377d);
            aVar.mo74318e(2, this.f130378e);
            String str = this.f130379f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f130380g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74320g(5, 8, this.f130381h);
            aVar.mo74318e(6, this.f130382i);
            aVar.mo74320g(7, 1, this.f130383j);
            C89349b bVar = this.f130384n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74318e(9, this.f130385o);
            C51942x91 x912 = this.f130386p;
            if (x912 != null) {
                aVar.mo74322i(10, x912.computeSize());
                this.f130386p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130377d) + 0 + C52418a.m58678e(2, this.f130378e);
            String str3 = this.f130379f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f130380g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            int g = e + C52418a.m58680g(5, 8, this.f130381h) + C52418a.m58678e(6, this.f130382i) + C52418a.m58680g(7, 1, this.f130383j);
            C89349b bVar2 = this.f130384n;
            if (bVar2 != null) {
                g += C52418a.m58675b(8, bVar2);
            }
            int e2 = g + C52418a.m58678e(9, this.f130385o);
            C51942x91 x913 = this.f130386p;
            return x913 != null ? e2 + C52418a.m58682i(10, x913.computeSize()) : e2;
        } else if (i == 2) {
            this.f130381h.clear();
            this.f130383j.clear();
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
            C48682a91 a912 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a912.f130377d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    a912.f130378e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a912.f130379f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a912.f130380g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52231z81 z812 = new C52231z81();
                        if (bArr != null && bArr.length > 0) {
                            z812.parseFrom(bArr);
                        }
                        a912.f130381h.add(z812);
                    }
                    return 0;
                case 6:
                    a912.f130382i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a912.f130383j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    a912.f130384n = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    a912.f130385o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51942x91 x914 = new C51942x91();
                        if (bArr2 != null && bArr2.length > 0) {
                            x914.parseFrom(bArr2);
                        }
                        a912.f130386p = x914;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

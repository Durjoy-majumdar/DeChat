package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gg2 */
public class C118434gg2 extends C47465a {

    /* renamed from: d */
    public long f354026d = 0;

    /* renamed from: e */
    public long f354027e = 0;

    /* renamed from: f */
    public LinkedList<C22505ka3> f354028f = new LinkedList<>();

    /* renamed from: g */
    public int f354029g = -1;

    /* renamed from: h */
    public LinkedList<C118430fa3> f354030h = new LinkedList<>();

    /* renamed from: i */
    public int f354031i = -1;

    /* renamed from: j */
    public int f354032j = -1;

    /* renamed from: n */
    public long f354033n = 0;

    /* renamed from: o */
    public boolean f354034o = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118434gg2)) {
            return false;
        }
        C118434gg2 gg22 = (C118434gg2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f354026d), Long.valueOf(gg22.f354026d)) && C46238a.m51546a(Long.valueOf(this.f354027e), Long.valueOf(gg22.f354027e)) && C46238a.m51546a(this.f354028f, gg22.f354028f) && C46238a.m51546a(Integer.valueOf(this.f354029g), Integer.valueOf(gg22.f354029g)) && C46238a.m51546a(this.f354030h, gg22.f354030h) && C46238a.m51546a(Integer.valueOf(this.f354031i), Integer.valueOf(gg22.f354031i)) && C46238a.m51546a(Integer.valueOf(this.f354032j), Integer.valueOf(gg22.f354032j)) && C46238a.m51546a(Long.valueOf(this.f354033n), Long.valueOf(gg22.f354033n)) && C46238a.m51546a(Boolean.valueOf(this.f354034o), Boolean.valueOf(gg22.f354034o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f354026d);
            aVar.mo74321h(2, this.f354027e);
            aVar.mo74320g(3, 8, this.f354028f);
            aVar.mo74318e(4, this.f354029g);
            aVar.mo74320g(5, 8, this.f354030h);
            aVar.mo74318e(6, this.f354031i);
            aVar.mo74318e(7, this.f354032j);
            aVar.mo74321h(8, this.f354033n);
            aVar.mo74314a(9, this.f354034o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f354026d) + 0 + C52418a.m58681h(2, this.f354027e) + C52418a.m58680g(3, 8, this.f354028f) + C52418a.m58678e(4, this.f354029g) + C52418a.m58680g(5, 8, this.f354030h) + C52418a.m58678e(6, this.f354031i) + C52418a.m58678e(7, this.f354032j) + C52418a.m58681h(8, this.f354033n) + C52418a.m58674a(9, this.f354034o);
        } else {
            if (i == 2) {
                this.f354028f.clear();
                this.f354030h.clear();
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
                C118434gg2 gg22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        gg22.f354026d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        gg22.f354027e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C22505ka3 ka32 = new C22505ka3();
                            if (bArr != null && bArr.length > 0) {
                                ka32.parseFrom(bArr);
                            }
                            gg22.f354028f.add(ka32);
                        }
                        return 0;
                    case 4:
                        gg22.f354029g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            byte[] bArr2 = j2.get(i3);
                            C118430fa3 fa32 = new C118430fa3();
                            if (bArr2 != null && bArr2.length > 0) {
                                fa32.parseFrom(bArr2);
                            }
                            gg22.f354030h.add(fa32);
                        }
                        return 0;
                    case 6:
                        gg22.f354031i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        gg22.f354032j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        gg22.f354033n = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        gg22.f354034o = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}

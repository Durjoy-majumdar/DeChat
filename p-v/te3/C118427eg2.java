package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eg2 */
public class C118427eg2 extends C47465a {

    /* renamed from: d */
    public String f353969d = "";

    /* renamed from: e */
    public long f353970e = 0;

    /* renamed from: f */
    public long f353971f = 0;

    /* renamed from: g */
    public String f353972g = "";

    /* renamed from: h */
    public LinkedList<C101777fg2> f353973h = new LinkedList<>();

    /* renamed from: i */
    public int f353974i = 1;

    /* renamed from: j */
    public LinkedList<C101777fg2> f353975j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<xr4> f353976n = new LinkedList<>();

    /* renamed from: o */
    public int f353977o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118427eg2)) {
            return false;
        }
        C118427eg2 eg22 = (C118427eg2) aVar;
        return C46238a.m51546a(this.f353969d, eg22.f353969d) && C46238a.m51546a(Long.valueOf(this.f353970e), Long.valueOf(eg22.f353970e)) && C46238a.m51546a(Long.valueOf(this.f353971f), Long.valueOf(eg22.f353971f)) && C46238a.m51546a(this.f353972g, eg22.f353972g) && C46238a.m51546a(this.f353973h, eg22.f353973h) && C46238a.m51546a(Integer.valueOf(this.f353974i), Integer.valueOf(eg22.f353974i)) && C46238a.m51546a(this.f353975j, eg22.f353975j) && C46238a.m51546a(this.f353976n, eg22.f353976n) && C46238a.m51546a(Integer.valueOf(this.f353977o), Integer.valueOf(eg22.f353977o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353969d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f353970e);
            aVar.mo74321h(3, this.f353971f);
            String str2 = this.f353972g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74320g(5, 8, this.f353973h);
            aVar.mo74318e(6, this.f353974i);
            aVar.mo74320g(7, 8, this.f353975j);
            aVar.mo74320g(8, 8, this.f353976n);
            aVar.mo74318e(9, this.f353977o);
            return 0;
        } else if (i == 1) {
            String str3 = this.f353969d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f353970e) + C52418a.m58681h(3, this.f353971f);
            String str4 = this.f353972g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            return h + C52418a.m58680g(5, 8, this.f353973h) + C52418a.m58678e(6, this.f353974i) + C52418a.m58680g(7, 8, this.f353975j) + C52418a.m58680g(8, 8, this.f353976n) + C52418a.m58678e(9, this.f353977o);
        } else if (i == 2) {
            this.f353973h.clear();
            this.f353975j.clear();
            this.f353976n.clear();
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
            C118427eg2 eg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eg22.f353969d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    eg22.f353970e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    eg22.f353971f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    eg22.f353972g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101777fg2 fg22 = new C101777fg2();
                        if (bArr != null && bArr.length > 0) {
                            fg22.parseFrom(bArr);
                        }
                        eg22.f353973h.add(fg22);
                    }
                    return 0;
                case 6:
                    eg22.f353974i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101777fg2 fg23 = new C101777fg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            fg23.parseFrom(bArr2);
                        }
                        eg22.f353975j.add(fg23);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        xr4 xr4 = new xr4();
                        if (bArr3 != null && bArr3.length > 0) {
                            xr4.parseFrom(bArr3);
                        }
                        eg22.f353976n.add(xr4);
                    }
                    return 0;
                case 9:
                    eg22.f353977o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

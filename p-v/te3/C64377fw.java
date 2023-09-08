package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fw */
public class C64377fw extends C47465a implements r54 {

    /* renamed from: d */
    public int f183230d;

    /* renamed from: e */
    public int f183231e;

    /* renamed from: f */
    public int f183232f;

    /* renamed from: g */
    public int f183233g;

    /* renamed from: h */
    public LinkedList<rc4> f183234h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<rc4> f183235i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<rc4> f183236j = new LinkedList<>();

    /* renamed from: n */
    public int f183237n;

    /* renamed from: o */
    public int f183238o;

    /* renamed from: p */
    public int f183239p;

    /* renamed from: q */
    public C48709ag2 f183240q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64377fw)) {
            return false;
        }
        C64377fw fwVar = (C64377fw) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183230d), Integer.valueOf(fwVar.f183230d)) && C46238a.m51546a(Integer.valueOf(this.f183231e), Integer.valueOf(fwVar.f183231e)) && C46238a.m51546a(Integer.valueOf(this.f183232f), Integer.valueOf(fwVar.f183232f)) && C46238a.m51546a(Integer.valueOf(this.f183233g), Integer.valueOf(fwVar.f183233g)) && C46238a.m51546a(this.f183234h, fwVar.f183234h) && C46238a.m51546a(this.f183235i, fwVar.f183235i) && C46238a.m51546a(this.f183236j, fwVar.f183236j) && C46238a.m51546a(Integer.valueOf(this.f183237n), Integer.valueOf(fwVar.f183237n)) && C46238a.m51546a(Integer.valueOf(this.f183238o), Integer.valueOf(fwVar.f183238o)) && C46238a.m51546a(Integer.valueOf(this.f183239p), Integer.valueOf(fwVar.f183239p)) && C46238a.m51546a(this.f183240q, fwVar.f183240q);
    }

    public final int getRet() {
        return this.f183230d;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183230d);
            aVar.mo74318e(2, this.f183231e);
            aVar.mo74318e(3, this.f183232f);
            aVar.mo74318e(4, this.f183233g);
            aVar.mo74320g(5, 8, this.f183234h);
            aVar.mo74320g(6, 8, this.f183235i);
            aVar.mo74320g(7, 8, this.f183236j);
            aVar.mo74318e(8, this.f183237n);
            aVar.mo74318e(9, this.f183238o);
            aVar.mo74318e(10, this.f183239p);
            C48709ag2 ag22 = this.f183240q;
            if (ag22 != null) {
                aVar.mo74322i(11, ag22.computeSize());
                this.f183240q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183230d) + 0 + C52418a.m58678e(2, this.f183231e) + C52418a.m58678e(3, this.f183232f) + C52418a.m58678e(4, this.f183233g) + C52418a.m58680g(5, 8, this.f183234h) + C52418a.m58680g(6, 8, this.f183235i) + C52418a.m58680g(7, 8, this.f183236j) + C52418a.m58678e(8, this.f183237n) + C52418a.m58678e(9, this.f183238o) + C52418a.m58678e(10, this.f183239p);
            C48709ag2 ag23 = this.f183240q;
            return ag23 != null ? e + C52418a.m58682i(11, ag23.computeSize()) : e;
        } else if (i == 2) {
            this.f183234h.clear();
            this.f183235i.clear();
            this.f183236j.clear();
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
            C64377fw fwVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fwVar.f183230d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    fwVar.f183231e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fwVar.f183232f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fwVar.f183233g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        rc4 rc4 = new rc4();
                        if (bArr != null && bArr.length > 0) {
                            rc4.parseFrom(bArr);
                        }
                        fwVar.f183234h.add(rc4);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        rc4 rc42 = new rc4();
                        if (bArr2 != null && bArr2.length > 0) {
                            rc42.parseFrom(bArr2);
                        }
                        fwVar.f183235i.add(rc42);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        rc4 rc43 = new rc4();
                        if (bArr3 != null && bArr3.length > 0) {
                            rc43.parseFrom(bArr3);
                        }
                        fwVar.f183236j.add(rc43);
                    }
                    return 0;
                case 8:
                    fwVar.f183237n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fwVar.f183238o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    fwVar.f183239p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C48709ag2 ag24 = new C48709ag2();
                        if (bArr4 != null && bArr4.length > 0) {
                            ag24.parseFrom(bArr4);
                        }
                        fwVar.f183240q = ag24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

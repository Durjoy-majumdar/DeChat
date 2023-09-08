package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n80 */
public class C50507n80 extends C47465a {

    /* renamed from: d */
    public int f138465d;

    /* renamed from: e */
    public int f138466e;

    /* renamed from: f */
    public String f138467f;

    /* renamed from: g */
    public C51018qv3 f138468g;

    /* renamed from: h */
    public int f138469h;

    /* renamed from: i */
    public LinkedList<C101754a80> f138470i = new LinkedList<>();

    /* renamed from: j */
    public int f138471j;

    /* renamed from: n */
    public LinkedList<C101824o80> f138472n = new LinkedList<>();

    /* renamed from: o */
    public int f138473o;

    /* renamed from: p */
    public LinkedList<C50363m70> f138474p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50507n80)) {
            return false;
        }
        C50507n80 n802 = (C50507n80) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138465d), Integer.valueOf(n802.f138465d)) && C46238a.m51546a(Integer.valueOf(this.f138466e), Integer.valueOf(n802.f138466e)) && C46238a.m51546a(this.f138467f, n802.f138467f) && C46238a.m51546a(this.f138468g, n802.f138468g) && C46238a.m51546a(Integer.valueOf(this.f138469h), Integer.valueOf(n802.f138469h)) && C46238a.m51546a(this.f138470i, n802.f138470i) && C46238a.m51546a(Integer.valueOf(this.f138471j), Integer.valueOf(n802.f138471j)) && C46238a.m51546a(this.f138472n, n802.f138472n) && C46238a.m51546a(Integer.valueOf(this.f138473o), Integer.valueOf(n802.f138473o)) && C46238a.m51546a(this.f138474p, n802.f138474p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138465d);
            aVar.mo74318e(2, this.f138466e);
            String str = this.f138467f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51018qv3 qv32 = this.f138468g;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f138468g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f138469h);
            aVar.mo74320g(6, 8, this.f138470i);
            aVar.mo74318e(7, this.f138471j);
            aVar.mo74320g(8, 8, this.f138472n);
            aVar.mo74318e(9, this.f138473o);
            aVar.mo74320g(10, 8, this.f138474p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138465d) + 0 + C52418a.m58678e(2, this.f138466e);
            String str2 = this.f138467f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51018qv3 qv33 = this.f138468g;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            return e + C52418a.m58678e(5, this.f138469h) + C52418a.m58680g(6, 8, this.f138470i) + C52418a.m58678e(7, this.f138471j) + C52418a.m58680g(8, 8, this.f138472n) + C52418a.m58678e(9, this.f138473o) + C52418a.m58680g(10, 8, this.f138474p);
        } else if (i == 2) {
            this.f138470i.clear();
            this.f138472n.clear();
            this.f138474p.clear();
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
            C50507n80 n802 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n802.f138465d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    n802.f138466e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n802.f138467f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        n802.f138468g = qv34;
                    }
                    return 0;
                case 5:
                    n802.f138469h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C101754a80 a802 = new C101754a80();
                        if (bArr2 != null && bArr2.length > 0) {
                            a802.parseFrom(bArr2);
                        }
                        n802.f138470i.add(a802);
                    }
                    return 0;
                case 7:
                    n802.f138471j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C101824o80 o802 = new C101824o80();
                        if (bArr3 != null && bArr3.length > 0) {
                            o802.parseFrom(bArr3);
                        }
                        n802.f138472n.add(o802);
                    }
                    return 0;
                case 9:
                    n802.f138473o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C50363m70 m702 = new C50363m70();
                        if (bArr4 != null && bArr4.length > 0) {
                            m702.parseFrom(bArr4);
                        }
                        n802.f138474p.add(m702);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

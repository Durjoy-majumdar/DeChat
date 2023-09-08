package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.zm2 */
public class C64885zm2 extends C47465a {

    /* renamed from: d */
    public String f186729d;

    /* renamed from: e */
    public String f186730e;

    /* renamed from: f */
    public float f186731f;

    /* renamed from: g */
    public int f186732g;

    /* renamed from: h */
    public LinkedList<Integer> f186733h = new LinkedList<>();

    /* renamed from: i */
    public int f186734i;

    /* renamed from: j */
    public LinkedList<C51163rv3> f186735j = new LinkedList<>();

    /* renamed from: n */
    public float f186736n;

    /* renamed from: o */
    public String f186737o;

    /* renamed from: p */
    public int f186738p;

    /* renamed from: q */
    public C51018qv3 f186739q;

    /* renamed from: r */
    public String f186740r;

    /* renamed from: s */
    public C51018qv3 f186741s;

    /* renamed from: t */
    public int f186742t;

    /* renamed from: u */
    public int f186743u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64885zm2)) {
            return false;
        }
        C64885zm2 zm22 = (C64885zm2) aVar;
        return C46238a.m51546a(this.f186729d, zm22.f186729d) && C46238a.m51546a(this.f186730e, zm22.f186730e) && C46238a.m51546a(Float.valueOf(this.f186731f), Float.valueOf(zm22.f186731f)) && C46238a.m51546a(Integer.valueOf(this.f186732g), Integer.valueOf(zm22.f186732g)) && C46238a.m51546a(this.f186733h, zm22.f186733h) && C46238a.m51546a(Integer.valueOf(this.f186734i), Integer.valueOf(zm22.f186734i)) && C46238a.m51546a(this.f186735j, zm22.f186735j) && C46238a.m51546a(Float.valueOf(this.f186736n), Float.valueOf(zm22.f186736n)) && C46238a.m51546a(this.f186737o, zm22.f186737o) && C46238a.m51546a(Integer.valueOf(this.f186738p), Integer.valueOf(zm22.f186738p)) && C46238a.m51546a(this.f186739q, zm22.f186739q) && C46238a.m51546a(this.f186740r, zm22.f186740r) && C46238a.m51546a(this.f186741s, zm22.f186741s) && C46238a.m51546a(Integer.valueOf(this.f186742t), Integer.valueOf(zm22.f186742t)) && C46238a.m51546a(Integer.valueOf(this.f186743u), Integer.valueOf(zm22.f186743u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186729d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186730e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74317d(3, this.f186731f);
            aVar.mo74318e(4, this.f186732g);
            aVar.mo74324k(5, 2, this.f186733h);
            aVar.mo74318e(6, this.f186734i);
            aVar.mo74320g(7, 8, this.f186735j);
            aVar.mo74317d(8, this.f186736n);
            String str3 = this.f186737o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f186738p);
            C51018qv3 qv32 = this.f186739q;
            if (qv32 != null) {
                aVar.mo74322i(11, qv32.computeSize());
                this.f186739q.writeFields(aVar);
            }
            String str4 = this.f186740r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            C51018qv3 qv33 = this.f186741s;
            if (qv33 != null) {
                aVar.mo74322i(13, qv33.computeSize());
                this.f186741s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f186742t);
            aVar.mo74318e(15, this.f186743u);
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f186729d;
            int j = str5 != null ? 0 + C52418a.m58683j(1, str5) : 0;
            String str6 = this.f186730e;
            if (str6 != null) {
                j += C52418a.m58683j(2, str6);
            }
            int d = j + C52418a.m58677d(3, this.f186731f) + C52418a.m58678e(4, this.f186732g) + C52418a.m58684k(5, 2, this.f186733h) + C52418a.m58678e(6, this.f186734i) + C52418a.m58680g(7, 8, this.f186735j) + C52418a.m58677d(8, this.f186736n);
            String str7 = this.f186737o;
            if (str7 != null) {
                d += C52418a.m58683j(9, str7);
            }
            int e = d + C52418a.m58678e(10, this.f186738p);
            C51018qv3 qv34 = this.f186739q;
            if (qv34 != null) {
                e += C52418a.m58682i(11, qv34.computeSize());
            }
            String str8 = this.f186740r;
            if (str8 != null) {
                e += C52418a.m58683j(12, str8);
            }
            C51018qv3 qv35 = this.f186741s;
            if (qv35 != null) {
                e += C52418a.m58682i(13, qv35.computeSize());
            }
            return e + C52418a.m58678e(14, this.f186742t) + C52418a.m58678e(15, this.f186743u);
        } else if (i2 == 2) {
            this.f186733h.clear();
            this.f186735j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64885zm2 zm22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zm22.f186729d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    zm22.f186730e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zm22.f186731f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    zm22.f186732g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    byte[] bArr = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr, 0, bArr.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    zm22.f186733h = linkedList;
                    return 0;
                case 6:
                    zm22.f186734i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        zm22.f186735j.add(rv32);
                    }
                    return 0;
                case 8:
                    zm22.f186736n = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    zm22.f186737o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    zm22.f186738p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv36.mo73348f(bArr3);
                        }
                        zm22.f186739q = qv36;
                    }
                    return 0;
                case 12:
                    zm22.f186740r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv37.mo73348f(bArr4);
                        }
                        zm22.f186741s = qv37;
                    }
                    return 0;
                case 14:
                    zm22.f186742t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    zm22.f186743u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

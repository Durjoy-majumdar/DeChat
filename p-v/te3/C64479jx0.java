package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jx0 */
public class C64479jx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f183843d;

    /* renamed from: e */
    public long f183844e;

    /* renamed from: f */
    public long f183845f;

    /* renamed from: g */
    public long f183846g;

    /* renamed from: h */
    public int f183847h;

    /* renamed from: i */
    public String f183848i;

    /* renamed from: j */
    public C51483u21 f183849j;

    /* renamed from: n */
    public int f183850n;

    /* renamed from: o */
    public int f183851o;

    /* renamed from: p */
    public String f183852p;

    /* renamed from: q */
    public long f183853q;

    /* renamed from: r */
    public C89349b f183854r;

    /* renamed from: s */
    public C51633v21 f183855s;

    /* renamed from: t */
    public int f183856t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64479jx0)) {
            return false;
        }
        C64479jx0 jx02 = (C64479jx0) aVar;
        return C46238a.m51546a(this.BaseRequest, jx02.BaseRequest) && C46238a.m51546a(this.f183843d, jx02.f183843d) && C46238a.m51546a(Long.valueOf(this.f183844e), Long.valueOf(jx02.f183844e)) && C46238a.m51546a(Long.valueOf(this.f183845f), Long.valueOf(jx02.f183845f)) && C46238a.m51546a(Long.valueOf(this.f183846g), Long.valueOf(jx02.f183846g)) && C46238a.m51546a(Integer.valueOf(this.f183847h), Integer.valueOf(jx02.f183847h)) && C46238a.m51546a(this.f183848i, jx02.f183848i) && C46238a.m51546a(this.f183849j, jx02.f183849j) && C46238a.m51546a(Integer.valueOf(this.f183850n), Integer.valueOf(jx02.f183850n)) && C46238a.m51546a(Integer.valueOf(this.f183851o), Integer.valueOf(jx02.f183851o)) && C46238a.m51546a(this.f183852p, jx02.f183852p) && C46238a.m51546a(Long.valueOf(this.f183853q), Long.valueOf(jx02.f183853q)) && C46238a.m51546a(this.f183854r, jx02.f183854r) && C46238a.m51546a(this.f183855s, jx02.f183855s) && C46238a.m51546a(Integer.valueOf(this.f183856t), Integer.valueOf(jx02.f183856t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f183843d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f183843d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f183844e);
            aVar.mo74321h(4, this.f183845f);
            aVar.mo74321h(5, this.f183846g);
            aVar.mo74318e(6, this.f183847h);
            String str = this.f183848i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            C51483u21 u212 = this.f183849j;
            if (u212 != null) {
                aVar.mo74322i(8, u212.computeSize());
                this.f183849j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f183850n);
            aVar.mo74318e(10, this.f183851o);
            String str2 = this.f183852p;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74321h(12, this.f183853q);
            C89349b bVar = this.f183854r;
            if (bVar != null) {
                aVar.mo74315b(13, bVar);
            }
            C51633v21 v212 = this.f183855s;
            if (v212 != null) {
                aVar.mo74322i(14, v212.computeSize());
                this.f183855s.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f183856t);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f183843d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i3 + C52418a.m58681h(3, this.f183844e) + C52418a.m58681h(4, this.f183845f) + C52418a.m58681h(5, this.f183846g) + C52418a.m58678e(6, this.f183847h);
            String str3 = this.f183848i;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            C51483u21 u213 = this.f183849j;
            if (u213 != null) {
                h += C52418a.m58682i(8, u213.computeSize());
            }
            int e = h + C52418a.m58678e(9, this.f183850n) + C52418a.m58678e(10, this.f183851o);
            String str4 = this.f183852p;
            if (str4 != null) {
                e += C52418a.m58683j(11, str4);
            }
            int h2 = e + C52418a.m58681h(12, this.f183853q);
            C89349b bVar2 = this.f183854r;
            if (bVar2 != null) {
                h2 += C52418a.m58675b(13, bVar2);
            }
            C51633v21 v213 = this.f183855s;
            if (v213 != null) {
                h2 += C52418a.m58682i(14, v213.computeSize());
            }
            return h2 + C52418a.m58678e(15, this.f183856t);
        } else if (i2 == 2) {
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
            C64479jx0 jx02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        jx02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        jx02.f183843d = ig04;
                    }
                    return 0;
                case 3:
                    jx02.f183844e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    jx02.f183845f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    jx02.f183846g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    jx02.f183847h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jx02.f183848i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51483u21 u214 = new C51483u21();
                        if (bArr3 != null && bArr3.length > 0) {
                            u214.parseFrom(bArr3);
                        }
                        jx02.f183849j = u214;
                    }
                    return 0;
                case 9:
                    jx02.f183850n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jx02.f183851o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jx02.f183852p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jx02.f183853q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    jx02.f183854r = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51633v21 v214 = new C51633v21();
                        if (bArr4 != null && bArr4.length > 0) {
                            v214.parseFrom(bArr4);
                        }
                        jx02.f183855s = v214;
                    }
                    return 0;
                case 15:
                    jx02.f183856t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lg1 */
public class C50259lg1 extends C47465a {

    /* renamed from: d */
    public int f137398d;

    /* renamed from: e */
    public String f137399e;

    /* renamed from: f */
    public LinkedList<Integer> f137400f = new LinkedList<>();

    /* renamed from: g */
    public C51286sr0 f137401g;

    /* renamed from: h */
    public C50099k93 f137402h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50259lg1)) {
            return false;
        }
        C50259lg1 lg12 = (C50259lg1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137398d), Integer.valueOf(lg12.f137398d)) && C46238a.m51546a(this.f137399e, lg12.f137399e) && C46238a.m51546a(this.f137400f, lg12.f137400f) && C46238a.m51546a(this.f137401g, lg12.f137401g) && C46238a.m51546a(this.f137402h, lg12.f137402h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137398d);
            String str = this.f137399e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f137400f);
            C51286sr0 sr02 = this.f137401g;
            if (sr02 != null) {
                aVar.mo74322i(4, sr02.computeSize());
                this.f137401g.writeFields(aVar);
            }
            C50099k93 k932 = this.f137402h;
            if (k932 != null) {
                aVar.mo74322i(5, k932.computeSize());
                this.f137402h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137398d) + 0;
            String str2 = this.f137399e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            int g = e + C52418a.m58680g(3, 2, this.f137400f);
            C51286sr0 sr03 = this.f137401g;
            if (sr03 != null) {
                g += C52418a.m58682i(4, sr03.computeSize());
            }
            C50099k93 k933 = this.f137402h;
            return k933 != null ? g + C52418a.m58682i(5, k933.computeSize()) : g;
        } else if (i == 2) {
            this.f137400f.clear();
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
            C50259lg1 lg12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lg12.f137398d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                lg12.f137399e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lg12.f137400f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51286sr0 sr04 = new C51286sr0();
                    if (bArr != null && bArr.length > 0) {
                        sr04.parseFrom(bArr);
                    }
                    lg12.f137401g = sr04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50099k93 k934 = new C50099k93();
                    if (bArr2 != null && bArr2.length > 0) {
                        k934.parseFrom(bArr2);
                    }
                    lg12.f137402h = k934;
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uw0 */
public class C64760uw0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51601uv> f185795d = new LinkedList<>();

    /* renamed from: e */
    public String f185796e;

    /* renamed from: f */
    public int f185797f;

    /* renamed from: g */
    public LinkedList<C64740tw0> f185798g = new LinkedList<>();

    /* renamed from: h */
    public String f185799h;

    /* renamed from: i */
    public int f185800i;

    /* renamed from: j */
    public boolean f185801j;

    /* renamed from: n */
    public int f185802n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64760uw0)) {
            return false;
        }
        C64760uw0 uw02 = (C64760uw0) aVar;
        return C46238a.m51546a(this.f185795d, uw02.f185795d) && C46238a.m51546a(this.f185796e, uw02.f185796e) && C46238a.m51546a(Integer.valueOf(this.f185797f), Integer.valueOf(uw02.f185797f)) && C46238a.m51546a(this.f185798g, uw02.f185798g) && C46238a.m51546a(this.f185799h, uw02.f185799h) && C46238a.m51546a(Integer.valueOf(this.f185800i), Integer.valueOf(uw02.f185800i)) && C46238a.m51546a(Boolean.valueOf(this.f185801j), Boolean.valueOf(uw02.f185801j)) && C46238a.m51546a(Integer.valueOf(this.f185802n), Integer.valueOf(uw02.f185802n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f185795d);
            String str = this.f185796e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f185797f);
            aVar.mo74320g(4, 8, this.f185798g);
            String str2 = this.f185799h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f185800i);
            aVar.mo74314a(7, this.f185801j);
            aVar.mo74318e(100, this.f185802n);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f185795d) + 0;
            String str3 = this.f185796e;
            if (str3 != null) {
                g += C52418a.m58683j(2, str3);
            }
            int e = g + C52418a.m58678e(3, this.f185797f) + C52418a.m58680g(4, 8, this.f185798g);
            String str4 = this.f185799h;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f185800i) + C52418a.m58674a(7, this.f185801j) + C52418a.m58678e(100, this.f185802n);
        } else if (i == 2) {
            this.f185795d.clear();
            this.f185798g.clear();
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
            C64760uw0 uw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C51601uv uvVar = new C51601uv();
                            if (bArr != null && bArr.length > 0) {
                                uvVar.parseFrom(bArr);
                            }
                            uw02.f185795d.add(uvVar);
                        }
                        return 0;
                    case 2:
                        uw02.f185796e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        uw02.f185797f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            byte[] bArr2 = j2.get(i3);
                            C64740tw0 tw02 = new C64740tw0();
                            if (bArr2 != null && bArr2.length > 0) {
                                tw02.parseFrom(bArr2);
                            }
                            uw02.f185798g.add(tw02);
                        }
                        return 0;
                    case 5:
                        uw02.f185799h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        uw02.f185800i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        uw02.f185801j = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                uw02.f185802n = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

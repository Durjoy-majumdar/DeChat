package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pd0 */
public class C50812pd0 extends C47465a {

    /* renamed from: d */
    public int f139701d;

    /* renamed from: e */
    public String f139702e;

    /* renamed from: f */
    public LinkedList<C49544gd0> f139703f = new LinkedList<>();

    /* renamed from: g */
    public C49544gd0 f139704g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50812pd0)) {
            return false;
        }
        C50812pd0 pd02 = (C50812pd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139701d), Integer.valueOf(pd02.f139701d)) && C46238a.m51546a(this.f139702e, pd02.f139702e) && C46238a.m51546a(this.f139703f, pd02.f139703f) && C46238a.m51546a(this.f139704g, pd02.f139704g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139701d);
            String str = this.f139702e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f139703f);
            C49544gd0 gd02 = this.f139704g;
            if (gd02 != null) {
                aVar.mo74322i(4, gd02.computeSize());
                this.f139704g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139701d) + 0;
            String str2 = this.f139702e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            int g = e + C52418a.m58680g(3, 8, this.f139703f);
            C49544gd0 gd03 = this.f139704g;
            return gd03 != null ? g + C52418a.m58682i(4, gd03.computeSize()) : g;
        } else if (i == 2) {
            this.f139703f.clear();
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
            C50812pd0 pd02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pd02.f139701d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pd02.f139702e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49544gd0 gd04 = new C49544gd0();
                    if (bArr != null && bArr.length > 0) {
                        gd04.parseFrom(bArr);
                    }
                    pd02.f139703f.add(gd04);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49544gd0 gd05 = new C49544gd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gd05.parseFrom(bArr2);
                    }
                    pd02.f139704g = gd05;
                }
                return 0;
            }
        }
    }
}

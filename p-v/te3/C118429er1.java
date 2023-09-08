package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.er1 */
public class C118429er1 extends C47465a {

    /* renamed from: d */
    public String f353985d;

    /* renamed from: e */
    public long f353986e = -1;

    /* renamed from: f */
    public long f353987f = 0;

    /* renamed from: g */
    public LinkedList<C101777fg2> f353988g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<xr4> f353989h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118429er1)) {
            return false;
        }
        C118429er1 er12 = (C118429er1) aVar;
        return C46238a.m51546a(this.f353985d, er12.f353985d) && C46238a.m51546a(Long.valueOf(this.f353986e), Long.valueOf(er12.f353986e)) && C46238a.m51546a(Long.valueOf(this.f353987f), Long.valueOf(er12.f353987f)) && C46238a.m51546a(this.f353988g, er12.f353988g) && C46238a.m51546a(this.f353989h, er12.f353989h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353985d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f353986e);
            aVar.mo74321h(3, this.f353987f);
            aVar.mo74320g(4, 8, this.f353988g);
            aVar.mo74320g(5, 8, this.f353989h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f353985d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f353986e) + C52418a.m58681h(3, this.f353987f) + C52418a.m58680g(4, 8, this.f353988g) + C52418a.m58680g(5, 8, this.f353989h);
        } else if (i == 2) {
            this.f353988g.clear();
            this.f353989h.clear();
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
            C118429er1 er12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                er12.f353985d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                er12.f353986e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                er12.f353987f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101777fg2 fg22 = new C101777fg2();
                    if (bArr != null && bArr.length > 0) {
                        fg22.parseFrom(bArr);
                    }
                    er12.f353988g.add(fg22);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    xr4 xr4 = new xr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        xr4.parseFrom(bArr2);
                    }
                    er12.f353989h.add(xr4);
                }
                return 0;
            }
        }
    }
}

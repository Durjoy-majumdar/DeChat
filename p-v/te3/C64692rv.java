package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rv */
public class C64692rv extends C47465a {

    /* renamed from: d */
    public String f185300d;

    /* renamed from: e */
    public String f185301e;

    /* renamed from: f */
    public LinkedList<C64731tl2> f185302f = new LinkedList<>();

    /* renamed from: g */
    public C77935gl2 f185303g;

    /* renamed from: h */
    public C77935gl2 f185304h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64692rv)) {
            return false;
        }
        C64692rv rvVar = (C64692rv) aVar;
        return C46238a.m51546a(this.f185300d, rvVar.f185300d) && C46238a.m51546a(this.f185301e, rvVar.f185301e) && C46238a.m51546a(this.f185302f, rvVar.f185302f) && C46238a.m51546a(this.f185303g, rvVar.f185303g) && C46238a.m51546a(this.f185304h, rvVar.f185304h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185300d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185301e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f185302f);
            C77935gl2 gl22 = this.f185303g;
            if (gl22 != null) {
                aVar.mo74322i(4, gl22.computeSize());
                this.f185303g.writeFields(aVar);
            }
            C77935gl2 gl23 = this.f185304h;
            if (gl23 != null) {
                aVar.mo74322i(5, gl23.computeSize());
                this.f185304h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185300d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185301e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f185302f);
            C77935gl2 gl24 = this.f185303g;
            if (gl24 != null) {
                g += C52418a.m58682i(4, gl24.computeSize());
            }
            C77935gl2 gl25 = this.f185304h;
            return gl25 != null ? g + C52418a.m58682i(5, gl25.computeSize()) : g;
        } else if (i == 2) {
            this.f185302f.clear();
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
            C64692rv rvVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rvVar.f185300d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rvVar.f185301e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64731tl2 tl22 = new C64731tl2();
                    if (bArr != null && bArr.length > 0) {
                        tl22.parseFrom(bArr);
                    }
                    rvVar.f185302f.add(tl22);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77935gl2 gl26 = new C77935gl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        gl26.parseFrom(bArr2);
                    }
                    rvVar.f185303g = gl26;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C77935gl2 gl27 = new C77935gl2();
                    if (bArr3 != null && bArr3.length > 0) {
                        gl27.parseFrom(bArr3);
                    }
                    rvVar.f185304h = gl27;
                }
                return 0;
            }
        }
    }
}

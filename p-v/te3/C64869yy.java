package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yy */
public class C64869yy extends C47465a {

    /* renamed from: d */
    public C64346ep3 f186610d;

    /* renamed from: e */
    public LinkedList<C64339ea> f186611e = new LinkedList<>();

    /* renamed from: f */
    public boolean f186612f;

    /* renamed from: g */
    public C64346ep3 f186613g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64869yy)) {
            return false;
        }
        C64869yy yyVar = (C64869yy) aVar;
        return C46238a.m51546a(this.f186610d, yyVar.f186610d) && C46238a.m51546a(this.f186611e, yyVar.f186611e) && C46238a.m51546a(Boolean.valueOf(this.f186612f), Boolean.valueOf(yyVar.f186612f)) && C46238a.m51546a(this.f186613g, yyVar.f186613g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64346ep3 ep32 = this.f186610d;
            if (ep32 != null) {
                aVar.mo74322i(1, ep32.computeSize());
                this.f186610d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f186611e);
            aVar.mo74314a(3, this.f186612f);
            C64346ep3 ep33 = this.f186613g;
            if (ep33 != null) {
                aVar.mo74322i(4, ep33.computeSize());
                this.f186613g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64346ep3 ep34 = this.f186610d;
            if (ep34 != null) {
                i2 = 0 + C52418a.m58682i(1, ep34.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f186611e) + C52418a.m58674a(3, this.f186612f);
            C64346ep3 ep35 = this.f186613g;
            return ep35 != null ? g + C52418a.m58682i(4, ep35.computeSize()) : g;
        } else if (i == 2) {
            this.f186611e.clear();
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
            C64869yy yyVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64346ep3 ep36 = new C64346ep3();
                    if (bArr != null && bArr.length > 0) {
                        ep36.parseFrom(bArr);
                    }
                    yyVar.f186610d = ep36;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64339ea eaVar = new C64339ea();
                    if (bArr2 != null && bArr2.length > 0) {
                        eaVar.parseFrom(bArr2);
                    }
                    yyVar.f186611e.add(eaVar);
                }
                return 0;
            } else if (intValue == 3) {
                yyVar.f186612f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64346ep3 ep37 = new C64346ep3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ep37.parseFrom(bArr3);
                    }
                    yyVar.f186613g = ep37;
                }
                return 0;
            }
        }
    }
}

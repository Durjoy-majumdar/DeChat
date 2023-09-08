package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sj */
public class C77995sj extends C47465a {

    /* renamed from: d */
    public LinkedList<C77912ce0> f228220d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C77907be0> f228221e = new LinkedList<>();

    /* renamed from: f */
    public String f228222f;

    /* renamed from: g */
    public String f228223g;

    /* renamed from: h */
    public String f228224h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77995sj)) {
            return false;
        }
        C77995sj sjVar = (C77995sj) aVar;
        return C46238a.m51546a(this.f228220d, sjVar.f228220d) && C46238a.m51546a(this.f228221e, sjVar.f228221e) && C46238a.m51546a(this.f228222f, sjVar.f228222f) && C46238a.m51546a(this.f228223g, sjVar.f228223g) && C46238a.m51546a(this.f228224h, sjVar.f228224h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f228220d);
            aVar.mo74320g(2, 8, this.f228221e);
            String str = this.f228222f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f228223g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f228224h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f228220d) + 0 + C52418a.m58680g(2, 8, this.f228221e);
            String str4 = this.f228222f;
            if (str4 != null) {
                g += C52418a.m58683j(3, str4);
            }
            String str5 = this.f228223g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f228224h;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f228220d.clear();
            this.f228221e.clear();
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
            C77995sj sjVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77912ce0 ce02 = new C77912ce0();
                    if (bArr != null && bArr.length > 0) {
                        ce02.parseFrom(bArr);
                    }
                    sjVar.f228220d.add(ce02);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C77907be0 be02 = new C77907be0();
                    if (bArr2 != null && bArr2.length > 0) {
                        be02.parseFrom(bArr2);
                    }
                    sjVar.f228221e.add(be02);
                }
                return 0;
            } else if (intValue == 3) {
                sjVar.f228222f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                sjVar.f228223g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sjVar.f228224h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

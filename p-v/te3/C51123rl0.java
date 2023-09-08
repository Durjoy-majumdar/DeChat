package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rl0 */
public class C51123rl0 extends C47465a {

    /* renamed from: d */
    public String f140993d;

    /* renamed from: e */
    public String f140994e;

    /* renamed from: f */
    public String f140995f;

    /* renamed from: g */
    public C51261sl0 f140996g;

    /* renamed from: h */
    public LinkedList<C50845pl0> f140997h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51123rl0)) {
            return false;
        }
        C51123rl0 rl02 = (C51123rl0) aVar;
        return C46238a.m51546a(this.f140993d, rl02.f140993d) && C46238a.m51546a(this.f140994e, rl02.f140994e) && C46238a.m51546a(this.f140995f, rl02.f140995f) && C46238a.m51546a(this.f140996g, rl02.f140996g) && C46238a.m51546a(this.f140997h, rl02.f140997h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140993d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140994e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f140995f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C51261sl0 sl02 = this.f140996g;
            if (sl02 != null) {
                aVar.mo74322i(4, sl02.computeSize());
                this.f140996g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f140997h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f140993d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f140994e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f140995f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C51261sl0 sl03 = this.f140996g;
            if (sl03 != null) {
                i2 += C52418a.m58682i(4, sl03.computeSize());
            }
            return i2 + C52418a.m58680g(5, 8, this.f140997h);
        } else if (i == 2) {
            this.f140997h.clear();
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
            C51123rl0 rl02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rl02.f140993d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rl02.f140994e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rl02.f140995f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51261sl0 sl04 = new C51261sl0();
                    if (bArr != null && bArr.length > 0) {
                        sl04.parseFrom(bArr);
                    }
                    rl02.f140996g = sl04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50845pl0 pl02 = new C50845pl0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pl02.parseFrom(bArr2);
                    }
                    rl02.f140997h.add(pl02);
                }
                return 0;
            }
        }
    }
}

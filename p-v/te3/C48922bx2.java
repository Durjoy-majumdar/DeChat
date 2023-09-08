package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bx2 */
public class C48922bx2 extends C47465a {

    /* renamed from: d */
    public String f131369d;

    /* renamed from: e */
    public String f131370e;

    /* renamed from: f */
    public LinkedList<C52172yv> f131371f = new LinkedList<>();

    /* renamed from: g */
    public String f131372g;

    /* renamed from: h */
    public String f131373h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48922bx2)) {
            return false;
        }
        C48922bx2 bx22 = (C48922bx2) aVar;
        return C46238a.m51546a(this.f131369d, bx22.f131369d) && C46238a.m51546a(this.f131370e, bx22.f131370e) && C46238a.m51546a(this.f131371f, bx22.f131371f) && C46238a.m51546a(this.f131372g, bx22.f131372g) && C46238a.m51546a(this.f131373h, bx22.f131373h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131369d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131370e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f131371f);
            String str3 = this.f131372g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f131373h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f131369d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f131370e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f131371f);
            String str7 = this.f131372g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f131373h;
            return str8 != null ? g + C52418a.m58683j(5, str8) : g;
        } else if (i == 2) {
            this.f131371f.clear();
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
            C48922bx2 bx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bx22.f131369d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bx22.f131370e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52172yv yvVar = new C52172yv();
                    if (bArr != null && bArr.length > 0) {
                        yvVar.parseFrom(bArr);
                    }
                    bx22.f131371f.add(yvVar);
                }
                return 0;
            } else if (intValue == 4) {
                bx22.f131372g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bx22.f131373h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

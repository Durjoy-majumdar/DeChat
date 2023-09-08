package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c23 */
public class C48944c23 extends C47465a {

    /* renamed from: d */
    public String f131466d;

    /* renamed from: e */
    public String f131467e;

    /* renamed from: f */
    public String f131468f;

    /* renamed from: g */
    public C64488kb1 f131469g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48944c23)) {
            return false;
        }
        C48944c23 c232 = (C48944c23) aVar;
        return C46238a.m51546a(this.f131466d, c232.f131466d) && C46238a.m51546a(this.f131467e, c232.f131467e) && C46238a.m51546a(this.f131468f, c232.f131468f) && C46238a.m51546a(this.f131469g, c232.f131469g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131466d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131467e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131468f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C64488kb1 kb12 = this.f131469g;
            if (kb12 != null) {
                aVar.mo74322i(4, kb12.computeSize());
                this.f131469g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f131466d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f131467e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f131468f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C64488kb1 kb13 = this.f131469g;
            return kb13 != null ? i2 + C52418a.m58682i(4, kb13.computeSize()) : i2;
        } else if (i == 2) {
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
            C48944c23 c232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c232.f131466d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                c232.f131467e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                c232.f131468f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64488kb1 kb14 = new C64488kb1();
                    if (bArr != null && bArr.length > 0) {
                        kb14.parseFrom(bArr);
                    }
                    c232.f131469g = kb14;
                }
                return 0;
            }
        }
    }
}

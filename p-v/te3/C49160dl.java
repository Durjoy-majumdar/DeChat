package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dl */
public class C49160dl extends C47465a {

    /* renamed from: d */
    public long f132387d;

    /* renamed from: e */
    public String f132388e;

    /* renamed from: f */
    public LinkedList<C49016cl> f132389f = new LinkedList<>();

    /* renamed from: g */
    public String f132390g;

    /* renamed from: h */
    public String f132391h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49160dl)) {
            return false;
        }
        C49160dl dlVar = (C49160dl) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132387d), Long.valueOf(dlVar.f132387d)) && C46238a.m51546a(this.f132388e, dlVar.f132388e) && C46238a.m51546a(this.f132389f, dlVar.f132389f) && C46238a.m51546a(this.f132390g, dlVar.f132390g) && C46238a.m51546a(this.f132391h, dlVar.f132391h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132387d);
            String str = this.f132388e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f132389f);
            String str2 = this.f132390g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f132391h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132387d) + 0;
            String str4 = this.f132388e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int g = h + C52418a.m58680g(3, 8, this.f132389f);
            String str5 = this.f132390g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f132391h;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f132389f.clear();
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
            C49160dl dlVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dlVar.f132387d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                dlVar.f132388e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49016cl clVar = new C49016cl();
                    if (bArr != null && bArr.length > 0) {
                        clVar.parseFrom(bArr);
                    }
                    dlVar.f132389f.add(clVar);
                }
                return 0;
            } else if (intValue == 4) {
                dlVar.f132390g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dlVar.f132391h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

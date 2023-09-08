package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n70 */
public class C50504n70 extends C47465a {

    /* renamed from: d */
    public u35 f138451d;

    /* renamed from: e */
    public long f138452e;

    /* renamed from: f */
    public long f138453f;

    /* renamed from: g */
    public String f138454g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50504n70)) {
            return false;
        }
        C50504n70 n702 = (C50504n70) aVar;
        return C46238a.m51546a(this.f138451d, n702.f138451d) && C46238a.m51546a(Long.valueOf(this.f138452e), Long.valueOf(n702.f138452e)) && C46238a.m51546a(Long.valueOf(this.f138453f), Long.valueOf(n702.f138453f)) && C46238a.m51546a(this.f138454g, n702.f138454g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            u35 u35 = this.f138451d;
            if (u35 != null) {
                aVar.mo74322i(1, u35.computeSize());
                this.f138451d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f138452e);
            aVar.mo74321h(3, this.f138453f);
            String str = this.f138454g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            u35 u352 = this.f138451d;
            if (u352 != null) {
                i2 = 0 + C52418a.m58682i(1, u352.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f138452e) + C52418a.m58681h(3, this.f138453f);
            String str2 = this.f138454g;
            return str2 != null ? h + C52418a.m58683j(4, str2) : h;
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
            C50504n70 n702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    u35 u353 = new u35();
                    if (bArr != null && bArr.length > 0) {
                        u353.parseFrom(bArr);
                    }
                    n702.f138451d = u353;
                }
                return 0;
            } else if (intValue == 2) {
                n702.f138452e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                n702.f138453f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n702.f138454g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

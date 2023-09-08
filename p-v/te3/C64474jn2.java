package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jn2 */
public class C64474jn2 extends C47465a {

    /* renamed from: d */
    public C64483k33 f183814d;

    /* renamed from: e */
    public LinkedList<C64448in2> f183815e = new LinkedList<>();

    /* renamed from: f */
    public C64402gn2 f183816f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64474jn2)) {
            return false;
        }
        C64474jn2 jn22 = (C64474jn2) aVar;
        return C46238a.m51546a(this.f183814d, jn22.f183814d) && C46238a.m51546a(this.f183815e, jn22.f183815e) && C46238a.m51546a(this.f183816f, jn22.f183816f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64483k33 k332 = this.f183814d;
            if (k332 != null) {
                aVar.mo74322i(1, k332.computeSize());
                this.f183814d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f183815e);
            C64402gn2 gn22 = this.f183816f;
            if (gn22 != null) {
                aVar.mo74322i(3, gn22.computeSize());
                this.f183816f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64483k33 k333 = this.f183814d;
            if (k333 != null) {
                i2 = 0 + C52418a.m58682i(1, k333.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f183815e);
            C64402gn2 gn23 = this.f183816f;
            return gn23 != null ? g + C52418a.m58682i(3, gn23.computeSize()) : g;
        } else if (i == 2) {
            this.f183815e.clear();
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
            C64474jn2 jn22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64483k33 k334 = new C64483k33();
                    if (bArr != null && bArr.length > 0) {
                        k334.parseFrom(bArr);
                    }
                    jn22.f183814d = k334;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64448in2 in22 = new C64448in2();
                    if (bArr2 != null && bArr2.length > 0) {
                        in22.parseFrom(bArr2);
                    }
                    jn22.f183815e.add(in22);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64402gn2 gn24 = new C64402gn2();
                    if (bArr3 != null && bArr3.length > 0) {
                        gn24.parseFrom(bArr3);
                    }
                    jn22.f183816f = gn24;
                }
                return 0;
            }
        }
    }
}

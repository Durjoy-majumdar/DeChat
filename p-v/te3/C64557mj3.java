package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mj3 */
public class C64557mj3 extends C47465a {

    /* renamed from: d */
    public long f184338d;

    /* renamed from: e */
    public long f184339e;

    /* renamed from: f */
    public C77977pf3 f184340f;

    /* renamed from: g */
    public LinkedList<String> f184341g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64557mj3)) {
            return false;
        }
        C64557mj3 mj32 = (C64557mj3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184338d), Long.valueOf(mj32.f184338d)) && C46238a.m51546a(Long.valueOf(this.f184339e), Long.valueOf(mj32.f184339e)) && C46238a.m51546a(this.f184340f, mj32.f184340f) && C46238a.m51546a(this.f184341g, mj32.f184341g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184338d);
            aVar.mo74321h(2, this.f184339e);
            C77977pf3 pf32 = this.f184340f;
            if (pf32 != null) {
                aVar.mo74322i(3, pf32.computeSize());
                this.f184340f.writeFields(aVar);
            }
            aVar.mo74320g(4, 1, this.f184341g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184338d) + 0 + C52418a.m58681h(2, this.f184339e);
            C77977pf3 pf33 = this.f184340f;
            if (pf33 != null) {
                h += C52418a.m58682i(3, pf33.computeSize());
            }
            return h + C52418a.m58680g(4, 1, this.f184341g);
        } else if (i == 2) {
            this.f184341g.clear();
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
            C64557mj3 mj32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mj32.f184338d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                mj32.f184339e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77977pf3 pf34 = new C77977pf3();
                    if (bArr != null && bArr.length > 0) {
                        pf34.parseFrom(bArr);
                    }
                    mj32.f184340f = pf34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mj32.f184341g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}

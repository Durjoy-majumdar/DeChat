package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c35 extends C47465a {

    /* renamed from: d */
    public int f131485d;

    /* renamed from: e */
    public e35 f131486e;

    /* renamed from: f */
    public long f131487f;

    /* renamed from: g */
    public int f131488g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c35)) {
            return false;
        }
        c35 c35 = (c35) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131485d), Integer.valueOf(c35.f131485d)) && C46238a.m51546a(this.f131486e, c35.f131486e) && C46238a.m51546a(Long.valueOf(this.f131487f), Long.valueOf(c35.f131487f)) && C46238a.m51546a(Integer.valueOf(this.f131488g), Integer.valueOf(c35.f131488g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131485d);
            e35 e35 = this.f131486e;
            if (e35 != null) {
                aVar.mo74322i(2, e35.computeSize());
                this.f131486e.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f131487f);
            aVar.mo74318e(4, this.f131488g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131485d) + 0;
            e35 e352 = this.f131486e;
            if (e352 != null) {
                e += C52418a.m58682i(2, e352.computeSize());
            }
            return e + C52418a.m58681h(3, this.f131487f) + C52418a.m58678e(4, this.f131488g);
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
            c35 c35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c35.f131485d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    e35 e353 = new e35();
                    if (bArr != null && bArr.length > 0) {
                        e353.parseFrom(bArr);
                    }
                    c35.f131486e = e353;
                }
                return 0;
            } else if (intValue == 3) {
                c35.f131487f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c35.f131488g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

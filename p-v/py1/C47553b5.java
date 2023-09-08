package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.b5 */
public class C47553b5 extends C47465a {

    /* renamed from: d */
    public long f127606d;

    /* renamed from: e */
    public long f127607e;

    /* renamed from: f */
    public C47691v4 f127608f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47553b5)) {
            return false;
        }
        C47553b5 b5Var = (C47553b5) aVar;
        return C46238a.m51546a(Long.valueOf(this.f127606d), Long.valueOf(b5Var.f127606d)) && C46238a.m51546a(Long.valueOf(this.f127607e), Long.valueOf(b5Var.f127607e)) && C46238a.m51546a(this.f127608f, b5Var.f127608f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127608f != null) {
                aVar.mo74321h(1, this.f127606d);
                aVar.mo74321h(2, this.f127607e);
                C47691v4 v4Var = this.f127608f;
                if (v4Var != null) {
                    aVar.mo74322i(3, v4Var.computeSize());
                    this.f127608f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Tab");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f127606d) + 0 + C52418a.m58681h(2, this.f127607e);
            C47691v4 v4Var2 = this.f127608f;
            return v4Var2 != null ? h + C52418a.m58682i(3, v4Var2.computeSize()) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127608f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Tab");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47553b5 b5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b5Var.f127606d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                b5Var.f127607e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47691v4 v4Var3 = new C47691v4();
                    if (bArr != null && bArr.length > 0) {
                        v4Var3.parseFrom(bArr);
                    }
                    b5Var.f127608f = v4Var3;
                }
                return 0;
            }
        }
    }
}

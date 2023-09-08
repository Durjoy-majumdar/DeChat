package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qv1 */
public class C51017qv1 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f140569d = new LinkedList<>();

    /* renamed from: e */
    public C77963l1 f140570e;

    /* renamed from: f */
    public String f140571f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51017qv1)) {
            return false;
        }
        C51017qv1 qv12 = (C51017qv1) aVar;
        return C46238a.m51546a(this.f140569d, qv12.f140569d) && C46238a.m51546a(this.f140570e, qv12.f140570e) && C46238a.m51546a(this.f140571f, qv12.f140571f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f140569d);
            C77963l1 l1Var = this.f140570e;
            if (l1Var != null) {
                aVar.mo74322i(2, l1Var.computeSize());
                this.f140570e.writeFields(aVar);
            }
            String str = this.f140571f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f140569d) + 0;
            C77963l1 l1Var2 = this.f140570e;
            if (l1Var2 != null) {
                g += C52418a.m58682i(2, l1Var2.computeSize());
            }
            String str2 = this.f140571f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f140569d.clear();
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
            C51017qv1 qv12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qv12.f140569d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77963l1 l1Var3 = new C77963l1();
                    if (bArr != null && bArr.length > 0) {
                        l1Var3.parseFrom(bArr);
                    }
                    qv12.f140570e = l1Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qv12.f140571f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

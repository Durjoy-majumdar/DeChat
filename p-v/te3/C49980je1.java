package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.je1 */
public class C49980je1 extends C47465a {

    /* renamed from: d */
    public C50141kk1 f136045d;

    /* renamed from: e */
    public LinkedList<FinderObject> f136046e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49980je1)) {
            return false;
        }
        C49980je1 je12 = (C49980je1) aVar;
        return C46238a.m51546a(this.f136045d, je12.f136045d) && C46238a.m51546a(this.f136046e, je12.f136046e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50141kk1 kk12 = this.f136045d;
            if (kk12 != null) {
                aVar.mo74322i(1, kk12.computeSize());
                this.f136045d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f136046e);
            return 0;
        } else if (i == 1) {
            C50141kk1 kk13 = this.f136045d;
            if (kk13 != null) {
                i2 = 0 + C52418a.m58682i(1, kk13.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f136046e);
        } else if (i == 2) {
            this.f136046e.clear();
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
            C49980je1 je12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50141kk1 kk14 = new C50141kk1();
                    if (bArr != null && bArr.length > 0) {
                        kk14.parseFrom(bArr);
                    }
                    je12.f136045d = kk14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject.parseFrom(bArr2);
                    }
                    je12.f136046e.add(finderObject);
                }
                return 0;
            }
        }
    }
}

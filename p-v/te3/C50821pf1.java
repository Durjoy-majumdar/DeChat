package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pf1 */
public class C50821pf1 extends C47465a {

    /* renamed from: d */
    public FinderObject f139743d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50821pf1) && C46238a.m51546a(this.f139743d, ((C50821pf1) aVar).f139743d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f139743d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f139743d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f139743d;
            if (finderObject2 != null) {
                return 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            return 0;
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
            C50821pf1 pf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                FinderObject finderObject3 = new FinderObject();
                if (bArr != null && bArr.length > 0) {
                    finderObject3.parseFrom(bArr);
                }
                pf12.f139743d = finderObject3;
            }
            return 0;
        }
    }
}

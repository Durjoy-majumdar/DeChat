package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oc1 */
public class C50661oc1 extends C47465a {

    /* renamed from: d */
    public int f139087d;

    /* renamed from: e */
    public FinderObject f139088e;

    /* renamed from: f */
    public C51700vj0 f139089f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50661oc1)) {
            return false;
        }
        C50661oc1 oc12 = (C50661oc1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139087d), Integer.valueOf(oc12.f139087d)) && C46238a.m51546a(this.f139088e, oc12.f139088e) && C46238a.m51546a(this.f139089f, oc12.f139089f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139087d);
            FinderObject finderObject = this.f139088e;
            if (finderObject != null) {
                aVar.mo74322i(2, finderObject.computeSize());
                this.f139088e.writeFields(aVar);
            }
            C51700vj0 vj02 = this.f139089f;
            if (vj02 != null) {
                aVar.mo74322i(3, vj02.computeSize());
                this.f139089f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139087d) + 0;
            FinderObject finderObject2 = this.f139088e;
            if (finderObject2 != null) {
                e += C52418a.m58682i(2, finderObject2.computeSize());
            }
            C51700vj0 vj03 = this.f139089f;
            return vj03 != null ? e + C52418a.m58682i(3, vj03.computeSize()) : e;
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
            C50661oc1 oc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oc12.f139087d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject3.parseFrom(bArr);
                    }
                    oc12.f139088e = finderObject3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51700vj0 vj04 = new C51700vj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        vj04.parseFrom(bArr2);
                    }
                    oc12.f139089f = vj04;
                }
                return 0;
            }
        }
    }
}

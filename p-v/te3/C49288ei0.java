package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ei0 */
public class C49288ei0 extends C47465a {

    /* renamed from: d */
    public String f132936d;

    /* renamed from: e */
    public C49098d51 f132937e;

    /* renamed from: f */
    public FinderObject f132938f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49288ei0)) {
            return false;
        }
        C49288ei0 ei02 = (C49288ei0) aVar;
        return C46238a.m51546a(this.f132936d, ei02.f132936d) && C46238a.m51546a(this.f132937e, ei02.f132937e) && C46238a.m51546a(this.f132938f, ei02.f132938f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132936d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C49098d51 d512 = this.f132937e;
            if (d512 != null) {
                aVar.mo74322i(2, d512.computeSize());
                this.f132937e.writeFields(aVar);
            }
            FinderObject finderObject = this.f132938f;
            if (finderObject != null) {
                aVar.mo74322i(4, finderObject.computeSize());
                this.f132938f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f132936d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C49098d51 d513 = this.f132937e;
            if (d513 != null) {
                i2 += C52418a.m58682i(2, d513.computeSize());
            }
            FinderObject finderObject2 = this.f132938f;
            return finderObject2 != null ? i2 + C52418a.m58682i(4, finderObject2.computeSize()) : i2;
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
            C49288ei0 ei02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ei02.f132936d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49098d51 d514 = new C49098d51();
                    if (bArr != null && bArr.length > 0) {
                        d514.parseFrom(bArr);
                    }
                    ei02.f132937e = d514;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject3.parseFrom(bArr2);
                    }
                    ei02.f132938f = finderObject3;
                }
                return 0;
            }
        }
    }
}

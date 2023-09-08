package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.po2 */
public class C64634po2 extends C47465a {

    /* renamed from: d */
    public FinderObject f184866d;

    /* renamed from: e */
    public C64273c21 f184867e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64634po2)) {
            return false;
        }
        C64634po2 po22 = (C64634po2) aVar;
        return C46238a.m51546a(this.f184866d, po22.f184866d) && C46238a.m51546a(this.f184867e, po22.f184867e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f184866d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f184866d.writeFields(aVar);
            }
            C64273c21 c212 = this.f184867e;
            if (c212 != null) {
                aVar.mo74322i(2, c212.computeSize());
                this.f184867e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f184866d;
            if (finderObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            C64273c21 c213 = this.f184867e;
            return c213 != null ? i2 + C52418a.m58682i(2, c213.computeSize()) : i2;
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
            C64634po2 po22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject3.parseFrom(bArr);
                    }
                    po22.f184866d = finderObject3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64273c21 c214 = new C64273c21();
                    if (bArr2 != null && bArr2.length > 0) {
                        c214.parseFrom(bArr2);
                    }
                    po22.f184867e = c214;
                }
                return 0;
            }
        }
    }
}

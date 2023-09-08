package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vq0 */
public class C64783vq0 extends C47465a {

    /* renamed from: d */
    public FinderObject f185976d;

    /* renamed from: e */
    public C64394ge0 f185977e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64783vq0)) {
            return false;
        }
        C64783vq0 vq02 = (C64783vq0) aVar;
        return C46238a.m51546a(this.f185976d, vq02.f185976d) && C46238a.m51546a(this.f185977e, vq02.f185977e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f185976d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f185976d.writeFields(aVar);
            }
            C64394ge0 ge02 = this.f185977e;
            if (ge02 != null) {
                aVar.mo74322i(2, ge02.computeSize());
                this.f185977e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f185976d;
            if (finderObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            C64394ge0 ge03 = this.f185977e;
            return ge03 != null ? i2 + C52418a.m58682i(2, ge03.computeSize()) : i2;
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
            C64783vq0 vq02 = objArr[1];
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
                    vq02.f185976d = finderObject3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64394ge0 ge04 = new C64394ge0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ge04.parseFrom(bArr2);
                    }
                    vq02.f185977e = ge04;
                }
                return 0;
            }
        }
    }
}

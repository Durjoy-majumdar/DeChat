package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sl1 */
public class C51262sl1 extends C47465a {

    /* renamed from: d */
    public FinderObject f141585d;

    /* renamed from: e */
    public int f141586e;

    /* renamed from: f */
    public C89349b f141587f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51262sl1)) {
            return false;
        }
        C51262sl1 sl12 = (C51262sl1) aVar;
        return C46238a.m51546a(this.f141585d, sl12.f141585d) && C46238a.m51546a(Integer.valueOf(this.f141586e), Integer.valueOf(sl12.f141586e)) && C46238a.m51546a(this.f141587f, sl12.f141587f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f141585d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f141585d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f141586e);
            C89349b bVar = this.f141587f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f141585d;
            if (finderObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141586e);
            C89349b bVar2 = this.f141587f;
            return bVar2 != null ? e + C52418a.m58675b(3, bVar2) : e;
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
            C51262sl1 sl12 = objArr[1];
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
                    sl12.f141585d = finderObject3;
                }
                return 0;
            } else if (intValue == 2) {
                sl12.f141586e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sl12.f141587f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

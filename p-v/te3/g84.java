package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class g84 extends C47465a {

    /* renamed from: d */
    public SnsObject f133930d;

    /* renamed from: e */
    public C51163rv3 f133931e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof g84)) {
            return false;
        }
        g84 g84 = (g84) aVar;
        return C46238a.m51546a(this.f133930d, g84.f133930d) && C46238a.m51546a(this.f133931e, g84.f133931e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            SnsObject snsObject = this.f133930d;
            if (snsObject != null) {
                if (snsObject != null) {
                    aVar.mo74322i(1, snsObject.computeSize());
                    this.f133930d.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f133931e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f133931e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsObject");
        } else if (i == 1) {
            SnsObject snsObject2 = this.f133930d;
            if (snsObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, snsObject2.computeSize());
            }
            C51163rv3 rv33 = this.f133931e;
            return rv33 != null ? i2 + C52418a.m58682i(2, rv33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133930d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsObject");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            g84 g84 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    SnsObject snsObject3 = new SnsObject();
                    if (bArr != null && bArr.length > 0) {
                        snsObject3.parseFrom(bArr);
                    }
                    g84.f133930d = snsObject3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv34.mo73356d(bArr2);
                    }
                    g84.f133931e = rv34;
                }
                return 0;
            }
        }
    }
}

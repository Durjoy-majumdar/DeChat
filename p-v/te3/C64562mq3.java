package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mq3 */
public class C64562mq3 extends C101820nt3 {

    /* renamed from: d */
    public int f184376d;

    /* renamed from: e */
    public int f184377e;

    /* renamed from: f */
    public nt4 f184378f;

    /* renamed from: g */
    public int f184379g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64562mq3)) {
            return false;
        }
        C64562mq3 mq32 = (C64562mq3) aVar;
        return C46238a.m51546a(this.BaseRequest, mq32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184376d), Integer.valueOf(mq32.f184376d)) && C46238a.m51546a(Integer.valueOf(this.f184377e), Integer.valueOf(mq32.f184377e)) && C46238a.m51546a(this.f184378f, mq32.f184378f) && C46238a.m51546a(Integer.valueOf(this.f184379g), Integer.valueOf(mq32.f184379g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184378f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f184376d);
                aVar.mo74318e(3, this.f184377e);
                nt4 nt4 = this.f184378f;
                if (nt4 != null) {
                    aVar.mo74322i(4, nt4.computeSize());
                    this.f184378f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f184379g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: PieceData");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184376d) + C52418a.m58678e(3, this.f184377e);
            nt4 nt42 = this.f184378f;
            if (nt42 != null) {
                e += C52418a.m58682i(4, nt42.computeSize());
            }
            return e + C52418a.m58678e(5, this.f184379g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184378f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: PieceData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64562mq3 mq32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    mq32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mq32.f184376d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                mq32.f184377e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    nt4 nt43 = new nt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nt43.parseFrom(bArr2);
                    }
                    mq32.f184378f = nt43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mq32.f184379g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

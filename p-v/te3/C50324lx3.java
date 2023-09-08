package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lx3 */
public class C50324lx3 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f137693d;

    /* renamed from: e */
    public int f137694e;

    /* renamed from: f */
    public C51018qv3 f137695f;

    /* renamed from: g */
    public int f137696g;

    /* renamed from: h */
    public int f137697h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50324lx3)) {
            return false;
        }
        C50324lx3 lx32 = (C50324lx3) aVar;
        return C46238a.m51546a(this.BaseRequest, lx32.BaseRequest) && C46238a.m51546a(this.f137693d, lx32.f137693d) && C46238a.m51546a(Integer.valueOf(this.f137694e), Integer.valueOf(lx32.f137694e)) && C46238a.m51546a(this.f137695f, lx32.f137695f) && C46238a.m51546a(Integer.valueOf(this.f137696g), Integer.valueOf(lx32.f137696g)) && C46238a.m51546a(Integer.valueOf(this.f137697h), Integer.valueOf(lx32.f137697h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137693d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f137693d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f137693d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f137694e);
                C51018qv3 qv32 = this.f137695f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f137695f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f137696g);
                aVar.mo74318e(6, this.f137697h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51163rv3 rv33 = this.f137693d;
            if (rv33 != null) {
                i2 += C52418a.m58682i(2, rv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f137694e);
            C51018qv3 qv33 = this.f137695f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            return e + C52418a.m58678e(5, this.f137696g) + C52418a.m58678e(6, this.f137697h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137693d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50324lx3 lx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        lx32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv34.mo73356d(bArr2);
                        }
                        lx32.f137693d = rv34;
                    }
                    return 0;
                case 3:
                    lx32.f137694e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        lx32.f137695f = qv34;
                    }
                    return 0;
                case 5:
                    lx32.f137696g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lx32.f137697h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

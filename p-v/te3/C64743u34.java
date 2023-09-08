package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u34 */
public class C64743u34 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f185699d;

    /* renamed from: e */
    public int f185700e;

    /* renamed from: f */
    public int f185701f;

    /* renamed from: g */
    public float f185702g;

    /* renamed from: h */
    public int f185703h;

    /* renamed from: i */
    public int f185704i;

    /* renamed from: j */
    public float f185705j;

    /* renamed from: n */
    public float f185706n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64743u34)) {
            return false;
        }
        C64743u34 u342 = (C64743u34) aVar;
        return C46238a.m51546a(this.BaseRequest, u342.BaseRequest) && C46238a.m51546a(this.f185699d, u342.f185699d) && C46238a.m51546a(Integer.valueOf(this.f185700e), Integer.valueOf(u342.f185700e)) && C46238a.m51546a(Integer.valueOf(this.f185701f), Integer.valueOf(u342.f185701f)) && C46238a.m51546a(Float.valueOf(this.f185702g), Float.valueOf(u342.f185702g)) && C46238a.m51546a(Integer.valueOf(this.f185703h), Integer.valueOf(u342.f185703h)) && C46238a.m51546a(Integer.valueOf(this.f185704i), Integer.valueOf(u342.f185704i)) && C46238a.m51546a(Float.valueOf(this.f185705j), Float.valueOf(u342.f185705j)) && C46238a.m51546a(Float.valueOf(this.f185706n), Float.valueOf(u342.f185706n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185699d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f185699d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f185699d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f185700e);
                aVar.mo74318e(4, this.f185701f);
                aVar.mo74317d(5, this.f185702g);
                aVar.mo74318e(6, this.f185703h);
                aVar.mo74318e(7, this.f185704i);
                aVar.mo74317d(8, this.f185705j);
                aVar.mo74317d(9, this.f185706n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f185699d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f185700e) + C52418a.m58678e(4, this.f185701f) + C52418a.m58677d(5, this.f185702g) + C52418a.m58678e(6, this.f185703h) + C52418a.m58678e(7, this.f185704i) + C52418a.m58677d(8, this.f185705j) + C52418a.m58677d(9, this.f185706n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185699d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64743u34 u342 = objArr[1];
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
                        u342.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        u342.f185699d = qv34;
                    }
                    return 0;
                case 3:
                    u342.f185700e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    u342.f185701f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    u342.f185702g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    u342.f185703h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u342.f185704i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u342.f185705j = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    u342.f185706n = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

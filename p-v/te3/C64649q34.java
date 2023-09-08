package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q34 */
public class C64649q34 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f184962d;

    /* renamed from: e */
    public int f184963e;

    /* renamed from: f */
    public int f184964f;

    /* renamed from: g */
    public float f184965g;

    /* renamed from: h */
    public int f184966h;

    /* renamed from: i */
    public int f184967i;

    /* renamed from: j */
    public float f184968j;

    /* renamed from: n */
    public float f184969n;

    /* renamed from: o */
    public int f184970o;

    /* renamed from: p */
    public int f184971p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64649q34)) {
            return false;
        }
        C64649q34 q342 = (C64649q34) aVar;
        return C46238a.m51546a(this.BaseRequest, q342.BaseRequest) && C46238a.m51546a(this.f184962d, q342.f184962d) && C46238a.m51546a(Integer.valueOf(this.f184963e), Integer.valueOf(q342.f184963e)) && C46238a.m51546a(Integer.valueOf(this.f184964f), Integer.valueOf(q342.f184964f)) && C46238a.m51546a(Float.valueOf(this.f184965g), Float.valueOf(q342.f184965g)) && C46238a.m51546a(Integer.valueOf(this.f184966h), Integer.valueOf(q342.f184966h)) && C46238a.m51546a(Integer.valueOf(this.f184967i), Integer.valueOf(q342.f184967i)) && C46238a.m51546a(Float.valueOf(this.f184968j), Float.valueOf(q342.f184968j)) && C46238a.m51546a(Float.valueOf(this.f184969n), Float.valueOf(q342.f184969n)) && C46238a.m51546a(Integer.valueOf(this.f184970o), Integer.valueOf(q342.f184970o)) && C46238a.m51546a(Integer.valueOf(this.f184971p), Integer.valueOf(q342.f184971p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184962d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f184962d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f184962d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f184963e);
                aVar.mo74318e(4, this.f184964f);
                aVar.mo74317d(5, this.f184965g);
                aVar.mo74318e(6, this.f184966h);
                aVar.mo74318e(7, this.f184967i);
                aVar.mo74317d(8, this.f184968j);
                aVar.mo74317d(9, this.f184969n);
                aVar.mo74318e(10, this.f184970o);
                aVar.mo74318e(11, this.f184971p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f184962d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f184963e) + C52418a.m58678e(4, this.f184964f) + C52418a.m58677d(5, this.f184965g) + C52418a.m58678e(6, this.f184966h) + C52418a.m58678e(7, this.f184967i) + C52418a.m58677d(8, this.f184968j) + C52418a.m58677d(9, this.f184969n) + C52418a.m58678e(10, this.f184970o) + C52418a.m58678e(11, this.f184971p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184962d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64649q34 q342 = objArr[1];
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
                        q342.BaseRequest = iaVar3;
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
                        q342.f184962d = qv34;
                    }
                    return 0;
                case 3:
                    q342.f184963e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    q342.f184964f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    q342.f184965g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    q342.f184966h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    q342.f184967i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    q342.f184968j = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    q342.f184969n = aVar3.mo141628f(intValue);
                    return 0;
                case 10:
                    q342.f184970o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    q342.f184971p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

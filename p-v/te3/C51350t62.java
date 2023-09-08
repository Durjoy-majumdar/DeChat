package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t62 */
public class C51350t62 extends C101820nt3 {

    /* renamed from: d */
    public int f141984d;

    /* renamed from: e */
    public C51018qv3 f141985e;

    /* renamed from: f */
    public int f141986f;

    /* renamed from: g */
    public int f141987g;

    /* renamed from: h */
    public C51018qv3 f141988h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51350t62)) {
            return false;
        }
        C51350t62 t622 = (C51350t62) aVar;
        return C46238a.m51546a(this.BaseRequest, t622.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141984d), Integer.valueOf(t622.f141984d)) && C46238a.m51546a(this.f141985e, t622.f141985e) && C46238a.m51546a(Integer.valueOf(this.f141986f), Integer.valueOf(t622.f141986f)) && C46238a.m51546a(Integer.valueOf(this.f141987g), Integer.valueOf(t622.f141987g)) && C46238a.m51546a(this.f141988h, t622.f141988h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141985e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f141984d);
                C51018qv3 qv32 = this.f141985e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f141985e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f141986f);
                aVar.mo74318e(5, this.f141987g);
                C51018qv3 qv33 = this.f141988h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f141988h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Url");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141984d);
            C51018qv3 qv34 = this.f141985e;
            if (qv34 != null) {
                e += C52418a.m58682i(3, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f141986f) + C52418a.m58678e(5, this.f141987g);
            C51018qv3 qv35 = this.f141988h;
            return qv35 != null ? e2 + C52418a.m58682i(6, qv35.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141985e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Url");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51350t62 t622 = objArr[1];
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
                        t622.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t622.f141984d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        t622.f141985e = qv36;
                    }
                    return 0;
                case 4:
                    t622.f141986f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t622.f141987g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        t622.f141988h = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

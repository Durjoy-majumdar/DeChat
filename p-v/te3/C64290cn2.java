package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cn2 */
public class C64290cn2 extends C101820nt3 {

    /* renamed from: d */
    public int f182530d;

    /* renamed from: e */
    public float f182531e;

    /* renamed from: f */
    public float f182532f;

    /* renamed from: g */
    public int f182533g;

    /* renamed from: h */
    public String f182534h;

    /* renamed from: i */
    public String f182535i;

    /* renamed from: j */
    public int f182536j;

    /* renamed from: n */
    public C51018qv3 f182537n;

    /* renamed from: o */
    public C51018qv3 f182538o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64290cn2)) {
            return false;
        }
        C64290cn2 cn22 = (C64290cn2) aVar;
        return C46238a.m51546a(this.BaseRequest, cn22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f182530d), Integer.valueOf(cn22.f182530d)) && C46238a.m51546a(Float.valueOf(this.f182531e), Float.valueOf(cn22.f182531e)) && C46238a.m51546a(Float.valueOf(this.f182532f), Float.valueOf(cn22.f182532f)) && C46238a.m51546a(Integer.valueOf(this.f182533g), Integer.valueOf(cn22.f182533g)) && C46238a.m51546a(this.f182534h, cn22.f182534h) && C46238a.m51546a(this.f182535i, cn22.f182535i) && C46238a.m51546a(Integer.valueOf(this.f182536j), Integer.valueOf(cn22.f182536j)) && C46238a.m51546a(this.f182537n, cn22.f182537n) && C46238a.m51546a(this.f182538o, cn22.f182538o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f182530d);
            aVar.mo74317d(3, this.f182531e);
            aVar.mo74317d(4, this.f182532f);
            aVar.mo74318e(5, this.f182533g);
            String str = this.f182534h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f182535i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f182536j);
            C51018qv3 qv32 = this.f182537n;
            if (qv32 != null) {
                aVar.mo74322i(9, qv32.computeSize());
                this.f182537n.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f182538o;
            if (qv33 != null) {
                aVar.mo74322i(10, qv33.computeSize());
                this.f182538o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182530d) + C52418a.m58677d(3, this.f182531e) + C52418a.m58677d(4, this.f182532f) + C52418a.m58678e(5, this.f182533g);
            String str3 = this.f182534h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f182535i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            int e2 = e + C52418a.m58678e(8, this.f182536j);
            C51018qv3 qv34 = this.f182537n;
            if (qv34 != null) {
                e2 += C52418a.m58682i(9, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f182538o;
            return qv35 != null ? e2 + C52418a.m58682i(10, qv35.computeSize()) : e2;
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
            C64290cn2 cn22 = objArr[1];
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
                        cn22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cn22.f182530d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cn22.f182531e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    cn22.f182532f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    cn22.f182533g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    cn22.f182534h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cn22.f182535i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cn22.f182536j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        cn22.f182537n = qv36;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        cn22.f182538o = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

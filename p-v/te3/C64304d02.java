package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d02 */
public class C64304d02 extends C101820nt3 {

    /* renamed from: d */
    public int f182623d;

    /* renamed from: e */
    public int f182624e;

    /* renamed from: f */
    public C64673r40 f182625f;

    /* renamed from: g */
    public LinkedList<C64361fa0> f182626g = new LinkedList<>();

    /* renamed from: h */
    public int f182627h;

    /* renamed from: i */
    public String f182628i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64304d02)) {
            return false;
        }
        C64304d02 d022 = (C64304d02) aVar;
        return C46238a.m51546a(this.BaseRequest, d022.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f182623d), Integer.valueOf(d022.f182623d)) && C46238a.m51546a(Integer.valueOf(this.f182624e), Integer.valueOf(d022.f182624e)) && C46238a.m51546a(this.f182625f, d022.f182625f) && C46238a.m51546a(this.f182626g, d022.f182626g) && C46238a.m51546a(Integer.valueOf(this.f182627h), Integer.valueOf(d022.f182627h)) && C46238a.m51546a(this.f182628i, d022.f182628i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f182625f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f182623d);
                aVar.mo74318e(3, this.f182624e);
                C64673r40 r402 = this.f182625f;
                if (r402 != null) {
                    aVar.mo74322i(4, r402.computeSize());
                    this.f182625f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f182626g);
                aVar.mo74318e(6, this.f182627h);
                String str = this.f182628i;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceType");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182623d) + C52418a.m58678e(3, this.f182624e);
            C64673r40 r403 = this.f182625f;
            if (r403 != null) {
                e += C52418a.m58682i(4, r403.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f182626g) + C52418a.m58678e(6, this.f182627h);
            String str2 = this.f182628i;
            return str2 != null ? g + C52418a.m58683j(7, str2) : g;
        } else if (i == 2) {
            this.f182626g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182625f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceType");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64304d02 d022 = objArr[1];
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
                        d022.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    d022.f182623d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    d022.f182624e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64673r40 r404 = new C64673r40();
                        if (bArr2 != null && bArr2.length > 0) {
                            r404.parseFrom(bArr2);
                        }
                        d022.f182625f = r404;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64361fa0 fa02 = new C64361fa0();
                        if (bArr3 != null && bArr3.length > 0) {
                            fa02.parseFrom(bArr3);
                        }
                        d022.f182626g.add(fa02);
                    }
                    return 0;
                case 6:
                    d022.f182627h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    d022.f182628i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

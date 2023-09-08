package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n92 */
public class C50513n92 extends C101820nt3 {

    /* renamed from: d */
    public int f138496d;

    /* renamed from: e */
    public int f138497e;

    /* renamed from: f */
    public int f138498f;

    /* renamed from: g */
    public String f138499g;

    /* renamed from: h */
    public int f138500h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f138501i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50513n92)) {
            return false;
        }
        C50513n92 n922 = (C50513n92) aVar;
        return C46238a.m51546a(this.BaseRequest, n922.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f138496d), Integer.valueOf(n922.f138496d)) && C46238a.m51546a(Integer.valueOf(this.f138497e), Integer.valueOf(n922.f138497e)) && C46238a.m51546a(Integer.valueOf(this.f138498f), Integer.valueOf(n922.f138498f)) && C46238a.m51546a(this.f138499g, n922.f138499g) && C46238a.m51546a(Integer.valueOf(this.f138500h), Integer.valueOf(n922.f138500h)) && C46238a.m51546a(this.f138501i, n922.f138501i);
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
            aVar.mo74318e(2, this.f138496d);
            aVar.mo74318e(3, this.f138497e);
            aVar.mo74318e(4, this.f138498f);
            String str = this.f138499g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f138500h);
            aVar.mo74320g(7, 8, this.f138501i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138496d) + C52418a.m58678e(3, this.f138497e) + C52418a.m58678e(4, this.f138498f);
            String str2 = this.f138499g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58678e(6, this.f138500h) + C52418a.m58680g(7, 8, this.f138501i);
        } else if (i == 2) {
            this.f138501i.clear();
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
            C50513n92 n922 = objArr[1];
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
                        n922.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n922.f138496d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n922.f138497e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n922.f138498f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n922.f138499g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    n922.f138500h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        n922.f138501i.add(rv32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

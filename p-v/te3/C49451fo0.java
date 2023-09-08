package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fo0 */
public class C49451fo0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133605d;

    /* renamed from: e */
    public long f133606e;

    /* renamed from: f */
    public long f133607f;

    /* renamed from: g */
    public String f133608g;

    /* renamed from: h */
    public String f133609h;

    /* renamed from: i */
    public int f133610i;

    /* renamed from: j */
    public C89349b f133611j;

    /* renamed from: n */
    public boolean f133612n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49451fo0)) {
            return false;
        }
        C49451fo0 fo02 = (C49451fo0) aVar;
        return C46238a.m51546a(this.BaseRequest, fo02.BaseRequest) && C46238a.m51546a(this.f133605d, fo02.f133605d) && C46238a.m51546a(Long.valueOf(this.f133606e), Long.valueOf(fo02.f133606e)) && C46238a.m51546a(Long.valueOf(this.f133607f), Long.valueOf(fo02.f133607f)) && C46238a.m51546a(this.f133608g, fo02.f133608g) && C46238a.m51546a(this.f133609h, fo02.f133609h) && C46238a.m51546a(Integer.valueOf(this.f133610i), Integer.valueOf(fo02.f133610i)) && C46238a.m51546a(this.f133611j, fo02.f133611j) && C46238a.m51546a(Boolean.valueOf(this.f133612n), Boolean.valueOf(fo02.f133612n));
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
            C49842ig0 ig02 = this.f133605d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133605d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f133606e);
            aVar.mo74321h(4, this.f133607f);
            String str = this.f133608g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f133609h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f133610i);
            C89349b bVar = this.f133611j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74314a(9, this.f133612n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133605d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f133606e) + C52418a.m58681h(4, this.f133607f);
            String str3 = this.f133608g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            String str4 = this.f133609h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            int e = h + C52418a.m58678e(7, this.f133610i);
            C89349b bVar2 = this.f133611j;
            if (bVar2 != null) {
                e += C52418a.m58675b(8, bVar2);
            }
            return e + C52418a.m58674a(9, this.f133612n);
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
            C49451fo0 fo02 = objArr[1];
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
                        fo02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        fo02.f133605d = ig04;
                    }
                    return 0;
                case 3:
                    fo02.f133606e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    fo02.f133607f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    fo02.f133608g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fo02.f133609h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fo02.f133610i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    fo02.f133611j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    fo02.f133612n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

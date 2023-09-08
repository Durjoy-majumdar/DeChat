package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sv0 */
public class C51303sv0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141770d;

    /* renamed from: e */
    public long f141771e;

    /* renamed from: f */
    public long f141772f;

    /* renamed from: g */
    public String f141773g;

    /* renamed from: h */
    public LinkedList<Integer> f141774h = new LinkedList<>();

    /* renamed from: i */
    public String f141775i;

    /* renamed from: j */
    public C89349b f141776j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51303sv0)) {
            return false;
        }
        C51303sv0 sv02 = (C51303sv0) aVar;
        return C46238a.m51546a(this.BaseRequest, sv02.BaseRequest) && C46238a.m51546a(this.f141770d, sv02.f141770d) && C46238a.m51546a(Long.valueOf(this.f141771e), Long.valueOf(sv02.f141771e)) && C46238a.m51546a(Long.valueOf(this.f141772f), Long.valueOf(sv02.f141772f)) && C46238a.m51546a(this.f141773g, sv02.f141773g) && C46238a.m51546a(this.f141774h, sv02.f141774h) && C46238a.m51546a(this.f141775i, sv02.f141775i) && C46238a.m51546a(this.f141776j, sv02.f141776j);
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
            C49842ig0 ig02 = this.f141770d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141770d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f141771e);
            aVar.mo74321h(4, this.f141772f);
            String str = this.f141773g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74320g(6, 2, this.f141774h);
            String str2 = this.f141775i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f141776j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141770d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f141771e) + C52418a.m58681h(4, this.f141772f);
            String str3 = this.f141773g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            int g = h + C52418a.m58680g(6, 2, this.f141774h);
            String str4 = this.f141775i;
            if (str4 != null) {
                g += C52418a.m58683j(7, str4);
            }
            C89349b bVar2 = this.f141776j;
            return bVar2 != null ? g + C52418a.m58675b(8, bVar2) : g;
        } else if (i == 2) {
            this.f141774h.clear();
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
            C51303sv0 sv02 = objArr[1];
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
                        sv02.BaseRequest = iaVar3;
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
                        sv02.f141770d = ig04;
                    }
                    return 0;
                case 3:
                    sv02.f141771e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    sv02.f141772f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    sv02.f141773g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sv02.f141774h.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 7:
                    sv02.f141775i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sv02.f141776j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

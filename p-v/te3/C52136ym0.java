package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ym0 */
public class C52136ym0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145393d;

    /* renamed from: e */
    public String f145394e;

    /* renamed from: f */
    public int f145395f;

    /* renamed from: g */
    public C89349b f145396g;

    /* renamed from: h */
    public long f145397h;

    /* renamed from: i */
    public String f145398i;

    /* renamed from: j */
    public C89349b f145399j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52136ym0)) {
            return false;
        }
        C52136ym0 ym02 = (C52136ym0) aVar;
        return C46238a.m51546a(this.BaseRequest, ym02.BaseRequest) && C46238a.m51546a(this.f145393d, ym02.f145393d) && C46238a.m51546a(this.f145394e, ym02.f145394e) && C46238a.m51546a(Integer.valueOf(this.f145395f), Integer.valueOf(ym02.f145395f)) && C46238a.m51546a(this.f145396g, ym02.f145396g) && C46238a.m51546a(Long.valueOf(this.f145397h), Long.valueOf(ym02.f145397h)) && C46238a.m51546a(this.f145398i, ym02.f145398i) && C46238a.m51546a(this.f145399j, ym02.f145399j);
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
            C49842ig0 ig02 = this.f145393d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145393d.writeFields(aVar);
            }
            String str = this.f145394e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f145395f);
            C89349b bVar = this.f145396g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f145397h);
            String str2 = this.f145398i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar2 = this.f145399j;
            if (bVar2 != null) {
                aVar.mo74315b(8, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145393d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f145394e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f145395f);
            C89349b bVar3 = this.f145396g;
            if (bVar3 != null) {
                e += C52418a.m58675b(5, bVar3);
            }
            int h = e + C52418a.m58681h(6, this.f145397h);
            String str4 = this.f145398i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            C89349b bVar4 = this.f145399j;
            return bVar4 != null ? h + C52418a.m58675b(8, bVar4) : h;
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
            C52136ym0 ym02 = objArr[1];
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
                        ym02.BaseRequest = iaVar3;
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
                        ym02.f145393d = ig04;
                    }
                    return 0;
                case 3:
                    ym02.f145394e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ym02.f145395f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ym02.f145396g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    ym02.f145397h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ym02.f145398i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ym02.f145399j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

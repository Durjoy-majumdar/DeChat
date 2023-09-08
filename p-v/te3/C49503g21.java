package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g21 */
public class C49503g21 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133798d;

    /* renamed from: e */
    public long f133799e;

    /* renamed from: f */
    public long f133800f;

    /* renamed from: g */
    public String f133801g;

    /* renamed from: h */
    public C89349b f133802h;

    /* renamed from: i */
    public String f133803i;

    /* renamed from: j */
    public int f133804j;

    /* renamed from: n */
    public int f133805n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49503g21)) {
            return false;
        }
        C49503g21 g212 = (C49503g21) aVar;
        return C46238a.m51546a(this.BaseRequest, g212.BaseRequest) && C46238a.m51546a(this.f133798d, g212.f133798d) && C46238a.m51546a(Long.valueOf(this.f133799e), Long.valueOf(g212.f133799e)) && C46238a.m51546a(Long.valueOf(this.f133800f), Long.valueOf(g212.f133800f)) && C46238a.m51546a(this.f133801g, g212.f133801g) && C46238a.m51546a(this.f133802h, g212.f133802h) && C46238a.m51546a(this.f133803i, g212.f133803i) && C46238a.m51546a(Integer.valueOf(this.f133804j), Integer.valueOf(g212.f133804j)) && C46238a.m51546a(Integer.valueOf(this.f133805n), Integer.valueOf(g212.f133805n));
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
            C49842ig0 ig02 = this.f133798d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133798d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f133799e);
            aVar.mo74321h(4, this.f133800f);
            String str = this.f133801g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C89349b bVar = this.f133802h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str2 = this.f133803i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f133804j);
            aVar.mo74318e(9, this.f133805n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133798d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f133799e) + C52418a.m58681h(4, this.f133800f);
            String str3 = this.f133801g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            C89349b bVar2 = this.f133802h;
            if (bVar2 != null) {
                h += C52418a.m58675b(6, bVar2);
            }
            String str4 = this.f133803i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58678e(8, this.f133804j) + C52418a.m58678e(9, this.f133805n);
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
            C49503g21 g212 = objArr[1];
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
                        g212.BaseRequest = iaVar3;
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
                        g212.f133798d = ig04;
                    }
                    return 0;
                case 3:
                    g212.f133799e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    g212.f133800f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    g212.f133801g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g212.f133802h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    g212.f133803i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    g212.f133804j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    g212.f133805n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

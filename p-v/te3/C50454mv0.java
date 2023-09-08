package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mv0 */
public class C50454mv0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138221d;

    /* renamed from: e */
    public C89349b f138222e;

    /* renamed from: f */
    public C52013xs0 f138223f;

    /* renamed from: g */
    public long f138224g;

    /* renamed from: h */
    public long f138225h;

    /* renamed from: i */
    public String f138226i;

    /* renamed from: j */
    public int f138227j;

    /* renamed from: n */
    public String f138228n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50454mv0)) {
            return false;
        }
        C50454mv0 mv02 = (C50454mv0) aVar;
        return C46238a.m51546a(this.BaseRequest, mv02.BaseRequest) && C46238a.m51546a(this.f138221d, mv02.f138221d) && C46238a.m51546a(this.f138222e, mv02.f138222e) && C46238a.m51546a(this.f138223f, mv02.f138223f) && C46238a.m51546a(Long.valueOf(this.f138224g), Long.valueOf(mv02.f138224g)) && C46238a.m51546a(Long.valueOf(this.f138225h), Long.valueOf(mv02.f138225h)) && C46238a.m51546a(this.f138226i, mv02.f138226i) && C46238a.m51546a(Integer.valueOf(this.f138227j), Integer.valueOf(mv02.f138227j)) && C46238a.m51546a(this.f138228n, mv02.f138228n);
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
            C49842ig0 ig02 = this.f138221d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138221d.writeFields(aVar);
            }
            C89349b bVar = this.f138222e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C52013xs0 xs02 = this.f138223f;
            if (xs02 != null) {
                aVar.mo74322i(4, xs02.computeSize());
                this.f138223f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f138224g);
            aVar.mo74321h(6, this.f138225h);
            String str = this.f138226i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f138227j);
            String str2 = this.f138228n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138221d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f138222e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C52013xs0 xs03 = this.f138223f;
            if (xs03 != null) {
                i2 += C52418a.m58682i(4, xs03.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f138224g) + C52418a.m58681h(6, this.f138225h);
            String str3 = this.f138226i;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            int e = h + C52418a.m58678e(8, this.f138227j);
            String str4 = this.f138228n;
            return str4 != null ? e + C52418a.m58683j(9, str4) : e;
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
            C50454mv0 mv02 = objArr[1];
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
                        mv02.BaseRequest = iaVar3;
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
                        mv02.f138221d = ig04;
                    }
                    return 0;
                case 3:
                    mv02.f138222e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52013xs0 xs04 = new C52013xs0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xs04.parseFrom(bArr3);
                        }
                        mv02.f138223f = xs04;
                    }
                    return 0;
                case 5:
                    mv02.f138224g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    mv02.f138225h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    mv02.f138226i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mv02.f138227j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mv02.f138228n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

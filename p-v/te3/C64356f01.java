package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f01 */
public class C64356f01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f183068d;

    /* renamed from: e */
    public long f183069e;

    /* renamed from: f */
    public long f183070f;

    /* renamed from: g */
    public int f183071g;

    /* renamed from: h */
    public String f183072h;

    /* renamed from: i */
    public C89349b f183073i;

    /* renamed from: j */
    public String f183074j;

    /* renamed from: n */
    public C89349b f183075n;

    /* renamed from: o */
    public C89349b f183076o;

    /* renamed from: p */
    public int f183077p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64356f01)) {
            return false;
        }
        C64356f01 f012 = (C64356f01) aVar;
        return C46238a.m51546a(this.BaseRequest, f012.BaseRequest) && C46238a.m51546a(this.f183068d, f012.f183068d) && C46238a.m51546a(Long.valueOf(this.f183069e), Long.valueOf(f012.f183069e)) && C46238a.m51546a(Long.valueOf(this.f183070f), Long.valueOf(f012.f183070f)) && C46238a.m51546a(Integer.valueOf(this.f183071g), Integer.valueOf(f012.f183071g)) && C46238a.m51546a(this.f183072h, f012.f183072h) && C46238a.m51546a(this.f183073i, f012.f183073i) && C46238a.m51546a(this.f183074j, f012.f183074j) && C46238a.m51546a(this.f183075n, f012.f183075n) && C46238a.m51546a(this.f183076o, f012.f183076o) && C46238a.m51546a(Integer.valueOf(this.f183077p), Integer.valueOf(f012.f183077p));
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
            C49842ig0 ig02 = this.f183068d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f183068d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f183069e);
            aVar.mo74321h(4, this.f183070f);
            aVar.mo74318e(5, this.f183071g);
            String str = this.f183072h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C89349b bVar = this.f183073i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str2 = this.f183074j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            C89349b bVar2 = this.f183075n;
            if (bVar2 != null) {
                aVar.mo74315b(101, bVar2);
            }
            C89349b bVar3 = this.f183076o;
            if (bVar3 != null) {
                aVar.mo74315b(102, bVar3);
            }
            aVar.mo74318e(103, this.f183077p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f183068d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f183069e) + C52418a.m58681h(4, this.f183070f) + C52418a.m58678e(5, this.f183071g);
            String str3 = this.f183072h;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            C89349b bVar4 = this.f183073i;
            if (bVar4 != null) {
                h += C52418a.m58675b(7, bVar4);
            }
            String str4 = this.f183074j;
            if (str4 != null) {
                h += C52418a.m58683j(8, str4);
            }
            C89349b bVar5 = this.f183075n;
            if (bVar5 != null) {
                h += C52418a.m58675b(101, bVar5);
            }
            C89349b bVar6 = this.f183076o;
            if (bVar6 != null) {
                h += C52418a.m58675b(102, bVar6);
            }
            return h + C52418a.m58678e(103, this.f183077p);
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
            C64356f01 f012 = objArr[1];
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
                        f012.BaseRequest = iaVar3;
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
                        f012.f183068d = ig04;
                    }
                    return 0;
                case 3:
                    f012.f183069e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    f012.f183070f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    f012.f183071g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    f012.f183072h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    f012.f183073i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    f012.f183074j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 101:
                            f012.f183075n = aVar3.mo141626d(intValue);
                            return 0;
                        case 102:
                            f012.f183076o = aVar3.mo141626d(intValue);
                            return 0;
                        case 103:
                            f012.f183077p = aVar3.mo141629g(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}

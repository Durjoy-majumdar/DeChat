package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ih0 */
public class C49845ih0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135336d;

    /* renamed from: e */
    public C89349b f135337e;

    /* renamed from: f */
    public C52013xs0 f135338f;

    /* renamed from: g */
    public long f135339g;

    /* renamed from: h */
    public long f135340h;

    /* renamed from: i */
    public String f135341i;

    /* renamed from: j */
    public int f135342j;

    /* renamed from: n */
    public String f135343n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49845ih0)) {
            return false;
        }
        C49845ih0 ih02 = (C49845ih0) aVar;
        return C46238a.m51546a(this.BaseRequest, ih02.BaseRequest) && C46238a.m51546a(this.f135336d, ih02.f135336d) && C46238a.m51546a(this.f135337e, ih02.f135337e) && C46238a.m51546a(this.f135338f, ih02.f135338f) && C46238a.m51546a(Long.valueOf(this.f135339g), Long.valueOf(ih02.f135339g)) && C46238a.m51546a(Long.valueOf(this.f135340h), Long.valueOf(ih02.f135340h)) && C46238a.m51546a(this.f135341i, ih02.f135341i) && C46238a.m51546a(Integer.valueOf(this.f135342j), Integer.valueOf(ih02.f135342j)) && C46238a.m51546a(this.f135343n, ih02.f135343n);
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
            C49842ig0 ig02 = this.f135336d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135336d.writeFields(aVar);
            }
            C89349b bVar = this.f135337e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C52013xs0 xs02 = this.f135338f;
            if (xs02 != null) {
                aVar.mo74322i(4, xs02.computeSize());
                this.f135338f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f135339g);
            aVar.mo74321h(6, this.f135340h);
            String str = this.f135341i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f135342j);
            String str2 = this.f135343n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135336d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f135337e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C52013xs0 xs03 = this.f135338f;
            if (xs03 != null) {
                i2 += C52418a.m58682i(4, xs03.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f135339g) + C52418a.m58681h(6, this.f135340h);
            String str3 = this.f135341i;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            int e = h + C52418a.m58678e(8, this.f135342j);
            String str4 = this.f135343n;
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
            C49845ih0 ih02 = objArr[1];
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
                        ih02.BaseRequest = iaVar3;
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
                        ih02.f135336d = ig04;
                    }
                    return 0;
                case 3:
                    ih02.f135337e = aVar3.mo141626d(intValue);
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
                        ih02.f135338f = xs04;
                    }
                    return 0;
                case 5:
                    ih02.f135339g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ih02.f135340h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ih02.f135341i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ih02.f135342j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ih02.f135343n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ss1 */
public class C51292ss1 extends C47465a {

    /* renamed from: d */
    public int f141716d;

    /* renamed from: e */
    public int f141717e;

    /* renamed from: f */
    public long f141718f;

    /* renamed from: g */
    public C51439ts1 f141719g;

    /* renamed from: h */
    public C51591us1 f141720h;

    /* renamed from: i */
    public LinkedList<C51733vs1> f141721i = new LinkedList<>();

    /* renamed from: j */
    public String f141722j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51292ss1)) {
            return false;
        }
        C51292ss1 ss12 = (C51292ss1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141716d), Integer.valueOf(ss12.f141716d)) && C46238a.m51546a(Integer.valueOf(this.f141717e), Integer.valueOf(ss12.f141717e)) && C46238a.m51546a(Long.valueOf(this.f141718f), Long.valueOf(ss12.f141718f)) && C46238a.m51546a(this.f141719g, ss12.f141719g) && C46238a.m51546a(this.f141720h, ss12.f141720h) && C46238a.m51546a(this.f141721i, ss12.f141721i) && C46238a.m51546a(this.f141722j, ss12.f141722j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141716d);
            aVar.mo74318e(2, this.f141717e);
            aVar.mo74321h(3, this.f141718f);
            C51439ts1 ts12 = this.f141719g;
            if (ts12 != null) {
                aVar.mo74322i(4, ts12.computeSize());
                this.f141719g.writeFields(aVar);
            }
            C51591us1 us12 = this.f141720h;
            if (us12 != null) {
                aVar.mo74322i(5, us12.computeSize());
                this.f141720h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f141721i);
            String str = this.f141722j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141716d) + 0 + C52418a.m58678e(2, this.f141717e) + C52418a.m58681h(3, this.f141718f);
            C51439ts1 ts13 = this.f141719g;
            if (ts13 != null) {
                e += C52418a.m58682i(4, ts13.computeSize());
            }
            C51591us1 us13 = this.f141720h;
            if (us13 != null) {
                e += C52418a.m58682i(5, us13.computeSize());
            }
            int g = e + C52418a.m58680g(6, 8, this.f141721i);
            String str2 = this.f141722j;
            return str2 != null ? g + C52418a.m58683j(7, str2) : g;
        } else if (i == 2) {
            this.f141721i.clear();
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
            C51292ss1 ss12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ss12.f141716d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ss12.f141717e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ss12.f141718f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51439ts1 ts14 = new C51439ts1();
                        if (bArr != null && bArr.length > 0) {
                            ts14.parseFrom(bArr);
                        }
                        ss12.f141719g = ts14;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51591us1 us14 = new C51591us1();
                        if (bArr2 != null && bArr2.length > 0) {
                            us14.parseFrom(bArr2);
                        }
                        ss12.f141720h = us14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51733vs1 vs12 = new C51733vs1();
                        if (bArr3 != null && bArr3.length > 0) {
                            vs12.parseFrom(bArr3);
                        }
                        ss12.f141721i.add(vs12);
                    }
                    return 0;
                case 7:
                    ss12.f141722j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

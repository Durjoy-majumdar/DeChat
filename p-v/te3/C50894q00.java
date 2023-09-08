package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q00 */
public class C50894q00 extends C47465a {

    /* renamed from: d */
    public int f140067d;

    /* renamed from: e */
    public zf4 f140068e;

    /* renamed from: f */
    public LinkedList<zf4> f140069f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<zf4> f140070g = new LinkedList<>();

    /* renamed from: h */
    public String f140071h;

    /* renamed from: i */
    public String f140072i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50894q00)) {
            return false;
        }
        C50894q00 q002 = (C50894q00) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140067d), Integer.valueOf(q002.f140067d)) && C46238a.m51546a(this.f140068e, q002.f140068e) && C46238a.m51546a(this.f140069f, q002.f140069f) && C46238a.m51546a(this.f140070g, q002.f140070g) && C46238a.m51546a(this.f140071h, q002.f140071h) && C46238a.m51546a(this.f140072i, q002.f140072i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140067d);
            zf4 zf4 = this.f140068e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f140068e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f140069f);
            aVar.mo74320g(4, 8, this.f140070g);
            String str = this.f140071h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f140072i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140067d) + 0;
            zf4 zf42 = this.f140068e;
            if (zf42 != null) {
                e += C52418a.m58682i(2, zf42.computeSize());
            }
            int g = e + C52418a.m58680g(3, 8, this.f140069f) + C52418a.m58680g(4, 8, this.f140070g);
            String str3 = this.f140071h;
            if (str3 != null) {
                g += C52418a.m58683j(5, str3);
            }
            String str4 = this.f140072i;
            return str4 != null ? g + C52418a.m58683j(6, str4) : g;
        } else if (i == 2) {
            this.f140069f.clear();
            this.f140070g.clear();
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
            C50894q00 q002 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q002.f140067d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        zf4 zf43 = new zf4();
                        if (bArr != null && bArr.length > 0) {
                            zf43.parseFrom(bArr);
                        }
                        q002.f140068e = zf43;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        zf4 zf44 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf44.parseFrom(bArr2);
                        }
                        q002.f140069f.add(zf44);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        zf4 zf45 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf45.parseFrom(bArr3);
                        }
                        q002.f140070g.add(zf45);
                    }
                    return 0;
                case 5:
                    q002.f140071h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q002.f140072i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

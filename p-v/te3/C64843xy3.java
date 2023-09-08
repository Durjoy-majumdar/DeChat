package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xy3 */
public class C64843xy3 extends C47465a {

    /* renamed from: d */
    public String f186417d;

    /* renamed from: e */
    public String f186418e;

    /* renamed from: f */
    public C64271bz3 f186419f;

    /* renamed from: g */
    public LinkedList<C64271bz3> f186420g = new LinkedList<>();

    /* renamed from: h */
    public C64302cz3 f186421h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64843xy3)) {
            return false;
        }
        C64843xy3 xy32 = (C64843xy3) aVar;
        return C46238a.m51546a(this.f186417d, xy32.f186417d) && C46238a.m51546a(this.f186418e, xy32.f186418e) && C46238a.m51546a(this.f186419f, xy32.f186419f) && C46238a.m51546a(this.f186420g, xy32.f186420g) && C46238a.m51546a(this.f186421h, xy32.f186421h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186417d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186418e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C64271bz3 bz32 = this.f186419f;
            if (bz32 != null) {
                aVar.mo74322i(3, bz32.computeSize());
                this.f186419f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f186420g);
            C64302cz3 cz32 = this.f186421h;
            if (cz32 != null) {
                aVar.mo74322i(5, cz32.computeSize());
                this.f186421h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f186417d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f186418e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C64271bz3 bz33 = this.f186419f;
            if (bz33 != null) {
                i2 += C52418a.m58682i(3, bz33.computeSize());
            }
            int g = i2 + C52418a.m58680g(4, 8, this.f186420g);
            C64302cz3 cz33 = this.f186421h;
            return cz33 != null ? g + C52418a.m58682i(5, cz33.computeSize()) : g;
        } else if (i == 2) {
            this.f186420g.clear();
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
            C64843xy3 xy32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xy32.f186417d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xy32.f186418e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64271bz3 bz34 = new C64271bz3();
                    if (bArr != null && bArr.length > 0) {
                        bz34.parseFrom(bArr);
                    }
                    xy32.f186419f = bz34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64271bz3 bz35 = new C64271bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz35.parseFrom(bArr2);
                    }
                    xy32.f186420g.add(bz35);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64302cz3 cz34 = new C64302cz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        cz34.parseFrom(bArr3);
                    }
                    xy32.f186421h = cz34;
                }
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ig */
public class C49841ig extends C47465a {

    /* renamed from: d */
    public LinkedList<C49699hg> f135306d = new LinkedList<>();

    /* renamed from: e */
    public int f135307e;

    /* renamed from: f */
    public String f135308f;

    /* renamed from: g */
    public C48711ah f135309g;

    /* renamed from: h */
    public LinkedList<C49699hg> f135310h = new LinkedList<>();

    /* renamed from: i */
    public int f135311i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49841ig)) {
            return false;
        }
        C49841ig igVar = (C49841ig) aVar;
        return C46238a.m51546a(this.f135306d, igVar.f135306d) && C46238a.m51546a(Integer.valueOf(this.f135307e), Integer.valueOf(igVar.f135307e)) && C46238a.m51546a(this.f135308f, igVar.f135308f) && C46238a.m51546a(this.f135309g, igVar.f135309g) && C46238a.m51546a(this.f135310h, igVar.f135310h) && C46238a.m51546a(Integer.valueOf(this.f135311i), Integer.valueOf(igVar.f135311i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135306d);
            aVar.mo74318e(3, this.f135307e);
            String str = this.f135308f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C48711ah ahVar = this.f135309g;
            if (ahVar != null) {
                aVar.mo74322i(5, ahVar.computeSize());
                this.f135309g.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f135310h);
            aVar.mo74318e(7, this.f135311i);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f135306d) + 0 + C52418a.m58678e(3, this.f135307e);
            String str2 = this.f135308f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            C48711ah ahVar2 = this.f135309g;
            if (ahVar2 != null) {
                g += C52418a.m58682i(5, ahVar2.computeSize());
            }
            return g + C52418a.m58680g(6, 8, this.f135310h) + C52418a.m58678e(7, this.f135311i);
        } else if (i == 2) {
            this.f135306d.clear();
            this.f135310h.clear();
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
            C49841ig igVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49699hg hgVar = new C49699hg();
                    if (bArr != null && bArr.length > 0) {
                        hgVar.parseFrom(bArr);
                    }
                    igVar.f135306d.add(hgVar);
                }
                return 0;
            } else if (intValue == 3) {
                igVar.f135307e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                igVar.f135308f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C48711ah ahVar3 = new C48711ah();
                    if (bArr2 != null && bArr2.length > 0) {
                        ahVar3.parseFrom(bArr2);
                    }
                    igVar.f135309g = ahVar3;
                }
                return 0;
            } else if (intValue == 6) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C49699hg hgVar2 = new C49699hg();
                    if (bArr3 != null && bArr3.length > 0) {
                        hgVar2.parseFrom(bArr3);
                    }
                    igVar.f135310h.add(hgVar2);
                }
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                igVar.f135311i = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

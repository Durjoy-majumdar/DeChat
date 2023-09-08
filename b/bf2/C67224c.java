package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.c */
public class C67224c extends C47465a {

    /* renamed from: d */
    public String f193024d;

    /* renamed from: e */
    public LinkedList<C39762d> f193025e = new LinkedList<>();

    /* renamed from: f */
    public int f193026f;

    /* renamed from: g */
    public int f193027g;

    /* renamed from: h */
    public int f193028h;

    /* renamed from: i */
    public LinkedList<String> f193029i = new LinkedList<>();

    /* renamed from: j */
    public String f193030j;

    /* renamed from: n */
    public String f193031n;

    /* renamed from: o */
    public LinkedList<String> f193032o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C39761b> f193033p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<String> f193034q = new LinkedList<>();

    /* renamed from: r */
    public int f193035r;

    /* renamed from: s */
    public int f193036s;

    /* renamed from: t */
    public LinkedList<C39768m> f193037t = new LinkedList<>();

    /* renamed from: u */
    public int f193038u;

    /* renamed from: v */
    public LinkedList<C67223a> f193039v = new LinkedList<>();

    /* renamed from: w */
    public String f193040w;

    /* renamed from: x */
    public C54454k f193041x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67224c)) {
            return false;
        }
        C67224c cVar = (C67224c) aVar;
        return C46238a.m51546a(this.f193024d, cVar.f193024d) && C46238a.m51546a(this.f193025e, cVar.f193025e) && C46238a.m51546a(Integer.valueOf(this.f193026f), Integer.valueOf(cVar.f193026f)) && C46238a.m51546a(Integer.valueOf(this.f193027g), Integer.valueOf(cVar.f193027g)) && C46238a.m51546a(Integer.valueOf(this.f193028h), Integer.valueOf(cVar.f193028h)) && C46238a.m51546a(this.f193029i, cVar.f193029i) && C46238a.m51546a(this.f193030j, cVar.f193030j) && C46238a.m51546a(this.f193031n, cVar.f193031n) && C46238a.m51546a(this.f193032o, cVar.f193032o) && C46238a.m51546a(this.f193033p, cVar.f193033p) && C46238a.m51546a(this.f193034q, cVar.f193034q) && C46238a.m51546a(Integer.valueOf(this.f193035r), Integer.valueOf(cVar.f193035r)) && C46238a.m51546a(Integer.valueOf(this.f193036s), Integer.valueOf(cVar.f193036s)) && C46238a.m51546a(this.f193037t, cVar.f193037t) && C46238a.m51546a(Integer.valueOf(this.f193038u), Integer.valueOf(cVar.f193038u)) && C46238a.m51546a(this.f193039v, cVar.f193039v) && C46238a.m51546a(this.f193040w, cVar.f193040w) && C46238a.m51546a(this.f193041x, cVar.f193041x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f193024d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f193025e);
            aVar.mo74318e(3, this.f193026f);
            aVar.mo74318e(4, this.f193027g);
            aVar.mo74318e(5, this.f193028h);
            aVar.mo74320g(6, 1, this.f193029i);
            String str2 = this.f193030j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f193031n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74320g(9, 1, this.f193032o);
            aVar.mo74320g(10, 8, this.f193033p);
            aVar.mo74320g(11, 1, this.f193034q);
            aVar.mo74318e(12, this.f193035r);
            aVar.mo74318e(13, this.f193036s);
            aVar.mo74320g(14, 8, this.f193037t);
            aVar.mo74318e(15, this.f193038u);
            aVar.mo74320g(16, 8, this.f193039v);
            String str4 = this.f193040w;
            if (str4 != null) {
                aVar.mo74323j(17, str4);
            }
            C54454k kVar = this.f193041x;
            if (kVar != null) {
                aVar.mo74322i(18, kVar.computeSize());
                this.f193041x.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f193024d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f193025e) + C52418a.m58678e(3, this.f193026f) + C52418a.m58678e(4, this.f193027g) + C52418a.m58678e(5, this.f193028h) + C52418a.m58680g(6, 1, this.f193029i);
            String str6 = this.f193030j;
            if (str6 != null) {
                g += C52418a.m58683j(7, str6);
            }
            String str7 = this.f193031n;
            if (str7 != null) {
                g += C52418a.m58683j(8, str7);
            }
            int g2 = g + C52418a.m58680g(9, 1, this.f193032o) + C52418a.m58680g(10, 8, this.f193033p) + C52418a.m58680g(11, 1, this.f193034q) + C52418a.m58678e(12, this.f193035r) + C52418a.m58678e(13, this.f193036s) + C52418a.m58680g(14, 8, this.f193037t) + C52418a.m58678e(15, this.f193038u) + C52418a.m58680g(16, 8, this.f193039v);
            String str8 = this.f193040w;
            if (str8 != null) {
                g2 += C52418a.m58683j(17, str8);
            }
            C54454k kVar2 = this.f193041x;
            return kVar2 != null ? g2 + C52418a.m58682i(18, kVar2.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f193025e.clear();
            this.f193029i.clear();
            this.f193032o.clear();
            this.f193033p.clear();
            this.f193034q.clear();
            this.f193037t.clear();
            this.f193039v.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C67224c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f193024d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C39762d dVar = new C39762d();
                        if (bArr != null && bArr.length > 0) {
                            dVar.parseFrom(bArr);
                        }
                        cVar.f193025e.add(dVar);
                    }
                    return 0;
                case 3:
                    cVar.f193026f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cVar.f193027g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cVar.f193028h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    cVar.f193029i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    cVar.f193030j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cVar.f193031n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cVar.f193032o.add(aVar3.mo141633k(intValue));
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C39761b bVar = new C39761b();
                        if (bArr2 != null && bArr2.length > 0) {
                            bVar.parseFrom(bArr2);
                        }
                        cVar.f193033p.add(bVar);
                    }
                    return 0;
                case 11:
                    cVar.f193034q.add(aVar3.mo141633k(intValue));
                    return 0;
                case 12:
                    cVar.f193035r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    cVar.f193036s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C39768m mVar = new C39768m();
                        if (bArr3 != null && bArr3.length > 0) {
                            mVar.parseFrom(bArr3);
                        }
                        cVar.f193037t.add(mVar);
                    }
                    return 0;
                case 15:
                    cVar.f193038u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C67223a aVar4 = new C67223a();
                        if (bArr4 != null && bArr4.length > 0) {
                            aVar4.parseFrom(bArr4);
                        }
                        cVar.f193039v.add(aVar4);
                    }
                    return 0;
                case 17:
                    cVar.f193040w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C54454k kVar3 = new C54454k();
                        if (bArr5 != null && bArr5.length > 0) {
                            kVar3.parseFrom(bArr5);
                        }
                        cVar.f193041x = kVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

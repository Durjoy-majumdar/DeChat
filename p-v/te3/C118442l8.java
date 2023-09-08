package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l8 */
public class C118442l8 extends C101820nt3 {

    /* renamed from: d */
    public C118420aa f354098d;

    /* renamed from: e */
    public C51018qv3 f354099e;

    /* renamed from: f */
    public String f354100f;

    /* renamed from: g */
    public String f354101g;

    /* renamed from: h */
    public int f354102h;

    /* renamed from: i */
    public String f354103i;

    /* renamed from: j */
    public String f354104j;

    /* renamed from: n */
    public String f354105n;

    /* renamed from: o */
    public String f354106o;

    /* renamed from: p */
    public String f354107p;

    /* renamed from: q */
    public String f354108q;

    /* renamed from: r */
    public int f354109r;

    /* renamed from: s */
    public C51018qv3 f354110s;

    /* renamed from: t */
    public C51018qv3 f354111t;

    /* renamed from: u */
    public String f354112u;

    /* renamed from: v */
    public String f354113v;

    /* renamed from: w */
    public C49569gj3 f354114w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118442l8)) {
            return false;
        }
        C118442l8 l8Var = (C118442l8) aVar;
        return C46238a.m51546a(this.BaseRequest, l8Var.BaseRequest) && C46238a.m51546a(this.f354098d, l8Var.f354098d) && C46238a.m51546a(this.f354099e, l8Var.f354099e) && C46238a.m51546a(this.f354100f, l8Var.f354100f) && C46238a.m51546a(this.f354101g, l8Var.f354101g) && C46238a.m51546a(Integer.valueOf(this.f354102h), Integer.valueOf(l8Var.f354102h)) && C46238a.m51546a(this.f354103i, l8Var.f354103i) && C46238a.m51546a(this.f354104j, l8Var.f354104j) && C46238a.m51546a(this.f354105n, l8Var.f354105n) && C46238a.m51546a(this.f354106o, l8Var.f354106o) && C46238a.m51546a(this.f354107p, l8Var.f354107p) && C46238a.m51546a(this.f354108q, l8Var.f354108q) && C46238a.m51546a(Integer.valueOf(this.f354109r), Integer.valueOf(l8Var.f354109r)) && C46238a.m51546a(this.f354110s, l8Var.f354110s) && C46238a.m51546a(this.f354111t, l8Var.f354111t) && C46238a.m51546a(this.f354112u, l8Var.f354112u) && C46238a.m51546a(this.f354113v, l8Var.f354113v) && C46238a.m51546a(this.f354114w, l8Var.f354114w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354099e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C118420aa aaVar = this.f354098d;
                if (aaVar != null) {
                    aVar.mo74322i(2, aaVar.computeSize());
                    this.f354098d.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f354099e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f354099e.writeFields(aVar);
                }
                String str = this.f354100f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f354101g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f354102h);
                String str3 = this.f354103i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f354104j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f354105n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f354106o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                String str7 = this.f354107p;
                if (str7 != null) {
                    aVar.mo74323j(11, str7);
                }
                String str8 = this.f354108q;
                if (str8 != null) {
                    aVar.mo74323j(12, str8);
                }
                aVar.mo74318e(13, this.f354109r);
                C51018qv3 qv33 = this.f354110s;
                if (qv33 != null) {
                    aVar.mo74322i(14, qv33.computeSize());
                    this.f354110s.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f354111t;
                if (qv34 != null) {
                    aVar.mo74322i(15, qv34.computeSize());
                    this.f354111t.writeFields(aVar);
                }
                String str9 = this.f354112u;
                if (str9 != null) {
                    aVar.mo74323j(16, str9);
                }
                String str10 = this.f354113v;
                if (str10 != null) {
                    aVar.mo74323j(17, str10);
                }
                C49569gj3 gj32 = this.f354114w;
                if (gj32 != null) {
                    aVar.mo74322i(18, gj32.computeSize());
                    this.f354114w.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AutoAuthKey");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C118420aa aaVar2 = this.f354098d;
            if (aaVar2 != null) {
                i3 += C52418a.m58682i(2, aaVar2.computeSize());
            }
            C51018qv3 qv35 = this.f354099e;
            if (qv35 != null) {
                i3 += C52418a.m58682i(3, qv35.computeSize());
            }
            String str11 = this.f354100f;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f354101g;
            if (str12 != null) {
                i3 += C52418a.m58683j(5, str12);
            }
            int e = i3 + C52418a.m58678e(6, this.f354102h);
            String str13 = this.f354103i;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f354104j;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            String str15 = this.f354105n;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            String str16 = this.f354106o;
            if (str16 != null) {
                e += C52418a.m58683j(10, str16);
            }
            String str17 = this.f354107p;
            if (str17 != null) {
                e += C52418a.m58683j(11, str17);
            }
            String str18 = this.f354108q;
            if (str18 != null) {
                e += C52418a.m58683j(12, str18);
            }
            int e2 = e + C52418a.m58678e(13, this.f354109r);
            C51018qv3 qv36 = this.f354110s;
            if (qv36 != null) {
                e2 += C52418a.m58682i(14, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f354111t;
            if (qv37 != null) {
                e2 += C52418a.m58682i(15, qv37.computeSize());
            }
            String str19 = this.f354112u;
            if (str19 != null) {
                e2 += C52418a.m58683j(16, str19);
            }
            String str20 = this.f354113v;
            if (str20 != null) {
                e2 += C52418a.m58683j(17, str20);
            }
            C49569gj3 gj33 = this.f354114w;
            return gj33 != null ? e2 + C52418a.m58682i(18, gj33.computeSize()) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354099e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AutoAuthKey");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118442l8 l8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        l8Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C118420aa aaVar3 = new C118420aa();
                        if (bArr2 != null && bArr2.length > 0) {
                            aaVar3.parseFrom(bArr2);
                        }
                        l8Var.f354098d = aaVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv38 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv38.mo73348f(bArr3);
                        }
                        l8Var.f354099e = qv38;
                    }
                    return 0;
                case 4:
                    l8Var.f354100f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l8Var.f354101g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l8Var.f354102h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    l8Var.f354103i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    l8Var.f354104j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    l8Var.f354105n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    l8Var.f354106o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    l8Var.f354107p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    l8Var.f354108q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    l8Var.f354109r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv39.mo73348f(bArr4);
                        }
                        l8Var.f354110s = qv39;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv310.mo73348f(bArr5);
                        }
                        l8Var.f354111t = qv310;
                    }
                    return 0;
                case 16:
                    l8Var.f354112u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    l8Var.f354113v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49569gj3 gj34 = new C49569gj3();
                        if (bArr6 != null && bArr6.length > 0) {
                            gj34.parseFrom(bArr6);
                        }
                        l8Var.f354114w = gj34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

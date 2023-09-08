package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.c */
public class C77820c extends C47465a {

    /* renamed from: d */
    public LinkedList<C77826i> f226707d = new LinkedList<>();

    /* renamed from: e */
    public int f226708e;

    /* renamed from: f */
    public String f226709f;

    /* renamed from: g */
    public int f226710g;

    /* renamed from: h */
    public C77818a f226711h;

    /* renamed from: i */
    public String f226712i;

    /* renamed from: j */
    public int f226713j;

    /* renamed from: n */
    public int f226714n;

    /* renamed from: o */
    public C77823f f226715o;

    /* renamed from: p */
    public String f226716p;

    /* renamed from: q */
    public C77819b f226717q;

    /* renamed from: r */
    public C77821d f226718r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77820c)) {
            return false;
        }
        C77820c cVar = (C77820c) aVar;
        return C46238a.m51546a(this.f226707d, cVar.f226707d) && C46238a.m51546a(Integer.valueOf(this.f226708e), Integer.valueOf(cVar.f226708e)) && C46238a.m51546a(this.f226709f, cVar.f226709f) && C46238a.m51546a(Integer.valueOf(this.f226710g), Integer.valueOf(cVar.f226710g)) && C46238a.m51546a(this.f226711h, cVar.f226711h) && C46238a.m51546a(this.f226712i, cVar.f226712i) && C46238a.m51546a(Integer.valueOf(this.f226713j), Integer.valueOf(cVar.f226713j)) && C46238a.m51546a(Integer.valueOf(this.f226714n), Integer.valueOf(cVar.f226714n)) && C46238a.m51546a(this.f226715o, cVar.f226715o) && C46238a.m51546a(this.f226716p, cVar.f226716p) && C46238a.m51546a(this.f226717q, cVar.f226717q) && C46238a.m51546a(this.f226718r, cVar.f226718r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f226707d);
            aVar.mo74318e(2, this.f226708e);
            String str = this.f226709f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f226710g);
            C77818a aVar2 = this.f226711h;
            if (aVar2 != null) {
                aVar.mo74322i(5, aVar2.computeSize());
                this.f226711h.writeFields(aVar);
            }
            String str2 = this.f226712i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f226713j);
            aVar.mo74318e(8, this.f226714n);
            C77823f fVar = this.f226715o;
            if (fVar != null) {
                aVar.mo74322i(9, fVar.computeSize());
                this.f226715o.writeFields(aVar);
            }
            String str3 = this.f226716p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            C77819b bVar = this.f226717q;
            if (bVar != null) {
                aVar.mo74322i(11, bVar.computeSize());
                this.f226717q.writeFields(aVar);
            }
            C77821d dVar = this.f226718r;
            if (dVar != null) {
                aVar.mo74322i(12, dVar.computeSize());
                this.f226718r.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f226707d) + 0 + C52418a.m58678e(2, this.f226708e);
            String str4 = this.f226709f;
            if (str4 != null) {
                g += C52418a.m58683j(3, str4);
            }
            int e = g + C52418a.m58678e(4, this.f226710g);
            C77818a aVar3 = this.f226711h;
            if (aVar3 != null) {
                e += C52418a.m58682i(5, aVar3.computeSize());
            }
            String str5 = this.f226712i;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            int e2 = e + C52418a.m58678e(7, this.f226713j) + C52418a.m58678e(8, this.f226714n);
            C77823f fVar2 = this.f226715o;
            if (fVar2 != null) {
                e2 += C52418a.m58682i(9, fVar2.computeSize());
            }
            String str6 = this.f226716p;
            if (str6 != null) {
                e2 += C52418a.m58683j(10, str6);
            }
            C77819b bVar2 = this.f226717q;
            if (bVar2 != null) {
                e2 += C52418a.m58682i(11, bVar2.computeSize());
            }
            C77821d dVar2 = this.f226718r;
            return dVar2 != null ? e2 + C52418a.m58682i(12, dVar2.computeSize()) : e2;
        } else if (i == 2) {
            this.f226707d.clear();
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C77820c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C77826i iVar = new C77826i();
                        if (bArr != null && bArr.length > 0) {
                            iVar.parseFrom(bArr);
                        }
                        cVar.f226707d.add(iVar);
                    }
                    return 0;
                case 2:
                    cVar.f226708e = aVar5.mo141629g(intValue);
                    return 0;
                case 3:
                    cVar.f226709f = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    cVar.f226710g = aVar5.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C77818a aVar6 = new C77818a();
                        if (bArr2 != null && bArr2.length > 0) {
                            aVar6.parseFrom(bArr2);
                        }
                        cVar.f226711h = aVar6;
                    }
                    return 0;
                case 6:
                    cVar.f226712i = aVar5.mo141633k(intValue);
                    return 0;
                case 7:
                    cVar.f226713j = aVar5.mo141629g(intValue);
                    return 0;
                case 8:
                    cVar.f226714n = aVar5.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C77823f fVar3 = new C77823f();
                        if (bArr3 != null && bArr3.length > 0) {
                            fVar3.parseFrom(bArr3);
                        }
                        cVar.f226715o = fVar3;
                    }
                    return 0;
                case 10:
                    cVar.f226716p = aVar5.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar5.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C77819b bVar3 = new C77819b();
                        if (bArr4 != null && bArr4.length > 0) {
                            bVar3.parseFrom(bArr4);
                        }
                        cVar.f226717q = bVar3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar5.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C77821d dVar3 = new C77821d();
                        if (bArr5 != null && bArr5.length > 0) {
                            dVar3.parseFrom(bArr5);
                        }
                        cVar.f226718r = dVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

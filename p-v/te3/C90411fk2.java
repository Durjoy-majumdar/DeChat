package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fk2 */
public class C90411fk2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f259514d;

    /* renamed from: e */
    public LinkedList<C90437rw3> f259515e = new LinkedList<>();

    /* renamed from: f */
    public String f259516f;

    /* renamed from: g */
    public String f259517g;

    /* renamed from: h */
    public String f259518h;

    /* renamed from: i */
    public String f259519i;

    /* renamed from: j */
    public String f259520j;

    /* renamed from: n */
    public C90429p4 f259521n;

    /* renamed from: o */
    public C89349b f259522o;

    /* renamed from: p */
    public String f259523p;

    /* renamed from: q */
    public gp4 f259524q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90411fk2)) {
            return false;
        }
        C90411fk2 fk22 = (C90411fk2) aVar;
        return C46238a.m51546a(this.BaseResponse, fk22.BaseResponse) && C46238a.m51546a(this.f259514d, fk22.f259514d) && C46238a.m51546a(this.f259515e, fk22.f259515e) && C46238a.m51546a(this.f259516f, fk22.f259516f) && C46238a.m51546a(this.f259517g, fk22.f259517g) && C46238a.m51546a(this.f259518h, fk22.f259518h) && C46238a.m51546a(this.f259519i, fk22.f259519i) && C46238a.m51546a(this.f259520j, fk22.f259520j) && C46238a.m51546a(this.f259521n, fk22.f259521n) && C46238a.m51546a(this.f259522o, fk22.f259522o) && C46238a.m51546a(this.f259523p, fk22.f259523p) && C46238a.m51546a(this.f259524q, fk22.f259524q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C49713hj2 hj22 = this.f259514d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f259514d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f259515e);
                String str = this.f259516f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f259517g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259518h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f259519i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f259520j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                C90429p4 p4Var = this.f259521n;
                if (p4Var != null) {
                    aVar.mo74322i(9, p4Var.computeSize());
                    this.f259521n.writeFields(aVar);
                }
                C89349b bVar = this.f259522o;
                if (bVar != null) {
                    aVar.mo74315b(10, bVar);
                }
                String str6 = this.f259523p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                gp4 gp4 = this.f259524q;
                if (gp4 == null) {
                    return 0;
                }
                aVar.mo74322i(12, gp4.computeSize());
                this.f259524q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            C49713hj2 hj23 = this.f259514d;
            if (hj23 != null) {
                i3 += C52418a.m58682i(2, hj23.computeSize());
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f259515e);
            String str7 = this.f259516f;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f259517g;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            String str9 = this.f259518h;
            if (str9 != null) {
                g += C52418a.m58683j(6, str9);
            }
            String str10 = this.f259519i;
            if (str10 != null) {
                g += C52418a.m58683j(7, str10);
            }
            String str11 = this.f259520j;
            if (str11 != null) {
                g += C52418a.m58683j(8, str11);
            }
            C90429p4 p4Var2 = this.f259521n;
            if (p4Var2 != null) {
                g += C52418a.m58682i(9, p4Var2.computeSize());
            }
            C89349b bVar2 = this.f259522o;
            if (bVar2 != null) {
                g += C52418a.m58675b(10, bVar2);
            }
            String str12 = this.f259523p;
            if (str12 != null) {
                g += C52418a.m58683j(11, str12);
            }
            gp4 gp42 = this.f259524q;
            return gp42 != null ? g + C52418a.m58682i(12, gp42.computeSize()) : g;
        } else if (i2 == 2) {
            this.f259515e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90411fk2 fk22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        fk22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49713hj2 hj24 = new C49713hj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hj24.parseFrom(bArr2);
                        }
                        fk22.f259514d = hj24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C90437rw3 rw32 = new C90437rw3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rw32.parseFrom(bArr3);
                        }
                        fk22.f259515e.add(rw32);
                    }
                    return 0;
                case 4:
                    fk22.f259516f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fk22.f259517g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fk22.f259518h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fk22.f259519i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fk22.f259520j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C90429p4 p4Var3 = new C90429p4();
                        if (bArr4 != null && bArr4.length > 0) {
                            p4Var3.parseFrom(bArr4);
                        }
                        fk22.f259521n = p4Var3;
                    }
                    return 0;
                case 10:
                    fk22.f259522o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    fk22.f259523p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        gp4 gp43 = new gp4();
                        if (bArr5 != null && bArr5.length > 0) {
                            gp43.parseFrom(bArr5);
                        }
                        fk22.f259524q = gp43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

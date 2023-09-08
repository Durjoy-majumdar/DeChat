package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t8 */
public class C64724t8 extends C47465a {

    /* renamed from: d */
    public int f185507d;

    /* renamed from: e */
    public C51018qv3 f185508e;

    /* renamed from: f */
    public C52114yg2 f185509f;

    /* renamed from: g */
    public int f185510g;

    /* renamed from: h */
    public C51018qv3 f185511h;

    /* renamed from: i */
    public String f185512i;

    /* renamed from: j */
    public int f185513j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64724t8)) {
            return false;
        }
        C64724t8 t8Var = (C64724t8) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185507d), Integer.valueOf(t8Var.f185507d)) && C46238a.m51546a(this.f185508e, t8Var.f185508e) && C46238a.m51546a(this.f185509f, t8Var.f185509f) && C46238a.m51546a(Integer.valueOf(this.f185510g), Integer.valueOf(t8Var.f185510g)) && C46238a.m51546a(this.f185511h, t8Var.f185511h) && C46238a.m51546a(this.f185512i, t8Var.f185512i) && C46238a.m51546a(Integer.valueOf(this.f185513j), Integer.valueOf(t8Var.f185513j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185508e == null) {
                throw new C52419b("Not all required fields were included: AxTicket");
            } else if (this.f185511h != null) {
                aVar.mo74318e(1, this.f185507d);
                C51018qv3 qv32 = this.f185508e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f185508e.writeFields(aVar);
                }
                C52114yg2 yg22 = this.f185509f;
                if (yg22 != null) {
                    aVar.mo74322i(3, yg22.computeSize());
                    this.f185509f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f185510g);
                C51018qv3 qv33 = this.f185511h;
                if (qv33 != null) {
                    aVar.mo74322i(5, qv33.computeSize());
                    this.f185511h.writeFields(aVar);
                }
                String str = this.f185512i;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                aVar.mo74318e(7, this.f185513j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RandomKey");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185507d) + 0;
            C51018qv3 qv34 = this.f185508e;
            if (qv34 != null) {
                e += C52418a.m58682i(2, qv34.computeSize());
            }
            C52114yg2 yg23 = this.f185509f;
            if (yg23 != null) {
                e += C52418a.m58682i(3, yg23.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f185510g);
            C51018qv3 qv35 = this.f185511h;
            if (qv35 != null) {
                e2 += C52418a.m58682i(5, qv35.computeSize());
            }
            String str2 = this.f185512i;
            if (str2 != null) {
                e2 += C52418a.m58683j(6, str2);
            }
            return e2 + C52418a.m58678e(7, this.f185513j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185508e == null) {
                throw new C52419b("Not all required fields were included: AxTicket");
            } else if (this.f185511h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RandomKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64724t8 t8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t8Var.f185507d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv36.mo73348f(bArr);
                        }
                        t8Var.f185508e = qv36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C52114yg2 yg24 = new C52114yg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yg24.parseFrom(bArr2);
                        }
                        t8Var.f185509f = yg24;
                    }
                    return 0;
                case 4:
                    t8Var.f185510g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        t8Var.f185511h = qv37;
                    }
                    return 0;
                case 6:
                    t8Var.f185512i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t8Var.f185513j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

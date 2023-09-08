package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aa */
public class C118420aa extends C47465a {

    /* renamed from: d */
    public C51018qv3 f353905d;

    /* renamed from: e */
    public ay4 f353906e;

    /* renamed from: f */
    public i45 f353907f;

    /* renamed from: g */
    public C51018qv3 f353908g;

    /* renamed from: h */
    public C51018qv3 f353909h;

    /* renamed from: i */
    public int f353910i;

    /* renamed from: j */
    public String f353911j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118420aa)) {
            return false;
        }
        C118420aa aaVar = (C118420aa) aVar;
        return C46238a.m51546a(this.f353905d, aaVar.f353905d) && C46238a.m51546a(this.f353906e, aaVar.f353906e) && C46238a.m51546a(this.f353907f, aaVar.f353907f) && C46238a.m51546a(this.f353908g, aaVar.f353908g) && C46238a.m51546a(this.f353909h, aaVar.f353909h) && C46238a.m51546a(Integer.valueOf(this.f353910i), Integer.valueOf(aaVar.f353910i)) && C46238a.m51546a(this.f353911j, aaVar.f353911j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f353905d;
            if (qv32 != null) {
                aVar.mo74322i(1, qv32.computeSize());
                this.f353905d.writeFields(aVar);
            }
            ay4 ay4 = this.f353906e;
            if (ay4 != null) {
                aVar.mo74322i(2, ay4.computeSize());
                this.f353906e.writeFields(aVar);
            }
            i45 i45 = this.f353907f;
            if (i45 != null) {
                aVar.mo74322i(3, i45.computeSize());
                this.f353907f.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f353908g;
            if (qv33 != null) {
                aVar.mo74322i(4, qv33.computeSize());
                this.f353908g.writeFields(aVar);
            }
            C51018qv3 qv34 = this.f353909h;
            if (qv34 != null) {
                aVar.mo74322i(5, qv34.computeSize());
                this.f353909h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f353910i);
            String str = this.f353911j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            C51018qv3 qv35 = this.f353905d;
            if (qv35 != null) {
                i2 = 0 + C52418a.m58682i(1, qv35.computeSize());
            }
            ay4 ay42 = this.f353906e;
            if (ay42 != null) {
                i2 += C52418a.m58682i(2, ay42.computeSize());
            }
            i45 i452 = this.f353907f;
            if (i452 != null) {
                i2 += C52418a.m58682i(3, i452.computeSize());
            }
            C51018qv3 qv36 = this.f353908g;
            if (qv36 != null) {
                i2 += C52418a.m58682i(4, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f353909h;
            if (qv37 != null) {
                i2 += C52418a.m58682i(5, qv37.computeSize());
            }
            int e = i2 + C52418a.m58678e(6, this.f353910i);
            String str2 = this.f353911j;
            return str2 != null ? e + C52418a.m58683j(7, str2) : e;
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
            C118420aa aaVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51018qv3 qv38 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv38.mo73348f(bArr);
                        }
                        aaVar.f353905d = qv38;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ay4 ay43 = new ay4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ay43.parseFrom(bArr2);
                        }
                        aaVar.f353906e = ay43;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        i45 i453 = new i45();
                        if (bArr3 != null && bArr3.length > 0) {
                            i453.parseFrom(bArr3);
                        }
                        aaVar.f353907f = i453;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv39.mo73348f(bArr4);
                        }
                        aaVar.f353908g = qv39;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv310.mo73348f(bArr5);
                        }
                        aaVar.f353909h = qv310;
                    }
                    return 0;
                case 6:
                    aaVar.f353910i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    aaVar.f353911j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

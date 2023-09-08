package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u8 */
public class C64747u8 extends C47465a {

    /* renamed from: d */
    public int f185721d;

    /* renamed from: e */
    public LinkedList<C64724t8> f185722e = new LinkedList<>();

    /* renamed from: f */
    public int f185723f;

    /* renamed from: g */
    public int f185724g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64747u8)) {
            return false;
        }
        C64747u8 u8Var = (C64747u8) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185721d), Integer.valueOf(u8Var.f185721d)) && C46238a.m51546a(this.f185722e, u8Var.f185722e) && C46238a.m51546a(Integer.valueOf(this.f185723f), Integer.valueOf(u8Var.f185723f)) && C46238a.m51546a(Integer.valueOf(this.f185724g), Integer.valueOf(u8Var.f185724g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185721d);
            aVar.mo74320g(2, 8, this.f185722e);
            aVar.mo74318e(3, this.f185723f);
            aVar.mo74318e(4, this.f185724g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185721d) + 0 + C52418a.m58680g(2, 8, this.f185722e) + C52418a.m58678e(3, this.f185723f) + C52418a.m58678e(4, this.f185724g);
        } else {
            if (i == 2) {
                this.f185722e.clear();
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
                C64747u8 u8Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    u8Var.f185721d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64724t8 t8Var = new C64724t8();
                        if (bArr != null && bArr.length > 0) {
                            t8Var.parseFrom(bArr);
                        }
                        u8Var.f185722e.add(t8Var);
                    }
                    return 0;
                } else if (intValue == 3) {
                    u8Var.f185723f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    u8Var.f185724g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}

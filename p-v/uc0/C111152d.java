package uc0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.d */
public class C111152d extends C47465a {

    /* renamed from: d */
    public String f332873d;

    /* renamed from: e */
    public String f332874e;

    /* renamed from: f */
    public String f332875f;

    /* renamed from: g */
    public C111157v f332876g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C111152d)) {
            return false;
        }
        C111152d dVar = (C111152d) aVar;
        return C46238a.m51546a(this.f332873d, dVar.f332873d) && C46238a.m51546a(this.f332874e, dVar.f332874e) && C46238a.m51546a(this.f332875f, dVar.f332875f) && C46238a.m51546a(this.f332876g, dVar.f332876g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332873d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f332874e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f332875f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C111157v vVar = this.f332876g;
            if (vVar != null) {
                aVar.mo74322i(4, vVar.computeSize());
                this.f332876g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f332873d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f332874e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f332875f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C111157v vVar2 = this.f332876g;
            return vVar2 != null ? i2 + C52418a.m58682i(4, vVar2.computeSize()) : i2;
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
            C111152d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dVar.f332873d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                dVar.f332874e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                dVar.f332875f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C111157v vVar3 = new C111157v();
                    if (bArr != null && bArr.length > 0) {
                        vVar3.parseFrom(bArr);
                    }
                    dVar.f332876g = vVar3;
                }
                return 0;
            }
        }
    }
}

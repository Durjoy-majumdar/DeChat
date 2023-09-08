package l10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.d */
public class C61185d extends C47465a {

    /* renamed from: d */
    public boolean f174179d;

    /* renamed from: e */
    public C61182a f174180e;

    /* renamed from: f */
    public LinkedList<C61183b> f174181f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C61185d)) {
            return false;
        }
        C61185d dVar = (C61185d) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f174179d), Boolean.valueOf(dVar.f174179d)) && C46238a.m51546a(this.f174180e, dVar.f174180e) && C46238a.m51546a(this.f174181f, dVar.f174181f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f174179d);
            C61182a aVar2 = this.f174180e;
            if (aVar2 != null) {
                aVar.mo74322i(2, aVar2.computeSize());
                this.f174180e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f174181f);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f174179d) + 0;
            C61182a aVar3 = this.f174180e;
            if (aVar3 != null) {
                a += C52418a.m58682i(2, aVar3.computeSize());
            }
            return a + C52418a.m58680g(3, 8, this.f174181f);
        } else if (i == 2) {
            this.f174181f.clear();
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
            C61185d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dVar.f174179d = aVar5.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C61182a aVar6 = new C61182a();
                    if (bArr != null && bArr.length > 0) {
                        aVar6.parseFrom(bArr);
                    }
                    dVar.f174180e = aVar6;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C61183b bVar = new C61183b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.parseFrom(bArr2);
                    }
                    dVar.f174181f.add(bVar);
                }
                return 0;
            }
        }
    }
}

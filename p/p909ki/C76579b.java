package p909ki;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ki.b */
public class C76579b extends C47465a {

    /* renamed from: d */
    public C76580c f224135d;

    /* renamed from: e */
    public LinkedList<C76580c> f224136e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C76578a> f224137f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C76579b)) {
            return false;
        }
        C76579b bVar = (C76579b) aVar;
        return C46238a.m51546a(this.f224135d, bVar.f224135d) && C46238a.m51546a(this.f224136e, bVar.f224136e) && C46238a.m51546a(this.f224137f, bVar.f224137f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C76580c cVar = this.f224135d;
            if (cVar != null) {
                aVar.mo74322i(1, cVar.computeSize());
                this.f224135d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f224136e);
            aVar.mo74320g(3, 8, this.f224137f);
            return 0;
        } else if (i == 1) {
            C76580c cVar2 = this.f224135d;
            if (cVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f224136e) + C52418a.m58680g(3, 8, this.f224137f);
        } else if (i == 2) {
            this.f224136e.clear();
            this.f224137f.clear();
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
            C76579b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C76580c cVar3 = new C76580c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    bVar.f224135d = cVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C76580c cVar4 = new C76580c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar4.parseFrom(bArr2);
                    }
                    bVar.f224136e.add(cVar4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C76578a aVar4 = new C76578a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar4.parseFrom(bArr3);
                    }
                    bVar.f224137f.add(aVar4);
                }
                return 0;
            }
        }
    }
}

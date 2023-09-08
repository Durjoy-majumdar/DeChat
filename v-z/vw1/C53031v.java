package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.v */
public class C53031v extends C47465a {

    /* renamed from: d */
    public LinkedList<C53020i0> f148036d = new LinkedList<>();

    /* renamed from: e */
    public C53027r f148037e;

    /* renamed from: f */
    public LinkedList<C53013f> f148038f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C53018h0> f148039g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53031v)) {
            return false;
        }
        C53031v vVar = (C53031v) aVar;
        return C46238a.m51546a(this.f148036d, vVar.f148036d) && C46238a.m51546a(this.f148037e, vVar.f148037e) && C46238a.m51546a(this.f148038f, vVar.f148038f) && C46238a.m51546a(this.f148039g, vVar.f148039g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f148036d);
            C53027r rVar = this.f148037e;
            if (rVar != null) {
                aVar.mo74322i(2, rVar.computeSize());
                this.f148037e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f148038f);
            aVar.mo74320g(4, 8, this.f148039g);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f148036d) + 0;
            C53027r rVar2 = this.f148037e;
            if (rVar2 != null) {
                g += C52418a.m58682i(2, rVar2.computeSize());
            }
            return g + C52418a.m58680g(3, 8, this.f148038f) + C52418a.m58680g(4, 8, this.f148039g);
        } else if (i == 2) {
            this.f148036d.clear();
            this.f148038f.clear();
            this.f148039g.clear();
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
            C53031v vVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C53020i0 i0Var = new C53020i0();
                    if (bArr != null && bArr.length > 0) {
                        i0Var.parseFrom(bArr);
                    }
                    vVar.f148036d.add(i0Var);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C53027r rVar3 = new C53027r();
                    if (bArr2 != null && bArr2.length > 0) {
                        rVar3.parseFrom(bArr2);
                    }
                    vVar.f148037e = rVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C53013f fVar = new C53013f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar.parseFrom(bArr3);
                    }
                    vVar.f148038f.add(fVar);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C53018h0 h0Var = new C53018h0();
                    if (bArr4 != null && bArr4.length > 0) {
                        h0Var.parseFrom(bArr4);
                    }
                    vVar.f148039g.add(h0Var);
                }
                return 0;
            }
        }
    }
}

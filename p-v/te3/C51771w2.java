package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w2 */
public class C51771w2 extends C47465a {

    /* renamed from: d */
    public C77949j3 f143818d;

    /* renamed from: e */
    public String f143819e;

    /* renamed from: f */
    public long f143820f;

    /* renamed from: g */
    public C89349b f143821g;

    /* renamed from: h */
    public boolean f143822h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51771w2)) {
            return false;
        }
        C51771w2 w2Var = (C51771w2) aVar;
        return C46238a.m51546a(this.f143818d, w2Var.f143818d) && C46238a.m51546a(this.f143819e, w2Var.f143819e) && C46238a.m51546a(Long.valueOf(this.f143820f), Long.valueOf(w2Var.f143820f)) && C46238a.m51546a(this.f143821g, w2Var.f143821g) && C46238a.m51546a(Boolean.valueOf(this.f143822h), Boolean.valueOf(w2Var.f143822h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C77949j3 j3Var = this.f143818d;
            if (j3Var != null) {
                aVar.mo74322i(1, j3Var.computeSize());
                this.f143818d.writeFields(aVar);
            }
            String str = this.f143819e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f143820f);
            C89349b bVar = this.f143821g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74314a(5, this.f143822h);
            return 0;
        } else if (i == 1) {
            C77949j3 j3Var2 = this.f143818d;
            if (j3Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, j3Var2.computeSize());
            }
            String str2 = this.f143819e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int h = i2 + C52418a.m58681h(3, this.f143820f);
            C89349b bVar2 = this.f143821g;
            if (bVar2 != null) {
                h += C52418a.m58675b(4, bVar2);
            }
            return h + C52418a.m58674a(5, this.f143822h);
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
            C51771w2 w2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C77949j3 j3Var3 = new C77949j3();
                    if (bArr != null && bArr.length > 0) {
                        j3Var3.parseFrom(bArr);
                    }
                    w2Var.f143818d = j3Var3;
                }
                return 0;
            } else if (intValue == 2) {
                w2Var.f143819e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                w2Var.f143820f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                w2Var.f143821g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                w2Var.f143822h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}

package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.i0 */
public class C53020i0 extends C47465a {

    /* renamed from: d */
    public int f147994d;

    /* renamed from: e */
    public String f147995e;

    /* renamed from: f */
    public LinkedList<String> f147996f = new LinkedList<>();

    /* renamed from: g */
    public int f147997g;

    /* renamed from: h */
    public LinkedList<String> f147998h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53020i0)) {
            return false;
        }
        C53020i0 i0Var = (C53020i0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147994d), Integer.valueOf(i0Var.f147994d)) && C46238a.m51546a(this.f147995e, i0Var.f147995e) && C46238a.m51546a(this.f147996f, i0Var.f147996f) && C46238a.m51546a(Integer.valueOf(this.f147997g), Integer.valueOf(i0Var.f147997g)) && C46238a.m51546a(this.f147998h, i0Var.f147998h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147994d);
            String str = this.f147995e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f147996f);
            aVar.mo74318e(4, this.f147997g);
            aVar.mo74320g(5, 1, this.f147998h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147994d) + 0;
            String str2 = this.f147995e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58680g(3, 1, this.f147996f) + C52418a.m58678e(4, this.f147997g) + C52418a.m58680g(5, 1, this.f147998h);
        } else if (i == 2) {
            this.f147996f.clear();
            this.f147998h.clear();
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
            C53020i0 i0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i0Var.f147994d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                i0Var.f147995e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                i0Var.f147996f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                i0Var.f147997g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                i0Var.f147998h.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}

package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iz */
public class C49918iz extends C47465a {

    /* renamed from: d */
    public long f135763d;

    /* renamed from: e */
    public C50633o40 f135764e;

    /* renamed from: f */
    public C51198s40 f135765f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49918iz)) {
            return false;
        }
        C49918iz izVar = (C49918iz) aVar;
        return C46238a.m51546a(Long.valueOf(this.f135763d), Long.valueOf(izVar.f135763d)) && C46238a.m51546a(this.f135764e, izVar.f135764e) && C46238a.m51546a(this.f135765f, izVar.f135765f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f135763d);
            C50633o40 o402 = this.f135764e;
            if (o402 != null) {
                aVar.mo74322i(2, o402.computeSize());
                this.f135764e.writeFields(aVar);
            }
            C51198s40 s402 = this.f135765f;
            if (s402 != null) {
                aVar.mo74322i(3, s402.computeSize());
                this.f135765f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f135763d) + 0;
            C50633o40 o403 = this.f135764e;
            if (o403 != null) {
                h += C52418a.m58682i(2, o403.computeSize());
            }
            C51198s40 s403 = this.f135765f;
            return s403 != null ? h + C52418a.m58682i(3, s403.computeSize()) : h;
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
            C49918iz izVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                izVar.f135763d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50633o40 o404 = new C50633o40();
                    if (bArr != null && bArr.length > 0) {
                        o404.parseFrom(bArr);
                    }
                    izVar.f135764e = o404;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51198s40 s404 = new C51198s40();
                    if (bArr2 != null && bArr2.length > 0) {
                        s404.parseFrom(bArr2);
                    }
                    izVar.f135765f = s404;
                }
                return 0;
            }
        }
    }
}

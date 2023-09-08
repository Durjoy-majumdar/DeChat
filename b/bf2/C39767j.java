package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.j */
public class C39767j extends C47465a {

    /* renamed from: d */
    public int f106720d;

    /* renamed from: e */
    public C39764g f106721e;

    /* renamed from: f */
    public String f106722f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39767j)) {
            return false;
        }
        C39767j jVar = (C39767j) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f106720d), Integer.valueOf(jVar.f106720d)) && C46238a.m51546a(this.f106721e, jVar.f106721e) && C46238a.m51546a(this.f106722f, jVar.f106722f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f106720d);
            C39764g gVar = this.f106721e;
            if (gVar != null) {
                aVar.mo74322i(2, gVar.computeSize());
                this.f106721e.writeFields(aVar);
            }
            String str = this.f106722f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f106720d) + 0;
            C39764g gVar2 = this.f106721e;
            if (gVar2 != null) {
                e += C52418a.m58682i(2, gVar2.computeSize());
            }
            String str2 = this.f106722f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C39767j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jVar.f106720d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C39764g gVar3 = new C39764g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.parseFrom(bArr);
                    }
                    jVar.f106721e = gVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jVar.f106722f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}

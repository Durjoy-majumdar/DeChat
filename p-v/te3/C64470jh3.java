package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jh3 */
public class C64470jh3 extends C47465a {

    /* renamed from: d */
    public String f183796d;

    /* renamed from: e */
    public int f183797e;

    /* renamed from: f */
    public FinderObject f183798f;

    /* renamed from: g */
    public C89349b f183799g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64470jh3)) {
            return false;
        }
        C64470jh3 jh32 = (C64470jh3) aVar;
        return C46238a.m51546a(this.f183796d, jh32.f183796d) && C46238a.m51546a(Integer.valueOf(this.f183797e), Integer.valueOf(jh32.f183797e)) && C46238a.m51546a(this.f183798f, jh32.f183798f) && C46238a.m51546a(this.f183799g, jh32.f183799g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183796d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183797e);
            FinderObject finderObject = this.f183798f;
            if (finderObject != null) {
                aVar.mo74322i(3, finderObject.computeSize());
                this.f183798f.writeFields(aVar);
            }
            C89349b bVar = this.f183799g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f183796d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f183797e);
            FinderObject finderObject2 = this.f183798f;
            if (finderObject2 != null) {
                e += C52418a.m58682i(3, finderObject2.computeSize());
            }
            C89349b bVar2 = this.f183799g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C64470jh3 jh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jh32.f183796d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                jh32.f183797e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject3.parseFrom(bArr);
                    }
                    jh32.f183798f = finderObject3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                jh32.f183799g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}

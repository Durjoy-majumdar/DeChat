package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bl0 */
public class C48872bl0 extends C47465a {

    /* renamed from: d */
    public int f131181d;

    /* renamed from: e */
    public LinkedList<FinderObject> f131182e = new LinkedList<>();

    /* renamed from: f */
    public String f131183f;

    /* renamed from: g */
    public int f131184g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48872bl0)) {
            return false;
        }
        C48872bl0 bl02 = (C48872bl0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131181d), Integer.valueOf(bl02.f131181d)) && C46238a.m51546a(this.f131182e, bl02.f131182e) && C46238a.m51546a(this.f131183f, bl02.f131183f) && C46238a.m51546a(Integer.valueOf(this.f131184g), Integer.valueOf(bl02.f131184g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131181d);
            aVar.mo74320g(2, 8, this.f131182e);
            String str = this.f131183f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f131184g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131181d) + 0 + C52418a.m58680g(2, 8, this.f131182e);
            String str2 = this.f131183f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f131184g);
        } else if (i == 2) {
            this.f131182e.clear();
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
            C48872bl0 bl02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bl02.f131181d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderObject finderObject = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject.parseFrom(bArr);
                    }
                    bl02.f131182e.add(finderObject);
                }
                return 0;
            } else if (intValue == 3) {
                bl02.f131183f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bl02.f131184g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}

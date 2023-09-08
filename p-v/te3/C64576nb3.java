package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nb3 */
public class C64576nb3 extends C47465a {

    /* renamed from: d */
    public int f184452d;

    /* renamed from: e */
    public C51018qv3 f184453e;

    /* renamed from: f */
    public int f184454f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64576nb3)) {
            return false;
        }
        C64576nb3 nb32 = (C64576nb3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184452d), Integer.valueOf(nb32.f184452d)) && C46238a.m51546a(this.f184453e, nb32.f184453e) && C46238a.m51546a(Integer.valueOf(this.f184454f), Integer.valueOf(nb32.f184454f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184452d);
            C51018qv3 qv32 = this.f184453e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f184453e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f184454f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184452d) + 0;
            C51018qv3 qv33 = this.f184453e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f184454f);
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
            C64576nb3 nb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nb32.f184452d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    nb32.f184453e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nb32.f184454f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f184452d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "PatternVersion", valueOf, false);
            aVar.mo71655d(jSONObject, "Sign", this.f184453e, false);
            aVar.mo71655d(jSONObject, "LockStatus", Integer.valueOf(this.f184454f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

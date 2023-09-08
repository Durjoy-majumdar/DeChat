package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x33 */
public class C101865x33 extends C47465a {

    /* renamed from: d */
    public int f299845d;

    /* renamed from: e */
    public C51024qx f299846e;

    /* renamed from: f */
    public int f299847f;

    /* renamed from: g */
    public C51018qv3 f299848g;

    /* renamed from: h */
    public int f299849h;

    /* renamed from: i */
    public int f299850i;

    /* renamed from: j */
    public int f299851j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101865x33)) {
            return false;
        }
        C101865x33 x332 = (C101865x33) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299845d), Integer.valueOf(x332.f299845d)) && C46238a.m51546a(this.f299846e, x332.f299846e) && C46238a.m51546a(Integer.valueOf(this.f299847f), Integer.valueOf(x332.f299847f)) && C46238a.m51546a(this.f299848g, x332.f299848g) && C46238a.m51546a(Integer.valueOf(this.f299849h), Integer.valueOf(x332.f299849h)) && C46238a.m51546a(Integer.valueOf(this.f299850i), Integer.valueOf(x332.f299850i)) && C46238a.m51546a(Integer.valueOf(this.f299851j), Integer.valueOf(x332.f299851j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f299846e == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f299848g != null) {
                aVar.mo74318e(1, this.f299845d);
                C51024qx qxVar = this.f299846e;
                if (qxVar != null) {
                    aVar.mo74322i(2, qxVar.computeSize());
                    this.f299846e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f299847f);
                C51018qv3 qv32 = this.f299848g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f299848g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f299849h);
                aVar.mo74318e(6, this.f299850i);
                aVar.mo74318e(7, this.f299851j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299845d) + 0;
            C51024qx qxVar2 = this.f299846e;
            if (qxVar2 != null) {
                e += C52418a.m58682i(2, qxVar2.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f299847f);
            C51018qv3 qv33 = this.f299848g;
            if (qv33 != null) {
                e2 += C52418a.m58682i(4, qv33.computeSize());
            }
            return e2 + C52418a.m58678e(5, this.f299849h) + C52418a.m58678e(6, this.f299850i) + C52418a.m58678e(7, this.f299851j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299846e == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f299848g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101865x33 x332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x332.f299845d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51024qx qxVar3 = new C51024qx();
                        if (bArr != null && bArr.length > 0) {
                            qxVar3.parseFrom(bArr);
                        }
                        x332.f299846e = qxVar3;
                    }
                    return 0;
                case 3:
                    x332.f299847f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        x332.f299848g = qv34;
                    }
                    return 0;
                case 5:
                    x332.f299849h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    x332.f299850i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    x332.f299851j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f299845d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Ret", valueOf, false);
            aVar.mo71655d(jSONObject, "CmdList", this.f299846e, false);
            aVar.mo71655d(jSONObject, "ContinueFlag", Integer.valueOf(this.f299847f), false);
            aVar.mo71655d(jSONObject, "KeyBuf", this.f299848g, false);
            aVar.mo71655d(jSONObject, "Status", Integer.valueOf(this.f299849h), false);
            aVar.mo71655d(jSONObject, "OnlineVersion", Integer.valueOf(this.f299850i), false);
            aVar.mo71655d(jSONObject, "SvrTime", Integer.valueOf(this.f299851j), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

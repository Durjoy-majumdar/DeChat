package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w33 */
public class C64794w33 extends C47465a {

    /* renamed from: d */
    public C51024qx f186052d;

    /* renamed from: e */
    public int f186053e;

    /* renamed from: f */
    public C51018qv3 f186054f;

    /* renamed from: g */
    public int f186055g;

    /* renamed from: h */
    public String f186056h;

    /* renamed from: i */
    public int f186057i;

    /* renamed from: j */
    public long f186058j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64794w33)) {
            return false;
        }
        C64794w33 w332 = (C64794w33) aVar;
        return C46238a.m51546a(this.f186052d, w332.f186052d) && C46238a.m51546a(Integer.valueOf(this.f186053e), Integer.valueOf(w332.f186053e)) && C46238a.m51546a(this.f186054f, w332.f186054f) && C46238a.m51546a(Integer.valueOf(this.f186055g), Integer.valueOf(w332.f186055g)) && C46238a.m51546a(this.f186056h, w332.f186056h) && C46238a.m51546a(Integer.valueOf(this.f186057i), Integer.valueOf(w332.f186057i)) && C46238a.m51546a(Long.valueOf(this.f186058j), Long.valueOf(w332.f186058j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51024qx qxVar = this.f186052d;
            if (qxVar == null) {
                throw new C52419b("Not all required fields were included: Oplog");
            } else if (this.f186054f != null) {
                if (qxVar != null) {
                    aVar.mo74322i(1, qxVar.computeSize());
                    this.f186052d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f186053e);
                C51018qv3 qv32 = this.f186054f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f186054f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f186055g);
                String str = this.f186056h;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f186057i);
                aVar.mo74321h(7, this.f186058j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i == 1) {
            C51024qx qxVar2 = this.f186052d;
            if (qxVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, qxVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f186053e);
            C51018qv3 qv33 = this.f186054f;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f186055g);
            String str2 = this.f186056h;
            if (str2 != null) {
                e2 += C52418a.m58683j(5, str2);
            }
            return e2 + C52418a.m58678e(6, this.f186057i) + C52418a.m58681h(7, this.f186058j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186052d == null) {
                throw new C52419b("Not all required fields were included: Oplog");
            } else if (this.f186054f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64794w33 w332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51024qx qxVar3 = new C51024qx();
                        if (bArr != null && bArr.length > 0) {
                            qxVar3.parseFrom(bArr);
                        }
                        w332.f186052d = qxVar3;
                    }
                    return 0;
                case 2:
                    w332.f186053e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        w332.f186054f = qv34;
                    }
                    return 0;
                case 4:
                    w332.f186055g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    w332.f186056h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w332.f186057i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w332.f186058j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C51024qx qxVar = this.f186052d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Oplog", qxVar, false);
            aVar.mo71655d(jSONObject, "Selector", Integer.valueOf(this.f186053e), false);
            aVar.mo71655d(jSONObject, "KeyBuf", this.f186054f, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f186055g), false);
            aVar.mo71655d(jSONObject, "DeviceType", this.f186056h, false);
            aVar.mo71655d(jSONObject, "SyncMsgDigest", Integer.valueOf(this.f186057i), false);
            aVar.mo71655d(jSONObject, "prev_download_flag", Long.valueOf(this.f186058j), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

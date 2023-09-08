package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nx3 */
public class C50607nx3 extends C47465a {

    /* renamed from: d */
    public long f138814d;

    /* renamed from: e */
    public String f138815e;

    /* renamed from: f */
    public int f138816f;

    /* renamed from: g */
    public C48884bn2 f138817g;

    /* renamed from: h */
    public int f138818h;

    /* renamed from: i */
    public LinkedList<zo4> f138819i = new LinkedList<>();

    /* renamed from: j */
    public int f138820j;

    /* renamed from: n */
    public String f138821n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50607nx3)) {
            return false;
        }
        C50607nx3 nx32 = (C50607nx3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f138814d), Long.valueOf(nx32.f138814d)) && C46238a.m51546a(this.f138815e, nx32.f138815e) && C46238a.m51546a(Integer.valueOf(this.f138816f), Integer.valueOf(nx32.f138816f)) && C46238a.m51546a(this.f138817g, nx32.f138817g) && C46238a.m51546a(Integer.valueOf(this.f138818h), Integer.valueOf(nx32.f138818h)) && C46238a.m51546a(this.f138819i, nx32.f138819i) && C46238a.m51546a(Integer.valueOf(this.f138820j), Integer.valueOf(nx32.f138820j)) && C46238a.m51546a(this.f138821n, nx32.f138821n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138815e != null) {
                aVar.mo74321h(1, this.f138814d);
                String str = this.f138815e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f138816f);
                C48884bn2 bn22 = this.f138817g;
                if (bn22 != null) {
                    aVar.mo74322i(4, bn22.computeSize());
                    this.f138817g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f138818h);
                aVar.mo74320g(6, 8, this.f138819i);
                aVar.mo74318e(7, this.f138820j);
                String str2 = this.f138821n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f138814d) + 0;
            String str3 = this.f138815e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            int e = h + C52418a.m58678e(3, this.f138816f);
            C48884bn2 bn23 = this.f138817g;
            if (bn23 != null) {
                e += C52418a.m58682i(4, bn23.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f138818h) + C52418a.m58680g(6, 8, this.f138819i) + C52418a.m58678e(7, this.f138820j);
            String str4 = this.f138821n;
            return str4 != null ? e2 + C52418a.m58683j(8, str4) : e2;
        } else if (i == 2) {
            this.f138819i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138815e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50607nx3 nx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nx32.f138814d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    nx32.f138815e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nx32.f138816f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        nx32.f138817g = bn24;
                    }
                    return 0;
                case 5:
                    nx32.f138818h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        zo4 zo4 = new zo4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zo4.parseFrom(bArr2);
                        }
                        nx32.f138819i.add(zo4);
                    }
                    return 0;
                case 7:
                    nx32.f138820j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nx32.f138821n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f138814d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BusinessType", valueOf, false);
            aVar.mo71655d(jSONObject, "KeyWord", this.f138815e, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f138816f), false);
            aVar.mo71655d(jSONObject, "Location", this.f138817g, false);
            aVar.mo71655d(jSONObject, "RequestSrc", Integer.valueOf(this.f138818h), false);
            aVar.mo71655d(jSONObject, "MatchUserList", this.f138819i, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f138820j), false);
            aVar.mo71655d(jSONObject, "SearchID", this.f138821n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

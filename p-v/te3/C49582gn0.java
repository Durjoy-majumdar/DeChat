package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gn0 */
public class C49582gn0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134133d;

    /* renamed from: e */
    public C89349b f134134e;

    /* renamed from: f */
    public C50317lw0 f134135f;

    /* renamed from: g */
    public C89349b f134136g;

    /* renamed from: h */
    public long f134137h;

    /* renamed from: i */
    public long f134138i;

    /* renamed from: j */
    public String f134139j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49582gn0)) {
            return false;
        }
        C49582gn0 gn02 = (C49582gn0) aVar;
        return C46238a.m51546a(this.BaseRequest, gn02.BaseRequest) && C46238a.m51546a(this.f134133d, gn02.f134133d) && C46238a.m51546a(this.f134134e, gn02.f134134e) && C46238a.m51546a(this.f134135f, gn02.f134135f) && C46238a.m51546a(this.f134136g, gn02.f134136g) && C46238a.m51546a(Long.valueOf(this.f134137h), Long.valueOf(gn02.f134137h)) && C46238a.m51546a(Long.valueOf(this.f134138i), Long.valueOf(gn02.f134138i)) && C46238a.m51546a(this.f134139j, gn02.f134139j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f134133d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134133d.writeFields(aVar);
            }
            C89349b bVar = this.f134134e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C50317lw0 lw02 = this.f134135f;
            if (lw02 != null) {
                aVar.mo74322i(4, lw02.computeSize());
                this.f134135f.writeFields(aVar);
            }
            C89349b bVar2 = this.f134136g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            aVar.mo74321h(6, this.f134137h);
            aVar.mo74321h(7, this.f134138i);
            String str = this.f134139j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134133d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar3 = this.f134134e;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(3, bVar3);
            }
            C50317lw0 lw03 = this.f134135f;
            if (lw03 != null) {
                i2 += C52418a.m58682i(4, lw03.computeSize());
            }
            C89349b bVar4 = this.f134136g;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(5, bVar4);
            }
            int h = i2 + C52418a.m58681h(6, this.f134137h) + C52418a.m58681h(7, this.f134138i);
            String str2 = this.f134139j;
            return str2 != null ? h + C52418a.m58683j(8, str2) : h;
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
            C49582gn0 gn02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        gn02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        gn02.f134133d = ig04;
                    }
                    return 0;
                case 3:
                    gn02.f134134e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50317lw0 lw04 = new C50317lw0();
                        if (bArr3 != null && bArr3.length > 0) {
                            lw04.parseFrom(bArr3);
                        }
                        gn02.f134135f = lw04;
                    }
                    return 0;
                case 5:
                    gn02.f134136g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    gn02.f134137h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    gn02.f134138i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    gn02.f134139j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "finder_basereq", this.f134133d, false);
            aVar.mo71655d(jSONObject, "live_cookies", this.f134134e, false);
            aVar.mo71655d(jSONObject, "box_id", this.f134135f, false);
            aVar.mo71655d(jSONObject, "last_buffer", this.f134136g, false);
            aVar.mo71655d(jSONObject, "object_id", Long.valueOf(this.f134137h), false);
            aVar.mo71655d(jSONObject, "live_id", Long.valueOf(this.f134138i), false);
            aVar.mo71655d(jSONObject, "finder_username", this.f134139j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

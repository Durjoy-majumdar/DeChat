package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jz0 */
public class C50054jz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f136468d;

    /* renamed from: e */
    public C89349b f136469e;

    /* renamed from: f */
    public long f136470f;

    /* renamed from: g */
    public long f136471g;

    /* renamed from: h */
    public LinkedList<C48721aj> f136472h = new LinkedList<>();

    /* renamed from: i */
    public String f136473i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50054jz0)) {
            return false;
        }
        C50054jz0 jz02 = (C50054jz0) aVar;
        return C46238a.m51546a(this.BaseRequest, jz02.BaseRequest) && C46238a.m51546a(this.f136468d, jz02.f136468d) && C46238a.m51546a(this.f136469e, jz02.f136469e) && C46238a.m51546a(Long.valueOf(this.f136470f), Long.valueOf(jz02.f136470f)) && C46238a.m51546a(Long.valueOf(this.f136471g), Long.valueOf(jz02.f136471g)) && C46238a.m51546a(this.f136472h, jz02.f136472h) && C46238a.m51546a(this.f136473i, jz02.f136473i);
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
            C49842ig0 ig02 = this.f136468d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f136468d.writeFields(aVar);
            }
            C89349b bVar = this.f136469e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f136470f);
            aVar.mo74321h(5, this.f136471g);
            aVar.mo74320g(6, 8, this.f136472h);
            String str = this.f136473i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f136468d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f136469e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f136470f) + C52418a.m58681h(5, this.f136471g) + C52418a.m58680g(6, 8, this.f136472h);
            String str2 = this.f136473i;
            return str2 != null ? h + C52418a.m58683j(7, str2) : h;
        } else if (i == 2) {
            this.f136472h.clear();
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
            C50054jz0 jz02 = objArr[1];
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
                        jz02.BaseRequest = iaVar3;
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
                        jz02.f136468d = ig04;
                    }
                    return 0;
                case 3:
                    jz02.f136469e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    jz02.f136470f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    jz02.f136471g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48721aj ajVar = new C48721aj();
                        if (bArr3 != null && bArr3.length > 0) {
                            ajVar.parseFrom(bArr3);
                        }
                        jz02.f136472h.add(ajVar);
                    }
                    return 0;
                case 7:
                    jz02.f136473i = aVar3.mo141633k(intValue);
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
            aVar.mo71655d(jSONObject, "finder_basereq", this.f136468d, false);
            aVar.mo71655d(jSONObject, "live_cookies", this.f136469e, false);
            aVar.mo71655d(jSONObject, "object_id", Long.valueOf(this.f136470f), false);
            aVar.mo71655d(jSONObject, "live_id", Long.valueOf(this.f136471g), false);
            aVar.mo71655d(jSONObject, "box_list", this.f136472h, false);
            aVar.mo71655d(jSONObject, "finder_username", this.f136473i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

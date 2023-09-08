package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xi */
public class C51977xi extends C47465a {

    /* renamed from: d */
    public C50317lw0 f144664d;

    /* renamed from: e */
    public C89349b f144665e;

    /* renamed from: f */
    public long f144666f;

    /* renamed from: g */
    public LinkedList<C49153dj> f144667g = new LinkedList<>();

    /* renamed from: h */
    public long f144668h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51977xi)) {
            return false;
        }
        C51977xi xiVar = (C51977xi) aVar;
        return C46238a.m51546a(this.f144664d, xiVar.f144664d) && C46238a.m51546a(this.f144665e, xiVar.f144665e) && C46238a.m51546a(Long.valueOf(this.f144666f), Long.valueOf(xiVar.f144666f)) && C46238a.m51546a(this.f144667g, xiVar.f144667g) && C46238a.m51546a(Long.valueOf(this.f144668h), Long.valueOf(xiVar.f144668h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50317lw0 lw02 = this.f144664d;
            if (lw02 != null) {
                aVar.mo74322i(1, lw02.computeSize());
                this.f144664d.writeFields(aVar);
            }
            C89349b bVar = this.f144665e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f144666f);
            aVar.mo74320g(4, 8, this.f144667g);
            aVar.mo74321h(5, this.f144668h);
            return 0;
        } else if (i == 1) {
            C50317lw0 lw03 = this.f144664d;
            if (lw03 != null) {
                i2 = 0 + C52418a.m58682i(1, lw03.computeSize());
            }
            C89349b bVar2 = this.f144665e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58681h(3, this.f144666f) + C52418a.m58680g(4, 8, this.f144667g) + C52418a.m58681h(5, this.f144668h);
        } else if (i == 2) {
            this.f144667g.clear();
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
            C51977xi xiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50317lw0 lw04 = new C50317lw0();
                    if (bArr != null && bArr.length > 0) {
                        lw04.parseFrom(bArr);
                    }
                    xiVar.f144664d = lw04;
                }
                return 0;
            } else if (intValue == 2) {
                xiVar.f144665e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                xiVar.f144666f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49153dj djVar = new C49153dj();
                    if (bArr2 != null && bArr2.length > 0) {
                        djVar.parseFrom(bArr2);
                    }
                    xiVar.f144667g.add(djVar);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xiVar.f144668h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C50317lw0 lw02 = this.f144664d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "boxId", lw02, false);
            aVar.mo71655d(jSONObject, "last_buffer", this.f144665e, false);
            aVar.mo71655d(jSONObject, "live_id", Long.valueOf(this.f144666f), false);
            aVar.mo71655d(jSONObject, "boxMsgs", this.f144667g, false);
            aVar.mo71655d(jSONObject, "lastEnterTimeStamp", Long.valueOf(this.f144668h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

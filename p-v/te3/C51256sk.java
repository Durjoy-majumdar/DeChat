package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sk */
public class C51256sk extends C47465a {

    /* renamed from: d */
    public int f141567d;

    /* renamed from: e */
    public C50139kk f141568e;

    /* renamed from: f */
    public C50002jk f141569f;

    /* renamed from: g */
    public long f141570g;

    /* renamed from: h */
    public C50971qk f141571h;

    /* renamed from: i */
    public C51557uk f141572i;

    /* renamed from: j */
    public C50841pk f141573j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51256sk)) {
            return false;
        }
        C51256sk skVar = (C51256sk) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141567d), Integer.valueOf(skVar.f141567d)) && C46238a.m51546a(this.f141568e, skVar.f141568e) && C46238a.m51546a(this.f141569f, skVar.f141569f) && C46238a.m51546a(Long.valueOf(this.f141570g), Long.valueOf(skVar.f141570g)) && C46238a.m51546a(this.f141571h, skVar.f141571h) && C46238a.m51546a(this.f141572i, skVar.f141572i) && C46238a.m51546a(this.f141573j, skVar.f141573j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141567d);
            C50139kk kkVar = this.f141568e;
            if (kkVar != null) {
                aVar.mo74322i(2, kkVar.computeSize());
                this.f141568e.writeFields(aVar);
            }
            C50002jk jkVar = this.f141569f;
            if (jkVar != null) {
                aVar.mo74322i(3, jkVar.computeSize());
                this.f141569f.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f141570g);
            C50971qk qkVar = this.f141571h;
            if (qkVar != null) {
                aVar.mo74322i(5, qkVar.computeSize());
                this.f141571h.writeFields(aVar);
            }
            C51557uk ukVar = this.f141572i;
            if (ukVar != null) {
                aVar.mo74322i(6, ukVar.computeSize());
                this.f141572i.writeFields(aVar);
            }
            C50841pk pkVar = this.f141573j;
            if (pkVar != null) {
                aVar.mo74322i(7, pkVar.computeSize());
                this.f141573j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141567d) + 0;
            C50139kk kkVar2 = this.f141568e;
            if (kkVar2 != null) {
                e += C52418a.m58682i(2, kkVar2.computeSize());
            }
            C50002jk jkVar2 = this.f141569f;
            if (jkVar2 != null) {
                e += C52418a.m58682i(3, jkVar2.computeSize());
            }
            int h = e + C52418a.m58681h(4, this.f141570g);
            C50971qk qkVar2 = this.f141571h;
            if (qkVar2 != null) {
                h += C52418a.m58682i(5, qkVar2.computeSize());
            }
            C51557uk ukVar2 = this.f141572i;
            if (ukVar2 != null) {
                h += C52418a.m58682i(6, ukVar2.computeSize());
            }
            C50841pk pkVar2 = this.f141573j;
            return pkVar2 != null ? h + C52418a.m58682i(7, pkVar2.computeSize()) : h;
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
            C51256sk skVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    skVar.f141567d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50139kk kkVar3 = new C50139kk();
                        if (bArr != null && bArr.length > 0) {
                            kkVar3.parseFrom(bArr);
                        }
                        skVar.f141568e = kkVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50002jk jkVar3 = new C50002jk();
                        if (bArr2 != null && bArr2.length > 0) {
                            jkVar3.parseFrom(bArr2);
                        }
                        skVar.f141569f = jkVar3;
                    }
                    return 0;
                case 4:
                    skVar.f141570g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C50971qk qkVar3 = new C50971qk();
                        if (bArr3 != null && bArr3.length > 0) {
                            qkVar3.parseFrom(bArr3);
                        }
                        skVar.f141571h = qkVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51557uk ukVar3 = new C51557uk();
                        if (bArr4 != null && bArr4.length > 0) {
                            ukVar3.parseFrom(bArr4);
                        }
                        skVar.f141572i = ukVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C50841pk pkVar3 = new C50841pk();
                        if (bArr5 != null && bArr5.length > 0) {
                            pkVar3.parseFrom(bArr5);
                        }
                        skVar.f141573j = pkVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f141567d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Type", valueOf, false);
            aVar.mo71655d(jSONObject, "ContactItem", this.f141568e, false);
            aVar.mo71655d(jSONObject, "CommonItem", this.f141569f, false);
            aVar.mo71655d(jSONObject, "DocID", Long.valueOf(this.f141570g), false);
            aVar.mo71655d(jSONObject, "ProductItem", this.f141571h, false);
            aVar.mo71655d(jSONObject, "SnsItem", this.f141572i, false);
            aVar.mo71655d(jSONObject, "POIItem", this.f141573j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

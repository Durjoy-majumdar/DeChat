package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qy */
public class C51028qy extends C47465a {

    /* renamed from: d */
    public int f140609d;

    /* renamed from: e */
    public C50028jr3 f140610e;

    /* renamed from: f */
    public int f140611f;

    /* renamed from: g */
    public int f140612g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51028qy)) {
            return false;
        }
        C51028qy qyVar = (C51028qy) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140609d), Integer.valueOf(qyVar.f140609d)) && C46238a.m51546a(this.f140610e, qyVar.f140610e) && C46238a.m51546a(Integer.valueOf(this.f140611f), Integer.valueOf(qyVar.f140611f)) && C46238a.m51546a(Integer.valueOf(this.f140612g), Integer.valueOf(qyVar.f140612g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140609d);
            C50028jr3 jr32 = this.f140610e;
            if (jr32 != null) {
                aVar.mo74322i(2, jr32.computeSize());
                this.f140610e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f140611f);
            aVar.mo74318e(4, this.f140612g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140609d) + 0;
            C50028jr3 jr33 = this.f140610e;
            if (jr33 != null) {
                e += C52418a.m58682i(2, jr33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f140611f) + C52418a.m58678e(4, this.f140612g);
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
            C51028qy qyVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qyVar.f140609d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50028jr3 jr34 = new C50028jr3();
                    if (bArr != null && bArr.length > 0) {
                        jr34.parseFrom(bArr);
                    }
                    qyVar.f140610e = jr34;
                }
                return 0;
            } else if (intValue == 3) {
                qyVar.f140611f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qyVar.f140612g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f140609d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "size", valueOf, true);
            aVar.mo71655d(jSONObject, "color", this.f140610e, true);
            aVar.mo71655d(jSONObject, "line", Integer.valueOf(this.f140611f), true);
            aVar.mo71655d(jSONObject, "vertical_align", Integer.valueOf(this.f140612g), true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -128421636:
                            if (next.equals("vertical_align")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3321844:
                            if (next.equals("line")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3530753:
                            if (next.equals("size")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 94842723:
                            if (next.equals("color")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f140609d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C50028jr3 jr32 = new C50028jr3();
                            jr32.toPb(((JSONObject) opt).toString());
                            this.f140610e = jr32;
                        }
                    } else if (c == 2) {
                        this.f140611f = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 3) {
                        this.f140612g = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("CommonAttr", e, "", new Object[0]);
            }
        }
        return this;
    }
}

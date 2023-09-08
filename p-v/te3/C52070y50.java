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

/* renamed from: te3.y50 */
public class C52070y50 extends C47465a {

    /* renamed from: d */
    public C49730ho f145120d;

    /* renamed from: e */
    public C49730ho f145121e;

    /* renamed from: f */
    public int f145122f;

    /* renamed from: g */
    public int f145123g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52070y50)) {
            return false;
        }
        C52070y50 y502 = (C52070y50) aVar;
        return C46238a.m51546a(this.f145120d, y502.f145120d) && C46238a.m51546a(this.f145121e, y502.f145121e) && C46238a.m51546a(Integer.valueOf(this.f145122f), Integer.valueOf(y502.f145122f)) && C46238a.m51546a(Integer.valueOf(this.f145123g), Integer.valueOf(y502.f145123g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49730ho hoVar = this.f145120d;
            if (hoVar != null) {
                aVar.mo74322i(1, hoVar.computeSize());
                this.f145120d.writeFields(aVar);
            }
            C49730ho hoVar2 = this.f145121e;
            if (hoVar2 != null) {
                aVar.mo74322i(2, hoVar2.computeSize());
                this.f145121e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f145122f);
            aVar.mo74318e(4, this.f145123g);
            return 0;
        } else if (i == 1) {
            C49730ho hoVar3 = this.f145120d;
            if (hoVar3 != null) {
                i2 = 0 + C52418a.m58682i(1, hoVar3.computeSize());
            }
            C49730ho hoVar4 = this.f145121e;
            if (hoVar4 != null) {
                i2 += C52418a.m58682i(2, hoVar4.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f145122f) + C52418a.m58678e(4, this.f145123g);
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
            C52070y50 y502 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49730ho hoVar5 = new C49730ho();
                    if (bArr != null && bArr.length > 0) {
                        hoVar5.parseFrom(bArr);
                    }
                    y502.f145120d = hoVar5;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49730ho hoVar6 = new C49730ho();
                    if (bArr2 != null && bArr2.length > 0) {
                        hoVar6.parseFrom(bArr2);
                    }
                    y502.f145121e = hoVar6;
                }
                return 0;
            } else if (intValue == 3) {
                y502.f145122f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                y502.f145123g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49730ho hoVar = this.f145120d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "small_card", hoVar, true);
            aVar.mo71655d(jSONObject, "big_card", this.f145121e, true);
            aVar.mo71655d(jSONObject, "change_time", Integer.valueOf(this.f145122f), true);
            aVar.mo71655d(jSONObject, "finish_change", Integer.valueOf(this.f145123g), true);
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
                        case -1654471172:
                            if (next.equals("change_time")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 734910191:
                            if (next.equals("big_card")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1229499208:
                            if (next.equals("small_card")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2062862556:
                            if (next.equals("finish_change")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C49730ho hoVar = new C49730ho();
                            hoVar.toPb(((JSONObject) opt).toString());
                            this.f145120d = hoVar;
                        }
                    } else if (c == 1) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C49730ho hoVar2 = new C49730ho();
                            hoVar2.toPb(((JSONObject) opt2).toString());
                            this.f145121e = hoVar2;
                        }
                    } else if (c == 2) {
                        this.f145122f = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 3) {
                        this.f145123g = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("DynamicCardStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}

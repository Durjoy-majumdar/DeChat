package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class mg4 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<pg4> f184323d = new LinkedList<>();

    /* renamed from: e */
    public int f184324e;

    /* renamed from: f */
    public int f184325f;

    /* renamed from: g */
    public int f184326g;

    /* renamed from: h */
    public boolean f184327h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mg4)) {
            return false;
        }
        mg4 mg4 = (mg4) aVar;
        return C46238a.m51546a(this.BaseResponse, mg4.BaseResponse) && C46238a.m51546a(this.f184323d, mg4.f184323d) && C46238a.m51546a(Integer.valueOf(this.f184324e), Integer.valueOf(mg4.f184324e)) && C46238a.m51546a(Integer.valueOf(this.f184325f), Integer.valueOf(mg4.f184325f)) && C46238a.m51546a(Integer.valueOf(this.f184326g), Integer.valueOf(mg4.f184326g)) && C46238a.m51546a(Boolean.valueOf(this.f184327h), Boolean.valueOf(mg4.f184327h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f184323d);
                aVar.mo74318e(3, this.f184324e);
                aVar.mo74318e(4, this.f184325f);
                aVar.mo74318e(5, this.f184326g);
                aVar.mo74314a(9, this.f184327h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f184323d) + C52418a.m58678e(3, this.f184324e) + C52418a.m58678e(4, this.f184325f) + C52418a.m58678e(5, this.f184326g) + C52418a.m58674a(9, this.f184327h);
        } else if (i == 2) {
            this.f184323d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            mg4 mg4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    mg4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    pg4 pg4 = new pg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        pg4.parseFrom(bArr2);
                    }
                    mg4.f184323d.add(pg4);
                }
                return 0;
            } else if (intValue == 3) {
                mg4.f184324e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mg4.f184325f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                mg4.f184326g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 9) {
                return -1;
            } else {
                mg4.f184327h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, true);
            aVar.mo71655d(jSONObject, "biz_info_list", this.f184323d, true);
            aVar.mo71655d(jSONObject, "display_ctrl_flag", Integer.valueOf(this.f184324e), true);
            aVar.mo71655d(jSONObject, "server_rank_often_read_biz", Integer.valueOf(this.f184325f), true);
            aVar.mo71655d(jSONObject, "green_point_stay_time_in_sec", Integer.valueOf(this.f184326g), true);
            aVar.mo71655d(jSONObject, "show_finder_live", Boolean.valueOf(this.f184327h), true);
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
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -200294621:
                            if (next.equals("show_finder_live")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 688560782:
                            if (next.equals("green_point_stay_time_in_sec")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1537817955:
                            if (next.equals("biz_info_list")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1628361114:
                            if (next.equals("server_rank_often_read_biz")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 2071153027:
                            if (next.equals("display_ctrl_flag")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            this.BaseResponse = (C49966ja) new C49966ja().toPb(((JSONObject) opt).toString());
                        }
                    } else if (c == 1) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) opt2;
                            for (int i = 0; i < jSONArray.length(); i++) {
                                Object obj = jSONArray.get(i);
                                if (obj instanceof JSONObject) {
                                    LinkedList<pg4> linkedList = this.f184323d;
                                    pg4 pg4 = new pg4();
                                    pg4.toPb(((JSONObject) obj).toString());
                                    linkedList.add(pg4);
                                }
                            }
                        }
                    } else if (c == 2) {
                        this.f184324e = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 3) {
                        this.f184325f = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 4) {
                        this.f184326g = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 5) {
                        this.f184327h = ((Boolean) jSONObject.opt(next)).booleanValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("TimelineGetOftenReadBizResp", e, "", new Object[0]);
            }
        }
        return this;
    }
}

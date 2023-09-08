package com.tencent.p014mm.protocal.protobuf;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderTipsShowDiscoveryExtInfo */
public class FinderTipsShowDiscoveryExtInfo extends C47465a {
    public String show_ext_info;

    public static final FinderTipsShowDiscoveryExtInfo create() {
        return new FinderTipsShowDiscoveryExtInfo();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof FinderTipsShowDiscoveryExtInfo) && C46238a.m51546a(this.show_ext_info, ((FinderTipsShowDiscoveryExtInfo) aVar).show_ext_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.show_ext_info;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.show_ext_info;
            if (str2 != null) {
                return 0 + C52418a.m58683j(1, str2);
            }
            return 0;
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
            FinderTipsShowDiscoveryExtInfo finderTipsShowDiscoveryExtInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            finderTipsShowDiscoveryExtInfo.show_ext_info = aVar3.mo141633k(intValue);
            return 0;
        }
    }

    public FinderTipsShowDiscoveryExtInfo setShow_ext_info(String str) {
        this.show_ext_info = str;
        return this;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    if (next.hashCode() == -86367474) {
                        if (next.equals("show_ext_info")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        this.show_ext_info = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderTipsShowDiscoveryExtInfo", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "show_ext_info", this.show_ext_info, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

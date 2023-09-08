package com.unionpay;

import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.unionpay.r */
public final class C116530r implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349497a;

    public C116530r(UPPayWapActivity uPPayWapActivity) {
        this.f349497a = uPPayWapActivity;
    }

    /* renamed from: a */
    public final void mo180512a(String str, C116517b0 b0Var) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                UPUtils.m90296c(this.f349497a, jSONObject.getString(next), next);
            }
            if (b0Var != null) {
                b0Var.mo180515a(UPPayWapActivity.m164324H7("0", "success", (String) null));
            }
        } catch (Exception e) {
            if (b0Var != null) {
                b0Var.mo180515a(UPPayWapActivity.m164324H7("1", e.getMessage(), (String) null));
            }
        }
    }
}

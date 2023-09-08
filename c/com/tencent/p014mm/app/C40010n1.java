package com.tencent.p014mm.app;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.plugin.profile.C70142g;
import com.tencent.p014mm.storage.C72996z1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.app.n1 */
public class C40010n1 implements C40294d.C40295a {

    /* renamed from: a */
    public final Map<String, Integer> f107257a = new HashMap();

    /* renamed from: b */
    public final Map<String, Integer> f107258b = new HashMap();

    /* renamed from: c */
    public final /* synthetic */ Context f107259c;

    public C40010n1(Context context) {
        this.f107259c = context;
    }

    /* renamed from: a */
    public String mo62699a(String str) {
        if (!((HashMap) this.f107257a).containsKey(str)) {
            return null;
        }
        String string = this.f107259c.getString(((Integer) ((HashMap) this.f107257a).get(str)).intValue());
        return C72996z1.m85805J5(str) ? C70142g.m82632d(this.f107259c, "weixin", new SpannableString(string)).toString() : string;
    }
}

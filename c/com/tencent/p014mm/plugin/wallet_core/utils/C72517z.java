package com.tencent.p014mm.plugin.wallet_core.utils;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import di3.C86312j;
import org.json.JSONObject;
import p281yz.C79173v;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.z */
public class C72517z {

    /* renamed from: a */
    public static long f210938a;

    /* renamed from: a */
    public static String m84853a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnterScene", i);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m84854b(Activity activity, int i, int i2) {
        C115669n.INSTANCE.mo160131h(10932, Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: c */
    public static void m84855c(Activity activity, PayInfo payInfo, Orders orders, int i) {
        if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() && payInfo != null && orders != null) {
            C115669n.INSTANCE.mo160131h(10725, Integer.valueOf(i), Integer.valueOf(payInfo.f212587e), Integer.valueOf((int) (orders.f209566h * 100.0d)), orders.f209568j);
        }
    }

    /* renamed from: d */
    public static void m84856d(Activity activity, Bundle bundle, int i) {
        Class cls = C79173v.class;
        C79148e g = C79143a.m95768g(activity);
        if (!((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w() && g != null && g.mo109117s()) {
            PayInfo payInfo = (PayInfo) bundle.getParcelable("key_pay_info");
            Orders orders = (Orders) bundle.getParcelable("key_orders");
            if (payInfo != null && orders != null) {
                C115669n.INSTANCE.mo160131h(10725, Integer.valueOf(i), Integer.valueOf(payInfo.f212587e), Integer.valueOf((int) (orders.f209566h * 100.0d)), orders.f209568j);
            }
        } else if (!((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w() && bundle != null && bundle.getBoolean("key_is_bind_reg_process", false)) {
            C115669n.INSTANCE.mo160131h(10932, Integer.valueOf(i), Integer.valueOf(bundle.getInt("key_bind_scene", 0)));
        }
    }

    /* renamed from: e */
    public static void m84857e() {
        f210938a = System.currentTimeMillis();
    }
}

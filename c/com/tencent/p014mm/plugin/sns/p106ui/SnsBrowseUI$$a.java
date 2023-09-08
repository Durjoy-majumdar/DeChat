package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import ft2.C97979c;
import ft2.c$$a;
import ft2.c$$e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$a */
public final /* synthetic */ class SnsBrowseUI$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsBrowseUI f277814d;

    /* renamed from: e */
    public final /* synthetic */ String f277815e;

    /* renamed from: f */
    public final /* synthetic */ long f277816f;

    public /* synthetic */ SnsBrowseUI$$a(SnsBrowseUI snsBrowseUI, String str, long j) {
        this.f277814d = snsBrowseUI;
        this.f277815e = str;
        this.f277816f = j;
    }

    public final void onClick(View view) {
        Uri uri;
        String str;
        SnsBrowseUI snsBrowseUI = this.f277814d;
        String str2 = this.f277815e;
        long j = this.f277816f;
        int i = SnsBrowseUI.f277783g1;
        snsBrowseUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(Long.valueOf(j));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsBrowseUI, array);
        SnsMethodCalculate.markStartTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105924i("MicroMsg.SnsPopMediasUI", "flExceprtSkip onClick, url = " + str2);
        Class cls = C45696d.class;
        SnsMethodCalculate.markStartTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        HashSet hashSet = new HashSet();
        hashSet.add("mp.weixin.qq.com");
        boolean z = false;
        try {
            uri = Uri.parse(str2);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] Uri.parse Exp:%s sourceUrl:%s", e, str2);
            uri = null;
        }
        if (uri == null) {
            Log.m105920e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] uri == null, return");
            SnsMethodCalculate.markEndTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else if (!hashSet.contains(uri.getHost())) {
            Log.m105920e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] uri.host valid host = " + uri.getHost() + ", return");
            SnsMethodCalculate.markEndTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            int i2 = Util.getInt(uri.getQueryParameter("item_show_type"), -1);
            int intExtra = snsBrowseUI.getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(260)) {
                str = "checkGoToSourceUrl";
                if (((C45696d) C86709a0.m107533q(cls)).Ms0(snsBrowseUI, str2, i2, true, 260, intExtra, new Intent())) {
                    z = true;
                }
            } else {
                str = "checkGoToSourceUrl";
            }
            if (z) {
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str2);
                C88144b.m109791i(snsBrowseUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        HashMap<Long, c$$e> hashMap = C97979c.f287345j;
        SnsMethodCalculate.markStartTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C94866e1.my0().post(new c$$a(j));
        SnsMethodCalculate.markEndTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SnsMethodCalculate.markEndTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        C117292a.m165361g(snsBrowseUI, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

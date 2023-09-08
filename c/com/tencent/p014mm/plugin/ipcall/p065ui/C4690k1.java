package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.k1 */
public class C4690k1 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19678d;

    public C4690k1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19678d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$13", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        ((TextView) view).setHighlightColor(this.f19678d.getResources().getColor(C0966R.color.ahf));
        String str = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice";
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        if (!Util.isNullOrNil(currentLanguage)) {
            str = str + "&wechat_real_lang=" + currentLanguage;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        C88144b.m109791i(this.f19678d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$13", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f19678d.getResources().getColor(C0966R.color.a1d));
        textPaint.setUnderlineText(false);
    }
}

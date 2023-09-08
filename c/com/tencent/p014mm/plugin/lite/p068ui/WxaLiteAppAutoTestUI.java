package com.tencent.p014mm.plugin.lite.p068ui;

import android.os.Bundle;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.logic.C115485l;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76912y0;
import p244tt.C14088e;
import tw0.C90587j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppAutoTestUI;", "Landroid/app/Activity;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppAutoTestUI */
public final class WxaLiteAppAutoTestUI extends HellActivity {

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppAutoTestUI$a */
    public static final class C4808a implements C115477b {

        /* renamed from: a */
        public final /* synthetic */ WxaLiteAppAutoTestUI f19845a;

        public C4808a(WxaLiteAppAutoTestUI wxaLiteAppAutoTestUI) {
            this.f19845a = wxaLiteAppAutoTestUI;
        }

        /* renamed from: a */
        public void mo5700a(String str, int i) {
            C87412m.m108594g(str, "appId");
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "下载失败", 0).show();
            this.f19845a.finish();
        }

        /* renamed from: b */
        public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
            C87412m.m108594g(wxaLiteAppInfo, "info");
            Bundle bundle = new Bundle();
            bundle.putString("appId", wxaLiteAppInfo.f339290d);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, false, (C14088e.C14090b) null);
            this.f19845a.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C90587j jVar = new C90587j();
        jVar.f260269a = "wxalitefebbc33b53466af81dcbca5fef1c6c4f";
        jVar.f260272d = "http://dldir1.qq.com/weixin/liteappconfig/wxalitefebbc33b53466af81dcbca5fef1c6c4f_1f3b93b7b7a029ac684f5f9c83e27b39_d3198365b4b049dd9a197bc611be001e.zip";
        C115485l.INSTANCE.mo175462a(jVar, "debug", (C115492q.C115496d) null, new C4808a(this));
    }
}

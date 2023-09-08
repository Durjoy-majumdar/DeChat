package av2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import ft2.C97979c;
import ft2.c$$a;
import ft2.c$$e;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;

/* renamed from: av2.i */
public final class C92118i {

    /* renamed from: av2.i$a */
    public static final class C92119a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263701d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f263702e;

        /* renamed from: f */
        public final /* synthetic */ String f263703f;

        /* renamed from: g */
        public final /* synthetic */ long f263704g;

        /* renamed from: av2.i$a$a */
        public static final class C92120a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ MMActivity f263705d;

            /* renamed from: e */
            public final /* synthetic */ String f263706e;

            /* renamed from: f */
            public final /* synthetic */ long f263707f;

            public C92120a(MMActivity mMActivity, String str, long j) {
                this.f263705d = mMActivity;
                this.f263706e = str;
                this.f263707f = j;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Uri uri;
                String str;
                String str2;
                SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1$1");
                MMActivity mMActivity = this.f263705d;
                String str3 = this.f263706e;
                SnsMethodCalculate.markStartTimeMs("access$checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                Class cls = C45696d.class;
                SnsMethodCalculate.markStartTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                HashSet hashSet = new HashSet();
                hashSet.add("mp.weixin.qq.com");
                boolean z = false;
                try {
                    uri = Uri.parse(str3);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] Uri.parse Exp:%s sourceUrl:%s", e, str3);
                    uri = null;
                }
                if (uri == null) {
                    Log.m105920e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] uri == null, return");
                    SnsMethodCalculate.markEndTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                } else if (!hashSet.contains(uri.getHost())) {
                    Log.m105920e("MicroMsg.SnsPopMediasUI", "[checkGoToSourceUrl] uri.host valid host = " + uri.getHost() + ", return");
                    SnsMethodCalculate.markEndTimeMs("checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                } else {
                    int i2 = Util.getInt(uri.getQueryParameter("item_show_type"), -1);
                    int intExtra = mMActivity.getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
                    if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(260)) {
                        str = "onMMMenuItemSelected";
                        str2 = "checkGoToSourceUrl";
                        if (((C45696d) C86709a0.m107533q(cls)).Ms0(mMActivity, str3, i2, true, 260, intExtra, new Intent())) {
                            z = true;
                        }
                    } else {
                        str = "onMMMenuItemSelected";
                        str2 = "checkGoToSourceUrl";
                    }
                    if (z) {
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", str3);
                        C88144b.m109791i(mMActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                    }
                    SnsMethodCalculate.markEndTimeMs("access$checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                    long j = this.f263707f;
                    HashMap<Long, c$$e> hashMap = C97979c.f287345j;
                    SnsMethodCalculate.markStartTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                    C94866e1.my0().post(new c$$a(j));
                    SnsMethodCalculate.markEndTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                    SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1$1");
                }
                str = "onMMMenuItemSelected";
                SnsMethodCalculate.markEndTimeMs("access$checkGoToSourceUrl", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
                long j2 = this.f263707f;
                HashMap<Long, c$$e> hashMap2 = C97979c.f287345j;
                SnsMethodCalculate.markStartTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                C94866e1.my0().post(new c$$a(j2));
                SnsMethodCalculate.markEndTimeMs("recordClickExceprtReadOrigin", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1$1");
            }
        }

        public C92119a(C92126r rVar, MMActivity mMActivity, String str, long j) {
            this.f263701d = rVar;
            this.f263702e = mMActivity;
            this.f263703f = str;
            this.f263704g = j;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1");
            e0Var.clear();
            e0Var.mo107135b(1016, C0966R.string.neu, C0966R.raw.icons_outlined_subscriptions);
            this.f263701d.mo126106i(new C92120a(this.f263702e, this.f263703f, this.f263704g));
            SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1");
        }
    }

    /* renamed from: a */
    public static final void m115791a(C92126r rVar, MMActivity mMActivity, String str, long j) {
        SnsMethodCalculate.markStartTimeMs("addReadOriginTextChoose", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
        C87412m.m108594g(rVar, "<this>");
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, "url");
        rVar.mo126101d().f225780o = new C92119a(rVar, mMActivity, str, j);
        SnsMethodCalculate.markEndTimeMs("addReadOriginTextChoose", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt");
    }
}

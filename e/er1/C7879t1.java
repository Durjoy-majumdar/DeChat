package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.TextView;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import java.util.HashSet;
import ke3.C88144b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;
import z04.C112550d0;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: er1.t1 */
public final class C7879t1 {

    /* renamed from: a */
    public static final C7879t1 f26497a = new C7879t1();

    /* renamed from: b */
    public static String f26498b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/readtemplate?t=finder_appeal");

    /* renamed from: er1.t1$a */
    public static final class C7880a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f26499d;

        /* renamed from: e */
        public final /* synthetic */ Context f26500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7880a(String str, Context context) {
            super(1);
            this.f26499d = str;
            this.f26500e = context;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "url");
            String str2 = this.f26499d;
            Log.m105924i(str2, "click " + str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(this.f26500e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo8993a() {
        if (C58784w3.f168295a.mo83983z0()) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_ORIGINAL_REDDOT_FLAG2_INT_SYNC;
            boolean z = false;
            if (!(i.mo119689j(aVar, 0) == 1) && mo8994b()) {
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                if ((c != null ? c.field_originalEntranceFlag : 0) == 2) {
                    z = true;
                }
                if (!z) {
                    FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
                    C51978xi1 xi12 = new C51978xi1();
                    xi12.f144673h = String.valueOf(C31543z5.m39453c());
                    xi12.f144669d = 50000;
                    xi12.f144670e = 1000;
                    C64586nn1 nn12 = new C64586nn1();
                    nn12.f184502d = 1;
                    nn12.f184506h = 1;
                    nn12.f184507i = "FinderPosterEntrance";
                    xi12.f144672g.add(nn12);
                    C64586nn1 nn13 = new C64586nn1();
                    nn13.f184502d = 1;
                    nn13.f184506h = 1;
                    nn13.f184507i = "OriginalEntrance";
                    xi12.f144672g.add(nn13);
                    C60152b4.C8759a.m8561a(Nx0, xi12, "checkInsertOriginalRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    Log.m105924i("Finder.FinderOriginalUtil", "insertOriginalRedDot");
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo8994b() {
        C37521f.f99374d.getClass();
        if (C37521f.f99263Q2.mo60266n().intValue() != 1) {
            C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
            return c != null && c.field_originalEntranceFlag == 1;
        }
    }

    /* renamed from: c */
    public final void mo8995c(Context context, String str, String str2, String str3, TextView textView, String str4) {
        Context context2 = context;
        String str5 = str2;
        TextView textView2 = textView;
        String str6 = str4;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str, "h5url");
        C87412m.m108594g(str5, "allText");
        C87412m.m108594g(str3, "linkText");
        C87412m.m108594g(textView2, "descTv");
        C87412m.m108594g(str6, "logTag");
        int E = C112550d0.m153769E(str2, str3, 0, false, 6, (Object) null);
        int length = str3.length() + E;
        SpannableString spannableString = new SpannableString(str5);
        if (E >= 0 && length <= str2.length()) {
            spannableString.setSpan(new C4059g5(str, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d), MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), false, false, new C7880a(str6, context2), 24, (C8480h) null), E, length, 17);
        }
        textView2.setText(spannableString);
        textView2.setOnTouchListener(new C75654s1(spannableString, textView2));
    }
}

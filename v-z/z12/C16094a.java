package z12;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import nj3.C76879j;
import p148ei.C7660a;
import w12.C15034d;
import z04.C112551y;

/* renamed from: z12.a */
public final class C16094a {

    /* renamed from: a */
    public static final C16094a f43246a = new C16094a();

    /* renamed from: a */
    public final void mo14690a(Context context, String str, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "loginUrl");
        Log.m105924i("KidsWatchUtil", "gotoLauncherUI, context:" + context + ", url:" + str + ", isFinish:" + z);
        if (!z) {
            C86709a0.m107524d().mo123460f(new C15034d(str));
        }
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        C88144b.m109801s(context, ".ui.LauncherUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public final void mo14691b(Context context, String str, String str2, int i, String str3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "sceneNote");
        Log.m105924i("KidsWatchUtil", "gotoMiniProgram, appId:" + str + ", path:" + str2 + ", scene:" + i + ", sceneNote:" + str3);
        C86299o oVar = new C86299o();
        oVar.f250930b = str;
        oVar.f250934f = str2;
        oVar.f250939k = i;
        oVar.f250940l = str3;
        oVar.f250931c = 0;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
    }

    /* renamed from: c */
    public final void mo14692c(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        C87412m.m108594g(context, "context");
        Log.m105924i("KidsWatchUtil", "marginAdapter, context:" + context);
        int round = Math.round(((float) C76577a.m92145A(context)) / C74942w4.m89787d(context));
        int a = C74942w4.m89784a(context, 8);
        int a2 = C74942w4.m89784a(context, 40);
        if (round >= 375) {
            a = C74942w4.m89784a(context, 24);
            a2 = C74942w4.m89784a(context, 96);
        }
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = a;
            layoutParams2.rightMargin = a;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (linearLayout2 != null) {
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = a2;
            linearLayout2.setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: d */
    public final void mo14693d(Context context, int i, String str) {
        C87412m.m108594g(context, "context");
        Log.m105924i("KidsWatchUtil", "context:" + context + ", errCode:errCode, errMsg:" + str);
        if (!Util.isNullOrNil(str)) {
            C87412m.m108591d(str);
            if (!C112551y.m153819s(str, "<", false)) {
                C76879j.m92748s(context, str, "");
                return;
            }
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(context, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(context, C0966R.string.bcp, 0);
            }
        } else if (i == -1) {
            C76879j.m92748s(context, context.getString(C0966R.string.g0n), "");
        } else if (i == -2) {
            C76879j.m92748s(context, context.getString(C0966R.string.g0o), "");
        } else {
            C76879j.m92748s(context, context.getString(C0966R.string.g0p, new Object[]{Integer.valueOf(i)}), "");
        }
    }
}

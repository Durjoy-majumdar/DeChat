package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C106703g3;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.XFileSdk;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import qo3.C89779i0;
import v82.C111415a1;
import v82.C111418b0;

/* renamed from: com.tencent.mm.ui.chatting.i4 */
public final class C106690i4 extends FrameLayout {

    /* renamed from: d */
    public String f318943d;

    /* renamed from: e */
    public String f318944e;

    /* renamed from: f */
    public final int f318945f;

    /* renamed from: g */
    public RelativeLayout f318946g = ((RelativeLayout) findViewById(C0966R.C0970id.f359125j32));

    /* renamed from: h */
    public RelativeLayout f318947h = ((RelativeLayout) findViewById(C0966R.C0970id.j35));

    /* renamed from: i */
    public C106703g3 f318948i;

    /* renamed from: j */
    public boolean f318949j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106690i4(Context context, String str, String str2, int i) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "fileExt");
        this.f318943d = str;
        this.f318944e = str2;
        this.f318945f = i;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.buq, this);
        this.f318948i = new C106703g3(context, this.f318943d, i, (C32224a) null, 8, (C8480h) null);
        mo153637a();
        mo153638b();
    }

    /* renamed from: a */
    public final void mo153637a() {
        RelativeLayout relativeLayout = this.f318947h;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            C111415a1.C111416a aVar = C111415a1.f333534e;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            if (aVar.mo163079a(context) != 90) {
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                if (aVar.mo163079a(context2) != 270) {
                    C106703g3 g3Var = this.f318948i;
                    if (g3Var != null) {
                        g3Var.f319011e = LayoutInflater.from(g3Var.f319007a).inflate(C0966R.C0971layout.bus, relativeLayout);
                        g3Var.mo153676a(g3Var.f319007a);
                        return;
                    }
                    return;
                }
            }
            C106703g3 g3Var2 = this.f318948i;
            if (g3Var2 != null) {
                g3Var2.f319011e = LayoutInflater.from(g3Var2.f319007a).inflate(C0966R.C0971layout.but, relativeLayout);
                g3Var2.mo153676a(g3Var2.f319007a);
            }
        }
    }

    /* renamed from: b */
    public final void mo153638b() {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout relativeLayout = this.f318946g;
        if (relativeLayout != null && (layoutParams = relativeLayout.getLayoutParams()) != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C111415a1.C111416a aVar = C111415a1.f333534e;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            if (aVar.mo163079a(context) != 90) {
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                if (aVar.mo163079a(context2) != 270) {
                    layoutParams2.bottomMargin = C111418b0.f333557r;
                    layoutParams2.setMarginEnd(0);
                    return;
                }
            }
            layoutParams2.bottomMargin = 0;
            layoutParams2.setMarginEnd(C111418b0.f333557r);
        }
    }

    /* renamed from: c */
    public final void mo153639c() {
        C106703g3 g3Var = this.f318948i;
        if (g3Var != null) {
            Toast toast = g3Var.f319017k;
            if (toast != null) {
                toast.cancel();
            }
            C89779i0 i0Var = g3Var.f319018l;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105851w0.zx0().f314475Q0.removeObserver(g3Var.f319019m);
            C54219z zVar = C105851w0.zx0().f314475Q0;
            Context context = g3Var.f319007a;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zVar.removeObservers((MMActivity) context);
        }
    }

    /* renamed from: d */
    public final void mo153640d() {
        String str = this.f318943d;
        String str2 = this.f318944e;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119978p()) {
            int i = this.f318945f;
            XFileSdk.ViewType viewType = i != 3 ? i != 4 ? XFileSdk.ViewType.ReaderView : XFileSdk.ViewType.ListView : XFileSdk.ViewType.ReaderView;
            HashMap hashMap = new HashMap();
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_SCALE, "false");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_BG_COLOR, String.valueOf(Color.parseColor("#ededed")));
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_FINISH_ACTIVITY, "true");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_SET_MAX_SCALE, "3");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_PASSWORD, "true");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DOWNLOAD_TEXT_COLOR, "-16777216");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR, "true");
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, "13");
            C111415a1.C111416a aVar = C111415a1.f333534e;
            String q = C86013q1.m106456q(str);
            C87412m.m108593f(q, "getFileMD5String(filePath)");
            aVar.mo163080b(q, (String) null);
            String valueOf = String.valueOf(((long) hashCode()) + System.currentTimeMillis());
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            RelativeLayout relativeLayout = this.f318946g;
            C87412m.m108592e(relativeLayout, "null cannot be cast to non-null type android.view.ViewGroup");
            XFileSdk.readFile(str, str2, valueOf, true, hashMap, viewType, (Activity) context, relativeLayout, new C106687g4(this), new C106688h4(this));
        }
    }

    public final String getFileExt() {
        return this.f318944e;
    }

    public final String getFilePath() {
        return this.f318943d;
    }

    public final RelativeLayout getPluginControlLayout() {
        return this.f318947h;
    }

    public final C106703g3 getProfilePluginUi() {
        return this.f318948i;
    }

    public final RelativeLayout getReaderContentLayout() {
        return this.f318946g;
    }

    public final void setFileExt(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f318944e = str;
    }

    public final void setFilePath(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f318943d = str;
    }

    public final void setPluginControlLayout(RelativeLayout relativeLayout) {
        this.f318947h = relativeLayout;
    }

    public final void setProfilePluginUi(C106703g3 g3Var) {
        this.f318948i = g3Var;
    }

    public final void setReaderContentLayout(RelativeLayout relativeLayout) {
        this.f318946g = relativeLayout;
    }
}

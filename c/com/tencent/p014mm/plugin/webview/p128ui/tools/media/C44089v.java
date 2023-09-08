package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import ad0.C91997p;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C96674u;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p166hy.C60228r0;
import qo3.C77407n;
import s90.C48300n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.v */
public final class C44089v {

    /* renamed from: a */
    public static final C44089v f119438a = new C44089v();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.v$a */
    public static final class C44090a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ Context f119439d;

        /* renamed from: e */
        public final /* synthetic */ int f119440e;

        public C44090a(Context context, int i) {
            this.f119439d = context;
            this.f119440e = i;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107151k(1, this.f119439d.getString(C0966R.string.hre), C0966R.raw.bottomsheet_icon_transmit, false);
            if (C44625c2.m49076i()) {
                e0Var.mo107151k(2, this.f119439d.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, false);
            }
            int i = this.f119440e;
            if (2 != i && 5 != i) {
                e0Var.mo107151k(0, this.f119439d.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.v$b */
    public static final class C44091b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f119441d;

        /* renamed from: e */
        public final /* synthetic */ C48300n f119442e;

        /* renamed from: f */
        public final /* synthetic */ int f119443f;

        public C44091b(Context context, C48300n nVar, int i) {
            this.f119441d = context;
            this.f119442e = nVar;
            this.f119443f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                Context context = this.f119441d;
                C44085t tVar = ((WebViewUI) context).f118539k2;
                C48300n nVar = this.f119442e;
                tVar.f119434a = nVar;
                C44080p.f119428a.mo68714b(context, nVar.f133370h, "", nVar.f133369g, nVar.f133366d, 2);
                C44063a.f119401a.mo68697a(1, this.f119443f, 3);
            } else if (itemId == 0) {
                C48300n nVar2 = this.f119442e;
                C87412m.m108594g(nVar2, "msgInfo");
                MpVideoDataParcelable mpVideoDataParcelable = new MpVideoDataParcelable();
                mpVideoDataParcelable.f119400h = nVar2;
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, mpVideoDataParcelable, C96674u.C44087a.class, C96674u.C44088b.f119437d);
                Context context2 = this.f119441d;
                C76879j.m92726T(context2, context2.getString(C0966R.string.cph));
                C44063a.f119401a.mo68697a(2, this.f119443f, 3);
            } else if (itemId == 2) {
                C48300n nVar3 = this.f119442e;
                Context context3 = this.f119441d;
                C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) context3;
                int i2 = this.f119442e.f129348y;
                if (nVar3 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("ksnsupload_mp_video_xml", ((C91997p) ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84719FU(nVar3)).mo74685b());
                    intent.putExtra("Ksnsupload_type", 19);
                    intent.putExtra("need_result", true);
                    C88144b.m109803u(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 209, new C44079o(mMActivity, nVar3, i2));
                } else {
                    Log.m105928w("MicroMsg.MPVideoShareToSns", "doShareToSns msgInfo is null");
                }
                C44063a.f119401a.mo68697a(4, this.f119443f, 3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.v$c */
    public static final class C44092c implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ int f119444a;

        public C44092c(int i) {
            this.f119444a = i;
        }

        /* renamed from: a */
        public final void mo2362a() {
            C44063a.f119401a.mo68697a(3, this.f119444a, 3);
        }
    }

    /* renamed from: a */
    public final void mo68719a(Context context, C48300n nVar, int i) {
        C87412m.m108594g(context, "ui");
        C87412m.m108594g(nVar, "mpShareVideoInfo");
        C115669n nVar2 = C115669n.INSTANCE;
        int i2 = 2;
        Object[] objArr = new Object[2];
        if (i == 1) {
            i2 = 10;
        } else if (i != 3) {
            i2 = 6;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = 3;
        nVar2.mo160131h(18589, objArr);
        if (context instanceof WebViewUI) {
            C77407n nVar3 = new C77407n(context, 1, false);
            nVar3.f225771i = new C44090a(context, i);
            nVar3.f225782p = new C44091b(context, nVar, i);
            nVar3.f225802y = new C44092c(i);
            nVar3.mo107568m(" ", 1, 0);
            nVar3.f225779n1 = true;
            nVar3.mo107573q();
            return;
        }
        Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
    }
}

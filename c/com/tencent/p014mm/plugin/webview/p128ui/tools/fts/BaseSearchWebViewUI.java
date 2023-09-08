package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnSearchFinderViewEvent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONObject;
import p008bq.C67305d1;
import p008bq.C92289q0;
import p1072al.C92042f;
import p248ug.C78158s0;
import p255vr.C78470h;
import q20.C89449a;
import r83.C47951e;
import t83.C13851h1;
import t83.C48578d0;
import t83.C48590l;
import u73.C101980n;
import u73.C101983r;
import u73.C14136q0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI */
public abstract class BaseSearchWebViewUI extends PreLoadWebViewUI implements C47951e.C47953b {

    /* renamed from: p3 */
    public static final /* synthetic */ int f118872p3 = 0;

    /* renamed from: R2 */
    public boolean f118873R2;

    /* renamed from: S2 */
    public boolean f118874S2;

    /* renamed from: T2 */
    public C47951e f118875T2;

    /* renamed from: U2 */
    public Set<C47951e.C47952a> f118876U2 = new HashSet();

    /* renamed from: V2 */
    public View f118877V2;

    /* renamed from: W2 */
    public RelativeLayout f118878W2;

    /* renamed from: X2 */
    public SmileyPanel f118879X2;

    /* renamed from: Y2 */
    public int f118880Y2;

    /* renamed from: Z2 */
    public int f118881Z2;

    /* renamed from: a3 */
    public int f118882a3;

    /* renamed from: b3 */
    public int f118883b3;

    /* renamed from: c3 */
    public String f118884c3;

    /* renamed from: d3 */
    public String f118885d3;

    /* renamed from: e3 */
    public String f118886e3;

    /* renamed from: f3 */
    public long f118887f3;

    /* renamed from: g3 */
    public int f118888g3;

    /* renamed from: h3 */
    public String f118889h3;

    /* renamed from: i3 */
    public boolean f118890i3;

    /* renamed from: j3 */
    public String f118891j3;

    /* renamed from: k3 */
    public View f118892k3;

    /* renamed from: l3 */
    public Runnable f118893l3;

    /* renamed from: m3 */
    public HashMap<String, String> f118894m3 = new HashMap<>();

    /* renamed from: n3 */
    public boolean f118895n3 = false;

    /* renamed from: o3 */
    public final IListener<OnSearchFinderViewEvent> f118896o3 = new IListener<OnSearchFinderViewEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1755379160;
        }

        public boolean callback(IEvent iEvent) {
            BaseSearchWebViewUI baseSearchWebViewUI = BaseSearchWebViewUI.this;
            int i = BaseSearchWebViewUI.f118872p3;
            baseSearchWebViewUI.f118501W1.post(new BaseSearchWebViewUI$1$$a(this, (OnSearchFinderViewEvent) iEvent));
            return true;
        }
    };

    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$g */
    public static class C6163g implements C1255d<Bundle, IPCString> {
        private C6163g() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("key_image_path");
            int i = bundle.getInt("key_img_source");
            Log.m105924i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, chooseFilePath = " + string + ", source = " + i);
            try {
                C101983r rVar = new C101983r();
                rVar.f300283b = MMApplicationContext.getContext();
                rVar.f300288g = string;
                rVar.f300290i = 100;
                rVar.f300285d = i;
                ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebSearch.BaseSearchWebViewUI", "doOpenCamera fail, ex = " + e);
            }
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$a */
    public class C43899a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118898d;

        /* renamed from: e */
        public final /* synthetic */ String f118899e;

        /* renamed from: f */
        public final /* synthetic */ int f118900f;

        /* renamed from: g */
        public final /* synthetic */ boolean f118901g;

        public C43899a(String str, String str2, int i, boolean z) {
            this.f118898d = str;
            this.f118899e = str2;
            this.f118900f = i;
            this.f118901g = z;
        }

        public void run() {
            BaseSearchWebViewUI.m48081P9(BaseSearchWebViewUI.this, this.f118898d, this.f118899e, this.f118900f, this.f118901g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$b */
    public class C43900b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118903d;

        /* renamed from: e */
        public final /* synthetic */ boolean f118904e;

        public C43900b(String str, boolean z) {
            this.f118903d = str;
            this.f118904e = z;
        }

        public void run() {
            BaseSearchWebViewUI.m48081P9(BaseSearchWebViewUI.this, this.f118903d, "loading", -1, this.f118904e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$c */
    public class C43901c implements C78158s0.C78159a {

        /* renamed from: a */
        public final /* synthetic */ String f118906a;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$c$a */
        public class C43902a implements C92042f {

            /* renamed from: a */
            public final /* synthetic */ IEmojiInfo f118908a;

            /* renamed from: b */
            public final /* synthetic */ String f118909b;

            /* renamed from: c */
            public final /* synthetic */ String f118910c;

            /* renamed from: d */
            public final /* synthetic */ int f118911d;

            /* renamed from: e */
            public final /* synthetic */ String f118912e;

            /* renamed from: f */
            public final /* synthetic */ String f118913f;

            public C43902a(IEmojiInfo iEmojiInfo, String str, String str2, int i, String str3, String str4) {
                this.f118908a = iEmojiInfo;
                this.f118909b = str;
                this.f118910c = str2;
                this.f118911d = i;
                this.f118912e = str3;
                this.f118913f = str4;
            }

            /* renamed from: a */
            public void mo55799a(boolean z) {
                if (z) {
                    String Q9 = BaseSearchWebViewUI.m48082Q9(BaseSearchWebViewUI.this, this.f118908a);
                    Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s emojiPath %s exist %b", this.f118909b, this.f118910c, Q9, Boolean.valueOf(C86013q1.m106450k(Q9)));
                    BaseSearchWebViewUI.this.mo68521L9().mo73210G(this.f118909b, this.f118910c, this.f118911d, z ^ true ? 1 : 0, this.f118912e, this.f118913f);
                    return;
                }
                Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s fail", this.f118909b, this.f118910c);
            }
        }

        public C43901c(String str) {
            this.f118906a = str;
        }

        /* renamed from: a */
        public void mo68482a(IEmojiInfo iEmojiInfo) {
            Bitmap d1;
            IEmojiInfo iEmojiInfo2 = iEmojiInfo;
            Class cls = C67305d1.class;
            BaseSearchWebViewUI.this.f118879X2.set16029ExtraInfo(BaseSearchWebViewUI.this.f118881Z2 + ";" + BaseSearchWebViewUI.this.f119059J2 + ";" + this.f118906a);
            String Q9 = BaseSearchWebViewUI.m48082Q9(BaseSearchWebViewUI.this, iEmojiInfo2);
            if (iEmojiInfo.mo62678k() || iEmojiInfo.getGroup() == 18) {
                Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "emoji is system emoji %s", Integer.valueOf(iEmojiInfo.getGroup()));
                if (!C86013q1.m106450k(Q9) && (d1 = iEmojiInfo2.mo62657d1(BaseSearchWebViewUI.this, 480)) != null) {
                    try {
                        BitmapUtil.saveBitmapToImage(d1, 80, Bitmap.CompressFormat.PNG, Q9, false);
                        Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "save emoji bitmap %d %s", Long.valueOf(C86013q1.m106451l(Q9)), Q9);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WebSearch.BaseSearchWebViewUI", e, "SaveEmojiBitmap", new Object[0]);
                    }
                }
            }
            String str = "weixin://fts/emoji?path=" + Q9;
            String md5 = iEmojiInfo.getMd5();
            String aesKey = iEmojiInfo.getAesKey();
            String g2 = iEmojiInfo.mo62660g2();
            boolean C1 = iEmojiInfo.mo62633C1();
            int i = ((C67305d1) C86312j.m106911c(cls)).mo91425Bw(iEmojiInfo2) ? 1 : ((C67305d1) C86312j.m106911c(cls)).mo91430hJ(iEmojiInfo2) ? 2 : ((C67305d1) C86312j.m106911c(cls)).mo91433yi(iEmojiInfo2) ? 3 : 0;
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSelectedEmoji %s %s %b", md5, str, Boolean.valueOf(C1));
            BaseSearchWebViewUI.this.mo68521L9().mo73210G(md5, str, i, C1 ^ true ? 1 : 0, g2, aesKey);
            if (!C1) {
                ((C92289q0) C86312j.m106911c(C92289q0.class)).mo126041BA(iEmojiInfo2, new C43902a(iEmojiInfo, md5, str, i, g2, aesKey));
            }
            BaseSearchWebViewUI.this.f118878W2.setVisibility(8);
        }

        public void onHide() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$d */
    public class C43903d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118915d;

        /* renamed from: e */
        public final /* synthetic */ String f118916e;

        /* renamed from: f */
        public final /* synthetic */ String f118917f;

        public C43903d(int i, String str, String str2) {
            this.f118915d = i;
            this.f118916e = str;
            this.f118917f = str2;
        }

        public void run() {
            BaseSearchWebViewUI.this.mo68521L9().mo73218O(this.f118915d, this.f118916e, this.f118917f, "", "onSimilarEmoticonReady");
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "wxaapp_opsearch resp, ret = %d, errMsg = %s, json = %s", Integer.valueOf(this.f118915d), this.f118916e, this.f118917f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$e */
    public class C43904e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118919d;

        /* renamed from: e */
        public final /* synthetic */ String f118920e;

        /* renamed from: f */
        public final /* synthetic */ String f118921f;

        /* renamed from: g */
        public final /* synthetic */ String f118922g;

        public C43904e(int i, String str, String str2, String str3) {
            this.f118919d = i;
            this.f118920e = str;
            this.f118921f = str2;
            this.f118922g = str3;
        }

        public void run() {
            BaseSearchWebViewUI.this.mo68521L9().mo73218O(this.f118919d, this.f118920e, this.f118921f, this.f118922g, "onSearchWebQueryReady");
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSearchWebQueryReady, ret = %d, errMsg = %s, json = %s", Integer.valueOf(this.f118919d), this.f118920e, this.f118921f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$f */
    public class C43905f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118924d;

        public C43905f(String str) {
            this.f118924d = str;
        }

        public void run() {
            C48590l L9 = BaseSearchWebViewUI.this.mo68521L9();
            String str = this.f118924d;
            if (!L9.f130003h) {
                Log.m105920e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, not ready");
            } else {
                Log.m105924i("MicroMsg.JsApiHandler", "onCurrentLocationReady success, ready");
                HashMap hashMap = new HashMap();
                hashMap.put("json", str);
                MMHandlerThread.postToMainThread(new C48578d0(L9, C13851h1.C13852a.m13143c("onCurrentLocationReady", hashMap, L9.f130011p, L9.f130012q)));
            }
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onCurrentLocationReady, json = %s", this.f118924d);
        }
    }

    /* renamed from: P9 */
    public static void m48081P9(BaseSearchWebViewUI baseSearchWebViewUI, String str, String str2, int i, boolean z) {
        BaseSearchWebViewUI baseSearchWebViewUI2 = baseSearchWebViewUI;
        String str3 = str2;
        int i2 = i;
        if (baseSearchWebViewUI2.f118892k3 != null) {
            baseSearchWebViewUI.m48084W9();
            ImageView imageView = (ImageView) baseSearchWebViewUI2.f118892k3.findViewById(C0966R.C0970id.f358476fd0);
            View findViewById = baseSearchWebViewUI2.f118892k3.findViewById(C0966R.C0970id.i7j);
            if (!str3.equals("loading")) {
                imageView.setVisibility(0);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str3.equals("success")) {
                    imageView.setImageResource(C0966R.C0969drawable.bug);
                } else if (str3.equals("fail")) {
                    imageView.setImageResource(C0966R.C0969drawable.cbc);
                } else {
                    imageView.setVisibility(8);
                }
            } else {
                imageView.setVisibility(8);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = (TextView) baseSearchWebViewUI2.f118892k3.findViewById(C0966R.C0970id.knx);
            LinearLayout linearLayout = (LinearLayout) baseSearchWebViewUI2.f118892k3.findViewById(C0966R.C0970id.jkd);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            if (imageView.getVisibility() == 8 && findViewById.getVisibility() == 8) {
                layoutParams.bottomMargin = baseSearchWebViewUI.getResources().getDimensionPixelSize(C0966R.dimen.f3633r);
                linearLayout.setMinimumHeight(0);
            } else {
                layoutParams.bottomMargin = 0;
                linearLayout.setMinimumHeight(C76577a.m92151b(baseSearchWebViewUI2, 120));
            }
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
            baseSearchWebViewUI2.f118892k3.setOnTouchListener(new C6168f(baseSearchWebViewUI2, z));
            View view3 = baseSearchWebViewUI2.f118892k3;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i2 > 0) {
                C43963c cVar = new C43963c(baseSearchWebViewUI2);
                baseSearchWebViewUI2.f118893l3 = cVar;
                baseSearchWebViewUI2.f118501W1.postDelayed(cVar, (long) i2);
            }
        }
    }

    /* renamed from: Q9 */
    public static String m48082Q9(BaseSearchWebViewUI baseSearchWebViewUI, IEmojiInfo iEmojiInfo) {
        baseSearchWebViewUI.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("md5", iEmojiInfo.mo62676i0());
        bundle.putString("designerId", iEmojiInfo.mo62685o0());
        bundle.putString("aeskey", iEmojiInfo.getAesKey());
        bundle.putString("encryptUrl", iEmojiInfo.mo62660g2());
        bundle.putString("productId", iEmojiInfo.getGroupId());
        bundle.putString("name", iEmojiInfo.getName());
        bundle.putString("thumbUrl", iEmojiInfo.getThumbUrl());
        try {
            bundle = baseSearchWebViewUI.f118511a1.mo68149vj(7, bundle);
        } catch (Exception unused) {
        }
        String string = bundle.getString("emojiPath");
        if (!iEmojiInfo.mo62678k() && iEmojiInfo.getGroup() != 18) {
            return string;
        }
        return string + "_fts";
    }

    /* access modifiers changed from: private */
    /* renamed from: W9 */
    public void m48084W9() {
        View view = this.f118892k3;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Runnable runnable = this.f118893l3;
            if (runnable != null) {
                this.f118501W1.removeCallbacks(runnable);
                this.f118893l3 = null;
            }
        }
    }

    /* renamed from: I9 */
    public void mo68473I9() {
        int i = this.f118880Y2;
        String str = this.f119059J2;
        String str2 = this.f119060K2;
        int i2 = this.f118882a3;
        C14136q0.m13475g(12, i, str, str2, "", 0, i2 == 0, "", true, this.f118884c3, this.f118885d3, i2, this.f119058I2);
    }

    /* renamed from: N7 */
    public boolean mo68245N7() {
        return true;
    }

    /* renamed from: N9 */
    public void mo68474N9() {
        super.mo68474N9();
        Log.m105924i("MicroMsg.WebSearch.BaseSearchWebViewUI", "jsapi ready");
        int i = C14136q0.f39567a;
    }

    /* renamed from: S9 */
    public void mo68432S9(int i, String str, Map<String, Object> map) {
    }

    /* renamed from: T9 */
    public void mo68475T9() {
        if (this.f118877V2 != null) {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            viewGroup.setSystemUiVisibility(0);
            viewGroup.removeView(this.f118877V2);
            getWindow().clearFlags(1024);
            if (getRequestedOrientation() == 0) {
                setRequestedOrientation(1);
            }
            this.f118877V2 = null;
            Iterator it = ((HashSet) this.f118876U2).iterator();
            while (it.hasNext()) {
                ((C47951e.C47952a) it.next()).mo72717a();
            }
        }
    }

    /* renamed from: U9 */
    public Drawable mo68476U9(int i) {
        int i2;
        if (i == 1) {
            i2 = C0966R.raw.websearch_icon_acount;
        } else if (i != 2) {
            switch (i) {
                case 8:
                    i2 = C0966R.raw.websearch_icon_moment;
                    break;
                case 64:
                case 262208:
                    i2 = C0966R.raw.websearch_icon_weapp;
                    break;
                case 256:
                case 384:
                    i2 = C0966R.raw.websearch_icon_emoji;
                    break;
                case 512:
                    i2 = C0966R.raw.websearch_icon_music;
                    break;
                case 1024:
                    i2 = C0966R.raw.websearch_icon_novel;
                    break;
                case 12582912:
                    i2 = C0966R.raw.websearch_icon_movie;
                    break;
                case 16777220:
                    i2 = C0966R.raw.websearch_icon_webpage;
                    break;
                case 16777248:
                    i2 = C0966R.raw.websearch_icon_question;
                    break;
                case 16777728:
                    i2 = C0966R.raw.websearch_icon_baike;
                    break;
                case 16793600:
                    i2 = C0966R.raw.websearch_icon_product;
                    break;
                default:
                    i2 = C0966R.raw.icons_outlined_search;
                    break;
            }
        } else {
            i2 = C0966R.raw.websearch_icon_article;
        }
        return getResources().getDrawable(i2);
    }

    /* renamed from: V9 */
    public void mo68477V9() {
        RelativeLayout relativeLayout = this.f118878W2;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        SmileyPanel smileyPanel = this.f118879X2;
        if (smileyPanel != null) {
            smileyPanel.mo100202n();
        }
    }

    /* renamed from: X9 */
    public void mo68478X9() {
        if (this.f118494U0 || !this.f118873R2) {
            super.hideVKB();
        }
    }

    /* renamed from: Y9 */
    public boolean mo68433Y9() {
        return false;
    }

    /* renamed from: Z9 */
    public void mo68479Z9(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("key_image_path", str);
        bundle.putInt("key_img_source", i);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle, C6163g.class, (C1256g) null);
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        super.mo63385a9();
        if (this.f118875T2 == null) {
            this.f118875T2 = new C47951e(getContext(), this.f118523f, this);
        }
        this.f118875T2.f128639b = mo68521L9();
    }

    public void finish() {
        String str;
        super.finish();
        if (!this.f118895n3) {
            this.f118895n3 = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exittype", this.f118894m3.get("exittype"));
                str = jSONObject.toString().replace(",", "_");
            } catch (Exception unused) {
                str = "";
            }
            String string = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getString("sos_fts_search_data_tmp", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!Util.isNullOrNil(string)) {
                try {
                    jSONObject2 = new JSONObject(string);
                } catch (Exception unused2) {
                }
            }
            String optString = jSONObject2.optString("requestId");
            this.f118887f3 = (long) jSONObject2.optInt("type");
            String optString2 = jSONObject2.optString("searchId");
            String optString3 = jSONObject2.optString("url");
            this.f118889h3 = jSONObject2.optString("parentSearchID");
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "requestId = %s, type = %s, searchData = %s, rawUrl = %s.", optString, Long.valueOf(this.f118887f3), jSONObject2.toString(), optString3);
            if ((this instanceof FTSSearchTabWebViewUI) || (this instanceof MMFTSSearchTabWebViewUI)) {
                this.f118888g3 = 4;
            }
            String str2 = this.f119059J2;
            int i = this.f118880Y2;
            long j = this.f118887f3;
            long j2 = (long) this.f118888g3;
            String str3 = this.f118889h3;
            ((C78470h) C86312j.m106911c(C78470h.class)).mo108303yr(this.f118894m3.get(SearchIntents.EXTRA_QUERY), str2, optString2, optString, i, str, j, j2, str3, 2);
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putString("sos_fts_search_data_tmp", "");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        boolean z;
        if (i != 101) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            if (intent == null) {
                Log.m105924i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onActivityResult, data = null.");
                return;
            }
            CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            if (captureVideoNormalModel == null) {
                Log.m105924i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onActivityResult, model = null.");
                return;
            }
            boolean Y9 = mo68433Y9();
            if (captureVideoNormalModel.mo129798a() != null) {
                i3 = ((Integer) captureVideoNormalModel.mo129798a().mo129811b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
                z = (i3 == 1 || i3 == 2) ? false : true;
                mo68479Z9(captureVideoNormalModel.f272895f, 0);
            } else {
                i3 = 0;
                z = true;
            }
            int i4 = Y9 ? z ? 21 : 20 : z ? 19 : 18;
            Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d.", Boolean.valueOf(Y9), Integer.valueOf(i4), Boolean.valueOf(z), captureVideoNormalModel.mo129798a(), Integer.valueOf(i3));
            mo68479Z9(captureVideoNormalModel.f272895f, i4);
        }
    }

    public void onBackPressed() {
        mo68477V9();
        Iterator it = ((HashSet) this.f118876U2).iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((C47951e.C47952a) it.next()).onBackPressed();
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f118874S2 = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
        }
        if (this.f118875T2 == null) {
            this.f118875T2 = new C47951e(getContext(), this.f118523f, this);
        }
        this.f118873R2 = getIntent().getBooleanExtra("ftsneedkeyboard", false);
        int intExtra = getIntent().getIntExtra("ftsbizscene", 0);
        this.f118880Y2 = intExtra;
        this.f118881Z2 = intExtra;
        this.f118890i3 = getIntent().getBooleanExtra("key_search_icon_and_hint_fix_default", false);
        this.f118891j3 = getIntent().getStringExtra("searchPlaceHolder");
        this.f118882a3 = getIntent().getIntExtra("ftsType", 0);
        this.f118884c3 = getIntent().getStringExtra("ftsQuery");
        this.f118885d3 = getIntent().getStringExtra("tabId");
        String stringExtra = getIntent().getStringExtra("searchId");
        this.f118886e3 = stringExtra;
        int i = this.f118882a3;
        this.f118883b3 = i;
        C14136q0.m13475g(1, this.f118880Y2, this.f119059J2, this.f119060K2, stringExtra, 0, i == 0, "", true, this.f118884c3, this.f118885d3, i, this.f119058I2);
        View inflate = View.inflate(this, C0966R.C0971layout.bve, (ViewGroup) null);
        inflate.setBackgroundResource(C0966R.color.ahf);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f118892k3 = inflate;
        if (getContentView() instanceof ViewGroup) {
            ((ViewGroup) getContentView()).addView(this.f118892k3);
        }
        m48084W9();
        this.f118878W2 = (RelativeLayout) findViewById(C0966R.C0970id.cgn);
        this.f118896o3.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f118896o3.dead();
        Iterator it = ((HashSet) this.f118876U2).iterator();
        while (it.hasNext()) {
            ((C47951e.C47952a) it.next()).onDestroy();
        }
        ((HashSet) this.f118876U2).clear();
        int i = this.f118880Y2;
        String str = this.f119059J2;
        String str2 = this.f119060K2;
        int i2 = this.f118882a3;
        boolean z = i2 == 0;
        String str3 = this.f118884c3;
        boolean z2 = this.f119058I2;
        String str4 = str3;
        int i3 = i2;
        String str5 = str2;
        C14136q0.m13475g(14, i, str, str2, "", 0, z, "", true, str3, "", i2, z2);
        if (i == 20) {
            C14136q0.m13475g(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, i, str, str5, "", 0, z, "", true, str4, "", i3, z2);
        }
        Log.m105918d("MicroMsg.WebSearch.BaseSearchWebViewUI", "onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25) {
            Iterator it = ((HashSet) this.f118876U2).iterator();
            while (it.hasNext()) {
                ((C47951e.C47952a) it.next()).mo72721e();
            }
        } else if (i == 24) {
            Iterator it4 = ((HashSet) this.f118876U2).iterator();
            while (it4.hasNext()) {
                ((C47951e.C47952a) it4.next()).mo72720d();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        Iterator it = ((HashSet) this.f118876U2).iterator();
        while (it.hasNext()) {
            ((C47951e.C47952a) it.next()).mo72718b();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Object[] objArr = new Object[1];
        String str = "";
        if (iArr.length > 0) {
            str = iArr[0] + str;
        }
        objArr[0] = str;
        Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onRequestPermissionsResult, granted ? %s", objArr);
    }

    public void onResume() {
        super.onResume();
        Iterator it = ((HashSet) this.f118876U2).iterator();
        while (it.hasNext()) {
            ((C47951e.C47952a) it.next()).mo72719c();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63388u8(int r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r7 = r26
            r0 = r27
            r1 = r28
            r2 = 128(0x80, float:1.794E-43)
            java.lang.String r3 = "fts_key_json_data"
            java.lang.String r4 = ""
            if (r0 == r2) goto L_0x075d
            r2 = 137(0x89, float:1.92E-43)
            java.lang.String r5 = "MicroMsg.JsApiHandler"
            java.lang.String r6 = "MicroMsg.WebSearch.BaseSearchWebViewUI"
            r8 = 0
            if (r0 == r2) goto L_0x0725
            r2 = 145(0x91, float:2.03E-43)
            if (r0 == r2) goto L_0x06de
            r2 = 100002(0x186a2, float:1.40133E-40)
            if (r0 == r2) goto L_0x068d
            java.lang.String r2 = "icon"
            java.lang.String r5 = "actionSheetId"
            java.lang.String r9 = "title"
            switch(r0) {
                case 133: goto L_0x0086;
                case 134: goto L_0x006b;
                case 135: goto L_0x0052;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r5 = "fts_key_err_msg"
            java.lang.String r8 = "fts_key_ret_code"
            java.lang.String r10 = "mask"
            r11 = -1
            switch(r0) {
                case 148: goto L_0x0306;
                case 149: goto L_0x02ec;
                case 150: goto L_0x02e7;
                case 151: goto L_0x023c;
                case 152: goto L_0x0224;
                case 153: goto L_0x01ff;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.String r2 = "autoPlay"
            java.lang.String r3 = "videoProps"
            java.lang.String r5 = "viewProps"
            java.lang.String r6 = "FtsVideoPlayerMgr"
            r8 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r9 = "visible"
            java.lang.String r10 = "can not find player by id %d"
            java.lang.String r12 = "durationSec"
            java.lang.String r13 = "coverUrl"
            java.lang.String r14 = "isMute"
            java.lang.String r15 = "playerId"
            switch(r0) {
                case 200000: goto L_0x056b;
                case 200001: goto L_0x046b;
                case 200002: goto L_0x03da;
                case 200003: goto L_0x032f;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x076b
        L_0x0052:
            java.lang.String r0 = "FTS_KEY_onStartWebSearch_type"
            int r0 = r1.getInt(r0, r8)
            java.lang.String r2 = "FTS_KEY_onStartWebSearch_query"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "FTS_KEY_onStartWebSearch_params"
            java.io.Serializable r1 = r1.getSerializable(r3)
            java.util.Map r1 = (java.util.Map) r1
            r7.mo68432S9(r0, r2, r1)
            goto L_0x076b
        L_0x006b:
            com.tencent.mm.plugin.webview.ui.tools.fts.p r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43973p.f119116c
            int r1 = r1.getInt(r5)
            java.util.Map<java.lang.Integer, qo3.n> r0 = r0.f119117a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r1)
            qo3.n r0 = (qo3.C77407n) r0
            if (r0 == 0) goto L_0x076b
            r0.mo107572p()
            goto L_0x076b
        L_0x0086:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = r1.getString(r9)
            java.lang.String r0 = "desc"
            java.lang.String r14 = r1.getString(r0)
            java.lang.String r15 = "items"
            java.lang.String r15 = r1.getString(r15)
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00df }
            r12.<init>(r15)     // Catch:{ JSONException -> 0x00df }
            r11 = 0
        L_0x00a1:
            int r8 = r12.length()     // Catch:{ JSONException -> 0x00df }
            if (r11 >= r8) goto L_0x00e7
            org.json.JSONObject r8 = r12.optJSONObject(r11)     // Catch:{ JSONException -> 0x00df }
            if (r8 == 0) goto L_0x00d8
            u73.o0 r10 = new u73.o0     // Catch:{ JSONException -> 0x00df }
            r10.<init>()     // Catch:{ JSONException -> 0x00df }
            java.lang.String r13 = r8.optString(r2)     // Catch:{ JSONException -> 0x00df }
            r10.f146600a = r13     // Catch:{ JSONException -> 0x00df }
            java.lang.String r13 = r8.optString(r9)     // Catch:{ JSONException -> 0x00df }
            r10.f146601b = r13     // Catch:{ JSONException -> 0x00df }
            java.lang.String r13 = "selected"
            int r13 = r8.optInt(r13)     // Catch:{ JSONException -> 0x00df }
            r27 = r12
            r12 = 1
            if (r13 != r12) goto L_0x00cb
            r12 = 1
            goto L_0x00cc
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            r10.f146603d = r12     // Catch:{ JSONException -> 0x00df }
            java.lang.String r8 = r8.optString(r0)     // Catch:{ JSONException -> 0x00df }
            r10.f146602c = r8     // Catch:{ JSONException -> 0x00df }
            r3.add(r10)     // Catch:{ JSONException -> 0x00df }
            goto L_0x00da
        L_0x00d8:
            r27 = r12
        L_0x00da:
            int r11 = r11 + 1
            r12 = r27
            goto L_0x00a1
        L_0x00df:
            r0 = move-exception
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x00e7:
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r4
            r2 = 1
            r0[r2] = r14
            r8 = 2
            r0[r8] = r15
            java.lang.String r9 = "doShowSearchActionSheet args: title %s,subTitle %s,items %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r9, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x076b
            com.tencent.mm.plugin.webview.ui.tools.fts.p r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43973p.f119116c
            com.tencent.mm.plugin.webview.ui.tools.fts.e r6 = new com.tencent.mm.plugin.webview.ui.tools.fts.e
            r6.<init>(r7)
            r0.getClass()
            qo3.n r9 = new qo3.n
            r9.<init>((android.content.Context) r7, (int) r8, (boolean) r2)
            int r2 = r9.hashCode()
            com.tencent.mm.plugin.webview.ui.tools.fts.l r8 = new com.tencent.mm.plugin.webview.ui.tools.fts.l
            r8.<init>(r0, r3)
            r9.f225805z = r8
            com.tencent.mm.plugin.webview.ui.tools.fts.m r8 = new com.tencent.mm.plugin.webview.ui.tools.fts.m
            r8.<init>(r0, r3, r9)
            r9.f225771i = r8
            com.tencent.mm.plugin.webview.ui.tools.fts.n r3 = new com.tencent.mm.plugin.webview.ui.tools.fts.n
            r3.<init>(r0, r6, r2)
            r9.f225782p = r3
            com.tencent.mm.plugin.webview.ui.tools.fts.o r3 = new com.tencent.mm.plugin.webview.ui.tools.fts.o
            r3.<init>(r0, r6, r2)
            r9.f225761d = r3
            r3 = 2131497332(0x7f0c1174, float:1.8618254E38)
            r6 = 0
            android.view.View r3 = android.view.View.inflate(r7, r3, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r8 = 8
            r10 = 2131315360(0x7f094aa0, float:1.8249171E38)
            if (r6 != 0) goto L_0x014a
            android.view.View r6 = r3.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r4)
            goto L_0x018e
        L_0x014a:
            android.view.View r4 = r3.findViewById(r10)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r10)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr"
            java.lang.String r19 = "showActionSheet"
            java.lang.String r20 = "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = 0
            java.lang.Object r6 = r6.mo10231a(r10)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr"
            java.lang.String r18 = "showActionSheet"
            java.lang.String r19 = "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x018e:
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            r6 = 2131314662(0x7f0947e6, float:1.8247755E38)
            if (r4 != 0) goto L_0x01a1
            android.view.View r4 = r3.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r14)
            goto L_0x01e5
        L_0x01a1:
            android.view.View r4 = r3.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r8)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr"
            java.lang.String r19 = "showActionSheet"
            java.lang.String r20 = "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr"
            java.lang.String r18 = "showActionSheet"
            java.lang.String r19 = "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x01e5:
            r4 = 1
            r9.f225781o1 = r4
            r4 = 0
            r9.mo107569n(r3, r4)
            r9.mo107573q()
            java.util.Map<java.lang.Integer, qo3.n> r0 = r0.f119117a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r3, r9)
            r1.putInt(r5, r2)
            goto L_0x076b
        L_0x01ff:
            int r0 = r1.getInt(r8)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = r1.getString(r3, r4)
            java.lang.String r2 = "fts_key_id"
            java.lang.String r8 = r1.getString(r2, r4)
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r7.f118501W1
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$e r10 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$e
            r1 = r10
            r2 = r26
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r8
            r1.<init>(r3, r4, r5, r6)
            r9.post(r10)
            goto L_0x076b
        L_0x0224:
            int r0 = r1.getInt(r8)
            java.lang.String r2 = r1.getString(r5)
            java.lang.String r1 = r1.getString(r3, r4)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r7.f118501W1
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$d r4 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$d
            r4.<init>(r0, r2, r1)
            r3.post(r4)
            goto L_0x076b
        L_0x023c:
            java.lang.String r0 = "GOTO_EMOTICON"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r26.hideVKB()
            java.lang.String r0 = "requestId"
            java.lang.String r0 = r1.getString(r0)
            com.tencent.mm.api.SmileyPanel r1 = r7.f118879X2
            if (r1 != 0) goto L_0x02df
            com.tencent.mm.api.SmileyPanel r1 = p248ug.C78160t0.m94371b(r26)
            r7.f118879X2 = r1
            int r2 = com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel.f211589f
            r2 = 5
            r1.setEntranceScene(r2)
            com.tencent.mm.api.SmileyPanel r1 = r7.f118879X2
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.api.SmileyPanel r1 = r7.f118879X2
            r1.setShowSmiley(r2)
            com.tencent.mm.api.SmileyPanel r1 = r7.f118879X2
            r1.mo100197i()
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            int r2 = p248ug.C78160t0.m94370a(r26)
            r1.<init>(r11, r2)
            r2 = 12
            r1.addRule(r2)
            android.widget.RelativeLayout r3 = r7.f118878W2
            com.tencent.mm.api.SmileyPanel r4 = r7.f118879X2
            r3.addView(r4, r1)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r3 = r26.getApplicationContext()
            r1.<init>(r3)
            r3 = 2131099720(0x7f060048, float:1.7811801E38)
            int r3 = kg3.C76577a.m92153d(r7, r3)
            r1.setBackgroundColor(r3)
            r3 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r4 = kg3.C76577a.m92155f(r7, r3)
            int r3 = kg3.C76577a.m92155f(r7, r3)
            r5 = 0
            r1.setPadding(r5, r4, r5, r3)
            r3 = 2131100909(0x7f0604ed, float:1.7814213E38)
            int r3 = kg3.C76577a.m92153d(r7, r3)
            r1.setTextColor(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r3)
            r3 = 2131835421(0x7f113a1d, float:1.930398E38)
            r1.setText(r3)
            r3 = 17
            r1.setGravity(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r3.<init>(r11, r4)
            r3.addRule(r2)
            int r2 = p248ug.C78160t0.m94370a(r26)
            r3.bottomMargin = r2
            android.widget.RelativeLayout r2 = r7.f118878W2
            r2.addView(r1, r3)
            ug.s0 r1 = p248ug.C78160t0.m94373d()
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$c r2 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$c
            r2.<init>(r0)
            r1.f229009a = r2
            com.tencent.mm.api.SmileyPanel r0 = r7.f118879X2
            r0.setCallback(r1)
        L_0x02df:
            android.widget.RelativeLayout r0 = r7.f118878W2
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x076b
        L_0x02e7:
            r26.m48084W9()
            goto L_0x076b
        L_0x02ec:
            r2 = 0
            java.lang.String r0 = r1.getString(r9, r4)
            int r1 = r1.getInt(r10, r2)
            if (r1 <= 0) goto L_0x02f9
            r8 = 1
            goto L_0x02fa
        L_0x02f9:
            r8 = 0
        L_0x02fa:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r7.f118501W1
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$b r2 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$b
            r2.<init>(r0, r8)
            r1.post(r2)
            goto L_0x076b
        L_0x0306:
            java.lang.String r3 = r1.getString(r9, r4)
            java.lang.String r4 = r1.getString(r2, r4)
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = "duration"
            int r5 = r1.getInt(r2, r0)
            r2 = 0
            int r0 = r1.getInt(r10, r2)
            if (r0 <= 0) goto L_0x031f
            r6 = 1
            goto L_0x0320
        L_0x031f:
            r6 = 0
        L_0x0320:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r7.f118501W1
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$a r8 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$a
            r1 = r8
            r2 = r26
            r1.<init>(r3, r4, r5, r6)
            r0.post(r8)
            goto L_0x076b
        L_0x032f:
            r83.e r0 = r7.f118875T2
            if (r0 == 0) goto L_0x076b
            java.lang.String r2 = r1.getString(r15)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            java.lang.String r3 = "type"
            java.lang.String r1 = r1.getString(r3)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r1
            java.lang.String r3 = "op player id %d,type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r4)
            q83.l r0 = r0.f128640c
            android.view.View r0 = r0.mo140516d(r2)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r0 = (com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView) r0
            if (r0 == 0) goto L_0x03cb
            r1.getClass()
            int r2 = r1.hashCode()
            switch(r2) {
                case 3443508: goto L_0x0395;
                case 3540994: goto L_0x038a;
                case 106440182: goto L_0x037f;
                case 640038740: goto L_0x0374;
                case 1984790939: goto L_0x0369;
                default: goto L_0x0367;
            }
        L_0x0367:
            r10 = -1
            goto L_0x039f
        L_0x0369:
            java.lang.String r2 = "setMute"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0372
            goto L_0x0367
        L_0x0372:
            r10 = 4
            goto L_0x039f
        L_0x0374:
            java.lang.String r2 = "setUnMute"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x037d
            goto L_0x0367
        L_0x037d:
            r10 = 3
            goto L_0x039f
        L_0x037f:
            java.lang.String r2 = "pause"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0388
            goto L_0x0367
        L_0x0388:
            r10 = 2
            goto L_0x039f
        L_0x038a:
            java.lang.String r2 = "stop"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0393
            goto L_0x0367
        L_0x0393:
            r10 = 1
            goto L_0x039f
        L_0x0395:
            java.lang.String r2 = "play"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x039e
            goto L_0x0367
        L_0x039e:
            r10 = 0
        L_0x039f:
            switch(r10) {
                case 0: goto L_0x03c5;
                case 1: goto L_0x03c0;
                case 2: goto L_0x03bb;
                case 3: goto L_0x03b5;
                case 4: goto L_0x03af;
                default: goto L_0x03a2;
            }
        L_0x03a2:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r4 = 0
            r0[r4] = r1
            java.lang.String r1 = "unknown op type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            goto L_0x076b
        L_0x03af:
            r3 = 1
            r0.setMute(r3)
            goto L_0x076b
        L_0x03b5:
            r4 = 0
            r0.setMute(r4)
            goto L_0x076b
        L_0x03bb:
            r0.mo134754i()
            goto L_0x076b
        L_0x03c0:
            r0.mo134763q()
            goto L_0x076b
        L_0x03c5:
            r4 = 0
            r0.mo134762p(r4)
            goto L_0x076b
        L_0x03cb:
            r3 = 1
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r0)
            goto L_0x076b
        L_0x03da:
            r83.e r0 = r7.f118875T2
            if (r0 == 0) goto L_0x076b
            java.lang.String r1 = r1.getString(r15)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "remove palyer id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
            q83.l r2 = r0.f128640c
            android.view.View r2 = r2.mo140516d(r1)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r2 = (com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView) r2
            if (r2 == 0) goto L_0x0408
            r83.e$b r3 = r0.f128642e
            r2.getUiLifecycleListener()
            r3.getClass()
            goto L_0x0415
        L_0x0408:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r10, r3)
        L_0x0415:
            q83.l r3 = r0.f128640c
            r3.getClass()
            q83.h r4 = new q83.h
            java.lang.Boolean r20 = java.lang.Boolean.FALSE
            r18 = 1000(0x3e8, double:4.94E-321)
            r16 = r4
            r17 = r3
            r21 = r1
            r16.<init>(r17, r18, r20, r21)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            java.lang.Thread r5 = r5.getThread()
            if (r1 != r5) goto L_0x0442
            r1 = 0
            java.lang.Object r3 = r4.exec(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            goto L_0x044d
        L_0x0442:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r3.f295856b
            java.lang.Object r1 = r4.exec(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
        L_0x044d:
            if (r2 == 0) goto L_0x076b
            r2.mo134763q()
            r83.h r1 = r2.getCallback()
            r1.mo72724f()
            r1 = 0
            r2.setCallback(r1)
            r1 = 0
            r2.setVisibility(r1)
            r2.setAllowMobileNetPlay(r1)
            com.tencent.mm.sdk.platformtools.SimpleObjectPool<com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView> r0 = r0.f128641d
            r0.release(r2)
            goto L_0x076b
        L_0x046b:
            r83.e r0 = r7.f118875T2
            if (r0 == 0) goto L_0x076b
            java.lang.String r10 = r1.getString(r15)
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r1 = r1.getString(r3)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15 = 0
            r3[r15] = r11
            r11 = 1
            r3[r11] = r5
            r11 = 2
            r3[r11] = r1
            java.lang.String r11 = "update player id %d,viewProps %s,videoProps %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x055f }
            if (r3 != 0) goto L_0x04ef
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x055f }
            r3.<init>(r5)     // Catch:{ JSONException -> 0x055f }
            q83.l r5 = r0.f128640c     // Catch:{ JSONException -> 0x055f }
            android.content.Context r11 = r0.f128638a     // Catch:{ JSONException -> 0x055f }
            float[] r22 = r83.C89906f.m112431d(r3, r11)     // Catch:{ JSONException -> 0x055f }
            boolean r11 = r3.has(r9)     // Catch:{ JSONException -> 0x055f }
            if (r11 == 0) goto L_0x04b6
            boolean r3 = r3.optBoolean(r9)     // Catch:{ JSONException -> 0x055f }
            r8 = 1
            r3 = r3 ^ r8
            r23 = r3
            goto L_0x04b9
        L_0x04b6:
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x04b9:
            r5.getClass()     // Catch:{ JSONException -> 0x055f }
            q83.i r3 = new q83.i     // Catch:{ JSONException -> 0x055f }
            java.lang.Boolean r20 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x055f }
            r18 = 1000(0x3e8, double:4.94E-321)
            r16 = r3
            r17 = r5
            r21 = r10
            r16.<init>(r17, r18, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x055f }
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ JSONException -> 0x055f }
            android.os.Looper r9 = android.os.Looper.getMainLooper()     // Catch:{ JSONException -> 0x055f }
            java.lang.Thread r9 = r9.getThread()     // Catch:{ JSONException -> 0x055f }
            if (r8 != r9) goto L_0x04e4
            r8 = 0
            java.lang.Object r3 = r3.exec(r8)     // Catch:{ JSONException -> 0x055f }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x055f }
            r3.booleanValue()     // Catch:{ JSONException -> 0x055f }
            goto L_0x04ef
        L_0x04e4:
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r5.f295856b     // Catch:{ JSONException -> 0x055f }
            java.lang.Object r3 = r3.exec(r5)     // Catch:{ JSONException -> 0x055f }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x055f }
            r3.booleanValue()     // Catch:{ JSONException -> 0x055f }
        L_0x04ef:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x055f }
            if (r3 != 0) goto L_0x076b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x055f }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x055f }
            q83.l r0 = r0.f128640c     // Catch:{ JSONException -> 0x055f }
            android.view.View r0 = r0.mo140516d(r10)     // Catch:{ JSONException -> 0x055f }
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r0 = (com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView) r0     // Catch:{ JSONException -> 0x055f }
            if (r0 != 0) goto L_0x0515
            java.lang.String r0 = "can not find video View by id %d"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x055f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x055f }
            r3 = 0
            r2[r3] = r1     // Catch:{ JSONException -> 0x055f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)     // Catch:{ JSONException -> 0x055f }
            goto L_0x076b
        L_0x0515:
            boolean r1 = r3.has(r2)     // Catch:{ JSONException -> 0x055f }
            if (r1 == 0) goto L_0x0522
            boolean r1 = r3.optBoolean(r2)     // Catch:{ JSONException -> 0x055f }
            r0.setAutoPlay(r1)     // Catch:{ JSONException -> 0x055f }
        L_0x0522:
            boolean r1 = r3.has(r13)     // Catch:{ JSONException -> 0x055f }
            if (r1 == 0) goto L_0x052f
            java.lang.String r1 = r3.optString(r13)     // Catch:{ JSONException -> 0x055f }
            r0.mo134756k(r1, r4)     // Catch:{ JSONException -> 0x055f }
        L_0x052f:
            boolean r1 = r3.has(r12)     // Catch:{ JSONException -> 0x055f }
            if (r1 == 0) goto L_0x053c
            int r1 = r3.optInt(r12)     // Catch:{ JSONException -> 0x055f }
            r0.setDuration(r1)     // Catch:{ JSONException -> 0x055f }
        L_0x053c:
            java.lang.String r1 = "playUrl"
            boolean r1 = r3.has(r1)     // Catch:{ JSONException -> 0x055f }
            if (r1 == 0) goto L_0x0550
            java.lang.String r1 = r83.C89906f.m112430c(r3)     // Catch:{ JSONException -> 0x055f }
            int r2 = r3.optInt(r12)     // Catch:{ JSONException -> 0x055f }
            r5 = 0
            r0.mo134759n(r1, r5, r2)     // Catch:{ JSONException -> 0x055f }
        L_0x0550:
            boolean r1 = r3.has(r14)     // Catch:{ JSONException -> 0x055f }
            if (r1 == 0) goto L_0x076b
            boolean r1 = r3.optBoolean(r14)     // Catch:{ JSONException -> 0x055f }
            r0.setMute(r1)     // Catch:{ JSONException -> 0x055f }
            goto L_0x076b
        L_0x055f:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r1)
            goto L_0x076b
        L_0x056b:
            r83.e r0 = r7.f118875T2
            if (r0 == 0) goto L_0x076b
            java.lang.String r10 = r1.getString(r15)
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r1 = r1.getString(r3)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15 = 0
            r3[r15] = r11
            r11 = 1
            r3[r11] = r5
            r11 = 2
            r3[r11] = r1
            java.lang.String r11 = "insert player id %d,viewProps %s,videoProps %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0681 }
            if (r3 != 0) goto L_0x067a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0681 }
            if (r3 == 0) goto L_0x05a2
            goto L_0x067a
        L_0x05a2:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0681 }
            r3.<init>(r5)     // Catch:{ JSONException -> 0x0681 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0681 }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x0681 }
            com.tencent.mm.sdk.platformtools.SimpleObjectPool<com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView> r1 = r0.f128641d     // Catch:{ JSONException -> 0x0681 }
            java.lang.Object r1 = r1.acquire()     // Catch:{ JSONException -> 0x0681 }
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r1 = (com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView) r1     // Catch:{ JSONException -> 0x0681 }
            if (r1 != 0) goto L_0x05c2
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r1 = new com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView     // Catch:{ JSONException -> 0x0681 }
            android.content.Context r11 = r0.f128638a     // Catch:{ JSONException -> 0x0681 }
            boolean r15 = r5.optBoolean(r2)     // Catch:{ JSONException -> 0x0681 }
            r1.<init>((android.content.Context) r11, (boolean) r15)     // Catch:{ JSONException -> 0x0681 }
            goto L_0x05c5
        L_0x05c2:
            r1.mo134763q()     // Catch:{ JSONException -> 0x0681 }
        L_0x05c5:
            r11 = 1
            r1.setIsShowBasicControls(r11)     // Catch:{ JSONException -> 0x0681 }
            java.lang.String r11 = "fileSize"
            int r11 = r5.optInt(r11)     // Catch:{ JSONException -> 0x0681 }
            r1.setVideoSizeByte(r11)     // Catch:{ JSONException -> 0x0681 }
            boolean r11 = r5.optBoolean(r14)     // Catch:{ JSONException -> 0x0681 }
            r1.setMute(r11)     // Catch:{ JSONException -> 0x0681 }
            java.lang.String r11 = r5.optString(r13)     // Catch:{ JSONException -> 0x0681 }
            r1.mo134756k(r11, r4)     // Catch:{ JSONException -> 0x0681 }
            r1.setVideoPlayerId(r10)     // Catch:{ JSONException -> 0x0681 }
            boolean r2 = r5.optBoolean(r2)     // Catch:{ JSONException -> 0x0681 }
            r1.setAutoPlay(r2)     // Catch:{ JSONException -> 0x0681 }
            java.lang.String r2 = r83.C89906f.m112430c(r5)     // Catch:{ JSONException -> 0x0681 }
            int r5 = r5.optInt(r12)     // Catch:{ JSONException -> 0x0681 }
            r11 = 0
            r1.mo134759n(r2, r11, r5)     // Catch:{ JSONException -> 0x0681 }
            r83.b r2 = new r83.b     // Catch:{ JSONException -> 0x0681 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0681 }
            r83.c r5 = new r83.c     // Catch:{ JSONException -> 0x0681 }
            r5.<init>(r0, r10, r2)     // Catch:{ JSONException -> 0x0681 }
            r1.setFullScreenDelegate(r5)     // Catch:{ JSONException -> 0x0681 }
            r83.d r2 = new r83.d     // Catch:{ JSONException -> 0x0681 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0681 }
            r1.setUiLifecycleListener(r2)     // Catch:{ JSONException -> 0x0681 }
            r83.e$b r5 = r0.f128642e     // Catch:{ JSONException -> 0x0681 }
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI) r5     // Catch:{ JSONException -> 0x0681 }
            java.util.Set<r83.e$a> r5 = r5.f118876U2     // Catch:{ JSONException -> 0x0681 }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ JSONException -> 0x0681 }
            r5.add(r2)     // Catch:{ JSONException -> 0x0681 }
            r83.h r2 = new r83.h     // Catch:{ JSONException -> 0x0681 }
            r83.e$b r5 = r0.f128642e     // Catch:{ JSONException -> 0x0681 }
            t83.l r11 = r0.f128639b     // Catch:{ JSONException -> 0x0681 }
            r2.<init>(r1, r5, r11)     // Catch:{ JSONException -> 0x0681 }
            r1.setCallback(r2)     // Catch:{ JSONException -> 0x0681 }
            q83.l r2 = r0.f128640c     // Catch:{ JSONException -> 0x0681 }
            r23 = 0
            android.content.Context r0 = r0.f128638a     // Catch:{ JSONException -> 0x0681 }
            float[] r24 = r83.C89906f.m112431d(r3, r0)     // Catch:{ JSONException -> 0x0681 }
            boolean r0 = r3.has(r9)     // Catch:{ JSONException -> 0x0681 }
            if (r0 == 0) goto L_0x063c
            boolean r0 = r3.optBoolean(r9)     // Catch:{ JSONException -> 0x0681 }
            r3 = 1
            r8 = r0 ^ 1
            r25 = r8
            goto L_0x063f
        L_0x063c:
            r25 = 2147483647(0x7fffffff, float:NaN)
        L_0x063f:
            r2.getClass()     // Catch:{ JSONException -> 0x0681 }
            q83.g r0 = new q83.g     // Catch:{ JSONException -> 0x0681 }
            java.lang.Boolean r20 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0681 }
            r18 = 1000(0x3e8, double:4.94E-321)
            r16 = r0
            r17 = r2
            r21 = r1
            r22 = r10
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x0681 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ JSONException -> 0x0681 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ JSONException -> 0x0681 }
            java.lang.Thread r3 = r3.getThread()     // Catch:{ JSONException -> 0x0681 }
            if (r1 != r3) goto L_0x066d
            r1 = 0
            java.lang.Object r0 = r0.exec(r1)     // Catch:{ JSONException -> 0x0681 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x0681 }
            r0.booleanValue()     // Catch:{ JSONException -> 0x0681 }
            goto L_0x076b
        L_0x066d:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r2.f295856b     // Catch:{ JSONException -> 0x0681 }
            java.lang.Object r0 = r0.exec(r1)     // Catch:{ JSONException -> 0x0681 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x0681 }
            r0.booleanValue()     // Catch:{ JSONException -> 0x0681 }
            goto L_0x076b
        L_0x067a:
            java.lang.String r0 = "insert args invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ JSONException -> 0x0681 }
            goto L_0x076b
        L_0x0681:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r1)
            goto L_0x076b
        L_0x068d:
            java.lang.String r0 = "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            t83.l r2 = r26.mo68521L9()
            java.lang.String r3 = r1.getString(r4)
            java.lang.String r4 = "widgetId"
            java.lang.String r1 = r1.getString(r4)
            boolean r6 = r2.f130003h
            if (r6 != 0) goto L_0x06ac
            java.lang.String r0 = "onSearchWAWidgetOnTapCallback fail, not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x076b
        L_0x06ac:
            java.lang.String r6 = "onSearchWAWidgetOnTapCallback success, ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "eventId"
            r5.put(r6, r3)
            r5.put(r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r3 = "hitTest"
            r5.put(r3, r1)
            java.lang.String r1 = "err_msg"
            r5.put(r1, r0)
            boolean r0 = r2.f130011p
            java.lang.String r1 = r2.f130012q
            java.lang.String r3 = "onSearchWAWidgetOnTapCallback"
            java.lang.String r0 = t83.C13851h1.C13852a.m13143c(r3, r5, r0, r1)
            t83.l0 r1 = new t83.l0
            r1.<init>(r2, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x076b
        L_0x06de:
            t83.l r0 = r26.mo68521L9()
            boolean r2 = r0.f130003h
            if (r2 != 0) goto L_0x06ed
            java.lang.String r0 = "onGetPoiInfo fail, not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x076b
        L_0x06ed:
            java.lang.String r2 = "onGetPoiInfo success, ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "json"
            java.lang.String r4 = r1.getString(r3)
            r2.put(r3, r4)
            java.lang.String r3 = "searchId"
            java.lang.String r4 = r1.getString(r3)
            r2.put(r3, r4)
            java.lang.String r3 = "poiId"
            java.lang.String r1 = r1.getString(r3)
            r2.put(r3, r1)
            boolean r1 = r0.f130011p
            java.lang.String r3 = r0.f130012q
            java.lang.String r4 = "onGetPoiInfoReturn"
            java.lang.String r1 = t83.C13851h1.C13852a.m13143c(r4, r2, r1, r3)
            t83.j0 r2 = new t83.j0
            r2.<init>(r0, r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x076b
        L_0x0725:
            java.lang.String r0 = r1.getString(r3)
            t83.l r1 = r26.mo68521L9()
            if (r1 == 0) goto L_0x076b
            t83.l r1 = r26.mo68521L9()     // Catch:{ JSONException -> 0x0755 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0755 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0755 }
            boolean r0 = r1.f130003h     // Catch:{ JSONException -> 0x0755 }
            if (r0 != 0) goto L_0x0742
            java.lang.String r0 = "not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ JSONException -> 0x0755 }
            goto L_0x076b
        L_0x0742:
            boolean r0 = r1.f130011p     // Catch:{ JSONException -> 0x0755 }
            java.lang.String r3 = r1.f130012q     // Catch:{ JSONException -> 0x0755 }
            java.lang.String r5 = "onGetMatchContactList"
            java.lang.String r0 = t83.C13851h1.C13852a.m13144d(r5, r2, r0, r3)     // Catch:{ JSONException -> 0x0755 }
            t83.b0 r2 = new t83.b0     // Catch:{ JSONException -> 0x0755 }
            r2.<init>(r1, r0)     // Catch:{ JSONException -> 0x0755 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)     // Catch:{ JSONException -> 0x0755 }
            goto L_0x076b
        L_0x0755:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r1)
            goto L_0x076b
        L_0x075d:
            java.lang.String r0 = r1.getString(r3, r4)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r7.f118501W1
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$f r2 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$f
            r2.<init>(r0)
            r1.post(r2)
        L_0x076b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI.mo63388u8(int, android.os.Bundle):void");
    }
}

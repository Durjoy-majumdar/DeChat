package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import di3.C7335d;
import di3.C86312j;
import e00.C7572d0;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import it1.C9247b;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vf1.C14805o3;
import vf1.C14810p3;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI */
public final class FinderLivePrecheckLicenseUI extends MMFinderUI {

    /* renamed from: B */
    public static final /* synthetic */ int f14561B = 0;

    /* renamed from: A */
    public MTimerHandler f14562A = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C2977d(this), true);

    /* renamed from: o */
    public MMWebView f14563o;

    /* renamed from: p */
    public final C13601g f14564p = C36568h.m40985a(new C2978e(this));

    /* renamed from: q */
    public Button f14565q;

    /* renamed from: r */
    public C9247b f14566r;

    /* renamed from: s */
    public C29060q.C29061a f14567s;

    /* renamed from: t */
    public boolean f14568t;

    /* renamed from: u */
    public String f14569u = "";

    /* renamed from: v */
    public String f14570v = "";

    /* renamed from: w */
    public int f14571w = 5;

    /* renamed from: x */
    public boolean f14572x;

    /* renamed from: y */
    public int f14573y;

    /* renamed from: z */
    public long f14574z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI$a */
    public static final class C2974a extends WebChromeClient {

        /* renamed from: a */
        public final WeakReference<FinderLivePrecheckLicenseUI> f14575a;

        public C2974a(WeakReference<FinderLivePrecheckLicenseUI> weakReference) {
            C87412m.m108594g(weakReference, "rLicenseUI");
            this.f14575a = weakReference;
        }

        public void onProgressChanged(WebView webView, int i) {
            FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI;
            super.onProgressChanged(webView, i);
            if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i("FinderLivePrecheckLicenseUI", "load web progress:" + i);
            }
            if (i == 100 && (finderLivePrecheckLicenseUI = this.f14575a.get()) != null) {
                if (!C87412m.m108589b(finderLivePrecheckLicenseUI.f14569u, "TYPE_STANDARD") || !finderLivePrecheckLicenseUI.f14572x) {
                    finderLivePrecheckLicenseUI.f14562A.stopTimer();
                    finderLivePrecheckLicenseUI.f14571w = 5;
                    finderLivePrecheckLicenseUI.f14562A.startTimer(1000);
                    Button button = finderLivePrecheckLicenseUI.f14565q;
                    if (button != null) {
                        button.setEnabled(false);
                    }
                } else {
                    finderLivePrecheckLicenseUI.f14571w = 0;
                    finderLivePrecheckLicenseUI.mo3033P7();
                    Button button2 = finderLivePrecheckLicenseUI.f14565q;
                    if (button2 != null) {
                        button2.setEnabled(true);
                    }
                }
                C9247b bVar = finderLivePrecheckLicenseUI.f14566r;
                if (bVar != null) {
                    bVar.mo8913b();
                }
                finderLivePrecheckLicenseUI.f14566r = null;
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f14575a.get();
            if (finderLivePrecheckLicenseUI == null) {
                Log.m105924i("FinderLivePrecheckLicenseUI", "licenseUI is null!");
                return;
            }
            Log.m105924i("FinderLivePrecheckLicenseUI", "onReceivedTitle title:" + str);
            if (!(str == null || str.length() == 0) && !C87412m.m108589b(finderLivePrecheckLicenseUI.f14570v, str) && !((C7572d0) C86312j.m106911c(C7572d0.class)).mo8343Rs(str) && !C112551y.m153819s(str, "about:blank", false)) {
                finderLivePrecheckLicenseUI.setMMTitle(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI$b */
    public static final class C2975b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePrecheckLicenseUI f14576d;

        /* renamed from: e */
        public final /* synthetic */ String f14577e;

        public C2975b(FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI, String str) {
            this.f14576d = finderLivePrecheckLicenseUI;
            this.f14577e = str;
        }

        public final void run() {
            MMWebView mMWebView = this.f14576d.f14563o;
            if (mMWebView != null) {
                mMWebView.loadUrl(this.f14577e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI$c */
    public static final class C2976c extends C29060q.C29061a {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePrecheckLicenseUI f14578d;

        public C2976c(FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
            this.f14578d = finderLivePrecheckLicenseUI;
        }

        public void onNetworkChange(int i) {
            Log.m105924i("FinderLivePrecheckLicenseUI", "licenseLoadUrl onNetworkChange status:" + i + '!');
            FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f14578d;
            finderLivePrecheckLicenseUI.mo3031N7(finderLivePrecheckLicenseUI.f14570v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI$d */
    public static final class C2977d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePrecheckLicenseUI f14579d;

        public C2977d(FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
            this.f14579d = finderLivePrecheckLicenseUI;
        }

        public boolean onTimerExpired() {
            FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f14579d;
            finderLivePrecheckLicenseUI.f14571w--;
            finderLivePrecheckLicenseUI.mo3033P7();
            FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI2 = this.f14579d;
            if (finderLivePrecheckLicenseUI2.f14571w > 0) {
                return true;
            }
            Button button = finderLivePrecheckLicenseUI2.f14565q;
            if (button == null) {
                return false;
            }
            button.setEnabled(true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI$e */
    public static final class C2978e extends C87413o implements C32224a<C2974a> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePrecheckLicenseUI f14580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2978e(FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
            super(0);
            this.f14580d = finderLivePrecheckLicenseUI;
        }

        public Object invoke() {
            return new C2974a(new WeakReference(this.f14580d));
        }
    }

    /* renamed from: N7 */
    public final void mo3031N7(String str) {
        boolean z = true;
        if (NetStatusUtil.getNetType((Context) getContext()) == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("licenseLoadUrl but non network, onNetworkChange is null:");
            if (this.f14567s != null) {
                z = false;
            }
            sb.append(z);
            sb.append('!');
            Log.m105920e("FinderLivePrecheckLicenseUI", sb.toString());
            if (this.f14567s == null) {
                this.f14567s = new C2976c(this);
                C86709a0.m107529k().mo121126a(this.f14567s);
            }
        } else if (!this.f14568t) {
            this.f14568t = true;
            MMWebView mMWebView = this.f14563o;
            if (mMWebView != null) {
                mMWebView.post(new C2975b(this, str));
            }
            Log.m105924i("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + '!');
        } else {
            Log.m105920e("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + " but haveLoadWebView!");
        }
    }

    /* renamed from: O7 */
    public final void mo3032O7() {
        if (C87412m.m108589b(this.f14569u, "TYPE_STANDARD") && this.f14571w <= 0) {
            Intent intent = new Intent();
            intent.putExtra("KEY_COUNTDOWN_FINISH", true);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult(0, intent);
        }
        finish();
    }

    /* renamed from: P7 */
    public final void mo3033P7() {
        String str;
        Button button = this.f14565q;
        if (button != null) {
            if (C87412m.m108589b(this.f14569u, "TYPE_LICENSE")) {
                if (this.f14571w <= 0) {
                    str = getResources().getString(C0966R.string.e2q);
                } else {
                    str = getResources().getString(C0966R.string.e2p, new Object[]{Integer.valueOf(this.f14571w)});
                }
            } else if (this.f14571w <= 0) {
                str = getResources().getString(C0966R.string.e2m);
            } else {
                str = getResources().getString(C0966R.string.e2l, new Object[]{Integer.valueOf(this.f14571w)});
            }
            button.setText(str);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aj5;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("KEY_COUNTDOWN_FINISH", false);
        }
        Log.m105924i("FinderLivePrecheckLicenseUI", "onActivityResult requestCode:" + i + ", resultCode:" + i2 + ", standardCountdownFinish:" + z);
        if (i == 1001) {
            if (i2 == -1) {
                setResult(-1);
                finish();
            }
            this.f14572x = z;
        }
    }

    public void onBackPressed() {
        mo3032O7();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("FinderLivePrecheckLicenseUI", "onCreate");
        super.onCreate(bundle);
        this.f14573y = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        this.f14574z = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0);
        String stringExtra = getIntent().getStringExtra("KEY_TYPE");
        C87412m.m108591d(stringExtra);
        this.f14569u = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_PATH");
        C87412m.m108591d(stringExtra2);
        this.f14570v = stringExtra2;
        if (C87412m.m108589b(this.f14569u, "TYPE_STANDARD")) {
            this.f14572x = getIntent().getBooleanExtra("KEY_COUNTDOWN_FINISH", false);
        }
        String str = this.f14569u;
        int i = C87412m.m108589b(str, "TYPE_LICENSE") ? 8 : C87412m.m108589b(str, "TYPE_STANDARD") ? 10 : 0;
        if (!(this.f14573y == 0 || this.f14574z == 0 || i == 0)) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8601b((C8777j5) c, i, this.f14573y, this.f14574z, (Map) null, 8, (Object) null);
        }
        Log.m105924i("FinderLivePrecheckLicenseUI", "parseParams curType:" + this.f14569u + ", curUrl:" + this.f14570v + ", standardLicenseCountDownFinish:" + this.f14572x);
        String str2 = this.f14570v;
        if (str2 == null || str2.length() == 0) {
            Log.m105920e("FinderLivePrecheckLicenseUI", "curUrl is empty!!!");
            C62042e.f176370a.mo87041S1(this, "url为空");
            finish();
        }
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C14805o3(this), C0966R.raw.actionbar_icon_dark_back);
        MMWebView mMWebView = (MMWebView) getContentView().findViewById(C0966R.C0970id.lm8);
        mMWebView.getClass();
        this.f14563o = mMWebView;
        mMWebView.setWebChromeClient((C2974a) ((C36570n) this.f14564p).getValue());
        Button button = (Button) findViewById(C0966R.C0970id.fne);
        this.f14565q = button;
        if (button != null) {
            button.setOnClickListener(new C14810p3(this));
        }
        Button button2 = this.f14565q;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        mo3033P7();
        C9247b.C9248a aVar = C9247b.f28989d;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C9247b a = C9247b.C9248a.m8889a(aVar, context, (String) null, 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f14566r = a;
        a.begin();
        String str3 = this.f14570v;
        try {
            this.f14570v = str3;
            mo3031N7(str3);
        } catch (Exception e) {
            Log.m105920e("FinderLivePrecheckLicenseUI", e.getMessage());
        }
    }

    public void onDestroy() {
        Log.m105924i("FinderLivePrecheckLicenseUI", "onDestroy");
        super.onDestroy();
        this.f14562A.stopTimer();
        MMWebView mMWebView = this.f14563o;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
        this.f14563o = null;
        C29060q.C29061a aVar = this.f14567s;
        if (aVar != null) {
            C86709a0.m107529k().mo121129d(aVar);
        }
        C9247b bVar = this.f14566r;
        if (bVar != null) {
            bVar.mo8913b();
        }
        this.f14566r = null;
    }
}

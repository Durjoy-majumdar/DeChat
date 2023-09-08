package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.os.Looper;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C7572d0;
import gy3.C87412m;
import java.io.IOException;
import kotlin.Metadata;
import ok1.C62042e;
import vf1.C14820r2;
import vf1.C14825s2;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveEndUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveEndUI */
public final class FinderLiveEndUI extends MMFinderUI {

    /* renamed from: o */
    public final String f14511o = "FinderLiveEndUI";

    /* renamed from: p */
    public MMWebView f14512p;

    /* renamed from: q */
    public Button f14513q;

    /* renamed from: r */
    public String f14514r;

    /* renamed from: s */
    public String f14515s;

    /* renamed from: t */
    public String f14516t = this.f14514r;

    /* renamed from: u */
    public int f14517u = 5;

    /* renamed from: v */
    public final C2962b f14518v = new C2962b(this);

    /* renamed from: w */
    public MTimerHandler f14519w = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C2961a(this), true);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveEndUI$a */
    public static final class C2961a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveEndUI f14520d;

        public C2961a(FinderLiveEndUI finderLiveEndUI) {
            this.f14520d = finderLiveEndUI;
        }

        public boolean onTimerExpired() {
            String str;
            FinderLiveEndUI finderLiveEndUI = this.f14520d;
            finderLiveEndUI.f14517u--;
            Button button = finderLiveEndUI.f14513q;
            if (button != null) {
                if (C112551y.m153810j(finderLiveEndUI.f14516t, finderLiveEndUI.f14514r, false, 2, (Object) null)) {
                    FinderLiveEndUI finderLiveEndUI2 = this.f14520d;
                    if (finderLiveEndUI2.f14517u <= 0) {
                        str = finderLiveEndUI2.getResources().getString(C0966R.string.e2q);
                    } else {
                        str = finderLiveEndUI2.getResources().getString(C0966R.string.e2p, new Object[]{Integer.valueOf(this.f14520d.f14517u)});
                    }
                } else {
                    FinderLiveEndUI finderLiveEndUI3 = this.f14520d;
                    if (finderLiveEndUI3.f14517u <= 0) {
                        str = finderLiveEndUI3.getResources().getString(C0966R.string.e2m);
                    } else {
                        str = finderLiveEndUI3.getResources().getString(C0966R.string.e2l, new Object[]{Integer.valueOf(this.f14520d.f14517u)});
                    }
                }
                button.setText(str);
            }
            FinderLiveEndUI finderLiveEndUI4 = this.f14520d;
            if (finderLiveEndUI4.f14517u > 0) {
                return true;
            }
            Button button2 = finderLiveEndUI4.f14513q;
            if (button2 != null) {
                button2.setEnabled(true);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveEndUI$b */
    public static final class C2962b extends WebChromeClient {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveEndUI f14521a;

        public C2962b(FinderLiveEndUI finderLiveEndUI) {
            this.f14521a = finderLiveEndUI;
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            String str2 = this.f14521a.f14511o;
            Log.m105924i(str2, "onReceivedTitle title:" + str);
            if (!(str == null || str.length() == 0) && !C87412m.m108589b(this.f14521a.f14516t, str) && !((C7572d0) C86312j.m106911c(C7572d0.class)).mo8343Rs(str) && !C112551y.m153819s(str, "about:blank", false)) {
                this.f14521a.setMMTitle(str);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo3018N7() {
        Button button = this.f14513q;
        if (button != null) {
            button.setEnabled(false);
        }
        this.f14519w.stopTimer();
        this.f14517u = 5;
        Button button2 = this.f14513q;
        if (button2 != null) {
            button2.setText(getResources().getString(C0966R.string.e2p, new Object[]{Integer.valueOf(this.f14517u)}));
        }
        this.f14519w.startTimer(1000);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aj5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14514r = getIntent().getStringExtra("KEY_PATH_LICENSE");
        this.f14515s = getIntent().getStringExtra("KEY_PATH_STANDARD");
        String str = this.f14514r;
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            String str2 = this.f14515s;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                setMMTitle(getResources().getString(C0966R.string.e2n));
                hideActionbarLine();
                setActionbarColor(getResources().getColor(C0966R.color.al6));
                setBackGroundColorResource(C0966R.color.al6);
                setBackBtn(new C14820r2(this), C0966R.raw.actionbar_icon_dark_back);
                MMWebView mMWebView = (MMWebView) getContentView().findViewById(C0966R.C0970id.lm8);
                mMWebView.getClass();
                this.f14512p = mMWebView;
                mMWebView.setWebChromeClient(this.f14518v);
                Button button = (Button) findViewById(C0966R.C0970id.fne);
                this.f14513q = button;
                if (button != null) {
                    button.setOnClickListener(new C14825s2(this));
                }
                String str3 = this.f14514r;
                if (str3 == null) {
                    str3 = "";
                }
                try {
                    this.f14516t = str3;
                    MMWebView mMWebView2 = this.f14512p;
                    if (mMWebView2 != null) {
                        mMWebView2.loadUrl(str3);
                    }
                    mo3018N7();
                    return;
                } catch (IOException e) {
                    Log.m105920e(this.f14511o, e.getMessage());
                    return;
                }
            }
        }
        Log.m105920e(this.f14511o, "mUrl is empty!!!");
        C62042e.f176370a.mo87041S1(this, "url为空");
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14519w.stopTimer();
    }
}

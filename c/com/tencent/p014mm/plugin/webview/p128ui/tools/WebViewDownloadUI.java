package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AddDownloadTaskEvent;
import com.tencent.p014mm.autogen.events.GameDownloadReport4WebViewEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l83.C10470c;
import nj3.C76879j;
import p237sp.C13754y;
import p237sp.C48456t;
import p237sp.C48457w;
import p680ru.C77570i;
import p749xh.C53352w2;
import p910lj.C76701a;
import te3.C50916q50;
import y41.C53493b;

@C86737h0
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI */
public class WebViewDownloadUI extends MMActivity {

    /* renamed from: E */
    public static List<Long> f22557E = new LinkedList();

    /* renamed from: F */
    public static C40952u f22558F = new C6148f();

    /* renamed from: A */
    public String f22559A;

    /* renamed from: B */
    public String f22560B;

    /* renamed from: C */
    public int f22561C = 0;

    /* renamed from: D */
    public C40952u f22562D = new C6149g();

    /* renamed from: d */
    public Button f22563d;

    /* renamed from: e */
    public Button f22564e;

    /* renamed from: f */
    public Button f22565f;

    /* renamed from: g */
    public TextView f22566g;

    /* renamed from: h */
    public TextView f22567h;

    /* renamed from: i */
    public TextView f22568i;

    /* renamed from: j */
    public ImageView f22569j;

    /* renamed from: n */
    public ImageView f22570n;

    /* renamed from: o */
    public TextView f22571o;

    /* renamed from: p */
    public ProgressBar f22572p;

    /* renamed from: q */
    public C6150h f22573q;

    /* renamed from: r */
    public long f22574r;

    /* renamed from: s */
    public boolean f22575s;

    /* renamed from: t */
    public int f22576t;

    /* renamed from: u */
    public TextView f22577u;

    /* renamed from: v */
    public Context f22578v;

    /* renamed from: w */
    public int f22579w;

    /* renamed from: x */
    public int f22580x;

    /* renamed from: y */
    public int f22581y;

    /* renamed from: z */
    public String f22582z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$a */
    public class C6141a implements MenuItem.OnMenuItemClickListener {
        public C6141a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.mo7102K7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$b */
    public class C6142b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f22584d;

        public C6142b(String str) {
            this.f22584d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            String str = this.f22584d;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.mo7101J7(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$c */
    public class C6143c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f22586d;

        /* renamed from: e */
        public final /* synthetic */ String f22587e;

        /* renamed from: f */
        public final /* synthetic */ String f22588f;

        /* renamed from: g */
        public final /* synthetic */ String f22589g;

        /* renamed from: h */
        public final /* synthetic */ String f22590h;

        /* renamed from: i */
        public final /* synthetic */ String f22591i;

        /* renamed from: j */
        public final /* synthetic */ String f22592j;

        /* renamed from: n */
        public final /* synthetic */ int f22593n;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$c$a */
        public class C6144a implements DialogInterface.OnClickListener {
            public C6144a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n nVar = C115669n.INSTANCE;
                C6143c cVar = C6143c.this;
                nVar.mo160131h(14217, C6143c.this.f22589g, 5, cVar.f22591i, cVar.f22586d, Integer.valueOf(WebViewDownloadUI.this.f22581y));
                C6143c cVar2 = C6143c.this;
                WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
                WebViewDownloadUI.m6020H7(webViewDownloadUI, cVar2.f22586d, cVar2.f22587e, cVar2.f22588f, cVar2.f22589g, cVar2.f22590h, cVar2.f22591i, cVar2.f22592j, webViewDownloadUI.f22582z, cVar2.f22593n);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$c$b */
        public class C6145b implements DialogInterface.OnClickListener {
            public C6145b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n nVar = C115669n.INSTANCE;
                C6143c cVar = C6143c.this;
                nVar.mo160131h(14217, C6143c.this.f22589g, 6, cVar.f22591i, cVar.f22586d, Integer.valueOf(WebViewDownloadUI.this.f22581y));
                dialogInterface.dismiss();
            }
        }

        public C6143c(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
            this.f22586d = str;
            this.f22587e = str2;
            this.f22588f = str3;
            this.f22589g = str4;
            this.f22590h = str5;
            this.f22591i = str6;
            this.f22592j = str7;
            this.f22593n = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick state=%s", WebViewDownloadUI.this.f22573q);
            if (WebViewDownloadUI.this.f22573q.ordinal() != 0) {
                Log.m105920e("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick unexpected download state");
            } else if (!NetStatusUtil.isNetworkConnected(WebViewDownloadUI.this.f22578v)) {
                WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
                C76701a.makeText(webViewDownloadUI.f22578v, (CharSequence) webViewDownloadUI.getString(C0966R.string.f8t), 0).show();
                Log.m105924i("MicroMsg.WebViewDownloadUI", "startDownload fail, network not ready");
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (NetStatusUtil.isWifi(WebViewDownloadUI.this.f22578v)) {
                WebViewDownloadUI webViewDownloadUI2 = WebViewDownloadUI.this;
                WebViewDownloadUI.m6020H7(webViewDownloadUI2, this.f22586d, this.f22587e, this.f22588f, this.f22589g, this.f22590h, this.f22591i, this.f22592j, webViewDownloadUI2.f22582z, this.f22593n);
            } else {
                C115669n.INSTANCE.mo160131h(14217, this.f22589g, 4, this.f22591i, this.f22586d, Integer.valueOf(WebViewDownloadUI.this.f22581y));
                WebViewDownloadUI webViewDownloadUI3 = WebViewDownloadUI.this;
                C76879j.m92710D(webViewDownloadUI3, webViewDownloadUI3.getString(C0966R.string.lfa), WebViewDownloadUI.this.getString(C0966R.string.lfb), WebViewDownloadUI.this.getString(C0966R.string.lf6), WebViewDownloadUI.this.getString(C0966R.string.f7926wf), false, new C6144a(), new C6145b(), C0966R.color.akw);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$d */
    public class C6146d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f22597d;

        /* renamed from: e */
        public final /* synthetic */ String f22598e;

        /* renamed from: f */
        public final /* synthetic */ String f22599f;

        public C6146d(String str, String str2, String str3) {
            this.f22597d = str;
            this.f22598e = str2;
            this.f22599f = str3;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, downloadId = %d, state=%s", Long.valueOf(WebViewDownloadUI.this.f22574r), WebViewDownloadUI.this.f22573q);
            C115669n.INSTANCE.mo160131h(14217, this.f22597d, 3, this.f22598e, this.f22599f, Integer.valueOf(WebViewDownloadUI.this.f22581y));
            if (WebViewDownloadUI.this.f22574r <= 0) {
                Log.m105920e("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask fail, unexpected branch! ");
                C76701a.makeText((Context) WebViewDownloadUI.this.getContext(), (CharSequence) WebViewDownloadUI.this.getString(C0966R.string.lf8), 1).show();
            } else {
                int r = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(WebViewDownloadUI.this.f22574r);
                Log.m105925i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, ret = %d", Integer.valueOf(r));
                if (r > 0) {
                    C76701a.makeText((Context) WebViewDownloadUI.this.getContext(), (CharSequence) WebViewDownloadUI.this.getString(C0966R.string.lf9), 1).show();
                    WebViewDownloadUI.this.mo7100I7();
                } else {
                    C76701a.makeText((Context) WebViewDownloadUI.this.getContext(), (CharSequence) WebViewDownloadUI.this.getString(C0966R.string.lf8), 1).show();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$e */
    public class C6147e implements View.OnClickListener {
        public C6147e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.mo7102K7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$f */
    public class C6148f implements C40952u {
        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(2, mo7114a(j));
            }
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(7, mo7114a(j));
            }
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(6, mo7114a(j));
            }
        }

        /* renamed from: a */
        public final C53493b mo7114a(long j) {
            C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
            C53493b bVar = new C53493b();
            bVar.mo74165a(nh);
            return bVar;
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(8, mo7114a(j));
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(1, mo7114a(j));
            }
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            if (((LinkedList) WebViewDownloadUI.f22557E).contains(Long.valueOf(j))) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(3, mo7114a(j));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$g */
    public class C6149g implements C40952u {
        public C6149g() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            TextView textView = webViewDownloadUI.f22577u;
            if (textView != null && j3 != 0) {
                textView.setText(webViewDownloadUI.getString(C0966R.string.lfd, new Object[]{Long.valueOf((j2 * 100) / j3)}));
            }
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskRemoved id=%d", Long.valueOf(j));
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.mo7100I7();
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskResumed id=%d, savedFilePath=%s", Long.valueOf(j), str);
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskPaused id=%d", Long.valueOf(j));
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
            C76701a.makeText((Context) WebViewDownloadUI.this.getContext(), (CharSequence) WebViewDownloadUI.this.getString(C0966R.string.lf_), 1).show();
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.mo7101J7((String) null);
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskStarted id=%d, savedFilePath=%s", Long.valueOf(j), str);
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            Log.m105925i("MicroMsg.WebViewDownloadUI", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", Long.valueOf(j), str, Boolean.valueOf(z));
            C76701a.makeText((Context) WebViewDownloadUI.this.getContext(), (CharSequence) WebViewDownloadUI.this.getString(C0966R.string.lfc), 1).show();
            WebViewDownloadUI webViewDownloadUI = WebViewDownloadUI.this;
            List<Long> list = WebViewDownloadUI.f22557E;
            webViewDownloadUI.getClass();
            Intent intent = new Intent();
            intent.putExtra("key_result_err_code", 0);
            webViewDownloadUI.setResult(-1, intent);
            webViewDownloadUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$h */
    public enum C6150h {
        TO_DOWNLOAD,
        DOWNLOADING
    }

    /* renamed from: H7 */
    public static void m6020H7(WebViewDownloadUI webViewDownloadUI, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        long j;
        WebViewDownloadUI webViewDownloadUI2 = webViewDownloadUI;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        webViewDownloadUI.getClass();
        Class cls = C13754y.class;
        GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent = new GameDownloadReport4WebViewEvent();
        GameDownloadReport4WebViewEvent.C1075a aVar = gameDownloadReport4WebViewEvent.f9278d;
        aVar.f9279a = str9;
        aVar.f9280b = str10;
        aVar.f9282d = str11;
        aVar.f9281c = str12;
        gameDownloadReport4WebViewEvent.publish();
        C115669n.INSTANCE.mo160131h(14217, str12, 2, str6, str9, Integer.valueOf(webViewDownloadUI2.f22581y));
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110176a = str9;
        nVar.f110177b = str5;
        nVar.f110179d = str7;
        nVar.f110180e = str10;
        nVar.f110182g = str12;
        nVar.f110183h = str8;
        nVar.f110184i = true;
        nVar.f110181f = webViewDownloadUI2.f22576t;
        nVar.f110192q = str11;
        nVar.f110187l = i;
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_download_use_mars, 1) == 1;
        int i2 = webViewDownloadUI2.f22580x;
        if (i2 != 1 || !z) {
            j = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
        } else {
            nVar.f110197v = i2;
            j = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar);
        }
        Log.m105925i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick, lastDownloadId = %d, downloadId=%d, useMars=%b, downloadType=%d", Long.valueOf(webViewDownloadUI2.f22574r), Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(webViewDownloadUI2.f22580x));
        webViewDownloadUI2.f22574r = j;
        ((LinkedList) f22557E).add(Long.valueOf(j));
        AddDownloadTaskEvent addDownloadTaskEvent = new AddDownloadTaskEvent();
        AddDownloadTaskEvent.C0994a aVar2 = addDownloadTaskEvent.f9026d;
        aVar2.f9029c = j;
        aVar2.f9028b = false;
        aVar2.f9027a = webViewDownloadUI2.f22579w;
        aVar2.f9030d = webViewDownloadUI2.f22559A;
        addDownloadTaskEvent.publish();
        webViewDownloadUI2.f22575s = true;
        if (j <= 0) {
            C76701a.makeText((Context) webViewDownloadUI.getContext(), (CharSequence) webViewDownloadUI.getString(C0966R.string.lf_), 1).show();
            webViewDownloadUI.finish();
            return;
        }
        webViewDownloadUI.mo7103L7(C6150h.DOWNLOADING);
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "WebViewDownloadUI_startDownload", webViewDownloadUI.hashCode());
    }

    /* renamed from: I7 */
    public final void mo7100I7() {
        Log.m105924i("MicroMsg.WebViewDownloadUI", "finishCancel");
        Intent intent = new Intent();
        intent.putExtra("key_result_err_code", 2);
        intent.putExtra("key_result_err_msg", "user cancel");
        setResult(-1, intent);
        finish();
    }

    /* renamed from: J7 */
    public final void mo7101J7(String str) {
        Log.m105921e("MicroMsg.WebViewDownloadUI", "finishFailed %s", str);
        Intent intent = new Intent();
        intent.putExtra("key_result_err_code", 3);
        if (Util.isNullOrNil(str)) {
            str = "download failed";
        }
        intent.putExtra("key_result_err_msg", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: K7 */
    public final void mo7102K7() {
        Log.m105925i("MicroMsg.WebViewDownloadUI", "finishWithResult %s", Boolean.valueOf(this.f22575s));
        if (!this.f22575s) {
            mo7100I7();
        } else {
            finish();
        }
    }

    /* renamed from: L7 */
    public final void mo7103L7(C6150h hVar) {
        Log.m105925i("MicroMsg.WebViewDownloadUI", "setDownloadState old=%s new=%s", this.f22573q, hVar);
        this.f22573q = hVar;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            this.f22563d.setVisibility(0);
            this.f22577u.setVisibility(8);
            this.f22564e.setVisibility(8);
            this.f22565f.setVisibility(0);
        } else if (ordinal == 1) {
            this.f22563d.setVisibility(8);
            this.f22564e.setVisibility(0);
            this.f22577u.setText(getString(C0966R.string.lfd, new Object[]{0}));
            this.f22577u.setVisibility(0);
            this.f22565f.setVisibility(4);
        }
    }

    /* renamed from: M7 */
    public final void mo7104M7(String str) {
        C76879j.m92754y(this, "", getResources().getString(C0966R.string.m_s), getResources().getString(C0966R.string.f8028zq), new C6142b(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03fe  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7105N7(te3.C50916q50 r33) {
        /*
            r32 = this;
            r10 = r32
            r0 = r33
            java.lang.Class<sp.y> r11 = p237sp.C13754y.class
            android.widget.ProgressBar r1 = r10.f22572p
            r2 = 8
            r1.setVisibility(r2)
            r1 = 1
            r10.mo7106O7(r1)
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$h r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewDownloadUI.C6150h.TO_DOWNLOAD
            r10.mo7103L7(r3)
            if (r0 == 0) goto L_0x002c
            java.lang.String r3 = r0.f140149i
            java.lang.String r4 = r0.f140145e
            java.lang.String r5 = r0.f140144d
            java.lang.String r6 = r0.f140146f
            java.lang.String r7 = r0.f140148h
            java.lang.String r8 = r0.f140147g
            java.lang.String r9 = r0.f140150j
            java.lang.String r0 = r0.f140151n
            r12 = r3
            r3 = r8
            r8 = r4
            goto L_0x0086
        L_0x002c:
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r3 = "task_url"
            java.lang.String r3 = r0.getStringExtra(r3)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r4 = "task_name"
            java.lang.String r0 = r0.getStringExtra(r4)
            android.content.Intent r4 = r32.getIntent()
            java.lang.String r5 = "file_md5"
            java.lang.String r4 = r4.getStringExtra(r5)
            android.content.Intent r5 = r32.getIntent()
            java.lang.String r6 = "thumb_url"
            java.lang.String r5 = r5.getStringExtra(r6)
            android.content.Intent r6 = r32.getIntent()
            java.lang.String r7 = "app_developer"
            java.lang.String r7 = r6.getStringExtra(r7)
            android.content.Intent r6 = r32.getIntent()
            java.lang.String r8 = "app_version"
            java.lang.String r6 = r6.getStringExtra(r8)
            android.content.Intent r8 = r32.getIntent()
            java.lang.String r9 = "app_privacy_url"
            java.lang.String r8 = r8.getStringExtra(r9)
            android.content.Intent r9 = r32.getIntent()
            java.lang.String r12 = "app_permission_url"
            java.lang.String r9 = r9.getStringExtra(r12)
            r12 = r3
            r3 = r4
            r31 = r8
            r8 = r0
            r0 = r31
        L_0x0086:
            android.content.Intent r4 = r32.getIntent()
            java.lang.String r13 = "alternative_url"
            java.lang.String r13 = r4.getStringExtra(r13)
            android.content.Intent r4 = r32.getIntent()
            java.lang.String r14 = "task_size"
            r1 = 0
            long r17 = r4.getLongExtra(r14, r1)
            android.content.Intent r4 = r32.getIntent()
            java.lang.String r14 = "extInfo"
            java.lang.String r4 = r4.getStringExtra(r14)
            android.content.Intent r14 = r32.getIntent()
            java.lang.String r15 = "fileType"
            java.lang.String r14 = r14.getStringExtra(r15)
            android.content.Intent r15 = r32.getIntent()
            java.lang.String r1 = "appid"
            java.lang.String r15 = r15.getStringExtra(r1)
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r2 = "package_name"
            java.lang.String r1 = r1.getStringExtra(r2)
            r10.f22582z = r1
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r2 = "title"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r32.getIntent()
            r19 = r11
            java.lang.String r11 = "page_url"
            java.lang.String r11 = r2.getStringExtra(r11)
            android.content.Intent r2 = r32.getIntent()
            r20 = r13
            java.lang.String r13 = "task_scene"
            r21 = r0
            r0 = 0
            int r13 = r2.getIntExtra(r13, r0)
            android.content.Intent r2 = r32.getIntent()
            r22 = r13
            java.lang.String r13 = "page_scene"
            int r2 = r2.getIntExtra(r13, r0)
            r10.f22579w = r2
            android.content.Intent r2 = r32.getIntent()
            java.lang.String r13 = "task_download_type"
            int r2 = r2.getIntExtra(r13, r0)
            r10.f22580x = r2
            r2 = 10
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r3
            r13 = 1
            r2[r13] = r12
            r13 = 2
            r2[r13] = r4
            r23 = 3
            r2[r23] = r14
            r24 = 4
            r2[r24] = r15
            java.lang.String r13 = r10.f22582z
            r0 = 5
            r2[r0] = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r17)
            r0 = 6
            r2[r0] = r13
            r13 = 7
            r2[r13] = r5
            int r0 = r10.f22579w
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r26 = 8
            r2[r26] = r0
            r0 = 9
            int r13 = r10.f22581y
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r0] = r13
            java.lang.String r0 = "MicroMsg.WebViewDownloadUI"
            java.lang.String r13 = "onCreate: md5=%s, url=%s, extInfo=%s, fileType=%s, appId=%s, packageName=%s, taskSize=%d, thumbUrl=%s, pageScene=%s,fromScene=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = r4
            r13 = 5
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r13 = 0
            r4[r13] = r15
            r13 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r4[r13] = r16
            r16 = 2
            r4[r16] = r11
            r4[r23] = r12
            int r13 = r10.f22581y
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r24] = r13
            r13 = 14217(0x3789, float:1.9922E-41)
            r2.mo160131h(r13, r4)
            r2 = 1
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r2)
            r10.f22576t = r4
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x017d
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            goto L_0x017e
        L_0x017d:
            r2 = r1
        L_0x017e:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x019b
            android.widget.TextView r4 = r10.f22566g
            android.text.TextPaint r4 = r4.getPaint()
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r14)
            android.widget.TextView r4 = r10.f22566g
            r4.setText(r2)
            android.widget.TextView r2 = r10.f22566g
            r4 = 0
            r2.setVisibility(r4)
        L_0x019b:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x01b8
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x01b8
            java.lang.String r2 = r10.f22582z
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x01b0
            goto L_0x01b8
        L_0x01b0:
            r28 = r3
        L_0x01b2:
            r29 = r5
        L_0x01b4:
            r30 = r12
            goto L_0x02b3
        L_0x01b8:
            android.content.res.AssetManager r2 = r32.getAssets()     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r4 = "app_info_arrays.xml"
            java.io.InputStream r2 = r2.open(r4)     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.convertStreamToString(r2)     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r4 = "apps"
            r14 = 0
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r4, r14)     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r4 = ".apps.$count"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x01b0 }
            r14 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r14)     // Catch:{ IOException -> 0x01b0 }
            r14 = 0
        L_0x01db:
            if (r14 >= r4) goto L_0x01b0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01b0 }
            r13.<init>()     // Catch:{ IOException -> 0x01b0 }
            r27 = r4
            java.lang.String r4 = ".apps.app"
            r13.append(r4)     // Catch:{ IOException -> 0x01b0 }
            if (r14 <= 0) goto L_0x01f0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x01b0 }
            goto L_0x01f2
        L_0x01f0:
            java.lang.String r4 = ""
        L_0x01f2:
            r13.append(r4)     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r4 = r13.toString()     // Catch:{ IOException -> 0x01b0 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01b0 }
            r13.<init>()     // Catch:{ IOException -> 0x01b0 }
            r13.append(r4)     // Catch:{ IOException -> 0x01b0 }
            r28 = r3
            java.lang.String r3 = ".$name"
            r13.append(r3)     // Catch:{ IOException -> 0x01b2 }
            java.lang.String r3 = r13.toString()     // Catch:{ IOException -> 0x01b2 }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x01b2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x01b2 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01b2 }
            r13.<init>()     // Catch:{ IOException -> 0x01b2 }
            r13.append(r4)     // Catch:{ IOException -> 0x01b2 }
            r29 = r5
            java.lang.String r5 = ".$package"
            r13.append(r5)     // Catch:{ IOException -> 0x01b4 }
            java.lang.String r5 = r13.toString()     // Catch:{ IOException -> 0x01b4 }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x01b4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x01b4 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01b4 }
            r13.<init>()     // Catch:{ IOException -> 0x01b4 }
            r13.append(r4)     // Catch:{ IOException -> 0x01b4 }
            r30 = r12
            java.lang.String r12 = ".$task"
            r13.append(r12)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r12 = r13.toString()     // Catch:{ IOException -> 0x02b3 }
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02b3 }
            boolean r13 = r3.equalsIgnoreCase(r1)     // Catch:{ IOException -> 0x02b3 }
            if (r13 != 0) goto L_0x026d
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch:{ IOException -> 0x02b3 }
            if (r3 != 0) goto L_0x026d
            java.lang.String r3 = r10.f22582z     // Catch:{ IOException -> 0x02b3 }
            boolean r3 = r5.equalsIgnoreCase(r3)     // Catch:{ IOException -> 0x02b3 }
            if (r3 != 0) goto L_0x026d
            boolean r3 = r12.equalsIgnoreCase(r8)     // Catch:{ IOException -> 0x02b3 }
            if (r3 == 0) goto L_0x025f
            goto L_0x026d
        L_0x025f:
            int r14 = r14 + 1
            r4 = r27
            r3 = r28
            r5 = r29
            r12 = r30
            r13 = 14217(0x3789, float:1.9922E-41)
            goto L_0x01db
        L_0x026d:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ IOException -> 0x02b3 }
            if (r3 == 0) goto L_0x028b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b3 }
            r3.<init>()     // Catch:{ IOException -> 0x02b3 }
            r3.append(r4)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r12 = ".$version"
            r3.append(r12)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02b3 }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x02b3 }
            r6 = r3
        L_0x028b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ IOException -> 0x02b3 }
            if (r3 == 0) goto L_0x02a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b3 }
            r3.<init>()     // Catch:{ IOException -> 0x02b3 }
            r3.append(r4)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r4 = ".$developer"
            r3.append(r4)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02b3 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x02b3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x02b3 }
            r7 = r2
        L_0x02a9:
            java.lang.String r2 = r10.f22582z     // Catch:{ IOException -> 0x02b3 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ IOException -> 0x02b3 }
            if (r2 == 0) goto L_0x02b3
            r10.f22582z = r5     // Catch:{ IOException -> 0x02b3 }
        L_0x02b3:
            r2 = 7
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r1
            r1 = 1
            r3[r1] = r8
            java.lang.String r1 = r10.f22582z
            r2 = 2
            r3[r2] = r1
            r3[r23] = r6
            r3[r24] = r7
            r1 = 5
            r3[r1] = r9
            r1 = 6
            r3[r1] = r21
            java.lang.String r1 = "title:%s taskName:%s, package:%s, version:%s, developer:%s, permissionUrl:%s, privacyAgreementUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x02f0
            android.widget.TextView r1 = r10.f22567h
            r2 = 2131839980(0x7f114bec, float:1.9313227E38)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r6
            java.lang.String r2 = r10.getString(r2, r4)
            r1.setText(r2)
            android.widget.TextView r1 = r10.f22567h
            r1.setVisibility(r3)
            r1 = 1
            goto L_0x02f2
        L_0x02f0:
            r3 = 0
            r1 = 0
        L_0x02f2:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x030f
            android.widget.TextView r2 = r10.f22568i
            r4 = 2131839977(0x7f114be9, float:1.931322E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r7
            java.lang.String r4 = r10.getString(r4, r6)
            r2.setText(r4)
            android.widget.TextView r2 = r10.f22568i
            r2.setVisibility(r3)
            goto L_0x0310
        L_0x030f:
            r1 = 0
        L_0x0310:
            java.lang.String r2 = r10.f22582z
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x032b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 != 0) goto L_0x0325
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r2 != 0) goto L_0x0325
            goto L_0x032b
        L_0x0325:
            r3 = 0
            r4 = 1
            r25 = 0
            goto L_0x03b7
        L_0x032b:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r3 = 2131839979(0x7f114beb, float:1.9313225E38)
            r4 = 2131839978(0x7f114bea, float:1.9313223E38)
            if (r2 != 0) goto L_0x0373
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r2 != 0) goto L_0x0373
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "<a href='"
            r2.append(r5)
            r2.append(r9)
            java.lang.String r5 = "'>%s</a>  |  <a href='"
            r2.append(r5)
            r5 = r21
            r2.append(r5)
            java.lang.String r5 = "'>%s</a>"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r4 = r10.getString(r4)
            r5 = 0
            r6[r5] = r4
            java.lang.String r3 = r10.getString(r3)
            r7 = 1
            r6[r7] = r3
            java.lang.String r2 = java.lang.String.format(r2, r6)
            goto L_0x039c
        L_0x0373:
            r5 = 0
            r7 = 1
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "permission"
            r2[r5] = r6
            java.lang.String r5 = r10.f22582z
            r2[r7] = r5
            java.lang.String r4 = r10.getString(r4)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "privacy"
            r2[r23] = r4
            java.lang.String r4 = r10.f22582z
            r2[r24] = r4
            java.lang.String r3 = r10.getString(r3)
            r4 = 5
            r2[r4] = r3
            java.lang.String r3 = "<a href='https://dldir1.qq.com/weixin/android/wechat_webview_download_appinfo_new.html?fun=%s&package=%s'>%s</a>  |  <a href='https://dldir1.qq.com/weixin/android/wechat_webview_download_appinfo_new.html?fun=%s&package=%s'>%s</a>"
            java.lang.String r2 = java.lang.String.format(r3, r2)
        L_0x039c:
            android.widget.TextView r3 = r10.f22571o
            r3.setText(r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.widget.TextView r3 = r10.f22571o
            r4 = 1
            r2.mo107079pD(r3, r4)
            android.widget.TextView r2 = r10.f22571o
            r3 = 0
            r2.setVisibility(r3)
            r25 = r1
        L_0x03b7:
            if (r25 != 0) goto L_0x03fe
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r15
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            r3 = 2
            r2[r3] = r11
            r2[r23] = r30
            int r3 = r10.f22581y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r24] = r3
            r3 = 14217(0x3789, float:1.9922E-41)
            r1.mo160131h(r3, r2)
            java.lang.String r1 = "Missing required parameters: developer, app_version, privacy_agreement_url or permission_url."
            r10.f22559A = r1
            java.lang.String r1 = "Finish without all elements"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r0 = 2131839995(0x7f114bfb, float:1.9313257E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r10.f22559A
            r4 = 0
            r2[r4] = r3
            java.lang.String r0 = r10.getString(r0, r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            java.lang.String r0 = r10.f22559A
            r10.mo7101J7(r0)
            return
        L_0x03fe:
            r1 = 1
            r2 = 0
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x041a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getSizeMB(r17)
            android.widget.Button r2 = r10.f22563d
            r3 = 2131839985(0x7f114bf1, float:1.9313237E38)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 0
            r4[r1] = r0
            java.lang.String r0 = r10.getString(r3, r4)
            r2.setText(r0)
        L_0x041a:
            android.content.res.Resources r0 = r32.getResources()
            r1 = 2131165339(0x7f07009b, float:1.7944892E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r32.getResources()
            r2 = 2131165304(0x7f070078, float:1.7944821E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Intent r2 = r32.getIntent()
            r3 = 2131757180(0x7f10087c, float:1.9145288E38)
            java.lang.String r4 = "icon_res_id"
            int r2 = r2.getIntExtra(r4, r3)
            gc0.a r3 = gc0.C20828a.m22825b()
            android.widget.ImageView r4 = r10.f22569j
            hc0.c$b r5 = new hc0.c$b
            r5.<init>()
            r5.f59359o = r2
            r2 = 1
            r5.f59347c = r2
            r5.f59366v = r2
            r5.f59354j = r1
            r5.f59355k = r1
            r5.f59367w = r2
            r5.f59364t = r2
            float r0 = (float) r0
            r5.f59365u = r0
            r5.f59346b = r2
            hc0.c r0 = r5.mo32666a()
            r5 = r29
            r3.mo32519h(r5, r4, r0)
            android.widget.Button r12 = r10.f22563d
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$c r13 = new com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$c
            r0 = r13
            r1 = r32
            r2 = r30
            r3 = r28
            r4 = r26
            r5 = r15
            r6 = r20
            r7 = r11
            r9 = r22
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.setOnClickListener(r13)
            android.widget.Button r0 = r10.f22564e
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$d r1 = new com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$d
            r3 = r30
            r1.<init>(r15, r11, r3)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r10.f22565f
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$e r1 = new com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI$e
            r1.<init>()
            r0.setOnClickListener(r1)
            di3.d r0 = di3.C86312j.m106911c(r19)
            sp.y r0 = (p237sp.C13754y) r0
            sp.v r0 = r0.Ds0()
            com.tencent.mm.plugin.downloader.model.u r1 = r10.f22562D
            com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
            r0.mo63955a(r1)
            di3.d r0 = di3.C86312j.m106911c(r19)
            sp.y r0 = (p237sp.C13754y) r0
            sp.v r0 = r0.Ds0()
            com.tencent.mm.plugin.downloader.model.u r1 = f22558F
            com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
            r0.mo63955a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewDownloadUI.mo7105N7(te3.q50):void");
    }

    /* renamed from: O7 */
    public final void mo7106O7(boolean z) {
        int i = 0;
        int i2 = 8;
        this.f22563d.setVisibility(z ? 0 : 8);
        this.f22564e.setVisibility(z ? 0 : 8);
        this.f22565f.setVisibility(z ? 0 : 8);
        this.f22566g.setVisibility(z ? 0 : 8);
        this.f22567h.setVisibility(z ? 0 : 8);
        this.f22568i.setVisibility(z ? 0 : 8);
        this.f22569j.setVisibility(z ? 0 : 8);
        ImageView imageView = this.f22570n;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        TextView textView = this.f22571o;
        if (z) {
            i2 = 4;
        }
        textView.setVisibility(i2);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chy;
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo7102K7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22578v = this;
        setMMTitle("");
        setBackBtn(new C6141a());
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        this.f22563d = (Button) findViewById(C0966R.C0970id.c_8);
        this.f22564e = (Button) findViewById(C0966R.C0970id.c9p);
        this.f22565f = (Button) findViewById(C0966R.C0970id.lq4);
        this.f22566g = (TextView) findViewById(C0966R.C0970id.c_7);
        this.f22567h = (TextView) findViewById(C0966R.C0970id.c_n);
        this.f22568i = (TextView) findViewById(C0966R.C0970id.c9v);
        this.f22569j = (ImageView) findViewById(C0966R.C0970id.c_j);
        this.f22570n = (ImageView) findViewById(C0966R.C0970id.c_k);
        this.f22577u = (TextView) findViewById(C0966R.C0970id.c_l);
        this.f22572p = (ProgressBar) findViewById(C0966R.C0970id.g3k);
        this.f22571o = (TextView) findViewById(C0966R.C0970id.f6042vo);
        int intExtra = getIntent().getIntExtra("from_scene", 0);
        this.f22581y = intExtra;
        if (intExtra == 5) {
            String stringExtra = getIntent().getStringExtra("download_app_id");
            this.f22560B = stringExtra;
            if (!Util.isNullOrNil(stringExtra)) {
                String str = this.f22560B;
                this.f22572p.setVisibility(0);
                mo7106O7(false);
                this.f22561C = C10470c.m10400a(str, new C6601v0(this, str));
                return;
            }
            mo7104M7("invalid download app id");
            return;
        }
        mo7105N7((C50916q50) null);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105925i("MicroMsg.WebViewDownloadUI", "onDestroy hasCallback=%b", Boolean.valueOf(this.f22575s));
        if (!this.f22575s) {
            AddDownloadTaskEvent addDownloadTaskEvent = new AddDownloadTaskEvent();
            AddDownloadTaskEvent.C0994a aVar = addDownloadTaskEvent.f9026d;
            aVar.f9028b = true;
            aVar.f9027a = this.f22579w;
            aVar.f9030d = this.f22559A;
            addDownloadTaskEvent.publish();
            this.f22575s = true;
        }
        C10470c.C10471a remove = C10470c.f31704a.remove(Integer.valueOf(this.f22561C));
        if (remove != null) {
            C86709a0.m107529k().f251779b.mo123457c(remove.f31705a.hashCode());
        }
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63969q(this.f22562D);
    }
}

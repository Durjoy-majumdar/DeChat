package com.tencent.p014mm.plugin.webview.fts.p810ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.widget.WebSearchDotPercentIndicator;
import com.tencent.p014mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import h83.C98322b;
import j20.C117292a;
import java.math.BigDecimal;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import org.json.JSONException;
import org.json.JSONObject;
import q83.C101049a;
import q83.C101050b;
import q83.C101051c;
import q83.C101052d;
import q83.C101053e;
import q83.C101054f;
import q83.C101056j;
import q83.C101057k;
import q83.C101058l;
import r83.C47948a;
import r83.C47950c;
import r83.C47951e;
import r83.C47955h;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView */
public class FtsWebVideoView extends RelativeLayout {

    /* renamed from: V */
    public static final /* synthetic */ int f282938V = 0;

    /* renamed from: A */
    public boolean f282939A;

    /* renamed from: B */
    public C96638a f282940B;

    /* renamed from: C */
    public C43559g f282941C;

    /* renamed from: D */
    public boolean f282942D;

    /* renamed from: E */
    public boolean f282943E;

    /* renamed from: F */
    public int f282944F;

    /* renamed from: G */
    public String f282945G;

    /* renamed from: H */
    public C47955h f282946H;

    /* renamed from: I */
    public C47951e.C47952a f282947I;

    /* renamed from: J */
    public boolean f282948J;

    /* renamed from: K */
    public int f282949K;

    /* renamed from: L */
    public boolean f282950L;

    /* renamed from: M */
    public boolean f282951M;

    /* renamed from: N */
    public ImageView f282952N;

    /* renamed from: P */
    public String f282953P;

    /* renamed from: Q */
    public long f282954Q;

    /* renamed from: R */
    public View f282955R;

    /* renamed from: S */
    public View f282956S;

    /* renamed from: T */
    public C96637i f282957T = C96637i.UNKNOWN;

    /* renamed from: U */
    public BroadcastReceiver f282958U = new C96634e();

    /* renamed from: d */
    public C96636h f282959d = C96636h.AUTO;

    /* renamed from: e */
    public FtsVideoWrapper f282960e;

    /* renamed from: f */
    public TextView f282961f;

    /* renamed from: g */
    public WebSearchWebVideoViewControlBar f282962g;

    /* renamed from: h */
    public View f282963h;

    /* renamed from: i */
    public View f282964i;

    /* renamed from: j */
    public LinearLayout f282965j;

    /* renamed from: n */
    public WebSearchDotPercentIndicator f282966n;

    /* renamed from: o */
    public TextView f282967o;

    /* renamed from: p */
    public ImageView f282968p;

    /* renamed from: q */
    public ImageView f282969q;

    /* renamed from: r */
    public ImageView f282970r;

    /* renamed from: s */
    public View f282971s;

    /* renamed from: t */
    public Button f282972t;

    /* renamed from: u */
    public TextView f282973u;

    /* renamed from: v */
    public TextView f282974v;

    /* renamed from: w */
    public String f282975w;

    /* renamed from: x */
    public int f282976x;

    /* renamed from: y */
    public boolean f282977y;

    /* renamed from: z */
    public boolean f282978z;

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$g */
    public interface C43559g {
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$a */
    public class C96630a implements View.OnClickListener {
        public C96630a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FtsWebVideoView.this.mo134754i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$b */
    public class C96631b implements View.OnClickListener {
        public C96631b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FtsWebVideoView.this.mo134753h(!FtsWebVideoView.this.mo134742d());
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$c */
    public class C96632c implements View.OnClickListener {
        public C96632c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FtsWebVideoView ftsWebVideoView = FtsWebVideoView.this;
            if (ftsWebVideoView.f282957T == C96637i.MOBILE_NET) {
                ftsWebVideoView.f282950L = true;
            }
            ftsWebVideoView.mo134762p(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$d */
    public class C96633d implements View.OnClickListener {
        public C96633d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FtsWebVideoView.this.mo134762p(true);
            FtsWebVideoView.this.f282962g.mo134731z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$e */
    public class C96634e extends BroadcastReceiver {
        public C96634e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (FtsWebVideoView.this.f282960e.isPlaying()) {
                FtsWebVideoView.this.mo134740b(context);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$f */
    public class C96635f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f282984d;

        public C96635f(Context context) {
            this.f282984d = context;
        }

        public void run() {
            FtsWebVideoView ftsWebVideoView = FtsWebVideoView.this;
            Context context = this.f282984d;
            int i = FtsWebVideoView.f282938V;
            ftsWebVideoView.f282957T = C96637i.NO_NET;
            ftsWebVideoView.mo134754i();
            ftsWebVideoView.mo134760o(context.getString(C0966R.string.kax), context.getString(C0966R.string.kbc), (String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$h */
    public enum C96636h {
        AUTO,
        LANDSCAPE,
        PORTRAIT
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView$i */
    public enum C96637i {
        UNKNOWN,
        MOBILE_NET,
        NO_NET
    }

    public FtsWebVideoView(Context context, boolean z) {
        super(context);
        setAutoPlay(z);
        mo134741c(context);
    }

    private String getNetUnavailableTip() {
        String str;
        if (this.f282949K == 0) {
            return getContext().getString(C0966R.string.kaz);
        }
        Context context = getContext();
        Object[] objArr = new Object[1];
        long j = (long) this.f282949K;
        if (j < 0) {
            str = "";
        } else {
            BigDecimal bigDecimal = new BigDecimal(j);
            float floatValue = bigDecimal.divide(new BigDecimal(1048576), 2, 0).floatValue();
            if (floatValue > 1.0f) {
                str = ((int) floatValue) + "M";
            } else {
                float floatValue2 = bigDecimal.divide(new BigDecimal(1024), 2, 0).floatValue();
                str = ((int) floatValue2) + "K";
            }
        }
        objArr[0] = str;
        return context.getString(C0966R.string.kay, objArr);
    }

    private int getSystemVolume() {
        return ((AudioManager) getContext().getSystemService("audio")).getStreamVolume(3);
    }

    private void setCover(String str) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(this.f282945G)) {
            Log.m105924i("MicroMsg.FtsWebVideoView", "setCover mCoverUrl not null");
        }
    }

    /* renamed from: a */
    public final void mo134739a(boolean z) {
        C47955h hVar = this.f282946H;
        if (hVar != null) {
            String str = this.f282959d == C96636h.PORTRAIT ? "vertical" : "horizontal";
            int i = this.f282976x;
            hVar.getClass();
            try {
                Log.m105925i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", Integer.valueOf(i), Boolean.valueOf(z), str);
                JSONObject h = hVar.mo72726h();
                h.put("fullScreen", z);
                h.put(TencentLocation.EXTRA_DIRECTION, str);
                hVar.mo72728j(hVar.mo72725g(5, h));
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e);
            }
            mo134757l();
        }
    }

    /* renamed from: b */
    public final boolean mo134740b(Context context) {
        Context context2 = context;
        C96637i iVar = this.f282957T;
        if (!NetStatusUtil.isConnected(context)) {
            C96637i iVar2 = C96637i.NO_NET;
            if (iVar == iVar2) {
                View view = this.f282955R;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f282956S;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f282963h;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                postDelayed(new C96635f(context2), 200);
            } else {
                this.f282957T = iVar2;
                mo134754i();
                mo134760o(context2.getString(C0966R.string.kax), context2.getString(C0966R.string.kbc), (String) null);
            }
            return false;
        } else if (this.f282950L || NetStatusUtil.isWifi(context)) {
            return true;
        } else {
            mo134754i();
            this.f282957T = C96637i.MOBILE_NET;
            this.f282962g.setVisibility(8);
            mo134760o(getNetUnavailableTip(), context2.getString(C0966R.string.k_k), context2.getString(C0966R.string.k_9));
            return false;
        }
    }

    /* renamed from: c */
    public final void mo134741c(Context context) {
        LayoutInflater.from(context).inflate(C0966R.C0971layout.atz, this);
        this.f282960e = (FtsVideoWrapper) findViewById(C0966R.C0970id.l7x);
        this.f282961f = (TextView) findViewById(C0966R.C0970id.i7j);
        this.f282963h = findViewById(C0966R.C0970id.kmc);
        this.f282964i = findViewById(C0966R.C0970id.kn7);
        this.f282965j = (LinearLayout) findViewById(C0966R.C0970id.f5644ko);
        this.f282966n = (WebSearchDotPercentIndicator) findViewById(C0966R.C0970id.f5645kp);
        this.f282967o = (TextView) findViewById(C0966R.C0970id.f5641kl);
        this.f282968p = (ImageView) findViewById(C0966R.C0970id.f5643kn);
        this.f282969q = (ImageView) findViewById(C0966R.C0970id.buo);
        this.f282955R = findViewById(C0966R.C0970id.l6a);
        this.f282956S = findViewById(C0966R.C0970id.kn8);
        this.f282966n.setDotsNum(8);
        this.f282970r = (ImageView) findViewById(C0966R.C0970id.bur);
        this.f282971s = findViewById(C0966R.C0970id.bvd);
        this.f282973u = (TextView) findViewById(C0966R.C0970id.kmd);
        this.f282972t = (Button) findViewById(C0966R.C0970id.kme);
        this.f282974v = (TextView) findViewById(C0966R.C0970id.kmg);
        this.f282952N = (ImageView) findViewById(C0966R.C0970id.cmw);
        this.f282973u.setOnClickListener(new C96630a());
        this.f282952N.setOnClickListener(new C96631b());
        this.f282972t.setOnClickListener(new C96632c());
        this.f282971s.setOnClickListener(new C96633d());
        this.f282940B = new C96638a(getContext(), this, new C96643c(this));
        this.f282960e.setIMMVideoViewCallback(new C96644d(this));
        WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = new WebSearchWebVideoViewControlBar(getContext());
        this.f282962g = webSearchWebVideoViewControlBar;
        webSearchWebVideoViewControlBar.setVisibility(8);
        this.f282962g.setEnterFullScreenBtnClickListener(new C101054f(this));
        this.f282962g.setExitFullScreenBtnClickListener(new C101049a(this));
        this.f282962g.setMuteBtnOnClickListener(new C101050b(this));
        this.f282962g.setIplaySeekCallback(new C101051c(this));
        this.f282962g.setOnPlayButtonClickListener(new C101052d(this));
        this.f282962g.setStatePorter(new C101053e(this));
        this.f282960e.setVideoFooterView(this.f282962g);
        context.registerReceiver(this.f282958U, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        mo134758m();
    }

    /* renamed from: d */
    public boolean mo134742d() {
        C43559g gVar = this.f282941C;
        if (gVar == null) {
            Log.m105928w("MicroMsg.FtsWebVideoView", "isInFullScreen mFullScreenDelegate null");
            return false;
        }
        C47950c cVar = (C47950c) gVar;
        C101058l lVar = cVar.f128637c.f128640c;
        int i = cVar.f128635a;
        return lVar.f295859e == i || lVar.f295858d == i;
    }

    /* renamed from: e */
    public final boolean mo134743e() {
        Log.m105925i("MicroMsg.FtsWebVideoView", "isLive %b %b", Boolean.valueOf(this.f282942D), Boolean.valueOf(this.f282960e.mo129198i()));
        return this.f282942D || this.f282960e.mo129198i();
    }

    /* renamed from: f */
    public void mo134744f() {
        if (!this.f282948J && getSystemVolume() == 0) {
            setMute(true);
        }
    }

    /* renamed from: g */
    public void mo134745g() {
        if (this.f282948J && getSystemVolume() > 0) {
            setMute(false);
        }
    }

    public C47955h getCallback() {
        return this.f282946H;
    }

    public String getCookieData() {
        return this.f282975w;
    }

    public int getCurrPosMs() {
        return this.f282960e.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f282960e.getCurrPosSec();
    }

    public C47951e.C47952a getUiLifecycleListener() {
        return this.f282947I;
    }

    public int getVideoSizeByte() {
        return this.f282949K;
    }

    public int getmVideoPlayerId() {
        return this.f282976x;
    }

    /* renamed from: h */
    public void mo134753h(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "operateFullScreen toFullScreen=%b", Boolean.valueOf(z));
        if (this.f282941C == null) {
            Log.m105928w("MicroMsg.FtsWebVideoView", "operateFullScreen mFullScreenDelegate null");
        } else if (z == mo134742d()) {
            Log.m105924i("MicroMsg.FtsWebVideoView", "operateFullScreen current same");
        } else if (z) {
            C43559g gVar = this.f282941C;
            boolean z2 = this.f282959d != C96636h.PORTRAIT;
            C47950c cVar = (C47950c) gVar;
            C101058l lVar = cVar.f128637c.f128640c;
            int i = cVar.f128635a;
            C47948a aVar = cVar.f128636b;
            lVar.getClass();
            C101056j jVar = new C101056j(lVar, 1000, Boolean.FALSE, i, aVar, z2);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ((Boolean) jVar.exec((MMHandler) null)).booleanValue();
            } else {
                ((Boolean) jVar.exec(lVar.f295856b)).booleanValue();
            }
            WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f282962g;
            webSearchWebVideoViewControlBar.f282907N = true;
            webSearchWebVideoViewControlBar.mo134730y();
            mo134739a(true);
        } else {
            C47950c cVar2 = (C47950c) this.f282941C;
            C101058l lVar2 = cVar2.f128637c.f128640c;
            int i2 = cVar2.f128635a;
            lVar2.getClass();
            C101057k kVar = new C101057k(lVar2, 1000, Boolean.FALSE, i2);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ((Boolean) kVar.exec((MMHandler) null)).booleanValue();
            } else {
                ((Boolean) kVar.exec(lVar2.f295856b)).booleanValue();
            }
            WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar2 = this.f282962g;
            webSearchWebVideoViewControlBar2.f282907N = false;
            webSearchWebVideoViewControlBar2.mo134730y();
        }
    }

    /* renamed from: i */
    public void mo134754i() {
        Log.m105924i("MicroMsg.FtsWebVideoView", "pause");
        mo134758m();
        if (this.f282960e.isPlaying()) {
            this.f282960e.pause();
        }
    }

    /* renamed from: j */
    public void mo134755j(int i, boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "seek to position=%d current=%d isLive=%b", Integer.valueOf(i), Integer.valueOf(this.f282960e.getCurrPosSec()), Boolean.valueOf(this.f282942D));
        if (!mo134743e()) {
            if (z) {
                this.f282960e.mo79613a((double) i, z);
            } else {
                this.f282960e.mo134736d((double) i);
            }
        }
    }

    /* renamed from: k */
    public void mo134756k(String str, String str2) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setCover coverUrl=%s", str);
        if (!Util.isNullOrNil(str)) {
            this.f282945G = str;
            String str3 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(this.f282969q, str, (Drawable) null, (C88394b.C88408j) null);
        }
    }

    /* renamed from: l */
    public final void mo134757l() {
        if (mo134742d()) {
            this.f282952N.setVisibility(0);
        } else {
            this.f282952N.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void mo134758m() {
        View view = this.f282963h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: n */
    public void mo134759n(String str, boolean z, int i) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setVideoPath path=%s isLive=%s", str, Boolean.valueOf(z));
        this.f282953P = str;
        if (Util.isNullOrNil(str)) {
            Log.m105926v("MicroMsg.FtsWebVideoView", "setVideoPath videoPath empty");
            return;
        }
        mo134763q();
        this.f282942D = z;
        this.f282960e.mo76636h(z, str, i);
        WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f282962g;
        if (webSearchWebVideoViewControlBar != null) {
            webSearchWebVideoViewControlBar.setVideoTotalTime(i);
        }
        int i2 = this.f282944F;
        if (i2 > 0) {
            this.f282960e.mo134736d((double) i2);
        }
        if (this.f282977y) {
            Log.m105924i("MicroMsg.FtsWebVideoView", "setVideoPath autoPlay");
            mo134762p(false);
        }
        if (str.startsWith("wxfile://")) {
            setCover(str);
        }
    }

    /* renamed from: o */
    public final void mo134760o(String str, String str2, String str3) {
        mo134758m();
        View view = this.f282955R;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f282956S;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f282962g.setVisibility(8);
        View view4 = this.f282963h;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!TextUtils.isEmpty(str)) {
            this.f282974v.setText(str);
            this.f282974v.setVisibility(0);
        } else {
            this.f282974v.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f282972t.setText(str2);
            this.f282972t.setVisibility(0);
        } else {
            this.f282972t.setVisibility(8);
        }
        View view6 = this.f282964i;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view8 = this.f282971s;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view9 = view8;
        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f282973u.setVisibility(8);
        mo134757l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((r0.f282963h.getVisibility() == 0) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.f282939A
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0036
            boolean r1 = r19.mo134742d()
            if (r1 == 0) goto L_0x000f
            goto L_0x0036
        L_0x000f:
            int r1 = r20.getAction()
            if (r1 != 0) goto L_0x0031
            boolean r1 = r0.f282978z
            if (r1 == 0) goto L_0x0027
            android.view.View r1 = r0.f282963h
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0031
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar r1 = r0.f282962g
            boolean r2 = r0.f282951M
            r1.mo134723B(r2)
        L_0x0031:
            boolean r1 = super.onTouchEvent(r20)
            return r1
        L_0x0036:
            com.tencent.mm.plugin.webview.fts.ui.a r1 = r0.f282940B
            if (r1 == 0) goto L_0x0169
            com.tencent.mm.plugin.webview.fts.ui.a$b r4 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.None
            com.tencent.mm.plugin.webview.fts.ui.a$c r5 = r1.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r5 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r5
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r5 = r5.f283012a
            android.view.View r5 = r5.f282963h
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x004c
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r5 = r5 ^ r2
            if (r5 != 0) goto L_0x0054
            r1.f282996c = r4
            goto L_0x0169
        L_0x0054:
            int r5 = r20.getActionMasked()
            java.lang.String r6 = "audio"
            r7 = 3
            if (r5 != 0) goto L_0x0079
            float r8 = r20.getRawX()
            r1.f283001h = r8
            android.content.Context r8 = r1.f282994a
            java.lang.Object r8 = r8.getSystemService(r6)
            android.media.AudioManager r8 = (android.media.AudioManager) r8
            int r8 = r8.getStreamVolume(r7)
            r1.f283000g = r8
            android.content.Context r8 = r1.f282994a
            float r8 = r83.C89906f.m112429b(r8)
            r1.f282999f = r8
        L_0x0079:
            android.view.GestureDetector r8 = r1.f282997d
            k20.a r15 = new k20.a
            r15.<init>()
            r14 = r20
            r15.mo10233c(r14)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController"
            java.lang.String r12 = "handleTouchEvent"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r16 = "android/view/GestureDetector_EXEC_"
            java.lang.String r17 = "onTouchEvent"
            java.lang.String r18 = "(Landroid/view/MotionEvent;)Z"
            r9 = r8
            r14 = r16
            r7 = r15
            r15 = r17
            r16 = r18
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r3)
            android.view.MotionEvent r7 = (android.view.MotionEvent) r7
            boolean r10 = r8.onTouchEvent(r7)
            java.lang.String r11 = "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController"
            java.lang.String r12 = "handleTouchEvent"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/GestureDetector_EXEC_"
            java.lang.String r15 = "onTouchEvent"
            java.lang.String r16 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r5 == r2) goto L_0x00c0
            r7 = 3
            if (r5 != r7) goto L_0x0169
        L_0x00c0:
            com.tencent.mm.plugin.webview.fts.ui.a$b r5 = r1.f282996c
            com.tencent.mm.plugin.webview.fts.ui.a$b r7 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.FastBackwardOrForward
            r8 = 8
            if (r5 != r7) goto L_0x013c
            com.tencent.mm.plugin.webview.fts.ui.a$c r5 = r1.f282998e
            int r6 = r1.f283003j
            float r7 = r20.getRawX()
            float r9 = r1.f283001h
            float r7 = r7 - r9
            com.tencent.mm.plugin.webview.fts.ui.c r5 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r5
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r9 = r5.f283012a
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar r9 = r9.f282962g
            android.widget.ImageView r9 = r9.f273525i
            r9.setVisibility(r3)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r9 = r5.f283012a
            android.widget.TextView r9 = r9.f282961f
            r9.setVisibility(r8)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r8 = r5.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r8 = r8.f282960e
            int r8 = r8.getCurrPosSec()
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9[r3] = r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r2] = r8
            r8 = 2
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r9[r8] = r7
            java.lang.String r7 = "MicroMsg.FtsWebVideoView"
            java.lang.String r8 = "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r8 = r5.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r8 = r8.f282960e
            boolean r8 = r8.mo129198i()
            if (r8 == 0) goto L_0x011c
            java.lang.String r5 = "onEndDragProgress isLive: no seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x0133
        L_0x011c:
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r7 = r5.f283012a
            r7.mo134755j(r6, r3)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r6 = r5.f283012a
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar r6 = r6.f282962g
            android.widget.ImageView r6 = r6.f273525i
            r6.setVisibility(r3)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r5 = r5.f283012a
            r83.h r5 = r5.f282946H
            if (r5 == 0) goto L_0x0133
            r5.mo72727i()
        L_0x0133:
            r5 = -1
            r1.f283002i = r5
            r1.f283003j = r3
            r3 = 0
            r1.f283001h = r3
            goto L_0x0167
        L_0x013c:
            com.tencent.mm.plugin.webview.fts.ui.a$b r3 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.Volume
            if (r5 != r3) goto L_0x0158
            android.content.Context r3 = r1.f282994a
            java.lang.Object r3 = r3.getSystemService(r6)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r5 = 3
            r3.getStreamMaxVolume(r5)
            com.tencent.mm.plugin.webview.fts.ui.a$c r3 = r1.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r3 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r3
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r3 = r3.f283012a
            android.widget.LinearLayout r3 = r3.f282965j
            r3.setVisibility(r8)
            goto L_0x0167
        L_0x0158:
            com.tencent.mm.plugin.webview.fts.ui.a$b r3 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.Brightness
            if (r5 != r3) goto L_0x0167
            com.tencent.mm.plugin.webview.fts.ui.a$c r3 = r1.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r3 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r3
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r3 = r3.f283012a
            android.widget.LinearLayout r3 = r3.f282965j
            r3.setVisibility(r8)
        L_0x0167:
            r1.f282996c = r4
        L_0x0169:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo134762p(boolean z) {
        Log.m105924i("MicroMsg.FtsWebVideoView", IXWebBroadcastListener.STAGE_START);
        mo134758m();
        if (!z || mo134740b(getContext())) {
            this.f282957T = C96637i.UNKNOWN;
            if (!this.f282960e.isPlaying()) {
                if (this.f282978z) {
                    WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f282962g;
                    if (webSearchWebVideoViewControlBar.f282906M == null) {
                        webSearchWebVideoViewControlBar.f282906M = new MTimerHandler(new C98322b(webSearchWebVideoViewControlBar), true);
                    }
                    webSearchWebVideoViewControlBar.mo134724C();
                    webSearchWebVideoViewControlBar.f282906M.stopTimer();
                    webSearchWebVideoViewControlBar.f282906M.startTimer(500);
                }
                this.f282960e.start();
                if (this.f282954Q == 0) {
                    this.f282954Q = System.currentTimeMillis();
                } else {
                    this.f282954Q = MAlarmHandler.NEXT_FIRE_INTERVAL;
                }
            }
        } else {
            Log.m105924i("MicroMsg.FtsWebVideoView", "start network is not wifi");
        }
    }

    /* renamed from: q */
    public void mo134763q() {
        Log.m105924i("MicroMsg.FtsWebVideoView", "stop");
        if (this.f282960e.isPlaying()) {
            this.f282960e.stop();
            MTimerHandler mTimerHandler = this.f282962g.f282906M;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        }
    }

    public void setAllowMobileNetPlay(boolean z) {
        this.f282950L = z;
    }

    public void setAppId(String str) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setAppId appid=%s", str);
    }

    public void setAutoPlay(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setAutoPlay =%b", Boolean.valueOf(z));
        this.f282977y = z;
    }

    public void setCallback(C47955h hVar) {
        this.f282946H = hVar;
    }

    public void setCookieData(String str) {
        this.f282975w = str;
    }

    public void setDisableScroll(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setDisableScroll isDisableScroll=%b", Boolean.valueOf(z));
    }

    public void setDuration(int i) {
        if (i <= 0) {
            Log.m105925i("MicroMsg.FtsWebVideoView", "setDuration error duration=%d", Integer.valueOf(i));
        }
    }

    public void setFullScreenDelegate(C43559g gVar) {
        this.f282941C = gVar;
    }

    public void setFullScreenDirection(String str) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setFullScreenDirection %s", str);
        if ("horizontal".equalsIgnoreCase(str)) {
            this.f282959d = C96636h.LANDSCAPE;
        } else if ("vertical".equalsIgnoreCase(str)) {
            this.f282959d = C96636h.PORTRAIT;
        } else {
            this.f282959d = C96636h.AUTO;
        }
    }

    public void setInitialTime(int i) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setInitialTime initialTime=%d", Integer.valueOf(i));
        this.f282944F = i;
    }

    public void setIsShowBasicControls(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setIsShowBasicControls isShowBasicControls=%b", Boolean.valueOf(z));
        this.f282978z = z;
    }

    public void setLoop(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setLoop loop=%b", Boolean.valueOf(z));
        this.f282943E = z;
    }

    public void setMute(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setMute isMute=%b", Boolean.valueOf(z));
        this.f282948J = z;
        this.f282960e.setMute(z);
        if (z) {
            this.f282962g.f282899F.setImageResource(C0966R.C0969drawable.c3l);
        } else {
            this.f282962g.f282899F.setImageResource(C0966R.C0969drawable.c3i);
        }
    }

    public void setObjectFit(String str) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setObjectFit objectFit=%s", str);
        if ("fill".equalsIgnoreCase(str)) {
            this.f282960e.setScaleType(C96814a.C96817e.FILL);
            this.f282969q.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            this.f282960e.setScaleType(C96814a.C96817e.COVER);
            this.f282969q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f282960e.setScaleType(C96814a.C96817e.CONTAIN);
            this.f282969q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setPageGesture(boolean z) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "setPageGesture pageGesture=%b", Boolean.valueOf(z));
        this.f282939A = z;
    }

    public void setUiLifecycleListener(C47951e.C47952a aVar) {
        this.f282947I = aVar;
    }

    public void setVideoPlayerId(int i) {
        this.f282976x = i;
    }

    public void setVideoSizeByte(int i) {
        this.f282949K = i;
    }

    public FtsWebVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo134741c(context);
    }

    public FtsWebVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo134741c(context);
    }
}

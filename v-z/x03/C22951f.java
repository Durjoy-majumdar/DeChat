package x03;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryVideoPlayTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.HashMap;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import r03.C22193b;
import t03.C22422f;
import te3.qh4;
import te3.sh4;
import te3.xh4;
import u73.C101987v0;

/* renamed from: x03.f */
public abstract class C22951f extends RelativeLayout {

    /* renamed from: F */
    public static C20937c f65919F;

    /* renamed from: A */
    public C22947b f65920A;

    /* renamed from: B */
    public TextView f65921B;

    /* renamed from: C */
    public C22952a f65922C = C22952a.UNKNOWN;

    /* renamed from: D */
    public String f65923D = "";

    /* renamed from: E */
    public xh4 f65924E;

    /* renamed from: d */
    public FrameLayout f65925d;

    /* renamed from: e */
    public TextView f65926e;

    /* renamed from: f */
    public View f65927f;

    /* renamed from: g */
    public ImageView f65928g;

    /* renamed from: h */
    public TextView f65929h;

    /* renamed from: i */
    public TextView f65930i;

    /* renamed from: j */
    public ImageView f65931j;

    /* renamed from: n */
    public ImageView f65932n;

    /* renamed from: o */
    public Button f65933o;

    /* renamed from: p */
    public TextView f65934p;

    /* renamed from: q */
    public TextView f65935q;

    /* renamed from: r */
    public View f65936r;

    /* renamed from: s */
    public View f65937s;

    /* renamed from: t */
    public View f65938t;

    /* renamed from: u */
    public View f65939u;

    /* renamed from: v */
    public View f65940v;

    /* renamed from: w */
    public FrameLayout f65941w;

    /* renamed from: x */
    public ImageView f65942x;

    /* renamed from: y */
    public ImageView f65943y;

    /* renamed from: z */
    public C22946a f65944z;

    /* renamed from: x03.f$a */
    public enum C22952a {
        UNKNOWN,
        MOBILE_NET,
        NO_NET
    }

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59347c = true;
        f65919F = bVar.mo32666a();
    }

    public C22951f(Context context, C22947b bVar, C22946a aVar) {
        super(context);
        this.f65920A = bVar;
        this.f65944z = aVar;
        mo36140d();
    }

    /* renamed from: a */
    public void mo36137a() {
    }

    /* renamed from: b */
    public C96814a.C96817e mo36138b(xh4 xh4) {
        return C96814a.C96817e.DEFAULT;
    }

    /* renamed from: c */
    public void mo36139c() {
    }

    /* renamed from: d */
    public void mo36140d() {
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.f65925d = (FrameLayout) findViewById(C0966R.C0970id.l7z);
        this.f65926e = (TextView) findViewById(C0966R.C0970id.i86);
        this.f65936r = findViewById(C0966R.C0970id.kn4);
        this.f65937s = findViewById(C0966R.C0970id.l4m);
        this.f65938t = findViewById(C0966R.C0970id.l7p);
        this.f65939u = findViewById(C0966R.C0970id.l4n);
        this.f65940v = findViewById(C0966R.C0970id.f359491l63);
        this.f65927f = findViewById(C0966R.C0970id.l6b);
        this.f65928g = (ImageView) findViewById(C0966R.C0970id.bv8);
        this.f65929h = (TextView) findViewById(C0966R.C0970id.l7f);
        this.f65930i = (TextView) findViewById(C0966R.C0970id.kpm);
        this.f65931j = (ImageView) findViewById(C0966R.C0970id.bur);
        this.f65932n = (ImageView) findViewById(C0966R.C0970id.bus);
        this.f65935q = (TextView) findViewById(C0966R.C0970id.ip6);
        this.f65933o = (Button) findViewById(C0966R.C0970id.kmf);
        this.f65934p = (TextView) findViewById(C0966R.C0970id.kmg);
        this.f65942x = (ImageView) findViewById(C0966R.C0970id.hxg);
        this.f65943y = (ImageView) findViewById(C0966R.C0970id.hxf);
        this.f65941w = (FrameLayout) findViewById(C0966R.C0970id.hxh);
        this.f65921B = (TextView) findViewById(C0966R.C0970id.hax);
    }

    /* renamed from: e */
    public boolean mo36141e() {
        return false;
    }

    /* renamed from: f */
    public void mo36142f(int i) {
        C102532t tVar = this.f65920A.mo24995y5().f66028b;
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "seek to position=%d current=%d", Integer.valueOf(i), Integer.valueOf(tVar != null ? tVar.getCurrPosSec() : 0));
        C102532t tVar2 = this.f65920A.mo24995y5().f66028b;
        if (tVar2 != null) {
            tVar2.mo79629i0(i, true);
        }
        C22193b bVar = this.f65920A.mo24967U2().f66025f;
        if (bVar != null) {
            bVar.f62809f = 1;
        }
    }

    /* renamed from: g */
    public abstract void mo36143g();

    public abstract C102530g getControlBar();

    public C22946a getItemUIComponent() {
        return this.f65944z;
    }

    public abstract int getLayoutId();

    public String getMobileNetTip() {
        if (this.f65924E.f64709J == 0) {
            return getContext().getString(C0966R.string.k4c);
        }
        return getContext().getString(C0966R.string.k4b, new Object[]{Util.getSizeMB(this.f65924E.f64709J, 100.0d)});
    }

    public String getNoNetTip() {
        return getContext().getString(C0966R.string.kax);
    }

    public C22952a getPauseReason() {
        return this.f65922C;
    }

    public abstract C96814a.C57541b getVideoViewCallback();

    public FrameLayout getVideoViewParent() {
        return this.f65925d;
    }

    /* renamed from: h */
    public abstract void mo36152h();

    /* renamed from: i */
    public void mo36153i() {
        this.f65922C = C22952a.MOBILE_NET;
        mo36139c();
        mo36157m(getMobileNetTip(), getContext().getString(C0966R.string.k3q));
    }

    /* renamed from: j */
    public void mo36154j() {
        mo36157m(getNoNetTip(), this.f65920A.mo24990t().getString(C0966R.string.kbc));
        getContext().getString(C0966R.string.k4b, new Object[]{Util.getSizeMB(this.f65924E.f64709J, 100.0d)});
    }

    /* renamed from: k */
    public void mo36155k() {
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setPlayingContainerStatus, pos:%d", Integer.valueOf(this.f65944z.mo36118Z()));
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65928g.setVisibility(8);
        this.f65926e.setVisibility(8);
        View view3 = this.f65936r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65925d.setVisibility(0);
        this.f65925d.setAlpha(1.0f);
    }

    /* renamed from: l */
    public void mo36156l() {
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStopContainerStatus, pos:%d", Integer.valueOf(this.f65944z.mo36118Z()));
        this.f65928g.setVisibility(0);
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65941w.setVisibility(8);
        View view3 = this.f65938t;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f65936r;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f65939u;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65931j.setVisibility(0);
        this.f65932n.setVisibility(8);
        this.f65935q.setVisibility(8);
        this.f65929h.setVisibility(8);
    }

    /* renamed from: m */
    public void mo36157m(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setWarningTipContainerStatus %s %s", str3, str4);
        this.f65928g.setVisibility(0);
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f65938t;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f65936r;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f65939u;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f65940v;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f65927f;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!TextUtils.isEmpty(str)) {
            this.f65934p.setText(str3);
            this.f65934p.setVisibility(0);
        } else {
            this.f65934p.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f65933o.setText(str4);
            this.f65933o.setVisibility(0);
            return;
        }
        this.f65933o.setVisibility(8);
    }

    /* renamed from: n */
    public void mo36158n() {
    }

    /* renamed from: o */
    public void mo36159o() {
    }

    /* renamed from: p */
    public boolean mo36160p(boolean z, boolean z2) {
        int i;
        String p2 = this.f65920A.mo24988p2();
        String str = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : C101987v0.m134275i() ? "wangka" : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? "4g" : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? "3g" : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? "2g" : !NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? "fail" : "";
        int Q5 = this.f65920A.mo24960Q5();
        if (!this.f65920A.mo24973X4().mo36183b()) {
            this.f65922C = C22952a.NO_NET;
            mo36139c();
            mo36157m(getNoNetTip(), getContext().getString(C0966R.string.kbc));
            this.f65920A.mo24995y5().mo36210b(this, mo36138b(this.f65924E));
            return false;
        }
        if (!str.equals("wifi") && !str.equals(p2)) {
            if (str.equals("wangka")) {
                if (!(Q5 == 1 || Q5 == 2)) {
                    this.f65920A.mo24991w6(1);
                    TextView textView = this.f65921B;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f65921B.setAlpha(1.0f);
                        this.f65921B.animate().alpha(0.0f).setDuration(3000).start();
                    } else {
                        C76912y0.makeText((Context) this.f65920A.mo24990t(), (int) C0966R.string.k4d, 0).show();
                    }
                }
            } else if (Q5 != 2) {
                mo36153i();
                this.f65920A.mo24995y5().mo36210b(this, mo36138b(this.f65924E));
                return false;
            }
        }
        this.f65920A.mo24993x2(str);
        this.f65923D = UUID.randomUUID().toString();
        this.f65922C = C22952a.UNKNOWN;
        Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStartPlayContainerStatus");
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f65939u;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f65936r;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65941w.setVisibility(8);
        View view7 = this.f65938t;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f65940v;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view11 = this.f65927f;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        View view12 = view11;
        C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view13 = this.f65927f;
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(0);
        View view14 = view13;
        C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view14, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view15 = this.f65927f;
        C9556a aVar8 = new C9556a();
        aVar8.mo10233c(Float.valueOf(0.0f));
        View view16 = view15;
        C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view15.setAlpha(((Float) aVar8.mo10231a(0)).floatValue());
        C117292a.m165359e(view16, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f65927f.animate().setDuration(4000).setInterpolator(new AccelerateInterpolator()).alpha(1.0f).start();
        this.f65928g.setVisibility(0);
        this.f65926e.setVisibility(8);
        this.f65925d.setVisibility(0);
        this.f65925d.setAlpha(0.0f);
        this.f65920A.mo24995y5().mo36210b(this, mo36138b(this.f65924E));
        C22983u y5 = this.f65920A.mo24995y5();
        C22947b bVar = this.f65920A;
        xh4 xh4 = this.f65924E;
        String str2 = this.f65923D;
        int Z = this.f65944z.mo36118Z();
        y5.getClass();
        HashMap<String, Integer> hashMap = ((C22422f) C86312j.m106911c(C22422f.class)).f63534f;
        if (hashMap.containsKey(xh4.f64729h)) {
            i = hashMap.get(xh4.f64729h).intValue();
        } else {
            hashMap.put(xh4.f64729h, 0);
            i = 0;
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPlay, pos:%s, vid:%s videoProgress: %d", Integer.valueOf(Z), xh4.f64729h, Integer.valueOf(i));
        sh4 sh4 = xh4.f64713N;
        if (sh4 != null) {
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "video %s secondVideoInfo %d %d", xh4.f64729h, Integer.valueOf(sh4.f64608g), Integer.valueOf(xh4.f64713N.f64609h));
        }
        qh4 qh4 = xh4.f64723Y;
        if (qh4 != null) {
            qh4.f64508o = false;
        }
        xh4 xh42 = y5.f66030d;
        if (xh42 != null) {
            if (!xh42.f64706G.equals(xh4.f64706G) || z2) {
                y5.f66028b.stop();
                bVar.mo24967U2().mo36209g(bVar.mo24989r4());
                bVar.mo24967U2().mo36205c();
            }
            return true;
        }
        if (Util.isNullOrNil(xh4.f64726e)) {
            Log.m105921e("MicroMsg.TopStory.TopStoryVideoViewMgr", "start play video url is null %s %s %s", str2, xh4.f64729h, xh4.f64725d);
        } else {
            bVar.mo24967U2().mo36208f(xh4, Z, str2);
            y5.f66036j.mo24967U2().mo36207e(xh4);
            y5.f66028b.setLoop(false);
            y5.f66028b.setVideoInfo(xh4);
            y5.f66028b.setMute(bVar.mo24978b());
            y5.f66028b.setKeepScreenOn(true);
            if (i == 0) {
                C102532t tVar = y5.f66028b;
                tVar.f301893h1 = str2;
                tVar.start();
            } else {
                C102532t tVar2 = y5.f66028b;
                tVar2.f301893h1 = str2;
                tVar2.mo79629i0(i, true);
            }
            ((TopStoryVideoPlayTextureView) y5.f66028b.f283595q).setAlpha(1.0f);
            y5.f66030d = xh4;
            y5.f66031e = true;
            y5.f66032f = false;
        }
        return true;
    }

    /* renamed from: q */
    public void mo36161q() {
    }

    /* renamed from: r */
    public void mo36162r() {
        this.f65928g.setImageDrawable((Drawable) null);
        C20828a.m22825b().mo32519h(this.f65924E.f64727f, this.f65928g, f65919F);
        TextView textView = this.f65921B;
        if (textView != null) {
            textView.animate().cancel();
            this.f65921B.setVisibility(8);
        }
    }

    /* renamed from: s */
    public void mo36163s(xh4 xh4, int i) {
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "updateView position:%s", Integer.valueOf(i));
        this.f65924E = xh4;
        mo36162r();
    }
}

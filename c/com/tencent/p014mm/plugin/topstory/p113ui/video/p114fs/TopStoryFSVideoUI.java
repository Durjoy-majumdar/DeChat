package com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs;

import a13.C16424b;
import a13.C66990c;
import a13.C66993d;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.HaoKanActionEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21913e;
import p03.C21914h;
import p03.C21915i;
import p1042u.C111060j;
import p206nj.C11171e;
import p910lj.C76701a;
import s03.C22291j;
import s03.C77599f;
import t03.C22426h;
import te3.e54;
import te3.nh4;
import te3.oh4;
import te3.uh4;
import te3.xh4;
import u03.C22577a;
import u03.C22578b;
import u73.C101987v0;
import v03.C22713a;
import v03.C52734b;
import v73.C102158a;
import x03.C102531s;
import x03.C102532t;
import x03.C22947b;
import x03.C22949d;
import x03.C22950e;
import x03.C22951f;
import x03.C22953h;
import x03.C22964o;
import x03.C22967p;
import x03.C22974q;
import x03.C22982r;
import x03.C22983u;
import y03.C15922q;
import y03.C15923s;
import y03.C23204j;
import y03.C23207k;
import y03.C23208m;
import y03.C23209n;
import y03.C23210o;
import y03.C23211p;
import y03.C23212r;
import y03.C23213u;
import y03.C23214v;
import y03.C66481b;
import zn0.C91802b;
import zn0.C91803c;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI */
public class TopStoryFSVideoUI extends MMSecDataActivity implements C22947b, C21913e {

    /* renamed from: S */
    public static long f54641S;

    /* renamed from: T */
    public static final /* synthetic */ int f54642T = 0;

    /* renamed from: A */
    public boolean f54643A;

    /* renamed from: B */
    public RecyclerView.C0130p f54644B = new C19369a();

    /* renamed from: C */
    public int f54645C = 0;

    /* renamed from: D */
    public long f54646D = -1;

    /* renamed from: E */
    public long f54647E = -1;

    /* renamed from: F */
    public C22964o f54648F;

    /* renamed from: G */
    public C22982r f54649G;

    /* renamed from: H */
    public C22967p f54650H;

    /* renamed from: I */
    public C22983u f54651I;

    /* renamed from: J */
    public C22974q f54652J;

    /* renamed from: K */
    public Point f54653K;

    /* renamed from: L */
    public int f54654L;

    /* renamed from: M */
    public C16682y f54655M;

    /* renamed from: N */
    public boolean f54656N;

    /* renamed from: P */
    public C66993d f54657P;

    /* renamed from: Q */
    public boolean f54658Q;

    /* renamed from: R */
    public C11385n f54659R = new C19371e();

    /* renamed from: d */
    public View f54660d;

    /* renamed from: e */
    public View f54661e;

    /* renamed from: f */
    public ImageView f54662f;

    /* renamed from: g */
    public View f54663g;

    /* renamed from: h */
    public ImageButton f54664h;

    /* renamed from: i */
    public uh4 f54665i;

    /* renamed from: j */
    public RecyclerView f54666j;

    /* renamed from: n */
    public LinearLayoutManager f54667n;

    /* renamed from: o */
    public C23214v f54668o;

    /* renamed from: p */
    public C23213u f54669p;

    /* renamed from: q */
    public ProgressDialog f54670q;

    /* renamed from: r */
    public View f54671r;

    /* renamed from: s */
    public View f54672s;

    /* renamed from: t */
    public View f54673t;

    /* renamed from: u */
    public View f54674u;

    /* renamed from: v */
    public C66990c f54675v;

    /* renamed from: w */
    public View f54676w;

    /* renamed from: x */
    public TopStoryCommentFloatDialog f54677x;

    /* renamed from: y */
    public C22577a f54678y;

    /* renamed from: z */
    public C22713a f54679z;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$c */
    public class C5654c implements Runnable {
        public C5654c() {
        }

        public void run() {
            View view = TopStoryFSVideoUI.this.f54672s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = TopStoryFSVideoUI.this.f54671r;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TopStoryFSVideoUI.this.f54666j.smoothScrollBy(0, 3);
            ProgressDialog progressDialog = TopStoryFSVideoUI.this.f54670q;
            if (progressDialog != null) {
                progressDialog.dismiss();
                TopStoryFSVideoUI.this.f54670q = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$d */
    public class C5655d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f21616d;

        public C5655d(String str) {
            this.f21616d = str;
        }

        public void run() {
            View view = TopStoryFSVideoUI.this.f54672s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = TopStoryFSVideoUI.this.f54671r;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ProgressDialog progressDialog = TopStoryFSVideoUI.this.f54670q;
            if (progressDialog != null) {
                progressDialog.dismiss();
                TopStoryFSVideoUI.this.f54670q = null;
            }
            TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
            String str = this.f21616d;
            topStoryFSVideoUI.getClass();
            if (!NetStatusUtil.isNetworkConnected(topStoryFSVideoUI)) {
                C76701a.makeText((Context) topStoryFSVideoUI, (CharSequence) topStoryFSVideoUI.getString(C0966R.string.ht6), 1).show();
            } else if (!Util.isNullOrNil(str)) {
                C76701a.makeText((Context) topStoryFSVideoUI, (CharSequence) str, 1).show();
            } else {
                C76701a.makeText((Context) topStoryFSVideoUI, (CharSequence) topStoryFSVideoUI.getString(C0966R.string.ht7), 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$h */
    public class C5656h implements Runnable {
        public C5656h() {
        }

        public void run() {
            if (TopStoryFSVideoUI.this.f54674u.getVisibility() == 0) {
                View view = TopStoryFSVideoUI.this.f54674u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$a */
    public class C19369a extends RecyclerView.C0130p {
        public C19369a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            if (i == 0) {
                TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
                topStoryFSVideoUI.f54669p.mo36129c(topStoryFSVideoUI);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            if (i2 == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
            topStoryFSVideoUI.f54669p.mo36128b(topStoryFSVideoUI);
            topStoryFSVideoUI.f54645C = topStoryFSVideoUI.f54667n.mo16959E();
            int itemCount = topStoryFSVideoUI.f54667n.getItemCount();
            long j = topStoryFSVideoUI.f54646D;
            if (j <= 0 || Util.ticksToNow(j) >= 50) {
                topStoryFSVideoUI.f54646D = Util.currentTicks();
                C22974q qVar = topStoryFSVideoUI.f54652J;
                boolean z = true;
                boolean z2 = qVar.f66001c == 1 ? !(itemCount - topStoryFSVideoUI.f54645C > 3 || qVar.f66000b || Util.ticksToNow(topStoryFSVideoUI.f54647E) < 50) : !(topStoryFSVideoUI.f54645C < itemCount - 1 || qVar.f66000b || Util.ticksToNow(topStoryFSVideoUI.f54647E) < 50);
                uh4 uh4 = topStoryFSVideoUI.f54665i;
                if (uh4.f64642i == 36 || uh4.f64636A) {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
                if (z2) {
                    View view = topStoryFSVideoUI.f54672s;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = topStoryFSVideoUI.f54671r;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C22974q qVar2 = topStoryFSVideoUI.f54652J;
                    qVar2.mo36197p(qVar2.mo36194e());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$b */
    public class C19370b implements C66993d.C66998e {

        /* renamed from: a */
        public final /* synthetic */ View f54681a;

        /* renamed from: b */
        public final /* synthetic */ int f54682b;

        public C19370b(View view, int i) {
            this.f54681a = view;
            this.f54682b = i;
        }

        /* renamed from: a */
        public void mo25000a(xh4 xh4) {
        }

        /* renamed from: b */
        public void mo25001b(xh4 xh4) {
            C102531s sVar = C102531s.f301890b;
            TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
            topStoryFSVideoUI.getClass();
            sVar.mo142142a(topStoryFSVideoUI, TopStoryFSVideoUI.this.f54665i, xh4);
            TopStoryFSVideoUI.this.f54657P.dismiss();
        }

        /* renamed from: c */
        public void mo25002c(xh4 xh4) {
            if (xh4.f64718T != null) {
                TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
                View view = this.f54681a;
                int i = this.f54682b;
                topStoryFSVideoUI.f54658Q = true;
                xh4 d = topStoryFSVideoUI.f54652J.mo36193d(i);
                new C16424b(topStoryFSVideoUI.getContext(), d, new C23208m(topStoryFSVideoUI, d, i)).mo14882c(view, true, 0, C76577a.m92151b(topStoryFSVideoUI.getContext(), 16));
                try {
                    ((C23204j) topStoryFSVideoUI.f54651I.f66029c.getControlBar()).mo36652B();
                } catch (Exception unused) {
                }
            }
            TopStoryFSVideoUI.this.f54657P.dismiss();
        }

        public void onDismiss() {
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoUI", "more popupWindow dismiss");
            TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
            if (topStoryFSVideoUI.f54656N) {
                topStoryFSVideoUI.f54656N = false;
                if (!topStoryFSVideoUI.f54658Q) {
                    topStoryFSVideoUI.f54651I.mo36219k();
                    try {
                        ((C23204j) TopStoryFSVideoUI.this.f54651I.f66029c.getControlBar()).mo36651A();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$e */
    public class C19371e implements C11385n {

        /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$e$a */
        public class C19372a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22291j f54685d;

            public C19372a(C22291j jVar) {
                this.f54685d = jVar;
            }

            public void run() {
                C22953h u5 = TopStoryFSVideoUI.this.f54668o.mo36135u5(this.f54685d.f63198g);
                if (u5 != null && (u5 instanceof C23207k)) {
                    ((C23204j) u5.mo36172y().getControlBar()).mo36654D(this.f54685d.f63198g);
                }
            }
        }

        public C19371e() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2;
            C22291j jVar = (C22291j) yVar;
            nh4 nh4 = (nh4) jVar.f63196e.f127055a.f127080a;
            if (i == 0 && i2 == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("docId", nh4.f64318d);
                    jSONObject.put("opType", "LIKE");
                    jSONObject.put("isLike", nh4.f64320f == 4);
                } catch (JSONException unused) {
                }
                xh4 xh4 = jVar.f63198g;
                if (xh4 != null) {
                    boolean z = nh4.f64320f == 4;
                    xh4.f64716R = z;
                    Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd succ, thumb: %s count: %s", Boolean.valueOf(z), Integer.valueOf(jVar.f63198g.f64722X));
                }
                View view = null;
                if (nh4.f64320f == 4) {
                    C22953h u5 = TopStoryFSVideoUI.this.f54668o.mo36135u5(jVar.f63198g);
                    xh4 xh42 = TopStoryFSVideoUI.this.f54651I.f66030d;
                    if (xh42 != null && (str2 = xh42.f64729h) != null && str2.equals(jVar.f63198g.f64729h) && (u5 instanceof C23207k)) {
                        view = u5.mo36173z();
                    }
                    if (view != null) {
                        TopStoryFSVideoUI.this.mo25012K7(jVar.f63198g, view, true);
                        if (u5 instanceof C23207k) {
                            u5.mo36172y().getControlBar().mo36668z();
                        }
                    }
                } else {
                    if (((oh4) jVar.f63196e.f127056b.f127083a).f139187e) {
                        TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
                        C76879j.m92748s(topStoryFSVideoUI, topStoryFSVideoUI.getString(C0966R.string.f361472k52), "");
                    } else {
                        C76912y0.makeText((Context) TopStoryFSVideoUI.this.getContext(), (int) C0966R.string.f361473k53, 0).show();
                    }
                    TopStoryFSVideoUI.this.mo25012K7(jVar.f63198g, (View) null, false);
                }
                HaoKanActionEvent haoKanActionEvent = new HaoKanActionEvent();
                haoKanActionEvent.f9314d.f9315a = jSONObject.toString();
                haoKanActionEvent.f9314d.f9316b = "";
                haoKanActionEvent.publish();
            } else {
                Log.m105929w("MicroMsg.TopStory.TopStoryFSVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                C76912y0.makeText((Context) TopStoryFSVideoUI.this.getContext(), (CharSequence) TopStoryFSVideoUI.this.getString(C0966R.string.k47), 0).show();
                xh4 xh43 = jVar.f63198g;
                if (xh43 != null) {
                    xh43.f64716R = !xh43.f64716R;
                    Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd error, thumb:" + jVar.f63198g.f64716R);
                }
            }
            TopStoryFSVideoUI.this.runOnUiThread(new C19372a(jVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$f */
    public class C19373f implements Runnable {
        public C19373f() {
        }

        public void run() {
            C23214v vVar = TopStoryFSVideoUI.this.f54668o;
            int G4 = vVar.mo36132G4();
            int itemCount = vVar.getItemCount();
            C111060j<View> jVar = vVar.f65916e;
            int i = jVar.f332588g;
            Object[] objArr = jVar.f332587f;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            jVar.f332588g = 0;
            jVar.f332585d = false;
            vVar.notifyItemRangeRemoved(itemCount - G4, G4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$g */
    public class C19374g implements C66990c.C66992b {

        /* renamed from: a */
        public final /* synthetic */ xh4 f54688a;

        /* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI$g$a */
        public class C19375a implements TopStoryCommentFloatDialog.C71559h {
            public C19375a() {
            }

            /* renamed from: a */
            public void mo25022a() {
                View view = TopStoryFSVideoUI.this.f54674u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$18$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$18$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }

            public void onDismiss() {
                TopStoryFSVideoUI.this.f54651I.mo36219k();
                View decorView = TopStoryFSVideoUI.this.getWindow().getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096 | 4);
            }
        }

        public C19374g(xh4 xh4) {
            this.f54688a = xh4;
        }

        /* renamed from: a */
        public void mo25021a(C77599f fVar) {
            TopStoryFSVideoUI topStoryFSVideoUI = TopStoryFSVideoUI.this;
            topStoryFSVideoUI.f54677x.mo98674e(fVar, new C19375a(), (int) topStoryFSVideoUI.f54665i.f64641h, this.f54688a.f64700A);
            if (TopStoryFSVideoUI.this.f54651I.mo36212d()) {
                TopStoryFSVideoUI.this.f54651I.mo36216h();
            }
        }
    }

    /* renamed from: A */
    public void mo24943A() {
        this.f54660d.animate().cancel();
        View view = this.f54660d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: C1 */
    public C16682y mo24944C1() {
        return this.f54655M;
    }

    /* renamed from: C5 */
    public void mo24945C5() {
        runOnUiThread(new C19373f());
    }

    /* renamed from: C6 */
    public C22974q mo24946C6() {
        return this.f54652J;
    }

    /* renamed from: G6 */
    public Point mo24947G6() {
        if (this.f54653K == null) {
            this.f54653K = C85875k4.m106184h(this);
        }
        return this.f54653K;
    }

    /* renamed from: H7 */
    public final void mo25009H7() {
        View view = this.f54672s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f54671r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f54652J.mo36197p(0);
    }

    /* renamed from: I7 */
    public final int mo25010I7() {
        return ((AudioManager) getContext().getSystemService("audio")).getStreamVolume(3);
    }

    /* renamed from: J7 */
    public final void mo25011J7() {
        getWindow().setFlags(201327616, 201327616);
        View decorView = getWindow().getDecorView();
        if (C11171e.m11044a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4102);
        }
        getWindow().addFlags(128);
    }

    /* renamed from: K0 */
    public C22950e mo24951K0() {
        return this.f54668o;
    }

    /* renamed from: K6 */
    public boolean mo24952K6() {
        return this.f54665i.f64642i != 326;
    }

    /* renamed from: K7 */
    public void mo25012K7(xh4 xh4, View view, boolean z) {
        C66990c cVar;
        String str;
        xh4 xh42 = xh4;
        Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", xh42.f64729h, Boolean.valueOf(z));
        if (z) {
            String str2 = "" + System.currentTimeMillis();
            String str3 = xh42.f64706G;
            String str4 = xh42.f64725d;
            uh4 uh4 = this.f54665i;
            C77599f fVar = new C77599f(str2, str3, "", "", "", "", str4, uh4.f64643j, uh4.f64642i, mo24970W3() ? C91802b.CTRL_INDEX : C91803c.CTRL_INDEX, xh42.f64729h, xh42.f64717S, 1);
            View view2 = this.f54674u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f54675v = new C66990c(this, this.f54676w, new C19374g(xh42), fVar, xh42.f64729h);
            this.f54674u.postDelayed(new C5656h(), 2000);
            this.f54675v.mo90955a(view, true, 0, 0);
        } else if (this.f54674u.getVisibility() == 0 && (cVar = this.f54675v) != null && (str = cVar.f192459f) != null && str.equals(xh42.f64729h)) {
            View view4 = this.f54674u;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: L7 */
    public final void mo25013L7() {
        if (this.f54665i.f64654x) {
            this.f54662f.setBackgroundResource(C0966R.raw.top_story_volume_off);
        } else {
            this.f54662f.setBackgroundResource(C0966R.raw.top_story_volume_on);
        }
        C22983u uVar = this.f54651I;
        if (uVar.f66031e) {
            uVar.mo36220l(this.f54665i.f64654x);
        }
    }

    /* renamed from: M */
    public void mo24955M(int i, int i2) {
        if ((i2 == 2 || i2 == 1) && this.f54643A) {
            mo25009H7();
        }
        this.f54651I.mo36213e(i, i2);
    }

    /* renamed from: O4 */
    public int mo25014O4() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_topstory_v_video_play, 0);
    }

    /* renamed from: Q5 */
    public int mo24960Q5() {
        return this.f54665i.f64656z;
    }

    /* renamed from: R1 */
    public void mo24962R1() {
        mo25011J7();
    }

    /* renamed from: S2 */
    public int mo24964S2() {
        return 0;
    }

    /* renamed from: U2 */
    public C22982r mo24967U2() {
        return this.f54649G;
    }

    /* renamed from: W3 */
    public boolean mo24970W3() {
        return this.f54665i.f64641h == 100203;
    }

    /* renamed from: X3 */
    public RecyclerView.LayoutManager mo24972X3() {
        return this.f54667n;
    }

    /* renamed from: X4 */
    public C22964o mo24973X4() {
        return this.f54648F;
    }

    /* renamed from: Y */
    public void mo24974Y() {
        this.f54660d.animate().alpha(0.0f).setDuration(200).setStartDelay(1800);
        View view = this.f54674u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: Z2 */
    public String mo24975Z2() {
        return C21914h.m25161i(this.f54665i.f64648r);
    }

    /* renamed from: a3 */
    public void mo24976a3(int i, String str) {
        MMHandlerThread.postToMainThread(new C5655d(str));
    }

    /* renamed from: a6 */
    public void mo25015a6(xh4 xh4, C22951f fVar, int i, int i2) {
    }

    /* renamed from: a7 */
    public void mo24977a7(xh4 xh4) {
        C22713a aVar = this.f54679z;
        if (aVar != null) {
            aVar.mo35810Z(this.f54665i, xh4);
        }
        C22577a aVar2 = this.f54678y;
        if (aVar2 != null) {
            aVar2.mo35649D0(this.f54665i, xh4);
        }
    }

    /* renamed from: b */
    public boolean mo24978b() {
        return this.f54665i.f64654x;
    }

    /* renamed from: d1 */
    public boolean mo24979d1() {
        return false;
    }

    /* renamed from: d4 */
    public boolean mo24980d4() {
        return this.f54665i.f64642i != 36;
    }

    /* renamed from: e2 */
    public int mo24981e2() {
        return this.f54665i.f64652v;
    }

    public int getForceOrientation() {
        return mo24970W3() ? 1 : 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ca8;
    }

    public RecyclerView getRecyclerView() {
        return this.f54666j;
    }

    public int getVideoHeight() {
        if (this.f54654L == 0) {
            if (!mo24970W3()) {
                this.f54654L = (getVideoWidth() * 280) / C83031z.CTRL_INDEX;
            } else {
                this.f54654L = 1280;
                int i = (mo24947G6().y * 3) / 5;
                if (this.f54654L > i) {
                    this.f54654L = i;
                }
                Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "getVideoHeight %d maxVideoHeight %d", Integer.valueOf(this.f54654L), Integer.valueOf(i));
            }
        }
        return this.f54654L;
    }

    public int getVideoWidth() {
        return Math.min(mo24947G6().x, mo24947G6().y);
    }

    /* renamed from: h7 */
    public void mo24985h7(xh4 xh4, View view) {
        if (xh4 == null) {
            return;
        }
        if (!NetStatusUtil.isConnected((Context) this)) {
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.k47), 0).show();
            return;
        }
        String str = xh4.f64706G;
        int i = xh4.f64716R ? 5 : 4;
        String str2 = "" + System.currentTimeMillis();
        uh4 uh4 = this.f54665i;
        C86709a0.m107524d().mo123460f(new C22291j(xh4, str, i, str2, uh4.f64642i, uh4.f64643j, mo24970W3() ? C91802b.CTRL_INDEX : C91803c.CTRL_INDEX, xh4.f64729h, xh4.f64717S, 1));
        boolean z = !xh4.f64716R;
        xh4.f64716R = z;
        if (z) {
            xh4.f64722X++;
        } else {
            xh4.f64722X--;
        }
        ((TextView) view.findViewById(C0966R.C0970id.lrh)).setText(C22426h.m26105g(xh4.f64722X));
        Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoUI", "onWowBtnClick thumb:" + xh4.f64716R);
    }

    /* renamed from: i6 */
    public void mo25016i6(xh4 xh4, C22951f fVar, int i, int i2) {
    }

    /* renamed from: j1 */
    public boolean mo25017j1(int i) {
        int i2 = i;
        View view = this.f54674u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo %d", Integer.valueOf(i));
        try {
            if (i2 >= (this.f54668o.getItemCount() - this.f54668o.mo36132G4()) - this.f54668o.mo36133O4()) {
                return false;
            }
            RecyclerView recyclerView = this.f54666j;
            int O4 = i2 + this.f54668o.mo36133O4();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Integer.valueOf(O4));
            C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            return true;
        } catch (Exception e) {
            Log.m105929w("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo Exception:%s", e.getMessage());
            return false;
        }
    }

    /* renamed from: m5 */
    public void mo24986m5(List<xh4> list, boolean z) {
        this.f54668o.mo36131F4(list, z);
        MMHandlerThread.postToMainThreadDelayed(new C5654c(), 50);
    }

    /* renamed from: n3 */
    public C22967p mo24987n3() {
        return this.f54650H;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C22953h a;
        C102531s.f301890b.mo142143b(this, i, i2, intent);
        if (i == 10001) {
            boolean z = true;
            if (this.f54648F.f65984c != 1) {
                z = false;
            }
            if ((z || C101987v0.m134275i()) && (a = C22949d.m27076a(this)) != null) {
                a.mo36171I(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 28) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        uh4 uh4 = new uh4();
        this.f54665i = uh4;
        try {
            uh4.parseFrom(byteArrayExtra);
        } catch (Exception unused) {
            finish();
        }
        C22974q qVar = new C22974q();
        this.f54652J = qVar;
        qVar.f65999a = this;
        C22967p pVar = new C22967p();
        this.f54650H = pVar;
        pVar.mo36187c(this);
        C22982r rVar = new C22982r();
        this.f54649G = rVar;
        rVar.f66022c++;
        rVar.f66021b = this;
        C22983u uVar = new C22983u();
        this.f54651I = uVar;
        uVar.f66027a++;
        uVar.f66036j = this;
        this.f54648F = new C22964o();
        this.f54669p = new C23213u();
        xh4 xh4 = this.f54665i.f64645o;
        if (xh4 != null) {
            C22974q qVar2 = this.f54652J;
            synchronized (qVar2) {
                ((LinkedList) qVar2.mo36192b()).add(xh4);
            }
        }
        C22577a aVar = new C22577a(new C22578b(this));
        this.f54678y = aVar;
        aVar.mo35648A(8, this.f54665i.f64648r);
        this.f54678y.mo67998q0(getResources().getString(C0966R.string.f361469k43));
        C22713a aVar2 = new C22713a(new C52734b(this));
        this.f54679z = aVar2;
        aVar2.mo35809D(8, this.f54665i.f64648r);
        this.f54679z.mo160077O(getResources().getString(C0966R.string.f361469k43));
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91112w(new ColorDrawable(0));
            getSupportActionBar().mo91104o();
        }
        if (this.f54665i.f64650t) {
            this.f54648F.f65982a = true;
        }
        mo25011J7();
        this.f54660d = findViewById(C0966R.C0970id.kof);
        this.f54661e = findViewById(C0966R.C0970id.h7j);
        this.f54663g = findViewById(C0966R.C0970id.gzc);
        this.f54662f = (ImageView) findViewById(C0966R.C0970id.h7m);
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.f357484a32);
        this.f54664h = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(C0966R.color.f2975b6), PorterDuff.Mode.SRC_ATOP);
        this.f54664h.setOnClickListener(new C23209n(this));
        this.f54661e.setOnClickListener(new C23210o(this));
        View view = this.f54661e;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f54673t = findViewById(C0966R.C0970id.eg4);
        Button button = (Button) findViewById(C0966R.C0970id.j47);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.l7_);
        this.f54666j = recyclerView;
        recyclerView.mo17043c(this.f54644B);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f54667n = linearLayoutManager;
        this.f54666j.setLayoutManager(linearLayoutManager);
        this.f54655M = new C16681x(this.f54667n);
        C23214v vVar = new C23214v(this);
        this.f54668o = vVar;
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.caj, (ViewGroup) null);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f54672s = inflate.findViewById(C0966R.C0970id.ed_);
        this.f54671r = inflate.findViewById(C0966R.C0970id.edd);
        C111060j<View> jVar = vVar.f65916e;
        jVar.mo162807g(jVar.mo162808h() + 200000, inflate);
        this.f54666j.setAdapter(this.f54668o);
        new C66481b().mo74459b(this.f54666j);
        uh4 uh42 = this.f54665i;
        if (!(uh42.f64642i != 36 && !uh42.f64636A)) {
            View view3 = this.f54672s;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f54671r;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(4);
            View view6 = view5;
            C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f54648F.mo36183b()) {
            mo25009H7();
            this.f54643A = false;
            uh4 uh43 = this.f54665i;
            if (uh43.f64642i != 21 && uh43.f64646p == null) {
                this.f54670q = C76879j.m92723Q(this, "", getString(C0966R.string.gas), true, true, new C23211p(this));
            }
        } else {
            C76701a.makeText((Context) this, (int) C0966R.string.ht8, 1).show();
            this.f54643A = true;
        }
        this.f54668o.f66647i = true;
        View view7 = this.f54673t;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f54648F.f65984c != 2) {
            z = false;
        }
        if (z && C101987v0.m134275i() && System.currentTimeMillis() - f54641S > 86400000) {
            C76701a.makeText((Context) this, (int) C0966R.string.k4d, 0).show();
            f54641S = System.currentTimeMillis();
        }
        this.f54674u = findViewById(C0966R.C0970id.c6s);
        this.f54676w = findViewById(C0966R.C0970id.c6t);
        View view9 = this.f54674u;
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f54674u.setOnTouchListener(new C15922q(this));
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = (TopStoryCommentFloatDialog) findViewById(C0966R.C0970id.bjn);
        this.f54677x = topStoryCommentFloatDialog;
        topStoryCommentFloatDialog.setVisibility(8);
        this.f54677x.mo98673d(this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C23212r(this));
        if (mo24970W3()) {
            this.f54664h.setImageResource(C0966R.raw.top_story_close_icon);
            if (C85875k4.m106205t(this, false)) {
                int o = C85875k4.m106198o(this);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54660d.getLayoutParams();
                layoutParams.topMargin = o + C76577a.m92151b(this, 12);
                this.f54660d.setLayoutParams(layoutParams);
            }
        }
        this.f54663g.setOnClickListener(new C15923s(this));
        C86709a0.m107524d().mo123455a(2802, this.f54659R);
    }

    public void onDestroy() {
        C21915i.m25175g(this.f54665i, getActivityBrowseTimeMs(), this.f54652J.mo36193d(this.f54665i.f64652v));
        C86709a0.m107524d().mo123470p(2802, this.f54659R);
        this.f54652J.mo36195i();
        ((C21912d) C86312j.m106911c(C21912d.class)).Ue0(this.f54665i);
        this.f54651I.mo36214f();
        C22964o oVar = this.f54648F;
        oVar.getClass();
        C86709a0.m107529k().mo121129d(oVar.f65985d);
        oVar.f65983b = null;
        oVar.f65984c = 0;
        oVar.f65982a = false;
        this.f54649G.mo36204b();
        this.f54650H.mo36188d();
        this.f54677x.f207338h.mo104021d();
        C102158a.m134600a(16);
        C22577a aVar = this.f54678y;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4 && this.f54677x.getVisibility() == 0) {
            this.f54677x.mo98671b();
            return true;
        }
        if (i == 25 && keyEvent.getAction() == 0) {
            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", Integer.valueOf(mo25010I7()));
            uh4 uh4 = this.f54665i;
            if (mo25010I7() > 1) {
                z = false;
            }
            uh4.f64654x = z;
            mo25013L7();
        } else if (i == 24 && keyEvent.getAction() == 0) {
            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", Integer.valueOf(mo25010I7()));
            this.f54665i.f64654x = false;
            mo25013L7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        C102532t tVar = this.f54651I.f66028b;
        if (tVar != null) {
            tVar.mo79614b();
        }
        ((C21912d) C86312j.m106911c(C21912d.class)).mo34962U6();
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f54677x;
        topStoryCommentFloatDialog.f207338h.f220015b = null;
        C86709a0.m107524d().mo123470p(2906, topStoryCommentFloatDialog);
        C102158a.m134600a(15);
        C22713a aVar = this.f54679z;
        if (aVar != null) {
            aVar.mo74189F();
        }
        C22577a aVar2 = this.f54678y;
        if (aVar2 != null) {
            aVar2.mo64001C();
        }
    }

    public void onResume() {
        super.onResume();
        mo25011J7();
        mo25013L7();
        ((C21912d) C86312j.m106911c(C21912d.class)).Ne0();
        C22983u uVar = this.f54651I;
        C102532t tVar = uVar.f66028b;
        if (tVar != null) {
            tVar.mo79617f();
            C22951f fVar = uVar.f66029c;
            if (fVar != null) {
                fVar.mo36139c();
            }
        }
        C22964o oVar = this.f54648F;
        oVar.f65984c = oVar.mo36182a();
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f54677x;
        topStoryCommentFloatDialog.f207338h.f220015b = topStoryCommentFloatDialog;
        C86709a0.m107524d().mo123455a(2906, topStoryCommentFloatDialog);
        C102158a.m134600a(14);
        C22713a aVar = this.f54679z;
        if (aVar != null) {
            aVar.mo74188E();
        }
        C22577a aVar2 = this.f54678y;
        if (aVar2 != null) {
            aVar2.mo64003o();
        }
    }

    /* renamed from: p2 */
    public String mo24988p2() {
        String str = this.f54665i.f64655y;
        return str == null ? "" : str;
    }

    /* renamed from: p5 */
    public void mo25018p5(int i, e54 e54) {
    }

    /* renamed from: r4 */
    public uh4 mo24989r4() {
        return this.f54665i;
    }

    /* renamed from: t */
    public MMActivity mo24990t() {
        return this;
    }

    /* renamed from: w6 */
    public void mo24991w6(int i) {
        this.f54665i.f64656z = i;
    }

    /* renamed from: x1 */
    public void mo24992x1(int i) {
        this.f54665i.f64652v = i;
    }

    /* renamed from: x2 */
    public void mo24993x2(String str) {
        this.f54665i.f64655y = str;
    }

    /* renamed from: x5 */
    public void mo24994x5(View view, int i) {
        if (this.f54651I.mo36212d()) {
            this.f54651I.mo36216h();
            this.f54656N = true;
        }
        C66993d dVar = new C66993d(getContext(), this.f54652J.mo36193d(i), new C19370b(view, i));
        this.f54657P = dVar;
        dVar.mo90957c(view, true, 0, 0);
        try {
            ((C23204j) this.f54651I.f66029c.getControlBar()).mo36652B();
        } catch (Exception unused) {
        }
    }

    /* renamed from: y5 */
    public C22983u mo24995y5() {
        return this.f54651I;
    }
}

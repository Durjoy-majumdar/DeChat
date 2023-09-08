package y03;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import dl0.C86342c;
import f83.C86779c;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76630x0;
import o03.C21724i;
import p03.C21912d;
import p03.C21915i;
import p03.C47419f;
import qo3.C47883u;
import qo3.C77426q;
import r03.C22193b;
import te3.e54;
import te3.ph4;
import te3.qh4;
import te3.uh4;
import te3.xh4;
import te3.zh4;
import u73.C101987v0;
import v73.C102158a;
import v73.C102159b;
import x03.C102532t;
import x03.C22946a;
import x03.C22947b;
import x03.C22948c;
import x03.C22951f;
import x03.C22953h;
import x03.C22960m;
import x03.C22974q;
import x03.C22983u;

/* renamed from: y03.e */
public class C23184e extends C22951f {

    /* renamed from: V */
    public static final /* synthetic */ int f66578V = 0;

    /* renamed from: G */
    public C23204j f66579G;

    /* renamed from: H */
    public C22960m f66580H;

    /* renamed from: I */
    public View.OnClickListener f66581I;

    /* renamed from: J */
    public View.OnClickListener f66582J;

    /* renamed from: K */
    public View.OnClickListener f66583K;

    /* renamed from: L */
    public View.OnClickListener f66584L;

    /* renamed from: M */
    public View.OnClickListener f66585M;

    /* renamed from: N */
    public boolean f66586N;

    /* renamed from: P */
    public View f66587P;

    /* renamed from: Q */
    public TextView f66588Q;

    /* renamed from: R */
    public TextView f66589R;

    /* renamed from: S */
    public ImageView f66590S;

    /* renamed from: T */
    public ImageView f66591T;

    /* renamed from: U */
    public C96814a.C57541b f66592U = new C23189d();

    /* renamed from: y03.e$a */
    public class C23185a implements View.OnClickListener {
        public C23185a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!(C23184e.this.getFSItemUIComponent() == null || C23184e.this.getFSItemUIComponent().mo36118Z() == C23184e.this.getFSVideoUIComponent().mo24981e2())) {
                C23184e.this.getFSVideoUIComponent().mo24967U2().f66023d = 2;
                C23184e.this.getFSVideoUIComponent().mo25017j1(C23184e.this.f65944z.mo36118Z());
                C23184e.this.getFSVideoUIComponent().mo24967U2().mo36206d(C23184e.this.f65924E);
                C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
                uh4 r4 = C23184e.this.getFSVideoUIComponent().mo24989r4();
                C23184e eVar = C23184e.this;
                ((C21724i) av02).mo34016a(r4, eVar.f65924E, eVar.f65944z.mo36118Z(), 2, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$b */
    public class C23186b implements View.OnClickListener {

        /* renamed from: y03.e$b$a */
        public class C23187a implements C47883u {
            public C23187a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    C23184e eVar = C23184e.this;
                    int i = C23184e.f66578V;
                    C21915i.m25177i(eVar.f65920A.mo24989r4(), C23184e.this.f65924E, 2);
                    C86299o oVar = new C86299o();
                    ph4 ph4 = C23184e.this.f65924E.f64723Y.f64507n;
                    oVar.f250930b = ph4.f64404i;
                    oVar.f250934f = ph4.f64401f;
                    oVar.f250939k = C86342c.CTRL_INDEX;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(C23184e.this.getContext(), oVar);
                    View view = C23184e.this.f66587P;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }

        public C23186b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            Context context = C23184e.this.getContext();
            C23184e eVar = C23184e.this;
            int i = C23184e.f66578V;
            qVar.mo107595g(context.getString(C0966R.string.k4e, new Object[]{eVar.f65924E.f64723Y.f64507n.f64403h}));
            qVar.mo107589a(true);
            qVar.mo107601m(C0966R.string.f7564js);
            qVar.mo107590b(new C23187a());
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$c */
    public class C23188c implements View.OnClickListener {
        public C23188c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = C23184e.this.f66587P;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C21915i.m25177i(C23184e.this.f65920A.mo24989r4(), C23184e.this.f65924E, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$d */
    public class C23189d implements C96814a.C57541b {

        /* renamed from: y03.e$d$a */
        public class C23190a implements Runnable {
            public C23190a() {
            }

            public void run() {
                C23184e.this.mo36160p(true, true);
            }
        }

        public C23189d() {
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaitingEnd");
            C23184e eVar = C23184e.this;
            eVar.f66586N = false;
            eVar.mo36155k();
            C22193b bVar = C23184e.this.getFSVideoUIComponent().mo24967U2().f66025f;
            if (bVar != null && bVar.f62815l == 0) {
                bVar.f62815l = System.currentTimeMillis() - bVar.f62804a;
                Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "FirstLoadTime %d %d", Long.valueOf(bVar.f62812i), Long.valueOf(bVar.f62815l));
            }
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaiting");
            C23184e.this.f66586N = true;
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            boolean z;
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoEnded");
            C23184e.this.getFSVideoUIComponent().mo24995y5().mo36215g(str);
            C23184e.this.getFSVideoUIComponent().mo24967U2().f66023d = 1;
            int O4 = C23184e.this.getFSVideoUIComponent().mo25014O4();
            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "clicfg_topstory_v_video_play  %s", Integer.valueOf(O4));
            if (O4 != 1 || !C23184e.this.getFSVideoUIComponent().mo24970W3() || !(C23184e.this.f65944z instanceof C23219w)) {
                z = C23184e.this.getFSVideoUIComponent().mo25017j1(C23184e.this.f65944z.mo36118Z() + 1);
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                }
                ((C23219w) C23184e.this.f65944z).mo36171I(true);
                Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "VVideoAutoPlay replay succ");
                z = true;
            }
            if (!z && (C23184e.this.f65944z instanceof C22953h)) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused2) {
                }
                ((C22953h) C23184e.this.f65944z).mo36171I(true);
            }
            C23184e.this.f66586N = false;
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            zh4 zh4;
            int i3 = 0;
            Log.m105921e("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, Integer.valueOf(i), Integer.valueOf(i2));
            xh4 d = C23184e.this.f65920A.mo24946C6().mo36193d(C23184e.this.f65920A.mo24981e2());
            if (d != null && d.f64710K != null) {
                Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", Integer.valueOf(i), Integer.valueOf(d.f64710K.size()), d.f64726e, Integer.valueOf(d.f64719U));
                int i4 = 0;
                while (true) {
                    if (i4 >= d.f64710K.size()) {
                        break;
                    } else if (d.f64726e.equals(d.f64710K.get(i4).f145964d)) {
                        int i5 = i4 + 1;
                        if (i5 < d.f64710K.size() && (zh4 = d.f64710K.get(i5)) != null && !Util.isNullOrNil(zh4.f145964d)) {
                            d.f64719U = zh4.f145965e;
                            d.f64726e = zh4.f145964d;
                            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", Integer.valueOf(i5), zh4.f145964d, Integer.valueOf(zh4.f145965e));
                            C102159b.m134601a(17);
                            C23184e.this.postDelayed(new C23190a(), 100);
                            return;
                        }
                    } else {
                        i4++;
                    }
                }
            }
            C23184e.this.f65920A.mo24946C6().mo36198q(C23184e.this.f65920A.mo24989r4(), C23184e.this.f65920A.mo24981e2());
            C23184e eVar = C23184e.this;
            Context context = eVar.getContext();
            eVar.mo36157m(context.getString(C0966R.string.ka7, new Object[]{i + XVFSFile.PATH_SEPARATOR + i2}), C23184e.this.getContext().getString(C0966R.string.kbc));
            C22983u y5 = C23184e.this.getFSVideoUIComponent().mo24995y5();
            C102532t tVar = y5.f66028b;
            if (tVar != null && tVar.getSessionId().equals(str)) {
                y5.mo36221m();
            }
            C21915i.m25170b(i);
            C22193b bVar = C23184e.this.getFSVideoUIComponent().mo24967U2().f66025f;
            if (bVar != null && bVar.f62804a > 0) {
                i3 = ((int) (System.currentTimeMillis() - bVar.f62804a)) / 1000;
            }
            C21915i.m25172d(d, i, str3, i3);
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onPrepared");
            C23184e eVar = C23184e.this;
            C22960m mVar = eVar.f66580H;
            mVar.f65972i = -1;
            mVar.f65973j = 0;
            mVar.f65971h = 0.0f;
            if (!eVar.f66586N) {
                eVar.mo36155k();
            }
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onGetVideoSize width=%d height=%d", Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* renamed from: y03.e$e */
    public class C23191e implements View.OnClickListener {
        public C23191e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e.this.getFSVideoUIComponent().mo24994x5(view, C23184e.this.f65944z.mo36118Z());
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$f */
    public class C23192f implements View.OnClickListener {
        public C23192f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e.this.getFSItemUIComponent().mo36628c(view, C23184e.this.f65944z.mo36118Z());
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$g */
    public class C23193g implements View.OnClickListener {
        public C23193g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e.this.getFSVideoUIComponent().mo24985h7(C23184e.this.f65924E, view);
            C23184e.this.mo36636v();
            C23184e eVar = C23184e.this;
            eVar.getClass();
            if (!(eVar instanceof C23220x)) {
                View view2 = C23184e.this.f66587P;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$h */
    public class C23194h implements View.OnClickListener {
        public C23194h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e.this.getFSVideoUIComponent().mo25018p5(C23184e.this.f65944z.mo36118Z(), (e54) view.getTag());
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$i */
    public class C23195i implements View.OnClickListener {
        public C23195i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e eVar = C23184e.this;
            int i = C23184e.f66578V;
            C22974q.m27138h(eVar.f65924E, eVar.getFSVideoUIComponent().mo24990t());
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$j */
    public class C23196j implements View.OnClickListener {
        public C23196j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e eVar = C23184e.this;
            int i = C23184e.f66578V;
            if (eVar.f65922C == C22951f.C22952a.MOBILE_NET) {
                eVar.getFSVideoUIComponent().mo24973X4().f65982a = true;
                C23184e.this.f65920A.mo24991w6(2);
            }
            if (C23184e.this.getFSVideoUIComponent().mo24973X4().mo36183b()) {
                C23184e eVar2 = C23184e.this;
                eVar2.f65922C = C22951f.C22952a.UNKNOWN;
                if (eVar2.getFSVideoUIComponent().mo24995y5().f66031e) {
                    C23184e.this.getFSVideoUIComponent().mo24995y5().mo36219k();
                } else {
                    C23184e.this.mo36160p(true, false);
                }
                C102158a.m134600a(19);
            } else {
                C102158a.m134600a(20);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$k */
    public class C23197k implements View.OnClickListener {
        public C23197k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e.this.getFSVideoUIComponent().mo24967U2().f66023d = 2;
            if (C23184e.this.getFSItemUIComponent() == null || C23184e.this.getFSItemUIComponent().mo36118Z() != C23184e.this.getFSVideoUIComponent().mo24981e2()) {
                C23184e.this.getFSVideoUIComponent().mo25017j1(C23184e.this.f65944z.mo36118Z());
                C23184e.this.getFSVideoUIComponent().mo24967U2().mo36206d(C23184e.this.f65924E);
                C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
                uh4 r4 = C23184e.this.getFSVideoUIComponent().mo24989r4();
                C23184e eVar = C23184e.this;
                ((C21724i) av02).mo34016a(r4, eVar.f65924E, eVar.f65944z.mo36118Z(), 2, "");
            } else {
                C23184e eVar2 = C23184e.this;
                eVar2.mo36160p(!eVar2.getFSVideoUIComponent().mo24973X4().f65982a, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$l */
    public class C23198l implements View.OnClickListener {
        public C23198l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23184e eVar = C23184e.this;
            eVar.getClass();
            eVar.f65923D = UUID.randomUUID().toString();
            C23184e.this.f66579G.mo36651A();
            C23184e.this.getFSVideoUIComponent().mo24967U2().f66023d = 2;
            C22983u y5 = C23184e.this.getFSVideoUIComponent().mo24995y5();
            C22947b fSVideoUIComponent = C23184e.this.getFSVideoUIComponent();
            C23184e eVar2 = C23184e.this;
            y5.mo36217i(fSVideoUIComponent, eVar2.f65924E, eVar2.f65923D, eVar2.f65944z.mo36118Z());
            C23184e.this.mo36155k();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: y03.e$m */
    public class C23199m implements C22948c {

        /* renamed from: a */
        public float f66607a;

        public C23199m() {
            this.f66607a = (float) C76577a.m92159j(C23184e.this.getContext());
        }

        /* renamed from: a */
        public void mo36119a() {
            Log.m105918d("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSingleTap");
            boolean z = false;
            if (!(C23184e.this.f65937s.getVisibility() == 0)) {
                if (C23184e.this.f66579G.getVisibility() == 0) {
                    z = true;
                }
                if (z) {
                    C23184e.this.f66579G.mo36667y();
                    return;
                }
                C23184e.this.f66579G.mo36668z();
                if (C23184e.this.getFSItemUIComponent() != null) {
                    C23184e.this.getFSItemUIComponent().mo36116A();
                    C23184e.this.getFSItemUIComponent().mo36117Y();
                }
            }
        }

        /* renamed from: b */
        public int mo36120b(int i, float f) {
            float f2 = f / this.f66607a;
            C102532t tVar = C23184e.this.getFSVideoUIComponent().mo24995y5().f66028b;
            int i2 = 0;
            int videoDurationSec = tVar != null ? tVar.getVideoDurationSec() : 0;
            int currentPosition = getCurrentPosition() + ((int) (((float) videoDurationSec) * f2));
            if (currentPosition >= 0) {
                i2 = currentPosition > videoDurationSec ? videoDurationSec : currentPosition;
            }
            String a = C86779c.m107715a(((long) videoDurationSec) * 1000);
            TextView textView = C23184e.this.f65926e;
            textView.setText(C86779c.m107715a(((long) i2) * 1000) + "/" + a);
            return i2;
        }

        /* renamed from: c */
        public void mo36121c(float f) {
        }

        /* renamed from: d */
        public void mo36122d(int i, float f) {
            C23184e.this.f66579G.f273525i.setVisibility(0);
            C23184e.this.f65926e.setVisibility(8);
            C23184e.this.mo36142f(i);
        }

        /* renamed from: e */
        public boolean mo36123e() {
            return !(C23184e.this.f65937s.getVisibility() == 0);
        }

        /* renamed from: f */
        public void mo36124f(float f) {
        }

        /* renamed from: g */
        public void mo36125g() {
            Log.m105918d("MicroMsg.TopStory.TopStoryFSVideoContainer", "onDoubleTap");
        }

        public int getCurrentPosition() {
            C102532t tVar = C23184e.this.getFSVideoUIComponent().mo24995y5().f66028b;
            if (tVar != null) {
                return tVar.getCurrPosSec();
            }
            return 0;
        }

        /* renamed from: h */
        public void mo36127h() {
            C23184e.this.f65926e.setVisibility(0);
            C23184e.this.f66579G.f273525i.setVisibility(8);
        }
    }

    public C23184e(Context context, C22947b bVar, C22946a aVar) {
        super(context, bVar, aVar);
        if (this.f65920A.mo24970W3()) {
            this.f65928g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: a */
    public void mo36137a() {
        if (!(this instanceof C23220x)) {
            View view = this.f66587P;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public C96814a.C96817e mo36138b(xh4 xh4) {
        return C96814a.C96817e.CONTAIN;
    }

    /* renamed from: c */
    public void mo36139c() {
        C23204j jVar = this.f66579G;
        if (jVar != null) {
            jVar.mo36667y();
        }
    }

    /* renamed from: d */
    public void mo36140d() {
        super.mo36140d();
        boolean z = this instanceof C23220x;
        if (!z) {
            this.f66587P = findViewById(C0966R.C0970id.f358937hz3);
            this.f66588Q = (TextView) findViewById(C0966R.C0970id.hz4);
            this.f66589R = (TextView) findViewById(C0966R.C0970id.f358935hz1);
            this.f66590S = (ImageView) findViewById(C0966R.C0970id.f358936hz2);
            this.f66591T = (ImageView) findViewById(C0966R.C0970id.f358934hz0);
        }
        this.f66581I = new C23191e();
        this.f66582J = new C23192f();
        this.f66583K = new C23193g();
        this.f66584L = new C23194h();
        this.f66585M = new C23195i();
        this.f65933o.setOnClickListener(new C23196j());
        this.f65931j.setOnClickListener(new C23197k());
        this.f65932n.setOnClickListener(new C23198l());
        this.f65937s.setOnClickListener(new C23185a());
        if (!z) {
            this.f66587P.setOnClickListener(new C23186b());
            this.f66591T.setOnClickListener(new C23188c());
        }
        mo36635t();
        boolean z2 = false;
        if (getFSVideoUIComponent().mo24970W3()) {
            this.f66579G = new C23222y(getContext());
        } else {
            this.f66579G = new C23204j(getContext());
            if (C85875k4.m106205t(getContext(), false)) {
                C23204j jVar = this.f66579G;
                jVar.f66617I.setPadding(C76577a.m92151b(getContext(), 24), 0, C76577a.m92151b(getContext(), 24), 0);
            }
        }
        this.f66579G.setOnlyFS(z);
        this.f66579G.mo36667y();
        this.f66579G.setShareBtnClickListener(this.f66582J);
        this.f66579G.setWowBtnClickListener(this.f66583K);
        this.f66579G.setTagBtnClickListener(this.f66584L);
        this.f66579G.setSourceItemClickListener(this.f66585M);
        if (1 >= Log.getLogLevel()) {
            z2 = true;
        }
        if (z2) {
            this.f66579G.setTitleClickListener(new C23200f(this));
        }
        this.f66579G.setOnUpdateProgressLenListener(new C23201g(this));
        this.f66579G.setIplaySeekCallback(new C23202h(this));
        this.f66579G.setOnPlayButtonClickListener(new C23203i(this));
    }

    /* renamed from: e */
    public boolean mo36141e() {
        View view = this.f66587P;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: g */
    public void mo36143g() {
        Log.m105918d("MicroMsg.TopStory.TopStoryFSVideoContainer", "setListScrollPlayContainerStatus");
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f65936r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65928g.setVisibility(0);
        this.f65926e.setVisibility(8);
        this.f65925d.setVisibility(8);
        this.f65941w.setVisibility(8);
    }

    public C23180a getFSItemUIComponent() {
        return (C23180a) this.f65944z;
    }

    public C22947b getFSVideoUIComponent() {
        return this.f65920A;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ca5;
    }

    public String getSessionId() {
        return this.f65923D;
    }

    public xh4 getVideoInfo() {
        return this.f65924E;
    }

    public C96814a.C57541b getVideoViewCallback() {
        return this.f66592U;
    }

    /* renamed from: h */
    public void mo36152h() {
        Log.m105918d("MicroMsg.TopStory.TopStoryFSVideoContainer", "setListScrollStopContainerStatus");
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!(getFSVideoUIComponent().mo24973X4().f65984c == 2) || C101987v0.m134275i()) {
            View view3 = this.f65936r;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = this.f65936r;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f65928g.setVisibility(0);
        this.f65926e.setVisibility(8);
        this.f65925d.setVisibility(8);
        this.f65941w.setVisibility(8);
        View view6 = this.f65939u;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f65938t;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65931j.setVisibility(0);
        this.f65932n.setVisibility(8);
        this.f65935q.setVisibility(8);
    }

    /* renamed from: k */
    public void mo36155k() {
        super.mo36155k();
    }

    /* renamed from: n */
    public void mo36158n() {
        C23204j jVar = this.f66579G;
        if (jVar != null) {
            jVar.mo36668z();
        }
    }

    /* renamed from: o */
    public void mo36159o() {
        ph4 ph4;
        if (!(this instanceof C23220x)) {
            qh4 qh4 = this.f65924E.f64723Y;
            if (qh4 == null || (ph4 = qh4.f64507n) == null) {
                View view = this.f66587P;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f66588Q.setText(ph4.f64399d);
            this.f66589R.setText(this.f65924E.f64723Y.f64507n.f64400e);
            C20828a.m22825b().mo32519h(this.f65924E.f64723Y.f64507n.f64405j, this.f66590S, C22951f.f65919F);
            View view3 = this.f66587P;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C21915i.m25177i(this.f65920A.mo24989r4(), this.f65924E, 1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C22960m mVar = this.f66580H;
        if (mVar == null) {
            return true;
        }
        mVar.mo36175a(motionEvent);
        return true;
    }

    /* renamed from: q */
    public void mo36161q() {
        MTimerHandler mTimerHandler = this.f66579G.f66634x0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: r */
    public void mo36162r() {
        super.mo36162r();
        C23204j jVar = this.f66579G;
        if (jVar != null) {
            jVar.setVideoTotalTime(this.f65924E.f64728g);
            this.f66579G.mo36653C(this.f65924E);
        }
        if (!(getFSItemUIComponent() == null || getFSItemUIComponent().mo36118Z() == getFSVideoUIComponent().mo24981e2())) {
            if (getFSVideoUIComponent().mo24973X4().mo36183b()) {
                mo36156l();
            } else {
                mo36157m(getNoNetTip(), getContext().getString(C0966R.string.kbc));
            }
        }
        TextView textView = this.f65930i;
        if (textView != null) {
            textView.setText(this.f65924E.f64725d);
            C85875k4.m106189j0(this.f65930i.getPaint(), 0.8f);
        }
    }

    /* renamed from: t */
    public void mo36635t() {
        this.f66580H = new C22960m(getContext(), this, new C23199m());
    }

    /* renamed from: v */
    public void mo36636v() {
        this.f66579G.mo36654D(this.f65924E);
    }

    public C23204j getControlBar() {
        return this.f66579G;
    }
}

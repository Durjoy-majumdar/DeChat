package z03;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
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
import java.util.Locale;
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
import x03.C22983u;

/* renamed from: z03.i */
public class C23433i extends C22951f {

    /* renamed from: T */
    public static final /* synthetic */ int f67193T = 0;

    /* renamed from: G */
    public C23446j f67194G;

    /* renamed from: H */
    public C22960m f67195H;

    /* renamed from: I */
    public View.OnClickListener f67196I;

    /* renamed from: J */
    public boolean f67197J;

    /* renamed from: K */
    public View f67198K;

    /* renamed from: L */
    public TextView f67199L;

    /* renamed from: M */
    public View f67200M;

    /* renamed from: N */
    public TextView f67201N;

    /* renamed from: P */
    public TextView f67202P;

    /* renamed from: Q */
    public ImageView f67203Q;

    /* renamed from: R */
    public ImageView f67204R;

    /* renamed from: S */
    public C96814a.C57541b f67205S = new C23443i();

    /* renamed from: z03.i$a */
    public class C23434a implements View.OnClickListener {
        public C23434a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23433i.this.getListVideoUIComponent().mo25027p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$b */
    public class C23435b implements View.OnClickListener {
        public C23435b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23433i iVar = C23433i.this;
            int i = C23433i.f67193T;
            if (iVar.f65922C == C22951f.C22952a.MOBILE_NET) {
                iVar.getListVideoUIComponent().mo24973X4().f65982a = true;
                C23433i.this.f65920A.mo24991w6(2);
            }
            if (C23433i.this.getListVideoUIComponent().mo24973X4().mo36183b()) {
                C23433i iVar2 = C23433i.this;
                iVar2.f65922C = C22951f.C22952a.UNKNOWN;
                if (iVar2.getListVideoUIComponent().mo24995y5().f66031e) {
                    C23433i.this.getListVideoUIComponent().mo24995y5().mo36219k();
                    C23433i.this.mo36155k();
                } else {
                    C23433i.this.mo36160p(true, false);
                }
                C102158a.m134600a(19);
            } else {
                C102158a.m134600a(20);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$c */
    public class C23436c implements View.OnClickListener {
        public C23436c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23433i.this.getListVideoUIComponent().mo24967U2().f66023d = 2;
            if (C23433i.this.getListItemUIComponent() == null || C23433i.this.getListItemUIComponent().mo36118Z() != C23433i.this.getListVideoUIComponent().mo24981e2()) {
                C23433i.this.getListVideoUIComponent().mo25017j1(C23433i.this.f65944z.mo36118Z());
                C23433i.this.getListVideoUIComponent().mo24967U2().mo36206d(C23433i.this.f65924E);
                C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
                uh4 r4 = C23433i.this.getListVideoUIComponent().mo24989r4();
                C23433i iVar = C23433i.this;
                ((C21724i) av02).mo34016a(r4, iVar.f65924E, iVar.f65944z.mo36118Z(), 2, "");
            } else {
                C23433i iVar2 = C23433i.this;
                iVar2.mo36160p(!iVar2.getListVideoUIComponent().mo24973X4().f65982a, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$d */
    public class C23437d implements View.OnClickListener {
        public C23437d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23433i iVar = C23433i.this;
            iVar.getClass();
            iVar.f65923D = UUID.randomUUID().toString();
            C23446j jVar = C23433i.this.f67194G;
            MTimerHandler mTimerHandler = jVar.f67220F;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                jVar.f67220F.startTimer(2000);
            }
            C23433i.this.getListVideoUIComponent().mo24967U2().f66023d = 2;
            C22983u y5 = C23433i.this.getListVideoUIComponent().mo24995y5();
            C23423b listVideoUIComponent = C23433i.this.getListVideoUIComponent();
            C23433i iVar2 = C23433i.this;
            y5.mo36217i(listVideoUIComponent, iVar2.f65924E, iVar2.f65923D, iVar2.f65944z.mo36118Z());
            C23433i.this.mo36155k();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$e */
    public class C23438e implements View.OnClickListener {
        public C23438e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!(C23433i.this.getListItemUIComponent() == null || C23433i.this.getListItemUIComponent().mo36118Z() == C23433i.this.getListVideoUIComponent().mo24981e2())) {
                C23433i.this.getListVideoUIComponent().mo24967U2().f66023d = 2;
                C23433i.this.getListVideoUIComponent().mo25017j1(C23433i.this.f65944z.mo36118Z());
                C23433i.this.getListVideoUIComponent().mo24967U2().mo36206d(C23433i.this.f65924E);
                C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
                uh4 r4 = C23433i.this.getListVideoUIComponent().mo24989r4();
                C23433i iVar = C23433i.this;
                ((C21724i) av02).mo34016a(r4, iVar.f65924E, iVar.f65944z.mo36118Z(), 2, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$f */
    public class C23439f implements View.OnClickListener {
        public C23439f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            uh4 uh4 = new uh4();
            uh4.f64642i = C23433i.this.getListVideoUIComponent().mo24989r4().f64642i;
            uh4.f64648r = UUID.randomUUID().toString();
            uh4.f64639f = C23433i.this.getListVideoUIComponent().mo24989r4().f64643j;
            uh4.f64640g = C23433i.this.getListVideoUIComponent().mo24989r4().f64640g;
            C23433i iVar = C23433i.this;
            uh4.f64637d = iVar.f65924E.f64720V.f64729h;
            uh4.f64638e = iVar.getListVideoUIComponent().mo24989r4().f64638e;
            C23433i iVar2 = C23433i.this;
            uh4.f64645o = iVar2.f65924E.f64720V;
            uh4.f64644n = "topstory";
            uh4.f64643j = iVar2.getListVideoUIComponent().mo24989r4().f64643j;
            xh4 xh4 = C23433i.this.f65924E;
            uh4.f64641h = xh4.f64741v;
            uh4.f64645o.f64711L = xh4.f64711L;
            uh4.f64647q.addAll(xh4.f64720V.f64721W);
            C101987v0.m134280n(C23433i.this.getListVideoUIComponent().mo24990t(), uh4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$g */
    public class C23440g implements View.OnClickListener {

        /* renamed from: z03.i$g$a */
        public class C23441a implements C47883u {
            public C23441a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                qh4 qh4;
                if (z) {
                    C23433i iVar = C23433i.this;
                    int i = C23433i.f67193T;
                    xh4 xh4 = iVar.f65924E;
                    if (xh4 != null && (qh4 = xh4.f64723Y) != null && qh4.f64507n != null) {
                        C21915i.m25177i(iVar.f65920A.mo24989r4(), C23433i.this.f65924E, 2);
                        C86299o oVar = new C86299o();
                        ph4 ph4 = C23433i.this.f65924E.f64723Y.f64507n;
                        oVar.f250930b = ph4.f64404i;
                        oVar.f250934f = ph4.f64401f;
                        oVar.f250939k = C86342c.CTRL_INDEX;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(C23433i.this.getContext(), oVar);
                        View view = C23433i.this.f67200M;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }

        public C23440g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107595g(C23433i.this.getContext().getString(C0966R.string.k4e, new Object[]{C23433i.this.f65924E.f64723Y.f64507n.f64403h}));
            qVar.mo107589a(true);
            qVar.mo107601m(C0966R.string.f7564js);
            qVar.mo107590b(new C23441a());
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$h */
    public class C23442h implements View.OnClickListener {
        public C23442h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = C23433i.this.f67200M;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C21915i.m25177i(C23433i.this.f65920A.mo24989r4(), C23433i.this.f65924E, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: z03.i$i */
    public class C23443i implements C96814a.C57541b {

        /* renamed from: z03.i$i$a */
        public class C23444a implements Runnable {
            public C23444a() {
            }

            public void run() {
                C23433i.this.mo36160p(true, true);
            }
        }

        public C23443i() {
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
            Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaitingEnd");
            C23433i iVar = C23433i.this;
            iVar.f67197J = false;
            iVar.f67194G.mo36667y();
            if (C23433i.this.f65924E.f64720V != null) {
                Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onVideoWaitingEnd");
                View view = C23433i.this.f67198K;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C23433i.this.mo36155k();
            C22193b bVar = C23433i.this.getListVideoUIComponent().mo24967U2().f66025f;
            if (bVar != null && bVar.f62815l == 0) {
                bVar.f62815l = System.currentTimeMillis() - bVar.f62804a;
                Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "FirstLoadTime %d %d", Long.valueOf(bVar.f62812i), Long.valueOf(bVar.f62815l));
            }
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
            Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaiting");
            C23433i.this.f67197J = true;
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoEnded, pos:%s, listpos:%s", Integer.valueOf(C23433i.this.f65944z.mo36118Z()), Integer.valueOf(C23433i.this.f65944z.mo36118Z()));
            C23433i.this.getListVideoUIComponent().mo24995y5().mo36215g(str);
            C23433i.this.getListVideoUIComponent().mo24967U2().f66023d = 1;
            if (!C23433i.this.getListVideoUIComponent().mo25017j1(C23433i.this.f65944z.mo36118Z() + 1) && (C23433i.this.f65944z instanceof C22953h)) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                }
                ((C22953h) C23433i.this.f65944z).mo36171I(true);
            }
            C23433i.this.f67194G.mo36667y();
            C23433i.this.f67197J = false;
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            xh4 d;
            zh4 zh4;
            int i3 = 0;
            Log.m105921e("MicroMsg.TopStory.TopStoryListVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, Integer.valueOf(i), Integer.valueOf(i2));
            if (i != 0 && (d = C23433i.this.f65920A.mo24946C6().mo36193d(C23433i.this.f65920A.mo24981e2())) != null && d.f64710K != null) {
                Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", Integer.valueOf(i), Integer.valueOf(d.f64710K.size()), d.f64726e, Integer.valueOf(d.f64719U));
                int i4 = 0;
                while (true) {
                    if (i4 >= d.f64710K.size()) {
                        break;
                    } else if (d.f64726e.equals(d.f64710K.get(i4).f145964d)) {
                        int i5 = i4 + 1;
                        if (i5 < d.f64710K.size() && (zh4 = d.f64710K.get(i5)) != null && !Util.isNullOrNil(zh4.f145964d)) {
                            d.f64719U = zh4.f145965e;
                            d.f64726e = zh4.f145964d;
                            Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", Integer.valueOf(i5), zh4.f145964d, Integer.valueOf(zh4.f145965e));
                            C102159b.m134601a(17);
                            C23433i.this.postDelayed(new C23444a(), 100);
                            return;
                        }
                    } else {
                        i4++;
                    }
                }
            }
            C23433i.this.f65920A.mo24946C6().mo36198q(C23433i.this.f65920A.mo24989r4(), C23433i.this.f65920A.mo24981e2());
            C23433i iVar = C23433i.this;
            Context context = iVar.getContext();
            iVar.mo36157m(context.getString(C0966R.string.ka7, new Object[]{i + XVFSFile.PATH_SEPARATOR + i2}), C23433i.this.getContext().getString(C0966R.string.kbc));
            C22983u y5 = C23433i.this.getListVideoUIComponent().mo24995y5();
            C102532t tVar = y5.f66028b;
            if (tVar != null && tVar.getSessionId().equals(str)) {
                y5.mo36221m();
            }
            C21915i.m25170b(i);
            C22193b bVar = C23433i.this.getListVideoUIComponent().mo24967U2().f66025f;
            if (bVar != null && bVar.f62804a > 0) {
                i3 = ((int) (System.currentTimeMillis() - bVar.f62804a)) / 1000;
            }
            C21915i.m25172d(C23433i.this.f65924E, i, str3, i3);
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
            Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "onPrepared");
            C23433i iVar = C23433i.this;
            C22960m mVar = iVar.f67195H;
            mVar.f65972i = -1;
            mVar.f65973j = 0;
            mVar.f65971h = 0.0f;
            if (!iVar.f67197J) {
                iVar.mo36155k();
            }
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
            Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "onGetVideoSize width=%d height=%d", Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* renamed from: z03.i$j */
    public class C23445j implements C22948c {

        /* renamed from: a */
        public float f67217a;

        public C23445j() {
            this.f67217a = (float) C76577a.m92159j(C23433i.this.getContext());
        }

        /* renamed from: a */
        public void mo36119a() {
            Log.m105918d("MicroMsg.TopStory.TopStoryListVideoContainer", "onSingleTap");
            boolean z = false;
            if (!(C23433i.this.f65937s.getVisibility() == 0)) {
                if (C23433i.this.f67194G.getVisibility() == 0) {
                    z = true;
                }
                if (z) {
                    C23433i.this.f67194G.mo36667y();
                    return;
                }
                C23433i.this.f67194G.mo36668z();
                if (C23433i.this.getListItemUIComponent() != null) {
                    C23433i.this.getListItemUIComponent().mo36116A();
                    C23433i.this.getListItemUIComponent().mo36117Y();
                }
            }
        }

        /* renamed from: b */
        public int mo36120b(int i, float f) {
            float f2 = f / this.f67217a;
            C102532t tVar = C23433i.this.getListVideoUIComponent().mo24995y5().f66028b;
            int i2 = 0;
            int videoDurationSec = tVar != null ? tVar.getVideoDurationSec() : 0;
            int currentPosition = getCurrentPosition() + ((int) (((float) videoDurationSec) * f2));
            if (currentPosition >= 0) {
                i2 = currentPosition > videoDurationSec ? videoDurationSec : currentPosition;
            }
            String a = C86779c.m107715a(((long) videoDurationSec) * 1000);
            TextView textView = C23433i.this.f65926e;
            textView.setText(C86779c.m107715a(((long) i2) * 1000) + "/" + a);
            return i2;
        }

        /* renamed from: c */
        public void mo36121c(float f) {
        }

        /* renamed from: d */
        public void mo36122d(int i, float f) {
            C23433i.this.f67194G.f273525i.setVisibility(0);
            C23433i.this.f65926e.setVisibility(8);
            C23433i.this.mo36142f(i);
        }

        /* renamed from: e */
        public boolean mo36123e() {
            return !(C23433i.this.f65937s.getVisibility() == 0);
        }

        /* renamed from: f */
        public void mo36124f(float f) {
        }

        /* renamed from: g */
        public void mo36125g() {
            Log.m105918d("MicroMsg.TopStory.TopStoryListVideoContainer", "onDoubleTap");
        }

        public int getCurrentPosition() {
            C102532t tVar = C23433i.this.getListVideoUIComponent().mo24995y5().f66028b;
            if (tVar != null) {
                return tVar.getCurrPosSec();
            }
            return 0;
        }

        /* renamed from: h */
        public void mo36127h() {
            C23433i.this.f65926e.setVisibility(0);
            C23433i.this.f67194G.f273525i.setVisibility(8);
        }
    }

    public C23433i(Context context, C22947b bVar, C22946a aVar) {
        super(context, bVar, aVar);
    }

    /* renamed from: a */
    public void mo36137a() {
        View view = this.f67200M;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public C96814a.C96817e mo36138b(xh4 xh4) {
        return C96814a.C96817e.CONTAIN;
    }

    /* renamed from: c */
    public void mo36139c() {
        C23446j jVar = this.f67194G;
        if (jVar != null) {
            jVar.mo36667y();
        }
    }

    /* renamed from: d */
    public void mo36140d() {
        super.mo36140d();
        this.f67198K = findViewById(C0966R.C0970id.f358637g71);
        this.f67199L = (TextView) findViewById(C0966R.C0970id.f358635g70);
        this.f67200M = findViewById(C0966R.C0970id.f358937hz3);
        this.f67201N = (TextView) findViewById(C0966R.C0970id.hz4);
        this.f67202P = (TextView) findViewById(C0966R.C0970id.f358935hz1);
        this.f67203Q = (ImageView) findViewById(C0966R.C0970id.f358936hz2);
        this.f67204R = (ImageView) findViewById(C0966R.C0970id.f358934hz0);
        this.f67196I = new C23434a();
        this.f65933o.setOnClickListener(new C23435b());
        this.f65931j.setOnClickListener(new C23436c());
        this.f65932n.setOnClickListener(new C23437d());
        this.f65937s.setOnClickListener(new C23438e());
        this.f67198K.setOnClickListener(new C23439f());
        View view = this.f67200M;
        if (view != null) {
            view.setOnClickListener(new C23440g());
        }
        ImageView imageView = this.f67204R;
        if (imageView != null) {
            imageView.setOnClickListener(new C23442h());
        }
        this.f67195H = new C22960m(getContext(), this, new C23445j());
        C23446j jVar = new C23446j(getContext());
        this.f67194G = jVar;
        jVar.mo36667y();
        this.f67194G.setFullScreenBtnClickListener(this.f67196I);
        this.f67194G.setOnUpdateProgressLenListener(new C23430f(this));
        this.f67194G.setIplaySeekCallback(new C23431g(this));
        this.f67194G.setOnPlayButtonClickListener(new C23432h(this));
    }

    /* renamed from: e */
    public boolean mo36141e() {
        return this.f67200M.getVisibility() == 0;
    }

    /* renamed from: g */
    public void mo36143g() {
        Log.m105918d("MicroMsg.TopStory.TopStoryListVideoContainer", "setListScrollPlayContainerStatus");
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65928g.setVisibility(0);
        this.f65926e.setVisibility(8);
        this.f65925d.setVisibility(8);
        this.f65941w.setVisibility(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.caf;
    }

    public C23422a getListItemUIComponent() {
        return (C23422a) this.f65944z;
    }

    public C23423b getListVideoUIComponent() {
        return (C23423b) this.f65920A;
    }

    public String getSessionId() {
        return this.f65923D;
    }

    public xh4 getVideoInfo() {
        return this.f65924E;
    }

    public C96814a.C57541b getVideoViewCallback() {
        return this.f67205S;
    }

    /* renamed from: h */
    public void mo36152h() {
        Log.m105918d("MicroMsg.TopStory.TopStoryListVideoContainer", "setListScrollStopContainerStatus");
        View view = this.f65937s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65928g.setVisibility(0);
        this.f65926e.setVisibility(8);
        this.f65925d.setVisibility(8);
        this.f65941w.setVisibility(8);
        View view3 = this.f65939u;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f65938t;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65931j.setVisibility(0);
        this.f65932n.setVisibility(8);
        this.f65935q.setVisibility(8);
    }

    /* renamed from: k */
    public void mo36155k() {
        super.mo36155k();
    }

    /* renamed from: o */
    public void mo36159o() {
        ph4 ph4;
        qh4 qh4 = this.f65924E.f64723Y;
        boolean z = false;
        if (qh4 == null || (ph4 = qh4.f64507n) == null) {
            View view = this.f67200M;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f67201N.setText(ph4.f64399d);
        this.f67202P.setText(this.f65924E.f64723Y.f64507n.f64400e);
        C20828a.m22825b().mo32519h(this.f65924E.f64723Y.f64507n.f64405j, this.f67203Q, C22951f.f65919F);
        View view3 = this.f67200M;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C21915i.m25177i(this.f65920A.mo24989r4(), this.f65924E, 1);
        if (getControlBar().getVisibility() == 0) {
            z = true;
        }
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f67200M.getLayoutParams();
            layoutParams.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f3755d6);
            this.f67200M.setLayoutParams(layoutParams);
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f67200M.getLayoutParams();
        layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f3766df);
        this.f67200M.setLayoutParams(layoutParams2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C22960m mVar = this.f67195H;
        if (mVar == null) {
            return true;
        }
        mVar.mo36175a(motionEvent);
        return true;
    }

    /* renamed from: p */
    public boolean mo36160p(boolean z, boolean z2) {
        boolean p = super.mo36160p(z, z2);
        getListVideoUIComponent().mo24995y5().mo36220l(getListVideoUIComponent().mo24978b());
        return p;
    }

    /* renamed from: q */
    public void mo36161q() {
        MTimerHandler mTimerHandler = this.f67194G.f67220F;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: r */
    public void mo36162r() {
        String str;
        super.mo36162r();
        C23446j jVar = this.f67194G;
        if (jVar != null) {
            jVar.setVideoTotalTime(this.f65924E.f64728g);
        }
        if (!(getListItemUIComponent() == null || getListItemUIComponent().mo36118Z() == getListVideoUIComponent().mo24981e2())) {
            if (getListVideoUIComponent().mo24973X4().mo36183b()) {
                mo36156l();
            } else {
                mo36157m(getNoNetTip(), getContext().getString(C0966R.string.kbc));
            }
        }
        if (this.f65924E.f64720V != null) {
            View view = this.f67198K;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f67199L;
            long j = (long) this.f65924E.f64720V.f64728g;
            if (j <= 0) {
                str = "00:00";
            } else if (j < 60) {
                str = String.format(Locale.getDefault(), "00:%02d", new Object[]{Long.valueOf(j % 60)});
            } else if (j < 3600) {
                str = String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)});
            } else {
                str = String.format(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)});
            }
            textView.setText(str);
            return;
        }
        View view2 = this.f67198K;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C23446j getControlBar() {
        return this.f67194G;
    }
}

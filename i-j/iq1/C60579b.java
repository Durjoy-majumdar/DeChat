package iq1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C64561mp1;

/* renamed from: iq1.b */
public final class C60579b {

    /* renamed from: a */
    public final Activity f172659a;

    /* renamed from: b */
    public final View f172660b;

    /* renamed from: c */
    public final C64561mp1 f172661c;

    /* renamed from: d */
    public final C60592c f172662d;

    /* renamed from: e */
    public final String f172663e = "Finder.WxaAdUIC";

    /* renamed from: f */
    public ViewGroup f172664f;

    /* renamed from: g */
    public View f172665g;

    /* renamed from: h */
    public View f172666h;

    /* renamed from: i */
    public int f172667i = -1;

    /* renamed from: j */
    public final ArrayList<C13604l<TextView, View>> f172668j;

    /* renamed from: iq1.b$a */
    public static final class C60580a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172669d;

        public C60580a(C60579b bVar) {
            this.f172669d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b.m70761a(this.f172669d, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$b */
    public static final class C60581b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172670d;

        public C60581b(C60579b bVar) {
            this.f172670d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b bVar = this.f172670d;
            Log.m105924i(bVar.f172663e, "doUninterest");
            C60592c cVar = bVar.f172662d;
            int i = bVar.f172667i;
            Log.m105924i(cVar.f172683c, "reportFeedback");
            if (i >= 0 && i < cVar.f172687g.size()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", cVar.f172687g.get(i));
                    jSONObject.put("expTime", cVar.f172686f);
                    jSONObject.put("isClickAd", cVar.f172684d ? 1 : 0);
                    jSONObject.put("clickAdTimeMs", cVar.f172685e);
                    jSONObject.put("feedbackTimeMs", C31543z5.m39453c());
                    cVar.f172689i.put(jSONObject);
                } catch (Throwable th) {
                    Log.printErrStackTrace(cVar.f172683c, th, "reportFeedback", new Object[0]);
                }
            }
            Activity activity = bVar.f172659a;
            C76912y0.m92768g(activity, activity.getResources().getString(C0966R.string.f360463d01));
            bVar.mo85536c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$c */
    public static final class C60582c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172671d;

        public C60582c(C60579b bVar) {
            this.f172671d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b.m70762b(this.f172671d);
            this.f172671d.mo85536c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$d */
    public static final class C60583d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172672d;

        public C60583d(C60579b bVar) {
            this.f172672d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ViewGroup viewGroup = this.f172672d.f172664f;
            if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
                C60579b bVar = this.f172672d;
                Log.m105924i(bVar.f172663e, "showFeedBackFrameOne");
                ViewGroup viewGroup2 = bVar.f172664f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                View view2 = bVar.f172665g;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view4 = bVar.f172666h;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$e */
    public static final class C60584e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172673d;

        public C60584e(C60579b bVar) {
            this.f172673d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f172673d.f172663e, "click root empty");
            this.f172673d.mo85536c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$f */
    public static final class C60585f implements View.OnClickListener {

        /* renamed from: d */
        public static final C60585f f172674d = new C60585f();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$g */
    public static final class C60586g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172675d;

        public C60586g(C60579b bVar) {
            this.f172675d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f172675d.f172663e, "click reason 1");
            C60592c cVar = this.f172675d.f172662d;
            Log.m105924i(cVar.f172683c, "reportFeedback");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", cVar.f172688h);
                jSONObject.put("expTime", cVar.f172686f);
                jSONObject.put("isClickAd", cVar.f172684d ? 1 : 0);
                jSONObject.put("clickAdTimeMs", cVar.f172685e);
                jSONObject.put("feedbackTimeMs", C31543z5.m39453c());
                cVar.f172689i.put(jSONObject);
            } catch (Throwable th) {
                Log.printErrStackTrace(cVar.f172683c, th, "reportFeedbackGood", new Object[0]);
            }
            C60579b bVar = this.f172675d;
            Activity activity = bVar.f172659a;
            C76912y0.m92768g(activity, activity.getResources().getString(C0966R.string.f360463d01));
            bVar.mo85536c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$h */
    public static final class C60587h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172676d;

        public C60587h(C60579b bVar) {
            this.f172676d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f172676d.f172663e, "click reason 2");
            C60579b bVar = this.f172676d;
            ViewGroup viewGroup = bVar.f172664f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            View view2 = bVar.f172665g;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = bVar.f172666h;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            bVar.f172667i = -1;
            View view6 = bVar.f172666h;
            View findViewById = view6 != null ? view6.findViewById(C0966R.C0970id.cy_) : null;
            if (findViewById != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view7 = findViewById;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Iterator<C13604l<TextView, View>> it = bVar.f172668j.iterator();
            while (it.hasNext()) {
                C13604l next = it.next();
                TextView textView = (TextView) next.f38555d;
                if (textView != null) {
                    textView.setTextColor(bVar.f172659a.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                }
                View view8 = (View) next.f38556e;
                if (view8 != null) {
                    view8.setBackgroundResource(C0966R.C0969drawable.f5040uw);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$i */
    public static final class C60588i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172677d;

        public C60588i(C60579b bVar) {
            this.f172677d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b.m70762b(this.f172677d);
            this.f172677d.mo85536c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$j */
    public static final class C60589j implements View.OnClickListener {

        /* renamed from: d */
        public static final C60589j f172678d = new C60589j();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$k */
    public static final class C60590k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172679d;

        public C60590k(C60579b bVar) {
            this.f172679d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b.m70761a(this.f172679d, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: iq1.b$l */
    public static final class C60591l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60579b f172680d;

        public C60591l(C60579b bVar) {
            this.f172680d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60579b.m70761a(this.f172680d, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60579b(android.app.Activity r2, android.view.View r3, te3.C64561mp1 r4, iq1.C60592c r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "miniAppAdInfo"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "reporter"
            gy3.C87412m.m108594g(r5, r0)
            r1.<init>()
            r1.f172659a = r2
            r1.f172660b = r3
            r1.f172661c = r4
            r1.f172662d = r5
            java.lang.String r2 = "Finder.WxaAdUIC"
            r1.f172663e = r2
            r2 = -1
            r1.f172667i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f172668j = r2
            r4 = 2131302348(0x7f0917cc, float:1.822278E38)
            android.view.View r4 = r3.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r1.f172664f = r4
            r5 = 0
            if (r4 == 0) goto L_0x0043
            r0 = 2131302344(0x7f0917c8, float:1.8222771E38)
            android.view.View r4 = r4.findViewById(r0)
            goto L_0x0044
        L_0x0043:
            r4 = r5
        L_0x0044:
            r1.f172665g = r4
            android.view.ViewGroup r4 = r1.f172664f
            if (r4 == 0) goto L_0x0052
            r0 = 2131302345(0x7f0917c9, float:1.8222774E38)
            android.view.View r4 = r4.findViewById(r0)
            goto L_0x0053
        L_0x0052:
            r4 = r5
        L_0x0053:
            r1.f172666h = r4
            r4 = 2131296610(0x7f090162, float:1.8211142E38)
            android.view.View r3 = r3.findViewById(r4)
            iq1.b$d r4 = new iq1.b$d
            r4.<init>(r1)
            r3.setOnClickListener(r4)
            android.view.ViewGroup r3 = r1.f172664f
            if (r3 == 0) goto L_0x0070
            iq1.b$e r4 = new iq1.b$e
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x0070:
            android.view.View r3 = r1.f172665g
            if (r3 == 0) goto L_0x0079
            iq1.b$f r4 = iq1.C60579b.C60585f.f172674d
            r3.setOnClickListener(r4)
        L_0x0079:
            android.view.View r3 = r1.f172665g
            if (r3 == 0) goto L_0x008e
            r4 = 2131311828(0x7f093cd4, float:1.8242007E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x008e
            iq1.b$g r4 = new iq1.b$g
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x008e:
            android.view.View r3 = r1.f172665g
            if (r3 == 0) goto L_0x00a3
            r4 = 2131311832(0x7f093cd8, float:1.8242015E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00a3
            iq1.b$h r4 = new iq1.b$h
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x00a3:
            android.view.View r3 = r1.f172665g
            if (r3 == 0) goto L_0x00b8
            r4 = 2131305180(0x7f0922dc, float:1.8228524E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00b8
            iq1.b$i r4 = new iq1.b$i
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x00b8:
            android.view.View r3 = r1.f172666h
            if (r3 == 0) goto L_0x00c1
            iq1.b$j r4 = iq1.C60579b.C60589j.f172678d
            r3.setOnClickListener(r4)
        L_0x00c1:
            android.view.View r3 = r1.f172666h
            if (r3 == 0) goto L_0x00ed
            r4 = 2131311829(0x7f093cd5, float:1.824201E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00ed
            android.view.View r4 = r1.f172666h
            if (r4 == 0) goto L_0x00dc
            r0 = 2131311830(0x7f093cd6, float:1.8242011E38)
            android.view.View r4 = r4.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L_0x00dd
        L_0x00dc:
            r4 = r5
        L_0x00dd:
            rx3.l r0 = new rx3.l
            r0.<init>(r4, r3)
            r2.add(r0)
            iq1.b$k r4 = new iq1.b$k
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x00ed:
            android.view.View r3 = r1.f172666h
            if (r3 == 0) goto L_0x0119
            r4 = 2131311824(0x7f093cd0, float:1.8242E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x0119
            android.view.View r4 = r1.f172666h
            if (r4 == 0) goto L_0x0108
            r0 = 2131311825(0x7f093cd1, float:1.8242001E38)
            android.view.View r4 = r4.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L_0x0109
        L_0x0108:
            r4 = r5
        L_0x0109:
            rx3.l r0 = new rx3.l
            r0.<init>(r4, r3)
            r2.add(r0)
            iq1.b$l r4 = new iq1.b$l
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x0119:
            android.view.View r3 = r1.f172666h
            if (r3 == 0) goto L_0x0144
            r4 = 2131311822(0x7f093cce, float:1.8241995E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x0144
            android.view.View r4 = r1.f172666h
            if (r4 == 0) goto L_0x0134
            r5 = 2131311823(0x7f093ccf, float:1.8241997E38)
            android.view.View r4 = r4.findViewById(r5)
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x0134:
            rx3.l r4 = new rx3.l
            r4.<init>(r5, r3)
            r2.add(r4)
            iq1.b$a r2 = new iq1.b$a
            r2.<init>(r1)
            r3.setOnClickListener(r2)
        L_0x0144:
            android.view.View r2 = r1.f172666h
            if (r2 == 0) goto L_0x0159
            r3 = 2131302296(0x7f091798, float:1.8222674E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x0159
            iq1.b$b r3 = new iq1.b$b
            r3.<init>(r1)
            r2.setOnClickListener(r3)
        L_0x0159:
            android.view.View r2 = r1.f172666h
            if (r2 == 0) goto L_0x016e
            r3 = 2131305184(0x7f0922e0, float:1.8228532E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x016e
            iq1.b$c r3 = new iq1.b$c
            r3.<init>(r1)
            r2.setOnClickListener(r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iq1.C60579b.<init>(android.app.Activity, android.view.View, te3.mp1, iq1.c):void");
    }

    /* renamed from: a */
    public static final void m70761a(C60579b bVar, int i) {
        String str = bVar.f172663e;
        Log.m105924i(str, "clickUninterest " + i);
        Iterator<C13604l<TextView, View>> it = bVar.f172668j.iterator();
        while (it.hasNext()) {
            C13604l next = it.next();
            TextView textView = (TextView) next.f38555d;
            if (textView != null) {
                textView.setTextColor(bVar.f172659a.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            View view = (View) next.f38556e;
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.f5040uw);
            }
        }
        if (bVar.f172667i == i) {
            bVar.f172667i = -1;
        } else {
            bVar.f172667i = i;
            C13604l lVar = (C13604l) C110818d0.m150917O(bVar.f172668j, i);
            if (lVar != null) {
                TextView textView2 = (TextView) lVar.f38555d;
                if (textView2 != null) {
                    textView2.setTextColor(bVar.f172659a.getResources().getColor(C0966R.color.f2939n));
                }
                View view2 = (View) lVar.f38556e;
                if (view2 != null) {
                    view2.setBackgroundResource(C0966R.C0969drawable.f5041ux);
                }
            }
        }
        if (bVar.f172667i >= 0) {
            View view3 = bVar.f172666h;
            View findViewById = view3 != null ? view3.findViewById(C0966R.C0970id.cy_) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: b */
    public static final void m70762b(C60579b bVar) {
        String str;
        String str2 = bVar.f172663e;
        StringBuilder sb = new StringBuilder();
        sb.append("goExposeUrl ");
        C64561mp1 mp12 = bVar.f172661c;
        sb.append(mp12 != null ? mp12.f184374n : null);
        Log.m105924i(str2, sb.toString());
        Intent intent = new Intent();
        C64561mp1 mp13 = bVar.f172661c;
        if (mp13 == null || (str = mp13.f184374n) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(bVar.f172659a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo85536c() {
        ViewGroup viewGroup = this.f172664f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}

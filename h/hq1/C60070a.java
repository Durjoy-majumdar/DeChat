package hq1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C64561mp1;

/* renamed from: hq1.a */
public final class C60070a {

    /* renamed from: a */
    public final Context f171422a;

    /* renamed from: b */
    public final ViewGroup f171423b;

    /* renamed from: c */
    public final C64561mp1 f171424c;

    /* renamed from: d */
    public final C60090e f171425d;

    /* renamed from: e */
    public final String f171426e = "Finder.FinderLiveAdFeedbackWidget";

    /* renamed from: f */
    public ViewGroup f171427f;

    /* renamed from: g */
    public View f171428g;

    /* renamed from: h */
    public View f171429h;

    /* renamed from: i */
    public ViewGroup f171430i;

    /* renamed from: j */
    public int f171431j = -1;

    /* renamed from: k */
    public final ArrayList<C13604l<TextView, View>> f171432k;

    /* renamed from: l */
    public C32224a<C13598b0> f171433l;

    /* renamed from: hq1.a$a */
    public static final class C60071a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171434d;

        public C60071a(C60070a aVar) {
            this.f171434d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a.m69913a(this.f171434d, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$b */
    public static final class C60072b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171435d;

        public C60072b(C60070a aVar) {
            this.f171435d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a aVar = this.f171435d;
            Log.m105924i(aVar.f171426e, "doUninterest");
            C60090e eVar = aVar.f171425d;
            int i = aVar.f171431j;
            Log.m105924i(eVar.f171462c, "reportFeedback");
            if (i >= 0 && i < eVar.f171468i.size()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", eVar.f171468i.get(i));
                    jSONObject.put("expTime", eVar.f171465f);
                    jSONObject.put("isClickAd", eVar.f171463d ? 1 : 0);
                    jSONObject.put("clickAdTimeMs", eVar.f171464e);
                    jSONObject.put("feedbackTimeMs", C31543z5.m39453c());
                    eVar.f171470k.put(jSONObject);
                } catch (Throwable th) {
                    Log.printErrStackTrace(eVar.f171462c, th, "reportFeedback", new Object[0]);
                }
            }
            Context context = aVar.f171422a;
            C76912y0.m92768g(context, context.getResources().getString(C0966R.string.mm5));
            aVar.mo84932c();
            C32224a<C13598b0> aVar2 = aVar.f171433l;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$c */
    public static final class C60073c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171436d;

        public C60073c(C60070a aVar) {
            this.f171436d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a.m69914b(this.f171436d);
            this.f171436d.mo84932c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$d */
    public static final class C60074d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171437d;

        public C60074d(C60070a aVar) {
            this.f171437d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ViewGroup viewGroup = this.f171437d.f171427f;
            boolean z = false;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z = true;
            }
            if (!z) {
                C60070a aVar = this.f171437d;
                int[] iArr = new int[2];
                aVar.f171423b.getLocationInWindow(iArr);
                int measuredHeight = iArr[1] + aVar.f171423b.getMeasuredHeight();
                ViewGroup viewGroup2 = aVar.f171430i;
                ViewGroup.LayoutParams layoutParams = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = measuredHeight;
                ViewGroup viewGroup3 = aVar.f171430i;
                if (viewGroup3 != null) {
                    viewGroup3.post(new C60083b(aVar));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$e */
    public static final class C60075e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171438d;

        public C60075e(C60070a aVar) {
            this.f171438d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f171438d.f171426e, "click root empty");
            this.f171438d.mo84932c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$f */
    public static final class C60076f implements View.OnClickListener {

        /* renamed from: d */
        public static final C60076f f171439d = new C60076f();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$g */
    public static final class C60077g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171440d;

        public C60077g(C60070a aVar) {
            this.f171440d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f171440d.f171426e, "click reason 1");
            C60090e eVar = this.f171440d.f171425d;
            Log.m105924i(eVar.f171462c, "reportFeedback");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", eVar.f171469j);
                jSONObject.put("expTime", eVar.f171465f);
                jSONObject.put("isClickAd", eVar.f171463d ? 1 : 0);
                jSONObject.put("clickAdTimeMs", eVar.f171464e);
                jSONObject.put("feedbackTimeMs", C31543z5.m39453c());
                eVar.f171470k.put(jSONObject);
            } catch (Throwable th) {
                Log.printErrStackTrace(eVar.f171462c, th, "reportFeedbackGood", new Object[0]);
            }
            C60070a aVar = this.f171440d;
            Context context = aVar.f171422a;
            C76912y0.m92768g(context, context.getResources().getString(C0966R.string.mm5));
            aVar.mo84932c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$h */
    public static final class C60078h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171441d;

        public C60078h(C60070a aVar) {
            this.f171441d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f171441d.f171426e, "click reason 2");
            C60070a aVar = this.f171441d;
            ViewGroup viewGroup = aVar.f171427f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            View view2 = aVar.f171428g;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = aVar.f171429h;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            aVar.f171431j = -1;
            View view6 = aVar.f171429h;
            View findViewById = view6 != null ? view6.findViewById(C0966R.C0970id.cy_) : null;
            if (findViewById != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view7 = findViewById;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Iterator<C13604l<TextView, View>> it = aVar.f171432k.iterator();
            while (it.hasNext()) {
                C13604l next = it.next();
                TextView textView = (TextView) next.f38555d;
                if (textView != null) {
                    textView.setTextColor(aVar.f171422a.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                }
                View view8 = (View) next.f38556e;
                if (view8 != null) {
                    view8.setBackgroundResource(C0966R.C0969drawable.cio);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$i */
    public static final class C60079i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171442d;

        public C60079i(C60070a aVar) {
            this.f171442d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a.m69914b(this.f171442d);
            this.f171442d.mo84932c();
            C32224a<C13598b0> aVar = this.f171442d.f171433l;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$j */
    public static final class C60080j implements View.OnClickListener {

        /* renamed from: d */
        public static final C60080j f171443d = new C60080j();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$k */
    public static final class C60081k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171444d;

        public C60081k(C60070a aVar) {
            this.f171444d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a.m69913a(this.f171444d, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hq1.a$l */
    public static final class C60082l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60070a f171445d;

        public C60082l(C60070a aVar) {
            this.f171445d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60070a.m69913a(this.f171445d, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60070a(Context context, ViewGroup viewGroup, C64561mp1 mp12, C60090e eVar) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(mp12, "miniAppAdInfo");
        C87412m.m108594g(eVar, "reporter");
        this.f171422a = context;
        this.f171423b = viewGroup;
        this.f171424c = mp12;
        this.f171425d = eVar;
        ArrayList<C13604l<TextView, View>> arrayList = new ArrayList<>();
        this.f171432k = arrayList;
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View decorView = ((AppCompatActivity) context2).getWindow().getDecorView();
        C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        View inflate = View.inflate(context, C0966R.C0971layout.f359698cy1, (ViewGroup) decorView);
        this.f171427f = (ViewGroup) inflate.findViewById(C0966R.C0970id.czp);
        this.f171430i = (ViewGroup) inflate.findViewById(C0966R.C0970id.n7i);
        this.f171428g = inflate.findViewById(C0966R.C0970id.czl);
        this.f171429h = inflate.findViewById(C0966R.C0970id.czm);
        viewGroup.findViewById(C0966R.C0970id.f5530hj).setOnClickListener(new C60074d(this));
        ViewGroup viewGroup2 = this.f171427f;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new C60075e(this));
        }
        View view = this.f171428g;
        if (view != null) {
            view.setOnClickListener(C60076f.f171439d);
        }
        View view2 = this.f171428g;
        if (!(view2 == null || (findViewById8 = view2.findViewById(C0966R.C0970id.iep)) == null)) {
            findViewById8.setOnClickListener(new C60077g(this));
        }
        View view3 = this.f171428g;
        if (!(view3 == null || (findViewById7 = view3.findViewById(C0966R.C0970id.ies)) == null)) {
            findViewById7.setOnClickListener(new C60078h(this));
        }
        View view4 = this.f171428g;
        if (!(view4 == null || (findViewById6 = view4.findViewById(C0966R.C0970id.eeu)) == null)) {
            findViewById6.setOnClickListener(new C60079i(this));
        }
        View view5 = this.f171429h;
        if (view5 != null) {
            view5.setOnClickListener(C60080j.f171443d);
        }
        View view6 = this.f171429h;
        TextView textView = null;
        if (!(view6 == null || (findViewById5 = view6.findViewById(C0966R.C0970id.ieq)) == null)) {
            View view7 = this.f171429h;
            arrayList.add(new C13604l(view7 != null ? (TextView) view7.findViewById(C0966R.C0970id.ier) : null, findViewById5));
            findViewById5.setOnClickListener(new C60081k(this));
        }
        View view8 = this.f171429h;
        if (!(view8 == null || (findViewById4 = view8.findViewById(C0966R.C0970id.ien)) == null)) {
            View view9 = this.f171429h;
            arrayList.add(new C13604l(view9 != null ? (TextView) view9.findViewById(C0966R.C0970id.ieo) : null, findViewById4));
            findViewById4.setOnClickListener(new C60082l(this));
        }
        View view10 = this.f171429h;
        if (!(view10 == null || (findViewById3 = view10.findViewById(C0966R.C0970id.iel)) == null)) {
            View view11 = this.f171429h;
            arrayList.add(new C13604l(view11 != null ? (TextView) view11.findViewById(C0966R.C0970id.iem) : textView, findViewById3));
            findViewById3.setOnClickListener(new C60071a(this));
        }
        View view12 = this.f171429h;
        if (!(view12 == null || (findViewById2 = view12.findViewById(C0966R.C0970id.cy_)) == null)) {
            findViewById2.setOnClickListener(new C60072b(this));
        }
        View view13 = this.f171429h;
        if (view13 != null && (findViewById = view13.findViewById(C0966R.C0970id.eev)) != null) {
            findViewById.setOnClickListener(new C60073c(this));
        }
    }

    /* renamed from: a */
    public static final void m69913a(C60070a aVar, int i) {
        String str = aVar.f171426e;
        Log.m105924i(str, "clickUninterest " + i);
        Iterator<C13604l<TextView, View>> it = aVar.f171432k.iterator();
        while (it.hasNext()) {
            C13604l next = it.next();
            TextView textView = (TextView) next.f38555d;
            if (textView != null) {
                textView.setTextColor(aVar.f171422a.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            View view = (View) next.f38556e;
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.cio);
            }
        }
        if (aVar.f171431j == i) {
            aVar.f171431j = -1;
        } else {
            aVar.f171431j = i;
            C13604l lVar = (C13604l) C110818d0.m150917O(aVar.f171432k, i);
            if (lVar != null) {
                TextView textView2 = (TextView) lVar.f38555d;
                if (textView2 != null) {
                    textView2.setTextColor(aVar.f171422a.getResources().getColor(C0966R.color.f2939n));
                }
                View view2 = (View) lVar.f38556e;
                if (view2 != null) {
                    view2.setBackgroundResource(C0966R.C0969drawable.cip);
                }
            }
        }
        if (aVar.f171431j >= 0) {
            View view3 = aVar.f171429h;
            View findViewById = view3 != null ? view3.findViewById(C0966R.C0970id.cy_) : null;
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: b */
    public static final void m69914b(C60070a aVar) {
        String str;
        String str2 = aVar.f171426e;
        StringBuilder sb = new StringBuilder();
        sb.append("goExposeUrl ");
        C64561mp1 mp12 = aVar.f171424c;
        sb.append(mp12 != null ? mp12.f184374n : null);
        Log.m105924i(str2, sb.toString());
        Intent intent = new Intent();
        C64561mp1 mp13 = aVar.f171424c;
        if (mp13 == null || (str = mp13.f184374n) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(aVar.f171422a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo84932c() {
        ViewGroup viewGroup = this.f171427f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}

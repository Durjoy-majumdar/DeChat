package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import l31.C10460a;
import l31.C61212e;
import nj3.C76901s0;
import o40.C61926c;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C64750uh0;
import te3.C64772vh0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow */
public final class FinderAdFeedbackWindow extends C76901s0 {

    /* renamed from: f */
    public final Context f161998f;

    /* renamed from: g */
    public final long f161999g;

    /* renamed from: h */
    public final long f162000h;

    /* renamed from: i */
    public final int f162001i;

    /* renamed from: j */
    public final C64772vh0 f162002j;

    /* renamed from: n */
    public final C32226l<Long, C13598b0> f162003n;

    /* renamed from: o */
    public int f162004o = 3;

    /* renamed from: p */
    public TextView f162005p;

    /* renamed from: q */
    public TextView f162006q;

    /* renamed from: r */
    public TextView f162007r;

    /* renamed from: s */
    public final List<C64750uh0> f162008s = new ArrayList();

    /* renamed from: t */
    public boolean f162009t;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow$a */
    public static final class C56547a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderAdFeedbackWindow f162011a;

        /* renamed from: b */
        public final /* synthetic */ String f162012b;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow$a$a */
        public static final class C56548a extends C87413o implements C32226l<C64750uh0, CharSequence> {

            /* renamed from: d */
            public static final C56548a f162013d = new C56548a();

            public C56548a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C64750uh0 uh02 = (C64750uh0) obj;
                C87412m.m108594g(uh02, LocaleUtil.ITALIAN);
                String str = uh02.f185741e;
                return str == null ? "" : str;
            }
        }

        public C56547a(FinderAdFeedbackWindow finderAdFeedbackWindow, String str) {
            this.f162011a = finderAdFeedbackWindow;
            this.f162012b = str;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[8];
            lVarArr[0] = new C13604l("comment_id", C61926c.m72691p(this.f162011a.f162000h));
            lVarArr[1] = new C13604l("report_extra_data", this.f162012b);
            lVarArr[2] = new C13604l("unexpose_reason", Integer.valueOf(C87412m.m108589b(str, "view_unexp") ? this.f162011a.f162004o : 0));
            lVarArr[3] = new C13604l("close_ad_comment_reason", C112551y.m153814n(C110818d0.m150921S(this.f162011a.f162008s, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C56548a.f162013d, 31, (Object) null), ",", ";", false));
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f162011a.f161998f);
            Integer num = null;
            lVarArr[4] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C13442s8 f2 = aVar.mo12873f(this.f162011a.f161998f);
            lVarArr[5] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            C13442s8 f3 = aVar.mo12873f(this.f162011a.f161998f);
            lVarArr[6] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C13442s8 f4 = aVar.mo12873f(this.f162011a.f161998f);
            if (f4 != null) {
                num = Integer.valueOf(f4.f38096i);
            }
            lVarArr[7] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow$b */
    public static final class C56549b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderAdFeedbackWindow f162014d;

        public C56549b(FinderAdFeedbackWindow finderAdFeedbackWindow) {
            this.f162014d = finderAdFeedbackWindow;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderAdFeedbackWindow finderAdFeedbackWindow = this.f162014d;
            Context context = finderAdFeedbackWindow.f161998f;
            long j = finderAdFeedbackWindow.f162002j.f185887e;
            C87412m.m108594g(context, "context");
            String format = String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", Arrays.copyOf(new Object[]{C61926c.m72691p(j)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", format);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            FinderAdFeedbackWindow finderAdFeedbackWindow2 = this.f162014d;
            finderAdFeedbackWindow2.f162004o = 4;
            finderAdFeedbackWindow2.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAdFeedbackWindow(Context context, long j, long j2, int i, C64772vh0 vh02, C32226l<? super Long, C13598b0> lVar) {
        super(context);
        Window window;
        Context context2 = context;
        C64772vh0 vh03 = vh02;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(vh03, "advertisementInfo");
        this.f161998f = context2;
        this.f161999g = j;
        this.f162000h = j2;
        this.f162001i = i;
        this.f162002j = vh03;
        this.f162003n = lVar;
        Activity activity = null;
        setContentView(LayoutInflater.from(context).inflate(C0966R.C0971layout.d9j, (ViewGroup) null));
        String str = vh03.f185889g;
        str = str == null ? "" : str;
        View contentView = getContentView();
        C87412m.m108593f(contentView, "contentView");
        C10460a.m10392a(contentView, "ad_comment_feedback");
        View contentView2 = getContentView();
        C87412m.m108593f(contentView2, "contentView");
        ((C61212e) C86312j.m106911c(C61212e.class)).E60(contentView2, new C56547a(this, str));
        View contentView3 = getContentView();
        C87412m.m108593f(contentView3, "contentView");
        C10460a.m10394c(contentView3, 160, 25496);
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context2 instanceof MMActivity) {
            ((MMActivity) context2).getLifecycle().addObserver(new C0124r(this) {

                /* renamed from: d */
                public final /* synthetic */ FinderAdFeedbackWindow f162010d;

                {
                    this.f162010d = r1;
                }

                @C112974b0(C39623j.C39625b.ON_DESTROY)
                public final void onDestroy() {
                    this.f162010d.dismiss();
                    ((MMActivity) this.f162010d.f161998f).getLifecycle().removeObserver(this);
                }
            });
        }
        View findViewById = getContentView().findViewById(C0966R.C0970id.nrw);
        C87412m.m108593f(findViewById, "contentView.findViewById…iew>(R.id.feedback_title)");
        this.f162005p = (TextView) findViewById;
        View findViewById2 = getContentView().findViewById(C0966R.C0970id.oer);
        C87412m.m108593f(findViewById2, "contentView.findViewById…ew>(R.id.feedback_title2)");
        this.f162006q = (TextView) findViewById2;
        View findViewById3 = getContentView().findViewById(C0966R.C0970id.ojw);
        C87412m.m108593f(findViewById3, "contentView.findViewById…ew>(R.id.feedback_title3)");
        this.f162007r = (TextView) findViewById3;
        this.f162005p.setVisibility(0);
        this.f162006q.setVisibility(0);
        this.f162007r.setVisibility(8);
        this.f162005p.setText(context.getResources().getString(C0966R.string.ncw));
        this.f162006q.setText(context.getResources().getString(C0966R.string.ncv));
        FlowLayout flowLayout = (FlowLayout) getContentView().findViewById(C0966R.C0970id.ohp);
        View findViewById4 = getContentView().findViewById(C0966R.C0970id.eeu);
        View findViewById5 = getContentView().findViewById(C0966R.C0970id.olm);
        ((TextView) getContentView().findViewById(C0966R.C0970id.mly)).setVisibility(8);
        flowLayout.removeAllViews();
        String string = context.getResources().getString(C0966R.string.f8066dg);
        C87412m.m108593f(string, LocaleUtil.ITALIAN);
        View a = mo79672a(string, 1);
        flowLayout.addView(a);
        a.setOnClickListener(new C56591d0(a, this));
        String string2 = context.getResources().getString(C0966R.string.f8064cy);
        C87412m.m108593f(string2, LocaleUtil.ITALIAN);
        View a2 = mo79672a(string2, 0);
        flowLayout.addView(a2);
        a2.setOnClickListener(new C56596e0(a2, this));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById5;
        C117292a.m165358d(findViewById4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentView().findViewById(C0966R.C0970id.eeu).setOnClickListener(new C56549b(this));
        activity = context2 instanceof Activity ? (Activity) context2 : activity;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(2);
        }
    }

    /* renamed from: a */
    public final View mo79672a(String str, int i) {
        View inflate = C85868k2.m106137b(this.f161998f).inflate(C0966R.C0971layout.d9i, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ohq);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.oo4);
        if (i == 0) {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(this.f161998f.getResources().getDrawable(C0966R.raw.finder_ad_feedback_no_interesting));
            weImageView.setIconColor(this.f161998f.getResources().getColor(C0966R.color.FG_0));
        } else if (i != 1) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(this.f161998f.getResources().getDrawable(C0966R.raw.finder_ad_feedback_approve));
            weImageView.setIconColor(this.f161998f.getResources().getColor(C0966R.color.FG_0));
        }
        textView.setText(str);
        return inflate;
    }

    /* renamed from: b */
    public final void mo79673b(TextView textView) {
        if (Util.isNullOrNil((List) this.f162008s)) {
            textView.setText(this.f161998f.getResources().getString(C0966R.string.f8063cx));
            textView.setBackground(this.f161998f.getResources().getDrawable(C0966R.C0969drawable.f4659ja));
            textView.setTextColor(this.f161998f.getResources().getColor(C0966R.color.FG_0));
            return;
        }
        textView.setText(this.f161998f.getResources().getString(C0966R.string.f8062cu));
        textView.setBackground(this.f161998f.getResources().getDrawable(C0966R.C0969drawable.f4653j6));
        textView.setTextColor(this.f161998f.getResources().getColor(C0966R.color.f2929c));
    }

    public void dismiss() {
        super.dismiss();
        if (this.f162004o == 0) {
            this.f162004o = 3;
        }
    }
}

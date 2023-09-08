package z03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gc0.C20828a;
import j20.C117292a;
import java.util.Iterator;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import o03.C21724i;
import p03.C21912d;
import p03.C21914h;
import p03.C47419f;
import t03.C22426h;
import te3.C49768hy;
import te3.e54;
import te3.uh4;
import te3.xh4;
import u73.C101987v0;
import v73.C102158a;
import x03.C22947b;
import x03.C22951f;
import x03.C22953h;
import x03.C22974q;

/* renamed from: z03.k */
public class C23449k extends C22953h implements C23422a {

    /* renamed from: D */
    public C22951f f67223D;

    /* renamed from: E */
    public FrameLayout f67224E;

    /* renamed from: F */
    public ImageView f67225F;

    /* renamed from: G */
    public View f67226G;

    /* renamed from: H */
    public View f67227H;

    /* renamed from: I */
    public View f67228I;

    /* renamed from: J */
    public View f67229J;

    /* renamed from: K */
    public ImageView f67230K;

    /* renamed from: L */
    public TextView f67231L;

    /* renamed from: M */
    public TextView f67232M;

    /* renamed from: N */
    public TextView f67233N;

    /* renamed from: P */
    public View f67234P;

    /* renamed from: Q */
    public View f67235Q;

    /* renamed from: Q0 */
    public ImageView f67236Q0;

    /* renamed from: R */
    public View f67237R;

    /* renamed from: R0 */
    public ImageView f67238R0;

    /* renamed from: S */
    public View f67239S;

    /* renamed from: S0 */
    public boolean f67240S0;

    /* renamed from: T */
    public View f67241T;

    /* renamed from: U */
    public View f67242U;

    /* renamed from: V */
    public TextView f67243V;

    /* renamed from: W */
    public View f67244W;

    /* renamed from: X */
    public View f67245X;

    /* renamed from: Y */
    public View f67246Y;

    /* renamed from: Z */
    public TextView f67247Z;

    /* renamed from: p0 */
    public TextView f67248p0;

    /* renamed from: x0 */
    public TextView f67249x0;

    /* renamed from: y0 */
    public ImageView f67250y0;

    public C23449k(View view, C23423b bVar, boolean z) {
        super(view, bVar);
        this.f67240S0 = z;
    }

    /* renamed from: A */
    public void mo36116A() {
        super.mo36116A();
        this.f67241T.animate().cancel();
        this.f67239S.animate().cancel();
        View view = this.f67241T;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f67239S;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: B */
    public void mo36164B(View view) {
        Class cls = C21912d.class;
        if (view.getId() == this.f67233N.getId()) {
            xh4 xh4 = this.f65949A;
            if (xh4 != null && !Util.isNullOrNil(xh4.f64745z)) {
                String str = this.f65949A.f64745z;
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                C88144b.m109791i(this.f65952z.mo24990t(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
                if (this.f65952z.mo24995y5().f66031e) {
                    this.f67223D.getClass();
                    this.f65952z.mo24995y5().mo36216h();
                }
                this.f65952z.mo24967U2().mo36206d(this.f65949A);
                ((C21724i) ((C21912d) C86312j.m106911c(cls)).av0()).mo34016a(this.f65952z.mo24989r4(), this.f65949A, mo36118Z(), 1, "");
            }
        } else if (view.getId() == this.f67228I.getId()) {
            C102158a.m134600a(8);
            C22947b bVar = this.f65952z;
            mo36170H(bVar, bVar.mo24990t(), this.f67223D, mo36118Z());
        } else if (view.getId() == this.f67227H.getId()) {
            this.f65952z.mo24994x5(this.f67227H, mo36118Z());
        } else if (view.getId() == this.f67247Z.getId() || view.getId() == this.f67248p0.getId()) {
            boolean z = true;
            this.f65952z.mo24973X4().f65982a = true;
            this.f65952z.mo24995y5().mo36221m();
            this.f67223D.mo36156l();
            e54 e54 = (e54) view.getTag();
            uh4 a = C21914h.m25153a(this.f65952z.mo24989r4());
            a.f64648r = UUID.randomUUID().toString();
            a.f64637d = this.f65949A.f64729h;
            a.f64641h = e54.f63772f;
            a.f64645o = null;
            a.f64646p = e54;
            a.f64654x = this.f65952z.mo24978b();
            a.f64650t = this.f65952z.mo24973X4().f65982a;
            Iterator<C49768hy> it = a.f64647q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C49768hy next = it.next();
                if ("show_tag_list".equals(next.f134951d)) {
                    next.f134953f = e54.f63770d;
                    break;
                }
            }
            if (!z) {
                C49768hy hyVar = new C49768hy();
                hyVar.f134951d = "show_tag_list";
                hyVar.f134953f = e54.f63770d;
                a.f64647q.add(hyVar);
            }
            C101987v0.m134279m(this.f65952z.mo24990t(), a, 10001);
            C102158a.m134600a(28);
            C47419f av02 = ((C21912d) C86312j.m106911c(cls)).av0();
            uh4 r4 = this.f65952z.mo24989r4();
            xh4 xh42 = this.f65949A;
            int Z = mo36118Z();
            ((C21724i) av02).mo34016a(r4, xh42, Z, 4, e54.f63771e + XVFSFile.PATH_SEPARATOR + e54.f63770d);
        } else if (view.getId() == this.f67225F.getId() || view.getId() == this.f67232M.getId() || view.getId() == this.f67234P.getId()) {
            if (C22974q.m27138h(this.f65949A, this.f65952z.mo24990t())) {
                ((C21724i) ((C21912d) C86312j.m106911c(cls)).av0()).mo34016a(this.f65952z.mo24989r4(), this.f65949A, mo36118Z(), 3, "");
            }
        } else if (view.getId() == this.f67229J.getId()) {
            this.f65952z.mo24985h7(this.f65949A, view);
            if (this.f65949A.f64716R) {
                this.f67230K.setImageResource(C0966R.raw.top_story_wow_selected);
                TextView textView = this.f67231L;
                textView.setTextColor(textView.getResources().getColor(C0966R.color.ahc));
                return;
            }
            this.f67230K.setImageResource(C0966R.raw.top_story_wow_unselected);
            TextView textView2 = this.f67231L;
            textView2.setTextColor(textView2.getResources().getColor(C0966R.color.al_));
        }
    }

    /* renamed from: C */
    public void mo36165C(View view) {
        if ((1 >= Log.getLogLevel()) && view.getId() == this.f67233N.getId()) {
            this.f65952z.mo24995y5().f66034h = true;
        }
        super.mo36165C(view);
    }

    /* renamed from: D */
    public void mo36166D(View view) {
        View view2 = view;
        this.f67224E = (FrameLayout) view2.findViewById(C0966R.C0970id.l7y);
        this.f67225F = (ImageView) view2.findViewById(C0966R.C0970id.jyo);
        this.f67232M = (TextView) view2.findViewById(C0966R.C0970id.jyt);
        this.f67233N = (TextView) view2.findViewById(C0966R.C0970id.kpm);
        this.f67234P = view2.findViewById(C0966R.C0970id.jyn);
        this.f67228I = view2.findViewById(C0966R.C0970id.ji6);
        this.f67229J = view2.findViewById(C0966R.C0970id.lrj);
        this.f67230K = (ImageView) view2.findViewById(C0966R.C0970id.lri);
        this.f67231L = (TextView) view2.findViewById(C0966R.C0970id.lrh);
        this.f67226G = view2.findViewById(C0966R.C0970id.gzd);
        this.f67227H = view2.findViewById(C0966R.C0970id.gzq);
        this.f67242U = view2.findViewById(C0966R.C0970id.ahx);
        this.f67243V = (TextView) view2.findViewById(C0966R.C0970id.agn);
        this.f67244W = view2.findViewById(C0966R.C0970id.kdd);
        this.f67245X = view2.findViewById(C0966R.C0970id.kdh);
        this.f67246Y = view2.findViewById(C0966R.C0970id.kdl);
        this.f67247Z = (TextView) view2.findViewById(C0966R.C0970id.kde);
        this.f67248p0 = (TextView) view2.findViewById(C0966R.C0970id.kdi);
        this.f67249x0 = (TextView) view2.findViewById(C0966R.C0970id.kdm);
        this.f67250y0 = (ImageView) view2.findViewById(C0966R.C0970id.kdc);
        this.f67236Q0 = (ImageView) view2.findViewById(C0966R.C0970id.kdg);
        this.f67238R0 = (ImageView) view2.findViewById(C0966R.C0970id.kdk);
        this.f67237R = view2.findViewById(C0966R.C0970id.afy);
        this.f67239S = view2.findViewById(C0966R.C0970id.eux);
        this.f67241T = view2.findViewById(C0966R.C0970id.eda);
        this.f67235Q = view2.findViewById(C0966R.C0970id.ed7);
        if (this.f67240S0) {
            View view3 = this.f67242U;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view5 = this.f67242U;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: E */
    public boolean mo36167E() {
        return (this.f67241T.getAlpha() == 0.0f || this.f67239S.getAlpha() == 0.0f) ? false : true;
    }

    /* renamed from: F */
    public void mo36168F() {
        if (!Util.isNullOrNil(this.f65949A.f64725d)) {
            this.f67233N.setText(this.f65949A.f64725d);
            this.f67233N.setVisibility(0);
            this.f67233N.requestLayout();
        } else {
            this.f67233N.setVisibility(8);
        }
        this.f67233N.setOnClickListener(this.f65950B);
        this.f67232M.setText(this.f65949A.f64739t);
        if (C22974q.m27136f(this.f65949A)) {
            View view = this.f67234P;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view2 = this.f67234P;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f67225F.setOnClickListener(this.f65950B);
        this.f67232M.setOnClickListener(this.f65950B);
        this.f67234P.setOnClickListener(this.f65950B);
        if (!Util.isNullOrNil(this.f65949A.f64702C)) {
            C20828a.m22825b().mo32519h(this.f65949A.f64702C, this.f67225F, C22426h.f63540a);
        } else {
            this.f67225F.setImageResource(C0966R.C0969drawable.bfa);
        }
        if (this.f65952z.mo24980d4()) {
            View view4 = this.f67228I;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f67228I.setOnClickListener(this.f65950B);
        } else {
            View view5 = this.f67228I;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f65952z.mo24952K6()) {
            this.f67227H.setTag(this.f65949A);
            this.f67227H.setOnClickListener(this.f65950B);
            View view7 = this.f67227H;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f67226G;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view11 = this.f67227H;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view12 = this.f67226G;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view13 = view12;
            C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f67227H.setTag(this.f65949A);
        this.f67227H.setOnClickListener(this.f65950B);
        this.f67235Q.setOnClickListener(this.f65950B);
        View view14 = this.f67237R;
        C9556a aVar9 = new C9556a();
        aVar9.mo10233c(0);
        View view15 = view14;
        C117292a.m165358d(view15, aVar9.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
        C117292a.m165359e(view15, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view16 = this.f67239S;
        C9556a aVar10 = new C9556a();
        aVar10.mo10233c(0);
        View view17 = view16;
        C117292a.m165358d(view17, aVar10.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
        C117292a.m165359e(view17, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view18 = this.f67241T;
        C9556a aVar11 = new C9556a();
        aVar11.mo10233c(0);
        C117292a.m165358d(view18, aVar11.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view18.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
        C117292a.m165359e(view18, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f67223D == null) {
            this.f67223D = new C23433i(this.f65952z.mo24990t(), this.f65952z, this);
            this.f67224E.removeAllViews();
            FrameLayout frameLayout = this.f67224E;
            C22951f fVar = this.f67223D;
            Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "lxl getVideoViewLayoutParams: %s, %s", Integer.valueOf(this.f65952z.getVideoWidth()), Integer.valueOf(this.f65952z.getVideoHeight()));
            frameLayout.addView(fVar, new FrameLayout.LayoutParams(this.f65952z.getVideoWidth(), this.f65952z.getVideoHeight()));
        }
        this.f67223D.mo36163s(this.f65949A, mo36118Z());
        if (this.f65952z.mo24981e2() == mo36118Z()) {
            super.mo36117Y();
        }
        this.f67243V.setText(this.f65949A.f64734p);
        if (!this.f67240S0 || this.f65949A.f64703D.size() <= 0) {
            View view19 = this.f67242U;
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(8);
            View view20 = view19;
            C117292a.m165358d(view20, aVar12.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view21 = this.f67242U;
            C9556a aVar13 = new C9556a();
            aVar13.mo10233c(0);
            View view22 = view21;
            C117292a.m165358d(view22, aVar13.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view21.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view22, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e54 e54 = this.f65949A.f64703D.get(0);
            this.f67247Z.setTag(e54);
            this.f67247Z.setText(e54.f63771e);
            this.f67247Z.setVisibility(0);
            this.f67247Z.setOnClickListener(this.f65950B);
            View view23 = this.f67244W;
            C9556a aVar14 = new C9556a();
            aVar14.mo10233c(0);
            View view24 = view23;
            C117292a.m165358d(view24, aVar14.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view23.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view24, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f67250y0.setVisibility(8);
            if (!Util.isNullOrNil(e54.f63777n)) {
                C20828a.m22825b().mo32519h(e54.f63777n, this.f67250y0, C22426h.f63541b);
                this.f67250y0.setVisibility(0);
            }
            if (this.f65949A.f64703D.size() > 1) {
                e54 e542 = this.f65949A.f64703D.get(1);
                this.f67248p0.setTag(e542);
                this.f67248p0.setText(e542.f63771e);
                this.f67248p0.setOnClickListener(this.f65950B);
                this.f67248p0.setVisibility(0);
                View view25 = this.f67245X;
                C9556a aVar15 = new C9556a();
                aVar15.mo10233c(0);
                C117292a.m165358d(view25, aVar15.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                C117292a.m165359e(view25, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f67236Q0.setVisibility(8);
                if (!Util.isNullOrNil(e542.f63777n)) {
                    C20828a.m22825b().mo32519h(e542.f63777n, this.f67236Q0, C22426h.f63541b);
                    this.f67236Q0.setVisibility(0);
                }
            } else {
                View view26 = this.f67245X;
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(8);
                C117292a.m165358d(view26, aVar16.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view26.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                C117292a.m165359e(view26, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f67248p0.setVisibility(8);
            }
            if (this.f65949A.f64703D.size() > 2) {
                e54 e543 = this.f65949A.f64703D.get(2);
                this.f67249x0.setTag(e543);
                this.f67249x0.setText(e543.f63771e);
                this.f67249x0.setOnClickListener(this.f65950B);
                this.f67249x0.setVisibility(0);
                View view27 = this.f67246Y;
                C9556a aVar17 = new C9556a();
                aVar17.mo10233c(0);
                C117292a.m165358d(view27, aVar17.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                C117292a.m165359e(view27, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f67238R0.setVisibility(8);
                if (!Util.isNullOrNil(e543.f63777n)) {
                    C20828a.m22825b().mo32519h(e543.f63777n, this.f67238R0, C22426h.f63541b);
                    this.f67238R0.setVisibility(0);
                }
            } else {
                View view28 = this.f67246Y;
                C9556a aVar18 = new C9556a();
                aVar18.mo10233c(8);
                C117292a.m165358d(view28, aVar18.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view28.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                C117292a.m165359e(view28, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f67249x0.setVisibility(8);
            }
        }
        if (this.f65952z.mo24981e2() != mo36118Z()) {
            mo36909K();
        }
        if ((this.f65949A.f64711L & 128) > 0) {
            View view29 = this.f67229J;
            C9556a aVar19 = new C9556a();
            aVar19.mo10233c(0);
            View view30 = view29;
            C117292a.m165358d(view30, aVar19.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view29.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
            C117292a.m165359e(view30, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f67229J.setOnClickListener(this.f65950B);
            if (this.f65949A.f64716R) {
                this.f67230K.setImageResource(C0966R.raw.top_story_wow_selected);
                TextView textView = this.f67231L;
                textView.setTextColor(textView.getResources().getColor(C0966R.color.ahc));
            } else {
                this.f67230K.setImageResource(C0966R.raw.top_story_wow_unselected);
                TextView textView2 = this.f67231L;
                textView2.setTextColor(textView2.getResources().getColor(C0966R.color.al_));
            }
            this.f67231L.setText(C22426h.m26105g(this.f65949A.f64722X));
            return;
        }
        View view31 = this.f67229J;
        C9556a aVar20 = new C9556a();
        aVar20.mo10233c(8);
        C117292a.m165358d(view31, aVar20.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view31.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
        C117292a.m165359e(view31, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I */
    public void mo36171I(boolean z) {
        super.mo36171I(z);
        mo36908J();
        this.f65952z.mo24992x1(mo36118Z());
        if (this.f67223D.mo36160p(z, false)) {
            mo36116A();
            super.mo36117Y();
        }
    }

    /* renamed from: J */
    public void mo36908J() {
        Log.m105919d("MicroMsg.TopStory.TopStoryListVideoItemHolder", "hideMaskView %d", Integer.valueOf(hashCode()));
        this.f67241T.animate().cancel();
        this.f67239S.animate().cancel();
        this.f67237R.animate().cancel();
        View view = this.f67237R;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view3 = this.f67241T;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view5 = this.f67239S;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Float.valueOf(0.0f));
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: K */
    public void mo36909K() {
        Log.m105919d("MicroMsg.TopStory.TopStoryListVideoItemHolder", "showMaskView %d", Integer.valueOf(hashCode()));
        this.f67241T.animate().cancel();
        this.f67239S.animate().cancel();
        this.f67237R.animate().cancel();
        View view = this.f67237R;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.8f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view3 = this.f67241T;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.8f));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view5 = this.f67239S;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Float.valueOf(0.8f));
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: Y */
    public void mo36117Y() {
        super.mo36117Y();
    }

    /* renamed from: y */
    public C22951f mo36172y() {
        return this.f67223D;
    }

    /* renamed from: z */
    public View mo36173z() {
        return this.f67229J;
    }
}

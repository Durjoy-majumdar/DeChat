package y03;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import r03.C22193b;
import t03.C22422f;
import t03.C22426h;
import te3.e54;
import te3.xh4;
import x03.C102530g;
import x03.C22974q;

/* renamed from: y03.j */
public class C23204j extends C102530g {

    /* renamed from: E */
    public View f66613E;

    /* renamed from: F */
    public View f66614F;

    /* renamed from: G */
    public ImageView f66615G;

    /* renamed from: H */
    public TextView f66616H;

    /* renamed from: I */
    public View f66617I;

    /* renamed from: J */
    public View f66618J;

    /* renamed from: K */
    public View f66619K;

    /* renamed from: L */
    public View f66620L;

    /* renamed from: M */
    public View f66621M;

    /* renamed from: N */
    public View f66622N;

    /* renamed from: P */
    public View f66623P;

    /* renamed from: Q */
    public TextView f66624Q;

    /* renamed from: Q0 */
    public C23206b f66625Q0;

    /* renamed from: R */
    public TextView f66626R;

    /* renamed from: R0 */
    public boolean f66627R0;

    /* renamed from: S */
    public ImageView f66628S;

    /* renamed from: T */
    public ImageView f66629T;

    /* renamed from: U */
    public ImageView f66630U;

    /* renamed from: V */
    public TextView f66631V;

    /* renamed from: W */
    public View f66632W;

    /* renamed from: p0 */
    public TextView f66633p0;

    /* renamed from: x0 */
    public MTimerHandler f66634x0;

    /* renamed from: y0 */
    public xh4 f66635y0;

    /* renamed from: y03.j$a */
    public class C23205a implements MTimerHandler.CallBack {
        public C23205a() {
        }

        public boolean onTimerExpired() {
            C23204j.this.mo36667y();
            C23204j.this.f66634x0.stopTimer();
            return false;
        }
    }

    /* renamed from: y03.j$b */
    public interface C23206b {
    }

    public C23204j(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo36651A() {
        MTimerHandler mTimerHandler = this.f66634x0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f66634x0.startTimer(2000);
        }
    }

    /* renamed from: B */
    public void mo36652B() {
        MTimerHandler mTimerHandler = this.f66634x0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: C */
    public void mo36653C(xh4 xh4) {
        xh4 xh42 = xh4;
        this.f66635y0 = xh42;
        View view = this.f66613E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(C0966R.dimen.aad);
        this.f273526j.setTextSize(0, dimensionPixelSize);
        this.f273527n.setTextSize(0, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = this.f66619K.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.aac);
        this.f66619K.setLayoutParams(layoutParams);
        if (xh42.f64703D.size() > 0) {
            View view2 = this.f66620L;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f66621M;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e54 e54 = xh42.f64703D.get(0);
            this.f66622N.setTag(e54);
            this.f66624Q.setText(e54.f63771e);
            this.f66624Q.setVisibility(0);
            View view5 = this.f66622N;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66628S.setVisibility(8);
            if (!Util.isNullOrNil(e54.f63777n)) {
                C20828a.m22825b().mo32519h(e54.f63777n, this.f66628S, C22426h.f63541b);
                this.f66628S.setVisibility(0);
            }
            if (xh42.f64703D.size() > 1) {
                e54 e542 = xh42.f64703D.get(1);
                this.f66623P.setTag(e542);
                this.f66626R.setText(e542.f63771e);
                this.f66626R.setVisibility(0);
                View view6 = this.f66623P;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f66629T.setVisibility(8);
                if (!Util.isNullOrNil(e542.f63777n)) {
                    C20828a.m22825b().mo32519h(e542.f63777n, this.f66629T, C22426h.f63541b);
                    this.f66629T.setVisibility(0);
                }
            } else {
                View view7 = this.f66623P;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f66626R.setVisibility(8);
            }
        } else {
            View view8 = this.f66620L;
            if (view8 != null) {
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view9 = this.f66621M;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo36654D(xh4);
        if (this.f66627R0) {
            View view11 = this.f66621M;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view12 = this.f66632W;
        if (!(view12 == null || this.f66631V == null || this.f66630U == null)) {
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(8);
            View view13 = view12;
            C117292a.m165358d(view13, aVar10.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66631V.setVisibility(8);
            this.f66630U.setVisibility(8);
            if (!Util.isNullOrNil(xh42.f64739t)) {
                this.f66631V.setText(xh42.f64739t);
                this.f66631V.setVisibility(0);
                if (C22974q.m27136f(xh4)) {
                    View view14 = this.f66632W;
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(0);
                    C117292a.m165358d(view14, aVar11.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view14.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil(xh42.f64702C)) {
                    C20828a.m22825b().mo32519h(xh42.f64702C, this.f66630U, C22426h.f63540a);
                } else {
                    this.f66630U.setImageResource(C0966R.C0969drawable.bfa);
                }
                this.f66630U.setVisibility(0);
            }
        }
        TextView textView = this.f66633p0;
        if (textView != null) {
            textView.setText(xh42.f64725d);
        }
    }

    /* renamed from: D */
    public void mo36654D(xh4 xh4) {
        if ((xh4.f64711L & 128) > 0) {
            View view = this.f66614F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (xh4.f64716R) {
                this.f66615G.setImageResource(C0966R.raw.top_story_wow_selected);
                this.f66616H.setTextColor(getResources().getColor(C0966R.color.ahc));
            } else {
                this.f66615G.setImageResource(C0966R.raw.top_story_wow_unselected);
                this.f66616H.setTextColor(getResources().getColor(C0966R.color.al_));
            }
            this.f66616H.setText(C22426h.m26105g(xh4.f64722X));
            return;
        }
        View view3 = this.f66614F;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getBarPointWidth() {
        return this.f273524h.getWidth();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ca6;
    }

    public View getWowView() {
        return this.f66614F;
    }

    /* renamed from: p */
    public void mo36657p() {
        super.mo36657p();
        this.f66617I = this.f273521e.findViewById(C0966R.C0970id.bri);
        this.f66613E = this.f273521e.findViewById(C0966R.C0970id.ji6);
        this.f66614F = this.f273521e.findViewById(C0966R.C0970id.lrj);
        this.f66615G = (ImageView) this.f273521e.findViewById(C0966R.C0970id.lri);
        this.f66616H = (TextView) this.f273521e.findViewById(C0966R.C0970id.lrh);
        this.f66618J = this.f273521e.findViewById(C0966R.C0970id.i84);
        this.f66619K = this.f273521e.findViewById(C0966R.C0970id.f358983i83);
        this.f66620L = this.f273521e.findViewById(C0966R.C0970id.f359344ke1);
        this.f66621M = this.f273521e.findViewById(C0966R.C0970id.ahx);
        this.f66622N = this.f273521e.findViewById(C0966R.C0970id.kdd);
        this.f66623P = this.f273521e.findViewById(C0966R.C0970id.kdh);
        this.f66624Q = (TextView) this.f273521e.findViewById(C0966R.C0970id.kde);
        this.f66626R = (TextView) this.f273521e.findViewById(C0966R.C0970id.kdi);
        this.f66628S = (ImageView) this.f273521e.findViewById(C0966R.C0970id.kdc);
        this.f66629T = (ImageView) this.f273521e.findViewById(C0966R.C0970id.kdg);
        this.f66630U = (ImageView) this.f273521e.findViewById(C0966R.C0970id.jyo);
        this.f66631V = (TextView) this.f273521e.findViewById(C0966R.C0970id.jyt);
        this.f66632W = this.f273521e.findViewById(C0966R.C0970id.jyn);
        this.f66633p0 = (TextView) this.f273521e.findViewById(C0966R.C0970id.kpm);
    }

    /* renamed from: r */
    public void mo36658r() {
        xh4 xh4;
        super.mo36658r();
        C23206b bVar = this.f66625Q0;
        if (bVar != null && (xh4 = this.f66635y0) != null) {
            int i = this.f273529p;
            int videoTotalTime = getVideoTotalTime();
            C23201g gVar = (C23201g) bVar;
            Class cls = C22422f.class;
            boolean z = false;
            int width = videoTotalTime > 0 ? (gVar.f66610a.f65943y.getWidth() * i) / videoTotalTime : 0;
            C22193b bVar2 = gVar.f66610a.getFSVideoUIComponent().mo24967U2().f66025f;
            if (bVar2 != null && bVar2.f62807d < ((long) gVar.f66610a.getFSVideoUIComponent().mo24995y5().mo36211c())) {
                bVar2.f62807d = (long) gVar.f66610a.getFSVideoUIComponent().mo24995y5().mo36211c();
            }
            if (gVar.f66610a.f65920A.mo24995y5().mo36212d()) {
                int c = gVar.f66610a.f65920A.mo24995y5().mo36211c() / 1000;
                if (((C22422f) C86312j.m106911c(cls)).f63534f.containsKey(xh4.f64729h)) {
                    ((C22422f) C86312j.m106911c(cls)).f63534f.put(xh4.f64729h, Integer.valueOf(c));
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.f66610a.f65942x.getLayoutParams();
            layoutParams.width = width;
            gVar.f66610a.f65942x.setLayoutParams(layoutParams);
            gVar.f66610a.f65942x.requestLayout();
            if (gVar.f66610a.f66579G.getVisibility() == 0) {
                z = true;
            }
            if (!z) {
                gVar.f66610a.f66579G.mo36667y();
            }
            if ((xh4.f64711L & 256) <= 0) {
                C23184e eVar = gVar.f66610a;
                eVar.f65920A.mo25015a6(xh4, eVar, i, videoTotalTime);
            }
            C23184e eVar2 = gVar.f66610a;
            eVar2.f65920A.mo25016i6(xh4, eVar2, i, videoTotalTime);
        }
    }

    public void setOnUpdateProgressLenListener(C23206b bVar) {
        this.f66625Q0 = bVar;
    }

    public void setOnlyFS(boolean z) {
        this.f66627R0 = z;
    }

    public void setShareBtnClickListener(View.OnClickListener onClickListener) {
        this.f66613E.setOnClickListener(onClickListener);
    }

    public void setSourceItemClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f66631V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        ImageView imageView = this.f66630U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        View view = this.f66632W;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setTagBtnClickListener(View.OnClickListener onClickListener) {
        this.f66622N.setOnClickListener(onClickListener);
        this.f66623P.setOnClickListener(onClickListener);
    }

    public void setTitleClickListener(View.OnClickListener onClickListener) {
        this.f66633p0.setOnClickListener(onClickListener);
    }

    public void setVisibility(int i) {
        C23206b bVar;
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            C23206b bVar2 = this.f66625Q0;
            if (bVar2 != null) {
                C23201g gVar = (C23201g) bVar2;
                if (!gVar.f66610a.getFSVideoUIComponent().mo24995y5().f66031e || (!gVar.f66610a.getFSVideoUIComponent().mo24995y5().mo36212d() && !gVar.f66610a.getFSVideoUIComponent().mo24995y5().f66032f)) {
                    gVar.f66610a.f65941w.setVisibility(8);
                } else {
                    gVar.f66610a.f65941w.setVisibility(0);
                }
            }
        } else if (i == 0 && (bVar = this.f66625Q0) != null) {
            ((C23201g) bVar).f66610a.f65941w.setVisibility(8);
        }
    }

    public void setWowBtnClickListener(View.OnClickListener onClickListener) {
        View view = this.f66614F;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f66614F.setOnClickListener(onClickListener);
    }

    /* renamed from: y */
    public void mo36667y() {
        setVisibility(8);
    }

    /* renamed from: z */
    public void mo36668z() {
        setVisibility(0);
        this.f273525i.setVisibility(0);
        if (this.f66634x0 == null) {
            this.f66634x0 = new MTimerHandler(new C23205a(), false);
        }
        this.f66634x0.stopTimer();
        this.f66634x0.startTimer(2000);
    }
}

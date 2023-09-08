package z03;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import r03.C22193b;
import t03.C22422f;
import te3.xh4;
import x03.C102530g;

/* renamed from: z03.j */
public class C23446j extends C102530g {

    /* renamed from: E */
    public View f67219E = this.f273521e.findViewById(C0966R.C0970id.egy);

    /* renamed from: F */
    public MTimerHandler f67220F;

    /* renamed from: G */
    public C23448b f67221G;

    /* renamed from: z03.j$a */
    public class C23447a implements MTimerHandler.CallBack {
        public C23447a() {
        }

        public boolean onTimerExpired() {
            C23446j.this.mo36667y();
            C23446j.this.f67220F.stopTimer();
            return false;
        }
    }

    /* renamed from: z03.j$b */
    public interface C23448b {
    }

    public C23446j(Context context) {
        super(context);
    }

    public int getBarPointWidth() {
        return this.f273524h.getWidth();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cag;
    }

    /* renamed from: r */
    public void mo36658r() {
        super.mo36658r();
        C23448b bVar = this.f67221G;
        if (bVar != null) {
            int i = this.f273529p;
            int videoTotalTime = getVideoTotalTime();
            C23430f fVar = (C23430f) bVar;
            Class cls = C22422f.class;
            int width = videoTotalTime > 0 ? (fVar.f67190a.f65943y.getWidth() * i) / videoTotalTime : 0;
            C22193b bVar2 = fVar.f67190a.getListVideoUIComponent().mo24967U2().f66025f;
            if (bVar2 != null && bVar2.f62807d < ((long) fVar.f67190a.getListVideoUIComponent().mo24995y5().mo36211c())) {
                bVar2.f62807d = (long) fVar.f67190a.getListVideoUIComponent().mo24995y5().mo36211c();
            }
            if (fVar.f67190a.getListVideoUIComponent().mo24995y5().mo36212d()) {
                int c = fVar.f67190a.getListVideoUIComponent().mo24995y5().mo36211c() / 1000;
                if (((C22422f) C86312j.m106911c(cls)).f63534f.containsKey(fVar.f67190a.f65924E.f64729h)) {
                    ((C22422f) C86312j.m106911c(cls)).f63534f.put(fVar.f67190a.f65924E.f64729h, Integer.valueOf(c));
                }
            }
            if (!(fVar.f67190a.f67194G.getVisibility() == 0)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fVar.f67190a.f65942x.getLayoutParams();
                layoutParams.width = width;
                fVar.f67190a.f65942x.setLayoutParams(layoutParams);
                fVar.f67190a.f65942x.requestLayout();
                fVar.f67190a.f65941w.setVisibility(0);
            }
            C23433i iVar = fVar.f67190a;
            xh4 xh4 = iVar.f65924E;
            if ((xh4.f64711L & 256) <= 0) {
                iVar.f65920A.mo25015a6(xh4, iVar, i, videoTotalTime);
            }
            C23433i iVar2 = fVar.f67190a;
            iVar2.f65920A.mo25016i6(iVar2.f65924E, iVar2, i, videoTotalTime);
        }
    }

    public void setFullScreenBtnClickListener(View.OnClickListener onClickListener) {
        this.f67219E.setOnClickListener(onClickListener);
    }

    public void setOnUpdateProgressLenListener(C23448b bVar) {
        this.f67221G = bVar;
    }

    public void setVisibility(int i) {
        C23448b bVar;
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            C23448b bVar2 = this.f67221G;
            if (bVar2 != null) {
                C23430f fVar = (C23430f) bVar2;
                if (fVar.f67190a.f65924E.f64720V != null) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onControlBarGone");
                    View view = fVar.f67190a.f67198K;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!fVar.f67190a.getListVideoUIComponent().mo24995y5().f66031e || (!fVar.f67190a.getListVideoUIComponent().mo24995y5().mo36212d() && !fVar.f67190a.getListVideoUIComponent().mo24995y5().f66032f)) {
                    fVar.f67190a.f65941w.setVisibility(8);
                } else {
                    fVar.f67190a.f65941w.setVisibility(0);
                }
                if (fVar.f67190a.f67200M.getVisibility() == 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) fVar.f67190a.f67200M.getLayoutParams();
                    layoutParams.bottomMargin = C76577a.m92155f(fVar.f67190a.getContext(), C0966R.dimen.f3766df);
                    fVar.f67190a.f67200M.setLayoutParams(layoutParams);
                }
            }
        } else if (i == 0 && (bVar = this.f67221G) != null) {
            C23430f fVar2 = (C23430f) bVar;
            fVar2.f67190a.f65941w.setVisibility(8);
            C23433i iVar = fVar2.f67190a;
            if (iVar.f65924E.f64720V != null) {
                View view2 = iVar.f67198K;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) fVar2.f67190a.f67198K.getLayoutParams();
                layoutParams2.bottomMargin = C76577a.m92155f(fVar2.f67190a.getContext(), C0966R.dimen.f3755d6);
                fVar2.f67190a.f67198K.setLayoutParams(layoutParams2);
            }
            if (fVar2.f67190a.f67200M.getVisibility() == 0) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) fVar2.f67190a.f67200M.getLayoutParams();
                layoutParams3.bottomMargin = C76577a.m92155f(fVar2.f67190a.getContext(), C0966R.dimen.f3755d6);
                fVar2.f67190a.f67200M.setLayoutParams(layoutParams3);
            }
        }
    }

    /* renamed from: y */
    public void mo36667y() {
        setVisibility(8);
    }

    /* renamed from: z */
    public void mo36668z() {
        setVisibility(0);
        this.f273525i.setVisibility(0);
        if (this.f67220F == null) {
            this.f67220F = new MTimerHandler(new C23447a(), false);
        }
        this.f67220F.stopTimer();
        this.f67220F.startTimer(2000);
    }
}

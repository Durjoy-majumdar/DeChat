package ve1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C4100m;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.C4190v;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Arrays;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import rs1.C48086u6;
import rs1.C63513a1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: ve1.p2 */
public class C14592p2 extends FinderFeedFullConvert<C55018j0> {

    /* renamed from: L */
    public final FinderVideoCore f40416L;

    /* renamed from: M */
    public final FinderFeedFullVideoConvert$videoFinishListener$1$1 f40417M;

    /* renamed from: N */
    public final C13601g f40418N;

    /* renamed from: ve1.p2$a */
    public static final class C14593a extends C87413o implements C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14593a(C60905o oVar) {
            super(2);
            this.f40419d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            FinderVideoLayout.C56521b bVar = (FinderVideoLayout.C56521b) obj2;
            if (!((Boolean) obj).booleanValue()) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f40419d.f173499A;
                C87412m.m108593f(context, "holder.context");
                ((C48086u6) rVar.mo62443b(context).mo75002a(C48086u6.class)).mo72830c3("VideoConvert");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.p2$b */
    public static final class C14594b extends C87413o implements C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14594b(C60905o oVar) {
            super(2);
            this.f40420d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            FinderVideoLayout.C56521b bVar = (FinderVideoLayout.C56521b) obj2;
            View D = this.f40420d.mo85812D(C0966R.C0970id.d9_);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((FinderFullSeekBarLayout) this.f40420d.mo85812D(C0966R.C0970id.eh4)).setPlayingStatus(!booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.p2$c */
    public static final class C14595c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14595c(C60905o oVar) {
            super(0);
            this.f40421d = oVar;
        }

        public Object invoke() {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f40421d.mo85812D(C0966R.C0970id.d7a);
            boolean z = false;
            if (finderVideoLayout == null) {
                Log.m105928w("Finder.FeedFullVideoConvert", "videoLayout is null");
            } else if (finderVideoLayout.mo79599y()) {
                finderVideoLayout.mo79600z(true, true);
            } else {
                finderVideoLayout.mo79600z(false, true);
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ve1.p2$d */
    public static final class C14596d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14596d(C60905o oVar) {
            super(0);
            this.f40422d = oVar;
        }

        public Object invoke() {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f40422d.mo85812D(C0966R.C0970id.d7a);
            C59670o2 o2Var = finderVideoLayout.f161884w;
            if (o2Var != null) {
                finderVideoLayout.mo79546K(false);
                o2Var.setVideoViewFocused(true);
                if (o2Var instanceof FinderThumbPlayerProxy) {
                    ((FinderThumbPlayerProxy) o2Var).mo79445O(-1);
                } else {
                    o2Var.play();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.p2$e */
    public static final class C14597e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14597e(C60905o oVar) {
            super(0);
            this.f40423d = oVar;
        }

        public Object invoke() {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f40423d.mo85812D(C0966R.C0970id.d7a);
            boolean z = true;
            if (finderVideoLayout == null || !finderVideoLayout.mo79599y()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ve1.p2$f */
    public static final class C14598f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14592p2 f40424d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40425e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14598f(C14592p2 p2Var, C60905o oVar) {
            super(0);
            this.f40424d = p2Var;
            this.f40425e = oVar;
        }

        public Object invoke() {
            this.f40424d.mo2303l(this.f40425e);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14592p2(com.tencent.p014mm.plugin.finder.video.FinderVideoCore r2, kf1.C10008v1 r3, boolean r4, int r5, boolean r6, int r7, gy3.C8480h r8) {
        /*
            r1 = this;
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L_0x0006
            r4 = 0
        L_0x0006:
            r8 = r7 & 8
            if (r8 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0010
            r6 = 0
        L_0x0010:
            java.lang.String r7 = "videoCore"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "contract"
            gy3.C87412m.m108594g(r3, r7)
            r1.<init>(r3, r4, r5, r6)
            r1.f40416L = r2
            com.tencent.mm.ui.MMActivity r2 = r3.getActivity()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 r4 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1
            r4.<init>(r2, r1)
            r1.f40417M = r4
            ve1.r2 r2 = new ve1.r2
            r2.<init>(r3, r1)
            rx3.g r2 = rx3.C36568h.m40985a(r2)
            r1.f40418N = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14592p2.<init>(com.tencent.mm.plugin.finder.video.FinderVideoCore, kf1.v1, boolean, int, boolean, int, gy3.h):void");
    }

    /* renamed from: F */
    public void mo2258F(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((C63513a1) rVar.mo62444c((AppCompatActivity) context).mo75002a(C63513a1.class)).mo88370c3(oVar, this.f12564e, z);
    }

    /* renamed from: O */
    public void mo2276O(C60905o oVar) {
        MegaVideoBulletView megaVideoBulletView;
        C87412m.m108594g(oVar, "holder");
        super.mo2276O(oVar);
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        boolean z = i2Var instanceof C55018j0;
        View view = null;
        C55018j0 j0Var = z ? (C55018j0) i2Var : null;
        if ((j0Var != null && j0Var.mo76076p0()) && (megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8)) != null) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            ((C63513a1) rVar.mo62444c((AppCompatActivity) context).mo75002a(C63513a1.class)).mo88365F3(oVar, (BaseFinderFeed) obj, this.f12567h);
            megaVideoBulletView.mo77175a(this.f12564e.mo2497u0());
        }
        if (z) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13442s8 f = aVar.mo12873f(context2);
            String str = f != null ? f.f38098n : null;
            if (str != null && C112551y.m153819s(str, "26-2-25", false)) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_SHOW_MULTI_TASK_TIPS_TIMES_INT_SYNC;
                if (i.mo119689j(aVar2, 0) < 1) {
                    View D = oVar.mo85812D(C0966R.C0970id.e6y);
                    if (D == null) {
                        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.nmi);
                        if (viewStub != null) {
                            view = viewStub.inflate();
                        }
                        D = view;
                    }
                    if (D != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view2 = D;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkShowAddMultiTaskTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkShowAddMultiTaskTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(Float.valueOf(0.0f));
                        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkShowAddMultiTaskTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        D.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkShowAddMultiTaskTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        D.animate().setDuration(300).alpha(1.0f).start();
                        D.postDelayed(new C14584o2(D), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, 1);
                    }
                }
            }
        }
    }

    /* renamed from: Q0 */
    public void mo2324w(C60905o oVar, C55018j0 j0Var, int i, int i2) {
        TextView textView;
        C60905o oVar2 = oVar;
        C55018j0 j0Var2 = j0Var;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(j0Var2, "item");
        C4100m mVar = new C4100m();
        mVar.f18245d = (FinderFullSeekBarLayout) oVar2.mo85812D(C0966R.C0970id.eh4);
        mVar.f18243b = true;
        mVar.f18246e = this.f40416L;
        mVar.f18244c = this.f12566g;
        mVar.f18248g = new C14593a(oVar2);
        mVar.f18247f = new C14594b(oVar2);
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar2.mo85812D(C0966R.C0970id.ol_)).mo4635a(j0Var2, mVar);
        FeedData a = FeedData.Companion.mo78883a(j0Var2);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.gqj);
        if (textView2 != null) {
            textView2.setText(oVar2.f173499A.getResources().getString(C0966R.string.eto));
        }
        ViewGroup viewGroup = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.e6u);
        View view = null;
        if (j0Var.mo3513o().isLongVideo()) {
            View findViewById = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.egp) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (viewGroup != null) {
                view = viewGroup.findViewById(C0966R.C0970id.izy);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!(viewGroup == null || (textView = (TextView) viewGroup.findViewById(C0966R.C0970id.f358639g73)) == null)) {
                long j = (long) a.getMediaList().getFirst().f185269g;
                String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
                C87412m.m108593f(format, "format(format, *args)");
                textView.setText(format);
            }
        } else {
            View findViewById2 = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.egp) : null;
            if (findViewById2 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (viewGroup != null) {
                view = viewGroup.findViewById(C0966R.C0970id.l7i);
            }
            if (view != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view5 = view;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (oVar2.mo85812D(C0966R.C0970id.eh4) == null) {
            Log.m105920e("Finder.FeedFullVideoConvert", "[convertMedia] holder=" + oVar2.f44859i + " position=" + oVar.mo17363j() + " data=" + oVar2.f173503E + " holder=" + oVar2 + ' ' + oVar2.f44854d);
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar2.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.setOnPauseClickListener(new C14595c(oVar2));
            finderFullSeekBarLayout.setOnResumePlayListener(new C14596d(oVar2));
            finderFullSeekBarLayout.setPlayingCallback(new C14597e(oVar2));
            finderFullSeekBarLayout.setAdjustPositionCallback(new C14598f(this, oVar2));
        }
        mo2303l(oVar);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.khe);
        if (textView3 != null) {
            textView3.animate().cancel();
            textView3.setVisibility(8);
        }
    }

    /* renamed from: W */
    public void mo2286W(C60905o oVar, int i, int i2, boolean z) {
        MegaVideoBulletView megaVideoBulletView;
        C87412m.m108594g(oVar, "holder");
        super.mo2286W(oVar, i, i2, z);
        if (z && (megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8)) != null) {
            megaVideoBulletView.f158433f.mo84818e();
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6252r;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        if (this.f12566g == 4) {
            ((IListener) ((C36570n) this.f40418N).getValue()).alive();
        }
        FinderFeedFullVideoConvert$videoFinishListener$1$1 finderFeedFullVideoConvert$videoFinishListener$1$1 = this.f40417M;
        if (finderFeedFullVideoConvert$videoFinishListener$1$1 != null) {
            finderFeedFullVideoConvert$videoFinishListener$1$1.alive();
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        C4189u7 u7Var = C4189u7.VIDEO;
        C4190v vVar = new C4190v();
        vVar.f18453a = recyclerView;
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)).mo4636b(u7Var, vVar);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.eah);
        if (weImageView != null) {
            weImageView.setFocusable(false);
            weImageView.setClickable(false);
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.setFloatPlayIcon(weImageView);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2295f0(jq3.C60905o r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r12 = "holder"
            gy3.C87412m.m108594g(r11, r12)
            java.lang.Object r12 = r11.f173503E
            cm1.i2 r12 = (cm1.C0740i2) r12
            r0 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r11 = r11.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r11 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r11
            if (r11 == 0) goto L_0x008a
            boolean r0 = r12 instanceof cm1.C55018j0
            if (r0 == 0) goto L_0x001b
            cm1.j0 r12 = (cm1.C55018j0) r12
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            android.view.View r8 = r11.getBulletBtn()
            r0 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0032
            kf1.v1 r1 = r10.f12564e
            boolean r1 = r1.mo2497u0()
            boolean r1 = r12.mo76077q0(r1)
            if (r1 != r0) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 != 0) goto L_0x0049
            boolean r11 = r11.f17507V
            if (r11 == 0) goto L_0x0046
            if (r12 == 0) goto L_0x0042
            boolean r11 = r12.mo76076p0()
            if (r11 != r0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r11 = 8
            goto L_0x004a
        L_0x0049:
            r11 = 0
        L_0x004a:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r11)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert"
            java.lang.String r3 = "refreshBulletLayout"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = r12.mo10231a(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert"
            java.lang.String r2 = "refreshBulletLayout"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14592p2.mo2295f0(jq3.o, boolean):void");
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.mo2296g(recyclerView);
        if (this.f12566g == 4) {
            ((IListener) ((C36570n) this.f40418N).getValue()).dead();
        }
        FinderFeedFullVideoConvert$videoFinishListener$1$1 finderFeedFullVideoConvert$videoFinishListener$1$1 = this.f40417M;
        if (finderFeedFullVideoConvert$videoFinishListener$1$1 != null) {
            finderFeedFullVideoConvert$videoFinishListener$1$1.dead();
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.mo735i(oVar);
        MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8);
        if (megaVideoBulletView != null) {
            megaVideoBulletView.f158433f.mo84818e();
        }
    }
}

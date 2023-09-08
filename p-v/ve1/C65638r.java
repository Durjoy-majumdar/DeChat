package ve1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cb0.C54711a;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.plugin.finder.view.FinderCommentAdVideoView;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58375j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import nj3.C76912y0;
import p501dz.C58466h;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import tc2.C118418g;
import te3.C49712hj1;
import te3.C50717oq2;
import te3.C64284cg;
import te3.C64642py;
import te3.C64772vh0;
import tr1.C14063b;
import u62.C22597f;
import up1.C65426w0;
import vq1.C65866w;
import z62.C66735c;
import zp3.C23555k;

/* renamed from: ve1.r */
public final class C65638r extends C60896i<C55033u> {

    /* renamed from: e */
    public final CommentDrawerContract.NPresenter f188866e;

    /* renamed from: f */
    public final boolean f188867f;

    /* renamed from: g */
    public final BaseFinderFeed f188868g;

    /* renamed from: h */
    public long f188869h;

    /* renamed from: ve1.r$v */
    public static final class C14616v implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f40455d;

        public C14616v(boolean[] zArr) {
            this.f40455d = zArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            if (r11 != 6) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r11)
                r1.add(r12)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r10
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r11 = r12.getAction()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "ce_feed_comment_like"
                if (r11 == 0) goto L_0x003a
                if (r11 == r2) goto L_0x0033
                r4 = 5
                if (r11 == r4) goto L_0x003a
                r2 = 6
                if (r11 == r2) goto L_0x0033
                goto L_0x0043
            L_0x0033:
                r0.mo175827n9(r3, r12)
                r0.ec0(r3)
                goto L_0x0043
            L_0x003a:
                boolean[] r11 = r10.f40455d
                r11[r1] = r2
                java.lang.String r11 = "<FeedCommentLike>"
                r0.w40(r3, r11)
            L_0x0043:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$1"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ve1.C65638r.C14616v.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: ve1.r$a */
    public static final class C65639a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188870d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188871e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188872f;

        /* renamed from: g */
        public final /* synthetic */ C65638r f188873g;

        public C65639a(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, C65638r rVar) {
            this.f188870d = uVar;
            this.f188871e = oVar;
            this.f188872f = finderJumpInfo;
            this.f188873g = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188870d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188871e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                String str = null;
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188871e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188871e, q3, this.f188870d, 2);
                if (this.f188872f != null) {
                    C62262d0 d0Var = C62262d0.f176978a;
                    Context context3 = this.f188871e.f173499A;
                    C87412m.m108593f(context3, "holder.context");
                    C11920q qVar = new C11920q(this.f188872f);
                    C55033u uVar = this.f188870d;
                    C65638r rVar = this.f188873g;
                    C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                    if (vh02 != null) {
                        str = vh02.f185890h;
                    }
                    if (str == null) {
                        str = "";
                    }
                    qVar.f34840n = str;
                    qVar.f34830d = rVar.f188868g;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            this.f188873g.mo89716k(this.f188870d, this.f188871e, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$b */
    public static final class C65640b extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C60905o f188874a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f188875b;

        /* renamed from: c */
        public final /* synthetic */ C8478d0 f188876c;

        /* renamed from: d */
        public final /* synthetic */ C55033u f188877d;

        public C65640b(C60905o oVar, C8477a0 a0Var, C8478d0 d0Var, C55033u uVar) {
            this.f188874a = oVar;
            this.f188875b = a0Var;
            this.f188876c = d0Var;
            this.f188877d = uVar;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            C87412m.m108594g(view, "view");
            return this.f188877d.getItemId();
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                Context context = this.f188874a.f173499A;
                C87412m.m108593f(context, "holder.context");
                C58417y0.Iy0((C58417y0) c, context, false, this.f188875b.f27482d, this.f188876c.f27483d, false, 18, (Object) null);
            }
        }
    }

    /* renamed from: ve1.r$c */
    public static final class C65641c extends C87413o implements C32226l<C50717oq2, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f188878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65641c(C60905o oVar) {
            super(1);
            this.f188878d = oVar;
        }

        public Object invoke(Object obj) {
            C50717oq2 oq22 = (C50717oq2) obj;
            C87412m.m108594g(oq22, LocaleUtil.ITALIAN);
            C65604i iVar = C65604i.f188772a;
            Context context = this.f188878d.f173499A;
            C87412m.m108593f(context, "holder.context");
            iVar.mo89682h(context, this.f188878d.mo17363j(), oq22.f139316f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.r$d */
    public static final class C65642d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65638r f188879d;

        /* renamed from: e */
        public final /* synthetic */ FinderCommentAdVideoView f188880e;

        /* renamed from: f */
        public final /* synthetic */ C64642py f188881f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f188882g;

        /* renamed from: h */
        public final /* synthetic */ C55033u f188883h;

        /* renamed from: ve1.r$d$a */
        public static final class C65643a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentAdVideoView f188884d;

            /* renamed from: e */
            public final /* synthetic */ C60905o f188885e;

            /* renamed from: f */
            public final /* synthetic */ C55033u f188886f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65643a(FinderCommentAdVideoView finderCommentAdVideoView, C60905o oVar, C55033u uVar) {
                super(0);
                this.f188884d = finderCommentAdVideoView;
                this.f188885e = oVar;
                this.f188886f = uVar;
            }

            public Object invoke() {
                FinderCommentAdVideoView finderCommentAdVideoView = this.f188884d;
                finderCommentAdVideoView.getClass();
                finderCommentAdVideoView.f162016B = System.currentTimeMillis();
                finderCommentAdVideoView.getPlayer().mo35687b(true);
                this.f188884d.setMute(true);
                this.f188884d.setOnFirstFrameRendered(new C65664s(this.f188885e, this.f188886f));
                this.f188884d.setOnVideoReplay(new C65668t(this.f188885e, this.f188886f));
                this.f188884d.setOnProgressChange(new C65672u(new C8477a0(), this.f188885e, this.f188886f));
                this.f188885e.f173502D = Boolean.TRUE;
                return C13598b0.f38549a;
            }
        }

        public C65642d(C65638r rVar, FinderCommentAdVideoView finderCommentAdVideoView, C64642py pyVar, C60905o oVar, C55033u uVar) {
            this.f188879d = rVar;
            this.f188880e = finderCommentAdVideoView;
            this.f188881f = pyVar;
            this.f188882g = oVar;
            this.f188883h = uVar;
        }

        public final void run() {
            String str;
            long j = this.f188879d.f188869h;
            FinderCommentAdVideoView finderCommentAdVideoView = this.f188880e;
            C64642py pyVar = this.f188881f;
            if (pyVar == null || (str = pyVar.f184916d) == null) {
                str = "";
            }
            C65643a aVar = new C65643a(finderCommentAdVideoView, this.f188882g, this.f188883h);
            finderCommentAdVideoView.getClass();
            if (str.length() == 0) {
                Log.m105928w("Finder.CommentAdVideoView", "loadVideo return for url:" + str);
                return;
            }
            Log.m105924i("Finder.CommentAdVideoView", "loadVideo start play startPositionMs:" + j + " url:" + str);
            C22597f fVar = new C22597f();
            String mD5String = MD5Util.getMD5String(str);
            String a = C54711a.f153346a.mo75606a("", mD5String, str);
            C66735c.C66736a aVar2 = C66735c.f191767d;
            C87412m.m108593f(mD5String, "mediaId");
            C66735c cVar = new C66735c(mD5String, str, aVar2.mo90768a(mD5String, str, a));
            fVar.mo35706g(cVar, ((C58466h) C86312j.m106911c(C58466h.class)).mo31869LK(fVar, cVar, mD5String, mD5String));
            aVar.invoke();
            finderCommentAdVideoView.mo23980b(fVar, cVar);
            finderCommentAdVideoView.f162018D = true;
            MMVideoFrameLayout.m19908l(finderCommentAdVideoView, true, 0, 0, 0, 0, (Rect) null, 62, (Object) null);
            MMVideoFrameLayout.m19909n(finderCommentAdVideoView, (String) null, j, 1, (Object) null);
        }
    }

    /* renamed from: ve1.r$e */
    public static final class C65644e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188887d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188888e;

        public C65644e(C55033u uVar, C60905o oVar) {
            this.f188887d = uVar;
            this.f188888e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String username = this.f188887d.f154492d.getUsername();
            Context context = this.f188888e.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).fy0(username, context);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context2 = this.f188888e.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13442s8 f = aVar.mo12873f(context2);
            if (f != null) {
                C65426w0 w0Var = this.f188887d.f154492d;
                ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(1, w0Var.field_feedId, f.f38096i, 2, w0Var.getUsername());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$f */
    public static final class C65645f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188889d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188890e;

        /* renamed from: f */
        public final /* synthetic */ C65638r f188891f;

        public C65645f(C55033u uVar, C60905o oVar, C65638r rVar) {
            this.f188889d = uVar;
            this.f188890e = oVar;
            this.f188891f = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C64772vh0 vh02 = this.f188889d.f154492d.mo89532o2().advertisement_info;
            FinderJumpInfo finderJumpInfo = vh02 != null ? vh02.f185886d : null;
            if (this.f188889d.f154492d.mo89544z2() && finderJumpInfo != null) {
                Log.m105924i("Finder.FinderFeedCommentConvert", "onItemClick click comment advertisement, jumpInfo=" + C58784w3.f168295a.mo83918b1(finderJumpInfo));
                Context context = this.f188890e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83142e3(this.f188890e, this.f188889d);
                C62262d0 d0Var = C62262d0.f176978a;
                Context context2 = this.f188890e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C11920q qVar = new C11920q(finderJumpInfo);
                qVar.f34830d = this.f188891f.f188868g;
                C13598b0 b0Var = C13598b0.f38549a;
                C62262d0.m73168c(d0Var, context2, qVar, 0, (C60905o) null, 12, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$g */
    public static final class C65646g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65638r f188892d;

        /* renamed from: e */
        public final /* synthetic */ C55033u f188893e;

        public C65646g(C65638r rVar, C55033u uVar) {
            this.f188892d = rVar;
            this.f188893e = uVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CommentDrawerContract.NPresenter nPresenter = this.f188892d.f188866e;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            nPresenter.mo77325Y0(view, this.f188893e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$h */
    public static final class C65647h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65638r f188894d;

        /* renamed from: e */
        public final /* synthetic */ TextView f188895e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f188896f;

        public C65647h(C65638r rVar, TextView textView, C60905o oVar) {
            this.f188894d = rVar;
            this.f188895e = textView;
            this.f188896f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CommentDrawerContract.NPresenter nPresenter = this.f188894d.f188866e;
            TextView textView = this.f188895e;
            C87412m.m108593f(textView, "commentFailTV");
            nPresenter.mo77329f(textView, this.f188896f.mo17363j());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$i */
    public static final class C65648i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65638r f188897d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188898e;

        /* renamed from: f */
        public final /* synthetic */ C55033u f188899f;

        public C65648i(C65638r rVar, C60905o oVar, C55033u uVar) {
            this.f188897d = rVar;
            this.f188898e = oVar;
            this.f188899f = uVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$23$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CommentDrawerContract.NPresenter nPresenter = this.f188897d.f188866e;
            View view2 = this.f188898e.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            nPresenter.mo77335l1(view2, this.f188899f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$23$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$j */
    public static final class C65649j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f188900d;

        /* renamed from: e */
        public final /* synthetic */ View f188901e;

        /* renamed from: f */
        public final /* synthetic */ C65638r f188902f;

        /* renamed from: g */
        public final /* synthetic */ C55033u f188903g;

        public C65649j(View view, View view2, C65638r rVar, C55033u uVar) {
            this.f188900d = view;
            this.f188901e = view2;
            this.f188902f = rVar;
            this.f188903g = uVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f188900d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f188901e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f188902f.f188866e.mo77317A0(this.f188903g, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$k */
    public static final class C65650k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188904d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188905e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188906f;

        /* renamed from: g */
        public final /* synthetic */ C65638r f188907g;

        public C65650k(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, C65638r rVar) {
            this.f188904d = uVar;
            this.f188905e = oVar;
            this.f188906f = finderJumpInfo;
            this.f188907g = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = null;
            if (this.f188904d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188905e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188905e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188905e, q3, this.f188904d, 1);
            }
            if (this.f188906f != null) {
                C62262d0 d0Var = C62262d0.f176978a;
                Context context3 = this.f188905e.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C11920q qVar = new C11920q(this.f188906f);
                C55033u uVar = this.f188904d;
                C65638r rVar = this.f188907g;
                C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                if (vh02 != null) {
                    str = vh02.f185890h;
                }
                if (str == null) {
                    str = "";
                }
                qVar.f34840n = str;
                qVar.f34830d = rVar.f188868g;
                C13598b0 b0Var = C13598b0.f38549a;
                C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String username = this.f188904d.f154492d.getUsername();
            Context context4 = this.f188905e.f173499A;
            C87412m.m108593f(context4, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).fy0(username, context4);
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Context context5 = this.f188905e.f173499A;
            C87412m.m108593f(context5, "holder.context");
            C13442s8 f2 = aVar2.mo12873f(context5);
            if (f2 != null) {
                C65426w0 w0Var = this.f188904d.f154492d;
                ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(1, w0Var.field_feedId, f2.f38096i, 2, w0Var.getUsername());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$l */
    public static final class C65651l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188908d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188909e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188910f;

        /* renamed from: g */
        public final /* synthetic */ String f188911g;

        /* renamed from: h */
        public final /* synthetic */ C65638r f188912h;

        public C65651l(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, String str, C65638r rVar) {
            this.f188908d = uVar;
            this.f188909e = oVar;
            this.f188910f = finderJumpInfo;
            this.f188911g = str;
            this.f188912h = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = null;
            if (this.f188908d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188909e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188909e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188909e, q3, this.f188908d, 1);
            }
            if (this.f188910f != null) {
                C62262d0 d0Var = C62262d0.f176978a;
                Context context3 = this.f188909e.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C11920q qVar = new C11920q(this.f188910f);
                C55033u uVar = this.f188908d;
                C65638r rVar = this.f188912h;
                C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                if (vh02 != null) {
                    str = vh02.f185890h;
                }
                if (str == null) {
                    str = "";
                }
                qVar.f34840n = str;
                qVar.f34830d = rVar.f188868g;
                C13598b0 b0Var = C13598b0.f38549a;
                C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C58784w3.f168295a.mo83941j1(this.f188909e, this.f188911g, this.f188908d);
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context4 = this.f188909e.f173499A;
            C87412m.m108593f(context4, "holder.context");
            C58417y0.Iy0((C58417y0) c, context4, true, false, 2, true, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$m */
    public static final class C65652m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188913d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188914e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188915f;

        /* renamed from: g */
        public final /* synthetic */ String f188916g;

        /* renamed from: h */
        public final /* synthetic */ C65638r f188917h;

        public C65652m(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, String str, C65638r rVar) {
            this.f188913d = uVar;
            this.f188914e = oVar;
            this.f188915f = finderJumpInfo;
            this.f188916g = str;
            this.f188917h = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188913d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188914e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                String str = null;
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188914e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188914e, q3, this.f188913d, 2);
                if (this.f188915f != null) {
                    C62262d0 d0Var = C62262d0.f176978a;
                    Context context3 = this.f188914e.f173499A;
                    C87412m.m108593f(context3, "holder.context");
                    C11920q qVar = new C11920q(this.f188915f);
                    C55033u uVar = this.f188913d;
                    C65638r rVar = this.f188917h;
                    C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                    if (vh02 != null) {
                        str = vh02.f185890h;
                    }
                    if (str == null) {
                        str = "";
                    }
                    qVar.f34840n = str;
                    qVar.f34830d = rVar.f188868g;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C58784w3.f168295a.mo83941j1(this.f188914e, this.f188916g, this.f188913d);
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context4 = this.f188914e.f173499A;
            C87412m.m108593f(context4, "holder.context");
            C58417y0.Iy0((C58417y0) c, context4, true, false, 2, false, 20, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$n */
    public static final class C65653n extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C60905o f188918a;

        /* renamed from: b */
        public final /* synthetic */ C55033u f188919b;

        public C65653n(C60905o oVar, C55033u uVar) {
            this.f188918a = oVar;
            this.f188919b = uVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
            r10 = r10.f185890h;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53b(android.view.View r30, long r31, long r33, boolean r35) {
            /*
                r29 = this;
                r0 = r29
                java.lang.Class<ht1.f4> r1 = ht1.C60169f4.class
                java.lang.Class<ht1.g4> r2 = ht1.C60172g4.class
                java.lang.Class<dp1.j> r3 = dp1.C58375j.class
                java.lang.String r4 = "view"
                r5 = r30
                gy3.C87412m.m108594g(r5, r4)
                java.lang.String r4 = ""
                java.lang.String r5 = "Finder.CommentAdReportMgr"
                java.lang.String r6 = "comment"
                java.lang.String r7 = "holder"
                java.lang.String r8 = "UICProvider.of(context).…tAdReportUIC::class.java)"
                java.lang.String r9 = "holder.context"
                r10 = 0
                if (r35 == 0) goto L_0x00d4
                jq3.o r11 = r0.f188918a
                android.content.Context r11 = r11.f173499A
                gy3.C87412m.m108593f(r11, r9)
                bl3.r r12 = bl3.C39818r.f106831a
                bl3.r$a r11 = r12.mo62443b(r11)
                androidx.lifecycle.i0 r3 = r11.mo75002a(r3)
                gy3.C87412m.m108593f(r3, r8)
                dp1.j r3 = (dp1.C58375j) r3
                jq3.o r8 = r0.f188918a
                cm1.u r11 = r0.f188919b
                gy3.C87412m.m108594g(r8, r7)
                gy3.C87412m.m108594g(r11, r6)
                up1.w0 r6 = r11.f154492d
                boolean r6 = r6.mo89544z2()
                if (r6 != 0) goto L_0x0049
                goto L_0x0201
            L_0x0049:
                boolean r6 = r3.f167205h
                if (r6 == 0) goto L_0x0056
                java.lang.String r1 = "onStartExpose return because starting half screen activity"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                r3.f167205h = r10
                goto L_0x0201
            L_0x0056:
                up1.w0 r6 = r11.f154492d
                long r13 = r6.field_feedId
                long r6 = r6.mo89531n2()
                up1.w0 r10 = r11.f154492d
                com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = r10.mo89532o2()
                te3.vh0 r10 = r10.advertisement_info
                if (r10 == 0) goto L_0x0070
                java.lang.String r10 = r10.f185890h
                if (r10 != 0) goto L_0x006d
                goto L_0x0070
            L_0x006d:
                r22 = r10
                goto L_0x0072
            L_0x0070:
                r22 = r4
            L_0x0072:
                dp1.j$a r4 = r3.mo83143f3(r13, r6)
                r16 = r13
                long r12 = java.lang.System.currentTimeMillis()
                r4.f167206a = r12
                bl3.r r4 = bl3.C39818r.f106831a
                android.content.Context r8 = r8.f173499A
                gy3.C87412m.m108593f(r8, r9)
                bl3.r$a r4 = r4.mo62443b(r8)
                bl3.c r2 = r4.mo62447c(r2)
                ht1.g4 r2 = (ht1.C60172g4) r2
                te3.hj1 r2 = r2.mo12861q3()
                int r15 = r2.f134675i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "onStartExpose commentId="
                r2.append(r4)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(IFinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r12 = r1
                ht1.f4 r12 = (ht1.C60169f4) r12
                r18 = 0
                r19 = 0
                r20 = 0
                c30.g r21 = r3.mo83141d3(r11)
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 3840(0xf00, float:5.381E-42)
                r28 = 0
                r13 = r16
                r16 = r6
                ht1.C60169f4.C60170a.m70169a(r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                goto L_0x0201
            L_0x00d4:
                jq3.o r11 = r0.f188918a
                android.content.Context r11 = r11.f173499A
                gy3.C87412m.m108593f(r11, r9)
                bl3.r r12 = bl3.C39818r.f106831a
                bl3.r$a r11 = r12.mo62443b(r11)
                androidx.lifecycle.i0 r3 = r11.mo75002a(r3)
                gy3.C87412m.m108593f(r3, r8)
                dp1.j r3 = (dp1.C58375j) r3
                jq3.o r8 = r0.f188918a
                cm1.u r11 = r0.f188919b
                gy3.C87412m.m108594g(r8, r7)
                gy3.C87412m.m108594g(r11, r6)
                up1.w0 r6 = r11.f154492d
                boolean r6 = r6.mo89544z2()
                if (r6 != 0) goto L_0x00fe
                goto L_0x0201
            L_0x00fe:
                boolean r6 = r3.f167204g
                if (r6 == 0) goto L_0x010e
                r1 = 1
                r3.f167205h = r1
                r3.f167204g = r10
                java.lang.String r1 = "onStopExpose return because starting half screen activity"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                goto L_0x0201
            L_0x010e:
                up1.w0 r6 = r11.f154492d
                long r13 = r6.field_feedId
                long r6 = r6.mo89531n2()
                up1.w0 r12 = r11.f154492d
                com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo89532o2()
                te3.vh0 r12 = r12.advertisement_info
                if (r12 == 0) goto L_0x0128
                java.lang.String r12 = r12.f185890h
                if (r12 != 0) goto L_0x0125
                goto L_0x0128
            L_0x0125:
                r22 = r12
                goto L_0x012a
            L_0x0128:
                r22 = r4
            L_0x012a:
                dp1.j$a r4 = r3.mo83143f3(r13, r6)
                r12 = r11
                long r10 = r4.f167206a
                java.lang.String r15 = "onStopExpose commentId="
                r31 = r12
                r16 = r13
                r12 = 0
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 > 0) goto L_0x0156
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r15)
                r1.append(r6)
                java.lang.String r2 = " startExposeTimeMs <= 0"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
                goto L_0x0201
            L_0x0156:
                long r10 = java.lang.System.currentTimeMillis()
                r32 = r1
                long r0 = r4.f167206a
                int r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r14 <= 0) goto L_0x0167
                long r12 = r10 - r0
                int r13 = (int) r12
                r14 = r13
                goto L_0x0168
            L_0x0167:
                r14 = 0
            L_0x0168:
                long r12 = r4.f167207b
                int r18 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r18 >= 0) goto L_0x016f
                r0 = r12
            L_0x016f:
                r18 = 0
                int r20 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
                if (r20 <= 0) goto L_0x017c
                int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
                if (r20 <= 0) goto L_0x017c
                long r10 = r10 - r0
                int r0 = (int) r10
                goto L_0x017d
            L_0x017c:
                r0 = 0
            L_0x017d:
                long r10 = r4.f167209d
                int r1 = (int) r10
                r10 = r31
                up1.w0 r11 = r10.f154492d
                com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.mo89532o2()
                int r11 = r11.content_type
                r12 = 3
                if (r11 != r12) goto L_0x0190
                int r11 = r4.f167208c
                goto L_0x0191
            L_0x0190:
                r11 = 0
            L_0x0191:
                r12 = 0
                r4.f167206a = r12
                bl3.r r4 = bl3.C39818r.f106831a
                android.content.Context r8 = r8.f173499A
                gy3.C87412m.m108593f(r8, r9)
                bl3.r$a r4 = r4.mo62443b(r8)
                bl3.c r2 = r4.mo62447c(r2)
                ht1.g4 r2 = (ht1.C60172g4) r2
                te3.hj1 r2 = r2.mo12861q3()
                int r2 = r2.f134675i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r15)
                r4.append(r6)
                java.lang.String r8 = " outerDuration="
                r4.append(r8)
                r13 = r14
                r4.append(r13)
                java.lang.String r8 = " playTotalTime="
                r4.append(r8)
                r4.append(r0)
                java.lang.String r8 = " videoDuration="
                r4.append(r8)
                r4.append(r1)
                java.lang.String r8 = " playCount="
                r4.append(r8)
                r4.append(r11)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                di3.d r4 = di3.C86312j.m106911c(r32)
                r12 = r4
                ht1.f4 r12 = (ht1.C60169f4) r12
                c30.g r21 = r3.mo83141d3(r10)
                r18 = 1
                r19 = 0
                r20 = 0
                r3 = r13
                r13 = r16
                r15 = r2
                r16 = r6
                r23 = r3
                r24 = r11
                r25 = r0
                r26 = r1
                r12.H90(r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            L_0x0201:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve1.C65638r.C65653n.mo53b(android.view.View, long, long, boolean):void");
        }
    }

    /* renamed from: ve1.r$o */
    public static final class C65654o extends C23555k.C23562d {
        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
        }
    }

    /* renamed from: ve1.r$p */
    public static final class C65655p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188920d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188921e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188922f;

        /* renamed from: g */
        public final /* synthetic */ C65638r f188923g;

        public C65655p(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, C65638r rVar) {
            this.f188920d = uVar;
            this.f188921e = oVar;
            this.f188922f = finderJumpInfo;
            this.f188923g = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188920d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188921e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                String str = null;
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188921e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188921e, q3, this.f188920d, 2);
                if (this.f188922f != null) {
                    C62262d0 d0Var = C62262d0.f176978a;
                    Context context3 = this.f188921e.f173499A;
                    C87412m.m108593f(context3, "holder.context");
                    C11920q qVar = new C11920q(this.f188922f);
                    C55033u uVar = this.f188920d;
                    C65638r rVar = this.f188923g;
                    C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                    if (vh02 != null) {
                        str = vh02.f185890h;
                    }
                    if (str == null) {
                        str = "";
                    }
                    qVar.f34840n = str;
                    qVar.f34830d = rVar.f188868g;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            this.f188923g.mo89716k(this.f188920d, this.f188921e, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$q */
    public static final class C65656q implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55033u f188924d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188925e;

        /* renamed from: f */
        public final /* synthetic */ FinderJumpInfo f188926f;

        /* renamed from: g */
        public final /* synthetic */ C65638r f188927g;

        public C65656q(C55033u uVar, C60905o oVar, FinderJumpInfo finderJumpInfo, C65638r rVar) {
            this.f188924d = uVar;
            this.f188925e = oVar;
            this.f188926f = finderJumpInfo;
            this.f188927g = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188924d.f154492d.mo89544z2()) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f188925e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                String str = null;
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                Context context2 = this.f188925e.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83140c3(this.f188925e, q3, this.f188924d, 1);
                if (this.f188926f != null) {
                    C62262d0 d0Var = C62262d0.f176978a;
                    Context context3 = this.f188925e.f173499A;
                    C87412m.m108593f(context3, "holder.context");
                    C11920q qVar = new C11920q(this.f188926f);
                    C55033u uVar = this.f188924d;
                    C65638r rVar = this.f188927g;
                    C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
                    if (vh02 != null) {
                        str = vh02.f185890h;
                    }
                    if (str == null) {
                        str = "";
                    }
                    qVar.f34840n = str;
                    qVar.f34830d = rVar.f188868g;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C62262d0.m73168c(d0Var, context3, qVar, 0, (C60905o) null, 12, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            this.f188927g.mo89716k(this.f188924d, this.f188925e, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.r$r */
    public static final class C65657r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f188928d;

        /* renamed from: e */
        public final /* synthetic */ int f188929e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f188930f;

        public C65657r(View view, int i, C57839g4 g4Var) {
            this.f188928d = view;
            this.f188929e = i;
            this.f188930f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f188928d.getHitRect(rect);
            int i = this.f188929e;
            rect.inset(-i, -i);
            this.f188930f.mo82266a(new C57840h4(rect, this.f188928d));
        }
    }

    /* renamed from: ve1.r$s */
    public static final class C65658s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f188931d;

        /* renamed from: e */
        public final /* synthetic */ int f188932e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f188933f;

        public C65658s(View view, int i, C57839g4 g4Var) {
            this.f188931d = view;
            this.f188932e = i;
            this.f188933f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f188931d.getHitRect(rect);
            int i = this.f188932e;
            rect.inset(-i, -i);
            this.f188933f.mo82266a(new C57840h4(rect, this.f188931d));
        }
    }

    /* renamed from: ve1.r$t */
    public static final class C65659t extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f188934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65659t(C60905o oVar) {
            super(1);
            this.f188934d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f188934d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment");
            ((C55033u) obj2).f154498j = booleanValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.r$u */
    public static final class C65660u extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f188935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65660u(C60905o oVar) {
            super(1);
            this.f188935d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f188935d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment");
            ((C55033u) obj2).f154497i = booleanValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.r$w */
    public static final class C65661w implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65638r f188936d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f188937e;

        /* renamed from: f */
        public final /* synthetic */ boolean[] f188938f;

        public C65661w(C65638r rVar, C60905o oVar, boolean[] zArr) {
            this.f188936d = rVar;
            this.f188937e = oVar;
            this.f188938f = zArr;
        }

        public final void onClick(View view) {
            Drawable drawable;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188936d.f188866e.mo77333h()) {
                C76912y0.makeText(this.f188937e.f173499A, (int) C0966R.string.d3k, 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            WeImageView weImageView = (WeImageView) this.f188937e.mo85812D(C0966R.C0970id.a2u);
            C55033u uVar = (C55033u) this.f188937e.f173503E;
            C65866w.C14968a aVar = C65866w.f189406g;
            C65866w wVar = C65866w.f189407h;
            boolean z = !wVar.mo89907f(this.f188936d.f188866e.mo77342u().field_id, uVar.f154492d, this.f188936d.f188866e.mo77331g());
            if (z) {
                Context context = this.f188937e.f173499A;
                drawable = C74933u4.m89768e(context, C0966R.raw.icon_filled_awesome, context.getResources().getColor(C0966R.color.Red_90));
            } else {
                Context context2 = this.f188937e.f173499A;
                drawable = C74933u4.m89768e(context2, C0966R.raw.icon_outlined_awesome, context2.getResources().getColor(C0966R.color.f3133gi));
            }
            weImageView.setImageDrawable(drawable);
            this.f188936d.f188866e.mo77339r(weImageView, this.f188937e.mo17363j());
            int b = wVar.mo89904b(this.f188936d.f188866e.mo77342u().field_id, uVar.f154492d, this.f188936d.f188866e.mo77331g());
            if (b > 0) {
                this.f188937e.mo85817I(C0966R.C0970id.a2v, 0);
                this.f188937e.mo85815G(C0966R.C0970id.a2v, String.valueOf(b));
            } else {
                this.f188937e.mo85817I(C0966R.C0970id.a2v, 8);
                this.f188937e.mo85815G(C0966R.C0970id.a2v, "");
            }
            if (z) {
                ((TextView) this.f188937e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f188937e.f173499A.getResources().getColor(C0966R.color.Red_90));
            } else {
                ((TextView) this.f188937e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f188937e.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
            }
            if (z) {
                C14063b.m13415c(C14063b.f39453a, weImageView, 0, 2, (Object) null);
            }
            if (z) {
                boolean[] zArr = this.f188938f;
                if (zArr[0]) {
                    zArr[0] = false;
                } else {
                    C118418g gVar = C118418g.INSTANCE;
                    gVar.w40("ce_feed_comment_like", "<FeedCommentLike>");
                    gVar.mo175827n9("ce_feed_comment_like", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                    gVar.ec0("ce_feed_comment_like");
                }
            }
            view2.setTag(C0966R.C0970id.d3w, Boolean.valueOf(z));
            view2.setTag(C0966R.C0970id.f358033d40, Integer.valueOf(b));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C65638r(CommentDrawerContract.NPresenter nPresenter, boolean z, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(nPresenter, "presenter");
        C87412m.m108594g(baseFinderFeed, "feedObj");
        this.f188866e = nPresenter;
        this.f188867f = z;
        this.f188868g = baseFinderFeed;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6237b;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.cyd);
        C57839g4 g4Var = new C57839g4(D);
        D.setTouchDelegate(g4Var);
        int f = C76577a.m92155f(oVar.f173499A, C0966R.dimen.f3736cp);
        View D2 = oVar.mo85812D(C0966R.C0970id.bjx);
        if (D2 != null) {
            D2.post(new C65657r(D2, f, g4Var));
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.a2u);
        if (D3 != null) {
            D3.post(new C65658s(D3, f, g4Var));
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(oVar.mo85812D(C0966R.C0970id.a2u), "finder_feed_first_comment_awesome_iv");
        FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.ipj);
        finderCollapsibleTextView.setLimitLine(2);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.mo23655d(false);
        finderCollapsibleTextView.setOnCollapse(new C65659t(oVar));
        finderCollapsibleTextView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        FinderCollapsibleTextView finderCollapsibleTextView2 = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4);
        finderCollapsibleTextView2.setLimitLine(4);
        finderCollapsibleTextView2.setCollapse(true);
        finderCollapsibleTextView2.mo23655d(false);
        finderCollapsibleTextView2.setExpandTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3459zq));
        finderCollapsibleTextView2.setOnCollapse(new C65660u(oVar));
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        try {
            if (C87412m.m108589b(oVar.f173502D, Boolean.TRUE)) {
                FinderCommentAdVideoView r1 = this.f188866e.mo77340r1();
                this.f188869h = r1 != null ? r1.getCurrentPlayMs() : 0;
                boolean z = true;
                if (r1 == null || !r1.f162018D) {
                    z = false;
                }
                if (z) {
                    r1.mo24000p();
                }
                oVar.f173502D = Boolean.FALSE;
            }
        } catch (Throwable th) {
            Log.m105920e("Finder.FinderFeedCommentConvert", "onViewRecycled error=" + th);
        }
    }

    /* renamed from: j */
    public final boolean mo89715j() {
        return this.f188866e.mo77331g() == 2;
    }

    /* renamed from: k */
    public final void mo89716k(C55033u uVar, C60905o oVar, boolean z) {
        String str;
        C64772vh0 vh02 = uVar.f154492d.mo89532o2().advertisement_info;
        String str2 = "";
        if (vh02 == null || (str = vh02.f185890h) == null) {
            str = str2;
        }
        FinderContact finderContact = uVar.f154492d.mo89532o2().author_contact;
        C13598b0 b0Var = null;
        C64284cg b = finderContact != null ? C58960c.m68830b(C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null), false) : null;
        if (b != null) {
            C65604i iVar = C65604i.f188772a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String str3 = b.f182468d;
            if (str3 != null) {
                str2 = str3;
            }
            iVar.mo89680f(context, str2, this.f188866e.getCommentScene(), uVar, this.f188866e.mo77342u(), str);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C65604i iVar2 = C65604i.f188772a;
            String username = uVar.f154492d.getUsername();
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            iVar2.mo89683i(username, uVar, context2, this.f188866e.getCommentScene(), str);
        }
        Context context3 = oVar.f173499A;
        C87412m.m108593f(context3, "holder.context");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Hy0(context3, true, true, 1, z);
    }

    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v84 */
    /* JADX WARNING: type inference failed for: r0v85 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r0v5, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x09e6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0a1a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0a1c  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0a26  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0a55  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0a63  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0a7c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0b30  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0b75  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0b8c  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0b94  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0bbd  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0c0a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0c6d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0cf4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x04f0  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r48, cm1.C55033u r49, int r50, int r51, boolean r52, java.util.List<java.lang.Object> r53) {
        /*
            r47 = this;
            r6 = r47
            r15 = r48
            r14 = r49
            up1.y r0 = up1.C27696y.SMALL_AVATAR_IMAGE
            pl1.e0$a r1 = pl1.C11978e0.C11979a.AVATAR
            java.lang.Class<ny.h> r16 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r13 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r15, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r14, r2)
            r48.mo85813E(r49)
            r11 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r2 = r15.mo85812D(r11)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 0
            r9.setOnClickListener(r10)
            r7 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r2 = r15.mo85812D(r7)
            r2.setOnClickListener(r10)
            r8 = 2131305224(0x7f092308, float:1.8228613E38)
            r5 = 8
            r15.mo85817I(r8, r5)
            up1.w0 r2 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r2.mo89532o2()
            te3.vh0 r2 = r2.advertisement_info
            if (r2 == 0) goto L_0x004d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f185891i
            r4 = r2
            goto L_0x004e
        L_0x004d:
            r4 = r10
        L_0x004e:
            er1.w3 r2 = er1.C58784w3.f168295a
            te3.z0 r2 = r2.mo83937i0(r4)
            boolean r3 = r47.mo89715j()
            java.lang.String r8 = "getService(ISpannableSer…t, accountStyle.nickname)"
            r11 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r3 == 0) goto L_0x00d6
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            android.text.SpannableString r10 = r49.mo76091i()
            r3.<init>(r10)
            up1.w0 r10 = r49.mo76089b()
            boolean r10 = r10.mo89544z2()
            if (r10 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x0087
            di3.d r3 = di3.C86312j.m106911c(r16)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r10 = r48.mo85810B()
            java.lang.String r5 = r2.f145600d
            android.text.SpannableString r3 = r3.mo107057T1(r10, r5)
            gy3.C87412m.m108593f(r3, r8)
        L_0x0087:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            android.text.SpannableStringBuilder r5 = r5.append(r3)
            boolean r8 = r49.mo76095m()
            java.lang.String r10 = "textBuilder"
            if (r8 == 0) goto L_0x00cd
            ve1.i r8 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r5, r10)
            r8.mo89687m(r9, r5)
            up1.f r5 = up1.C37521f.f99374d
            boolean r5 = r5.mo61182h()
            if (r5 == 0) goto L_0x00fe
            android.content.Context r5 = r48.mo85810B()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r11)
            r9.setTextColor(r5)
            ve1.r$e r5 = new ve1.r$e
            r5.<init>(r14, r15)
            r9.setOnClickListener(r5)
            android.view.View r5 = r15.mo85812D(r7)
            ve1.r$k r8 = new ve1.r$k
            r8.<init>(r14, r15, r4, r6)
            r5.setOnClickListener(r8)
            goto L_0x00fe
        L_0x00cd:
            ve1.i r8 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r5, r10)
            r8.mo89687m(r9, r5)
            goto L_0x00fe
        L_0x00d6:
            android.text.SpannableString r3 = r49.mo76091i()
            up1.w0 r5 = r49.mo76089b()
            boolean r5 = r5.mo89544z2()
            if (r5 == 0) goto L_0x00f9
            if (r2 == 0) goto L_0x00f9
            di3.d r3 = di3.C86312j.m106911c(r16)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r5 = r48.mo85810B()
            java.lang.String r10 = r2.f145600d
            android.text.SpannableString r3 = r3.mo107057T1(r5, r10)
            gy3.C87412m.m108593f(r3, r8)
        L_0x00f9:
            ve1.i r5 = ve1.C65604i.f188772a
            r5.mo89687m(r9, r3)
        L_0x00fe:
            r10 = r3
            android.content.Context r3 = r48.mo85810B()
            up1.w0 r5 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r5 = r5.mo89532o2()
            r19 = r12
            long r11 = r5.createtime
            r21 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r21
            java.lang.String r12 = er1.C7878t0.m8037f(r3, r11)
            r11 = 2131300029(0x7f090ebd, float:1.8218076E38)
            r15.mo85815G(r11, r12)
            up1.w0 r3 = r49.mo76089b()
            java.lang.String r8 = ""
            if (r3 == 0) goto L_0x0131
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r3.mo89532o2()
            te3.uq0 r3 = r3.ip_region_info
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = r3.f143030d
            if (r3 != 0) goto L_0x0132
        L_0x0131:
            r3 = r8
        L_0x0132:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "username="
            r5.append(r11)
            up1.w0 r11 = r49.mo76089b()
            java.lang.String r11 = r11.getUsername()
            r5.append(r11)
            java.lang.String r11 = ", nickName="
            r5.append(r11)
            android.text.SpannableString r11 = r49.mo76091i()
            r5.append(r11)
            java.lang.String r11 = " content="
            r5.append(r11)
            up1.w0 r11 = r49.mo76089b()
            java.lang.String r11 = r11.getContent()
            r5.append(r11)
            java.lang.String r11 = " ipRegion="
            r5.append(r11)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r11 = "Finder.FinderFeedCommentConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r5)
            r5 = 2131306567(0x7f092847, float:1.8231337E38)
            android.view.View r5 = r15.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            up1.f r22 = up1.C37521f.f99374d
            pe1.c r22 = r22.mo61187m()
            java.lang.Object r22 = r22.mo60266n()
            java.lang.Number r22 = (java.lang.Number) r22
            int r7 = r22.intValue()
            r22 = r12
            r12 = 1
            r24 = r11
            r11 = 0
            if (r7 != r12) goto L_0x01a9
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r7 != 0) goto L_0x01a9
            if (r5 != 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            r5.setVisibility(r11)
        L_0x01a2:
            if (r5 != 0) goto L_0x01a5
            goto L_0x01ab
        L_0x01a5:
            r5.setText(r3)
            goto L_0x01ab
        L_0x01a9:
            if (r5 != 0) goto L_0x01af
        L_0x01ab:
            r3 = 2131297474(0x7f0904c2, float:1.8212894E38)
            goto L_0x01b5
        L_0x01af:
            r3 = 8
            r5.setVisibility(r3)
            goto L_0x01ab
        L_0x01b5:
            android.view.View r5 = r15.mo85812D(r3)
            r7 = r5
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            gy3.d0 r3 = new gy3.d0
            r3.<init>()
            r11 = 2
            r3.f27483d = r11
            java.lang.String r12 = "avatarIv"
            r11 = 2131311195(0x7f093a5b, float:1.8240723E38)
            if (r2 == 0) goto L_0x0211
            r28 = r3
            r3 = 8
            r15.mo85817I(r11, r3)
            bl3.r r0 = bl3.C39818r.f106831a
            r3 = r19
            bl3.r$a r11 = r0.mo62446e(r3)
            bl3.c r11 = r11.mo62447c(r13)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11872i2()
            r29 = r8
            pl1.f r8 = new pl1.f
            java.lang.String r2 = r2.f145601e
            r30 = r10
            r10 = 2
            r14 = 0
            r8.<init>(r2, r14, r10, r14)
            gy3.C87412m.m108593f(r7, r12)
            bl3.r$a r0 = r0.mo62446e(r3)
            bl3.c r0 = r0.mo62447c(r13)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r1)
            r11.mo85957c(r8, r7, r0)
            r0 = 1
            r5.f27482d = r0
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            goto L_0x026e
        L_0x0211:
            r28 = r3
            r29 = r8
            r30 = r10
            r3 = r19
            r14 = 0
            up1.w0 r2 = r49.mo76089b()
            r2.getClass()
            er1.j4 r8 = er1.C58739j4.f168176a
            int r2 = r2.mo89533p2()
            r8.getClass()
            r11 = 2
            r2 = r2 & r11
            if (r2 == 0) goto L_0x0230
            r2 = 1
            goto L_0x0231
        L_0x0230:
            r2 = 0
        L_0x0231:
            if (r2 == 0) goto L_0x0278
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r8 = r2.mo62446e(r3)
            bl3.c r8 = r8.mo62447c(r13)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11872i2()
            pl1.f r10 = new pl1.f
            up1.w0 r17 = r49.mo76089b()
            java.lang.String r11 = r17.mo89537t2()
            r10.<init>(r11, r0)
            gy3.C87412m.m108593f(r7, r12)
            bl3.r$a r0 = r2.mo62446e(r3)
            bl3.c r0 = r0.mo62447c(r13)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r1)
            r8.mo85957c(r10, r7, r0)
            r0 = 0
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            r15.mo85817I(r2, r0)
            r0 = 1
            r5.f27482d = r0
        L_0x026e:
            r14 = r3
            r6 = r5
            r18 = r28
            r8 = 8
            r28 = r4
            goto L_0x0351
        L_0x0278:
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            up1.w0 r8 = r49.mo76089b()
            boolean r8 = r8.mo89522A2()
            if (r8 != 0) goto L_0x0312
            up1.w0 r8 = r49.mo76089b()
            boolean r8 = r8.mo89544z2()
            if (r8 == 0) goto L_0x0291
            goto L_0x0312
        L_0x0291:
            r8 = 8
            r15.mo85817I(r2, r8)
            up1.w0 r1 = r49.mo76089b()
            java.lang.String r1 = r1.mo89537t2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02d8
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r2 = r1.mo62446e(r3)
            bl3.c r2 = r2.mo62447c(r13)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11865K1()
            pl1.f r10 = new pl1.f
            up1.w0 r11 = r49.mo76089b()
            java.lang.String r11 = r11.mo89537t2()
            r10.<init>(r11, r0)
            gy3.C87412m.m108593f(r7, r12)
            pl1.e0$a r0 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r1 = r1.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r13)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r0 = r1.mo11867O2(r0)
            r2.mo85957c(r10, r7, r0)
            goto L_0x02de
        L_0x02d8:
            r0 = 2131231871(0x7f08047f, float:1.8079835E38)
            r7.setImageResource(r0)
        L_0x02de:
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r0 = r6.f188866e
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo77342u()
            java.lang.String r10 = r0.getUserName()
            ve1.r$l r11 = new ve1.r$l
            r0 = r11
            r1 = r49
            r2 = r48
            r14 = r3
            r8 = r28
            r3 = r4
            r28 = r4
            r4 = r10
            r6 = r5
            r18 = r8
            r8 = 8
            r5 = r47
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnClickListener(r11)
            ve1.r$m r11 = new ve1.r$m
            r0 = r11
            r3 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r11)
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            goto L_0x0351
        L_0x0312:
            r14 = r3
            r6 = r5
            r18 = r28
            r8 = 8
            r28 = r4
            r15.mo85817I(r2, r8)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r14)
            bl3.c r4 = r4.mo62447c(r13)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11872i2()
            pl1.f r5 = new pl1.f
            up1.w0 r10 = r49.mo76089b()
            java.lang.String r10 = r10.mo89537t2()
            r5.<init>(r10, r0)
            gy3.C87412m.m108593f(r7, r12)
            bl3.r$a r0 = r3.mo62446e(r14)
            bl3.c r0 = r0.mo62447c(r13)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r1)
            r4.mo85957c(r5, r7, r0)
            r0 = 1
            r6.f27482d = r0
        L_0x0351:
            r0 = 2131302939(0x7f091a1b, float:1.8223978E38)
            android.view.View r1 = r15.mo85812D(r0)
            if (r1 == 0) goto L_0x03e2
            up1.w0 r3 = r49.mo76089b()
            boolean r3 = r3.mo89522A2()
            if (r3 == 0) goto L_0x03a3
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r32 = r3.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r34 = "onBindViewHolder"
            java.lang.String r35 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r1
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r32 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r33 = "onBindViewHolder"
            java.lang.String r34 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            r4 = 0
            goto L_0x03df
        L_0x03a3:
            k20.a r3 = new k20.a
            r3.<init>()
            k20.C60958c.m71442b(r8, r3)
            java.lang.Object[] r32 = r3.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r34 = "onBindViewHolder"
            java.lang.String r35 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r1
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r32 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r33 = "onBindViewHolder"
            java.lang.String r34 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
        L_0x03df:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x03e3
        L_0x03e2:
            r4 = 0
        L_0x03e3:
            up1.w0 r1 = r49.mo76089b()
            boolean r1 = r1.mo89544z2()
            if (r1 == 0) goto L_0x0407
            android.view.View r1 = r15.f44854d
            java.lang.String r3 = "holder.itemView"
            gy3.C87412m.m108593f(r1, r3)
            ve1.r$n r3 = new ve1.r$n
            r5 = r49
            r10 = 0
            r3.<init>(r15, r5)
            android.os.Handler r11 = zp3.C23564m.f67547a
            zp3.q r11 = new zp3.q
            r11.<init>(r3, r1)
            zp3.C23564m.m28136f(r11)
            goto L_0x0420
        L_0x0407:
            r5 = r49
            r10 = 0
            android.view.View r1 = r15.f44854d
            java.lang.String r3 = "holder.itemView"
            gy3.C87412m.m108593f(r1, r3)
            ve1.r$o r3 = new ve1.r$o
            r3.<init>()
            android.os.Handler r11 = zp3.C23564m.f67547a
            zp3.q r11 = new zp3.q
            r11.<init>(r3, r1)
            zp3.C23564m.m28136f(r11)
        L_0x0420:
            android.content.Context r1 = r48.mo85810B()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r3)
            r9.setTextColor(r1)
            boolean r1 = r6.f27482d
            if (r1 == 0) goto L_0x0468
            r1 = r18
            r11 = 1
            r1.f27483d = r11
            ve1.r$p r2 = new ve1.r$p
            r4 = r6
            r3 = r28
            r6 = r47
            r2.<init>(r5, r15, r3, r6)
            r9.setOnClickListener(r2)
            r2 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r2 = r15.mo85812D(r2)
            ve1.r$q r8 = new ve1.r$q
            r8.<init>(r5, r15, r3, r6)
            r2.setOnClickListener(r8)
            android.view.View r0 = r15.mo85812D(r0)
            if (r0 == 0) goto L_0x046e
            ve1.r$a r2 = new ve1.r$a
            r2.<init>(r5, r15, r3, r6)
            r0.setOnClickListener(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x046e
        L_0x0468:
            r4 = r6
            r1 = r18
            r11 = 1
            r6 = r47
        L_0x046e:
            gy3.C87412m.m108593f(r7, r12)
            ve1.r$b r0 = new ve1.r$b
            r0.<init>(r15, r4, r1, r5)
            zp3.C23564m.m28138h(r7, r0)
            r0 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r1 = r15.mo85812D(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r3 = 0
            r2.weight = r3
            r4 = -2
            r2.width = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r1.setLayoutParams(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r48.mo85810B()
            java.lang.String r4 = "holder.context"
            gy3.C87412m.m108593f(r2, r4)
            bl3.r$a r2 = r1.mo62443b(r2)
            java.lang.Class<mf1.a1> r7 = mf1.C10786a1.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r7)
            java.lang.String r7 = "UICProvider.of(holder.co…eedJumperUIC::class.java)"
            gy3.C87412m.m108593f(r2, r7)
            r7 = r2
            mf1.a1 r7 = (mf1.C10786a1) r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r6.f188868g
            up1.w0 r2 = r49.mo76089b()
            long r31 = r2.mo89531n2()
            r12 = 0
            r2 = 8
            r17 = 0
            r39 = r29
            r3 = 8
            r41 = r9
            r3 = r10
            r9 = r31
            r42 = r24
            r0 = 0
            r19 = 1
            r11 = r48
            r43 = r14
            r44 = r22
            r14 = 1
            r45 = r13
            r13 = r2
            r2 = 1
            r14 = r17
            mf1.C10846o0.m10831F3(r7, r8, r9, r11, r12, r13, r14)
            r7 = 2131307880(0x7f092d68, float:1.8234E38)
            r8 = 3
            r9 = 2131299973(0x7f090e85, float:1.8217963E38)
            if (r52 != 0) goto L_0x09e6
            r10 = 2131312336(0x7f093ed0, float:1.8243038E38)
            android.view.View r10 = r15.mo85812D(r10)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r10 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r10
            java.lang.Object r11 = r48.mo85818z()
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment"
            gy3.C87412m.m108592e(r11, r12)
            cm1.u r11 = (cm1.C55033u) r11
            boolean r11 = r11.mo76094l()
            r10.setCollapse(r11)
            android.view.View r10 = r15.mo85812D(r9)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r10 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r10
            java.lang.Object r11 = r48.mo85818z()
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment"
            gy3.C87412m.m108592e(r11, r12)
            cm1.u r11 = (cm1.C55033u) r11
            boolean r11 = r11.mo76090d()
            r10.setCollapse(r11)
            long r10 = java.lang.System.currentTimeMillis()
            android.view.View r12 = r15.mo85812D(r9)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r12 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r12
            android.content.Context r13 = r48.mo85810B()
            gy3.C87412m.m108593f(r13, r4)
            ve1.r$c r14 = new ve1.r$c
            r14.<init>(r15)
            android.text.SpannableString r13 = r5.mo76088a(r13, r3, r14)
            r12.setText(r13)
            java.util.ArrayList r12 = r49.mo76092j()
            if (r12 == 0) goto L_0x0557
            java.lang.Object r12 = sx3.C110818d0.m150916N(r12)
            te3.oq2 r12 = (te3.C50717oq2) r12
            if (r12 == 0) goto L_0x0557
            te3.wh0 r12 = r12.f139316f
            if (r12 == 0) goto L_0x0557
            ve1.i r13 = ve1.C65604i.f188772a
            r13.mo89686l(r12)
        L_0x0557:
            java.lang.Object[] r12 = new java.lang.Object[r8]
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r12[r0] = r10
            up1.w0 r10 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = r10.mo89532o2()
            java.util.LinkedList<te3.wh0> r10 = r10.search_keyword_info
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r2] = r10
            java.util.ArrayList r10 = r49.mo76092j()
            if (r10 == 0) goto L_0x0583
            int r11 = r10.size()
            goto L_0x0584
        L_0x0583:
            r11 = 0
        L_0x0584:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r11 = 2
            r12[r11] = r10
            java.lang.String r10 = "parse comment cost %s key total %d parsed %d"
            r13 = r42
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r10, r12)
            r10 = 2131296649(0x7f090189, float:1.821122E38)
            android.view.View r10 = r15.mo85812D(r10)
            android.view.View r12 = r15.mo85812D(r7)
            up1.w0 r14 = r49.mo76089b()
            boolean r14 = r14.mo89544z2()
            if (r14 == 0) goto L_0x0620
            k20.a r14 = new k20.a
            r14.<init>()
            k20.C60958c.m71442b(r0, r14)
            java.lang.Object[] r20 = r14.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r10
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r14 = r14.mo10231a(r0)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r10.setVisibility(r14)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            k20.a r14 = new k20.a
            r14.<init>()
            r3 = 8
            k20.C60958c.m71442b(r3, r14)
            java.lang.Object[] r20 = r14.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r12
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r3 = r14.mo10231a(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r12.setVisibility(r3)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0698
        L_0x0620:
            k20.a r3 = new k20.a
            r3.<init>()
            r14 = 8
            k20.C60958c.m71442b(r14, r3)
            java.lang.Object[] r20 = r3.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r10
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r3 = r3.mo10231a(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r10.setVisibility(r3)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            k20.a r3 = new k20.a
            r3.<init>()
            k20.C60958c.m71442b(r0, r3)
            java.lang.Object[] r20 = r3.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r12
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r3 = r3.mo10231a(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r12.setVisibility(r3)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0698:
            r3 = 2131299976(0x7f090e88, float:1.8217969E38)
            android.view.View r3 = r15.mo85812D(r3)
            r12 = r3
            com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout r12 = (com.tencent.p014mm.plugin.finder.view.FinderFixedRatioLayout) r12
            r3 = 2131299977(0x7f090e89, float:1.821797E38)
            android.view.View r3 = r15.mo85812D(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r14 = 2131299978(0x7f090e8a, float:1.8217973E38)
            android.view.View r14 = r15.mo85812D(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            up1.w0 r19 = r49.mo76089b()
            boolean r19 = r19.mo89544z2()
            if (r19 == 0) goto L_0x08e1
            up1.w0 r19 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = r19.mo89532o2()
            int r9 = r9.content_type
            if (r9 <= 0) goto L_0x08e1
            r12.setVisibility(r0)
            up1.w0 r9 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = r9.mo89532o2()
            te3.vh0 r9 = r9.advertisement_info
            if (r9 == 0) goto L_0x077f
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = r9.f185886d
            if (r9 == 0) goto L_0x077f
            android.content.Context r7 = r48.mo85810B()
            gy3.C87412m.m108593f(r7, r4)
            bl3.r$a r7 = r1.mo62443b(r7)
            java.lang.Class<rs1.s8> r8 = rs1.C13442s8.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
            rs1.s8 r7 = (rs1.C13442s8) r7
            int r7 = r7.mo12851f3()
            r8 = r43
            bl3.r$a r1 = r1.mo62446e(r8)
            java.lang.Class<pf1.n> r11 = pf1.C62273n.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            r19 = r1
            pf1.n r19 = (pf1.C62273n) r19
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r6.f188868g
            long r20 = r1.getItemId()
            up1.w0 r1 = r49.mo76089b()
            long r22 = r1.mo89531n2()
            r24 = r7
            androidx.lifecycle.z r1 = r19.mo87340f3(r20, r22, r24)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            up1.w0 r19 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r19.mo89532o2()
            te3.vh0 r0 = r0.advertisement_info
            if (r0 == 0) goto L_0x072d
            java.lang.String r0 = r0.f185890h
            if (r0 != 0) goto L_0x072f
        L_0x072d:
            r0 = r39
        L_0x072f:
            java.util.LinkedList<te3.uc4> r2 = r9.style
            r34 = r4
            java.lang.String r4 = "jumpInfo.style"
            gy3.C87412m.m108593f(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x073c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0778
            java.lang.Object r4 = r2.next()
            te3.uc4 r4 = (te3.uc4) r4
            r52 = r2
            pf1.l r2 = new pf1.l
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.f188868g
            long r21 = r5.getItemId()
            int r23 = r4.mo73360b()
            r4 = 1
            com.tencent.mm.protocal.protobuf.FinderJumpInfo[] r5 = new com.tencent.p014mm.protocal.protobuf.FinderJumpInfo[r4]
            r19 = 0
            r5[r19] = r9
            java.util.List r24 = sx3.C64197v.m75539h(r5)
            r25 = 0
            r27 = 16
            r28 = 0
            r19 = r2
            r20 = r7
            r26 = r0
            r19.<init>(r20, r21, r23, r24, r25, r26, r27, r28)
            r11.add(r2)
            r5 = r49
            r2 = r52
            goto L_0x073c
        L_0x0778:
            r4 = 1
            r1.postValue(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0784
        L_0x077f:
            r34 = r4
            r8 = r43
            r4 = 1
        L_0x0784:
            up1.w0 r0 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.mo89532o2()
            int r0 = r0.content_type
            r1 = 2
            if (r0 == r1) goto L_0x084d
            r1 = 3
            if (r0 == r1) goto L_0x07a1
            r0 = 8
            r12.setVisibility(r0)
            r46 = r34
            r0 = 1
            r1 = 0
            r11 = 8
            goto L_0x08d6
        L_0x07a1:
            up1.w0 r0 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.mo89532o2()
            te3.ky r0 = r0.content_info
            if (r0 == 0) goto L_0x07b9
            java.util.LinkedList<te3.py> r0 = r0.f183997f
            if (r0 == 0) goto L_0x07b9
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.py r0 = (te3.C64642py) r0
            r5 = r0
            goto L_0x07ba
        L_0x07b9:
            r5 = 0
        L_0x07ba:
            if (r5 == 0) goto L_0x07bf
            java.lang.String r0 = r5.f184916d
            goto L_0x07c0
        L_0x07bf:
            r0 = 0
        L_0x07c0:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0840
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r0 = r6.f188866e
            com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView r7 = r0.mo77340r1()
            r0 = 0
            r14.setVisibility(r0)
            r8 = 8
            r3.setVisibility(r8)
            if (r7 == 0) goto L_0x0839
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x07ee
            android.view.ViewParent r0 = r7.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x07e8
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x07e9
        L_0x07e8:
            r0 = 0
        L_0x07e9:
            if (r0 == 0) goto L_0x07ee
            r0.removeView(r7)
        L_0x07ee:
            r14.addView(r7)
            gy3.C87412m.m108591d(r5)
            int r0 = r5.f184920h
            if (r0 <= 0) goto L_0x07fa
            float r0 = (float) r0
            goto L_0x07fc
        L_0x07fa:
            r0 = 1098907648(0x41800000, float:16.0)
        L_0x07fc:
            int r1 = r5.f184921i
            if (r1 <= 0) goto L_0x0802
            float r1 = (float) r1
            goto L_0x0804
        L_0x0802:
            r1 = 1091567616(0x41100000, float:9.0)
        L_0x0804:
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x081b
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x081b
            r12.f17777d = r0
            r12.f17778e = r1
            r0 = 0
            r12.f17779f = r0
            r12.requestLayout()
            r12.invalidate()
            goto L_0x081c
        L_0x081b:
            r0 = 0
        L_0x081c:
            ve1.r$d r9 = new ve1.r$d
            r11 = 0
            r0 = r9
            r1 = r47
            r14 = 1
            r2 = r7
            r4 = 8
            r8 = 0
            r3 = r5
            r5 = r34
            r11 = 8
            r4 = r48
            r46 = r5
            r5 = r49
            r0.<init>(r1, r2, r3, r4, r5)
            r7.post(r9)
            goto L_0x0849
        L_0x0839:
            r46 = r34
            r8 = 0
            r11 = 8
            r14 = 1
            goto L_0x0849
        L_0x0840:
            r46 = r34
            r8 = 0
            r11 = 8
            r14 = 1
            r12.setVisibility(r11)
        L_0x0849:
            r1 = r8
            r0 = 1
            goto L_0x08d6
        L_0x084d:
            r46 = r34
            r0 = 1
            r1 = 0
            r11 = 8
            up1.w0 r2 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r2.mo89532o2()
            te3.ky r2 = r2.content_info
            if (r2 == 0) goto L_0x086a
            java.util.LinkedList<te3.my> r2 = r2.f183996e
            if (r2 == 0) goto L_0x086a
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.my r2 = (te3.C64565my) r2
            goto L_0x086b
        L_0x086a:
            r2 = r1
        L_0x086b:
            if (r2 == 0) goto L_0x0870
            java.lang.String r4 = r2.f184403d
            goto L_0x0871
        L_0x0870:
            r4 = r1
        L_0x0871:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x08d3
            r14.setVisibility(r11)
            if (r3 != 0) goto L_0x087d
            goto L_0x0881
        L_0x087d:
            r4 = 0
            r3.setVisibility(r4)
        L_0x0881:
            gy3.C87412m.m108591d(r2)
            int r4 = r2.f184405f
            if (r4 <= 0) goto L_0x088a
            float r4 = (float) r4
            goto L_0x088c
        L_0x088a:
            r4 = 1098907648(0x41800000, float:16.0)
        L_0x088c:
            int r5 = r2.f184406g
            if (r5 <= 0) goto L_0x0892
            float r5 = (float) r5
            goto L_0x0894
        L_0x0892:
            r5 = 1091567616(0x41100000, float:9.0)
        L_0x0894:
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x08aa
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x08aa
            r12.f17777d = r4
            r12.f17778e = r5
            r4 = 0
            r12.f17779f = r4
            r12.requestLayout()
            r12.invalidate()
        L_0x08aa:
            if (r3 == 0) goto L_0x08d6
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r8)
            r5 = r45
            bl3.c r4 = r4.mo62447c(r5)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11870V()
            pl1.t r5 = new pl1.t
            java.lang.String r8 = r2.f184403d
            if (r8 != 0) goto L_0x08c6
            r8 = r39
        L_0x08c6:
            r5.<init>(r8)
            l60.b r2 = r4.mo85955a(r5)
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r3)
            goto L_0x08d6
        L_0x08d3:
            r12.setVisibility(r11)
        L_0x08d6:
            ve1.r$f r2 = new ve1.r$f
            r3 = r49
            r2.<init>(r3, r15, r6)
            r12.setOnClickListener(r2)
            goto L_0x08ee
        L_0x08e1:
            r46 = r4
            r3 = r5
            r0 = 1
            r1 = 0
            r11 = 8
            r12.setVisibility(r11)
            r12.setOnClickListener(r1)
        L_0x08ee:
            ve1.r$g r2 = new ve1.r$g
            r2.<init>(r6, r3)
            r10.setOnClickListener(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onBindViewHolder poi="
            r2.append(r4)
            int r4 = r48.mo17363j()
            r2.append(r4)
            java.lang.String r4 = " replyCommentId:"
            r2.append(r4)
            up1.w0 r4 = r49.mo76089b()
            long r4 = r4.mo89541w2()
            r2.append(r4)
            java.lang.String r4 = ",nickname:"
            r2.append(r4)
            android.text.SpannableString r4 = r49.mo76093k()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r2 = 2131312336(0x7f093ed0, float:1.8243038E38)
            android.view.View r2 = r15.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r2 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r2
            up1.w0 r4 = r49.mo76089b()
            long r4 = r4.mo89541w2()
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x09d8
            boolean r4 = r6.f188867f
            if (r4 == 0) goto L_0x09d8
            r4 = 2131312337(0x7f093ed1, float:1.824304E38)
            r5 = 0
            r15.mo85817I(r4, r5)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            android.text.SpannableString r5 = r49.mo76093k()
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "item.replayDisplayNickname.toString()"
            gy3.C87412m.m108593f(r5, r7)
            ve1.i r7 = ve1.C65604i.f188772a
            com.tencent.neattextview.textview.view.NeatTextView r8 = r2.getContentTextView()
            android.text.TextPaint r8 = r8.getPaint()
            java.lang.String r9 = "replyContentTv.contentTextView.paint"
            gy3.C87412m.m108593f(r8, r9)
            android.content.Context r9 = r48.mo85810B()
            r10 = r46
            gy3.C87412m.m108593f(r9, r10)
            up1.f r12 = up1.C37521f.f99374d
            int r14 = r12.mo61150D()
            int r9 = r7.mo89677c(r9, r14)
            android.content.Context r14 = r48.mo85810B()
            gy3.C87412m.m108593f(r14, r10)
            int r12 = r12.mo61150D()
            int r12 = r12 + r0
            int r12 = r7.mo89677c(r14, r12)
            java.lang.String r5 = r7.mo89678d(r8, r5, r9, r12)
            di3.d r7 = di3.C86312j.m106911c(r16)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r8 = r48.mo85810B()
            android.text.SpannableString r5 = r7.mo107057T1(r8, r5)
            r4.append(r5)
            android.content.Context r5 = r48.mo85810B()
            r7 = 2131826303(0x7f11167f, float:1.9285487E38)
            java.lang.String r5 = r5.getString(r7)
            r4.append(r5)
            di3.d r5 = di3.C86312j.m106911c(r16)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r7 = r48.mo85810B()
            up1.w0 r8 = r49.mo76089b()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r8 = r8.mo89532o2()
            java.lang.String r8 = r8.reply_content
            if (r8 != 0) goto L_0x09cb
            r8 = r39
        L_0x09cb:
            android.text.SpannableString r5 = r5.mo107057T1(r7, r8)
            r4.append(r5)
            r2.setText(r4)
            r4 = r39
            goto L_0x09f0
        L_0x09d8:
            r10 = r46
            r4 = 2131312337(0x7f093ed1, float:1.824304E38)
            r15.mo85817I(r4, r11)
            r4 = r39
            r2.setText(r4)
            goto L_0x09f0
        L_0x09e6:
            r1 = r3
            r10 = r4
            r3 = r5
            r4 = r39
            r13 = r42
            r0 = 1
            r11 = 8
        L_0x09f0:
            vq1.w$a r2 = vq1.C65866w.f189406g
            vq1.w r5 = r2.mo14019a()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r7 = r6.f188866e
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo77342u()
            long r7 = r7.field_id
            up1.w0 r9 = r49.mo76089b()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r12 = r6.f188866e
            int r12 = r12.mo77331g()
            boolean r5 = r5.mo89907f(r7, r9, r12)
            r6.mo89718m(r5, r15)
            up1.w0 r7 = r49.mo76089b()
            int r7 = r7.field_state
            if (r7 == r0) goto L_0x0a1c
            r8 = -1
            if (r7 == r8) goto L_0x0a1c
            r12 = 1
            goto L_0x0a1d
        L_0x0a1c:
            r12 = 0
        L_0x0a1d:
            r7 = 2131297504(0x7f0904e0, float:1.8212955E38)
            if (r12 != 0) goto L_0x0a26
            r15.mo85817I(r7, r11)
            goto L_0x0a2a
        L_0x0a26:
            r8 = 0
            r15.mo85817I(r7, r8)
        L_0x0a2a:
            vq1.w r2 = r2.mo14019a()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r8 = r6.f188866e
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo77342u()
            long r8 = r8.field_id
            up1.w0 r12 = r49.mo76089b()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r14 = r6.f188866e
            int r14 = r14.mo77331g()
            int r2 = r2.mo89904b(r8, r12, r14)
            r8 = 2131297505(0x7f0904e1, float:1.8212957E38)
            if (r2 <= 0) goto L_0x0a55
            r9 = 0
            r15.mo85817I(r8, r9)
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r15.mo85815G(r8, r9)
            goto L_0x0a5b
        L_0x0a55:
            r15.mo85817I(r8, r11)
            r15.mo85815G(r8, r4)
        L_0x0a5b:
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r9 = r6.f188866e
            boolean r9 = r9.mo77333h()
            if (r9 == 0) goto L_0x0a7c
            android.view.View r9 = r15.mo85812D(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r12 = r48.mo85810B()
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131099718(0x7f060046, float:1.7811797E38)
            int r12 = r12.getColor(r14)
            r9.setTextColor(r12)
            goto L_0x0aaf
        L_0x0a7c:
            if (r5 == 0) goto L_0x0a97
            android.view.View r9 = r15.mo85812D(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r12 = r48.mo85810B()
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131099898(0x7f0600fa, float:1.7812162E38)
            int r12 = r12.getColor(r14)
            r9.setTextColor(r12)
            goto L_0x0aaf
        L_0x0a97:
            android.view.View r9 = r15.mo85812D(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r12 = r48.mo85810B()
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r12 = r12.getColor(r14)
            r9.setTextColor(r12)
        L_0x0aaf:
            ve1.i r9 = ve1.C65604i.f188772a
            android.content.Context r12 = r48.mo85810B()
            gy3.C87412m.m108593f(r12, r10)
            r14 = 2131302299(0x7f09179b, float:1.822268E38)
            android.view.View r14 = r15.mo85812D(r14)
            java.lang.String r11 = "holder.getView<View>(R.id.feed_comment_layout)"
            gy3.C87412m.m108593f(r14, r11)
            r11 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r11 = r15.mo85812D(r11)
            java.lang.String r1 = "holder.getView(R.id.nickname)"
            gy3.C87412m.m108593f(r11, r1)
            r22 = r11
            android.widget.TextView r22 = (android.widget.TextView) r22
            r1 = 2131300029(0x7f090ebd, float:1.8218076E38)
            android.view.View r1 = r15.mo85812D(r1)
            java.lang.String r11 = "holder.getView(R.id.comment_time)"
            gy3.C87412m.m108593f(r1, r11)
            r23 = r1
            android.widget.TextView r23 = (android.widget.TextView) r23
            android.view.View r24 = r15.mo85812D(r7)
            android.view.View r1 = r15.mo85812D(r8)
            r25 = r1
            android.widget.TextView r25 = (android.widget.TextView) r25
            r1 = 2131311195(0x7f093a5b, float:1.8240723E38)
            android.view.View r1 = r15.mo85812D(r1)
            java.lang.String r7 = "holder.getView(R.id.poster_tag)"
            gy3.C87412m.m108593f(r1, r7)
            r26 = r1
            android.widget.TextView r26 = (android.widget.TextView) r26
            r1 = 2131305224(0x7f092308, float:1.8228613E38)
            android.view.View r1 = r15.mo85812D(r1)
            java.lang.String r7 = "holder.getView(R.id.friend_tag)"
            gy3.C87412m.m108593f(r1, r7)
            r27 = r1
            android.widget.TextView r27 = (android.widget.TextView) r27
            java.lang.String r1 = "commentTimeText"
            r7 = r44
            gy3.C87412m.m108593f(r7, r1)
            r19 = r9
            r20 = r12
            r21 = r14
            r28 = r30
            r29 = r7
            r19.mo89688n(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            up1.w0 r1 = r49.mo76089b()
            int r1 = r1.field_state
            r8 = -1
            r11 = 2131299995(0x7f090e9b, float:1.8218007E38)
            if (r1 != r8) goto L_0x0b75
            r1 = 2131299994(0x7f090e9a, float:1.8218005E38)
            r8 = 0
            r15.mo85817I(r1, r8)
            r15.mo85817I(r11, r8)
            android.view.View r1 = r15.mo85812D(r11)
            android.widget.TextView r1 = (android.widget.TextView) r1
            up1.w0 r8 = r49.mo76089b()
            int r8 = r8.mo89535r2()
            if (r8 != r0) goto L_0x0b5c
            r1 = 2131826307(0x7f111683, float:1.9285495E38)
            r15.mo85814F(r11, r1)
            r1 = 2131299996(0x7f090e9c, float:1.821801E38)
            android.view.View r1 = r15.mo85812D(r1)
            r8 = 0
            r1.setOnClickListener(r8)
            goto L_0x0b72
        L_0x0b5c:
            r8 = 0
            r12 = 2131826553(0x7f111779, float:1.9285994E38)
            r15.mo85814F(r11, r12)
            r11 = 2131299996(0x7f090e9c, float:1.821801E38)
            android.view.View r11 = r15.mo85812D(r11)
            ve1.r$h r12 = new ve1.r$h
            r12.<init>(r6, r1, r15)
            r11.setOnClickListener(r12)
        L_0x0b72:
            r12 = 8
            goto L_0x0b81
        L_0x0b75:
            r8 = 0
            r1 = 2131299994(0x7f090e9a, float:1.8218005E38)
            r12 = 8
            r15.mo85817I(r1, r12)
            r15.mo85817I(r11, r12)
        L_0x0b81:
            up1.w0 r1 = r49.mo76089b()
            int r1 = r1.mo89533p2()
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0b94
            r1 = 2131307272(0x7f092b08, float:1.8232767E38)
            r11 = 0
            r15.mo85817I(r1, r11)
            goto L_0x0b9a
        L_0x0b94:
            r1 = 2131307272(0x7f092b08, float:1.8232767E38)
            r15.mo85817I(r1, r12)
        L_0x0b9a:
            r1 = 2131302297(0x7f091799, float:1.8222676E38)
            android.view.View r1 = r15.mo85812D(r1)
            java.lang.String r11 = "maskView"
            gy3.C87412m.m108593f(r1, r11)
            r11 = r50
            r9.mo89676b(r1, r3, r11, r13)
            er1.w3 r1 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r9 = r6.f188866e
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo77342u()
            java.lang.String r9 = r9.getUserName()
            boolean r1 = r1.mo83899R0(r9)
            if (r1 == 0) goto L_0x0c0a
            r1 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r1 = r15.mo85812D(r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r11 = 0
            k20.C60958c.m71442b(r11, r9)
            java.lang.Object[] r20 = r9.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 0
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            ve1.r$i r9 = new ve1.r$i
            r9.<init>(r6, r15, r3)
            r1.setOnClickListener(r9)
            goto L_0x0c66
        L_0x0c0a:
            r1 = 2131307880(0x7f092d68, float:1.8234E38)
            android.view.View r9 = r15.mo85812D(r1)
            if (r9 == 0) goto L_0x0c21
            android.content.Context r1 = r48.mo85810B()
            r11 = 16
            int r1 = kg3.C76577a.m92151b(r1, r11)
            r11 = 0
            r9.setPadding(r11, r11, r1, r11)
        L_0x0c21:
            r1 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r1 = r15.mo85812D(r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r11 = 8
            k20.C60958c.m71442b(r11, r9)
            java.lang.Object[] r20 = r9.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 0
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0c66:
            boolean r1 = r6.f188867f
            r9 = 2131314258(0x7f094652, float:1.8246936E38)
            if (r1 == 0) goto L_0x0cf4
            r0 = 2131313529(0x7f094379, float:1.8245457E38)
            android.view.View r0 = r15.mo85812D(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            k20.C60958c.m71442b(r2, r1)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            android.view.View r10 = r15.mo85812D(r9)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            k20.C60958c.m71442b(r1, r0)
            java.lang.Object[] r27 = r0.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r10
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.setVisibility(r0)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0cf4:
            up1.w0 r1 = r49.mo76089b()
            int r1 = r1.mo89534q2()
            r11 = 2131313529(0x7f094379, float:1.8245457E38)
            android.view.View r11 = r15.mo85812D(r11)
            android.content.Context r12 = r48.mo85810B()
            r13 = 2131838037(0x7f114455, float:1.9309286E38)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r8 = 2
            java.lang.String r19 = er1.C7878t0.m8034c(r8, r1)
            r8 = 0
            r14[r8] = r19
            java.lang.String r12 = r12.getString(r13, r14)
            java.lang.String r13 = "holder.context.getString…NE_WX, totalLevel2Count))"
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r13 = r6.f188866e
            boolean r13 = r13.mo77327a0(r3, r0)
            if (r1 <= 0) goto L_0x0e43
            if (r13 == 0) goto L_0x0e43
            k20.a r1 = new k20.a
            r1.<init>()
            k20.C60958c.m71442b(r8, r1)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = 0
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r11.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r1 = 2131313531(0x7f09437b, float:1.8245461E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r12)
            r1 = 2131313528(0x7f094378, float:1.8245455E38)
            android.view.View r1 = r11.findViewById(r1)
            k20.a r8 = new k20.a
            r8.<init>()
            r12 = 0
            k20.C60958c.m71442b(r12, r8)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r12 = 0
            java.lang.Object r8 = r8.mo10231a(r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r8 = 2131313530(0x7f09437a, float:1.824546E38)
            android.view.View r8 = r11.findViewById(r8)
            k20.a r12 = new k20.a
            r12.<init>()
            r13 = 8
            k20.C60958c.m71442b(r13, r12)
            java.lang.Object[] r20 = r12.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r8
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r8.setVisibility(r12)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            ve1.r$j r12 = new ve1.r$j
            r12.<init>(r1, r8, r6, r3)
            r11.setOnClickListener(r12)
            android.view.View r1 = r15.mo85812D(r9)
            k20.a r8 = new k20.a
            r8.<init>()
            r9 = 0
            k20.C60958c.m71442b(r9, r8)
            java.lang.Object[] r19 = r8.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0f07
        L_0x0e43:
            if (r13 != 0) goto L_0x0e88
            android.view.View r1 = r15.mo85812D(r9)
            k20.a r8 = new k20.a
            r8.<init>()
            r9 = 8
            k20.C60958c.m71442b(r9, r8)
            java.lang.Object[] r34 = r8.mo10232b()
            java.lang.String r35 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r36 = "onBindViewHolder"
            java.lang.String r37 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r1
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r34 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r35 = "onBindViewHolder"
            java.lang.String r36 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
            goto L_0x0ec9
        L_0x0e88:
            android.view.View r1 = r15.mo85812D(r9)
            k20.a r8 = new k20.a
            r8.<init>()
            r9 = 0
            k20.C60958c.m71442b(r9, r8)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0ec9:
            k20.a r1 = new k20.a
            r1.<init>()
            r8 = 8
            k20.C60958c.m71442b(r8, r1)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = 0
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r11.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0f07:
            android.text.SpannableString r1 = r49.mo76091i()
            r8 = r41
            r8.setContentDescription(r1)
            r1 = 2131302299(0x7f09179b, float:1.822268E38)
            android.view.View r1 = r15.mo85812D(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0f55
            r8 = 2131302575(0x7f0918af, float:1.822324E38)
            r9 = r30
            r1.setTag(r8, r9)
            r8 = 2131302516(0x7f091874, float:1.822312E38)
            r1.setTag(r8, r7)
            r7 = 2131302514(0x7f091872, float:1.8223116E38)
            r8 = 2131299973(0x7f090e85, float:1.8217963E38)
            android.view.View r8 = r15.mo85812D(r8)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r8 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r8
            if (r8 == 0) goto L_0x0f3d
            java.lang.CharSequence r8 = r8.getText()
            if (r8 != 0) goto L_0x0f3e
        L_0x0f3d:
            r8 = r4
        L_0x0f3e:
            r1.setTag(r7, r8)
            r4 = 2131302525(0x7f09187d, float:1.8223139E38)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r1.setTag(r4, r7)
            r4 = 2131302530(0x7f091882, float:1.8223149E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r1.setTag(r4, r7)
        L_0x0f55:
            r1 = 2131307880(0x7f092d68, float:1.8234E38)
            android.view.View r1 = r15.mo85812D(r1)
            if (r1 == 0) goto L_0x0f72
            r4 = 2131302525(0x7f09187d, float:1.8223139E38)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.setTag(r4, r5)
            r4 = 2131302530(0x7f091882, float:1.8223149E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setTag(r4, r2)
        L_0x0f72:
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r15.f44854d
            java.lang.String r4 = "finder_comment_item_view"
            r1.o30(r2, r4)
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r15.f44854d
            r4 = 6
            rx3.l[] r4 = new rx3.C13604l[r4]
            up1.w0 r5 = r49.mo76089b()
            long r7 = r5.mo89536s2()
            java.lang.String r5 = o40.C61926c.m72691p(r7)
            java.lang.String r7 = "feed_id"
            rx3.l r5 = rx3.C63681p.m74995a(r7, r5)
            r7 = 0
            r4[r7] = r5
            up1.w0 r5 = r49.mo76089b()
            long r7 = r5.mo89531n2()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "comment_id"
            rx3.l r5 = rx3.C63681p.m74995a(r7, r5)
            r4[r0] = r5
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            android.content.Context r5 = r48.mo85810B()
            gy3.C87412m.m108593f(r5, r10)
            rs1.s8 r5 = r0.mo12873f(r5)
            if (r5 == 0) goto L_0x0fcb
            java.lang.String r5 = r5.mo12841G3()
            goto L_0x0fcc
        L_0x0fcb:
            r5 = 0
        L_0x0fcc:
            java.lang.String r7 = "behaviour_session_id"
            rx3.l r5 = rx3.C63681p.m74995a(r7, r5)
            r7 = 2
            r4[r7] = r5
            android.content.Context r5 = r48.mo85810B()
            gy3.C87412m.m108593f(r5, r10)
            rs1.s8 r5 = r0.mo12873f(r5)
            if (r5 == 0) goto L_0x0fe7
            java.lang.String r5 = r5.mo12852g3()
            goto L_0x0fe8
        L_0x0fe7:
            r5 = 0
        L_0x0fe8:
            java.lang.String r7 = "finder_context_id"
            rx3.l r5 = rx3.C63681p.m74995a(r7, r5)
            r7 = 3
            r4[r7] = r5
            r5 = 4
            android.content.Context r7 = r48.mo85810B()
            gy3.C87412m.m108593f(r7, r10)
            rs1.s8 r0 = r0.mo12873f(r7)
            if (r0 == 0) goto L_0x1004
            java.lang.String r10 = r0.mo12850e3()
            goto L_0x1005
        L_0x1004:
            r10 = 0
        L_0x1005:
            java.lang.String r0 = "finder_tab_context_id"
            rx3.l r0 = rx3.C63681p.m74995a(r0, r10)
            r4[r5] = r0
            r0 = 5
            up1.w0 r3 = r49.mo76089b()
            java.lang.String r3 = r3.getUsername()
            java.lang.String r5 = "finder_username"
            rx3.l r3 = rx3.C63681p.m74995a(r5, r3)
            r4[r0] = r3
            java.util.Map r0 = sx3.C90364q0.m113147f(r4)
            r1.mo86149PM(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65638r.mo44e(jq3.o, cm1.u, int, int, boolean, java.util.List):void");
    }

    /* renamed from: m */
    public final void mo89718m(boolean z, C60905o oVar) {
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.a2u);
        View D = oVar.mo85812D(C0966R.C0970id.lwb);
        boolean[] zArr = {false};
        D.setOnTouchListener(new C14616v(zArr));
        C13604l lVar = z ? this.f188866e.mo77333h() ? new C13604l(Integer.valueOf(C0966R.raw.icon_filled_awesome), Integer.valueOf(oVar.f173499A.getResources().getColor(C0966R.color.BW_90))) : new C13604l(Integer.valueOf(C0966R.raw.icon_filled_awesome), Integer.valueOf(oVar.f173499A.getResources().getColor(C0966R.color.Red_90))) : this.f188866e.mo77333h() ? new C13604l(Integer.valueOf(C0966R.raw.icon_outlined_awesome), Integer.valueOf(oVar.f173499A.getResources().getColor(C0966R.color.BW_90))) : new C13604l(Integer.valueOf(C0966R.raw.icon_outlined_awesome), Integer.valueOf(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_5)));
        int intValue = ((Number) lVar.f38555d).intValue();
        int intValue2 = ((Number) lVar.f38556e).intValue();
        weImageView.setImageResource(intValue);
        weImageView.setIconColor(intValue2);
        D.setOnClickListener(new C65661w(this, oVar, zArr));
    }
}

package lp1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7434f1;
import gr1.C59671p2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: lp1.j */
public final class C10617j extends C10605a implements C59671p2 {

    /* renamed from: q */
    public ProgressBar f32001q;

    /* renamed from: r */
    public WeImageView f32002r;

    /* renamed from: s */
    public WeImageView f32003s;

    /* renamed from: t */
    public BaseFinderFeed f32004t;

    /* renamed from: u */
    public boolean f32005u;

    /* renamed from: v */
    public Runnable f32006v;

    /* renamed from: lp1.j$a */
    public static final class C10618a implements View.OnClickListener {

        /* renamed from: d */
        public static final C10618a f32007d = new C10618a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lp1.j$b */
    public static final class C10619b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10617j f32008d;

        public C10619b(C10617j jVar) {
            this.f32008d = jVar;
        }

        public final void run() {
            this.f32008d.mo10860c3(C76577a.m92151b(this.f32008d.getContext(), 152), 300, (float) C76577a.m92151b(this.f32008d.getContext(), 24));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10617j(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: G3 */
    public static final void m10569G3(C10617j jVar, int i) {
        RecyclerView recyclerView = jVar.f31972f;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(1);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        Log.m105924i("Finder.ShareGuideNextUIC", "[doPullDown]");
        jVar.mo10876I3(0);
        C7434f1.f25625a.mo8576b(jVar.getActivity(), i, "");
        jVar.clear();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r3 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r3.f31972f
            if (r1 == 0) goto L_0x0023
            r2 = 0
            androidx.recyclerview.widget.RecyclerView$z r1 = r1.mo17023I0(r2)
            if (r1 == 0) goto L_0x0023
            android.view.View r1 = r1.f44854d
            if (r1 == 0) goto L_0x0023
            r2 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r1.findViewById(r2)
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.video.FinderVideoLayout
            if (r2 == 0) goto L_0x001e
            r0 = r1
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r0
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.mo79544H(r3)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10617j.clear():void");
    }

    /* renamed from: I3 */
    public final void mo10876I3(long j) {
        View view = this.f31970d;
        if (view != null) {
            view.removeCallbacks(this.f32006v);
        }
        C10619b bVar = new C10619b(this);
        this.f32006v = bVar;
        View view2 = this.f31970d;
        if (view2 != null) {
            view2.postDelayed(bVar, j);
        }
    }

    /* renamed from: K2 */
    public void mo5164K2(long j, long j2) {
    }

    /* renamed from: f3 */
    public int mo10862f3() {
        return C0966R.C0970id.agr;
    }

    /* renamed from: g3 */
    public void mo10863g3(List<? extends BaseFinderFeed> list, int i) {
        C87412m.m108594g(list, "feeds");
        super.mo10863g3(list, i);
        if (list.size() > 1) {
            this.f32004t = (BaseFinderFeed) list.get(1);
        }
    }

    /* renamed from: i3 */
    public void mo10864i3(RecyclerView recyclerView) {
        RoundCornerRelativeLayout roundCornerRelativeLayout;
        RecyclerView.C16631z I0;
        View view;
        C87412m.m108594g(recyclerView, "recyclerView");
        super.mo10864i3(recyclerView);
        RecyclerView recyclerView2 = this.f31972f;
        if (!(recyclerView2 == null || (I0 = recyclerView2.mo17023I0(0)) == null || (view = I0.f44854d) == null)) {
            View findViewById = view.findViewById(C0966R.C0970id.d7a);
            FrameLayout.LayoutParams layoutParams = null;
            FinderVideoLayout finderVideoLayout = findViewById instanceof FinderVideoLayout ? (FinderVideoLayout) findViewById : null;
            if (finderVideoLayout != null) {
                finderVideoLayout.mo79569m(this);
            }
            this.f32002r = (WeImageView) view.findViewById(C0966R.C0970id.eah);
            this.f32003s = (WeImageView) view.findViewById(C0966R.C0970id.crv);
            int[] iArr = new int[2];
            WeImageView weImageView = this.f32002r;
            if (weImageView != null) {
                weImageView.getLocationInWindow(iArr);
            }
            int i = iArr[0];
            int i2 = iArr[1];
            WeImageView weImageView2 = this.f32003s;
            if (weImageView2 != null) {
                weImageView2.setVisibility(4);
            }
            WeImageView weImageView3 = this.f32003s;
            ViewGroup.LayoutParams layoutParams2 = weImageView3 != null ? weImageView3.getLayoutParams() : null;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                layoutParams.leftMargin = i;
                layoutParams.topMargin = i2;
                WeImageView weImageView4 = this.f32003s;
                if (weImageView4 != null) {
                    weImageView4.setLayoutParams(layoutParams);
                }
            }
            FinderFullSeekBarLayout finderFullSeekBarLayout = this.f31975i;
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.setFakeFloatPlayIcon(this.f32003s);
            }
        }
        View view2 = this.f31970d;
        if (view2 != null && (roundCornerRelativeLayout = (RoundCornerRelativeLayout) view2.findViewById(C0966R.C0970id.eso)) != null) {
            roundCornerRelativeLayout.setOnClickListener(C10618a.f32007d);
        }
    }

    /* renamed from: k3 */
    public void mo10866k3() {
        super.mo10866k3();
        BaseFinderFeed baseFinderFeed = this.f32004t;
        boolean z = true;
        if (!(baseFinderFeed != null && 2 == baseFinderFeed.mo75c()) && this.f32005u) {
            WeImageView weImageView = this.f32002r;
            if (weImageView == null || weImageView.getVisibility() != 0) {
                z = false;
            }
            if (!z) {
                WeImageView weImageView2 = this.f32002r;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                WeImageView weImageView3 = this.f32002r;
                if (weImageView3 != null) {
                    weImageView3.setAlpha(1.0f);
                }
            }
        }
        WeImageView weImageView4 = this.f32003s;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        }
        Log.m105924i("Finder.ShareGuideNextUIC", "[hide]");
    }

    /* renamed from: l3 */
    public void mo10867l3(float f) {
        super.mo10867l3(f);
        mo10876I3(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10869n3() {
        /*
            r4 = this;
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99159E3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0056
            int r0 = r4.f31979p
            r3 = 25
            if (r0 == r3) goto L_0x0022
            r3 = 38
            if (r0 != r3) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0056
            java.util.List<? extends com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r4.f31976j
            if (r0 == 0) goto L_0x0052
            int r3 = r0.size()
            if (r3 <= r2) goto L_0x0052
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            if (r0 == 0) goto L_0x0046
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x0046
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x0046
            int r0 = r0.permissionFlag
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004d
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            r1 = 1
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10617j.mo10869n3():boolean");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10870o3() {
        /*
            r13 = this;
            boolean r0 = r13.f31971e
            r1 = 0
            java.lang.String r2 = "Finder.ShareGuideNextUIC"
            if (r0 != 0) goto L_0x0260
            boolean r0 = r13.mo10865j3()
            if (r0 == 0) goto L_0x000f
            goto L_0x0260
        L_0x000f:
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            android.view.View r4 = r13.f31970d
            r5 = 0
            if (r4 == 0) goto L_0x0022
            r6 = 2131305815(0x7f092557, float:1.8229811E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r13.f32004t
            java.lang.String r7 = ""
            r8 = 1
            if (r6 == 0) goto L_0x00d1
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            if (r6 == 0) goto L_0x00d1
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            if (r6 == 0) goto L_0x00d1
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00d1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x00d1
            int r9 = r6.size()
            if (r9 <= 0) goto L_0x00d1
            java.lang.Object r9 = r6.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r9 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r9
            java.lang.String r9 = r9.coverUrl
            if (r9 == 0) goto L_0x0057
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r9 = 0
            goto L_0x0058
        L_0x0057:
            r9 = 1
        L_0x0058:
            if (r9 == 0) goto L_0x007d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Object r10 = r6.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r10
            java.lang.String r10 = r10.thumbUrl
            r9.append(r10)
            java.lang.Object r6 = r6.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r6 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r6
            java.lang.String r6 = r6.thumb_url_token
            if (r6 != 0) goto L_0x0075
            r6 = r7
        L_0x0075:
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x009f
        L_0x007d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Object r10 = r6.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r10
            java.lang.String r10 = r10.coverUrl
            r9.append(r10)
            java.lang.Object r6 = r6.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r6 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r6
            java.lang.String r6 = r6.cover_url_token
            if (r6 != 0) goto L_0x0098
            r6 = r7
        L_0x0098:
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x009f:
            if (r4 == 0) goto L_0x00d1
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r3)
            bl3.c r10 = r10.mo62447c(r0)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r6, r12)
            pl1.e0$a r6 = pl1.C11978e0.C11979a.SHARE_STREAM_GUIDE_ITEM
            bl3.r$a r3 = r9.mo62446e(r3)
            bl3.c r0 = r3.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r6)
            l60.b r0 = r10.mo85956b(r11, r0)
            l60.a r0 = (l60.C99342a) r0
            r0.mo85954d(r4)
        L_0x00d1:
            if (r4 == 0) goto L_0x00db
            lp1.i r0 = new lp1.i
            r0.<init>(r13)
            r4.setOnClickListener(r0)
        L_0x00db:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r13.f32004t
            r3 = 8
            if (r0 != 0) goto L_0x00e3
            goto L_0x0186
        L_0x00e3:
            android.app.Activity r4 = r13.getContext()
            android.view.View r6 = r13.f31970d
            if (r6 == 0) goto L_0x00f5
            r9 = 2131305814(0x7f092556, float:1.822981E38)
            android.view.View r6 = r6.findViewById(r9)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L_0x00f6
        L_0x00f5:
            r6 = r5
        L_0x00f6:
            if (r6 != 0) goto L_0x00fa
            goto L_0x0186
        L_0x00fa:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
            if (r9 == 0) goto L_0x0109
            java.util.LinkedList<te3.zk1> r9 = r9.short_title
            goto L_0x010a
        L_0x0109:
            r9 = r5
        L_0x010a:
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r0.mo3513o()
            android.text.SpannableString r10 = r10.getFlowCardDescSpan()
            if (r10 == 0) goto L_0x011d
            int r10 = r10.length()
            if (r10 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r10 = 0
            goto L_0x011e
        L_0x011d:
            r10 = 1
        L_0x011e:
            if (r10 != 0) goto L_0x012f
            r6.setVisibility(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            android.text.SpannableString r0 = r0.getFlowCardDescSpan()
            r6.setText(r0)
            goto L_0x017b
        L_0x012f:
            if (r9 == 0) goto L_0x013a
            boolean r10 = r9.isEmpty()
            r10 = r10 ^ r8
            if (r10 != r8) goto L_0x013a
            r10 = 1
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            if (r10 == 0) goto L_0x0158
            r6.setVisibility(r1)
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            java.lang.Object r1 = sx3.C110818d0.m150914L(r9)
            te3.zk1 r1 = (te3.C52277zk1) r1
            java.lang.String r1 = r1.f146050d
            android.text.SpannableString r0 = r0.mo107057T1(r4, r1)
            r6.setText(r0)
            goto L_0x017b
        L_0x0158:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.mo3513o()
            java.lang.String r4 = r4.getDescription()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0175
            r6.setVisibility(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            android.text.SpannableString r0 = r0.getDescriptionSpan()
            r6.setText(r0)
            goto L_0x017b
        L_0x0175:
            r6.setVisibility(r3)
            r6.setText(r7)
        L_0x017b:
            er1.C7919x.m8091a(r6)
            lp1.k r0 = new lp1.k
            r0.<init>(r13)
            r6.setOnClickListener(r0)
        L_0x0186:
            android.view.View r0 = r13.f31970d
            if (r0 == 0) goto L_0x0192
            r1 = 2131305812(0x7f092554, float:1.8229805E38)
            android.view.View r0 = r0.findViewById(r1)
            goto L_0x0193
        L_0x0192:
            r0 = r5
        L_0x0193:
            if (r0 == 0) goto L_0x019d
            lp1.h r1 = new lp1.h
            r1.<init>(r13)
            r0.setOnClickListener(r1)
        L_0x019d:
            android.view.View r0 = r13.f31970d
            if (r0 == 0) goto L_0x01ab
            r1 = 2131297726(0x7f0905be, float:1.8213405E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L_0x01ac
        L_0x01ab:
            r0 = r5
        L_0x01ac:
            android.view.View r1 = r13.f31970d
            if (r1 == 0) goto L_0x01ba
            r4 = 2131297737(0x7f0905c9, float:1.8213427E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            goto L_0x01bb
        L_0x01ba:
            r1 = r5
        L_0x01bb:
            vp3.b r4 = new vp3.b
            r4.<init>()
            android.app.Activity r6 = r13.getContext()
            com.tencent.mm.ui.i3$a r6 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r6)
            int r6 = r6.f24704a
            android.app.Activity r9 = r13.getContext()
            r10 = 32
            int r9 = kg3.C76577a.m92151b(r9, r10)
            int r6 = r6 - r9
            android.app.Activity r9 = r13.getContext()
            r10 = 122(0x7a, float:1.71E-43)
            int r9 = kg3.C76577a.m92151b(r9, r10)
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r6, r9, r10)
            java.lang.String r11 = "#61F0F0F0"
            int r11 = android.graphics.Color.parseColor(r11)
            r10.eraseColor(r11)
            r4.mo89891b(r10)
            r4.f189363b = r6
            r4.f189364c = r9
            vp3.c r6 = r4.f189366e
            com.tencent.mm.xeffect.effect.EffectManager r6 = r6.f334033b
            rr3.b r6 = r6.mo154922b()
            r9 = 1101004800(0x41a00000, float:20.0)
            r6.mo162186d(r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            r6.mo162187e(r9)
            lp1.g r6 = new lp1.g
            r6.<init>(r0)
            r4.mo89890a(r6)
            if (r1 == 0) goto L_0x0224
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r4 = r13.getResources()
            r6 = 2131099753(0x7f060069, float:1.7811868E38)
            int r4 = r4.getColor(r6)
            r0.<init>(r4)
            r1.setImageDrawable(r0)
        L_0x0224:
            android.view.View r0 = r13.f31970d
            if (r0 == 0) goto L_0x0238
            android.app.Activity r0 = r13.getContext()
            r1 = 176(0xb0, float:2.47E-43)
            int r0 = kg3.C76577a.m92151b(r0, r1)
            float r0 = (float) r0
            r9 = 300(0x12c, double:1.48E-321)
            r13.mo10868m3(r0, r9)
        L_0x0238:
            dp1.f1 r0 = dp1.C7434f1.f25625a
            androidx.appcompat.app.AppCompatActivity r1 = r13.getActivity()
            r4 = 3
            r0.mo8576b(r1, r4, r7)
            android.view.View r0 = r13.f31970d
            if (r0 == 0) goto L_0x0250
            r1 = 2131305816(0x7f092558, float:1.8229814E38)
            android.view.View r0 = r0.findViewById(r1)
            r5 = r0
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
        L_0x0250:
            r13.f32001q = r5
            if (r5 != 0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r5.setVisibility(r3)
        L_0x0258:
            r13.f31971e = r8
            java.lang.String r0 = "[show]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x0260:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[show] return due to isShowing:"
            r0.append(r3)
            boolean r3 = r13.f31971e
            r0.append(r3)
            java.lang.String r3 = " or isNotAllow:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10617j.mo10870o3():void");
    }

    public void onDestroy() {
        super.onDestroy();
        View view = this.f31970d;
        if (view != null) {
            view.removeCallbacks(this.f32006v);
        }
        clear();
    }

    public void onVideoPause() {
        this.f32005u = true;
        ProgressBar progressBar = this.f32001q;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            progressBar.setVisibility(8);
            View view = this.f31970d;
            if (view != null) {
                view.removeCallbacks(this.f32006v);
            }
        }
    }

    public void onVideoPlay() {
        this.f32005u = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10617j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}

package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.view.HardTouchableLayout;
import ef1.C58553c;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59667n2;
import gr1.C59670o2;
import gr1.C8388e1;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import nj3.C88989a;
import qt1.C12931a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64689rq2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI */
public final class FinderMediaPreviewUI extends MMFinderUI {

    /* renamed from: y */
    public static final /* synthetic */ int f161053y = 0;

    /* renamed from: o */
    public final C13601g f161054o = C36568h.m40985a(new C56346d(this));

    /* renamed from: p */
    public final C13601g f161055p = C36568h.m40985a(new C56343a(this));

    /* renamed from: q */
    public final C13601g f161056q = C36568h.m40985a(new C56344b(this));

    /* renamed from: r */
    public ViewGroup f161057r;

    /* renamed from: s */
    public final C13601g f161058s = C36568h.m40985a(new C56347e(this));

    /* renamed from: t */
    public final FinderVideoCore f161059t = new FinderVideoCore(0, 1, (C8480h) null);

    /* renamed from: u */
    public final LinkedList<C64689rq2> f161060u = new LinkedList<>();

    /* renamed from: v */
    public boolean f161061v = true;

    /* renamed from: w */
    public boolean f161062w;

    /* renamed from: x */
    public C58553c f161063x;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$a */
    public static final class C56343a extends C87413o implements C32224a<HardTouchableLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaPreviewUI f161064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56343a(FinderMediaPreviewUI finderMediaPreviewUI) {
            super(0);
            this.f161064d = finderMediaPreviewUI;
        }

        public Object invoke() {
            return (HardTouchableLayout) this.f161064d.findViewById(C0966R.C0970id.bdq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$b */
    public static final class C56344b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaPreviewUI f161065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56344b(FinderMediaPreviewUI finderMediaPreviewUI) {
            super(0);
            this.f161065d = finderMediaPreviewUI;
        }

        public Object invoke() {
            return this.f161065d.findViewById(C0966R.C0970id.bec);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$c */
    public static final class C56345c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaPreviewUI f161066d;

        public C56345c(FinderMediaPreviewUI finderMediaPreviewUI) {
            this.f161066d = finderMediaPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f161066d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$d */
    public static final class C56346d extends C87413o implements C32224a<FinderMediaLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaPreviewUI f161067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56346d(FinderMediaPreviewUI finderMediaPreviewUI) {
            super(0);
            this.f161067d = finderMediaPreviewUI;
        }

        public Object invoke() {
            return (FinderMediaLayout) this.f161067d.findViewById(C0966R.C0970id.ol_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$e */
    public static final class C56347e extends C87413o implements C32224a<FinderLongVideoPlayerSeekBar> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaPreviewUI f161068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56347e(FinderMediaPreviewUI finderMediaPreviewUI) {
            super(0);
            this.f161068d = finderMediaPreviewUI;
        }

        public Object invoke() {
            return (FinderLongVideoPlayerSeekBar) this.f161068d.findViewById(C0966R.C0970id.l7d);
        }
    }

    /* renamed from: N7 */
    public final FinderMediaLayout mo79091N7() {
        Object value = ((C36570n) this.f161054o).getValue();
        C87412m.m108593f(value, "<get-mediaLayout>(...)");
        return (FinderMediaLayout) value;
    }

    /* renamed from: O7 */
    public final FinderLongVideoPlayerSeekBar mo79092O7() {
        Object value = ((C36570n) this.f161058s).getValue();
        C87412m.m108593f(value, "<get-seekBar>(...)");
        return (FinderLongVideoPlayerSeekBar) value;
    }

    /* renamed from: P7 */
    public final boolean mo79093P7(boolean z) {
        C59670o2 videoView = ((FinderVideoLayout) mo79091N7().getVideoBanner().getMediaView()).getVideoView();
        if (videoView == null) {
            return false;
        }
        boolean isPlaying = videoView.isPlaying();
        if (isPlaying || z) {
            videoView.pause();
        } else {
            videoView.play();
        }
        return !isPlaying;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.alj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r25 = this;
            r7 = r25
            java.lang.Class<pl1.s0> r8 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            com.tencent.mm.plugin.finder.view.u7 r1 = com.tencent.p014mm.plugin.finder.view.C4189u7.IMAGE
            super.initView()
            te3.pq2 r0 = new te3.pq2
            r0.<init>()
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r3 = "media_list_"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r11 = 1
            r12 = 0
            if (r2 != 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0031
        L_0x0023:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r2
            java.lang.String r2 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r0)
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x0038
            te3.pq2 r0 = new te3.pq2
            r0.<init>()
        L_0x0038:
            java.util.LinkedList<te3.rq2> r2 = r7.f161060u
            java.util.LinkedList<te3.rq2> r0 = r0.f184875d
            r2.addAll(r0)
            java.util.LinkedList<te3.rq2> r0 = r7.f161060u
            java.lang.Object r0 = r0.getFirst()
            r2 = r0
            te3.rq2 r2 = (te3.C64689rq2) r2
            float r3 = r2.f185270h
            float r4 = r2.f185271i
            te3.jr2 r2 = r2.f185281u
            java.util.LinkedList<te3.rq2> r5 = r7.f161060u
            java.util.Iterator r5 = r5.iterator()
            r13 = r2
            r14 = r3
            r15 = r4
        L_0x0057:
            boolean r2 = r5.hasNext()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r5.next()
            te3.rq2 r2 = (te3.C64689rq2) r2
            float r3 = r2.f185271i
            float r4 = r3 * r6
            float r11 = r2.f185270h
            float r4 = r4 / r11
            r10 = r0
            te3.rq2 r10 = (te3.C64689rq2) r10
            float r12 = r10.f185271i
            float r12 = r12 * r6
            float r6 = r10.f185270h
            float r12 = r12 / r6
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            te3.jr2 r0 = r2.f185281u
            r13 = r0
            r0 = r2
            r15 = r3
            r14 = r11
        L_0x0080:
            r11 = 1
            r12 = 0
            goto L_0x0057
        L_0x0083:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = new com.tencent.mm.plugin.finder.storage.FinderItem
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2.setMediaExtList(r3)
            java.util.LinkedList r3 = r2.getMediaExtList()
            java.util.LinkedList<te3.rq2> r4 = r7.f161060u
            r3.addAll(r4)
            te3.rq2 r0 = (te3.C64689rq2) r0
            int r0 = r0.f185268f
            r3 = 4
            if (r0 != r3) goto L_0x00a3
            com.tencent.mm.plugin.finder.view.u7 r0 = com.tencent.p014mm.plugin.finder.view.C4189u7.VIDEO
            goto L_0x00a4
        L_0x00a3:
            r0 = r1
        L_0x00a4:
            if (r0 != r1) goto L_0x00ac
            cm1.x r1 = new cm1.x
            r1.<init>(r2)
            goto L_0x00b1
        L_0x00ac:
            cm1.j0 r1 = new cm1.j0
            r1.<init>(r2)
        L_0x00b1:
            r10 = r1
            com.tencent.mm.plugin.finder.video.FinderVideoCore r1 = r7.f161059t
            r3 = 0
            r4 = 0
            r5 = 6
            r11 = 0
            r2 = r25
            r12 = 1065353216(0x3f800000, float:1.0)
            r6 = r11
            com.tencent.p014mm.plugin.finder.video.FinderVideoCore.m65069F1(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r1 = r25.mo79091N7()
            com.tencent.mm.plugin.finder.view.v r2 = new com.tencent.mm.plugin.finder.view.v
            r2.<init>()
            r1.mo4636b(r0, r2)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r0 = r25.mo79091N7()
            com.tencent.mm.plugin.finder.view.m r1 = new com.tencent.mm.plugin.finder.view.m
            r1.<init>()
            com.tencent.mm.plugin.finder.video.FinderVideoCore r2 = r7.f161059t
            r1.f18246e = r2
            boolean r2 = r7.f161062w
            r1.f18242a = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r0.mo4635a(r10, r1)
            boolean r0 = r7.f161062w
            if (r0 == 0) goto L_0x01c9
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r1 = r25.mo79091N7()
            r0.getClass()
            er1.j4 r0 = er1.C58739j4.f168176a
            r0.getClass()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r25)
            int r2 = r0.x
            if (r2 == 0) goto L_0x0102
            int r2 = r0.y
            if (r2 == 0) goto L_0x0102
            r2 = 1
            goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            if (r2 == 0) goto L_0x0108
            int r3 = r0.y
            goto L_0x0112
        L_0x0108:
            android.content.res.Resources r3 = r25.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
        L_0x0112:
            if (r2 == 0) goto L_0x0117
            int r0 = r0.x
            goto L_0x0121
        L_0x0117:
            android.content.res.Resources r0 = r25.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
        L_0x0121:
            float r2 = r15 / r14
            float r4 = (float) r3
            float r5 = (float) r0
            float r6 = r4 / r5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x012d
            r2 = r3
            goto L_0x0131
        L_0x012d:
            float r5 = r5 * r15
            float r5 = r5 / r14
            int r2 = (int) r5
        L_0x0131:
            if (r3 != r2) goto L_0x0137
            float r4 = r4 * r14
            float r4 = r4 / r15
            int r0 = (int) r4
        L_0x0137:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r13 == 0) goto L_0x01b6
            float r3 = (float) r0
            float r3 = r3 / r14
            int r4 = java.lang.Float.compare(r12, r3)
            if (r4 == 0) goto L_0x01b6
            te3.bp1 r4 = r13.f183831e
            if (r4 != 0) goto L_0x0163
            te3.bp1 r4 = new te3.bp1
            r4.<init>()
        L_0x0163:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            java.util.LinkedList<java.lang.Float> r4 = r4.f131245d
            java.lang.String r6 = "originMatrix.value"
            gy3.C87412m.m108593f(r4, r6)
            float[] r4 = sx3.C110818d0.m150950v0(r4)
            r5.setValues(r4)
            r5.postScale(r3, r3)
            r3 = 9
            float[] r3 = new float[r3]
            r5.getValues(r3)
            te3.bp1 r4 = r13.f183831e
            if (r4 == 0) goto L_0x018b
            java.util.LinkedList<java.lang.Float> r4 = r4.f131245d
            if (r4 == 0) goto L_0x018b
            r4.clear()
        L_0x018b:
            te3.bp1 r4 = r13.f183831e
            if (r4 == 0) goto L_0x019a
            java.util.LinkedList<java.lang.Float> r4 = r4.f131245d
            if (r4 == 0) goto L_0x019a
            java.util.List r3 = sx3.C110823p.m150998X(r3)
            r4.addAll(r3)
        L_0x019a:
            r13.f183834h = r0
            r13.f183835i = r2
            te3.zr4 r3 = r13.f183830d
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a6
        L_0x01a3:
            r4 = 0
            r3.f186847d = r4
        L_0x01a6:
            if (r3 != 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r3.f186849f = r0
        L_0x01ab:
            if (r3 != 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r3.f186848e = r2
        L_0x01b0:
            if (r3 != 0) goto L_0x01b3
            goto L_0x01b6
        L_0x01b3:
            r4 = 0
            r3.f186850g = r4
        L_0x01b6:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 != 0) goto L_0x01c1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r0, r2)
        L_0x01c1:
            r3.width = r0
            r3.height = r2
            r1.setLayoutParams(r3)
            goto L_0x0204
        L_0x01c9:
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r17 = r25.mo79091N7()
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r1 = r25.mo79091N7()
            r2 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r1 = r1.findViewById(r2)
            java.lang.String r2 = "findViewById(R.id.finder_media_banner)"
            gy3.C87412m.m108593f(r1, r2)
            r18 = r1
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner r18 = (com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner) r18
            java.util.LinkedList<te3.rq2> r1 = r7.f161060u
            float r19 = r0.mo83925e0(r1)
            android.content.Context r1 = r25.getBaseContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            r22 = 0
            r24 = 0
            java.lang.String r21 = ""
            r16 = r0
            r20 = r1
            r16.mo83919c(r17, r18, r19, r20, r21, r22, r24)
        L_0x0204:
            boolean r0 = r7.f161062w
            if (r0 != 0) goto L_0x02bf
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131494472(0x7f0c0648, float:1.8612453E38)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r2 = r25.mo79091N7()
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.f161057r = r0
            r1 = 2131311122(0x7f093a12, float:1.8240575E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.view.ViewGroup r1 = r7.f161057r
            if (r1 == 0) goto L_0x023c
            r2 = 2131311150(0x7f093a2e, float:1.8240632E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x023d
        L_0x023c:
            r1 = 0
        L_0x023d:
            r2 = 8
            if (r0 != 0) goto L_0x0242
            goto L_0x0245
        L_0x0242:
            r0.setVisibility(r2)
        L_0x0245:
            if (r1 != 0) goto L_0x0248
            goto L_0x024b
        L_0x0248:
            r1.setVisibility(r2)
        L_0x024b:
            fe1.d$b r3 = fe1.C58961d.f168673a
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            fe1.q r3 = r3.mo84155b(r4)
            if (r3 == 0) goto L_0x02ae
            if (r0 != 0) goto L_0x025d
            r4 = 0
            goto L_0x0261
        L_0x025d:
            r4 = 0
            r0.setVisibility(r4)
        L_0x0261:
            if (r1 != 0) goto L_0x0264
            goto L_0x0267
        L_0x0264:
            r1.setVisibility(r4)
        L_0x0267:
            if (r0 == 0) goto L_0x0295
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r9)
            bl3.c r5 = r5.mo62447c(r8)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r6 = new pl1.f
            java.lang.String r10 = r3.field_avatarUrl
            r11 = 2
            r12 = 0
            r6.<init>(r10, r12, r11, r12)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r4 = r4.mo62446e(r9)
            bl3.c r4 = r4.mo62447c(r8)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r10)
            r5.mo85957c(r6, r0, r4)
        L_0x0295:
            if (r1 == 0) goto L_0x02ae
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            androidx.appcompat.app.AppCompatActivity r4 = r25.getContext()
            java.lang.String r3 = r3.getNickname()
            android.text.SpannableString r0 = r0.mo107057T1(r4, r3)
            r1.setText(r0)
        L_0x02ae:
            android.view.ViewGroup r0 = r7.f161057r
            if (r0 != 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0.setVisibility(r2)
        L_0x02b6:
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r0 = r25.mo79091N7()
            android.view.ViewGroup r1 = r7.f161057r
            r0.addView(r1)
        L_0x02bf:
            rx3.g r0 = r7.f161056q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-closeBtn>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.view.View r0 = (android.view.View) r0
            com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$c r2 = new com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI$c
            r2.<init>(r7)
            r0.setOnClickListener(r2)
            rx3.g r0 = r7.f161056q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r1)
            android.view.View r0 = (android.view.View) r0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI"
            java.lang.String r10 = "initView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "ref_feed_info"
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 == 0) goto L_0x0339
            te3.uf1 r1 = new te3.uf1
            r1.<init>()
            r1.parseFrom(r0)
        L_0x0339:
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "KEY_SHOW_SEEK_BAR"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L_0x0399
            ef1.c r0 = new ef1.c
            java.lang.String r1 = "Finder.MediaPreviewUI"
            r0.<init>(r1)
            r7.f161063x = r0
            com.tencent.mm.plugin.finder.video.FinderVideoCore r1 = r7.f161059t
            df1.c r2 = new df1.c
            r2.<init>(r0)
            r1.f161829o = r2
            com.tencent.mm.plugin.finder.ui.p1 r1 = new com.tencent.mm.plugin.finder.ui.p1
            r1.<init>(r7)
            r0.mo83450a(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r25.mo79092O7()
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r25.mo79092O7()
            com.tencent.mm.plugin.finder.ui.q1 r1 = new com.tencent.mm.plugin.finder.ui.q1
            r1.<init>(r7)
            r0.setPlayBtnOnClickListener(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r25.mo79092O7()
            java.util.LinkedList<te3.rq2> r1 = r7.f161060u
            java.lang.Object r1 = r1.getFirst()
            te3.rq2 r1 = (te3.C64689rq2) r1
            int r1 = r1.f185269g
            r0.setVideoTotalTime(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r25.mo79092O7()
            r1 = 1
            r0.setIsPlay(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r25.mo79092O7()
            com.tencent.mm.plugin.finder.ui.r1 r1 = new com.tencent.mm.plugin.finder.ui.r1
            r1.<init>(r7)
            r0.setIplaySeekCallback(r1)
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderMediaPreviewUI.initView():void");
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201326592, 201326592);
        setLightNavigationbarIcon();
        C85875k4.m106175c0(getWindow(), false);
        this.f161062w = getIntent().getBooleanExtra("long_video_preview", false);
        initView();
    }

    public void onDestroy() {
        C58553c cVar = this.f161063x;
        if (cVar != null) {
            cVar.mo83452c();
        }
        super.onDestroy();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f161061v) {
            this.f161061v = false;
            if (mo79091N7().getMediaType() == C4189u7.IMAGE) {
                this.f161059t.mo79538z1().mo80066B0(C8388e1.f27379d);
                return;
            }
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) mo79091N7().getVideoBanner().getMediaView();
            finderVideoLayout.getVideoCore().mo79538z1().mo80066B0(C8388e1.f27379d);
            FinderItem finderItem = new FinderItem();
            finderItem.setMediaExtList(new LinkedList());
            finderItem.getMediaExtList().addAll(this.f161060u);
            if (finderVideoLayout.f161886y) {
                C56406o1 o1Var = new C56406o1(this);
                Object value = ((C36570n) this.f161055p).getValue();
                C87412m.m108593f(value, "<get-clickContentLayout>(...)");
                ((HardTouchableLayout) value).setOnSingleClickListener(new C56404n1(o1Var));
            }
            FinderVideoLayout.m65083p(finderVideoLayout, 0, FeedData.Companion.mo78884b(finderItem), (C59667n2) null, 0, false, (C32227p) null, (C32227p) null, false, false, 508, (Object) null);
            FinderVideoLayout.m65078D(finderVideoLayout, 0, (C12931a) null, 3, (Object) null);
        }
    }
}

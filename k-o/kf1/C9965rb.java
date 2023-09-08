package kf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0741j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dm1.C7371o;
import dp1.C58408t0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import p204mr.C11078h;
import rx3.C13601g;
import te3.C50141kk1;
import te3.C50985qn1;
import te3.C51270sn1;
import te3.C52271zj0;
import te3.C64311db1;
import te3.C64726td1;
import up1.C14360r0;
import up1.C14367u0;

/* renamed from: kf1.rb */
public final class C9965rb extends C9753h {

    /* renamed from: A */
    public View f30625A;

    /* renamed from: B */
    public final int f30626B;

    /* renamed from: C */
    public int f30627C;

    /* renamed from: D */
    public int f30628D;

    /* renamed from: E */
    public String f30629E;

    /* renamed from: F */
    public String f30630F;

    /* renamed from: G */
    public C51270sn1 f30631G;

    /* renamed from: H */
    public long f30632H;

    /* renamed from: I */
    public int f30633I;

    /* renamed from: J */
    public Fragment f30634J;

    /* renamed from: K */
    public C0741j f30635K;

    /* renamed from: L */
    public View f30636L;

    /* renamed from: M */
    public boolean f30637M;

    /* renamed from: N */
    public C14367u0 f30638N;

    /* renamed from: u */
    public final C9932pb f30639u;

    /* renamed from: v */
    public final String f30640v;

    /* renamed from: w */
    public View f30641w;

    /* renamed from: x */
    public C9810j6 f30642x;

    /* renamed from: y */
    public View f30643y;

    /* renamed from: z */
    public final C13601g f30644z;

    /* renamed from: kf1.rb$a */
    public static final class C9966a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9965rb f30645d;

        public C9966a(C9965rb rbVar) {
            this.f30645d = rbVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9965rb rbVar = this.f30645d;
            if (rbVar.f30628D == 9) {
                View view2 = rbVar.f30641w;
                C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView");
                ((FinderQQMusicFollowHeaderView) view2).mo3535b();
            } else {
                View view3 = rbVar.f30641w;
                C87412m.m108592e(view3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.IFinderFollowTopicHeaderView");
                ((C7371o) view3).mo8540c();
            }
            C58408t0.f167336a.mo83261g(false, 6);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9965rb(com.tencent.p014mm.p136ui.MMActivity r13, int r14, int r15, boolean r16, boolean r17, kf1.C9932pb r18, int r19, gy3.C8480h r20) {
        /*
            r12 = this;
            r8 = r12
            r9 = r13
            r0 = r19 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r4 = 0
            goto L_0x000b
        L_0x0009:
            r4 = r16
        L_0x000b:
            r0 = r19 & 16
            if (r0 == 0) goto L_0x0011
            r10 = 0
            goto L_0x0013
        L_0x0011:
            r10 = r17
        L_0x0013:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x001a
            r0 = 0
            r11 = r0
            goto L_0x001c
        L_0x001a:
            r11 = r18
        L_0x001c:
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r13, r0)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f30639u = r11
            java.lang.String r0 = "Finder.FinderTopicFeedUIContract.TopicFeedViewCallback"
            r8.f30640v = r0
            kf1.qb r0 = new kf1.qb
            r0.<init>(r13)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r8.f30644z = r0
            r0 = -2
            r8.f30626B = r0
            java.lang.String r0 = ""
            r8.f30629E = r0
            r8.f30630F = r0
            r0 = 1
            r8.f30633I = r0
            cm1.j r1 = new cm1.j
            te3.pq3 r2 = new te3.pq3
            r2.<init>()
            r1.<init>(r2)
            r8.f30635K = r1
            r8.f30637M = r0
            up1.r0 r0 = new up1.r0
            r0.<init>(r10)
            r8.f30638N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9965rb.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, kf1.pb, int, gy3.h):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo9289F0() {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            int r2 = r0.f30627C
            r3 = 0
            r4 = 1
            if (r4 != r2) goto L_0x001f
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99163E7
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            r5 = 0
            if (r2 == 0) goto L_0x0024
            return r5
        L_0x0024:
            android.view.View r2 = r0.f30641w
            if (r2 == 0) goto L_0x0029
            return r2
        L_0x0029:
            int r2 = r0.f30627C
            r6 = 8
            r7 = 2131315558(0x7f094b66, float:1.8249573E38)
            r8 = 2131495580(0x7f0c0a9c, float:1.86147E38)
            if (r2 == r4) goto L_0x01dd
            r9 = 2
            if (r2 == r9) goto L_0x01a1
            r9 = 4
            if (r2 == r9) goto L_0x0047
            r4 = 5
            if (r2 == r4) goto L_0x01dd
            r1 = 7
            if (r2 == r1) goto L_0x0043
            goto L_0x029b
        L_0x0043:
            r0.f30641w = r5
            goto L_0x029b
        L_0x0047:
            int r1 = r0.f30628D
            r2 = 9
            if (r1 != r2) goto L_0x0055
            com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView r1 = new com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            r1.<init>(r2)
            goto L_0x0067
        L_0x0055:
            java.lang.Class<lr.b> r1 = p599lr.C61381b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            lr.b r1 = (p599lr.C61381b) r1
            qo1.k r1 = r1.pa0()
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            android.view.View r1 = r1.mo12421b(r2)
        L_0x0067:
            r0.f30641w = r1
            com.tencent.mm.ui.MMActivity r1 = r0.f30214d
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r2 = 2131494656(0x7f0c0700, float:1.8612827E38)
            android.view.View r1 = r1.inflate(r2, r5)
            java.lang.String r2 = "getInflater(context).inf…er_on_scroll_layout,null)"
            gy3.C87412m.m108593f(r1, r2)
            r0.f30643y = r1
            android.view.View r1 = r25.mo10466d1()
            r2 = 0
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.mo10233c(r2)
            java.lang.Object[] r11 = r7.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r13 = "getHeaderView"
            java.lang.String r14 = "()Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r7.mo10231a(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r12 = "getHeaderView"
            java.lang.String r13 = "()Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setAlpha"
            java.lang.String r16 = "(F)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r1 = r25.mo10466d1()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r7)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r20 = "getHeaderView"
            java.lang.String r21 = "()Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r19 = "getHeaderView"
            java.lang.String r20 = "()Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            er1.w3 r1 = er1.C58784w3.f168295a
            int r1 = er1.C58784w3.m68441q(r1, r5, r4, r5)
            r2 = 2131305073(0x7f092271, float:1.8228307E38)
            if (r1 != r4) goto L_0x0157
            android.view.View r1 = r25.mo10466d1()
            android.view.View r1 = r1.findViewById(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r4)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r10 = "getHeaderView"
            java.lang.String r11 = "()Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r9 = "getHeaderView"
            java.lang.String r10 = "()Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0167
        L_0x0157:
            android.view.View r1 = r25.mo10466d1()
            android.view.View r1 = r1.findViewById(r2)
            kf1.rb$a r2 = new kf1.rb$a
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0167:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            com.tencent.mm.ui.MMActivity r4 = r0.f30214d
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r1.<init>(r2, r4)
            r2 = 48
            r1.gravity = r2
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89996h(r2)
            r1.setMargins(r3, r2, r3, r3)
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.view.View r3 = r25.mo10466d1()
            r2.addView(r3, r1)
            goto L_0x029b
        L_0x01a1:
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            android.view.View r2 = android.view.View.inflate(r2, r8, r5)
            android.view.View r3 = r2.findViewById(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x01ca
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r3.getContext()
            java.lang.String r5 = r0.f30629E
            android.text.SpannableString r1 = r1.mo107057T1(r4, r5)
            r3.setText(r1)
            kf1.ub r1 = new kf1.ub
            r1.<init>(r0)
            zp3.C23564m.m28138h(r3, r1)
        L_0x01ca:
            r1 = 2131315544(0x7f094b58, float:1.8249544E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3 = 2131756337(0x7f100531, float:1.9143579E38)
            r1.setImageResource(r3)
            r0.f30641w = r2
            goto L_0x029b
        L_0x01dd:
            kf1.j6 r2 = r0.f30642x
            if (r2 == 0) goto L_0x026b
            java.lang.String r4 = "Finder.FinderNewsTopicHelper"
            java.lang.String r7 = "getTopicHeaderView : null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            com.tencent.mm.ui.MMActivity r4 = r2.f30347a
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r7 = 2131495584(0x7f0c0aa0, float:1.8614709E38)
            android.view.View r4 = r4.inflate(r7, r5, r3)
            com.tencent.mm.ui.MMActivity r7 = r2.f30347a
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r8 = "key_topic_title"
            java.lang.String r7 = r7.getStringExtra(r8)
            if (r7 != 0) goto L_0x0205
            java.lang.String r7 = ""
        L_0x0205:
            r8 = 2131315552(0x7f094b60, float:1.824956E38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0256
            java.lang.String r9 = "#"
            boolean r3 = z04.C112551y.m153819s(r7, r9, r3)
            if (r3 != 0) goto L_0x023b
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r8.getContext()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 35
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.text.SpannableString r1 = r1.mo107057T1(r3, r7)
            r8.setText(r1)
            goto L_0x024c
        L_0x023b:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r8.getContext()
            android.text.SpannableString r1 = r1.mo107057T1(r3, r7)
            r8.setText(r1)
        L_0x024c:
            android.text.TextPaint r1 = r8.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r3)
        L_0x0256:
            r1 = 2131302313(0x7f0917a9, float:1.8222709E38)
            android.view.View r1 = r4.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x0262
            goto L_0x0265
        L_0x0262:
            r1.setVisibility(r6)
        L_0x0265:
            r2.mo10389a(r5)
            r0.f30641w = r4
            goto L_0x029b
        L_0x026b:
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            android.view.View r2 = android.view.View.inflate(r2, r8, r5)
            r0.f30641w = r2
            if (r2 == 0) goto L_0x029b
            android.view.View r2 = r2.findViewById(r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x029b
            er1.C7919x.m8091a(r2)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r2.getContext()
            java.lang.String r4 = r0.f30629E
            android.text.SpannableString r1 = r1.mo107057T1(r3, r4)
            r2.setText(r1)
            kf1.ub r1 = new kf1.ub
            r1.<init>(r0)
            zp3.C23564m.m28138h(r2, r1)
        L_0x029b:
            android.view.View r1 = r0.f30641w
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9965rb.mo9289F0():android.view.View");
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        C14360r0 r0Var = (C14360r0) this.f30638N;
        r0Var.getClass();
        return new C14360r0.C14361a(r0Var);
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30638N.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX WARNING: type inference failed for: r18v2, types: [te3.hj1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x035e A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0399  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9294Q0(androidx.recyclerview.widget.RecyclerView.C16613e<?> r37, android.view.View r38, int r39) {
        /*
            r36 = this;
            r7 = r36
            r0 = r37
            r9 = r38
            r8 = r39
            java.lang.Class<er1.b> r17 = er1.C58684b.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            r1.add(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r39)
            r1.add(r2)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback"
            java.lang.String r3 = "onGridItemClick"
            java.lang.String r4 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V"
            r5 = r36
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "adapter"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "view"
            gy3.C87412m.m108594g(r9, r1)
            jq3.l r0 = (jq3.C60898l) r0
            int r0 = r0.mo85796c6()
            int r0 = r8 - r0
            java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V"
            java.lang.String r2 = "onGridItemClick"
            java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback"
            java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
            if (r0 < 0) goto L_0x03f2
            kf1.g r5 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r5.f30175e
            int r5 = r5.getSize()
            if (r0 >= r5) goto L_0x03f2
            kf1.g r5 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r5.f30175e
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r6 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.util.List r5 = r5.getListOfType(r6)
            java.lang.Object r5 = r5.get(r0)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r5.mo3513o()
            java.lang.String r10 = r7.f30640v
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onClick "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = " id:"
            r11.append(r12)
            long r12 = r6.getId()
            r11.append(r12)
            java.lang.String r12 = ", pos:"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            int r10 = r6.getMediaType()
            java.lang.String r15 = ""
            r18 = 0
            r11 = 9
            r14 = 1
            r13 = 0
            if (r10 != r11) goto L_0x01ab
            java.lang.Class<ls3.f> r0 = ls3.C10649f.class
            java.lang.String r9 = r6.getUserName()
            zc1.b r10 = zc1.C66785b.f191882e
            java.lang.String r10 = r10.mo90662O5()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r10)
            if (r9 == 0) goto L_0x00fb
            di3.d r0 = di3.C86312j.m106911c(r17)
            java.lang.String r5 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r0, r5)
            r8 = r0
            tf0.o1 r8 = (tf0.C13883o1) r8
            com.tencent.mm.ui.MMActivity r9 = r7.f30214d
            long r10 = r6.getId()
            java.lang.String r12 = r6.getObjectNonceId()
            te3.c21 r0 = r6.getLiveInfo()
            if (r0 != 0) goto L_0x00da
            te3.c21 r0 = new te3.c21
            r0.<init>()
        L_0x00da:
            r13 = r0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFinderObject()
            java.lang.String r0 = r0.sessionBuffer
            r20 = r0
            r21 = 0
            r22 = 0
            r23 = 7152(0x1bf0, float:1.0022E-41)
            r24 = 0
            tf0.C13883o1.C13884a.m13249a(r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r14 = r1
            goto L_0x01a7
        L_0x00fb:
            java.lang.Class<ht1.j5> r9 = ht1.C8777j5.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            java.lang.String r10 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r9, r10)
            ht1.j5 r9 = (ht1.C8777j5) r9
            long r10 = (long) r8
            ak1.f0$q r12 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            r16 = 0
            r17 = 16
            r19 = 0
            java.lang.String r20 = "26"
            r8 = r9
            r9 = r5
            r13 = r20
            r37 = r1
            r1 = 1
            r14 = r16
            r1 = r15
            r15 = r17
            r16 = r19
            ht1.C8777j5.C8778a.m8604e(r8, r9, r10, r12, r13, r14, r15, r16)
            rs1.s8$a r8 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r9 = r7.f30214d
            rs1.s8 r8 = r8.mo12873f(r9)
            if (r8 == 0) goto L_0x0135
            te3.hj1 r8 = r8.mo12861q3()
            int r13 = r8.f134675i
            goto L_0x0136
        L_0x0135:
            r13 = 0
        L_0x0136:
            di3.d r8 = di3.C86312j.m106911c(r0)
            ls3.f r8 = (ls3.C10649f) r8
            kf1.g r9 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r9 = r9.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataList()
            rx3.l r5 = r8.mo10915sr(r9, r5)
            A r8 = r5.f38555d
            r29 = r8
            java.util.List r29 = (java.util.List) r29
            B r5 = r5.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            int r30 = r5.intValue()
            te3.c90 r5 = new te3.c90
            r5.<init>()
            r5.f182444d = r1
            r5.f182445e = r1
            r15 = 0
            r5.f182446f = r15
            int r8 = r7.f30627C
            r5.f182447g = r8
            r8 = -1
            r5.f182448h = r8
            r8 = 1
            r5.f182449i = r8
            te3.ro2 r8 = new te3.ro2
            r8.<init>()
            r8.f185214e = r13
            boolean r9 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x017d
            r18 = r6
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r18 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r18
        L_0x017d:
            if (r18 == 0) goto L_0x018b
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r18.mo3513o()
            if (r6 == 0) goto L_0x018b
            java.lang.String r15 = r6.getNickName()
            if (r15 != 0) goto L_0x018c
        L_0x018b:
            r15 = r1
        L_0x018c:
            r8.f185215f = r15
            r5.f182450j = r8
            di3.d r0 = di3.C86312j.m106911c(r0)
            r26 = r0
            ls3.f r26 = (ls3.C10649f) r26
            com.tencent.mm.ui.MMActivity r0 = r7.f30214d
            r28 = 0
            r32 = 0
            r27 = r0
            r31 = r5
            r26.mo10913cP(r27, r28, r29, r30, r31, r32)
            r14 = r37
        L_0x01a7:
            j20.C117292a.m165361g(r7, r4, r3, r2, r14)
            return
        L_0x01ab:
            r14 = r1
            r1 = r15
            r15 = 0
            android.content.Intent r13 = r7.mo10467e1(r6, r0)
            kf1.g r8 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r8 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r8
            te3.sn1 r10 = r8.f13400p
            boolean r10 = r8.mo2639f0(r10)
            if (r10 == 0) goto L_0x01c3
            r10 = r18
            goto L_0x01d4
        L_0x01c3:
            te3.pq3 r10 = new te3.pq3
            r10.<init>()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r10.f139904d = r12
            te3.sn1 r8 = r8.f13400p
            r12.add(r8)
        L_0x01d4:
            kf1.g r8 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r8 = r8.f30175e
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader"
            gy3.C87412m.m108592e(r8, r12)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r8 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader) r8
            if (r10 == 0) goto L_0x01f2
            java.util.LinkedList<te3.sn1> r12 = r10.f139904d
            if (r12 == 0) goto L_0x01f2
            java.lang.Object r12 = r12.get(r15)
            te3.sn1 r12 = (te3.C51270sn1) r12
            if (r12 == 0) goto L_0x01f2
            java.lang.String r12 = r12.f141617d
            goto L_0x01f4
        L_0x01f2:
            r12 = r18
        L_0x01f4:
            pe3.b r8 = r8.mo2811d(r12)
            kf1.g r12 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r12 = r12.f30175e
            kf1.ac r11 = new kf1.ac
            r11.<init>(r10, r8)
            r12.saveCache(r13, r0, r11)
            java.lang.String r8 = r7.f30640v
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "enterTopicTimelineUI, fixPos:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            long r10 = r5.getItemId()
            int r0 = r7.f30627C
            r12 = 15
            r8 = 1
            if (r0 == r8) goto L_0x022e
            if (r0 == r12) goto L_0x022b
            r0 = 0
            goto L_0x0230
        L_0x022b:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x0230
        L_0x022e:
            r0 = 9
        L_0x0230:
            java.lang.Class<tf0.p1> r8 = tf0.C64916p1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            tf0.p1 r8 = (tf0.C64916p1) r8
            dp1.i2 r0 = r8.mo9101vP(r10, r0)
            java.lang.String r10 = "songid"
            java.lang.String r11 = "key_song_id"
            if (r0 == 0) goto L_0x027e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x027d }
            r8.<init>()     // Catch:{ JSONException -> 0x027d }
            com.tencent.mm.ui.MMActivity r12 = r7.f30214d     // Catch:{ JSONException -> 0x027d }
            android.content.Intent r12 = r12.getIntent()     // Catch:{ JSONException -> 0x027d }
            java.lang.String r12 = r12.getStringExtra(r11)     // Catch:{ JSONException -> 0x027d }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x027d }
            r7.mo10465c1(r8)     // Catch:{ JSONException -> 0x027d }
            te3.we1 r0 = r0.f122975a     // Catch:{ JSONException -> 0x027d }
            je1.h2 r21 = je1.C46523h2.f125330a     // Catch:{ JSONException -> 0x027d }
            java.lang.String r12 = r0.f143989i     // Catch:{ JSONException -> 0x027d }
            if (r12 != 0) goto L_0x0263
            r22 = r1
            goto L_0x0265
        L_0x0263:
            r22 = r12
        L_0x0265:
            java.lang.String r1 = r8.toString()     // Catch:{ JSONException -> 0x027d }
            java.lang.String r8 = "kvJson.toString()"
            gy3.C87412m.m108593f(r1, r8)     // Catch:{ JSONException -> 0x027d }
            r24 = 0
            r25 = 4
            r26 = 0
            r23 = r1
            java.lang.String r1 = je1.C46523h2.m51821i(r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x027d }
            r0.f143989i = r1     // Catch:{ JSONException -> 0x027d }
            goto L_0x027e
        L_0x027d:
        L_0x027e:
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r1 = r7.f30214d
            r0.mo12871c(r1, r13)
            r21 = 0
            r12 = 0
            r1 = 0
            de1.b r23 = de1.C7267b.f25328d
            androidx.recyclerview.widget.RecyclerView r24 = r36.getRecyclerView()
            long r25 = r5.getItemId()
            kf1.g r8 = r36.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r8 = r8.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r27 = r8.getDataListJustForAdapter()
            r28 = 0
            r29 = 8
            r30 = 0
            fy3.p r16 = de1.C7267b.Ax0(r23, r24, r25, r27, r28, r29, r30)
            r19 = 14
            r23 = 0
            r8 = r13
            r9 = r38
            r33 = r10
            r34 = r11
            r10 = r21
            r35 = r13
            r13 = r1
            r1 = r14
            r14 = r16
            r15 = r19
            r16 = r23
            de1.C7287o.m7447c(r8, r9, r10, r12, r13, r14, r15, r16)
            di3.d r8 = di3.C86312j.m106911c(r17)
            er1.b r8 = (er1.C58684b) r8
            com.tencent.mm.ui.MMActivity r9 = r7.f30214d
            r10 = r35
            r8.ty0(r9, r10)
            long r13 = r6.getId()
            java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
            di3.d r9 = di3.C86312j.m106911c(r8)
            dp1.y0 r9 = (dp1.C58417y0) r9
            r10 = 2
            r9.Bx0(r13, r10)
            int r9 = r7.f30627C
            r10 = 7
            if (r9 == r10) goto L_0x02ea
            r10 = 15
            if (r9 == r10) goto L_0x02ea
            com.tencent.mm.ui.MMActivity r9 = r7.f30214d
            goto L_0x02f0
        L_0x02ea:
            androidx.fragment.app.Fragment r9 = r7.f30634J
            if (r9 != 0) goto L_0x02f0
            com.tencent.mm.ui.MMActivity r9 = r7.f30214d
        L_0x02f0:
            boolean r10 = r9 instanceof androidx.appcompat.app.AppCompatActivity
            if (r10 == 0) goto L_0x0301
            android.content.Context r9 = (android.content.Context) r9
            rs1.s8 r0 = r0.mo12873f(r9)
            if (r0 == 0) goto L_0x0320
            te3.hj1 r0 = r0.mo12861q3()
            goto L_0x031e
        L_0x0301:
            boolean r0 = r9 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L_0x0320
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.String r10 = "null cannot be cast to non-null type androidx.fragment.app.Fragment"
            gy3.C87412m.m108592e(r9, r10)
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            bl3.r$a r0 = r0.mo62445d(r9)
            java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r9)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
        L_0x031e:
            r12 = r0
            goto L_0x0322
        L_0x0320:
            r12 = r18
        L_0x0322:
            if (r12 == 0) goto L_0x0399
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            te3.sn1 r0 = r7.f30631G     // Catch:{ JSONException -> 0x0367 }
            if (r0 == 0) goto L_0x033c
            te3.zj0 r0 = r0.f141633w     // Catch:{ JSONException -> 0x0367 }
            if (r0 == 0) goto L_0x033c
            long r10 = r0.f146005d     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r0 = o40.C61926c.m72691p(r10)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r10 = "activityid"
            r9.put(r10, r0)     // Catch:{ JSONException -> 0x0367 }
        L_0x033c:
            java.lang.String r0 = "tab_type"
            int r10 = r7.f30633I     // Catch:{ JSONException -> 0x0367 }
            r9.put(r0, r10)     // Catch:{ JSONException -> 0x0367 }
            com.tencent.mm.ui.MMActivity r0 = r7.f30214d     // Catch:{ JSONException -> 0x0367 }
            android.content.Intent r0 = r0.getIntent()     // Catch:{ JSONException -> 0x0367 }
            r10 = r34
            java.lang.String r0 = r0.getStringExtra(r10)     // Catch:{ JSONException -> 0x0367 }
            if (r0 == 0) goto L_0x035b
            int r10 = r0.length()     // Catch:{ JSONException -> 0x0367 }
            if (r10 != 0) goto L_0x0359
            goto L_0x035b
        L_0x0359:
            r10 = 0
            goto L_0x035c
        L_0x035b:
            r10 = 1
        L_0x035c:
            if (r10 != 0) goto L_0x0363
            r10 = r33
            r9.put(r10, r0)     // Catch:{ JSONException -> 0x0367 }
        L_0x0363:
            r7.mo10465c1(r9)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x0371
        L_0x0367:
            r0 = move-exception
            java.lang.String r10 = r7.f30640v
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x0371:
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "udfKv.toString()"
            gy3.C87412m.m108593f(r0, r9)
            di3.d r8 = di3.C86312j.m106911c(r8)
            r11 = r8
            dp1.y0 r11 = (dp1.C58417y0) r11
            androidx.recyclerview.widget.RecyclerView r15 = r36.getRecyclerView()
            int r8 = r7.f30633I
            java.lang.String r9 = ","
            java.lang.String r10 = ";"
            r37 = r1
            r1 = 0
            java.lang.String r17 = z04.C112551y.m153814n(r0, r9, r10, r1)
            r16 = r8
            r11.Px0(r12, r13, r15, r16, r17)
            goto L_0x039b
        L_0x0399:
            r37 = r1
        L_0x039b:
            com.tencent.mm.ui.MMActivity r0 = r7.f30214d
            long r8 = r6.getId()
            long r10 = r7.f30632H
            java.lang.String r1 = r7.f30629E
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r0, r6)
            java.lang.String r6 = "topicName"
            gy3.C87412m.m108594g(r1, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r12 = "feedid"
            java.lang.String r8 = o40.C61926c.m72691p(r8)     // Catch:{ JSONException -> 0x03cf }
            r6.put(r12, r8)     // Catch:{ JSONException -> 0x03cf }
            java.lang.String r8 = "topicid"
            java.lang.String r9 = o40.C61926c.m72691p(r10)     // Catch:{ JSONException -> 0x03cf }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x03cf }
            java.lang.String r8 = "topicname"
            r6.put(r8, r1)     // Catch:{ JSONException -> 0x03cf }
            goto L_0x03d0
        L_0x03cf:
        L_0x03d0:
            dp1.f2 r1 = dp1.C7435f2.f25626a
            rs1.s8$a r8 = rs1.C13442s8.f38060Q0
            rs1.s8 r0 = r8.mo12873f(r0)
            if (r0 == 0) goto L_0x03de
            te3.hj1 r18 = r0.mo12861q3()
        L_0x03de:
            r0 = r18
            java.lang.String r8 = "video_card"
            r9 = 1
            r1.mo8577a(r0, r8, r9, r6)
            dp1.q r0 = dp1.C7450q.f25643a
            com.tencent.mm.ui.MMActivity r1 = r7.f30214d
            r6 = 18
            r0.mo8593a(r1, r5, r6)
            r1 = r37
        L_0x03f2:
            j20.C117292a.m165361g(r7, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9965rb.mo9294Q0(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int):void");
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: U0 */
    public void mo10352U0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        View loadMoreFooter;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (this.f30627C == 7) {
            E e = cVar.f24950e;
            FinderTopicFeedLoader.C2769f fVar = e instanceof FinderTopicFeedLoader.C2769f ? (FinderTopicFeedLoader.C2769f) e : null;
            if (!((fVar != null ? fVar.getHasMore() : true) || cVar.f24953h == 0 || (loadMoreFooter = this.f30220j.getLoadMoreFooter()) == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
                if (findViewById2 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        C11078h hVar = ((FinderTopicFeedUIContract$TopicFeedPresenter) mo10348I0()).f13393B;
        if (hVar != null) {
            hVar.mo11215b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r3 = r3.f173502D;
     */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10353W0(jq3.C60905o r3) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r3, r0)
            int r0 = r3.f44859i
            int r1 = r2.f30626B
            if (r0 == r1) goto L_0x001d
            java.lang.Object r3 = r3.f173502D
            if (r3 == 0) goto L_0x001b
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            if (r3 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9965rb.mo10353W0(jq3.o):boolean");
    }

    /* renamed from: X0 */
    public boolean mo10354X0() {
        return this.f30637M;
    }

    /* renamed from: Z */
    public C14367u0 mo9296Z() {
        return this.f30638N;
    }

    /* renamed from: a1 */
    public boolean mo10287a1() {
        return this.f30627C != 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        return;
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10464b1() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.view.View r0 = r4.f30625A     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 != 0) goto L_0x0015
            com.tencent.mm.ui.MMActivity r0 = r4.f30214d     // Catch:{ all -> 0x0056 }
            android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)     // Catch:{ all -> 0x0056 }
            r2 = 2131495314(0x7f0c0992, float:1.8614161E38)
            android.view.View r0 = r0.inflate(r2, r1)     // Catch:{ all -> 0x0056 }
            r4.f30625A = r0     // Catch:{ all -> 0x0056 }
        L_0x0015:
            java.lang.String r0 = r4.f30640v     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r2.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "ken loading header:"
            r2.append(r3)     // Catch:{ all -> 0x0056 }
            android.view.View r3 = r4.f30625A     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002a
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x0056 }
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            r2.append(r3)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ all -> 0x0056 }
            android.view.View r0 = r4.f30625A     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x003d
            android.view.ViewParent r1 = r0.getParent()     // Catch:{ all -> 0x0056 }
        L_0x003d:
            if (r1 == 0) goto L_0x0041
            monitor-exit(r4)
            return
        L_0x0041:
            android.view.View r0 = r4.f30625A     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0054
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r4.mo10346D()     // Catch:{ all -> 0x0056 }
            android.view.View r1 = r4.f30625A     // Catch:{ all -> 0x0056 }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x0056 }
            int r2 = r4.f30626B     // Catch:{ all -> 0x0056 }
            r3 = 1
            r0.mo85794V5(r1, r2, r3)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r4)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9965rb.mo10464b1():void");
    }

    /* renamed from: c1 */
    public final void mo10465c1(JSONObject jSONObject) {
        String stringExtra = this.f30214d.getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jSONObject.put("topicid", C61926c.m72691p(this.f30632H));
        jSONObject.put("topictag", stringExtra);
        jSONObject.put("topictab", this.f30633I);
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        if (this.f30627C == 5) {
            this.f30642x = new C9810j6(this.f30214d, this.f30220j);
        }
        super.mo9297d(arrayList);
    }

    /* renamed from: d1 */
    public final View mo10466d1() {
        View view = this.f30643y;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("followTopicFloatHeader");
        throw null;
    }

    /* renamed from: e1 */
    public final Intent mo10467e1(FinderItem finderItem, int i) {
        String str;
        C52271zj0 zj02;
        String str2;
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", this.f30627C);
        int i2 = this.f30627C;
        byte[] bArr = null;
        if (i2 == 4) {
            C50985qn1 qn12 = ((FinderTopicFeedUIContract$TopicFeedPresenter) mo10348I0()).f13403s;
            if (qn12 != null) {
                C64726td1 td12 = qn12.f140408e;
                if (td12 != null) {
                    str = String.valueOf(td12 != null ? td12.f185536f : null);
                } else {
                    MMActivity mMActivity = this.f30214d;
                    Object[] objArr = new Object[1];
                    FinderContact finderContact = qn12.f140407d;
                    objArr[0] = finderContact != null ? finderContact.nickname : null;
                    str = mMActivity.getString(C0966R.string.d_x, objArr);
                    C87412m.m108593f(str, "{\n                      …                        }");
                }
                intent.putExtra("key_topic_title", str);
                intent.putExtra("KEY_FOLLOW_ID", qn12.f140410g);
            }
        } else if (i2 != 7) {
            intent.putExtra("key_topic_title", this.f30629E);
        } else {
            C51270sn1 sn12 = this.f30631G;
            if (!(sn12 == null || (zj02 = sn12.f141633w) == null)) {
                intent.putExtra("key_activity_name", zj02.f146007f);
                FinderContact finderContact2 = zj02.f146006e;
                if (finderContact2 == null || (str2 = finderContact2.username) == null) {
                    str2 = "";
                }
                intent.putExtra("key_creator_finder_name", str2);
                intent.putExtra("key_activity_id", zj02.f146005d);
                intent.putExtra("key_activity_inner_tab_type", this.f30633I);
                intent.putExtra("key_activity_max_top_count", zj02.f146013o);
            }
        }
        intent.putExtra("KEY_TOPIC_ID", this.f30632H);
        intent.putExtra("KEY_INNER_TAB_TYPE", this.f30633I);
        intent.putExtra("KEY_CLICK_FEED_ID", finderItem.getId());
        intent.putExtra("KEY_CLICK_FEED_POSITION", i);
        intent.putExtra("key_ref_object_id", this.f30214d.getIntent().getLongExtra("key_ref_object_id", 0));
        BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
        C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        C64311db1 db12 = ((FinderTopicFeedLoader) baseFinderFeedLoader).f13899i;
        if (db12 != null) {
            bArr = db12.toByteArray();
        }
        intent.putExtra("KEY_FINDER_LOCATION", bArr);
        BaseFinderFeedLoader baseFinderFeedLoader2 = mo10348I0().f30175e;
        C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        C50141kk1 kk12 = ((FinderTopicFeedLoader) baseFinderFeedLoader2).f13902o;
        if (kk12 != null) {
            intent.putExtra("KEY_SECTION_INFO", kk12.toByteArray());
        }
        return intent;
    }

    /* renamed from: f1 */
    public final synchronized void mo10468f1(boolean z) {
        String str = this.f30640v;
        Log.m105918d(str, "showProgressHeader = " + z);
        if (z) {
            mo10464b1();
        } else if (this.f30625A != null) {
            WxRecyclerAdapter<?> D = mo10346D();
            View view = this.f30625A;
            C87412m.m108591d(view);
            D.mo85802j6((long) view.hashCode(), true);
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        int i = this.f30627C;
        return (i == 7 || i == 1) ? this.f30636L : this.f30214d.findViewById(C0966R.C0970id.cjg);
    }
}

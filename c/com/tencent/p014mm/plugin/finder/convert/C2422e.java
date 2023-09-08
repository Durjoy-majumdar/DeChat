package com.tencent.p014mm.plugin.finder.convert;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoGreenSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import de3.C107029o;
import df1.C58259c;
import di3.C86312j;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7641j;
import ef1.C7642k;
import er1.C58784w3;
import er1.C75652c4;
import er1.C7919x;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59667n2;
import gr1.C59670o2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60171g1;
import ht1.C60200t1;
import iq1.C60592c;
import iq1.C60593d;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kf1.C10008v1;
import kf1.C9868n5;
import l31.C61212e;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import qt1.C12931a;
import rs1.C13194da;
import rs1.C13354o6;
import rs1.C13442s8;
import rs1.C13539y3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C64689rq2;
import up1.C27696y;
import up1.C65426w0;
import ve1.C14592p2;
import ve1.C14661v4;
import vq1.C65866w;
import zo3.C16376b;

/* renamed from: com.tencent.mm.plugin.finder.convert.e */
public final class C2422e extends C14592p2 {

    /* renamed from: P */
    public final C13601g f12841P = C36568h.m40985a(C2439q.f12882d);

    /* renamed from: Q */
    public final C13601g f12842Q;

    /* renamed from: R */
    public final C13601g f12843R;

    /* renamed from: S */
    public final C13601g f12844S;

    /* renamed from: T */
    public Runnable f12845T;

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$a */
    public static final class C2423a extends C58555d {

        /* renamed from: g */
        public long f12846g;

        /* renamed from: h */
        public final /* synthetic */ C10008v1 f12847h;

        /* renamed from: i */
        public final /* synthetic */ C2422e f12848i;

        public C2423a(C10008v1 v1Var, C2422e eVar) {
            this.f12847h = v1Var;
            this.f12848i = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.tencent.mm.plugin.finder.feed.n} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v16, types: [com.tencent.mm.plugin.finder.model.BaseFinderFeed] */
        /* JADX WARNING: type inference failed for: r5v19 */
        /* JADX WARNING: type inference failed for: r5v20 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: B1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2331B1(ef1.C7637b r15) {
            /*
                r14 = this;
                java.lang.String r0 = "ev"
                gy3.C87412m.m108594g(r15, r0)
                boolean r0 = r15 instanceof df1.C58259c.C58260a
                r1 = 2
                java.lang.String r2 = "FinderLongVideoConvert"
                r3 = 1
                r4 = 0
                r5 = 0
                if (r0 == 0) goto L_0x0160
                kf1.v1 r0 = r14.f12847h
                boolean r6 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.C2829n
                if (r6 == 0) goto L_0x0018
                com.tencent.mm.plugin.finder.feed.n r0 = (com.tencent.p014mm.plugin.finder.feed.C2829n) r0
                goto L_0x0019
            L_0x0018:
                r0 = r5
            L_0x0019:
                if (r0 == 0) goto L_0x0021
                jq3.o r0 = r0.mo2931f()
                if (r0 != 0) goto L_0x004a
            L_0x0021:
                com.tencent.mm.plugin.finder.convert.e r0 = r14.f12848i
                androidx.recyclerview.widget.RecyclerView r0 = r0.f12554A
                if (r0 == 0) goto L_0x002c
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                goto L_0x002d
            L_0x002c:
                r0 = r5
            L_0x002d:
                boolean r6 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r6 == 0) goto L_0x0035
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
                r6 = r0
                goto L_0x0036
            L_0x0035:
                r6 = r5
            L_0x0036:
                if (r6 == 0) goto L_0x015f
                r0 = r15
                df1.c$a r0 = (df1.C58259c.C58260a) r0
                long r7 = r0.f166817h
                r9 = 0
                r10 = 2
                r11 = 0
                androidx.recyclerview.widget.RecyclerView$z r0 = jq3.C60898l.m71330b6(r6, r7, r9, r10, r11)
                jq3.o r0 = (jq3.C60905o) r0
                if (r0 != 0) goto L_0x004a
                goto L_0x015f
            L_0x004a:
                df1.c$a r15 = (df1.C58259c.C58260a) r15
                int r6 = r15.f166811b
                if (r6 == r1) goto L_0x0144
                r4 = 3
                if (r6 == r4) goto L_0x0055
                goto L_0x028e
            L_0x0055:
                long r6 = r15.f166817h
                java.lang.Object r4 = r0.f173503E
                cm1.i2 r4 = (cm1.C0740i2) r4
                long r8 = r4.getItemId()
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 != 0) goto L_0x028e
                int r4 = r15.f166816g
                up1.f r6 = up1.C37521f.f99374d
                int r7 = r6.mo61151E()
                java.lang.String r8 = ", feedId="
                if (r4 <= r7) goto L_0x0100
                int r4 = r15.f166815f
                int r7 = r6.mo61151E()
                int r7 = r7 / r1
                if (r4 < r7) goto L_0x0100
                java.lang.Object r1 = r0.f173503E
                boolean r4 = r1 instanceof cm1.C55018j0
                if (r4 == 0) goto L_0x0081
                cm1.j0 r1 = (cm1.C55018j0) r1
                goto L_0x0082
            L_0x0081:
                r1 = r5
            L_0x0082:
                if (r1 == 0) goto L_0x0100
                com.tencent.mm.plugin.finder.convert.e r4 = r14.f12848i
                int r7 = r15.f166815f
                int r6 = r6.mo61151E()
                java.lang.String r9 = ", offset = "
                if (r7 < r6) goto L_0x00c9
                boolean r6 = r1.mo3472F()
                if (r6 != 0) goto L_0x00c9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "onEventHappen: VIDEO_PROGRESS long video total = "
                r6.append(r7)
                int r7 = r15.f166816g
                r6.append(r7)
                r6.append(r9)
                int r7 = r15.f166815f
                r6.append(r7)
                r6.append(r8)
                long r10 = r15.f166817h
                java.lang.String r7 = o40.C61926c.m72691p(r10)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                int r6 = r0.mo17363j()
                int r7 = r0.f44859i
                r4.mo2274N(r0, r6, r7, r3)
            L_0x00c9:
                boolean r1 = r1.mo3475I()
                if (r1 != 0) goto L_0x0100
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "onEventHappen: VIDEO_PROGRESS half enjoy mega video total = "
                r1.append(r3)
                int r3 = r15.f166816g
                r1.append(r3)
                r1.append(r9)
                int r3 = r15.f166815f
                r1.append(r3)
                r1.append(r8)
                long r6 = r15.f166817h
                java.lang.String r3 = o40.C61926c.m72691p(r6)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                int r1 = r0.mo17363j()
                r4.mo2278P(r0, r1)
            L_0x0100:
                int r1 = r15.f166815f
                com.tencent.mm.plugin.finder.convert.e r3 = r14.f12848i
                int r3 = r3.mo2248A()
                if (r1 < r3) goto L_0x028e
                java.lang.Object r1 = r0.f173503E
                boolean r3 = r1 instanceof cm1.C55018j0
                if (r3 == 0) goto L_0x0113
                r5 = r1
                cm1.j0 r5 = (cm1.C55018j0) r5
            L_0x0113:
                if (r5 == 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r1 = r14.f12848i
                boolean r3 = r5.mo3516q()
                if (r3 != 0) goto L_0x028e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onEventHappen: VIDEO_PROGRESS ten sec enjoy offset = "
                r3.append(r4)
                int r4 = r15.f166815f
                r3.append(r4)
                r3.append(r8)
                long r4 = r15.f166817h
                java.lang.String r15 = o40.C61926c.m72691p(r4)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
                r1.mo2285V(r0)
                goto L_0x028e
            L_0x0144:
                long r1 = r15.f166817h
                java.lang.Object r15 = r0.f173503E
                cm1.i2 r15 = (cm1.C0740i2) r15
                long r5 = r15.getItemId()
                int r15 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r15 != 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r15 = r14.f12848i
                int r1 = r0.mo17363j()
                int r2 = r0.f44859i
                r15.mo2274N(r0, r1, r2, r4)
                goto L_0x028e
            L_0x015f:
                return
            L_0x0160:
                boolean r0 = r15 instanceof ef1.C7641j
                if (r0 == 0) goto L_0x0189
                r0 = r15
                ef1.j r0 = (ef1.C7641j) r0
                int r6 = r0.f25947b
                if (r6 != r1) goto L_0x0189
                long r1 = r0.f25949d
                long r3 = r0.f25950e
                int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r15 == 0) goto L_0x028e
                kf1.v1 r15 = r14.f12847h
                boolean r0 = r15 instanceof com.tencent.p014mm.plugin.finder.feed.C2829n
                if (r0 == 0) goto L_0x017c
                r5 = r15
                com.tencent.mm.plugin.finder.feed.n r5 = (com.tencent.p014mm.plugin.finder.feed.C2829n) r5
            L_0x017c:
                if (r5 == 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r15 = r14.f12848i
                jq3.o r0 = r5.mo2931f()
                r15.mo2276O(r0)
                goto L_0x028e
            L_0x0189:
                boolean r0 = r15 instanceof ef1.C7642k
                if (r0 == 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r0 = r14.f12848i
                androidx.recyclerview.widget.RecyclerView r0 = r0.f12554A
                if (r0 == 0) goto L_0x0198
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                goto L_0x0199
            L_0x0198:
                r0 = r5
            L_0x0199:
                boolean r1 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r1 == 0) goto L_0x01a1
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
                r6 = r0
                goto L_0x01a2
            L_0x01a1:
                r6 = r5
            L_0x01a2:
                if (r6 != 0) goto L_0x01a5
                return
            L_0x01a5:
                ef1.k r15 = (ef1.C7642k) r15
                int r0 = r15.f25951b
                r1 = 6
                if (r0 != r1) goto L_0x01e2
                long r0 = r14.f12846g
                long r7 = r15.f25958i
                int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x01d7
                com.tencent.mm.plugin.finder.convert.e r0 = r14.f12848i
                jq3.o r1 = r0.f12581y
                if (r1 == 0) goto L_0x01c3
                int r2 = r1.mo17363j()
                int r4 = r1.f44859i
                r0.mo2286W(r1, r2, r4, r3)
            L_0x01c3:
                long r7 = r15.f25958i
                r14.f12846g = r7
                r9 = 0
                r10 = 2
                r11 = 0
                androidx.recyclerview.widget.RecyclerView$z r15 = jq3.C60898l.m71330b6(r6, r7, r9, r10, r11)
                jq3.o r15 = (jq3.C60905o) r15
                if (r15 == 0) goto L_0x01d7
                com.tencent.mm.plugin.finder.convert.e r0 = r14.f12848i
                r0.mo2276O(r15)
            L_0x01d7:
                com.tencent.mm.plugin.finder.convert.e r15 = r14.f12848i
                com.tencent.mm.sdk.platformtools.MMHandler r15 = r15.mo2419T0()
                r15.removeCallbacksAndMessages(r5)
                goto L_0x028e
            L_0x01e2:
                r1 = 10
                if (r0 != r1) goto L_0x021e
                long r7 = r15.f25958i
                r9 = 0
                r10 = 2
                r11 = 0
                androidx.recyclerview.widget.RecyclerView$z r15 = jq3.C60898l.m71330b6(r6, r7, r9, r10, r11)
                jq3.o r15 = (jq3.C60905o) r15
                if (r15 == 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r0 = r14.f12848i
                java.lang.Object r1 = r15.f173503E
                boolean r1 = r1 instanceof cm1.C0707a0
                if (r1 == 0) goto L_0x0213
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "FinderFeedLiveList info:lastCenterFeedId:"
                r15.append(r0)
                long r0 = r14.f12846g
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
                goto L_0x028e
            L_0x0213:
                int r1 = r15.mo17363j()
                int r2 = r15.f44859i
                r0.mo2286W(r15, r1, r2, r4)
                goto L_0x028e
            L_0x021e:
                r15 = 9
                if (r0 != r15) goto L_0x0287
                com.tencent.mm.plugin.finder.convert.e r15 = r14.f12848i
                androidx.recyclerview.widget.RecyclerView r15 = r15.f12554A
                if (r15 == 0) goto L_0x028e
                int r0 = r15.getChildCount()
                r1 = 0
            L_0x022d:
                if (r1 >= r0) goto L_0x028e
                android.view.View r2 = r15.getChildAt(r1)
                if (r2 == 0) goto L_0x023d
                int r5 = r2.getVisibility()
                if (r5 != 0) goto L_0x023d
                r5 = 1
                goto L_0x023e
            L_0x023d:
                r5 = 0
            L_0x023e:
                if (r5 != 0) goto L_0x0284
                if (r2 != 0) goto L_0x0243
                goto L_0x0284
            L_0x0243:
                k20.a r13 = new k20.a
                r13.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r13.mo10233c(r5)
                java.lang.Object[] r6 = r13.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1"
                java.lang.String r8 = "onEventHappen"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r2
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r5 = r13.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r2.setVisibility(r5)
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1"
                java.lang.String r7 = "onEventHappen"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r5 = r2
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            L_0x0284:
                int r1 = r1 + 1
                goto L_0x022d
            L_0x0287:
                if (r0 != 0) goto L_0x028e
                com.tencent.mm.plugin.finder.convert.e r15 = r14.f12848i
                r15.getClass()
            L_0x028e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.C2422e.C2423a.mo2331B1(ef1.b):void");
        }

        /* renamed from: C1 */
        public void mo2332C1() {
            this.f12848i.mo2419T0().removeCallbacksAndMessages((Object) null);
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return (bVar instanceof C58259c.C58260a) || ((bVar instanceof C7641j) && ((C7641j) bVar).f25947b == 2) || (bVar instanceof C7642k);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$b */
    public static final class C2424b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2424b(C60905o oVar) {
            super(0);
            this.f12849d = oVar;
        }

        public Object invoke() {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f12849d.mo85812D(C0966R.C0970id.d7a);
            boolean z = false;
            if (finderVideoLayout == null) {
                Log.m105928w("FinderLongVideoConvert", "videoLayout is null");
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

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$c */
    public static final class C2425c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C2422e f12850d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12851e;

        /* renamed from: f */
        public final /* synthetic */ FinderVideoGreenSeekBar f12852f;

        /* renamed from: g */
        public final /* synthetic */ View f12853g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2425c(C2422e eVar, C60905o oVar, FinderVideoGreenSeekBar finderVideoGreenSeekBar, View view) {
            super(0);
            this.f12850d = eVar;
            this.f12851e = oVar;
            this.f12852f = finderVideoGreenSeekBar;
            this.f12853g = view;
        }

        public Object invoke() {
            C2422e.m2315R0(this.f12850d, this.f12851e, true);
            FinderVideoGreenSeekBar finderVideoGreenSeekBar = this.f12852f;
            C59667n2.C8416b bVar = finderVideoGreenSeekBar.f17578W;
            if (bVar != null) {
                bVar.mo9353a();
            }
            finderVideoGreenSeekBar.f17581y0 = true;
            View view = this.f12853g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D = this.f12851e.mo85812D(C0966R.C0970id.eah);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = D;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$d */
    public static final class C2426d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f12854d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoGreenSeekBar f12855e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f12856f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2426d(View view, FinderVideoGreenSeekBar finderVideoGreenSeekBar, C60905o oVar) {
            super(0);
            this.f12854d = view;
            this.f12855e = finderVideoGreenSeekBar;
            this.f12856f = oVar;
        }

        public Object invoke() {
            View view = this.f12854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderVideoGreenSeekBar finderVideoGreenSeekBar = this.f12855e;
            C59667n2.C8416b bVar = finderVideoGreenSeekBar.f17578W;
            if (bVar != null) {
                bVar.mo9354c(((float) finderVideoGreenSeekBar.f273529p) / ((float) finderVideoGreenSeekBar.f273528o));
            }
            finderVideoGreenSeekBar.f17581y0 = false;
            if (this.f12856f.mo85812D(C0966R.C0970id.n9s).getVisibility() == 0) {
                View D = this.f12856f.mo85812D(C0966R.C0970id.eah);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = D;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$e */
    public static final class C2427e implements FinderLongVideoPlayerSeekBar.C3908a {

        /* renamed from: a */
        public final /* synthetic */ C2422e f12857a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12858b;

        /* renamed from: c */
        public final /* synthetic */ FinderVideoLayout f12859c;

        /* renamed from: d */
        public final /* synthetic */ FinderVideoGreenSeekBar f12860d;

        /* renamed from: com.tencent.mm.plugin.finder.convert.e$e$a */
        public static final class C2428a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderVideoLayout f12861d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2428a(FinderVideoLayout finderVideoLayout) {
                super(0);
                this.f12861d = finderVideoLayout;
            }

            public Object invoke() {
                C59670o2 videoView = this.f12861d.getVideoView();
                if (videoView != null) {
                    C60171g1.C8767a.m8577a(videoView, (Integer) null, 1, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C2427e(C2422e eVar, C60905o oVar, FinderVideoLayout finderVideoLayout, FinderVideoGreenSeekBar finderVideoGreenSeekBar) {
            this.f12857a = eVar;
            this.f12858b = oVar;
            this.f12859c = finderVideoLayout;
            this.f12860d = finderVideoGreenSeekBar;
        }

        /* renamed from: a */
        public void mo2425a(int i) {
        }

        /* renamed from: b */
        public void mo2426b(float f) {
            boolean z = true;
            boolean z2 = f == 0.5f;
            int i = C0966R.raw.icons_outlined_channels_play_quickly_1;
            if (z2) {
                i = C0966R.raw.icons_outlined_channels_play_quickly_0_5;
            } else {
                if (!(f == 1.0f)) {
                    if (f == 1.5f) {
                        i = C0966R.raw.icons_outlined_channels_play_quickly_1_5;
                    } else {
                        if (f != 2.0f) {
                            z = false;
                        }
                        if (z) {
                            i = C0966R.raw.icons_outlined_channels_play_quickly_2;
                        }
                    }
                }
            }
            WeImageView weImageView = (WeImageView) this.f12858b.mo85812D(C0966R.C0970id.nag);
            if (weImageView != null) {
                weImageView.setImageResource(i);
            }
        }

        /* renamed from: c */
        public void mo2427c(long j) {
            if (this.f12859c.mo79599y()) {
                this.f12860d.setIsPlay(true);
            }
        }

        /* renamed from: d */
        public void mo2428d(boolean z) {
            Log.m105924i("FinderLongVideoConvert", "onPlayStatusChange: isPlay=" + z);
            if (z) {
                C2422e eVar = this.f12857a;
                C60905o oVar = this.f12858b;
                Runnable runnable = eVar.f12845T;
                if (runnable != null) {
                    eVar.mo2419T0().removeCallbacks(runnable);
                    eVar.f12845T = null;
                }
                eVar.f12845T = new C14661v4(oVar, eVar);
                eVar.mo2419T0().postDelayed(eVar.f12845T, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                return;
            }
            C2422e eVar2 = this.f12857a;
            Runnable runnable2 = eVar2.f12845T;
            if (runnable2 != null) {
                eVar2.mo2419T0().removeCallbacks(runnable2);
                eVar2.f12845T = null;
            }
        }

        /* renamed from: e */
        public void mo2429e() {
        }

        public void onVideoEnded() {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12858b.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13354o6 o6Var = (C13354o6) rVar.mo62443b(context).mo62449e(C13354o6.class);
            if (o6Var != null) {
                C60905o oVar = this.f12858b;
                FinderVideoLayout finderVideoLayout = this.f12859c;
                if (!o6Var.mo12779d3(oVar)) {
                    C61926c.m72666K(0, new C2428a(finderVideoLayout));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$f */
    public static final class C2429f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f12862d;

        /* renamed from: e */
        public final /* synthetic */ C55018j0 f12863e;

        /* renamed from: f */
        public final /* synthetic */ C2422e f12864f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f12865g;

        public C2429f(FinderVideoLayout finderVideoLayout, C55018j0 j0Var, C2422e eVar, C60905o oVar) {
            this.f12862d = finderVideoLayout;
            this.f12863e = j0Var;
            this.f12864f = eVar;
            this.f12865g = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = this.f12862d.f161872i;
            Log.m105924i("FinderLongVideoConvert", "setOnClickListener onMediaClick  " + this.f12863e + ", isViewSelected=" + z);
            if (z) {
                C2422e.m2315R0(this.f12864f, this.f12865g, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$g */
    public static final class C2430g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f12866d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12867e;

        public C2430g(FinderVideoLayout finderVideoLayout, C60905o oVar) {
            this.f12866d = finderVideoLayout;
            this.f12867e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C59670o2 videoView = this.f12866d.getVideoView();
            FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                C60905o oVar = this.f12867e;
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                ((C13194da) rVar.mo62443b(context).mo75002a(C13194da.class)).mo12685c3(finderThumbPlayerProxy);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$i */
    public static final class C2431i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10008v1 f12868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2431i(C10008v1 v1Var) {
            super(0);
            this.f12868d = v1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f12868d instanceof C2829n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$j */
    public static final class C2432j implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12869a;

        public C2432j(C60905o oVar) {
            this.f12869a = oVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[5];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f12869a.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            String str2 = null;
            lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            Context context2 = this.f12869a.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13442s8 f2 = aVar.mo12873f(context2);
            lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            Context context3 = this.f12869a.f173499A;
            C87412m.m108593f(context3, "holder.context");
            C13442s8 f3 = aVar.mo12873f(context3);
            lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            Context context4 = this.f12869a.f173499A;
            C87412m.m108593f(context4, "holder.context");
            C13442s8 f4 = aVar.mo12873f(context4);
            lVarArr[3] = new C13604l("extra_info", f4 != null ? f4.f38107v : null);
            Context context5 = this.f12869a.f173499A;
            C87412m.m108593f(context5, "holder.context");
            C13442s8 f5 = aVar.mo12873f(context5);
            if (f5 != null) {
                str2 = f5.f38109x;
            }
            lVarArr[4] = new C13604l("enter_source_info", str2);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$k */
    public static final class C2433k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C2422e f12870d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12871e;

        public C2433k(C2422e eVar, C60905o oVar) {
            this.f12870d = eVar;
            this.f12871e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C2422e eVar = this.f12870d;
            C60905o oVar = this.f12871e;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            eVar.mo2272M(oVar, (BaseFinderFeed) obj, view, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$l */
    public static final class C2434l implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12872d;

        /* renamed from: e */
        public final /* synthetic */ C55018j0 f12873e;

        public C2434l(C60905o oVar, C55018j0 j0Var) {
            this.f12872d = oVar;
            this.f12873e = j0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
            r8 = r8.getPlayInfo();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$4"
                java.lang.String r2 = "android/view/View$OnLongClickListener"
                java.lang.String r3 = "onLongClick"
                java.lang.String r4 = "(Landroid/view/View;)Z"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r8 = r7.f12872d
                r0 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r8 = r8.mo85812D(r0)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r8 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r8
                if (r8 == 0) goto L_0x0031
                com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r8 = r8.getPlayInfo()
                if (r8 == 0) goto L_0x0031
                pl1.r0 r8 = r8.f161894c
                goto L_0x0032
            L_0x0031:
                r8 = 0
            L_0x0032:
                bl3.r r0 = bl3.C39818r.f106831a
                jq3.o r1 = r7.f12872d
                android.content.Context r1 = r1.f173499A
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r1, r2)
                com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<rs1.d1> r1 = rs1.C13176d1.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                rs1.d1 r0 = (rs1.C13176d1) r0
                jq3.o r1 = r7.f12872d
                android.content.Context r1 = r1.f173499A
                java.lang.String r2 = "holder.context"
                gy3.C87412m.m108593f(r1, r2)
                cm1.j0 r2 = r7.f12873e
                jq3.o r3 = r7.f12872d
                r0.mo12676d3(r1, r2, r8, r3)
                jq3.o r8 = r7.f12872d
                androidx.recyclerview.widget.RecyclerView r8 = r8.mo85811C()
                r8.requestLayout()
                r8 = 1
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$4"
                java.lang.String r3 = "android/view/View$OnLongClickListener"
                java.lang.String r4 = "onLongClick"
                java.lang.String r5 = "(Landroid/view/View;)Z"
                r1 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.C2422e.C2434l.onLongClick(android.view.View):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$m */
    public static final class C2435m implements View.OnClickListener {

        /* renamed from: d */
        public static final C2435m f12874d = new C2435m();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$n */
    public static final class C2436n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C2422e f12875d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12876e;

        public C2436n(C2422e eVar, C60905o oVar) {
            this.f12875d = eVar;
            this.f12876e = oVar;
        }

        public final void run() {
            FinderFeedFullConvert.StateListener stateListener = new FinderFeedFullConvert.StateListener(this.f12875d, this.f12876e);
            stateListener.alive();
            this.f12875d.f12571o.add(stateListener);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$o */
    public static final class C2437o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C2422e f12877d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12878e;

        public C2437o(C2422e eVar, C60905o oVar) {
            this.f12877d = eVar;
            this.f12878e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f12877d.mo2311p(this.f12878e, 5);
            if (this.f12878e.mo17363j() == 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f12878e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C60592c cVar = ((C60593d) rVar.mo62443b(context).mo75002a(C60593d.class)).f172693f;
                if (cVar != null) {
                    cVar.mo85549a();
                    cVar.mo85550b("headimage");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$p */
    public static final class C2438p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C2422e f12879d;

        /* renamed from: e */
        public final /* synthetic */ C55018j0 f12880e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f12881f;

        public C2438p(C2422e eVar, C55018j0 j0Var, C60905o oVar) {
            this.f12879d = eVar;
            this.f12880e = j0Var;
            this.f12881f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f12879d.mo2313q(this.f12880e)) {
                C2422e eVar = this.f12879d;
                C60905o oVar = this.f12881f;
                C55018j0 j0Var = this.f12880e;
                eVar.getClass();
                FinderFeedFullConvert.m2150a0(eVar, oVar, j0Var, false, 0, (C65426w0) null, 0, 4, eVar instanceof FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1.C2555a, 0, this.f12879d.mo2330z(this.f12881f), 0, 1336, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$q */
    public static final class C2439q extends C87413o implements C32224a<ArrayList<C55018j0>> {

        /* renamed from: d */
        public static final C2439q f12882d = new C2439q();

        public C2439q() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$r */
    public static final class C2440r extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C10008v1 f12883d;

        /* renamed from: e */
        public final /* synthetic */ C2422e f12884e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2440r(C10008v1 v1Var, C2422e eVar) {
            super(0);
            this.f12883d = v1Var;
            this.f12884e = eVar;
        }

        public Object invoke() {
            RecyclerView recyclerView = new RecyclerView(this.f12883d.getActivity(), (AttributeSet) null);
            C2422e eVar = this.f12884e;
            recyclerView.setAdapter(new C2443f(new FinderLongVideoConvert$tmpRecyclerView$2$1$2(eVar), (ArrayList) ((C36570n) eVar.f12841P).getValue()));
            return recyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$s */
    public static final class C2441s extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C2441s f12885d = new C2441s();

        public C2441s() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.e$t */
    public static final class C2442t implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12886d;

        public C2442t(C60905o oVar) {
            this.f12886d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12886d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13539y3 y3Var = (C13539y3) rVar.mo62443b(context).mo75002a(C13539y3.class);
            y3Var.f38408x = true;
            y3Var.getContext().setRequestedOrientation(11);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2422e(FinderVideoCore finderVideoCore, C10008v1 v1Var) {
        super(finderVideoCore, v1Var, false, 301, true, 4, (C8480h) null);
        C58553c y3;
        C87412m.m108594g(finderVideoCore, "videoCore");
        C87412m.m108594g(v1Var, "contract");
        this.f12842Q = C36568h.m40985a(new C2440r(v1Var, this));
        this.f12843R = C36568h.m40985a(new C2431i(v1Var));
        this.f12844S = C36568h.m40985a(C2441s.f12885d);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(v1Var.getActivity());
        if (f != null && (y3 = f.mo12867y3(this.f12566g)) != null) {
            y3.mo83450a(new C2423a(v1Var, this));
        }
    }

    /* renamed from: R0 */
    public static final void m2315R0(C2422e eVar, C60905o oVar, boolean z) {
        eVar.getClass();
        View D = oVar.mo85812D(C0966R.C0970id.n9s);
        int i = (D.getVisibility() != 0 || z) ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D2 = oVar.mo85812D(C0966R.C0970id.eah);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i == 0) {
            Runnable runnable = eVar.f12845T;
            if (runnable != null) {
                eVar.mo2419T0().removeCallbacks(runnable);
                eVar.f12845T = null;
            }
            eVar.f12845T = new C14661v4(oVar, eVar);
            eVar.mo2419T0().postDelayed(eVar.f12845T, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            return;
        }
        Runnable runnable2 = eVar.f12845T;
        if (runnable2 != null) {
            eVar.mo2419T0().removeCallbacks(runnable2);
            eVar.f12845T = null;
        }
    }

    /* renamed from: F */
    public void mo2258F(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        C55018j0 j0Var = (C55018j0) oVar.f173503E;
        View D = oVar.mo85812D(C0966R.C0970id.ms_);
        int i = (!j0Var.mo3513o().isLongVideo() || !j0Var.mo76077q0(this.f12564e.mo2497u0())) ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.mo2258F(oVar, z);
    }

    /* renamed from: F0 */
    public void mo2259F0(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g((C55018j0) baseFinderFeed, "item");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: N */
    public void mo2274N(C60905o oVar, int i, int i2, int i3) {
        C87412m.m108594g(oVar, "holder");
        Object obj = oVar.f173503E;
        String str = null;
        C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
        if (j0Var != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onDeepEnjoyMedia] ");
            C58969q l = j0Var.mo3507l();
            if (l != null) {
                str = l.getNickname();
            }
            sb.append(str);
            sb.append(" position=");
            sb.append(i);
            sb.append(" type=");
            sb.append(i2);
            sb.append(" source=");
            sb.append(i3);
            sb.append(" feedId=");
            sb.append(C61926c.m72691p(j0Var.getItemId()));
            Log.m105924i("FinderLongVideoConvert", sb.toString());
            if (!this.f12564e.mo2497u0() && !j0Var.mo3472F()) {
                j0Var.mo3486T(true);
                FinderFeedFullConvert.m2151u(this, oVar, j0Var, false, 4, (Object) null);
                mo2322v(oVar, j0Var);
                mo2327x0(j0Var, oVar);
                mo2310o0(oVar);
            }
        }
    }

    /* renamed from: P */
    public void mo2278P(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        StringBuilder sb = new StringBuilder();
        sb.append("[onHafEnjoyMedia] ");
        C58969q l = baseFinderFeed.mo3507l();
        sb.append(l != null ? l.getNickname() : null);
        sb.append(" position=");
        sb.append(i);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(baseFinderFeed.getItemId()));
        Log.m105924i("FinderLongVideoConvert", sb.toString());
        if (!baseFinderFeed.mo3475I()) {
            baseFinderFeed.mo3491Y(true);
        }
    }

    /* renamed from: P0 */
    public void mo2279P0(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, Drawable drawable) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C55018j0) baseFinderFeed, "item");
    }

    /* renamed from: Q0 */
    public void mo2324w(C60905o oVar, C55018j0 j0Var, int i, int i2) {
        C60905o oVar2 = oVar;
        C55018j0 j0Var2 = j0Var;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(j0Var2, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.n9s);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        int i3 = 8;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D2 = oVar2.mo85812D(C0966R.C0970id.eah);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D3 = oVar2.mo85812D(C0966R.C0970id.n9r);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view = D3;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D4 = oVar2.mo85812D(C0966R.C0970id.nmj);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view2 = D4;
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        View entHintLayout = ((C13539y3) rVar.mo62443b(context).mo75002a(C13539y3.class)).mo12947e3().getEntHintLayout();
        if (entHintLayout != null) {
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view3 = entHintLayout;
            C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            entHintLayout.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FeedData a = FeedData.Companion.mo78883a(j0Var2);
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
        boolean z = true;
        if (mo2420U0()) {
            finderVideoLayout.setSelectedToPlay(true);
            finderVideoLayout.setLoop(false);
            finderVideoLayout.setReuseSamePlayer(true);
        }
        FinderVideoGreenSeekBar finderVideoGreenSeekBar = (FinderVideoGreenSeekBar) oVar2.mo85812D(C0966R.C0970id.n9t);
        View D5 = oVar2.mo85812D(C0966R.C0970id.eah);
        C87412m.m108593f(D5, "holder.getView(R.id.float_play_icon)");
        finderVideoGreenSeekBar.setPlayButton((ImageView) D5);
        finderVideoGreenSeekBar.setOnPauseClickListener(new C2424b(oVar2));
        View D6 = oVar2.mo85812D(C0966R.C0970id.naj);
        finderVideoGreenSeekBar.setRelativeCurrentTimeTv((TextView) oVar2.mo85812D(C0966R.C0970id.bxs));
        finderVideoGreenSeekBar.setRelativeTotalTimeTv((TextView) oVar2.mo85812D(C0966R.C0970id.ksz));
        finderVideoGreenSeekBar.setOnSeekStart(new C2425c(this, oVar2, finderVideoGreenSeekBar, D6));
        finderVideoGreenSeekBar.setOnSeekEnd(new C2426d(D6, finderVideoGreenSeekBar, oVar2));
        finderVideoGreenSeekBar.setPlayStatusListener(new C2427e(this, oVar2, finderVideoLayout, finderVideoGreenSeekBar));
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(a.getMediaList());
        finderVideoGreenSeekBar.setVideoTotalTime(rq22 != null ? rq22.f185269g : 0);
        C87412m.m108593f(finderVideoLayout, "videoContainer");
        FinderVideoLayout.m65083p(finderVideoLayout, 0, a, finderVideoGreenSeekBar, this.f12566g, true, (C32227p) null, (C32227p) null, false, false, 480, (Object) null);
        finderVideoLayout.mo79597w(finderVideoGreenSeekBar);
        if (mo2420U0()) {
            C59670o2 videoView = finderVideoLayout.getVideoView();
            FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setPlaySpeed(1.0f);
            }
            FinderVideoLayout.m65078D(finderVideoLayout, 0, (C12931a) null, 3, (Object) null);
        }
        finderVideoLayout.setOnClickListener(new C2429f(finderVideoLayout, j0Var2, this, oVar2));
        View D7 = oVar2.mo85812D(C0966R.C0970id.nag);
        if (D7 != null) {
            int i4 = j0Var.mo3513o().isLongVideo() ? 0 : 8;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Integer.valueOf(i4));
            View view4 = D7;
            C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D7.setOnClickListener(new C2430g(finderVideoLayout, oVar2));
        }
        View D8 = oVar2.mo85812D(C0966R.C0970id.kbp);
        if (D8 != null) {
            long nanoTime = System.nanoTime();
            if (!C85875k4.m106208w() && !C85875k4.m106157N()) {
                z = false;
            }
            if (BuildInfo.DEBUG) {
                Log.m105924i("FinderUIToolHelper", "[isFoldableDeviceOrInMagicWindowMode] cost=" + (System.nanoTime() - nanoTime) + "ns");
            }
            if (!z) {
                i3 = 0;
            }
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(Integer.valueOf(i3));
            View view5 = D8;
            C117292a.m165358d(view5, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setOnClickListener(new C2442t(oVar2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d3  */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2307n(jq3.C60905o r13, cm1.C55018j0 r14, int r15) {
        /*
            r12 = this;
            java.lang.String r15 = "holder"
            gy3.C87412m.m108594g(r13, r15)
            java.lang.String r15 = "item"
            gy3.C87412m.m108594g(r14, r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r14.mo3513o()
            java.util.LinkedList r15 = r15.getMediaList()
            android.content.Context r0 = r13.f173499A
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r0)
            int r1 = r0.x
            int r0 = r0.y
            if (r1 <= r0) goto L_0x001f
            r1 = r0
        L_0x001f:
            er1.w3 r0 = er1.C58784w3.f168295a
            float r15 = r0.mo83925e0(r15)
            r2 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r13 = r13.mo85812D(r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r13 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r13
            android.view.ViewParent r2 = r13.getParent()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r2, r3)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r4 = -1
            r3.width = r4
            r5 = 1058013184(0x3f100000, float:0.5625)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0058
            float r5 = (float) r1
            r7 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 * r7
            r7 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 / r7
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
        L_0x0055:
            float r5 = (float) r7
            int r5 = (int) r5
            goto L_0x0066
        L_0x0058:
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0065
            float r5 = (float) r1
            float r5 = r5 * r15
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            goto L_0x0055
        L_0x0065:
            r5 = r1
        L_0x0066:
            r3.height = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "calculateMediaLayoutParams: parent mediaRatio="
            r5.append(r7)
            r5.append(r15)
            java.lang.String r7 = ", width="
            r5.append(r7)
            int r7 = r3.width
            r5.append(r7)
            java.lang.String r7 = ", height="
            r5.append(r7)
            int r3 = r3.height
            r5.append(r3)
            java.lang.String r3 = ", screenWidth="
            r5.append(r3)
            r5.append(r1)
            java.lang.String r8 = ", desc:"
            r5.append(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r14.mo3513o()
            java.lang.String r9 = r9.getDescription()
            java.lang.String r9 = r0.mo83950n0(r9)
            r5.append(r9)
            java.lang.String r9 = ", feedId="
            r5.append(r9)
            long r10 = r14.getItemId()
            java.lang.String r10 = o40.C61926c.m72691p(r10)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "FinderLongVideoConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            r13.width = r4
            int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00d3
            float r4 = (float) r1
            float r4 = r4 * r15
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r15 = (float) r4
            int r15 = (int) r15
            goto L_0x00d4
        L_0x00d3:
            r15 = r1
        L_0x00d4:
            r13.height = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = "calculateMediaLayoutParams: finderVideoLayout param, width="
            r15.append(r4)
            int r4 = r13.width
            r15.append(r4)
            r15.append(r7)
            int r13 = r13.height
            r15.append(r13)
            r15.append(r3)
            r15.append(r1)
            r15.append(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r14.mo3513o()
            java.lang.String r13 = r13.getDescription()
            java.lang.String r13 = r0.mo83950n0(r13)
            r15.append(r13)
            r15.append(r9)
            long r13 = r14.getItemId()
            java.lang.String r13 = o40.C61926c.m72691p(r13)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            r2.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.C2422e.mo2307n(jq3.o, cm1.j0, int):void");
    }

    /* renamed from: T0 */
    public final MMHandler mo2419T0() {
        return (MMHandler) ((C36570n) this.f12844S).getValue();
    }

    /* renamed from: U0 */
    public final boolean mo2420U0() {
        return ((Boolean) ((C36570n) this.f12843R).getValue()).booleanValue();
    }

    /* renamed from: V0 */
    public void mo44e(C60905o oVar, C55018j0 j0Var, int i, int i2, boolean z, List<Object> list) {
        char c;
        char c2;
        C60905o oVar2 = oVar;
        C55018j0 j0Var2 = j0Var;
        int i3 = i;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C61212e.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(j0Var2, "item");
        Log.m105924i("FinderLongVideoConvert", "onBindViewHolder position:" + i3 + " type:" + i2 + " holder:" + oVar2 + ", id=" + C61926c.m72691p(j0Var.getItemId()));
        if (this.f12564e instanceof C2829n) {
            oVar2.f173503E = j0Var2;
            if (oVar.mo85811C() == null) {
                oVar2.f173504F = (RecyclerView) ((C36570n) this.f12842Q).getValue();
            }
            ((ArrayList) ((C36570n) this.f12841P).getValue()).clear();
            ((ArrayList) ((C36570n) this.f12841P).getValue()).add(j0Var2);
        }
        View view = oVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        if (C16376b.f43775a) {
            view.setTag(C0966R.C0970id.mwm, "Finder");
            view.setTag(C0966R.C0970id.mwl, j0Var2);
        }
        boolean z2 = true;
        char c3 = 0;
        int i4 = 3;
        int i5 = 4;
        int i6 = 2;
        if (!(list == null || list.isEmpty())) {
            boolean z3 = true;
            for (T next : list) {
                if (next instanceof C13604l) {
                    int intValue = ((Number) ((C13604l) next).f38555d).intValue();
                    if (intValue == 1) {
                        mo2297g0(j0Var2, oVar2);
                    } else if (intValue != i6) {
                        if (intValue == i4) {
                            C65866w wVar = C65866w.f189407h;
                            C13604l<Boolean, Boolean> g = wVar.mo89908g(j0Var.mo3513o().getFeedObject());
                            boolean booleanValue = ((Boolean) g.f38555d).booleanValue();
                            boolean booleanValue2 = ((Boolean) g.f38556e).booleanValue();
                            mo2294e0(j0Var, booleanValue, booleanValue2, wVar.mo89909h(j0Var.mo3513o().getFeedObject()), oVar, i);
                            ((C61212e) C86312j.m106911c(cls3)).mo86153W7("feed_like_click", oVar2.mo85812D(C0966R.C0970id.a2s), C90364q0.m113147f(new C13604l("is_action_like", Integer.valueOf(booleanValue ? 1 : 0)), new C13604l("is_private", Integer.valueOf(booleanValue2 ? 1 : 0))), 24617);
                            mo2255D0(j0Var2, oVar2, true, i3);
                        } else if (intValue == i5) {
                            mo2269K0(oVar, j0Var);
                            mo2300j0(oVar, j0Var);
                        } else if (intValue == 29) {
                            mo2306m0(oVar);
                        } else if (intValue != 30) {
                            switch (intValue) {
                                case 9:
                                    mo2308n0(j0Var2, oVar2);
                                    break;
                                case 10:
                                    FinderItem o = j0Var.mo3513o();
                                    o.setForwardCount(o.getForwardCount() + 1);
                                    mo2308n0(j0Var2, oVar2);
                                    break;
                                case 11:
                                    mo2297g0(j0Var2, oVar2);
                                    break;
                                case 12:
                                    mo2297g0(j0Var2, oVar2);
                                    mo2308n0(j0Var2, oVar2);
                                    C65866w wVar2 = C65866w.f189407h;
                                    C13604l<Boolean, Boolean> g2 = wVar2.mo89908g(j0Var.mo3513o().getFeedObject());
                                    mo2294e0(j0Var, ((Boolean) g2.f38555d).booleanValue(), ((Boolean) g2.f38556e).booleanValue(), wVar2.mo89909h(j0Var.mo3513o().getFeedObject()), oVar, i);
                                    mo2309o(oVar, j0Var);
                                    mo2295f0(oVar2, true);
                                    break;
                            }
                        } else {
                            Object obj = oVar2.f173503E;
                            C87412m.m108593f(obj, "holder.getAssociatedObject()");
                            mo2307n(oVar2, (C55018j0) obj, i3);
                            mo2306m0(oVar);
                        }
                        c3 = 0;
                    } else {
                        c3 = 0;
                        FinderFeedFullConvert.m2152z0(this, j0Var, oVar, false, 4, (Object) null);
                    }
                    i6 = 2;
                    i5 = 4;
                    i4 = 3;
                }
                i6 = 2;
                i5 = 4;
                i4 = 3;
                z3 = false;
            }
            c2 = 4;
            c = 3;
            if (z3) {
                return;
            }
        } else {
            c2 = 4;
            c = 3;
        }
        if (!z) {
            if (mo2420U0()) {
                mo735i(oVar);
            }
            mo2324w(oVar, j0Var, i, i2);
        }
        ((C61212e) C86312j.m106911c(cls3)).o30(oVar2.f44854d, "finder_feed_item_view");
        C61212e eVar = (C61212e) C86312j.m106911c(cls3);
        View view2 = oVar2.f44854d;
        C13604l[] lVarArr = new C13604l[8];
        lVarArr[c3] = new C13604l("feed_id", C61926c.m72691p(j0Var.mo3513o().getFeedObject().f164794id));
        lVarArr[1] = new C13604l("session_buffer", j0Var.mo3513o().getFeedObject().sessionBuffer);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        lVarArr[2] = new C13604l("comment_scene", f != null ? Integer.valueOf(f.f38096i) : null);
        lVarArr[c] = new C13604l("finder_username", j0Var.mo3513o().getFeedObject().username);
        lVarArr[c2] = new C13604l("media_type", Integer.valueOf(j0Var.mo3513o().getMediaType()));
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(j0Var.mo3513o().getMediaList());
        lVarArr[5] = new C13604l("video_duration_time", String.valueOf(rq22 != null ? rq22.f185269g : 0));
        lVarArr[6] = new C13604l("long_video_id", C61926c.m72691p(j0Var.getItemId()));
        lVarArr[7] = new C13604l("feed_display_type", "1");
        eVar.mo86149PM(view2, C90364q0.m113147f(lVarArr));
        ((C61212e) C86312j.m106911c(cls3)).E60(oVar2.f44854d, new C2432j(oVar2));
        mo2307n(oVar, j0Var, i);
        mo2306m0(oVar);
        C58969q l = j0Var.mo3507l();
        String avatarUrl = l != null ? l.getAvatarUrl() : null;
        if (!(avatarUrl == null || avatarUrl.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            FinderContact finderContact = j0Var.mo3513o().getFeedObject().contact;
            avatarUrl = finderContact != null ? finderContact.headUrl : null;
        }
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        C62345f fVar = new C62345f(avatarUrl, (C27696y) null, 2, (C8480h) null);
        View D = oVar2.mo85812D(C0966R.C0970id.a27);
        C87412m.m108593f(D, "holder.getView(R.id.avatar_iv)");
        i25.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        mo2299i0(oVar, j0Var);
        C65866w wVar3 = C65866w.f189407h;
        C13604l<Boolean, Boolean> g3 = wVar3.mo89908g(j0Var.mo3513o().getFeedObject());
        mo2294e0(j0Var, ((Boolean) g3.f38555d).booleanValue(), ((Boolean) g3.f38556e).booleanValue(), wVar3.mo89909h(j0Var.mo3513o().getFeedObject()), oVar, i);
        mo2305m(oVar2, i3);
        mo2297g0(j0Var2, oVar2);
        View D2 = oVar2.mo85812D(C0966R.C0970id.edb);
        if (D2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = D2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D3 = oVar2.mo85812D(C0966R.C0970id.ji4);
        if (D3 != null) {
            D3.setOnClickListener(new C2433k(this, oVar2));
        }
        oVar2.mo85812D(C0966R.C0970id.ji4).setOnLongClickListener(new C2434l(oVar2, j0Var2));
        mo2255D0(j0Var2, oVar2, false, i3);
        mo2308n0(j0Var2, oVar2);
        mo2310o0(oVar);
        mo2300j0(oVar, j0Var);
        mo2269K0(oVar, j0Var);
        mo2327x0(j0Var2, oVar2);
        mo2258F(oVar2, false);
        if (mo2420U0()) {
            mo2419T0().removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: W */
    public void mo2286W(C60905o oVar, int i, int i2, boolean z) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.n9s);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.eah);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view = D2;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout != null && !finderVideoLayout.mo79599y()) {
            finderVideoLayout.mo79600z(false, true);
        }
    }

    /* renamed from: W0 */
    public final void mo2422W0(C60905o oVar) {
        Class cls = C61212e.class;
        C87412m.m108594g(oVar, "holder");
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.nad);
        if (frameLayout != null) {
            View inflate = C85868k2.m106137b(oVar.f173499A).inflate(C0966R.C0971layout.alk, (ViewGroup) null, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) inflate;
            finderVideoLayout.setVideoCore(this.f40416L);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            C13598b0 b0Var = C13598b0.f38549a;
            frameLayout.addView(finderVideoLayout, 0, layoutParams);
        }
        C2437o oVar2 = new C2437o(this, oVar);
        View D = oVar.mo85812D(C0966R.C0970id.bxs);
        C87412m.m108593f(D, "holder.getView<TextView>(R.id.current_time_tv)");
        C7919x.m8091a((TextView) D);
        View D2 = oVar.mo85812D(C0966R.C0970id.ksz);
        C87412m.m108593f(D2, "holder.getView<TextView>(R.id.total_time_tv)");
        C7919x.m8091a((TextView) D2);
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.bh6)).getPaint(), 0.8f);
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((FlowTextMixView) oVar.f44854d.findViewById(C0966R.C0970id.eam)).setMaxWidth((int) (((float) ((Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels) * 0.36f));
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.a27);
        imageView.setOnClickListener(oVar2);
        ((C61212e) C86312j.m106911c(cls)).o30(imageView, "finder_feed_avatar");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(imageView, 8, 24617);
        NeatTextView neatTextView = (NeatTextView) oVar.mo85812D(C0966R.C0970id.ki5);
        C58784w3 w3Var = C58784w3.f168295a;
        C87412m.m108593f(neatTextView, "contentTv");
        w3Var.getClass();
        neatTextView.setOnTouchListener(new C107029o(neatTextView, new C75652c4(neatTextView)));
        C2436n nVar = new C2436n(this, oVar);
        if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            oVar.f44854d.post(nVar);
        } else {
            nVar.run();
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.edb);
        if (D3 != null) {
            D3.setOnClickListener(C2435m.f12874d);
            TextView textView = (TextView) D3.findViewById(C0966R.C0970id.idd);
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            TextView textView2 = (TextView) D3.findViewById(C0966R.C0970id.cut);
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
                textView2.setText(w3Var.mo83962s0());
            }
            TextView textView3 = (TextView) D3.findViewById(C0966R.C0970id.jhv);
            if (textView3 != null) {
                textView3.setTextSize(1, 12.0f);
            }
            TextView textView4 = (TextView) D3.findViewById(C0966R.C0970id.fnp);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
            }
            TextView textView5 = (TextView) D3.findViewById(C0966R.C0970id.f359286k04);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
            }
            TextView textView6 = (TextView) D3.findViewById(C0966R.C0970id.bje);
            if (textView6 != null) {
                textView6.setTextSize(1, 12.0f);
            }
        }
        TextView textView7 = (TextView) oVar.mo85812D(C0966R.C0970id.fpi);
        if (textView7 != null) {
            textView7.setTextSize(1, 10.0f);
        }
        View D4 = oVar.mo85812D(C0966R.C0970id.k07);
        if (D4 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D4;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo2301k(oVar);
    }

    /* renamed from: X0 */
    public void mo2299i0(C60905o oVar, C55018j0 j0Var) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(j0Var, "item");
        NeatTextView neatTextView = (NeatTextView) oVar.mo85812D(C0966R.C0970id.ki5);
        if (this.f12567h) {
            neatTextView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }
        CharSequence descriptionSpan = j0Var.mo3513o().getDescriptionSpan();
        if (descriptionSpan == null) {
            descriptionSpan = "";
        }
        if (!(descriptionSpan.length() == 0)) {
            neatTextView.mo154993k(0.0f, 1.2f);
            neatTextView.setOnClickListener(new C2438p(this, j0Var, oVar));
            neatTextView.setEllipsize(TextUtils.TruncateAt.END);
            neatTextView.setMaxLines(mo2420U0() ? 2 : 4);
            neatTextView.setVisibility(0);
            j0Var.mo3513o().getTopicClickExtra().f26404c = new WeakReference<>(oVar.f173499A);
            neatTextView.mo104279b(descriptionSpan);
            Log.m105924i("FinderLongVideoConvert", "content:" + descriptionSpan + " nickname:" + j0Var.mo3513o().getFeedObject().nickname);
        } else if (neatTextView != null) {
            neatTextView.setVisibility(8);
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d7v;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        mo2422W0(oVar);
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8);
        if (megaVideoBulletView != null) {
            megaVideoBulletView.f158433f.mo84818e();
        }
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout != null) {
            finderVideoLayout.mo79539A();
        }
    }

    /* renamed from: z */
    public int mo2330z(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        C10008v1 v1Var = this.f12564e;
        C2829n nVar = v1Var instanceof C2829n ? (C2829n) v1Var : null;
        if (nVar == null) {
            return super.mo2330z(oVar);
        }
        C9868n5 g = nVar.mo2932g();
        View findViewById = g.f30449a.findViewById(C0966R.C0970id.nak);
        if (findViewById != null) {
            return Math.max(findViewById.getHeight() + (g.f30449a.findViewById(C0966R.C0970id.n7h).getHeight() - g.f30449a.findViewById(C0966R.C0970id.nad).getHeight()), 0);
        }
        return 0;
    }
}

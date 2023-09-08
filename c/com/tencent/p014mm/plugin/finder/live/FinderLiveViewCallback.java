package com.tencent.p014mm.plugin.finder.live;

import a14.C0000n0;
import a14.C53930o0;
import ak1.C54067f0;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import al1.C54130j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.view.C56072j1;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveRecyclerView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dg1.C58263a;
import di3.C86312j;
import dk1.C58312g;
import dp1.C58358d0;
import eg1.C58584k0;
import eg1.C58589p;
import eg1.C58596u;
import eg1.C58597v;
import eg1.C7650g0;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32228q;
import gg1.C32444a;
import gh1.C59447j;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C59904l;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ll1.C61304a;
import o40.C11348f;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p185kq.C61130g;
import p50.C62193a;
import p565ir.C60606n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C64273c21;
import y50.C66524m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/FinderLiveViewCallback;", "Leg1/v;", "Ldg1/a;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "rfLayout", "Landroid/view/View;", "liveContainer", "Lcom/tencent/mm/ui/MMActivity;", "activity", "Landroidx/fragment/app/Fragment;", "fragment", "Leg1/u;", "presenter", "", "isFromFloat", "autoScrollToNext", "<init>", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout;Landroid/view/View;Lcom/tencent/mm/ui/MMActivity;Landroidx/fragment/app/Fragment;Leg1/u;ZZ)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback */
public final class FinderLiveViewCallback implements C58597v, C58263a {

    /* renamed from: L */
    public static int f159198L;

    /* renamed from: A */
    public boolean f159199A;

    /* renamed from: B */
    public C56072j1 f159200B;

    /* renamed from: C */
    public boolean f159201C;

    /* renamed from: D */
    public int f159202D;

    /* renamed from: E */
    public boolean f159203E;

    /* renamed from: F */
    public int f159204F;

    /* renamed from: G */
    public int f159205G;

    /* renamed from: H */
    public boolean f159206H;

    /* renamed from: I */
    public long f159207I;

    /* renamed from: J */
    public boolean f159208J;

    /* renamed from: K */
    public long f159209K;

    /* renamed from: d */
    public final RefreshLoadMoreLayout f159210d;

    /* renamed from: e */
    public final View f159211e;

    /* renamed from: f */
    public final MMActivity f159212f;

    /* renamed from: g */
    public final Fragment f159213g;

    /* renamed from: h */
    public final C58596u f159214h;

    /* renamed from: i */
    public final boolean f159215i;

    /* renamed from: j */
    public final boolean f159216j;

    /* renamed from: n */
    public C0000n0 f159217n;

    /* renamed from: o */
    public C39623j f159218o;

    /* renamed from: p */
    public final C13601g f159219p;

    /* renamed from: q */
    public FinderLiveRecyclerView f159220q;

    /* renamed from: r */
    public FinderLiveLayoutManager f159221r;

    /* renamed from: s */
    public final C49712hj1 f159222s;

    /* renamed from: t */
    public final C58584k0 f159223t;

    /* renamed from: u */
    public int f159224u;

    /* renamed from: v */
    public final C13601g f159225v;

    /* renamed from: w */
    public final FinderLiveViewCallback$LiveUninterestedListener$1 f159226w;

    /* renamed from: x */
    public final int f159227x;

    /* renamed from: y */
    public final int f159228y;

    /* renamed from: z */
    public boolean f159229z;

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$a */
    public final class C55878a extends C54256s {

        /* renamed from: n */
        public final int f159230n;

        public C55878a(FinderLiveViewCallback finderLiveViewCallback, int i) {
            super(finderLiveViewCallback.f159220q.getContext());
            this.f159230n = i;
        }

        /* renamed from: h */
        public int mo6715h(int i, int i2, int i3, int i4, int i5) {
            int h = super.mo6715h(i, i2, i3, i4, i5);
            if (h > 0) {
                int i6 = FinderLiveLayoutManager.f159772E;
                return h - FinderLiveLayoutManager.f159772E;
            }
            int i7 = FinderLiveLayoutManager.f159772E;
            return h + FinderLiveLayoutManager.f159772E;
        }

        /* renamed from: l */
        public int mo10339l(int i) {
            int i2 = this.f159230n;
            return i2 > 0 ? i2 : super.mo10339l(i);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            int i2 = this.f159230n;
            return i2 > 0 ? i2 : super.mo10340m(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$b */
    public static final class C55879b extends C87413o implements C32224a<C61304a> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55879b(FinderLiveViewCallback finderLiveViewCallback) {
            super(0);
            this.f159231d = finderLiveViewCallback;
        }

        public Object invoke() {
            C61304a aVar = new C61304a();
            AppCompatActivity context = this.f159231d.f159212f.getContext();
            C87412m.m108593f(context, "activity.context");
            if (aVar.f174416a.size() == 0) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpv);
                int i = C66524m.C66525a.f191366a;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i, i, true);
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpw), i, i, true);
                Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpx), i, i, true);
                Bitmap createScaledBitmap4 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpy), i, i, true);
                Bitmap createScaledBitmap5 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpz), i, i, true);
                Bitmap createScaledBitmap6 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.f357237bq0), i, i, true);
                aVar.f174416a.add(createScaledBitmap);
                aVar.f174416a.add(createScaledBitmap2);
                aVar.f174416a.add(createScaledBitmap3);
                aVar.f174416a.add(createScaledBitmap4);
                aVar.f174416a.add(createScaledBitmap5);
                aVar.f174416a.add(createScaledBitmap6);
            }
            if (aVar.f174417b.size() == 0) {
                Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bpz);
                int i2 = C66524m.C66525a.f191366a;
                Bitmap createScaledBitmap7 = Bitmap.createScaledBitmap(decodeResource2, i2, i2, true);
                Bitmap createScaledBitmap8 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.f357238bq1), i2, i2, true);
                aVar.f174417b.add(createScaledBitmap7);
                aVar.f174417b.add(createScaledBitmap8);
            }
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$c */
    public static final class C55880c extends C87413o implements C32228q<Integer, View, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159232d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveLayoutManager f159233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55880c(FinderLiveViewCallback finderLiveViewCallback, FinderLiveLayoutManager finderLiveLayoutManager) {
            super(3);
            this.f159232d = finderLiveViewCallback;
            this.f159233e = finderLiveLayoutManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:138:0x03d3, code lost:
            if (r1 != null) goto L_0x03d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x068c, code lost:
            if (r6 != false) goto L_0x0735;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02f8  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02fc  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x02ff  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0341  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x039c  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x03e8  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x03ed  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x03f2  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0416  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0418  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x044c  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0451  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x047e  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x048e  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x062c  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x065a A[SYNTHETIC, Splitter:B:192:0x065a] */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x0680 A[Catch:{ Exception -> 0x071c }] */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x0765  */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x07b0  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0811  */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x0814  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x081b  */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x0823  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0842  */
        /* JADX WARNING: Removed duplicated region for block: B:241:0x087b  */
        /* JADX WARNING: Removed duplicated region for block: B:252:0x0898  */
        /* JADX WARNING: Removed duplicated region for block: B:260:0x08b0  */
        /* JADX WARNING: Removed duplicated region for block: B:303:0x0a27  */
        /* JADX WARNING: Removed duplicated region for block: B:304:0x0a2a  */
        /* JADX WARNING: Removed duplicated region for block: B:310:0x0a37  */
        /* JADX WARNING: Removed duplicated region for block: B:311:0x0a3a  */
        /* JADX WARNING: Removed duplicated region for block: B:314:0x0a58  */
        /* JADX WARNING: Removed duplicated region for block: B:315:0x0a5c  */
        /* JADX WARNING: Removed duplicated region for block: B:317:0x0a5f  */
        /* JADX WARNING: Removed duplicated region for block: B:318:0x0a72  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
            /*
                r35 = this;
                r1 = r35
                r0 = r36
                java.lang.Number r0 = (java.lang.Number) r0
                int r2 = r0.intValue()
                r0 = r37
                android.view.View r0 = (android.view.View) r0
                r3 = r38
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                java.lang.String r4 = "child"
                gy3.C87412m.m108594g(r0, r4)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r1.f159232d
                boolean r4 = r0.f159208J
                if (r4 != 0) goto L_0x0a7b
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r4 = r0.f159220q
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
                boolean r5 = r4 instanceof eg1.C58589p
                if (r5 == 0) goto L_0x002e
                eg1.p r4 = (eg1.C58589p) r4
                goto L_0x002f
            L_0x002e:
                r4 = 0
            L_0x002f:
                r7 = 0
                if (r4 == 0) goto L_0x0040
                al1.h r4 = r4.mo83488O4(r2)
                if (r4 == 0) goto L_0x0040
                com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
                if (r4 == 0) goto L_0x0040
                long r4 = r4.f157064e
                goto L_0x0041
            L_0x0040:
                r4 = r7
            L_0x0041:
                r0.f159207I = r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "selectItemView onItemSelected pos:"
                r0.append(r4)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "Finder.FinderLiveViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                dp1.z1$a r0 = dp1.C58418z1.f167360a
                r5 = 1
                if (r0 == 0) goto L_0x0066
                long r10 = r0.f167363c
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 != 0) goto L_0x0066
                r10 = 1
                goto L_0x0067
            L_0x0066:
                r10 = 0
            L_0x0067:
                if (r10 == 0) goto L_0x0072
                if (r0 != 0) goto L_0x006c
                goto L_0x0072
            L_0x006c:
                long r10 = java.lang.System.currentTimeMillis()
                r0.f167363c = r10
            L_0x0072:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r10 = r1.f159232d
                java.lang.Class<ht1.g4> r0 = ht1.C60172g4.class
                java.lang.Class<dk1.g> r11 = dk1.C58312g.class
                int r12 = com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.f159198L
                if (r12 == 0) goto L_0x0086
                if (r2 <= 0) goto L_0x0086
                if (r12 != r5) goto L_0x0082
                r12 = 1
                goto L_0x0083
            L_0x0082:
                r12 = 0
            L_0x0083:
                r10.mo77514F0(r12)
            L_0x0086:
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r12 = r10.f159220q
                androidx.recyclerview.widget.RecyclerView$e r12 = r12.getAdapter()
                boolean r13 = r12 instanceof eg1.C58589p
                java.lang.String r14 = "selectItemView:"
                if (r13 != 0) goto L_0x00ab
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r2)
                java.lang.String r3 = " liveAdapter cast err!"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x01ec
            L_0x00ab:
                eg1.p r12 = (eg1.C58589p) r12
                al1.h r12 = r12.mo83488O4(r2)
                if (r12 != 0) goto L_0x00cc
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r2)
                java.lang.String r3 = " data is empty!"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x01ec
            L_0x00cc:
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r13 = r10.f159221r
                if (r13 == 0) goto L_0x00d5
                android.view.View r13 = r13.findViewByPosition(r2)
                goto L_0x00d6
            L_0x00d5:
                r13 = 0
            L_0x00d6:
                if (r13 != 0) goto L_0x00f1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r2)
                java.lang.String r3 = " layout manager child is empty!"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x01ec
            L_0x00f1:
                r15 = 2131304410(0x7f091fda, float:1.8226962E38)
                android.view.View r13 = r13.findViewById(r15)
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r13 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r13
                if (r13 != 0) goto L_0x0115
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r2)
                java.lang.String r3 = " pluginLayout is null!"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x01ec
            L_0x0115:
                rx3.g r15 = r10.f159225v
                rx3.n r15 = (rx3.C36570n) r15
                java.lang.Object r15 = r15.getValue()
                ll1.a r15 = (ll1.C61304a) r15
                r13.setConfettiBitmapManager(r15)
                bl3.r r15 = bl3.C39818r.f106831a
                com.tencent.mm.view.RefreshLoadMoreLayout r7 = r10.f159210d
                android.content.Context r7 = r7.getContext()
                java.lang.String r8 = "rfLayout.context"
                gy3.C87412m.m108593f(r7, r8)
                bl3.r$a r7 = r15.mo62443b(r7)
                androidx.lifecycle.i0 r7 = r7.mo75002a(r11)
                java.lang.String r8 = "UICProvider.of(rfLayout.…veSideBarUIC::class.java)"
                gy3.C87412m.m108593f(r7, r8)
                dk1.g r7 = (dk1.C58312g) r7
                boolean r8 = r13.isLandscape()
                if (r8 == 0) goto L_0x0147
                r7.mo83062d3()
            L_0x0147:
                eg1.k0 r7 = r10.f159223t
                r7.getClass()
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r8 = r7.f167728e
                if (r8 == 0) goto L_0x0161
                al1.h r8 = r8.getData()
                if (r8 == 0) goto L_0x0161
                com.tencent.mm.live.api.LiveConfig r8 = r8.f151977d
                if (r8 == 0) goto L_0x0161
                long r5 = r8.f157064e
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L_0x0162
            L_0x0161:
                r5 = 0
            L_0x0162:
                com.tencent.mm.live.api.LiveConfig r6 = r12.f151977d
                if (r6 == 0) goto L_0x016f
                r23 = r10
                long r9 = r6.f157064e
                java.lang.Long r6 = java.lang.Long.valueOf(r9)
                goto L_0x0172
            L_0x016f:
                r23 = r10
                r6 = 0
            L_0x0172:
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                if (r5 == 0) goto L_0x018a
                int r5 = r13.hashCode()
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r6 = r7.f167728e
                if (r6 == 0) goto L_0x0185
                int r6 = r6.hashCode()
                goto L_0x0186
            L_0x0185:
                r6 = 0
            L_0x0186:
                if (r5 != r6) goto L_0x018a
                r5 = 1
                goto L_0x018b
            L_0x018a:
                r5 = 0
            L_0x018b:
                if (r5 == 0) goto L_0x01f0
                if (r3 != 0) goto L_0x01f0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r2)
                java.lang.String r3 = " update the same item!"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                r5 = r23
                eg1.k0 r0 = r5.f159223t
                r0.getClass()
                r0.f167728e = r13
                r0.f167729f = r2
                java.lang.String r3 = r0.f167726c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "updateRecord,pos:"
                r6.append(r7)
                int r7 = r0.f167729f
                r6.append(r7)
                java.lang.String r7 = ", plugin:"
                r6.append(r7)
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = r0.f167728e
                if (r0 == 0) goto L_0x01d1
                int r9 = r0.hashCode()
                goto L_0x01d2
            L_0x01d1:
                r9 = 0
            L_0x01d2:
                r6.append(r9)
                java.lang.String r0 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                eg1.u r0 = r5.f159214h
                if (r0 == 0) goto L_0x01e5
                al1.i r0 = r0.mo77493G0()
                goto L_0x01e6
            L_0x01e5:
                r0 = 0
            L_0x01e6:
                if (r0 != 0) goto L_0x01e9
                goto L_0x01ec
            L_0x01e9:
                r0.mo74928f(r2)
            L_0x01ec:
                r3 = r1
                r1 = r4
                goto L_0x0a1b
            L_0x01f0:
                r5 = r23
                androidx.fragment.app.Fragment r6 = r5.f159213g
                r7 = -1
                if (r6 == 0) goto L_0x02b1
                bl3.r$a r9 = r15.mo62445d(r6)
                java.lang.Class<zk1.v0> r10 = zk1.C16285v0.class
                androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
                zk1.v0 r9 = (zk1.C16285v0) r9
                r9.getClass()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r8 = "selectItemView cur: "
                r10.append(r8)
                int r8 = r9.f43582e
                r10.append(r8)
                java.lang.String r8 = " newPos "
                r10.append(r8)
                r10.append(r2)
                java.lang.String r8 = " isFromRed: "
                r10.append(r8)
                boolean r8 = r9.f43583f
                r10.append(r8)
                java.lang.String r8 = " isEnableRecom: "
                r10.append(r8)
                boolean r8 = r9.f43584g
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                java.lang.String r10 = "FinderLiveWatchCountDownUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
                int r8 = r9.f43582e
                if (r8 != r7) goto L_0x0240
                r9.f43582e = r2
            L_0x0240:
                int r8 = r9.f43582e
                if (r8 == r2) goto L_0x0268
                r8 = 0
                r9.f43584g = r8
                java.lang.Runnable r10 = r9.f43586i
                o40.C61926c.m72698w(r10)
                boolean r10 = r9.f43583f
                if (r10 == 0) goto L_0x0268
                com.tencent.mm.live.api.LiveConfig r10 = r12.f151977d
                long r7 = r10.f157075s
                zk1.C16285v0.f43578j = r7
                int r7 = r9.f43585h
                if (r7 == 0) goto L_0x0268
                boolean r8 = r9.f43584g
                if (r8 == 0) goto L_0x0268
                long r7 = (long) r7
                r18 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r18
                java.lang.Runnable r9 = r9.f43586i
                o40.C61926c.m72667L(r7, r9)
            L_0x0268:
                bl3.r$a r6 = r15.mo62445d(r6)
                java.lang.Class<zk1.o0> r7 = zk1.C66878o0.class
                androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
                zk1.o0 r6 = (zk1.C66878o0) r6
                r6.getClass()
                int r7 = r6.f192123e
                r8 = -1
                if (r7 != r8) goto L_0x027e
                r6.f192123e = r2
            L_0x027e:
                int r7 = r6.f192123e
                if (r7 != r2) goto L_0x0284
                r7 = 1
                goto L_0x0285
            L_0x0284:
                r7 = 0
            L_0x0285:
                r6.f192124f = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "selectItemView isCurrentItem: "
                r7.append(r8)
                boolean r8 = r6.f192124f
                r7.append(r8)
                java.lang.String r8 = " currentItemIndex: "
                r7.append(r8)
                int r6 = r6.f192123e
                r7.append(r6)
                java.lang.String r6 = " pos: "
                r7.append(r6)
                r7.append(r2)
                java.lang.String r6 = r7.toString()
                java.lang.String r7 = "FinderLiveScrollSquareUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            L_0x02b1:
                int r6 = r5.f159224u
                int r6 = r2 - r6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "notifySelectItem oriPos: "
                r7.append(r8)
                r7.append(r2)
                java.lang.String r8 = " historySize: "
                r7.append(r8)
                int r8 = r5.f159224u
                r7.append(r8)
                java.lang.String r8 = " currentIndex: "
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                com.tencent.mm.ui.MMActivity r7 = r5.f159212f
                bl3.r$a r7 = r15.mo62444c(r7)
                bl3.c r7 = r7.mo62447c(r0)
                ht1.g4 r7 = (ht1.C60172g4) r7
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r8 = "slide_index"
                r7.mo12837C3(r8, r6)
                eg1.k0 r6 = r5.f159223t
                int r6 = r6.f167729f
                r7 = -1
                if (r6 != r7) goto L_0x02fc
                boolean r8 = r5.f159215i
                r6 = r8
                goto L_0x02fd
            L_0x02fc:
                r6 = 0
            L_0x02fd:
                if (r6 != 0) goto L_0x0326
                mr.q r7 = p204mr.C61570q.VISITOR_LIVE
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "liveId="
                r8.append(r9)
                com.tencent.mm.live.api.LiveConfig r9 = r12.f151977d
                long r9 = r9.f157064e
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                eg1.h0 r9 = new eg1.h0
                r9.<init>(r12)
                java.lang.Class<mr.i> r10 = p204mr.C61567i.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                mr.i r10 = (p204mr.C61567i) r10
                r10.mo86500Tw(r7, r8, r9)
            L_0x0326:
                android.view.View r7 = r5.f159211e
                android.content.Context r7 = r7.getContext()
                java.lang.String r9 = "liveContainer.context"
                gy3.C87412m.m108593f(r7, r9)
                bl3.r$a r7 = r15.mo62443b(r7)
                androidx.lifecycle.i0 r7 = r7.mo75002a(r11)
                dk1.g r7 = (dk1.C58312g) r7
                boolean r7 = r7.f166967e
                java.lang.String r10 = ", "
                if (r7 == 0) goto L_0x039c
                android.view.View r7 = r5.f159211e
                android.content.Context r7 = r7.getContext()
                gy3.C87412m.m108593f(r7, r9)
                bl3.r$a r7 = r15.mo62443b(r7)
                androidx.lifecycle.i0 r7 = r7.mo75002a(r11)
                dk1.g r7 = (dk1.C58312g) r7
                dk1.g$a r7 = r7.f166971i
                int r8 = r7.f166975d
                if (r2 != r8) goto L_0x035c
                r8 = 1
                goto L_0x035d
            L_0x035c:
                r8 = 0
            L_0x035d:
                r7.f166974c = r8
                r8 = -1
                r7.f166975d = r8
                int r8 = r7.f166976e
                if (r8 < 0) goto L_0x0367
                goto L_0x0368
            L_0x0367:
                r8 = 0
            L_0x0368:
                r7.f166977f = r8
                r7.f166976e = r2
                dk1.g r8 = dk1.C58312g.this
                java.lang.String r8 = r8.f166966d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r23 = r9
                dk1.g r9 = dk1.C58312g.this
                dk1.g$a r9 = r9.f166971i
                int r9 = r9.hashCode()
                r1.append(r9)
                java.lang.String r9 = "report checkJoinRoomMode: "
                r1.append(r9)
                boolean r9 = r7.f166974c
                r1.append(r9)
                r1.append(r10)
                int r7 = r7.f166976e
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                goto L_0x039e
            L_0x039c:
                r23 = r9
            L_0x039e:
                eg1.k0 r1 = r5.f159223t
                int r1 = r1.f167729f
                r7 = -1
                if (r1 != r7) goto L_0x03e8
                boolean r1 = r5.f159216j
                if (r1 == 0) goto L_0x03e8
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r1 = r5.f159220q
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x03b7
                int r8 = r1.getItemCount()
                r1 = 1
                goto L_0x03b9
            L_0x03b7:
                r1 = 1
                r8 = 0
            L_0x03b9:
                if (r8 <= r1) goto L_0x03d6
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r7 = r5.f159220q
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.getAdapter()
                boolean r8 = r7 instanceof eg1.C58589p
                if (r8 == 0) goto L_0x03c8
                eg1.p r7 = (eg1.C58589p) r7
                goto L_0x03c9
            L_0x03c8:
                r7 = 0
            L_0x03c9:
                if (r7 == 0) goto L_0x03d6
                al1.h r7 = r7.mo83488O4(r1)
                if (r7 == 0) goto L_0x03d6
                fj1.b r1 = r7.f151978e
                if (r1 == 0) goto L_0x03d6
                goto L_0x03d7
            L_0x03d6:
                r1 = 0
            L_0x03d7:
                eg1.i0 r7 = new eg1.i0
                r7.<init>(r5)
                r8 = 500(0x1f4, double:2.47E-321)
                r13.postDelayed(r7, r8)
                java.lang.String r7 = "start autoscroll to next live"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                goto L_0x03e9
            L_0x03e8:
                r1 = 0
            L_0x03e9:
                eg1.u r7 = r5.f159214h
                if (r7 == 0) goto L_0x03f2
                al1.i r7 = r7.mo77493G0()
                goto L_0x03f3
            L_0x03f2:
                r7 = 0
            L_0x03f3:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r14)
                r9.append(r2)
                java.lang.String r8 = " fromFloat:"
                r9.append(r8)
                r9.append(r6)
                java.lang.String r8 = ", fromPageSelected:"
                r9.append(r8)
                r8 = 0
                r9.append(r8)
                java.lang.String r14 = ", liveData is empty:"
                r9.append(r14)
                if (r7 != 0) goto L_0x0418
                r14 = 1
                goto L_0x0419
            L_0x0418:
                r14 = 0
            L_0x0419:
                r9.append(r14)
                java.lang.String r14 = ",forceUpdate:"
                r9.append(r14)
                r9.append(r3)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
                eg1.k0 r9 = r5.f159223t
                r9.getClass()
                java.lang.String r14 = r9.f167726c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r24 = r4
                java.lang.String r4 = "before update plugins,activate:["
                r8.append(r4)
                int r4 = r9.f167729f
                r8.append(r4)
                r4 = 45
                r8.append(r4)
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r4 = r9.f167728e
                if (r4 == 0) goto L_0x0451
                int r4 = r4.hashCode()
                goto L_0x0452
            L_0x0451:
                r4 = 0
            L_0x0452:
                r8.append(r4)
                java.lang.String r4 = "],toActivate:["
                r8.append(r4)
                r8.append(r2)
                r4 = 45
                r8.append(r4)
                int r4 = r13.hashCode()
                r8.append(r4)
                java.lang.String r4 = "] released:"
                r8.append(r4)
                boolean r4 = r9.f167727d
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                boolean r4 = r9.f167727d
                if (r4 == 0) goto L_0x048e
                p50.a$a r0 = p50.C62193a.f176816k1
                r0.mo87260a()
                r27 = r1
                r26 = r5
                r34 = r7
                r25 = r10
                r4 = r11
                goto L_0x080f
            L_0x048e:
                er1.g5 r25 = er1.C58730g5.f168158a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r14 = "RV_VISITOR_"
                r4.append(r14)
                al1.h r8 = r13.getData()
                com.tencent.mm.live.api.LiveConfig r8 = r8.f151977d
                r34 = r7
                long r7 = r8.f157064e
                r4.append(r7)
                java.lang.String r26 = r4.toString()
                er1.e5$c r4 = er1.C58713e5.f168077e
                java.lang.String r4 = r4.f168101b
                r28 = 0
                r29 = r6 ^ 1
                r30 = 0
                r31 = 0
                r32 = 52
                r33 = 0
                r27 = r4
                er1.C58730g5.m68220e(r25, r26, r27, r28, r29, r30, r31, r32, r33)
                android.content.Context r4 = r13.getContext()
                java.lang.String r7 = "newPlugin.context"
                gy3.C87412m.m108593f(r4, r7)
                java.lang.Class<kq.g> r7 = p185kq.C61130g.class
                java.lang.Class<ak1.o> r8 = ak1.C54108o.class
                if (r6 != 0) goto L_0x05ee
                di3.d r17 = di3.C86312j.m106911c(r8)
                ak1.o r17 = (ak1.C54108o) r17
                r17.getClass()
                r25 = r10
                ak1.f0 r10 = ak1.C54108o.f151869h
                r26 = r5
                boolean r5 = r10.f151449c
                if (r5 != 0) goto L_0x05e7
                di3.d r5 = di3.C86312j.m106911c(r8)
                ak1.o r5 = (ak1.C54108o) r5
                r5.getClass()
                com.tencent.mm.live.api.LiveConfig r5 = r12.f151977d
                if (r5 == 0) goto L_0x04f7
                java.lang.String r5 = r5.f157046D
                if (r5 != 0) goto L_0x04f4
                goto L_0x04f7
            L_0x04f4:
                r27 = r1
                goto L_0x0512
            L_0x04f7:
                fj1.b r5 = r12.f151978e
                r27 = r1
                if (r5 == 0) goto L_0x050d
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r5.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
                if (r1 == 0) goto L_0x050d
                java.lang.String r1 = r1.sessionBuffer
                r5 = r1
                goto L_0x050e
            L_0x050d:
                r5 = 0
            L_0x050e:
                if (r5 != 0) goto L_0x0512
                java.lang.String r5 = ""
            L_0x0512:
                r10.f151423E = r5
                di3.d r1 = di3.C86312j.m106911c(r7)
                kq.g r1 = (p185kq.C61130g) r1
                java.lang.String r5 = "temp_2"
                r1.mo33246ry(r5)
                di3.d r1 = di3.C86312j.m106911c(r8)
                ak1.o r1 = (ak1.C54108o) r1
                r1.getClass()
                r10.f151445a = r5
                al1.h$a r1 = al1.C54127h.f151976n
                te3.c21 r5 = r1.mo74921a(r12)
                r28 = r6
                long r5 = r5.f182392d
                r29 = r14
                java.lang.String r14 = r9.f167726c
                r30 = r11
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r31 = r3
                java.lang.String r3 = "set live_scroll  true  !!! liveId : "
                r11.append(r3)
                r11.append(r5)
                java.lang.String r3 = " pos "
                r11.append(r3)
                r11.append(r2)
                java.lang.String r3 = "  "
                r11.append(r3)
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.mo74922b(r12)
                java.lang.String r1 = r1.nickname
                r11.append(r1)
                java.lang.String r1 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
                di3.d r1 = di3.C86312j.m106911c(r7)
                kq.g r1 = (p185kq.C61130g) r1
                r3 = 1
                r1.mo33239Aj(r5, r3)
                di3.d r1 = di3.C86312j.m106911c(r8)
                ak1.o r1 = (ak1.C54108o) r1
                r1.getClass()
                long r5 = (long) r2
                r10.f151447b = r5
                bl3.r$a r1 = r15.mo62443b(r4)     // Catch:{ all -> 0x05ce }
                bl3.c r1 = r1.mo62447c(r0)     // Catch:{ all -> 0x05ce }
                ht1.g4 r1 = (ht1.C60172g4) r1     // Catch:{ all -> 0x05ce }
                java.lang.String r17 = r1.mo12868z3()     // Catch:{ all -> 0x05ce }
                java.lang.String r18 = ";"
                java.lang.String r19 = ","
                r20 = 0
                r21 = 4
                r22 = 0
                java.lang.String r1 = z04.C112551y.m153816p(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x05ce }
                c30.g r3 = new c30.g     // Catch:{ all -> 0x05ce }
                r3.<init>((java.lang.String) r1)     // Catch:{ all -> 0x05ce }
                java.lang.String r1 = "card_style"
                r3.remove(r1)     // Catch:{ all -> 0x05ce }
                java.lang.String r1 = "click_timing"
                r3.remove(r1)     // Catch:{ all -> 0x05ce }
                java.lang.String r1 = "my_follow_fold"
                r3.remove(r1)     // Catch:{ all -> 0x05ce }
                bl3.r$a r1 = r15.mo62443b(r4)     // Catch:{ all -> 0x05ce }
                bl3.c r0 = r1.mo62447c(r0)     // Catch:{ all -> 0x05ce }
                ht1.g4 r0 = (ht1.C60172g4) r0     // Catch:{ all -> 0x05ce }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x05ce }
                java.lang.String r3 = "chnlExtraObj.toString()"
                gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x05ce }
                java.lang.String r3 = ","
                java.lang.String r4 = ";"
                r5 = 0
                java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r5)     // Catch:{ all -> 0x05ce }
                r0.mo12865u3(r1)     // Catch:{ all -> 0x05ce }
                goto L_0x060e
            L_0x05ce:
                r0 = move-exception
                java.lang.String r1 = r9.f167726c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "setReportParams e:"
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                goto L_0x060e
            L_0x05e7:
                r27 = r1
                r31 = r3
                r28 = r6
                goto L_0x05f8
            L_0x05ee:
                r27 = r1
                r31 = r3
                r26 = r5
                r28 = r6
                r25 = r10
            L_0x05f8:
                r30 = r11
                r29 = r14
                al1.h$a r0 = al1.C54127h.f151976n
                te3.c21 r0 = r0.mo74921a(r12)
                long r0 = r0.f182392d
                di3.d r3 = di3.C86312j.m106911c(r7)
                kq.g r3 = (p185kq.C61130g) r3
                r4 = 0
                r3.mo33239Aj(r0, r4)
            L_0x060e:
                int r1 = r9.f167729f
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = r9.f167728e
                java.lang.String r3 = r9.f167726c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "deactivate plugin pos:"
                r4.append(r5)
                int r5 = r9.f167729f
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                if (r0 == 0) goto L_0x064f
                r3 = 0
                r0.reset(r3)
                r0.unMount()
                android.view.ViewParent r0 = r0.getParent()
                boolean r3 = r0 instanceof com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout
                if (r3 == 0) goto L_0x063e
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r0
                goto L_0x063f
            L_0x063e:
                r0 = 0
            L_0x063f:
                if (r0 == 0) goto L_0x064f
                android.content.Context r3 = r0.getContext()
                r4 = 8
                int r3 = kg3.C76577a.m92151b(r3, r4)
                float r3 = (float) r3
                r0.setRadius(r3)
            L_0x064f:
                java.lang.String r0 = r9.f167726c
                java.lang.String r3 = "after deactivate plugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = r9.f167728e
                if (r0 == 0) goto L_0x0735
                al1.h r3 = r0.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r3 = r3.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r3 = r3.f157049G     // Catch:{ Exception -> 0x071c }
                al1.h r4 = r0.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r4 = r4.f157052J     // Catch:{ Exception -> 0x071c }
                al1.h r5 = r0.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r5 = r5.f151977d     // Catch:{ Exception -> 0x071c }
                int r5 = r5.f157051I     // Catch:{ Exception -> 0x071c }
                if (r3 == 0) goto L_0x067d
                int r6 = r3.length()     // Catch:{ Exception -> 0x071c }
                if (r6 != 0) goto L_0x067b
                goto L_0x067d
            L_0x067b:
                r6 = 0
                goto L_0x067e
            L_0x067d:
                r6 = 1
            L_0x067e:
                if (r6 == 0) goto L_0x068e
                if (r4 == 0) goto L_0x068b
                int r6 = r4.length()     // Catch:{ Exception -> 0x071c }
                if (r6 != 0) goto L_0x0689
                goto L_0x068b
            L_0x0689:
                r6 = 0
                goto L_0x068c
            L_0x068b:
                r6 = 1
            L_0x068c:
                if (r6 != 0) goto L_0x0735
            L_0x068e:
                java.lang.String r6 = r9.f167726c     // Catch:{ Exception -> 0x071c }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071c }
                r7.<init>()     // Catch:{ Exception -> 0x071c }
                java.lang.String r10 = "passInfoBetweenLive:"
                r7.append(r10)     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r0.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = r0.f157076t     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                r0 = 126(0x7e, float:1.77E-43)
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = r0.f157076t     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = ",old username:["
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = r0.f157049G     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                r0 = 58
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                al1.h r10 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r10 = r10.f151977d     // Catch:{ Exception -> 0x071c }
                java.lang.String r10 = r10.f157052J     // Catch:{ Exception -> 0x071c }
                r7.append(r10)     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                al1.h r10 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r10 = r10.f151977d     // Catch:{ Exception -> 0x071c }
                int r10 = r10.f157050H     // Catch:{ Exception -> 0x071c }
                r7.append(r10)     // Catch:{ Exception -> 0x071c }
                java.lang.String r10 = "],new username info:["
                r7.append(r10)     // Catch:{ Exception -> 0x071c }
                r7.append(r3)     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                r7.append(r4)     // Catch:{ Exception -> 0x071c }
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                r7.append(r5)     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = "]!"
                r7.append(r0)     // Catch:{ Exception -> 0x071c }
                java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x071c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                r0.f157049G = r3     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                r0.f157052J = r4     // Catch:{ Exception -> 0x071c }
                al1.h r0 = r13.getData()     // Catch:{ Exception -> 0x071c }
                com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d     // Catch:{ Exception -> 0x071c }
                r0.f157051I = r5     // Catch:{ Exception -> 0x071c }
                goto L_0x0735
            L_0x071c:
                r0 = move-exception
                er1.j4 r3 = er1.C58739j4.f168176a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r9.f167726c
                r4.append(r5)
                java.lang.String r5 = "-passInfoBetweenPlugin"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.mo83712h0(r0, r4)
            L_0x0735:
                r9.f167728e = r13
                r9.f167729f = r2
                java.lang.String r0 = r9.f167726c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "activate plugin pos:"
                r3.append(r4)
                int r4 = r9.f167729f
                r3.append(r4)
                java.lang.String r4 = " data:"
                r3.append(r4)
                java.lang.String r4 = r12.mo74919c()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                fj1.b r16 = r15.mo77622Y(r12)
                if (r16 == 0) goto L_0x07b0
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r12.f151979f
                r19 = 0
                te3.hj1 r3 = r9.f167725b
                r21 = 8
                r22 = 0
                r17 = r0
                r18 = r13
                r20 = r3
                com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63770d(r15, r16, r17, r18, r19, r20, r21, r22)
                r4 = r28
                r3 = r31
                r13.activate(r12, r4, r3)
                r13.mount()
                bl3.r r0 = bl3.C39818r.f106831a
                android.content.Context r4 = r13.getContext()
                java.lang.String r5 = "plugin.context"
                gy3.C87412m.m108593f(r4, r5)
                bl3.r$a r0 = r0.mo62443b(r4)
                r4 = r30
                androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
                dk1.g r0 = (dk1.C58312g) r0
                boolean r0 = r0.f166967e
                if (r0 != 0) goto L_0x07b4
                android.view.ViewParent r0 = r13.getParent()
                boolean r5 = r0 instanceof com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout
                if (r5 == 0) goto L_0x07a8
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r0
                goto L_0x07a9
            L_0x07a8:
                r0 = 0
            L_0x07a9:
                if (r0 == 0) goto L_0x07b4
                r5 = 0
                r0.setRadius(r5)
                goto L_0x07b4
            L_0x07b0:
                r4 = r30
                r3 = r31
            L_0x07b4:
                java.lang.String r0 = r9.f167726c
                java.lang.String r5 = "after activate plugin!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                zt3.t r0 = zt3.C119157j.f356862d
                eg1.j0 r5 = new eg1.j0
                r5.<init>(r9, r1, r2, r12)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r5)
                er1.g5 r14 = er1.C58730g5.f168158a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r29
                r0.append(r1)
                al1.h r1 = r13.getData()
                com.tencent.mm.live.api.LiveConfig r1 = r1.f151977d
                long r5 = r1.f157064e
                r0.append(r5)
                java.lang.String r15 = r0.toString()
                er1.e5$c r0 = er1.C58713e5.f168079g
                java.lang.String r0 = r0.f168101b
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 60
                r22 = 0
                r16 = r0
                er1.C58730g5.m68220e(r14, r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.String r0 = r9.f167726c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "after update plugins,pos:"
                r1.append(r5)
                int r5 = r9.f167729f
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x080f:
                if (r34 != 0) goto L_0x0814
                r7 = r34
                goto L_0x0819
            L_0x0814:
                r7 = r34
                r7.mo74928f(r2)
            L_0x0819:
                if (r27 != 0) goto L_0x0823
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r0.getClass()
                fj1.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                goto L_0x0825
            L_0x0823:
                r1 = r27
            L_0x0825:
                bl3.r r0 = bl3.C39818r.f106831a
                r5 = r26
                android.view.View r6 = r5.f159211e
                android.content.Context r6 = r6.getContext()
                r9 = r23
                gy3.C87412m.m108593f(r6, r9)
                bl3.r$a r6 = r0.mo62443b(r6)
                java.lang.Class<zk1.r0> r10 = zk1.C66879r0.class
                bl3.t r6 = r6.mo62449e(r10)
                zk1.r0 r6 = (zk1.C66879r0) r6
                if (r6 == 0) goto L_0x0878
                java.lang.String r10 = r6.f192128d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "canPrefetch "
                r11.append(r13)
                int r13 = r6.mo90873d3()
                r11.append(r13)
                r13 = r25
                r11.append(r13)
                boolean r13 = r6.f192131g
                r11.append(r13)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
                int r10 = r6.mo90873d3()
                if (r10 == 0) goto L_0x0873
                boolean r6 = r6.f192131g
                if (r6 != 0) goto L_0x0871
                goto L_0x0873
            L_0x0871:
                r6 = 0
                goto L_0x0874
            L_0x0873:
                r6 = 1
            L_0x0874:
                if (r6 != 0) goto L_0x0878
                r6 = 1
                goto L_0x0879
            L_0x0878:
                r6 = 0
            L_0x0879:
                if (r6 != 0) goto L_0x08aa
                eg1.u r6 = r5.f159214h
                if (r6 == 0) goto L_0x0895
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r10 = r5.f159220q
                androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
                if (r10 == 0) goto L_0x088c
                int r10 = r10.getItemCount()
                goto L_0x088d
            L_0x088c:
                r10 = 0
            L_0x088d:
                boolean r1 = r6.mo77496b1(r2, r10, r1)
                if (r1 != 0) goto L_0x0895
                r1 = 1
                goto L_0x0896
            L_0x0895:
                r1 = 0
            L_0x0896:
                if (r1 == 0) goto L_0x08aa
                if (r7 == 0) goto L_0x08a5
                java.util.ArrayList<al1.h> r1 = r7.f151990e
                if (r1 == 0) goto L_0x08a5
                int r1 = r1.size()
                r8 = r1
                r1 = 0
                goto L_0x08a7
            L_0x08a5:
                r1 = 0
                r8 = 0
            L_0x08a7:
                r5.mo77516H0(r8, r1)
            L_0x08aa:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                com.tencent.mm.plugin.finder.live.view.j1 r6 = r5.f159200B
                if (r6 == 0) goto L_0x0a72
                r1.getClass()
                com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159385p = r6
                fj1.b r1 = fj1.C45795b.f123698n
                if (r1 == 0) goto L_0x0936
                java.lang.Class<cl1.u> r7 = cl1.C55001u.class
                androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
                cl1.u r1 = (cl1.C55001u) r1
                java.util.HashMap<java.lang.Long, te3.v41> r7 = r6.f159903b
                te3.c21 r10 = r1.f154420q
                long r10 = r10.f182392d
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                java.lang.Object r7 = r7.get(r10)
                te3.v41 r7 = (te3.C64766v41) r7
                if (r7 != 0) goto L_0x08d8
                te3.v41 r7 = new te3.v41
                r7.<init>()
            L_0x08d8:
                java.lang.String r7 = r7.f185828d
                if (r7 == 0) goto L_0x08e5
                int r7 = r7.length()
                if (r7 != 0) goto L_0x08e3
                goto L_0x08e5
            L_0x08e3:
                r7 = 0
                goto L_0x08e6
            L_0x08e5:
                r7 = 1
            L_0x08e6:
                if (r7 == 0) goto L_0x0912
                rx3.g r1 = r6.f159904c
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                com.tencent.mm.sdk.platformtools.MMHandler r1 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r1
                r7 = 3
                r1.removeMessages(r7)
                rx3.g r1 = r6.f159904c
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                com.tencent.mm.sdk.platformtools.MMHandler r1 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r1
                rx3.g<java.lang.Long> r6 = com.tencent.p014mm.plugin.finder.live.view.C56072j1.f159901d
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                java.lang.Number r6 = (java.lang.Number) r6
                long r10 = r6.longValue()
                r1.sendEmptyMessageDelayed(r7, r10)
                goto L_0x0936
            L_0x0912:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "checkAddToHistory: has added, liveId = "
                r6.append(r7)
                te3.c21 r7 = r1.f154420q
                long r10 = r7.f182392d
                r6.append(r10)
                java.lang.String r7 = ", objectId = "
                r6.append(r7)
                long r10 = r1.f154416j
                r6.append(r10)
                java.lang.String r1 = r6.toString()
                java.lang.String r6 = "FinderLiveMultiTaskManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            L_0x0936:
                android.view.View r1 = r5.f159211e
                android.content.Context r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r9)
                bl3.r$a r1 = r0.mo62443b(r1)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
                dk1.g r1 = (dk1.C58312g) r1
                boolean r1 = r1.f166967e
                if (r1 == 0) goto L_0x0967
                android.view.View r1 = r5.f159211e
                android.content.Context r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r9)
                bl3.r$a r1 = r0.mo62443b(r1)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
                dk1.g r1 = (dk1.C58312g) r1
                com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r1 = r1.f166968f
                if (r1 == 0) goto L_0x0967
                r1.mo77739f(r2)
            L_0x0967:
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r1 = r5.f159220q
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                boolean r6 = r1 instanceof eg1.C58589p
                if (r6 == 0) goto L_0x0974
                eg1.p r1 = (eg1.C58589p) r1
                goto L_0x0975
            L_0x0974:
                r1 = 0
            L_0x0975:
                if (r1 == 0) goto L_0x0993
                eg1.k0 r6 = r5.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r6 = r6.f167728e
                android.view.View r7 = r5.f159211e
                android.content.Context r7 = r7.getContext()
                gy3.C87412m.m108593f(r7, r9)
                bl3.r$a r0 = r0.mo62443b(r7)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
                dk1.g r0 = (dk1.C58312g) r0
                boolean r0 = r0.f166967e
                r1.mo83487G4(r6, r0)
            L_0x0993:
                eg1.u r0 = r5.f159214h
                if (r0 == 0) goto L_0x09a4
                al1.i r0 = r0.mo77493G0()
                if (r0 == 0) goto L_0x09a4
                java.util.ArrayList<al1.h> r0 = r0.f151989d
                boolean r0 = r0.contains(r12)
                goto L_0x09a5
            L_0x09a4:
                r0 = 1
            L_0x09a5:
                al1.p r1 = al1.C54134p.f152045a
                r1.mo74957a(r12, r0)
                com.tencent.mm.live.api.LiveConfig r1 = r12.f151977d
                long r6 = r1.f157064e
                long r9 = r5.f159209K
                int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r1 != 0) goto L_0x09b5
                goto L_0x09e3
            L_0x09b5:
                r5.f159209K = r6
                if (r0 != 0) goto L_0x09ba
                goto L_0x09e3
            L_0x09ba:
                eg1.u r0 = r5.f159214h
                if (r0 == 0) goto L_0x09e3
                al1.i r0 = r0.mo77493G0()
                if (r0 == 0) goto L_0x09e3
                java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                r13 = r1
                ak1.w r13 = (ak1.C54116w) r13
                ak1.f0$s r14 = ak1.C54067f0.C54082s.InHistory
                com.tencent.mm.live.api.LiveConfig r1 = r12.f151977d
                long r4 = r1.f157064e
                long r6 = r1.f157075s
                java.util.ArrayList<al1.h> r0 = r0.f151989d
                int r0 = r0.size()
                int r19 = r0 - r2
                r15 = r4
                r17 = r6
                r13.jy0(r14, r15, r17, r19)
            L_0x09e3:
                r1 = 1
                r12.f151982i = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "#selectItemView pos="
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " fromPageSelected="
                r0.append(r1)
                r1 = 0
                r0.append(r1)
                java.lang.String r1 = " forceUpdate="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " itemData="
                r0.append(r1)
                com.tencent.mm.live.api.LiveConfig r1 = r12.f151977d
                java.lang.String r1 = r1.f157053K
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = r24
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r3 = r35
            L_0x0a1b:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r3.f159232d
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r4 = r0.f159220q
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
                boolean r5 = r4 instanceof eg1.C58589p
                if (r5 == 0) goto L_0x0a2a
                eg1.p r4 = (eg1.C58589p) r4
                goto L_0x0a2b
            L_0x0a2a:
                r4 = 0
            L_0x0a2b:
                if (r4 == 0) goto L_0x0a3a
                al1.h r2 = r4.mo83488O4(r2)
                if (r2 == 0) goto L_0x0a3a
                com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
                if (r2 == 0) goto L_0x0a3a
                long r7 = r2.f157064e
                goto L_0x0a3c
            L_0x0a3a:
                r7 = 0
            L_0x0a3c:
                java.lang.String r2 = o40.C61926c.m72691p(r7)
                zt3.t r4 = zt3.C119157j.f356862d
                eg1.e0 r5 = new eg1.e0
                r5.<init>(r0, r7, r2)
                zt3.j r4 = (zt3.C119157j) r4
                r4.mo183876g(r5, r1)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r3.f159232d
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r0 = r0.f159220q
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                boolean r1 = r0 instanceof eg1.C58589p
                if (r1 == 0) goto L_0x0a5c
                r6 = r0
                eg1.p r6 = (eg1.C58589p) r6
                goto L_0x0a5d
            L_0x0a5c:
                r6 = 0
            L_0x0a5d:
                if (r6 == 0) goto L_0x0a7c
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r0 = r3.f159233e
                android.content.Context r0 = r0.f159777v
                java.lang.String r1 = "context"
                gy3.C87412m.m108594g(r0, r1)
                eg1.r r1 = new eg1.r
                r2 = 1
                r1.<init>(r6, r2, r0)
                o40.C61926c.m72668M(r1)
                goto L_0x0a7c
            L_0x0a72:
                r3 = r35
                java.lang.String r0 = "multiTaskManager"
                gy3.C87412m.m108603p(r0)
                r1 = 0
                throw r1
            L_0x0a7b:
                r3 = r1
            L_0x0a7c:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.C55880c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$d */
    public static final class C55881d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55881d(FinderLiveViewCallback finderLiveViewCallback) {
            super(0);
            this.f159234d = finderLiveViewCallback;
        }

        public Object invoke() {
            C54127h O4;
            LiveConfig liveConfig;
            FinderLiveViewCallback finderLiveViewCallback = this.f159234d;
            boolean z = false;
            if (!finderLiveViewCallback.f159208J) {
                FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f159221r;
                int i = -1;
                int C = finderLiveLayoutManager != null ? finderLiveLayoutManager.mo16957C() : -1;
                FinderLiveLayoutManager finderLiveLayoutManager2 = this.f159234d.f159221r;
                if (finderLiveLayoutManager2 != null) {
                    i = finderLiveLayoutManager2.mo16959E();
                }
                Log.m105924i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + C + " lastVisiblePos:" + i);
                if (C == i) {
                    RecyclerView.C16613e adapter = this.f159234d.f159220q.getAdapter();
                    C58589p pVar = adapter instanceof C58589p ? (C58589p) adapter : null;
                    long j = (pVar == null || (O4 = pVar.mo83488O4(C)) == null || (liveConfig = O4.f151977d) == null) ? 0 : liveConfig.f157064e;
                    Log.m105924i("Finder.FinderLiveViewCallback", "onItemChecked curLiveId:" + j + " selectedLiveId:" + this.f159234d.f159207I);
                    if (j != 0) {
                        FinderLiveViewCallback finderLiveViewCallback2 = this.f159234d;
                        if (j != finderLiveViewCallback2.f159207I) {
                            finderLiveViewCallback2.f159207I = j;
                            z = true;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$e */
    public static final class C55882e extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.left = 0;
            rect.right = 0;
            rect.top = 0;
            int i = FinderLiveLayoutManager.f159772E;
            rect.bottom = FinderLiveLayoutManager.f159772E;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$f */
    public static final class C55883f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159235d;

        public C55883f(FinderLiveViewCallback finderLiveViewCallback) {
            this.f159235d = finderLiveViewCallback;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Class cls = C58312g.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            Log.m105924i("Finder.FinderLiveViewCallback", "lxltest onScrollStateChanged:" + i);
            FinderLiveViewCallback finderLiveViewCallback = this.f159235d;
            if (finderLiveViewCallback.f159208J && i == 0) {
                finderLiveViewCallback.f159208J = false;
                FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f159221r;
                if (finderLiveLayoutManager != null) {
                    FinderLiveLayoutManager.m63990e0(finderLiveLayoutManager, true, false, 2, (Object) null);
                }
            }
            C39818r rVar = C39818r.f106831a;
            Context context = this.f159235d.f159211e.getContext();
            C87412m.m108593f(context, "liveContainer.context");
            if (((C58312g) rVar.mo62443b(context).mo75002a(cls)).f166967e) {
                if (i == 0) {
                    Context context2 = this.f159235d.f159211e.getContext();
                    C87412m.m108593f(context2, "liveContainer.context");
                    FinderLiveSideBar finderLiveSideBar = ((C58312g) rVar.mo62443b(context2).mo75002a(cls)).f166968f;
                    if (finderLiveSideBar != null) {
                        finderLiveSideBar.mo77740g(0);
                    }
                } else {
                    Context context3 = this.f159235d.f159211e.getContext();
                    C87412m.m108593f(context3, "liveContainer.context");
                    FinderLiveSideBar finderLiveSideBar2 = ((C58312g) rVar.mo62443b(context3).mo75002a(cls)).f166968f;
                    if (finderLiveSideBar2 != null) {
                        finderLiveSideBar2.mo77740g(8);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$g */
    public static final class C55884g implements FinderRecyclerView.C55692a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveViewCallback f159236a;

        /* renamed from: b */
        public final /* synthetic */ FinderLiveRecyclerView f159237b;

        public C55884g(FinderLiveViewCallback finderLiveViewCallback, FinderLiveRecyclerView finderLiveRecyclerView) {
            this.f159236a = finderLiveViewCallback;
            this.f159237b = finderLiveRecyclerView;
        }

        /* renamed from: e */
        public void mo77206e(RecyclerView recyclerView, int i) {
            C54127h O4;
            FinderLiveViewCallback finderLiveViewCallback;
            int i2;
            C87412m.m108594g(recyclerView, "recyclerView");
            FinderLiveViewCallback finderLiveViewCallback2 = this.f159236a;
            if (!finderLiveViewCallback2.f159208J) {
                if (i == 1) {
                    finderLiveViewCallback2.f159206H = true;
                    if (C32444a.f86078L1.mo60266n().intValue() == 1) {
                        C58358d0.f167122h = false;
                        C58358d0.C58359a aVar = C58358d0.f167118d;
                        if (aVar != null) {
                            aVar.f167129g = SystemClock.elapsedRealtime();
                        }
                        C58358d0.f167117c = 2;
                    }
                }
                if (i == 0) {
                    C62042e.f176370a.getClass();
                    if (C32444a.f86078L1.mo60266n().intValue() == 1) {
                        FinderLiveLayoutManager finderLiveLayoutManager = this.f159236a.f159221r;
                        int i3 = -1;
                        int C = finderLiveLayoutManager != null ? finderLiveLayoutManager.mo16957C() : -1;
                        FinderLiveLayoutManager finderLiveLayoutManager2 = this.f159236a.f159221r;
                        if (finderLiveLayoutManager2 != null) {
                            i3 = finderLiveLayoutManager2.mo16959E();
                        }
                        if (this.f159236a.f159203E) {
                            Log.m105924i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + C + " lastVisiblePos:" + i3 + " lastPlayPos: " + this.f159236a.f159202D);
                            if (C == i3 && C != (i2 = finderLiveViewCallback.f159202D)) {
                                FinderLiveViewCallback.m63695D((finderLiveViewCallback = this.f159236a), i2);
                            }
                        }
                        if (C == i3) {
                            RecyclerView.C16613e adapter = this.f159236a.f159220q.getAdapter();
                            if ((adapter instanceof C58589p) && (O4 = ((C58589p) adapter).mo83488O4(C)) != null) {
                                C62193a.C62194a aVar2 = C62193a.f176816k1;
                                long j = O4.f151977d.f157064e;
                                Set<Map.Entry<Long, C62193a>> entrySet = C62193a.f176817l1.entrySet();
                                C87412m.m108593f(entrySet, "instanceArray.entries");
                                int i4 = 0;
                                for (Map.Entry entry : entrySet) {
                                    if (((C62193a) entry.getValue()).f176822Y0.mo75229c()) {
                                        i4++;
                                        Long l = (Long) entry.getKey();
                                        if (l == null || l.longValue() != j) {
                                            ((C62193a) entry.getValue()).mo87256C0(false);
                                        }
                                    }
                                }
                                if (i4 > 1) {
                                    Log.m105924i("Finder.FinderLiveViewCallback", "playingCount more thran one playingCount:" + i4 + " liveId:" + O4.f151977d.f157064e);
                                    C11348f.C11349a.m11178b(C59319a.f169618b, "LivePlayingCountMoreThanOne", false, (C11348f.C11352b) null, false, false, new C7650g0(i4, O4), 28, (Object) null);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo77207f(RecyclerView recyclerView, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            if (!this.f159236a.f159208J) {
                Log.m105924i("Finder.FinderLiveViewCallback", "selectItemView onPageSelected position:" + i);
                C58358d0.m67593e(C58358d0.f167115a, false, this.f159236a.f159201C, 1, (Object) null);
                FinderLiveViewCallback finderLiveViewCallback = this.f159236a;
                finderLiveViewCallback.f159203E = false;
                finderLiveViewCallback.f159201C = false;
            }
        }

        /* renamed from: g */
        public void mo77208g(RecyclerView recyclerView, int i, float f, int i2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            FinderLiveViewCallback finderLiveViewCallback = this.f159236a;
            if (!finderLiveViewCallback.f159208J) {
                if (finderLiveViewCallback.f159212f.isFinishing()) {
                    Log.m105924i("Finder.FinderLiveViewCallback", "ViewCallback onPageScrolled return with activity finish");
                    return;
                }
                FinderLiveViewCallback finderLiveViewCallback2 = this.f159236a;
                FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback2.f159221r;
                if (finderLiveLayoutManager != null) {
                    FinderLiveRecyclerView finderLiveRecyclerView = this.f159237b;
                    int C = finderLiveLayoutManager.mo16957C();
                    int E = finderLiveLayoutManager.mo16959E();
                    C62042e.f176370a.getClass();
                    boolean z = false;
                    if (C32444a.f86078L1.mo60266n().intValue() == 1) {
                        if (FinderLiveViewCallback.f159198L == 0 || finderLiveViewCallback2.f159206H) {
                            z = true;
                        }
                        if (z && C != E) {
                            int i3 = finderLiveViewCallback2.f159204F;
                            if (C < i3) {
                                int i4 = finderLiveViewCallback2.f159205G;
                                if (E < i4) {
                                    FinderLiveViewCallback.m63695D(finderLiveViewCallback2, i4);
                                }
                                finderLiveViewCallback2.f159202D = C;
                                FinderLiveViewCallback.m63698y(finderLiveViewCallback2, C);
                            } else if (E > finderLiveViewCallback2.f159205G) {
                                if (C > i3) {
                                    FinderLiveViewCallback.m63695D(finderLiveViewCallback2, i3);
                                }
                                finderLiveViewCallback2.f159202D = E;
                                FinderLiveViewCallback.m63698y(finderLiveViewCallback2, E);
                            }
                        }
                    }
                    if (C != E && (C < finderLiveViewCallback2.f159204F || E > finderLiveViewCallback2.f159205G)) {
                        Log.m105924i("Finder.FinderLiveViewCallback", "notifyNewItemScroll firstVisiblePos:" + C + ",lastVisiblePos:" + E);
                        C39818r rVar = C39818r.f106831a;
                        Context context = finderLiveViewCallback2.f159211e.getContext();
                        C87412m.m108593f(context, "liveContainer.context");
                        if (!((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
                            float dimensionPixelOffset = (float) finderLiveRecyclerView.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
                            FinderLiveLayoutManager finderLiveLayoutManager2 = finderLiveViewCallback2.f159221r;
                            RoundedCornerFrameLayout roundedCornerFrameLayout = null;
                            View findViewByPosition = finderLiveLayoutManager2 != null ? finderLiveLayoutManager2.findViewByPosition(C) : null;
                            RoundedCornerFrameLayout roundedCornerFrameLayout2 = findViewByPosition instanceof RoundedCornerFrameLayout ? (RoundedCornerFrameLayout) findViewByPosition : null;
                            if (roundedCornerFrameLayout2 != null) {
                                roundedCornerFrameLayout2.mo153905b(0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset);
                            }
                            FinderLiveLayoutManager finderLiveLayoutManager3 = finderLiveViewCallback2.f159221r;
                            KeyEvent.Callback findViewByPosition2 = finderLiveLayoutManager3 != null ? finderLiveLayoutManager3.findViewByPosition(E) : null;
                            if (findViewByPosition2 instanceof RoundedCornerFrameLayout) {
                                roundedCornerFrameLayout = (RoundedCornerFrameLayout) findViewByPosition2;
                            }
                            if (roundedCornerFrameLayout != null) {
                                roundedCornerFrameLayout.mo153905b(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f);
                            }
                        }
                    }
                    finderLiveViewCallback2.f159204F = C;
                    finderLiveViewCallback2.f159205G = E;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h */
    public static final class C55885h implements FinderLiveSideBar.C55962a {

        /* renamed from: a */
        public final float f159238a;

        /* renamed from: b */
        public final float f159239b;

        /* renamed from: c */
        public final /* synthetic */ FinderLiveViewCallback f159240c;

        /* renamed from: d */
        public final /* synthetic */ FinderLiveSideBar f159241d;

        /* renamed from: e */
        public final /* synthetic */ C54129i f159242e;

        /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$a */
        public static final class C55886a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveViewCallback f159243d;

            /* renamed from: e */
            public final /* synthetic */ boolean f159244e;

            public C55886a(FinderLiveViewCallback finderLiveViewCallback, boolean z) {
                this.f159243d = finderLiveViewCallback;
                this.f159244e = z;
            }

            public final void run() {
                C58596u uVar = this.f159243d.f159214h;
                if (uVar != null) {
                    uVar.mo77510z(this.f159244e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$b */
        public static final class C55887b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveViewCallback f159245d;

            /* renamed from: e */
            public final /* synthetic */ boolean f159246e;

            public C55887b(FinderLiveViewCallback finderLiveViewCallback, boolean z) {
                this.f159245d = finderLiveViewCallback;
                this.f159246e = z;
            }

            public final void run() {
                C58596u uVar = this.f159245d.f159214h;
                if (uVar != null) {
                    uVar.mo77510z(this.f159246e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$c */
        public static final class C55888c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f159247d;

            /* renamed from: e */
            public final /* synthetic */ FinderLiveViewCallback f159248e;

            public C55888c(int i, FinderLiveViewCallback finderLiveViewCallback) {
                this.f159247d = i;
                this.f159248e = finderLiveViewCallback;
            }

            public final void run() {
                Log.m105924i("Finder.FinderLiveViewCallback", "lxltest onSelectLive step2 pos:" + this.f159247d);
                this.f159248e.mo77515G0(this.f159247d, -1);
            }
        }

        public C55885h(FrameLayout frameLayout, FinderLiveViewCallback finderLiveViewCallback, FinderLiveSideBar finderLiveSideBar, C54129i iVar) {
            this.f159240c = finderLiveViewCallback;
            this.f159241d = finderLiveSideBar;
            this.f159242e = iVar;
            this.f159238a = frameLayout.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
            this.f159239b = frameLayout.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        }

        /* renamed from: a */
        public void mo77526a(int i, int i2) {
            Log.m105924i("Finder.FinderLiveViewCallback", "lxltest onSelectLive fromPos:" + i2 + ", to:" + i);
            if (i >= 0 && i < this.f159242e.f151990e.size()) {
                if (!(i2 >= 0 && i2 < this.f159242e.f151990e.size()) || Math.abs(i2 - i) <= 1) {
                    Log.m105924i("Finder.FinderLiveViewCallback", "lxltest onSelectLive step3 pos:" + i);
                    this.f159240c.mo77515G0(i, -1);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("lxltest onSelectLive step1 pos:");
                    sb.append(i > i2 ? i - 1 : i + 1);
                    Log.m105924i("Finder.FinderLiveViewCallback", sb.toString());
                    FinderLiveViewCallback finderLiveViewCallback = this.f159240c;
                    finderLiveViewCallback.f159208J = true;
                    FinderLiveRecyclerView finderLiveRecyclerView = finderLiveViewCallback.f159220q;
                    int i3 = i > i2 ? i - 1 : i + 1;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i3));
                    FinderLiveRecyclerView finderLiveRecyclerView2 = finderLiveRecyclerView;
                    C117292a.m165358d(finderLiveRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                    finderLiveRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(finderLiveRecyclerView2, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                    FinderLiveViewCallback finderLiveViewCallback2 = this.f159240c;
                    finderLiveViewCallback2.f159220q.post(new C55888c(i, finderLiveViewCallback2));
                }
                C39818r rVar = C39818r.f106831a;
                Context context = this.f159240c.f159211e.getContext();
                C87412m.m108593f(context, "liveContainer.context");
                FinderLiveSideBar finderLiveSideBar = ((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166968f;
                if (finderLiveSideBar != null) {
                    finderLiveSideBar.mo77740g(8);
                }
            }
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [androidx.recyclerview.widget.RecyclerView$e] */
        /* JADX WARNING: type inference failed for: r0v16, types: [androidx.recyclerview.widget.RecyclerView$e] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo77527b(boolean r7) {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sidebar onDragFinished show:"
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderLiveViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                if (r7 != 0) goto L_0x0073
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r3 = r6.f159240c
                com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.f159210d
                r3.setCanRefresh(r0)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r6.f159240c
                eg1.k0 r0 = r0.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = r0.f167728e
                if (r0 == 0) goto L_0x002e
                r0.showFromSideBar()
            L_0x002e:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r6.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r0 = r0.f159220q
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                boolean r3 = r0 instanceof eg1.C58589p
                if (r3 == 0) goto L_0x003d
                eg1.p r0 = (eg1.C58589p) r0
                goto L_0x003e
            L_0x003d:
                r0 = r1
            L_0x003e:
                if (r0 == 0) goto L_0x0045
                java.lang.String r3 = "onDragFinished"
                r0.mo83490u5(r2, r3)
            L_0x0045:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r6.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r3 = r0.f159220q
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$a r4 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$a
                r4.<init>(r0, r7)
                r3.post(r4)
                com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r0 = r6.f159241d
                r3 = 8
                r0.mo77740g(r3)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r6.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r0 = r0.f159220q
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                boolean r3 = r0 instanceof eg1.C58589p
                if (r3 == 0) goto L_0x0067
                r1 = r0
                eg1.p r1 = (eg1.C58589p) r1
            L_0x0067:
                if (r1 == 0) goto L_0x00a5
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r6.f159240c
                eg1.k0 r0 = r0.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = r0.f167728e
                r1.mo83487G4(r0, r2)
                goto L_0x00a5
            L_0x0073:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r3 = r6.f159240c
                com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.f159210d
                r3.setCanRefresh(r2)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r3 = r6.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r4 = r3.f159220q
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$b r5 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h$b
                r5.<init>(r3, r7)
                r4.post(r5)
                com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r3 = r6.f159241d
                r3.mo77740g(r2)
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r2 = r6.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r2 = r2.f159220q
                androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
                boolean r3 = r2 instanceof eg1.C58589p
                if (r3 == 0) goto L_0x009a
                r1 = r2
                eg1.p r1 = (eg1.C58589p) r1
            L_0x009a:
                if (r1 == 0) goto L_0x00a5
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r2 = r6.f159240c
                eg1.k0 r2 = r2.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r2 = r2.f167728e
                r1.mo83487G4(r2, r0)
            L_0x00a5:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r0.getClass()
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
                if (r0 == 0) goto L_0x00b8
                gh1.j r1 = gh1.C59447j.f169870a
                hh1.k r2 = new hh1.k
                r2.<init>(r0, r7)
                r1.mo84557i(r0, r2)
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.C55885h.mo77527b(boolean):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.widget.RelativeLayout$LayoutParams} */
        /* JADX WARNING: type inference failed for: r1v4 */
        /* JADX WARNING: type inference failed for: r1v8, types: [androidx.constraintlayout.widget.ConstraintLayout$LayoutParams] */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo77528c(float r10, int r11, int r12) {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sidebar onDragProgress percent:"
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = ", width:"
                r0.append(r1)
                r0.append(r11)
                java.lang.String r1 = ", height:"
                r0.append(r1)
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderLiveViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 0
                r1 = 0
                if (r11 <= 0) goto L_0x004c
                if (r12 <= 0) goto L_0x004c
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r2 = r9.f159240c
                eg1.k0 r2 = r2.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r2 = r2.f167728e
                if (r2 == 0) goto L_0x004c
                hl1.k r2 = r2.getStartUIC()
                if (r2 == 0) goto L_0x004c
                rx3.l r3 = new rx3.l
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3.<init>(r11, r12)
                r11 = 2
                hl1.C59988k.m69861q(r2, r3, r0, r11, r1)
            L_0x004c:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r11 = r9.f159240c
                eg1.k0 r11 = r11.f159223t
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r11 = r11.f167728e
                if (r11 == 0) goto L_0x005c
                r12 = 2131304421(0x7f091fe5, float:1.8226984E38)
                android.view.View r11 = r11.findViewById(r12)
                goto L_0x005d
            L_0x005c:
                r11 = r1
            L_0x005d:
                float r12 = r9.f159239b
                float r2 = r9.f159238a
                float r12 = r12 - r2
                float r12 = r12 * r10
                float r12 = r12 + r2
                int r10 = (int) r12
                if (r11 == 0) goto L_0x006d
                android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
                goto L_0x006e
            L_0x006d:
                r12 = r1
            L_0x006e:
                boolean r2 = r12 instanceof android.widget.RelativeLayout.LayoutParams
                if (r2 == 0) goto L_0x0087
                if (r11 == 0) goto L_0x0079
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                goto L_0x007a
            L_0x0079:
                r11 = r1
            L_0x007a:
                boolean r12 = r11 instanceof android.widget.RelativeLayout.LayoutParams
                if (r12 == 0) goto L_0x0081
                r1 = r11
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            L_0x0081:
                if (r1 != 0) goto L_0x0084
                goto L_0x00a4
            L_0x0084:
                r1.topMargin = r10
                goto L_0x00a4
            L_0x0087:
                boolean r12 = r12 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
                if (r12 == 0) goto L_0x00a4
                if (r11 == 0) goto L_0x0092
                android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
                goto L_0x0093
            L_0x0092:
                r12 = r1
            L_0x0093:
                boolean r2 = r12 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
                if (r2 == 0) goto L_0x009a
                r1 = r12
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            L_0x009a:
                if (r1 != 0) goto L_0x009d
                goto L_0x009f
            L_0x009d:
                r1.f44466u = r10
            L_0x009f:
                if (r11 == 0) goto L_0x00a4
                r11.requestLayout()
            L_0x00a4:
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r10 = r9.f159240c
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r10 = r10.f159220q
                androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
                java.lang.String r11 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                gy3.C87412m.m108592e(r10, r11)
                androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r11 = r9.f159240c
                eg1.k0 r11 = r11.f159223t
                int r11 = r11.f167729f
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r12.mo10233c(r1)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r12.mo10233c(r11)
                java.lang.Object[] r2 = r12.mo10232b()
                java.lang.String r3 = "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3"
                java.lang.String r4 = "onDragProgress"
                java.lang.String r5 = "(FII)V"
                java.lang.String r6 = "Undefined"
                java.lang.String r7 = "scrollToPositionWithOffset"
                java.lang.String r8 = "(II)V"
                r1 = r10
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r11 = r12.mo10231a(r0)
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r0 = 1
                java.lang.Object r12 = r12.mo10231a(r0)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r10.mo16973V(r11, r12)
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3"
                java.lang.String r3 = "onDragProgress"
                java.lang.String r4 = "(FII)V"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "scrollToPositionWithOffset"
                java.lang.String r7 = "(II)V"
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.C55885h.mo77528c(float, int, int):void");
        }

        /* renamed from: d */
        public void mo77529d(boolean z) {
            Log.m105924i("Finder.FinderLiveViewCallback", "sidebar onDragStarted toShow:" + z);
            if (z) {
                FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f159240c.f159223t.f167728e;
                if (finderLiveVisitorPluginLayout != null) {
                    finderLiveVisitorPluginLayout.clearForSideBar();
                }
                RecyclerView.C16613e adapter = this.f159240c.f159220q.getAdapter();
                C58589p pVar = adapter instanceof C58589p ? (C58589p) adapter : null;
                if (pVar != null) {
                    pVar.mo83490u5(true, "onDragStarted");
                }
            }
            this.f159241d.mo77740g(8);
            FinderLiveService.f159376d.getClass();
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore != null) {
                C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59904l(liveRoomControllerStore, z));
            }
        }

        /* renamed from: e */
        public void mo77530e(int i, int i2) {
            Log.m105924i("Finder.FinderLiveViewCallback", "onLoadNextPage position:" + i + ", size:" + i2);
            C58596u uVar = this.f159240c.f159214h;
            if (uVar != null) {
                FinderLiveService.f159376d.getClass();
                uVar.mo77496b1(i, i2, FinderLiveService.f159348A);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$i */
    public static final class C55889i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159249d;

        /* renamed from: e */
        public final /* synthetic */ int f159250e;

        public C55889i(FinderLiveViewCallback finderLiveViewCallback, int i) {
            this.f159249d = finderLiveViewCallback;
            this.f159250e = i;
        }

        public final void run() {
            FinderLiveRecyclerView finderLiveRecyclerView = this.f159249d.f159220q;
            int i = this.f159250e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(finderLiveRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$onLoadMoreResult$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            finderLiveRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$onLoadMoreResult$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$j */
    public static final class C55890j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159251d;

        public C55890j(FinderLiveViewCallback finderLiveViewCallback) {
            this.f159251d = finderLiveViewCallback;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = r2.f151990e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r11.f159251d
                eg1.k0 r0 = r0.f159223t
                int r0 = r0.f167729f
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
                r3 = 0
                if (r2 == 0) goto L_0x0019
                java.util.ArrayList<al1.h> r2 = r2.f151990e
                if (r2 == 0) goto L_0x0019
                int r2 = r2.size()
                goto L_0x001a
            L_0x0019:
                r2 = 0
            L_0x001a:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "restartLive curPos:"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = ",size:"
                r4.append(r5)
                r4.append(r2)
                r5 = 33
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "Finder.FinderLiveViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                r4 = 1
                if (r0 < 0) goto L_0x0044
                if (r0 >= r2) goto L_0x0044
                r0 = 1
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                if (r0 == 0) goto L_0x0084
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r11.f159251d
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r0 = r0.f159221r
                if (r0 == 0) goto L_0x0051
                r2 = 0
                com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager.m63990e0(r0, r3, r4, r4, r2)
            L_0x0051:
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                androidx.lifecycle.i0 r0 = r1.mo77630e(r0)
                cl1.u r0 = (cl1.C55001u) r0
                if (r0 == 0) goto L_0x0084
                te3.c21 r0 = r0.f154420q
                if (r0 == 0) goto L_0x0084
                long r0 = r0.f182392d
                er1.g5 r2 = er1.C58730g5.f168158a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "RV_VISITOR_"
                r3.append(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                er1.e5$b r0 = er1.C58713e5.f168073a
                er1.e5$c r0 = er1.C58713e5.f168090r
                java.lang.String r4 = r0.f168101b
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 60
                r10 = 0
                er1.C58730g5.m68220e(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.C55890j.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$k */
    public static final class C55891k extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159252d;

        /* renamed from: e */
        public final /* synthetic */ boolean f159253e;

        public C55891k(FinderLiveViewCallback finderLiveViewCallback, boolean z) {
            this.f159252d = finderLiveViewCallback;
            this.f159253e = z;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                this.f159252d.mo77518Z();
                recyclerView.mo17098m1(this);
                if (FinderLiveViewCallback.f159198L != 0) {
                    if (this.f159253e) {
                        FinderLiveViewCallback finderLiveViewCallback = this.f159252d;
                        int i2 = finderLiveViewCallback.f159223t.f167729f;
                        if (i2 != 0) {
                            finderLiveViewCallback.mo77520k0(i2 - 1);
                        }
                    } else {
                        FinderLiveViewCallback finderLiveViewCallback2 = this.f159252d;
                        finderLiveViewCallback2.mo77520k0(finderLiveViewCallback2.f159223t.f167729f + 1);
                    }
                }
                this.f159252d.mo77514F0(this.f159253e);
                this.f159252d.mo77513E0(!this.f159253e, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$l */
    public static final class C55892l implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f159254d;

        /* renamed from: e */
        public final /* synthetic */ boolean f159255e;

        /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$l$a */
        public static final class C55893a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveViewCallback f159256d;

            /* renamed from: e */
            public final /* synthetic */ boolean f159257e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55893a(FinderLiveViewCallback finderLiveViewCallback, boolean z) {
                super(0);
                this.f159256d = finderLiveViewCallback;
                this.f159257e = z;
            }

            public Object invoke() {
                if (!this.f159256d.f159206H) {
                    Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide isRealHistory=" + this.f159257e + " scroll, cur data pos:" + this.f159256d.f159223t.f167729f);
                    FinderLiveViewCallback.f159198L = this.f159257e ? 1 : 2;
                    FinderLiveViewCallback finderLiveViewCallback = this.f159256d;
                    finderLiveViewCallback.getClass();
                    Log.m105924i("Finder.FinderLiveViewCallback", "#detachSnapHelperToRV");
                    ((C56437x0) ((C36570n) finderLiveViewCallback.f159219p).getValue()).mo75025b((RecyclerView) null);
                    FinderLiveViewCallback finderLiveViewCallback2 = this.f159256d;
                    finderLiveViewCallback2.f159220q.mo17122s1(0, this.f159257e ? -finderLiveViewCallback2.f159227x : finderLiveViewCallback2.f159228y, new DecelerateInterpolator());
                    C61926c.m72666K(100, new C55903c(this.f159257e, this.f159256d));
                    this.f159256d.mo77513E0(!this.f159257e, true);
                }
                return C13598b0.f38549a;
            }
        }

        public C55892l(FinderLiveViewCallback finderLiveViewCallback, boolean z) {
            this.f159254d = finderLiveViewCallback;
            this.f159255e = z;
        }

        public void onGlobalLayout() {
            List<C54130j> list;
            C54127h O4;
            RecyclerView.C16613e adapter = this.f159254d.f159220q.getAdapter();
            T t = null;
            C58589p pVar = adapter instanceof C58589p ? (C58589p) adapter : null;
            C45795b bVar = (pVar == null || (O4 = pVar.mo83488O4(this.f159254d.f159223t.f167729f)) == null) ? null : O4.f151978e;
            C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
            boolean z = false;
            boolean u = C61926c.m72696u(oVar != null ? oVar.f154291a1 : 0, 8);
            if (!(bVar == null || (list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154074q) == null)) {
                synchronized (list) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Util.isEqual(((C54130j) next).f151997a, oVar != null ? oVar.mo76015n4() : null)) {
                            t = next;
                            break;
                        }
                    }
                }
                t = (C54130j) t;
            }
            boolean z2 = t != null;
            if (oVar != null && oVar.mo75999e4()) {
                z = true;
            }
            if (z && !u && !z2) {
                this.f159254d.f159220q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C61926c.m72666K(800, new C55893a(this.f159254d, this.f159255e));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$m */
    public static final class C55894m extends C87413o implements C32224a<C56437x0> {

        /* renamed from: d */
        public static final C55894m f159258d = new C55894m();

        public C55894m() {
            super(0);
        }

        public Object invoke() {
            C56437x0 x0Var = new C56437x0();
            x0Var.f161311m = false;
            return x0Var;
        }
    }

    public FinderLiveViewCallback(RefreshLoadMoreLayout refreshLoadMoreLayout, View view, MMActivity mMActivity, Fragment fragment, C58596u uVar, boolean z, boolean z2) {
        C87412m.m108594g(refreshLoadMoreLayout, "rfLayout");
        C87412m.m108594g(view, "liveContainer");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f159210d = refreshLoadMoreLayout;
        this.f159211e = view;
        this.f159212f = mMActivity;
        this.f159213g = fragment;
        this.f159214h = uVar;
        this.f159215i = z;
        this.f159216j = z2;
        this.f159217n = C53930o0.m60555b();
        this.f159218o = fragment != null ? fragment.getLifecycle() : null;
        this.f159219p = C36568h.m40985a(C55894m.f159258d);
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView");
        this.f159220q = (FinderLiveRecyclerView) recyclerView;
        C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62444c(mMActivity).mo62447c(C60172g4.class)).mo12861q3();
        this.f159222s = q3;
        this.f159223t = new C58584k0(mMActivity, q3);
        this.f159225v = C36568h.m40985a(new C55879b(this));
        this.f159226w = new FinderLiveViewCallback$LiveUninterestedListener$1(this, mMActivity);
        this.f159227x = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_) + mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) + C75044y4.m89994f(mMActivity);
        this.f159228y = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_) + C75044y4.m89991c(mMActivity);
        this.f159201C = true;
        this.f159202D = -1;
        this.f159204F = -1;
        this.f159205G = -1;
        this.f159209K = -1;
    }

    /* renamed from: D */
    public static final void m63695D(FinderLiveViewCallback finderLiveViewCallback, int i) {
        C54127h O4;
        RecyclerView.C16613e adapter = finderLiveViewCallback.f159220q.getAdapter();
        if ((adapter instanceof C58589p) && (O4 = ((C58589p) adapter).mo83488O4(i)) != null) {
            Log.m105924i("Finder.FinderLiveViewCallback", "pre stopPlay pos = " + i + ", live name = " + O4.f151977d.f157053K + ", live id = " + O4.f151977d.f157064e + ", audienceMode:" + O4.f151977d.f157073q);
            C62193a c = C62193a.f176816k1.mo87262c(O4.f151977d.f157064e);
            if (c != null) {
                c.mo87256C0(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.findViewByPosition(r3);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63696p(com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback r2, int r3, boolean r4) {
        /*
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r2 = r2.f159221r
            if (r2 == 0) goto L_0x0014
            android.view.View r2 = r2.findViewByPosition(r3)
            if (r2 == 0) goto L_0x0014
            r0 = 2131304410(0x7f091fda, float:1.8226962E38)
            android.view.View r2 = r2.findViewById(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r2 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r2
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notifyViewShowFinderNewGuide viewPos:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ",view:"
            r0.append(r3)
            if (r2 == 0) goto L_0x002e
            int r3 = r2.hashCode()
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "Finder.FinderLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            if (r2 == 0) goto L_0x0040
            r2.showFinderNewGuide(r4)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.m63696p(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback, int, boolean):void");
    }

    /* renamed from: v */
    public static final void m63697v(FinderLiveViewCallback finderLiveViewCallback, int i, ArrayList arrayList) {
        C54129i G0;
        finderLiveViewCallback.getClass();
        arrayList.remove(i);
        RecyclerView.C16613e adapter = finderLiveViewCallback.f159220q.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(i);
        }
        C58596u uVar = finderLiveViewCallback.f159214h;
        if (uVar != null && (G0 = uVar.mo77493G0()) != null && i < G0.mo74925c()) {
            G0.mo74928f(G0.mo74925c() - 1);
        }
    }

    /* renamed from: y */
    public static final void m63698y(FinderLiveViewCallback finderLiveViewCallback, int i) {
        C54127h O4;
        FinderLiveLayoutManager finderLiveLayoutManager;
        View findViewByPosition;
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        RecyclerView.C16613e adapter = finderLiveViewCallback.f159220q.getAdapter();
        if ((adapter instanceof C58589p) && (O4 = ((C58589p) adapter).mo83488O4(i)) != null && (finderLiveLayoutManager = finderLiveViewCallback.f159221r) != null && (findViewByPosition = finderLiveLayoutManager.findViewByPosition(i)) != null && (finderLiveVisitorPluginLayout = (FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(C0966R.C0970id.e1m)) != null) {
            C64273c21 T70 = ((C60606n) C86312j.m106911c(C60606n.class)).T70(O4.f151977d.f157064e);
            boolean z = false;
            if (T70 != null && T70.f182394f == 2) {
                z = true;
            }
            if (z) {
                Log.m105924i("Finder.FinderLiveViewCallback", "pre startPlay pos = " + i + ", live name = " + O4.f151977d.f157053K + ", live id = " + O4.f151977d.f157064e + " fail, live is finish!");
                return;
            }
            LiveConfig liveConfig = O4.f151977d;
            boolean preloadNextLive = finderLiveVisitorPluginLayout.preloadNextLive(liveConfig.f157064e, liveConfig.f157072p, Integer.valueOf(liveConfig.f157073q));
            finderLiveViewCallback.f159203E = true;
            O4.f151982i = preloadNextLive;
            Log.m105924i("Finder.FinderLiveViewCallback", "pre startPlay pos = " + i + ", live name = " + O4.f151977d.f157053K + ", live id = " + O4.f151977d.f157064e + ", preloadSuccess:" + preloadNextLive);
        }
    }

    /* renamed from: E0 */
    public final void mo77513E0(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        Log.m105924i("Finder.FinderLiveViewCallback", "reportScrollEvent isLoadMore=" + z3 + " isExposure=" + z4);
        if (z4 || !this.f159199A) {
            int i = 1;
            if (!z4) {
                this.f159199A = true;
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            wVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", z3 ? 1 : 2);
            if (!z4) {
                i = 2;
            }
            jSONObject.put("event_res", i);
            C54116w.Ex0(wVar, C54067f0.C54076o0.SCROLL_GUIDE, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    /* renamed from: F0 */
    public final void mo77514F0(boolean z) {
        if (f159198L != 0) {
            Log.m105924i("Finder.FinderLiveViewCallback", "#cancelNewGuide isRealHistory=" + z);
            f159198L = 0;
            if (z) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
                return;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
            C58739j4.f168176a.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, Boolean.FALSE);
        }
    }

    /* renamed from: G0 */
    public final void mo77515G0(int i, int i2) {
        C55878a aVar = new C55878a(this, i2);
        aVar.f44872a = i;
        RecyclerView.LayoutManager layoutManager = this.f159220q.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(aVar);
        }
    }

    /* renamed from: H0 */
    public final void mo77516H0(int i, boolean z) {
        Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide itemCount=" + i + " isRealHistory=" + z);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f159210d.getContext();
        C87412m.m108593f(context, "rfLayout.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide inSideBarStatus, return");
            return;
        }
        if (z) {
            if (C32444a.f86091Q.mo60266n().intValue() == 0) {
                Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide FINDER_LIVE_REAL_HISTORY_GUIDE_ENABLE false, return");
                return;
            }
        } else if (!z && C32444a.f86088P.mo60266n().intValue() == 0) {
            Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide FINDER_LIVE_GUIDE_ENABLE false, return");
            return;
        }
        if (z) {
            C58739j4.f168176a.getClass();
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) f).booleanValue()) {
                Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide is show history guide but more guide not showed, return");
                return;
            }
        }
        if (z) {
            C58739j4.f168176a.getClass();
            Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) f2).booleanValue()) {
                Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide you was showed, return");
                return;
            }
        } else {
            C58739j4.f168176a.getClass();
            Object f3 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f3, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) f3).booleanValue()) {
                Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide you was showed, return");
                return;
            }
        }
        if (!(z || i > 1)) {
            Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide isCanBeShow is false, return");
        } else if (this.f159229z) {
            Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide hasShowNewGuide is true, return");
        } else {
            this.f159229z = true;
            Log.m105924i("Finder.FinderLiveViewCallback", "#setNewGuide finally come in!!!");
            this.f159220q.mo17043c(new C55891k(this, z));
            this.f159220q.getViewTreeObserver().addOnGlobalLayoutListener(new C55892l(this, z));
        }
    }

    /* renamed from: M */
    public RefreshLoadMoreLayout mo77517M() {
        return this.f159210d;
    }

    /* renamed from: Z */
    public final void mo77518Z() {
        Log.m105924i("Finder.FinderLiveViewCallback", "#attachSnapHelperToRV");
        ((C56437x0) ((C36570n) this.f159219p).getValue()).mo75025b(this.f159220q);
    }

    public MMFragmentActivity getActivity() {
        return this.f159212f;
    }

    /* renamed from: i */
    public void mo77519i(C54129i iVar, int i, int i2, int i3) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        Configuration configuration;
        ArrayList<C54127h> arrayList;
        Integer num = null;
        Integer valueOf = iVar != null ? Integer.valueOf(iVar.mo74925c()) : null;
        int size = (iVar == null || (arrayList = iVar.f151990e) == null) ? 0 : arrayList.size();
        Log.m105924i("Finder.FinderLiveViewCallback", "onOrderResult notifyPos:" + i + ", upIncrementSize size:" + i2 + ", downIncrementSize size:" + i3 + ", dataSize:" + size + ", cur position:" + valueOf);
        mo77521m0();
        boolean isFinishing = this.f159212f.isFinishing() | this.f159212f.isDestroyed();
        C62042e eVar = C62042e.f176370a;
        MMActivity mMActivity = this.f159212f;
        eVar.getClass();
        C87412m.m108594g(mMActivity, "context");
        Resources resources = mMActivity.getResources();
        boolean z = true;
        boolean z2 = (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) ? false : true;
        if (!isFinishing) {
            int i4 = i + 1;
            if ((i4 >= 0 && i4 < size) && z2 && i3 > 0 && (adapter2 = this.f159220q.getAdapter()) != null) {
                adapter2.notifyItemRangeInserted(i4, i3);
            }
        }
        if (!isFinishing) {
            if (i < 0 || i >= size) {
                z = false;
            }
            if (z && z2 && i2 > 0 && (adapter = this.f159220q.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(i, i2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyItemRangeChange isFinish:");
        sb.append(isFinishing);
        sb.append(", notifyPos:");
        sb.append(i);
        sb.append(", upIncrementSize:");
        sb.append(i2);
        sb.append(", downIncrementSize:");
        sb.append(i3);
        sb.append(", size:");
        sb.append(size);
        sb.append(", isPortrait:");
        sb.append(z2);
        sb.append(", scrollState:");
        FinderLiveLayoutManager finderLiveLayoutManager = this.f159221r;
        if (finderLiveLayoutManager != null) {
            num = Integer.valueOf(finderLiveLayoutManager.f159778w);
        }
        sb.append(num);
        Log.m105924i("Finder.FinderLiveViewCallback", sb.toString());
        mo77516H0(size, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.findViewByPosition(r4);
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77520k0(int r4) {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r0 = r3.f159221r
            if (r0 == 0) goto L_0x0014
            android.view.View r0 = r0.findViewByPosition(r4)
            if (r0 == 0) goto L_0x0014
            r1 = 2131304410(0x7f091fda, float:1.8226962E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r0
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "notifyViewHideFinderNewGuide viewPos:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ",view:"
            r1.append(r4)
            if (r0 == 0) goto L_0x002e
            int r4 = r0.hashCode()
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "Finder.FinderLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            if (r0 == 0) goto L_0x0040
            r0.hideFinderNewGuide()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.mo77520k0(int):void");
    }

    /* renamed from: m0 */
    public final void mo77521m0() {
        C58596u uVar = this.f159214h;
        Boolean valueOf = uVar != null ? Boolean.valueOf(uVar.mo77508s0()) : null;
        Log.m105924i("Finder.FinderLiveViewCallback", "refreshLoadMoreAbility:" + valueOf);
        this.f159210d.setEnableNestedScroll(C87412m.m108589b(valueOf, Boolean.FALSE) ^ true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x025f  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77522n0(al1.C54129i r19, int r20, long r21) {
        /*
            r18 = this;
            r9 = r18
            r10 = r19
            r11 = r20
            java.lang.Class<dk1.g> r12 = dk1.C58312g.class
            java.lang.String r0 = "liveData"
            gy3.C87412m.m108594g(r10, r0)
            eg1.u r0 = r9.f159214h
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.mo77504k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            eg1.u r1 = r9.f159214h
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.mo77500e1()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load more setting,canLoadMore:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ",canFlingUp:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " enablePreloadRvFeed:"
            r2.append(r3)
            boolean r3 = com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.f159177j
            boolean r3 = com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.f159177j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r14 = "Finder.FinderLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = gy3.C87412m.m108589b(r0, r2)
            r15 = 0
            if (r3 != 0) goto L_0x0068
            boolean r2 = gy3.C87412m.m108589b(r1, r2)
            if (r2 != 0) goto L_0x0068
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r9.f159210d
            r0.setEnableLoadMore(r15)
            goto L_0x0082
        L_0x0068:
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.booleanValue()
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r1 == 0) goto L_0x0077
            boolean r1 = r1.booleanValue()
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r9.f159210d
            eg1.f0 r3 = new eg1.f0
            r3.<init>(r9, r0, r1)
            r2.setActionCallback(r3)
        L_0x0082:
            al1.h r0 = r19.mo74924b()
            r8 = 1
            if (r0 == 0) goto L_0x0099
            com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d
            if (r0 == 0) goto L_0x0099
            int r1 = eg1.C58598w.f167764h
            long r1 = eg1.C58598w.f167765i
            long r3 = r0.f157075s
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 != 0) goto L_0x009f
            r18.mo77521m0()
        L_0x009f:
            com.tencent.mm.ui.MMActivity r0 = r9.f159212f
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_MULTI_TASK_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            com.tencent.mm.plugin.finder.live.view.j1 r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159385p
            if (r1 == 0) goto L_0x00bc
            com.tencent.mm.plugin.finder.live.view.j1 r0 = new com.tencent.mm.plugin.finder.live.view.j1
            com.tencent.mm.ui.MMActivity r2 = r9.f159212f
            r0.<init>((android.app.Activity) r2, (com.tencent.p014mm.plugin.finder.live.view.C56072j1) r1)
            goto L_0x00c4
        L_0x00bc:
            com.tencent.mm.plugin.finder.live.view.j1 r1 = new com.tencent.mm.plugin.finder.live.view.j1
            com.tencent.mm.ui.MMActivity r2 = r9.f159212f
            r1.<init>((android.app.Activity) r2, (byte[]) r0)
            r0 = r1
        L_0x00c4:
            r9.f159200B = r0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159385p = r0
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r0 = new com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r1 = r9.f159220q
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "recyclerView.context"
            gy3.C87412m.m108593f(r1, r2)
            r0.<init>(r1, r8, r15)
            r9.f159221r = r0
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$c r1 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$c
            r1.<init>(r9, r0)
            r0.f159781z = r1
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$d r1 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$d
            r1.<init>(r9)
            r0.f159773A = r1
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r6 = r9.f159220q
            r6.setHasFixedSize(r8)
            com.tencent.mm.ui.MMActivity r0 = r9.f159212f
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "LAUNCH_WITH_ANIM"
            boolean r16 = r0.getBooleanExtra(r1, r15)
            eg1.p r7 = new eg1.p
            androidx.fragment.app.Fragment r1 = r9.f159213g
            boolean r3 = r9.f159215i
            te3.hj1 r5 = r9.f159222s
            r0 = r7
            r2 = r19
            r4 = r18
            r15 = r6
            r13 = r7
            r6 = r21
            r17 = r12
            r12 = 1
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r15.setAdapter(r13)
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r0 = r9.f159221r
            r1 = 2
            r2 = 0
            com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView.m63293z1(r15, r0, r2, r1, r2)
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$e r0 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$e
            r0.<init>()
            r15.mo17085h0(r0)
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$f r0 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$f
            r0.<init>(r9)
            r15.mo17043c(r0)
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$g r0 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$g
            r0.<init>(r9, r15)
            r15.setPageChangeListener(r0)
            r15.setImportantForAccessibility(r1)
            r18.mo77518Z()
            androidx.lifecycle.j r0 = r9.f159218o
            if (r0 == 0) goto L_0x0141
            r0.addObserver(r9)
        L_0x0141:
            if (r11 < 0) goto L_0x014d
            java.util.ArrayList<al1.h> r0 = r10.f151990e
            int r0 = r0.size()
            if (r11 >= r0) goto L_0x014d
            r8 = 1
            goto L_0x014e
        L_0x014d:
            r8 = 0
        L_0x014e:
            if (r8 == 0) goto L_0x0192
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r8 = r9.f159220q
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r13.mo10233c(r0)
            java.lang.Object[] r1 = r13.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;IJ)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r0 = r8
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r13.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            r8.mo17115r1(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback"
            java.lang.String r2 = "initView"
            java.lang.String r3 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;IJ)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "scrollToPosition"
            java.lang.String r6 = "(I)V"
            r0 = r8
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0192:
            cj1.n4$a r0 = cj1.C0576n4.f1379b
            com.tencent.mm.ui.MMActivity r1 = r9.f159212f
            android.content.Intent r1 = r1.getIntent()
            cj1.n4 r0 = r0.mo598a(r1)
            if (r0 == 0) goto L_0x01aa
            te3.wp2 r0 = r0.f1381a
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.f186152d
            if (r0 != r12) goto L_0x01aa
            r8 = 1
            goto L_0x01ab
        L_0x01aa:
            r8 = 0
        L_0x01ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isEnableInsertHistory isDisableScrollSquare: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            boolean r0 = r9.f159215i
            if (r0 != 0) goto L_0x01c7
            if (r8 == 0) goto L_0x01c7
            r8 = 1
            goto L_0x01c8
        L_0x01c7:
            r8 = 0
        L_0x01c8:
            if (r8 == 0) goto L_0x01df
            java.lang.String r0 = "#executeInsertHistories"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            a14.n0 r1 = r9.f159217n
            eg1.c0 r4 = new eg1.c0
            r0 = 0
            r4.<init>(r9, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
            goto L_0x01e0
        L_0x01df:
            r0 = 0
        L_0x01e0:
            gg1.a r1 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86084N1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x025f
            android.view.View r1 = r9.f159211e
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r2 = new com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar
            android.view.View r3 = r9.f159211e
            r2.<init>(r3)
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h r3 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$h
            r3.<init>(r1, r9, r2, r10)
            js1.a r4 = new js1.a
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig r5 = r2.f159521m
            r6 = 2131495222(0x7f0c0936, float:1.8613975E38)
            r7 = 0
            r4.<init>(r5, r1, r6, r7)
            r2.f159511c = r4
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = "parent.context"
            gy3.C87412m.m108593f(r1, r4)
            r2.f159516h = r1
            r2.f159514f = r3
            bl3.r r1 = bl3.C39818r.f106831a
            android.view.View r3 = r9.f159211e
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "liveContainer.context"
            gy3.C87412m.m108593f(r3, r4)
            bl3.r$a r3 = r1.mo62443b(r3)
            r5 = r17
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            dk1.g r3 = (dk1.C58312g) r3
            r3.f166968f = r2
            android.view.View r2 = r9.f159211e
            android.content.Context r2 = r2.getContext()
            gy3.C87412m.m108593f(r2, r4)
            bl3.r$a r1 = r1.mo62443b(r2)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r5)
            dk1.g r1 = (dk1.C58312g) r1
            eg1.u r2 = r9.f159214h
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.live.FinderLivePresenter
            if (r3 == 0) goto L_0x025b
            r13 = r2
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r13 = (com.tencent.p014mm.plugin.finder.live.FinderLivePresenter) r13
            goto L_0x025c
        L_0x025b:
            r13 = r0
        L_0x025c:
            r1.f166969g = r13
            goto L_0x0264
        L_0x025f:
            java.lang.String r0 = "init view live side bar switch is close!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.mo77522n0(al1.i, int, long):void");
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159226w.alive();
        Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onCreate " + this + ", lifecycleOwner:" + sVar);
    }

    public void onDestroy(C0125s sVar) {
        Class cls = C58312g.class;
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onDestroy " + this + ", lifecycleOwner:" + sVar);
        this.f159221r = null;
        C53930o0.m60558e(this.f159217n, (CancellationException) null, 1, (Object) null);
        this.f159226w.dead();
        f159198L = 0;
        ((C61130g) C86312j.m106911c(C61130g.class)).zc0();
        C39818r rVar = C39818r.f106831a;
        Context context = this.f159210d.getContext();
        C87412m.m108593f(context, "rfLayout.context");
        ((C58312g) rVar.mo62443b(context).mo75002a(cls)).mo83061c3(false);
        Context context2 = this.f159210d.getContext();
        C87412m.m108593f(context2, "rfLayout.context");
        if (C87412m.m108589b(((C58312g) rVar.mo62443b(context2).mo75002a(cls)).f166969g, this.f159214h)) {
            Context context3 = this.f159210d.getContext();
            C87412m.m108593f(context3, "rfLayout.context");
            ((C58312g) rVar.mo62443b(context3).mo75002a(cls)).f166968f = null;
            Context context4 = this.f159210d.getContext();
            C87412m.m108593f(context4, "rfLayout.context");
            ((C58312g) rVar.mo62443b(context4).mo75002a(cls)).f166969g = null;
        }
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onPause " + this + ", lifecycleOwner:" + sVar);
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f159223t.f167728e;
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.pause();
        }
    }

    public void onResume(C0125s sVar) {
        Class cls = C54991o.class;
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onResume " + this + ", lifecycleOwner:" + sVar);
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f159223t.f167728e;
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.resume();
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar != null) {
            oVar.f154350p0 = true;
        }
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar2 != null) {
            oVar2.mo76021s4(false);
        }
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if ((!((cl1.C54991o) r1.mo71262a(r7)).mo75999e4()) != false) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart(androidx.lifecycle.C0125s r7) {
        /*
            r6 = this;
            java.lang.String r0 = "var1"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            boolean r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0026
            java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
            androidx.lifecycle.i0 r1 = r0.mo77630e(r1)
            cl1.h1 r1 = (cl1.C54979h1) r1
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.f154109A
            if (r1 != r3) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[LiveLifecycle]onStart "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ", lifecycleOwner:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = " shoppingInMiniProgram: "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "Finder.FinderLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            if (r1 != 0) goto L_0x00f3
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x0066
            androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            if (r1 != 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0075
        L_0x0066:
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            r1.f151449c = r3
        L_0x0075:
            fj1.b r1 = fj1.C45795b.f123698n
            r5 = 0
            if (r1 == 0) goto L_0x0081
            androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
            cl1.o r1 = (cl1.C54991o) r1
            goto L_0x0082
        L_0x0081:
            r1 = r5
        L_0x0082:
            if (r1 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r1.f154350p0 = r3
        L_0x0087:
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x0092
            androidx.lifecycle.i0 r7 = r1.mo71262a(r7)
            r5 = r7
            cl1.o r5 = (cl1.C54991o) r5
        L_0x0092:
            if (r5 != 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            r5.mo76021s4(r2)
        L_0x0098:
            p50.e r7 = r0.mo77631e0()
            if (r7 == 0) goto L_0x00a9
            d50.i r1 = r7.f172989A
            if (r1 == 0) goto L_0x00a9
            boolean r1 = r1.mo82881c()
            if (r1 != r3) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "startLiveVideo,float mode:"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            if (r2 == 0) goto L_0x00f3
            zt3.t r1 = zt3.C119157j.f356862d
            cj1.w5 r2 = cj1.C28594w5.f78482d
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r4 = "Finder.LiveExceptionMonitor"
            r1.mo183876g(r2, r4)
            if (r7 == 0) goto L_0x00d0
            r7.mo75580f0()
        L_0x00d0:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r7 == 0) goto L_0x00d9
            gh1.j r1 = gh1.C59447j.f169870a
            r1.mo84553e(r7)
        L_0x00d9:
            r0.mo77608K()
            fj1.b r7 = fj1.C45795b.f123698n
            if (r7 == 0) goto L_0x00f3
            java.lang.Class<cl1.d> r0 = cl1.C54951d.class
            androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
            cl1.d r7 = (cl1.C54951d) r7
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Integer> r7 = r7.f154005j
            if (r7 == 0) goto L_0x00f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7.postValue(r0)
        L_0x00f3:
            eg1.k0 r7 = r6.f159223t
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r7 = r7.f167728e
            if (r7 == 0) goto L_0x00fc
            r7.start()
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.onStart(androidx.lifecycle.s):void");
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onStop " + this + ", lifecycleOwner:" + sVar);
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f159223t.f167728e;
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.stop();
        }
    }

    /* renamed from: q0 */
    public void mo77523q0(C54129i iVar, int i, int i2) {
        RecyclerView.C16613e adapter;
        Configuration configuration;
        ArrayList<C54127h> arrayList;
        Integer num = null;
        Integer valueOf = iVar != null ? Integer.valueOf(iVar.mo74925c()) : null;
        int size = (iVar == null || (arrayList = iVar.f151990e) == null) ? 0 : arrayList.size();
        Log.m105924i("Finder.FinderLiveViewCallback", "onPreloadResult increment size:" + i2 + ", dataSize:" + size + ", cur position:" + valueOf + ",lastItemPos:" + i);
        mo77521m0();
        boolean isFinishing = this.f159212f.isFinishing() | this.f159212f.isDestroyed();
        int i3 = i + 1;
        C62042e eVar = C62042e.f176370a;
        MMActivity mMActivity = this.f159212f;
        eVar.getClass();
        C87412m.m108594g(mMActivity, "context");
        Resources resources = mMActivity.getResources();
        boolean z = true;
        boolean z2 = (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) ? false : true;
        if (!isFinishing) {
            if (i3 < 0 || i3 >= size) {
                z = false;
            }
            if (z && z2 && (adapter = this.f159220q.getAdapter()) != null) {
                adapter.notifyItemRangeChanged(i3, size);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyListTailReplace isFinish:");
        sb.append(isFinishing);
        sb.append(",lastItemPos:");
        sb.append(i);
        sb.append(",nextPosition:");
        sb.append(i3);
        sb.append(",incrementSize:");
        sb.append(i2);
        sb.append(", size:");
        sb.append(size);
        sb.append(", isPortrait:");
        sb.append(z2);
        sb.append(", scrollState:");
        FinderLiveLayoutManager finderLiveLayoutManager = this.f159221r;
        if (finderLiveLayoutManager != null) {
            num = Integer.valueOf(finderLiveLayoutManager.f159778w);
        }
        sb.append(num);
        Log.m105924i("Finder.FinderLiveViewCallback", sb.toString());
        mo77516H0(size, false);
    }

    /* renamed from: v0 */
    public void mo77524v0() {
        this.f159220q.post(new C55890j(this));
    }

    /* renamed from: z */
    public void mo77525z(C54129i iVar, int i, int i2) {
        ArrayList<C54127h> arrayList;
        RecyclerView.C16613e adapter;
        C54129i iVar2 = iVar;
        int i3 = i2;
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadMoreResult increment size:");
        sb.append(i3);
        sb.append(", oriDataSize:");
        sb.append(i);
        sb.append(", init position:");
        sb.append(iVar2 != null ? Integer.valueOf(iVar.mo74925c()) : null);
        Log.m105924i("Finder.FinderLiveViewCallback", sb.toString());
        int i4 = 0;
        if (i3 <= 0) {
            View c = this.f159210d.mo82392c(C0966R.C0970id.dqh);
            View findViewById = c != null ? c.findViewById(C0966R.C0970id.g3j) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View c2 = this.f159210d.mo82392c(C0966R.C0970id.dqh);
            View findViewById2 = c2 != null ? c2.findViewById(C0966R.C0970id.g2q) : null;
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View c3 = this.f159210d.mo82392c(C0966R.C0970id.dqh);
            if (c3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = c3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback", "onLoadMoreResult", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveDataModel;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!(i3 <= 0 || iVar2 == null || (arrayList = iVar2.f151990e) == null)) {
            int size = arrayList.size() - i3;
            if ((size >= 0 && size < arrayList.size()) && (adapter = this.f159220q.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(size, i3);
            }
        }
        int i5 = -1;
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(-1);
        cVar.f24953h = i3;
        cVar.f24952g = !cVar.f24951f;
        this.f159210d.onPreFinishLoadMoreSmooth(cVar);
        if (cVar.f24951f) {
            FinderLiveLayoutManager finderLiveLayoutManager = this.f159221r;
            if (finderLiveLayoutManager != null) {
                i5 = finderLiveLayoutManager.mo16957C();
            }
            int i6 = i5 + 1;
            RecyclerView.C16613e adapter2 = this.f159220q.getAdapter();
            if (adapter2 != null) {
                i4 = adapter2.getItemCount();
            }
            if (i6 < i4) {
                this.f159220q.post(new C55889i(this, i6));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderLiveViewCallback(RefreshLoadMoreLayout refreshLoadMoreLayout, View view, MMActivity mMActivity, Fragment fragment, C58596u uVar, boolean z, boolean z2, int i, C8480h hVar) {
        this(refreshLoadMoreLayout, view, mMActivity, fragment, uVar, z, (i & 64) != 0 ? false : z2);
    }
}

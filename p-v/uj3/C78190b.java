package uj3;

import a14.C0000n0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C104160f;
import bp3.C79758p;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C45094u2;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.chatting.C44851e0;
import com.tencent.p014mm.p136ui.chatting.C6784h2;
import com.tencent.p014mm.p136ui.chatting.C73688g2;
import com.tencent.p014mm.p136ui.chatting.C74349y3;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74123m7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74272u8;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72841x1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57545k0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import de3.C45335p;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C97625j3;
import ex0.C45696d;
import ex0.C45700h;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hc0.C20937c;
import hd0.C98408n0;
import hd0.C98429r0;
import hk3.C76227e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import jq3.C76435a;
import jq3.C9506m;
import jq3.C9507n;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import mh0.C99865e0;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import p629ny.C76978g;
import p682rz.C101489t;
import p682rz.C101491u;
import p749xh.C102645g6;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C48299e;
import sb0.C48340e;
import vd3.C78404m;
import vj3.C78421a;
import wk3.C78606a;
import z04.C112550d0;
import zj3.C53793s0;
import zj3.C79345d;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: uj3.b */
public final class C78190b extends C9506m<C65400b> implements C79368l {

    /* renamed from: Q0 */
    public static int f229091Q0 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ChatListToRV_Int, 4);

    /* renamed from: R0 */
    public static final C13601g<C78421a> f229092R0 = C36568h.m40985a(C78192d.f229140d);

    /* renamed from: y0 */
    public static final C78193e f229093y0 = new C78193e((C8480h) null);

    /* renamed from: A */
    public int f229094A;

    /* renamed from: B */
    public C78606a f229095B;

    /* renamed from: C */
    public C20937c f229096C;

    /* renamed from: D */
    public final long f229097D;

    /* renamed from: E */
    public long f229098E;

    /* renamed from: F */
    public boolean f229099F;

    /* renamed from: G */
    public int f229100G;

    /* renamed from: H */
    public boolean f229101H;

    /* renamed from: I */
    public Runnable f229102I;

    /* renamed from: J */
    public Set<Integer> f229103J;

    /* renamed from: K */
    public C6784h2 f229104K;

    /* renamed from: L */
    public C6784h2 f229105L;

    /* renamed from: M */
    public C73688g2 f229106M;

    /* renamed from: N */
    public C73688g2 f229107N;

    /* renamed from: P */
    public C72841x1 f229108P;

    /* renamed from: Q */
    public C72841x1 f229109Q;

    /* renamed from: R */
    public C45094u2 f229110R;

    /* renamed from: S */
    public C45094u2 f229111S;

    /* renamed from: T */
    public C44851e0 f229112T;

    /* renamed from: U */
    public C44851e0 f229113U;

    /* renamed from: V */
    public C45335p f229114V;

    /* renamed from: W */
    public final MTimerHandler f229115W;

    /* renamed from: X */
    public final View.OnLayoutChangeListener f229116X;

    /* renamed from: Y */
    public int f229117Y;

    /* renamed from: Z */
    public final C99865e0.C99869e f229118Z;

    /* renamed from: e */
    public final C67391b f229119e;

    /* renamed from: f */
    public final C72917n0 f229120f;

    /* renamed from: g */
    public final C13601g f229121g = C36568h.m40985a(new C78195g(this));

    /* renamed from: h */
    public final C13601g f229122h = C36568h.m40985a(new C78194f(this));

    /* renamed from: i */
    public final SparseIntArray f229123i = new SparseIntArray();

    /* renamed from: j */
    public final HashSet<Long> f229124j = new HashSet<>();

    /* renamed from: n */
    public long f229125n = -1;

    /* renamed from: o */
    public final Map<Long, WeakReference<View>> f229126o = new HashMap();

    /* renamed from: p */
    public final Map<Long, Integer> f229127p = new HashMap();

    /* renamed from: p0 */
    public final C101489t.C77595a f229128p0;

    /* renamed from: q */
    public long f229129q = -1;

    /* renamed from: r */
    public final int f229130r;

    /* renamed from: s */
    public final int f229131s;

    /* renamed from: t */
    public boolean f229132t;

    /* renamed from: u */
    public boolean f229133u;

    /* renamed from: v */
    public boolean f229134v;

    /* renamed from: w */
    public boolean f229135w;

    /* renamed from: x */
    public final CopyOnWriteArraySet<Long> f229136x;

    /* renamed from: x0 */
    public C75875l.C75877b f229137x0;

    /* renamed from: y */
    public View.OnClickListener f229138y;

    /* renamed from: z */
    public final SparseArray<C72963f4> f229139z;

    /* renamed from: uj3.b$b */
    public static final class C65400b extends C9507n {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65400b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: uj3.b$c */
    public static class C65401c implements C78208e {

        /* renamed from: b */
        public final C65400b f188206b;

        public C65401c(C65400b bVar) {
            C87412m.m108594g(bVar, "holder");
            this.f188206b = bVar;
        }

        public int getAdapterPosition() {
            C57545k0 k0Var;
            int j = this.f188206b.mo17363j();
            Object tag = this.f188206b.f44854d.getTag(C0966R.C0970id.msq);
            WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
            if (weakReference == null || (k0Var = (C57545k0) weakReference.get()) == null) {
                return j;
            }
            C65400b bVar = this.f188206b;
            C87412m.m108594g(bVar, "holder");
            return bVar.mo17363j() - k0Var.mo81318G4();
        }

        public C0000n0 getViewHolderScope() {
            return this.f188206b.f29679z;
        }

        public String toString() {
            return String.valueOf(getAdapterPosition());
        }
    }

    /* renamed from: uj3.b$a */
    public static final class C78191a extends RecyclerView.C16615g {
        /* renamed from: b */
        public void mo2556b() {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onChanged() called");
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onItemRangeChanged() called with: positionStart = " + i + ", itemCount = " + i2);
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onItemRangeChanged() called with: positionStart = " + i + ", itemCount = " + i2 + ", payload = " + obj);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onItemRangeInserted() called with: positionStart = " + i + ", itemCount = " + i2);
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onItemRangeMoved() called with: fromPosition = " + i + ", toPosition = " + i2 + ", itemCount = " + i3);
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "onItemRangeRemoved() called with: positionStart = " + i + ", itemCount = " + i2);
        }
    }

    /* renamed from: uj3.b$d */
    public static final class C78192d extends C87413o implements C32224a<C78421a> {

        /* renamed from: d */
        public static final C78192d f229140d = new C78192d();

        public C78192d() {
            super(0);
        }

        public Object invoke() {
            Set<Integer> set = C78421a.f229769b;
            HashSet hashSet = new HashSet();
            hashSet.addAll(C78421a.f229769b);
            if (!TextUtils.isEmpty("")) {
                try {
                    JSONArray optJSONArray = new JSONObject("").optJSONArray("noCompareTypes");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            int optInt = optJSONArray.optInt(i, -1);
                            if (optInt != -1) {
                                hashSet.add(Integer.valueOf(optInt));
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("ChattingViewConfig", th, "parse err", new Object[0]);
                }
            }
            C78421a aVar = new C78421a(hashSet);
            Log.m105925i("MicroMsg.ChattingDataAdapterV2", "viewConfig init:%s", aVar);
            return aVar;
        }
    }

    /* renamed from: uj3.b$e */
    public static final class C78193e {
        public C78193e(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo108226a(int i, RecyclerView recyclerView) {
            C87412m.m108594g(recyclerView, "rv");
            if (i >= 50) {
                recyclerView.setRecycledViewPool(new C76435a(i));
            }
        }

        /* renamed from: b */
        public final void mo108227b(int i, RecyclerView recyclerView) {
            RecyclerView.C16623q recycledViewPool;
            C87412m.m108594g(recyclerView, "rv");
            if (i >= 5 && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                int size = ((ArrayList) C74272u8.f218154a).size() + 2;
                for (int i2 = 0; i2 < size; i2++) {
                    recycledViewPool.mo17336e(i2, i);
                }
            }
        }

        /* renamed from: c */
        public final boolean mo108228c() {
            C104160f fVar = C104160f.RepairerConfig_Global_ChatEnterBlockOptimize_Int;
            return BuildInfo.DEBUG ? C79758p.f233760a.mo109882e(fVar, 1) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_chatting_enter_block_optimize_and, fVar, 1) == 1;
        }
    }

    /* renamed from: uj3.b$f */
    public static final class C78194f extends C87413o implements C32224a<LayoutInflater> {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78194f(C78190b bVar) {
            super(0);
            this.f229141d = bVar;
        }

        public Object invoke() {
            Object value = ((C36570n) this.f229141d.f229121g).getValue();
            C87412m.m108593f(value, "<get-mContext>(...)");
            return C85868k2.m106137b((Context) value);
        }
    }

    /* renamed from: uj3.b$g */
    public static final class C78195g extends C87413o implements C32224a<Activity> {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78195g(C78190b bVar) {
            super(0);
            this.f229142d = bVar;
        }

        public Object invoke() {
            return this.f229142d.f229119e.mo91565f();
        }
    }

    /* renamed from: uj3.b$h */
    public static final class C78196h implements C101489t.C77595a {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229143d;

        /* renamed from: uj3.b$h$a */
        public static final class C78197a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C101489t.C77595a.C77596a f229144d;

            /* renamed from: e */
            public final /* synthetic */ C78190b f229145e;

            /* renamed from: uj3.b$h$a$a */
            public static final class C78198a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C78190b f229146d;

                /* renamed from: e */
                public final /* synthetic */ C72963f4 f229147e;

                public C78198a(C78190b bVar, C72963f4 f4Var) {
                    this.f229146d = bVar;
                    this.f229147e = f4Var;
                }

                public final void run() {
                    C67391b bVar = this.f229146d.f229119e;
                    if (bVar != null) {
                        ((C53793s0) bVar.f193278b.mo102812a(C53793s0.class)).mo74367R4(this.f229147e, "");
                    }
                }
            }

            public C78197a(C101489t.C77595a.C77596a aVar, C78190b bVar) {
                this.f229144d = aVar;
                this.f229145e = bVar;
            }

            public final void run() {
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f229144d.f226215a);
                if (Zd != null) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Zd.f288567n);
                    if (!Util.isNullOrNil(b002.mo108765s2())) {
                        int type = b002.getType();
                        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "updateStatus, check revoke status msg type %d", Integer.valueOf(type));
                        if (43 != type && 62 != type && Zd.f288562i == 199 && b002.mo108774y2() != Zd.f288556c && C98429r0.m127830u()) {
                            Log.m105924i("MicroMsg.ChattingDataAdapterV2", "had uploaded after msg revoke, do revoke again");
                            b002.mo108745Y2(Zd.f288556c);
                            b002.setType(43);
                            ((C119157j) C119157j.f356862d).mo183895z(new C78198a(this.f229145e, b002));
                        }
                    }
                }
            }
        }

        /* renamed from: uj3.b$h$b */
        public static final class C78199b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C78190b f229148d;

            public C78199b(C78190b bVar) {
                this.f229148d = bVar;
            }

            public final void run() {
                this.f229148d.mo108171E0();
            }
        }

        public C78196h(C78190b bVar) {
            this.f229143d = bVar;
        }

        /* renamed from: d5 */
        public final void mo102579d5(C101489t.C77595a.C77596a aVar) {
            boolean z;
            int i;
            if (aVar == null || (i = aVar.f226218d) == 3 || !(i == 2 || i == -1 || i == 1)) {
                z = false;
            } else {
                z = C74123m7.m88223e(aVar);
                ((C119157j) C119157j.f356862d).mo183875f(new C78197a(aVar, this.f229143d));
            }
            if (!z) {
                MMHandlerThread.postToMainThread(new C78199b(this.f229143d));
            }
        }
    }

    /* renamed from: uj3.b$i */
    public static final class C78200i implements C99865e0.C99869e {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229149d;

        /* renamed from: uj3.b$i$a */
        public static final class C78201a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C78190b f229150d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78201a(C78190b bVar) {
                super(0);
                this.f229150d = bVar;
            }

            public Object invoke() {
                this.f229150d.mo108171E0();
                return C13598b0.f38549a;
            }
        }

        public C78200i(C78190b bVar) {
            this.f229149d = bVar;
        }

        /* renamed from: so */
        public void mo108219so(C102645g6 g6Var) {
            if (g6Var != null) {
                C61926c.m72668M(new C78201a(this.f229149d));
            }
        }
    }

    /* renamed from: uj3.b$j */
    public static final class C78202j implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229151d;

        public C78202j(C78190b bVar) {
            this.f229151d = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            /*
                r0 = this;
                int r9 = r9 - r7
                long r6 = (long) r9
                int r5 = r5 - r3
                long r2 = (long) r5
                r4 = 0
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 <= 0) goto L_0x0056
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x0056
                uj3.b r2 = r0.f229151d
                ck3.b r3 = r2.f229119e
                if (r3 == 0) goto L_0x0056
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x0019
                goto L_0x004c
            L_0x0019:
                java.lang.Object r1 = r1.getTag()
                boolean r5 = r1 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c
                if (r5 == 0) goto L_0x0024
                com.tencent.mm.ui.chatting.viewitems.i$c r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c) r1
                goto L_0x0025
            L_0x0024:
                r1 = 0
            L_0x0025:
                if (r1 == 0) goto L_0x004c
                int r1 = r1.getAdapterPosition()
                android.util.SparseArray<com.tencent.mm.storage.f4> r2 = r2.f229139z
                int r2 = r2.size()
                int r2 = r2 - r3
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                r5[r4] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                r5[r3] = r6
                java.lang.String r6 = "MicroMsg.ChattingDataAdapterV2"
                java.lang.String r7 = "isItemViewAtBottom() called with: curPos = %s, lastPos = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r5)
                if (r2 != r1) goto L_0x004c
                r1 = 1
                goto L_0x004d
            L_0x004c:
                r1 = 0
            L_0x004d:
                if (r1 == 0) goto L_0x0056
                uj3.b r1 = r0.f229151d
                ck3.b r1 = r1.f229119e
                r1.mo91542C(r4, r3, r3)
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uj3.C78190b.C78202j.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    }

    /* renamed from: uj3.b$k */
    public static final class C78203k implements C75875l.C75877b {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229152d;

        public C78203k(C78190b bVar) {
            this.f229152d = bVar;
        }

        /* renamed from: w5 */
        public final void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (lVar != null && eVar != null && eVar.f123844a != null && this.f229152d.f229119e.mo91577r() != null && C87412m.m108589b(eVar.f123844a, this.f229152d.f229119e.mo91577r())) {
                this.f229152d.mo108171E0();
            }
        }
    }

    /* renamed from: uj3.b$l */
    public static final class C78204l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229153d;

        public C78204l(C78190b bVar) {
            this.f229153d = bVar;
        }

        public final void run() {
            this.f229153d.mo81320c3((Object) null);
        }
    }

    /* renamed from: uj3.b$m */
    public static final class C78205m implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C78190b f229154d;

        public C78205m(C78190b bVar) {
            this.f229154d = bVar;
        }

        public final boolean onTimerExpired() {
            C67391b bVar = this.f229154d.f229119e;
            if (bVar == null || !bVar.f193283g) {
                return true;
            }
            Log.m105924i("MicroMsg.ChattingDataAdapterV2", "[onTimerExpired]");
            this.f229154d.mo108171E0();
            return true;
        }
    }

    public C78190b(C67391b bVar, C72917n0 n0Var) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(n0Var, "mListView");
        this.f229119e = bVar;
        this.f229120f = n0Var;
        this.f229130r = bVar.mo91572m().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.f229131s = bVar.mo91572m().getDimensionPixelSize(C0966R.dimen.f3906ig);
        this.f229136x = new CopyOnWriteArraySet<>();
        this.f229139z = new SparseArray<>();
        this.f229094A = -1;
        this.f229097D = -1;
        this.f229098E = -1;
        this.f229103J = new HashSet();
        bVar.mo91579t(C79368l.class, this);
        C6784h2 h2Var = new C6784h2();
        this.f229105L = h2Var;
        this.f229104K = h2Var;
        C73688g2 g2Var = new C73688g2(bVar);
        this.f229107N = g2Var;
        this.f229106M = g2Var;
        C72841x1 x1Var = new C72841x1(bVar.mo91565f());
        this.f229109Q = x1Var;
        this.f229108P = x1Var;
        C45094u2 u2Var = new C45094u2(bVar);
        this.f229111S = u2Var;
        this.f229110R = u2Var;
        C44851e0 e0Var = new C44851e0(bVar);
        this.f229113U = e0Var;
        this.f229112T = e0Var;
        this.f229114V = new C74349y3(bVar);
        mo108225y5();
        setHasStableIds(true);
        registerAdapterDataObserver(new C78191a());
        this.f229115W = new MTimerHandler(new C78205m(this), true);
        this.f229116X = new C78202j(this);
        new SparseArray();
        this.f229118Z = new C78200i(this);
        this.f229128p0 = new C78196h(this);
        this.f229137x0 = new C78203k(this);
    }

    /* renamed from: A1 */
    public C72841x1 mo108165A1() {
        return this.f229108P;
    }

    /* renamed from: A2 */
    public int mo108166A2(C72963f4 f4Var) {
        if (f4Var == null) {
            return -1;
        }
        SparseArray<C72963f4> sparseArray = this.f229139z;
        int i = 0;
        int size = sparseArray.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                int keyAt = sparseArray.keyAt(i);
                if (sparseArray.valueAt(i).getMsgId() == f4Var.getMsgId()) {
                    return keyAt;
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return -1;
    }

    /* renamed from: B4 */
    public void mo108167B4() {
        C78606a aVar;
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[unLockNotify] isLockNotify:%s notifyCountWhileLock:%s", Boolean.valueOf(this.f229099F), Integer.valueOf(this.f229100G));
        if (this.f229099F) {
            this.f229099F = false;
            if (this.f229100G > 0 && (aVar = this.f229095B) != null) {
                aVar.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, (Bundle) null);
            }
            this.f229100G = 0;
        }
    }

    /* renamed from: D2 */
    public C44851e0 mo108168D2() {
        return this.f229112T;
    }

    /* renamed from: D4 */
    public void mo108169D4(Runnable runnable) {
        this.f229102I = runnable;
    }

    /* renamed from: D5 */
    public void mo108170D5(int i, int i2) {
        C72996z1 o;
        String content;
        C68070l.C68072b u;
        C74023i a;
        String y;
        String username;
        int i3 = i;
        int i4 = i2;
        Class cls = C45696d.class;
        C67391b bVar = this.f229119e;
        if (bVar != null && (o = bVar.mo91574o()) != null) {
            LinkedList linkedList = new LinkedList();
            boolean Cl0 = ((C45696d) C86709a0.m107533q(cls)).Cl0();
            if (o.mo62916m3()) {
                ArrayList arrayList = new ArrayList();
                if (i3 <= i4) {
                    while (true) {
                        C72963f4 w5 = mo108224w5(i3);
                        if (w5 != null && w5.getType() == 285212721) {
                            Log.m105926v("MicroMsg.ChattingDataAdapterV2", "terry checkpreload:" + w5.getMsgId());
                            String content2 = w5.getContent();
                            C87412m.m108593f(content2, "msg.content");
                            arrayList.add(new String[]{String.valueOf(w5.getMsgId()), content2, "-1"});
                            C48299e eVar = new C48299e();
                            eVar.f129340h = w5.getMsgId();
                            eVar.f129339g = w5.getContent();
                            if (Cl0) {
                                linkedList.add(eVar);
                            }
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3++;
                    }
                }
                if (arrayList.size() > 0) {
                    ((C45696d) C86709a0.m107533q(cls)).n90(arrayList, 0);
                    if (Cl0) {
                        ((C45696d) C86709a0.m107533q(cls)).mo71016xs(linkedList, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            LinkedList linkedList2 = new LinkedList();
            if (i3 <= i4) {
                while (true) {
                    C72963f4 w54 = mo108224w5(i3);
                    if (!(w54 == null || (w54.getType() & 49) == 0 || (content = w54.getContent()) == null || (u = C68070l.C68072b.m80422u(content, w54.mo108775z2())) == null || TextUtils.isEmpty(u.f195586j))) {
                        String str = u.f195586j;
                        C87412m.m108593f(str, "content.url");
                        String domainString = WeChatHosts.domainString(C0966R.string.f360885fm3);
                        C87412m.m108593f(domainString, "domainString(\n          …                        )");
                        if (!(!C112550d0.m153801u(str, domainString, false) || (a = C74272u8.m88589a(w54)) == null || (y = a.mo103068y(this.f229119e, w54)) == null || (username = o.getUsername()) == null)) {
                            int b = C45629t0.m50815b(y, this.f229119e.mo91577r());
                            int i5 = -1;
                            C68065f fVar = (C68065f) u.mo93555w(C68065f.class);
                            if (fVar != null) {
                                i5 = fVar.f195417b;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            String str2 = u.f195586j;
                            C87412m.m108593f(str2, "content.url");
                            arrayList2.add(str2);
                            arrayList2.add(String.valueOf(i5));
                            arrayList2.add(String.valueOf(w54.mo108774y2()));
                            arrayList2.add(username);
                            arrayList2.add(String.valueOf(b));
                            arrayList2.add(y);
                            arrayList2.add(String.valueOf(w54.getCreateTime()));
                            arrayList2.add(String.valueOf(((C45696d) C86709a0.m107533q(cls)).mo70963J2(username)));
                            linkedList2.add(arrayList2);
                        }
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            if (linkedList2.size() > 0) {
                ((C45696d) C86709a0.m107533q(cls)).mo71004o8(linkedList2, 1);
            }
        }
    }

    /* renamed from: E0 */
    public void mo108171E0() {
        if (this.f229099F) {
            this.f229100G++;
            Log.m105924i("MicroMsg.ChattingDataAdapterV2", "[handleMsgChange] isLockNotify:" + this.f229100G);
        } else if (!this.f229101H) {
            Log.m105924i("MicroMsg.ChattingDataAdapterV2", "[handleMsgChange] is not resumeState ");
        } else {
            C78606a aVar = this.f229095B;
            C87412m.m108591d(aVar);
            aVar.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, (Bundle) null);
        }
    }

    /* renamed from: E5 */
    public void mo108172E5(int i, C76227e.C76228a aVar) {
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[locationByMsgId] position:%s mode:%s", Integer.valueOf(i), aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("MSG_POSITION", i);
        bundle.putInt("SCENE", 2);
        C78606a aVar2 = this.f229095B;
        if (aVar2 != null) {
            aVar2.mo108594d(aVar, false, bundle);
        }
    }

    /* renamed from: F4 */
    public void mo10187F4(C9507n nVar, int i) {
        C65400b bVar = (C65400b) nVar;
        C87412m.m108594g(bVar, "holder");
        mo10188G4(bVar, i, new ArrayList());
    }

    /* renamed from: G */
    public void mo108173G(long j, boolean z) {
        if (((HashMap) this.f229126o).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229127p).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229126o).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
                    C74152o6.C74155b.m88311p0((C74023i.C74026c) tag, z);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "msg not display, " + j);
    }

    /* renamed from: G1 */
    public void mo108174G1() {
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[lockNotify] isLockNotify:%s notifyCountWhileLock:%s", Boolean.valueOf(this.f229099F), Integer.valueOf(this.f229100G));
        if (!this.f229099F) {
            this.f229099F = true;
            this.f229100G = 0;
        }
    }

    /* renamed from: K1 */
    public SparseArray<C72963f4> mo108175K1() {
        return this.f229139z;
    }

    /* renamed from: L */
    public void mo108176L(boolean z) {
        this.f229133u = z;
    }

    /* renamed from: L4 */
    public long mo108177L4() {
        long j = this.f229098E;
        if (j != this.f229097D) {
            return j;
        }
        this.f229098E = 0;
        int size = this.f229139z.size() - 1;
        while (true) {
            if (-1 >= size) {
                break;
            }
            C72963f4 item = getItem(size);
            boolean z = false;
            if (item != null && item.mo108769t2() == 1) {
                z = true;
            }
            if (z && (item.f230723F & 4) != 4) {
                this.f229098E = item.getMsgId();
                break;
            }
            size--;
        }
        return this.f229098E;
    }

    /* renamed from: L5 */
    public void mo108178L5(C78606a aVar) {
        this.f229095B = aVar;
    }

    /* renamed from: M2 */
    public void mo108179M2() {
        this.f229132t = false;
        mo81320c3((Object) null);
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "enable ClickListener");
        this.f229104K = this.f229105L;
        this.f229106M = this.f229107N;
        this.f229108P = this.f229109Q;
        this.f229110R = this.f229111S;
        this.f229112T = this.f229113U;
    }

    /* renamed from: M3 */
    public void mo108180M3(int i, int i2) {
        C72996z1 o;
        String content;
        C68070l.C68072b u;
        C67391b bVar = this.f229119e;
        if (bVar != null && (o = bVar.mo91574o()) != null && !o.mo62916m3()) {
            LinkedList linkedList = new LinkedList();
            if (i <= i2) {
                while (true) {
                    C72963f4 w5 = mo108224w5(i);
                    if (!(w5 == null || (content = w5.getContent()) == null || (u = C68070l.C68072b.m80422u(content, w5.mo108775z2())) == null || u.f195582i != 5 || TextUtils.isEmpty(u.f195586j))) {
                        C45700h.C45702b bVar2 = new C45700h.C45702b();
                        bVar2.f123504a = u.f195586j;
                        bVar2.f123506c = 1;
                        bVar2.f123508e = u.f195562d;
                        bVar2.f123509f = u.f195570f;
                        bVar2.f123510g = u.f195574g;
                        bVar2.f123511h = this.f229119e.mo91583x() ? "groupmessage" : "singlemessage";
                        bVar2.f123507d = 2;
                        linkedList.add(bVar2);
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            if (((C45696d) C86709a0.m107533q(C45696d.class)) != null && linkedList.size() > 0) {
                Log.m105927v("MicroMsg.ChattingDataAdapterV2", "[TRACE_PREFETCH] checkPreAuths authInfo size = %s", Integer.valueOf(linkedList.size()));
                ((C45700h) C86709a0.m107533q(C45700h.class)).mo71026A3(linkedList, 2);
            }
        }
    }

    /* renamed from: M5 */
    public int mo108181M5() {
        return this.f229136x.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo108183N0(long r10) {
        /*
            r9 = this;
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r0 = r9.f229136x
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            boolean r0 = r0.contains(r1)
            java.lang.String r1 = "MicroMsg.ChattingDataAdapterV2"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r2] = r4
            java.lang.String r4 = "remove select item, msgId = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r0 = r9.f229136x
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0.remove(r1)
            goto L_0x0099
        L_0x0027:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r2] = r4
            java.lang.String r4 = "add select item, msgId = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r0 = r9.f229136x
            int r0 = r0.size()
            boolean r1 = r9.f229133u
            r4 = 99
            if (r1 == 0) goto L_0x0045
            int r1 = km2.C33942d.m40199a()
            goto L_0x0047
        L_0x0045:
            r1 = 99
        L_0x0047:
            if (r0 < r1) goto L_0x0090
            boolean r10 = r9.f229133u
            if (r10 == 0) goto L_0x0069
            ck3.b r10 = r9.f229119e
            android.content.res.Resources r10 = r10.mo91572m()
            r11 = 2131825179(0x7f11121b, float:1.9283207E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r10 = r10.getString(r11, r0)
            java.lang.String r11 = "{\n                    co…MsgNum)\n                }"
            gy3.C87412m.m108593f(r10, r11)
            goto L_0x0084
        L_0x0069:
            ck3.b r10 = r9.f229119e
            android.content.res.Resources r10 = r10.mo91572m()
            r11 = 2131825178(0x7f11121a, float:1.9283205E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r2] = r1
            java.lang.String r10 = r10.getString(r11, r0)
            java.lang.String r11 = "{\n                    co…      )\n                }"
            gy3.C87412m.m108593f(r10, r11)
        L_0x0084:
            ck3.b r11 = r9.f229119e
            android.app.Activity r11 = r11.mo91565f()
            java.lang.String r0 = ""
            nj3.C76879j.m92748s(r11, r10, r0)
            return r2
        L_0x0090:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r0 = r9.f229136x
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0.add(r1)
        L_0x0099:
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r9.f229120f
            r1 = 0
            if (r0 != 0) goto L_0x00a0
        L_0x009e:
            r5 = r1
            goto L_0x00d8
        L_0x00a0:
            int r4 = r0.getChildCount()
        L_0x00a4:
            if (r2 >= r4) goto L_0x009e
            android.view.View r5 = r0.getChildAt(r2)
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r6 = r5.getTag()
            goto L_0x00b2
        L_0x00b1:
            r6 = r1
        L_0x00b2:
            boolean r7 = r6 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c
            if (r7 == 0) goto L_0x00b9
            com.tencent.mm.ui.chatting.viewitems.i$c r6 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c) r6
            goto L_0x00ba
        L_0x00b9:
            r6 = r1
        L_0x00ba:
            if (r6 == 0) goto L_0x00d5
            android.view.View r6 = r6.maskView
            if (r6 != 0) goto L_0x00c1
            goto L_0x00d5
        L_0x00c1:
            java.lang.Object r6 = r6.getTag()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r6, r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00d5
            goto L_0x00d8
        L_0x00d5:
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00d8:
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r0 = r5.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.chatting.viewitems.i$c r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c) r0
            android.widget.CheckBox r1 = r0.checkBox
            if (r1 == 0) goto L_0x0102
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0102
            android.widget.CheckBox r0 = r0.checkBox
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r1 = r9.f229136x
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r10 = r1.contains(r10)
            r0.setChecked(r10)
            goto L_0x0102
        L_0x00ff:
            r9.mo81320c3(r1)
        L_0x0102:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.C78190b.mo108183N0(long):boolean");
    }

    /* renamed from: N5 */
    public void onViewRecycled(C65400b bVar) {
        C87412m.m108594g(bVar, "holder");
        super.onViewRecycled(bVar);
        View view = bVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
        C74023i.C74026c cVar = (C74023i.C74026c) tag;
        cVar.chattingItem.mo103085b0(cVar);
    }

    /* renamed from: O4 */
    public C9507n mo10189O4(ViewGroup viewGroup, int i) {
        C74023i iVar;
        C87412m.m108594g(viewGroup, "parent");
        long currentTimeMillis = System.currentTimeMillis();
        C74023i d = C74272u8.m88592d(i);
        if (d != null) {
            try {
                iVar = (C74023i) d.getClass().newInstance();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Chatting.ItemFactory", th, "", new Object[0]);
            }
            Object value = ((C36570n) this.f229122h).getValue();
            C87412m.m108593f(value, "<get-inflater>(...)");
            View E = iVar.mo26231E((LayoutInflater) value, (View) null);
            Object tag = E.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
            ((C74023i.C74026c) tag).setChattingItem(iVar);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C65400b bVar = new C65400b(E);
            Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[onCreateView] called viewType = " + i + " viewHolder@:" + bVar.hashCode() + " cost=%s", Long.valueOf(currentTimeMillis2));
            return bVar;
        }
        iVar = new C74059i7.C74060a();
        Object value2 = ((C36570n) this.f229122h).getValue();
        C87412m.m108593f(value2, "<get-inflater>(...)");
        View E2 = iVar.mo26231E((LayoutInflater) value2, (View) null);
        Object tag2 = E2.getTag();
        C87412m.m108592e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
        ((C74023i.C74026c) tag2).setChattingItem(iVar);
        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
        C65400b bVar2 = new C65400b(E2);
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[onCreateView] called viewType = " + i + " viewHolder@:" + bVar2.hashCode() + " cost=%s", Long.valueOf(currentTimeMillis22));
        return bVar2;
    }

    /* renamed from: T1 */
    public void mo108184T1(long j, int i, int i2) {
        if (((HashMap) this.f229126o).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229127p).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229126o).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
                    C74152o6.C74155b.m88310o0((C74023i.C74026c) tag, i, i2);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "msg not display, " + j);
    }

    /* renamed from: T3 */
    public void mo108185T3(int i) {
        C72963f4 item = getItem(i);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        if (item == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[setShowHistoryMsgTipId] pos:%s msg is null? %s", objArr);
        if (!(item == null || item.getMsgId() == 0)) {
            this.f229125n = item.getMsgId();
        }
        mo81320c3((Object) null);
    }

    /* renamed from: V */
    public void mo108186V(long j, C72963f4 f4Var, boolean z) {
        if (((HashMap) this.f229126o).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229127p).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229126o).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
                    C74152o6.C74153a.m88300o0(this.f229119e.mo91565f(), (C74023i.C74026c) tag, f4Var, z);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "msg not display, " + j);
    }

    /* renamed from: V4 */
    public void mo108187V4() {
        this.f229135w = true;
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "disable clickListener");
        this.f229104K = null;
        this.f229106M = null;
        this.f229108P = null;
        this.f229110R = null;
        this.f229112T = null;
    }

    /* renamed from: Z4 */
    public C6784h2 mo108189Z4() {
        return this.f229104K;
    }

    /* renamed from: b0 */
    public boolean mo108190b0(C72963f4 f4Var) {
        return f4Var != null && C78180a.m94381A(f4Var);
    }

    /* renamed from: c3 */
    public void mo81320c3(Object obj) {
        C54248l.C54251c cVar;
        int size = this.f229139z.size();
        boolean z = obj instanceof C76227e.C76230d;
        boolean z2 = z && ((C76227e.C76230d) obj).f223316j != null;
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "_notifyDataSetChanged2 called lastNotifyCount:" + this.f229117Y + " cur:" + size + " isDiffValid：" + z2);
        if (z2) {
            C76227e.C76230d dVar = z ? (C76227e.C76230d) obj : null;
            if (!(dVar == null || (cVar = dVar.f223316j) == null)) {
                cVar.mo75046b(this);
            }
        } else {
            notifyDataSetChanged();
        }
        this.f229117Y = size;
        this.f229123i.clear();
        Runnable runnable = this.f229102I;
        if (runnable != null) {
            runnable.run();
        }
        ((HashSet) this.f229103J).clear();
        C67391b bVar = this.f229119e;
        bVar.f193293q = true;
        bVar.mo91570k().setVisibility(0);
        ((ChattingUIFragment) this.f229119e.f193288l).mo102097u0(false);
    }

    /* renamed from: d1 */
    public void mo108191d1(boolean z) {
        if (this.f229134v != z) {
            this.f229134v = z;
            mo81320c3((Object) null);
        }
    }

    /* renamed from: d2 */
    public void mo108192d2() {
        this.f229136x.clear();
    }

    /* renamed from: e5 */
    public void mo108193e5(C72963f4 f4Var) {
        this.f229132t = true;
        mo81320c3((Object) null);
        Log.m105918d("MicroMsg.ChattingDataAdapterV2", "disable clickListener");
        this.f229104K = null;
        this.f229106M = null;
        this.f229108P = null;
        this.f229110R = null;
        this.f229112T = null;
    }

    /* renamed from: f4 */
    public C101489t.C77595a mo108194f4() {
        return this.f229128p0;
    }

    public void finish() {
        this.f229125n = -1;
        this.f229123i.clear();
    }

    public int getCount() {
        return this.f229139z.size();
    }

    public C73688g2 getDoubleClickListener() {
        return this.f229106M;
    }

    public int getItemCount() {
        return this.f229139z.size();
    }

    public long getItemId(int i) {
        C72963f4 item = getItem(i);
        if (item != null) {
            return item.getMsgId();
        }
        return -1;
    }

    public int getItemViewType(int i) {
        return C74272u8.m88590b(getItem(i));
    }

    /* renamed from: i0 */
    public void mo108201i0(int i) {
        C72963f4 item = getItem(i);
        if (item != null && item.getMsgId() != 0) {
            this.f229124j.add(Long.valueOf(item.getMsgId()));
        }
    }

    /* renamed from: j */
    public C20937c mo108202j() {
        if (this.f229096C == null) {
            mo108225y5();
        }
        return this.f229096C;
    }

    /* renamed from: m5 */
    public C99865e0.C99869e mo108203m5() {
        return this.f229118Z;
    }

    /* renamed from: n2 */
    public void mo91530n2(int i, boolean z) {
    }

    /* renamed from: p */
    public int mo108205p() {
        if (-1 == this.f229094A) {
            this.f229094A = ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f229119e.mo91577r());
        }
        return this.f229094A;
    }

    /* renamed from: p3 */
    public Set<Long> mo108206p3() {
        return this.f229136x;
    }

    /* renamed from: p4 */
    public void mo108207p4(C76227e.C76228a aVar) {
        C78606a aVar2 = this.f229095B;
        if (aVar2 != null) {
            aVar2.mo108594d(aVar, false, (Bundle) null);
        }
    }

    public void pause() {
        this.f229101H = false;
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this.f229137x0);
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f229114V);
        Log.m105924i("MicroMsg.ChattingDataAdapterV2", "adapter pause");
        this.f229115W.stopTimer();
    }

    public void resume() {
        this.f229101H = true;
        Log.m105924i("MicroMsg.ChattingDataAdapterV2", "adapter resume");
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this.f229137x0, Looper.getMainLooper());
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f229114V);
        this.f229115W.startTimer((long) 300000);
        if (this.f229095B != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("SCENE", 3);
            C78606a aVar = this.f229095B;
            if (aVar != null) {
                aVar.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, bundle);
            }
        }
    }

    /* renamed from: s2 */
    public C45094u2 mo108210s2() {
        return this.f229110R;
    }

    /* renamed from: t5 */
    public void mo108211t5(View.OnClickListener onClickListener) {
        this.f229138y = onClickListener;
    }

    /* renamed from: u5 */
    public void mo10188G4(C65400b bVar, int i, List<Object> list) {
        boolean z;
        C72963f4 f4Var;
        C74023i.C74026c cVar;
        String str;
        C65400b bVar2 = bVar;
        int i2 = i;
        C87412m.m108594g(bVar2, "holder");
        C87412m.m108594g(list, "payloads");
        C72963f4 item = getItem(i2);
        if (item != null) {
            Log.m105924i("MicroMsg.ChattingDataAdapterV2", "[onBindView] position:" + i2 + " msgId:" + item.getMsgId() + " svrId:" + item.mo108774y2() + " type:" + item.getType() + " send:" + item.mo108769t2() + " talker:" + item.mo108768t() + " msgSep:" + item.mo108772w2() + " time:" + item.getCreateTime() + "convertView@:" + bVar2.f44854d.hashCode() + ",viewHolder@:" + bVar.hashCode());
            if (i2 != 0 && this.f229123i.get(i2) == 0) {
                C72963f4 item2 = getItem(i2 - 1);
                long createTime = item.getCreateTime() - (item2 != null ? item2.getCreateTime() : 0);
                int i3 = (createTime > 0 ? 1 : (createTime == 0 ? 0 : -1));
                boolean z2 = i3 > 0 && createTime < 60000;
                boolean z3 = i3 > 0 && createTime / ((long) 180000) < 1;
                if (z2 || z3) {
                    this.f229123i.put(i2, 2);
                } else {
                    this.f229123i.put(i2, 1);
                }
            }
            boolean z4 = (this.f229123i.get(i2) == 1 || i2 == 0 || this.f229124j.contains(Long.valueOf(item.getMsgId())) || ((item.f230723F & 262144) != 0)) && item.getCreateTime() > 1000;
            boolean z5 = item.getMsgId() == this.f229125n;
            View view = bVar2.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            C65401c cVar2 = new C65401c(bVar2);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
            C74023i.C74026c cVar3 = (C74023i.C74026c) tag;
            long currentTimeMillis = System.currentTimeMillis();
            if (z4) {
                cVar3.timeTV.setVisibility(0);
                z = z5;
                cVar3.timeTV.setText(C72715f.m85112e(this.f229119e.mo91565f(), item.getCreateTime(), false));
                if (cVar3.timeTV.getTextSize() > ((float) C76577a.m92151b(this.f229119e.mo91565f(), 25))) {
                    Log.m105921e("MicroMsg.ChattingDataAdapterV2", "WDF!!! TextSize:%s", Float.valueOf(cVar3.timeTV.getTextSize()));
                }
            } else {
                z = z5;
                cVar3.timeTV.setVisibility(8);
            }
            View view2 = cVar3.historyMsgTip;
            if (view2 != null) {
                if (z) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view2;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (this.f229129q == -1) {
                C72963f4 ov02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).ov0(this.f229119e.mo91577r());
                if (ov02 != null) {
                    this.f229129q = ov02.getMsgId();
                } else {
                    this.f229129q = 0;
                }
            }
            if (cVar3.noMoreMsgTip != null) {
                if (this.f229133u) {
                    f4Var = item;
                    if (item.getMsgId() == this.f229129q) {
                        View view5 = cVar3.noMoreMsgTip;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    f4Var = item;
                }
                View view7 = cVar3.noMoreMsgTip;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                f4Var = item;
            }
            C78180a.m94382I(cVar3, f4Var, cVar2, this.f229119e);
            C78404m O1 = ((C79345d) this.f229119e.f193278b.mo102812a(C79345d.class)).mo70145O1();
            C87412m.m108593f(O1, "context.component<IBackg…        ).getChatBgAttr()");
            if (cVar3.timeTV.getVisibility() == 0) {
                cVar3.timeTV.setTextColor(O1.f229734a);
                if (O1.f229735b) {
                    cVar3.timeTV.setShadowLayer(2.0f, 1.2f, 1.2f, O1.f229736c);
                } else {
                    cVar3.timeTV.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                if (O1.f229737d) {
                    if (O1.f229738e) {
                        cVar3.timeTV.setBackgroundResource(C0966R.C0969drawable.f4747lp);
                    } else {
                        cVar3.timeTV.setBackgroundResource(C0966R.C0969drawable.f4746lo);
                    }
                    TextView textView = cVar3.timeTV;
                    int i4 = this.f229131s;
                    int i5 = this.f229130r;
                    textView.setPadding(i4, i5, i4, i5);
                } else {
                    cVar3.timeTV.setBackgroundColor(0);
                }
            }
            TextView textView2 = cVar3.userTV;
            if (textView2 != null && textView2.getVisibility() == 0 && !C87412m.m108589b(this.f229119e.mo91577r(), "qqmail") && f4Var.getType() != 318767153) {
                if (O1.f229738e) {
                    cVar3.userTV.setTextColor(-1);
                    TextView textView3 = cVar3.userTV;
                    textView3.setShadowLayer((float) C76577a.m92151b(textView3.getContext(), 2), 0.0f, (float) C76577a.m92151b(cVar3.userTV.getContext(), 1), this.f229119e.mo91572m().getColor(C0966R.color.BW_0_Alpha_0_5));
                } else {
                    cVar3.userTV.setTextColor(O1.f229734a);
                    cVar3.userTV.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
            }
            View view9 = cVar3.maskView;
            if (view9 != null) {
                view9.setTag(Long.valueOf(f4Var.getMsgId()));
            }
            if ((!this.f229132t || !C78180a.m94381A(f4Var)) && !this.f229135w) {
                cVar3.showEditView(false);
            } else {
                CheckBox checkBox = cVar3.checkBox;
                if (checkBox != null) {
                    checkBox.setChecked(this.f229136x.contains(Long.valueOf(f4Var.getMsgId())));
                }
                View view10 = cVar3.maskView;
                if (view10 != null) {
                    view10.setOnClickListener(this.f229138y);
                }
                cVar3.showEditView(true);
            }
            if (!this.f229132t || !this.f229134v || this.f229136x.contains(Long.valueOf(f4Var.getMsgId()))) {
                cVar = cVar3;
                str = "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder";
                View view11 = view;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(Float.valueOf(1.0f));
                View view12 = view11;
                C117292a.m165358d(view12, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view11.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(Float.valueOf(0.5f));
                cVar = cVar3;
                str = "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder";
                View view13 = view;
                C117292a.m165358d(view, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view13.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2", "dealItemView", "(Landroid/view/View;Lcom/tencent/mm/storage/MsgInfo;ZZLcom/tencent/mm/ui/chatting/adapter/ChattingDataAdapterV2$ChattingViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            Log.m105919d("MicroMsg.ChattingDataAdapterV2", "dealItemView() ChattingItem:%s costTime:%s", cVar.chattingItem, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            Iterator it = ((HashMap) this.f229126o).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                long longValue = ((Number) entry.getKey()).longValue();
                WeakReference weakReference = (WeakReference) entry.getValue();
                if (weakReference != null && ((View) weakReference.get()) == bVar2.f44854d) {
                    ((HashMap) this.f229126o).remove(Long.valueOf(longValue));
                    ((HashMap) this.f229127p).remove(Long.valueOf(longValue));
                    break;
                }
            }
            ((HashMap) this.f229126o).put(Long.valueOf(f4Var.getMsgId()), new WeakReference(bVar2.f44854d));
            if (f4Var.mo100979R3()) {
                ((HashMap) this.f229127p).put(Long.valueOf(f4Var.getMsgId()), Integer.valueOf(f4Var.mo108769t2()));
            }
            View view14 = bVar2.f44854d;
            if (view14 != null) {
                Object tag2 = view14.getTag();
                C87412m.m108592e(tag2, str);
                if (((C74023i.C74026c) tag2).chattingItem.mo103082P()) {
                    view14.addOnLayoutChangeListener(this.f229116X);
                }
            }
        }
    }

    /* renamed from: v */
    public View mo108212v(long j) {
        if (!this.f229126o.containsKey(Long.valueOf(j))) {
            Log.m105918d("MicroMsg.ChattingDataAdapterV2", "msg not display, " + j);
            return null;
        }
        WeakReference weakReference = this.f229126o.get(Long.valueOf(j));
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: v1 */
    public boolean mo108213v1() {
        return this.f229132t;
    }

    /* renamed from: w5 */
    public final C72963f4 mo108224w5(int i) {
        int i2 = i - 1;
        SparseArray<C72963f4> sparseArray = this.f229139z;
        if (sparseArray == null || i2 < 0 || i2 >= sparseArray.size()) {
            return null;
        }
        return this.f229139z.get(i2);
    }

    /* renamed from: y2 */
    public void mo108214y2(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, C76227e.C76228a aVar) {
        Log.m105925i("MicroMsg.ChattingDataAdapterV2", "[locationByMsgId] messageId:%s loadAllBottomMsg:%s mode:%s topOffset:%s", Long.valueOf(j), Boolean.valueOf(z), aVar, Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putLong("MSG_ID", j);
        bundle.putInt("SCENE", 1);
        bundle.putBoolean("IS_LOAD_ALL", z);
        bundle.putBoolean("IS_HIGHLIGHT_ITEM", z2);
        bundle.putBoolean("IS_IDLE_VISBLE", z3);
        bundle.putInt("SELECTION_TOP_OFFSET", i);
        bundle.putBoolean("IS_SMOOTH_SCROLL", z4);
        C78606a aVar2 = this.f229095B;
        if (aVar2 != null) {
            aVar2.mo108594d(aVar, true, bundle);
        }
    }

    /* renamed from: y5 */
    public final void mo108225y5() {
        if (this.f229096C == null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C48340e.m53671l(this.f229119e.mo91577r());
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            try {
                this.f229096C = bVar.mo32666a();
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.ChattingDataAdapterV2", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: z1 */
    public void mo91031z1() {
        this.f229119e.mo91571l().post(new C78204l(this));
    }

    public C72963f4 getItem(int i) {
        return this.f229139z.get(i);
    }
}

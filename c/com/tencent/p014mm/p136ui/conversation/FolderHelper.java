package com.tencent.p014mm.p136ui.conversation;

import ai3.C112789a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi3.C67247c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetConvEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TopSessionFoldStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31461f3;
import eb0.C75592q0;
import eb0.C97625j3;
import fy3.C32224a;
import g62.C45881a;
import g62.C75875l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kl3.C76598b;
import kr0.C34010q0;
import o40.C61926c;
import p740wo.C53193b;
import rx3.C13598b0;
import te3.C64418hb3;
import te3.C77946ib3;
import vd2.C78383a;
import vd2.C78384d;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.FolderHelper */
public class FolderHelper implements C31461f3, MStorageEx.IOnStorageChange, C75875l.C75877b {

    /* renamed from: A */
    public int f219394A = 50;

    /* renamed from: B */
    public boolean f219395B;

    /* renamed from: C */
    public boolean f219396C;

    /* renamed from: D */
    public boolean f219397D;

    /* renamed from: E */
    public C76598b f219398E;

    /* renamed from: F */
    public final IListener<GetConvEvent> f219399F = new FolderHelper$convBoxEventListener$1(this, C40008f.f107254d);

    /* renamed from: G */
    public boolean f219400G;

    /* renamed from: H */
    public int f219401H = -1;

    /* renamed from: I */
    public int f219402I = -1;

    /* renamed from: J */
    public int f219403J = -1;

    /* renamed from: K */
    public long f219404K;

    /* renamed from: d */
    public C74720p f219405d;

    /* renamed from: e */
    public Context f219406e;

    /* renamed from: f */
    public ConversationListView f219407f;

    /* renamed from: g */
    public C78802b f219408g;

    /* renamed from: h */
    public LinearLayout f219409h;

    /* renamed from: i */
    public View f219410i;

    /* renamed from: j */
    public TextView f219411j;

    /* renamed from: n */
    public int f219412n;

    /* renamed from: o */
    public int f219413o;

    /* renamed from: p */
    public int f219414p;

    /* renamed from: q */
    public int f219415q;

    /* renamed from: r */
    public int f219416r;

    /* renamed from: s */
    public int f219417s;

    /* renamed from: t */
    public final long f219418t = 250;

    /* renamed from: u */
    public final long f219419u = 100;

    /* renamed from: v */
    public int f219420v;

    /* renamed from: w */
    public int f219421w = -1;

    /* renamed from: x */
    public boolean f219422x;

    /* renamed from: y */
    public int f219423y;

    /* renamed from: z */
    public int f219424z;

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$a */
    public interface C44909a {
        /* renamed from: a */
        void mo70206a(C74720p.C74733m mVar);

        /* renamed from: b */
        void mo70207b();
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$b */
    public static final class C74641b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FolderHelper f219425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74641b(FolderHelper folderHelper) {
            super(0);
            this.f219425d = folderHelper;
        }

        public Object invoke() {
            FolderHelper.m89356g(this.f219425d, 8, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$c */
    public static final class C74642c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FolderHelper f219426d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f219427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74642c(FolderHelper folderHelper, C72963f4 f4Var) {
            super(0);
            this.f219426d = folderHelper;
            this.f219427e = f4Var;
        }

        public Object invoke() {
            this.f219426d.mo103783e(this.f219427e.mo108768t(), true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$d */
    public static final class C74643d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FolderHelper f219428d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f219429e;

        /* renamed from: f */
        public final /* synthetic */ C75875l.C45886e f219430f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74643d(FolderHelper folderHelper, C72963f4 f4Var, C75875l.C45886e eVar) {
            super(0);
            this.f219428d = folderHelper;
            this.f219429e = f4Var;
            this.f219430f = eVar;
        }

        public Object invoke() {
            C68070l.C68072b u;
            FolderHelper folderHelper = this.f219428d;
            C72963f4 f4Var = this.f219429e;
            String str = this.f219430f.f123844a;
            C87412m.m108593f(str, "notifyInfo.talker");
            folderHelper.getClass();
            C64418hb3 hb32 = new C64418hb3();
            if (f4Var.getType() == 889192497) {
                hb32 = ((C78384d) C86312j.m106911c(C78384d.class)).mo108125bB(f4Var.getContent());
                C87412m.m108593f(hb32, "getService(IPatMsgExtens…gContent(msgInfo.content)");
            } else if (f4Var.getType() == 922746929 && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
                hb32 = ((C78383a) u.mo93555w(C78383a.class)).f229698b;
                C87412m.m108593f(hb32, "content.piece(AppMsgCont…class.java).patMsgContent");
            }
            try {
                if (hb32.f183464e.size() > 0) {
                    C77946ib3 last = hb32.f183464e.getLast();
                    String s = C75592q0.m90789s();
                    Log.m105924i("MicroMsg.FolderHelper", "dealPatMsg, self: " + s + ", fromUser: " + last.f227607d + ", isNewPatMsg: " + last.f227614n + ", isCollapse: " + folderHelper.mo103796s());
                    if (!C87412m.m108589b(last.f227607d, s) && last.f227614n == 0) {
                        folderHelper.mo103783e(str, true);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FolderHelper", e, "", new Object[0]);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$e */
    public static final class C74644e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FolderHelper f219431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74644e(FolderHelper folderHelper) {
            super(0);
            this.f219431d = folderHelper;
        }

        public Object invoke() {
            FolderHelper.m89356g(this.f219431d, 8, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$f */
    public static final class C74645f implements C44909a {

        /* renamed from: a */
        public final /* synthetic */ C8478d0 f219432a;

        /* renamed from: b */
        public final /* synthetic */ int f219433b;

        /* renamed from: c */
        public final /* synthetic */ FolderHelper f219434c;

        public C74645f(C8478d0 d0Var, int i, FolderHelper folderHelper) {
            this.f219432a = d0Var;
            this.f219433b = i;
            this.f219434c = folderHelper;
        }

        /* renamed from: a */
        public void mo70206a(C74720p.C74733m mVar) {
            if (this.f219432a.f27483d == this.f219433b - 1) {
                this.f219434c.mo103802y(false);
            }
            this.f219432a.f27483d++;
        }

        /* renamed from: b */
        public void mo70207b() {
            this.f219434c.mo103802y(false);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.FolderHelper$g */
    public static final class C74646g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FolderHelper f219435d;

        /* renamed from: e */
        public final /* synthetic */ boolean f219436e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74646g(FolderHelper folderHelper, boolean z) {
            super(0);
            this.f219435d = folderHelper;
            this.f219436e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
            if (r6.getTop() <= r0.f219417s) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
            r0 = r0.mo103786i(true);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r15 = this;
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                android.widget.LinearLayout r1 = r0.f219409h
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0010
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L_0x0010
                r1 = 1
                goto L_0x0011
            L_0x0010:
                r1 = 0
            L_0x0011:
                r4 = 0
                if (r1 == 0) goto L_0x0016
                goto L_0x00a8
            L_0x0016:
                com.tencent.mm.ui.conversation.ConversationListView r1 = r0.f219407f
                if (r1 == 0) goto L_0x001f
                int r1 = r1.getLastVisiblePosition()
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                com.tencent.mm.ui.conversation.ConversationListView r5 = r0.f219407f
                if (r5 == 0) goto L_0x0029
                int r5 = r5.getHeaderViewsCount()
                goto L_0x002a
            L_0x0029:
                r5 = 0
            L_0x002a:
                if (r1 <= r5) goto L_0x002f
                int r1 = r1 - r5
                int r1 = r1 - r2
                goto L_0x0033
            L_0x002f:
                if (r1 < 0) goto L_0x0032
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                com.tencent.mm.ui.conversation.p r5 = r0.f219405d
                if (r5 == 0) goto L_0x00a8
                android.util.SparseArray[] r5 = r5.mo104615n()
                if (r5 == 0) goto L_0x00a8
                java.lang.Object r5 = sx3.C110823p.m150978D(r5)
                android.util.SparseArray r5 = (android.util.SparseArray) r5
                if (r5 == 0) goto L_0x00a8
                java.lang.Object r1 = r5.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x00a8
                com.tencent.mm.storage.h2 r1 = r0.mo103789l(r1)
                if (r1 == 0) goto L_0x00a8
                int r1 = r1.f212787o1
                if (r1 != 0) goto L_0x0058
                goto L_0x00a8
            L_0x0058:
                com.tencent.mm.ui.conversation.ConversationListView r1 = r0.f219407f
                if (r1 == 0) goto L_0x0061
                int r1 = r1.getChildCount()
                goto L_0x0062
            L_0x0061:
                r1 = 0
            L_0x0062:
                r5 = 0
            L_0x0063:
                if (r5 >= r1) goto L_0x00a3
                com.tencent.mm.ui.conversation.ConversationListView r6 = r0.f219407f
                if (r6 == 0) goto L_0x006e
                android.view.View r6 = r6.getChildAt(r5)
                goto L_0x006f
            L_0x006e:
                r6 = r4
            L_0x006f:
                if (r6 == 0) goto L_0x0079
                r7 = 2131300458(0x7f09106a, float:1.8218946E38)
                android.view.View r7 = r6.findViewById(r7)
                goto L_0x007a
            L_0x0079:
                r7 = r4
            L_0x007a:
                if (r7 == 0) goto L_0x00a0
                java.lang.Object r8 = r7.getTag()
                boolean r8 = r8 instanceof com.tencent.p014mm.p136ui.conversation.C74720p.C74733m
                if (r8 == 0) goto L_0x00a0
                java.lang.Object r7 = r7.getTag()
                java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.ui.conversation.ConversationWithCacheAdapter.ViewHolder"
                gy3.C87412m.m108592e(r7, r8)
                com.tencent.mm.ui.conversation.p$m r7 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74733m) r7
                java.lang.String r7 = r7.f219757l
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r7)
                if (r7 == 0) goto L_0x00a0
                int r1 = r6.getTop()
                int r5 = r0.f219417s
                if (r1 > r5) goto L_0x00a3
                goto L_0x00a8
            L_0x00a0:
                int r5 = r5 + 1
                goto L_0x0063
            L_0x00a3:
                boolean r0 = r0.mo103786i(r2)
                goto L_0x00a9
            L_0x00a8:
                r0 = 0
            L_0x00a9:
                r1 = 2
                java.lang.String r5 = "MicroMsg.FolderHelper"
                if (r0 == 0) goto L_0x00ba
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                r0.mo103795r()
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                com.tencent.p014mm.p136ui.conversation.FolderHelper.m89356g(r0, r3, r3, r1, r4)
                goto L_0x024c
            L_0x00ba:
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                boolean r0 = r0.mo103786i(r3)
                if (r0 == 0) goto L_0x00c9
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                r0.mo103795r()
                goto L_0x024c
            L_0x00c9:
                boolean r0 = r15.f219436e
                if (r0 == 0) goto L_0x024c
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                java.lang.String r6 = "message_fold"
                com.tencent.mm.storage.h2 r7 = r0.mo103789l(r6)
                r8 = -1
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r7 != 0) goto L_0x00e5
                rx3.l r0 = new rx3.l
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r0.<init>(r7, r9)
                goto L_0x019a
            L_0x00e5:
                boolean r7 = r0.mo103794q()
                if (r7 == 0) goto L_0x00f9
                java.lang.String r0 = "checkIfDelFoldItem, in animation!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                rx3.l r0 = new rx3.l
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r0.<init>(r7, r9)
                goto L_0x019a
            L_0x00f9:
                boolean r7 = r0.mo103796s()
                if (r7 == 0) goto L_0x0106
                bi3.c$a r7 = bi3.C67247c.f193088a
                int r7 = r7.mo91401b()
                goto L_0x0107
            L_0x0106:
                r7 = 0
            L_0x0107:
                com.tencent.mm.ui.conversation.p r9 = r0.f219405d
                if (r9 == 0) goto L_0x0163
                java.util.HashMap r9 = r9.mo104614l()
                if (r9 == 0) goto L_0x0163
                java.util.Collection r9 = r9.values()
                if (r9 == 0) goto L_0x0163
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x0120:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x015e
                java.lang.Object r11 = r9.next()
                r12 = r11
                com.tencent.mm.storage.h2 r12 = (com.tencent.p014mm.storage.C72976h2) r12
                java.util.ArrayList<java.lang.Integer> r13 = com.tencent.p014mm.storage.C30783v3.f82767b
                int r14 = r12.f212787o1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                boolean r13 = r13.contains(r14)
                if (r13 == 0) goto L_0x0157
                eb0.c r13 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r13 = r13.mo105908w()
                com.tencent.mm.storage.i2 r13 = (com.tencent.p014mm.storage.C44660i2) r13
                boolean r13 = r13.mo69754Z(r12)
                if (r13 == 0) goto L_0x0157
                java.lang.String r12 = r12.getUsername()
                boolean r12 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r12)
                if (r12 != 0) goto L_0x0157
                r12 = 1
                goto L_0x0158
            L_0x0157:
                r12 = 0
            L_0x0158:
                if (r12 == 0) goto L_0x0120
                r10.add(r11)
                goto L_0x0120
            L_0x015e:
                int r9 = r10.size()
                goto L_0x0164
            L_0x0163:
                r9 = 0
            L_0x0164:
                boolean r10 = r0.mo103796s()
                if (r10 == 0) goto L_0x016b
                int r9 = r9 + r7
            L_0x016b:
                boolean r0 = r0.mo103793p(r9)
                r0 = r0 ^ r2
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "checkIfDelFoldItem, ifDel:"
                r10.append(r11)
                r10.append(r0)
                java.lang.String r11 = ", topSize:"
                r10.append(r11)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                rx3.l r9 = new rx3.l
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9.<init>(r0, r7)
                r0 = r9
            L_0x019a:
                A r7 = r0.f38555d
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r9 = 65536(0x10000, float:9.18355E-41)
                java.lang.String r10 = "fold_button_status_int_sync"
                java.lang.String r11 = "message_fold_config2"
                if (r7 == 0) goto L_0x0216
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                r0.getClass()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r11)
                r2.encode((java.lang.String) r10, (int) r9)
                java.util.ArrayList<java.lang.Integer> r2 = com.tencent.p014mm.storage.C30783v3.f82766a
                java.lang.String r7 = "TYPE_FOLD"
                gy3.C87412m.m108593f(r2, r7)
                com.tencent.mm.ui.conversation.p r7 = r0.f219405d
                if (r7 == 0) goto L_0x01f1
                java.util.HashMap r7 = r7.mo104614l()
                if (r7 == 0) goto L_0x01f1
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x01cf:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x01f1
                java.lang.Object r8 = r7.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r8 = r8.getValue()
                com.tencent.mm.storage.h2 r8 = (com.tencent.p014mm.storage.C72976h2) r8
                int r9 = r8.f212787o1
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                boolean r9 = r2.contains(r9)
                if (r9 == 0) goto L_0x01cf
                r0.mo103803z(r8, r3, r4)
                goto L_0x01cf
            L_0x01f1:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r0 = r0.mo105908w()
                com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
                r0.mo69763f(r6)
                bi3.c$a r0 = bi3.C67247c.f193088a
                java.util.List r2 = r0.mo91400a()
                java.lang.String r6 = ""
                r0.mo91404e(r2, r6)
                java.lang.String r0 = "delete fold item"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                r2 = 8
                com.tencent.p014mm.p136ui.conversation.FolderHelper.m89356g(r0, r2, r3, r1, r4)
                goto L_0x024c
            L_0x0216:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r11)
                int r1 = r1.decodeInt(r10, r9)
                r4 = 131072(0x20000, float:1.83671E-40)
                if (r1 != r4) goto L_0x0223
                goto L_0x0224
            L_0x0223:
                r2 = 0
            L_0x0224:
                B r1 = r0.f38556e
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                if (r1 != r8) goto L_0x023f
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                if (r2 != 0) goto L_0x0235
                int r0 = r0.f219423y
                goto L_0x0247
            L_0x0235:
                r0.getClass()
                bi3.c$a r0 = bi3.C67247c.f193088a
                int r0 = r0.mo91401b()
                goto L_0x0247
            L_0x023f:
                B r0 = r0.f38556e
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
            L_0x0247:
                com.tencent.mm.ui.conversation.FolderHelper r1 = r15.f219435d
                r1.mo103785h(r2, r0)
            L_0x024c:
                com.tencent.mm.ui.conversation.FolderHelper r0 = r15.f219435d
                com.tencent.mm.ui.conversation.p r0 = r0.f219405d
                if (r0 == 0) goto L_0x025d
                java.util.HashMap r0 = r0.mo104614l()
                if (r0 == 0) goto L_0x025d
                int r0 = r0.size()
                goto L_0x025e
            L_0x025d:
                r0 = 0
            L_0x025e:
                com.tencent.mm.ui.conversation.FolderHelper r1 = r15.f219435d
                int r2 = r1.f219421w
                if (r0 >= r2) goto L_0x0279
                boolean r1 = r1.mo103796s()
                if (r1 == 0) goto L_0x0279
                java.lang.String r1 = "totalCount less than lastTotalCount!, perhaps lead to delete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                com.tencent.mm.ui.conversation.FolderHelper r1 = r15.f219435d
                com.tencent.mm.ui.conversation.ConversationListView r1 = r1.f219407f
                if (r1 == 0) goto L_0x0279
                r1.mo103716f(r3)
            L_0x0279:
                com.tencent.mm.ui.conversation.FolderHelper r1 = r15.f219435d
                r1.f219421w = r0
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.C74646g.invoke():java.lang.Object");
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m89356g(FolderHelper folderHelper, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            folderHelper.mo103784f(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFoldBannerVisible");
    }

    /* renamed from: A */
    public final void mo103777A(int i, View view, TextView textView, int i2) {
        String str = null;
        if (i == 131072) {
            if (view != null) {
                view.setRotation(0.0f);
            }
            if (textView != null) {
                Resources resources = textView.getResources();
                if (resources != null) {
                    str = resources.getString(C0966R.string.b7p, new Object[]{Integer.valueOf(i2)});
                }
                textView.setText(str);
            }
            this.f219423y = i2;
            return;
        }
        if (view != null) {
            view.setRotation(180.0f);
        }
        if (textView != null) {
            Resources resources2 = textView.getResources();
            if (resources2 != null) {
                str = resources2.getString(C0966R.string.b7q);
            }
            textView.setText(str);
        }
    }

    /* renamed from: B */
    public final void mo103778B(boolean z) {
        if (this.f219406e == null || !C97625j3.m125811a() || this.f219409h == null || this.f219407f == null || this.f219405d == null) {
            Log.m105920e("MicroMsg.FolderHelper", "acc is not ready!");
        } else {
            C61926c.m72666K(100, new C74646g(this, z));
        }
    }

    /* renamed from: a */
    public final void mo103779a(C72976h2 h2Var, boolean z, boolean z2) {
        if (h2Var != null) {
            h2Var.f212787o1 = mo103780b(h2Var, z, z2);
        }
        Object[] objArr = new Object[2];
        String username = h2Var != null ? h2Var.getUsername() : null;
        if (username == null) {
            username = "";
        }
        int i = 0;
        objArr[0] = username;
        if (h2Var != null) {
            i = h2Var.f212787o1;
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105919d("MicroMsg.FolderHelper", "calcAndUpdateFoldFlag username:%s, foldFlag:%d", objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (gy3.C87412m.m108589b(r4 != null ? r4.mo108782C2() : null, "message_fold") != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if ((r0 != null && r0.mo103881H(r17.mo108781B2()) == 889192497) == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0172, code lost:
        if ((r0 != null && r0.mo103881H(r17.mo108781B2()) == 922746929) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0174, code lost:
        r0 = new te3.C64418hb3();
        r9 = r1.f219405d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017b, code lost:
        if (r9 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        r9 = java.lang.Integer.valueOf(r9.mo103881H(r17.mo108781B2()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018a, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018b, code lost:
        r10 = r17.getContent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018f, code lost:
        if (r9 != null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0196, code lost:
        if (r9.intValue() != 889192497) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0198, code lost:
        r0 = ((vd2.C78384d) di3.C86312j.m106911c(vd2.C78384d.class)).mo108125bB(r10);
        gy3.C87412m.m108593f(r0, "getService(IPatMsgExtens…rseMsgContent(msgContent)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01aa, code lost:
        if (r9 != null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b1, code lost:
        if (r9.intValue() != 922746929) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (r5 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b9, code lost:
        r0 = ((vd2.C78383a) r5.mo93555w(vd2.C78383a.class)).f229698b;
        gy3.C87412m.m108593f(r0, "content.piece(AppMsgCont…class.java).patMsgContent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ce, code lost:
        if (r0.f183464e.size() <= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d0, code lost:
        r0 = r0.f183464e.getLast();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (gy3.C87412m.m108589b(r0.f227607d, eb0.C75592q0.m90789s()) != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        r0 = r0.f227614n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.ConversationWithCacheAdapter", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo103780b(com.tencent.p014mm.storage.C72976h2 r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "MicroMsg.FolderHelper"
            r3 = 0
            if (r2 != 0) goto L_0x000f
            java.lang.String r2 = "calcFoldFlag conversation failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r3
        L_0x000f:
            boolean r4 = r1.f219395B
            r5 = 262144(0x40000, float:3.67342E-40)
            r6 = 0
            r7 = 2
            java.lang.String r8 = "fold_button_status_int_sync"
            r9 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r10 = "message_fold_config2"
            r11 = 1
            if (r4 != 0) goto L_0x00f5
            boolean r4 = eb0.C97625j3.m125811a()
            if (r4 == 0) goto L_0x00f5
            r1.f219395B = r11
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            java.lang.String r12 = "message_fold"
            com.tencent.mm.storage.h2 r4 = r4.mo69771j(r12)
            if (r4 == 0) goto L_0x003a
            r13 = 1
            goto L_0x003b
        L_0x003a:
            r13 = 0
        L_0x003b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
            int r14 = r14.decodeInt(r8, r9)
            if (r14 == r9) goto L_0x0047
            r14 = 1
            goto L_0x0048
        L_0x0047:
            r14 = 0
        L_0x0048:
            if (r14 != 0) goto L_0x0077
            if (r13 == 0) goto L_0x0077
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FOLD_BUTTON_STATUS_INT_SYNC
            int r4 = r4.mo119689j(r12, r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r10)
            r12.encode((java.lang.String) r8, (int) r4)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "last fold conv is exist!, lastState: "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x00f5
        L_0x0077:
            if (r13 != 0) goto L_0x008b
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r10)
            r4.encode((java.lang.String) r8, (int) r9)
            r4 = 8
            m89356g(r1, r4, r3, r7, r6)
            java.lang.String r4 = "last fold conv is not exist!, reset state"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x00f5
        L_0x008b:
            eb0.c r14 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r14 = r14.mo105908w()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            boolean r14 = r14.mo69754Z(r4)
            if (r14 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00a2
            java.lang.String r15 = r4.mo108782C2()
            goto L_0x00a3
        L_0x00a2:
            r15 = r6
        L_0x00a3:
            boolean r12 = gy3.C87412m.m108589b(r15, r12)
            if (r12 == 0) goto L_0x00c9
        L_0x00a9:
            r4.mo108807c3(r6)
            r11 = 0
            r4.mo108793N2(r11)
            long r11 = g62.C45881a.m51165b(r4, r7, r11)
            r4.mo101161T2(r11)
            eb0.c r11 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r11 = r11.mo105908w()
            java.lang.String r12 = r4.getUsername()
            com.tencent.mm.storage.i2 r11 = (com.tencent.p014mm.storage.C44660i2) r11
            r11.mo69773k0(r4, r12)
        L_0x00c9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "correct status, conv existDB : "
            r11.append(r12)
            r11.append(r13)
            java.lang.String r12 = ", parentRef: "
            r11.append(r12)
            if (r4 == 0) goto L_0x00e2
            java.lang.String r4 = r4.mo108782C2()
            goto L_0x00e3
        L_0x00e2:
            r4 = r6
        L_0x00e3:
            r11.append(r4)
            java.lang.String r4 = ", isPlacedTop: "
            r11.append(r4)
            r11.append(r14)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x00f5:
            java.lang.String r0 = r17.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r0)
            if (r0 == 0) goto L_0x0108
            boolean r0 = r16.mo103796s()
            if (r0 == 0) goto L_0x0107
            r5 = 131072(0x20000, float:1.83671E-40)
        L_0x0107:
            return r5
        L_0x0108:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            boolean r0 = r0.mo69754Z(r2)
            if (r0 == 0) goto L_0x0129
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
            int r0 = r0.decodeInt(r8, r9)
            if (r0 == r9) goto L_0x0124
            r0 = 1
            goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            if (r0 == 0) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            if (r0 == 0) goto L_0x023a
            int r0 = r17.mo108786G2()
            if (r0 > 0) goto L_0x0238
            int r0 = r17.mo108788I2()
            if (r0 > 0) goto L_0x0238
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = r2.mo108372k3(r0)
            if (r0 != 0) goto L_0x0238
            int r0 = r17.mo108832y2()
            java.lang.String r4 = "MicroMsg.ConversationWithCacheAdapter"
            r5 = 889192497(0x35000031, float:4.7683994E-7)
            r8 = 922746929(0x37000031, float:7.629439E-6)
            if (r0 != 0) goto L_0x0161
            com.tencent.mm.ui.conversation.p r0 = r1.f219405d
            if (r0 == 0) goto L_0x015e
            java.lang.String r9 = r17.mo108781B2()
            int r0 = r0.mo103881H(r9)
            if (r0 != r5) goto L_0x015e
            r0 = 1
            goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            if (r0 != 0) goto L_0x0174
        L_0x0161:
            com.tencent.mm.ui.conversation.p r0 = r1.f219405d
            if (r0 == 0) goto L_0x0171
            java.lang.String r9 = r17.mo108781B2()
            int r0 = r0.mo103881H(r9)
            if (r0 != r8) goto L_0x0171
            r0 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 == 0) goto L_0x01ef
        L_0x0174:
            te3.hb3 r0 = new te3.hb3
            r0.<init>()
            com.tencent.mm.ui.conversation.p r9 = r1.f219405d
            if (r9 == 0) goto L_0x018a
            java.lang.String r10 = r17.mo108781B2()
            int r9 = r9.mo103881H(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x018b
        L_0x018a:
            r9 = r6
        L_0x018b:
            java.lang.String r10 = r17.getContent()
            if (r9 != 0) goto L_0x0192
            goto L_0x01aa
        L_0x0192:
            int r11 = r9.intValue()
            if (r11 != r5) goto L_0x01aa
            java.lang.Class<vd2.d> r0 = vd2.C78384d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vd2.d r0 = (vd2.C78384d) r0
            te3.hb3 r0 = r0.mo108125bB(r10)
            java.lang.String r5 = "getService(IPatMsgExtens…rseMsgContent(msgContent)"
            gy3.C87412m.m108593f(r0, r5)
            goto L_0x01c8
        L_0x01aa:
            if (r9 != 0) goto L_0x01ad
            goto L_0x01c8
        L_0x01ad:
            int r5 = r9.intValue()
            if (r5 != r8) goto L_0x01c8
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r5 == 0) goto L_0x01c8
            java.lang.Class<vd2.a> r0 = vd2.C78383a.class
            com.tencent.mm.message.g r0 = r5.mo93555w(r0)
            vd2.a r0 = (vd2.C78383a) r0
            te3.hb3 r0 = r0.f229698b
            java.lang.String r5 = "content.piece(AppMsgCont…class.java).patMsgContent"
            gy3.C87412m.m108593f(r0, r5)
        L_0x01c8:
            java.util.LinkedList<te3.ib3> r5 = r0.f183464e     // Catch:{ Exception -> 0x01e7 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01e7 }
            if (r5 <= 0) goto L_0x01ef
            java.util.LinkedList<te3.ib3> r0 = r0.f183464e     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.getLast()     // Catch:{ Exception -> 0x01e7 }
            te3.ib3 r0 = (te3.C77946ib3) r0     // Catch:{ Exception -> 0x01e7 }
            java.lang.String r5 = r0.f227607d     // Catch:{ Exception -> 0x01e7 }
            java.lang.String r6 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x01e7 }
            boolean r5 = gy3.C87412m.m108589b(r5, r6)     // Catch:{ Exception -> 0x01e7 }
            if (r5 != 0) goto L_0x01ef
            int r0 = r0.f227614n     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01f0
        L_0x01e7:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r5)
        L_0x01ef:
            r0 = 1
        L_0x01f0:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6[r3] = r5
            java.lang.String r5 = "isNewPatMsg: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            if (r0 != 0) goto L_0x0201
            r3 = 1
        L_0x0201:
            if (r3 != 0) goto L_0x0238
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r0 = r2.mo108372k3(r0)
            if (r0 == 0) goto L_0x020c
            goto L_0x0238
        L_0x020c:
            r0 = 10
            r3 = 4
            if (r19 == 0) goto L_0x021f
            int r4 = r2.f212787o1
            if (r4 != r3) goto L_0x021c
            boolean r3 = r16.mo103796s()
            if (r3 == 0) goto L_0x021c
            return r0
        L_0x021c:
            int r0 = r2.f212787o1
            return r0
        L_0x021f:
            if (r18 == 0) goto L_0x022b
            boolean r0 = r16.mo103796s()
            if (r0 == 0) goto L_0x0228
            return r3
        L_0x0228:
            int r0 = r2.f212787o1
            return r0
        L_0x022b:
            int r2 = r2.f212787o1
            if (r2 != r0) goto L_0x0230
            return r0
        L_0x0230:
            boolean r0 = r16.mo103797t()
            if (r0 == 0) goto L_0x0237
            return r7
        L_0x0237:
            return r3
        L_0x0238:
            r2 = 1
            return r2
        L_0x023a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.mo103780b(com.tencent.mm.storage.h2, boolean, boolean):int");
    }

    /* renamed from: c */
    public final void mo103781c(int i, boolean z) {
        if (z) {
            try {
                i -= C75044y4.m89991c(this.f219406e);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FolderHelper", e, "", new Object[0]);
                return;
            }
        }
        int f = C75044y4.m89994f(this.f219406e);
        int a = C75044y4.m89989a(this.f219406e);
        int h = C76577a.m92157h(this.f219406e, C0966R.dimen.f3683bc);
        int i2 = (i - a) - h;
        this.f219415q = i2;
        this.f219417s = i - h;
        this.f219416r = a + f;
        this.f219420v = i2 / this.f219412n;
        Log.m105924i("MicroMsg.FolderHelper", "configParams, height: " + i);
    }

    /* renamed from: d */
    public final void mo103782d(C72976h2 h2Var) {
        C87412m.m108594g(h2Var, "conv");
        String C2 = h2Var.mo108782C2();
        if ((C2 == null || C2.length() == 0) && !C72996z1.m85828Z4(h2Var.getUsername())) {
            h2Var.mo108373l3(536870912);
            if (mo103796s()) {
                h2Var.mo108807c3("message_fold");
                C67247c.C67248a aVar = C67247c.f193088a;
                String username = h2Var.getUsername();
                C87412m.m108593f(username, "conv.username");
                aVar.mo91403d(username, "message_fold", h2Var.mo108819m2());
                return;
            }
            C67247c.C67248a aVar2 = C67247c.f193088a;
            String username2 = h2Var.getUsername();
            C87412m.m108593f(username2, "conv.username");
            aVar2.mo91403d(username2, h2Var.mo108782C2(), h2Var.mo108819m2());
        }
    }

    /* renamed from: e */
    public final void mo103783e(String str, boolean z) {
        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
        if (C87412m.m108589b(j != null ? j.mo108782C2() : null, "message_fold")) {
            if (z) {
                j.mo108371j3(536870912);
            }
            C67247c.C67248a aVar = C67247c.f193088a;
            String username = j.getUsername();
            C87412m.m108593f(username, "conv.username");
            aVar.mo91403d(username, "", j.mo108819m2());
        }
    }

    /* renamed from: f */
    public final void mo103784f(int i, boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.f219409h;
        boolean z2 = false;
        if (!(linearLayout2 != null && linearLayout2.getVisibility() == i) && (linearLayout = this.f219409h) != null) {
            linearLayout.setVisibility(i);
        }
        if (i == 0) {
            int i2 = 131072;
            if (MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) == 131072) {
                z2 = true;
            }
            if (!z2) {
                i2 = 262144;
            }
            mo103777A(i2, this.f219410i, this.f219411j, z ? !z2 ? this.f219423y : C67247c.f193088a.mo91401b() : this.f219423y);
        }
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        mo103778B(true);
    }

    /* renamed from: h */
    public final void mo103785h(boolean z, int i) {
        C74720p.C74733m m = mo103790m("message_fold");
        int i2 = 131072;
        if (m != null) {
            mo103777A(z ? 131072 : 262144, m.f219764s, m.f219765t, i);
        }
        LinearLayout linearLayout = this.f219409h;
        boolean z2 = false;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            if (!z) {
                i2 = 262144;
            }
            mo103777A(i2, this.f219410i, this.f219411j, i);
        }
        if (!mo103794q()) {
            this.f219423y = i;
        }
    }

    /* renamed from: i */
    public final boolean mo103786i(boolean z) {
        int i;
        HashMap l;
        Collection values;
        boolean z2 = true;
        boolean z3 = mo103789l("message_fold") != null;
        if (!z && z3) {
            return false;
        }
        C74720p pVar = this.f219405d;
        if (pVar == null || (l = pVar.mo104614l()) == null || (values = l.values()) == null) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                C72976h2 h2Var = (C72976h2) next;
                if (C30783v3.f82767b.contains(Integer.valueOf(h2Var.f212787o1)) && ((C44660i2) C97625j3.m125812b().mo105908w()).mo69754Z(h2Var) && !C72996z1.m85828Z4(h2Var.getUsername())) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        }
        boolean z4 = !z3 || z;
        if (!z4) {
            C61926c.m72668M(new C74641b(this));
        } else {
            i += mo103796s() ? C67247c.f193088a.mo91401b() : 0;
            z4 = z4 && mo103793p(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkIfShowFoldItem, ifShow:");
        sb.append(z4);
        sb.append(", existFoldItem:");
        sb.append(z3);
        sb.append(", topSize:");
        sb.append(i);
        sb.append(", forceShowBanner:");
        sb.append(z);
        sb.append(", isCollapse:");
        if (MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) != 131072) {
            z2 = false;
        }
        sb.append(z2);
        Log.m105924i("MicroMsg.FolderHelper", sb.toString());
        return z4;
    }

    /* renamed from: j */
    public final void mo103787j(C74720p.C74733m mVar, C72976h2 h2Var, View view, int i, ViewGroup viewGroup) {
        Animator[] animatorArr;
        View view2;
        int hashCode;
        Animator animator;
        int i2;
        int i3;
        int i4;
        C74720p.C74733m mVar2 = mVar;
        C72976h2 h2Var2 = h2Var;
        int i5 = i;
        C87412m.m108594g(mVar2, "viewHolder");
        C87412m.m108594g(h2Var2, "conv");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(viewGroup, "parent");
        mVar2.f219768w.setVisibility(8);
        boolean z = false;
        mVar2.f219767v.setVisibility(0);
        if (C72996z1.m85828Z4(h2Var.getUsername())) {
            mVar2.f219767v.setVisibility(8);
            mVar2.f219768w.setVisibility(0);
            View view3 = mVar2.f219762q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo103777A(h2Var2.f212787o1, mVar2.f219764s, mVar2.f219765t, this.f219423y);
            ViewGroup.LayoutParams layoutParams = mVar2.f219762q.getLayoutParams();
            AbsListView.LayoutParams layoutParams2 = layoutParams instanceof AbsListView.LayoutParams ? (AbsListView.LayoutParams) layoutParams : null;
            if (layoutParams2 != null && mVar2.f219760o != (i4 = this.f219413o)) {
                layoutParams2.height = i4;
                mVar2.f219760o = i4;
                mVar2.f219762q.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        if ((h2Var2.f212787o1 & 4) == 0) {
            View view5 = mVar2.f219762q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i6 = h2Var2.f212787o1;
        if ((i6 <= 2 || i6 == 10) && mVar2.f219762q.getMeasuredHeight() != (i2 = this.f219412n)) {
            mVar2.f219760o = i2;
            ViewGroup.LayoutParams layoutParams3 = mVar2.f219762q.getLayoutParams();
            AbsListView.LayoutParams layoutParams4 = layoutParams3 instanceof AbsListView.LayoutParams ? (AbsListView.LayoutParams) layoutParams3 : null;
            if (!(layoutParams4 == null || layoutParams4.height == (i3 = this.f219412n))) {
                layoutParams4.height = i3;
                mVar2.f219762q.setLayoutParams(layoutParams4);
            }
        } else if (h2Var2.f212787o1 == 4) {
            String C2 = h2Var.mo108782C2();
            if ((C2 == null || C2.length() == 0) && mVar2.f219762q.getMeasuredHeight() != this.f219403J) {
                mo103782d(h2Var2);
            }
        }
        int i7 = h2Var2.f212787o1;
        if (i7 <= 2 || i7 == 10) {
            if (!(mVar2.f219763r.getAlpha() == 1.0f)) {
                View view7 = mVar2.f219763r;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view7.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/conversation/FolderHelper", "dealFoldFlag", "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/storage/Conversation;Landroid/view/View;ILandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        if (h2Var2.f212787o1 == 2 && this.f219422x) {
            C76598b bVar = this.f219398E;
            if (!(bVar == null || (view2 = mVar2.f219762q) == null || (animator = bVar.f224197a.get(hashCode)) == null)) {
                animator.end();
                bVar.f224197a.remove((hashCode = view2.hashCode()));
            }
            ViewGroup.LayoutParams layoutParams5 = mVar2.f219762q.getLayoutParams();
            if (layoutParams5 == null) {
                animatorArr = new Animator[0];
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                C87412m.m108593f(ofFloat, "ofFloat(0f, 1.0f)");
                ofFloat.addListener(new C74688f0(h2Var2, this, mVar2, layoutParams5));
                ofFloat.addUpdateListener(new C44987g0(0.0f, this, layoutParams5, mVar2));
                animatorArr = new Animator[]{ofFloat};
            }
            int length = animatorArr.length + 0 + 0;
            Animator[] animatorArr2 = new Animator[length];
            int i8 = 0;
            for (Animator animator2 : animatorArr) {
                animatorArr2[i8] = animator2;
                i8++;
            }
            C76598b bVar2 = this.f219398E;
            if (bVar2 != null && length != 0 && bVar2.f224202f && i5 > bVar2.f224201e) {
                if (bVar2.f224200d == -1) {
                    bVar2.f224200d = i5;
                }
                if (bVar2.f224199c == -1) {
                    bVar2.f224199c = SystemClock.uptimeMillis();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animatorArr2);
                animatorSet.setStartDelay(0);
                animatorSet.setDuration((long) bVar2.f224198b);
                animatorSet.start();
                bVar2.f224197a.put(view.hashCode(), animatorSet);
                bVar2.f224201e = i5;
            }
        }
        LinearLayout linearLayout = this.f219409h;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            int i9 = 131072;
            if (MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) == 131072) {
                z = true;
            }
            if (!z) {
                i9 = 262144;
            }
            mo103777A(i9, this.f219410i, this.f219411j, this.f219423y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (((t22.C77833z) ed0.C75610d.m90859a()).mo107954g(r8.mo108768t()) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r8.getType() != 268445456) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103788k(g62.C75875l.C45886e r7, com.tencent.p014mm.storage.C72963f4 r8, boolean r9) {
        /*
            r6 = this;
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            java.lang.String r1 = r7.f123844a
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            boolean r0 = r0.mo69753Y(r1)
            if (r0 == 0) goto L_0x00f2
            int r0 = r8.mo108769t2()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0051
            boolean r0 = r8.mo100986Y3()
            if (r0 != 0) goto L_0x0051
            boolean r0 = r8.mo101017u3()
            if (r0 != 0) goto L_0x0083
            boolean r0 = r8.mo100985X3()
            if (r0 != 0) goto L_0x0083
            boolean r0 = r8.mo101001j4()
            if (r0 != 0) goto L_0x0083
            ed0.a r0 = ed0.C75610d.m90859a()
            if (r0 == 0) goto L_0x0048
            ed0.a r0 = ed0.C75610d.m90859a()
            java.lang.String r3 = r8.mo108768t()
            t22.z r0 = (t22.C77833z) r0
            boolean r0 = r0.mo107954g(r3)
            if (r0 != 0) goto L_0x0083
        L_0x0048:
            int r0 = r8.getType()
            r3 = 268445456(0x10002710, float:2.5273642E-29)
            if (r0 == r3) goto L_0x0083
        L_0x0051:
            int r0 = r8.mo108769t2()
            if (r0 != r1) goto L_0x0082
            int r0 = r8.getStatus()
            r3 = 3
            if (r0 != r3) goto L_0x0082
            java.lang.String r0 = r8.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = r8.mo108768t()
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r4 = 2
            java.lang.String r5 = ""
            java.lang.Object r3 = r3.mo119684e(r4, r5)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 == 0) goto L_0x00c8
            com.tencent.mm.ui.conversation.FolderHelper$c r7 = new com.tencent.mm.ui.conversation.FolderHelper$c
            r7.<init>(r6, r8)
            o40.C61926c.m72668M(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "dealMsg, isSend: "
            r7.append(r0)
            int r0 = r8.mo108769t2()
            r7.append(r0)
            java.lang.String r0 = ", status: "
            r7.append(r0)
            int r0 = r8.getStatus()
            r7.append(r0)
            java.lang.String r0 = ", talker: "
            r7.append(r0)
            java.lang.String r8 = r8.mo108768t()
            r7.append(r8)
            java.lang.String r8 = ", isNewMsg: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.FolderHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            goto L_0x00f2
        L_0x00c8:
            int r0 = r8.mo108769t2()
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r8.mo100986Y3()
            if (r0 == 0) goto L_0x00dd
            com.tencent.mm.ui.conversation.FolderHelper$d r9 = new com.tencent.mm.ui.conversation.FolderHelper$d
            r9.<init>(r6, r8, r7)
            o40.C61926c.m72668M(r9)
            goto L_0x00f2
        L_0x00dd:
            if (r9 == 0) goto L_0x00f2
            int r7 = r8.mo108769t2()
            if (r7 != 0) goto L_0x00f2
            boolean r7 = r8.mo100986Y3()
            if (r7 != 0) goto L_0x00f2
            java.lang.String r7 = r8.mo108768t()
            r6.mo103783e(r7, r2)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.mo103788k(g62.l$e, com.tencent.mm.storage.f4, boolean):void");
    }

    /* renamed from: l */
    public final C72976h2 mo103789l(String str) {
        C74720p pVar = this.f219405d;
        C112789a aVar = null;
        if (pVar == null) {
            return null;
        }
        C75029y<K, T>.f fVar = pVar.f220758f;
        if (fVar != null) {
            aVar = fVar.f192598a.mo91039p0(str);
        }
        return (C72976h2) aVar;
    }

    /* renamed from: m */
    public final C74720p.C74733m mo103790m(String str) {
        ConversationListView conversationListView = this.f219407f;
        if (conversationListView != null) {
            int childCount = conversationListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = conversationListView.getChildAt(i);
                View findViewById = childAt != null ? childAt.findViewById(C0966R.C0970id.bth) : null;
                if (findViewById != null && (findViewById.getTag() instanceof C74720p.C74733m)) {
                    Object tag = findViewById.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.ConversationWithCacheAdapter.ViewHolder");
                    C74720p.C74733m mVar = (C74720p.C74733m) tag;
                    if (C87412m.m108589b(mVar.f219757l, str)) {
                        return mVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public final boolean mo103791n() {
        if (this.f219401H == -1) {
            this.f219401H = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_msg_fold_mode_switch, 1);
        }
        return this.f219401H == 1;
    }

    /* renamed from: o */
    public final Collection<C72976h2> mo103792o() {
        HashMap l;
        Collection values;
        C74720p pVar = this.f219405d;
        if (pVar == null || (l = pVar.mo104614l()) == null || (values = l.values()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : values) {
            if (!C72996z1.m85828Z4(((C72976h2) next).getUsername())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Class cls = C34010q0.class;
        C87412m.m108594g(mStorageEx, "stg");
        C87412m.m108594g(obj, "obj");
        if (C97625j3.m125811a() && mStorageEx == C97625j3.m125812b().mo105906u()) {
            int nullAsInt = Util.nullAsInt(obj, 0);
            if (8193 == nullAsInt) {
                mo103778B(true);
            }
            if (42 == nullAsInt) {
                mo103778B(true);
            }
        } else if (mStorageEx instanceof C30783v3) {
            String str = (String) obj;
            if (i == 5) {
                if (C72996z1.m85828Z4(str)) {
                    C61926c.m72668M(new C74644e(this));
                } else {
                    mo103778B(true);
                }
                if (!((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(str)) {
                    return;
                }
                if (((C34010q0) C86312j.m106911c(cls)).nj0() == 0) {
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("conversationboxservice");
                } else {
                    ((C34010q0) C86312j.m106911c(cls)).mo59405u9(false);
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean mo103793p(int i) {
        if (mo103791n()) {
            if (this.f219402I == -1) {
                this.f219402I = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_msg_fold_limit_num, Integer.MAX_VALUE);
            }
            return i <= this.f219402I && ((float) (i * this.f219412n)) >= ((float) this.f219415q) * 1.0f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.storage.h2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103794q() {
        /*
            r7 = this;
            com.tencent.mm.ui.conversation.p r0 = r7.f219405d
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0037
            java.util.HashMap r0 = r0.mo104614l()
            if (r0 == 0) goto L_0x0037
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x0037
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0035
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.mm.storage.h2 r5 = (com.tencent.p014mm.storage.C72976h2) r5
            int r5 = r5.f212787o1
            r6 = 66
            if (r5 == r6) goto L_0x0031
            r6 = 132(0x84, float:1.85E-43)
            if (r5 != r6) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r5 = 0
            goto L_0x0032
        L_0x0031:
            r5 = 1
        L_0x0032:
            if (r5 == 0) goto L_0x0017
            r3 = r4
        L_0x0035:
            com.tencent.mm.storage.h2 r3 = (com.tencent.p014mm.storage.C72976h2) r3
        L_0x0037:
            if (r3 != 0) goto L_0x003d
            boolean r0 = r7.f219397D
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.mo103794q():boolean");
    }

    /* renamed from: r */
    public final void mo103795r() {
        HashMap l;
        if (mo103791n()) {
            if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j("message_fold") == null) {
                C72976h2 h2Var = new C72976h2();
                h2Var.f212787o1 = 262144;
                h2Var.setUsername("message_fold");
                Context context = this.f219406e;
                h2Var.mo108792M2(context != null ? context.getString(C0966R.string.b7q) : null);
                h2Var.mo108793N2(0);
                h2Var.mo101161T2(C45881a.m51165b(h2Var, 2, 0));
                if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69751W(h2Var) != -1) {
                    MultiProcessMMKV.getSingleMMKV("message_fold_config2").encode("fold_button_status_int_sync", 262144);
                    ArrayList arrayList = new ArrayList();
                    C74720p pVar = this.f219405d;
                    if (!(pVar == null || (l = pVar.mo104614l()) == null)) {
                        for (Map.Entry value : l.entrySet()) {
                            C72976h2 h2Var2 = (C72976h2) value.getValue();
                            mo103779a(h2Var2, false, false);
                            int i = h2Var2.f212787o1;
                            if (i == 2 || i == 66) {
                                arrayList.add(h2Var2.getUsername());
                            }
                        }
                    }
                    C67247c.f193088a.mo91404e(arrayList, "message_fold");
                    Log.m105924i("MicroMsg.FolderHelper", "insert fold item suc");
                    return;
                }
                Log.m105920e("MicroMsg.FolderHelper", "insert fold item failed, ignore it");
                return;
            }
            Log.m105924i("MicroMsg.FolderHelper", "fold item exist");
        }
    }

    /* renamed from: s */
    public final boolean mo103796s() {
        return MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) == 131072;
    }

    /* renamed from: t */
    public final boolean mo103797t() {
        int decodeInt = MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536);
        return decodeInt == 262144 || decodeInt == 65536;
    }

    /* renamed from: u */
    public final void mo103798u() {
        Log.m105924i("MicroMsg.FolderHelper", "onTabPause");
        if (this.f219400G) {
            this.f219400G = false;
            C78802b bVar = this.f219408g;
            if (bVar != null) {
                bVar.mo7971f();
            }
            C97625j3.m125812b().mo105906u().remove(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.tencent.mm.storage.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: com.tencent.mm.storage.h2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103799v(com.tencent.p014mm.p136ui.conversation.C74720p.C74733m r23) {
        /*
            r22 = this;
            r7 = r22
            com.tencent.mm.ui.conversation.p r0 = r7.f219405d
            r8 = 1
            r10 = 132(0x84, float:1.85E-43)
            r1 = 2
            r2 = 131072(0x20000, float:1.83671E-40)
            r11 = 0
            r13 = 0
            r3 = 0
            if (r0 == 0) goto L_0x007d
            java.util.HashMap r0 = r0.mo104614l()
            if (r0 == 0) goto L_0x007d
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r6 = 0
        L_0x0021:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x007a
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getValue()
            com.tencent.mm.storage.h2 r14 = (com.tencent.p014mm.storage.C72976h2) r14
            int r15 = r7.mo103780b(r14, r13, r13)
            if (r15 == r1) goto L_0x003e
            r12 = 66
            if (r15 == r12) goto L_0x003e
            goto L_0x0059
        L_0x003e:
            java.lang.String r12 = r14.getUsername()
            com.tencent.mm.ui.conversation.p$m r12 = r7.mo103790m(r12)
            if (r12 == 0) goto L_0x004e
            r7.mo103803z(r14, r10, r11)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x004f
        L_0x004e:
            r12 = r11
        L_0x004f:
            if (r12 != 0) goto L_0x0057
            r12 = 4
            java.lang.String r15 = "message_fold"
            r7.mo103803z(r14, r12, r15)
        L_0x0057:
            int r5 = r5 + 1
        L_0x0059:
            java.lang.String r12 = r14.getUsername()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r12)
            if (r12 == 0) goto L_0x0068
            r7.mo103803z(r14, r2, r11)
            r6 = 1
            goto L_0x0021
        L_0x0068:
            eb0.c r12 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r12 = r12.mo105908w()
            com.tencent.mm.storage.i2 r12 = (com.tencent.p014mm.storage.C44660i2) r12
            boolean r12 = r12.mo69754Z(r14)
            if (r12 == 0) goto L_0x0021
            long r3 = r3 + r8
            goto L_0x0021
        L_0x007a:
            r14 = r3
            r12 = r5
            goto L_0x0080
        L_0x007d:
            r14 = r3
            r6 = 0
            r12 = 0
        L_0x0080:
            java.lang.String r5 = "MicroMsg.FolderHelper"
            if (r6 != 0) goto L_0x008f
            r0 = 8
            m89356g(r7, r0, r13, r1, r11)
            java.lang.String r0 = "performAllCollapse, fold item not exit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        L_0x008f:
            java.lang.String r0 = "message_fold_config2"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            java.lang.String r1 = "fold_button_status_int_sync"
            r0.encode((java.lang.String) r1, (int) r2)
            r0 = 1
            r7.mo103785h(r0, r12)
            r7.f219422x = r13
            r7.f219396C = r13
            r7.f219397D = r0
            com.tencent.mm.ui.conversation.ConversationListView r0 = r7.f219407f
            if (r0 == 0) goto L_0x00ce
            if (r0 == 0) goto L_0x00af
            int r1 = r0.getHeaderViewsCount()
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            com.tencent.mm.ui.conversation.ConversationListView r2 = r7.f219407f
            if (r2 == 0) goto L_0x00b9
            int r2 = r2.getFooterViewsCount()
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            int r1 = r1 + r2
            com.tencent.mm.ui.conversation.p r2 = r7.f219405d
            if (r2 == 0) goto L_0x00c4
            int r2 = r2.getCount()
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            int r1 = r1 + r2
            r2 = 1
            float r0 = r0.mo103710c(r1, r12, r2)
            r16 = r0
            goto L_0x00d1
        L_0x00ce:
            r0 = 0
            r16 = 0
        L_0x00d1:
            com.tencent.mm.ui.conversation.ConversationListView r0 = r7.f219407f
            if (r0 == 0) goto L_0x00dc
            int r0 = r0.getEmptyFooterHeight()
            r17 = r0
            goto L_0x00de
        L_0x00dc:
            r17 = 0
        L_0x00de:
            com.tencent.mm.ui.conversation.ConversationListView r0 = r7.f219407f
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.getCount()
            r6 = r0
            goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            gy3.d0 r0 = new gy3.d0
            r0.<init>()
            com.tencent.mm.ui.conversation.FolderHelper$f r4 = new com.tencent.mm.ui.conversation.FolderHelper$f
            r4.<init>(r0, r6, r7)
            r0 = 0
            r3 = 0
        L_0x00f5:
            if (r3 >= r6) goto L_0x01be
            com.tencent.mm.ui.conversation.ConversationListView r1 = r7.f219407f
            if (r1 == 0) goto L_0x0100
            android.view.View r1 = r1.getChildAt(r3)
            goto L_0x0101
        L_0x0100:
            r1 = r11
        L_0x0101:
            if (r1 == 0) goto L_0x010b
            r2 = 2131300458(0x7f09106a, float:1.8218946E38)
            android.view.View r1 = r1.findViewById(r2)
            goto L_0x010c
        L_0x010b:
            r1 = r11
        L_0x010c:
            if (r1 == 0) goto L_0x01a6
            java.lang.Object r2 = r1.getTag()
            boolean r2 = r2 instanceof com.tencent.p014mm.p136ui.conversation.C74720p.C74733m
            if (r2 == 0) goto L_0x01a6
            java.lang.Object r0 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.conversation.ConversationWithCacheAdapter.ViewHolder"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            com.tencent.mm.ui.conversation.p$m r2 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74733m) r2
            com.tencent.mm.ui.conversation.p r0 = r7.f219405d
            if (r0 == 0) goto L_0x012f
            int r1 = r2.f219759n
            ai3.a r0 = r0.getItem(r1)
            com.tencent.mm.storage.h2 r0 = (com.tencent.p014mm.storage.C72976h2) r0
            goto L_0x0130
        L_0x012f:
            r0 = r11
        L_0x0130:
            if (r0 == 0) goto L_0x0138
            int r0 = r0.f212787o1
            if (r0 != r10) goto L_0x0138
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            if (r0 == 0) goto L_0x018e
            android.view.View r0 = r2.f219762q
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.View r0 = r2.f219762q
            int r18 = r0.getMeasuredHeight()
            android.view.View r0 = r2.f219762q
            aj3.a r0 = aj3.C103374a.m137034a(r0)
            long r8 = r7.f219418t
            aj3.a r0 = r0.mo143282e(r8)
            com.tencent.mm.ui.conversation.i0 r8 = new com.tencent.mm.ui.conversation.i0
            r8.<init>(r2)
            aj3.a r8 = r0.mo143290m(r8)
            com.tencent.mm.ui.conversation.j0 r9 = new com.tencent.mm.ui.conversation.j0
            r0 = r9
            r19 = r1
            r1 = r18
            r18 = r2
            r2 = r19
            r20 = r3
            r3 = r18
            r10 = r4
            r4 = r17
            r11 = r5
            r5 = r16
            r21 = r6
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            aj3.a r0 = r8.mo143285h(r9)
            com.tencent.mm.ui.conversation.k0 r1 = new com.tencent.mm.ui.conversation.k0
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r10)
            aj3.a r0 = r0.mo143289l(r1)
            r0.mo143286i()
            r1 = 1
            goto L_0x01a3
        L_0x018e:
            r20 = r3
            r10 = r4
            r11 = r5
            r21 = r6
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = r2.f219757l
            r0[r13] = r3
            java.lang.String r3 = "expand anim skip, username: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r3, r0)
            r10.mo70206a(r2)
        L_0x01a3:
            r0 = 1
            r2 = 0
            goto L_0x01b1
        L_0x01a6:
            r20 = r3
            r10 = r4
            r11 = r5
            r21 = r6
            r1 = 1
            r2 = 0
            r10.mo70206a(r2)
        L_0x01b1:
            int r3 = r20 + 1
            r4 = r10
            r5 = r11
            r6 = r21
            r8 = 1
            r10 = 132(0x84, float:1.85E-43)
            r11 = r2
            goto L_0x00f5
        L_0x01be:
            r10 = r4
            r11 = r5
            if (r0 != 0) goto L_0x01c5
            r10.mo70207b()
        L_0x01c5:
            com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.TopSessionFoldStruct
            r0.<init>()
            r0.f79189d = r14
            r1 = 1
            r0.f79190e = r1
            r0.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[perform collapse] topFoldCount: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", allTopCount: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.mo103799v(com.tencent.mm.ui.conversation.p$m):void");
    }

    /* renamed from: w */
    public final void mo103800w() {
        boolean z;
        HashMap l;
        C13598b0 b0Var;
        if (mo103797t()) {
            C74720p.C74733m m = mo103790m("message_fold");
            if (m != null) {
                mo103799v(m);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                mo103799v((C74720p.C74733m) null);
            }
        } else if (mo103796s()) {
            C74720p pVar = this.f219405d;
            long j = 0;
            if (pVar == null || (l = pVar.mo104614l()) == null) {
                z = false;
            } else {
                z = false;
                for (Map.Entry value : l.entrySet()) {
                    C72976h2 h2Var = (C72976h2) value.getValue();
                    if (C72996z1.m85828Z4(h2Var.getUsername())) {
                        mo103803z(h2Var, 262144, (String) null);
                        z = true;
                    } else if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69754Z(h2Var)) {
                        j++;
                    }
                }
            }
            if (!z) {
                m89356g(this, 8, false, 2, (Object) null);
                Log.m105924i("MicroMsg.FolderHelper", "performAllExpand, fold item not exit!");
                return;
            }
            MultiProcessMMKV.getSingleMMKV("message_fold_config2").encode("fold_button_status_int_sync", 262144);
            this.f219422x = true;
            mo103802y(true);
            int i = this.f219423y;
            long j2 = j + ((long) i);
            mo103785h(false, i);
            TopSessionFoldStruct topSessionFoldStruct = new TopSessionFoldStruct();
            topSessionFoldStruct.f79189d = j2;
            topSessionFoldStruct.f79190e = 2;
            topSessionFoldStruct.mo86054n();
            Log.m105924i("MicroMsg.FolderHelper", "[perform expand], allPlaceTopCount: " + j2 + ", foldedItemCounts:" + this.f219423y);
        } else {
            m89356g(this, 8, false, 2, (Object) null);
            Log.m105920e("MicroMsg.FolderHelper", "fold item no exist or no need collapse or expand !");
        }
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if (eVar != null) {
            if (C87412m.m108589b(eVar.f123845b, "insert")) {
                int size = eVar.f123846c.size();
                for (int i = 0; i < size; i++) {
                    C72963f4 f4Var = eVar.f123846c.get(i);
                    if (f4Var != null) {
                        mo103788k(eVar, f4Var, true);
                    }
                }
            } else if (C87412m.m108589b(eVar.f123845b, "update")) {
                int size2 = eVar.f123846c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C72963f4 f4Var2 = eVar.f123846c.get(i2);
                    if (f4Var2 != null) {
                        mo103788k(eVar, f4Var2, false);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo103801x(boolean z) {
        ConversationListView conversationListView = this.f219407f;
        if (conversationListView != null) {
            C74720p pVar = this.f219405d;
            SparseArray[] n = pVar != null ? pVar.mo104615n() : null;
            int i = -1;
            if (n != null) {
                for (SparseArray sparseArray : n) {
                    int size = sparseArray.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (C87412m.m108589b(sparseArray.get(i2), "message_fold")) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue < 0) {
                return;
            }
            if (z) {
                conversationListView.smoothScrollToPositionFromTop(conversationListView.getHeaderViewsCount() + intValue, 0, (int) this.f219419u);
            } else {
                conversationListView.smoothScrollToPositionFromTop(conversationListView.getHeaderViewsCount() + intValue, 0, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if ((r7 != null && r7.f212787o1 == 132) != false) goto L_0x0061;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103802y(boolean r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.ui.conversation.p r2 = r11.f219405d
            java.lang.String r3 = "message_fold"
            java.lang.String r4 = "MicroMsg.FolderHelper"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x00b0
            java.util.HashMap r2 = r2.mo104614l()
            if (r2 == 0) goto L_0x00b0
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.storage.h2 r7 = (com.tencent.p014mm.storage.C72976h2) r7
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r8 = r8.mo105908w()
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            boolean r8 = r8.mo69754Z(r7)
            r9 = 0
            if (r8 == 0) goto L_0x007e
            r11.mo103779a(r7, r6, r6)
            if (r7 == 0) goto L_0x0051
            int r8 = r7.f212787o1
            r10 = 4
            if (r8 != r10) goto L_0x0051
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 != 0) goto L_0x0061
            if (r7 == 0) goto L_0x005e
            int r8 = r7.f212787o1
            r10 = 132(0x84, float:1.85E-43)
            if (r8 != r10) goto L_0x005e
            r8 = 1
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            if (r8 == 0) goto L_0x0068
        L_0x0061:
            java.lang.String r8 = r7.getUsername()
            r0.add(r8)
        L_0x0068:
            if (r7 == 0) goto L_0x006f
            java.lang.String r8 = r7.mo108782C2()
            goto L_0x0070
        L_0x006f:
            r8 = r9
        L_0x0070:
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 == 0) goto L_0x0081
            java.lang.String r8 = r7.getUsername()
            r1.add(r8)
            goto L_0x0081
        L_0x007e:
            r11.mo103803z(r7, r6, r9)
        L_0x0081:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "updateAllFoldFlag, username:"
            r8.append(r10)
            if (r7 == 0) goto L_0x0093
            java.lang.String r10 = r7.getUsername()
            goto L_0x0094
        L_0x0093:
            r10 = r9
        L_0x0094:
            r8.append(r10)
            java.lang.String r10 = ", foldFlag: "
            r8.append(r10)
            if (r7 == 0) goto L_0x00a4
            int r7 = r7.f212787o1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
        L_0x00a4:
            r8.append(r9)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r7)
            goto L_0x0022
        L_0x00b0:
            if (r12 != 0) goto L_0x00d2
            kl3.b r12 = r11.f219398E
            if (r12 == 0) goto L_0x00b9
            r12.mo106817a()
        L_0x00b9:
            com.tencent.mm.ui.conversation.ConversationListView r12 = r11.f219407f
            if (r12 == 0) goto L_0x00c0
            r12.mo103716f(r6)
        L_0x00c0:
            int r12 = r0.size()
            r11.f219423y = r12
            r11.f219424z = r6
            r11.f219397D = r6
            r11.f219396C = r5
            bi3.c$a r12 = bi3.C67247c.f193088a
            r12.mo91404e(r0, r3)
            goto L_0x00fe
        L_0x00d2:
            long r0 = java.lang.System.currentTimeMillis()
            bi3.c$a r12 = bi3.C67247c.f193088a
            java.util.List r2 = r12.mo91400a()
            r3 = r2
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r11.f219423y = r3
            r11.f219424z = r3
            java.lang.String r3 = ""
            r12.mo91404e(r2, r3)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12[r6] = r0
            java.lang.String r0 = "perform expand cost time: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r12)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.FolderHelper.mo103802y(boolean):void");
    }

    /* renamed from: z */
    public final void mo103803z(C72976h2 h2Var, int i, String str) {
        if (h2Var != null) {
            h2Var.f212787o1 = i;
        }
        if (h2Var != null) {
            h2Var.mo108807c3(str);
        }
    }
}

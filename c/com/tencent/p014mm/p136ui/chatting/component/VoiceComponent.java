package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoiceInputStartEvent;
import com.tencent.p014mm.autogen.events.VoiceMsgDownloadFinishEvent;
import com.tencent.p014mm.autogen.events.VoicePlayStopEvent;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.chatting.AutoPlay;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.p136ui.chatting.manager.C73758a;
import com.tencent.p014mm.p136ui.tools.C74860u1;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$k1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31541z2;
import eb0.C45628s0;
import eb0.C75601x2;
import eb0.C97625j3;
import g62.C75875l;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import kd0.C76535a0;
import kd0.C76538e;
import kd0.C76539f;
import kd0.C76540g;
import kd0.C76551y;
import kd0.C76552z;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C61985a;
import ob0.C76995i;
import org.json.JSONObject;
import p248ug.C52558c;
import p270xi.C91212b;
import p371ph.C21967a;
import p910lj.C76701a;
import pu0.C110248b;
import tc0.C48629h;
import tc0.C77885p;
import uw2.C78291e;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79362h1;
import zj3.C79368l;
import zj3.C79369m;
import zj3.C79376p0;
import zj3.C79387w;
import zt3.C119157j;

@C91212b(exportInterface = C79362h1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent */
public class VoiceComponent extends C73412a implements C79362h1, C11385n {

    /* renamed from: F */
    public static Object f215712F = new Object();

    /* renamed from: A */
    public IListener<VoicePlayStopEvent> f215713A;

    /* renamed from: B */
    public View f215714B;

    /* renamed from: C */
    public ChatFooter$$k1 f215715C;

    /* renamed from: D */
    public IListener<VoiceInputStartEvent> f215716D;

    /* renamed from: E */
    public List<WeakReference<View>> f215717E;

    /* renamed from: e */
    public AutoPlay f215718e = null;

    /* renamed from: f */
    public boolean f215719f = false;

    /* renamed from: g */
    public boolean f215720g = false;

    /* renamed from: h */
    public long f215721h;

    /* renamed from: i */
    public WeakReference<View> f215722i;

    /* renamed from: j */
    public ConcurrentHashMap<Long, Boolean> f215723j = new ConcurrentHashMap<>();

    /* renamed from: n */
    public boolean f215724n = false;

    /* renamed from: o */
    public C114668z f215725o = new C73404a();

    /* renamed from: p */
    public boolean f215726p = false;

    /* renamed from: q */
    public int f215727q = -1;

    /* renamed from: r */
    public boolean f215728r = false;

    /* renamed from: s */
    public Future f215729s = null;

    /* renamed from: t */
    public long f215730t = -1;

    /* renamed from: u */
    public boolean f215731u = false;

    /* renamed from: v */
    public long f215732v = -1;

    /* renamed from: w */
    public C73411f f215733w = null;

    /* renamed from: x */
    public Future f215734x = null;

    /* renamed from: y */
    public C75601x2 f215735y = new C73406b();

    /* renamed from: z */
    public IListener<VoiceMsgDownloadFinishEvent> f215736z;

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$a */
    public class C73404a implements C114668z {

        /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$a$a */
        public class C73405a implements Runnable {
            public C73405a() {
            }

            public void run() {
                VoiceComponent.this.mo102331a6();
            }
        }

        public C73404a() {
        }

        public void onAppBackground(String str) {
            if (VoiceComponent.this.f215724n) {
                ((C119157j) C119157j.f356862d).mo183895z(new C73405a());
            }
        }

        public void onAppForeground(String str) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$b */
    public class C73406b implements C75601x2 {

        /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$b$a */
        public class C73407a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ long f215743d;

            public C73407a(long j) {
                this.f215743d = j;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Class cls = C79368l.class;
                if (((C72972g4) C97625j3.m125812b().mo105911z()).mo101061CZ(((MMNotification) C97625j3.m125816f()).f194715b, this.f215743d).getMsgId() > 0) {
                    int p = ((C79368l) VoiceComponent.this.f215752d.f193278b.mo102812a(cls)).mo108205p();
                    int count = ((C79368l) VoiceComponent.this.f215752d.f193278b.mo102812a(cls)).getCount();
                    C75875l z = C97625j3.m125812b().mo105911z();
                    String str = ((MMNotification) C97625j3.m125816f()).f194715b;
                    long j = this.f215743d;
                    C72972g4 g4Var = (C72972g4) z;
                    g4Var.getClass();
                    String str2 = "SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " < " + j + " ORDER BY " + "createTime" + " ASC LIMIT -1 OFFSET " + (p - count);
                    Cursor rawQuery = g4Var.f212775p.rawQuery(str2, (String[]) null);
                    int count2 = rawQuery.getCount();
                    rawQuery.close();
                    Log.m105918d("MicroMsg.MsgInfoStorage", "getPositionByCreateTime talk:" + str + " time:" + j + " count " + count2 + " [" + str2 + "]");
                    if (count2 >= 0 && count > count2) {
                        VoiceComponent.this.f215752d.mo91549J(count2, false, false, 0);
                    }
                }
            }
        }

        public C73406b() {
        }

        /* renamed from: a */
        public void mo98148a(String str, long j) {
            Log.m105918d("MicroMsg.ChattingUI.VoiceComponent", "onVoiceRemind " + str + " time " + j);
            if (C72996z1.m85803I5(((MMNotification) C97625j3.m125816f()).f194715b)) {
                C76879j.m92717K(VoiceComponent.this.f215752d.mo91565f(), false, str, VoiceComponent.this.f215752d.mo91572m().getString(C0966R.string.kdt), VoiceComponent.this.f215752d.mo91572m().getString(C0966R.string.kdq), VoiceComponent.this.f215752d.mo91572m().getString(C0966R.string.kds), new C73407a(j), (DialogInterface.OnClickListener) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$c */
    public class C73408c implements ChatFooter$$k1 {
        public C73408c() {
        }

        /* renamed from: a */
        public void mo102342a(Boolean bool) {
            if (bool.booleanValue()) {
                VoiceComponent voiceComponent = VoiceComponent.this;
                if (voiceComponent.f215714B == null) {
                    voiceComponent.f215714B = ((ViewStub) voiceComponent.f215752d.mo91562c(C0966R.C0970id.l9s)).inflate();
                }
                View view = VoiceComponent.this.f215714B;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = VoiceComponent.this.f215714B;
            if (view3 != null && view3.getVisibility() == 0) {
                View view4 = VoiceComponent.this.f215714B;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$d */
    public class C73409d implements Runnable {
        public C73409d() {
        }

        public void run() {
            synchronized (VoiceComponent.f215712F) {
                VoiceComponent voiceComponent = VoiceComponent.this;
                if (!voiceComponent.f215726p) {
                    voiceComponent.mo102333b6();
                    VoiceComponent.this.f215728r = false;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$e */
    public class C73410e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SparseArray f215747d;

        /* renamed from: e */
        public final /* synthetic */ C79368l f215748e;

        public C73410e(SparseArray sparseArray, C79368l lVar) {
            this.f215747d = sparseArray;
            this.f215748e = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0196 A[EDGE_INSN: B:100:0x0196->B:63:0x0196 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x018d A[LOOP:0: B:1:0x003c->B:61:0x018d, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r19 = this;
                r0 = r19
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                com.tencent.mm.ui.chatting.component.VoiceComponent r3 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                com.tencent.mm.ui.chatting.component.VoiceComponent$f r3 = r3.f215733w
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "MicroMsg.ChattingUI.VoiceComponent"
                java.lang.String r5 = "showVoiceFastTransTextBt lastScrollState:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r2)
                com.tencent.mm.ui.chatting.component.VoiceComponent r2 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                long r5 = r2.f215730t
                r7 = -1
                r2.f215730t = r7
                ck3.b r2 = r2.f215752d
                java.lang.Class<zj3.c0> r7 = zj3.C79343c0.class
                com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
                xi.d r2 = r2.mo102812a(r7)
                zj3.c0 r2 = (zj3.C79343c0) r2
                int r2 = r2.mo102608N1()
                com.tencent.mm.ui.chatting.component.VoiceComponent r7 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                java.util.List<java.lang.ref.WeakReference<android.view.View>> r7 = r7.f215717E
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                r7.clear()
                android.util.SparseArray r7 = r0.f215747d
                int r7 = r7.size()
                int r7 = r7 - r1
                r9 = 0
            L_0x003c:
                r10 = 2131299234(0x7f090ba2, float:1.8216464E38)
                if (r7 < 0) goto L_0x0194
                android.util.SparseArray r11 = r0.f215747d
                java.lang.Object r11 = r11.get(r7)
                com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
                com.tencent.mm.ui.chatting.component.VoiceComponent r12 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                zj3.l r13 = r0.f215748e
                r12.getClass()
                if (r11 != 0) goto L_0x005d
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r13 = java.lang.Boolean.FALSE
                r12.<init>(r13, r13)
            L_0x0059:
                r17 = r5
                goto L_0x0177
            L_0x005d:
                int r14 = r11.getType()
                r15 = 34
                if (r14 == r15) goto L_0x006f
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r12.<init>(r13, r14)
                goto L_0x0059
            L_0x006f:
                int r14 = r11.mo108769t2()
                if (r14 != r1) goto L_0x007f
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r12.<init>(r13, r14)
                goto L_0x0059
            L_0x007f:
                com.tencent.mm.ui.chatting.component.VoiceComponent$f r14 = r12.f215733w
                if (r14 != 0) goto L_0x008d
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r12.<init>(r13, r14)
                goto L_0x0059
            L_0x008d:
                long r14 = r11.getMsgId()
                com.tencent.mm.ui.chatting.component.VoiceComponent$f r8 = r12.f215733w
                r17 = r5
                long r4 = r8.f215751b
                int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00a6
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x00a6:
                long r4 = r11.getMsgId()
                com.tencent.mm.ui.chatting.component.VoiceComponent$f r6 = r12.f215733w
                long r14 = r6.f215750a
                int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r6 >= 0) goto L_0x00bb
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r12.<init>(r4, r4)
                goto L_0x0177
            L_0x00bb:
                long r4 = r11.getMsgId()
                android.view.View r4 = r13.mo108212v(r4)
                if (r4 != 0) goto L_0x00d0
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x00d0:
                android.view.View r5 = r4.findViewById(r10)
                android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
                if (r5 == 0) goto L_0x00ea
                int r6 = r5.getVisibility()
                if (r6 != 0) goto L_0x00ea
                java.util.List<java.lang.ref.WeakReference<android.view.View>> r6 = r12.f215717E
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
                r8.<init>(r5)
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                r6.add(r8)
            L_0x00ea:
                ck3.b r5 = r12.f215752d
                java.lang.Class<zj3.h1> r6 = zj3.C79362h1.class
                com.tencent.mm.ui.chatting.manager.a r5 = r5.f193278b
                xi.d r5 = r5.mo102812a(r6)
                zj3.h1 r5 = (zj3.C79362h1) r5
                com.tencent.mm.ui.chatting.AutoPlay r5 = r5.mo102325W()
                if (r5 == 0) goto L_0x0106
                long r5 = r5.f215195h
                long r13 = r11.getMsgId()
                int r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x010c
            L_0x0106:
                boolean r5 = kd0.C76552z.m92079q(r11)
                if (r5 == 0) goto L_0x010e
            L_0x010c:
                r5 = 1
                goto L_0x010f
            L_0x010e:
                r5 = 0
            L_0x010f:
                if (r5 == 0) goto L_0x011b
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x011b:
                boolean r5 = r11.mo101013q3()
                if (r5 == 0) goto L_0x012b
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x012b:
                r5 = 2
                int[] r5 = new int[r5]
                r4.getLocationInWindow(r5)
                r5 = r5[r1]
                if (r5 != 0) goto L_0x013f
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x013f:
                int r5 = r5 - r2
                if (r5 < 0) goto L_0x014a
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                r12.<init>(r4, r4)
                goto L_0x0177
            L_0x014a:
                int r6 = r12.f215727q
                r8 = -1
                if (r6 != r8) goto L_0x015d
                ck3.b r6 = r12.f215752d
                android.app.Activity r6 = r6.mo91565f()
                r8 = 30
                int r6 = kg3.C76577a.m92151b(r6, r8)
                r12.f215727q = r6
            L_0x015d:
                int r4 = r4.getHeight()
                int r4 = r4 + r5
                int r5 = r12.f215727q
                if (r4 <= r5) goto L_0x0170
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r12.<init>(r4, r5)
                goto L_0x0177
            L_0x0170:
                android.util.Pair r12 = new android.util.Pair
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r12.<init>(r4, r4)
            L_0x0177:
                java.lang.Object r4 = r12.second
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x0182
                r9 = r11
            L_0x0182:
                java.lang.Object r4 = r12.first
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x018d
                goto L_0x0196
            L_0x018d:
                int r7 = r7 + -1
                r5 = r17
                r4 = 0
                goto L_0x003c
            L_0x0194:
                r17 = r5
            L_0x0196:
                java.lang.Object[] r2 = new java.lang.Object[r1]
                if (r9 == 0) goto L_0x01bb
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                long r5 = r9.getMsgId()
                r4.append(r5)
                java.lang.String r5 = "_"
                r4.append(r5)
                java.lang.String r5 = r9.getContent()
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                goto L_0x01bd
            L_0x01bb:
                java.lang.String r4 = "null"
            L_0x01bd:
                r5 = 0
                r2[r5] = r4
                java.lang.String r4 = "showVoiceFastTransTextBt msg:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
                if (r9 == 0) goto L_0x01e5
                zj3.l r2 = r0.f215748e
                long r3 = r9.getMsgId()
                android.view.View r2 = r2.mo108212v(r3)
                if (r2 == 0) goto L_0x01e5
                android.view.View r2 = r2.findViewById(r10)
                r8 = r2
                android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
                if (r8 == 0) goto L_0x01e6
                com.tencent.mm.ui.chatting.component.VoiceComponent r2 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                long r3 = r9.getMsgId()
                r2.f215730t = r3
                goto L_0x01e6
            L_0x01e5:
                r8 = 0
            L_0x01e6:
                r2 = 0
                int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x0217
                if (r9 == 0) goto L_0x01f6
                long r2 = r9.getMsgId()
                int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x0217
            L_0x01f6:
                zj3.l r2 = r0.f215748e
                r3 = r17
                android.view.View r2 = r2.mo108212v(r3)
                if (r2 == 0) goto L_0x0219
                android.view.View r2 = r2.findViewById(r10)
                android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
                if (r2 == 0) goto L_0x0219
                com.tencent.mm.ui.chatting.component.VoiceComponent r5 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                java.util.List<java.lang.ref.WeakReference<android.view.View>> r5 = r5.f215717E
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
                r6.<init>(r2)
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                r5.add(r6)
                goto L_0x0219
            L_0x0217:
                r3 = r17
            L_0x0219:
                com.tencent.mm.ui.chatting.component.VoiceComponent r2 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                java.util.List<java.lang.ref.WeakReference<android.view.View>> r2 = r2.f215717E
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x0223:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x0285
                java.lang.Object r5 = r2.next()
                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                if (r5 == 0) goto L_0x0223
                java.lang.Object r6 = r5.get()
                if (r6 == 0) goto L_0x0223
                java.lang.Object r6 = r5.get()
                if (r6 == r8) goto L_0x0223
                java.lang.Object r5 = r5.get()
                android.view.View r5 = (android.view.View) r5
                r6 = 8
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r6)
                java.lang.Object[] r10 = r7.mo10232b()
                java.lang.String r11 = "com/tencent/mm/ui/chatting/component/VoiceComponent$9"
                java.lang.String r12 = "run"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r5
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                r6 = 0
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r6 = r7.intValue()
                r5.setVisibility(r6)
                java.lang.String r10 = "com/tencent/mm/ui/chatting/component/VoiceComponent$9"
                java.lang.String r11 = "run"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0223
            L_0x0285:
                if (r8 == 0) goto L_0x0296
                r2 = 0
                r8.setVisibility(r2)
                com.tencent.mm.ui.chatting.component.VoiceComponent r2 = com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.this
                long r5 = r2.f215730t
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 == 0) goto L_0x0296
                com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74180c.m88388p0(r1, r5)
            L_0x0296:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.C73410e.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$f */
    public static class C73411f {

        /* renamed from: a */
        public long f215750a = -1;

        /* renamed from: b */
        public long f215751b = -1;

        public String toString() {
            return "ScrollState{firstCheckMsgId=" + this.f215750a + ", lastCheckMsgId=" + this.f215751b + '}';
        }
    }

    public VoiceComponent() {
        C40008f fVar = C40008f.f107254d;
        this.f215736z = new IListener<VoiceMsgDownloadFinishEvent>(fVar) {
            {
                this.__eventId = -1397503360;
            }

            public boolean callback(IEvent iEvent) {
                Object obj;
                boolean z;
                VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent = (VoiceMsgDownloadFinishEvent) iEvent;
                if (voiceMsgDownloadFinishEvent != null && VoiceComponent.this.f215723j.containsKey(Long.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194005a))) {
                    boolean z2 = false;
                    Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "voice msg(%s) download finish, success:%s, isReDownload:%s", Long.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194005a), Boolean.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194006b), Boolean.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194007c));
                    VoiceComponent.this.f215723j.put(Long.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194005a), Boolean.FALSE);
                    VoiceMsgDownloadFinishEvent.C67814a aVar = voiceMsgDownloadFinishEvent.f194004d;
                    if (aVar.f194006b && !aVar.f194007c) {
                        long j = aVar.f194005a;
                        VoiceComponent voiceComponent = VoiceComponent.this;
                        long j2 = voiceComponent.f215721h;
                        if (j != j2 || !voiceComponent.f215720g) {
                            Log.m105921e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadMsgId:%s canAutoPlayDownloadVoice:%s", Long.valueOf(j2), Boolean.valueOf(VoiceComponent.this.f215720g));
                        } else {
                            WeakReference<View> weakReference = voiceComponent.f215722i;
                            if (weakReference == null || weakReference.get() == null) {
                                Object[] objArr = new Object[2];
                                objArr[0] = Boolean.valueOf(VoiceComponent.this.f215722i == null);
                                WeakReference<View> weakReference2 = VoiceComponent.this.f215722i;
                                if (weakReference2 == null) {
                                    obj = "null";
                                } else {
                                    obj = Boolean.valueOf(weakReference2.get() == null);
                                }
                                objArr[1] = obj;
                                Log.m105921e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadView:%s view:%s", objArr);
                            } else {
                                int g = VoiceComponent.this.f215752d.mo91566g() - VoiceComponent.this.f215752d.mo91568i();
                                int j3 = VoiceComponent.this.f215752d.mo91569j() - VoiceComponent.this.f215752d.mo91568i();
                                C79368l lVar = (C79368l) VoiceComponent.this.f215752d.f193278b.mo102812a(C79368l.class);
                                while (true) {
                                    if (g <= j3) {
                                        C72963f4 item = lVar.getItem(g);
                                        if (item != null && item.getMsgId() == voiceMsgDownloadFinishEvent.f194004d.f194005a) {
                                            z = true;
                                            break;
                                        }
                                        g++;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "msgId:%s showInScreen:%s", Long.valueOf(voiceMsgDownloadFinishEvent.f194004d.f194005a), Boolean.valueOf(z));
                                z2 = z;
                            }
                        }
                    }
                    ((C119157j) C119157j.f356862d).mo183895z(new C73464d6(this, z2));
                }
                return true;
            }
        };
        this.f215713A = new IListener<VoicePlayStopEvent>(fVar) {
            {
                this.__eventId = 1250962690;
            }

            public boolean callback(IEvent iEvent) {
                if (((VoicePlayStopEvent) iEvent) != null) {
                    VoiceComponent voiceComponent = VoiceComponent.this;
                    voiceComponent.f215726p = false;
                    voiceComponent.f215731u = false;
                    voiceComponent.mo102333b6();
                }
                return false;
            }
        };
        this.f215714B = null;
        this.f215715C = new C73408c();
        this.f215716D = new IListener<VoiceInputStartEvent>(fVar) {
            {
                this.__eventId = -615338656;
            }

            public boolean callback(IEvent iEvent) {
                if (!((VoiceInputStartEvent) iEvent).f194002d.f194003a) {
                    return false;
                }
                C74860u1.f220100a.mo104088b(true);
                VoiceComponent voiceComponent = VoiceComponent.this;
                Object obj = VoiceComponent.f215712F;
                voiceComponent.mo102330Z5();
                return false;
            }
        };
        this.f215717E = new ArrayList();
    }

    /* renamed from: B0 */
    public void mo102319B0() {
        C79343c0 c0Var = (C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class);
        C73758a aVar = this.f215752d.f193278b;
        C79376p0 p0Var = (C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class);
        int i = 8;
        if (((C79369m) aVar.mo102812a(C79369m.class)).mo102685p2() || p0Var.mo102698q2()) {
            Log.m105918d("MicroMsg.ChattingUI.VoiceComponent", "trigger title icon, in show mode");
            this.f215752d.mo91553N(2, false);
            c0Var.mo102624k4(8);
            c0Var.mo102607J4(8);
            return;
        }
        if (mo102332b()) {
            c0Var.mo102607J4(0);
        } else {
            c0Var.mo102607J4(8);
        }
        Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(26, (Object) null);
        if (bool == null) {
            this.f215719f = false;
        } else {
            this.f215719f = bool.booleanValue();
        }
        Log.printInfoStack("MicroMsg.ChattingUI.VoiceComponent", "triggerTitleIcon and setForceSpeakOff value is %s", Boolean.valueOf(this.f215719f));
        if (this.f215719f) {
            i = 0;
        }
        c0Var.mo102624k4(i);
    }

    /* renamed from: D1 */
    public void mo102320D1(long j, View view) {
        this.f215721h = j;
        this.f215722i = new WeakReference<>(view);
    }

    /* renamed from: F */
    public void mo102321F(long j) {
        RelativeLayout relativeLayout;
        if (this.f215730t == j) {
            synchronized (f215712F) {
                this.f215726p = true;
            }
            View v = ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108212v(this.f215730t);
            if (v != null && (relativeLayout = (RelativeLayout) v.findViewById(C0966R.C0970id.b5g)) != null) {
                this.f215730t = -1;
                relativeLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C52558c.C52560b r2;
        Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay looper[%s]", Looper.myLooper());
        this.f215720g = true;
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f215724n) {
            Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "resetAutoPlay autoPlay is:%s tid:%d looper:%s", this.f215718e, Long.valueOf(Thread.currentThread().getId()), Looper.myLooper());
            AutoPlay autoPlay = this.f215718e;
            if (autoPlay == null) {
                C67391b bVar = this.f215752d;
                AutoPlay autoPlay2 = new AutoPlay(bVar, this, bVar.mo91577r());
                this.f215718e = autoPlay2;
                Set<C76538e> set = C76535a0.f223989d;
                if (!set.contains(autoPlay2)) {
                    set.add(autoPlay2);
                }
                AutoPlay autoPlay3 = this.f215718e;
                if (!((ArrayList) C76539f.f223993t).contains(autoPlay3)) {
                    ((ArrayList) C76539f.f223993t).add(autoPlay3);
                }
            } else {
                autoPlay.mo102004g(this.f215752d.mo91577r());
            }
            boolean nullAs = Util.nullAs((Boolean) C97625j3.m125812b().mo105906u().mo119684e(16387, (Object) null), true);
            AutoPlay autoPlay4 = this.f215718e;
            if (!autoPlay4.f215209y) {
                autoPlay4.f215205u = nullAs;
                autoPlay4.mo102005h();
            }
            C52558c bizInfo = ((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).getBizInfo();
            if (!(bizInfo == null || (r2 = bizInfo.mo73500r2(false)) == null)) {
                JSONObject jSONObject = r2.f146795a;
                if (jSONObject != null) {
                    r2.f146810p = jSONObject.optInt("AudioPlayType", 0) == 1;
                }
                if (r2.f146810p) {
                    this.f215718e.f215208x = false;
                }
            }
            this.f215718e.mo102014q(!this.f215719f);
            this.f215718e.mo102009l();
        }
        Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay end take[%s]ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (C72996z1.m85803I5(this.f215752d.mo91577r()) && C31519v2.m39437b() != null) {
            C31541z2 b = C31519v2.m39437b();
            C75601x2 x2Var = this.f215735y;
            C78291e eVar = (C78291e) b;
            eVar.getClass();
            Log.m105918d("MicroMsg.SubCoreVoiceRemind", "addVoiceRemind ");
            if (x2Var != null) {
                ((HashSet) eVar.f229339h).add(x2Var);
            }
        }
        if (!C76850a.m92640l()) {
            ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102191h2(this.f215715C);
        }
        mo102319B0();
        AppForegroundDelegate.INSTANCE.mo174215k(this.f215725o);
        C74860u1.f220100a.mo104088b(true);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        mo102330Z5();
    }

    /* renamed from: H5 */
    public boolean mo102322H5() {
        return this.f215719f;
    }

    /* renamed from: I3 */
    public void mo102323I3(long j) {
        this.f215723j.put(Long.valueOf(j), Boolean.TRUE);
    }

    /* renamed from: M1 */
    public void mo102324M1() {
        this.f215721h = 0;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        mo102319B0();
    }

    /* renamed from: U5 */
    public boolean mo70055U5(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: W */
    public AutoPlay mo102325W() {
        return this.f215718e;
    }

    /* renamed from: W0 */
    public boolean mo102326W0(long j) {
        if (this.f215723j.containsKey(Long.valueOf(j))) {
            return this.f215723j.get(Long.valueOf(j)).booleanValue();
        }
        return false;
    }

    /* renamed from: W2 */
    public void mo102327W2() {
        this.f215731u = true;
        mo102333b6();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if (r7.f215731u == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r7.f215731u = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r7.f215731u = true;
        mo102333b6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* renamed from: W5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26189W5(android.view.View r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            if (r10 != 0) goto L_0x000a
            java.lang.String r8 = "MicroMsg.ChattingUI.VoiceComponent"
            java.lang.String r9 = "onScroll visibleItemCount == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)
            return
        L_0x000a:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f215732v
            r4 = -1
            r8 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0021
            r7.f215731u = r8
        L_0x0021:
            r7.f215732v = r0
            ck3.b r0 = r7.f215752d
            java.lang.Class<zj3.l> r1 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.l r0 = (zj3.C79368l) r0
            com.tencent.mm.ui.chatting.component.VoiceComponent$f r1 = new com.tencent.mm.ui.chatting.component.VoiceComponent$f
            r1.<init>()
            ck3.b r2 = r7.f215752d
            int r2 = r2.mo91568i()
            int r3 = r9 - r2
            com.tencent.mm.storage.f4 r4 = r0.getItem(r3)
            if (r4 == 0) goto L_0x0049
            long r4 = r4.getMsgId()
            r1.f215750a = r4
            goto L_0x0058
        L_0x0049:
            int r4 = r9 + 1
            int r4 = r4 - r2
            com.tencent.mm.storage.f4 r2 = r0.getItem(r4)
            if (r2 == 0) goto L_0x0058
            long r4 = r2.getMsgId()
            r1.f215750a = r4
        L_0x0058:
            int r3 = r3 + r10
            r2 = 2
            int r3 = r3 + r2
            int r4 = r0.getCount()
            r5 = 1
            int r4 = r4 - r5
            if (r3 <= r4) goto L_0x0068
            int r3 = r0.getCount()
            int r3 = r3 - r5
        L_0x0068:
            com.tencent.mm.storage.f4 r0 = r0.getItem(r3)
            if (r0 == 0) goto L_0x0074
            long r3 = r0.getMsgId()
            r1.f215751b = r3
        L_0x0074:
            r7.f215733w = r1
            java.lang.String r0 = "MicroMsg.ChattingUI.VoiceComponent"
            java.lang.String r1 = "onScroll firstVisibleItem:%s visibleItemCount:%s totalItemCount:%s isNoSmoothScrool:%s ifScroll:%s"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r8] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r3[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r3[r2] = r9
            r9 = 3
            boolean r10 = r7.f215731u
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3[r9] = r10
            r9 = 4
            boolean r10 = r7.f215728r
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r3)
            boolean r9 = r7.f215728r
            if (r9 == 0) goto L_0x00c6
            r7.f215731u = r8
            java.util.concurrent.Future r9 = r7.f215729s
            if (r9 == 0) goto L_0x00b1
            r9.cancel(r5)
        L_0x00b1:
            zt3.t r9 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.component.VoiceComponent$d r10 = new com.tencent.mm.ui.chatting.component.VoiceComponent$d
            r10.<init>()
            r0 = 300(0x12c, double:1.48E-321)
            zt3.j r9 = (zt3.C119157j) r9
            r9.getClass()
            lu3.c r8 = r9.mo183892w(r10, r0, r8)
            r7.f215729s = r8
            goto L_0x00de
        L_0x00c6:
            java.lang.Object r9 = f215712F
            monitor-enter(r9)
            boolean r10 = r7.f215726p     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00d1
            r7.f215731u = r8     // Catch:{ all -> 0x00df }
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            return
        L_0x00d1:
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            boolean r9 = r7.f215731u
            if (r9 == 0) goto L_0x00d9
            r7.f215731u = r8
            return
        L_0x00d9:
            r7.f215731u = r5
            r7.mo102333b6()
        L_0x00de:
            return
        L_0x00df:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.VoiceComponent.mo26189W5(android.view.View, int, int, int):void");
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "onScrollStateChanged %s", Integer.valueOf(i));
        this.f215731u = false;
        if (i == 0) {
            this.f215728r = false;
            synchronized (f215712F) {
                if (!this.f215726p) {
                    mo102333b6();
                    return;
                }
                return;
            }
        }
        this.f215728r = true;
    }

    /* renamed from: Y5 */
    public void mo102329Y5() {
        this.f215752d.mo91546G(true);
    }

    /* renamed from: Z5 */
    public final void mo102330Z5() {
        boolean isHeld;
        AutoPlay autoPlay;
        Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "voiceComponent doPause");
        this.f215720g = false;
        if (C72996z1.m85803I5(this.f215752d.mo91577r()) && C31519v2.m39437b() != null) {
            C31541z2 b = C31519v2.m39437b();
            C75601x2 x2Var = this.f215735y;
            C78291e eVar = (C78291e) b;
            eVar.getClass();
            Log.m105918d("MicroMsg.SubCoreVoiceRemind", "removeVoiceRemind ");
            if (x2Var != null) {
                ((HashSet) eVar.f229339h).remove(x2Var);
            }
        }
        View view = this.f215714B;
        if (view != null && view.getVisibility() == 0) {
            Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "doPause set voiceinputMask GONE");
            View view2 = this.f215714B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102191h2((ChatFooter$$k1) null);
        C97625j3.m125812b().mo105906u().mo119676J(26, Boolean.valueOf(this.f215719f));
        AutoPlay autoPlay2 = this.f215718e;
        if (autoPlay2 != null && ((C21967a) autoPlay2.f215194g).mo35058b()) {
            C74860u1 u1Var = C74860u1.f220100a;
            if (!(C74860u1.f220103d ? C74860u1.f220102c : true)) {
                this.f215724n = true;
                u1Var.mo104088b(true);
                AppForegroundDelegate.INSTANCE.mo174208a(this.f215725o);
                return;
            }
        }
        C74860u1.f220100a.mo104088b(true);
        synchronized (MMActivityController.f348059r0) {
            PowerManager.WakeLock wakeLock = MMActivityController.f348058q0;
            isHeld = wakeLock != null ? wakeLock.isHeld() : false;
        }
        if (!isHeld && (autoPlay = this.f215718e) != null) {
            autoPlay.mo102005h();
            this.f215718e.mo102016s(false);
            AutoPlay autoPlay3 = this.f215718e;
            autoPlay3.getClass();
            Log.m105924i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
            ShakeManager shakeManager = autoPlay3.f215202r;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
        }
    }

    /* renamed from: a6 */
    public void mo102331a6() {
        this.f215752d.mo91546G(false);
        AutoPlay autoPlay = this.f215718e;
        if (autoPlay != null && this.f215724n) {
            this.f215724n = false;
            autoPlay.mo102005h();
            this.f215718e.mo102016s(false);
            AutoPlay autoPlay2 = this.f215718e;
            autoPlay2.getClass();
            Log.m105924i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
            ShakeManager shakeManager = autoPlay2.f215202r;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
        }
        AppForegroundDelegate.INSTANCE.mo174215k(this.f215725o);
        this.f215724n = false;
    }

    /* renamed from: b */
    public boolean mo102332b() {
        Class cls = C79348e.class;
        boolean q1 = ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70071q1();
        boolean s4 = ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70075s4();
        return q1 ? s4 ? ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70076s5().mo73033l2(1) : ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70057W1().mo73073l2(1) : ((this.f215752d.mo91582w() || s4) && this.f215752d.mo91574o().f149512S == 0) || C45628s0.m50746K(this.f215752d.mo91574o());
    }

    /* renamed from: b6 */
    public void mo102333b6() {
        if (!((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2()) {
            C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
            SparseArray<C72963f4> K1 = lVar.mo108175K1();
            if (K1 != null) {
                this.f215734x = ((C119157j) C119157j.f356862d).mo183895z(new C73410e(K1, lVar));
            }
        }
    }

    /* renamed from: g */
    public boolean mo102334g(C72963f4 f4Var) {
        if (!f4Var.mo100995g4()) {
            return false;
        }
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f215752d.mo91565f(), this.f215752d.f193286j.getContentView());
            return true;
        }
        long msgId = f4Var.getMsgId();
        AutoPlay autoPlay = this.f215718e;
        if (msgId == autoPlay.f215195h) {
            autoPlay.mo102016s(true);
        }
        if (!this.f215752d.mo91577r().equals("medianote")) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
        }
        C73673d4.m87251e(f4Var);
        return true;
    }

    /* renamed from: g4 */
    public boolean mo102335g4(C72963f4 f4Var) {
        if (!f4Var.mo100995g4()) {
            return false;
        }
        long msgId = f4Var.getMsgId();
        AutoPlay autoPlay = this.f215718e;
        if (msgId == autoPlay.f215195h) {
            autoPlay.mo102016s(true);
        }
        return true;
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C97625j3.m125815e().mo123455a(127, this);
        this.f215736z.alive();
        this.f215713A.alive();
        this.f215726p = false;
        mo102333b6();
    }

    /* renamed from: h4 */
    public void mo102336h4(long j) {
        RelativeLayout relativeLayout;
        synchronized (f215712F) {
            this.f215726p = true;
        }
        if (this.f215730t == j) {
            View v = ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108212v(this.f215730t);
            if (v != null && (relativeLayout = (RelativeLayout) v.findViewById(C0966R.C0970id.b5g)) != null) {
                this.f215730t = -1;
                relativeLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: j5 */
    public void mo102337j5(MMFragment mMFragment, boolean z) {
        if (!mMFragment.getLandscapeMode()) {
            return;
        }
        if (z) {
            Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "rotation %d", Integer.valueOf(mMFragment.getWindowManager().getDefaultDisplay().getOrientation()));
            int orientation = mMFragment.getWindowManager().getDefaultDisplay().getOrientation();
            if (orientation == 0) {
                mMFragment.setRequestedOrientation(1);
            } else if (orientation == 1) {
                mMFragment.setRequestedOrientation(0);
            } else if (orientation == 2) {
                mMFragment.setRequestedOrientation(9);
            } else if (orientation == 3) {
                mMFragment.setRequestedOrientation(8);
            }
        } else {
            mMFragment.setRequestedOrientation(-1);
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        Log.m105925i("MicroMsg.ChattingUI.VoiceComponent", "doDestroy, autoPlay:%s", this.f215718e);
        C76535a0.f223989d.remove(this.f215718e);
        ((ArrayList) C76539f.f223993t).remove(this.f215718e);
        C97625j3.m125815e().mo123470p(127, this);
        mo102331a6();
        AutoPlay autoPlay = this.f215718e;
        if (autoPlay != null) {
            autoPlay.mo102005h();
            AutoPlay autoPlay2 = this.f215718e;
            autoPlay2.getClass();
            Log.m105924i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
            ShakeManager shakeManager = autoPlay2.f215202r;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
            ((C21967a) autoPlay2.f215194g).f62210k.getClass();
            C110248b.f329777h.mo161670o("music");
            autoPlay2.f215197j = null;
            autoPlay2.f215209y = false;
            autoPlay2.f215188E.dead();
            ((ArrayList) ((C92614a) C97625j3.m125813c()).f266568b).remove(autoPlay2);
            this.f215718e = null;
        }
        HashMap<String, C76995i> hashMap = C61985a.f176209a;
        Log.m105924i("MicroMsg.AsyncMediaPlayerWrapper", "dead, tag:VoiceComponent_playUploadVoiceSound");
        HashMap<String, C76995i> hashMap2 = C61985a.f176209a;
        C76995i iVar = hashMap2.get("VoiceComponent_playUploadVoiceSound");
        if (iVar != null) {
            iVar.f224991a.quitSafely();
        }
        hashMap2.remove("VoiceComponent_playUploadVoiceSound");
        this.f215716D.dead();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C76551y o;
        MMHandler mMHandler;
        Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " sceneType:" + yVar.getType());
        this.f215752d.mo91561b();
        C67391b bVar = this.f215752d;
        if (!bVar.f193283g) {
            Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd fragment not foreground, return");
        } else if (Util.isTopActivity(bVar.mo91565f())) {
            Activity f = this.f215752d.mo91565f();
            boolean z = false;
            if (!(C74785j2.C6981a.m7247a(f, i, i2, str, 7) || C1468a.m1500a(f, i, i2, new Intent().setClass(f, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) && i == 0 && i2 == 0 && yVar.getType() == 127 && (o = C76552z.m92077o(((C76540g) yVar).f224013f)) != null && o.f224058i == 99) {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_voice_component_upload_sound_async, 0) == 1) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "async playUploadVoiceSound");
                    HashMap<String, C76995i> hashMap = C61985a.f176209a;
                    C73470e6 e6Var = new C73470e6(this);
                    Log.m105924i("MicroMsg.AsyncMediaPlayerWrapper", "play, tag:VoiceComponent_playUploadVoiceSound");
                    HashMap<String, C76995i> hashMap2 = C61985a.f176209a;
                    C76995i iVar = hashMap2.get("VoiceComponent_playUploadVoiceSound");
                    if (iVar == null || !iVar.f224991a.isAlive()) {
                        Log.m105924i("MicroMsg.AsyncMediaPlayerWrapper", "createNewHandler, tag:VoiceComponent_playUploadVoiceSound");
                        HandlerThread handlerThread = new HandlerThread("VoiceComponent_playUploadVoiceSound");
                        handlerThread.start();
                        C76995i iVar2 = new C76995i(handlerThread, new MMHandler(handlerThread.getLooper()));
                        hashMap2.put("VoiceComponent_playUploadVoiceSound", iVar2);
                        mMHandler = iVar2.f224992b;
                    } else {
                        mMHandler = iVar.f224992b;
                    }
                    mMHandler.post(new C61985a.C61986a(e6Var));
                    return;
                }
                Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "sync playUploadVoiceSound");
                PlaySound.play(this.f215752d.mo91565f(), C0966R.string.f7507i8);
            }
        }
    }

    /* renamed from: t4 */
    public boolean mo102338t4(long j) {
        return this.f215730t == j;
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        this.f215716D.alive();
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C97625j3.m125815e().mo123470p(127, this);
        Future future = this.f215734x;
        if (future != null) {
            future.cancel(true);
        }
        this.f215736z.dead();
        this.f215713A.dead();
        this.f215723j.clear();
    }

    /* renamed from: v2 */
    public void mo102339v2(boolean z) {
        if (this.f215718e == null) {
            Log.m105920e("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff error, autoPlay is null!!!");
            return;
        }
        Log.printInfoStack("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff value is %s", Boolean.valueOf(z));
        C79343c0 c0Var = (C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class);
        if (z) {
            this.f215718e.mo102014q(false);
            this.f215719f = true;
            C97625j3.m125812b().mo105906u().mo119676J(26, Boolean.TRUE);
            c0Var.mo102624k4(0);
            C76701a.makeText((Context) this.f215752d.mo91565f(), (CharSequence) this.f215752d.mo91572m().getString(C0966R.string.f06), 0).show();
            this.f215718e.mo102017t();
            this.f215752d.mo91559T(2, C0966R.raw.actionbar_ear_icon);
            return;
        }
        if (!C110248b.Jh0()) {
            this.f215718e.mo102014q(true);
        } else {
            Log.m105924i("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff true but isBluetoothOn");
        }
        this.f215719f = false;
        C97625j3.m125812b().mo105906u().mo119676J(26, Boolean.FALSE);
        c0Var.mo102624k4(8);
        C76701a.makeText((Context) this.f215752d.mo91565f(), (CharSequence) this.f215752d.mo91572m().getString(C0966R.string.f07), 0).show();
        this.f215718e.mo102017t();
        this.f215752d.mo91559T(2, C0966R.raw.actionbar_loud_icon);
    }
}

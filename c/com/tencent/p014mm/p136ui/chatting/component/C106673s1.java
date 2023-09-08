package com.tencent.p014mm.p136ui.chatting.component;

import ak3.C67067f;
import android.content.Intent;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c30.C104289g;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct;
import com.tencent.p014mm.p136ui.chatting.C106691j3;
import com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.magicemoji.core.MEHolderView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d42.C86195z;
import di3.C86312j;
import dm3.C86351b;
import em3.C86576a;
import em3.C86585j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import h61.C87455a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import p1048uk.C102048b;
import p1048uk.C102051g;
import p1048uk.C111180c;
import p1048uk.C111188e;
import p1048uk.C111189f;
import p1048uk.C90685a;
import p212oe.C89205v;
import p212oe.v$$a;
import p225rc.C48016e;
import p270xi.C91212b;
import p777zp.C112645b;
import p933be.C79691a;
import q52.C62582g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import z04.C112550d0;
import zj3.C79368l;
import zj3.C79382t;

@C91212b(exportInterface = C79382t.class)
/* renamed from: com.tencent.mm.ui.chatting.component.s1 */
public final class C106673s1 extends C73412a implements C79382t, C75875l.C75877b {

    /* renamed from: e */
    public final String f318907e = "MicroMsg.EmojiEggComponent";

    /* renamed from: f */
    public boolean f318908f;

    /* renamed from: g */
    public boolean f318909g;

    /* renamed from: h */
    public C72963f4 f318910h;

    /* renamed from: i */
    public final C106691j3 f318911i = new C106691j3();

    /* renamed from: j */
    public final C111189f f318912j = new C111189f();

    /* renamed from: n */
    public final HashMap<Long, Integer> f318913n = new HashMap<>();

    /* renamed from: o */
    public C72963f4 f318914o;

    /* renamed from: p */
    public final C32226l<C72963f4, Boolean> f318915p = new C106676c(this);

    /* renamed from: q */
    public final C32226l<C72963f4, Boolean> f318916q = new C106674a(this);

    /* renamed from: r */
    public final C32226l<C72963f4, Boolean> f318917r = new C106682j(this);

    /* renamed from: s */
    public Runnable f318918s = C106675b.f318924d;

    /* renamed from: t */
    public final ViewTreeObserver.OnScrollChangedListener f318919t = new C106681i(this);

    /* renamed from: u */
    public final C13601g f318920u = C36568h.m40985a(new C106678e(this));

    /* renamed from: v */
    public final C13601g f318921v = C36568h.m40985a(new C106677d(this));

    /* renamed from: w */
    public final C90685a f318922w = new C106684l(this);

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$f */
    public static final class C85816f implements C111189f.C111191b {

        /* renamed from: a */
        public final /* synthetic */ C106673s1 f249938a;

        public C85816f(C106673s1 s1Var) {
            this.f249938a = s1Var;
        }

        /* renamed from: a */
        public void mo119740a() {
        }

        /* renamed from: b */
        public void mo119741b(long j, String str, C102048b.C102049a aVar) {
            C87412m.m108594g(str, "animKey");
            C87412m.m108594g(aVar, "config");
            String str2 = this.f249938a.f318907e;
            StringBuilder sb = new StringBuilder();
            sb.append("onScreenEffect: msg:");
            C102048b.C102050b bVar = aVar.f300531d;
            Integer num = null;
            sb.append(bVar != null ? Integer.valueOf(bVar.f300532b) : null);
            sb.append(", ");
            C102048b.C102050b bVar2 = aVar.f300531d;
            if (bVar2 != null) {
                num = Integer.valueOf(bVar2.f300533c);
            }
            sb.append(num);
            Log.m105924i(str2, sb.toString());
            C106673s1 s1Var = this.f249938a;
            if (!s1Var.f318908f) {
                s1Var.mo153629Y5().mo120735i0();
            }
        }

        /* renamed from: c */
        public void mo119742c(long j, String str, C102048b.C102049a aVar) {
            long j2 = j;
            String str2 = str;
            C102048b.C102049a aVar2 = aVar;
            C87412m.m108594g(str2, "animKey");
            C87412m.m108594g(aVar2, "config");
            String str3 = this.f249938a.f318907e;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayScreenEffect: msg:");
            sb.append(j2);
            sb.append(", ");
            C102048b.C102050b bVar = aVar2.f300531d;
            C13598b0 b0Var = null;
            sb.append(bVar != null ? Integer.valueOf(bVar.f300532b) : null);
            sb.append(", ");
            C102048b.C102050b bVar2 = aVar2.f300531d;
            sb.append(bVar2 != null ? Integer.valueOf(bVar2.f300533c) : null);
            sb.append(", ");
            sb.append(str2);
            sb.append(' ');
            sb.append(aVar2.f300529b);
            Log.m105924i(str3, sb.toString());
            C106673s1 s1Var = this.f249938a;
            if (!s1Var.f318908f) {
                C86351b Y5 = s1Var.mo153629Y5();
                String str4 = aVar2.f300529b;
                Y5.getClass();
                C87412m.m108594g(str4, "emojiKey");
                Log.m105924i("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect msgId = " + j2 + ", emoji = (" + str2 + ", " + str4 + ')');
                long currentTimeMillis = System.currentTimeMillis();
                C67391b bVar3 = Y5.f251055a;
                String str5 = bVar3.f193292p;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                long j3 = currentTimeMillis;
                C86585j a = C86585j.m107402a(j, str, str4, true, true, bVar3, Y5.f251056b);
                C86576a aVar3 = a == null ? null : new C86576a(j, j3, str6, a);
                if (aVar3 != null) {
                    C86195z<C86351b> g0 = Y5.mo120733g0(str4);
                    if (g0 != null) {
                        boolean b = C87412m.m108589b(g0, Y5.f251066l);
                        MagicEmojiTriggerStruct magicEmojiTriggerStruct = new MagicEmojiTriggerStruct();
                        magicEmojiTriggerStruct.f9969f = j3;
                        magicEmojiTriggerStruct.f9968e = b ? 3 : 7;
                        magicEmojiTriggerStruct.mo86054n();
                        g0.resume();
                        HashMap hashMap = new HashMap(16);
                        hashMap.put("msgId", Long.valueOf(aVar3.f251487a));
                        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                        hashMap.put("msgMeta", aVar3.f251490d.mo121027c(true));
                        hashMap.put("sentTime", Long.valueOf(aVar3.f251488b));
                        String str7 = aVar3.f251489c;
                        String str8 = aVar3.f251490d.f251514j;
                        long j4 = aVar3.f251488b;
                        HashMap hashMap2 = new HashMap(2);
                        hashMap2.put("sessionID", str7);
                        hashMap2.put("toChatName", str8);
                        hashMap2.put("messageTimestamp", Long.valueOf(j4));
                        hashMap.put("reportInfo", hashMap2);
                        C48016e.m53378d(hashMap);
                        String gVar = new C104289g((Map) hashMap).toString();
                        C87412m.m108593f(gVar, "event.toJSONObjectString()");
                        g0.mo120601d("MagicEmojiSent", gVar);
                        Y5.mo120736j0();
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var == null) {
                        Log.m105920e("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect without biz...");
                        C115669n.INSTANCE.mo175911u(C87455a.f253430f, 67);
                    }
                }
            }
        }

        public void onStart() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$a */
    public static final class C106674a extends C87413o implements C32226l<C72963f4, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C106673s1 f318923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106674a(C106673s1 s1Var) {
            super(1);
            this.f318923d = s1Var;
        }

        public Object invoke(Object obj) {
            C72963f4 f4Var = (C72963f4) obj;
            C87412m.m108594g(f4Var, LocaleUtil.ITALIAN);
            return (Boolean) ((C106676c) this.f318923d.f318915p).invoke(f4Var);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$b */
    public static final class C106675b implements Runnable {

        /* renamed from: d */
        public static final C106675b f318924d = new C106675b();

        public final void run() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$c */
    public static final class C106676c extends C87413o implements C32226l<C72963f4, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C106673s1 f318925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106676c(C106673s1 s1Var) {
            super(1);
            this.f318925d = s1Var;
        }

        public Object invoke(Object obj) {
            C72963f4 f4Var = (C72963f4) obj;
            C87412m.m108594g(f4Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf((f4Var.mo100993e4() || f4Var.mo100977P3() || f4Var.mo100987Z3()) && Util.isEqual(f4Var.mo108768t(), this.f318925d.f215752d.mo91577r()));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$d */
    public static final class C106677d extends C87413o implements C32224a<C86351b> {

        /* renamed from: d */
        public final /* synthetic */ C106673s1 f318926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106677d(C106673s1 s1Var) {
            super(0);
            this.f318926d = s1Var;
        }

        public Object invoke() {
            C67391b bVar = this.f318926d.f215752d;
            C87412m.m108593f(bVar, "mChattingContext");
            MEHolderView mEHolderView = (MEHolderView) ((C36570n) this.f318926d.f318920u).getValue();
            C87412m.m108593f(mEHolderView, "magicEmojiHolder");
            return new C86351b(bVar, mEHolderView, new C106686u1(this.f318926d));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$e */
    public static final class C106678e extends C87413o implements C32224a<MEHolderView> {

        /* renamed from: d */
        public final /* synthetic */ C106673s1 f318927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106678e(C106673s1 s1Var) {
            super(0);
            this.f318927d = s1Var;
        }

        public Object invoke() {
            return (MEHolderView) this.f318927d.f215752d.mo91565f().findViewById(C0966R.C0970id.b5d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$g */
    public static final class C106679g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C72963f4> f318928d;

        /* renamed from: e */
        public final /* synthetic */ C106673s1 f318929e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106679g(List<? extends C72963f4> list, C106673s1 s1Var) {
            super(0);
            this.f318928d = list;
            this.f318929e = s1Var;
        }

        public Object invoke() {
            C111180c cVar;
            boolean z;
            List<C72963f4> list = this.f318928d;
            C106673s1 s1Var = this.f318929e;
            for (C72963f4 f4Var : list) {
                C111189f fVar = s1Var.f318912j;
                C87412m.m108593f(f4Var, LocaleUtil.ITALIAN);
                fVar.getClass();
                Iterator<C111180c> it = fVar.f332995c.f332992a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = null;
                        break;
                    }
                    cVar = it.next();
                    if (cVar.f332965c == f4Var.getMsgId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C111180c cVar2 = cVar;
                if (cVar2 != null) {
                    Log.m105924i(cVar2.f332963a, "stop: ");
                    cVar2.mo162911b();
                    C111188e eVar = fVar.f332995c;
                    eVar.getClass();
                    eVar.f332992a.remove(cVar2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$h */
    public static final class C106680h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C72963f4> f318930d;

        /* renamed from: e */
        public final /* synthetic */ C106673s1 f318931e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106680h(List<? extends C72963f4> list, C106673s1 s1Var) {
            super(0);
            this.f318930d = list;
            this.f318931e = s1Var;
        }

        public Object invoke() {
            List<C72963f4> list = this.f318930d;
            C106673s1 s1Var = this.f318931e;
            for (C72963f4 f4Var : list) {
                Integer num = s1Var.f318913n.get(Long.valueOf(f4Var.getMsgId()));
                if (num == null) {
                    num = 0;
                }
                C87412m.m108593f(num, "patMsgMap.get(it.msgId) ?: 0");
                int intValue = num.intValue();
                int b = s1Var.f318912j.mo162926b(f4Var, intValue);
                if (b >= intValue) {
                    s1Var.f318913n.put(Long.valueOf(f4Var.getMsgId()), Integer.valueOf(b));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$i */
    public static final class C106681i implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ C106673s1 f318932a;

        public C106681i(C106673s1 s1Var) {
            this.f318932a = s1Var;
        }

        public final void onScrollChanged() {
            this.f318932a.mo153631a6();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$j */
    public static final class C106682j extends C87413o implements C32226l<C72963f4, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C106673s1 f318933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106682j(C106673s1 s1Var) {
            super(1);
            this.f318933d = s1Var;
        }

        public Object invoke(Object obj) {
            C72963f4 f4Var = (C72963f4) obj;
            C87412m.m108594g(f4Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(f4Var.mo100986Y3() && Util.isEqual(f4Var.mo108768t(), this.f318933d.f215752d.mo91577r()));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$k */
    public static final class C106683k implements Runnable {

        /* renamed from: d */
        public static final C106683k f318934d = new C106683k();

        public final void run() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.s1$l */
    public static final class C106684l implements C90685a {

        /* renamed from: b */
        public final /* synthetic */ C106673s1 f318935b;

        public C106684l(C106673s1 s1Var) {
            this.f318935b = s1Var;
        }

        /* renamed from: v */
        public View mo124818v(long j) {
            return ((C79368l) this.f318935b.f215752d.f193278b.mo102812a(C79368l.class)).mo108212v(j);
        }

        /* renamed from: w */
        public RectF mo124819w(long j, String str) {
            C87412m.m108594g(str, "animKey");
            RectF rectF = new RectF();
            View v = mo124818v(j);
            if (v != null) {
                MMNeat7extView x = mo124820x(v, str);
                if ((x != null ? x.getLayout() : null) != null) {
                    RectF a = C90685a.C90686a.f260502a.mo124822a(x);
                    int[] iArr = new int[2];
                    x.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    rectF.set(a);
                    rectF.offset((float) (i + x.getPaddingLeft()), (float) (i2 + x.getPaddingTop()));
                } else {
                    Log.m105924i(this.f318935b.f318907e, "updateView: no layout");
                }
            }
            return rectF;
        }

        /* renamed from: x */
        public MMNeat7extView mo124820x(View view, String str) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(str, "animKey");
            if (!C112550d0.m153801u(str, "_", false)) {
                return (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.hri);
            int parseInt = Integer.parseInt((String) C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null).get(1));
            if (viewGroup.getChildCount() <= 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(parseInt);
            if (childAt instanceof MMNeat7extView) {
                return (MMNeat7extView) childAt;
            }
            return null;
        }

        /* renamed from: y */
        public List<String> mo124821y(C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            LinkedList linkedList = new LinkedList();
            if (((Boolean) ((C106682j) this.f318935b.f318917r).invoke(f4Var)).booleanValue()) {
                List<String> c = C102051g.f300534a.mo141552c(f4Var);
                ArrayList arrayList = new ArrayList(C36907w.m41090l(c, 10));
                int i = 0;
                for (T next : c) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str = (String) next;
                        StringBuilder sb = new StringBuilder();
                        sb.append(f4Var.getMsgId());
                        sb.append('_');
                        sb.append(i);
                        arrayList.add(sb.toString());
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                linkedList.addAll(arrayList);
            } else if (((Boolean) ((C106674a) this.f318935b.f318916q).invoke(f4Var)).booleanValue()) {
                linkedList.add(String.valueOf(f4Var.getMsgId()));
            }
            return linkedList;
        }
    }

    /* renamed from: D */
    public void mo109366D(String str) {
        if (!(str == null || str.length() == 0)) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108732L2(str);
            f4Var.mo108740T2(1);
            C106685t1 t1Var = new C106685t1(this, false, C26236u.m33719b(f4Var));
            this.f318918s = t1Var;
            C61926c.m72669N(t1Var);
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C111189f fVar = this.f318912j;
        if (fVar.f332993a == null) {
            fVar.f332993a = (FrameLayout) this.f215752d.mo91565f().findViewById(C0966R.C0970id.b4n);
        }
        this.f318908f = false;
        C72963f4 f4Var = this.f318910h;
        if (f4Var != null) {
            C106685t1 t1Var = new C106685t1(this, true, C26236u.m33719b(f4Var));
            this.f318918s = t1Var;
            C61926c.m72669N(t1Var);
        }
        this.f318910h = null;
        mo153629Y5().getClass();
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] start: " + C86312j.m106911c(C30211n0.class));
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        this.f318908f = true;
        this.f318911i.getClass();
        this.f318911i.mo153653g();
        this.f318912j.mo162928d();
        C86351b Y5 = mo153629Y5();
        Y5.getClass();
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] stop");
        Y5.f251058d.removeCallbacks(Y5.f251065k);
        C86195z<C86351b> zVar = Y5.f251066l;
        if (zVar != null) {
            zVar.destroy();
        }
        C86195z<C86351b> zVar2 = Y5.f251067m;
        if (zVar2 != null) {
            zVar2.destroy();
        }
        C62582g gVar = Y5.f251068n;
        if (gVar != null) {
            gVar.mo87640d();
        }
        Y5.f251056b.removeAllViews();
        Y5.f251066l = null;
        Y5.f251067m = null;
        Y5.f251068n = null;
        C89205v vVar = (C89205v) C79691a.m96804a(C89205v.class);
        if (vVar != null && ((HashMap) vVar.f257039b).containsKey("ME")) {
            vVar.f349668a.f339059f.post(new v$$a(vVar, "ME"));
        }
    }

    /* renamed from: I5 */
    public C90685a mo109367I5() {
        return this.f318922w;
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        if (i == 3001) {
            this.f318911i.getClass();
        }
    }

    /* renamed from: Y5 */
    public final C86351b mo153629Y5() {
        return (C86351b) ((C36570n) this.f318921v).getValue();
    }

    /* renamed from: Z5 */
    public final void mo153630Z5() {
        C61926c.m72698w(this.f318918s);
        this.f318918s = C106683k.f318934d;
        ((ChattingUIFragment) this.f215752d.f193288l).f215289B.getViewTreeObserver().removeOnScrollChangedListener(this.f318919t);
        this.f318911i.getClass();
        this.f318911i.mo153653g();
        C106691j3 j3Var = this.f318911i;
        j3Var.getClass();
        ((C112645b) C86312j.m106911c(C112645b.class)).rl0();
        j3Var.f318961l = null;
        this.f318912j.mo162928d();
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this);
        this.f318913n.clear();
        this.f318914o = null;
    }

    /* renamed from: a6 */
    public final void mo153631a6() {
        this.f318912j.mo162929e(this.f318922w);
        C106691j3 j3Var = this.f318911i;
        C90685a aVar = this.f318922w;
        C86351b bVar = j3Var.f318952c;
        if (bVar != null) {
            C87412m.m108594g(aVar, "viewProvider");
            while (!bVar.f251062h.isEmpty()) {
                C86351b.C86353b bVar2 = (C86351b.C86353b) C110818d0.m150914L(bVar.f251062h);
                long j = bVar2.f251073c.f251245b;
                if (j == 0 || ((C106684l) aVar).mo124818v(j) != null) {
                    bVar.mo120737k0(bVar.f251060f, bVar2.f251072b, bVar2.f251073c);
                    bVar.f251062h.remove(0);
                } else {
                    Log.m105928w("MicroMsg.MEChattingMgr", "[ME]: onChattingViewUpdate: view not found for msgId = " + j);
                    return;
                }
            }
        }
    }

    /* renamed from: c2 */
    public void mo109368c2(C72963f4 f4Var, int i, boolean z) {
        C87412m.m108594g(f4Var, "msg");
        String str = this.f318907e;
        Log.m105918d(str, "recordPatMsg: " + f4Var.getMsgId() + ", " + i + ", " + z + ", " + this.f318909g);
        if (z || this.f318909g) {
            this.f318913n.put(Long.valueOf(f4Var.getMsgId()), Integer.valueOf(i));
            return;
        }
        this.f318913n.put(Long.valueOf(f4Var.getMsgId()), Integer.valueOf(i - 1));
        C72963f4 f4Var2 = this.f318914o;
        if (f4Var.getMsgId() > (f4Var2 != null ? f4Var2.getMsgId() : 0)) {
            this.f318914o = f4Var;
        }
    }

    /* renamed from: c3 */
    public void mo6473c3(int i) {
        if (i != 0) {
            mo153631a6();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* renamed from: g5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70046g5() {
        /*
            r12 = this;
            ck3.b r0 = r12.f215752d
            com.tencent.mm.ui.chatting.w3 r0 = r0.f193288l
            com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r0
            com.tencent.mm.ui.chatting.view.MMChattingListView r0 = r0.f215289B
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r12.f318919t
            r0.addOnScrollChangedListener(r1)
            com.tencent.mm.ui.chatting.j3 r0 = r12.f318911i
            ck3.b r1 = r12.f215752d
            boolean r1 = r1.mo91583x()
            ck3.b r2 = r12.f215752d
            java.lang.String r2 = r2.mo91577r()
            r0.f318953d = r1
            r0.f318954e = r2
            com.tencent.mm.ui.chatting.j3 r0 = r12.f318911i
            r0.getClass()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r1 = 0
            r0.mo101137qq(r12, r1)
            ck3.b r0 = r12.f215752d
            java.lang.Class<zj3.h0> r2 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.h0 r0 = (zj3.C79361h0) r0
            java.util.List r0 = r0.mo102465P0()
            r2 = 0
            if (r0 == 0) goto L_0x008c
            java.util.Iterator r4 = r0.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x005a
            r5 = r1
            goto L_0x0083
        L_0x005a:
            java.lang.Object r5 = r4.next()
            boolean r6 = r4.hasNext()
            if (r6 != 0) goto L_0x0065
            goto L_0x0083
        L_0x0065:
            r6 = r5
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
            long r6 = r6.getMsgId()
        L_0x006c:
            java.lang.Object r8 = r4.next()
            r9 = r8
            com.tencent.mm.storage.f4 r9 = (com.tencent.p014mm.storage.C72963f4) r9
            long r9 = r9.getMsgId()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x007d
            r5 = r8
            r6 = r9
        L_0x007d:
            boolean r8 = r4.hasNext()
            if (r8 != 0) goto L_0x006c
        L_0x0083:
            com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
            if (r5 == 0) goto L_0x008c
            long r4 = r5.getMsgId()
            goto L_0x008d
        L_0x008c:
            r4 = r2
        L_0x008d:
            com.tencent.mm.storage.f4 r6 = r12.f318914o
            if (r6 == 0) goto L_0x0095
            long r2 = r6.getMsgId()
        L_0x0095:
            r6 = 0
            r7 = 1
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x00d9
            java.lang.String r2 = r12.f318907e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkUnreadMsg: "
            r3.append(r4)
            if (r0 == 0) goto L_0x00b2
            int r4 = r0.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00b3
        L_0x00b2:
            r4 = r1
        L_0x00b3:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r0 == 0) goto L_0x00c5
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00c6
        L_0x00c5:
            r6 = 1
        L_0x00c6:
            if (r6 != 0) goto L_0x016d
            java.lang.String r2 = "unreadList"
            gy3.C87412m.m108593f(r0, r2)
            com.tencent.mm.ui.chatting.component.t1 r2 = new com.tencent.mm.ui.chatting.component.t1
            r2.<init>(r12, r7, r0)
            r12.f318918s = r2
            o40.C61926c.m72669N(r2)
            goto L_0x016d
        L_0x00d9:
            java.lang.String r0 = r12.f318907e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkUnreadMsg: pat msg "
            r2.append(r3)
            com.tencent.mm.storage.f4 r3 = r12.f318914o
            if (r3 == 0) goto L_0x00f2
            long r3 = r3.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00f3
        L_0x00f2:
            r3 = r1
        L_0x00f3:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.storage.f4 r0 = r12.f318914o
            if (r0 == 0) goto L_0x016d
            ck3.b r2 = r12.f215752d
            java.lang.Class<zj3.l> r3 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.l r2 = (zj3.C79368l) r2
            android.util.SparseArray r2 = r2.mo108175K1()
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x016d
            int r3 = r2.size()
            int r3 = r3 - r7
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
            if (r2 == 0) goto L_0x0132
            long r2 = r2.getMsgId()
            long r4 = r0.getMsgId()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0132
            r2 = 1
            goto L_0x0133
        L_0x0132:
            r2 = 0
        L_0x0133:
            if (r2 == 0) goto L_0x016d
            java.util.HashMap<java.lang.Long, java.lang.Integer> r2 = r12.f318913n
            long r3 = r0.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x014b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x014b:
            java.lang.String r3 = "patMsgMap.get(it.msgId) ?: 0"
            gy3.C87412m.m108593f(r2, r3)
            int r2 = r2.intValue()
            uk.f r3 = r12.f318912j
            int r3 = r3.mo162926b(r0, r2)
            if (r3 < r2) goto L_0x016d
            java.util.HashMap<java.lang.Long, java.lang.Integer> r2 = r12.f318913n
            long r4 = r0.getMsgId()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r0, r3)
        L_0x016d:
            r12.f318914o = r1
            ck3.b r0 = r12.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131299202(0x7f090b82, float:1.8216399E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            uk.f r1 = r12.f318912j
            r1.f332993a = r0
            ck3.b r0 = r12.f215752d
            java.lang.String r0 = r0.mo91577r()
            r1.f332997e = r0
            uk.f r0 = r12.f318912j
            com.tencent.mm.ui.chatting.component.s1$f r1 = new com.tencent.mm.ui.chatting.component.s1$f
            r1.<init>(r12)
            r0.f332998f = r1
            r12.f318909g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C106673s1.mo70046g5():void");
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo153630Z5();
    }

    /* renamed from: m */
    public void mo100547m(float f, boolean z) {
        mo153631a6();
    }

    /* renamed from: m3 */
    public void mo109369m3() {
        int C1 = ((C67067f) this.f215752d.f193278b.mo102812a(C67067f.class)).mo91066C1();
        String str = this.f318907e;
        Log.m105924i(str, "updateTipsBarHeight: " + C1);
        C106691j3 j3Var = this.f318911i;
        if (j3Var.f318958i != C1) {
            j3Var.f318958i = C1;
            ChattingAnimFrame chattingAnimFrame = j3Var.f318951b;
            if (chattingAnimFrame != null) {
                chattingAnimFrame.setPadding(0, C1, 0, 0);
            }
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f318909g = false;
        mo153630Z5();
    }

    /* renamed from: w4 */
    public void mo6474w4(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.tencent.mm.storage.f4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26106w5(g62.C75875l r8, g62.C75875l.C45886e r9) {
        /*
            r7 = this;
            java.lang.String r0 = "msgStorage"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r8 = "notifyInfo"
            gy3.C87412m.m108594g(r9, r8)
            boolean r8 = r7.f318908f
            java.lang.String r0 = "insert"
            java.lang.String r1 = "notifyInfo.msgList"
            if (r8 == 0) goto L_0x0083
            java.lang.String r8 = r9.f123845b
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r8)
            if (r8 == 0) goto L_0x0082
            java.util.ArrayList<com.tencent.mm.storage.f4> r8 = r9.f123846c
            gy3.C87412m.m108593f(r8, r1)
            fy3.l<com.tencent.mm.storage.f4, java.lang.Boolean> r9 = r7.f318916q
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r8.next()
            r2 = r9
            com.tencent.mm.ui.chatting.component.s1$a r2 = (com.tencent.p014mm.p136ui.chatting.component.C106673s1.C106674a) r2
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x002a
            r0.add(r1)
            goto L_0x002a
        L_0x0047:
            java.util.Iterator r8 = r0.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L_0x0053
            r8 = 0
            goto L_0x007e
        L_0x0053:
            java.lang.Object r9 = r8.next()
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r8 = r9
            goto L_0x007e
        L_0x005f:
            r0 = r9
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            long r0 = r0.getMsgId()
        L_0x0066:
            java.lang.Object r2 = r8.next()
            r3 = r2
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            long r3 = r3.getMsgId()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0077
            r9 = r2
            r0 = r3
        L_0x0077:
            boolean r2 = r8.hasNext()
            if (r2 != 0) goto L_0x0066
            goto L_0x005d
        L_0x007e:
            com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
            r7.f318910h = r8
        L_0x0082:
            return
        L_0x0083:
            java.lang.String r8 = r9.f123845b
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r8)
            r0 = 0
            if (r8 == 0) goto L_0x00c4
            java.util.ArrayList<com.tencent.mm.storage.f4> r8 = r9.f123846c
            gy3.C87412m.m108593f(r8, r1)
            fy3.l<com.tencent.mm.storage.f4, java.lang.Boolean> r2 = r7.f318916q
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x009c:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r8.next()
            r5 = r2
            com.tencent.mm.ui.chatting.component.s1$a r5 = (com.tencent.p014mm.p136ui.chatting.component.C106673s1.C106674a) r5
            java.lang.Object r5 = r5.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x009c
            r3.add(r4)
            goto L_0x009c
        L_0x00b9:
            com.tencent.mm.ui.chatting.component.t1 r8 = new com.tencent.mm.ui.chatting.component.t1
            r8.<init>(r7, r0, r3)
            r7.f318918s = r8
            o40.C61926c.m72669N(r8)
            goto L_0x0109
        L_0x00c4:
            java.lang.String r8 = r9.f123845b
            java.lang.String r2 = "update"
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r8)
            if (r8 == 0) goto L_0x0109
            java.util.ArrayList<com.tencent.mm.storage.f4> r8 = r9.f123846c
            gy3.C87412m.m108593f(r8, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00dc:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r8.next()
            r4 = r3
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            int r5 = r4.f230723F
            r6 = 4
            r5 = r5 & r6
            if (r5 == r6) goto L_0x00fa
            int r4 = r4.getType()
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r4 != r5) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r4 = 0
            goto L_0x00fb
        L_0x00fa:
            r4 = 1
        L_0x00fb:
            if (r4 == 0) goto L_0x00dc
            r2.add(r3)
            goto L_0x00dc
        L_0x0101:
            com.tencent.mm.ui.chatting.component.s1$g r8 = new com.tencent.mm.ui.chatting.component.s1$g
            r8.<init>(r2, r7)
            o40.C61926c.m72668M(r8)
        L_0x0109:
            java.util.ArrayList<com.tencent.mm.storage.f4> r8 = r9.f123846c
            gy3.C87412m.m108593f(r8, r1)
            fy3.l<com.tencent.mm.storage.f4, java.lang.Boolean> r9 = r7.f318917r
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0119:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0136
            java.lang.Object r1 = r8.next()
            r2 = r9
            com.tencent.mm.ui.chatting.component.s1$j r2 = (com.tencent.p014mm.p136ui.chatting.component.C106673s1.C106682j) r2
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0119
            r0.add(r1)
            goto L_0x0119
        L_0x0136:
            com.tencent.mm.ui.chatting.component.s1$h r8 = new com.tencent.mm.ui.chatting.component.s1$h
            r8.<init>(r0, r7)
            o40.C61926c.m72668M(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C106673s1.mo26106w5(g62.l, g62.l$e):void");
    }
}

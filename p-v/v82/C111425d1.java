package v82;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import as3.C103898r0;
import c92.C104331h;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105718x1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105746z1;
import com.tencent.p014mm.plugin.multitalk.model.C105805i;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105808j;
import com.tencent.p014mm.plugin.multitalk.model.C105810k;
import com.tencent.p014mm.plugin.multitalk.model.C105825p;
import com.tencent.p014mm.plugin.multitalk.model.C105845w;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.model.C105857z0;
import com.tencent.p014mm.plugin.voip.p475ui.C106443e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import nw3.C109779e;
import o33.C109935a;
import sx3.C110818d0;
import sx3.C64197v;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: v82.d1 */
public final class C111425d1 implements C105805i, C105810k {

    /* renamed from: d */
    public C111423c1 f333586d;

    /* renamed from: e */
    public C106443e f333587e;

    /* renamed from: f */
    public Intent f333588f;

    /* renamed from: g */
    public boolean f333589g;

    /* renamed from: h */
    public MTimerHandler f333590h;

    /* renamed from: i */
    public int f333591i = 1;

    /* renamed from: j */
    public ArrayList<Integer> f333592j = new ArrayList<>();

    /* renamed from: n */
    public boolean f333593n;

    /* renamed from: o */
    public MMHandler f333594o;

    /* renamed from: v82.d1$a */
    public static final class C111426a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f333595d;

        /* renamed from: e */
        public final /* synthetic */ C111425d1 f333596e;

        /* renamed from: v82.d1$a$a */
        public static final class C111427a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public final /* synthetic */ C111425d1 f333597d;

            public C111427a(C111425d1 d1Var) {
                this.f333597d = d1Var;
            }

            public final boolean onTimerExpired() {
                Log.m105924i("MicroMsg.MultiTalkSmallWindow", "click small view and time is up we remove it..");
                this.f333597d.mo163095e(false);
                MTimerHandler mTimerHandler = this.f333597d.f333590h;
                if (mTimerHandler == null) {
                    return true;
                }
                mTimerHandler.stopTimer();
                return true;
            }
        }

        /* renamed from: v82.d1$a$b */
        public static final class C111428b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C111425d1 f333598d;

            public C111428b(C111425d1 d1Var) {
                this.f333598d = d1Var;
            }

            public final void run() {
                this.f333598d.mo163095e(false);
            }
        }

        public C111426a(Intent intent, C111425d1 d1Var) {
            this.f333595d = intent;
            this.f333596e = d1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            view.setOnClickListener((View.OnClickListener) null);
            this.f333595d.addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            Intent intent = this.f333595d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f333596e.f333590h = new MTimerHandler(new C111427a(this.f333596e), false);
            MTimerHandler mTimerHandler = this.f333596e.f333590h;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer(2000);
            }
            MMHandlerThread.postToMainThreadDelayed(new C111428b(this.f333596e), 200);
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: v82.d1$b */
    public static final class C111429b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111425d1 f333599d;

        /* renamed from: v82.d1$b$a */
        public static final class C111430a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C111425d1 f333600d;

            public C111430a(C111425d1 d1Var) {
                this.f333600d = d1Var;
            }

            public final void run() {
                this.f333600d.mo163095e(true);
            }
        }

        public C111429b(C111425d1 d1Var) {
            this.f333599d = d1Var;
        }

        public final void run() {
            boolean z;
            C111423c1 c1Var = this.f333599d.f333586d;
            if (c1Var != null) {
                c1Var.mo153022d();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C119179t tVar = C119157j.f356862d;
                C111430a aVar = new C111430a(this.f333599d);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 2000, false);
            }
        }
    }

    /* renamed from: v82.d1$c */
    public static final class C111431c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111425d1 f333601d;

        public C111431c(C111425d1 d1Var) {
            this.f333601d = d1Var;
        }

        public final void run() {
            C14413d0 d0Var;
            C111423c1 c1Var = this.f333601d.f333586d;
            if (c1Var != null && (d0Var = c1Var.f333573j) != null) {
                d0Var.f40015f = true;
                d0Var.mo13700a(d0Var.f40016g, true);
            }
        }
    }

    /* renamed from: v82.d1$d */
    public static final class C111432d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111425d1 f333602d;

        public C111432d(C111425d1 d1Var) {
            this.f333602d = d1Var;
        }

        public final void run() {
            C111423c1 c1Var = this.f333602d.f333586d;
            if (c1Var != null) {
                boolean z = C105851w0.zx0().f314493e;
                C14413d0 d0Var = c1Var.f333573j;
                if (d0Var != null) {
                    d0Var.f40016g = z;
                    d0Var.mo13700a(z, d0Var.f40015f);
                }
            }
        }
    }

    /* renamed from: B4 */
    public void mo150750B4() {
    }

    /* renamed from: E6 */
    public void mo150751E6() {
    }

    /* renamed from: G3 */
    public void mo150752G3(String str) {
    }

    /* renamed from: I */
    public void mo150753I() {
    }

    /* renamed from: L1 */
    public void mo150754L1() {
    }

    /* renamed from: M2 */
    public void mo150755M2() {
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        C111437e0 e0Var;
        MMHandler mMHandler;
        if (C105851w0.zx0().mo150625B() && (mMHandler = this.f333594o) != null) {
            mMHandler.post(new C111431c(this));
        }
        MMHandler mMHandler2 = this.f333594o;
        if (mMHandler2 != null) {
            mMHandler2.post(new C111432d(this));
        }
        if (C105851w0.zx0().mo150683y()) {
            C105851w0.zx0().mo150644U();
        }
        ArrayList<String> h = mo163098h();
        String str = h != null ? (String) C110818d0.m150914L(h) : null;
        C111423c1 c1Var = this.f333586d;
        if (C87412m.m108589b(str, c1Var != null ? c1Var.getRendererSpeaker() : null)) {
            C111423c1 c1Var2 = this.f333586d;
            if (c1Var2 != null) {
                C111437e0 e0Var2 = c1Var2.f333572i;
                if (e0Var2 != null) {
                    e0Var2.f333645q = Long.valueOf(Util.currentTicks());
                }
                C111437e0 e0Var3 = c1Var2.f333572i;
                if (!(e0Var3 != null && e0Var3.f333640l) && (e0Var = c1Var2.f333572i) != null) {
                    e0Var.mo163125c(c1Var2.getRendererSpeaker());
                }
            }
        } else if (str == null) {
            C111423c1 c1Var3 = this.f333586d;
            if (c1Var3 != null) {
                c1Var3.mo163090n((String) null);
            }
            mo163100j(false);
        } else {
            C111423c1 c1Var4 = this.f333586d;
            if (c1Var4 != null) {
                c1Var4.mo163090n(str);
            }
            C111423c1 c1Var5 = this.f333586d;
            if (c1Var5 != null) {
                c1Var5.mo163092p(str);
            }
            mo163100j(true);
        }
        C105825p vx02 = C105851w0.vx0();
        if (vx02.f314748j != null && vx02.mo150809d() && vx02.mo150808b() && vx02.f314753r) {
            vx02.mo150812g();
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        if (!(h == null || h.isEmpty()) && 1 <= h.size() - 1) {
            List<String> subList = h.subList(1, h.size());
            C87412m.m108593f(subList, "speakers.subList(startIndex,speakers.size)");
            for (String c : subList) {
                arrayList3.add(Integer.valueOf(C104331h.m139311c(c)));
            }
        }
        if (!arrayList3.isEmpty()) {
            if (this.f333592j.isEmpty()) {
                this.f333592j.addAll(arrayList3);
            } else {
                if (arrayList3.size() < 2 - this.f333592j.size()) {
                    arrayList2 = new ArrayList<>();
                    for (Number intValue : this.f333592j) {
                        arrayList2.add(Integer.valueOf(intValue.intValue()));
                    }
                    Iterator<Integer> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int intValue2 = it.next().intValue();
                        if (!arrayList2.contains(Integer.valueOf(intValue2))) {
                            arrayList2.add(Integer.valueOf(intValue2));
                        }
                    }
                } else {
                    arrayList2 = arrayList3;
                }
                this.f333592j = arrayList2;
            }
            boolean v = C105851w0.zx0().mo150680v();
            if (!v && (arrayList = this.f333592j) != null && arrayList.size() >= 1) {
                int size = arrayList.size();
                int[] iArr = new int[size];
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < size; i++) {
                    Integer num = arrayList.get(i);
                    C87412m.m108593f(num, "memberIdList[i]");
                    int intValue3 = num.intValue();
                    sb.append(intValue3);
                    sb.append(",");
                    iArr[i] = intValue3;
                }
                Log.m105925i("MicroMsg.MultiTalkSmallWindow", "steve: engineDoMemberSelectForView: selected id list: %s", sb.toString());
                ByteBuffer allocate = ByteBuffer.allocate(size * 4);
                allocate.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(iArr);
                if (((C109779e) C105851w0.xx0().f314798d).mo161038i(23, allocate.array(), size) < 0) {
                    Log.m105920e("MicroMsg.MultiTalkSmallWindow", "steve:engineDoMemberSelectForView failed!!");
                    C105853x.m142231b();
                }
            }
            if (v) {
                if (this.f333592j.size() == 1) {
                    C105724z zVar = C105724z.INSTANCE;
                    zVar.getClass();
                    zVar.mo150614x(new C105746z1(zVar, (Integer) C110818d0.m150914L(this.f333592j), false));
                } else {
                    C105724z zVar2 = C105724z.INSTANCE;
                    ArrayList<Integer> arrayList4 = this.f333592j;
                    zVar2.getClass();
                    zVar2.mo150614x(new C105718x1(zVar2, arrayList4, false));
                }
                Log.m105924i("MicroMsg.MultiTalkSmallWindow", "ilink subscribeByUserMids ok, mids:" + arrayList3 + " and subscribe one is " + this.f333592j);
                return;
            }
            int size2 = this.f333592j.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                C103898r0 r0Var = new C103898r0();
                Integer num2 = this.f333592j.get(i2);
                C87412m.m108593f(num2, "subscribeVideoCacheList[i]");
                r0Var.f307152b = num2.intValue();
                arrayList5.add(r0Var);
            }
            C105851w0.zx0().mo150649Z(arrayList5);
        }
    }

    /* renamed from: S1 */
    public void mo150756S1(String str) {
    }

    /* renamed from: T5 */
    public void mo150757T5() {
        mo163097g();
    }

    /* renamed from: U4 */
    public void mo150758U4(C105806i0.C105807a aVar, C105806i0.C105807a aVar2) {
    }

    /* renamed from: X6 */
    public void mo150759X6() {
    }

    /* renamed from: a */
    public C105808j mo150700a(int i) {
        return null;
    }

    /* renamed from: b */
    public C105808j mo150701b(String str) {
        C87412m.m108594g(str, "wxUserName");
        C111423c1 c1Var = this.f333586d;
        if (c1Var != null) {
            if (TextUtils.isEmpty(c1Var.getUsername()) || C87412m.m108589b(c1Var.getUsername(), str)) {
                return c1Var;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo150702c() {
    }

    /* renamed from: d */
    public void mo150760d(int i) {
    }

    /* renamed from: e */
    public final void mo163095e(boolean z) {
        Log.m105925i("MicroMsg.MultiTalkSmallWindow", "dismiss now.. isFinish: %b, smallView: %s", Boolean.valueOf(z), this.f333586d);
        C111423c1 c1Var = this.f333586d;
        if (c1Var != null) {
            if (z) {
                C109935a.C109937b.f328933a.mo161254w0(c1Var);
            }
            C111423c1 c1Var2 = this.f333586d;
            if (c1Var2 != null) {
                c1Var2.setOnClickListener((View.OnClickListener) null);
            }
            C111423c1 c1Var3 = this.f333586d;
            if (c1Var3 != null) {
                c1Var3.mo153123k();
            }
            this.f333586d = null;
            C105851w0.zx0().f314462D = null;
            C105851w0.vx0().f314746h = null;
        } else if (z) {
            C109935a.C109937b.f328933a.mo68418k();
        }
        C105851w0.zx0().mo150676q().mo150845i(this);
    }

    /* renamed from: f */
    public final void mo163096f(Intent intent, boolean z) {
        Log.m105924i("MicroMsg.MultiTalkSmallWindow", "mini now..");
        if (this.f333586d != null) {
            mo163095e(false);
        }
        if (this.f333586d == null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            this.f333586d = new C111423c1(context);
            this.f333589g = false;
        }
        C111423c1 c1Var = this.f333586d;
        if (c1Var != null) {
            boolean d = C105851w0.vx0().mo150809d();
            C14413d0 d0Var = c1Var.f333573j;
            if (d0Var != null) {
                d0Var.f40015f = d;
                d0Var.mo13700a(d0Var.f40016g, d);
            }
        }
        C111423c1 c1Var2 = this.f333586d;
        if (c1Var2 != null) {
            boolean z2 = C105851w0.zx0().f314493e;
            C14413d0 d0Var2 = c1Var2.f333573j;
            if (d0Var2 != null) {
                d0Var2.f40016g = z2;
                d0Var2.mo13700a(z2, d0Var2.f40015f);
            }
        }
        this.f333594o = new MMHandler();
        C105851w0.zx0().f314462D = this;
        C105851w0.vx0().f314746h = this;
        MTimerHandler mTimerHandler = this.f333590h;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        C111423c1 c1Var3 = this.f333586d;
        if (c1Var3 != null) {
            c1Var3.setOnClickListener(new C111426a(intent, this));
        }
        C109935a.C109937b.f328933a.mo161253v0(8, true, this.f333586d);
        C105845w xx02 = C105851w0.xx0();
        xx02.getClass();
        xx02.f314808q = new HashMap<>();
        this.f333591i = 1;
        mo163100j(false);
        C106443e eVar = this.f333587e;
        C87412m.m108591d(eVar);
        eVar.mo150080d(intent, this.f333586d);
        C105857z0 q = C105851w0.zx0().mo150676q();
        C87412m.m108593f(q, "");
        q.mo150844h(0, "");
        q.mo150842f(this);
    }

    /* renamed from: f3 */
    public void mo150761f3() {
    }

    /* renamed from: g */
    public final void mo163097g() {
        if (this.f333586d != null) {
            this.f333589g = true;
            ((C119157j) C119157j.f356862d).mo183894y("showIcon");
            ((C119157j) C119157j.f356862d).mo183895z(new C111429b(this));
            return;
        }
        mo163095e(true);
    }

    /* renamed from: h */
    public final ArrayList<String> mo163098h() {
        ArrayList<String> d;
        C111423c1 c1Var = this.f333586d;
        String rendererSpeaker = c1Var != null ? c1Var.getRendererSpeaker() : null;
        C105845w xx02 = C105851w0.xx0();
        if (xx02 != null && (d = xx02.mo150824d(2)) != null) {
            return d;
        }
        if (rendererSpeaker == null || C112551y.m153811k(rendererSpeaker)) {
            return null;
        }
        if (C87412m.m108589b(rendererSpeaker, C75592q0.m90789s())) {
            if (C105851w0.zx0().f314469K != null && !C105851w0.xx0().f314801g) {
                Log.m105924i("MicroMsg.MultiTalkSmallWindow", "check mute form local pcm recorder");
                return C64197v.m75534c(rendererSpeaker);
            } else if (!this.f333593n) {
                this.f333593n = true;
                return C64197v.m75534c(rendererSpeaker);
            } else {
                this.f333593n = false;
                return null;
            }
        } else if (((ArrayList) C105851w0.xx0().mo150821a()).contains(rendererSpeaker)) {
            Log.m105924i("MicroMsg.MultiTalkSmallWindow", "check mute form service status");
            return C64197v.m75534c(rendererSpeaker);
        } else if (!this.f333593n) {
            this.f333593n = true;
            return C64197v.m75534c(rendererSpeaker);
        } else {
            this.f333593n = false;
            return null;
        }
    }

    /* renamed from: i */
    public final void mo163099i(int i) {
        C111423c1 c1Var = this.f333586d;
        if (c1Var != null) {
            c1Var.setVoicePlayDevice(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r1 = 4;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163100j(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 4
            r2 = 0
            if (r23 == 0) goto L_0x0072
            int r3 = r0.f333591i
            r4 = 2
            if (r3 != r4) goto L_0x0067
            v82.c1 r3 = r0.f333586d
            if (r3 == 0) goto L_0x014f
            v82.i0 r4 = r3.f333571h
            if (r4 != 0) goto L_0x0014
            goto L_0x005e
        L_0x0014:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x005e
            android.view.View r4 = r4.f229637a
            int r1 = r1.intValue()
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.mo10233c(r1)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(Ljava/lang/Integer;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r13.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(Ljava/lang/Integer;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x005e:
            v82.e0 r1 = r3.f333572i
            if (r1 == 0) goto L_0x014f
            r1.mo163128f(r2)
            goto L_0x014f
        L_0x0067:
            r0.f333591i = r4
            v82.c1 r1 = r0.f333586d
            if (r1 == 0) goto L_0x014f
            r1.mo163093q()
            goto L_0x014f
        L_0x0072:
            int r3 = r0.f333591i
            r4 = 1
            if (r3 != r4) goto L_0x0079
            goto L_0x014f
        L_0x0079:
            r0.f333591i = r4
            v82.c1 r3 = r0.f333586d
            if (r3 == 0) goto L_0x014f
            v82.i0 r5 = r3.f333571h
            if (r5 == 0) goto L_0x0097
            android.view.View r5 = r5.f229637a
            int r5 = r5.getVisibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r5 != 0) goto L_0x0090
            goto L_0x0097
        L_0x0090:
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = 0
        L_0x0098:
            if (r4 != 0) goto L_0x0148
            v82.i0 r4 = r3.f333571h
            if (r4 == 0) goto L_0x0141
            android.view.View r13 = r4.f229637a
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r14.mo10233c(r5)
            java.lang.Object[] r6 = r14.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r8 = "doAnimationShow"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setAlpha"
            java.lang.String r12 = "(F)V"
            r5 = r13
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r14.mo10231a(r2)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r13.setAlpha(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r7 = "doAnimationShow"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            r5 = r13
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r5 = r4.f229637a
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r17 = "doAnimationShow"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r16 = "doAnimationShow"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r5 = r4.f229637a
            r5.clearAnimation()
            android.view.View r5 = r4.f229637a
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            r6 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r6)
            v82.h0 r6 = new v82.h0
            r6.<init>(r4)
            android.view.ViewPropertyAnimator r4 = r5.setListener(r6)
            r4.start()
        L_0x0141:
            v82.e0 r4 = r3.f333572i
            if (r4 == 0) goto L_0x0148
            r4.mo163128f(r1)
        L_0x0148:
            v82.e0 r1 = r3.f333572i
            if (r1 != 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r1.f333640l = r2
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111425d1.mo163100j(boolean):void");
    }

    /* renamed from: l */
    public void mo150762l(boolean z) {
    }

    /* renamed from: l2 */
    public void mo150763l2(boolean z) {
    }

    /* renamed from: p4 */
    public void mo150764p4(int i, int i2) {
    }

    /* renamed from: r */
    public void mo150765r() {
    }

    /* renamed from: u6 */
    public boolean mo150766u6() {
        return C105851w0.vx0().mo150809d();
    }

    /* renamed from: v6 */
    public void mo150767v6() {
        C111423c1 c1Var;
        Log.m105924i("MicroMsg.MultiTalkSmallWindow", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + C105851w0.zx0().f314503q.size());
        if (C105851w0.zx0().mo150683y()) {
            boolean z = true;
            if (C105851w0.zx0().f314503q.size() > C105851w0.zx0().f314503q.contains(C75592q0.m90789s())) {
                C105851w0.zx0().mo150644U();
                C111423c1 c1Var2 = this.f333586d;
                if (c1Var2 != null && !C87412m.m108589b(c1Var2.getRendererSpeaker(), "")) {
                    mo163100j(true);
                    C111423c1 c1Var3 = this.f333586d;
                    if (c1Var3 != null) {
                        c1Var3.mo163093q();
                        return;
                    }
                    return;
                }
                return;
            }
            C105851w0.zx0().mo150647X();
            C111423c1 c1Var4 = this.f333586d;
            if (c1Var4 != null) {
                if (!C87412m.m108589b(c1Var4.getRendererSpeaker(), "")) {
                    C111423c1 c1Var5 = this.f333586d;
                    if (c1Var5 != null) {
                        c1Var5.mo163092p(c1Var4.getRendererSpeaker());
                    }
                } else {
                    ArrayList<String> h = mo163098h();
                    String str = null;
                    String str2 = h != null ? (String) C110818d0.m150914L(h) : null;
                    if (str2 != null) {
                        HashSet<String> hashSet = C105851w0.zx0().f314503q;
                        C87412m.m108593f(hashSet, "getMultiTalkManager().currentVideoUserSet");
                        Iterator<String> it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (C87412m.m108589b(next, str2)) {
                                str = next;
                                break;
                            }
                        }
                        if (str == null) {
                            z = false;
                        }
                        if (!z && (c1Var = this.f333586d) != null) {
                            c1Var.mo163092p(str2);
                        }
                    }
                }
            }
            mo163098h();
            mo163100j(false);
        }
    }

    /* renamed from: w */
    public void mo150768w() {
    }

    /* renamed from: x0 */
    public void mo150769x0(boolean z) {
    }

    /* renamed from: y3 */
    public void mo150770y3(C111452h1 h1Var, C111452h1 h1Var2) {
    }
}

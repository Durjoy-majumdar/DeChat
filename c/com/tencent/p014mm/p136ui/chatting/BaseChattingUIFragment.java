package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ck3.C67391b;
import ck3.C67398g;
import com.tencent.p014mm.autogen.events.OnChattingUIActionEvent;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.C116183y1;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.chatting.component.C73447c0;
import com.tencent.p014mm.p136ui.chatting.component.C73479g0;
import com.tencent.p014mm.p136ui.chatting.component.C73510k0;
import com.tencent.p014mm.p136ui.chatting.component.C73651x2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p227rn.C48053v;
import p270xi.C66282i;
import p270xi.C78837h;
import p270xi.C78838j;
import p903ij.C76359b;
import rb0.C47984k;
import rx3.C36570n;
import uj3.C78190b;
import wk3.C78606a;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment */
public abstract class BaseChattingUIFragment extends MMFragment implements C73874v3, C74336w3 {

    /* renamed from: t */
    public static final /* synthetic */ int f215217t = 0;

    /* renamed from: d */
    public String f215218d;

    /* renamed from: e */
    public String f215219e;

    /* renamed from: f */
    public C67391b f215220f = new C67391b(this, this, this);

    /* renamed from: g */
    public C73510k0 f215221g = new C73510k0();

    /* renamed from: h */
    public C73479g0 f215222h = new C73479g0();

    /* renamed from: i */
    public boolean f215223i = false;

    /* renamed from: j */
    public boolean f215224j = false;

    /* renamed from: n */
    public Boolean f215225n = Boolean.FALSE;

    /* renamed from: o */
    public long f215226o;

    /* renamed from: p */
    public long f215227p;

    /* renamed from: q */
    public int f215228q = 0;

    /* renamed from: r */
    public int f215229r;

    /* renamed from: s */
    public int f215230s;

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$a */
    public class C73259a extends C67398g {
        public C73259a() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[onExitBegin] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            baseChattingUIFragment2.getClass();
            baseChattingUIFragment2.f215230s = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcQuitChattingEnable(), C40318k.m43492a().getHcQuitChattingDelay(), C40318k.m43492a().getHcQuitChattingCPU(), C40318k.m43492a().getHcQuitChattingIO(), C40318k.m43492a().getHcQuitChattingThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcQuitChattingTimeout(), 302, C40318k.m43492a().getHcQuitChattingAction(), "ChattingUIFragment");
            BaseChattingUIFragment.this.f215221g.mo26170u5();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$b */
    public class C73260b extends C67398g {
        public C73260b() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[onExitEnd] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            BaseChattingUIFragment.this.f215221g.mo26199n2();
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            if (baseChattingUIFragment2.f215230s != 0) {
                C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcQuitChattingEnable(), baseChattingUIFragment2.f215230s);
                baseChattingUIFragment2.f215230s = 0;
            }
            C67391b bVar = BaseChattingUIFragment.this.f215220f;
            bVar.f193283g = false;
            bVar.mo91545F(false);
            C67391b bVar2 = BaseChattingUIFragment.this.f215220f;
            bVar2.f193296t = false;
            bVar2.mo91551L(false);
            OnChattingUIActionEvent onChattingUIActionEvent = new OnChattingUIActionEvent();
            OnChattingUIActionEvent.C67746a aVar = onChattingUIActionEvent.f193777d;
            aVar.f193778a = 1;
            aVar.f193779b = BaseChattingUIFragment.this.f215220f.mo91577r();
            onChattingUIActionEvent.f193777d.f193780c = BaseChattingUIFragment.this.f215226o;
            onChattingUIActionEvent.asyncPublish(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$c */
    public class C73261c extends C67398g {
        public C73261c() {
        }

        /* renamed from: a */
        public void mo91597a() {
            C67391b bVar = BaseChattingUIFragment.this.f215220f;
            bVar.f193283g = true;
            bVar.mo91545F(true);
            C67391b bVar2 = BaseChattingUIFragment.this.f215220f;
            bVar2.f193296t = false;
            bVar2.mo91551L(false);
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            baseChattingUIFragment.f215220f.f193298v = false;
            baseChattingUIFragment.f215221g.mo70065e();
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doCreate] activity:%s isPreLoaded:%b", baseChattingUIFragment2.f215219e, Boolean.valueOf(baseChattingUIFragment2.f215223i));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$d */
    public class C73262d extends C67398g {
        public C73262d() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doResume] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            BaseChattingUIFragment.this.f215221g.mo26186F4();
            BaseChattingUIFragment.this.f215227p = System.currentTimeMillis();
            BaseChattingUIFragment.this.f215220f.f193298v = false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$e */
    public class C73263e extends C67398g {
        public C73263e() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doPause] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            BaseChattingUIFragment.this.f215221g.mo26160G4();
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            long currentTimeMillis = System.currentTimeMillis();
            BaseChattingUIFragment baseChattingUIFragment3 = BaseChattingUIFragment.this;
            baseChattingUIFragment2.f215226o += currentTimeMillis - baseChattingUIFragment3.f215227p;
            baseChattingUIFragment3.f215220f.f193298v = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$f */
    public class C73264f extends C67398g {
        public C73264f() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doDestroy] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            if (!BaseChattingUIFragment.this.mo102033d0(16) || BaseChattingUIFragment.this.mo102033d0(8)) {
                C67391b bVar = BaseChattingUIFragment.this.f215220f;
                bVar.f193283g = false;
                bVar.mo91545F(false);
                C67391b bVar2 = BaseChattingUIFragment.this.f215220f;
                bVar2.f193296t = false;
                bVar2.mo91551L(false);
                BaseChattingUIFragment.this.f215228q = 0;
                return;
            }
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            throw new RuntimeException(String.format("[doDestroy] never doPause, activity:%s isPreLoaded:%b isForeground:%b isFinishing:%b isNeverCreate:%b", new Object[]{baseChattingUIFragment2.f215219e, Boolean.valueOf(baseChattingUIFragment2.f215223i), Boolean.valueOf(BaseChattingUIFragment.this.f215220f.f193283g), Boolean.valueOf(BaseChattingUIFragment.this.isFinishing()), Boolean.valueOf(BaseChattingUIFragment.this.mo102033d0(2))}));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment$g */
    public class C73265g extends C67398g {
        public C73265g() {
        }

        /* renamed from: a */
        public void mo91597a() {
            BaseChattingUIFragment baseChattingUIFragment = BaseChattingUIFragment.this;
            Log.m105925i("MicroMsg.BaseChattingUIFragment", "[onEnterBegin] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
            BaseChattingUIFragment baseChattingUIFragment2 = BaseChattingUIFragment.this;
            baseChattingUIFragment2.getClass();
            baseChattingUIFragment2.f215229r = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcEnterChattingEnable(), C40318k.m43492a().getHcEnterChattingDelay(), C40318k.m43492a().getHcEnterChattingCPU(), C40318k.m43492a().getHcEnterChattingIO(), C40318k.m43492a().getHcEnterChattingThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcEnterChattingTimeout(), 301, C40318k.m43492a().getHcEnterChattingAction(), "ChattingUIFragment");
            C67391b bVar = BaseChattingUIFragment.this.f215220f;
            bVar.f193283g = true;
            bVar.mo91545F(true);
            C67391b bVar2 = BaseChattingUIFragment.this.f215220f;
            bVar2.f193296t = false;
            bVar2.mo91551L(false);
            BaseChattingUIFragment.this.f215221g.mo26162O4();
            BaseChattingUIFragment.this.f215226o = 0;
        }
    }

    public BaseChattingUIFragment() {
        mo102039j0();
    }

    /* renamed from: K */
    public void mo102020K() {
        if (this.f215220f.f193283g || isFinishing()) {
            if (mo102033d0(8) && !isFinishing() && !mo102032a0()) {
                Log.m105928w("MicroMsg.BaseChattingUIFragment", "[onPause] is never doResume before doPause! Because while entering ChattingUI, the app back to background.");
                mo101992T();
                mo102022M(256, new C73725k0(this));
            }
            mo101991S();
        }
    }

    /* renamed from: L */
    public void mo102021L() {
        if (this.f215220f.f193283g || isFinishing()) {
            if (!(mo102033d0(256) && !mo102033d0(128))) {
                if (mo102033d0(16)) {
                    Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s is never pause when stop coming!", this.f215219e);
                    mo101991S();
                }
                mo102022M(32, new C73723j0(this));
            }
        }
    }

    /* renamed from: M */
    public final void mo102022M(int i, Runnable runnable) {
        boolean z = (4 != i || !mo102033d0(2)) && (8 != i || !mo102033d0(4)) && ((16 != i || !mo102033d0(8)) && ((32 != i || !mo102033d0(4)) && ((64 != i || !mo102033d0(2)) && (512 != i || !mo102033d0(256)))));
        boolean d0 = mo102033d0(i);
        if (!d0 || !z) {
            Log.m105929w("MicroMsg.BaseChattingUIFragment", "catch! [check] %s flag:%x isNever:%s isStrict:%s", this.f215219e, Integer.valueOf(i), Boolean.valueOf(d0), Boolean.valueOf(z));
            return;
        }
        this.f215228q |= i;
        if (2 == i) {
            mo102023N(64);
        } else if (64 == i) {
            mo102023N(2);
        } else if (4 == i) {
            mo102023N(32);
        } else if (32 == i) {
            mo102023N(4);
        } else if (8 == i) {
            mo102023N(16);
        } else if (16 == i) {
            mo102023N(8);
        } else if (128 == i) {
            mo102023N(256);
        } else if (256 == i) {
            mo102023N(128);
        } else if (512 == i) {
            mo102023N(1024);
        } else if (1024 == i) {
            mo102023N(512);
        }
        runnable.run();
    }

    /* renamed from: N */
    public final void mo102023N(int i) {
        this.f215228q = (~i) & this.f215228q;
    }

    /* renamed from: O */
    public void mo102024O(Context context) {
        Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doAttach] activity:%s isPreLoaded:%b", this.f215219e, Boolean.valueOf(this.f215223i));
    }

    /* renamed from: P */
    public void mo70223P() {
        mo102022M(2, new C73261c());
    }

    /* renamed from: Q */
    public void mo102025Q() {
        mo102022M(64, new C73264f());
    }

    /* renamed from: R */
    public void mo102026R() {
        Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doDetach] activity:%s isPreLoaded:%b", this.f215219e, Boolean.valueOf(this.f215223i));
        for (Map.Entry next : this.f215220f.f193278b.f216514a.entrySet()) {
            if (next.getValue() instanceof C73651x2) {
                ((C73651x2) next.getValue()).mo70047l2();
            }
        }
    }

    /* renamed from: S */
    public void mo101991S() {
        mo102022M(16, new C73263e());
    }

    /* renamed from: T */
    public void mo101992T() {
        mo102022M(8, new C73262d());
    }

    /* renamed from: U */
    public void mo102027U(boolean z, int i) {
    }

    /* renamed from: V */
    public abstract C79368l mo102028V();

    /* renamed from: X */
    public abstract C116183y1 mo102029X();

    /* renamed from: Y */
    public C78606a mo102030Y() {
        return null;
    }

    /* renamed from: Z */
    public abstract C72917n0 mo102031Z();

    /* renamed from: a0 */
    public boolean mo102032a0() {
        return mo102033d0(1024) && !mo102033d0(512);
    }

    /* renamed from: d0 */
    public boolean mo102033d0(int i) {
        return (i & this.f215228q) == 0;
    }

    /* renamed from: e0 */
    public void mo101993e0() {
        mo102022M(128, new C73265g());
    }

    /* renamed from: f0 */
    public void mo102034f0() {
        mo102022M(512, new C73259a());
    }

    /* renamed from: g0 */
    public void mo102035g0() {
        mo102022M(1024, new C73260b());
    }

    public int getFirstVisiblePosition() {
        return mo102031Z().getFirstVisiblePosition();
    }

    public String getIdentityString() {
        Class cls = C48053v.class;
        C72996z1 o = this.f215220f.mo91574o();
        if (!(o == null || ((int) o.f108320R1) == 0 || Util.isNullOrNil(o.getUsername()))) {
            if (C86709a0.m107522a()) {
                if (((C48053v) C86312j.m106911c(cls)).mo72614OE(o.getUsername())) {
                    return "_EnterpriseChat";
                }
                if (((C48053v) C86312j.m106911c(cls)).mo72617gl(o.getUsername())) {
                    return "_EnterpriseFatherBiz";
                }
                if (C47984k.m53335i(o.getUsername())) {
                    return "_EnterpriseChildBiz";
                }
            }
            if (o.mo62916m3()) {
                return "_bizContact";
            }
            if (C72996z1.m85820U5(o.getUsername())) {
                return "_chatroom";
            }
            if (C72996z1.m85811N4(o.getUsername())) {
                return "_bottle";
            }
            if (C72996z1.m85848s5(o.getUsername())) {
                return "_QQ";
            }
        }
        return "";
    }

    /* renamed from: h0 */
    public void mo102038h0() {
    }

    /* renamed from: i0 */
    public void mo101994i0() {
    }

    /* renamed from: j0 */
    public void mo102039j0() {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey(getClass().getName())) {
            bundle.putInt(getClass().getName(), Integer.MAX_VALUE);
        }
        setArguments(bundle);
        C78190b.C78193e eVar = C78190b.f229093y0;
        boolean z = true;
        if (C78190b.f229091Q0 < 1) {
            z = false;
        }
        this.f215225n = Boolean.valueOf(z);
    }

    /* renamed from: k0 */
    public abstract boolean mo102040k0();

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo70223P();
        if (this.isCurrentActivity || this.f215223i) {
            mo101993e0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ke3.b$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r3 = 1
            r0[r3] = r1
            if (r8 != 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "MicroMsg.BaseChattingUIFragment"
            java.lang.String r4 = "onActivityResult return, requestCode:%d resultCode:%s data is null? %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            ck3.b r0 = r5.f215220f
            boolean r4 = r0.f193283g
            if (r4 != 0) goto L_0x003b
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r2] = r6
            java.lang.String r6 = "[onActivityResult] not foreground, return, requestCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r6, r7)
            return
        L_0x003b:
            com.tencent.mm.ui.chatting.manager.b r0 = r0.f193279c
            java.lang.ref.WeakReference<ck3.b> r0 = r0.f216517a
            java.lang.Object r0 = r0.get()
            ck3.b r0 = (ck3.C67391b) r0
            r1 = 0
            if (r0 == 0) goto L_0x004b
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            goto L_0x0069
        L_0x004f:
            java.util.WeakHashMap<androidx.fragment.app.Fragment, java.util.HashMap<java.lang.Integer, ke3.b$c>> r2 = com.tencent.p014mm.p136ui.chatting.manager.C73759b.f216516b
            java.lang.Object r0 = r2.get(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L_0x0064
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.remove(r1)
            r1 = r0
            ke3.b$c r1 = (ke3.C88144b.C76564c) r1
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.onActivityResult(r6, r7, r8)
        L_0x0069:
            ck3.b r0 = r5.f215220f
            com.tencent.mm.ui.chatting.component.f1 r0 = r0.f193280d
            r0.mo70052N5(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f215218d = getActivity().getClass().getName() + "@" + hashCode() + " @talker:%s";
        mo102024O(context);
        this.f215220f.mo91579t(C66282i.class, this.f215221g);
        C67391b bVar = this.f215220f;
        bVar.mo91579t(C78838j.class, bVar.f193280d);
        this.f215220f.mo91579t(C78837h.class, this.f215222h);
        for (C73447c0.C73448a aVar : (List) ((C36570n) C73447c0.f215829b).getValue()) {
            this.f215220f.mo91579t(aVar.f215830a, aVar.mo102398a());
        }
        ArrayList<String> stringArrayList = getStringArrayList("key_intent_chatting_components");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null) {
            for (String cls : stringArrayList) {
                try {
                    arrayList.add(Class.forName(cls));
                } catch (Exception unused) {
                }
            }
        }
        for (C73447c0.C73448a next : C73447c0.m86803a(arrayList)) {
            this.f215220f.mo91579t(next.f215830a, next.mo102398a());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C67391b bVar = this.f215220f;
        if (bVar.f193283g) {
            bVar.f193280d.mo70146R5(configuration);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup.LayoutParams layoutParams = onCreateView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        onCreateView.setLayoutParams(layoutParams);
        return onCreateView;
    }

    public final void onDestroy() {
        super.onDestroy();
        Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onDestroy] activity:%s isForeground:%s isFinishing:%s", this.f215219e, Boolean.valueOf(this.f215220f.f193283g), Boolean.valueOf(isFinishing()));
        mo102022M(512, new C73716h0(this));
        mo102025Q();
        mo102035g0();
    }

    public final void onDetach() {
        super.onDetach();
        mo102026R();
    }

    public void onDragBegin() {
        this.f215220f.f193280d.mo102430S5();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f215220f.f193280d.mo70055U5(i, keyEvent);
    }

    public final void onPause() {
        super.onPause();
        Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onPause] activity:%s isForeground:%s isFinishing:%s isExiting:%s", this.f215219e, Boolean.valueOf(this.f215220f.f193283g), Boolean.valueOf(isFinishing()), Boolean.valueOf(mo102032a0()));
        mo102020K();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f215220f.f193280d.mo102183V5(i, strArr, iArr);
    }

    public final void onResume() {
        super.onResume();
        Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onResume] activity:%s isForeground:%s isFinishing:%s", this.f215219e, Boolean.valueOf(this.f215220f.f193283g), Boolean.valueOf(isFinishing()));
        if (this.f215220f.f193283g) {
            mo101992T();
            if (this.isCurrentActivity || this.f215223i) {
                mo102022M(256, new C73725k0(this));
            }
        }
    }

    public final void onStart() {
        super.onStart();
        Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onStart] activity:%s isForeground:%s isFinishing:%s", this.f215219e, Boolean.valueOf(this.f215220f.f193283g), Boolean.valueOf(isFinishing()));
        if (this.f215220f.f193283g) {
            mo102022M(4, new C73719i0(this));
        }
    }

    public final void onStop() {
        super.onStop();
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = this.f215219e;
        objArr[1] = Boolean.valueOf(this.f215220f.f193283g);
        objArr[2] = Boolean.valueOf(isFinishing());
        if (mo102033d0(256) && !mo102033d0(128)) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        Log.m105929w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s isForeground:%s isFinishing:%s isEntering:%s", objArr);
        mo102021L();
    }

    public boolean supportNavigationSwipeBack() {
        if (this.isCurrentActivity) {
            return false;
        }
        C86709a0.m107528h();
        if (!C76359b.m91786c(C86709a0.m107531m().mo58407a().f124990c)) {
            return true;
        }
        Log.m105928w("MicroMsg.BaseChattingUIFragment", "Running on a Chromebook, so we not support swipeback and so on");
        return false;
    }

    public BaseChattingUIFragment(boolean z) {
        super(z);
        mo102039j0();
    }
}

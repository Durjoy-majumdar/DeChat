package ck3;

import ak3.C67067f;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import ck3.C67400j;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73874v3;
import com.tencent.p014mm.p136ui.chatting.C74336w3;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.component.C73472f1;
import com.tencent.p014mm.p136ui.chatting.component.C73651x2;
import com.tencent.p014mm.p136ui.chatting.manager.C73758a;
import com.tencent.p014mm.p136ui.chatting.manager.C73759b;
import com.tencent.p014mm.p136ui.tools.C74845h1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31543z5;
import eb0.C75592q0;
import gj3.C59469a;
import gj3.C59470c;
import gy3.C87412m;
import hk3.C76227e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import k20.C9556a;
import ke3.C88144b;
import ln3.C76718l;
import mn3.C76798k;
import nj3.C76879j;
import oa1.C117731d;
import p206nj.C11171e;
import p270xi.C53356d;
import p270xi.C78835e;
import p270xi.C78840l;
import p823sg.C90193h;
import pf3.C35475a;
import qo3.C89779i0;
import zj3.C79348e;
import zj3.C79368l;

/* renamed from: ck3.b */
public final class C67391b implements C78835e {

    /* renamed from: y */
    public static MMHandler f193276y = new MMHandler();

    /* renamed from: a */
    public final MMHandler f193277a = new C67399h();

    /* renamed from: b */
    public C73758a f193278b = new C73758a(this);

    /* renamed from: c */
    public C73759b f193279c = new C73759b(this);

    /* renamed from: d */
    public C73472f1 f193280d = new C73472f1();

    /* renamed from: e */
    public boolean f193281e;

    /* renamed from: f */
    public C67400j f193282f;

    /* renamed from: g */
    public boolean f193283g;

    /* renamed from: h */
    public C72996z1 f193284h;

    /* renamed from: i */
    public String f193285i;

    /* renamed from: j */
    public BaseChattingUIFragment f193286j;

    /* renamed from: k */
    public C73874v3 f193287k;

    /* renamed from: l */
    public C74336w3 f193288l;

    /* renamed from: m */
    public int f193289m;

    /* renamed from: n */
    public boolean f193290n;

    /* renamed from: o */
    public String f193291o;

    /* renamed from: p */
    public String f193292p;

    /* renamed from: q */
    public boolean f193293q;

    /* renamed from: r */
    public C67396e f193294r;

    /* renamed from: s */
    public boolean f193295s;

    /* renamed from: t */
    public boolean f193296t;

    /* renamed from: u */
    public boolean f193297u;

    /* renamed from: v */
    public boolean f193298v;

    /* renamed from: w */
    public ConcurrentLinkedQueue<C76227e.C76228a> f193299w;

    /* renamed from: x */
    public C59469a f193300x;

    /* renamed from: ck3.b$a */
    public class C54942a extends C59469a {
        public C54942a() {
        }

        /* renamed from: a */
        public void mo75852a(List<String> list, Map<String, View> map) {
            List<Pair<View, String>> a;
            if (list != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                int lastVisiblePosition = C67391b.this.mo91570k().getLastVisiblePosition();
                for (int firstVisiblePosition = C67391b.this.mo91570k().getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                    View w = C67391b.this.mo91570k().mo81316w(firstVisiblePosition, 0);
                    if (!(w == null || (a = C59470c.m69393a(w)) == null)) {
                        for (Pair next : a) {
                            if (list.contains(next.second)) {
                                arrayList.add((String) next.second);
                                if (map != null) {
                                    map.containsKey(next.second);
                                    Object obj = next.second;
                                    hashMap.put((String) obj, map.get(obj));
                                }
                            }
                        }
                    }
                }
                list.clear();
                list.addAll(arrayList);
                map.clear();
                map.putAll(hashMap);
            }
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            List<Pair<View, String>> a;
            if (!(list == null || list.size() <= 0 || map == null)) {
                map.clear();
                int lastVisiblePosition = C67391b.this.mo91570k().getLastVisiblePosition();
                for (int firstVisiblePosition = C67391b.this.mo91570k().getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                    View w = C67391b.this.mo91570k().mo81316w(firstVisiblePosition, 0);
                    if (!(w == null || (a = C59470c.m69393a(w)) == null)) {
                        for (Pair next : a) {
                            if (list.contains(next.second)) {
                                map.put((String) next.second, (View) next.first);
                            }
                        }
                    }
                }
            }
            super.onMapSharedElements(list, map);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
        }
    }

    public C67391b(BaseChattingUIFragment baseChattingUIFragment, C73874v3 v3Var, C74336w3 w3Var) {
        boolean z = C117731d.m166007c().mo182440a(new C35475a()) == 1;
        this.f193281e = z;
        this.f193282f = z ? C67392c.f193301a : C67400j.C67401a.f193317a;
        this.f193283g = false;
        this.f193290n = false;
        this.f193293q = true;
        this.f193294r = new C67396e();
        this.f193295s = true;
        this.f193296t = false;
        this.f193297u = false;
        this.f193298v = false;
        this.f193299w = new ConcurrentLinkedQueue<>();
        this.f193300x = new C54942a();
        this.f193286j = baseChattingUIFragment;
        this.f193287k = v3Var;
        this.f193288l = w3Var;
    }

    /* renamed from: A */
    public void mo91540A() {
        Log.m105924i("MicroMsg.ChattingContext", "[notifyDataSetChange]");
        C79368l lVar = ((ChattingUIFragment) this.f193287k).f215303u;
        if (lVar != null) {
            lVar.mo81320c3((Object) null);
        }
    }

    /* renamed from: B */
    public void mo91541B(boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.ChattingContext", "[scrollToLast]1 force:%b", Boolean.valueOf(z));
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        chattingUIFragment.getClass();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z2 = true;
        }
        chattingUIFragment.mo102088p0(z, z2, true);
    }

    /* renamed from: C */
    public void mo91542C(boolean z, boolean z2, boolean z3) {
        Log.m105925i("MicroMsg.ChattingContext", "[scrollToLast]3 force:%b", Boolean.valueOf(z));
        ((ChattingUIFragment) this.f193287k).mo102088p0(z, z2, z3);
    }

    /* renamed from: D */
    public void mo91543D(boolean z) {
        Log.m105924i("MicroMsg.ChattingContext", "[scrollToLastImmediately]");
        mo91542C(z, Looper.getMainLooper() != Looper.myLooper(), false);
    }

    /* renamed from: E */
    public void mo91544E(int i) {
        int i2;
        Log.m105925i("MicroMsg.ChattingContext", "[scrollToLast] position:%d", Integer.valueOf(i));
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        chattingUIFragment.f215220f.mo91571l().removeCallbacks(chattingUIFragment.f215308z);
        Log.m105925i("MicroMsg.ChattingUIFragment", "[scrollToPosition] scroll to pos:%d", Integer.valueOf(i));
        if (chattingUIFragment.f215225n.booleanValue()) {
            chattingUIFragment.f215289B.getListView().smoothScrollToPositionFromTop(i + chattingUIFragment.f215304v.getHeaderViewsCount(), 0, 0);
            return;
        }
        if (chattingUIFragment.f215288A == null) {
            chattingUIFragment.f215288A = new C74845h1(chattingUIFragment.f215304v);
        }
        C74845h1 h1Var = chattingUIFragment.f215288A;
        int headerViewsCount = i + chattingUIFragment.f215304v.getHeaderViewsCount();
        h1Var.f220063e.removeCallbacks(h1Var);
        h1Var.f220062d = System.currentTimeMillis();
        h1Var.f220069n = 0;
        int firstVisiblePosition = h1Var.f220063e.getFirstVisiblePosition();
        int childCount = (h1Var.f220063e.getChildCount() + firstVisiblePosition) - 1;
        if (headerViewsCount <= firstVisiblePosition) {
            i2 = (firstVisiblePosition - headerViewsCount) + 1;
            h1Var.f220064f = 2;
        } else if (headerViewsCount >= childCount) {
            i2 = (headerViewsCount - childCount) + 1;
            h1Var.f220064f = 1;
        } else {
            return;
        }
        if (i2 > 0) {
            h1Var.f220067i = 1000 / i2;
        } else {
            h1Var.f220067i = 1000;
        }
        h1Var.f220065g = headerViewsCount;
        h1Var.f220066h = -1;
        h1Var.f220063e.post(h1Var);
    }

    /* renamed from: F */
    public void mo91545F(boolean z) {
        Log.m105925i("MicroMsg.ChattingContext", "trace setFocused, isFocused %s, isSwitchMenu %s, needUpdateUI %s", Boolean.valueOf(z), Boolean.valueOf(this.f193297u), Boolean.valueOf(this.f193296t));
        if (!this.f193297u) {
            this.f193295s = z;
            if (z && this.f193296t) {
                this.f193296t = false;
                if (this.f193287k != null) {
                    ConcurrentLinkedQueue<C76227e.C76228a> concurrentLinkedQueue = this.f193299w;
                    LinkedList<C76227e.C76228a> linkedList = new LinkedList<>();
                    Iterator<C76227e.C76228a> it = concurrentLinkedQueue.iterator();
                    C76227e.C76228a aVar = null;
                    while (it.hasNext()) {
                        C76227e.C76228a next = it.next();
                        if (next != aVar) {
                            linkedList.add(next);
                            aVar = next;
                        }
                    }
                    for (C76227e.C76228a aVar2 : linkedList) {
                        Log.m105925i("MicroMsg.ChattingContext", "[setFocused] replay action=%s", aVar2);
                        C79368l lVar = ((ChattingUIFragment) this.f193287k).f215303u;
                        if (lVar != null) {
                            lVar.mo108207p4(aVar2);
                        }
                    }
                }
                this.f193299w.clear();
            }
        }
    }

    /* renamed from: G */
    public void mo91546G(boolean z) {
        Log.m105925i("MicroMsg.ChattingContext", "[setKeepScreenOn] force:%b", Boolean.valueOf(z));
        C72917n0 n0Var = ((ChattingUIFragment) this.f193287k).f215304v;
        if (n0Var != null) {
            n0Var.setKeepScreenOn(z);
        }
    }

    /* renamed from: H */
    public void mo91547H(int i) {
        ((ChattingUIFragment) this.f193287k).f215304v.setVisibility(i);
        if (Log.getLogLevel() == 2) {
            Log.m105924i("MicroMsg.ChattingUIFragment", "[setListViewVisibility] visibility:" + i + " stack:" + Util.getStack().toString());
        }
    }

    /* renamed from: I */
    public void mo91548I(C72996z1 z1Var) {
        this.f193277a.removeCallbacksAndMessages((Object) null);
        this.f193284h = z1Var;
        this.f193291o = C90193h.m112878f((z1Var.getUsername() + System.currentTimeMillis() + "").getBytes());
    }

    /* renamed from: J */
    public void mo91549J(int i, boolean z, boolean z2, int i2) {
        Log.m105925i("MicroMsg.ChattingContext", "[setSelection] pos:%s isSmooth:%s isIdleVisible:%s topOffset:%s", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        chattingUIFragment.f215220f.mo91571l().removeCallbacks(chattingUIFragment.f215308z);
        Log.m105925i("MicroMsg.ChattingUIFragment", "[setSelection] pos:%d isSmooth:%s", Integer.valueOf(i), Boolean.valueOf(z));
        chattingUIFragment.mo102096t0(false);
        C72917n0 n0Var = chattingUIFragment.f215304v;
        if (n0Var != null) {
            if (!(n0Var.getFirstVisiblePosition() < i && i < n0Var.getLastVisiblePosition()) || !z2) {
                Log.m105925i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s topOffset:%s", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
                n0Var.setItemChecked(i, true);
                if (!z || C72924q1.m85522c(n0Var, i)) {
                    n0Var.setSelectionFromTop(i, i2);
                } else {
                    n0Var.smoothScrollToPositionFromTop(i, i2, 200);
                }
            }
        }
    }

    /* renamed from: K */
    public void mo91550K(int i, int i2, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.ChattingContext", "[setSelectionFromTop] pos:%s offset:%s isSmooth:%s isIdleVisible:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2));
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        chattingUIFragment.f215220f.mo91571l().removeCallbacks(chattingUIFragment.f215308z);
        Log.m105925i("MicroMsg.ChattingUIFragment", "[setSelectionFromTop] pos:%d offset:%s isSmooth:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (!chattingUIFragment.f215220f.f193290n) {
            C72924q1.m85521b(chattingUIFragment.f215304v, i, i2, z, z2);
            return;
        }
        C72917n0 n0Var = chattingUIFragment.f215304v;
        if (n0Var != null) {
            if (!(n0Var.getFirstVisiblePosition() < i && i < n0Var.getLastVisiblePosition())) {
                Log.m105925i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromToInnerSearch position %s smooth %s", Integer.valueOf(i), Boolean.TRUE);
                n0Var.setItemChecked(i, true);
                if (!C11171e.m11045b(11) || C72924q1.m85522c(n0Var, i)) {
                    n0Var.setSelectionFromTop(i, i2);
                } else {
                    n0Var.smoothScrollToPositionFromTop(i, i2, 200);
                }
            }
        }
    }

    /* renamed from: L */
    public void mo91551L(boolean z) {
        Log.m105925i("MicroMsg.ChattingContext", "trace setSwitchMenu, isSwitchMenu %s, trace %s", Boolean.valueOf(z), Util.getStack());
        this.f193297u = z;
    }

    /* renamed from: M */
    public void mo91552M(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        Log.m105924i("MicroMsg.ChattingContext", "[showDialog]");
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        C89779i0 i0Var = chattingUIFragment.f215305w;
        if (i0Var != null) {
            i0Var.dismiss();
            chattingUIFragment.f215305w = null;
        }
        chattingUIFragment.f215305w = C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
    }

    /* renamed from: N */
    public void mo91553N(int i, boolean z) {
        Log.m105925i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d show:%s", Integer.valueOf(i), Boolean.valueOf(z));
        this.f193287k.showOptionMenu(i, z);
    }

    /* renamed from: O */
    public void mo91554O(boolean z) {
        Log.m105925i("MicroMsg.ChattingContext", "[showOptionMenu] show:%s", Boolean.valueOf(z));
        this.f193287k.showOptionMenu(z);
    }

    /* renamed from: P */
    public void mo91555P(int i, int i2, String str, long j) {
        C76798k kVar = (C76798k) ((C67067f) this.f193278b.mo102812a(C67067f.class)).mo91067J(C76798k.class);
        kVar.getClass();
        C87412m.m108594g(str, "content");
        kVar.f224617f = new C76718l(i, i2, str, C31543z5.m39453c() + j);
        kVar.mo107034Z5();
    }

    /* renamed from: Q */
    public void mo91556Q(Intent intent) {
        BaseChattingUIFragment baseChattingUIFragment = this.f193286j;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
        C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: R */
    public void mo91557R(Intent intent, int i, C88144b.C76564c cVar) {
        this.f193279c.mo102813a(intent, i, cVar);
    }

    /* renamed from: S */
    public void mo91558S() {
        this.f193282f.mo91586a();
    }

    /* renamed from: T */
    public void mo91559T(int i, int i2) {
        Log.m105925i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f193287k.updateOptionMenuIcon(i, i2);
    }

    /* renamed from: a */
    public <T extends C53356d, V extends Class<T>> T mo91560a(V v) {
        return this.f193278b.mo102812a(v);
    }

    /* renamed from: b */
    public void mo91561b() {
        Log.m105924i("MicroMsg.ChattingContext", "[dismissDialog]");
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) this.f193287k;
        C89779i0 i0Var = chattingUIFragment.f215305w;
        if (i0Var != null) {
            i0Var.dismiss();
            chattingUIFragment.f215305w = null;
        }
    }

    /* renamed from: c */
    public View mo91562c(int i) {
        return this.f193286j.findViewById(i);
    }

    /* renamed from: d */
    public boolean mo91563d() {
        return this.f193286j.mo102040k0();
    }

    /* renamed from: e */
    public MMActivityController mo91564e() {
        return this.f193286j.getController();
    }

    /* renamed from: f */
    public Activity mo91565f() {
        return this.f193286j.getContext();
    }

    /* renamed from: g */
    public int mo91566g() {
        return this.f193287k.getFirstVisiblePosition();
    }

    /* renamed from: h */
    public BaseChattingUIFragment mo91567h() {
        return this.f193286j;
    }

    /* renamed from: i */
    public int mo91568i() {
        return ((BaseChattingUIFragment) this.f193287k).mo102031Z().getHeaderViewsCount();
    }

    /* renamed from: j */
    public int mo91569j() {
        return ((BaseChattingUIFragment) this.f193287k).mo102031Z().getLastVisiblePosition();
    }

    @Deprecated
    /* renamed from: k */
    public C72917n0 mo91570k() {
        return ((ChattingUIFragment) this.f193287k).f215304v;
    }

    /* renamed from: l */
    public MMHandler mo91571l() {
        return this.f193281e ? this.f193277a : f193276y;
    }

    /* renamed from: m */
    public Resources mo91572m() {
        return this.f193286j.getMMResources();
    }

    /* renamed from: n */
    public String mo91573n() {
        if (this.f193285i == null) {
            this.f193285i = C75592q0.m90789s();
            this.f193285i = C72996z1.m85811N4(mo91577r()) ? C72996z1.m85829Z5(this.f193285i) : this.f193285i;
        }
        return this.f193285i;
    }

    /* renamed from: o */
    public C72996z1 mo91574o() {
        this.f193282f.mo91587b("getTalker");
        return this.f193284h;
    }

    /* renamed from: p */
    public C39969i mo91575p() {
        return new C39969i(mo91577r(), mo91576q(), mo91574o(), mo91583x(), mo91580u());
    }

    /* renamed from: q */
    public String mo91576q() {
        this.f193282f.mo91587b("getTalkerNickName");
        return Util.nullAs(((C79348e) this.f193278b.mo102812a(C79348e.class)).mo70056V3(), mo91574o().getNickname());
    }

    /* renamed from: r */
    public String mo91577r() {
        return mo91574o() == null ? "" : Util.nullAs(mo91574o().getUsername(), "");
    }

    /* renamed from: s */
    public void mo91578s() {
        Log.m105924i("MicroMsg.ChattingContext", "[hideVKB]");
        this.f193287k.hideVKB();
    }

    /* renamed from: t */
    public void mo91579t(Class<? extends C53356d> cls, C53356d dVar) {
        C73758a aVar = this.f193278b;
        if (aVar.f216514a.put(cls, dVar) != null) {
            Log.m105929w("MicroMsg.ChattingComponentManager", "[register] %s has register", cls);
        }
        if (dVar instanceof C73651x2) {
            long currentTimeMillis = System.currentTimeMillis();
            ((C73651x2) dVar).mo70142u2(aVar.f216515b);
            Log.m105925i("MicroMsg.ChattingComponentManager", "[install] listener:%s cost:%sms", dVar.getClass().getName(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } else if (dVar instanceof C78840l) {
            long currentTimeMillis2 = System.currentTimeMillis();
            ((C78840l) dVar).mo108835w2(aVar.f216515b);
            Log.m105925i("MicroMsg.ChattingComponentManager", "[install] outlistener:%s cost:%sms", dVar.getClass().getName(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        }
    }

    /* renamed from: u */
    public boolean mo91580u() {
        return C72996z1.m85804J4(mo91577r());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91581v() {
        /*
            r7 = this;
            int r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.ScrollControlListView.f212502i
            com.tencent.mm.ui.chatting.v3 r0 = r7.f193287k
            com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r0
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r0.f215304v
            r1 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x005d
        L_0x000c:
            int r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85520a(r0)
            r3 = 1
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0023
            boolean r4 = r0 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0
            if (r4 == 0) goto L_0x0032
            r4 = r0
            com.tencent.mm.pluginsdk.ui.tools.q0 r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0) r4
            r4.setHasControlMoveDown(r1)
            goto L_0x0032
        L_0x0023:
            boolean r4 = r0 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0
            if (r4 == 0) goto L_0x002f
            r4 = r0
            com.tencent.mm.pluginsdk.ui.tools.q0 r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0) r4
            boolean r4 = r4.getHasControlMoveDown()
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 != 0) goto L_0x0034
        L_0x0032:
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r1] = r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r3] = r2
            r2 = 2
            boolean r3 = r0 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0
            if (r3 == 0) goto L_0x004f
            com.tencent.mm.pluginsdk.ui.tools.q0 r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0) r0
            boolean r1 = r0.getHasControlMoveDown()
        L_0x004f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5[r2] = r0
            java.lang.String r0 = "ScrollControlListView"
            java.lang.String r1 = "isChatListAtBottom res:%s, isChatListAtBottomCertain:%s hasControlMoveDown:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r5)
            r1 = r4
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.C67391b.mo91581v():boolean");
    }

    /* renamed from: w */
    public boolean mo91582w() {
        String r = mo91577r();
        return C72996z1.m85820U5(r) || C72996z1.m85847r5(r);
    }

    /* renamed from: x */
    public boolean mo91583x() {
        this.f193282f.mo91587b("isGroupChat");
        if (!C72996z1.m85820U5(mo91577r()) && !C72996z1.m85847r5(mo91577r())) {
            return ((C79348e) this.f193278b.mo102812a(C79348e.class)).mo70075s4();
        }
    }

    /* renamed from: y */
    public boolean mo91584y() {
        if (!mo91574o().mo62916m3() && !C72996z1.m85855z5(mo91577r()) && !C72996z1.m85798E5(mo91577r())) {
            return true;
        }
        return ((C79348e) this.f193278b.mo102812a(C79348e.class)).mo70071q1();
    }

    /* renamed from: z */
    public boolean mo91585z() {
        String r = mo91577r();
        return C72996z1.m85811N4(r) || C72996z1.m85848s5(r) || C72996z1.m85798E5(r) || C72996z1.m85837h5(r);
    }
}

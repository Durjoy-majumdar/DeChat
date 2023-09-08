package qj1;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import d60.C58124b;
import fy3.C32224a;
import gj1.C32462a;
import gj1.C59466b;
import gj1.C59468c;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C51463ty0;

/* renamed from: qj1.t6 */
public class C62990t6 extends C62660c {

    /* renamed from: A */
    public int f178725A;

    /* renamed from: B */
    public long f178726B;

    /* renamed from: p */
    public final ViewGroup f178727p;

    /* renamed from: q */
    public final C58124b f178728q;

    /* renamed from: r */
    public final String f178729r = "MicroMsg.FinderLiveGameDynamicFrameSetPlugin";

    /* renamed from: s */
    public ArrayList<C59466b> f178730s = new ArrayList<>();

    /* renamed from: t */
    public ArrayList<C59466b> f178731t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<C62972s6> f178732u = new ArrayList<>();

    /* renamed from: v */
    public HashMap<String, Integer> f178733v = new HashMap<>();

    /* renamed from: w */
    public HashMap<String, C62972s6> f178734w = new HashMap<>();

    /* renamed from: x */
    public C59468c f178735x;

    /* renamed from: y */
    public String f178736y;

    /* renamed from: z */
    public long f178737z;

    /* renamed from: qj1.t6$a */
    public static final class C62991a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62990t6 f178738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62991a(C62990t6 t6Var) {
            super(0);
            this.f178738d = t6Var;
        }

        public Object invoke() {
            this.f178738d.mo87928Z0();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62990t6(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178727p = viewGroup;
        this.f178728q = bVar;
        mo87930b1();
    }

    /* renamed from: Z0 */
    public final void mo87928Z0() {
        C59466b bVar;
        Class cls = C54991o.class;
        C51463ty0 ty02 = ((C54991o) mo87696x0(cls)).f154179A1;
        if (ty02 == null) {
            super.mo10792g(8);
            Log.m105920e(this.f178729r, "liveGameData is null");
        } else if (!ty02.f142472g) {
            Log.m105920e(this.f178729r, "liveGameData updated is false");
        } else {
            int i = ty02.f142471f;
            if (i == 0) {
                Log.m105920e(this.f178729r, "game_frameset_visibility is 0");
                super.mo10792g(8);
                return;
            }
            Log.m105925i(this.f178729r, "liveGameData game_frameset_visibility:%d, origin game_frameset_visibility:%d", Integer.valueOf(i), Integer.valueOf(i));
            if (this.f178730s.isEmpty() || this.f178730s.size() == 0) {
                Log.m105921e(this.f178729r, "filteredFrameSetList is empty， parentId:%s", mo87929a1());
                super.mo10792g(8);
                if (this.f178725A < 5) {
                    mo87930b1();
                    return;
                }
                return;
            }
            this.f178725A = 0;
            C59468c cVar = this.f178735x;
            if (cVar == null) {
                super.mo10792g(8);
                Log.m105920e(this.f178729r, "surfaceMgr is null");
                return;
            }
            if ((cVar != null ? cVar.f169940c : null) == null) {
                String str = ((C54991o) mo87696x0(cls)).f154345o;
                C59468c cVar2 = this.f178735x;
                if (cVar2 != null) {
                    Context context = this.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    cVar2.mo84569a(context, str, ((C55001u) mo87696x0(C55001u.class)).f154416j);
                }
            }
            C59468c cVar3 = this.f178735x;
            if ((cVar3 != null ? cVar3.f169940c : null) == null) {
                super.mo10792g(8);
                Log.m105920e(this.f178729r, "getFrameSetRoot is null");
                return;
            }
            ArrayList<C59466b> arrayList = this.f178730s;
            int i2 = ty02.f142471f;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<C59466b> it = arrayList.iterator();
            while (it.hasNext()) {
                C59466b next = it.next();
                if ((next.f169916f & i2) == 0) {
                    arrayList2.add(next);
                    Log.m105925i(this.f178729r, "frameset id:%s is invisible, remove it", next.f169911a);
                } else {
                    String str2 = next.f169911a;
                    C87412m.m108591d(str2);
                    arrayList3.add(str2);
                }
            }
            arrayList.removeAll(arrayList2);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C59466b bVar2 = (C59466b) it4.next();
                C62972s6 s6Var = (C62972s6) C24564k0.m30739c(this.f178734w).remove(bVar2.f169911a);
                if (s6Var != null) {
                    s6Var.mo3211w0();
                }
                C24564k0.m30737a(this.f178732u).remove(s6Var);
                C24564k0.m30739c(this.f178733v).remove(bVar2.f169911a);
                Log.m105925i(this.f178729r, "remove frame plugin id:%s from invisible removeList", bVar2.f169911a);
            }
            arrayList2.clear();
            ArrayList arrayList4 = new ArrayList();
            Iterator<C59466b> it5 = this.f178731t.iterator();
            while (it5.hasNext()) {
                C59466b next2 = it5.next();
                if (C110818d0.m150903D(arrayList3, next2.f169911a)) {
                    String str3 = next2.f169911a;
                    C87412m.m108591d(str3);
                    arrayList4.add(str3);
                } else {
                    arrayList2.add(next2);
                }
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                C59466b bVar3 = (C59466b) it6.next();
                C62972s6 s6Var2 = (C62972s6) C24564k0.m30739c(this.f178734w).remove(bVar3.f169911a);
                if (s6Var2 != null) {
                    s6Var2.mo3211w0();
                }
                C24564k0.m30737a(this.f178732u).remove(s6Var2);
                C24564k0.m30739c(this.f178733v).remove(bVar3.f169911a);
                this.f178731t.remove(bVar3);
                this.f178730s.remove(bVar3);
                Log.m105925i(this.f178729r, "remove frame plugin id:%s from not contains currentFrameSetParamList", bVar3.f169911a);
            }
            this.f178731t.clear();
            this.f178731t.addAll(arrayList);
            if (arrayList.size() > 0) {
                Iterator<C59466b> it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    C59466b next3 = it7.next();
                    C87412m.m108594g(next3, "frameSetParam");
                    Context context2 = this.f178727p.getContext();
                    C87412m.m108593f(context2, "entranceRoot.context");
                    MagicSclViewContainer magicSclViewContainer = new MagicSclViewContainer(context2, (AttributeSet) null, 0, 6, (C8480h) null);
                    String str4 = next3.f169911a;
                    C87412m.m108591d(str4);
                    magicSclViewContainer.f157377h = str4;
                    int generateViewId = View.generateViewId();
                    magicSclViewContainer.setId(generateViewId);
                    HashMap<String, Integer> hashMap = this.f178733v;
                    String str5 = next3.f169911a;
                    C87412m.m108591d(str5);
                    hashMap.put(str5, Integer.valueOf(generateViewId));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(next3.f169921k, next3.f169922l);
                    magicSclViewContainer.setLayoutParams(layoutParams);
                    this.f178727p.addView(magicSclViewContainer);
                    mo87932d1(layoutParams, next3);
                    magicSclViewContainer.setLayoutParams(layoutParams);
                    C59468c cVar4 = this.f178735x;
                    C87667c<?, ?>.a aVar = cVar4 != null ? cVar4.f169940c : null;
                    C87412m.m108591d(aVar);
                    magicSclViewContainer.mo76544a(aVar);
                    magicSclViewContainer.bringToFront();
                    C62972s6 s6Var3 = new C62972s6(magicSclViewContainer, this.f178728q);
                    s6Var3.f178681s = next3;
                    HashMap<String, C62972s6> hashMap2 = this.f178734w;
                    String str6 = next3.f169911a;
                    C87412m.m108591d(str6);
                    hashMap2.put(str6, s6Var3);
                    this.f178732u.add(s6Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    String str7 = (String) it8.next();
                    C62972s6 s6Var4 = this.f178734w.get(str7);
                    if (s6Var4 != null) {
                        ViewGroup.LayoutParams layoutParams2 = s6Var4.f178678p.getLayoutParams();
                        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        Iterator<C59466b> it9 = this.f178731t.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                bVar = null;
                                break;
                            }
                            bVar = it9.next();
                            if (str7.equals(bVar.f169911a)) {
                                break;
                            }
                        }
                        if (bVar != null) {
                            mo87932d1(layoutParams3, bVar);
                        }
                    }
                }
            }
            Log.m105925i(this.f178729r, "framePluginList size :%d", Integer.valueOf(arrayList.size()));
            Iterator<C62972s6> it10 = this.f178732u.iterator();
            while (it10.hasNext()) {
                C62972s6 next4 = it10.next();
                Log.m105925i(this.f178729r, "plugin hasCode:%d", Integer.valueOf(next4.hashCode()));
                next4.mo87904Z0();
            }
            if (this.f178731t.size() > 0) {
                super.mo10792g(0);
                mo87931c1(ty02);
                return;
            }
            Log.m105920e(this.f178729r, "check currentFrameSetParamList empty");
            super.mo10792g(8);
        }
    }

    /* renamed from: a1 */
    public String mo87929a1() {
        throw null;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87930b1() {
        ArrayList<C59466b> arrayList;
        ArrayList<C59466b> arrayList2;
        this.f178725A++;
        C32462a aVar = C32462a.f86251a;
        Log.m105924i("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C32462a.f86253c) {
            if (!(!C32462a.f86253c.isEmpty()) || currentTimeMillis - C32462a.f86252b > ((long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)) {
                C13598b0 b0Var = C13598b0.f38549a;
                String a = aVar.mo58638a();
                if (TextUtils.isEmpty(a)) {
                    Log.m105920e("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData exptGameFrameSetData is empty!");
                    synchronized (C32462a.f86253c) {
                        C32462a.f86253c.clear();
                        arrayList2 = C32462a.f86253c;
                    }
                    arrayList = arrayList2;
                } else {
                    synchronized (C32462a.f86253c) {
                        ArrayList<C59466b> a2 = C59466b.C59467a.f169937a.mo84568a(a);
                        Log.m105925i("Finder.FinderLiveFrameSetDataLoader", "parseRetList size :%d", Integer.valueOf(a2.size()));
                        C32462a.f86253c.clear();
                        C32462a.f86253c.addAll(a2);
                        if (!C32462a.f86253c.isEmpty()) {
                            C32462a.f86252b = currentTimeMillis;
                        }
                    }
                    arrayList = C32462a.f86253c;
                }
            } else {
                Log.m105920e("Finder.FinderLiveFrameSetDataLoader", "fetch from frameSetData cache");
                arrayList = C32462a.f86253c;
            }
        }
        if (arrayList.isEmpty() || arrayList.size() == 0) {
            Log.m105920e(this.f178729r, "loadFrameSetData frameSetParamList is empty");
            super.mo10792g(8);
            return;
        }
        String a1 = mo87929a1();
        C87412m.m108594g(a1, "parentId");
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(a1)) {
            for (C59466b bVar : arrayList) {
                if (a1.equals(bVar.f169912b)) {
                    arrayList3.add(bVar);
                }
            }
        }
        if (arrayList3.isEmpty() || arrayList3.size() == 0) {
            Log.m105921e(this.f178729r, "loadFrameSetData filteredFrameSetList is empty， parentId:%s", mo87929a1());
            super.mo10792g(8);
            return;
        }
        this.f178730s.clear();
        this.f178730s.addAll(arrayList3);
    }

    /* renamed from: c1 */
    public final void mo87931c1(C51463ty0 ty02) {
        C87667c<?, ?>.a aVar;
        C87667c<?, ?>.a aVar2;
        C87412m.m108594g(ty02, "gameData");
        C89349b bVar = ty02.f142470e;
        String g = bVar != null ? bVar.mo123704g("UTF-8") : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (!C87412m.m108589b(this.f178736y, g) && g != null) {
            this.f178736y = g;
            Log.m105924i(this.f178729r, "notifyGameData");
            C59468c cVar = this.f178735x;
            if (!(cVar == null || (aVar2 = cVar.f169940c) == null)) {
                aVar2.mo122099a(g, (String) null);
            }
            this.f178726B = currentTimeMillis;
        } else if (g != null && currentTimeMillis - this.f178726B > 10000) {
            Log.m105924i(this.f178729r, "notifyGameData");
            C59468c cVar2 = this.f178735x;
            if (!(cVar2 == null || (aVar = cVar2.f169940c) == null)) {
                aVar.mo122099a(g, (String) null);
            }
            this.f178726B = currentTimeMillis;
        } else if (g != null) {
            Log.m105926v(this.f178729r, "skip same game data");
        } else {
            Log.m105926v(this.f178729r, "game data is invalid");
        }
    }

    /* renamed from: d1 */
    public final void mo87932d1(RelativeLayout.LayoutParams layoutParams, C59466b bVar) {
        C87412m.m108594g(layoutParams, "layoutParam");
        C87412m.m108594g(bVar, "frameSetParam");
        layoutParams.width = bVar.f169921k;
        layoutParams.height = bVar.f169922l;
        layoutParams.leftMargin = bVar.f169918h;
        layoutParams.rightMargin = bVar.f169919i;
        layoutParams.topMargin = bVar.f169917g;
        layoutParams.bottomMargin = bVar.f169920j;
        int[] rules = layoutParams.getRules();
        if (rules != null) {
            if (!(rules.length == 0)) {
                int length = rules.length;
                for (int i = 0; i < length; i++) {
                    layoutParams.removeRule(i);
                }
            }
        }
        if (bVar.f169923m) {
            layoutParams.addRule(10);
        }
        if (bVar.f169924n) {
            layoutParams.addRule(9);
        }
        if (bVar.f169925o) {
            layoutParams.addRule(11);
        }
        if (bVar.f169926p) {
            layoutParams.addRule(12);
        }
        if (bVar.f169927q) {
            layoutParams.addRule(20);
        }
        if (bVar.f169928r) {
            layoutParams.addRule(21);
        }
        if (bVar.f169929s) {
            layoutParams.addRule(13);
        }
        if (bVar.f169931u) {
            layoutParams.addRule(15);
        }
        if (bVar.f169930t) {
            layoutParams.addRule(14);
        }
        if (!TextUtils.isEmpty(bVar.f169932v) && this.f178733v.containsKey(bVar.f169932v)) {
            Integer num = this.f178733v.get(bVar.f169932v);
            C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(6, num.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169933w) && this.f178733v.containsKey(bVar.f169933w)) {
            Integer num2 = this.f178733v.get(bVar.f169933w);
            C87412m.m108592e(num2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(8, num2.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169934x) && this.f178733v.containsKey(bVar.f169934x)) {
            Integer num3 = this.f178733v.get(bVar.f169934x);
            C87412m.m108592e(num3, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(5, num3.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169935y) && this.f178733v.containsKey(bVar.f169935y)) {
            Integer num4 = this.f178733v.get(bVar.f169935y);
            C87412m.m108592e(num4, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(7, num4.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169936z) && this.f178733v.containsKey(bVar.f169936z)) {
            Integer num5 = this.f178733v.get(bVar.f169936z);
            C87412m.m108592e(num5, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(3, num5.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169906A) && this.f178733v.containsKey(bVar.f169906A)) {
            Integer num6 = this.f178733v.get(bVar.f169906A);
            C87412m.m108592e(num6, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(2, num6.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169907B) && this.f178733v.containsKey(bVar.f169907B)) {
            Integer num7 = this.f178733v.get(bVar.f169907B);
            C87412m.m108592e(num7, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(0, num7.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169908C) && this.f178733v.containsKey(bVar.f169908C)) {
            Integer num8 = this.f178733v.get(bVar.f169908C);
            C87412m.m108592e(num8, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(1, num8.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169909D) && this.f178733v.containsKey(bVar.f169909D)) {
            Integer num9 = this.f178733v.get(bVar.f169909D);
            C87412m.m108592e(num9, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(16, num9.intValue());
        }
        if (!TextUtils.isEmpty(bVar.f169910E) && this.f178733v.containsKey(bVar.f169910E)) {
            Integer num10 = this.f178733v.get(bVar.f169910E);
            C87412m.m108592e(num10, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.addRule(17, num10.intValue());
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C87667c<?, ?>.a aVar;
        Log.m105924i(this.f178729r, "pause");
        C59468c cVar = this.f178735x;
        if (cVar != null && (aVar = cVar.f169940c) != null) {
            aVar.mo122102e();
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        C87667c<?, ?>.a aVar;
        C59468c cVar = this.f178735x;
        if (cVar != null && (aVar = cVar.f169940c) != null) {
            aVar.mo122105h();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (bVar.ordinal() == 118) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f178737z > 3000 && this.f178732u.size() == 0) {
                this.f178737z = currentTimeMillis;
                C61926c.m72666K(1000, new C62991a(this));
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i(this.f178729r, "unMount");
        super.mo3211w0();
        this.f178730s.clear();
        this.f178731t.clear();
        this.f178733v.clear();
        for (C62972s6 s6Var : this.f178732u) {
        }
        this.f178732u.clear();
        this.f178734w.clear();
        C59468c cVar = this.f178735x;
        if (cVar != null) {
            cVar.mo84570b();
        }
    }
}

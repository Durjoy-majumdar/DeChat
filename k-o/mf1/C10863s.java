package mf1;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import bl3.C39818r;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import pf1.C11920q;
import rx3.C13598b0;
import te3.C49730ho;
import te3.C52070y50;
import te3.uc4;

/* renamed from: mf1.s */
public class C10863s extends C10854p {

    /* renamed from: o */
    public static final Object f32438o = new Object();

    /* renamed from: C */
    public final C49730ho mo11079C(C11920q qVar) {
        T t;
        C52070y50 y502;
        boolean z;
        LinkedList<uc4> linkedList = qVar.f34827a.style;
        C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((uc4) t).f142762h == 7) {
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
        uc4 uc4 = (uc4) t;
        if (uc4 == null || (y502 = uc4.f142771t) == null) {
            return null;
        }
        return y502.f145121e;
    }

    /* renamed from: D */
    public final C49730ho mo11080D(C11920q qVar) {
        T t;
        C52070y50 y502;
        boolean z;
        LinkedList<uc4> linkedList = qVar.f34827a.style;
        C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((uc4) t).f142762h == 7) {
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
        uc4 uc4 = (uc4) t;
        if (uc4 == null || (y502 = uc4.f142771t) == null) {
            return null;
        }
        return y502.f145120d;
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Object obj = oVar.f173503E;
        C0740i2 i2Var = obj instanceof C0740i2 ? (C0740i2) obj : null;
        if (i2Var != null) {
            long itemId = i2Var.getItemId();
            if (qVar.f34827a.business_type == 2) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context).mo62449e(FinderDescPanelUIC.class);
                if (finderDescPanelUIC != null) {
                    finderDescPanelUIC.mo5123k3(itemId, 128);
                }
            }
        }
        C10817f1 f1Var = qVar.f34823A;
        if ((f1Var != null ? f1Var.f32318b : 1) == 2) {
            mo11074x(baseFinderFeed, oVar, view, qVar, str, mo11079C(qVar), false);
        } else {
            mo11075y(baseFinderFeed, oVar, view, qVar, mo11080D(qVar), str);
        }
    }

    /* renamed from: c */
    public void mo11081c(C60905o oVar, View view, C11920q qVar, boolean z, C32224a<C13598b0> aVar) {
        BaseFinderFeed baseFinderFeed;
        String str;
        MMHandler mMHandler;
        T t;
        boolean z2;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11081c(oVar, view, qVar, z, aVar);
        C10817f1 f1Var = qVar.f34823A;
        if ((f1Var != null ? f1Var.f32318b : 0) != 2 && (baseFinderFeed = qVar.f34830d) != null && (str = qVar.f34833g) != null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                mMHandler = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 7) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            uc4 uc4 = (uc4) t;
            C52070y50 y502 = uc4 != null ? uc4.f142771t : null;
            if (y502 != null) {
                long j = ((long) y502.f145122f) * 1000;
                if (j > 0) {
                    C39818r rVar = C39818r.f106831a;
                    Context context = oVar.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo62449e(C10786a1.class);
                    if (a1Var != null) {
                        mMHandler = a1Var.f32391e;
                    }
                    MMHandler mMHandler2 = mMHandler;
                    long uptimeMillis = j + SystemClock.uptimeMillis();
                    if (mMHandler2 != null) {
                        mMHandler2.removeCallbacksAndMessages(f32438o);
                    }
                    if (mMHandler2 != null) {
                        mMHandler2.postAtTime(new C10861r(this, baseFinderFeed, oVar, view, qVar, str), f32438o, uptimeMillis);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        C49730ho D = mo11080D(qVar);
        String str = null;
        if (!Util.isNullOrNil(D != null ? D.f134754e : null)) {
            C49730ho C = mo11079C(qVar);
            if (C != null) {
                str = C.f134754e;
            }
            if (!Util.isNullOrNil(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo11082q(C60905o oVar, View view, C11920q qVar) {
        BaseFinderFeed baseFinderFeed;
        String str;
        MMHandler mMHandler;
        T t;
        boolean z;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11082q(oVar, view, qVar);
        C10817f1 f1Var = qVar.f34823A;
        if ((f1Var != null ? f1Var.f32318b : 0) != 2 && (baseFinderFeed = qVar.f34830d) != null && (str = qVar.f34833g) != null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                mMHandler = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 7) {
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
            uc4 uc4 = (uc4) t;
            C52070y50 y502 = uc4 != null ? uc4.f142771t : null;
            if (y502 != null && y502.f145123g > 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo62449e(C10786a1.class);
                if (a1Var != null) {
                    mMHandler = a1Var.f32391e;
                }
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages(f32438o);
                }
                mo11074x(baseFinderFeed, oVar, view, qVar, str, mo11079C(qVar), true);
            }
        }
    }
}

package il1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import androidx.lifecycle.C54219z;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76912y0;
import o40.C61926c;
import qg1.C47826f;
import rx3.C13598b0;
import te3.C48899bs1;
import te3.C50415mk1;
import te3.C50868ps1;
import te3.C51560uk2;
import te3.C51613uy0;

/* renamed from: il1.d0 */
public final class C46252d0 implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f124680a;

    /* renamed from: b */
    public final /* synthetic */ C51560uk2 f124681b;

    /* renamed from: c */
    public final /* synthetic */ C51613uy0 f124682c;

    /* renamed from: d */
    public final /* synthetic */ int f124683d;

    /* renamed from: e */
    public final /* synthetic */ Integer f124684e;

    /* renamed from: il1.d0$a */
    public static final class C46253a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f124685d;

        /* renamed from: e */
        public final /* synthetic */ C51560uk2 f124686e;

        /* renamed from: f */
        public final /* synthetic */ C51613uy0 f124687f;

        /* renamed from: g */
        public final /* synthetic */ int f124688g;

        /* renamed from: h */
        public final /* synthetic */ Integer f124689h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46253a(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, C51560uk2 uk22, C51613uy0 uy02, int i, Integer num) {
            super(0);
            this.f124685d = finderLiveAnchorGameTogetherWidget;
            this.f124686e = uk22;
            this.f124687f = uy02;
            this.f124688g = i;
            this.f124689h = num;
        }

        public Object invoke() {
            C48899bs1 bs12;
            LinkedList<C51560uk2> linkedList;
            boolean z;
            Class cls = C54991o.class;
            Class cls2 = C54108o.class;
            C54219z<String> zVar = ((C54991o) this.f124685d.f160038c.mo87696x0(cls)).f154302c4;
            String str = this.f124686e.f142913d;
            if (str == null) {
                str = "";
            }
            zVar.postValue(str);
            C51613uy0 uy02 = this.f124687f;
            if (uy02 != null) {
                uy02.f143181e = this.f124686e.f142914e;
            }
            C51560uk2 uk22 = this.f124686e;
            int i = uk22.f142914e;
            T t = null;
            if (i == 7) {
                C50868ps1 ps12 = uk22.f142915f;
                if (ps12 != null) {
                    ps12.f139936e = this.f124688g;
                }
                C50868ps1 ps13 = this.f124686e.f142915f;
                C51613uy0 uy03 = ((C54991o) this.f124685d.f160038c.mo87696x0(cls)).f154363s1;
                if (!(uy03 == null || (bs12 = uy03.f143180d) == null || (linkedList = bs12.f131284d) == null)) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((C51560uk2) next).f142914e == 7) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    t = (C51560uk2) t;
                }
                if (t != null) {
                    t.f142915f = ps13;
                }
            } else if (i == 1) {
                C76912y0.m92769h(this.f124685d.f160036a.getContext(), this.f124685d.f160036a.getContext().getResources().getString(C0966R.string.f360513db3), C0966R.raw.icons_filled_done);
                C58124b.C7172a.m7372a(this.f124685d.f160037b, C58124b.C58125b.FINDER_LIVE_UPDATE_GAME_TEAM_CONDITION_MSG, (Bundle) null, 2, (Object) null);
            }
            if (this.f124686e.f142914e == 7) {
                Integer num = this.f124689h;
                if (num != null && num.intValue() == 7) {
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C54108o.Sx0((C54108o) c, C54067f0.C39609d0.MODIFY, this.f124688g, (C54108o.C27908a) null, 4, (Object) null);
                } else {
                    C7335d c2 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C54108o.Sx0((C54108o) c2, C54067f0.C39609d0.OPEN, this.f124688g, (C54108o.C27908a) null, 4, (Object) null);
                }
            } else {
                Integer num2 = this.f124689h;
                if (num2 != null && num2.intValue() == 7) {
                    C7335d c3 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                    C54108o.Sx0((C54108o) c3, C54067f0.C39609d0.CLOSE, 0, (C54108o.C27908a) null, 6, (Object) null);
                }
            }
            Log.m105924i(this.f124685d.f160039d, "onSuccess");
            return C13598b0.f38549a;
        }
    }

    public C46252d0(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, C51560uk2 uk22, C51613uy0 uy02, int i, Integer num) {
        this.f124680a = finderLiveAnchorGameTogetherWidget;
        this.f124681b = uk22;
        this.f124682c = uy02;
        this.f124683d = i;
        this.f124684e = num;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        C61926c.m72668M(new C46253a(this.f124680a, this.f124681b, this.f124682c, this.f124683d, this.f124684e));
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54108o.Sx0((C54108o) c, C54067f0.C39609d0.FAIL, 0, new C54108o.C27908a(i, i2, str), 2, (Object) null);
        String str2 = this.f124680a.f160039d;
        Log.m105924i(str2, "onFail " + i + ' ' + i2 + ' ' + str);
    }
}

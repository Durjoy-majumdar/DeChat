package wm1;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C51942x91;
import vc1.C37715b;

/* renamed from: wm1.h */
public final class C15546h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15530g f42133d;

    /* renamed from: e */
    public final /* synthetic */ String f42134e;

    /* renamed from: f */
    public final /* synthetic */ boolean f42135f;

    /* renamed from: g */
    public final /* synthetic */ LinkedList<C51942x91> f42136g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15546h(C15530g gVar, String str, boolean z, LinkedList<C51942x91> linkedList) {
        super(0);
        this.f42133d = gVar;
        this.f42134e = str;
        this.f42135f = z;
        this.f42136g = linkedList;
    }

    public Object invoke() {
        C15530g gVar = this.f42133d;
        String str = this.f42134e;
        gVar.getClass();
        Log.m105924i("NearbyLiveSquareTabLayoutUIC", "setPageTitle title:" + str);
        if (!TextUtils.isEmpty(str)) {
            ((TextView) gVar.getActivity().findViewById(C0966R.C0970id.e0i)).setText(str);
        }
        C15530g gVar2 = this.f42133d;
        gVar2.f42094d = this.f42135f;
        ((LinkedList) gVar2.f42095e).addAll(this.f42136g);
        C15530g gVar3 = this.f42133d;
        gVar3.mo14303c3(gVar3.f42095e);
        C15530g gVar4 = this.f42133d;
        gVar4.getClass();
        if (!C37715b.f99914a.mo61298a()) {
            Log.m105928w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for no hit finder live.");
        } else {
            C39818r rVar = C39818r.f106831a;
            Fragment fragment = gVar4.getFragment();
            C87412m.m108591d(fragment);
            int i = ((C13442s8) rVar.mo62445d(fragment).mo75002a(C13442s8.class)).mo12861q3().f134675i;
            if (i == 9500001 || i == 9500002 || i == 9500004 || i == 9500003) {
                Log.m105928w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for in operation game page.");
            } else {
                C61926c.m72695t(C2479n0.f12944A, gVar4.getActivity(), new C15547i(gVar4));
            }
        }
        return C13598b0.f38549a;
    }
}

package cn1;

import an1.C0091d;
import cm1.C0740i2;
import cn1.C0821e;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import pm1.C62381d;
import sx3.C64197v;
import te3.C48682a91;
import te3.C52231z81;
import xm1.C15829e0;
import zm1.C16298b;

/* renamed from: cn1.j */
public final class C0846j extends C15829e0.C15830a.C15831a {

    /* renamed from: a */
    public final /* synthetic */ C0091d f1995a;

    /* renamed from: b */
    public final /* synthetic */ C0821e.C0823b f1996b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<WxRecyclerView> f1997c;

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C16298b> f1998d;

    public C0846j(C0091d dVar, C0821e.C0823b bVar, C8479f0<WxRecyclerView> f0Var, C8479f0<C16298b> f0Var2) {
        this.f1995a = dVar;
        this.f1996b = bVar;
        this.f1997c = f0Var;
        this.f1998d = f0Var2;
    }

    /* renamed from: a */
    public void mo760a(long j) {
        int i = 0;
        int i2 = -1;
        for (T next : this.f1995a.f529e) {
            int i3 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getFeedObject().f164794id == j) {
                    i2 = i;
                }
                i = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (i2 != -1) {
            this.f1995a.f529e.remove(i2);
            ((C16298b) this.f1998d.f27484d).notifyItemRemoved(i2);
        }
    }

    /* renamed from: b */
    public void mo761b(int i, long j) {
        LinkedList<C52231z81> linkedList;
        C48682a91 a912 = this.f1995a.f528d;
        if (a912.f130377d == i && (linkedList = a912.f130381h) != null) {
            C8479f0<WxRecyclerView> f0Var = this.f1997c;
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    FinderObject finderObject = ((C52231z81) next).f145756f;
                    if (finderObject != null && finderObject.f164794id == j) {
                        WxRecyclerView wxRecyclerView = (WxRecyclerView) f0Var.f27484d;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i2));
                        WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                        C117292a.m165358d(wxRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo762c(C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "whichContainer");
        if (!(i2Var instanceof C0091d) || ((C0091d) i2Var).f528d.f130377d != this.f1995a.f528d.f130377d) {
            Log.m105924i("BigBannerListConvert", "caller.checkPlayer isn't me! turn off check");
            C62381d dVar = this.f1996b.f1936f;
            if (dVar != null) {
                dVar.mo87447z(false);
                return;
            }
            return;
        }
        Log.m105924i("BigBannerListConvert", "caller.checkPlayer is me! turn on check");
        C62381d dVar2 = this.f1996b.f1936f;
        if (dVar2 != null) {
            dVar2.mo87447z(true);
        }
    }

    /* renamed from: e */
    public void mo764e() {
        C62381d dVar = this.f1996b.f1936f;
        if (dVar != null) {
            dVar.mo87432k();
        }
    }
}

package com.tencent.p014mm.plugin.finder.shopping;

import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.plugin.appbrand.config.HeightInfo;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl1.C59161f;
import gl1.C59559k;
import gy3.C8480h;
import gy3.C87412m;
import hl1.C59988k;
import ht1.C33062n5;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import vk1.C65760a;
import vk1.C65761b;
import vk1.C65762c;
import wg1.C65976a1;
import wg1.C66106x0;
import zk1.C66881u0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/MiniProgramHalfScreenStatusChangeListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Lht1/n5;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.MiniProgramHalfScreenStatusChangeListener */
public final class MiniProgramHalfScreenStatusChangeListener extends WeAppHalfScreenStatusChangeListener implements C33062n5 {

    /* renamed from: f */
    public WeakReference<C56032b> f160917f;

    /* renamed from: g */
    public int f160918g;

    public MiniProgramHalfScreenStatusChangeListener(C56032b bVar) {
        super(false, 1, (C8480h) null);
        this.f160917f = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo58971a() {
        Log.m105924i("MiniProgramHalfScreenStatusChangeListener", "exitMiniPro style:" + this.f160918g + '!');
        if (this.f160918g == 1) {
            mo78777g();
        }
    }

    /* renamed from: b */
    public void mo77350b() {
        C65761b bVar;
        Fragment uicFragment;
        this.f160918g = 1;
        C56032b bVar2 = this.f160917f.get();
        Fragment fragment = null;
        if (bVar2 instanceof C65762c) {
            C65762c cVar = (C65762c) bVar2;
            Fragment uicFragment2 = cVar.getUicFragment();
            if (uicFragment2 != null) {
                if (uicFragment2.isAdded()) {
                    fragment = uicFragment2;
                }
                if (fragment != null) {
                    ((C66881u0) C39818r.f106831a.mo62445d(fragment).mo75002a(C66881u0.class)).mo90884i3();
                    C59988k startUIC = cVar.getStartUIC();
                    if (startUIC != null) {
                        startUIC.mo84885T();
                    }
                }
            }
        } else if (bVar2 instanceof C65760a) {
            C65760a aVar = (C65760a) bVar2;
            Fragment uicFragment3 = aVar.getUicFragment();
            if (uicFragment3 != null) {
                if (uicFragment3.isAdded()) {
                    fragment = uicFragment3;
                }
                if (fragment != null) {
                    ((C65976a1) C39818r.f106831a.mo62445d(fragment).mo75002a(C65976a1.class)).mo90013f3();
                    C59161f startUIC2 = aVar.getStartUIC();
                    if (startUIC2 != null) {
                        startUIC2.mo84379O();
                    }
                }
            }
        } else if ((bVar2 instanceof C65761b) && (uicFragment = bVar.getUicFragment()) != null) {
            if (uicFragment.isAdded()) {
                fragment = uicFragment;
            }
            if (fragment != null) {
                ((C66106x0) C39818r.f106831a.mo62445d(fragment).mo75002a(C66106x0.class)).mo90013f3();
                C59559k startUIC3 = (bVar = (C65761b) bVar2).getStartUIC();
                if (startUIC3 != null) {
                    startUIC3.mo84612r();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onEnterFullScreen baseLivePluginLayout:");
        sb.append(bVar2 != null ? bVar2.hashCode() : 0);
        Log.m105924i("MiniProgramHalfScreenStatusChangeListener", sb.toString());
    }

    /* renamed from: c */
    public void mo77351c() {
        this.f160918g = 0;
        Log.m105924i("MiniProgramHalfScreenStatusChangeListener", "onEnterHalfScreen!");
        mo78777g();
    }

    /* renamed from: f */
    public void mo77354f(HeightInfo heightInfo) {
        C87412m.m108594g(heightInfo, "info");
        Log.m105924i("MiniProgramHalfScreenStatusChangeListener", "onHeightChanged info:" + heightInfo + '!');
    }

    /* renamed from: g */
    public final void mo78777g() {
        Fragment uicFragment;
        C56032b bVar = this.f160917f.get();
        StringBuilder sb = new StringBuilder();
        sb.append("exitMiniWindow baseLivePluginLayout:");
        sb.append(bVar != null ? bVar.hashCode() : 0);
        Log.m105924i("MiniProgramHalfScreenStatusChangeListener", sb.toString());
        Fragment fragment = null;
        if (bVar instanceof C65762c) {
            C65762c cVar = (C65762c) bVar;
            Fragment uicFragment2 = cVar.getUicFragment();
            if (uicFragment2 != null) {
                if (uicFragment2.isAdded()) {
                    fragment = uicFragment2;
                }
                if (fragment != null) {
                    ((C66881u0) C39818r.f106831a.mo62445d(fragment).mo75002a(C66881u0.class)).mo90883g3();
                    FinderLiveService.f159376d.mo77635i();
                    C59988k startUIC = cVar.getStartUIC();
                    if (startUIC != null) {
                        startUIC.mo84883R();
                    }
                }
            }
        } else if (bVar instanceof C65760a) {
            C65760a aVar = (C65760a) bVar;
            Fragment uicFragment3 = aVar.getUicFragment();
            if (uicFragment3 != null) {
                if (uicFragment3.isAdded()) {
                    fragment = uicFragment3;
                }
                if (fragment != null) {
                    ((C65976a1) C39818r.f106831a.mo62445d(fragment).mo75002a(C65976a1.class)).mo90012e3();
                    C59161f startUIC2 = aVar.getStartUIC();
                    if (startUIC2 != null) {
                        startUIC2.mo84378N(true);
                    }
                }
            }
        } else if ((bVar instanceof C65761b) && (uicFragment = ((C65761b) bVar).getUicFragment()) != null) {
            if (uicFragment.isAdded()) {
                fragment = uicFragment;
            }
            if (fragment != null) {
                ((C66106x0) C39818r.f106831a.mo62445d(fragment).mo75002a(C66106x0.class)).mo90012e3();
                FinderLiveService.f159376d.mo77635i();
            }
        }
    }
}

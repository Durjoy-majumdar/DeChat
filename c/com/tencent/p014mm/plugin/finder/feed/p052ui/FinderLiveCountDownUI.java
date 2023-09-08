package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import bl3.C39818r;
import cj1.C28583q4;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9247b;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13598b0;
import sx3.C22415w0;
import xk1.C66316i1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveCountDownUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(39)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI */
public final class FinderLiveCountDownUI extends MMFinderUI {

    /* renamed from: o */
    public static final /* synthetic */ int f158983o = 0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI$a */
    public static final class C55824a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCountDownUI f158984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55824a(FinderLiveCountDownUI finderLiveCountDownUI) {
            super(1);
            this.f158984d = finderLiveCountDownUI;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                FinderLiveService.f159376d.mo77633g(new C55843m(this.f158984d));
            } else {
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                C54795n5 n5Var = FinderLiveService.f159396y;
                if (n5Var != null) {
                    C54795n5.C54796a.m61723a(n5Var, 0, C28583q4.f78452d, 1, (Object) null);
                }
                FinderLiveCountDownUI finderLiveCountDownUI = this.f158984d;
                int i = FinderLiveCountDownUI.f158983o;
                finderLiveCountDownUI.getClass();
                finderLiveService.mo77613P((C45795b) null);
                C45795b.f123697j.mo58474a((C45795b) null);
                finderLiveService.mo77612O((LiveRoomControllerStore) null);
                finderLiveService.mo77634h(false, 1);
                this.f158984d.getClass();
                FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
                FinderGamePostEvent.C55125a aVar = finderGamePostEvent.f154773d;
                aVar.f154774a = true;
                aVar.f154775b = true;
                finderGamePostEvent.publish();
                this.f158984d.finish();
            }
            return C13598b0.f38549a;
        }
    }

    public FinderLiveCountDownUI() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.getIntExtra("LANDSCAPE_TYPE", 0);
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "Finder.FinderLiveCountDownUI";
    }

    /* renamed from: N7 */
    public final int mo77428N7() {
        Intent intent = getIntent();
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("LANDSCAPE_TYPE", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        return (valueOf != null && valueOf.intValue() == 2) ? 8 : -1;
    }

    public int getForceOrientation() {
        return mo77428N7();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.afu;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C66316i1.class);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("Finder.FinderLiveCountDownUI", "onConfigurationChanged: orientation = " + configuration.orientation);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(mo77428N7());
        ((C66316i1) C39818r.f106831a.mo62444c(this).mo75002a(C66316i1.class)).f190906d = new C55824a(this);
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        mo79124M7(true);
        setTheme(C0966R.style.f8619p0);
    }

    public void onDestroy() {
        Class cls = C66316i1.class;
        super.onDestroy();
        C39818r rVar = C39818r.f106831a;
        C66316i1 i1Var = (C66316i1) rVar.mo62444c(this).mo75002a(cls);
        i1Var.f190911i.stopTimer();
        i1Var.f190910h = 3;
        C9247b bVar = i1Var.f190909g;
        if (bVar != null) {
            bVar.mo8913b();
        }
        ((C66316i1) rVar.mo62444c(this).mo75002a(cls)).f190906d = null;
    }
}

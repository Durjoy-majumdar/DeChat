package pi1;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d60.C58124b;
import gy3.C87412m;
import i50.C60251a;
import j50.C60735a;
import java.util.ArrayList;
import ni1.C61753b;
import qj1.C62660c;
import si1.C63902g;

/* renamed from: pi1.j */
public abstract class C62307j extends C63902g implements View.OnClickListener {

    /* renamed from: q */
    public boolean f177119q;

    /* renamed from: r */
    public boolean f177120r;

    /* renamed from: s */
    public int f177121s;

    /* renamed from: t */
    public ArrayList<RectF> f177122t;

    /* renamed from: u */
    public boolean f177123u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62307j(Context context, C62660c cVar, C61753b bVar, int i) {
        super(context, cVar, bVar, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    public abstract /* synthetic */ ViewGroup getGiftRootView();

    public abstract /* synthetic */ ViewGroup getLuckyMoneyRootView();

    public final ArrayList<RectF> getPotholingRectList() {
        return this.f177122t;
    }

    public final int getRightOffestSize() {
        return this.f177121s;
    }

    public abstract RoundCornerConstraintLayout getRoundCornerConstraintLayout();

    public final void setAudioMode(boolean z) {
        this.f177119q = z;
    }

    public final void setFocus(boolean z) {
        this.f177123u = z;
    }

    public final void setPotholingRectList(ArrayList<RectF> arrayList) {
        this.f177122t = arrayList;
    }

    public final void setRightOffestSize(int i) {
        this.f177121s = i;
    }

    public final void setScreenMode(boolean z) {
        this.f177120r = z;
    }

    /* renamed from: t */
    public boolean mo87387t() {
        if (C60251a.f171781k1 != null) {
            return true;
        }
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null && !aVar.mo85682Z()) {
            if (!(C54655b.f153178f1 != null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void mo87388v() {
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null) {
            oVar.f154286Z = !oVar.f154286Z;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", oVar.f154286Z);
            getBasePlugin().mo14484z0().statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
        }
    }

    /* renamed from: w */
    public abstract void mo87376w(boolean z);
}

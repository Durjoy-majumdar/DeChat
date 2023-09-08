package xk1;

import android.os.Bundle;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import d60.C58124b;
import gy3.C87412m;
import xk1.C66331m;

/* renamed from: xk1.l */
public final class C66319l extends C56061i {

    /* renamed from: n */
    public final /* synthetic */ C66331m f190914n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66319l(AppCompatActivity appCompatActivity, C66331m mVar) {
        super((MMActivity) appCompatActivity, (Fragment) null, (AttributeSet) null);
        this.f190914n = mVar;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    public C54795n5 getFinderLiveAssistant() {
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        return n5Var == null ? getFinderLiveAssistant() : n5Var;
    }

    public int getLiveRole() {
        ((C66331m.C66334c) this.f190914n.f190953s).getClass();
        return 1;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.aew;
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        ((C66331m.C66334c) this.f190914n.f190953s).statusChange(bVar, bundle);
    }
}

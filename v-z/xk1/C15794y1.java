package xk1;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: xk1.y1 */
public final class C15794y1 extends UIComponent {

    /* renamed from: d */
    public MMEditText f42556d;

    /* renamed from: e */
    public View f42557e;

    /* renamed from: f */
    public FinderLiveDescEditView f42558f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15794y1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo14496c3(int i, View view, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "liveData");
        MMEditText mMEditText = (MMEditText) view.findViewById(C0966R.C0970id.fwy);
        this.f42556d = mMEditText;
        if (mMEditText != null) {
            mMEditText.setHint(C58739j4.f168176a.mo83720p());
        }
        this.f42557e = view.findViewById(C0966R.C0970id.dvn);
        FinderLiveDescEditView finderLiveDescEditView = (FinderLiveDescEditView) view.findViewById(C0966R.C0970id.dvq);
        this.f42558f = finderLiveDescEditView;
        if (finderLiveDescEditView != null) {
            finderLiveDescEditView.setFromScene(1);
        }
        FinderLiveDescEditView finderLiveDescEditView2 = this.f42558f;
        if (finderLiveDescEditView2 != null) {
            finderLiveDescEditView2.setBackgroundColor(getContext().getResources().getColor(C0966R.color.ahf));
        }
        MMEditText mMEditText2 = this.f42556d;
        if (mMEditText2 != null) {
            mMEditText2.setShowSoftInputOnFocus(false);
        }
        MMEditText mMEditText3 = this.f42556d;
        if (mMEditText3 != null) {
            mMEditText3.setMovementMethod(new ScrollingMovementMethod());
        }
        C15792x1 x1Var = new C15792x1(this);
        MMEditText mMEditText4 = this.f42556d;
        if (mMEditText4 != null) {
            mMEditText4.setOnClickListener(new C15781u1(x1Var));
        }
    }

    public boolean onBackPressed() {
        boolean z;
        FinderLiveDescEditView finderLiveDescEditView = this.f42558f;
        if (finderLiveDescEditView == null) {
            return false;
        }
        if (finderLiveDescEditView.getVisibility() == 0) {
            finderLiveDescEditView.mo3401a();
            C32224a<C13598b0> aVar = finderLiveDescEditView.f15372h;
            if (aVar != null) {
                aVar.invoke();
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}

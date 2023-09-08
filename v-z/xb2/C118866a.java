package xb2;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yb2.C15946a;

/* renamed from: xb2.a */
public final class C118866a extends C15946a {

    /* renamed from: d */
    public final C13601g f355586d = C36568h.m40985a(new C118869c(this));

    /* renamed from: e */
    public boolean f355587e;

    /* renamed from: xb2.a$a */
    public static final class C118867a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118866a f355588d;

        /* renamed from: e */
        public final /* synthetic */ int f355589e;

        public C118867a(C118866a aVar, int i) {
            this.f355588d = aVar;
            this.f355589e = i;
        }

        public final void run() {
            ScrollView scrollView = (ScrollView) ((C36570n) this.f355588d.f355586d).getValue();
            if (scrollView != null) {
                scrollView.smoothScrollBy(0, this.f355589e);
            }
        }
    }

    /* renamed from: xb2.a$b */
    public static final class C118868b implements C74965a.C74969d {

        /* renamed from: d */
        public final /* synthetic */ C118866a f355590d;

        public C118868b(C118866a aVar) {
            this.f355590d = aVar;
        }

        /* renamed from: i0 */
        public final void mo1072i0(boolean z, int i) {
            C118866a aVar = this.f355590d;
            aVar.f355587e = z;
            if (z) {
                aVar.mo183576g3();
            }
        }
    }

    /* renamed from: xb2.a$c */
    public static final class C118869c extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ C118866a f355591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118869c(C118866a aVar) {
            super(0);
            this.f355591d = aVar;
        }

        public Object invoke() {
            return (ScrollView) this.f355591d.findViewById(C0966R.C0970id.ffu);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118866a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo183576g3() {
        ScrollView scrollView;
        int b = C76577a.m92151b(getActivity(), 64);
        View currentFocus = getActivity().getWindow().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            int i = iArr[1] - b;
            if (i > 0 && (scrollView = (ScrollView) ((C36570n) this.f355586d).getValue()) != null) {
                scrollView.post(new C118867a(this, i));
            }
        }
    }

    /* renamed from: i3 */
    public final void mo183577i3(boolean z) {
        if (z && this.f355587e) {
            mo183576g3();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.fft);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.mo104200a(new C118868b(this));
        }
    }
}

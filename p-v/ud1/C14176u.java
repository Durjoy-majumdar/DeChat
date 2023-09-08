package ud1;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import od1.C11404g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import td1.C13872a;
import te3.C51270sn1;

/* renamed from: ud1.u */
public final class C14176u extends C11404g<C51270sn1> {

    /* renamed from: n */
    public final C13601g f39623n;

    /* renamed from: ud1.u$a */
    public static final class C14177a extends C87413o implements C32224a<C13872a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f39624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14177a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f39624d = appCompatActivity;
        }

        public Object invoke() {
            return new C13872a(this.f39624d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14176u(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f39623n = C36568h.m40985a(new C14177a(appCompatActivity));
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        super.mo498c3(i, str);
        ((C13872a) ((C36570n) this.f39623n).getValue()).mo12502a(i, str);
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
        super.mo327d3(i, str);
        Log.m105924i("FinderMusicTopicTipsUIC", "responseCode:" + i + " errMsg:" + str);
        if (!(str == null || str.length() == 0)) {
            C13872a aVar = (C13872a) ((C36570n) this.f39623n).getValue();
            TextView textView = aVar.f36998d;
            if (textView != null) {
                if (str == null) {
                    str = aVar.f36995a.getResources().getString(C0966R.string.fzi);
                }
                textView.setText(str);
            }
            TextView textView2 = aVar.f36999e;
            if (textView2 != null) {
                textView2.setText("");
            }
            Button button = aVar.f36996b;
            if (button != null) {
                button.setTextColor(aVar.f36995a.getResources().getColor(C0966R.color.Brand_BG_100));
            }
        } else if (!getActivity().isFinishing()) {
            getActivity().finish();
        }
    }
}

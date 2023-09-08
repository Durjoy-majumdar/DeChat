package v93;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import yb2.C15946a;

/* renamed from: v93.a */
public class C14419a extends C15946a {

    /* renamed from: v93.a$a */
    public static final class C14420a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14419a f40025d;

        public C14420a(C14419a aVar) {
            this.f40025d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUIC$onCreateAfter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40025d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUIC$onCreateAfter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14419a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public int mo13711g3() {
        return C0966R.C0971layout.d_2;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.oj5);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            View inflate = LayoutInflater.from(getActivity()).inflate(mo13711g3(), (ViewGroup) null);
            frameLayout.addView(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.oeh);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C14420a(this));
            }
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.evd);
            if (textView != null) {
                textView.setText(getString(C0966R.string.hlo));
                C85875k4.m106191k0(textView.getPaint());
            }
        }
    }
}

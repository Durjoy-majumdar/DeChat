package vf1;

import a14.C53895h;
import a14.C53934p0;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import gy3.C87412m;
import java.util.ArrayList;
import qk1.C12816m2;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: vf1.x5 */
public final class C52881x5 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ OccupyFinderUI39 f147684d;

    public C52881x5(OccupyFinderUI39 occupyFinderUI39) {
        this.f147684d = occupyFinderUI39;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            OccupyFinderUI39 occupyFinderUI39 = this.f147684d;
            int i2 = OccupyFinderUI39.f111565v;
            occupyFinderUI39.mo64533O7().clearFocus();
            String obj = C112550d0.m153799i0(this.f147684d.mo64533O7().getText().toString()).toString();
            if (!(!C112551y.m153811k(obj))) {
                obj = null;
            }
            if (obj != null) {
                OccupyFinderUI39 occupyFinderUI392 = this.f147684d;
                Object systemService = occupyFinderUI392.getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(occupyFinderUI392.mo64533O7().getWindowToken(), 0);
                occupyFinderUI392.mo64533O7().setText("");
                C12816m2 m2Var = occupyFinderUI392.f111570s;
                m2Var.getClass();
                ((ArrayList) m2Var.f36693e).add(obj);
                m2Var.notifyItemInserted(((ArrayList) m2Var.f36693e).size());
                occupyFinderUI392.mo64535Q7(occupyFinderUI392.f111570s.getItemCount());
                C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) occupyFinderUI392), (C66212f) null, (C53934p0) null, new C52877v5(occupyFinderUI392, obj, (C15601d<? super C52877v5>) null), 3, (Object) null);
                return true;
            }
        }
        return false;
    }
}

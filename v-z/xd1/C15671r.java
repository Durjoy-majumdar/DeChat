package xd1;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.LinkedList;
import od1.C11404g;
import te3.C48713ah1;
import te3.C48856bh1;
import te3.C49003ch1;

/* renamed from: xd1.r */
public final class C15671r extends C11404g<C48713ah1> {

    /* renamed from: n */
    public boolean f42359n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15671r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        super.mo498c3(i, str);
        mo14416m3();
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
        super.mo327d3(i, str);
        mo14416m3();
    }

    /* renamed from: k3 */
    public void mo509k3() {
        TextView textView;
        super.mo509k3();
        this.f42359n = getIntent().getBooleanExtra("key_drawer_mode", false);
        TextView textView2 = this.f33562i;
        if (textView2 != null) {
            textView2.setText(getString(C0966R.string.n_e));
        }
        if (this.f42359n && (textView = this.f33562i) != null) {
            textView.setTextColor(MMApplicationContext.getColor(C0966R.color.FG_2));
        }
    }

    /* renamed from: l3 */
    public boolean mo11419l3() {
        C49003ch1 ch12;
        T t = this.f33564d;
        C48713ah1 ah12 = (C48713ah1) t;
        LinkedList<C48856bh1> linkedList = null;
        if ((ah12 != null ? ah12.f130523q : null) != null) {
            C48713ah1 ah13 = (C48713ah1) t;
            if (!(ah13 == null || (ch12 = ah13.f130523q) == null)) {
                linkedList = ch12.f131728d;
            }
            return linkedList == null || linkedList.isEmpty();
        }
    }

    /* renamed from: m3 */
    public final void mo14416m3() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.cj7);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setTextColor(MMApplicationContext.getColor(C0966R.color.FG_2));
            textView.setText(getString(C0966R.string.n_e));
        }
    }
}

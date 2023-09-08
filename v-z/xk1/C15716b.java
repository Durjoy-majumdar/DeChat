package xk1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.cg4;

/* renamed from: xk1.b */
public final class C15716b extends UIComponent {

    /* renamed from: d */
    public final String f42408d = "Finder.FinderGameFinishUIC";

    /* renamed from: e */
    public boolean f42409e = true;

    /* renamed from: f */
    public String f42410f = "";

    /* renamed from: g */
    public String f42411g = "";

    /* renamed from: h */
    public View f42412h;

    /* renamed from: i */
    public cg4 f42413i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15716b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final View mo14437c3() {
        View view = this.f42412h;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: d3 */
    public final void mo14438d3() {
        View c3 = mo14437c3();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(c3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e3 */
    public final void mo14439e3(boolean z, String str, String str2) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "desc");
        this.f42409e = z;
        this.f42410f = str;
        this.f42411g = str2;
    }

    /* renamed from: f3 */
    public final void mo14440f3() {
        WeImageView weImageView = (WeImageView) mo14437c3().findViewById(C0966R.C0970id.e9v);
        if (this.f42409e) {
            weImageView.setImageResource(C0966R.raw.finder_live_icon);
            weImageView.setIconColor(getResources().getColor(C0966R.color.f3424sc));
        } else {
            weImageView.setImageResource(C0966R.raw.icons_filled_error);
            weImageView.setIconColor(getResources().getColor(C0966R.color.f3424sc));
        }
        ((TextView) mo14437c3().findViewById(C0966R.C0970id.e_0)).setText(this.f42410f);
        ((TextView) mo14437c3().findViewById(C0966R.C0970id.e9u)).setText(this.f42411g);
        mo14437c3().findViewById(C0966R.C0970id.e9q).setOnClickListener(new C15714a(this));
        View c3 = mo14437c3();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = c3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.e9o);
        C87412m.m108593f(findViewById, "findViewById(R.id.finish_area)");
        this.f42412h = findViewById;
        cg4 cg4 = new cg4();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_FROM_THIRD_PARTY_SHARE");
        if (byteArrayExtra != null) {
            try {
                cg4.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f42413i = cg4;
        }
        cg4 = null;
        this.f42413i = cg4;
    }
}

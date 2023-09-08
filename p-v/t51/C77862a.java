package t51;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringCardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import o40.C61926c;

/* renamed from: t51.a */
public final class C77862a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SpringCardActivity f226887d;

    public C77862a(SpringCardActivity springCardActivity) {
        this.f226887d = springCardActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SpringCardActivity", "onClick: " + this.f226887d.f197836g);
        SpringCardActivity springCardActivity = this.f226887d;
        if (springCardActivity.f197836g) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        springCardActivity.f197836g = true;
        C61926c.m72698w(springCardActivity.f197838i);
        C61926c.m72667L(1000, this.f226887d.f197838i);
        int color = this.f226887d.getContext().getResources().getColor(C0966R.color.ae8);
        Intent intent = new Intent();
        intent.putExtra("customize_status_bar_color", color);
        intent.putExtra("webview_bg_color_rsID", C0966R.color.ae8);
        intent.putExtra("from_shortcut", true);
        intent.putExtra("disable_minimize", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        C88144b.m109795m(this.f226887d, "webview", ".ui.tools.WebViewUI", intent, 1001);
        this.f226887d.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

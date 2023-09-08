package g60;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.p016ui.dialog.LiveVisitorGuideView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: g60.j */
public final class C75868j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorGuideView f222514d;

    public C75868j(LiveVisitorGuideView liveVisitorGuideView) {
        this.f222514d = liveVisitorGuideView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveVisitorGuideView liveVisitorGuideView = this.f222514d;
        boolean z = !liveVisitorGuideView.f195346i;
        liveVisitorGuideView.f195346i = z;
        if (z) {
            liveVisitorGuideView.f195341d.setImageResource(C0966R.raw.checkbox_selected);
            this.f222514d.f195342e.setEnabled(true);
        } else {
            liveVisitorGuideView.f195341d.setImageResource(C0966R.C0969drawable.f4823ny);
            this.f222514d.f195342e.setEnabled(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

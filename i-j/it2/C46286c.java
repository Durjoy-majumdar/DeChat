package it2;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: it2.c */
public class C46286c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumUI f124736d;

    public C46286c(SnsAlbumUI snsAlbumUI) {
        this.f124736d = snsAlbumUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
        Intent intent = new Intent(this.f124736d.getActivity(), SnsUserUI.class);
        intent.putExtra("sns_rpt_scene", 21);
        intent.putExtra("sns_userName", SnsAlbumUI.m122527K(this.f124736d));
        FragmentActivity activity = this.f124736d.getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        FragmentActivity fragmentActivity = activity;
        C117292a.m165358d(fragmentActivity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(fragmentActivity, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

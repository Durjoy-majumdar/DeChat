package oy2;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.test.ExMainSettings;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p151er.C75651n;

/* renamed from: oy2.e */
public final class C11794e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExMainSettings f34507d;

    public C11794e(ExMainSettings exMainSettings) {
        this.f34507d = exMainSettings;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/test/ExMainSettings$initList$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ExMainSettings exMainSettings = this.f34507d;
        int i = ExMainSettings.f21569f;
        exMainSettings.getClass();
        Class cls = C75651n.class;
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.setClassName(exMainSettings.getContext(), "com.tencent.mm.plugin.finder.ui.FinderPostRouterUI");
        if (!((C75651n) C86312j.m106911c(cls)).mo55948kk()) {
            intent.putExtra("key_can_select_video_and_pic", true);
        }
        intent.putExtra("is_hide_album_footer", true);
        intent.putExtra("show_header_view", false);
        intent.putExtra("max_select_count", 9);
        intent.putExtra("query_source_type", 25);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("album_video_max_duration", ((C75651n) C86312j.m106911c(cls)).mo55943dr());
        intent.putExtra("album_video_min_duration", ((C75651n) C86312j.m106911c(cls)).mo55946g1().f267171i);
        intent.putExtra("key_finder_post_router", 10);
        AppCompatActivity context = exMainSettings.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/test/ExMainSettings", "startFlutterVideoEditorChoosePic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/test/ExMainSettings", "startFlutterVideoEditorChoosePic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package ly1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ly1.x */
public class C10670x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99776u f32087d;

    public C10670x(C99776u uVar) {
        this.f32087d = uVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GamePublishGalleryView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("key_game_haowan_text", true);
        ((Activity) this.f32087d.getContext()).setResult(-1, intent);
        ((Activity) this.f32087d.getContext()).finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package nh2;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin;
import j20.C117292a;
import java.util.ArrayList;
import qh2.C101198e;

/* renamed from: nh2.c */
public final class C109747c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhotoDoodlePlugin f328482d;

    public C109747c(PhotoDoodlePlugin photoDoodlePlugin) {
        this.f328482d = photoDoodlePlugin;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101198e mStatus = this.f328482d.getMStatus();
        if (mStatus != null) {
            C101198e.C62622a.m73576a(mStatus, C101198e.C101199b.EDIT_PHOTO_DOODLE_UNDO, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

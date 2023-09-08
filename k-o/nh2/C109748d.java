package nh2;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import sx3.C64197v;

/* renamed from: nh2.d */
public final class C109748d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhotoDoodlePlugin f328483d;

    public C109748d(PhotoDoodlePlugin photoDoodlePlugin) {
        this.f328483d = photoDoodlePlugin;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
        C109741a aVar = (C109741a) view;
        if (aVar.getType() == this.f328483d.getSelectType()) {
            this.f328483d.mo151181b(aVar.getType());
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        view.announceForAccessibility(C76577a.m92166q(aVar.getContext(), C0966R.string.f7524io));
        this.f328483d.setSelectType(aVar.getType());
        this.f328483d.mo151181b(aVar.getType());
        ArrayList<PhotoDoodlePlugin.C105942a> resourceArray = this.f328483d.getResourceArray();
        PhotoDoodlePlugin photoDoodlePlugin = this.f328483d;
        int i2 = 0;
        for (T next : resourceArray) {
            int i3 = i2 + 1;
            View view2 = null;
            if (i2 >= 0) {
                PhotoDoodlePlugin.C105942a aVar2 = (PhotoDoodlePlugin.C105942a) next;
                if (i2 == i) {
                    GridView colorList = photoDoodlePlugin.getColorList();
                    View childAt = colorList != null ? colorList.getChildAt(i2) : null;
                    C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (!((C109741a) childAt).f328462h) {
                        GridView colorList2 = photoDoodlePlugin.getColorList();
                        if (colorList2 != null) {
                            view2 = colorList2.getChildAt(i2);
                        }
                        C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((C109741a) view2).setHasSelected(true);
                    }
                } else {
                    GridView colorList3 = photoDoodlePlugin.getColorList();
                    View childAt2 = colorList3 != null ? colorList3.getChildAt(i2) : null;
                    C87412m.m108592e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((C109741a) childAt2).f328462h) {
                        GridView colorList4 = photoDoodlePlugin.getColorList();
                        if (colorList4 != null) {
                            view2 = colorList4.getChildAt(i2);
                        }
                        C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((C109741a) view2).setHasSelected(false);
                    }
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

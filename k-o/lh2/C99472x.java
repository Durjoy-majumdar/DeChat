package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.x */
public final class C99472x implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ImageView f291645d;

    /* renamed from: e */
    public C101198e f291646e;

    public C99472x(ImageView imageView, C101198e eVar) {
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291645d = imageView;
        this.f291646e = eVar;
        imageView.setVisibility(0);
        ImageView imageView2 = this.f291645d;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_clip, -1));
        this.f291645d.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99472x.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101198e.C62622a.m73576a(this.f291646e, C101198e.C101199b.EDIT_PHOTO_CROP, (Bundle) null, 2, (Object) null);
        C110992d dVar = C110992d.f332425a;
        dVar.mo162669b(10);
        C110992d.m151314c(dVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, (Object) null);
        ImageView imageView = this.f291645d;
        imageView.announceForAccessibility(C76577a.m92166q(imageView.getContext(), C0966R.string.f7530iu));
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        this.f291645d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

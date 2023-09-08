package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.y */
public final class C109380y implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f327446d;

    /* renamed from: e */
    public C101198e f327447e;

    /* renamed from: f */
    public boolean f327448f;

    /* renamed from: g */
    public final PhotoDoodlePlugin f327449g;

    /* renamed from: h */
    public final ImageView f327450h;

    public C109380y(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "viewGroup");
        C87412m.m108594g(eVar, "status");
        this.f327446d = viewGroup;
        this.f327447e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.c8z);
        C87412m.m108593f(findViewById, "viewGroup.findViewById(R.id.doddle_layout)");
        PhotoDoodlePlugin photoDoodlePlugin = (PhotoDoodlePlugin) findViewById;
        this.f327449g = photoDoodlePlugin;
        photoDoodlePlugin.setStatus(this.f327447e);
        View findViewById2 = this.f327446d.findViewById(C0966R.C0970id.f357897cc1);
        C87412m.m108593f(findViewById2, "viewGroup.findViewById(R.id.editor_add_pencil)");
        ImageView imageView = (ImageView) findViewById2;
        this.f327450h = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, -1));
        imageView.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo160579a() {
        if (this.f327448f) {
            this.f327449g.setVisibility(0);
        } else {
            this.f327449g.setVisibility(4);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C109380y.class.getName();
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
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = !this.f327448f;
        this.f327448f = z;
        if (z) {
            C110992d dVar = C110992d.f332425a;
            C110992d.m151314c(dVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, (Object) null);
            dVar.mo162669b(7);
            ImageView imageView = this.f327450h;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, this.f327450h.getResources().getColor(C0966R.color.akw)));
            C101198e.C62622a.m73576a(this.f327447e, C101198e.C101199b.EDIT_PHOTO_DOODLE, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f327447e, C101198e.C101199b.EDIT_PHOTO_DOODLE_CANCEL, (Bundle) null, 2, (Object) null);
            ImageView imageView2 = this.f327450h;
            imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_duddle, -1));
        }
        mo160579a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        this.f327448f = false;
        mo160579a();
        C101198e.C62622a.m73576a(this.f327447e, C101198e.C101199b.EDIT_PHOTO_DOODLE_CANCEL, (Bundle) null, 2, (Object) null);
        ImageView imageView = this.f327450h;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, -1));
    }

    public void setVisibility(int i) {
        this.f327450h.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

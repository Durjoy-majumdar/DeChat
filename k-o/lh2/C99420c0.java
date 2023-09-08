package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.c0 */
public final class C99420c0 implements C109344g0, View.OnClickListener {

    /* renamed from: d */
    public ViewGroup f291499d;

    /* renamed from: e */
    public C101198e f291500e;

    /* renamed from: f */
    public final ViewGroup f291501f;

    /* renamed from: g */
    public final ViewGroup f291502g;

    /* renamed from: h */
    public C99421a f291503h = C99421a.DEFAULT;

    /* renamed from: lh2.c0$a */
    public enum C99421a {
        CROP_FUNC,
        DEFAULT
    }

    public C99420c0(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "view");
        C87412m.m108594g(eVar, "status");
        this.f291499d = viewGroup;
        this.f291500e = eVar;
        this.f291501f = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.ehd);
        ViewGroup viewGroup2 = (ViewGroup) this.f291499d.findViewById(C0966R.C0970id.bwn);
        this.f291502g = viewGroup2;
        ImageView imageView = (ImageView) this.f291499d.findViewById(C0966R.C0970id.bws);
        ImageView imageView2 = (ImageView) this.f291499d.findViewById(C0966R.C0970id.bwq);
        viewGroup2.setVisibility(4);
        this.f291499d.findViewById(C0966R.C0970id.cb8);
        imageView.setImageDrawable(C74933u4.m89768e(this.f291499d.getContext(), C0966R.raw.undo_normal, -1));
        imageView2.setImageDrawable(C74933u4.m89768e(this.f291499d.getContext(), C0966R.raw.icons_filled_refresh, -1));
        ((Button) this.f291499d.findViewById(C0966R.C0970id.bwk)).setOnClickListener(this);
        ((Button) this.f291499d.findViewById(C0966R.C0970id.bwm)).setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (this.f291503h != C99421a.CROP_FUNC) {
            return false;
        }
        C101198e.C62622a.m73576a(this.f291500e, C101198e.C101199b.EDIT_PHOTO_CROP_CANCEL, (Bundle) null, 2, (Object) null);
        return true;
    }

    public String name() {
        return C99420c0.class.getName();
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
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwk) {
            this.f291501f.setVisibility(0);
            this.f291502g.setVisibility(4);
            C101198e.C62622a.m73576a(this.f291500e, C101198e.C101199b.EDIT_PHOTO_CROP_CANCEL, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwm) {
            this.f291501f.setVisibility(0);
            this.f291502g.setVisibility(4);
            C101198e.C62622a.m73576a(this.f291500e, C101198e.C101199b.EDIT_PHOTO_CROP_FINISH, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bws) {
            C101198e.C62622a.m73576a(this.f291500e, C101198e.C101199b.EDIT_PHOTO_CROP_UNDO, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwq) {
            C101198e.C62622a.m73576a(this.f291500e, C101198e.C101199b.EDIT_PHOTO_CROP_ROTATE, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        this.f291499d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

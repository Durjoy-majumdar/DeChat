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
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.u0 */
public final class C99467u0 implements C109344g0 {

    /* renamed from: d */
    public final ImageView f291630d;

    /* renamed from: e */
    public final C101198e f291631e;

    /* renamed from: f */
    public boolean f291632f;

    /* renamed from: g */
    public boolean f291633g;

    /* renamed from: lh2.u0$a */
    public static final class C99468a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99467u0 f291634d;

        public C99468a(C99467u0 u0Var) {
            this.f291634d = u0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordFilterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C99467u0 u0Var = this.f291634d;
            boolean z = !u0Var.f291633g;
            u0Var.f291633g = z;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z);
            u0Var.f291631e.mo14585p(C101198e.C101199b.RECORD_BEAUTIFY, bundle);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordFilterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C99467u0(ImageView imageView, C101198e eVar) {
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291630d = imageView;
        this.f291631e = eVar;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_filters, -1));
        imageView.setOnClickListener(new C99468a(this));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99467u0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
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
        if (this.f291632f) {
            this.f291630d.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

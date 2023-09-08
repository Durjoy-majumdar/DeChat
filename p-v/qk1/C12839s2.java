package qk1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import qk1.C12835r2;
import rx3.C13598b0;
import te3.C64373fs0;

/* renamed from: qk1.s2 */
public final class C12839s2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12835r2 f36748d;

    /* renamed from: e */
    public final /* synthetic */ int f36749e;

    /* renamed from: f */
    public final /* synthetic */ C12835r2.C12836a f36750f;

    /* renamed from: qk1.s2$a */
    public static final class C12840a implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C12840a f36751a = new C12840a();

        /* renamed from: a */
        public final void mo596a(View view) {
            WeImageView weImageView;
            TextView textView;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
                textView.setTextSize(1, 14.0f);
            }
            if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_error);
            }
        }
    }

    public C12839s2(C12835r2 r2Var, int i, C12835r2.C12836a aVar) {
        this.f36748d = r2Var;
        this.f36749e = i;
        this.f36750f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12835r2 r2Var = this.f36748d;
        if (r2Var.f36737h) {
            int i = this.f36749e;
            boolean z = false;
            if (i >= 0 && i < r2Var.getItemCount()) {
                z = true;
            }
            C64373fs0 fs02 = z ? r2Var.f36735f.get(i) : null;
            C32226l<? super C64373fs0, C13598b0> lVar = this.f36748d.f36733d;
            if (lVar != null) {
                if (fs02 == null) {
                    fs02 = new C64373fs0();
                    fs02.f183215f = 10001;
                }
                lVar.invoke(fs02);
            }
        } else {
            C76912y0.m92766e(this.f36750f.f44854d.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.e_n), C12840a.f36751a);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

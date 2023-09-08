package vb2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import u23.C65003a;
import vb2.C65567d;

/* renamed from: vb2.e */
public final class C65573e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65003a f188672d;

    /* renamed from: e */
    public final /* synthetic */ C65567d f188673e;

    /* renamed from: f */
    public final /* synthetic */ int f188674f;

    /* renamed from: g */
    public final /* synthetic */ C65567d.C65572e f188675g;

    /* renamed from: vb2.e$a */
    public static final class C65574a extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65567d.C65572e f188676d;

        /* renamed from: e */
        public final /* synthetic */ C65003a f188677e;

        /* renamed from: f */
        public final /* synthetic */ C65567d f188678f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65574a(C65567d.C65572e eVar, C65003a aVar, C65567d dVar) {
            super(1);
            this.f188676d = eVar;
            this.f188677e = aVar;
            this.f188678f = dVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            RangeSliderView rangeSliderView = this.f188676d.f188668A;
            rangeSliderView.setProgress(rangeSliderView.getStart() + ((int) (((float) (longValue - this.f188677e.f187130j)) * this.f188678f.f188664e.getWidthPerMills())));
            return C13598b0.f38549a;
        }
    }

    public C65573e(C65003a aVar, C65567d dVar, int i, C65567d.C65572e eVar) {
        this.f188672d = aVar;
        this.f188673e = dVar;
        this.f188674f = i;
        this.f188675g = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.MvTracksAdapter", "clicked " + this.f188672d);
        this.f188673e.f188663d.mo80678d(this.f188674f);
        C65567d dVar = this.f188673e;
        dVar.f188665f = new C65574a(this.f188675g, this.f188672d, dVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

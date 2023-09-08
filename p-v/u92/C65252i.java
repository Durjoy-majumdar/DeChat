package u92;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import u92.C65238a;

/* renamed from: u92.i */
public final class C65252i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C65238a.C65240b> f187856d;

    /* renamed from: e */
    public final /* synthetic */ C65238a f187857e;

    public C65252i(ArrayList<C65238a.C65240b> arrayList, C65238a aVar) {
        this.f187856d = arrayList;
        this.f187857e = aVar;
    }

    public final void run() {
        Iterator<C65238a.C65240b> it = this.f187856d.iterator();
        while (it.hasNext()) {
            C65238a.C65240b next = it.next();
            C65238a aVar = this.f187857e;
            RecyclerView.C16631z zVar = next.f187809a;
            aVar.getClass();
            C87412m.m108594g(zVar, "holder");
            View view = zVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            View findViewById = zVar.f44854d.findViewById(C0966R.C0970id.h3h);
            String str = aVar.f187788j;
            Log.m105918d(str, "animateLayoutImpl adapterPosition:" + zVar.mo17363j() + " width:" + view.getLayoutParams().width + " height:" + view.getLayoutParams().height + " fromWidth:" + next.f187810b + " toWidth:" + next.f187811c);
            if (Math.abs(next.f187810b - next.f187811c) > 1) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{next.f187810b, next.f187811c});
                ofInt.addUpdateListener(new C65248e(findViewById, view));
                ofInt.addListener(new C65249f(findViewById, next, view, ofInt));
                ofInt.setDuration(aVar.f44809e);
                ofInt.start();
            } else {
                findViewById.getLayoutParams().height = C60641c.m70921b(((float) (next.f187811c - MultiTaskUIC.f346672J)) * MultiTaskUIC.f346683S0);
                view.getLayoutParams().width = next.f187811c;
                view.getLayoutParams().height = C60641c.m70921b(((float) next.f187811c) * MultiTaskUIC.f346681R0);
                view.requestLayout();
            }
        }
        this.f187856d.clear();
        this.f187857e.f187796r.remove(this.f187856d);
    }
}

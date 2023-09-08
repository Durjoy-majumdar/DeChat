package ds0;

import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import te3.x75;
import te3.y75;
import te3.z75;

/* renamed from: ds0.i */
public final class C45447i extends RecyclerView.C16613e<C45448j> {

    /* renamed from: d */
    public final ArrayList<x75> f123014d = new ArrayList<>();

    /* renamed from: e */
    public final SimpleDateFormat f123015e;

    /* renamed from: f */
    public final SimpleDateFormat f123016f;

    public C45447i() {
        Locale locale = Locale.US;
        this.f123015e = new SimpleDateFormat("HH:mm", locale);
        this.f123016f = new SimpleDateFormat("MM/dd HH:mm", locale);
    }

    /* renamed from: F4 */
    public final void mo70943F4(List<? extends x75> list) {
        C87412m.m108594g(list, "fetchedUseRecordList");
        int size = this.f123014d.size();
        int size2 = list.size();
        Log.m105924i("MicroMsg.AppBrandPrivacyUseRecordPage", "appendFetchedUseRecordList, posInsert: " + size + ", insertCount: " + size2);
        this.f123014d.addAll(list);
        notifyItemRangeInserted(size, size2);
    }

    public int getItemCount() {
        return this.f123014d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C45448j jVar = (C45448j) zVar;
        C87412m.m108594g(jVar, "holder");
        try {
            x75 x75 = this.f123014d.get(i);
            C87412m.m108593f(x75, "try {\n                us…     return\n            }");
            TextView textView = jVar.f123020z;
            String str = null;
            if (textView != null) {
                y75 y75 = x75.f144514e;
                textView.setText(y75 != null ? y75.f145165e : null);
            }
            TextView textView2 = jVar.f123018B;
            if (textView2 != null) {
                long j = ((long) x75.f144515f) * 1000;
                textView2.setText(DateUtils.isToday(j) ? this.f123015e.format(new Date(j)) : this.f123016f.format(new Date(j)));
            }
            TextView textView3 = jVar.f123017A;
            if (textView3 != null) {
                z75 z75 = x75.f144513d;
                if (z75 != null) {
                    str = z75.f145749e;
                }
                if (!(str == null || str.length() == 0)) {
                    textView3.setVisibility(0);
                    textView3.setText(textView3.getContext().getString(C0966R.string.lqb, new Object[]{str}));
                } else {
                    textView3.setVisibility(8);
                }
            }
            View view = jVar.f123019C;
            if (view != null) {
                int i2 = i != this.f123014d.size() - 1 ? 4 : 0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrandPrivacyUseRecordPage", "onBindViewHolder, get useRecord fail since " + e + ", position: " + i);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return new C45448j(viewGroup);
    }
}

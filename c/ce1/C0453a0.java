package ce1;

import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import rx3.C13604l;
import sx3.C110818d0;

/* renamed from: ce1.a0 */
public final class C0453a0<T> implements C7045j.C7055j {

    /* renamed from: a */
    public final /* synthetic */ C7045j f1088a;

    /* renamed from: b */
    public final /* synthetic */ C0479p f1089b;

    /* renamed from: c */
    public final /* synthetic */ C13604l<ArrayList<String>, ArrayList<List<String>>> f1090c;

    public C0453a0(C7045j jVar, C0479p pVar, C13604l<? extends ArrayList<String>, ? extends ArrayList<List<String>>> lVar) {
        this.f1088a = jVar;
        this.f1089b = pVar;
        this.f1090c = lVar;
    }

    /* renamed from: a */
    public final void mo494a(boolean z, Object obj, Object obj2, Object obj3) {
        this.f1088a.mo8101d();
        if (z) {
            C0479p pVar = this.f1089b;
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            pVar.f1200y = C110818d0.m150918P((List) this.f1090c.f38555d, (CharSequence) obj);
            C0479p pVar2 = this.f1089b;
            Object obj4 = ((ArrayList) this.f1090c.f38556e).get(pVar2.f1200y);
            C87412m.m108593f(obj4, "timePair.second[selectedDateIndex]");
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            pVar2.f1201z = ((List) obj4).indexOf((CharSequence) obj2);
            Date date = new Date(C58784w3.f168295a.mo83943k0());
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.set(5, instance.get(5) + this.f1089b.f1200y);
            instance.set(11, (24 - ((List) ((ArrayList) this.f1090c.f38556e).get(this.f1089b.f1200y)).size()) + this.f1089b.f1201z);
            instance.set(12, 0);
            instance.set(13, 0);
            Log.m105924i("FinderActivityPostUIC", "chosen time:" + instance.getTime() + ",timeInMills:" + instance.getTimeInMillis());
            this.f1089b.f1198w = instance.getTimeInMillis() / ((long) 1000);
            C0479p pVar3 = this.f1089b;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(' ');
            sb.append(obj2);
            pVar3.f1199x = sb.toString();
            C0479p pVar4 = this.f1089b;
            TextView textView = pVar4.f1189n;
            if (textView != null) {
                textView.setText(pVar4.f1199x);
            } else {
                C87412m.m108603p("selectTimeText");
                throw null;
            }
        }
    }
}

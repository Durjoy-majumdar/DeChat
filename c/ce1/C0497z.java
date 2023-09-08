package ce1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import ce1.C0479p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58784w3;
import er1.C7878t0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import rx3.C13604l;
import tf0.C13887q1;
import up1.C37521f;

/* renamed from: ce1.z */
public final class C0497z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1221d;

    public C0497z(C0479p pVar) {
        this.f1221d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0479p pVar = this.f1221d;
        C0479p.C0481b bVar = C0479p.f1167N;
        pVar.getClass();
        C58784w3 w3Var = C58784w3.f168295a;
        AppCompatActivity activity = pVar.getActivity();
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99187H4.mo60266n().intValue();
        w3Var.getClass();
        C87412m.m108594g(activity, "context");
        Date date = new Date(w3Var.mo83943k0());
        Calendar instance = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        int i2 = (date.getHours() < 23 || date.getMinutes() < 55) ? 0 : 1;
        int i3 = i2;
        while (i3 < intValue) {
            instance.setTime(date);
            instance.set(5, instance.get(5) + i3);
            int i4 = instance.get(5);
            int i5 = instance.get(2) + i;
            if (i3 == i2) {
                arrayList2.add(MMApplicationContext.getContext().getResources().getString(C0966R.string.ezr));
            } else if (i3 == i2 + 1) {
                StringBuilder sb = new StringBuilder();
                Resources resources = MMApplicationContext.getContext().getResources();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i5);
                objArr[i] = Integer.valueOf(i4);
                sb.append(resources.getString(C0966R.string.dzf, objArr));
                sb.append(' ');
                sb.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.ezs));
                arrayList2.add(sb.toString());
            } else if (i3 == i2 + 2) {
                StringBuilder sb4 = new StringBuilder();
                Resources resources2 = MMApplicationContext.getContext().getResources();
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i5);
                objArr2[i] = Integer.valueOf(i4);
                sb4.append(resources2.getString(C0966R.string.dzf, objArr2));
                sb4.append(' ');
                sb4.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.ezi));
                arrayList2.add(sb4.toString());
            } else {
                int i6 = 7;
                int i7 = instance.get(7);
                if (i7 - 2 >= 0) {
                    i6 = i7 - 1;
                }
                arrayList2.add(MMApplicationContext.getContext().getResources().getString(C0966R.string.dzf, new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}) + ' ' + C7878t0.m8040i(activity, i6, FirebaseAnalytics.C113379b.CAMPAIGN));
            }
            i3++;
            i = 1;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Log.m105924i("getNoticePicker", (String) it.next());
        }
        ArrayList<List<String>> oq = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13353oq(arrayList2.size(), C0966R.string.d2k, true);
        C13604l lVar = new C13604l(arrayList2, oq);
        C7045j jVar = new C7045j(pVar.getActivity(), arrayList2, oq);
        Calendar.getInstance().setTimeInMillis(C58784w3.f168295a.mo83943k0());
        jVar.mo8107j(pVar.f1200y, pVar.f1201z);
        String string = pVar.getActivity().getResources().getString(C0966R.string.dk9);
        Button button = jVar.f24861i;
        if (button != null) {
            button.setText(string);
        }
        jVar.f24870u = new C0453a0(jVar, pVar, lVar);
        View inflate = LayoutInflater.from(pVar.getActivity()).inflate(C0966R.C0971layout.a9j, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(activity).inflate(R…time_picker_header, null)");
        jVar.mo8104g(inflate);
        int color = pVar.getActivity().getResources().getColor(C0966R.color.f2959af);
        Button button2 = jVar.f24862j;
        if (button2 != null) {
            button2.setTextColor(color);
        }
        Button button3 = jVar.f24861i;
        if (button3 != null) {
            button3.setBackgroundResource(C0966R.C0969drawable.f4653j6);
        }
        jVar.mo8109l();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

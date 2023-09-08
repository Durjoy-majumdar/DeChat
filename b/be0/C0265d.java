package be0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13604l;
import sx3.C64197v;

/* renamed from: be0.d */
public final class C0265d {

    /* renamed from: a */
    public static final C0265d f821a = new C0265d();

    /* renamed from: a */
    public final View mo309a(Context context, ArrayList<C13604l<String, String>> arrayList, int i) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(arrayList, "keyWordList");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i2 = 0;
        for (T next : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C13604l lVar = (C13604l) next;
                String str = (String) lVar.f38555d;
                String str2 = (String) lVar.f38556e;
                int size = arrayList.size();
                View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c7s, (ViewGroup) null, false);
                inflate.setContentDescription(str + ' ' + str2);
                ((TextView) inflate.findViewById(C0966R.C0970id.ffb)).setText(str);
                ((TextView) inflate.findViewById(C0966R.C0970id.l3e)).setText(str2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i2 != size - 1) {
                    layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
                }
                if (i2 == 0) {
                    layoutParams.topMargin = i;
                } else {
                    int i4 = i;
                }
                inflate.setLayoutParams(layoutParams);
                linearLayout.addView(inflate);
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return linearLayout;
    }
}

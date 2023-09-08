package lc1;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import pb1.C100755z;
import zp3.C79406f;

public final /* synthetic */ class c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99373c f224358d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayout f224359e;

    /* renamed from: f */
    public final /* synthetic */ c$$e f224360f;

    /* renamed from: g */
    public final /* synthetic */ C100755z f224361g;

    public /* synthetic */ c$$a(C99373c cVar, LinearLayout linearLayout, c$$e c__e, C100755z zVar) {
        this.f224358d = cVar;
        this.f224359e = linearLayout;
        this.f224360f = c__e;
        this.f224361g = zVar;
    }

    public final void run() {
        C99373c cVar = this.f224358d;
        LinearLayout linearLayout = this.f224359e;
        c$$e c__e = this.f224360f;
        C100755z zVar = this.f224361g;
        cVar.getClass();
        Context context = linearLayout.getContext();
        int b = (int) C79406f.m96348b(context, (float) c__e.f291395i.getWidth());
        Log.m105924i("MicroMsg.FavBaseListItem", "renderTag widthDp = " + b);
        LinkedList<String> linkedList = zVar.field_tagProto.f186495e;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < linkedList.size()) {
            String str = linkedList.get(i2);
            Log.m105924i("MicroMsg.FavBaseListItem", "field_tagProto.userDefList [ " + i2 + " ] : " + str);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            float f = (float) 10;
            linearLayout2.setPadding(i, i, C79406f.m96347a(context, f), i);
            linearLayout2.setLayoutParams(layoutParams);
            WeImageView weImageView = new WeImageView(context);
            int a = C79406f.m96347a(context, (float) 16);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a, a);
            layoutParams2.gravity = 17;
            weImageView.setLayoutParams(layoutParams2);
            weImageView.setImageResource(C0966R.raw.fav_list_tag);
            weImageView.setIconColor(C76577a.m92153d(context, C0966R.color.f3154h3));
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.leftMargin = C79406f.m96347a(context, (float) 5);
            textView.setLayoutParams(layoutParams3);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            LinkedList<String> linkedList2 = linkedList;
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            textView.setTextSize((float) 12);
            textView.setSingleLine(true);
            textView.setTextColor(C76577a.m92153d(context, C0966R.color.f3154h3));
            textView.setText(str);
            textView.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = textView.getMeasuredWidth();
            linearLayout2.addView(weImageView);
            linearLayout2.addView(textView);
            Pair pair = new Pair(linearLayout2, Integer.valueOf((int) (((float) 21) + C79406f.m96348b(context, (float) measuredWidth) + f)));
            arrayList.add((View) pair.first);
            i3 += ((Integer) pair.second).intValue();
            i2++;
            linkedList = linkedList2;
            i = 0;
        }
        Log.m105924i("MicroMsg.FavBaseListItem", "totalWidthDp = " + i3 + " , tagListFL widthDp = " + b);
        linearLayout.removeAllViews();
        c__e.f291396j.removeAllViews();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View view = (View) arrayList.get(i4);
            if (i3 < b) {
                c__e.f291396j.setVisibility(8);
                linearLayout.addView(view);
            } else {
                c__e.f291396j.setVisibility(0);
                c__e.f291396j.addView((View) arrayList.get(i4));
            }
        }
    }
}

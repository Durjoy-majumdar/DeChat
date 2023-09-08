package sd2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;

/* renamed from: sd2.j */
public class C77665j extends Preference {

    /* renamed from: J */
    public View f226417J = null;

    /* renamed from: K */
    public View.OnClickListener f226418K = null;

    /* renamed from: L */
    public String f226419L;

    /* renamed from: M */
    public View.OnClickListener f226420M = null;

    /* renamed from: N */
    public List<MallOrderDetailObject.HelpCenter> f226421N = new LinkedList();

    public C77665j(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bar;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226417J == null) {
            this.f226417J = mo1087x(viewGroup);
        }
        mo1086w(this.f226417J);
        return this.f226417J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gme);
        linearLayout.removeAllViews();
        if (this.f226421N != null) {
            int size = (Util.isNullOrNil(this.f226419L) || this.f226420M == null) ? this.f226421N.size() - 1 : this.f226421N.size();
            if (size == 0) {
                size = -1;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f226421N.size(); i2++) {
                MallOrderDetailObject.HelpCenter helpCenter = this.f226421N.get(i2);
                TextView textView = new TextView(this.f121274d);
                textView.setTextColor(this.f121274d.getResources().getColor(C0966R.color.a7f));
                textView.setTextSize(0, (float) C76577a.m92157h(this.f121274d, C0966R.dimen.f3927j7));
                textView.setIncludeFontPadding(false);
                textView.setText(helpCenter.f202081d);
                textView.setTag(helpCenter);
                textView.setGravity(17);
                textView.setOnClickListener(this.f226418K);
                if (i == size) {
                    textView.setTextColor(this.f121274d.getResources().getColor(C0966R.color.f3536x0));
                }
                linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
                if (i < size) {
                    View view2 = new View(this.f121274d);
                    view2.setBackgroundColor(this.f121274d.getResources().getColor(C0966R.color.abr));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(C76577a.m92157h(this.f121274d, C0966R.dimen.f3696bq), -1));
                }
                i++;
            }
            if (!Util.isNullOrNil(this.f226419L) && this.f226420M != null) {
                TextView textView2 = new TextView(this.f121274d);
                textView2.setTextColor(this.f121274d.getResources().getColor(C0966R.color.a7f));
                textView2.setTextSize(0, (float) C76577a.m92157h(this.f121274d, C0966R.dimen.f3927j7));
                textView2.setIncludeFontPadding(false);
                textView2.setText(this.f226419L);
                textView2.setGravity(17);
                textView2.setOnClickListener(this.f226420M);
                if (i == size) {
                    textView2.setTextColor(this.f121274d.getResources().getColor(C0966R.color.f3536x0));
                }
                linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            }
        }
    }
}

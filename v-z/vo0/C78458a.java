package vo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: vo0.a */
public class C78458a extends LinearLayout {

    /* renamed from: d */
    public LinearLayout f229865d;

    /* renamed from: e */
    public Context f229866e;

    /* renamed from: f */
    public TextView f229867f = ((TextView) findViewById(C0966R.C0970id.f357845c22));

    /* renamed from: g */
    public ImageView f229868g = ((ImageView) findViewById(C0966R.C0970id.f15));

    /* renamed from: h */
    public ViewGroup f229869h = ((ViewGroup) findViewById(C0966R.C0970id.iwc));

    /* renamed from: i */
    public ViewGroup f229870i = ((ViewGroup) findViewById(C0966R.C0970id.erc));

    public C78458a(Context context, boolean z) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f360046cc3, this);
        this.f229866e = context;
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357785br0);
        this.f229865d = linearLayout;
        linearLayout.setOrientation(z ^ true ? 1 : 0);
    }

    public void addView(View view) {
        this.f229865d.addView(view);
    }

    public void setHasBorder(boolean z) {
        if (z) {
            this.f229869h.setBackground(this.f229866e.getDrawable(C0966R.C0969drawable.aus));
        } else {
            this.f229869h.setBackground((Drawable) null);
        }
    }

    public void setStep(C78459b bVar) {
        if (bVar == null) {
            this.f229867f.setText((CharSequence) null);
            this.f229868g.setImageDrawable((Drawable) null);
            this.f229870i.setVisibility(8);
            return;
        }
        this.f229867f.setText(bVar.f229871a);
        ImageView imageView = this.f229868g;
        int i = bVar.f229872b;
        imageView.setImageResource(i != -2 ? i != 0 ? i != 2 ? C0966R.C0969drawable.bql : C0966R.C0969drawable.bqk : C0966R.C0969drawable.bqm : C0966R.C0969drawable.bqn);
        this.f229870i.setVisibility(0);
    }
}

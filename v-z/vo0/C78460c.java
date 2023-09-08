package vo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: vo0.c */
public class C78460c extends LinearLayout {

    /* renamed from: d */
    public TextView f229873d = ((TextView) findViewById(C0966R.C0970id.f357845c22));

    /* renamed from: e */
    public ImageView f229874e = ((ImageView) findViewById(C0966R.C0970id.f15));

    public C78460c(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f360045cc2, this);
    }

    public void setStep(C78459b bVar) {
        if (bVar == null) {
            this.f229873d.setText((CharSequence) null);
            this.f229874e.setImageDrawable((Drawable) null);
            return;
        }
        this.f229873d.setText(bVar.f229871a);
        ImageView imageView = this.f229874e;
        int i = bVar.f229872b;
        imageView.setImageResource(i != -2 ? i != 0 ? i != 2 ? C0966R.C0969drawable.bql : C0966R.C0969drawable.bqk : C0966R.C0969drawable.bqm : C0966R.C0969drawable.bqn);
    }
}

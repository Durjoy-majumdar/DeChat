package nv2;

import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: nv2.i */
public class C21707i implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f61427a;

    /* renamed from: b */
    public final /* synthetic */ C21696b f61428b;

    public C21707i(C21696b bVar, CharSequence charSequence) {
        this.f61428b = bVar;
        this.f61427a = charSequence;
    }

    public void onAnimationEnd(Animation animation) {
        C21696b bVar = this.f61428b;
        bVar.f61411m.post(bVar.f61415q);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f61428b.f61410l.setImageResource(C0966R.C0969drawable.f357206c30);
        this.f61428b.f61411m.setText(this.f61427a);
        TextView textView = this.f61428b.f61411m;
        textView.setTextColor(textView.getResources().getColor(C0966R.color.f357000ak0));
        C21696b bVar = this.f61428b;
        bVar.f61411m.removeCallbacks(bVar.f61415q);
    }
}

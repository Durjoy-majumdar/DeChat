package cz2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: cz2.d */
public final class C75310d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75314h f221463d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f221464e;

    public C75310d(C75314h hVar, C60905o oVar) {
        this.f221463d = hVar;
        this.f221464e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75314h hVar = this.f221463d;
        C60905o oVar = this.f221464e;
        hVar.getClass();
        Context context = oVar.f173499A;
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.nqo);
        if (textView != null) {
            textView.setVisibility(8);
        }
        View D = oVar.mo85812D(C0966R.C0970id.nfp);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kyk);
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.f358515no2);
        View D2 = oVar.mo85812D(C0966R.C0970id.nnr);
        View D3 = oVar.mo85812D(C0966R.C0970id.ngm);
        viewGroup.setVisibility(0);
        if (D2 != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.42f, 1.0f, 1.42f, ((float) D2.getWidth()) * 0.5f, ((float) D2.getHeight()) * 0.5f);
            scaleAnimation.setInterpolator(hVar.f221470h);
            scaleAnimation.setDuration(hVar.f221469g);
            scaleAnimation.setFillEnabled(true);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setFillBefore(false);
            scaleAnimation.setAnimationListener(new C75313g());
            D2.startAnimation(scaleAnimation);
        }
        if (D3 != null) {
            D3.setOnClickListener(C7150a.f25125d);
        }
        ViewGroup viewGroup2 = (ViewGroup) oVar.mo85812D(C0966R.C0970id.nkg);
        if (viewGroup2 != null) {
            ViewPropertyAnimator animate = viewGroup2.animate();
            animate.setDuration(hVar.f221469g);
            animate.setInterpolator(hVar.f221470h);
            animate.setUpdateListener(new C7151b(hVar, context, viewGroup, D, D3));
            animate.setListener(new C75309c());
            animate.start();
        }
        ViewGroup viewGroup3 = (ViewGroup) oVar.mo85812D(C0966R.C0970id.nkh);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.kyk);
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

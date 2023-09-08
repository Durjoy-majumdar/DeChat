package com.tencent.p014mm.plugin.flash.test;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.test.FaceFlashTestAnimateUI */
public class FaceFlashTestAnimateUI extends MMActivity {

    /* renamed from: d */
    public TextView f198215d;

    /* renamed from: e */
    public WeImageView f198216e;

    /* renamed from: f */
    public ImageView f198217f;

    /* renamed from: g */
    public Button f198218g;

    /* renamed from: h */
    public Animation f198219h;

    /* renamed from: i */
    public Animation f198220i;

    /* renamed from: j */
    public Animation f198221j;

    /* renamed from: com.tencent.mm.plugin.flash.test.FaceFlashTestAnimateUI$a */
    public class C68981a implements View.OnClickListener {
        public C68981a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/flash/test/FaceFlashTestAnimateUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FaceFlashTestAnimateUI faceFlashTestAnimateUI = FaceFlashTestAnimateUI.this;
            faceFlashTestAnimateUI.f198215d.setText(C76577a.m92166q(faceFlashTestAnimateUI.getContext(), C0966R.string.ckx));
            faceFlashTestAnimateUI.f198217f.setImageResource(C0966R.C0969drawable.f4964sl);
            faceFlashTestAnimateUI.f198217f.startAnimation(faceFlashTestAnimateUI.f198219h);
            faceFlashTestAnimateUI.f198216e.setImageDrawable(C76577a.m92158i(faceFlashTestAnimateUI.getContext(), C0966R.raw.icons_filled_done3));
            faceFlashTestAnimateUI.f198216e.startAnimation(faceFlashTestAnimateUI.f198220i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/flash/test/FaceFlashTestAnimateUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.test.FaceFlashTestAnimateUI$b */
    public class C68982b implements View.OnClickListener {
        public C68982b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/flash/test/FaceFlashTestAnimateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FaceFlashTestAnimateUI faceFlashTestAnimateUI = FaceFlashTestAnimateUI.this;
            faceFlashTestAnimateUI.getClass();
            Log.m105924i("MicroMsg.FaceFlashTestAnimateUI", "showFailedAnimation");
            faceFlashTestAnimateUI.f198217f.setImageResource(C0966R.C0969drawable.f4962sj);
            faceFlashTestAnimateUI.f198217f.startAnimation(faceFlashTestAnimateUI.f198219h);
            faceFlashTestAnimateUI.f198216e.setImageDrawable(C76577a.m92158i(faceFlashTestAnimateUI.getContext(), C0966R.raw.icons_filled_error3));
            faceFlashTestAnimateUI.f198216e.startAnimation(faceFlashTestAnimateUI.f198221j);
            C117292a.m165361g(this, "com/tencent/mm/plugin/flash/test/FaceFlashTestAnimateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5r;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f198215d = (TextView) findViewById(C0966R.C0970id.cq4);
        this.f198216e = (WeImageView) findViewById(C0966R.C0970id.f357962cq2);
        this.f198218g = (Button) findViewById(C0966R.C0970id.cpx);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cpw);
        this.f198217f = (ImageView) findViewById(C0966R.C0970id.f357960cq0);
        this.f198219h = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2379bg);
        this.f198220i = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2381bi);
        this.f198221j = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2380bh);
        this.f198218g.setOnClickListener(new C68981a());
        findViewById(C0966R.C0970id.cpy).setOnClickListener(new C68982b());
    }
}

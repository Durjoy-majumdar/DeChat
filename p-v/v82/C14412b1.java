package v82;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p196ln.C76705f;

/* renamed from: v82.b1 */
public class C14412b1 implements View.OnClickListener {

    /* renamed from: d */
    public Context f39998d;

    /* renamed from: e */
    public LinearLayout f39999e;

    /* renamed from: f */
    public LinearLayout f40000f;

    /* renamed from: g */
    public LinearLayout f40001g;

    /* renamed from: h */
    public int f40002h = 0;

    /* renamed from: i */
    public int f40003i;

    /* renamed from: j */
    public int f40004j;

    /* renamed from: n */
    public int f40005n;

    /* renamed from: o */
    public int f40006o;

    /* renamed from: p */
    public int f40007p;

    /* renamed from: q */
    public int f40008q;

    /* renamed from: r */
    public int f40009r;

    public C14412b1(Activity activity) {
        int i = C111418b0.f333541b;
        this.f40005n = i;
        int i2 = C111418b0.f333540a;
        this.f40006o = i + i2;
        this.f40007p = (i * 2) + i2;
        this.f40008q = i * 4;
        int i3 = C111418b0.f333540a;
        Context baseContext = activity.getBaseContext();
        this.f39998d = baseContext;
        int A = C76577a.m92145A(baseContext) - (this.f40008q * 2);
        this.f40003i = (A - (this.f40006o * 10)) / 5;
        this.f40004j = (A - (this.f40007p * 10)) / 5;
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(C0966R.C0970id.a1z);
        this.f39999e = linearLayout;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        int i4 = this.f40005n;
        layoutParams.topMargin = i4 * 2;
        layoutParams.bottomMargin = i4 * 2;
        int i5 = this.f40008q;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i5;
        this.f39999e.setLayoutParams(layoutParams);
        this.f40000f = new LinearLayout(this.f39998d);
        this.f40001g = new LinearLayout(this.f39998d);
        this.f40000f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        this.f40001g.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this.f39998d);
        relativeLayout.addView(this.f40001g);
        relativeLayout.setLayoutParams(layoutParams3);
        this.f39999e.addView(this.f40000f);
        this.f39999e.addView(relativeLayout);
    }

    /* renamed from: a */
    public void mo13695a(String str) {
        this.f40002h++;
        ImageView imageView = new ImageView(this.f39998d);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setTag(str);
        imageView.setOnClickListener(this);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
        if (this.f40002h <= 5) {
            this.f40000f.addView(imageView);
        } else {
            this.f40001g.addView(imageView);
        }
        mo13698d(this.f40002h);
        mo13697c(this.f40002h);
    }

    /* renamed from: b */
    public void mo13696b(String str) {
        boolean z;
        boolean z2;
        if (this.f40002h != 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f40000f.getChildCount()) {
                    z = false;
                    break;
                } else if (this.f40000f.getChildAt(i2).getTag().equals(str)) {
                    i = i2;
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f40001g.getChildCount()) {
                        break;
                    } else if (this.f40001g.getChildAt(i3).getTag().equals(str)) {
                        i = i3;
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z2 = false;
            if (i >= 0) {
                if (z2) {
                    this.f40001g.removeViewAt(i);
                    this.f40002h--;
                }
                if (z) {
                    if (this.f40002h <= 5) {
                        this.f40000f.removeViewAt(i);
                        this.f40002h--;
                    } else {
                        this.f40000f.removeViewAt(i);
                        View childAt = this.f40001g.getChildAt(0);
                        this.f40001g.removeViewAt(0);
                        this.f40000f.addView(childAt);
                        this.f40002h--;
                    }
                }
                mo13698d(this.f40002h);
                mo13697c(this.f40002h);
            }
        }
    }

    /* renamed from: c */
    public final void mo13697c(int i) {
        int i2 = 0;
        if (i <= 5) {
            for (int i3 = 0; i3 < this.f40000f.getChildCount(); i3++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f40000f.getChildAt(i3).getLayoutParams();
                int i4 = this.f40003i;
                layoutParams.width = i4;
                layoutParams.height = i4;
                int i5 = this.f40006o;
                layoutParams.rightMargin = i5;
                layoutParams.leftMargin = i5;
            }
            while (i2 < this.f40001g.getChildCount()) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f40001g.getChildAt(i2).getLayoutParams();
                int i6 = this.f40004j;
                layoutParams2.width = i6;
                layoutParams2.height = i6;
                int i7 = this.f40006o;
                layoutParams2.rightMargin = i7;
                layoutParams2.leftMargin = i7;
                i2++;
            }
            return;
        }
        for (int i8 = 0; i8 < this.f40000f.getChildCount(); i8++) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f40000f.getChildAt(i8).getLayoutParams();
            int i9 = this.f40004j;
            layoutParams3.width = i9;
            layoutParams3.height = i9;
            int i15 = this.f40007p;
            layoutParams3.rightMargin = i15;
            layoutParams3.leftMargin = i15;
        }
        while (i2 < this.f40001g.getChildCount()) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f40001g.getChildAt(i2).getLayoutParams();
            int i16 = this.f40004j;
            layoutParams4.width = i16;
            layoutParams4.height = i16;
            int i17 = this.f40007p;
            layoutParams4.rightMargin = i17;
            layoutParams4.leftMargin = i17;
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo13698d(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f40000f.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40001g.getLayoutParams();
        if (i <= 5) {
            layoutParams.height = this.f40003i;
            this.f40001g.setVisibility(8);
            return;
        }
        layoutParams.height = this.f40004j;
        int i2 = this.f40005n;
        layoutParams.topMargin = i2 * 2;
        layoutParams.bottomMargin = i2 * 2;
        this.f40001g.setVisibility(0);
        layoutParams2.height = this.f40004j;
        int i3 = this.f40005n;
        layoutParams2.topMargin = i3 * 2;
        layoutParams2.bottomMargin = i3 * 2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSelectContactGallery", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40009r++;
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSelectContactGallery", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

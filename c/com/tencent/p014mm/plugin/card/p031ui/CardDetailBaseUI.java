package com.tencent.p014mm.plugin.card.p031ui;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailBaseUI */
public abstract class CardDetailBaseUI extends MMActivity {

    /* renamed from: d */
    public View f12120d;

    /* renamed from: e */
    public ImageView f12121e;

    /* renamed from: f */
    public TextView f12122f;

    /* renamed from: g */
    public TextView f12123g;

    /* renamed from: h */
    public View f12124h;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailBaseUI$a */
    public class C2150a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem.OnMenuItemClickListener f12125d;

        public C2150a(CardDetailBaseUI cardDetailBaseUI, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f12125d = onMenuItemClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f12125d;
            if (onMenuItemClickListener != null) {
                onMenuItemClickListener.onMenuItemClick((MenuItem) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public boolean noActionBar() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6704m_, (ViewGroup) null);
        this.f12120d = inflate;
        inflate.setBackgroundColor(getResources().getColor(C0966R.color.f3008c5));
        this.f12122f = (TextView) this.f12120d.findViewById(C0966R.C0970id.ko4);
        this.f12123g = (TextView) this.f12120d.findViewById(C0966R.C0970id.k9n);
        this.f12121e = (ImageView) this.f12120d.findViewById(C0966R.C0970id.f6148yn);
        ImageView imageView = (ImageView) this.f12120d.findViewById(C0966R.C0970id.gs5);
        this.f12124h = this.f12120d.findViewById(C0966R.C0970id.c7p);
        if (getContentView() != null && ((ViewGroup) getContentView()).getChildCount() > 0) {
            View childAt = ((ViewGroup) getContentView()).getChildAt(0);
            ((ViewGroup) getContentView()).removeView(childAt);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            linearLayout.setOrientation(1);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            linearLayout.addView(this.f12120d, new LinearLayout.LayoutParams(-1, displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(C0966R.dimen.f3678b8) : getResources().getDimensionPixelSize(C0966R.dimen.f3679b9)));
            linearLayout.addView(childAt);
            ((ViewGroup) getContentView()).addView(linearLayout);
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12121e.setOnClickListener(new C2150a(this, onMenuItemClickListener));
    }

    public void setMMSubTitle(String str) {
        this.f12123g.setText(str);
    }

    public void setMMTitle(String str) {
        this.f12122f.setText(str);
    }

    public void setMMTitleColor(int i) {
        this.f12122f.setTextColor(i);
    }
}

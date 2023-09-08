package com.tencent.p014mm.plugin.wallet_payu.create.p807ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMAutoHeightViewPager;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import java.util.ArrayList;
import t63.C77874a;
import u63.C78132a;

/* renamed from: com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView */
public class WalletPayUOpenIntroView extends LinearLayout {

    /* renamed from: d */
    public MMAutoHeightViewPager f211159d;

    /* renamed from: e */
    public MMPageControlView f211160e;

    /* renamed from: f */
    public ArrayList<View> f211161f;

    /* renamed from: g */
    public Context f211162g;

    /* renamed from: h */
    public C77874a[] f211163h;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView$a */
    public class C72582a extends C103853a {
        public C72582a(C78132a aVar) {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(WalletPayUOpenIntroView.this.f211161f.get(i));
        }

        public int getCount() {
            C77874a[] aVarArr = WalletPayUOpenIntroView.this.f211163h;
            if (aVarArr == null) {
                return 0;
            }
            return aVarArr.length;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = WalletPayUOpenIntroView.this.f211161f.get(i);
            viewGroup.addView(view);
            C77874a aVar = WalletPayUOpenIntroView.this.f211163h[i];
            ((ImageView) view.findViewById(C0966R.C0970id.g6j)).setImageResource(aVar.f226897a);
            ((TextView) view.findViewById(C0966R.C0970id.km5)).setText(aVar.f226898b);
            ((TextView) view.findViewById(C0966R.C0970id.ew5)).setText(aVar.f226899c);
            return view;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public WalletPayUOpenIntroView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f211162g = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bmk, this, true);
        this.f211159d = (MMAutoHeightViewPager) inflate.findViewById(C0966R.C0970id.hqu);
        MMPageControlView mMPageControlView = (MMPageControlView) inflate.findViewById(C0966R.C0970id.bsz);
        this.f211160e = mMPageControlView;
        mMPageControlView.setVisibility(0);
        this.f211159d.setOnPageChangeListener(new C78132a(this));
    }

    public void setPagerData(C77874a[] aVarArr) {
        this.f211163h = aVarArr;
        this.f211161f = new ArrayList<>();
        if (this.f211163h != null) {
            for (int i = 0; i < this.f211163h.length; i++) {
                this.f211161f.add(LayoutInflater.from(this.f211162g).inflate(C0966R.C0971layout.bml, (ViewGroup) null));
            }
        }
        this.f211159d.setAdapter(new C72582a((C78132a) null));
        MMPageControlView mMPageControlView = this.f211160e;
        C77874a[] aVarArr2 = this.f211163h;
        mMPageControlView.f284231e = aVarArr2 == null ? 0 : aVarArr2.length;
        mMPageControlView.mo131771a(0);
    }

    public WalletPayUOpenIntroView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}

package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C76865k;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter */
public class MPSmileyFooter extends InputPanelLinearLayout {

    /* renamed from: f */
    public Context f119807f;

    /* renamed from: g */
    public ChatFooterPanel f119808g;

    /* renamed from: h */
    public MMEditText f119809h = null;

    /* renamed from: i */
    public WeImageView f119810i;

    /* renamed from: j */
    public LinearLayout f119811j;

    /* renamed from: n */
    public int f119812n = -1;

    /* renamed from: o */
    public int f119813o = 0;

    /* renamed from: p */
    public int f119814p = 0;

    /* renamed from: q */
    public boolean f119815q = false;

    /* renamed from: r */
    public MMActivity f119816r;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter$a */
    public class C44215a implements View.OnClickListener {
        public C44215a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (MPSmileyFooter.this.getVisibility() == 8) {
                MPSmileyFooter.this.setVisibility(0);
            }
            if (MPSmileyFooter.this.mo68901d()) {
                MPSmileyFooter mPSmileyFooter = MPSmileyFooter.this;
                mPSmileyFooter.f119808g.mo100196h();
                mPSmileyFooter.f119808g.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter$b */
    public class C44216b implements TextView.OnEditorActionListener {
        public C44216b(MPSmileyFooter mPSmileyFooter) {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    public MPSmileyFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119807f = context;
    }

    /* renamed from: b */
    public static void m48508b(MPSmileyFooter mPSmileyFooter) {
        if (mPSmileyFooter.f119808g.getVisibility() == 8) {
            mPSmileyFooter.getActivity().hideVKB();
            mPSmileyFooter.f119808g.mo100197i();
            if (KeyBoardUtil.getScreenOrientation(mPSmileyFooter.f119807f) != 2 || !mPSmileyFooter.f119815q) {
                mPSmileyFooter.mo68902e();
            }
            mPSmileyFooter.f119808g.setVisibility(0);
            mPSmileyFooter.f119809h.requestFocus();
            mPSmileyFooter.f119810i.setImageResource(mPSmileyFooter.mo68900c(C0966R.attr.f2751hb));
            return;
        }
        mPSmileyFooter.f119809h.requestFocus();
        mPSmileyFooter.f119808g.mo100196h();
        mPSmileyFooter.f119808g.setVisibility(8);
        mPSmileyFooter.getActivity().showVKB();
        mPSmileyFooter.f119810i.setImageResource(mPSmileyFooter.mo68900c(C0966R.attr.f2752hc));
    }

    private MMActivity getActivity() {
        if (this.f119816r == null) {
            Context context = this.f119807f;
            if (context instanceof MMActivity) {
                this.f119816r = (MMActivity) context;
            } else {
                while (!(context instanceof MMActivity) && (context instanceof ContextWrapper)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                this.f119816r = (MMActivity) context;
            }
        }
        return this.f119816r;
    }

    /* renamed from: c */
    public final int mo68900c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f119807f.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public boolean mo68901d() {
        return this.f119808g.getVisibility() == 0;
    }

    /* renamed from: e */
    public final void mo68902e() {
        ViewGroup.LayoutParams layoutParams = this.f119811j.getLayoutParams();
        layoutParams.height = this.f119813o + this.f119814p;
        this.f119811j.setLayoutParams(layoutParams);
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f119808g.setPortHeightPx(validPanelHeight);
        this.f119808g.mo100190c();
        ViewGroup.LayoutParams layoutParams2 = this.f119808g.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = validPanelHeight;
        }
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        super.mo1072i0(z, i);
        if (this.f119813o != i && i != 0) {
            this.f119813o = i;
            C76865k.m92671b(getContext(), i);
            mo68902e();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f119808g != null) {
            mo68902e();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f119812n;
        if (i5 >= i4) {
            i4 = i5;
        }
        this.f119812n = i4;
    }

    public void setExtraAddHeight(int i) {
        this.f119814p = i;
    }

    public void setFobbidenWhenLandscape(boolean z) {
        this.f119815q = z;
    }

    public void setMMEditText(MMEditText mMEditText) {
        this.f119809h = mMEditText;
        mMEditText.setOnClickListener(new C44215a());
        mMEditText.setOnEditorActionListener(new C44216b(this));
    }

    public void setSmileHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f119811j.getLayoutParams();
        layoutParams.height = i;
        this.f119811j.setLayoutParams(layoutParams);
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f119808g.setPortHeightPx(validPanelHeight);
        this.f119808g.mo100190c();
        ViewGroup.LayoutParams layoutParams2 = this.f119808g.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = validPanelHeight;
        }
    }
}

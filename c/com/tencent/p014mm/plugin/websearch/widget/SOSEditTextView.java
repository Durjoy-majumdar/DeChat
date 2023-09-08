package com.tencent.p014mm.plugin.websearch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43959b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSSOSHomeWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.websearch.widget.SOSEditTextView */
public class SOSEditTextView extends FTSEditTextView {

    /* renamed from: I */
    public View f117494I;

    /* renamed from: J */
    public TextView f117495J;

    /* renamed from: K */
    public boolean f117496K = false;

    /* renamed from: L */
    public View f117497L;

    /* renamed from: M */
    public C43473b f117498M;

    /* renamed from: N */
    public boolean f117499N = false;

    /* renamed from: P */
    public boolean f117500P = false;

    /* renamed from: Q */
    public C43474c f117501Q;

    /* renamed from: R */
    public int f117502R;

    /* renamed from: com.tencent.mm.plugin.websearch.widget.SOSEditTextView$a */
    public class C43472a implements View.OnClickListener {
        public C43472a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (SOSEditTextView.this.getEditText() != null) {
                SOSEditTextView.this.getEditText().requestFocus();
                SOSEditTextView.this.mo70360p();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.widget.SOSEditTextView$b */
    public interface C43473b {
    }

    /* renamed from: com.tencent.mm.plugin.websearch.widget.SOSEditTextView$c */
    public interface C43474c {
    }

    public SOSEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo67636b() {
        return !this.f122149B && this.f122170v == 2;
    }

    public View getCancelTextView() {
        return this.f117495J;
    }

    public View getSearchBarCancelTextContainer() {
        return this.f117497L;
    }

    public int getSearchBarCancelTextContainerMaxWidth() {
        int max = Math.max(getSearchBarCancelTextContainer().getMeasuredWidth(), this.f117502R);
        this.f117502R = max;
        return max;
    }

    public View getVoiceImageButton() {
        return this.f117494I;
    }

    /* renamed from: h */
    public void mo67641h(int i) {
        int i2 = this.f122170v;
        if (i2 == 0) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.crh, this, true);
        } else if (i2 == 1 || i2 == 3) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cri, this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.crk, this, true);
        }
    }

    /* renamed from: i */
    public void mo67642i(AttributeSet attributeSet) {
        super.mo67642i(attributeSet);
        this.f117494I = findViewById(C0966R.C0970id.bkg);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.la7);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359363ki1);
        this.f117495J = textView;
        textView.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        this.f117497L = findViewById(C0966R.C0970id.j4s);
        getEditText().setOnFocusChangeListener((View.OnFocusChangeListener) null);
        getEditText().setHintTextColor(getResources().getColor(C0966R.color.a15));
        getEditText().setTextColor(getResources().getColor(C0966R.color.a7f));
        if (getIconView() != null) {
            getIconView().setOnClickListener(new C43472a());
        }
        this.f117502R = Math.max(getSearchBarCancelTextContainer().getMeasuredWidth(), (int) getResources().getDimension(C0966R.dimen.f3759jw));
    }

    public void setCameraBtnClickListener(View.OnClickListener onClickListener) {
        View view = this.f117494I;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setCancelBtnForceHide(boolean z) {
        this.f117499N = z;
    }

    public void setCancelTextViewCallback(C43473b bVar) {
        this.f117498M = bVar;
    }

    public void setCancelTextViewClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f117495J;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setCancelTextViewVisibile(int i) {
        TextView textView = this.f117495J;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public void setCancelVisableChangeListener(C43474c cVar) {
        this.f117501Q = cVar;
    }

    public void setCommonRightBtnForceHide(boolean z) {
        this.f117500P = z;
    }

    public void setCommonRightImageButtonVisibile(int i) {
        View view = this.f117494I;
        if (view != null) {
            int i2 = 8;
            if (this.f117496K) {
                i = 8;
            }
            if (!this.f117500P) {
                i2 = i;
            } else if (view.getVisibility() == 8) {
                return;
            }
            View view2 = this.f117494I;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setNeedForceHideCameraIcon(boolean z) {
        this.f117496K = z;
    }

    public void setSearchBarCancelTextContainerVisibile(int i) {
        View view = this.f117497L;
        if (view != null) {
            if (this.f117499N) {
                if (view.getVisibility() == 8) {
                    Log.m105924i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， return");
                    return;
                } else {
                    Log.m105924i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， set Gone");
                    i = 8;
                }
            }
            View view2 = this.f117497L;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z = false;
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C43473b bVar = this.f117498M;
            if (bVar != null) {
                View view3 = this.f117497L;
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                baseSOSWebViewUI.getClass();
                view3.postDelayed(new C43959b(baseSOSWebViewUI, i, view3), 0);
            }
            C43474c cVar = this.f117501Q;
            if (cVar != null) {
                FTSSOSHomeWebViewUI.C43931j jVar = (FTSSOSHomeWebViewUI.C43931j) cVar;
                Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateActionDonePos, visibility = " + i + "， hasHappenQuery = " + FTSSOSHomeWebViewUI.this.f119011m4);
                FTSSOSHomeWebViewUI.this.mo68517Ga();
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                if (!(!fTSSOSHomeWebViewUI.f119011m4 && !fTSSOSHomeWebViewUI.f118803D3) && fTSSOSHomeWebViewUI.f118812u3.getSearchBarCancelTextContainer() != null) {
                    SOSEditTextView sOSEditTextView = FTSSOSHomeWebViewUI.this.f118812u3;
                    if (sOSEditTextView.getSearchBarCancelTextContainer().getVisibility() == 0) {
                        z = true;
                    }
                    sOSEditTextView.mo70362r(z);
                }
            }
        }
    }

    public void setVoiceBtnClickListener(View.OnClickListener onClickListener) {
        View view = this.f117494I;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public SOSEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

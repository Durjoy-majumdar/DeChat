package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43669q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import da3.C45314a;
import da3.C45315b;
import da3.C45316c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter */
public final class WebViewInputFooter extends LinearLayout {

    /* renamed from: d */
    public C44284c f119982d;

    /* renamed from: e */
    public C44282a f119983e;

    /* renamed from: f */
    public C44283b f119984f;

    /* renamed from: g */
    public int f119985g = 0;

    /* renamed from: h */
    public WebViewSmileyPanel f119986h;

    /* renamed from: i */
    public View f119987i;

    /* renamed from: j */
    public View f119988j;

    /* renamed from: n */
    public View f119989n;

    /* renamed from: o */
    public MMEditText f119990o;

    /* renamed from: p */
    public ImageButton f119991p;

    /* renamed from: q */
    public LinearLayout f119992q;

    /* renamed from: r */
    public MMActivity f119993r;

    /* renamed from: s */
    public boolean f119994s;

    /* renamed from: t */
    public int f119995t = Integer.MAX_VALUE;

    /* renamed from: u */
    public boolean f119996u = true;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter$a */
    public interface C44282a {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter$b */
    public interface C44283b {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter$c */
    public interface C44284c {
    }

    public WebViewInputFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MMActivity mMActivity = (MMActivity) context;
        this.f119993r = mMActivity;
        ViewGroup viewGroup = (ViewGroup) View.inflate(mMActivity, C0966R.C0971layout.f360069ci0, this);
        this.f119992q = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.lmj);
        this.f119988j = viewGroup.findViewById(C0966R.C0970id.lmn);
        this.f119989n = viewGroup.findViewById(C0966R.C0970id.lmm);
        this.f119987i = viewGroup.findViewById(C0966R.C0970id.lmo);
        this.f119990o = (MMEditText) viewGroup.findViewById(C0966R.C0970id.lmk);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.lmq);
        this.f119991p = imageButton;
        imageButton.setOnClickListener(new C45314a(this));
        this.f119990o.setOnTouchListener(new C45315b(this));
        WebViewSmileyPanel webViewSmileyPanel = new WebViewSmileyPanel(getContext());
        this.f119986h = webViewSmileyPanel;
        webViewSmileyPanel.setVisibility(8);
        this.f119986h.setBackgroundResource(C0966R.C0969drawable.b3z);
        this.f119986h.setOnTextOperationListener(new C44299a(this));
        ((LinearLayout) findViewById(C0966R.C0970id.iwc)).addView(this.f119986h, -1, 0);
        this.f119989n.setOnClickListener(new C44300b(this));
        this.f119990o.addTextChangedListener(new C45316c(this));
    }

    /* renamed from: a */
    public void mo68983a() {
        setVisibility(8);
        MMActivity mMActivity = this.f119993r;
        if (mMActivity != null) {
            MMEditText mMEditText = this.f119990o;
            if (mMEditText != null) {
                mMActivity.hideVKB(mMEditText);
            }
            this.f119993r.hideVKB();
        }
        this.f119985g = 0;
        mo68984b();
        MMEditText mMEditText2 = this.f119990o;
        if (mMEditText2 != null) {
            mMEditText2.clearFocus();
            this.f119990o.setFocusable(false);
            this.f119990o.setFocusableInTouchMode(false);
        }
    }

    /* renamed from: b */
    public final void mo68984b() {
        C44283b bVar = this.f119984f;
        if (bVar != null) {
            C43669q qVar = (C43669q) bVar;
            WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = qVar.f118038a.f117952v;
            if (webViewKeyboardLinearLayout != null && webViewKeyboardLinearLayout.getKeyBoardHeight() > 0) {
                C43658n nVar = qVar.f118038a;
                int keyBoardHeight = nVar.f117952v.getKeyBoardHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nVar.f117953w.getLayoutParams();
                if (marginLayoutParams.bottomMargin != keyBoardHeight) {
                    marginLayoutParams.bottomMargin = keyBoardHeight;
                    nVar.f117953w.setLayoutParams(marginLayoutParams);
                }
            }
        }
        this.f119986h.getClass();
        this.f119986h.setVisibility(8);
        this.f119991p.setImageResource(C0966R.raw.icons_outlined_emoji);
        this.f119985g = 0;
    }

    /* renamed from: c */
    public final int mo68985c() {
        C44283b bVar = this.f119984f;
        if (bVar != null) {
            C43658n nVar = ((C43669q) bVar).f118038a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nVar.f117953w.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                nVar.f117953w.setLayoutParams(marginLayoutParams);
            }
        }
        MMEditText mMEditText = this.f119990o;
        if (mMEditText != null) {
            this.f119993r.hideVKB(mMEditText);
        }
        this.f119986h.getClass();
        this.f119986h.setVisibility(0);
        View view = this.f119986h.f120039h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup.LayoutParams layoutParams = this.f119986h.getLayoutParams();
        if (layoutParams != null && this.f119996u) {
            layoutParams.height = KeyBoardUtil.getValidPanelHeight(getContext());
            this.f119986h.setLayoutParams(layoutParams);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public boolean isShown() {
        return getVisibility() == 0;
    }

    public void onDetachedFromWindow() {
        MMActivity mMActivity;
        super.onDetachedFromWindow();
        MMEditText mMEditText = this.f119990o;
        if (mMEditText != null) {
            mMEditText.clearFocus();
            this.f119990o.setFocusable(false);
            this.f119990o.setFocusableInTouchMode(false);
        }
        MMEditText mMEditText2 = this.f119990o;
        if (!(mMEditText2 == null || (mMActivity = this.f119993r) == null)) {
            mMActivity.hideVKB(mMEditText2);
        }
        this.f119990o = null;
        WebViewSmileyPanel webViewSmileyPanel = this.f119986h;
        C44304e eVar = webViewSmileyPanel.f120037f;
        eVar.f120055a = null;
        eVar.f120056b = null;
        View view = webViewSmileyPanel.f120039h;
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(webViewSmileyPanel.f120039h);
            ((ViewGroup) webViewSmileyPanel.f120039h).removeAllViews();
            webViewSmileyPanel.f120039h = null;
        }
        webViewSmileyPanel.f120038g = null;
        removeAllViews();
        this.f119993r = null;
        this.f119982d = null;
    }

    public void setMaxCount(int i) {
        if (i > 0) {
            this.f119995t = i;
        }
    }

    public void setOnSmileyChosenListener(C44282a aVar) {
        this.f119983e = aVar;
    }

    public void setOnSmileyPanelVisibilityChangedListener(C44283b bVar) {
        this.f119984f = bVar;
    }

    public void setOnTextSendListener(C44284c cVar) {
        this.f119982d = cVar;
    }

    public void setText(String str) {
        this.f119990o.setText("");
        if (!Util.isNullOrNil(str)) {
            try {
                this.f119990o.append(str);
            } catch (Exception e) {
                Log.m105919d("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e);
            }
            Log.m105919d("MicroMsg.WebViewInputFooter", "after setText, editText.getText() = %s", this.f119990o.getText());
        }
    }
}

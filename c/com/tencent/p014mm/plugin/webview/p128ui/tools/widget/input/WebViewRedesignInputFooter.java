package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$g;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C72953u;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import k20.C60958c;
import k20.C9556a;
import p248ug.C78160t0;
import qn3.C77382c;
import vl3.C102226d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter */
public class WebViewRedesignInputFooter extends LinearLayout {

    /* renamed from: A */
    public static final /* synthetic */ int f119997A = 0;

    /* renamed from: d */
    public C44292h f119998d;

    /* renamed from: e */
    public C44291g f119999e;

    /* renamed from: f */
    public View f120000f;

    /* renamed from: g */
    public int f120001g = 0;

    /* renamed from: h */
    public ChatFooterPanel f120002h;

    /* renamed from: i */
    public View f120003i;

    /* renamed from: j */
    public Button f120004j;

    /* renamed from: n */
    public Button f120005n;

    /* renamed from: o */
    public MMEditText f120006o;

    /* renamed from: p */
    public ImageButton f120007p;

    /* renamed from: q */
    public View f120008q;

    /* renamed from: r */
    public ViewGroup f120009r;

    /* renamed from: s */
    public TextView f120010s;

    /* renamed from: t */
    public WebViewKeyboardLinearLayout f120011t;

    /* renamed from: u */
    public FrameLayout f120012u;

    /* renamed from: v */
    public MMActivity f120013v;

    /* renamed from: w */
    public boolean f120014w;

    /* renamed from: x */
    public View f120015x;

    /* renamed from: y */
    public int f120016y = Integer.MAX_VALUE;

    /* renamed from: z */
    public int f120017z = Integer.MAX_VALUE;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$a */
    public class C44285a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f120018d;

        public C44285a(View view) {
            this.f120018d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f120018d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("MicroMsg.WebViewInputFooter", "keyboard hide inputShadowView");
            WebViewRedesignInputFooter.this.mo68994b();
            WebViewRedesignInputFooter webViewRedesignInputFooter = WebViewRedesignInputFooter.this;
            webViewRedesignInputFooter.f120006o.clearComposingText();
            webViewRedesignInputFooter.f120006o.setText("");
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$b */
    public class C44286b implements View.OnClickListener {
        public C44286b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewRedesignInputFooter webViewRedesignInputFooter = WebViewRedesignInputFooter.this;
            if (webViewRedesignInputFooter.f120001g == 0) {
                webViewRedesignInputFooter.f120001g = 1;
                Log.m105924i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, hideVKB");
                WebViewRedesignInputFooter.this.f120013v.hideVKB();
                WebViewRedesignInputFooter webViewRedesignInputFooter2 = WebViewRedesignInputFooter.this;
                if (!webViewRedesignInputFooter2.f120014w) {
                    webViewRedesignInputFooter2.f120006o.requestFocus();
                }
                WebViewRedesignInputFooter.this.mo69007j();
            } else {
                webViewRedesignInputFooter.f120001g = 0;
                webViewRedesignInputFooter.f120006o.requestFocus();
                Log.m105924i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, showVKB");
                WebViewRedesignInputFooter.this.mo69005i();
                WebViewRedesignInputFooter.this.mo68995c(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$c */
    public class C44287c implements View.OnClickListener {
        public C44287c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewRedesignInputFooter webViewRedesignInputFooter = WebViewRedesignInputFooter.this;
            C77382c b = C77382c.m93286b(webViewRedesignInputFooter.f120006o);
            int i = webViewRedesignInputFooter.f120016y;
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            b.f225611e = 0;
            b.f225610d = i;
            b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_3;
            b.f225607a = true;
            b.mo107499d(new C44302c(webViewRedesignInputFooter));
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$d */
    public class C44288d implements TextWatcher {
        public C44288d() {
        }

        public void afterTextChanged(Editable editable) {
            if (WebViewRedesignInputFooter.this.f120006o.getText() != null) {
                WebViewRedesignInputFooter.this.f120006o.requestFocus();
                boolean z = editable.length() > 0 && editable.toString().trim().length() > 0;
                WebViewRedesignInputFooter webViewRedesignInputFooter = WebViewRedesignInputFooter.this;
                Animation loadAnimation = AnimationUtils.loadAnimation(webViewRedesignInputFooter.getContext(), C0966R.C0968anim.f2456di);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(webViewRedesignInputFooter.getContext(), C0966R.C0968anim.f2461dn);
                loadAnimation.setDuration(150);
                loadAnimation2.setDuration(150);
                Button button = webViewRedesignInputFooter.f120004j;
                if (button != null && webViewRedesignInputFooter.f120005n != null) {
                    if (z) {
                        if (button.getVisibility() != 8 && webViewRedesignInputFooter.f120004j.getVisibility() != 4) {
                            webViewRedesignInputFooter.f120005n.startAnimation(loadAnimation);
                            webViewRedesignInputFooter.f120005n.setVisibility(0);
                            webViewRedesignInputFooter.f120004j.startAnimation(loadAnimation2);
                            webViewRedesignInputFooter.f120004j.setVisibility(8);
                        } else {
                            return;
                        }
                    } else if (button.getVisibility() != 0 && webViewRedesignInputFooter.f120004j.getVisibility() != 0) {
                        webViewRedesignInputFooter.f120004j.startAnimation(loadAnimation);
                        webViewRedesignInputFooter.f120004j.setVisibility(0);
                        webViewRedesignInputFooter.f120005n.startAnimation(loadAnimation2);
                        webViewRedesignInputFooter.f120005n.setVisibility(8);
                    } else {
                        return;
                    }
                    webViewRedesignInputFooter.f120005n.getParent().requestLayout();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$e */
    public class C44289e extends C45078p0 {
        public C44289e(int i, C45078p0.C45079a aVar) {
            super(i, aVar);
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String str;
            if (charSequence == null) {
                return "";
            }
            String obj = spanned.toString();
            C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_3;
            int e = C45078p0.m49926e(obj, aVar);
            if (!Util.isNullOrNil(charSequence) || i3 >= i4) {
                str = spanned.toString() + charSequence.toString();
            } else {
                str = spanned.toString().substring(0, i3) + spanned.toString().substring(i4);
            }
            int e2 = C45078p0.m49926e(str, aVar);
            WebViewRedesignInputFooter webViewRedesignInputFooter = WebViewRedesignInputFooter.this;
            int i5 = webViewRedesignInputFooter.f120016y;
            int i6 = i5 - webViewRedesignInputFooter.f120017z;
            if (i6 > i5 || i6 <= 0) {
                i6 = i5;
            }
            if (e2 >= i5) {
                String safeFormatString = Util.safeFormatString(webViewRedesignInputFooter.f120013v.getString(C0966R.string.lfp), Integer.valueOf(WebViewRedesignInputFooter.this.f120016y));
                WebViewRedesignInputFooter.this.f120010s.setVisibility(0);
                WebViewRedesignInputFooter.this.f120010s.setText(safeFormatString);
                int max = Math.max(i5 - e, 0);
                if (max != 0) {
                    if (max <= 0 || e2 <= max) {
                        return charSequence;
                    }
                    CharSequence a = C102226d.m134696a(WebViewRedesignInputFooter.this.getContext(), charSequence.toString());
                    if (!Util.isNullOrNil(a)) {
                        String charSequence2 = a.toString();
                        int i7 = 0;
                        int i8 = 0;
                        for (int i9 = 0; i9 < charSequence2.length(); i9++) {
                            i7 += charSequence2.charAt(i9) <= 127 ? 1 : 2;
                            if ((i7 % 2 != 0 ? (i7 + 1) / 2 : i7 / 2) > max) {
                                break;
                            }
                            i8 = i9;
                        }
                        if (i8 < charSequence2.length()) {
                            i8++;
                        }
                        try {
                            if (a instanceof SpannableString) {
                                C72953u[] uVarArr = (C72953u[]) ((SpannableString) a).getSpans(0, a.length(), C72953u.class);
                                int length = uVarArr.length;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < length) {
                                        C72953u uVar = uVarArr[i15];
                                        int i16 = uVar.f212637g;
                                        if (i8 < i16 && i8 >= uVar.f212636f) {
                                            i8 = i16;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        return a.subSequence(0, i8);
                    }
                }
                return "";
            } else if (e2 > i6) {
                webViewRedesignInputFooter.f120010s.setVisibility(0);
                WebViewRedesignInputFooter.this.f120010s.setText(Util.safeFormatString(WebViewRedesignInputFooter.this.f120013v.getString(C0966R.string.lfo), Integer.valueOf(i5 - e2)));
                return charSequence;
            } else {
                webViewRedesignInputFooter.f120010s.setVisibility(8);
                return charSequence;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$f */
    public static class C44290f implements Interpolator {
        public float getInterpolation(float f) {
            if (f > 0.0f) {
                int i = WebViewRedesignInputFooter.f119997A;
                if (((double) f) < 0.5d) {
                    return 0.0f;
                }
            }
            double d = (double) f;
            int i2 = WebViewRedesignInputFooter.f119997A;
            float f2 = 1.0f - ((float) (d * (1.0d - ((1.0d - d) / 0.5d))));
            return 1.0f - (f2 * f2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$g */
    public interface C44291g {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter$h */
    public interface C44292h {
    }

    public WebViewRedesignInputFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120013v = (MMActivity) context;
        mo68999g();
    }

    /* renamed from: a */
    public void mo68993a(String str) {
        if (str != null) {
            if (C45078p0.m49928g(this.f120006o.getText() + str) <= this.f120016y) {
                this.f120006o.mo98046o(str);
            }
        }
    }

    /* renamed from: b */
    public void mo68994b() {
        Log.m105924i("MicroMsg.WebViewInputFooter", "hide all");
        View view = this.f120000f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setVisibility(8);
        String str = "";
        MMActivity mMActivity = this.f120013v;
        if (mMActivity != null) {
            MMEditText mMEditText = this.f120006o;
            if (mMEditText != null) {
                mMActivity.hideVKB(mMEditText);
                str = this.f120006o.getText().toString();
            }
            this.f120013v.hideVKB();
        }
        this.f120001g = 0;
        mo68995c(true);
        mo68997e();
        C44292h hVar = this.f119998d;
        if (hVar != null) {
            ((WebViewUI$$g) hVar).mo68333a(str);
        }
    }

    /* renamed from: c */
    public final void mo68995c(boolean z) {
        this.f120007p.setImageResource(C0966R.raw.icons_outlined_emoji);
        this.f120001g = 0;
        ChatFooterPanel chatFooterPanel = this.f120002h;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(8);
        }
        if (z) {
            View view = this.f120015x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public final void mo68996d(Map<String, String> map) {
        boolean equals = Objects.equals(map.get("switchToSmile"), "true");
        this.f120014w = false;
        if (!equals) {
            MMEditText mMEditText = this.f120006o;
            if (mMEditText != null) {
                mMEditText.setFocusable(true);
                this.f120006o.setFocusableInTouchMode(true);
                this.f120006o.requestFocus();
            }
            Log.m105924i("MicroMsg.WebViewInputFooter", "showVKB");
            mo69005i();
            this.f120001g = 0;
            return;
        }
        this.f120001g = 1;
        this.f120013v.hideVKB();
        Log.m105924i("MicroMsg.WebViewInputFooter", "hideVKB and show smiley");
        if (!this.f120014w) {
            this.f120006o.requestFocus();
        }
        mo69007j();
    }

    /* renamed from: e */
    public void mo68997e() {
        MMEditText mMEditText = this.f120006o;
        if (mMEditText != null) {
            mMEditText.clearFocus();
            this.f120006o.setFocusable(false);
            this.f120006o.setFocusableInTouchMode(false);
        }
    }

    /* renamed from: f */
    public int mo68998f(int i, boolean z) {
        View view;
        ViewGroup.LayoutParams layoutParams = this.f120012u.getLayoutParams();
        if (layoutParams != null) {
            if (i != 0) {
                layoutParams.height = i;
            } else {
                WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f120011t;
                if (webViewKeyboardLinearLayout == null || webViewKeyboardLinearLayout.getKeyBoardHeight() <= 0) {
                    layoutParams.height = KeyBoardUtil.getValidPanelHeight(getContext());
                } else {
                    layoutParams.height = this.f120011t.getKeyBoardHeight();
                }
            }
            ChatFooterPanel chatFooterPanel = this.f120002h;
            if (chatFooterPanel != null) {
                ViewGroup.LayoutParams layoutParams2 = chatFooterPanel.getLayoutParams();
                layoutParams2.height = layoutParams.height;
                this.f120002h.setLayoutParams(layoutParams2);
            }
            this.f120012u.setLayoutParams(layoutParams);
        }
        if (z && this.f120008q.getTag() != null && this.f120008q.getTag().equals("writeMessage") && this.f120012u.getHeight() == 0 && (view = this.f120008q) != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new C44290f());
            alphaAnimation.setDuration(600);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.startAnimation(alphaAnimation);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    /* renamed from: g */
    public void mo68999g() {
        removeAllViews();
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f120013v, C0966R.C0971layout.f360072ci3, this);
        this.f120009r = viewGroup;
        this.f120008q = viewGroup.findViewById(C0966R.C0970id.lmj);
        this.f120004j = (Button) this.f120009r.findViewById(C0966R.C0970id.lmn);
        this.f120005n = (Button) this.f120009r.findViewById(C0966R.C0970id.lmm);
        this.f120003i = this.f120009r.findViewById(C0966R.C0970id.lmo);
        this.f120006o = (MMEditText) this.f120009r.findViewById(C0966R.C0970id.lmk);
        this.f120010s = (TextView) this.f120009r.findViewById(C0966R.C0970id.ln9);
        this.f120007p = (ImageButton) this.f120009r.findViewById(C0966R.C0970id.lmq);
        this.f120012u = (FrameLayout) findViewById(C0966R.C0970id.mkq);
        mo69004h();
    }

    public String getEditText() {
        return this.f120006o.getText().toString();
    }

    public int getInputContainerHeight() {
        View view = this.f120008q;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public MMEditText getMMEditText() {
        return this.f120006o;
    }

    public int getSmilePanelHeight() {
        ChatFooterPanel chatFooterPanel = this.f120002h;
        if (chatFooterPanel == null) {
            return 0;
        }
        return chatFooterPanel.getLayoutParams().height;
    }

    /* renamed from: h */
    public final void mo69004h() {
        ImageButton imageButton = this.f120007p;
        if (imageButton != null) {
            imageButton.setOnClickListener(new C44286b());
            C7007c1.m7257b(this.f120007p, 0.5f);
        }
        if (!MMApplicationContext.isMainProcess() || C86709a0.m107522a()) {
            SmileyPanel c = C78160t0.m94372c(this.f120013v, false);
            this.f120002h = c;
            c.setEntranceScene(17);
            this.f120002h.setShowSmiley(true);
            this.f120002h.mo100204p(false, false);
            this.f120002h.mo100203o(false, false);
            this.f120002h.setShowStore(false);
            this.f120002h.setBackgroundColor(this.f120013v.getResources().getColor(C0966R.color.f3284m6));
            this.f120002h.setVisibility(8);
            this.f120002h.setOnTextOperationListener(new C44303d(this));
        } else {
            Log.m105924i("MicroMsg.WebViewInputFooter", "can not show smileyPanel in main pro when not login");
        }
        View view = new View(this.f120013v);
        this.f120015x = view;
        view.setBackgroundColor(this.f120013v.getResources().getColor(C0966R.color.f3284m6));
        this.f120012u.addView(this.f120015x, -1, -1);
        ChatFooterPanel chatFooterPanel = this.f120002h;
        if (chatFooterPanel != null) {
            this.f120012u.addView(chatFooterPanel, -1, -1);
        }
        Button button = this.f120005n;
        if (button != null) {
            button.setOnClickListener(new C44287c());
        }
        MMEditText mMEditText = this.f120006o;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new C44288d());
        }
    }

    /* renamed from: i */
    public boolean mo69005i() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f120013v.getSystemService("input_method");
        if (inputMethodManager == null) {
            Log.m105924i("MicroMsg.WebViewInputFooter", "imm == null");
            return false;
        }
        if (this.f120006o == null) {
            Log.m105924i("MicroMsg.WebViewInputFooter", "contentEditText == null");
        }
        inputMethodManager.showSoftInput(this.f120006o, 0);
        return true;
    }

    public boolean isShown() {
        return getVisibility() == 0;
    }

    /* renamed from: j */
    public final int mo69007j() {
        MMEditText mMEditText = this.f120006o;
        if (mMEditText != null) {
            this.f120013v.hideVKB(mMEditText);
        }
        View view = this.f120015x;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyPanel", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyPanel", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ChatFooterPanel chatFooterPanel = this.f120002h;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(0);
        }
        this.f120007p.setImageResource(C0966R.raw.icons_outlined_keyboard);
        return mo68998f(0, false);
    }

    public void setInputShadowView(View view) {
        this.f120000f = view;
        if (view != null) {
            view.setOnClickListener(new C44285a(view));
        }
    }

    public void setMaxCount(int i) {
        this.f120016y = 0;
        if (i <= 0) {
            this.f120006o.setFilters(new InputFilter[0]);
            return;
        }
        this.f120016y = i;
        this.f120006o.setFilters(new InputFilter[]{new C44289e(i, C45078p0.C45079a.MODE_CHINESE_AS_3)});
    }

    public void setOnSmileyChosenListener(C44291g gVar) {
        this.f119999e = gVar;
    }

    public void setOnTextSendListener(C44292h hVar) {
        this.f119998d = hVar;
    }

    public void setPlaceholder(String str) {
        MMEditText mMEditText = this.f120006o;
        if (mMEditText == null) {
            Log.m105920e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        mMEditText.setHint("");
        if (!Util.isNullOrNil(str)) {
            try {
                this.f120006o.setHint(str);
            } catch (Exception e) {
                Log.m105919d("MicroMsg.WebViewInputFooter", "appendPlaceholder, exp = %s", e);
            }
        }
    }

    public void setShowRemindWordCount(int i) {
        this.f120017z = i;
    }

    public void setText(String str) {
        MMEditText mMEditText = this.f120006o;
        if (mMEditText == null) {
            Log.m105920e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        mMEditText.setText("");
        if (!Util.isNullOrNil(str)) {
            try {
                mo68993a(str);
                this.f120006o.setSelection(str.length());
            } catch (Exception e) {
                Log.m105919d("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e);
            }
        }
    }
}

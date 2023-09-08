package com.tencent.p014mm.plugin.finder.p056ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import gy3.C87412m;
import kg3.C76577a;
import qn3.C77382c;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.ui.n0 */
public final class C3864n0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17408d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.n0$a */
    public static final class C3865a implements C77382c.C77383a {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f17409d;

        public C3865a(FinderCreateContactUI finderCreateContactUI) {
            this.f17409d = finderCreateContactUI;
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
            FinderCreateContactUI finderCreateContactUI = this.f17409d;
            TextView textView = finderCreateContactUI.f16819J;
            if (textView != null) {
                textView.setText(String.valueOf(C45078p0.m49923b(finderCreateContactUI.f16837Y, str)));
                TextView textView2 = this.f17409d.f16819J;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    FinderCreateContactUI finderCreateContactUI2 = this.f17409d;
                    TextView textView3 = finderCreateContactUI2.f16819J;
                    if (textView3 != null) {
                        textView3.setTextColor(finderCreateContactUI2.getResources().getColor(C0966R.color.Red_100));
                        FinderCreateContactUI finderCreateContactUI3 = this.f17409d;
                        String string = finderCreateContactUI3.getString(C0966R.string.ees);
                        C87412m.m108593f(string, "getString(R.string.finder_nickname_too_long_tip)");
                        FinderCreateContactUI.m3834W7(finderCreateContactUI3, string, (String) null, (String) null, 6, (Object) null);
                        return;
                    }
                    C87412m.m108603p("editNickNameLimit");
                    throw null;
                }
                C87412m.m108603p("editNickNameLimit");
                throw null;
            }
            C87412m.m108603p("editNickNameLimit");
            throw null;
        }

        /* renamed from: L3 */
        public void mo4084L3(String str) {
            FinderCreateContactUI finderCreateContactUI = this.f17409d;
            TextView textView = finderCreateContactUI.f16819J;
            if (textView != null) {
                textView.setText(String.valueOf(finderCreateContactUI.f16837Y));
                FinderCreateContactUI finderCreateContactUI2 = this.f17409d;
                TextView textView2 = finderCreateContactUI2.f16819J;
                if (textView2 != null) {
                    textView2.setTextColor(finderCreateContactUI2.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                } else {
                    C87412m.m108603p("editNickNameLimit");
                    throw null;
                }
            } else {
                C87412m.m108603p("editNickNameLimit");
                throw null;
            }
        }

        /* renamed from: P4 */
        public void mo4086P4(String str) {
            int b = C45078p0.m49923b(this.f17409d.f16837Y, str);
            TextView textView = this.f17409d.f16819J;
            if (textView != null) {
                textView.setText(String.valueOf(b));
                FinderCreateContactUI finderCreateContactUI = this.f17409d;
                TextView textView2 = finderCreateContactUI.f16819J;
                if (textView2 != null) {
                    textView2.setTextColor(finderCreateContactUI.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                    FinderCreateContactUI finderCreateContactUI2 = this.f17409d;
                    int i = (int) (((float) finderCreateContactUI2.f16837Y) * 0.1f);
                    if (i < 1) {
                        i = 1;
                    }
                    if (b <= i) {
                        TextView textView3 = finderCreateContactUI2.f16819J;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        } else {
                            C87412m.m108603p("editNickNameLimit");
                            throw null;
                        }
                    } else {
                        TextView textView4 = finderCreateContactUI2.f16819J;
                        if (textView4 != null) {
                            textView4.setVisibility(4);
                        } else {
                            C87412m.m108603p("editNickNameLimit");
                            throw null;
                        }
                    }
                    this.f17409d.mo4020O7();
                    return;
                }
                C87412m.m108603p("editNickNameLimit");
                throw null;
            }
            C87412m.m108603p("editNickNameLimit");
            throw null;
        }
    }

    public C3864n0(FinderCreateContactUI finderCreateContactUI) {
        this.f17408d = finderCreateContactUI;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        String obj;
        EditText editText = this.f17408d.f16844s;
        if (editText != null) {
            C77382c b = C77382c.m93286b(editText);
            FinderCreateContactUI finderCreateContactUI = this.f17408d;
            int i = finderCreateContactUI.f16837Y;
            b.f225611e = 1;
            b.f225610d = i;
            b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;
            b.f225607a = true;
            b.mo107499d(new C3865a(finderCreateContactUI));
            FinderCreateContactUI.C3648a aVar = FinderCreateContactUI.f16795U0;
            EditText editText2 = this.f17408d.f16844s;
            if (editText2 != null) {
                Editable text = editText2.getText();
                if (text == null || (obj = text.toString()) == null || (str = C112550d0.m153799i0(obj).toString()) == null) {
                    str = "";
                }
                FinderCreateContactUI.f16797W0 = str;
                FinderCreateContactUI finderCreateContactUI2 = this.f17408d;
                EditText editText3 = finderCreateContactUI2.f16844s;
                if (editText3 != null) {
                    editText3.setTextColor(C76577a.m92153d(finderCreateContactUI2, C0966R.color.a7f));
                } else {
                    C87412m.m108603p("nickEdt");
                    throw null;
                }
            } else {
                C87412m.m108603p("nickEdt");
                throw null;
            }
        } else {
            C87412m.m108603p("nickEdt");
            throw null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

package com.tencent.p014mm.openim.p018ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.p018ui.view.BaseDialogView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;
import p239sv.C77790f;
import te0.C77894a;
import te0.C77897c;
import te0.C77898d;
import vd3.C78391d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView;", "Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "", "getCloseLayoutHeight", "getContentViewLayoutId", "Lte0/a$a;", "confirmData", "Lrx3/b0;", "setConfirmData", "Lsv/f;", "listener", "setOnConfirmDialogOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView */
public final class OpenIMConfirmDialogView extends BaseDialogView {

    /* renamed from: R0 */
    public TextView f195838R0;

    /* renamed from: S0 */
    public TextView f195839S0;

    /* renamed from: T0 */
    public ImageView f195840T0;

    /* renamed from: U0 */
    public TextView f195841U0;

    /* renamed from: V0 */
    public TextView f195842V0;

    /* renamed from: W0 */
    public TextView f195843W0;

    /* renamed from: X0 */
    public C77790f f195844X0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OpenIMConfirmDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public View mo93659c(View view) {
        C87412m.m108594g(view, "root");
        View findViewById = view.findViewById(C0966R.C0970id.blc);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.confirm_dialog_close_btn)");
        return (WeImageView) findViewById;
    }

    /* renamed from: f */
    public void mo93660f(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.blo);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.confirm_dialog_title)");
        this.f195838R0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.bli);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.confirm_dialog_desc)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.bld);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.c…rm_dialog_confirm_button)");
        this.f195839S0 = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.blc);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.confirm_dialog_close_btn)");
        WeImageView weImageView = (WeImageView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.fg7);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.kf_avatar)");
        this.f195840T0 = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.fg9);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.kf_nickname)");
        this.f195841U0 = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.fg8);
        C87412m.m108593f(findViewById7, "view.findViewById(R.id.kf_desc_wording)");
        this.f195842V0 = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.fg6);
        C87412m.m108593f(findViewById8, "view.findViewById(R.id.kf_antispam_tips)");
        this.f195843W0 = (TextView) findViewById8;
        TextView textView2 = this.f195838R0;
        if (textView2 != null) {
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            TextView textView3 = this.f195839S0;
            if (textView3 != null) {
                C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                TextView textView4 = this.f195839S0;
                if (textView4 != null) {
                    textView4.setOnClickListener(new C77897c(this));
                    setOnCloseClickListener(new C77898d(this));
                    setCanceledOnTouchOutside(true);
                    setEnableDialogScroll(false);
                    setEnableScrollRightClose(true);
                    setIsFixDialogHeight(true);
                    return;
                }
                C87412m.m108603p("confirmButton");
                throw null;
            }
            C87412m.m108603p("confirmButton");
            throw null;
        }
        C87412m.m108603p("dialogTitle");
        throw null;
    }

    public int getCloseLayoutHeight() {
        return getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
    }

    public int getContentViewLayoutId() {
        return C0966R.C0971layout.d6i;
    }

    public final void setConfirmData(C77894a.C77895a aVar) {
        CharSequence charSequence;
        TextView textView = this.f195841U0;
        String str = null;
        if (textView != null) {
            if (aVar == null || (charSequence = aVar.f226950a) == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
            CharSequence charSequence2 = aVar != null ? aVar.f226951b : null;
            boolean z = true;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                TextView textView2 = this.f195842V0;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                    TextView textView3 = this.f195842V0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    } else {
                        C87412m.m108603p("openImDescWording");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("openImDescWording");
                    throw null;
                }
            } else {
                TextView textView4 = this.f195842V0;
                if (textView4 != null) {
                    textView4.setText("");
                    TextView textView5 = this.f195842V0;
                    if (textView5 != null) {
                        textView5.setVisibility(4);
                    } else {
                        C87412m.m108603p("openImDescWording");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("openImDescWording");
                    throw null;
                }
            }
            if (aVar != null) {
                String str2 = aVar.f226953d;
                if (!(str2 == null || str2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    TextView textView6 = this.f195843W0;
                    if (textView6 != null) {
                        textView6.setText(aVar.f226953d);
                        TextView textView7 = this.f195843W0;
                        if (textView7 != null) {
                            textView7.setVisibility(0);
                        } else {
                            C87412m.m108603p("antispamTips");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("antispamTips");
                        throw null;
                    }
                } else {
                    TextView textView8 = this.f195843W0;
                    if (textView8 != null) {
                        textView8.setVisibility(8);
                    } else {
                        C87412m.m108603p("antispamTips");
                        throw null;
                    }
                }
            }
            ImageView imageView = this.f195840T0;
            if (imageView != null) {
                if (aVar != null) {
                    str = aVar.f226952c;
                }
                C78391d.C78393b.m94669a(imageView, str);
                return;
            }
            C87412m.m108603p("avatarImageView");
            throw null;
        }
        C87412m.m108603p("nickNameTextView");
        throw null;
    }

    public final void setOnConfirmDialogOpListener(C77790f fVar) {
        this.f195844X0 = fVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenIMConfirmDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}

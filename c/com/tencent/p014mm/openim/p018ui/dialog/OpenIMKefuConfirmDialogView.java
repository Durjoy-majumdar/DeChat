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
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import ge0.C32415b;
import gy3.C87412m;
import he0.C46020f;
import he0.C46027q;
import he0.C76158j;
import kotlin.Metadata;
import re0.C36314k;
import se0.C22361f;
import te0.C77901g;
import te0.C77902h;
import vd3.C78391d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView;", "Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "", "getCloseLayoutHeight", "getContentViewLayoutId", "Lhe0/f;", "contact", "Lrx3/b0;", "setContactInfo", "Lhe0/q;", "confirmData", "setConfirmData", "Lse0/f$b;", "listener", "setOnConfirmDialogOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView */
public final class OpenIMKefuConfirmDialogView extends BaseDialogView implements MStorage.IOnStorageChange {

    /* renamed from: R0 */
    public TextView f195845R0;

    /* renamed from: S0 */
    public TextView f195846S0;

    /* renamed from: T0 */
    public ImageView f195847T0;

    /* renamed from: U0 */
    public TextView f195848U0;

    /* renamed from: V0 */
    public TextView f195849V0;

    /* renamed from: W0 */
    public TextView f195850W0;

    /* renamed from: X0 */
    public C46020f f195851X0;

    /* renamed from: Y0 */
    public C22361f.C22363b f195852Y0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OpenIMKefuConfirmDialogView(Context context, AttributeSet attributeSet) {
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
        this.f195845R0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.bli);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.confirm_dialog_desc)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.bld);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.c…rm_dialog_confirm_button)");
        this.f195846S0 = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.blc);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.confirm_dialog_close_btn)");
        WeImageView weImageView = (WeImageView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.fg7);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.kf_avatar)");
        this.f195847T0 = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.fg9);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.kf_nickname)");
        this.f195848U0 = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.fg8);
        C87412m.m108593f(findViewById7, "view.findViewById(R.id.kf_desc_wording)");
        this.f195849V0 = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.fg6);
        C87412m.m108593f(findViewById8, "view.findViewById(R.id.kf_antispam_tips)");
        this.f195850W0 = (TextView) findViewById8;
        TextView textView2 = this.f195845R0;
        if (textView2 != null) {
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            TextView textView3 = this.f195846S0;
            if (textView3 != null) {
                C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                TextView textView4 = this.f195846S0;
                if (textView4 != null) {
                    textView4.setOnClickListener(new C77901g(this));
                    setOnCloseClickListener(new C77902h(this));
                    setCanceledOnTouchOutside(true);
                    setEnableDialogScroll(false);
                    setEnableScrollRightClose(true);
                    setIsFixDialogHeight(true);
                    ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().add(this);
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
        return C0966R.C0971layout.b4j;
    }

    /* renamed from: i */
    public final void mo93665i(C46020f fVar) {
        if (fVar != null) {
            mo93666j(fVar.mo71442Q(), ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(fVar.mo71442Q(), fVar.mo71448t0()));
        }
    }

    /* renamed from: j */
    public final void mo93666j(String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            if (C87412m.m108589b("3552365301", str)) {
                str2 = '@' + str2;
            }
            TextView textView = this.f195849V0;
            if (textView != null) {
                textView.setText(str2);
                TextView textView2 = this.f195849V0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    C87412m.m108603p("openImDescWording");
                    throw null;
                }
            } else {
                C87412m.m108603p("openImDescWording");
                throw null;
            }
        } else {
            TextView textView3 = this.f195849V0;
            if (textView3 != null) {
                textView3.setText("");
                TextView textView4 = this.f195849V0;
                if (textView4 != null) {
                    textView4.setVisibility(4);
                } else {
                    C87412m.m108603p("openImDescWording");
                    throw null;
                }
            } else {
                C87412m.m108603p("openImDescWording");
                throw null;
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!(str == null || str.length() == 0) && mStorageEventData != null) {
            Object obj = mStorageEventData.obj;
            if (obj instanceof C36314k) {
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.openim.storage.OpenIMWordingInfo");
                C36314k kVar = (C36314k) obj;
                String str2 = kVar.field_appid;
                C46020f fVar = this.f195851X0;
                String str3 = null;
                if (C87412m.m108589b(str2, fVar != null ? fVar.mo71442Q() : null)) {
                    String str4 = kVar.field_wordingId;
                    C46020f fVar2 = this.f195851X0;
                    if (fVar2 != null) {
                        str3 = fVar2.mo71448t0();
                    }
                    if (C87412m.m108589b(str4, str3)) {
                        Log.m105925i("MicroMsg.OpenIMKefuConfirmDialogView", "onNotifyChange openImAppId: %s, wordingId: %s, wording: %s", kVar.field_appid, kVar.field_wordingId, kVar.field_wording);
                        mo93666j(kVar.field_appid, kVar.field_wording);
                    }
                }
            }
        }
    }

    public final void setConfirmData(C46027q qVar) {
        String str;
        String str2 = null;
        C46020f fVar = qVar != null ? qVar.f124111d : null;
        this.f195851X0 = fVar;
        TextView textView = this.f195848U0;
        if (textView != null) {
            if (fVar == null || (str = fVar.getNickname()) == null) {
                str = "";
            }
            textView.setText(str);
            mo93665i(fVar);
            if (qVar != null) {
                String str3 = qVar.f124113f;
                if (!(str3 == null || str3.length() == 0)) {
                    TextView textView2 = this.f195850W0;
                    if (textView2 != null) {
                        textView2.setText(qVar.f124113f);
                        TextView textView3 = this.f195850W0;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        } else {
                            C87412m.m108603p("antispamTips");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("antispamTips");
                        throw null;
                    }
                } else {
                    TextView textView4 = this.f195850W0;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    } else {
                        C87412m.m108603p("antispamTips");
                        throw null;
                    }
                }
            }
            ImageView imageView = this.f195847T0;
            if (imageView != null) {
                if (fVar != null) {
                    str2 = fVar.getUsername();
                }
                C78391d.C78393b.m94669a(imageView, str2);
                return;
            }
            C87412m.m108603p("avatarImageView");
            throw null;
        }
        C87412m.m108603p("nickNameTextView");
        throw null;
    }

    public final void setContactInfo(C46020f fVar) {
        String str;
        TextView textView = this.f195848U0;
        String str2 = null;
        if (textView != null) {
            if (fVar == null || (str = fVar.getNickname()) == null) {
                str = "";
            }
            textView.setText(str);
            mo93665i(fVar);
            ImageView imageView = this.f195847T0;
            if (imageView != null) {
                if (fVar != null) {
                    str2 = fVar.getUsername();
                }
                C78391d.C78393b.m94669a(imageView, str2);
                return;
            }
            C87412m.m108603p("avatarImageView");
            throw null;
        }
        C87412m.m108603p("nickNameTextView");
        throw null;
    }

    public final void setOnConfirmDialogOpListener(C22361f.C22363b bVar) {
        this.f195852Y0 = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenIMKefuConfirmDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}

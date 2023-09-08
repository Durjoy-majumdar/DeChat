package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75595v3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.a0 */
public class C74665a0 extends C78802b {

    /* renamed from: h */
    public C75595v3 f219512h;

    /* renamed from: i */
    public View f219513i;

    /* renamed from: j */
    public View f219514j;

    /* renamed from: n */
    public TextView f219515n;

    public C74665a0(Context context, C75595v3 v3Var) {
        super(context);
        View.OnClickListener onClickListener;
        this.f219512h = v3Var;
        View view = this.f230569f;
        if (view != null) {
            this.f219514j = view.findViewById(C0966R.C0970id.a7e);
            this.f219513i = this.f230569f.findViewById(C0966R.C0970id.a7i);
            WeImageView weImageView = (WeImageView) this.f230569f.findViewById(C0966R.C0970id.gld);
            weImageView.setIconColor(this.f230570g.get().getResources().getColor(C0966R.color.BW_50));
            this.f219515n = (TextView) this.f230569f.findViewById(C0966R.C0970id.gle);
            switch (this.f219512h.f222081a) {
                case 1:
                    weImageView.setImageResource(C0966R.raw.icons_outlined_cellphone);
                    this.f219515n.setText(C0966R.string.ail);
                    break;
                case 2:
                    weImageView.setImageResource(C0966R.raw.icons_outlined_contacts);
                    this.f219515n.setText(C0966R.string.cwm);
                    break;
                case 3:
                    weImageView.setImageResource(C0966R.raw.icons_outlined_avatar);
                    this.f219515n.setText(C0966R.string.aiw);
                    break;
                case 4:
                    weImageView.setImageResource(C0966R.raw.userguide_nearfriends_icon);
                    this.f219515n.setText(C0966R.string.aio);
                    break;
                case 6:
                    weImageView.setImageResource(C0966R.raw.userguide_emostore_icon);
                    this.f219515n.setText(C0966R.string.ais);
                    break;
                case 7:
                    weImageView.setImageResource(C0966R.raw.userguide_gamecenter_icon);
                    this.f219515n.setText(C0966R.string.air);
                    break;
                case 8:
                    weImageView.setImageResource(C0966R.raw.userguide_grounpmessage_icon);
                    this.f219515n.setText(C0966R.string.ait);
                    break;
                case 9:
                    weImageView.setImageResource(C0966R.raw.userguide_moments_icon);
                    this.f219515n.setText(C0966R.string.aip);
                    break;
                case 10:
                    weImageView.setImageResource(C0966R.raw.userguide_autoadd_icon);
                    this.f219515n.setText(C0966R.string.aii);
                    break;
            }
            View view2 = this.f230569f;
            C75595v3 v3Var2 = this.f219512h;
            int i = v3Var2.f222081a;
            int i2 = v3Var2.f222082b;
            switch (i) {
                case 1:
                    onClickListener = new C74678t(this, i, i2);
                    break;
                case 2:
                    onClickListener = new C74679u(this, i, i2);
                    break;
                case 3:
                    onClickListener = new C74677s(this, i, i2);
                    break;
                case 4:
                    onClickListener = new C74676r(this, i, i2);
                    break;
                case 6:
                    onClickListener = new C74680v(this, i, i2);
                    break;
                case 7:
                    onClickListener = new C74681w(this, i, i2);
                    break;
                case 8:
                    onClickListener = new C74682x(this, i, i2);
                    break;
                case 9:
                    onClickListener = new C74683y(this, i, i2);
                    break;
                case 10:
                    onClickListener = new C74684z(this, i, i2);
                    break;
                default:
                    onClickListener = null;
                    break;
            }
            view2.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: h */
    public static void m89412h(C74665a0 a0Var, Context context, boolean z) {
        a0Var.getClass();
        if (context != null) {
            Intent intent = new Intent();
            intent.setClass(context, BindMContactIntroUI.class);
            intent.putExtra("key_upload_scene", 8);
            if (z) {
                intent.putExtra("bind_scene", 2);
            }
            intent.putExtra("KEnterFromBanner", true);
            MMWizardActivity.m7017L7(context, intent);
            if (z) {
                C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 3, 1);
                return;
            }
            C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 1, 1);
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.b_x;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        boolean z = this.f230567d;
        if (z && this.f230568e) {
            this.f219514j.setBackgroundResource(C0966R.C0969drawable.axp);
            this.f219515n.setBackground((Drawable) null);
        } else if (z) {
            this.f219513i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f219514j.setBackgroundResource(C0966R.C0969drawable.c4w);
            this.f219515n.setBackgroundResource(C0966R.C0969drawable.bcr);
        } else if (this.f230568e) {
            this.f219513i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f219514j.setBackgroundResource(C0966R.C0969drawable.bcr);
            this.f219515n.setBackground((Drawable) null);
        } else {
            this.f219513i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f219514j.setBackground((Drawable) null);
            this.f219515n.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        return super.mo7970e();
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f219514j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

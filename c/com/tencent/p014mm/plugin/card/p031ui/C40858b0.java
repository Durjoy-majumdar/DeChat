package com.tencent.p014mm.plugin.card.p031ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gz0.C45995o;
import hz0.C46146f;
import hz0.C46153l0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.b0 */
public class C40858b0 implements C45995o.C45997b {

    /* renamed from: d */
    public View f109855d;

    /* renamed from: e */
    public MMActivity f109856e;

    /* renamed from: f */
    public View f109857f;

    /* renamed from: g */
    public TextView f109858g;

    /* renamed from: h */
    public ImageView f109859h;

    /* renamed from: i */
    public View f109860i;

    /* renamed from: j */
    public TextView f109861j;

    /* renamed from: n */
    public ImageView f109862n;

    /* renamed from: o */
    public boolean f109863o = false;

    public C40858b0(MMActivity mMActivity, View view) {
        this.f109856e = mMActivity;
        this.f109855d = view;
    }

    /* renamed from: D7 */
    public void mo63787D7(C46146f fVar) {
        mo63822a();
    }

    /* renamed from: a */
    public final void mo63822a() {
        int i = C46153l0.Bx0().f124034c;
        if (i <= 0 || !this.f109863o) {
            View view = this.f109857f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f109860i;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_TITLE_STRING_SYNC, "");
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_ICON_URL_STRING_SYNC, "");
        int dimensionPixelOffset = this.f109856e.getResources().getDimensionPixelOffset(C0966R.dimen.f4218wl);
        if (!TextUtils.isEmpty(str2)) {
            C53263p.m59701b(this.f109859h, str2, dimensionPixelOffset, C0966R.C0969drawable.bxb, true);
        } else {
            this.f109859h.setImageResource(C0966R.C0969drawable.bxb);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f109858g.setText(str);
        } else {
            this.f109858g.setText(this.f109856e.getString(C0966R.string.ayq, new Object[]{Integer.valueOf(i)}));
        }
        View view4 = this.f109857f;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f109860i != null) {
            if (!TextUtils.isEmpty(str2)) {
                C53263p.m59701b(this.f109862n, str2, dimensionPixelOffset, C0966R.C0969drawable.bxb, true);
            } else {
                this.f109862n.setImageResource(C0966R.C0969drawable.bxb);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f109861j.setText(str);
            } else {
                this.f109861j.setText(this.f109856e.getString(C0966R.string.ayq, new Object[]{Integer.valueOf(i)}));
            }
            View view6 = this.f109860i;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onChange() {
    }
}

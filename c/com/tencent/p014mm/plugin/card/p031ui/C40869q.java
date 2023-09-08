package com.tencent.p014mm.plugin.card.p031ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hz0.C46153l0;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import oz0.C47407b;
import pz0.C47722k;
import te3.C52284zn;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.q */
public class C40869q {

    /* renamed from: a */
    public int f109900a;

    /* renamed from: b */
    public View f109901b;

    /* renamed from: c */
    public View f109902c;

    /* renamed from: d */
    public MMActivity f109903d;

    /* renamed from: e */
    public TextView f109904e;

    /* renamed from: f */
    public TextView f109905f;

    /* renamed from: g */
    public CdnImageView f109906g;

    /* renamed from: h */
    public ImageView[] f109907h;

    /* renamed from: i */
    public ImageView f109908i;

    /* renamed from: j */
    public C52284zn f109909j;

    public C40869q(MMActivity mMActivity, View view, int i, C47407b bVar) {
        this(mMActivity, view, i, bVar, (C52284zn) null);
    }

    /* renamed from: a */
    public void mo63837a(int i) {
        View view = this.f109901b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public void mo63838b() {
        int i = this.f109900a;
        if (i == 2) {
            C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
            if (kVar == null) {
                Log.m105928w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
                return;
            }
            if (Util.isNullOrNil(kVar.f128222i)) {
                this.f109905f.setVisibility(8);
            } else {
                this.f109905f.setVisibility(0);
                this.f109905f.setText(kVar.f128222i);
            }
            if (Util.isNullOrNil((List) kVar.f128221h)) {
                for (int i2 = 0; i2 < 3; i2++) {
                    this.f109907h[i2].setVisibility(8);
                }
            } else {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 < kVar.f128221h.size()) {
                        this.f109907h[i3].setVisibility(0);
                        C53263p.m59701b(this.f109907h[i3], kVar.f128221h.get(i3), this.f109903d.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9), C0966R.C0969drawable.f357296c91, false);
                    } else {
                        this.f109907h[i3].setVisibility(8);
                    }
                }
            }
            if (Util.isNullOrNil((List) kVar.f128221h) || kVar.f128221h.size() != 1 || !kVar.f128219f || kVar.f128220g) {
                this.f109908i.setVisibility(8);
            } else {
                this.f109908i.setVisibility(0);
            }
        } else if (i == 3) {
            this.f109904e.setText(C0966R.string.b26);
            View findViewById = this.f109901b.findViewById(C0966R.C0970id.aut);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String str = (String) C46153l0.yx0().mo71382a("key_card_entrance_tips");
            if (!Util.isNullOrNil(str)) {
                this.f109905f.setText(str);
                this.f109905f.setVisibility(0);
                return;
            }
            this.f109905f.setVisibility(8);
        }
    }

    public C40869q(MMActivity mMActivity, View view, int i, C47407b bVar, C52284zn znVar) {
        this.f109907h = new ImageView[3];
        this.f109903d = mMActivity;
        this.f109901b = view;
        this.f109900a = i;
        this.f109909j = znVar;
        this.f109902c = view.findViewById(C0966R.C0970id.auy);
        this.f109904e = (TextView) this.f109901b.findViewById(C0966R.C0970id.f357625av0);
        this.f109905f = (TextView) this.f109901b.findViewById(C0966R.C0970id.auz);
        this.f109906g = (CdnImageView) this.f109901b.findViewById(C0966R.C0970id.f357626av1);
        this.f109907h[0] = (ImageView) this.f109901b.findViewById(C0966R.C0970id.auu);
        this.f109907h[1] = (ImageView) this.f109901b.findViewById(C0966R.C0970id.auv);
        this.f109907h[2] = (ImageView) this.f109901b.findViewById(C0966R.C0970id.auw);
        this.f109908i = (ImageView) this.f109901b.findViewById(C0966R.C0970id.awt);
        int i2 = this.f109900a;
        if (i2 == 1) {
            this.f109904e.setText(this.f109903d.getString(C0966R.string.azn, new Object[]{0}));
            this.f109906g.setImageResource(C0966R.raw.card_home_member_card_icon);
        } else if (i2 == 2) {
            this.f109904e.setText(C0966R.string.b1_);
            this.f109906g.setImageResource(C0966R.raw.card_home_friend_ticket_icon);
        } else if (i2 == 3) {
            this.f109904e.setText(C0966R.string.b26);
            this.f109906g.setImageResource(C0966R.raw.card_home_my_ticket_icon);
        } else if (i2 == 4) {
            if (this.f109909j == null) {
                Log.m105928w("MicroMsg.CardHomePageItemController", "cell element is null");
                mo63837a(8);
            }
            View findViewById = this.f109901b.findViewById(C0966R.C0970id.aut);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f109904e.setText(this.f109909j.f146104e);
            this.f109906g.setUseSdcardCache(true);
            this.f109906g.setUrl(this.f109909j.f146105f);
            if (!Util.isNullOrNil(this.f109909j.f146106g)) {
                this.f109905f.setText(this.f109909j.f146106g);
                this.f109905f.setVisibility(0);
                return;
            }
            this.f109905f.setVisibility(8);
        }
    }
}

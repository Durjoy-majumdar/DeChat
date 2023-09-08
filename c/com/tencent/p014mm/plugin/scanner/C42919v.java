package com.tencent.p014mm.plugin.scanner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gc0.C20828a;
import hc0.C20937c;
import kg3.C76577a;
import nj3.C76878h0;

/* renamed from: com.tencent.mm.plugin.scanner.v */
public class C42919v implements C76878h0 {

    /* renamed from: a */
    public final /* synthetic */ int f116215a;

    /* renamed from: b */
    public final /* synthetic */ ScanCodeSheetItemLogic f116216b;

    public C42919v(ScanCodeSheetItemLogic scanCodeSheetItemLogic, int i) {
        this.f116216b = scanCodeSheetItemLogic;
        this.f116215a = i;
    }

    /* renamed from: a */
    public void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
        if (menuItem.getItemId() == 7) {
            Context context = this.f116216b.f116146d;
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_translate, context.getResources().getColor(C0966R.color.FG_0)));
        } else if (menuItem.getItemId() == this.f116215a && this.f116216b.f116147e != null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59347c = true;
            imageView.setBackground((Drawable) null);
            imageView.setImageDrawable((Drawable) null);
            ScanCodeSheetItemLogic scanCodeSheetItemLogic = this.f116216b;
            int i = scanCodeSheetItemLogic.f116147e.f141404g;
            if (i == 4) {
                bVar.f59359o = C0966R.raw.actionsheet_default_appbrand_icon;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116216b.f116147e.f141407j, imageView, bVar.mo32666a());
            } else if (i == 3) {
                bVar.f59359o = C0966R.raw.default_avatar_round;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116216b.f116147e.f141407j, imageView, bVar.mo32666a());
            } else if (i == 1) {
                bVar.f59364t = true;
                bVar.f59365u = (float) C76577a.m92151b(scanCodeSheetItemLogic.f116146d, 4);
                bVar.f59359o = C0966R.raw.default_avatar;
                C20828a.m22825b().mo32519h(this.f116216b.f116147e.f141407j, imageView, bVar.mo32666a());
            } else if (i == 2) {
                Context context2 = scanCodeSheetItemLogic.f116146d;
                imageView.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icons_outlined_group_detail, context2.getResources().getColor(C0966R.color.FG_0)));
            } else if (i == 7) {
                bVar.f59364t = true;
                bVar.f59365u = (float) C76577a.m92151b(scanCodeSheetItemLogic.f116146d, 4);
                bVar.f59359o = C0966R.raw.default_avatar;
                C20828a.m22825b().mo32519h(this.f116216b.f116147e.f141407j, imageView, bVar.mo32666a());
            } else if (i == 6) {
                Context context3 = scanCodeSheetItemLogic.f116146d;
                imageView.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.icons_outlined_wechatpay, context3.getResources().getColor(C0966R.color.FG_0)));
            } else if (i == 5) {
                Context context4 = scanCodeSheetItemLogic.f116146d;
                imageView.setImageDrawable(C74933u4.m89768e(context4, C0966R.raw.icons_outlined_pay_reward_code, context4.getResources().getColor(C0966R.color.FG_0)));
            } else if (i == 9) {
                bVar.f59359o = C0966R.raw.default_avatar_round;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116216b.f116147e.f141407j, imageView, bVar.mo32666a());
            }
        }
    }
}

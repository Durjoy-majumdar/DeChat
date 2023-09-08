package vz0;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.C18609n0;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import di3.C86312j;
import dz0.C20483c;
import f40.C86709a0;
import f62.C75700k0;
import gz0.C20871g;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p629ny.C76979h;
import rz0.C22286g;

/* renamed from: vz0.a */
public class C22808a extends C22821l {

    /* renamed from: b */
    public View f65576b;

    /* renamed from: c */
    public void mo35949c() {
        this.f65576b = mo35969b(C0966R.C0970id.ars);
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65576b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public void mo35951e() {
        C18609n0 n0Var = this.f65616a;
        C22286g gVar = ((CardDetailUIContoller) n0Var).f51798f;
        C20483c cVar = ((CardDetailUIContoller) n0Var).f51776E;
        MMActivity mMActivity = ((CardDetailUIContoller) n0Var).f51797e;
        CardDetailUIContoller.C18575g gVar2 = ((CardDetailUIContoller) n0Var).f51791U;
        C20871g gVar3 = ((CardDetailUIContoller) n0Var).f51779H;
        if (gVar.mo35432f()) {
            View view = this.f65576b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View b = mo35969b(C0966R.C0970id.f5304bf);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = b;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = (ImageView) mo35969b(C0966R.C0970id.f5303be);
            TextView textView = (TextView) mo35969b(C0966R.C0970id.f5305bh);
            TextView textView2 = (TextView) mo35969b(C0966R.C0970id.f5307bj);
            if (gVar2.f51825d != null) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(mMActivity, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(gVar2.f51825d).mo62909j3(), textView.getTextSize()));
            }
            if (gVar2.f51822a == 23) {
                if (!TextUtils.isEmpty(cVar.mo23264L0().f64128V)) {
                    textView2.setText(cVar.mo23264L0().f64128V);
                } else if (!TextUtils.isEmpty(cVar.mo23264L0().f64156y)) {
                    textView2.setText(mMActivity.getString(C0966R.string.b0c, new Object[]{cVar.mo23264L0().f64156y}));
                } else {
                    textView2.setText(mMActivity.getString(C0966R.string.b0c, new Object[]{gVar3.mo32579d()}));
                }
            } else if (cVar.mo23293u0() != null && !TextUtils.isEmpty(cVar.mo23293u0().f133848d)) {
                textView2.setText(cVar.mo23293u0().f133848d);
            } else if (!TextUtils.isEmpty(cVar.mo23264L0().f64156y)) {
                if (cVar.mo23285h2()) {
                    textView2.setText(mMActivity.getString(C0966R.string.f360224az2, new Object[]{cVar.mo23264L0().f64156y}));
                } else {
                    textView2.setText(mMActivity.getString(C0966R.string.axy, new Object[]{cVar.mo23264L0().f64156y}));
                }
            } else if (cVar.mo23285h2()) {
                textView2.setText(mMActivity.getString(C0966R.string.f360224az2, new Object[]{gVar3.mo32579d()}));
            } else {
                textView2.setText(mMActivity.getString(C0966R.string.axy, new Object[]{gVar3.mo32579d()}));
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, gVar2.f51825d, 0.15f);
            imageView.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
        } else if (!gVar.mo35433g()) {
            mo35950d(8);
        } else if (!TextUtils.isEmpty(cVar.mo23264L0().f64128V)) {
            View view4 = this.f65576b;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View b2 = mo35969b(C0966R.C0970id.f5304bf);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = b2;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) mo35969b(C0966R.C0970id.f5307bj)).setText(cVar.mo23264L0().f64128V);
        } else {
            View view7 = this.f65576b;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

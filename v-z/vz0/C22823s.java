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
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: vz0.s */
public class C22823s extends C22821l {

    /* renamed from: b */
    public View f65618b;

    /* renamed from: c */
    public ImageView f65619c;

    /* renamed from: d */
    public TextView f65620d;

    /* renamed from: e */
    public TextView f65621e;

    /* renamed from: c */
    public void mo35949c() {
        this.f65618b = mo35969b(C0966R.C0970id.efz);
        this.f65619c = (ImageView) mo35969b(C0966R.C0970id.efx);
        this.f65620d = (TextView) mo35969b(C0966R.C0970id.f358326eg1);
        this.f65621e = (TextView) mo35969b(C0966R.C0970id.f358325eg0);
        View view = this.f65618b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65618b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public void mo35951e() {
        Class cls = C76979h.class;
        C18609n0 n0Var = this.f65616a;
        C20483c cVar = ((CardDetailUIContoller) n0Var).f51776E;
        MMActivity mMActivity = ((CardDetailUIContoller) n0Var).f51797e;
        CardDetailUIContoller.C18575g gVar = ((CardDetailUIContoller) n0Var).f51791U;
        View view = this.f65618b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65620d.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(gVar.f51825d).mo62909j3(), this.f65620d.getTextSize()));
        if (cVar.mo23293u0() != null && !TextUtils.isEmpty(cVar.mo23293u0().f133848d)) {
            this.f65621e.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity, cVar.mo23293u0().f133848d, this.f65621e.getTextSize()));
        } else if (!TextUtils.isEmpty(cVar.mo23264L0().f64156y)) {
            if (cVar.mo23285h2()) {
                this.f65621e.setText(mMActivity.getString(C0966R.string.f360224az2, new Object[]{cVar.mo23264L0().f64156y}));
            } else {
                this.f65621e.setText(mMActivity.getString(C0966R.string.axy, new Object[]{cVar.mo23264L0().f64156y}));
            }
        } else if (cVar.mo23285h2()) {
            this.f65621e.setText(mMActivity.getString(C0966R.string.f360224az2, new Object[]{((CardDetailUIContoller) this.f65616a).f51779H.mo32579d()}));
        } else {
            this.f65621e.setText(mMActivity.getString(C0966R.string.axy, new Object[]{((CardDetailUIContoller) this.f65616a).f51779H.mo32579d()}));
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f65619c, gVar.f51825d);
        this.f65619c.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
    }
}

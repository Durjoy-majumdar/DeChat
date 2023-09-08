package com.tencent.p014mm.plugin.p081mv.p082ui;

import a14.C53895h;
import a14.C53934p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import gy3.C87412m;
import hb2.C59811e;
import hb2.C59826g;
import hb2.C59828h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C36570n;
import sb2.C63774j0;
import sb2.C63797k0;
import sb2.C63844s;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.mv.ui.b */
public final class C56949b implements MusicMvMakerFixEditUIC.C57043d {

    /* renamed from: a */
    public final /* synthetic */ MusicMvMakerUI f163113a;

    /* renamed from: b */
    public final /* synthetic */ C63844s f163114b;

    /* renamed from: com.tencent.mm.plugin.mv.ui.b$a */
    public static final class C56950a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163115d;

        public C56950a(MusicMvMakerUI musicMvMakerUI) {
            this.f163115d = musicMvMakerUI;
        }

        public void onAnimationEnd(Animator animator) {
            MusicMvMakerUI musicMvMakerUI = this.f163115d;
            int i = MusicMvMakerUI.f163030u;
            View K7 = musicMvMakerUI.mo80362K7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = K7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2$onEditItem$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2$onEditItem$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C56949b(MusicMvMakerUI musicMvMakerUI, C63844s sVar) {
        this.f163113a = musicMvMakerUI;
        this.f163114b = sVar;
    }

    /* renamed from: a */
    public void mo80397a() {
        MusicMvMakerUI musicMvMakerUI = this.f163113a;
        int i = MusicMvMakerUI.f163030u;
        MusicMVCardChooseView M7 = musicMvMakerUI.mo80365M7();
        if (M7 != null) {
            M7.mo80520k();
        }
    }

    /* renamed from: b */
    public void mo80398b(int i, C59811e eVar, boolean z, C59826g gVar) {
        C59811e eVar2 = eVar;
        boolean z2 = z;
        C59826g gVar2 = gVar;
        Class cls = MusicMvMakerFixEditUIC.class;
        Class cls2 = C63774j0.class;
        C87412m.m108594g(eVar2, "item");
        if (gVar2 != null) {
            MusicMvMakerUI musicMvMakerUI = this.f163113a;
            int i2 = MusicMvMakerUI.f163030u;
            View K7 = musicMvMakerUI.mo80362K7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = K7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f163113a.mo80363L7().setRadius(C76577a.m92151b(this.f163113a.getContext(), 12));
            ImageView imageView = (ImageView) ((C36570n) this.f163113a.f163039p).getValue();
            C87412m.m108593f(imageView, "mvItemEditThumb");
            MMRoundCornerImageView L7 = this.f163113a.mo80363L7();
            C87412m.m108593f(L7, "albumFakeThumb");
            Animator b = gVar2.mo84782b(C59828h.m69722a(imageView), L7, false);
            b.addListener(new C56950a(this.f163113a));
            b.setDuration(250);
            b.start();
            C39818r rVar = C39818r.f106831a;
            ((C63774j0) rVar.mo62444c(this.f163113a).mo75002a(cls2)).mo88584l3(true);
            C63774j0 j0Var = (C63774j0) rVar.mo62444c(this.f163113a).mo75002a(cls2);
            j0Var.getClass();
            C53895h.m60466d(j0Var.f180808E, (C66212f) null, (C53934p0) null, new C63797k0(j0Var, eVar2, (C15601d<? super C63797k0>) null), 3, (Object) null);
            this.f163113a.mo80365M7().animate().translationY(((View) ((C36570n) this.f163113a.f163032f).getValue()).getY() - ((View) ((C36570n) this.f163113a.f163031e).getValue()).getY()).start();
            ((MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163113a).mo75002a(cls)).f163347v = z2;
            this.f163113a.mo80365M7().mo80512c();
            return;
        }
        C39818r rVar2 = C39818r.f106831a;
        ((C63774j0) rVar2.mo62444c(this.f163113a).mo75002a(cls2)).mo88584l3(true);
        C63774j0 j0Var2 = (C63774j0) rVar2.mo62444c(this.f163113a).mo75002a(cls2);
        j0Var2.getClass();
        C53895h.m60466d(j0Var2.f180808E, (C66212f) null, (C53934p0) null, new C63797k0(j0Var2, eVar2, (C15601d<? super C63797k0>) null), 3, (Object) null);
        this.f163113a.mo80365M7().animate().translationY(((View) ((C36570n) this.f163113a.f163032f).getValue()).getY() - ((View) ((C36570n) this.f163113a.f163031e).getValue()).getY()).start();
        ((MusicMvMakerFixEditUIC) rVar2.mo62444c(this.f163113a).mo75002a(cls)).f163347v = z2;
        this.f163113a.mo80365M7().mo80512c();
    }

    /* renamed from: c */
    public void mo80399c(int i, C59811e eVar) {
        C87412m.m108594g(eVar, "item");
        if (!this.f163114b.mo88634d3()) {
            MusicMvMakerUI.m65640I7(this.f163113a);
        }
    }

    /* renamed from: d */
    public void mo80400d(int i, C59811e eVar) {
        C87412m.m108594g(eVar, "item");
        MusicMvMakerUI musicMvMakerUI = this.f163113a;
        int i2 = MusicMvMakerUI.f163030u;
        MusicMVCardChooseView M7 = musicMvMakerUI.mo80365M7();
        if (M7 != null) {
            M7.mo80525p(false, eVar.f170726f - eVar.f170725e);
        }
    }
}

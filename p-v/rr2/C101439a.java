package rr2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.C105476b;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rr2.a */
public final class C101439a extends C99417a implements View.OnClickListener, C105476b {

    /* renamed from: f */
    public final C13601g f297092f;

    /* renamed from: g */
    public final C13601g f297093g;

    /* renamed from: h */
    public final C13601g f297094h;

    /* renamed from: i */
    public RecordConfigProvider f297095i;

    /* renamed from: j */
    public C94554a f297096j;

    /* renamed from: rr2.a$a */
    public static final class C101440a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f297097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101440a(C101198e eVar) {
            super(0);
            this.f297097d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$coverGuideView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$coverGuideView$2");
            C101198e eVar = this.f297097d;
            C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) eVar).findViewById(C0966R.C0970id.bv4);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$coverGuideView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$coverGuideView$2");
            return findViewById;
        }
    }

    /* renamed from: rr2.a$b */
    public static final class C101441b extends C87413o implements C32224a<EditVideoSeekBarView> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f297098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101441b(C101198e eVar) {
            super(0);
            this.f297098d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
            C101198e eVar = this.f297098d;
            C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
            EditVideoSeekBarView editVideoSeekBarView = (EditVideoSeekBarView) ((ViewGroup) eVar).findViewById(C0966R.C0970id.buy);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
            return editVideoSeekBarView;
        }
    }

    /* renamed from: rr2.a$c */
    public static final class C101442c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f297099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101442c(C101198e eVar) {
            super(0);
            this.f297099d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$normalLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$normalLayout$2");
            C101198e eVar = this.f297099d;
            C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) eVar).findViewById(C0966R.C0970id.buu);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$normalLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$normalLayout$2");
            return findViewById;
        }
    }

    /* renamed from: rr2.a$d */
    public static final class C101443d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C101439a f297100d;

        public C101443d(C101439a aVar) {
            this.f297100d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$showNormalLayout$1");
            C87412m.m108594g(animator, "animation");
            C101439a aVar = this.f297100d;
            SnsMethodCalculate.markStartTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            EditVideoSeekBarView x = aVar.mo140945x();
            SnsMethodCalculate.markEndTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            x.setVisibility(4);
            C101439a aVar2 = this.f297100d;
            SnsMethodCalculate.markStartTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            EditVideoSeekBarView x2 = aVar2.mo140945x();
            SnsMethodCalculate.markEndTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            x2.setAlpha(1.0f);
            C101439a aVar3 = this.f297100d;
            SnsMethodCalculate.markStartTimeMs("access$getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            View y = aVar3.mo140946y();
            SnsMethodCalculate.markEndTimeMs("access$getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view = y;
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$showNormalLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$showNormalLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101439a aVar5 = this.f297100d;
            SnsMethodCalculate.markStartTimeMs("access$getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            aVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            View view2 = (View) ((C36570n) aVar5.f297094h).getValue();
            SnsMethodCalculate.markEndTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            SnsMethodCalculate.markEndTimeMs("access$getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$showNormalLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$showNormalLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$showNormalLayout$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101439a(C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
        this.f297092f = C36568h.m40985a(new C101442c(eVar));
        this.f297093g = C36568h.m40985a(new C101441b(eVar));
        this.f297094h = C36568h.m40985a(new C101440a(eVar));
    }

    /* renamed from: A */
    public final void mo140943A(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("syncCropVideoLength", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C94554a aVar = this.f297096j;
        if (aVar != null) {
            int b = C60641c.m70921b(((float) aVar.f273443a) * f);
            int b2 = C60641c.m70921b(((float) aVar.f273443a) * f2);
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", b);
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", b2);
            this.f291492d.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO_LENGTH, bundle);
        }
        SnsMethodCalculate.markEndTimeMs("syncCropVideoLength", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        SnsMethodCalculate.markStartTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        if (mo140946y().getVisibility() != 0) {
            mo140947z();
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_CANCEL, (Bundle) null, 2, (Object) null);
            SnsMethodCalculate.markEndTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return false;
    }

    /* renamed from: g */
    public void mo139245g(boolean z, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onMove", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        SnsMethodCalculate.markEndTimeMs("onMove", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    /* renamed from: l */
    public void mo139248l(boolean z, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    /* renamed from: m */
    public void mo139249m(boolean z, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        mo140943A(f, f2);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.jsi) {
            SnsMethodCalculate.markStartTimeMs("showCropLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            View y = mo140946y();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = y;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markStartTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            View view4 = (View) ((C36570n) this.f297094h).getValue();
            SnsMethodCalculate.markEndTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo140945x().setVisibility(0);
            mo140945x().setAlpha(0.0f);
            mo140945x().clearAnimation();
            mo140945x().animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
            SnsMethodCalculate.markEndTimeMs("showCropLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            SnsMethodCalculate.markStartTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            if (this.f297096j == null) {
                SnsMethodCalculate.markEndTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            } else {
                if (!mo140945x().getHasInit()) {
                    EditVideoSeekBarView x = mo140945x();
                    RecordConfigProvider recordConfigProvider = this.f297095i;
                    if (recordConfigProvider != null) {
                        String str = recordConfigProvider.f272900A;
                        C87412m.m108593f(str, "configProvider.inputVideoPath");
                        RecordConfigProvider recordConfigProvider2 = this.f297095i;
                        if (recordConfigProvider2 != null) {
                            int i = recordConfigProvider2.f272935w;
                            C94554a aVar3 = this.f297096j;
                            C87412m.m108591d(aVar3);
                            int min = Math.min(i, aVar3.f273443a);
                            RecordConfigProvider recordConfigProvider3 = this.f297095i;
                            if (recordConfigProvider3 != null) {
                                x.mo129821a(str, min, (int) Math.ceil((((double) recordConfigProvider3.f272936x) * 1.0d) / ((double) 1000)));
                                mo140945x().setThumbBarSeekListener(this);
                                mo140945x().setCancelButtonClickListener(new C101444b(this));
                                mo140945x().setFinishButtonClickListener(new C101445c(this));
                            } else {
                                C87412m.m108603p("configProvider");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("configProvider");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("configProvider");
                        throw null;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            }
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO, (Bundle) null, 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: q */
    public void mo139251q(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onRecyclerChanged", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        mo140943A(f, f2);
        SnsMethodCalculate.markEndTimeMs("onRecyclerChanged", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C101198e eVar = this.f291492d;
        C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) eVar).findViewById(C0966R.C0970id.jsi).setOnClickListener(this);
        this.f297095i = recordConfigProvider;
        this.f297096j = C94555d.m119567c(recordConfigProvider.f272900A, true);
        SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    /* renamed from: x */
    public final EditVideoSeekBarView mo140945x() {
        SnsMethodCalculate.markStartTimeMs("getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        EditVideoSeekBarView editVideoSeekBarView = (EditVideoSeekBarView) ((C36570n) this.f297093g).getValue();
        SnsMethodCalculate.markEndTimeMs("getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return editVideoSeekBarView;
    }

    /* renamed from: y */
    public final View mo140946y() {
        SnsMethodCalculate.markStartTimeMs("getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        View view = (View) ((C36570n) this.f297092f).getValue();
        SnsMethodCalculate.markEndTimeMs("getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return view;
    }

    /* renamed from: z */
    public final void mo140947z() {
        SnsMethodCalculate.markStartTimeMs("showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        mo140945x().animate().alpha(0.0f).setDuration(300).setListener(new C101443d(this));
        SnsMethodCalculate.markEndTimeMs("showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }
}

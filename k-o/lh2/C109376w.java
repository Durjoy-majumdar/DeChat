package lh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.w */
public final class C109376w implements C109344g0, View.OnClickListener {

    /* renamed from: d */
    public ViewGroup f327428d;

    /* renamed from: e */
    public C101198e f327429e;

    /* renamed from: f */
    public final ViewGroup f327430f;

    /* renamed from: g */
    public final ViewGroup f327431g = ((ViewGroup) this.f327428d.findViewById(C0966R.C0970id.bwn));

    /* renamed from: h */
    public final Button f327432h;

    /* renamed from: i */
    public final Button f327433i;

    /* renamed from: j */
    public final ImageView f327434j;

    /* renamed from: n */
    public final ImageView f327435n;

    /* renamed from: o */
    public C109377a f327436o;

    /* renamed from: p */
    public Context f327437p;

    /* renamed from: lh2.w$a */
    public enum C109377a {
        CROP_FUNC,
        NORMAL_FUNC,
        DEFAULT
    }

    /* renamed from: lh2.w$b */
    public static final class C109378b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C109376w f327442a;

        /* renamed from: b */
        public final /* synthetic */ int f327443b;

        public C109378b(C109376w wVar, int i) {
            this.f327442a = wVar;
            this.f327443b = i;
        }

        public void onAnimationEnd(Animation animation) {
            C87412m.m108594g(animation, "animation");
            this.f327442a.f327428d.setVisibility(this.f327443b);
        }

        public void onAnimationRepeat(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }
    }

    /* renamed from: lh2.w$c */
    public static final class C109379c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C109376w f327444a;

        /* renamed from: b */
        public final /* synthetic */ int f327445b;

        public C109379c(C109376w wVar, int i) {
            this.f327444a = wVar;
            this.f327445b = i;
        }

        public void onAnimationEnd(Animation animation) {
            C87412m.m108594g(animation, "animation");
            this.f327444a.f327428d.setVisibility(this.f327445b);
        }

        public void onAnimationRepeat(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }
    }

    public C109376w(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "view");
        C87412m.m108594g(eVar, "status");
        this.f327428d = viewGroup;
        this.f327429e = eVar;
        this.f327430f = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.ehd);
        Button button = (Button) this.f327428d.findViewById(C0966R.C0970id.bwk);
        this.f327432h = button;
        Button button2 = (Button) this.f327428d.findViewById(C0966R.C0970id.bwm);
        this.f327433i = button2;
        ImageView imageView = (ImageView) this.f327428d.findViewById(C0966R.C0970id.bws);
        this.f327434j = imageView;
        ImageView imageView2 = (ImageView) this.f327428d.findViewById(C0966R.C0970id.bwq);
        this.f327435n = imageView2;
        this.f327436o = C109377a.DEFAULT;
        this.f327437p = this.f327428d.getContext();
        View findViewById = this.f327428d.findViewById(C0966R.C0970id.cb8);
        findViewById.setPadding(0, 0, 0, C75044y4.m89991c(this.f327428d.getContext()) + findViewById.getPaddingBottom());
        imageView.setImageDrawable(C74933u4.m89768e(this.f327428d.getContext(), C0966R.raw.icons_filled_undo, -1));
        imageView2.setImageDrawable(C74933u4.m89768e(this.f327428d.getContext(), C0966R.raw.icons_filled_rotate, -1));
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        mo160571a();
    }

    /* renamed from: a */
    public final void mo160571a() {
        this.f327436o = C109377a.NORMAL_FUNC;
        this.f327430f.setVisibility(0);
        this.f327431g.setVisibility(4);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (this.f327436o != C109377a.CROP_FUNC) {
            return false;
        }
        this.f327436o = C109377a.DEFAULT;
        C101198e.C62622a.m73576a(this.f327429e, C101198e.C101199b.EDIT_PHOTO_CROP_CANCEL, (Bundle) null, 2, (Object) null);
        return true;
    }

    public String name() {
        return C109376w.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwk) {
            this.f327430f.setVisibility(0);
            this.f327431g.setVisibility(4);
            C101198e.C62622a.m73576a(this.f327429e, C101198e.C101199b.EDIT_PHOTO_CROP_CANCEL, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwm) {
            this.f327430f.setVisibility(0);
            this.f327431g.setVisibility(4);
            this.f327436o = C109377a.NORMAL_FUNC;
            C101198e.C62622a.m73576a(this.f327429e, C101198e.C101199b.EDIT_PHOTO_CROP_FINISH, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bws) {
            C101198e.C62622a.m73576a(this.f327429e, C101198e.C101199b.EDIT_PHOTO_CROP_UNDO, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bwq) {
            C101198e.C62622a.m73576a(this.f327429e, C101198e.C101199b.EDIT_PHOTO_CROP_ROTATE, (Bundle) null, 2, (Object) null);
            this.f327435n.announceForAccessibility(C76577a.m92166q(this.f327428d.getContext(), C0966R.string.f7538j2));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (this.f327428d.getVisibility() != i) {
            this.f327428d.clearAnimation();
            if (i == 0) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f327437p, C0966R.C0968anim.f2328p);
                loadAnimation.setAnimationListener(new C109378b(this, i));
                this.f327428d.startAnimation(loadAnimation);
                return;
            }
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f327437p, C0966R.C0968anim.f2329q);
            loadAnimation2.setAnimationListener(new C109379c(this, i));
            this.f327428d.startAnimation(loadAnimation2);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

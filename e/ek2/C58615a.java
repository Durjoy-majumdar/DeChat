package ek2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneAuthorLayout;
import ek2.C58619c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj2.C61767o;
import wj2.C66132f;

/* renamed from: ek2.a */
public final class C58615a implements C58619c {

    /* renamed from: a */
    public View f167823a;

    /* renamed from: b */
    public TextView f167824b = ((TextView) this.f167823a.findViewById(C0966R.C0970id.bki));

    /* renamed from: c */
    public MMAnimateView f167825c = ((MMAnimateView) this.f167823a.findViewById(C0966R.C0970id.iud));

    /* renamed from: d */
    public ImageView f167826d = ((ImageView) this.f167823a.findViewById(C0966R.C0970id.iuc));

    /* renamed from: e */
    public View f167827e = this.f167823a.findViewById(C0966R.C0970id.mgv);

    /* renamed from: f */
    public RingtoneAuthorLayout f167828f = ((RingtoneAuthorLayout) this.f167823a.findViewById(C0966R.C0970id.f359100mh1));

    /* renamed from: g */
    public Context f167829g;

    /* renamed from: h */
    public C66132f f167830h;

    /* renamed from: i */
    public C54219z<C58619c.C58620a> f167831i = new C54219z<>();

    /* renamed from: j */
    public View f167832j;

    /* renamed from: k */
    public View f167833k;

    /* renamed from: ek2.a$a */
    public static final class C58616a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58615a f167834d;

        public C58616a(C58615a aVar) {
            this.f167834d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58619c.C58621b.m68074a(this.f167834d, C58619c.C58620a.SWITCH, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ek2.a$b */
    public static final class C58617b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58615a f167835d;

        public C58617b(C58615a aVar) {
            this.f167835d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58619c.C58621b.m68074a(this.f167835d, C58619c.C58620a.SWITCH_DEFAULT, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C58615a(View view) {
        C87412m.m108594g(view, "rootView");
        this.f167823a = view;
        Context context = view.getContext();
        C87412m.m108593f(context, "rootView.context");
        this.f167829g = context;
        View findViewById = this.f167823a.findViewById(C0966R.C0970id.iuw);
        this.f167832j = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C58616a(this));
        }
        View findViewById2 = this.f167823a.findViewById(C0966R.C0970id.mh9);
        this.f167833k = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C58617b(this));
        }
    }

    /* renamed from: a */
    public void mo83500a(C58619c.C58620a aVar, Bundle bundle) {
        C87412m.m108594g(aVar, "status");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            this.f167831i.postValue(C58619c.C58620a.PLAY);
        } else if (ordinal == 1) {
            this.f167831i.postValue(C58619c.C58620a.SWITCH);
        } else if (ordinal == 2) {
            this.f167831i.postValue(C58619c.C58620a.SWITCH_DEFAULT);
        }
    }

    /* renamed from: b */
    public final void mo83501b(boolean z) {
        C66132f fVar = this.f167830h;
        if (!(fVar != null && fVar.f190091n)) {
            if (!z) {
                MMAnimateView mMAnimateView = this.f167825c;
                if (mMAnimateView != null) {
                    Context context = this.f167829g;
                    C87412m.m108594g(context, "context");
                    int d = C76577a.m92153d(context, C0966R.color.f2975b6);
                    Drawable mutate = C76577a.m92158i(context, C0966R.raw.icons_outlined_play2).mutate();
                    C87412m.m108593f(mutate, "getDrawable(context, drawableRes).mutate()");
                    mutate.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d), Color.red(d), Color.green(d), Color.blue(d)), PorterDuff.Mode.SRC_ATOP));
                    mutate.setAlpha(Color.alpha(d));
                    mMAnimateView.setImageDrawable(mutate);
                }
            } else {
                MMAnimateView mMAnimateView2 = this.f167825c;
                if (!(mMAnimateView2 != null && mMAnimateView2.mo129223q())) {
                    MMAnimateView mMAnimateView3 = this.f167825c;
                    if (mMAnimateView3 != null) {
                        mMAnimateView3.setImageFilePath(C61767o.m72469e(true));
                    }
                    MMAnimateView mMAnimateView4 = this.f167825c;
                    if (mMAnimateView4 != null) {
                        mMAnimateView4.mo129236w();
                    }
                }
            }
            View view = this.f167827e;
            if (view != null) {
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}

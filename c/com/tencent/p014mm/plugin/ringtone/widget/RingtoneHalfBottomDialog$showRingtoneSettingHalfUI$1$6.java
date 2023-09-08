package com.tencent.p014mm.plugin.ringtone.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import ck2.C54881c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import gy3.C8477a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import wj2.C66132f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onPause", "onDestroy", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6 */
public final class RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ View f164153d;

    /* renamed from: e */
    public final /* synthetic */ Context f164154e;

    /* renamed from: f */
    public final /* synthetic */ MMAnimateView f164155f;

    /* renamed from: g */
    public final /* synthetic */ View f164156g;

    /* renamed from: h */
    public final /* synthetic */ C54881c0 f164157h;

    /* renamed from: i */
    public final /* synthetic */ C66132f f164158i;

    /* renamed from: j */
    public final /* synthetic */ C8477a0 f164159j;

    public RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6(View view, Context context, MMAnimateView mMAnimateView, View view2, C54881c0 c0Var, C66132f fVar, C8477a0 a0Var) {
        this.f164153d = view;
        this.f164154e = context;
        this.f164155f = mMAnimateView;
        this.f164156g = view2;
        this.f164157h = c0Var;
        this.f164158i = fVar;
        this.f164159j = a0Var;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.f164153d.setBackground(this.f164154e.getDrawable(C0966R.C0969drawable.apb));
        this.f164155f.setVisibility(8);
        View view = this.f164156g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C54881c0 c0Var = this.f164157h;
        if (c0Var != null) {
            c0Var.mo75822a(this.f164158i, 0, false);
        }
        this.f164159j.f27482d = false;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        this.f164153d.setBackground(this.f164154e.getDrawable(C0966R.C0969drawable.apb));
        this.f164155f.setVisibility(8);
        View view = this.f164156g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C54881c0 c0Var = this.f164157h;
        if (c0Var != null) {
            c0Var.mo75822a(this.f164158i, 0, false);
        }
        this.f164159j.f27482d = false;
    }
}

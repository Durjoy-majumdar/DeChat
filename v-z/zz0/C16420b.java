package zz0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScreenCastEvent;
import com.tencent.p014mm.plugin.cast.banner.ScreenCastBanner$initialize$2;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xd3.C78802b;

/* renamed from: zz0.b */
public final class C16420b extends C78802b {

    /* renamed from: h */
    public Context f43831h;

    /* renamed from: i */
    public View f43832i;

    /* renamed from: j */
    public IListener<ScreenCastEvent> f43833j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16420b(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f43831h = context;
        View view = this.f230569f;
        if (view != null) {
            this.f43832i = view.findViewById(C0966R.C0970id.f357637ay0);
            this.f230569f.setOnClickListener(C16419a.f43830d);
        }
        mo7975g(8);
        ScreenCastBanner$initialize$2 screenCastBanner$initialize$2 = new ScreenCastBanner$initialize$2(this, C40008f.f107254d);
        this.f43833j = screenCastBanner$initialize$2;
        screenCastBanner$initialize$2.alive();
    }

    /* renamed from: a */
    public void mo7968a() {
        IListener<ScreenCastEvent> iListener = this.f43833j;
        if (iListener != null) {
            iListener.dead();
        }
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6793op;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 5;
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        super.mo7975g(i);
        View findViewById = this.f230569f.findViewById(C0966R.C0970id.f357637ay0);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

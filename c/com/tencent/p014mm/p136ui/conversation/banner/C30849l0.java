package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TriggerInitEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import pc0.C100769w;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.l0 */
public class C30849l0 extends C78802b {

    /* renamed from: h */
    public TextView f82869h;

    /* renamed from: i */
    public ImageView f82870i;

    /* renamed from: j */
    public View f82871j = null;

    /* renamed from: n */
    public boolean f82872n = false;

    /* renamed from: o */
    public IListener f82873o;

    /* renamed from: com.tencent.mm.ui.conversation.banner.l0$a */
    public class C30850a implements View.OnClickListener {
        public C30850a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/TryNewInitBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.TryNewInitBanner", "summerinit onClick trynewinit layout start try");
            C30849l0.this.mo7975g(8);
            new TriggerInitEvent().publish();
            Log.m105924i("MicroMsg.TryNewInitBanner", "summerinit onClick tryNeeInitAgain done callBack (now by event to notice initbanner)");
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C30849l0(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f82871j = view.findViewById(C0966R.C0970id.kpv);
            this.f82869h = (TextView) this.f230569f.findViewById(C0966R.C0970id.kpt);
            this.f82870i = (ImageView) this.f230569f.findViewById(C0966R.C0970id.kpu);
            TryNewInitBanner$1 tryNewInitBanner$1 = new TryNewInitBanner$1(this, C40008f.f107254d);
            this.f82873o = tryNewInitBanner$1;
            tryNewInitBanner$1.alive();
        }
    }

    /* renamed from: a */
    public void mo7968a() {
        this.f82873o.dead();
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.cau;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        boolean z = this.f82872n;
        if (!z) {
            Log.m105925i("MicroMsg.TryNewInitBanner", "summerinit update but initFailed[%b] just ret update false", Boolean.valueOf(z));
            View view = this.f82871j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return false;
        } else if (!C100769w.m131943b()) {
            Log.m105924i("MicroMsg.TryNewInitBanner", "summerinit update but not need init just update false");
            this.f82872n = false;
            View view3 = this.f82871j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return false;
        } else {
            this.f82869h.setText(C0966R.string.aiq);
            this.f82870i.setVisibility(0);
            this.f82871j.setOnClickListener(new C30850a());
            View view5 = this.f82871j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f82871j.getVisibility() == 0);
            Log.m105925i("MicroMsg.TryNewInitBanner", "summerinit update set visible [%b]", objArr);
            return true;
        }
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f82871j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

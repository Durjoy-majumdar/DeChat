package kr1;

import al3.C0086a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lh2.C109344g0;
import qh2.C101198e;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: kr1.o */
public final class C99176o implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public View f290816d;

    /* renamed from: e */
    public C101198e f290817e;

    /* renamed from: f */
    public final Context f290818f;

    /* renamed from: g */
    public final C13601g f290819g = C36568h.m40985a(new C99177a(this));

    /* renamed from: kr1.o$a */
    public static final class C99177a extends C87413o implements C32224a<C77398g> {

        /* renamed from: d */
        public final /* synthetic */ C99176o f290820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99177a(C99176o oVar) {
            super(0);
            this.f290820d = oVar;
        }

        public Object invoke() {
            Context context = this.f290820d.f290818f;
            C77389a aVar = new C77389a();
            aVar.f225660q = C0086a.m38a(context).getString(C0966R.string.d6j);
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a4h);
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f360090a14);
            C99176o oVar = this.f290820d;
            aVar.f225621D = new C99173l(oVar);
            aVar.f225620C = new C99174m(oVar);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.setOnDismissListener(new C99175n(this.f290820d));
            return gVar;
        }
    }

    public C99176o(View view, C101198e eVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "status");
        this.f290816d = view;
        this.f290817e = eVar;
        this.f290818f = view.getContext();
        this.f290816d.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99176o.class.getName();
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
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101198e.C62622a.m73576a(this.f290817e, C101198e.C101199b.SUB_RECORD_PREPARE_DELETE, (Bundle) null, 2, (Object) null);
        ((C77398g) ((C36570n) this.f290819g).getValue()).show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        View view = this.f290816d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

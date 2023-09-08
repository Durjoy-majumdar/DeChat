package l23;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lh2.C99417a;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: l23.y */
public final class C99325y extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public View f291242f;

    /* renamed from: g */
    public final String f291243g = "MicroMsg.EditFinishPlugin";

    /* renamed from: l23.y$a */
    public static final class C99326a implements CaptureDataManager.C94402a {

        /* renamed from: a */
        public final /* synthetic */ C99325y f291244a;

        public C99326a(C99325y yVar) {
            this.f291244a = yVar;
        }

        /* renamed from: a */
        public final void mo129803a() {
            C101198e.C62622a.m73576a(this.f291244a.f291492d, C101198e.C101199b.EDIT_FINISH, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C99325y(android.view.View r3, qh2.C101198e r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 0
            r2.<init>(r4, r0)
            r2.f291242f = r3
            java.lang.String r4 = "MicroMsg.EditFinishPlugin"
            r2.f291243g = r4
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x003b
            i33.b r4 = i33.C98595b.f289089a
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = "view.context"
            gy3.C87412m.m108593f(r3, r1)
            r1 = 1096810496(0x41600000, float:14.0)
            float r3 = r4.mo137983a(r3, r1)
            android.view.View r4 = r2.f291242f
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x0035
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0035:
            if (r0 == 0) goto L_0x003b
            r4 = 1
            r0.setTextSize(r4, r3)
        L_0x003b:
            android.view.View r3 = r2.f291242f
            r3.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l23.C99325y.<init>(android.view.View, qh2.e):void");
    }

    public void onAttach() {
        View view = this.f291242f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(this.f291243g, "on click edit finish");
        C110992d.f332425a.mo162669b(12);
        C110992d.f332428d.f310296i = System.currentTimeMillis();
        CaptureDataManager captureDataManager = CaptureDataManager.f272890c;
        Context context = this.f291242f.getContext();
        C99326a aVar = new C99326a(this);
        CaptureDataManager.C94403b bVar = captureDataManager.f272891a;
        if (!(bVar != null ? bVar.mo4198l1(context, captureDataManager.f272892b, aVar) : false)) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_FINISH, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
        View view = this.f291242f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

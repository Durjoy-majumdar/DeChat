package lh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lh2.C109344g0;
import p385u2.C111105a;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.l */
public final class C99448l implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public View f291584d;

    /* renamed from: e */
    public C101198e f291585e;

    /* renamed from: f */
    public final String f291586f = "MicroMsg.EditFinishPlugin";

    /* renamed from: lh2.l$a */
    public static final class C99449a implements CaptureDataManager.C94402a {

        /* renamed from: a */
        public final /* synthetic */ C99448l f291587a;

        public C99449a(C99448l lVar) {
            this.f291587a = lVar;
        }

        /* renamed from: a */
        public final void mo129803a() {
            C101198e.C62622a.m73576a(this.f291587a.f291585e, C101198e.C101199b.EDIT_START_MUX, (Bundle) null, 2, (Object) null);
        }
    }

    public C99448l(View view, C101198e eVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "status");
        this.f291584d = view;
        this.f291585e = eVar;
        view.setOnClickListener(this);
        View view2 = this.f291584d;
        Button button = view2 instanceof Button ? (Button) view2 : null;
        if (button != null) {
            button.setTextSize(0, ((float) C76577a.m92155f(view2.getContext(), C0966R.dimen.f3927j7)) * C76577a.m92161l(this.f291584d.getContext()));
        }
    }

    /* renamed from: a */
    public final void mo138884a(Integer num, Integer num2, String str, Integer num3) {
        int intValue;
        String str2 = this.f291586f;
        Log.m105924i(str2, str + ' ' + num3);
        View view = this.f291584d;
        if (!(num == null || num.intValue() == 0)) {
            view.setBackgroundResource(num.intValue());
        }
        if (num3 != null && (intValue = num3.intValue()) > 0) {
            this.f291584d.getLayoutParams().height = intValue;
        }
        if (!(num2 == null || num2.intValue() == 0 || !(view instanceof TextView))) {
            TextView textView = (TextView) view;
            textView.setTextColor(C111105a.m151500b(textView.getContext(), num2.intValue()));
        }
        if (!(str == null || str.length() == 0) && (view instanceof TextView)) {
            ((TextView) view).setText(str);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99448l.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
        View view = this.f291584d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(this.f291586f, "on click edit finish");
        C110992d.f332425a.mo162669b(12);
        C110992d.f332428d.f310296i = System.currentTimeMillis();
        CaptureDataManager captureDataManager = CaptureDataManager.f272890c;
        Context context = this.f291584d.getContext();
        C99449a aVar = new C99449a(this);
        CaptureDataManager.C94403b bVar = captureDataManager.f272891a;
        if (!(bVar != null ? bVar.mo4198l1(context, captureDataManager.f272892b, aVar) : false)) {
            C101198e.C62622a.m73576a(this.f291585e, C101198e.C101199b.EDIT_START_MUX, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
        View view = this.f291584d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

package k11;

import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

public final /* synthetic */ class v$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f29753d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f29754e;

    /* renamed from: f */
    public final /* synthetic */ long f29755f;

    public /* synthetic */ v$$d(CleanChattingUI cleanChattingUI, C101218e0 e0Var, long j) {
        this.f29753d = cleanChattingUI;
        this.f29754e = e0Var;
        this.f29755f = j;
    }

    public final void onClick(View view) {
        CleanChattingUI cleanChattingUI = this.f29753d;
        C101218e0 e0Var = this.f29754e;
        long j = this.f29755f;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(e0Var);
        arrayList.add(Long.valueOf(j));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingUI, array);
        e0Var.mo140680z();
        cleanChattingUI.mo127434J7(0, j, 0);
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

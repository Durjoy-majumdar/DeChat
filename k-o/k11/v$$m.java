package k11;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;

public final /* synthetic */ class v$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f29765d;

    /* renamed from: e */
    public final /* synthetic */ TextView[] f29766e;

    /* renamed from: f */
    public final /* synthetic */ long[] f29767f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f29768g;

    public /* synthetic */ v$$m(CleanChattingUI cleanChattingUI, TextView[] textViewArr, long[] jArr, Runnable runnable) {
        this.f29765d = cleanChattingUI;
        this.f29766e = textViewArr;
        this.f29767f = jArr;
        this.f29768g = runnable;
    }

    public final void onClick(View view) {
        CleanChattingUI cleanChattingUI = this.f29765d;
        TextView[] textViewArr = this.f29766e;
        long[] jArr = this.f29767f;
        Runnable runnable = this.f29768g;
        long[] jArr2 = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(textViewArr);
        arrayList.add(jArr);
        arrayList.add(runnable);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingUI, array);
        Calendar instance = Calendar.getInstance();
        int i = 0;
        if (view != textViewArr[0]) {
            i = 1;
        }
        C19877i iVar = new C19877i(cleanChattingUI);
        iVar.f56638o = new v$$r(instance, jArr, i, runnable);
        instance.setTimeInMillis(jArr[i]);
        iVar.mo26533c(instance.get(1), instance.get(2) + 1, instance.get(5));
        instance.setTimeInMillis(System.currentTimeMillis());
        iVar.mo26534d(instance.get(1), instance.get(2) + 1, instance.get(5));
        iVar.mo26535e(2011, 1, 21);
        iVar.mo26536f();
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

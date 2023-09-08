package k11;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import qo3.C12925w;
import zt3.C119157j;

public final /* synthetic */ class v$$n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290510d;

    /* renamed from: e */
    public final /* synthetic */ long[] f290511e;

    /* renamed from: f */
    public final /* synthetic */ int f290512f;

    /* renamed from: g */
    public final /* synthetic */ C12925w f290513g;

    public /* synthetic */ v$$n(CleanChattingUI cleanChattingUI, long[] jArr, int i, C12925w wVar) {
        this.f290510d = cleanChattingUI;
        this.f290511e = jArr;
        this.f290512f = i;
        this.f290513g = wVar;
    }

    public final void onClick(View view) {
        CleanChattingUI cleanChattingUI = this.f290510d;
        long[] jArr = this.f290511e;
        int i = this.f290512f;
        C12925w wVar = this.f290513g;
        long[] jArr2 = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(jArr);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(wVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingUI, array);
        cleanChattingUI.f267912x = Arrays.copyOf(jArr, 2);
        cleanChattingUI.f267911w = -1;
        cleanChattingUI.f267907s = i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        ((MMFilterDialog.C74986g.C74987a) ((ArrayList) cleanChattingUI.f267906r).get(i)).f220588b = simpleDateFormat.format(new Date(jArr[0])) + '~' + simpleDateFormat.format(new Date(jArr[1]));
        C99084r rVar = cleanChattingUI.f267895d;
        rVar.f290442f = Collections.emptyList();
        rVar.f290444h = 0;
        rVar.notifyDataSetChanged();
        cleanChattingUI.f267898g.setVisibility(0);
        cleanChattingUI.f267892A = true;
        ((C119157j) C119157j.f356862d).mo183871b(cleanChattingUI.f267894C, "CleanChattingLoad");
        wVar.mo5085n();
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

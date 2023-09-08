package iv2;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: iv2.a */
public final class C46289a {

    /* renamed from: a */
    public static final C46289a f124738a = new C46289a();

    /* renamed from: a */
    public final void mo71702a(Activity activity, int i, byte[] bArr, int i2) {
        SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bArr, "finderObjectBytes");
        Intent intent = new Intent();
        intent.putExtra("SELECT_OBJECT", bArr);
        intent.putExtra("SELECT_TAB_TYPE", i2);
        intent.setClass(activity, SnsCoverFinderPreviewUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/util/SetSnsBgFromFinderUtils", "enterSnsCoverFinderPreviewUI", "(Landroid/app/Activity;I[BI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
    }
}

package p858ng;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import hh2.C8532a;
import java.util.HashMap;
import java.util.Map;
import nj3.C11184p0;
import p855lg.C61278a;
import ph0.C100792a;
import rx3.C36570n;

/* renamed from: ng.j */
public final class C61703j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C61278a f175401d;

    /* renamed from: e */
    public final /* synthetic */ C61704k f175402e;

    public C61703j(C61278a aVar, C61704k kVar) {
        this.f175401d = aVar;
        this.f175402e = kVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C72963f4 f4Var;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C61278a aVar = this.f175401d;
            if (aVar != null) {
                AppCompatActivity activity = this.f175402e.getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                ((C61691c) a).mo86622c3().dispatch(new C61727v(aVar, 19));
            }
        } else if (itemId == 3) {
            C61704k kVar = this.f175402e;
            C61278a aVar2 = this.f175401d;
            kVar.getClass();
            Long l = null;
            String d = C100792a.f295260a.mo140233d(aVar2 != null ? aVar2.f174389h : null, aVar2 != null ? aVar2.f174390i : null);
            Object[] objArr = new Object[2];
            objArr[0] = d;
            if (!(aVar2 == null || (f4Var = aVar2.f174390i) == null)) {
                l = Long.valueOf(f4Var.getMsgId());
            }
            objArr[1] = l;
            Log.m105925i("MicroMsg.AlbumGalleryMenuUIC", "edit image path:%s msgId:%s", objArr);
            RecordConfigProvider b = RecordConfigProvider.m119432b(d, "");
            b.f272905F = 0;
            UICustomParam uICustomParam = new UICustomParam();
            Map<String, Boolean> map = uICustomParam.f266575h;
            Boolean bool = Boolean.TRUE;
            ((HashMap) map).put("plugin_filter", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
            b.f272927o = uICustomParam;
            C8532a.f27585a.mo9446e(kVar.getActivity(), 4096, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
        } else if (itemId == 4 && WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f175402e.getActivity())) {
            ((PhotoTransControl) ((C36570n) this.f175402e.f175404e).getValue()).mo128354a();
        }
    }
}

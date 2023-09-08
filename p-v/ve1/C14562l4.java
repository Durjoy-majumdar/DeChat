package ve1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C9556a;
import pe3.C89349b;

/* renamed from: ve1.l4 */
public final class C14562l4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ long f40347d;

    /* renamed from: e */
    public final /* synthetic */ String f40348e;

    /* renamed from: f */
    public final /* synthetic */ C89349b f40349f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f40350g;

    /* renamed from: h */
    public final /* synthetic */ C14570m4 f40351h;

    public C14562l4(long j, String str, C89349b bVar, C60905o oVar, C14570m4 m4Var) {
        this.f40347d = j;
        this.f40348e = str;
        this.f40349f = bVar;
        this.f40350g = oVar;
        this.f40351h = m4Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", this.f40347d);
        intent.putExtra("feed_object_nonceId", this.f40348e);
        intent.putExtra("key_show_jump_entry", false);
        C89349b bVar = this.f40349f;
        Intent intent2 = null;
        intent.putExtra("key_like_buffer", Util.encodeHexString(bVar != null ? bVar.mo123703f() : null));
        Context context = this.f40350g.f173499A;
        C87412m.m108593f(context, "holder.context");
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderShareFeedDetailUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        String str = this.f40351h.f40366e;
        Log.m105924i(str, "go detail, jumpFeedId:" + this.f40347d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

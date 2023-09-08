package px0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C22521pi1;

/* renamed from: px0.s */
public final class C22059s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22039d f62432d;

    /* renamed from: e */
    public final /* synthetic */ C22060t f62433e;

    /* renamed from: f */
    public final /* synthetic */ View f62434f;

    public C22059s(C22039d dVar, C22060t tVar, View view) {
        this.f62432d = dVar;
        this.f62433e = tVar;
        this.f62434f = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderMpItemConverter$onBindViewHolder$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        new Intent();
        C22039d dVar = this.f62432d;
        C22060t tVar = this.f62433e;
        View view2 = this.f62434f;
        if (dVar.f62373d.f64411F == 1) {
            Log.m105924i(tVar.f62435e, "jumpToFinder");
            Context context = view2.getContext();
            C87412m.m108593f(context, "context");
            C22521pi1 pi12 = dVar.f62373d;
            Class cls = C60200t1.class;
            Intent intent = new Intent();
            intent.putExtra("finder_username", pi12.f64432o);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(26, 2, 32, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
        } else {
            Log.m105924i(tVar.f62435e, "jumpToBiz");
            Context context2 = view2.getContext();
            C87412m.m108593f(context2, "context");
            C22521pi1 pi13 = dVar.f62373d;
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", pi13.f64426f);
            intent2.putExtra("Contact_Nick", pi13.f64425e);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("Contact_Scene", 236);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            intent2.putExtra("KOpenArticleSceneFromScene", 90);
            C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderMpItemConverter$onBindViewHolder$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

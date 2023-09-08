package yz1;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72763a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import sz1.C77815b;
import wz1.C78747b;
import wz1.C78753c;
import xz1.C79013a;
import yz1.C79206x;

/* renamed from: yz1.y */
public class C79212y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79206x f232547d;

    /* renamed from: yz1.y$a */
    public class C79213a implements C88144b.C76564c {
        public C79213a() {
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            C79206x.C79211e eVar;
            if (i == 3001) {
                Log.m105925i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "dealWithRequestCode() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", Integer.valueOf(i2));
                if (-1 == i2 && (eVar = C79212y.this.f232547d.f232522g) != null) {
                    C72763a0 a0Var = (C72763a0) eVar;
                    a0Var.f212094a.mo100506z();
                    a0Var.f212094a.mo100340A0();
                    C79206x xVar = C79212y.this.f232547d;
                    xVar.f232525j = "";
                    xVar.f232533r = null;
                    xVar.f232527l = null;
                    if (intent != null) {
                        C79206x.C79211e eVar2 = xVar.f232522g;
                        String stringExtra = intent.getStringExtra("key_group_solitatire_content");
                        C72763a0 a0Var2 = (C72763a0) eVar2;
                        if (a0Var2.f212094a.f211780L != null && !Util.isNullOrNil(stringExtra)) {
                            a0Var2.f212094a.f211780L.mo100657s(stringExtra);
                        }
                    }
                    C79212y.this.f232547d.f232524i = true;
                }
            }
        }
    }

    public C79212y(C79206x xVar) {
        this.f232547d = xVar;
    }

    public void onClick(View view) {
        Pair pair;
        Class cls = C77815b.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "click Tips");
        C79206x xVar = this.f232547d;
        if (xVar.f232527l != null || C78747b.m95090B(xVar.f232517b, xVar.f232537v)) {
            Intent intent = new Intent();
            C79206x xVar2 = this.f232547d;
            C79013a aVar = xVar2.f232527l;
            if (aVar == null) {
                xVar2.f232527l = new C79013a();
                C79013a aVar2 = this.f232547d.f232527l;
                aVar2.f232001H = this.f232547d.f232528m + "\n";
                C79013a aVar3 = this.f232547d.f232527l;
                aVar3.field_key = C78747b.m95115o(aVar3);
                C79013a aVar4 = this.f232547d.f232527l;
                aVar4.f232004K = ".";
                aVar4.f232009Q = 1;
                intent.putExtra("key_group_solitatire_create", true);
                intent.putExtra("key_group_solitatire_scene", 4);
            } else {
                aVar.field_key = C78747b.m95115o(aVar);
                C79206x xVar3 = this.f232547d;
                String str = xVar3.f232526k;
                String str2 = xVar3.f232527l.field_key;
                if (Util.isNullOrNil(str2)) {
                    pair = new Pair(Boolean.FALSE, (Object) null);
                } else {
                    C79013a f = ((C77815b) C86312j.m106911c(cls)).vx0().mo108668f(str, str2);
                    pair = f == null ? new Pair(Boolean.FALSE, (Object) null) : new Pair(Boolean.TRUE, f);
                }
                if (!((Boolean) pair.first).booleanValue()) {
                    C79206x xVar4 = this.f232547d;
                    if (!C78747b.m95092D(xVar4.f232517b, xVar4.f232537v)) {
                        C79013a aVar5 = this.f232547d.f232527l;
                        aVar5.f232001H = this.f232547d.f232517b.getString(C0966R.string.ffa) + "\n" + this.f232547d.f232527l.f232001H;
                        C79013a aVar6 = this.f232547d.f232527l;
                        aVar6.field_key = C78747b.m95115o(aVar6);
                    }
                    intent.putExtra("key_group_solitatire_create", true);
                } else if (this.f232547d.f232540y) {
                    intent.putExtra("key_group_solitatire_create", true);
                    C79206x xVar5 = this.f232547d;
                    if (!C78747b.m95092D(xVar5.f232517b, xVar5.f232537v)) {
                        C79013a aVar7 = this.f232547d.f232527l;
                        aVar7.f232001H = this.f232547d.f232517b.getString(C0966R.string.ffa) + "\n" + this.f232547d.f232527l.f232001H;
                        C79013a aVar8 = this.f232547d.f232527l;
                        aVar8.field_key = C78747b.m95115o(aVar8);
                    }
                } else {
                    intent.putExtra("key_group_solitatire_create", false);
                    C79206x xVar6 = this.f232547d;
                    xVar6.f232527l = C78747b.m95098J(xVar6.f232527l, xVar6.f232533r, (C79013a) pair.second);
                }
                intent.putExtra("key_group_solitatire_scene", 3);
            }
            intent.putExtra("key_group_solitatire_key", this.f232547d.f232527l.field_key);
            intent.putExtra("key_group_solitatire_chatroom_username", this.f232547d.f232526k);
            C79206x xVar7 = this.f232547d;
            C78747b.m95105e(xVar7.f232526k, xVar7.f232527l);
            C78753c vx02 = ((C77815b) C86312j.m106911c(cls)).vx0();
            C79206x xVar8 = this.f232547d;
            vx02.mo108673k(xVar8.f232526k, xVar8.f232527l);
            C88144b.m109798p(this.f232547d.f232518c, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new C79213a());
            this.f232547d.mo109223a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105920e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "why here???");
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

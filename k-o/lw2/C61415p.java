package lw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import ew2.C97757a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lw2.C99706q;

/* renamed from: lw2.p */
public final class C61415p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97757a f174662d;

    /* renamed from: e */
    public final /* synthetic */ C99706q.C99707a f174663e;

    public C61415p(C97757a aVar, C99706q.C99707a aVar2) {
        this.f174662d = aVar;
        this.f174663e = aVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryVisitorListAdapter$BubbleViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f174662d.f286808a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 12);
        C88144b.m109791i(this.f174663e.f292241A.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryVisitorListAdapter$BubbleViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

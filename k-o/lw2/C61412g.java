package lw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import ew2.C97757a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lw2.C99693f;

/* renamed from: lw2.g */
public final class C61412g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97757a f174656d;

    /* renamed from: e */
    public final /* synthetic */ C99693f.C99694a f174657e;

    public C61412g(C97757a aVar, C99693f.C99694a aVar2) {
        this.f174656d = aVar;
        this.f174657e = aVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f174656d.f286808a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 12);
        C88144b.m109791i(this.f174657e.f44854d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

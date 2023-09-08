package lw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import ew2.C97757a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lw2.C99698j;

/* renamed from: lw2.i */
public final class C61414i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97757a f174660d;

    /* renamed from: e */
    public final /* synthetic */ C99698j.C99699a f174661e;

    public C61414i(C97757a aVar, C99698j.C99699a aVar2) {
        this.f174660d = aVar;
        this.f174661e = aVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentListAdapter$CommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f174660d.f286808a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 12);
        C88144b.m109791i(this.f174661e.f292207A.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentListAdapter$CommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

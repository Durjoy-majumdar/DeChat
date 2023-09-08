package lw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lw2.C76729b;

/* renamed from: lw2.c */
public final class C76731c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f224486d;

    /* renamed from: e */
    public final /* synthetic */ C76729b f224487e;

    /* renamed from: f */
    public final /* synthetic */ C76729b.C76730a f224488f;

    public C76731c(String str, C76729b bVar, C76729b.C76730a aVar) {
        this.f224486d = str;
        this.f224487e = bVar;
        this.f224488f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.isSelected()) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", this.f224486d);
            intent.putExtra("Contact_ChatRoomId", this.f224487e.f224483e);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
            C88144b.m109791i(this.f224488f.f44854d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

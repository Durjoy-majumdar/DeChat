package dz2;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ke3.C88144b;
import p773yy.C79168k;
import uy2.C52665g;

/* renamed from: dz2.c */
public final class C45503c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72996z1 f123163d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f123164e;

    /* renamed from: f */
    public final /* synthetic */ C45505f f123165f;

    public C45503c(C72996z1 z1Var, C60905o oVar, C45505f fVar) {
        this.f123163d = z1Var;
        this.f123164e = oVar;
        this.f123165f = fVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f123163d.getUsername());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 54);
        C88144b.m109795m(this.f123164e.f173499A, Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(this.f123163d.getUsername(), this.f123165f.f123168e);
        C52665g.C52666a aVar = C52665g.f147055f;
        String username = this.f123163d.getUsername();
        C87412m.m108593f(username, "contact.username");
        aVar.mo73605b(username, 201);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

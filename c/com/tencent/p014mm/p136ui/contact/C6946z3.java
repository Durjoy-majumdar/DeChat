package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.GroupCardSelectUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsChatRoomMemberUI;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.contact.z3 */
public class C6946z3 extends C6881c1 {

    /* renamed from: j */
    public static final /* synthetic */ int f24642j = 0;

    /* renamed from: h */
    public int f24643h;

    /* renamed from: i */
    public C75700k0 f24644i = ((C75700k0) C86709a0.m107533q(C75700k0.class));

    /* renamed from: com.tencent.mm.ui.contact.z3$a */
    public class C6947a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f24645d;

        public C6947a(C72996z1 z1Var) {
            this.f24645d = z1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SnsGroupCardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C6946z3 z3Var = C6946z3.this;
            C72996z1 z1Var = this.f24645d;
            int i = C6946z3.f24642j;
            z3Var.getClass();
            String username = z1Var.getUsername();
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(username);
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(username);
            Intent intent = new Intent(z3Var.f24516d, SnsChatRoomMemberUI.class);
            intent.putExtra("RoomInfo_Id", username);
            intent.putExtra("room_member_count", p1);
            intent.putExtra("Add_address_titile", displayName);
            intent.putExtra("room_name", z1Var.getUsername());
            intent.putExtra("filter_open_im", true);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", z3Var.f24643h);
            Context context = z3Var.f24516d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/contact/SnsGroupCardAdapter", "goToRoomMember", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/ui/contact/SnsGroupCardAdapter", "goToRoomMember", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsGroupCardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C6946z3(Context context, List<C72996z1> list, List<String> list2, boolean z) {
        super(context, list, list2, z);
        this.f24643h = ((Activity) context).getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
    }

    /* renamed from: a */
    public int mo7885a() {
        return C0966R.C0971layout.d2m;
    }

    /* renamed from: b */
    public int mo7886b(C72996z1 z1Var) {
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(z1Var.getUsername());
        int i = 0;
        for (int i2 = 0; i2 < k5.size(); i2++) {
            C72996z1 z1Var2 = this.f24644i.mo96097Ni().get(k5.get(i2));
            if (z1Var2 != null) {
                String username = z1Var2.getUsername();
                boolean z = !TextUtils.isEmpty(username) && username.contains("@openim");
                if (z1Var2.mo62927s3() && !z && !C75592q0.m90764L(z1Var2.getUsername())) {
                    i++;
                }
            }
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        ((GroupCardSelectUI.C6829c) view2.getTag()).f24414e.setOnClickListener(new C6947a(this.f24517e.get(i)));
        return view2;
    }
}

package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.voip.model.C30534j;
import com.tencent.p014mm.plugin.voip.model.C71579i;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.voip.widget.InviteRemindDialog */
public class InviteRemindDialog extends MMBaseActivity {

    /* renamed from: e */
    public String f82281e = "";

    /* renamed from: f */
    public int f82282f = 0;

    /* renamed from: g */
    public TextView f82283g;

    /* renamed from: h */
    public TextView f82284h;

    /* renamed from: com.tencent.mm.plugin.voip.widget.InviteRemindDialog$a */
    public class C30542a implements View.OnClickListener {
        public C30542a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = null;
            if (InviteRemindDialog.this.f82281e != null) {
                try {
                    Map<String, C30534j.C30535a> b = C30534j.C30535a.m39121b((String) C86709a0.m107535s().mo121142i().mo119684e(77829, (Object) null));
                    if (b != null) {
                        if (b.size() > 0) {
                            if (b.containsKey(InviteRemindDialog.this.f82281e)) {
                                C30534j.C30535a aVar = b.get(InviteRemindDialog.this.f82281e);
                                aVar.f82262b++;
                                b.put(InviteRemindDialog.this.f82281e, aVar);
                            } else {
                                C30534j.C30535a aVar2 = new C30534j.C30535a();
                                aVar2.f82262b++;
                                b.put(InviteRemindDialog.this.f82281e, aVar2);
                            }
                        }
                        C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(b));
                        for (Map.Entry<String, C30534j.C30535a> value : b.entrySet()) {
                            C30534j.C30535a aVar3 = (C30534j.C30535a) value.getValue();
                            Log.m105918d("MMInviteRemindDialog", "val " + aVar3.f82261a + " " + aVar3.f82262b);
                        }
                    } else {
                        HashMap hashMap = new HashMap();
                        C30534j.C30535a aVar4 = new C30534j.C30535a();
                        aVar4.f82262b++;
                        hashMap.put(InviteRemindDialog.this.f82281e, aVar4);
                        C86709a0.m107535s().mo121142i().mo119676J(77829, C30534j.C30535a.m39120a(hashMap));
                        for (Map.Entry value2 : hashMap.entrySet()) {
                            C30534j.C30535a aVar5 = (C30534j.C30535a) value2.getValue();
                            Log.m105918d("MMInviteRemindDialog", "val " + aVar5.f82261a + " " + aVar5.f82262b);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MMInviteRemindDialog", e, "", new Object[0]);
                }
            }
            InviteRemindDialog inviteRemindDialog = InviteRemindDialog.this;
            int i = inviteRemindDialog.f82282f;
            if (i == 0) {
                str = inviteRemindDialog.getString(C0966R.string.f361522kh3);
            } else if (i == 1) {
                str = inviteRemindDialog.getString(C0966R.string.kjh);
            }
            String str2 = InviteRemindDialog.this.f82281e;
            C86709a0.m107524d().mo123460f(new C71579i(str2, str, C45628s0.m50810y(str2), 0));
            Intent intent = new Intent();
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", InviteRemindDialog.this.f82281e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, InviteRemindDialog.this);
            InviteRemindDialog.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.widget.InviteRemindDialog$b */
    public class C30543b implements View.OnClickListener {
        public C30543b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/InviteRemindDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            InviteRemindDialog.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: E7 */
    public static void m39126E7(Context context, String str, int i) {
        Intent intent = new Intent(context, InviteRemindDialog.class);
        intent.putExtra("InviteRemindDialog_User", str);
        intent.putExtra("InviteRemindDialog_Type", i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/voip/widget/InviteRemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void finish() {
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.bfr);
        this.f82283g = (TextView) findViewById(C0966R.C0970id.guv);
        this.f82284h = (TextView) findViewById(C0966R.C0970id.gur);
        this.f82281e = getIntent().getStringExtra("InviteRemindDialog_User");
        int intExtra = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
        this.f82282f = intExtra;
        if (intExtra == 0) {
            this.f82283g.setText(getString(C0966R.string.kio));
            this.f82284h.setText(getString(C0966R.string.kh4));
        } else if (intExtra == 1) {
            this.f82283g.setText(getString(C0966R.string.kjr));
            this.f82284h.setText(getString(C0966R.string.kji));
        }
        findViewById(C0966R.C0970id.guw).setOnClickListener(new C30542a());
        findViewById(C0966R.C0970id.gui).setOnClickListener(new C30543b());
    }
}

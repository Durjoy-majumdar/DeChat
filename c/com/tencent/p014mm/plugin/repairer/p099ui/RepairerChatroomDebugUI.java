package com.tencent.p014mm.plugin.repairer.p099ui;

import a11.C39479c;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.sdk.storage.sql.UpdateSql;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import p192l4.C10462b;
import p530fx.C45819c;
import p606mm.C47080g;
import p749xh.C53335e1;
import pg3.C77084b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;
import z04.C119027c;
import z04.C66725r;
import zi2.C79334a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI */
public final class RepairerChatroomDebugUI extends BaseRepairerUI {

    /* renamed from: d */
    public final C13601g f205425d = C36568h.m40985a(new C70973f(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$b */
    public static final class C42876b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f116099d;

        /* renamed from: e */
        public final /* synthetic */ C72996z1 f116100e;

        /* renamed from: f */
        public final /* synthetic */ C44661m1 f116101f;

        public C42876b(String str, C72996z1 z1Var, C44661m1 m1Var) {
            this.f116099d = str;
            this.f116100e = z1Var;
            this.f116101f = m1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String b = C66725r.m78728b("\n                username:" + this.f116099d + "\n                nickname:" + this.f116100e.getNickname() + "\n                remark:" + this.f116100e.f149513S0 + "\n                type:" + Integer.toBinaryString(this.f116100e.getType()) + "\n                memberCount:" + this.f116101f.field_memberCount + "\n                memberStatus:" + Integer.toBinaryString(this.f116101f.field_chatroomStatus) + "\n                memberFlag:" + Integer.toBinaryString(this.f116101f.field_chatroomdataflag) + "\n                memberList:" + this.f116101f.field_memberlist + "\n            ");
            String format = String.format("chatroom_info_%s_%s.txt", Arrays.copyOf(new Object[]{this.f116099d, Long.valueOf(C31543z5.m39453c())}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            byte[] bytes = b.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$a */
    public static final class C70968a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerChatroomDebugUI f205426d;

        public C70968a(RepairerChatroomDebugUI repairerChatroomDebugUI) {
            this.f205426d = repairerChatroomDebugUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205426d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$c */
    public static final class C70969c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f205427d;

        /* renamed from: e */
        public final /* synthetic */ RepairerChatroomDebugUI f205428e;

        public C70969c(String str, RepairerChatroomDebugUI repairerChatroomDebugUI) {
            this.f205427d = str;
            this.f205428e = repairerChatroomDebugUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SingleTable singleTable = C53335e1.f149283M;
            ContentValues contentValues = new ContentValues();
            contentValues.put("spamStatus", 1);
            UpdateSql build = C53335e1.f149283M.update(contentValues).where(C53335e1.f149285P.equal(this.f205427d)).build();
            C87412m.m108593f(build, "update().setSpamStatus(1…al(chatroomName)).build()");
            if (build.run(C53335e1.f149324r1.getDB()) > 0) {
                Toast.makeText(this.f205428e, "本地封禁成功", 0).show();
            } else {
                Toast.makeText(this.f205428e, "本地封禁失败", 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$d */
    public static final class C70970d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f205429d;

        /* renamed from: e */
        public final /* synthetic */ RepairerChatroomDebugUI f205430e;

        public C70970d(String str, RepairerChatroomDebugUI repairerChatroomDebugUI) {
            this.f205429d = str;
            this.f205430e = repairerChatroomDebugUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SingleTable singleTable = C53335e1.f149283M;
            ContentValues contentValues = new ContentValues();
            contentValues.put("spamStatus", 0);
            UpdateSql build = C53335e1.f149283M.update(contentValues).where(C53335e1.f149285P.equal(this.f205429d)).build();
            C87412m.m108593f(build, "update().setSpamStatus(0…al(chatroomName)).build()");
            if (build.run(C53335e1.f149324r1.getDB()) > 0) {
                Toast.makeText(this.f205430e, "本地解封成功", 0).show();
            } else {
                Toast.makeText(this.f205430e, "本地解封失败", 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$e */
    public static final class C70971e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f205431d;

        /* renamed from: e */
        public final /* synthetic */ RepairerChatroomDebugUI f205432e;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$e$a */
        public static final class C70972a<T extends C77084b> implements C77084b {

            /* renamed from: a */
            public final /* synthetic */ RepairerChatroomDebugUI f205433a;

            public C70972a(RepairerChatroomDebugUI repairerChatroomDebugUI) {
                this.f205433a = repairerChatroomDebugUI;
            }

            /* renamed from: a */
            public final void mo10150a(int i, int i2, String str, C77084b<?> bVar) {
                if (i == 0 && i2 == 0) {
                    Toast.makeText(this.f205433a, "GetChatRoomInfo成功", 0).show();
                } else {
                    Toast.makeText(this.f205433a, "GetChatRoomInfo失败", 0).show();
                }
            }
        }

        public C70971e(String str, RepairerChatroomDebugUI repairerChatroomDebugUI) {
            this.f205431d = str;
            this.f205432e = repairerChatroomDebugUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C72940a o = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f205431d).mo71504o(this.f205431d);
            o.f212615d = new C70972a(this.f205432e);
            o.mo100865c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI$f */
    public static final class C70973f extends C87413o implements C32224a<C79334a> {

        /* renamed from: d */
        public final /* synthetic */ RepairerChatroomDebugUI f205434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70973f(RepairerChatroomDebugUI repairerChatroomDebugUI) {
            super(0);
            this.f205434d = repairerChatroomDebugUI;
        }

        public Object invoke() {
            View findViewById = this.f205434d.findViewById(C0966R.C0970id.iwq);
            int i = C0966R.C0970id.bim;
            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.bim);
            if (button != null) {
                i = C0966R.C0970id.biu;
                Button button2 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.biu);
                if (button2 != null) {
                    i = C0966R.C0970id.bkj;
                    Button button3 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.bkj);
                    if (button3 != null) {
                        LinearLayout linearLayout = (LinearLayout) findViewById;
                        i = C0966R.C0970id.f359455bm0;
                        Button button4 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f359455bm0);
                        if (button4 != null) {
                            return new C79334a(linearLayout, button, button2, button3, linearLayout, button4);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7204w6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("群聊调试页面");
        setBackBtn(new C70968a(this));
        String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null || C112551y.m153811k(stringExtra)) {
            finish();
            return;
        }
        ((C79334a) ((C36570n) this.f205425d).getValue()).f232900a.setOnClickListener(new C42876b(stringExtra, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(stringExtra), ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(stringExtra)));
        ((C79334a) ((C36570n) this.f205425d).getValue()).f232901b.setOnClickListener(new C70969c(stringExtra, this));
        ((C79334a) ((C36570n) this.f205425d).getValue()).f232903d.setOnClickListener(new C70970d(stringExtra, this));
        ((C79334a) ((C36570n) this.f205425d).getValue()).f232902c.setOnClickListener(new C70971e(stringExtra, this));
    }
}

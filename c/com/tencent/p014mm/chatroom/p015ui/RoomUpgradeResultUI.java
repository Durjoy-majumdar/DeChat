package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import p196ln.C76705f;

@Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeResultUI */
public class RoomUpgradeResultUI extends MMActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f10170o = 0;

    /* renamed from: d */
    public Button f10171d;

    /* renamed from: e */
    public String f10172e;

    /* renamed from: f */
    public View f10173f;

    /* renamed from: g */
    public ImageView f10174g;

    /* renamed from: h */
    public TextView f10175h;

    /* renamed from: i */
    public TextView f10176i;

    /* renamed from: j */
    public TextView f10177j;

    /* renamed from: n */
    public C44661m1 f10178n;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeResultUI$a */
    public class C1188a implements MenuItem.OnMenuItemClickListener {
        public C1188a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RoomUpgradeResultUI roomUpgradeResultUI = RoomUpgradeResultUI.this;
            int i = RoomUpgradeResultUI.f10170o;
            roomUpgradeResultUI.mo1088H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeResultUI$b */
    public class C1189b implements View.OnClickListener {
        public C1189b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", RoomUpgradeResultUI.this.getString(C0966R.string.b5y, new Object[]{LocaleUtil.getApplicationLanguage()}));
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            C88144b.m109794l(RoomUpgradeResultUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", 0);
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo1088H7() {
        Intent intent = new Intent(this, RoomUpgradeUI.class);
        intent.addFlags(67108864);
        intent.putExtra("finish_self", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public final void mo1089I7(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            String j3 = z1Var.mo62909j3();
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f10174g, str);
            this.f10175h.setVisibility(0);
            this.f10175h.setText(j3);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6822ph;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i9t);
        setBackBtn(new C1188a());
        this.f10173f = findViewById(C0966R.C0970id.l0z);
        this.f10174g = (ImageView) findViewById(C0966R.C0970id.l0y);
        this.f10175h = (TextView) findViewById(C0966R.C0970id.f359462l10);
        this.f10176i = (TextView) findViewById(C0966R.C0970id.l0v);
        this.f10177j = (TextView) findViewById(C0966R.C0970id.l0w);
        Button button = (Button) findViewById(C0966R.C0970id.exk);
        this.f10171d = button;
        button.setOnClickListener(new C1189b());
        this.f10171d.setVisibility(0);
        String str = this.f10178n.field_roomowner;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) > 0) {
            mo1089I7(str);
        } else {
            C31519v2.m39436a().mo55988e(str, this.f10172e, new C1229z1(this, str));
        }
        int o2 = this.f10178n.mo69787o2();
        this.f10176i.setVisibility(0);
        this.f10176i.setText(getString(C0966R.string.i_1, new Object[]{Integer.valueOf(o2)}));
        this.f10171d.setText(C0966R.string.i9w);
        this.f10177j.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("chatroom");
        this.f10172e = stringExtra;
        Log.m105925i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", stringExtra);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f10172e);
        this.f10178n = Lo;
        if (Lo == null) {
            mo1088H7();
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo1088H7();
        return true;
    }
}

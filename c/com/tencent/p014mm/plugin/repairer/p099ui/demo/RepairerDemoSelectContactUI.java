package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import kotlin.Metadata;
import p240sx.C13796o;
import p240sx.C77807p;
import p278yh.C16010q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import te3.C64468jf3;
import zl3.C79397a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI */
public final class RepairerDemoSelectContactUI extends BaseMvvmActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f20449e = 0;

    /* renamed from: d */
    public final C13601g f20450d = C36568h.m40985a(new C5096h(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$a */
    public static final class C5089a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20451d;

        public C5089a(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20451d = repairerDemoSelectContactUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20451d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$b */
    public static final class C5090b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20452d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$b$a */
        public static final class C5091a implements MMFragmentActivity$$g {

            /* renamed from: a */
            public static final C5091a f20453a = new C5091a();

            /* renamed from: a */
            public final void mo5702a(int i, Intent intent) {
                byte[] byteArrayExtra;
                C64468jf3 jf32 = new C64468jf3();
                if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) == null)) {
                    try {
                        jf32.parseFrom(byteArrayExtra);
                    } catch (Throwable unused) {
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                Log.m105924i("MicroMsg.RepairerChooseChatroomMemberUI", "resultCode: " + i + " pojoContactList:" + jf32.toJSON());
            }
        }

        public C5090b(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20452d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f20452d;
            C64186f0 f0Var = C64186f0.f181907d;
            this.f20452d.startActivityForResult(((C13796o) C86312j.m106911c(C13796o.class)).mo13156ZP(repairerDemoSelectContactUI, "选择群成员", "", f0Var, f0Var)).mo7677b(C5091a.f20453a);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$d */
    public static final class C5092d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20454d;

        public C5092d(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20454d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent nz = ((C13796o) C86312j.m106911c(C13796o.class)).mo13159nz(this.f20454d);
            RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f20454d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(nz);
            RepairerDemoSelectContactUI repairerDemoSelectContactUI2 = repairerDemoSelectContactUI;
            C117292a.m165358d(repairerDemoSelectContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            repairerDemoSelectContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(repairerDemoSelectContactUI2, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$e */
    public static final class C5093e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20455d;

        public C5093e(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20455d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent S30 = ((C13796o) C86312j.m106911c(C13796o.class)).S30(this.f20455d, "选择自动备份的聊天");
            RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f20455d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(S30);
            RepairerDemoSelectContactUI repairerDemoSelectContactUI2 = repairerDemoSelectContactUI;
            C117292a.m165358d(repairerDemoSelectContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            repairerDemoSelectContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(repairerDemoSelectContactUI2, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$f */
    public static final class C5094f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20456d;

        public C5094f(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20456d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20456d.startActivityForResult(((C13796o) C86312j.m106911c(C13796o.class)).mo13158i(this.f20456d, "折叠的群聊", false, (List<String>) null), 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$g */
    public static final class C5095g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20457d;

        public C5095g(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20457d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent b = ((C13796o) C86312j.m106911c(C13796o.class)).mo13157b(this.f20457d, "客服消息", false, (List<String>) null);
            b.putExtra("list_attr", 64);
            b.putExtra("max_limit_num", 9);
            this.f20457d.startActivityForResult(b, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$h */
    public static final class C5096h extends C87413o implements C32224a<C16010q> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5096h(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            super(0);
            this.f20458d = repairerDemoSelectContactUI;
        }

        public Object invoke() {
            RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f20458d;
            int i = RepairerDemoSelectContactUI.f20449e;
            return new C16010q(repairerDemoSelectContactUI.getContentView());
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$c */
    public static final class C5097c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDemoSelectContactUI f20459d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI$c$a */
        public static final class C5098a implements MMFragmentActivity$$g {

            /* renamed from: a */
            public static final C5098a f20460a = new C5098a();

            /* renamed from: a */
            public final void mo5702a(int i, Intent intent) {
                byte[] byteArrayExtra;
                C64468jf3 jf32 = new C64468jf3();
                if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) == null)) {
                    try {
                        jf32.parseFrom(byteArrayExtra);
                    } catch (Throwable unused) {
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                Log.m105924i("MicroMsg.RepairerChooseChatroomMemberUI", "resultCode: " + i + " pojoContactList:" + jf32.toJSON());
            }
        }

        public C5097c(RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
            this.f20459d = repairerDemoSelectContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f20459d;
            C64186f0 f0Var = C64186f0.f181907d;
            Intent Qi = ((C77807p) C86312j.m106911c(C77807p.class)).mo107757Qi(repairerDemoSelectContactUI, "", f0Var, f0Var);
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.f232918a.f232909a = this.f20459d.getContext();
            aVar.mo109373c(Qi);
            aVar.mo109371a("com.tencent.mm.ui.mvvm.MvvmSelectContactUI");
            aVar.f232918a.f232913e = C5098a.f20460a;
            aVar.mo109374d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final C16010q mo6061H7() {
        return (C16010q) ((C36570n) this.f20450d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d6x;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 1 || i == 2) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105924i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsernames " + stringExtra);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C5089a(this));
        C16010q H7 = mo6061H7();
        if (H7.f43076c == null) {
            H7.f43076c = (Button) H7.f43074a.findViewById(C0966R.C0970id.o3t);
        }
        H7.f43076c.setOnClickListener(new C5090b(this));
        C16010q H72 = mo6061H7();
        if (H72.f43079f == null) {
            H72.f43079f = (Button) H72.f43074a.findViewById(C0966R.C0970id.ncw);
        }
        H72.f43079f.setOnClickListener(new C5097c(this));
        C16010q H73 = mo6061H7();
        if (H73.f43078e == null) {
            H73.f43078e = (Button) H73.f43074a.findViewById(C0966R.C0970id.o3v);
        }
        H73.f43078e.setOnClickListener(new C5092d(this));
        C16010q H74 = mo6061H7();
        if (H74.f43077d == null) {
            H74.f43077d = (Button) H74.f43074a.findViewById(C0966R.C0970id.oow);
        }
        H74.f43077d.setOnClickListener(new C5093e(this));
        C16010q H75 = mo6061H7();
        if (H75.f43075b == null) {
            H75.f43075b = (Button) H75.f43074a.findViewById(C0966R.C0970id.o3u);
        }
        H75.f43075b.setOnClickListener(new C5094f(this));
        C16010q H76 = mo6061H7();
        if (H76.f43080g == null) {
            H76.f43080g = (Button) H76.f43074a.findViewById(C0966R.C0970id.ois);
        }
        H76.f43080g.setOnClickListener(new C5095g(this));
    }
}

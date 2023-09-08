package df2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.p088ui.PermissionSettingUI;
import com.tencent.p014mm.plugin.profile.p088ui.PermissionSettingUI2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import cw0.C116541b;
import cw0.C116542c;
import cw0.C7140d;
import cw0.C75305e;
import d62.C7250m;
import dg0.C75398e;
import di3.C86312j;
import eb0.C45616o2;
import eb0.C45628s0;
import eb0.C75572e0;
import eb0.C75604z3;
import eb0.C97625j3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C45759r0;
import fd0.C75742g;
import h81.C32735h;
import he0.C46021h;
import hg0.C76166a;
import ie0.C46220j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jr2.C99019x;
import k20.C9556a;
import md3.C47001b;
import ne0.C47224a;
import ne0.C47227b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import os2.C11766m0;
import p154fy.C87121j;
import p214om.C11502f;
import p244tt.C14088e;
import p275xz.C79012e;
import p695tj.C52345a;
import p695tj.C78033b;
import p749xh.C53354z6;
import p920uj.C78177a;
import p920uj.C78178b;
import tc0.C48627f;
import tc0.C77885p;
import te3.C49072d00;
import te3.C52085y83;
import wc3.C15141z;
import xc0.C78795g;
import zt3.C119157j;

/* renamed from: df2.g */
public class C75381g implements MenuItem.OnMenuItemClickListener, C11182m0, C11184p0, C47001b.C47002a {

    /* renamed from: d */
    public MMActivity f221633d;

    /* renamed from: e */
    public C72996z1 f221634e;

    /* renamed from: f */
    public int f221635f;

    /* renamed from: g */
    public boolean f221636g;

    /* renamed from: h */
    public boolean f221637h;

    /* renamed from: i */
    public ProgressDialog f221638i = null;

    /* renamed from: df2.g$b */
    public class C45337b implements MMActivity.C6739d {
        public C45337b() {
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            Class cls = C46021h.class;
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("be_send_card_name");
                String stringExtra2 = intent.getStringExtra("received_card_name");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                String stringExtra3 = intent.getStringExtra("custom_send_text");
                if (!C72996z1.m85846q5(stringExtra)) {
                    C7250m.m7431a().Y50(stringExtra, stringExtra2, booleanExtra);
                } else if (((C46021h) C86312j.m106911c(cls)).mo71456Sq(stringExtra2, stringExtra)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C53354z6 au = ((C46021h) C86312j.m106911c(cls)).mo71460au(stringExtra);
                    if (au != null) {
                        ((C119157j) C119157j.f356862d).mo183870a(new C47227b(stringExtra2, (C46220j) au, currentTimeMillis));
                    }
                }
                C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra2);
                MMActivity mMActivity = C75381g.this.f221633d;
                C75026b.m89951a(mMActivity, mMActivity.getString(C0966R.string.euo));
            }
        }
    }

    /* renamed from: df2.g$a */
    public class C75382a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckBox f221639d;

        /* renamed from: df2.g$a$a */
        public class C75383a extends C78033b {
            public C75383a() {
            }

            /* renamed from: a */
            public void mo73364a(int i, int i2, String str, C75572e0 e0Var) {
                C78033b bVar = (C78033b) e0Var;
                C75382a aVar = C75382a.this;
                C75381g gVar = C75381g.this;
                CheckBox checkBox = aVar.f221639d;
                if (gVar.f221634e.getSource() == 18) {
                    gVar.f221635f = 9;
                    if (checkBox != null && checkBox.isChecked()) {
                        gVar.mo105724h();
                    }
                }
            }
        }

        public C75382a(CheckBox checkBox) {
            this.f221639d = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C45616o2 i2 = C75381g.this.mo105725i();
            if (i2 == null) {
                Log.m105920e("MicroMsg.ProfileMenuManager", "dealSetBlack iContactCallbackFactory is null????");
            } else {
                ((C78177a) i2).mo108162a(new C75383a());
            }
            C42599h.xx0(C75381g.this.f221633d.getIntent(), 14, 3, C75381g.this.f221634e.getUsername());
        }
    }

    /* renamed from: df2.g$c */
    public class C75384c implements C14088e.C14090b {
        public C75384c() {
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("MicroMsg.ProfileMenuManager", "OpenLiteApp success");
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("MicroMsg.ProfileMenuManager", "OpenLiteApp fail");
            C75381g.this.mo105723g();
        }
    }

    /* renamed from: df2.g$d */
    public class C75385d implements DialogInterface.OnClickListener {
        public C75385d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75381g.m90400a(C75381g.this);
        }
    }

    /* renamed from: df2.g$e */
    public class C75386e extends C78033b {
        public C75386e() {
        }

        /* renamed from: a */
        public void mo73364a(int i, int i2, String str, C75572e0 e0Var) {
            C78033b bVar = (C78033b) e0Var;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            String str2 = "";
            objArr[2] = Util.nullAs(str, str2);
            objArr[3] = bVar != null ? Integer.valueOf(bVar.f228777a) : "null";
            Log.m105925i("MicroMsg.ProfileMenuManager", "moveInBlackList errType:%s errCode:%s errMsg:%s ret:%s", objArr);
            if (this.f228777a == 0) {
                C75381g.this.f221634e.mo62853E3();
                C52345a.m58584b(C75381g.this.f221634e);
                C76912y0.makeText((Context) C75381g.this.f221633d, (int) C0966R.string.hn5, 1).show();
                return;
            }
            C75381g.this.f221634e.mo62933t4();
            C52345a.m58586d(C75381g.this.f221634e);
            if (!Util.isNullOrNil(this.f228778b)) {
                str2 = this.f228778b;
            }
            if (!Util.isNullOrNil(this.f228779c)) {
                str = this.f228779c;
            } else if (Util.isNullOrNil(str)) {
                str = C75381g.this.f221633d.getString(C0966R.string.hn4);
            }
            MMActivity mMActivity = C75381g.this.f221633d;
            C76879j.m92754y(mMActivity, str, str2, mMActivity.getString(C0966R.string.lkg), new C75391i(this));
            C75381g.m90400a(C75381g.this);
        }
    }

    /* renamed from: df2.g$f */
    public class C75387f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckBox f221645d;

        public C75387f(CheckBox checkBox) {
            this.f221645d = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Iterable<C86001b0> t;
            C75381g gVar = C75381g.this;
            gVar.getClass();
            C115669n.INSTANCE.mo160131h(14553, 2, 2, gVar.f221634e.getUsername());
            String username = gVar.f221634e.getUsername();
            gVar.f221634e.mo62860K2("");
            gVar.f221634e.mo62895d4("");
            String str = null;
            gVar.f221634e.mo73959N2((C49072d00) null);
            String a = C78795g.m95196e().mo108704a(username);
            C86009m1 m1Var = new C86009m1(a);
            if (m1Var.mo119967g() && m1Var.mo119977o() && (t = C86013q1.m106459t(a, true)) != null) {
                for (C86001b0 next : t) {
                    if (next != null) {
                        Log.m105925i("MicroMsg.ProfileMenuManager", "deleteUselessFiles: %s", next.f250472b);
                        next.mo119954a();
                    }
                }
            }
            String username2 = gVar.f221634e.getUsername();
            Log.m105925i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, userName: %s.", username2);
            if (!((C11766m0) C99019x.m128974f()).mo11654bD(username2, 5)) {
                Log.m105925i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, is no InTagList, userName: %s.", username2);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(username2);
                PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
                PostSnsTagMemberOptionEvent.C40153a aVar = postSnsTagMemberOptionEvent.f107691d;
                aVar.f107696e = linkedList;
                aVar.f107692a = 2;
                aVar.f107693b = 5;
                aVar.f107694c = 1;
                postSnsTagMemberOptionEvent.publish();
            }
            if (C45628s0.m50743H(username)) {
                gVar.f221634e.mo62935u4();
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48627f(username));
                C97625j3.m125812b().mo105907v().mo69688c(username);
                ((C44662n1) C97625j3.m125812b().mo105902q()).mo69807jo(username);
            } else {
                gVar.f221637h = false;
                MMActivity mMActivity = gVar.f221633d;
                gVar.f221638i = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), gVar.f221633d.getString(C0966R.string.a4d), true, true, new C75394l(gVar));
                if (!gVar.f221637h) {
                    str = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(gVar.f221634e.getUsername());
                }
                if (!Util.isNullOrNil(str)) {
                    gVar.f221638i.dismiss();
                    MMActivity mMActivity2 = gVar.f221633d;
                    C76879j.m92718L(mMActivity2, false, mMActivity2.getString(C0966R.string.ks8, new Object[]{str}), (String) null, gVar.f221633d.getString(C0966R.string.fey), gVar.f221633d.getString(C0966R.string.by_), new C75395m(gVar), new C75396n(gVar, username), -1, C0966R.color.f3041d1);
                } else {
                    gVar.mo105722f(username);
                }
            }
            if (C75381g.this.f221634e.getSource() == 18) {
                C75381g.this.f221635f = 9;
                if (this.f221645d.isChecked()) {
                    C75381g.this.mo105724h();
                }
            }
        }
    }

    /* renamed from: df2.g$g */
    public class C75388g implements z3$$g {
        public C75388g() {
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return C75381g.this.f221637h;
        }

        /* renamed from: c */
        public void mo24604c() {
        }
    }

    /* renamed from: df2.g$h */
    public class C75389h implements C11184p0, C11182m0 {
        public C75389h(C75382a aVar) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C72996z1 z1Var = C75381g.this.f221634e;
            if (z1Var != null && C72996z1.m85846q5(z1Var.getUsername())) {
                e0Var.mo107125a(10, C0966R.string.bqy);
            }
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72996z1 z1Var = C75381g.this.f221634e;
            if (z1Var != null && C72996z1.m85846q5(z1Var.getUsername())) {
                C75381g.this.mo105726j(menuItem.getItemId());
            }
        }
    }

    public C75381g(MMActivity mMActivity, C72996z1 z1Var) {
        this.f221633d = mMActivity;
        this.f221634e = z1Var;
        this.f221635f = mMActivity.getIntent().getIntExtra("Contact_Scene", 9);
        this.f221636g = this.f221633d.getIntent().getBooleanExtra("Contact_FMessageCard", false);
    }

    /* renamed from: a */
    public static void m90400a(C75381g gVar) {
        MMActivity mMActivity = gVar.f221633d;
        if (mMActivity instanceof MStorageEx.IOnStorageChange) {
            ((MStorageEx.IOnStorageChange) mMActivity).onNotifyChange(0, (MStorageEx) null, gVar.f221634e.getUsername());
        }
    }

    /* renamed from: b */
    public void mo105718b() {
        Intent intent = new Intent();
        intent.putExtra("Select_Talker_Name", this.f221634e.getUsername());
        intent.putExtra("Select_block_List", this.f221634e.getUsername());
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("Select_Send_Card", true);
        intent.putExtra("mutil_select_is_ret", true);
        C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
        C45337b bVar = new C45337b();
        MMActivity mMActivity = this.f221633d;
        ((C67654r1) yM).getClass();
        if (mMActivity != null) {
            intent.setClass(mMActivity, SelectConversationUI.class);
            mMActivity.mmStartActivityForResult(bVar, intent, 0);
        }
    }

    /* renamed from: c */
    public void mo105719c(boolean z) {
        if (this.f221634e.mo62920o3()) {
            C45616o2 c = C52345a.m58585c(this.f221634e);
            if (c != null) {
                C78177a aVar = (C78177a) c;
                ((ArrayList) aVar.f229030c).add(new C75393k(this));
                MMActivity mMActivity = this.f221633d;
                ((C78178b) aVar).mo108164c(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f221633d.getString(C0966R.string.a4d), true, false, (DialogInterface.OnCancelListener) null);
            }
            C42599h.xx0(this.f221633d.getIntent(), 14, 2, this.f221634e.getUsername());
            return;
        }
        View inflate = View.inflate(this.f221633d, C0966R.C0971layout.bbt, (ViewGroup) null);
        inflate.setPadding(0, 0, 0, 0);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gun);
        textView.setPadding(0, 0, 0, 0);
        textView.setText(C72996z1.m85843n5(this.f221634e.getUsername()) ? C0966R.string.bok : C0966R.string.boj);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.gul);
        checkBox.setChecked(false);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gum);
        textView2.setText(C0966R.string.bol);
        if (this.f221634e.getSource() == 18) {
            checkBox.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            checkBox.setVisibility(8);
            textView2.setVisibility(8);
        }
        if (z) {
            MMActivity mMActivity2 = this.f221633d;
            C76879j.m92715I(mMActivity2, false, mMActivity2.getString(C0966R.string.boi), inflate, this.f221633d.getString(C0966R.string.a18), this.f221633d.getString(C0966R.string.f7926wf), new C75382a(checkBox), new C75385d());
            return;
        }
        mo105725i();
        C42599h.xx0(this.f221633d.getIntent(), 14, 3, this.f221634e.getUsername());
    }

    /* renamed from: d */
    public void mo105720d() {
        Intent intent = new Intent(this.f221633d, ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 0) == 0 ? PermissionSettingUI.class : PermissionSettingUI2.class);
        intent.putExtra("sns_permission_userName", this.f221634e.getUsername());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", this.f221633d.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0));
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 1);
        intent.putExtra("INTENT_SOURCE_FROM_PROFILE_MENU", true);
        MMActivity mMActivity = this.f221633d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMActivity mMActivity2 = mMActivity;
        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: e */
    public void mo105721e() {
        String str;
        View inflate = View.inflate(this.f221633d, C0966R.C0971layout.bbt, (ViewGroup) null);
        inflate.setPadding(0, 0, 0, 0);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gun);
        textView.setPadding(0, 0, 0, 0);
        if (C45628s0.m50743H(this.f221634e.getUsername())) {
            str = this.f221633d.getString(C0966R.string.bxu, new Object[]{this.f221634e.mo62898f()});
        } else {
            str = this.f221633d.getString(C0966R.string.bxs, new Object[]{this.f221634e.mo62898f()});
        }
        textView.setText(str);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.gul);
        checkBox.setChecked(false);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gum);
        textView2.setText(C0966R.string.bol);
        if (this.f221634e.getSource() == 18) {
            checkBox.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            checkBox.setVisibility(8);
            textView2.setVisibility(8);
        }
        MMActivity mMActivity = this.f221633d;
        C76879j.m92716J(mMActivity, true, mMActivity.getString(C0966R.string.blq), inflate, this.f221633d.getString(C0966R.string.f7944x1), this.f221633d.getString(C0966R.string.f7926wf), new C75387f(checkBox), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
    }

    /* renamed from: f */
    public final void mo105722f(String str) {
        C76166a a;
        this.f221634e.mo62935u4();
        if (C72996z1.m85843n5(str)) {
            this.f221634e.mo62912k4(0);
            ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71241e9(str);
            C75604z3.m90836h(str, new C75388g());
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
            C97625j3.m125812b().mo105907v().mo69719p3(str, this.f221634e);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
            C75742g.m91009a(0, str);
            C75742g.m91009a(0, this.f221634e.mo73978v2());
            if (this.f221635f == 13 && (a = C75398e.vx0().mo106401a(str)) != null && !Util.isNullOrNil(a.f223133u)) {
                a.f223127o = 1;
                C75398e.vx0().mo106403d(a.mo106385e(), a);
            }
            if (this.f221635f == 9) {
                Log.m105924i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f221634e.getSource());
                int source = this.f221634e.getSource();
                if (source == 10 || source == 13) {
                    Log.m105924i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            if (this.f221633d.getIntent().getIntExtra("Kdel_from", -1) == 0) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, this.f221633d);
                return;
            }
            MMActivity mMActivity = this.f221633d;
            mMActivity.setResult(-1, mMActivity.getIntent().putExtra("_delete_ok_", true));
            this.f221633d.finish();
            return;
        }
        ((C47001b) C86709a0.m107533q(C47001b.class)).mo71280gh(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r11.f221634e.mo62927s3() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105723g() {
        /*
            r11 = this;
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            boolean r0 = r0.mo62927s3()
            r1 = 35
            r2 = 45
            if (r0 != 0) goto L_0x000f
            r0 = 45
            goto L_0x0011
        L_0x000f:
            r0 = 35
        L_0x0011:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            int r4 = r11.f221635f
            r5 = 990(0x3de, float:1.387E-42)
            r6 = 1
            java.lang.String r7 = "k_outside_expose_proof_item_list"
            if (r4 == r6) goto L_0x00b4
            r8 = 2
            if (r4 == r8) goto L_0x00b4
            r9 = 3
            if (r4 == r9) goto L_0x00b4
            r10 = 9
            if (r4 == r10) goto L_0x00ab
            r1 = 18
            if (r4 == r1) goto L_0x0096
            switch(r4) {
                case 12: goto L_0x00b4;
                case 13: goto L_0x00b4;
                case 14: goto L_0x0093;
                default: goto L_0x0030;
            }
        L_0x0030:
            switch(r4) {
                case 22: goto L_0x007d;
                case 23: goto L_0x007d;
                case 24: goto L_0x007d;
                case 25: goto L_0x0049;
                case 26: goto L_0x007d;
                case 27: goto L_0x007d;
                case 28: goto L_0x007d;
                case 29: goto L_0x007d;
                case 30: goto L_0x0039;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r4) {
                case 58: goto L_0x00b4;
                case 59: goto L_0x00b4;
                case 60: goto L_0x00b4;
                default: goto L_0x0036;
            }
        L_0x0036:
            r1 = r0
            goto L_0x00c3
        L_0x0039:
            r1 = 7
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.util.ArrayList r0 = fd0.C75740a.m91004b(r1, r0)
            r3.putStringArrayListExtra(r7, r0)
            goto L_0x00c3
        L_0x0049:
            boolean r0 = r11.f221636g
            if (r0 == 0) goto L_0x004f
            r1 = 6
            goto L_0x0050
        L_0x004f:
            r1 = 5
        L_0x0050:
            if (r0 == 0) goto L_0x0060
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.util.ArrayList r0 = fd0.C75740a.m91004b(r1, r0)
            r3.putExtra(r7, r0)
            goto L_0x00c3
        L_0x0060:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.f214115W1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x006f
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.f214115W1
            goto L_0x0075
        L_0x006f:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
        L_0x0075:
            java.util.ArrayList r0 = fd0.C75740a.m91003a(r0)
            r3.putExtra(r7, r0)
            goto L_0x00c3
        L_0x007d:
            boolean r0 = r11.f221636g
            if (r0 == 0) goto L_0x0084
            r0 = 4
            r1 = 4
            goto L_0x0085
        L_0x0084:
            r1 = 3
        L_0x0085:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.util.ArrayList r0 = fd0.C75740a.m91006d(r0)
            r3.putStringArrayListExtra(r7, r0)
            goto L_0x00c3
        L_0x0093:
            r1 = 990(0x3de, float:1.387E-42)
            goto L_0x00c3
        L_0x0096:
            boolean r0 = r11.f221636g
            if (r0 == 0) goto L_0x009c
            r1 = 2
            goto L_0x009d
        L_0x009c:
            r1 = 1
        L_0x009d:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.util.ArrayList r0 = fd0.C75740a.m91005c(r0)
            r3.putStringArrayListExtra(r7, r0)
            goto L_0x00c3
        L_0x00ab:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x00c3
            goto L_0x00c1
        L_0x00b4:
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.util.ArrayList r0 = fd0.C75740a.m91004b(r2, r0)
            r3.putExtra(r7, r0)
        L_0x00c1:
            r1 = 45
        L_0x00c3:
            java.lang.String r0 = "k_username"
            if (r1 != r5) goto L_0x00e3
            com.tencent.mm.ui.MMActivity r2 = r11.f221633d
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r4 = "room_name"
            java.lang.String r2 = r2.getStringExtra(r4)
            r3.putExtra(r0, r2)
            com.tencent.mm.storage.z1 r0 = r11.f221634e
            java.lang.String r0 = r0.getUsername()
            java.lang.String r2 = "k_realchatuser"
            r3.putExtra(r2, r0)
            goto L_0x00ec
        L_0x00e3:
            com.tencent.mm.storage.z1 r2 = r11.f221634e
            java.lang.String r2 = r2.getUsername()
            r3.putExtra(r0, r2)
        L_0x00ec:
            java.lang.String r0 = "showShare"
            r2 = 0
            r3.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r2] = r1
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r1 = "rawUrl"
            r3.putExtra(r1, r0)
            com.tencent.mm.ui.MMActivity r0 = r11.f221633d
            r1 = 0
            java.lang.String r2 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r2, r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.C75381g.mo105723g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r14.f221634e.mo62927s3() == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo105724h() {
        /*
            r14 = this;
            java.lang.Class<tt.e> r0 = p244tt.C14088e.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            tt.e r1 = (p244tt.C14088e) r1
            java.lang.String r2 = "wxalited4df4810a40b1d9ddc0cbea44d263fd9"
            boolean r1 = r1.mo13530uu(r2)
            if (r1 == 0) goto L_0x0146
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            boolean r3 = r3.mo62927s3()
            r4 = 35
            r6 = 45
            if (r3 != 0) goto L_0x002a
            r3 = 45
            goto L_0x002c
        L_0x002a:
            r3 = 35
        L_0x002c:
            int r7 = r14.f221635f
            r8 = 990(0x3de, float:1.387E-42)
            r9 = 1
            java.lang.String r10 = "k_outside_expose_proof_item_list"
            if (r7 == r9) goto L_0x00ca
            r11 = 2
            if (r7 == r11) goto L_0x00ca
            r12 = 3
            if (r7 == r12) goto L_0x00ca
            r13 = 9
            if (r7 == r13) goto L_0x00c1
            r4 = 18
            if (r7 == r4) goto L_0x00ac
            switch(r7) {
                case 12: goto L_0x00ca;
                case 13: goto L_0x00ca;
                case 14: goto L_0x00a9;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r7) {
                case 22: goto L_0x0093;
                case 23: goto L_0x0093;
                case 24: goto L_0x0093;
                case 25: goto L_0x005f;
                case 26: goto L_0x0093;
                case 27: goto L_0x0093;
                case 28: goto L_0x0093;
                case 29: goto L_0x0093;
                case 30: goto L_0x004f;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r7) {
                case 58: goto L_0x00ca;
                case 59: goto L_0x00ca;
                case 60: goto L_0x00ca;
                default: goto L_0x004c;
            }
        L_0x004c:
            r4 = r3
            goto L_0x00d9
        L_0x004f:
            r4 = 7
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.util.ArrayList r3 = fd0.C75740a.m91004b(r4, r3)
            r1.putStringArrayList(r10, r3)
            goto L_0x00d9
        L_0x005f:
            boolean r3 = r14.f221636g
            if (r3 == 0) goto L_0x0065
            r4 = 6
            goto L_0x0066
        L_0x0065:
            r4 = 5
        L_0x0066:
            if (r3 == 0) goto L_0x0076
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.util.ArrayList r3 = fd0.C75740a.m91004b(r4, r3)
            r1.putStringArrayList(r10, r3)
            goto L_0x00d9
        L_0x0076:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.f214115W1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0085
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.f214115W1
            goto L_0x008b
        L_0x0085:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
        L_0x008b:
            java.util.ArrayList r3 = fd0.C75740a.m91003a(r3)
            r1.putStringArrayList(r10, r3)
            goto L_0x00d9
        L_0x0093:
            boolean r3 = r14.f221636g
            if (r3 == 0) goto L_0x009a
            r3 = 4
            r4 = 4
            goto L_0x009b
        L_0x009a:
            r4 = 3
        L_0x009b:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.util.ArrayList r3 = fd0.C75740a.m91006d(r3)
            r1.putStringArrayList(r10, r3)
            goto L_0x00d9
        L_0x00a9:
            r4 = 990(0x3de, float:1.387E-42)
            goto L_0x00d9
        L_0x00ac:
            boolean r3 = r14.f221636g
            if (r3 == 0) goto L_0x00b2
            r4 = 2
            goto L_0x00b3
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.util.ArrayList r3 = fd0.C75740a.m91005c(r3)
            r1.putStringArrayList(r10, r3)
            goto L_0x00d9
        L_0x00c1:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            boolean r3 = r3.mo62927s3()
            if (r3 != 0) goto L_0x00d9
            goto L_0x00d7
        L_0x00ca:
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.util.ArrayList r3 = fd0.C75740a.m91004b(r6, r3)
            r1.putStringArrayList(r10, r3)
        L_0x00d7:
            r4 = 45
        L_0x00d9:
            java.lang.String r3 = "k_username"
            if (r4 != r8) goto L_0x00f9
            com.tencent.mm.ui.MMActivity r6 = r14.f221633d
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "room_name"
            java.lang.String r6 = r6.getStringExtra(r7)
            r1.putString(r3, r6)
            com.tencent.mm.storage.z1 r3 = r14.f221634e
            java.lang.String r3 = r3.getUsername()
            java.lang.String r6 = "k_realchatuser"
            r1.putString(r6, r3)
            goto L_0x0102
        L_0x00f9:
            com.tencent.mm.storage.z1 r6 = r14.f221634e
            java.lang.String r6 = r6.getUsername()
            r1.putString(r3, r6)
        L_0x0102:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "{\"scene\":"
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = "}"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "appId"
            r5.putString(r4, r2)
            java.lang.String r2 = "query"
            r5.putString(r2, r3)
            java.lang.String r2 = "extraData"
            r5.putBundle(r2, r1)
            java.lang.String r1 = "MicroMsg.ProfileMenuManager"
            java.lang.String r2 = "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            r3 = r0
            tt.e r3 = (p244tt.C14088e) r3
            com.tencent.mm.ui.MMActivity r4 = r14.f221633d
            r6 = 1
            r7 = 1
            df2.g$c r8 = new df2.g$c
            r8.<init>()
            r3.mo13510OP(r4, r5, r6, r7, r8)
            goto L_0x0149
        L_0x0146:
            r14.mo105723g()
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.C75381g.mo105724h():void");
    }

    /* renamed from: i */
    public final C45616o2 mo105725i() {
        C45616o2 a = C52345a.m58583a(this.f221634e);
        if (a != null) {
            C78177a aVar = (C78177a) a;
            ((ArrayList) aVar.f229030c).add(new C75386e());
            MMActivity mMActivity = this.f221633d;
            ((C78178b) aVar).mo108164c(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f221633d.getString(C0966R.string.a4d), true, false, (DialogInterface.OnCancelListener) null);
        }
        return a;
    }

    /* renamed from: j */
    public void mo105726j(int i) {
        Class cls = C47001b.class;
        C76166a aVar = null;
        switch (i) {
            case 1:
                Class cls2 = C11502f.class;
                if (this.f221634e.mo62927s3()) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_Scene", this.f221635f);
                    intent.putExtra("Contact_User", this.f221634e.getUsername());
                    intent.putExtra("Contact_RoomNickname", this.f221633d.getIntent().getStringExtra("Contact_RoomNickname"));
                    intent.putExtra("key_label_click_source", this.f221633d.getIntent().getIntExtra("key_label_click_source", 0));
                    intent.putExtra("contact_phone_number_list", this.f221634e.f149525Y0);
                    String str = "";
                    if (!this.f221634e.mo62922p3()) {
                        String stringExtra = this.f221633d.getIntent().getStringExtra("Contact_Mobile_MD5");
                        String stringExtra2 = this.f221633d.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                        if (!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) {
                            if ((!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) && ((aVar = C75398e.vx0().mo106402b(stringExtra)) == null || Util.isNullOrNil(aVar.mo106385e()))) {
                                aVar = C75398e.vx0().mo106402b(stringExtra2);
                            }
                        } else if (!Util.isNullOrNil(this.f221634e.getUsername())) {
                            aVar = C75398e.vx0().mo106401a(this.f221634e.getUsername());
                        }
                        if (aVar != null && !Util.isNullOrNil(aVar.mo106385e())) {
                            str = Util.nullAsNil(aVar.mo106386f()).replace(" ", str);
                        }
                    }
                    intent.putExtra("contact_phone_number_by_md5", str);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93175h(intent, this.f221633d);
                } else if (Util.isNullOrNil(this.f221634e.getUsername())) {
                    Log.m105928w("MicroMsg.ProfileMenuManager", "mod stranger remark, username is null");
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_Scene", this.f221635f);
                    intent2.putExtra("Contact_mode_name_type", 0);
                    intent2.putExtra("Contact_ModStrangerRemark", true);
                    intent2.putExtra("Contact_User", this.f221634e.getUsername());
                    intent2.putExtra("Contact_Nick", this.f221634e.getNickname());
                    intent2.putExtra("Contact_RemarkName", this.f221634e.mo73969n2());
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93186s(intent2, this.f221633d);
                }
                C42599h.xx0(this.f221633d.getIntent(), 8, 1, this.f221634e.getUsername());
                return;
            case 2:
                if (this.f221634e.mo62934u3()) {
                    C45628s0.m50795q0(this.f221634e);
                    MMActivity mMActivity = this.f221633d;
                    C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.bsv));
                } else {
                    C45628s0.m50777h0(this.f221634e);
                    MMActivity mMActivity2 = this.f221633d;
                    C76879j.m92726T(mMActivity2, mMActivity2.getString(C0966R.string.bmc));
                }
                this.f221634e = C97625j3.m125812b().mo105907v().get(this.f221634e.getUsername());
                C42599h.xx0(this.f221633d.getIntent(), 10, 1, this.f221634e.getUsername());
                return;
            case 3:
                mo105720d();
                C42599h.xx0(this.f221633d.getIntent(), 11, 1, this.f221634e.getUsername());
                return;
            case 4:
                mo105718b();
                C42599h.xx0(this.f221633d.getIntent(), 9, 1, this.f221634e.getUsername());
                return;
            case 5:
                mo105719c(true);
                C42599h.xx0(this.f221633d.getIntent(), 32, this.f221634e.mo62920o3() ? 3 : 2, this.f221634e.getUsername());
                return;
            case 6:
                ((C47001b) C86709a0.m107533q(cls)).mo71279fN(this);
                ((C47001b) C86709a0.m107533q(cls)).mo71281st(this);
                mo105721e();
                return;
            case 7:
                Log.m105918d("MicroMsg.ProfileMenuManager", "dealAddShortcut, username = " + this.f221634e.getUsername());
                MMActivity mMActivity3 = this.f221633d;
                C75390h hVar = new C75390h(this);
                Log.m105924i("MicroMsg.ShortcutUtil", "addShortCut()");
                boolean z = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("no_more_show_add_short_cut_dialog", false);
                Pair<Integer, Integer> h = C116542c.m164371h(mMActivity3, (String) null, z, false, new C7140d(mMActivity3));
                C116541b.m164359i(this.f221633d, this.f221634e.getUsername());
                MMHandlerThread.postToMainThread(new C75305e(hVar, mMActivity3, h, z));
                C42599h.xx0(this.f221633d.getIntent(), 15, 1, this.f221634e.getUsername());
                return;
            case 9:
                mo105724h();
                C42599h.xx0(this.f221633d.getIntent(), 25, 1, this.f221634e.getUsername());
                return;
            case 10:
                C47224a.m52531b(this.f221634e.getUsername(), 12, 0);
                mo105718b();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        if ("3552365301".equals(r5.f221634e.mo73980x2()) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (r5.f221634e.mo62927s3() != false) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateMMMenu(nj3.C76874e0 r6) {
        /*
            r5 = this;
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0029
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            r2 = 2131755292(0x7f10011c, float:1.914146E38)
            if (r0 == 0) goto L_0x0023
            r0 = 2131824438(0x7f110f36, float:1.9281704E38)
            r6.mo107135b(r1, r0, r2)
            goto L_0x0029
        L_0x0023:
            r0 = 2131824211(0x7f110e53, float:1.9281243E38)
            r6.mo107135b(r1, r0, r2)
        L_0x0029:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            r2 = 2
            if (r0 == 0) goto L_0x0057
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 != 0) goto L_0x0057
            r0 = 2131824302(0x7f110eae, float:1.9281428E38)
            com.tencent.mm.storage.z1 r3 = r5.f221634e
            int r3 = r3.f149500H
            if (r3 != r1) goto L_0x004b
            r0 = 2131824300(0x7f110eac, float:1.9281424E38)
            goto L_0x0050
        L_0x004b:
            if (r3 != r2) goto L_0x0050
            r0 = 2131824301(0x7f110ead, float:1.9281426E38)
        L_0x0050:
            r3 = 4
            r4 = 2131755294(0x7f10011e, float:1.9141463E38)
            r6.mo107135b(r3, r0, r4)
        L_0x0057:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62934u3()
            if (r0 == 0) goto L_0x006d
            com.tencent.mm.ui.MMActivity r0 = r5.f221633d
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131824383(0x7f110eff, float:1.9281592E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x007a
        L_0x006d:
            com.tencent.mm.ui.MMActivity r0 = r5.f221633d
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131824135(0x7f110e07, float:1.928109E38)
            java.lang.String r0 = r0.getString(r3)
        L_0x007a:
            com.tencent.mm.storage.z1 r3 = r5.f221634e
            boolean r3 = r3.mo62927s3()
            if (r3 == 0) goto L_0x0094
            com.tencent.mm.storage.z1 r3 = r5.f221634e
            java.lang.String r3 = r3.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85816S4(r3)
            if (r3 != 0) goto L_0x0094
            r3 = 2131755293(0x7f10011d, float:1.9141461E38)
            r6.mo107144g(r2, r0, r3)
        L_0x0094:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            r2 = 0
            if (r0 != 0) goto L_0x00ad
            com.tencent.mm.ui.MMActivity r0 = r5.f221633d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "User_Verify"
            boolean r0 = r0.getBooleanExtra(r3, r2)
            if (r0 == 0) goto L_0x00ad
            r0 = 1
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            java.lang.String r3 = "3552365301"
            if (r0 != 0) goto L_0x0102
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r4 = "SnsWxWorkPermissionEntrance"
            int r0 = r0.mo107404b(r4, r2)
            if (r0 != r1) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            if (r1 == 0) goto L_0x011f
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x011f
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.mo73980x2()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x011f
        L_0x00ee:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 != 0) goto L_0x011f
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x011f
        L_0x0102:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.mo73980x2()
            boolean r0 = r3.equals(r0)
            r1 = 2131755285(0x7f100115, float:1.9141445E38)
            r2 = 3
            if (r0 == 0) goto L_0x0119
            r0 = 2131824229(0x7f110e65, float:1.928128E38)
            r6.mo107135b(r2, r0, r1)
            goto L_0x011f
        L_0x0119:
            r0 = 2131833967(0x7f11346f, float:1.9301031E38)
            r6.mo107135b(r2, r0, r1)
        L_0x011f:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62920o3()
            if (r0 == 0) goto L_0x0131
            com.tencent.mm.ui.MMActivity r0 = r5.f221633d
            r1 = 2131824221(0x7f110e5d, float:1.9281264E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x013a
        L_0x0131:
            com.tencent.mm.ui.MMActivity r0 = r5.f221633d
            r1 = 2131824216(0x7f110e58, float:1.9281254E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x013a:
            com.tencent.mm.storage.z1 r1 = r5.f221634e
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85816S4(r1)
            if (r1 != 0) goto L_0x014d
            r1 = 5
            r2 = 2131755268(0x7f100104, float:1.914141E38)
            r6.mo107144g(r1, r0, r2)
        L_0x014d:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 != 0) goto L_0x016c
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x016c
            r0 = 9
            r1 = 2131822644(0x7f110834, float:1.9278065E38)
            r2 = 2131755271(0x7f100107, float:1.9141417E38)
            r6.mo107135b(r0, r1, r2)
        L_0x016c:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x017e
            r0 = 7
            r1 = 2131824029(0x7f110d9d, float:1.9280874E38)
            r2 = 2131755274(0x7f10010a, float:1.9141423E38)
            r6.mo107135b(r0, r1, r2)
        L_0x017e:
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x019c
            com.tencent.mm.storage.z1 r0 = r5.f221634e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 != 0) goto L_0x019c
            r0 = 6
            r1 = 2131822477(0x7f11078d, float:1.9277727E38)
            r2 = 2131755273(0x7f100109, float:1.914142E38)
            r6.mo107135b(r0, r1, r2)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.C75381g.onCreateMMMenu(nj3.e0):void");
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        mo105726j(menuItem.getItemId());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ab, code lost:
        if (r12 == false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            r11 = this;
            com.tencent.mm.storage.z1 r12 = r11.f221634e
            long r0 = r12.f108320R1
            int r12 = (int) r0
            r0 = 1
            if (r12 > 0) goto L_0x0015
            eb0.c r12 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r12 = r12.mo105907v()
            com.tencent.mm.storage.z1 r1 = r11.f221634e
            r12.mo69726u3(r1, r0)
        L_0x0015:
            com.tencent.mm.storage.z1 r12 = r11.f221634e
            java.lang.String r12 = r12.getUsername()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85846q5(r12)
            r1 = 0
            if (r12 == 0) goto L_0x00c2
            com.tencent.mm.storage.z1 r12 = r11.f221634e
            java.lang.String r12 = r12.getUsername()
            r2 = 11
            ne0.C47224a.m52531b(r12, r2, r1)
            com.tencent.mm.storage.z1 r12 = r11.f221634e
            java.lang.String r12 = r12.getUsername()
            ie0.y r2 = ie0.C46232y.f124619d
            ie0.j r12 = ie0.C46225p.m51524b(r12)
            if (r12 == 0) goto L_0x00ad
            com.tencent.mm.ui.MMActivity r12 = r11.f221633d
            com.tencent.mm.storage.z1 r2 = r11.f221634e
            java.lang.String r2 = r2.getUsername()
            int r3 = com.tencent.p014mm.plugin.profile.p088ui.OpenIMKefuProfileSettingUI.f115335f
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r12, r3)
            java.lang.String r3 = "kefuUsername"
            gy3.C87412m.m108594g(r2, r3)
            ie0.j r3 = ie0.C46225p.m51524b(r2)
            if (r3 != 0) goto L_0x0057
            r12 = 0
            goto L_0x00ab
        L_0x0057:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI> r5 = com.tencent.p014mm.plugin.profile.p088ui.OpenIMKefuProfileSettingUI.class
            r4.<init>(r12, r5)
            java.lang.Boolean r3 = r3.mo71447r1()
            boolean r3 = r3.booleanValue()
            java.lang.String r5 = "need_location_report"
            r4.putExtra(r5, r3)
            java.lang.String r3 = "kefu_username"
            r4.putExtra(r3, r2)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r4)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI$Companion"
            java.lang.String r5 = "tryStart"
            java.lang.String r6 = "(Landroid/content/Context;Ljava/lang/String;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r1)
            android.content.Intent r2 = (android.content.Intent) r2
            r12.startActivity(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI$Companion"
            java.lang.String r4 = "tryStart"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r2 = r12
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            r12 = 1
        L_0x00ab:
            if (r12 != 0) goto L_0x00c1
        L_0x00ad:
            qo3.n r12 = new qo3.n
            com.tencent.mm.ui.MMActivity r2 = r11.f221633d
            r12.<init>((android.content.Context) r2, (int) r0, (boolean) r1)
            df2.g$h r1 = new df2.g$h
            r2 = 0
            r1.<init>(r2)
            r12.f225782p = r1
            r12.f225771i = r1
            r12.mo107573q()
        L_0x00c1:
            return r0
        L_0x00c2:
            android.content.Intent r12 = new android.content.Intent
            com.tencent.mm.ui.MMActivity r2 = r11.f221633d
            android.content.Intent r2 = r2.getIntent()
            r12.<init>(r2)
            com.tencent.mm.storage.z1 r2 = r11.f221634e
            java.lang.String r2 = r2.getUsername()
            java.lang.String r3 = "Contact_User"
            r12.putExtra(r3, r2)
            com.tencent.mm.ui.MMActivity r2 = r11.f221633d
            java.lang.Class<com.tencent.mm.plugin.profile.ui.ProfileSettingUI> r3 = com.tencent.p014mm.plugin.profile.p088ui.ProfileSettingUI.class
            r12.setClass(r2, r3)
            com.tencent.mm.ui.MMActivity r2 = r11.f221633d
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "last_page_source_type"
            int r1 = r2.getIntExtra(r3, r1)
            r12.putExtra(r3, r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            r12.setFlags(r1)
            com.tencent.mm.ui.MMActivity r1 = r11.f221633d
            r2 = 32767(0x7fff, float:4.5916E-41)
            r1.startActivityForResult((android.content.Intent) r12, (int) r2)
            com.tencent.mm.ui.MMActivity r12 = r11.f221633d
            android.content.Intent r12 = r12.getIntent()
            r1 = 7
            com.tencent.mm.storage.z1 r2 = r11.f221634e
            java.lang.String r2 = r2.getUsername()
            com.tencent.p014mm.plugin.profile.C42599h.xx0(r12, r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.C75381g.onMenuItemClick(android.view.MenuItem):boolean");
    }

    /* renamed from: v2 */
    public void mo10385v2(String str, int i, C52085y83 y832) {
        C76166a a;
        ProgressDialog progressDialog = this.f221638i;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f221638i = null;
        }
        if (i == 0) {
            if (!str.equals(this.f221634e.getUsername())) {
                Log.m105929w("MicroMsg.ProfileMenuManager", "not current contact %s,%s", this.f221634e.getUsername(), str);
                return;
            }
            if (this.f221635f == 13 && (a = C75398e.vx0().mo106401a(str)) != null && !Util.isNullOrNil(a.f223133u)) {
                a.f223127o = 1;
                C75398e.vx0().mo106403d(a.mo106385e(), a);
            }
            if (this.f221635f == 9) {
                Log.m105924i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f221634e.getSource());
                int source = this.f221634e.getSource();
                if (source == 10 || source == 13) {
                    Log.m105924i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            if (this.f221633d.getIntent().getIntExtra("Kdel_from", -1) == 0) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, this.f221633d);
                return;
            }
            MMActivity mMActivity = this.f221633d;
            mMActivity.setResult(-1, mMActivity.getIntent().putExtra("_delete_ok_", true));
            this.f221633d.finish();
        } else if (!Util.isNullOrNil(y832.f145175d)) {
            C76879j.m92748s(this.f221633d, y832.f145175d, y832.f145176e);
        } else {
            MMActivity mMActivity2 = this.f221633d;
            C76879j.m92748s(mMActivity2, mMActivity2.getString(C0966R.string.f7945x2), "");
        }
    }
}

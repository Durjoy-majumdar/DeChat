package com.tencent.p014mm.plugin.profile.p088ui;

import ae3.C67030b;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.RecoverAccountFriendEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6692y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72996z1;
import cw0.C116541b;
import dg0.C75398e;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75597w2;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import f62.C45759r0;
import fd0.C75743h;
import h81.C32735h;
import hg0.C76166a;
import hg0.C76167a1;
import hg0.C76169b1;
import hg0.C76174o;
import hg0.C76175p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lm0.C88585e;
import md3.C47001b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C39989b;
import p214om.C11502f;
import p275xz.C79012e;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import sj0.C90202a;
import tc0.C48627f;
import tc0.C77885p;
import tc2.C118418g;
import te3.C52085y83;
import uc3.C78146a;
import wc3.C15141z;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference */
public class NormalUserFooterPreference extends Preference implements MStorage.IOnStorageChange {

    /* renamed from: J */
    public C72996z1 f202624J;

    /* renamed from: K */
    public boolean f202625K;

    /* renamed from: L */
    public int f202626L;

    /* renamed from: M */
    public int f202627M;

    /* renamed from: N */
    public boolean f202628N = false;

    /* renamed from: P */
    public boolean f202629P;

    /* renamed from: Q */
    public long f202630Q = 0;

    /* renamed from: Q0 */
    public View f202631Q0;

    /* renamed from: R */
    public String f202632R = "";

    /* renamed from: R0 */
    public Button f202633R0;

    /* renamed from: S */
    public String f202634S = "";

    /* renamed from: S0 */
    public View f202635S0;

    /* renamed from: T */
    public boolean f202636T = false;

    /* renamed from: T0 */
    public Button f202637T0;

    /* renamed from: U */
    public boolean f202638U;

    /* renamed from: U0 */
    public Button f202639U0;

    /* renamed from: V */
    public boolean f202640V;

    /* renamed from: V0 */
    public Button f202641V0;

    /* renamed from: W */
    public boolean f202642W = false;

    /* renamed from: W0 */
    public Button f202643W0;

    /* renamed from: X */
    public boolean f202644X = false;

    /* renamed from: X0 */
    public Button f202645X0;

    /* renamed from: Y */
    public C70154c f202646Y;

    /* renamed from: Y0 */
    public Button f202647Y0;

    /* renamed from: Z */
    public View f202648Z;

    /* renamed from: Z0 */
    public Button f202649Z0;

    /* renamed from: a1 */
    public TextView f202650a1;

    /* renamed from: b1 */
    public boolean f202651b1 = false;

    /* renamed from: c1 */
    public int f202652c1 = 0;

    /* renamed from: d1 */
    public MMActivity f202653d1;

    /* renamed from: e1 */
    public String f202654e1 = null;

    /* renamed from: f1 */
    public MStorageEvent<C70179g, String> f202655f1 = new C70152a();

    /* renamed from: p0 */
    public Button f202656p0;

    /* renamed from: x0 */
    public Button f202657x0;

    /* renamed from: y0 */
    public Button f202658y0;

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$a */
    public class C70152a extends MStorageEvent<C70179g, String> {
        public C70152a() {
        }

        public void add(Object obj, Looper looper) {
            C70179g gVar = (C70179g) obj;
            if (looper == null) {
                looper = Looper.getMainLooper();
            }
            super.add(gVar, looper);
        }

        public void processEvent(Object obj, Object obj2) {
            C70179g gVar = (C70179g) obj;
            String str = (String) obj2;
            if (str.equals("show_btn")) {
                gVar.mo96653a(NormalUserFooterPreference.this.f202624J.getUsername(), true);
            } else if (str.equals("hide_btn")) {
                gVar.mo96653a(NormalUserFooterPreference.this.f202624J.getUsername(), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$b */
    public class C70153b implements Runnable {
        public C70153b() {
        }

        public void run() {
            NormalUserFooterPreference.this.mo96627b0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c */
    public abstract class C70154c implements C11385n, C47001b.C47002a {

        /* renamed from: d */
        public boolean f202661d = false;

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$a */
        public class C70155a implements MenuItem.OnMenuItemClickListener {

            /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$a$a */
            public class C70156a implements C11184p0 {

                /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$a$a$a */
                public class C70157a implements DialogInterface.OnClickListener {

                    /* renamed from: d */
                    public final /* synthetic */ CheckBox f202665d;

                    public C70157a(CheckBox checkBox) {
                        this.f202665d = checkBox;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C70154c.m82711c(C70154c.this);
                        if (NormalUserFooterPreference.this.f202624J.getSource() == 18) {
                            NormalUserFooterPreference.this.f202626L = 9;
                            if (this.f202665d.isChecked()) {
                                C70154c.m82712d(C70154c.this);
                            }
                        }
                    }
                }

                /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$a$a$b */
                public class C70158b implements DialogInterface.OnClickListener {

                    /* renamed from: d */
                    public final /* synthetic */ CheckBox f202667d;

                    public C70158b(CheckBox checkBox) {
                        this.f202667d = checkBox;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C70154c.this.mo96631e();
                        if (NormalUserFooterPreference.this.f202624J.getSource() == 18) {
                            NormalUserFooterPreference.this.f202626L = 9;
                            if (this.f202667d.isChecked()) {
                                C70154c.m82712d(C70154c.this);
                            }
                        }
                    }
                }

                public C70156a() {
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    String str;
                    Class cls = C11502f.class;
                    C76166a aVar = null;
                    switch (menuItem.getItemId()) {
                        case 1:
                            NormalUserFooterPreference.this.f202655f1.event("hide_btn");
                            NormalUserFooterPreference.this.f202655f1.doNotify();
                            C70154c cVar = C70154c.this;
                            NormalUserFooterPreference.this.f202624J = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                            if (!NormalUserFooterPreference.this.f202624J.mo62927s3()) {
                                cVar.mo96630a(NormalUserFooterPreference.this.f202624J.getUsername());
                                return;
                            }
                            Intent intent = new Intent();
                            intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
                            intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
                            intent.putExtra("Contact_RoomNickname", NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("Contact_RoomNickname"));
                            intent.putExtra("contact_phone_number_list", NormalUserFooterPreference.this.f202624J.f149525Y0);
                            String str2 = "";
                            if (!NormalUserFooterPreference.this.f202624J.mo62922p3()) {
                                String stringExtra = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("Contact_Mobile_MD5");
                                String stringExtra2 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                                if (!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) {
                                    if ((!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) && ((aVar = C75398e.vx0().mo106402b(stringExtra)) == null || Util.isNullOrNil(aVar.mo106385e()))) {
                                        aVar = C75398e.vx0().mo106402b(stringExtra2);
                                    }
                                } else if (!Util.isNullOrNil(NormalUserFooterPreference.this.f202624J.getUsername())) {
                                    aVar = C75398e.vx0().mo106401a(NormalUserFooterPreference.this.f202624J.getUsername());
                                }
                                if (aVar != null && !Util.isNullOrNil(aVar.mo106385e())) {
                                    str2 = Util.nullAsNil(aVar.mo106386f()).replace(" ", str2);
                                }
                            }
                            intent.putExtra("contact_phone_number_by_md5", str2);
                            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93175h(intent, NormalUserFooterPreference.this.f121274d);
                            return;
                        case 2:
                            if (NormalUserFooterPreference.this.f202624J.mo62934u3()) {
                                C45628s0.m50795q0(NormalUserFooterPreference.this.f202624J);
                                MMActivity mMActivity = NormalUserFooterPreference.this.f202653d1;
                                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.bsv));
                            } else {
                                C45628s0.m50777h0(NormalUserFooterPreference.this.f202624J);
                                MMActivity mMActivity2 = NormalUserFooterPreference.this.f202653d1;
                                C76879j.m92726T(mMActivity2, mMActivity2.getString(C0966R.string.bmc));
                            }
                            NormalUserFooterPreference.this.f202624J = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                            return;
                        case 3:
                            Intent intent2 = new Intent();
                            intent2.putExtra("sns_permission_userName", NormalUserFooterPreference.this.f202624J.getUsername());
                            intent2.putExtra("sns_permission_anim", true);
                            intent2.putExtra("sns_permission_block_scene", 1);
                            C88144b.m109791i(NormalUserFooterPreference.this.f202653d1, "sns", ".ui.SnsPermissionUI", intent2, (Bundle) null);
                            return;
                        case 4:
                            C70154c cVar2 = C70154c.this;
                            cVar2.getClass();
                            Intent intent3 = new Intent();
                            intent3.putExtra("Select_Talker_Name", NormalUserFooterPreference.this.f202624J.getUsername());
                            intent3.putExtra("Select_block_List", NormalUserFooterPreference.this.f202624J.getUsername());
                            intent3.putExtra("Select_Conv_Type", 3);
                            intent3.putExtra("Select_Send_Card", true);
                            intent3.putExtra("mutil_select_is_ret", true);
                            C15141z yM = ((C11502f) C86312j.m106911c(cls)).mo11462yM();
                            MMActivity mMActivity3 = NormalUserFooterPreference.this.f202653d1;
                            ((C67654r1) yM).getClass();
                            intent3.setClass(mMActivity3, SelectConversationUI.class);
                            mMActivity3.startActivityForResult(intent3, 1);
                            return;
                        case 5:
                            if (NormalUserFooterPreference.this.f202624J.mo62920o3()) {
                                C70154c.m82710b(C70154c.this);
                                return;
                            }
                            View inflate = View.inflate(NormalUserFooterPreference.this.f121274d, C0966R.C0971layout.bbt, (ViewGroup) null);
                            inflate.setPadding(0, 0, 0, 0);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gun);
                            textView.setPadding(0, 0, 0, 0);
                            textView.setText(C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) ? C0966R.string.bok : C0966R.string.boj);
                            CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.gul);
                            checkBox.setChecked(false);
                            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gum);
                            textView2.setText(C0966R.string.bol);
                            if (NormalUserFooterPreference.this.f202624J.getSource() == 18) {
                                checkBox.setVisibility(0);
                                textView2.setVisibility(0);
                            } else {
                                checkBox.setVisibility(8);
                                textView2.setVisibility(8);
                            }
                            Context context = NormalUserFooterPreference.this.f121274d;
                            C76879j.m92715I(context, true, context.getString(C0966R.string.boi), inflate, NormalUserFooterPreference.this.f121274d.getString(C0966R.string.a18), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.f7926wf), new C70157a(checkBox), (DialogInterface.OnClickListener) null);
                            return;
                        case 6:
                            View inflate2 = View.inflate(NormalUserFooterPreference.this.f121274d, C0966R.C0971layout.bbt, (ViewGroup) null);
                            inflate2.setPadding(0, 0, 0, 0);
                            TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.gun);
                            textView3.setPadding(0, 0, 0, 0);
                            if (C45628s0.m50743H(NormalUserFooterPreference.this.f202624J.getUsername())) {
                                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                                str = normalUserFooterPreference.f121274d.getString(C0966R.string.bxu, new Object[]{normalUserFooterPreference.f202624J.mo62898f()});
                            } else {
                                NormalUserFooterPreference normalUserFooterPreference2 = NormalUserFooterPreference.this;
                                str = normalUserFooterPreference2.f121274d.getString(C0966R.string.bxs, new Object[]{normalUserFooterPreference2.f202624J.mo62898f()});
                            }
                            textView3.setText(str);
                            CheckBox checkBox2 = (CheckBox) inflate2.findViewById(C0966R.C0970id.gul);
                            checkBox2.setChecked(false);
                            TextView textView4 = (TextView) inflate2.findViewById(C0966R.C0970id.gum);
                            textView4.setText(C0966R.string.bol);
                            if (NormalUserFooterPreference.this.f202624J.getSource() == 18) {
                                checkBox2.setVisibility(0);
                                textView4.setVisibility(0);
                            } else {
                                checkBox2.setVisibility(8);
                                textView4.setVisibility(8);
                            }
                            Context context2 = NormalUserFooterPreference.this.f121274d;
                            C76879j.m92716J(context2, true, context2.getString(C0966R.string.blq), inflate2, NormalUserFooterPreference.this.f121274d.getString(C0966R.string.f7944x1), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.f7926wf), new C70158b(checkBox2), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                            return;
                        case 7:
                            C70154c cVar3 = C70154c.this;
                            cVar3.getClass();
                            Log.m105918d("MicroMsg.NormalUserFooterPreference", "dealAddShortcut, username = " + NormalUserFooterPreference.this.f202624J.getUsername());
                            NormalUserFooterPreference normalUserFooterPreference3 = NormalUserFooterPreference.this;
                            C116541b.m164359i(normalUserFooterPreference3.f202653d1, normalUserFooterPreference3.f202624J.getUsername());
                            MMHandlerThread.postToMainThreadDelayed(new C70263d2(cVar3), 1000);
                            return;
                        case 9:
                            C70154c.m82712d(C70154c.this);
                            return;
                        default:
                            return;
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$a$b */
            public class C70159b implements C11182m0 {
                public C70159b() {
                }

                public void onCreateMMMenu(C76874e0 e0Var) {
                    C42599h.xx0(NormalUserFooterPreference.this.f202653d1.getIntent(), 7, 1, NormalUserFooterPreference.this.f202624J.getUsername());
                    if (C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername())) {
                        e0Var.mo107135b(1, C0966R.string.buk, C0966R.raw.bottomsheet_icon_remarks);
                    } else {
                        e0Var.mo107135b(1, C0966R.string.bod, C0966R.raw.bottomsheet_icon_remarks);
                    }
                    e0Var.mo107144g(2, NormalUserFooterPreference.this.f202624J.mo62934u3() ? NormalUserFooterPreference.this.f202653d1.getResources().getString(C0966R.string.bsu) : NormalUserFooterPreference.this.f202653d1.getResources().getString(C0966R.string.bmb), C0966R.raw.bottomsheet_icon_star);
                    if (!C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername())) {
                        e0Var.mo107135b(3, C0966R.string.bot, C0966R.raw.bottomsheet_icon_moment);
                    }
                    e0Var.mo107135b(4, C0966R.string.bqk, C0966R.raw.bottomsheet_icon_transmit);
                    e0Var.mo107135b(9, C0966R.string.anx, C0966R.raw.bottomsheet_icon_complain);
                    e0Var.mo107144g(5, NormalUserFooterPreference.this.f202624J.mo62920o3() ? NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.bon) : NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.boi), C0966R.raw.bottomsheet_icon_blacklist);
                    if (!NormalUserFooterPreference.this.f202644X) {
                        e0Var.mo107135b(6, C0966R.string.ajs, C0966R.raw.bottomsheet_icon_del);
                    }
                    e0Var.mo107135b(7, C0966R.string.bjn, C0966R.raw.bottomsheet_icon_desktop);
                }
            }

            public C70155a() {
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                C77407n nVar = new C77407n((Context) NormalUserFooterPreference.this.f202653d1, 1, false);
                nVar.f225782p = new C70156a();
                nVar.f225771i = new C70159b();
                nVar.mo107573q();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$b */
        public class C70160b implements C11182m0 {
            public C70160b(C70154c cVar) {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107135b(2, C0966R.string.f7998ys, C0966R.raw.icons_filled_video_call);
                e0Var.mo107135b(1, C0966R.string.f8000yu, C0966R.raw.icons_filled_call);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$c */
        public class C70161c implements C11184p0 {
            public C70161c() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    NormalUserFooterPreference.this.mo96623W();
                } else if (itemId == 2) {
                    NormalUserFooterPreference.this.mo96624Y();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$d */
        public class C70162d implements DialogInterface.OnCancelListener {
            public C70162d() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C70154c.this.f202661d = true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$e */
        public class C70163e implements DialogInterface.OnClickListener {
            public C70163e() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n.INSTANCE.mo160131h(14553, 2, 4, NormalUserFooterPreference.this.f202624J.getUsername());
                C70154c.this.f202661d = true;
                Intent intent = new Intent();
                intent.putExtra("Chat_User", NormalUserFooterPreference.this.f202624J.getUsername());
                intent.addFlags(67108864);
                C88144b.m109801s(NormalUserFooterPreference.this.f121274d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$f */
        public class C70164f implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ProgressDialog f202673d;

            /* renamed from: e */
            public final /* synthetic */ String f202674e;

            public C70164f(ProgressDialog progressDialog, String str) {
                this.f202673d = progressDialog;
                this.f202674e = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n.INSTANCE.mo160131h(14553, 2, 3, NormalUserFooterPreference.this.f202624J.getUsername());
                this.f202673d.show();
                C70154c cVar = C70154c.this;
                cVar.f202661d = false;
                cVar.mo96632f(this.f202674e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$g */
        public class C70165g implements MenuItem.OnMenuItemClickListener {

            /* renamed from: d */
            public final /* synthetic */ boolean f202676d;

            /* renamed from: e */
            public final /* synthetic */ boolean f202677e;

            /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$g$a */
            public class C70166a implements C11184p0 {

                /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$g$a$a */
                public class C70167a implements DialogInterface.OnClickListener {
                    public C70167a() {
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C70154c.m82711c(C70154c.this);
                    }
                }

                public C70166a() {
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 1) {
                        C70154c cVar = C70154c.this;
                        cVar.mo96630a(NormalUserFooterPreference.this.f202624J.getUsername());
                    } else if (itemId == 5) {
                        NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                        Context context = normalUserFooterPreference.f121274d;
                        C76879j.m92750u(context, context.getString(C72996z1.m85843n5(normalUserFooterPreference.f202624J.getUsername()) ? C0966R.string.bok : C0966R.string.boj), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.boi), new C70167a(), (DialogInterface.OnClickListener) null);
                    } else if (itemId == 8) {
                        C70154c.m82710b(C70154c.this);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c$g$b */
            public class C70168b implements C11182m0 {
                public C70168b() {
                }

                public void onCreateMMMenu(C76874e0 e0Var) {
                    C70165g gVar = C70165g.this;
                    if (!gVar.f202676d) {
                        if (C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername())) {
                            e0Var.mo107135b(1, C0966R.string.buk, C0966R.raw.bottomsheet_icon_remarks);
                        } else {
                            e0Var.mo107135b(1, C0966R.string.bod, C0966R.raw.bottomsheet_icon_remarks);
                        }
                    }
                    C70165g gVar2 = C70165g.this;
                    if (gVar2.f202677e) {
                        return;
                    }
                    if (NormalUserFooterPreference.this.f202624J.mo62920o3()) {
                        e0Var.mo107135b(8, C0966R.string.bon, C0966R.raw.bottomsheet_icon_blacklist);
                    } else if (!C72996z1.m85796D5(NormalUserFooterPreference.this.f202624J.getUsername())) {
                        e0Var.mo107135b(5, C0966R.string.boi, C0966R.raw.bottomsheet_icon_blacklist);
                    }
                }
            }

            public C70165g(boolean z, boolean z2) {
                this.f202676d = z;
                this.f202677e = z2;
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                C77407n nVar = new C77407n((Context) NormalUserFooterPreference.this.f202653d1, 1, false);
                nVar.f225782p = new C70166a();
                nVar.f225771i = new C70168b();
                nVar.mo107573q();
                return true;
            }
        }

        public C70154c() {
        }

        /* renamed from: b */
        public static void m82710b(C70154c cVar) {
            C45628s0.m50813z0(NormalUserFooterPreference.this.f202624J);
            NormalUserFooterPreference.this.f202624J.mo62933t4();
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            if (normalUserFooterPreference.f202640V) {
                normalUserFooterPreference.f202650a1.setVisibility(8);
                cVar.mo96633g();
            }
        }

        /* renamed from: c */
        public static void m82711c(C70154c cVar) {
            C45628s0.m50769d0(NormalUserFooterPreference.this.f202624J);
            NormalUserFooterPreference.this.f202624J.mo62853E3();
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            if (normalUserFooterPreference.f202640V) {
                normalUserFooterPreference.f202650a1.setVisibility(0);
                cVar.mo96633g();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m82712d(com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.C70154c r10) {
            /*
                r10.getClass()
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                int r2 = r1.f202626L
                r3 = 35
                java.lang.String r4 = "k_outside_expose_proof_item_list"
                r5 = 1
                r6 = 45
                if (r2 == r5) goto L_0x00a1
                r7 = 2
                if (r2 == r7) goto L_0x00a1
                r8 = 3
                if (r2 == r8) goto L_0x00a1
                r9 = 9
                if (r2 == r9) goto L_0x00b0
                r9 = 18
                if (r2 == r9) goto L_0x008c
                switch(r2) {
                    case 12: goto L_0x00a1;
                    case 13: goto L_0x00a1;
                    case 14: goto L_0x00b0;
                    default: goto L_0x0026;
                }
            L_0x0026:
                switch(r2) {
                    case 22: goto L_0x0076;
                    case 23: goto L_0x0076;
                    case 24: goto L_0x0076;
                    case 25: goto L_0x003e;
                    case 26: goto L_0x0076;
                    case 27: goto L_0x0076;
                    case 28: goto L_0x0076;
                    case 29: goto L_0x0076;
                    case 30: goto L_0x002e;
                    default: goto L_0x0029;
                }
            L_0x0029:
                switch(r2) {
                    case 58: goto L_0x00a1;
                    case 59: goto L_0x00a1;
                    case 60: goto L_0x00a1;
                    default: goto L_0x002c;
                }
            L_0x002c:
                goto L_0x00b0
            L_0x002e:
                r3 = 7
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.util.ArrayList r1 = fd0.C75740a.m91004b(r3, r1)
                r0.putStringArrayListExtra(r4, r1)
                goto L_0x00b0
            L_0x003e:
                boolean r2 = r1.f202628N
                if (r2 == 0) goto L_0x0044
                r3 = 6
                goto L_0x0045
            L_0x0044:
                r3 = 5
            L_0x0045:
                if (r2 == 0) goto L_0x0055
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.util.ArrayList r1 = fd0.C75740a.m91004b(r3, r1)
                r0.putExtra(r4, r1)
                goto L_0x00b0
            L_0x0055:
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.f214115W1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0066
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.f214115W1
                goto L_0x006e
            L_0x0066:
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
            L_0x006e:
                java.util.ArrayList r1 = fd0.C75740a.m91003a(r1)
                r0.putExtra(r4, r1)
                goto L_0x00b0
            L_0x0076:
                boolean r2 = r1.f202628N
                if (r2 == 0) goto L_0x007d
                r2 = 4
                r3 = 4
                goto L_0x007e
            L_0x007d:
                r3 = 3
            L_0x007e:
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.util.ArrayList r1 = fd0.C75740a.m91006d(r1)
                r0.putStringArrayListExtra(r4, r1)
                goto L_0x00b0
            L_0x008c:
                boolean r2 = r1.f202628N
                if (r2 == 0) goto L_0x0092
                r3 = 2
                goto L_0x0093
            L_0x0092:
                r3 = 1
            L_0x0093:
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.util.ArrayList r1 = fd0.C75740a.m91005c(r1)
                r0.putStringArrayListExtra(r4, r1)
                goto L_0x00b0
            L_0x00a1:
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.util.ArrayList r1 = fd0.C75740a.m91004b(r6, r1)
                r0.putExtra(r4, r1)
                r3 = 45
            L_0x00b0:
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                boolean r1 = r1.mo62927s3()
                if (r1 != 0) goto L_0x00bb
                goto L_0x00bc
            L_0x00bb:
                r6 = r3
            L_0x00bc:
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                com.tencent.mm.storage.z1 r1 = r1.f202624J
                java.lang.String r1 = r1.getUsername()
                java.lang.String r2 = "k_username"
                r0.putExtra(r2, r1)
                r1 = 0
                java.lang.String r2 = "showShare"
                r0.putExtra(r2, r1)
                java.lang.String r2 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r3[r1] = r4
                java.lang.String r1 = java.lang.String.format(r2, r3)
                java.lang.String r2 = "rawUrl"
                r0.putExtra(r2, r1)
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r10 = com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.this
                com.tencent.mm.ui.MMActivity r10 = r10.f202653d1
                r1 = 0
                java.lang.String r2 = "webview"
                java.lang.String r3 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r10, r2, r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference.C70154c.m82712d(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$c):void");
        }

        /* renamed from: a */
        public final void mo96630a(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.NormalUserFooterPreference", "mod stranger remark, username is null");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
            intent.putExtra("Contact_mode_name_type", 0);
            intent.putExtra("Contact_ModStrangerRemark", true);
            intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
            intent.putExtra("Contact_Nick", NormalUserFooterPreference.this.f202624J.getNickname());
            intent.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.f202624J.mo73969n2());
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93186s(intent, NormalUserFooterPreference.this.f121274d);
        }

        /* renamed from: e */
        public void mo96631e() {
            C115669n.INSTANCE.mo160131h(14553, 2, 2, NormalUserFooterPreference.this.f202624J.getUsername());
            String username = NormalUserFooterPreference.this.f202624J.getUsername();
            if (C45628s0.m50743H(username)) {
                NormalUserFooterPreference.this.f202624J.mo62935u4();
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48627f(username));
                C97625j3.m125812b().mo105907v().mo69688c(username);
                ((C44662n1) C97625j3.m125812b().mo105902q()).mo69807jo(username);
                return;
            }
            this.f202661d = false;
            Context context = NormalUserFooterPreference.this.f121274d;
            C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.a4d), true, true, new C70162d());
            String str = null;
            if (!this.f202661d) {
                str = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(NormalUserFooterPreference.this.f202624J.getUsername());
            }
            if (!Util.isNullOrNil(str)) {
                Q.dismiss();
                Context context2 = NormalUserFooterPreference.this.f121274d;
                C76879j.m92718L(context2, false, context2.getString(C0966R.string.ks8, new Object[]{str}), (String) null, NormalUserFooterPreference.this.f121274d.getString(C0966R.string.fey), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.by_), new C70163e(), new C70164f(Q, username), -1, C0966R.color.f3041d1);
                return;
            }
            mo96632f(username);
        }

        /* renamed from: f */
        public final void mo96632f(String str) {
            NormalUserFooterPreference.this.f202624J.mo62935u4();
            if (C72996z1.m85843n5(str)) {
                ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71241e9(str);
                C31519v2.m39436a().mo55986b(str);
                return;
            }
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71280gh(str);
        }

        /* renamed from: g */
        public abstract void mo96633g();

        /* renamed from: h */
        public void mo96634h() {
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            if (normalUserFooterPreference.f202636T) {
                normalUserFooterPreference.f202653d1.showOptionMenu(false);
            } else if (C75592q0.m90789s().equals(NormalUserFooterPreference.this.f202624J.getUsername())) {
            } else {
                if (!NormalUserFooterPreference.this.f202624J.mo62927s3()) {
                    mo96638l(false, false);
                } else if (!C72996z1.m85816S4(NormalUserFooterPreference.this.f202624J.getUsername())) {
                    mo96637k();
                }
            }
        }

        /* renamed from: i */
        public void mo96635i() {
            mo96633g();
            mo96634h();
            NormalUserFooterPreference.this.f202643W0.setOnClickListener(new C70265e2(this));
            NormalUserFooterPreference.this.f202649Z0.setOnClickListener(new C70267f2(this));
            NormalUserFooterPreference.this.f202645X0.setOnClickListener(new C70275g2(this));
            NormalUserFooterPreference.this.f202633R0.setOnClickListener(new C70278h2(this));
            NormalUserFooterPreference.this.f202637T0.setOnClickListener(new C70281i2(this));
            NormalUserFooterPreference.this.f202647Y0.setOnClickListener(new C70282j2(this));
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71281st(this);
        }

        /* renamed from: j */
        public void mo96636j() {
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(this);
        }

        /* renamed from: k */
        public void mo96637k() {
            NormalUserFooterPreference.this.f202653d1.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C70155a());
        }

        /* renamed from: l */
        public void mo96638l(boolean z, boolean z2) {
            if (!z || !z2) {
                NormalUserFooterPreference.this.f202653d1.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C70165g(z, z2));
            }
        }

        /* renamed from: m */
        public final void mo96639m() {
            C77407n nVar = new C77407n((Context) NormalUserFooterPreference.this.f202653d1, 1, false);
            nVar.f225771i = new C70160b(this);
            nVar.f225792t1 = true;
            nVar.f225781o1 = true;
            nVar.f225782p = new C70161c();
            nVar.mo107573q();
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.NormalUserFooterPreference", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        }

        /* renamed from: v2 */
        public void mo10385v2(String str, int i, C52085y83 y832) {
            if (i == 0) {
                if (!str.equals(NormalUserFooterPreference.this.f202624J.getUsername())) {
                    Log.m105929w("MicroMsg.NormalUserFooterPreference", "not current contact %s,%s", NormalUserFooterPreference.this.f202624J.getUsername(), str);
                    return;
                }
                int i2 = NormalUserFooterPreference.this.f202626L;
                if (i2 == 12) {
                    C76167a1 b = C75398e.Ax0().mo106405b(str);
                    if (b != null) {
                        b.f223140b = 1;
                        C75398e.Ax0().mo106406d(b.f223139a, b);
                    }
                } else if (i2 == 13) {
                    C76166a a = C75398e.vx0().mo106401a(str);
                    if (a != null && !Util.isNullOrNil(a.f223133u)) {
                        a.f223127o = 1;
                        C75398e.vx0().mo106403d(a.mo106385e(), a);
                    }
                } else if (i2 != 31) {
                    switch (i2) {
                        case 58:
                        case 59:
                        case 60:
                            C75398e.yx0().mo71484bD(str, 2, 0);
                            break;
                    }
                } else {
                    C76175p xx02 = C75398e.xx0();
                    xx02.getClass();
                    C76174o oVar = null;
                    Cursor rawQuery = xx02.f223188d.rawQuery("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.username = \"" + str + FastJsonResponse.QUOTE, (String[]) null, 2);
                    if (rawQuery != null) {
                        if (rawQuery.moveToFirst()) {
                            oVar = new C76174o();
                            oVar.mo106412a(rawQuery);
                        }
                        rawQuery.close();
                    }
                    if (oVar != null) {
                        oVar.f223173d = 100;
                        C75398e.xx0().mo106430Lo(oVar);
                    }
                }
                if (NormalUserFooterPreference.this.f202626L == 9) {
                    Log.m105924i("MicroMsg.NormalUserFooterPreference", "add scene unkown, check the contact getsource: " + NormalUserFooterPreference.this.f202624J.getSource());
                    int source = NormalUserFooterPreference.this.f202624J.getSource();
                    if (source == 10 || source == 13) {
                        Log.m105924i("MicroMsg.NormalUserFooterPreference", "delete the system contact info added by wechat");
                    }
                }
                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                if (normalUserFooterPreference.f202627M == 0) {
                    Intent intent = new Intent();
                    intent.addFlags(67108864);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, NormalUserFooterPreference.this.f121274d);
                    return;
                }
                MMActivity mMActivity = normalUserFooterPreference.f202653d1;
                mMActivity.setResult(-1, mMActivity.getIntent().putExtra("_delete_ok_", true));
                ((Activity) NormalUserFooterPreference.this.f121274d).finish();
            } else if (!Util.isNullOrNil(y832.f145175d)) {
                C76879j.m92748s(NormalUserFooterPreference.this.f202653d1, y832.f145175d, y832.f145176e);
            } else {
                MMActivity mMActivity2 = NormalUserFooterPreference.this.f202653d1;
                C76879j.m92748s(mMActivity2, mMActivity2.getString(C0966R.string.f7945x2), "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$d */
    public class C70169d extends C70172e {

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$d$a */
        public class C70170a implements View.OnClickListener {
            public C70170a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C70169d.this.mo96650n();
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$d$b */
        public class C70171b implements View.OnClickListener {
            public C70171b() {
            }

            public void onClick(View view) {
                Class cls = C11502f.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!NormalUserFooterPreference.this.f202644X || !C78146a.m94354c()) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
                    intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
                    intent.putExtra("AntispamTicket", NormalUserFooterPreference.this.f202624J.f149527Z0);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93187t(intent, NormalUserFooterPreference.this.f121274d);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Chat_User", NormalUserFooterPreference.this.f202624J.mo73978v2());
                    intent2.putExtra("lbs_mode", true);
                    intent2.putExtra("lbs_ticket", NormalUserFooterPreference.this.f202654e1);
                    intent2.putExtra("add_scene", NormalUserFooterPreference.this.f202626L);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent2, NormalUserFooterPreference.this.f202653d1);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C70169d() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            View view = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!NormalUserFooterPreference.this.f202624J.mo62927s3() || (NormalUserFooterPreference.this.f202624J.mo62927s3() && C72996z1.m85811N4(NormalUserFooterPreference.this.f202624J.getUsername()))) {
                View view2 = NormalUserFooterPreference.this.f202635S0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NormalUserFooterPreference.this.f202643W0.setVisibility(8);
                NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
                NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            } else {
                View view3 = NormalUserFooterPreference.this.f202635S0;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NormalUserFooterPreference.this.f202643W0.setVisibility(0);
                if (NormalUserFooterPreference.this.mo96627b0() || NormalUserFooterPreference.this.f202624J.getUsername().equals(C75592q0.m90789s())) {
                    NormalUserFooterPreference.this.f202645X0.setVisibility(8);
                } else {
                    NormalUserFooterPreference.this.f202645X0.setVisibility(0);
                }
            }
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            NormalUserFooterPreference.this.f202647Y0.setVisibility(8);
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            if (normalUserFooterPreference.f202642W) {
                View view4 = normalUserFooterPreference.f202635S0;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NormalUserFooterPreference.this.f202641V0.setVisibility(0);
                NormalUserFooterPreference.this.f202641V0.setOnClickListener(new C70170a());
            }
            NormalUserFooterPreference.this.f202639U0.setOnClickListener(new C70171b());
        }

        /* renamed from: h */
        public void mo96634h() {
            C72996z1 z1Var = NormalUserFooterPreference.this.f202624J;
            if (z1Var == null) {
                Log.m105920e("MicroMsg.NormalUserFooterPreference", "contact is null in NearByFriendHandler");
            } else if (z1Var.mo62927s3() && (!NormalUserFooterPreference.this.f202624J.mo62927s3() || !C72996z1.m85811N4(NormalUserFooterPreference.this.f202624J.getUsername()))) {
                mo96637k();
            } else if (!C72996z1.m85811N4(NormalUserFooterPreference.this.f202624J.getUsername())) {
                mo96638l(false, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e */
    public class C70172e extends C70154c {

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e$a */
        public class C70173a implements View.OnClickListener {
            public C70173a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C70172e.this.mo96631e();
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e$b */
        public class C70174b implements View.OnClickListener {
            public C70174b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (NormalUserFooterPreference.this.f202653d1.getIntent() != null) {
                    String stringExtra = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("key_ww_add_session_id");
                    if (!Util.isNullOrNil(stringExtra)) {
                        OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
                        openIMSearchFriendtLogStruct.mo93196s(stringExtra);
                        openIMSearchFriendtLogStruct.f194309e = 0;
                        openIMSearchFriendtLogStruct.f194311g = 1;
                        openIMSearchFriendtLogStruct.mo86054n();
                    }
                }
                C70172e.this.mo96650n();
                int i = NormalUserFooterPreference.this.f202652c1;
                if (i != 0) {
                    C115669n.INSTANCE.mo160131h(11263, Integer.valueOf(i), NormalUserFooterPreference.this.f202624J.getUsername());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e$c */
        public class C70175c implements C39989b.C0705b {
            public C70175c() {
            }

            /* renamed from: a */
            public void mo677a(boolean z, boolean z2, String str, String str2) {
                C76166a a;
                int i;
                if (z) {
                    NormalUserFooterPreference.this.f202655f1.event("hide_btn");
                    NormalUserFooterPreference.this.f202655f1.doNotify();
                    C70172e eVar = C70172e.this;
                    NormalUserFooterPreference.this.f202651b1 = true;
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.NormalUserFooterPreference", "addContact respUsername is empty");
                        C115669n.INSTANCE.mo175911u(931, 21);
                    }
                    if (((int) NormalUserFooterPreference.this.f202624J.f108320R1) == 0) {
                        if (!Util.isNullOrNil(str)) {
                            NormalUserFooterPreference.this.f202624J.setUsername(str);
                        }
                        C97625j3.m125812b().mo105907v().mo69707j3(NormalUserFooterPreference.this.f202624J);
                        C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                    }
                    C72996z1 z1Var = NormalUserFooterPreference.this.f202624J;
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.NormalUserFooterPreference", "addContact : insert contact failed");
                    } else {
                        if (!z1Var.mo62927s3() && NormalUserFooterPreference.this.f202626L == 15 && (a = C75398e.vx0().mo106401a(NormalUserFooterPreference.this.f202624J.getUsername())) != null) {
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[4];
                            objArr[0] = NormalUserFooterPreference.this.f202624J.getUsername();
                            objArr[1] = 3;
                            objArr[2] = Integer.valueOf(Util.isNullOrNil(a.mo106385e()) ^ true ? 1 : 0);
                            String[] c = C1233a.m1356c(NormalUserFooterPreference.this.f202624J);
                            if (c == null) {
                                i = 0;
                            } else {
                                i = 5;
                                if (c.length < 5) {
                                    i = c.length;
                                }
                            }
                            objArr[3] = Integer.valueOf(i);
                            nVar.mo160131h(12040, objArr);
                        }
                        C45628s0.m50775g0(NormalUserFooterPreference.this.f202624J);
                        NormalUserFooterPreference.this.f202624J = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                        eVar.mo96633g();
                        C68397a.m80737c(NormalUserFooterPreference.this.f202624J.mo73978v2(), 0);
                        RecoverAccountFriendEvent recoverAccountFriendEvent = new RecoverAccountFriendEvent();
                        recoverAccountFriendEvent.f193880d.f193881a = NormalUserFooterPreference.this.f202624J.mo73978v2();
                        recoverAccountFriendEvent.f193880d.f193882b = 1;
                        recoverAccountFriendEvent.publish();
                    }
                } else if (z2) {
                    C75743h.vx0().mo101171bF(str, 2);
                    C68397a.m80737c(NormalUserFooterPreference.this.f202624J.mo73978v2(), 1);
                    RecoverAccountFriendEvent recoverAccountFriendEvent2 = new RecoverAccountFriendEvent();
                    recoverAccountFriendEvent2.f193880d.f193881a = NormalUserFooterPreference.this.f202624J.mo73978v2();
                    recoverAccountFriendEvent2.f193880d.f193882b = 1;
                    recoverAccountFriendEvent2.publish();
                } else {
                    Log.m105920e("MicroMsg.NormalUserFooterPreference", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
                }
                if (z || z2) {
                    Intent intent = NormalUserFooterPreference.this.f202653d1.getIntent();
                    int intExtra = intent.getIntExtra("search_kvstat_scene", 0);
                    int intExtra2 = intent.getIntExtra("search_kvstat_position", 0);
                    if (intExtra > 0 && intExtra2 > 0) {
                        C115669n.INSTANCE.mo160131h(10991, Integer.valueOf(intExtra), 6, Integer.valueOf(intExtra2));
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e$d */
        public class C70176d implements C39989b.C0706c {

            /* renamed from: a */
            public final /* synthetic */ String f202689a;

            /* renamed from: b */
            public final /* synthetic */ String f202690b;

            public C70176d(String str, String str2) {
                this.f202689a = str;
                this.f202690b = str2;
            }

            /* renamed from: a */
            public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                Class cls = C32735h.class;
                String stringExtra = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("room_name");
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
                int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000);
                Class cls2 = SayHiWithSnsPermissionUI.class;
                if (!C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) && Qe == 1) {
                    cls2 = SayHiWithSnsPermissionUI2.class;
                } else if (!C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) && Qe == 2 && C45628s0.m50780j() >= Qe2) {
                    cls2 = SayHiWithSnsPermissionUI3.class;
                }
                Intent intent = new Intent(NormalUserFooterPreference.this.f202653d1, cls2);
                intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
                intent.putExtra("Contact_Nick", NormalUserFooterPreference.this.f202624J.getNickname());
                intent.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.f202624J.mo73969n2());
                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                int i2 = normalUserFooterPreference.f202626L;
                if (i2 == 14 || i2 == 8) {
                    intent.putExtra("Contact_RoomNickname", normalUserFooterPreference.f202653d1.getIntent().getStringExtra("Contact_RoomNickname"));
                }
                intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
                intent.putExtra("room_name", stringExtra);
                intent.putExtra("source_from_user_name", this.f202689a);
                intent.putExtra("source_from_nick_name", this.f202690b);
                intent.putExtra("sayhi_with_sns_perm_send_verify", true);
                intent.putExtra("sayhi_with_sns_perm_add_remark", true);
                intent.putExtra("sayhi_with_sns_perm_set_label", false);
                intent.putExtra("AntispamTicket", str3);
                intent.putExtra("sayhi_verify_add_errcode", i);
                NormalUserFooterPreference.this.f202653d1.startActivityForResult(intent, 0);
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$e$e */
        public class C70177e implements C75597w2.C31525a {

            /* renamed from: a */
            public final /* synthetic */ C78543a f202692a;

            /* renamed from: b */
            public final /* synthetic */ String f202693b;

            /* renamed from: c */
            public final /* synthetic */ LinkedList f202694c;

            public C70177e(C78543a aVar, String str, LinkedList linkedList) {
                this.f202692a = aVar;
                this.f202693b = str;
                this.f202694c = linkedList;
            }

            /* renamed from: a */
            public void mo1109a(String str, boolean z) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                String str2 = "";
                if (z1Var != null) {
                    str2 = Util.nullAs(z1Var.f149527Z0, str2);
                }
                this.f202692a.mo108509l(str2);
                this.f202692a.mo108500a(NormalUserFooterPreference.this.f202624J.getUsername(), this.f202693b, this.f202694c);
            }
        }

        public C70172e() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            Assert.assertTrue(!C45628s0.m50812z(NormalUserFooterPreference.this.f202624J.getUsername()));
            View R = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            C60958c.m71442b(8, aVar);
            C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(R, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View S = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            C60958c.m71442b(8, aVar2);
            C117292a.m165358d(S, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(S, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (NormalUserFooterPreference.this.f202636T) {
                NormalUserFooterPreference.this.f202657x0.setOnClickListener(new C70173a());
                if (NormalUserFooterPreference.this.f202624J.mo62927s3()) {
                    NormalUserFooterPreference.this.f202657x0.setVisibility(0);
                } else {
                    NormalUserFooterPreference.this.f202657x0.setVisibility(8);
                }
                NormalUserFooterPreference.this.f202641V0.setVisibility(8);
                NormalUserFooterPreference.this.f202643W0.setVisibility(8);
                NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
                NormalUserFooterPreference.this.f202645X0.setVisibility(8);
                NormalUserFooterPreference.this.f202650a1.setVisibility(8);
                return;
            }
            NormalUserFooterPreference.this.f202641V0.setOnClickListener(new C70174b());
            if (!NormalUserFooterPreference.this.f202624J.mo62927s3()) {
                NormalUserFooterPreference.this.f202641V0.setVisibility(0);
                NormalUserFooterPreference.this.f202643W0.setVisibility(8);
                NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
                NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            } else {
                NormalUserFooterPreference.this.f202641V0.setVisibility(8);
                NormalUserFooterPreference.this.f202643W0.setVisibility(0);
                if (NormalUserFooterPreference.this.mo96627b0() || NormalUserFooterPreference.this.f202624J.getUsername().equals(C75592q0.m90789s()) || C45628s0.m50812z(NormalUserFooterPreference.this.f202624J.getUsername()) || C72996z1.m85816S4(NormalUserFooterPreference.this.f202624J.getUsername()) || C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) || C72996z1.m85796D5(NormalUserFooterPreference.this.f202624J.getUsername())) {
                    NormalUserFooterPreference.this.f202645X0.setVisibility(8);
                } else {
                    NormalUserFooterPreference.this.f202645X0.setVisibility(0);
                }
                if (C97625j3.m125812b().mo105907v().mo69661K3(NormalUserFooterPreference.this.f202624J.getUsername())) {
                    NormalUserFooterPreference.this.f202647Y0.setVisibility(0);
                    NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                    int unused = normalUserFooterPreference.f202626L = normalUserFooterPreference.f202624J.getSource();
                }
            }
            if (NormalUserFooterPreference.this.f202624J.mo62920o3()) {
                NormalUserFooterPreference.this.f202650a1.setVisibility(0);
            } else {
                NormalUserFooterPreference.this.f202650a1.setVisibility(8);
            }
        }

        /* renamed from: i */
        public void mo96635i() {
            super.mo96635i();
        }

        /* renamed from: j */
        public void mo96636j() {
            super.mo96636j();
        }

        /* renamed from: n */
        public void mo96650n() {
            String str;
            int i;
            if (((int) NormalUserFooterPreference.this.f202624J.f108320R1) == 0 && C97625j3.m125812b().mo105907v().mo69707j3(NormalUserFooterPreference.this.f202624J) != -1) {
                NormalUserFooterPreference.this.f202624J = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
            }
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            String str2 = "";
            if (normalUserFooterPreference.f202629P || (i = normalUserFooterPreference.f202626L) == 12) {
                Log.m105918d("MicroMsg.NormalUserFooterPreference", "qqNum " + NormalUserFooterPreference.this.f202630Q + " qqReamrk " + NormalUserFooterPreference.this.f202632R);
                NormalUserFooterPreference normalUserFooterPreference2 = NormalUserFooterPreference.this;
                if (!(normalUserFooterPreference2.f202630Q == 0 || (str = normalUserFooterPreference2.f202632R) == null || str.equals(str2))) {
                    C76167a1 a = C75398e.Ax0().mo106404a(NormalUserFooterPreference.this.f202630Q);
                    if (a == null) {
                        C76167a1 a1Var = new C76167a1();
                        a1Var.f223143e = str2;
                        NormalUserFooterPreference normalUserFooterPreference3 = NormalUserFooterPreference.this;
                        a1Var.f223139a = normalUserFooterPreference3.f202630Q;
                        a1Var.f223149k = normalUserFooterPreference3.f202632R;
                        a1Var.f223142d = normalUserFooterPreference3.f202624J.getUsername();
                        a1Var.f223153o |= 1;
                        C76169b1 Ax0 = C75398e.Ax0();
                        Ax0.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append("insert: name:");
                        String str3 = a1Var.f223146h;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        sb.append(str3);
                        Log.m105918d("MicroMsg.QQListStorage", sb.toString());
                        a1Var.f223155q = -1;
                        if (((int) Ax0.f223159c.mo125627q("qqlist", "qq", a1Var.mo106398b(), false)) != -1) {
                            Ax0.doNotify(2, Ax0, str2 + a1Var.f223139a);
                        }
                    } else {
                        NormalUserFooterPreference normalUserFooterPreference4 = NormalUserFooterPreference.this;
                        a.f223139a = normalUserFooterPreference4.f202630Q;
                        a.f223149k = normalUserFooterPreference4.f202632R;
                        a.f223142d = normalUserFooterPreference4.f202624J.getUsername();
                        a.f223153o |= 1;
                        C75398e.Ax0().mo106406d(NormalUserFooterPreference.this.f202630Q, a);
                    }
                }
            } else if (i == 58 || i == 59 || i == 60) {
                C75398e.yx0().mo71484bD(NormalUserFooterPreference.this.f202624J.getUsername(), 1, 0);
            }
            String stringExtra = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("Contact_Mobile_MD5");
            String stringExtra2 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("Contact_full_Mobile_MD5");
            String nullAsNil = Util.nullAsNil(stringExtra);
            String nullAsNil2 = Util.nullAsNil(stringExtra2);
            if (!nullAsNil.equals(str2) || !nullAsNil2.equals(str2)) {
                C76166a b = C75398e.vx0().mo106402b(nullAsNil);
                if (b == null) {
                    b = C75398e.vx0().mo106402b(nullAsNil2);
                    nullAsNil = nullAsNil2;
                }
                if (b != null) {
                    C75398e.vx0().mo106403d(nullAsNil, b);
                }
            }
            C78543a aVar = new C78543a(NormalUserFooterPreference.this.f121274d, new C70175c());
            LinkedList linkedList = new LinkedList();
            linkedList.add(Integer.valueOf(NormalUserFooterPreference.this.f202626L));
            String stringExtra3 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("source_from_user_name");
            String stringExtra4 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("source_from_nick_name");
            aVar.f230048t = stringExtra3;
            aVar.f230049u = stringExtra4;
            aVar.f230036e = new C70176d(stringExtra3, stringExtra4);
            String stringExtra5 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("room_name");
            String stringExtra6 = NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("AntispamTicket");
            if (!TextUtils.isEmpty(stringExtra6)) {
                Log.m105925i("MicroMsg.NormalUserFooterPreference", "add contact case 1:%s", stringExtra6);
                aVar.mo108509l(stringExtra6);
                aVar.mo108500a(NormalUserFooterPreference.this.f202624J.getUsername(), str2, linkedList);
            } else if (TextUtils.isEmpty(stringExtra5)) {
                Log.m105925i("MicroMsg.NormalUserFooterPreference", "add contact case 2, %s", NormalUserFooterPreference.this.f202624J.f149527Z0);
                aVar.mo108509l(NormalUserFooterPreference.this.f202624J.f149527Z0);
                aVar.mo108501b(NormalUserFooterPreference.this.f202624J.getUsername(), linkedList, false, str2);
            } else if (!TextUtils.isEmpty(aVar.f230045q)) {
                Log.m105925i("MicroMsg.NormalUserFooterPreference", "add contact case 3, %s", NormalUserFooterPreference.this.f202624J.f149527Z0);
                aVar.mo108509l(NormalUserFooterPreference.this.f202624J.f149527Z0);
                aVar.mo108500a(NormalUserFooterPreference.this.f202624J.getUsername(), stringExtra5, linkedList);
            } else {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                if (z1Var != null) {
                    str2 = Util.nullAs(z1Var.f149527Z0, str2);
                }
                Log.m105925i("MicroMsg.NormalUserFooterPreference", "dkverify footer add:%s chat:%s ticket:%s", NormalUserFooterPreference.this.f202624J.getUsername(), stringExtra5, str2);
                if (!TextUtils.isEmpty(str2)) {
                    aVar.mo108509l(str2);
                    aVar.mo108500a(NormalUserFooterPreference.this.f202624J.getUsername(), stringExtra5, linkedList);
                    return;
                }
                C31519v2.m39436a().mo55988e(NormalUserFooterPreference.this.f202624J.getUsername(), stringExtra5, new C70177e(aVar, stringExtra5, linkedList));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$f */
    public class C70178f extends C70154c {
        public C70178f() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            Assert.assertTrue(C72996z1.m85793A5(NormalUserFooterPreference.this.f202624J.getUsername()));
            View R = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            C60958c.m71442b(8, aVar);
            C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$OfficialHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(R, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$OfficialHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View S = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            C60958c.m71442b(8, aVar2);
            C117292a.m165358d(S, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$OfficialHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(S, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$OfficialHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            NormalUserFooterPreference.this.f202643W0.setVisibility(0);
            NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
            NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            NormalUserFooterPreference.this.f202647Y0.setVisibility(8);
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
        }

        /* renamed from: h */
        public void mo96634h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$g */
    public interface C70179g {
        /* renamed from: a */
        void mo96653a(String str, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$h */
    public class C70180h extends C70154c {

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$h$a */
        public class C70181a implements View.OnClickListener {
            public C70181a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C118418g.INSTANCE.B10(1, 1, 5);
                Intent intent = new Intent();
                intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
                intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
                intent.putExtra("AntispamTicket", NormalUserFooterPreference.this.f202624J.f149527Z0);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93187t(intent, NormalUserFooterPreference.this.f121274d);
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C70180h() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            View view = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            NormalUserFooterPreference.this.f202643W0.setVisibility(8);
            NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
            NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            NormalUserFooterPreference.this.f202647Y0.setVisibility(8);
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
            NormalUserFooterPreference.this.f202639U0.setOnClickListener(new C70181a());
        }

        /* renamed from: h */
        public void mo96634h() {
            C72996z1 z1Var = NormalUserFooterPreference.this.f202624J;
            if (z1Var == null || !z1Var.mo62927s3()) {
                mo96638l(false, true);
            } else {
                mo96637k();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$i */
    public class C70182i extends C70154c {
        public C70182i() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            Assert.assertTrue(!C75592q0.m90764L(NormalUserFooterPreference.this.f202624J.getUsername()));
            Assert.assertTrue(!C45628s0.m50812z(NormalUserFooterPreference.this.f202624J.getUsername()));
            View R = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            C60958c.m71442b(8, aVar);
            C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$RoomHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(R, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$RoomHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View S = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            C60958c.m71442b(8, aVar2);
            C117292a.m165358d(S, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$RoomHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(S, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$RoomHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202643W0.setText(C0966R.string.bqp);
            NormalUserFooterPreference.this.f202643W0.setVisibility(0);
            NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
        }

        /* renamed from: h */
        public void mo96634h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$j */
    public class C70183j extends C70154c {
        public C70183j() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            View view = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202643W0.setVisibility(0);
            if (NormalUserFooterPreference.this.mo96627b0() || NormalUserFooterPreference.this.f202624J.getUsername().equals(C75592q0.m90789s()) || C45628s0.m50812z(NormalUserFooterPreference.this.f202624J.getUsername()) || C72996z1.m85816S4(NormalUserFooterPreference.this.f202624J.getUsername())) {
                NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            } else {
                NormalUserFooterPreference.this.f202645X0.setVisibility(0);
            }
            NormalUserFooterPreference.this.f202643W0.setText(C0966R.string.bql);
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            View view2 = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
        }

        /* renamed from: h */
        public void mo96634h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$k */
    public class C70184k extends C70172e {

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$k$a */
        public class C70185a implements DialogInterface.OnClickListener {
            public C70185a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C70184k.this.mo96650n();
            }
        }

        public C70184k() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public void m82743p() {
            C97625j3.m125815e().mo123470p(30, this);
            C97625j3.m125815e().mo123470p(C90202a.CTRL_INDEX, this);
            C97625j3.m125815e().mo123470p(C88585e.CTRL_INDEX, this);
        }

        /* renamed from: g */
        public void mo96633g() {
            mo96636j();
            m82743p();
            C97625j3.m125815e().mo123455a(30, this);
            C97625j3.m125815e().mo123455a(C90202a.CTRL_INDEX, this);
            C97625j3.m125815e().mo123455a(C88585e.CTRL_INDEX, this);
            super.mo96633g();
        }

        /* renamed from: j */
        public void mo96636j() {
            View view = NormalUserFooterPreference.this.f202648Z;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = NormalUserFooterPreference.this.f202635S0;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Button button = NormalUserFooterPreference.this.f202643W0;
            if (button != null) {
                button.setVisibility(8);
            }
            Button button2 = NormalUserFooterPreference.this.f202649Z0;
            if (button2 != null) {
                button2.setVisibility(8);
            }
            Button button3 = NormalUserFooterPreference.this.f202645X0;
            if (button3 != null) {
                button3.setVisibility(8);
            }
            Button button4 = NormalUserFooterPreference.this.f202641V0;
            if (button4 != null) {
                button4.setVisibility(8);
            }
            TextView textView = NormalUserFooterPreference.this.f202650a1;
            if (textView != null) {
                textView.setVisibility(8);
            }
            m82743p();
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            List<String> list;
            Log.m105918d("MicroMsg.NormalUserFooterPreference", "onSceneEnd, errType = " + i + ", errCode = " + i2);
            if (yVar.getType() == 30 || yVar.getType() == 667 || yVar.getType() == 853) {
                m82743p();
                if (Util.isTopActivity(NormalUserFooterPreference.this.f121274d)) {
                    if (i == 0 && i2 == 0) {
                        if (yVar.getType() == 30) {
                            C44590b1 b1Var = (C44590b1) yVar;
                            int i3 = b1Var.f120898g;
                            Log.m105918d("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, opCode = " + i3);
                            if ((i3 == 1 || i3 == 3) && (list = b1Var.f120897f) != null && list.contains(NormalUserFooterPreference.this.f202624J.getUsername())) {
                                NormalUserFooterPreference.this.f202651b1 = true;
                                mo96655q();
                                C70186l lVar = (C70186l) this;
                                C70154c cVar = NormalUserFooterPreference.this.f202646Y;
                                if (cVar != null) {
                                    cVar.mo96636j();
                                }
                                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                                C70172e eVar = new C70172e();
                                normalUserFooterPreference.f202646Y = eVar;
                                eVar.mo96635i();
                                for (String i4 : list) {
                                    C67030b.m79194i(i4, NormalUserFooterPreference.this.f202626L);
                                }
                                ((MMNotification) C97625j3.m125816f()).mo93209g();
                                return;
                            }
                            return;
                        } else if (yVar.getType() == 667 || yVar.getType() == 853) {
                            NormalUserFooterPreference.this.f202651b1 = true;
                            mo96655q();
                            C70186l lVar2 = (C70186l) this;
                            C70154c cVar2 = NormalUserFooterPreference.this.f202646Y;
                            if (cVar2 != null) {
                                cVar2.mo96636j();
                            }
                            NormalUserFooterPreference normalUserFooterPreference2 = NormalUserFooterPreference.this;
                            C70172e eVar2 = new C70172e();
                            normalUserFooterPreference2.f202646Y = eVar2;
                            eVar2.mo96635i();
                            C67030b.m79194i(NormalUserFooterPreference.this.f202624J.getUsername(), NormalUserFooterPreference.this.f202626L);
                            ((MMNotification) C97625j3.m125816f()).mo93209g();
                            return;
                        }
                    }
                    if (i == 4 && i2 == -302) {
                        int i5 = yVar.getType() == 30 ? ((C44590b1) yVar).f120898g : 0;
                        Log.m105929w("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", Integer.valueOf(i5));
                        if (i5 == 3 || yVar.getType() == 853) {
                            MMActivity mMActivity = NormalUserFooterPreference.this.f202653d1;
                            C76879j.m92707A(mMActivity, mMActivity.getString(C0966R.string.f360313bt1), NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.a3h), NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.f7566ju), NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.f7926wf), new C70185a(), (DialogInterface.OnClickListener) null);
                        }
                    } else if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                        C76701a.makeText((Context) NormalUserFooterPreference.this.f202653d1, (CharSequence) str, 1).show();
                    } else if (i != 1) {
                        if (i == 2) {
                            Context context = NormalUserFooterPreference.this.f121274d;
                            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f360087a11), 0).show();
                        } else if (i == 4) {
                            if (i2 == -100 || i2 == -2023) {
                                Context context2 = NormalUserFooterPreference.this.f121274d;
                                C86709a0.m107528h();
                                C86709a0.m107523b();
                                C76879j.m92719M(context2, C86718e.f251747w, C76577a.m92166q(NormalUserFooterPreference.this.f121274d, C0966R.string.a3h), new C70283k2(this), new C70284l2(this));
                                return;
                            }
                            if (i == 4 && i2 == -34) {
                                str = NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.exz);
                            } else if (i == 4 && i2 == -94) {
                                str = NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.f360807ey2);
                            } else if (i != 4 || Util.isNullOrNil(str)) {
                                str = NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.ilv);
                            }
                            C76701a.makeText((Context) NormalUserFooterPreference.this.f202653d1, (CharSequence) str, 1).show();
                        }
                    } else if (C97625j3.m125815e().mo123466l()) {
                        Context context3 = NormalUserFooterPreference.this.f121274d;
                        C97625j3.m125815e().mo123465k();
                    } else if (C114786m0.m161568a(NormalUserFooterPreference.this.f121274d)) {
                        C6692y0.m7002a(NormalUserFooterPreference.this.f121274d);
                    }
                }
            }
        }

        /* renamed from: q */
        public final void mo96655q() {
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                C72996z1 z1Var2 = NormalUserFooterPreference.this.f202624J;
                if (!C97625j3.m125812b().mo105907v().mo69668Q3(z1Var2)) {
                    Log.m105920e("MicroMsg.NormalUserFooterPreference", "insert contact failed, username = " + z1Var2.getUsername());
                    z1Var = null;
                } else {
                    z1Var = C97625j3.m125812b().mo105907v().get(NormalUserFooterPreference.this.f202624J.getUsername());
                }
            }
            normalUserFooterPreference.f202624J = z1Var;
            C72996z1 z1Var3 = NormalUserFooterPreference.this.f202624J;
            if (z1Var3 != null) {
                C45628s0.m50775g0(z1Var3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$l */
    public class C70186l extends C70184k {

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$l$a */
        public class C70187a implements View.OnClickListener {
            public C70187a() {
            }

            public void onClick(View view) {
                Class cls = C32735h.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                NormalUserFooterPreference.this.f202653d1.getIntent().removeExtra("Accept_NewFriend_FromOutside");
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
                int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000);
                Class cls2 = SayHiWithSnsPermissionUI.class;
                if (!C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) && Qe == 1) {
                    cls2 = SayHiWithSnsPermissionUI2.class;
                } else if (!C72996z1.m85843n5(NormalUserFooterPreference.this.f202624J.getUsername()) && Qe == 2 && C45628s0.m50780j() >= Qe2) {
                    cls2 = SayHiWithSnsPermissionUI3.class;
                }
                Intent intent = new Intent(NormalUserFooterPreference.this.f202653d1, cls2);
                intent.putExtra("Contact_User", NormalUserFooterPreference.this.f202624J.getUsername());
                intent.putExtra("room_name", NormalUserFooterPreference.this.f202653d1.getIntent().getStringExtra("room_name"));
                intent.putExtra("Contact_Nick", NormalUserFooterPreference.this.f202624J.getNickname());
                intent.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.f202624J.mo73969n2());
                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                int i = normalUserFooterPreference.f202626L;
                if (i == 14 || i == 8) {
                    intent.putExtra("Contact_RoomNickname", normalUserFooterPreference.f202653d1.getIntent().getStringExtra("Contact_RoomNickname"));
                }
                intent.putExtra("Contact_Scene", NormalUserFooterPreference.this.f202626L);
                intent.putExtra("Verify_ticket", NormalUserFooterPreference.this.f202634S);
                intent.putExtra("sayhi_with_sns_perm_send_verify", false);
                intent.putExtra("sayhi_with_sns_perm_add_remark", true);
                intent.putExtra("sayhi_with_sns_perm_set_label", true);
                NormalUserFooterPreference.this.f202653d1.startActivityForResult(intent, 0);
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$l$b */
        public class C70188b implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference$l$b$a */
            public class C70189a implements DialogInterface.OnClickListener {
                public C70189a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C45628s0.m50769d0(NormalUserFooterPreference.this.f202624J);
                    NormalUserFooterPreference.this.f202624J.mo62853E3();
                    C70186l.this.mo96633g();
                }
            }

            public C70188b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (NormalUserFooterPreference.this.f202624J.mo62920o3()) {
                    C45628s0.m50813z0(NormalUserFooterPreference.this.f202624J);
                    NormalUserFooterPreference.this.f202624J.mo62933t4();
                    C70186l.this.mo96633g();
                } else {
                    NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                    Context context = normalUserFooterPreference.f121274d;
                    C76879j.m92750u(context, context.getString(C72996z1.m85843n5(normalUserFooterPreference.f202624J.getUsername()) ? C0966R.string.bok : C0966R.string.boj), NormalUserFooterPreference.this.f121274d.getString(C0966R.string.boi), new C70189a(), (DialogInterface.OnClickListener) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C70186l() {
            super();
        }

        /* renamed from: g */
        public void mo96633g() {
            super.mo96633g();
            View view = NormalUserFooterPreference.this.f202648Z;
            C9556a aVar = new C9556a();
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202641V0.setVisibility(8);
            NormalUserFooterPreference.this.f202643W0.setVisibility(8);
            NormalUserFooterPreference.this.f202649Z0.setVisibility(8);
            NormalUserFooterPreference.this.f202645X0.setVisibility(8);
            NormalUserFooterPreference.this.f202647Y0.setVisibility(8);
            View view2 = NormalUserFooterPreference.this.f202635S0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            NormalUserFooterPreference.this.f202650a1.setVisibility(8);
            NormalUserFooterPreference.this.f202633R0.setVisibility(0);
            View view3 = NormalUserFooterPreference.this.f202631Q0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (NormalUserFooterPreference.this.f202624J.mo62920o3()) {
                NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
                normalUserFooterPreference.f202658y0.setText(normalUserFooterPreference.f202653d1.getString(C0966R.string.bon));
                NormalUserFooterPreference.this.f202650a1.setVisibility(0);
            } else {
                NormalUserFooterPreference normalUserFooterPreference2 = NormalUserFooterPreference.this;
                normalUserFooterPreference2.f202658y0.setText(normalUserFooterPreference2.f202653d1.getString(C0966R.string.boi));
            }
            NormalUserFooterPreference.this.f202656p0.setOnClickListener(new C70187a());
            NormalUserFooterPreference.this.f202658y0.setOnClickListener(new C70188b());
        }

        /* renamed from: h */
        public void mo96634h() {
            C72996z1 z1Var = NormalUserFooterPreference.this.f202624J;
            if (z1Var == null || !z1Var.mo62927s3()) {
                mo96638l(false, true);
            } else {
                mo96637k();
            }
        }

        /* renamed from: j */
        public void mo96636j() {
            super.mo96636j();
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            super.onSceneEnd(i, i2, str, yVar);
        }
    }

    public NormalUserFooterPreference(Context context) {
        super(context);
        this.f202653d1 = (MMActivity) context;
        this.f202640V = false;
        this.f202646Y = null;
    }

    /* renamed from: W */
    public void mo96623W() {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = this.f202624J.getUsername();
        VoipEvent.C67818a aVar2 = voipEvent.f194019d;
        aVar2.f194024d = this.f202653d1;
        aVar2.f194026f = 4;
        voipEvent.publish();
    }

    /* renamed from: Y */
    public void mo96624Y() {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = this.f202624J.getUsername();
        VoipEvent.C67818a aVar2 = voipEvent.f194019d;
        aVar2.f194024d = this.f202653d1;
        aVar2.f194026f = 2;
        voipEvent.publish();
    }

    /* renamed from: Z */
    public final void mo96625Z() {
        if (!this.f202640V || this.f202624J == null) {
            Log.m105928w("MicroMsg.NormalUserFooterPreference", "iniView : bindView = " + this.f202640V + " contact = " + this.f202624J);
            C70154c cVar = this.f202646Y;
            if (cVar != null) {
                try {
                    cVar.mo96634h();
                } catch (Throwable unused) {
                }
            }
        } else {
            C70154c cVar2 = this.f202646Y;
            if (cVar2 != null) {
                cVar2.mo96635i();
            }
            mo96627b0();
        }
    }

    /* renamed from: a0 */
    public boolean mo96626a0(C72996z1 z1Var, String str, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, long j, String str2) {
        C72996z1 z1Var2 = z1Var;
        C70154c cVar = this.f202646Y;
        if (cVar != null) {
            cVar.mo96636j();
        }
        this.f202655f1.removeAll();
        Assert.assertTrue(z1Var2 != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        if (C72996z1.m85829Z5(C75592q0.m90789s()).equals(z1Var.getUsername())) {
            return false;
        }
        this.f202624J = z1Var2;
        this.f202634S = str;
        this.f202625K = z;
        this.f202626L = i;
        this.f202627M = i2;
        this.f202638U = Util.nullAs(Boolean.valueOf(C45628s0.m50743H(z1Var.getUsername())), false);
        this.f202628N = z4;
        this.f202629P = z6;
        this.f202630Q = j;
        this.f202632R = str2;
        this.f202636T = z1Var.mo73975s2() == 1;
        this.f202651b1 = this.f202653d1.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
        this.f202652c1 = this.f202653d1.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        this.f202642W = this.f202653d1.getIntent().getBooleanExtra("Contact_IsLbsChattingProfile", false);
        this.f202644X = this.f202653d1.getIntent().getBooleanExtra("Contact_IsLbsGotoChatting", false);
        this.f202654e1 = this.f202653d1.getIntent().getStringExtra("lbs_ticket");
        if (!C75592q0.m90764L(z1Var.getUsername())) {
            if (!((C44667s4) C97625j3.m125812b().mo105877C()).mo69822qq(z1Var.getUsername())) {
                if (C72996z1.m85798E5(z1Var.getUsername())) {
                    this.f202646Y = new C70183j();
                } else if (C72996z1.m85793A5(z1Var.getUsername())) {
                    this.f202646Y = new C70178f();
                } else if (C45628s0.m50743H(z1Var.getUsername())) {
                    this.f202646Y = new C70182i();
                } else if (C72996z1.m85852w5(z1Var.getUsername())) {
                    this.f202646Y = new C70180h();
                } else if (z1Var.mo62927s3() && !C72996z1.m85811N4(z1Var.getUsername())) {
                    this.f202646Y = new C70172e();
                } else if (z2) {
                    this.f202646Y = new C70186l();
                } else if (z3 || C72996z1.m85811N4(z1Var.getUsername())) {
                    this.f202646Y = new C70169d();
                } else {
                    this.f202646Y = new C70172e();
                }
                mo96625Z();
                return true;
            }
        }
        this.f202646Y = new C70172e();
        mo96625Z();
        return true;
    }

    /* renamed from: b0 */
    public boolean mo96627b0() {
        if (!this.f202651b1 || !this.f202624J.mo62927s3()) {
            this.f202649Z0.setVisibility(8);
            return false;
        }
        this.f202649Z0.setVisibility(0);
        return true;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C72996z1 z1Var;
        if (Util.nullAsNil(str).length() <= 0 || (z1Var = this.f202624J) == null) {
            return;
        }
        if (str.equals(z1Var.getUsername()) || str.equals(this.f202624J.mo73978v2())) {
            this.f202624J = C97625j3.m125812b().mo105907v().get(this.f202624J.getUsername());
            MMHandlerThread.postToMainThread(new C70153b());
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Button button;
        Log.m105918d("MicroMsg.NormalUserFooterPreference", "on bindView " + view.toString());
        this.f202648Z = view.findViewById(C0966R.C0970id.boa);
        this.f202656p0 = (Button) view.findViewById(C0966R.C0970id.f357778bp1);
        this.f202657x0 = (Button) view.findViewById(C0966R.C0970id.bnl);
        this.f202633R0 = (Button) view.findViewById(C0966R.C0970id.f357780bp3);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.bp7);
        this.f202631Q0 = view.findViewById(C0966R.C0970id.bp4);
        this.f202658y0 = (Button) view.findViewById(C0966R.C0970id.f357779bp2);
        this.f202641V0 = (Button) view.findViewById(C0966R.C0970id.bmw);
        this.f202635S0 = view.findViewById(C0966R.C0970id.boi);
        this.f202637T0 = (Button) view.findViewById(C0966R.C0970id.boh);
        this.f202639U0 = (Button) view.findViewById(C0966R.C0970id.boj);
        this.f202643W0 = (Button) view.findViewById(C0966R.C0970id.bok);
        this.f202649Z0 = (Button) view.findViewById(C0966R.C0970id.bo7);
        this.f202645X0 = (Button) view.findViewById(C0966R.C0970id.bp5);
        this.f202647Y0 = (Button) view.findViewById(C0966R.C0970id.bni);
        this.f202650a1 = (TextView) view.findViewById(C0966R.C0970id.bo8);
        this.f202640V = true;
        mo96625Z();
        super.mo1086w(view);
        if (this.f202653d1.getIntent().getBooleanExtra("Accept_NewFriend_FromOutside", false) && (button = this.f202656p0) != null) {
            button.performClick();
        }
    }

    public NormalUserFooterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f202653d1 = (MMActivity) context;
        this.f202640V = false;
        this.f202646Y = null;
    }

    public NormalUserFooterPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f202653d1 = (MMActivity) context;
        this.f202640V = false;
        this.f202646Y = null;
    }
}

package com.tencent.p014mm.p136ui.contact;

import a22.C67001a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.MergeCursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecordMsgNetSceneEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.modelimage.C92809c0;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsSelectChatRoomUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import d62.C75339i;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75589l0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75921a;
import gl3.C75922b;
import gl3.C75973v;
import he0.C76158j;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jr2.C99019x;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nm2.C76927a;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1136n3.C109678b;
import p530fx.C45819c;
import p740wo.C53193b;
import p823sg.C90193h;
import pc0.C100760a0;
import pg3.C47504d;
import pg3.C77084b;
import te3.C50954qg;
import wd3.C78553c1;
import xm3.C78937x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.SelectContactUI */
public class SelectContactUI extends MMBaseSelectContactUI implements C11385n, C7020t0 {

    /* renamed from: H1 */
    public static final /* synthetic */ int f218729H1 = 0;

    /* renamed from: A1 */
    public ObjectAnimator f218730A1 = null;

    /* renamed from: B1 */
    public boolean f218731B1 = false;

    /* renamed from: C */
    public ProgressDialog f218732C;

    /* renamed from: C1 */
    public int f218733C1;

    /* renamed from: D */
    public int f218734D;

    /* renamed from: D1 */
    public HashMap<String, String> f218735D1 = new HashMap<>();

    /* renamed from: E */
    public String f218736E;

    /* renamed from: E1 */
    public HashMap<String, C74427v> f218737E1 = new HashMap<>();

    /* renamed from: F */
    public String f218738F;

    /* renamed from: F1 */
    public C98124g.C98125a f218739F1 = new C74418j();

    /* renamed from: G */
    public TextView f218740G;

    /* renamed from: G1 */
    public C74423s f218741G1 = new C74423s();

    /* renamed from: H */
    public TextView f218742H;

    /* renamed from: I */
    public TextView f218743I;

    /* renamed from: J */
    public TextView f218744J;

    /* renamed from: K */
    public TextView f218745K;

    /* renamed from: L */
    public TextView f218746L;

    /* renamed from: M */
    public TextView f218747M;

    /* renamed from: N */
    public TextView f218748N;

    /* renamed from: P */
    public List<String> f218749P;

    /* renamed from: Q */
    public List<String> f218750Q;

    /* renamed from: Q0 */
    public ImageView f218751Q0;

    /* renamed from: R */
    public List<String> f218752R;

    /* renamed from: R0 */
    public ProgressBar f218753R0;

    /* renamed from: S */
    public Map<String, Integer> f218754S = new HashMap();

    /* renamed from: S0 */
    public TextView f218755S0;

    /* renamed from: T */
    public int f218756T;

    /* renamed from: T0 */
    public Button f218757T0;

    /* renamed from: U */
    public boolean f218758U;

    /* renamed from: U0 */
    public boolean f218759U0;

    /* renamed from: V */
    public String f218760V;

    /* renamed from: V0 */
    public String f218761V0;

    /* renamed from: W */
    public String f218762W;

    /* renamed from: W0 */
    public int f218763W0 = 0;

    /* renamed from: X */
    public int f218764X;

    /* renamed from: X0 */
    public int f218765X0 = 0;

    /* renamed from: Y */
    public KeyboardHeightProvider f218766Y;

    /* renamed from: Y0 */
    public boolean f218767Y0 = true;

    /* renamed from: Z */
    public RelativeLayout f218768Z;

    /* renamed from: Z0 */
    public ArrayList<String> f218769Z0 = null;

    /* renamed from: a1 */
    public long f218770a1 = -1;

    /* renamed from: b1 */
    public boolean f218771b1 = false;

    /* renamed from: c1 */
    public boolean f218772c1 = false;

    /* renamed from: d1 */
    public Pair<Long, Boolean> f218773d1 = new Pair<>(-1L, Boolean.FALSE);

    /* renamed from: e1 */
    public C98121d f218774e1;

    /* renamed from: f1 */
    public boolean f218775f1 = false;

    /* renamed from: g1 */
    public boolean f218776g1 = false;

    /* renamed from: h1 */
    public List<C72963f4> f218777h1 = new ArrayList();

    /* renamed from: i1 */
    public C98121d f218778i1;

    /* renamed from: j1 */
    public boolean f218779j1;

    /* renamed from: k1 */
    public boolean f218780k1;

    /* renamed from: l1 */
    public boolean f218781l1 = true;

    /* renamed from: m1 */
    public boolean f218782m1 = false;

    /* renamed from: n1 */
    public boolean f218783n1 = false;

    /* renamed from: o1 */
    public String f218784o1;

    /* renamed from: p0 */
    public LinearLayout f218785p0;

    /* renamed from: p1 */
    public String f218786p1;

    /* renamed from: q1 */
    public String f218787q1;

    /* renamed from: r1 */
    public String f218788r1 = "";

    /* renamed from: s1 */
    public String f218789s1 = UUID.randomUUID().toString();

    /* renamed from: t1 */
    public long f218790t1 = 0;

    /* renamed from: u1 */
    public int f218791u1;

    /* renamed from: v1 */
    public String f218792v1 = null;

    /* renamed from: w1 */
    public IListener<RecordMsgNetSceneEvent> f218793w1 = new IListener<RecordMsgNetSceneEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1734631819;
        }

        public boolean callback(IEvent iEvent) {
            RecordMsgNetSceneEvent recordMsgNetSceneEvent = (RecordMsgNetSceneEvent) iEvent;
            if (recordMsgNetSceneEvent != null) {
                long j = recordMsgNetSceneEvent.f193874d.f193875a;
                if (j != 0) {
                    Log.m105925i("MicroMsg.SelectContactUI", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", Long.valueOf(j), SelectContactUI.this.f218773d1.first, Boolean.valueOf(recordMsgNetSceneEvent.f193874d.f193876b));
                    if (recordMsgNetSceneEvent.f193874d.f193875a == ((Long) SelectContactUI.this.f218773d1.first).longValue()) {
                        RecordMsgNetSceneEvent.C67771a aVar = recordMsgNetSceneEvent.f193874d;
                        if (aVar.f193876b) {
                            SelectContactUI.this.mo103425A8();
                        } else {
                            SelectContactUI.this.mo103442y8(0, "send record error", aVar.f193877c);
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: x0 */
    public ImageView f218794x0;

    /* renamed from: x1 */
    public C74425t f218795x1 = new C74425t(this, (C744121) null);

    /* renamed from: y0 */
    public ImageView f218796y0;

    /* renamed from: y1 */
    public long f218797y1 = 0;

    /* renamed from: z1 */
    public long f218798z1 = 0;

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$a */
    public class C6857a implements View.OnClickListener {
        public C6857a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClassName(SelectContactUI.this, "com.tencent.mm.ui.contact.GroupCardSelectUI");
            intent.putExtra("group_select_type", false);
            SelectContactUI.this.startActivityForResult(intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$b */
    public class C6858b implements View.OnClickListener {
        public C6858b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!WeChatBrands.Business.Entries.ContactOa.checkAvailable(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("list_attr", 16384);
            C88144b.m109795m(SelectContactUI.this, "brandservice", ".ui.BrandServiceIndexUI", intent, 2);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$c */
    public class C6859c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f24465d;

        /* renamed from: e */
        public final /* synthetic */ int f24466e;

        /* renamed from: f */
        public final /* synthetic */ String f24467f;

        /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$c$a */
        public class C6860a implements DialogInterface.OnClickListener {
            public C6860a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("Select_Contact", C6859c.this.f24467f);
                intent.putExtra("App_MsgId", "fromSns");
                SelectContactUI.this.setResult(-1, intent);
                SelectContactUI.this.finish();
            }
        }

        public C6859c(int i, int i2, String str) {
            this.f24465d = i;
            this.f24466e = i2;
            this.f24467f = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SelectContactUI selectContactUI = SelectContactUI.this;
            C76879j.m92707A(selectContactUI, selectContactUI.getString(this.f24465d, new Object[]{Integer.valueOf(this.f24466e)}), "", SelectContactUI.this.getString(C0966R.string.f7469h3), SelectContactUI.this.getString(C0966R.string.f7926wf), new C6860a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$d */
    public class C6861d implements ValueAnimator.AnimatorUpdateListener {
        public C6861d(SelectContactUI selectContactUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105925i("MicroMsg.SelectContactUI", "onAnimationUpdate %s", Float.valueOf(((Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$l */
    public class C6862l implements MenuItem.OnMenuItemClickListener {
        public C6862l() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectContactUI.this.hideVKB();
            SelectContactUI.this.finish();
            if (!SelectContactUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                MMHandlerThread.postToMainThreadDelayed(SelectContactUI.this.f218795x1, 80);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$o */
    public class C6863o implements View.OnClickListener {
        public C6863o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClassName(SelectContactUI.this, "com.tencent.mm.ui.contact.GroupCardSelectUI");
            intent.putExtra("group_select_type", true);
            boolean d = C74560s1.m89275d(SelectContactUI.this.f218734D, 16384);
            intent.putExtra("group_select_need_result", d);
            if (d) {
                SelectContactUI selectContactUI = SelectContactUI.this;
                if (selectContactUI.f218756T == 14) {
                    intent.putExtra("group_multi_select", true);
                    intent.putExtra("already_select_contact", Util.listToString(SelectContactUI.this.mo103435r8(true), ","));
                    intent.putExtra("max_limit_num", SelectContactUI.this.getIntent().getIntExtra("max_limit_num", 9));
                    SelectContactUI.this.startActivityForResult(intent, 4);
                } else {
                    selectContactUI.startActivityForResult(intent, 0);
                }
            } else {
                SelectContactUI selectContactUI2 = SelectContactUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(selectContactUI2, aVar.mo10232b(), "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                selectContactUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(selectContactUI2, "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$p */
    public class C6864p implements View.OnClickListener {
        public C6864p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.SelectContactUI", "goto select group");
            Intent intent = new Intent(SelectContactUI.this, SnsSelectChatRoomUI.class);
            intent.putExtra("titile", SelectContactUI.this.getString(C0966R.string.f361376mz0));
            intent.putExtra("CONTACT_INFO_UI_SOURCE", SelectContactUI.this.f218791u1);
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("key_filter_associate_chat_room", true);
            SelectContactUI.this.startActivityForResult(intent, 4);
            SelectContactUI.this.f218797y1 = System.currentTimeMillis();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$q */
    public class C6865q implements View.OnClickListener {
        public C6865q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("privacy_from_select_contact_ui", true);
            intent.putExtra("option_button_wording_res_id", C0966R.string.mum);
            intent.setClassName(SelectContactUI.this, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
            SelectContactUI.this.startActivityForResult(intent, 7);
            SelectContactUI.this.f218798z1 = System.currentTimeMillis();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$r */
    public class C6866r implements View.OnClickListener {
        public C6866r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11140, 0);
            C88144b.m109789g(SelectContactUI.this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$e */
    public class C74413e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ List f218800d;

        /* renamed from: e */
        public final /* synthetic */ boolean f218801e;

        public C74413e(List list, boolean z) {
            this.f218800d = list;
            this.f218801e = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectContactUI selectContactUI = SelectContactUI.this;
            List list = this.f218800d;
            boolean z = this.f218801e;
            int i2 = SelectContactUI.f218729H1;
            selectContactUI.f218780k1 = selectContactUI.mo103431n8(list, z);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$f */
    public class C74414f implements DialogInterface.OnClickListener {
        public C74414f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectContactUI.this.f218780k1 = false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$g */
    public class C74415g implements Runnable {
        public C74415g() {
        }

        public void run() {
            SelectContactUI selectContactUI = SelectContactUI.this;
            if (!selectContactUI.f218759U0) {
                return;
            }
            if (selectContactUI.f218765X0 == 0) {
                selectContactUI.f218794x0.setVisibility(8);
                SelectContactUI.this.f218796y0.setVisibility(8);
                SelectContactUI.this.f218753R0.setVisibility(8);
                SelectContactUI.this.f218751Q0.setVisibility(0);
                SelectContactUI selectContactUI2 = SelectContactUI.this;
                selectContactUI2.f218755S0.setTextColor(selectContactUI2.getResources().getColor(C0966R.color.abj));
                SelectContactUI.this.f218755S0.setText(C0966R.string.ijr);
                SelectContactUI selectContactUI3 = SelectContactUI.this;
                selectContactUI3.f218785p0.setBackground(selectContactUI3.getResources().getDrawable(C0966R.C0969drawable.aqc));
            } else if (selectContactUI.f218772c1 || selectContactUI.f218776g1) {
                selectContactUI.f218794x0.setVisibility(8);
                SelectContactUI.this.f218796y0.setVisibility(0);
                SelectContactUI.this.f218753R0.setVisibility(8);
                SelectContactUI.this.f218751Q0.setVisibility(8);
                SelectContactUI selectContactUI4 = SelectContactUI.this;
                selectContactUI4.f218755S0.setTextColor(selectContactUI4.getResources().getColor(C0966R.color.Brand_100));
                SelectContactUI selectContactUI5 = SelectContactUI.this;
                selectContactUI5.f218755S0.setText(selectContactUI5.getString(C0966R.string.f361258ik0, new Object[]{Integer.toString(selectContactUI5.f218765X0)}));
                SelectContactUI selectContactUI6 = SelectContactUI.this;
                selectContactUI6.f218785p0.setBackground(selectContactUI6.getResources().getDrawable(C0966R.C0969drawable.aqd));
            } else if (selectContactUI.f218771b1 || selectContactUI.f218775f1) {
                selectContactUI.f218794x0.setVisibility(8);
                SelectContactUI.this.f218796y0.setVisibility(8);
                SelectContactUI.this.f218753R0.setVisibility(0);
                SelectContactUI.this.f218751Q0.setVisibility(8);
                SelectContactUI selectContactUI7 = SelectContactUI.this;
                selectContactUI7.f218755S0.setTextColor(selectContactUI7.getResources().getColor(C0966R.color.Brand_100));
                SelectContactUI selectContactUI8 = SelectContactUI.this;
                selectContactUI8.f218755S0.setText(selectContactUI8.getString(C0966R.string.f361258ik0, new Object[]{Integer.toString(selectContactUI8.f218765X0)}));
                SelectContactUI selectContactUI9 = SelectContactUI.this;
                selectContactUI9.f218785p0.setBackground(selectContactUI9.getResources().getDrawable(C0966R.C0969drawable.aqd));
            } else {
                selectContactUI.f218794x0.setVisibility(0);
                SelectContactUI.this.f218796y0.setVisibility(8);
                SelectContactUI.this.f218753R0.setVisibility(8);
                SelectContactUI.this.f218751Q0.setVisibility(8);
                SelectContactUI selectContactUI10 = SelectContactUI.this;
                selectContactUI10.f218755S0.setTextColor(selectContactUI10.getResources().getColor(C0966R.color.Brand_100));
                SelectContactUI selectContactUI11 = SelectContactUI.this;
                selectContactUI11.f218755S0.setText(selectContactUI11.getString(C0966R.string.f361258ik0, new Object[]{Integer.toString(selectContactUI11.f218765X0)}));
                SelectContactUI selectContactUI12 = SelectContactUI.this;
                selectContactUI12.f218785p0.setBackground(selectContactUI12.getResources().getDrawable(C0966R.C0969drawable.aqd));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$h */
    public class C74416h extends C47504d {

        /* renamed from: l */
        public final /* synthetic */ C72940a f218805l;

        public C74416h(C72940a aVar) {
            this.f218805l = aVar;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C47504d dVar = (C47504d) bVar;
            SelectContactUI selectContactUI = SelectContactUI.this;
            selectContactUI.f218779j1 = false;
            if (!C74785j2.C6981a.m7247a(selectContactUI, i, i2, str, 4)) {
                if (i == 0 && i2 == 0 && !Util.isNullOrNil(this.f127466h)) {
                    if (this.f218805l.f212612a) {
                        C75589l0.m90737c(this.f127466h, dVar.f127459a, SelectContactUI.this.getString(C0966R.string.b66), false, "");
                    }
                    List<String> list = dVar.f127463e;
                    if (list != null && list.size() > 0) {
                        LinkedList linkedList = new LinkedList();
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            linkedList.add(list.get(i3));
                        }
                        String str2 = "weixin://findfriend/verifycontact/" + this.f127466h + "/";
                        if (this.f218805l.f212612a) {
                            C75589l0.m90737c(this.f127466h, linkedList, SelectContactUI.this.getString(C0966R.string.b67), true, str2);
                        }
                    }
                    SelectContactUI.this.mo103438u8(Util.stringsToList(new String[]{this.f127466h}), false);
                    return;
                }
                SelectContactUI.m88928i8(SelectContactUI.this, i, i2, dVar, str, this.f218805l.f212612a);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$i */
    public class C74417i implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72940a f218807d;

        public C74417i(C72940a aVar) {
            this.f218807d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            SelectContactUI.this.f218779j1 = false;
            this.f218807d.cancel();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$j */
    public class C74418j implements C98124g.C98125a {
        public C74418j() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (i == -21005) {
                Log.m105925i("MicroMsg.SelectContactUI", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                return 0;
            } else if (dVar != null && dVar.field_retCode == 0) {
                C74427v vVar = SelectContactUI.this.f218737E1.get(str);
                if (vVar == null || !vVar.f218823b) {
                    SelectContactUI selectContactUI = SelectContactUI.this;
                    selectContactUI.f218774e1 = dVar;
                    selectContactUI.f218771b1 = false;
                } else {
                    SelectContactUI selectContactUI2 = SelectContactUI.this;
                    selectContactUI2.f218778i1 = dVar;
                    selectContactUI2.f218775f1 = false;
                }
                Log.m105925i("MicroMsg.SelectContactUI", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, Integer.valueOf(i), cVar, dVar, Boolean.valueOf(C86013q1.m106447h(vVar.f218822a)));
                SelectContactUI.this.mo103441x8();
                C76927a a = C76927a.m92781a();
                long a2 = C31543z5.m39451a();
                long j = a.f224808i;
                if (a2 > j) {
                    a.f224800a.f194407s = a2 - j;
                }
                return 0;
            } else if (dVar != null) {
                Log.m105929w("MicroMsg.SelectContactUI", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                SelectContactUI selectContactUI3 = SelectContactUI.this;
                int i2 = dVar.field_retCode;
                int i3 = SelectContactUI.f218729H1;
                selectContactUI3.mo103442y8(i2, "cdn ret error", "");
                return 0;
            } else if (i != 0) {
                Log.m105929w("MicroMsg.SelectContactUI", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                SelectContactUI selectContactUI4 = SelectContactUI.this;
                int i4 = SelectContactUI.f218729H1;
                selectContactUI4.mo103442y8(0, "cdn start error", "");
                return 0;
            } else {
                Log.m105925i("MicroMsg.SelectContactUI", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                if (cVar != null) {
                    Log.m105919d("MicroMsg.SelectContactUI", "cdn process: %f", Double.valueOf(((double) cVar.field_finishedLength) / ((double) cVar.field_toltalLength)));
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$k */
    public class C74419k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f218810d;

        /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$k$a */
        public class C74420a implements DialogInterface.OnClickListener {
            public C74420a(C74419k kVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.SelectContactUI", "initMenu(uploading) click i know");
            }
        }

        public C74419k(String str) {
            this.f218810d = str;
        }

        public void run() {
            C76879j.m92754y(SelectContactUI.this, Util.isNullOrNil(this.f218810d) ? SelectContactUI.this.getString(C0966R.string.hub) : this.f218810d, "", SelectContactUI.this.getString(C0966R.string.lkg), new C74420a(this));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$m */
    public class C74421m implements View.OnClickListener {
        public C74421m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.SelectContactUI", "click selectRecordMsgBt %s", Util.nullAs(SelectContactUI.this.f218761V0, ""));
            SelectContactUI.this.hideVKB();
            Intent putExtra = new Intent().putExtra("Chat_User", SelectContactUI.this.f218761V0).putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_msg_select_introduce", SelectContactUI.this.f218767Y0).putExtra("key_record_select_min_msg_id", SelectContactUI.this.f218770a1).putExtra("key_record_select_msg_num", SelectContactUI.this.f218763W0);
            ArrayList<String> arrayList2 = SelectContactUI.this.f218769Z0;
            if (arrayList2 != null) {
                putExtra.putStringArrayListExtra("key_record_select_msg_black_list", arrayList2);
            }
            C88144b.m109802t(SelectContactUI.this, ".ui.chatting.ChattingUI", putExtra, 6);
            SelectContactUI.this.f218767Y0 = false;
            C76927a.m92781a().f224800a.f194394f = 1;
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$n */
    public class C74422n implements View.OnClickListener {
        public C74422n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.SelectContactUI", "click warn to retry");
            SelectContactUI selectContactUI = SelectContactUI.this;
            selectContactUI.f218774e1 = null;
            selectContactUI.f218778i1 = null;
            selectContactUI.f218772c1 = false;
            selectContactUI.f218776g1 = false;
            selectContactUI.f218771b1 = true;
            selectContactUI.f218775f1 = true;
            selectContactUI.mo103441x8();
            SelectContactUI.this.f218777h1 = new ArrayList(C73313b1.f215414a.f215425a);
            SelectContactUI selectContactUI2 = SelectContactUI.this;
            selectContactUI2.f218773d1 = C73313b1.m86460f(selectContactUI2, "msginfo@fakeuser", true, "msginfo@fakeuser");
            if (!((Boolean) SelectContactUI.this.f218773d1.second).booleanValue()) {
                SelectContactUI.this.f218793w1.alive();
            } else {
                SelectContactUI.this.mo103425A8();
            }
            C76927a.m92781a().f224810k++;
            Pair<Long, Boolean> pair = SelectContactUI.this.f218773d1;
            Log.m105925i("MicroMsg.SelectContactUI", "click warn to retry, msgId:%s direct:%s", pair.first, pair.second);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$s */
    public static class C74423s {

        /* renamed from: a */
        public TextView f218814a;

        /* renamed from: b */
        public AlphaAnimation f218815b;

        /* renamed from: c */
        public AlphaAnimation f218816c;

        /* renamed from: d */
        public boolean f218817d = false;

        /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$s$a */
        public class C74424a implements Animation.AnimationListener {
            public C74424a() {
            }

            public void onAnimationEnd(Animation animation) {
                C74423s.this.f218814a.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: a */
        public void mo103452a(Activity activity, int i, int i2) {
            if (i2 > 0 && i == i2 + 1 && !this.f218817d) {
                if (this.f218814a == null) {
                    this.f218814a = (TextView) activity.findViewById(C0966R.C0970id.j9k);
                }
                if (this.f218814a.getVisibility() != 0) {
                    this.f218814a.setText(C0966R.string.i5f);
                    this.f218814a.setOnClickListener(new C74571u3(this, activity));
                    if (this.f218815b == null) {
                        this.f218815b = new AlphaAnimation(0.0f, 1.0f);
                    }
                    this.f218815b.setDuration(300);
                    AlphaAnimation alphaAnimation = this.f218816c;
                    if (alphaAnimation != null) {
                        alphaAnimation.cancel();
                    }
                    this.f218814a.setVisibility(0);
                    this.f218814a.startAnimation(this.f218815b);
                }
            } else if (i < i2) {
                mo103453b(activity);
                this.f218817d = false;
            }
        }

        /* renamed from: b */
        public final void mo103453b(Activity activity) {
            if (this.f218814a == null) {
                this.f218814a = (TextView) activity.findViewById(C0966R.C0970id.j9k);
            }
            if (this.f218814a.getVisibility() != 8) {
                if (this.f218816c == null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    this.f218816c = alphaAnimation;
                    alphaAnimation.setAnimationListener(new C74424a());
                }
                this.f218816c.setDuration(300);
                AlphaAnimation alphaAnimation2 = this.f218815b;
                if (alphaAnimation2 != null) {
                    alphaAnimation2.cancel();
                }
                this.f218814a.startAnimation(this.f218816c);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$t */
    public static class C74425t implements Runnable {

        /* renamed from: d */
        public WeakReference<SelectContactUI> f218819d;

        public C74425t(SelectContactUI selectContactUI, C744121 r2) {
            this.f218819d = new WeakReference<>(selectContactUI);
        }

        public void run() {
            SelectContactUI selectContactUI = this.f218819d.get();
            if (selectContactUI != null) {
                selectContactUI.moveTaskToBack(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$u */
    public static class C74426u implements Runnable {

        /* renamed from: d */
        public WeakReference<SelectContactUI> f218820d;

        /* renamed from: e */
        public ArrayList<String> f218821e;

        public C74426u(SelectContactUI selectContactUI, ArrayList arrayList, C744121 r3) {
            this.f218820d = new WeakReference<>(selectContactUI);
            this.f218821e = arrayList;
        }

        public void run() {
            SelectContactUI selectContactUI = this.f218820d.get();
            if (selectContactUI != null) {
                String s = C75592q0.m90789s();
                Iterator<String> it = this.f218821e.iterator();
                String str = null;
                int i = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Log.m105919d("MicroMsg.SelectContactUI", "toSend, %s", next);
                    i += C72996z1.m85820U5(next) ? 1 : 0;
                    C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                    b.f295195i = 4;
                    b.f295188b = s;
                    b.f295187a = next;
                    b.f295196j = selectContactUI.getIntent().getStringExtra("shareImagePath");
                    b.f295197k = 0;
                    b.f295198l = null;
                    b.f295200n = 0;
                    b.f295204r = "";
                    b.f295202p = true;
                    b.f295201o = C0966R.C0969drawable.by8;
                    b.f295205s = str;
                    b.f295194h = 11;
                    C100760a0.C89338b a = b.mo140195a();
                    a.mo123694a();
                    C92809c0 c0Var = (C92809c0) a.f257313a;
                    if (c0Var.getMsg() != null) {
                        str = c0Var.getMsg().mo108765s2();
                    }
                }
                selectContactUI.f218732C.dismiss();
                Intent intent = new Intent();
                intent.putStringArrayListExtra("Select_Contact", this.f218821e);
                selectContactUI.setResult(-1, intent);
                C115669n.INSTANCE.mo160131h(11048, 1, Integer.valueOf(this.f218821e.size() - i), Integer.valueOf(i));
                selectContactUI.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactUI$v */
    public class C74427v {

        /* renamed from: a */
        public String f218822a;

        /* renamed from: b */
        public boolean f218823b;

        public C74427v(SelectContactUI selectContactUI, String str, String str2, boolean z) {
            this.f218822a = str2;
            this.f218823b = z;
        }
    }

    /* renamed from: g8 */
    public static boolean m88927g8(SelectContactUI selectContactUI) {
        boolean z;
        ArrayList<String> p8 = selectContactUI.mo103433p8(C74560s1.m89275d(selectContactUI.f218734D, 8192));
        p8.remove(C75592q0.m90789s());
        if (C74560s1.m89275d(selectContactUI.f218734D, 4096) && p8.size() > 1) {
            if (!selectContactUI.f218779j1) {
                selectContactUI.f218779j1 = true;
                Class cls = C45819c.class;
                ArrayList<String> p84 = selectContactUI.mo103433p8(false);
                p84.remove(C75592q0.m90789s());
                if (p84.size() == 1) {
                    selectContactUI.f218779j1 = false;
                    selectContactUI.finish();
                    selectContactUI.startActivity(ChattingUI.class, new Intent().putExtra("Chat_User", p84.get(0)));
                } else {
                    boolean z2 = (!BuildInfo.DEBUG || ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_OPEN_IM_CREATE_ROOM_LOCAL_SWITCH_INT, 1)).intValue() != 0) && ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                    if (!z2) {
                        Iterator<String> it = p84.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C72996z1.m85843n5(it.next())) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z2 || z) {
                            selectContactUI.mo103430m8(((C45819c) C86312j.m106911c(cls)).mo71192mK("@chatroom").mo71494e("", p84));
                        } else if (!C74560s1.m89277f()) {
                            C76879j.m92749t(selectContactUI, selectContactUI.getString(C0966R.string.j6k), "", (DialogInterface.OnClickListener) null);
                            selectContactUI.f218779j1 = false;
                        } else {
                            selectContactUI.f218779j1 = false;
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_OPENIM_SELECT_ALERT_ID_BOOLEAN, false);
                            selectContactUI.f218779j1 = true;
                            selectContactUI.mo103430m8(((C45819c) C86312j.m106911c(cls)).mo71192mK("@im.chatroom").mo71494e("", p84));
                        }
                    }
                    z = true;
                    if (!z2) {
                    }
                    selectContactUI.mo103430m8(((C45819c) C86312j.m106911c(cls)).mo71192mK("@chatroom").mo71494e("", p84));
                }
            }
            Log.m105924i("MicroMsg.SelectContactUI", "Create the chatroom");
            return true;
        }
        ArrayList<String> r8 = selectContactUI.mo103435r8(C74560s1.m89275d(selectContactUI.f218734D, 8192));
        C76927a a = C76927a.m92781a();
        a.f224800a.f194395g = (long) r8.size();
        ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a.f224800a;
        shareRoomHistoryStatStruct.f194408t = shareRoomHistoryStatStruct.mo86045b("InvitedUsrs", Util.listToString(r8, ";"), true);
        return selectContactUI.mo103438u8(r8, true);
    }

    /* renamed from: i8 */
    public static void m88928i8(SelectContactUI selectContactUI, int i, int i2, C47504d dVar, String str, boolean z) {
        String str2;
        boolean z2;
        SelectContactUI selectContactUI2 = selectContactUI;
        C47504d dVar2 = dVar;
        selectContactUI.getClass();
        String string = MMApplicationContext.getContext().getString(C0966R.string.b68);
        String str3 = "";
        if (!z) {
            if (dVar2 != null && !Util.isNullOrNil(dVar2.f127467i)) {
                C76879j.m92748s(selectContactUI2, dVar2.f127467i, str3);
                return;
            } else if (!z && !Util.isNullOrNil(str)) {
                C76879j.m92748s(selectContactUI2, str, str3);
                return;
            }
        }
        if (i2 == -23) {
            str2 = selectContactUI2.getString(C0966R.string.i7n);
            str3 = selectContactUI2.getString(C0966R.string.i7m);
        } else {
            str2 = str3;
        }
        List<String> list = dVar2.f127463e;
        List<String> list2 = dVar2.f127461c;
        if (list == null || list.size() <= 0 || (list.size() != dVar2.f127465g && (list2 == null || list2.size() <= 0 || dVar.mo72507b() != list.size() + list2.size()))) {
            List<String> list3 = dVar2.f127461c;
            if (list3 != null && list3.size() > 0 && dVar2.f127465g == list3.size()) {
                str2 = selectContactUI2.getString(C0966R.string.f360942g51);
                str3 = str3 + selectContactUI2.getString(C0966R.string.eyw, new Object[]{Util.listToString(selectContactUI2.mo103426B8(list3), string)});
            }
            List<String> list4 = dVar2.f127460b;
            if (list4 != null && list4.size() > 0) {
                Iterator<String> it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C72996z1.m85843n5(it.next())) {
                            str2 = selectContactUI2.getString(C0966R.string.f360942g51);
                            str3 = selectContactUI2.getString(C0966R.string.f360943g52);
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    str2 = selectContactUI2.getString(C0966R.string.f360942g51);
                    str3 = str3 + selectContactUI2.getString(C0966R.string.eyz, new Object[]{Util.listToString(selectContactUI2.mo103426B8(list4), string)});
                }
            }
            if (str2 == null || str2.length() <= 0) {
                Toast.makeText(selectContactUI2, selectContactUI2.getString(C0966R.string.eyg, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            } else {
                C76879j.m92748s(selectContactUI2, str3, str2);
            }
        } else {
            LinkedList linkedList = new LinkedList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                linkedList.add(list.get(i3));
            }
            Assert.assertTrue(linkedList.size() > 0);
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.b68);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(list2);
            C76879j.m92709C(selectContactUI, selectContactUI2.getString(C0966R.string.ez8, new Object[]{Util.listToString(selectContactUI2.mo103426B8(arrayList), string2)}), selectContactUI2.getString(C0966R.string.f360942g51), selectContactUI2.getString(C0966R.string.ez7), selectContactUI2.getString(C0966R.string.ez6), true, new C74557r3(selectContactUI2, linkedList), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: j8 */
    public static void m88929j8(SelectContactUI selectContactUI, LinkedList linkedList) {
        selectContactUI.getClass();
        Assert.assertTrue(linkedList.size() > 0);
        LinkedList linkedList2 = new LinkedList();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList2.add(3);
        }
        new C78553c1(selectContactUI, new C74561s3(selectContactUI)).mo108531g(linkedList, linkedList2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* renamed from: A8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103425A8() {
        /*
            r12 = this;
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            java.lang.String r1 = "MicroMsg.SelectContactUI"
            java.lang.String r2 = "uploadRecordXml"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r2 = "uploadRecordXmlImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            android.util.Pair<java.lang.Long, java.lang.Boolean> r3 = r12.f218773d1
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r3)
            java.lang.String r3 = r2.getContent()
            java.lang.String r4 = ""
            java.lang.String r5 = "add to cdn failed"
            r6 = 1
            java.lang.String r7 = "wcf://selectrecord/uploadcache/"
            r8 = 0
            r9 = 0
            if (r3 != 0) goto L_0x0040
            java.lang.String r2 = "uploadRecordXmlImp msgInfo.getContent() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x00ce
        L_0x0040:
            java.lang.String r2 = r2.getContent()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0051
            java.lang.String r2 = "xml is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x0097
        L_0x0051:
            c62.C0419f.Bx0()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r3 != 0) goto L_0x005d
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x005d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r3.<init>()     // Catch:{ Exception -> 0x0091 }
            r3.append(r7)     // Catch:{ Exception -> 0x0091 }
            byte[] r10 = r2.getBytes()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)     // Catch:{ Exception -> 0x0091 }
            r3.append(r10)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0091 }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x0091 }
            if (r10 == 0) goto L_0x007d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x0091 }
        L_0x007d:
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0091 }
            com.tencent.p014mm.vfs.C86013q1.m106437S(r3, r2)     // Catch:{ Exception -> 0x0091 }
            nm2.a r2 = nm2.C76927a.m92781a()     // Catch:{ Exception -> 0x0091 }
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x0091 }
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r2 = r2.f224800a     // Catch:{ Exception -> 0x0091 }
            r2.f194411w = r10     // Catch:{ Exception -> 0x0091 }
            goto L_0x0098
        L_0x0091:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x0097:
            r3 = r9
        L_0x0098:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = "uploadRecordXmlImp filePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x00ce
        L_0x00a5:
            gi.g r2 = r12.mo103436s8(r3, r8)
            di3.d r10 = di3.C86312j.m106911c(r0)
            qo.l r10 = (p663qo.C101213l) r10
            boolean r10 = r10.if0(r2)
            if (r10 != 0) goto L_0x00c4
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r2 = r2.field_mediaId
            r10[r8] = r2
            java.lang.String r2 = "uploadRecordXmlImp: cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r10)
            r12.mo103442y8(r8, r5, r4)
        L_0x00c4:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r8] = r3
            java.lang.String r3 = "uploadRecordXmlImp filePath：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
        L_0x00ce:
            java.lang.String r2 = "uploadRecordXmlNewImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            nm2.b r2 = nm2.C76928b.f224816a
            java.util.List<com.tencent.mm.storage.f4> r3 = r12.f218777h1
            te3.cs r2 = r2.mo107265c(r3)
            if (r2 != 0) goto L_0x00e6
            java.lang.String r0 = "uploadRecordXmlNewImp historyMsgList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0173
        L_0x00e6:
            java.util.LinkedList<te3.j3> r3 = r2.f131925d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00f6
            java.lang.String r0 = "uploadRecordXmlNewImp historyMsgList.msgList.isEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0173
        L_0x00f6:
            c62.C0419f.Bx0()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r3 != 0) goto L_0x0102
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x0102:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0137 }
            r3.<init>()     // Catch:{ Exception -> 0x0137 }
            r3.append(r7)     // Catch:{ Exception -> 0x0137 }
            byte[] r7 = r2.toByteArray()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ Exception -> 0x0137 }
            r3.append(r7)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0137 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x0137 }
            if (r7 == 0) goto L_0x0122
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x0137 }
        L_0x0122:
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0137 }
            com.tencent.p014mm.vfs.C86013q1.m106437S(r3, r2)     // Catch:{ Exception -> 0x0137 }
            nm2.a r2 = nm2.C76927a.m92781a()     // Catch:{ Exception -> 0x0137 }
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x0137 }
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r2 = r2.f224800a     // Catch:{ Exception -> 0x0137 }
            r2.f194411w = r10     // Catch:{ Exception -> 0x0137 }
            r9 = r3
            goto L_0x013d
        L_0x0137:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x013d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 == 0) goto L_0x014a
            java.lang.String r0 = "uploadRecordXmlNewImp filePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0173
        L_0x014a:
            gi.g r2 = r12.mo103436s8(r9, r6)
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r2)
            if (r0 != 0) goto L_0x0169
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = r2.field_mediaId
            r0[r8] = r2
            java.lang.String r2 = "uploadRecordXmlNewImp: cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r12.mo103442y8(r8, r5, r4)
        L_0x0169:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r9
            java.lang.String r2 = "uploadRecordXmlNewImp filePath：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SelectContactUI.mo103425A8():void");
    }

    /* renamed from: B8 */
    public final List<String> mo103426B8(List<String> list) {
        LinkedList linkedList = new LinkedList();
        if (!C97625j3.m125811a() || list == null) {
            return linkedList;
        }
        for (String next : list) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(next);
            if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                next = z1Var.mo62898f();
            }
            linkedList.add(next);
        }
        return linkedList;
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        if (!bVar.mo106184e() || !(bVar instanceof C75921a)) {
            return false;
        }
        C75921a aVar = (C75921a) bVar;
        if (aVar.f222600A == null) {
            return false;
        }
        if (C74560s1.m89275d(this.f218734D, 536870912)) {
            return aVar.f222600A.mo62846A3();
        }
        return ((LinkedList) this.f218750Q).contains(aVar.f222600A.getUsername());
    }

    /* renamed from: L7 */
    public synchronized C74526m1 mo64513L7() {
        C74572v vVar;
        vVar = new C74572v();
        vVar.f219205b = C74560s1.m89275d(this.f218734D, 16);
        vVar.f219204a = C74560s1.m89275d(this.f218734D, 32);
        vVar.f219208e = getIntent().getBooleanExtra("create_group_recommend", false);
        vVar.f219206c = !C74560s1.m89275d(this.f218734D, 4);
        vVar.f219207d = !C74560s1.m89275d(this.f218734D, 1);
        vVar.f219209f = C74560s1.m89275d(this.f218734D, 128);
        vVar.f219210g = C74560s1.m89275d(this.f218734D, 1048576);
        boolean d = C74560s1.m89275d(this.f218734D, 256);
        vVar.f219215l = d;
        if (d) {
            vVar.f219216m = getIntent().getStringExtra("custom_contact");
        }
        if (vVar.f219209f) {
            this.f218783n1 = true;
            vVar.f219212i = getIntent().getStringExtra("wechat_sport_contact");
            vVar.f219213j = getIntent().getStringExtra("wechat_sport_recent_like");
            this.f218784o1 = vVar.f219212i;
        }
        if (C74560s1.m89277f()) {
            vVar.f219214k = "@all.contact.without.chatroom.without.openim";
        } else {
            vVar.f219214k = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        int i = this.f218604A;
        if (i == 6 || i == 5) {
            vVar.f219214k = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        if (getIntent().getBooleanExtra("KBlockOpenImFav", false)) {
            vVar.f219214k = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        return new C74568u(this, this.f218750Q, this.f218752R, this.f218749P, C74560s1.m89275d(this.f218734D, 1), C74560s1.m89275d(this.f218734D, 64), vVar, this.f218756T == 15, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false));
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        if (this.f218783n1) {
            return new C74554r1(this, this.f218749P, C74560s1.m89275d(this.f218734D, 64), this.f218784o1);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            return new C74469c2(this, this.f218750Q, this.f218752R, this.f218749P, C74560s1.m89275d(this.f218734D, 64), this.f218604A);
        }
        return new C74551q1((MMBaseSelectContactUI) this, this.f218749P, C74560s1.m89275d(this.f218734D, 64), this.f218604A, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false) ? 1 : 0);
    }

    /* renamed from: N7 */
    public C74502i1 mo103379N7() {
        C74502i1 N7 = super.mo103379N7();
        if (N7 != null) {
            return N7;
        }
        C74526m1 L7 = mo64513L7();
        this.f218607f = L7;
        this.f218605d.setAdapter(L7);
        Log.m105924i("MicroMsg.SelectContactUI", "getAdapter is null");
        return L7;
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(131072);
        if (!getIntent().getBooleanExtra("without_openim", false)) {
            arrayList.add(131081);
        }
        if (!C74560s1.m89275d(this.f218734D, 1)) {
            arrayList.add(Integer.valueOf(StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON));
        }
        if (!C74560s1.m89275d(this.f218734D, 4)) {
            arrayList.add(131075);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MicroMsg.SelectContactUI", "height:%s", Integer.valueOf(i));
        ObjectAnimator objectAnimator = this.f218730A1;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f218730A1.cancel();
        }
        if (i > 0) {
            if (this.f218768Z.getTranslationY() != 0.0f) {
                this.f218768Z.setTranslationY(0.0f);
            }
            this.f218730A1 = ObjectAnimator.ofFloat(this.f218768Z, "translationY", new float[]{0.0f, (float) (-i)});
        } else {
            RelativeLayout relativeLayout = this.f218768Z;
            this.f218730A1 = ObjectAnimator.ofFloat(relativeLayout, "translationY", new float[]{relativeLayout.getTranslationY(), 0.0f});
        }
        this.f218730A1.setDuration(200);
        this.f218730A1.setInterpolator(new C109678b());
        this.f218730A1.addUpdateListener(new C6861d(this));
        this.f218730A1.start();
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return this.f218736E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r13 = (gl3.C75921a) r11;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r11, android.view.View r12, int r13, long r14) {
        /*
            r10 = this;
            android.widget.ListView r11 = r10.f218605d
            int r11 = r11.getHeaderViewsCount()
            int r11 = r13 - r11
            java.lang.String r12 = "MicroMsg.SelectContactUI"
            r14 = 1
            r15 = 0
            if (r11 >= 0) goto L_0x0023
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r15] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r0[r14] = r11
            java.lang.String r11 = "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r11, r0)
            return
        L_0x0023:
            com.tencent.mm.ui.contact.i1 r13 = r10.mo103379N7()
            gl3.b r11 = r13.getItem(r11)
            if (r11 != 0) goto L_0x002e
            return
        L_0x002e:
            boolean r13 = r11 instanceof gl3.C75973v
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x005d
            int r11 = r10.f218734D
            r13 = 16384(0x4000, float:2.2959E-41)
            boolean r11 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r11, r13)
            if (r11 == 0) goto L_0x005c
            java.lang.String r11 = "handleClickNonSelect, return the result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r12 = "Select_Contact"
            r11.putExtra(r12, r0)
            java.lang.String r13 = "Select_Conv_User"
            r11.putExtra(r13, r0)
            r11.putExtra(r12, r0)
            r12 = -1
            r10.setResult(r12, r11)
            r10.finish()
        L_0x005c:
            return
        L_0x005d:
            boolean r13 = r11 instanceof gl3.C75921a
            if (r13 != 0) goto L_0x0062
            return
        L_0x0062:
            r13 = r11
            gl3.a r13 = (gl3.C75921a) r13
            com.tencent.mm.storage.z1 r1 = r13.f222600A
            if (r1 != 0) goto L_0x006a
            return
        L_0x006a:
            int r1 = r1.mo73975s2()
            if (r1 != r14) goto L_0x0071
            return
        L_0x0071:
            com.tencent.mm.storage.z1 r13 = r13.f222600A
            java.lang.String r13 = r13.getUsername()
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r15] = r13
            java.lang.String r2 = "ClickUser=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            int r12 = r10.f218734D
            r1 = 64
            boolean r12 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r12, r1)
            if (r12 == 0) goto L_0x017e
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r12 == 0) goto L_0x00eb
            android.content.Intent r12 = r10.getIntent()
            java.lang.String r1 = "create_group_recommend"
            boolean r12 = r12.getBooleanExtra(r1, r15)
            if (r12 == 0) goto L_0x00eb
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.chatting.ChattingUI> r1 = com.tencent.p014mm.p136ui.chatting.ChattingUI.class
            r12.<init>(r10, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r12.addFlags(r1)
            java.lang.String r1 = "Chat_User"
            r12.putExtra(r1, r13)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r12)
            java.lang.Object[] r3 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/contact/SelectContactUI"
            java.lang.String r5 = "handleItemClick"
            java.lang.String r6 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r1.mo10231a(r15)
            android.content.Intent r12 = (android.content.Intent) r12
            r10.startActivity(r12)
            java.lang.String r2 = "com/tencent/mm/ui/contact/SelectContactUI"
            java.lang.String r3 = "handleItemClick"
            java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r10
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r10.finish()
            r12 = 3
            r10.mo103439v8(r12)
        L_0x00eb:
            int r12 = r10.f218734D
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r12 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r12, r1)
            if (r12 == 0) goto L_0x0168
            java.util.List<java.lang.String> r12 = r10.f218752R
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            int r12 = r12.size()
            android.content.Intent r1 = r10.getIntent()
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r3 = "max_limit_num"
            int r1 = r1.getIntExtra(r3, r2)
            if (r12 < r1) goto L_0x0168
            java.util.List<java.lang.String> r11 = r10.f218750Q
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x0117
            goto L_0x016d
        L_0x0117:
            r10.mo103378K7()
            java.util.List<java.lang.String> r11 = r10.f218752R
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x0131
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r11 = r10.f218609h
            r11.mo100244d(r13)
            java.util.List<java.lang.String> r11 = r10.f218752R
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            r11.remove(r13)
            goto L_0x016d
        L_0x0131:
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r12 = "too_many_member_tip_string"
            java.lang.String r11 = r11.getStringExtra(r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 == 0) goto L_0x015b
            r11 = 2131835519(0x7f113a7f, float:1.9304179E38)
            java.lang.Object[] r12 = new java.lang.Object[r14]
            android.content.Intent r13 = r10.getIntent()
            r14 = 10
            int r13 = r13.getIntExtra(r3, r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r15] = r13
            java.lang.String r11 = r10.getString(r11, r12)
        L_0x015b:
            androidx.appcompat.app.AppCompatActivity r12 = r10.getContext()
            com.tencent.mm.ui.contact.q3 r13 = new com.tencent.mm.ui.contact.q3
            r13.<init>(r10)
            nj3.C76879j.m92749t(r12, r11, r0, r13)
            goto L_0x016d
        L_0x0168:
            java.lang.String r11 = r11.f222619p
            r10.mo103440w8(r13, r11)
        L_0x016d:
            r10.mo103443z8()
            r10.mo103429l8()
            r10.mo103434q8()
            com.tencent.mm.ui.contact.m1 r11 = r10.mo103434q8()
            r11.notifyDataSetChanged()
            goto L_0x0189
        L_0x017e:
            java.lang.String[] r11 = new java.lang.String[r14]
            r11[r15] = r13
            java.util.ArrayList r11 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r11)
            r10.mo103437t8(r11)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SelectContactUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        Intent intent = getIntent();
        C74560s1.m89276e();
        this.f218734D = intent.getIntExtra("list_attr", C74560s1.f219160a);
        this.f218736E = getIntent().getStringExtra("titile");
        this.f218738F = getIntent().getStringExtra("sub_title");
        this.f218756T = getIntent().getIntExtra("list_type", -1);
        this.f218781l1 = getIntent().getBooleanExtra("show_too_many_member", true);
        this.f218786p1 = getIntent().getStringExtra("label_source");
        if (C74560s1.m89275d(this.f218734D, 256)) {
            ((ArrayList) C45628s0.m50778i()).size();
        }
        this.f218758U = getIntent().getBooleanExtra("Add_SendCard", false);
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_friends", false);
        if (this.f218758U || booleanExtra) {
            this.f218760V = Util.nullAs(getIntent().getStringExtra("be_send_card_name"), "");
            this.f218762W = Util.nullAs(getIntent().getStringExtra("received_card_name"), "");
        }
        getIntent().getBooleanExtra("Forbid_SelectChatRoom", false);
        this.f218759U0 = getIntent().getBooleanExtra("is_select_record_msg_mode", false);
        this.f218764X = getIntent().getIntExtra("menu_mode", 1);
        String stringExtra = getIntent().getStringExtra("chatroomName");
        this.f218761V0 = stringExtra;
        Log.m105925i("MicroMsg.SelectContactUI", "mRoomId：%s", Util.nullAs(stringExtra, ""));
        this.f218749P = new ArrayList();
        this.f218752R = new LinkedList();
        this.f218750Q = new LinkedList();
        String stringExtra2 = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra2)) {
            ((LinkedList) this.f218750Q).addAll(Util.stringsToList(stringExtra2.split(",")));
        }
        String stringExtra3 = getIntent().getStringExtra("already_select_contact");
        if (!Util.isNullOrNil(stringExtra3)) {
            ((LinkedList) this.f218752R).addAll(Util.stringsToList(stringExtra3.split(",")));
        }
        HashSet hashSet = new HashSet();
        String stringExtra4 = getIntent().getStringExtra("block_contact");
        if (!Util.isNullOrNil(stringExtra4)) {
            hashSet.addAll(Util.stringsToList(stringExtra4.split(",")));
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet2.addAll(C74560s1.m89273b());
        hashSet2.addAll(C45628s0.m50776h());
        if (!C74560s1.m89275d(this.f218734D, 268435456)) {
            hashSet2.add(C75592q0.m90789s());
        }
        if (this.f218758U) {
            hashSet2.removeAll(C74560s1.m89273b());
        }
        ((ArrayList) this.f218749P).addAll(C72996z1.m85797E4());
        ((ArrayList) this.f218749P).addAll(hashSet2);
        mo103429l8();
        this.f218788r1 = "SelectContactUI-" + this.f218756T;
        this.f218791u1 = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f218792v1 = getIntent().getStringExtra("menu_label");
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: X7 */
    public boolean mo103383X7() {
        return !this.f218783n1;
    }

    /* renamed from: a */
    public final void mo103427a(String str) {
        if (this.f218764X == 1) {
            updateOptionMenuText(1, str);
        } else {
            this.f218757T0.setText(str);
        }
    }

    /* renamed from: a8 */
    public void mo96068a8(String str) {
        C115669n.INSTANCE.mo160131h(11225, 1, 0);
        Intent intent = new Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        HashSet hashSet = new HashSet();
        hashSet.addAll(mo103435r8(C74560s1.m89275d(this.f218734D, 8192)));
        hashSet.addAll(this.f218750Q);
        intent.putExtra("always_select_contact", Util.listToString(new ArrayList(hashSet), ","));
        intent.putExtra("always_select_contact", Util.listToString(new ArrayList(hashSet), ","));
        intent.putExtra("block_contact", getIntent().getStringExtra("block_contact"));
        if (C74560s1.m89275d(this.f218734D, 64)) {
            intent.putExtra("list_attr", C74560s1.m89278g(16384, 64, 131072));
            if (this.f218756T == 14) {
                intent.putExtra("max_limit_num", getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
            }
        } else {
            intent.putExtra("list_attr", 16384);
        }
        startActivityForResult(intent, 3);
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
        TextView textView;
        TextView textView2;
        int i2;
        String str;
        if (C74560s1.m89275d(this.f218734D, 256)) {
            if (this.f218740G == null) {
                this.f218740G = mo103428k8(listView, new C6863o(), getString(this.f218756T == 14 ? C0966R.string.f7487hl : C0966R.string.f7467h1));
            }
            this.f218740G.setVisibility(i);
        }
        if (C74560s1.m89275d(this.f218734D, TPMediaCodecProfileLevel.HEVCHighTierLevel62)) {
            if (this.f218747M == null) {
                this.f218747M = mo103428k8(listView, new C6864p(), getString(C0966R.string.f361376mz0));
            }
            this.f218747M.setVisibility(i);
        }
        if (C74560s1.m89275d(this.f218734D, 67108864)) {
            if (this.f218748N == null) {
                this.f218748N = mo103428k8(listView, new C6865q(), getString(C0966R.string.myz));
            }
            this.f218748N.setVisibility(i);
        }
        if (C74560s1.m89275d(this.f218734D, 512)) {
            if (this.f218742H == null) {
                this.f218742H = mo103428k8(listView, new C6866r(), getString(C0966R.string.cw_));
            }
            this.f218742H.setVisibility(i);
        }
        if (C74560s1.m89275d(this.f218734D, 1024)) {
            if (this.f218743I == null) {
                this.f218743I = mo103428k8(listView, new C6857a(), getString(C0966R.string.f7468h2));
            }
            this.f218743I.setVisibility(i);
        }
        if (C74560s1.m89275d(this.f218734D, 2048)) {
            if (this.f218745K == null) {
                this.f218745K = mo103428k8(listView, new C6858b(), getString(C0966R.string.f7482hf));
            }
            this.f218745K.setVisibility(i);
            TextView textView3 = this.f218745K;
            textView3.setTextSize(C76577a.m92165p(textView3.getContext()) * 16.0f);
        }
        if (C74560s1.m89275d(this.f218734D, 524288)) {
            if (this.f218744J == null) {
                int intExtra = getIntent().getIntExtra("topstory_import_type", 0);
                int i3 = C0966R.string.f7473h7;
                int i4 = C0966R.string.f7472h6;
                if (intExtra == 1) {
                    List<String> Ow = ((C11766m0) C99019x.m128974f()).mo11651Ow(5);
                    i2 = Util.isNullOrNil((List) Ow) ? 0 : Ow.size();
                    str = Util.listToString(Ow, ",");
                } else if (intExtra == 2) {
                    List<String> b = ContactBlackListHelper.m6943b();
                    i2 = Util.isNullOrNil((List) b) ? 0 : ((ArrayList) b).size();
                    str = Util.listToString(b, ",");
                    i4 = C0966R.string.f7470h4;
                    i3 = C0966R.string.f7471h5;
                } else {
                    str = "";
                    i2 = 0;
                }
                TextView k8 = mo103428k8(listView, new C6859c(i3, i2, str), getString(i4));
                this.f218744J = k8;
                k8.setTag(Integer.valueOf(i2));
            }
            Object tag = this.f218744J.getTag();
            if (!(tag instanceof Integer) || ((Integer) tag).intValue() <= 0) {
                this.f218744J.setVisibility(8);
            } else {
                this.f218744J.setVisibility(i);
            }
        }
        if (C74560s1.m89275d(this.f218734D, TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
            if (this.f218746L == null) {
                List<String> q4 = C97625j3.m125812b().mo105907v().mo69722q4();
                Log.m105925i("MicroMsg.SelectContactUI", "setOpenIMHeaderView %s", Integer.valueOf(q4.size()));
                if (q4.size() != 0) {
                    this.f218746L = mo103428k8(listView, new C6892l3(this), "");
                    String Rn0 = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0("3552365301", "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING);
                    this.f218746L.setVisibility(i);
                    this.f218746L.setText(Rn0);
                }
            }
            TextView textView4 = this.f218746L;
            if (textView4 != null) {
                textView4.setVisibility(i);
            }
        }
        if (C74560s1.m89275d(this.f218734D, TPMediaCodecProfileLevel.HEVCMainTierLevel62) && (textView2 = this.f218746L) != null) {
            textView2.setBackgroundResource(C0966R.C0969drawable.f4859pe);
        } else if (C74560s1.m89275d(this.f218734D, 2048)) {
            TextView textView5 = this.f218745K;
            if (textView5 != null) {
                textView5.setBackgroundResource(C0966R.C0969drawable.f4859pe);
            }
        } else if (C74560s1.m89275d(this.f218734D, 1024)) {
            TextView textView6 = this.f218743I;
            if (textView6 != null) {
                textView6.setBackgroundResource(C0966R.C0969drawable.f4859pe);
            }
        } else if (C74560s1.m89275d(this.f218734D, 512)) {
            TextView textView7 = this.f218742H;
            if (textView7 != null) {
                textView7.setBackgroundResource(C0966R.C0969drawable.f4859pe);
            }
        } else if (C74560s1.m89275d(this.f218734D, 256) && (textView = this.f218740G) != null) {
            textView.setBackgroundResource(C0966R.C0969drawable.f4859pe);
        }
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            ((LinkedList) this.f218752R).remove(str);
            if (mo103379N7() instanceof C74469c2) {
                this.f218609h.getInputText().setText(((C74469c2) mo103379N7()).mo103535w());
            } else if (mo103379N7() instanceof C74568u) {
                mo103434q8().mo7853r();
            } else {
                mo103379N7().notifyDataSetChanged();
            }
            mo103443z8();
        }
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.j9m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r7 = this;
            super.initView()
            r0 = 2131313114(0x7f0941da, float:1.8244616E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r7.f218768Z = r0
            r0 = 2131313113(0x7f0941d9, float:1.8244614E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f218785p0 = r0
            r0 = 2131304904(0x7f0921c8, float:1.8227964E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f218757T0 = r0
            r0 = 2131313116(0x7f0941dc, float:1.824462E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f218794x0 = r0
            r0 = 2131313118(0x7f0941de, float:1.8244624E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f218796y0 = r0
            r0 = 2131313115(0x7f0941db, float:1.8244618E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f218751Q0 = r0
            r0 = 2131311995(0x7f093d7b, float:1.8242346E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r7.f218753R0 = r0
            r0 = 2131313117(0x7f0941dd, float:1.8244622E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f218755S0 = r0
            android.widget.LinearLayout r0 = r7.f218785p0
            com.tencent.mm.ui.contact.SelectContactUI$m r1 = new com.tencent.mm.ui.contact.SelectContactUI$m
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r7.f218796y0
            com.tencent.mm.ui.contact.SelectContactUI$n r1 = new com.tencent.mm.ui.contact.SelectContactUI$n
            r1.<init>()
            r0.setOnClickListener(r1)
            nm2.a r0 = new nm2.a
            r0.<init>()
            nm2.C76927a.f224799q = r0
            nm2.a r0 = nm2.C76927a.m92781a()
            java.lang.String r1 = r7.f218761V0
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r2 = r0.f224800a
            java.lang.String r3 = "RoomId"
            r4 = 1
            java.lang.String r3 = r2.mo86045b(r3, r1, r4)
            r2.f194392d = r3
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r0 = r0.f224800a
            boolean r1 = eb0.C45628s0.m50735A(r1)
            r0.f194414z = r1
            java.lang.String r0 = r7.f218761V0
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = r7.f218761V0
            boolean r0 = eb0.C45628s0.m50735A(r0)
            if (r0 != 0) goto L_0x00c8
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            java.lang.String r2 = r7.f218761V0
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r2 = r0.P50(r2)
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            android.widget.LinearLayout r0 = r7.f218785p0
            r0.setVisibility(r1)
            nm2.a r0 = nm2.C76927a.m92781a()
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r0 = r0.f224800a
            r0.f194393e = r4
            goto L_0x00d7
        L_0x00c8:
            android.widget.LinearLayout r0 = r7.f218785p0
            r2 = 8
            r0.setVisibility(r2)
            nm2.a r0 = nm2.C76927a.m92781a()
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r0 = r0.f224800a
            r0.f194393e = r1
        L_0x00d7:
            int r0 = r7.f218764X
            r2 = 2
            if (r0 != r2) goto L_0x00e5
            com.tencent.mm.ui.tools.KeyboardHeightProvider r0 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r0.<init>(r7)
            r7.f218766Y = r0
            r0.f220015b = r7
        L_0x00e5:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KForceDarkMode"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            if (r0 == 0) goto L_0x0166
            r0 = 2131886111(0x7f12001f, float:1.9406792E38)
            r7.setTheme(r0)
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131099792(0x7f060090, float:1.7811947E38)
            int r0 = r0.getColor(r1)
            r7.setActionbarColor(r0)
            android.content.res.Resources r0 = r7.getResources()
            int r0 = r0.getColor(r1)
            r7.setNavigationbarColor(r0)
            r7.setBackGroundColorResource(r1)
            r7.mo103385d8()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r7.f218609h
            r1 = 2131099794(0x7f060092, float:1.7811951E38)
            if (r0 == 0) goto L_0x012c
            android.view.View r2 = r0.f211608i
            if (r2 == 0) goto L_0x012c
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r2.setBackgroundColor(r0)
        L_0x012c:
            android.widget.ListView r0 = r7.f218605d
            r0.setBackgroundResource(r1)
            vo3.f r0 = r7.getBounceView()
            if (r0 == 0) goto L_0x0146
            vo3.f r0 = r7.getBounceView()
            android.content.res.Resources r2 = r7.getResources()
            int r1 = r2.getColor(r1)
            r0.setBgColor(r1)
        L_0x0146:
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r7.f218606e
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131099696(0x7f060030, float:1.7811752E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r7.f218606e
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131100635(0x7f0603db, float:1.7813657E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SelectContactUI.initView():void");
    }

    /* renamed from: k8 */
    public final TextView mo103428k8(ListView listView, View.OnClickListener onClickListener, String str) {
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ayl, (ViewGroup) null);
        inflate.setOnClickListener(onClickListener);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bsk);
        textView.setText(str);
        listView.addHeaderView(inflate);
        return textView;
    }

    /* renamed from: l8 */
    public final void mo103429l8() {
        if (this.f218781l1) {
            int i = this.f218756T;
            if (i == 1 || i == 0) {
                List<String> list = this.f218750Q;
                int i2 = 0;
                int size = list != null ? ((LinkedList) list).size() : 0;
                List<String> list2 = this.f218752R;
                if (list2 != null) {
                    i2 = ((LinkedList) list2).size();
                }
                this.f218741G1.mo103452a(this, size + i2, Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChatRoomInviteStartCount")));
            }
        }
    }

    /* renamed from: m8 */
    public final void mo103430m8(C72940a aVar) {
        aVar.f212615d = new C74416h(aVar);
        aVar.mo100867d(this, getString(C0966R.string.a3h), getString(C0966R.string.f360944g53), true, true, new C74417i(aVar));
        mo103439v8(2);
    }

    /* renamed from: n8 */
    public final boolean mo103431n8(List<String> list, boolean z) {
        C72996z1 z1Var;
        List<String> list2 = list;
        boolean z2 = false;
        if (getIntent().getBooleanExtra("Add_SendCard", false)) {
            if (Util.isNullOrNil(this.f218760V)) {
                this.f218760V = Util.listToString(list2, ",");
            } else if (Util.isNullOrNil(this.f218762W)) {
                this.f218762W = Util.listToString(list2, ",");
            } else {
                Log.m105921e("MicroMsg.SelectContactUI", "send card occur error: send:%s | receive:%s", this.f218760V, this.f218762W);
                return false;
            }
            boolean U5 = C72996z1.m85820U5(this.f218762W);
            Intent intent = new Intent();
            intent.putExtra("be_send_card_name", this.f218760V);
            intent.putExtra("received_card_name", this.f218762W);
            intent.putExtra("Is_Chatroom", U5);
            setResult(-1, intent);
            finish();
        } else if (getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
            Log.m105925i("MicroMsg.SelectContactUI", "sns post who can see scene,users=%s", list.toString());
            ArrayList<String> r8 = mo103435r8(false);
            r8.remove(C75592q0.m90789s());
            boolean z3 = false;
            for (String next : list) {
                if (!Util.isNullOrNil(next) && !r8.contains(next) && !C75592q0.m90789s().equals(next) && (z1Var = C97625j3.m125812b().mo105907v().get(next)) != null && ((int) z1Var.f108320R1) != 0 && z1Var.mo62927s3()) {
                    mo103440w8(next, (String) null);
                    r8.add(next);
                    z3 = true;
                }
            }
            if (z3) {
                mo103443z8();
                mo103379N7().notifyDataSetChanged();
            } else if (z) {
                ArrayList<String> r84 = mo103435r8(false);
                r84.remove(C75592q0.m90789s());
                String listToString = Util.listToString(r84, ",");
                if (!Util.isNullOrNil((List) r84)) {
                    C76879j.m92717K(getContext(), true, getString(C0966R.string.g2m), "", getString(C0966R.string.g2l), getString(C0966R.string.g2k), new C6895o3(this, listToString), new C6896p3(this, listToString));
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Select_Contact", listToString);
                    intent2.putExtra("Select_Conv_User", listToString);
                    intent2.putExtra("Select_Contact", listToString);
                    intent2.putExtra("Select_Contacts_To_Create_New_Label", listToString);
                    setResult(-1, intent2);
                    finish();
                }
            }
        } else if (getIntent().getBooleanExtra("recommend_friends", false)) {
            Log.m105924i("MicroMsg.SelectContactUI", "Recommend Friends");
            AppCompatActivity context = getContext();
            String str = this.f218762W;
            for (String next2 : list) {
                String a = C44885y3.m49774a(next2, (C50954qg) null);
                C100760a0.C100764f a2 = C100760a0.m131931a(str);
                a2.f295187a = str;
                a2.f295189c = a;
                a2.f295190d = C72996z1.m85843n5(next2) ? 66 : 42;
                a2.f295191e = 0;
                a2.f295194h = 4;
                a2.mo140195a().mo123694a();
            }
            C75026b.m89951a(context, context.getString(C0966R.string.fjh));
            C115669n.INSTANCE.mo160131h(11003, str, 3, Integer.valueOf(list.size()));
            context.setResult(-1);
            MMHandlerThread.postToMainThreadDelayed(new C74591x3(context), 1800);
        } else if (this.f218782m1) {
            Log.m105924i("MicroMsg.SelectContactUI", "From Group choose");
            this.f218782m1 = false;
            for (String next3 : list) {
                if (!Util.isNullOrNil((List) list)) {
                    C86709a0.m107528h();
                    C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(next3);
                    if (N2 == null) {
                        Log.m105920e("MicroMsg.SelectContactUI", "contact is null");
                    } else if (Util.isNullOrNil(N2.mo73980x2()) && N2.mo62927s3()) {
                        if ((Util.isNullOrNil(this.f218787q1) || !next3.equals(this.f218787q1)) && !((LinkedList) this.f218752R).contains(next3)) {
                            mo103440w8(next3, (String) null);
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.SelectContactUI", "userName isNull Or Nil");
                }
            }
            mo103443z8();
            mo103429l8();
            mo103434q8().notifyDataSetChanged();
        } else if (C74560s1.m89275d(this.f218734D, 16384)) {
            Log.m105924i("MicroMsg.SelectContactUI", "return the result");
            Intent intent3 = new Intent();
            String listToString2 = Util.listToString(list2, ",");
            intent3.putExtra("Select_Contact", listToString2);
            intent3.putExtra("Select_Conv_User", listToString2);
            intent3.putExtra("Select_Contact", listToString2);
            if (mo103379N7() instanceof C74568u) {
                Cursor cursor = ((C74568u) mo103379N7()).f219199z;
                intent3.putExtra("show_all_select_contact_count", cursor != null ? ((MergeCursor) cursor).getCount() : 0);
            }
            if (!(this.f218774e1 == null && this.f218778i1 == null)) {
                ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = new ChatroomInfoUI.LocalHistoryInfo();
                C98121d dVar = this.f218774e1;
                if (dVar != null) {
                    localHistoryInfo.f108055d = dVar.field_fileId;
                    localHistoryInfo.f108056e = dVar.field_aesKey;
                    localHistoryInfo.f108057f = dVar.field_filemd5;
                    localHistoryInfo.f108058g = (int) dVar.field_fileLength;
                    localHistoryInfo.f108059h = this.f218765X0;
                }
                C98121d dVar2 = this.f218778i1;
                if (dVar2 != null) {
                    localHistoryInfo.f108060i = dVar2.field_fileId;
                    localHistoryInfo.f108061j = dVar2.field_aesKey;
                    localHistoryInfo.f108062n = dVar2.field_filemd5;
                    localHistoryInfo.f108063o = (int) dVar2.field_fileLength;
                    localHistoryInfo.f108064p = this.f218765X0;
                }
                intent3.putExtra("select_record_msg_info", localHistoryInfo);
                Pair<Long, Boolean> pair = this.f218773d1;
                intent3.putExtra("select_record_fake_msg_id", pair != null ? ((Long) pair.first).longValue() : 0);
            }
            intent3.putExtra("label_source", this.f218786p1);
            if (this.f218733C1 == 1) {
                z2 = true;
            }
            intent3.putExtra("Is_Chatroom", z2);
            intent3.putExtra("scene_from", 13);
            setResult(-1, intent3);
            finish();
        } else if (getIntent().getBooleanExtra("shareImage", false)) {
            Log.m105924i("MicroMsg.SelectContactUI", "Share Image");
            ArrayList<String> r85 = mo103435r8(true);
            r85.remove(C75592q0.m90789s());
            if (r85.size() > 0) {
                this.f218732C = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gmo), true, false, (DialogInterface.OnCancelListener) null);
                C86709a0.m107525e().postToWorker(new C74426u(this, r85, (C744121) null));
            }
        } else if (list.size() > 0) {
            Log.m105925i("MicroMsg.SelectContactUI", "Launch ChattingUI: users=%s", list.toString());
            finish();
            Intent intent4 = new Intent();
            intent4.setClass(this, ChattingUI.class);
            intent4.putExtra("Chat_User", list2.get(0));
            intent4.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent4);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo103439v8(3);
        } else {
            Log.m105921e("MicroMsg.SelectContactUI", "unkown action: User=%s", list.toString());
        }
        return true;
    }

    /* renamed from: o8 */
    public final void mo103432o8(boolean z) {
        if (this.f218764X == 1) {
            enableOptionMenu(1, z);
        } else {
            this.f218757T0.setEnabled(z);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f218733C1 = i;
        Log.m105925i("MicroMsg.SelectContactUI", "requestCode=%d | resultCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            List<String> list = null;
            switch (i) {
                case 0:
                    String stringExtra = intent.getStringExtra("Select_Conv_User");
                    if (!Util.isNullOrNil(stringExtra)) {
                        mo103437t8(Util.stringsToList(new String[]{stringExtra}));
                        return;
                    }
                    return;
                case 1:
                    String stringExtra2 = intent.getStringExtra("Select_Contact");
                    this.f218782m1 = intent.getBooleanExtra("Select_From_Group", false);
                    if (!Util.isNullOrNil(stringExtra2)) {
                        mo103437t8(Util.stringsToList(stringExtra2.split(",")));
                        return;
                    }
                    return;
                case 2:
                    if (intent != null) {
                        String stringExtra3 = intent.getStringExtra("Select_Contact");
                        if (!Util.isNullOrNil(stringExtra3)) {
                            mo103437t8(Util.stringsToList(new String[]{stringExtra3}));
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                    String stringExtra4 = intent.getStringExtra("Select_Contact");
                    if (Util.isNullOrNil(stringExtra4)) {
                        Log.m105924i("MicroMsg.SelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                        return;
                    }
                    Log.m105925i("MicroMsg.SelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra4);
                    if (C74560s1.m89275d(this.f218734D, 64)) {
                        for (String str : stringExtra4.split(",")) {
                            if (((LinkedList) this.f218752R).add(str)) {
                                this.f218609h.mo100244d(str);
                            }
                        }
                        mo103443z8();
                        mo103379N7().notifyDataSetChanged();
                        return;
                    }
                    mo103437t8(Util.stringsToList(new String[]{stringExtra4}));
                    return;
                case 4:
                    long currentTimeMillis = SnsReportHelper.f275506m0.mo131344E().f266370J + (System.currentTimeMillis() - this.f218797y1);
                    SnsReportHelper.f275506m0.mo131344E().f266370J = currentTimeMillis;
                    Log.m105925i("MicroMsg.SelectContactUI", "setSelectFriGroupDuration %d", Long.valueOf(currentTimeMillis));
                    String stringExtra5 = intent.getStringExtra("select_chatrooms");
                    if (getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
                        ArrayList<String> stringsToList = Util.stringsToList(stringExtra5.split(","));
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        Iterator<String> it = stringsToList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (C45612m0.m50709z(next)) {
                                List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(next);
                                if (mX != null) {
                                    for (String add : mX) {
                                        hashSet.add(add);
                                    }
                                }
                            } else {
                                hashSet.add(next);
                            }
                        }
                        arrayList.addAll(hashSet);
                        if (getIntent().getBooleanExtra("without_openim", false)) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                if (((String) it4.next()).contains("openim")) {
                                    it4.remove();
                                }
                            }
                        }
                        mo103437t8(arrayList);
                        return;
                    }
                    for (String next2 : this.f218752R) {
                        MultiSelectContactView multiSelectContactView = this.f218609h;
                        if (next2 != null) {
                            multiSelectContactView.mo100247g(next2, false, false);
                        } else {
                            multiSelectContactView.getClass();
                        }
                    }
                    ((LinkedList) this.f218752R).clear();
                    if (!Util.isNullOrNil(stringExtra5)) {
                        ((LinkedList) this.f218752R).addAll(Util.stringsToList(stringExtra5.split(",")));
                    }
                    for (String a : this.f218752R) {
                        this.f218609h.mo100240a(a, false);
                    }
                    mo103443z8();
                    return;
                case 5:
                    if (intent != null) {
                        String stringExtra6 = intent.getStringExtra("Select_Contact");
                        String stringExtra7 = intent.getStringExtra("Cancel_Select_Contact");
                        List<String> stringToList = Util.isNullOrNil(stringExtra6) ? null : Util.stringToList(stringExtra6, ",");
                        if (!Util.isNullOrNil(stringExtra7)) {
                            list = Util.stringToList(stringExtra7, ",");
                        }
                        if (stringToList != null) {
                            if (this.f218609h != null) {
                                for (String next3 : stringToList) {
                                    if (!((LinkedList) this.f218752R).contains(next3)) {
                                        this.f218609h.mo100244d(next3);
                                    }
                                }
                            }
                            ((LinkedList) this.f218752R).addAll(stringToList);
                        }
                        if (list != null) {
                            if (this.f218609h != null) {
                                for (String d : list) {
                                    this.f218609h.mo100244d(d);
                                }
                            }
                            this.f218752R.removeAll(list);
                        }
                        mo103379N7().notifyDataSetChanged();
                        if (getIntent().getBooleanExtra("Add_SendCard", false)) {
                            mo103437t8(Util.stringsToList(new String[]{stringExtra6}));
                        }
                    }
                    mo103443z8();
                    return;
                case 6:
                    if (intent != null) {
                        int intExtra = intent.getIntExtra("select_record_msg_num", 0);
                        this.f218763W0 = intExtra;
                        this.f218765X0 = intExtra;
                        this.f218769Z0 = intent.getStringArrayListExtra("key_select_record_msg_black_list");
                        this.f218774e1 = null;
                        this.f218778i1 = null;
                        this.f218772c1 = false;
                        this.f218776g1 = false;
                        if (this.f218763W0 == 0) {
                            this.f218771b1 = false;
                            this.f218775f1 = false;
                            mo103441x8();
                        } else {
                            this.f218771b1 = true;
                            this.f218775f1 = true;
                            this.f218770a1 = intent.getLongExtra("select_record_min_msg_id", -1);
                            if (C73313b1.m86459e() > 0 && C73313b1.m86459e() < this.f218763W0) {
                                this.f218765X0 = C73313b1.m86459e();
                            }
                            mo103441x8();
                            C76927a.m92781a().f224808i = C31543z5.m39451a();
                            this.f218777h1 = new ArrayList(C73313b1.f215414a.f215425a);
                            Pair<Long, Boolean> f = C73313b1.m86460f(this, "msginfo@fakeuser", true, this.f218761V0);
                            this.f218773d1 = f;
                            if (!((Boolean) f.second).booleanValue()) {
                                this.f218793w1.alive();
                            } else {
                                mo103425A8();
                            }
                        }
                        C76927a.m92781a().f224800a.f194397i = (long) this.f218765X0;
                        Pair<Long, Boolean> pair = this.f218773d1;
                        Log.m105925i("MicroMsg.SelectContactUI", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", Integer.valueOf(this.f218763W0), Integer.valueOf(this.f218765X0), pair.first, pair.second);
                        return;
                    }
                    return;
                case 7:
                    long currentTimeMillis2 = SnsReportHelper.f275506m0.mo131344E().f266371K + (System.currentTimeMillis() - this.f218798z1);
                    SnsReportHelper.f275506m0.mo131344E().f266371K = currentTimeMillis2;
                    Log.m105925i("MicroMsg.SelectContactUI", "setSelectFriLabelDuration %d", Long.valueOf(currentTimeMillis2));
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                    if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        Iterator<String> it5 = stringArrayListExtra.iterator();
                        while (it5.hasNext()) {
                            String next4 = it5.next();
                            List k = ((C67001a) C28250a.m38138a()).mo90973k(next4);
                            Log.m105925i("MicroMsg.SelectContactUI", "select label:%s count:%d", next4, Integer.valueOf(k.size()));
                            sb.append(next4);
                            sb.append("|");
                            sb.append(k.size());
                            sb.append(";");
                            arrayList2.addAll(k);
                        }
                        SnsReportHelper.f275506m0.mo131344E().f266366F = (long) stringArrayListExtra.size();
                        TimelineGroupUserBehaviorStruct E = SnsReportHelper.f275506m0.mo131344E();
                        E.f266367G = E.mo86045b("SelectFriLabelList", sb.toString(), true);
                        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_select_label_id_list_from_search");
                        if (stringArrayListExtra2 != null) {
                            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                            int size = stringArrayListExtra2.size();
                            snsReportHelper.getClass();
                            SnsMethodCalculate.markStartTimeMs("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
                            if (timelineGroupUserBehaviorStruct != null) {
                                int i3 = timelineGroupUserBehaviorStruct.f266374N + size;
                                timelineGroupUserBehaviorStruct.f266374N = i3;
                                Log.m105925i("MicroMsg.SnsReportHelper", "addSearchLabelCntOfSelectFri: newCount=%d", Integer.valueOf(i3));
                            }
                            SnsMethodCalculate.markEndTimeMs("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        }
                        mo103437t8(arrayList2);
                        mo103443z8();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        MultiSelectContactView multiSelectContactView;
        this.f218790t1 = C31543z5.m39453c();
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SelectContactUI", "create!");
        C97625j3.m125815e().mo123455a(30, this);
        C97625j3.m125815e().mo123455a(138, this);
        if (!Util.isNullOrNil(this.f218738F)) {
            setMMSubTitle(this.f218738F);
        }
        this.f218787q1 = C75592q0.m90789s();
        if (C74560s1.m89275d(this.f218734D, 64)) {
            if (this.f218764X == 1) {
                this.f218768Z.setVisibility(8);
                if (this.f218605d != null) {
                    this.f218768Z.post(new C74567t3(this));
                }
                addTextOptionMenu(1, getString(C0966R.string.a18), new C74528m3(this), (View.OnLongClickListener) null, getIntent().getBooleanExtra("KForceDarkMode", false) ? MMActivityController.C73075r.FINDER_LIVE : MMActivityController.C73075r.GREEN);
            } else {
                this.f218768Z.setVisibility(0);
                if (this.f218605d != null) {
                    this.f218768Z.post(new C74567t3(this));
                }
                this.f218757T0.setOnClickListener(new C74530n3(this));
            }
        }
        mo103443z8();
        setBackBtn(new C6862l());
        if (!(this.f218756T == 15 || (multiSelectContactView = this.f218609h) == null)) {
            multiSelectContactView.mo100245e(this.f218752R);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            int i = this.f218604A;
            int i2 = 3;
            if (i != 2) {
                i2 = i != 3 ? i != 7 ? 0 : 1 : 2;
            }
            C57826d2.f165449a = i2;
            Log.m105919d("MicroMsg.NewGroupRecommendDetailReporter", "scene:%d", Integer.valueOf(i2));
        }
        if (getBounceView() != null) {
            getBounceView().setBgColor(getResources().getColor(C0966R.color.f2929c));
        }
    }

    public void onDestroy() {
        this.f218793w1.dead();
        C97625j3.m125815e().mo123470p(30, this);
        C97625j3.m125815e().mo123470p(138, this);
        mo103439v8(1);
        C57826d2.f165450b = null;
        C57826d2.f165451c = null;
        Log.m105918d("MicroMsg.NewGroupRecommendDetailReporter", "reset");
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f218766Y;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        super.onResume();
        KeyboardHeightProvider keyboardHeightProvider = this.f218766Y;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        if (!Util.isNullOrNil(this.f218789s1)) {
            MvvmOptimizeReportStruct mvvmOptimizeReportStruct = new MvvmOptimizeReportStruct();
            mvvmOptimizeReportStruct.f194290d = mvvmOptimizeReportStruct.mo86045b("Type", this.f218788r1, true);
            mvvmOptimizeReportStruct.f194291e = mvvmOptimizeReportStruct.mo86045b("SessionId", this.f218789s1, true);
            mvvmOptimizeReportStruct.f194293g = 0;
            mvvmOptimizeReportStruct.f194292f = C31543z5.m39453c() - this.f218790t1;
            mvvmOptimizeReportStruct.mo86054n();
            mvvmOptimizeReportStruct.mo86056r();
            this.f218789s1 = "";
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f218732C;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f218732C = null;
        }
        if (!Util.isTopActivity(this) || C74785j2.C6981a.m7247a(this, i, i2, str, 4)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 138) {
                mo103379N7().notifyDataSetChanged();
            }
        } else if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
            Toast.makeText(this, str, 1).show();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f218766Y;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }

    /* renamed from: p8 */
    public final ArrayList<String> mo103433p8(boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (String next : this.f218752R) {
            if (z || !C45628s0.m50743H(next)) {
                hashSet.add(next);
            } else {
                List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(next);
                if (mX != null) {
                    for (String add : mX) {
                        hashSet.add(add);
                    }
                }
            }
        }
        hashSet.addAll(this.f218750Q);
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: q8 */
    public C74526m1 mo103434q8() {
        C74526m1 m1Var = this.f218607f;
        if (m1Var != null) {
            return m1Var;
        }
        C74526m1 L7 = mo64513L7();
        this.f218605d.setAdapter(L7);
        Log.m105924i("MicroMsg.SelectContactUI", "getInitAdapter is null");
        return L7;
    }

    /* renamed from: r8 */
    public final ArrayList<String> mo103435r8(boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (String next : this.f218752R) {
            if (z || !C45628s0.m50743H(next)) {
                hashSet.add(next);
            } else {
                List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(next);
                if (mX != null) {
                    for (String add : mX) {
                        hashSet.add(add);
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: s8 */
    public final C98124g mo103436s8(String str, boolean z) {
        C98124g gVar = new C98124g();
        gVar.f287661e = true;
        gVar.f287662f = this.f218739F1;
        String f = C90193h.m112878f(("" + Util.currentTicks() + ", " + str).getBytes());
        gVar.field_mediaId = f;
        gVar.field_fullpath = str;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 5;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 0;
        gVar.field_bzScene = 0;
        this.f218735D1.put(f, str);
        HashMap<String, C74427v> hashMap = this.f218737E1;
        String str2 = gVar.field_mediaId;
        hashMap.put(str2, new C74427v(this, str2, gVar.field_fullpath, z));
        return gVar;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C78937x.class);
    }

    /* renamed from: t8 */
    public final boolean mo103437t8(List<String> list) {
        return mo103438u8(list, false);
    }

    /* renamed from: u8 */
    public final boolean mo103438u8(List<String> list, boolean z) {
        String str;
        Log.m105925i("MicroMsg.SelectContactUI", "handleSelect %s", list);
        if (!C74560s1.m89275d(this.f218734D, 65536)) {
            return mo103431n8(list, z);
        }
        Class cls = C75339i.class;
        if (list != null) {
            if (list.size() == 1) {
                str = getString(C0966R.string.iif, new Object[]{((C75339i) C86312j.m106911c(cls)).getDisplayName(list.get(0))});
            } else if (list.size() > 1) {
                String string = getString(C0966R.string.a2y);
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (i == 3) {
                        sb.append("...");
                        break;
                    } else {
                        sb.append(((C75339i) C86312j.m106911c(cls)).getDisplayName(list.get(i)));
                        if (i < list.size() - 1) {
                            sb.append(string);
                        }
                        i++;
                    }
                }
                str = getString(C0966R.string.iif, new Object[]{sb.toString()});
            }
            this.f218780k1 = true;
            C76879j.m92714H(getContext(), str, (String) null, true, new C74413e(list, z), new C74414f());
            return this.f218780k1;
        }
        str = null;
        this.f218780k1 = true;
        C76879j.m92714H(getContext(), str, (String) null, true, new C74413e(list, z), new C74414f());
        return this.f218780k1;
    }

    /* renamed from: v8 */
    public final void mo103439v8(int i) {
        if (!this.f218731B1) {
            this.f218731B1 = true;
            if (getIntent().getBooleanExtra("create_group_recommend", false)) {
                int i2 = this.f218604A;
                int i3 = i2 != 2 ? i2 != 3 ? i2 != 7 ? 0 : 1 : 2 : 3;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                for (String next : this.f218752R) {
                    if (((HashMap) this.f218754S).containsKey(next)) {
                        int intValue = ((Integer) ((HashMap) this.f218754S).get(next)).intValue();
                        if (intValue == 0) {
                            i4++;
                        } else if (intValue == 1) {
                            i5++;
                        } else if (intValue == 2) {
                            i6++;
                        } else if (intValue == 3) {
                            i7++;
                        } else if (intValue == 4) {
                            i8++;
                        }
                    }
                }
                Log.m105919d("MicroMsg.SelectContactUI", "report_17535, scene:%d, SelectCount:%d, SearchCount:%d, RecommendCount:%d, RecommendGroupCount:%d, ExitType:%d, TokenSearchCount:%d, TokenRecommendCount:%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(mo103379N7().mo103530k()), Integer.valueOf(i), Integer.valueOf(i7), Integer.valueOf(i8));
                C115669n.INSTANCE.mo160131h(17535, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(mo103379N7().mo103530k()), Integer.valueOf(i), Integer.valueOf(i7), Integer.valueOf(i8));
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(this.f218750Q);
                linkedList.addAll(this.f218752R);
                C57826d2.m66826a(linkedList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011a, code lost:
        if (r0 != false) goto L_0x011c;
     */
    /* renamed from: w8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103440w8(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.List<java.lang.String> r7 = r5.f218750Q
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.List<java.lang.String> r7 = r5.f218752R
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            boolean r7 = r7.contains(r6)
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0021
            java.util.List<java.lang.String> r7 = r5.f218752R
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.remove(r6)
            r7 = 1
            goto L_0x00c8
        L_0x0021:
            java.util.List<java.lang.String> r7 = r5.f218752R
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.add(r6)
            com.tencent.mm.ui.contact.i1 r7 = r5.mo103379N7()
            boolean r7 = r7 instanceof com.tencent.p014mm.p136ui.contact.C74469c2
            if (r7 == 0) goto L_0x008e
            com.tencent.mm.ui.contact.i1 r7 = r5.mo103379N7()
            com.tencent.mm.ui.contact.c2 r7 = (com.tencent.p014mm.p136ui.contact.C74469c2) r7
            boolean r7 = r7.mo103537z()
            if (r7 == 0) goto L_0x0082
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r5.f218754S
            com.tencent.mm.ui.contact.i1 r2 = r5.mo103379N7()
            com.tencent.mm.ui.contact.c2 r2 = (com.tencent.p014mm.p136ui.contact.C74469c2) r2
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r3 = r2.f218990w
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0050:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r3.next()
            java.util.List r4 = (java.util.List) r4
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x0050
            r2 = 3
            goto L_0x0078
        L_0x0064:
            com.tencent.mm.ui.contact.y r2 = r2.f218974D
            java.util.List<java.lang.String> r2 = r2.f219250a
            if (r2 == 0) goto L_0x0072
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x0072
            r2 = 1
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            if (r2 == 0) goto L_0x0077
            r2 = 4
            goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r6, r2)
            goto L_0x00c7
        L_0x0082:
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r5.f218754S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r6, r2)
            goto L_0x00c7
        L_0x008e:
            com.tencent.mm.ui.contact.i1 r7 = r5.mo103379N7()
            com.tencent.mm.ui.contact.m1 r2 = r5.mo103434q8()
            if (r7 != r2) goto L_0x00c7
            com.tencent.mm.ui.contact.m1 r7 = r5.mo103434q8()
            com.tencent.mm.ui.contact.u r7 = (com.tencent.p014mm.p136ui.contact.C74568u) r7
            com.tencent.mm.ui.contact.y r7 = r7.f219186F
            java.util.List<java.lang.String> r7 = r7.f219250a
            if (r7 == 0) goto L_0x00ac
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L_0x00ac
            r7 = 1
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            if (r7 == 0) goto L_0x00bc
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r5.f218754S
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r6, r2)
            goto L_0x00c7
        L_0x00bc:
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r5.f218754S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r6, r2)
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r3 = "create_group_recommend"
            boolean r2 = r2.getBooleanExtra(r3, r1)
            if (r2 == 0) goto L_0x0123
            com.tencent.mm.ui.contact.i1 r2 = r5.mo103379N7()
            com.tencent.mm.ui.contact.m1 r3 = r5.mo103434q8()
            if (r2 == r3) goto L_0x0104
            com.tencent.mm.ui.contact.m1 r7 = r5.mo103434q8()
            com.tencent.mm.ui.contact.u r7 = (com.tencent.p014mm.p136ui.contact.C74568u) r7
            com.tencent.mm.ui.contact.y r7 = r7.f219186F
            r0 = 0
            r7.f219250a = r0
            r7.f219251b = r0
            java.util.List<com.tencent.mm.storage.m1> r7 = r7.f219252c
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.clear()
            com.tencent.mm.ui.contact.m1 r7 = r5.mo103434q8()
            r7.mo7853r()
            com.tencent.mm.ui.contact.LabelContainerView r7 = r5.f218620v
            com.tencent.mm.ui.contact.LabelContainerView$a r7 = r7.f218602q
            r7.mo103375a()
            r5.hideVKB()
            goto L_0x0123
        L_0x0104:
            if (r7 != 0) goto L_0x011c
            com.tencent.mm.ui.contact.m1 r7 = r5.mo103434q8()
            com.tencent.mm.ui.contact.u r7 = (com.tencent.p014mm.p136ui.contact.C74568u) r7
            com.tencent.mm.ui.contact.y r7 = r7.f219186F
            java.util.List<java.lang.String> r7 = r7.f219250a
            if (r7 == 0) goto L_0x0119
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            if (r0 == 0) goto L_0x0123
        L_0x011c:
            com.tencent.mm.ui.contact.m1 r7 = r5.mo103434q8()
            r7.mo7853r()
        L_0x0123:
            com.tencent.mm.ui.contact.i1 r7 = r5.mo103379N7()
            boolean r7 = r7 instanceof com.tencent.p014mm.p136ui.contact.C74469c2
            if (r7 == 0) goto L_0x0141
            com.tencent.mm.ui.contact.i1 r7 = r5.mo103379N7()
            com.tencent.mm.ui.contact.c2 r7 = (com.tencent.p014mm.p136ui.contact.C74469c2) r7
            java.lang.String r7 = r7.mo103535w()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r5.f218609h
            if (r0 == 0) goto L_0x0144
            android.widget.EditText r0 = r0.getInputText()
            r0.setText(r7)
            goto L_0x0144
        L_0x0141:
            r5.mo103378K7()
        L_0x0144:
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r7 = r5.f218609h
            r7.mo100244d(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SelectContactUI.mo103440w8(java.lang.String, java.lang.String):void");
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        String str2;
        if (bVar.mo106184e() && (str2 = bVar.f222621r) != null) {
            return ((LinkedList) this.f218752R).contains(str2);
        }
        if (bVar.f222611h && (str = bVar.f222621r) != null) {
            return ((LinkedList) this.f218752R).contains(str);
        }
        if (bVar instanceof C75973v) {
            return this.f218752R.isEmpty();
        }
        return false;
    }

    /* renamed from: x8 */
    public final void mo103441x8() {
        ((C119157j) C119157j.f356862d).mo183895z(new C74415g());
    }

    /* renamed from: y8 */
    public final void mo103442y8(int i, String str, String str2) {
        Log.m105925i("MicroMsg.SelectContactUI", "triggerErrorCallback errCode:%s errMsg:%s", Integer.valueOf(i), Util.nullAs(str, ""));
        this.f218772c1 = true;
        this.f218776g1 = true;
        this.f218771b1 = false;
        this.f218775f1 = false;
        mo103441x8();
        ((C119157j) C119157j.f356862d).mo183895z(new C74419k(str2));
        C76927a a = C76927a.m92781a();
        long a2 = C31543z5.m39451a();
        long j = a.f224808i;
        if (a2 > j) {
            a.f224800a.f194407s = a2 - j;
        }
        C76927a.m92781a().f224811l++;
    }

    /* renamed from: z8 */
    public final void mo103443z8() {
        if (C74560s1.m89275d(this.f218734D, 64)) {
            List<String> list = this.f218752R;
            if (!(this.f218615q == null || list == null)) {
                mo103386e8(((LinkedList) list).size());
            }
        }
        if (C74560s1.m89275d(this.f218734D, 64) && ((LinkedList) this.f218752R).size() > 0) {
            String string = TextUtils.isEmpty(this.f218792v1) ? getString(C0966R.string.f8014z_) : this.f218792v1;
            mo103427a(string + "(" + ((LinkedList) this.f218752R).size() + ")");
            int intExtra = getIntent().getIntExtra("min_limit_num", 0);
            if (!C74560s1.m89275d(this.f218734D, 262144)) {
                mo103432o8(true);
            } else if (((LinkedList) this.f218752R).size() >= intExtra) {
                mo103432o8(true);
            } else {
                mo103432o8(false);
            }
        } else if (C74560s1.m89275d(this.f218734D, 64) && C74560s1.m89275d(this.f218734D, 4194304)) {
            mo103427a(TextUtils.isEmpty(this.f218792v1) ? getString(C0966R.string.f8014z_) : this.f218792v1);
            mo103432o8(true);
        } else if (!C74560s1.m89275d(this.f218734D, 64) || !C74560s1.m89275d(this.f218734D, 262144) || ((LinkedList) this.f218752R).size() != 0) {
            mo103427a(TextUtils.isEmpty(this.f218792v1) ? getString(C0966R.string.f8014z_) : this.f218792v1);
            mo103432o8(true);
        } else {
            mo103427a(TextUtils.isEmpty(this.f218792v1) ? getString(C0966R.string.f8014z_) : this.f218792v1);
            mo103432o8(false);
        }
    }
}

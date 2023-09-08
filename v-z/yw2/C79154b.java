package yw2;

import ae3.C67030b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.NewFriendAssistActionStruct;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.subapp.p109ui.friend.FMessageConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import fd0.C75743h;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import p011cm.C39989b;
import wd3.C78543a;

/* renamed from: yw2.b */
public class C79154b extends C6975i1<C72979k3> {

    /* renamed from: o */
    public Context f232427o;

    /* renamed from: p */
    public HashMap<String, Boolean> f232428p = new HashMap<>();

    /* renamed from: q */
    public HashMap<String, C72985m3> f232429q = new HashMap<>();

    /* renamed from: r */
    public View.OnClickListener f232430r = new C79159e();

    /* renamed from: s */
    public View.OnClickListener f232431s = new C79161f();

    /* renamed from: yw2.b$a */
    public class C79155a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79163g f232432d;

        public C79155a(C79154b bVar, C79163g gVar) {
            this.f232432d = gVar;
        }

        public void run() {
            Layout layout = this.f232432d.f232455i.getLayout();
            if (layout == null) {
                return;
            }
            if (layout.getEllipsisCount(0) > 0) {
                this.f232432d.f232456j.setVisibility(0);
            } else {
                this.f232432d.f232456j.setVisibility(8);
            }
        }
    }

    /* renamed from: yw2.b$b */
    public class C79156b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f232433d;

        /* renamed from: e */
        public final /* synthetic */ Button f232434e;

        /* renamed from: f */
        public final /* synthetic */ Button f232435f;

        /* renamed from: g */
        public final /* synthetic */ MaskLayout f232436g;

        public C79156b(View view, Button button, Button button2, MaskLayout maskLayout) {
            this.f232433d = view;
            this.f232434e = button;
            this.f232435f = button2;
            this.f232436g = maskLayout;
        }

        public void run() {
            int measuredHeight = this.f232433d.getMeasuredHeight();
            if (measuredHeight > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f232434e.getLayoutParams();
                float f = ((float) measuredHeight) * 0.5f;
                layoutParams.topMargin = (int) (f - ((float) C76577a.m92155f(C79154b.this.f232427o, C0966R.dimen.f3743cv)));
                this.f232434e.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f232435f.getLayoutParams();
                layoutParams2.topMargin = (int) (f - ((float) C76577a.m92155f(C79154b.this.f232427o, C0966R.dimen.f3743cv)));
                this.f232435f.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f232436g.getLayoutParams();
                layoutParams3.topMargin = (int) (f - ((float) C76577a.m92155f(C79154b.this.f232427o, C0966R.dimen.f3743cv)));
                this.f232436g.setLayoutParams(layoutParams3);
            }
        }
    }

    /* renamed from: yw2.b$c */
    public class C79157c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79163g f232438d;

        public C79157c(C79154b bVar, C79163g gVar) {
            this.f232438d = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f232438d.f232455i.setSingleLine(false);
            this.f232438d.f232456j.setVisibility(8);
            NewFriendAssistActionStruct newFriendAssistActionStruct = new NewFriendAssistActionStruct();
            newFriendAssistActionStruct.f194294d = this.f232438d.f232457k.getVisibility() == 0 ? 1 : 2;
            C79163g gVar = this.f232438d;
            int[] iArr = gVar.f232459m;
            newFriendAssistActionStruct.f194295e = (long) iArr[0];
            newFriendAssistActionStruct.f194296f = (long) iArr[1];
            newFriendAssistActionStruct.f194297g = (long) iArr[2];
            newFriendAssistActionStruct.f194298h = 5;
            newFriendAssistActionStruct.f194299i = newFriendAssistActionStruct.mo86045b("username", gVar.f232460n, true);
            newFriendAssistActionStruct.mo86054n();
            newFriendAssistActionStruct.mo86056r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yw2.b$d */
    public class C79158d implements Runnable {
        public C79158d() {
        }

        public void run() {
            C79154b.this.mo7998r(C75743h.vx0().getAll());
            C79154b.this.notifyDataSetChanged();
        }
    }

    /* renamed from: yw2.b$e */
    public class C79159e implements View.OnClickListener {

        /* renamed from: yw2.b$e$a */
        public class C79160a implements C39989b.C0705b {

            /* renamed from: d */
            public final /* synthetic */ C67030b f232441d;

            /* renamed from: e */
            public final /* synthetic */ C72996z1 f232442e;

            public C79160a(C67030b bVar, C72996z1 z1Var) {
                this.f232441d = bVar;
                this.f232442e = z1Var;
            }

            /* renamed from: a */
            public void mo677a(boolean z, boolean z2, String str, String str2) {
                if (z) {
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.FMessageConversationUI", "addContact respUsername is empty");
                        C115669n.INSTANCE.mo175911u(931, 21);
                    }
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f232441d.f192524a);
                    if (((int) z1Var.f108320R1) == 0) {
                        z1Var = this.f232442e;
                        if (!Util.isNullOrNil(str)) {
                            z1Var.setUsername(str);
                        }
                        if (!C97625j3.m125812b().mo105907v().mo69667P3(z1Var)) {
                            Log.m105920e("MicroMsg.FMessageConversationUI", "canAddContact fail, insert fail");
                            return;
                        }
                    }
                    C45628s0.m50775g0(z1Var);
                    C75743h.vx0().mo101171bF(this.f232441d.f192524a, 1);
                    Context context = C79154b.this.f232427o;
                    C76879j.m92726T(context, context.getString(C0966R.string.f7568jx));
                    C79154b bVar = C79154b.this;
                    String str3 = this.f232441d.f192524a;
                    if (bVar.f232427o instanceof FMessageConversationUI) {
                        MMHandlerThread.postToMainThreadDelayed(new C79164c(bVar, str3), 200);
                    }
                } else if (z2) {
                    C75743h.vx0().mo101171bF(this.f232441d.f192524a, 2);
                } else {
                    Log.m105920e("MicroMsg.FMessageConversationUI", "canAddContact fail, username = " + this.f232441d.f192524a);
                    return;
                }
                C79154b.this.notifyDataSetChanged();
            }
        }

        public C79159e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof C67030b) {
                Log.m105918d("MicroMsg.FMessageConversationUI", "addOnClick onClick");
                C67030b bVar = (C67030b) view.getTag();
                if (bVar == null || Util.isNullOrNil(bVar.f192524a)) {
                    Log.m105920e("MicroMsg.FMessageConversationUI", "cpan add contact failed. username is null.");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C72996z1 e = C67030b.m79190e(C75743h.wx0().mo101190bD(bVar.f192524a));
                C78543a aVar = new C78543a(C79154b.this.f232427o, new C79160a(bVar, e));
                Log.m105918d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + bVar.f192524a + ", opcode = MM_VERIFYUSER_ADDCONTACT");
                LinkedList linkedList = new LinkedList();
                linkedList.add(Integer.valueOf(bVar.f192526c));
                aVar.mo108509l(e.f149527Z0);
                aVar.mo108501b(bVar.f192524a, linkedList, true, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yw2.b$f */
    public class C79161f implements View.OnClickListener {

        /* renamed from: yw2.b$f$a */
        public class C79162a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72985m3 f232445d;

            public C79162a(C72985m3 m3Var) {
                this.f232445d = m3Var;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C79153a.m95831b(C79154b.this.f232427o, (C72979k3) null, this.f232445d, false, false);
            }
        }

        public C79161f() {
        }

        public void onClick(View view) {
            String str;
            C44661m1 Lo;
            Class cls = C32735h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof C67030b) {
                Log.m105918d("MicroMsg.FMessageConversationUI", "verifyOkOnClick onClick");
                C67030b bVar = (C67030b) view.getTag();
                C72985m3 bD = C75743h.wx0().mo101190bD(bVar.f192524a);
                if (bD == null || (str = bD.field_msgContent) == null) {
                    Log.m105920e("MicroMsg.FMessageConversationUI", "lastRecvFmsg is null, verify fail, talker = " + bVar.f192524a);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C72963f4.C72971h v = C72963f4.C72971h.m85668v(str);
                Log.m105918d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + bVar.f192524a + ", opcode = MM_VERIFYUSER_VERIFYOK");
                if (v.f212732C == 1) {
                    Context context = C79154b.this.f232427o;
                    C76879j.m92709C(context, v.f212733D, (String) null, context.getString(C0966R.string.exs), C79154b.this.f232427o.getString(C0966R.string.f7926wf), true, new C79162a(bD), (DialogInterface.OnClickListener) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C44673z4 Lo2 = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(bVar.f192524a);
                Intent intent = new Intent();
                intent.putExtra("Contact_User", bVar.f192524a);
                intent.putExtra("Contact_Nick", bVar.f192527d);
                if (Lo2 != null) {
                    intent.putExtra("Contact_RemarkName", Lo2.field_conRemark);
                }
                if (!Util.isNullOrNil(v.f212762z) && (Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(v.f212762z)) != null) {
                    intent.putExtra("Contact_RoomNickname", Lo.mo69789q2(v.f212737a));
                    intent.putExtra("room_name", v.f212762z);
                }
                intent.putExtra("Contact_Scene", v.f212744h);
                intent.putExtra("Verify_ticket", v.f212756t);
                intent.putExtra("sayhi_with_sns_perm_send_verify", false);
                intent.putExtra("sayhi_with_sns_perm_add_remark", true);
                intent.putExtra("sayhi_with_sns_perm_set_label", true);
                intent.putExtra("sayhi_with_jump_to_profile", true);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
                String str2 = (C72996z1.m85843n5(bVar.f192524a) || Qe != 1) ? (C72996z1.m85843n5(bVar.f192524a) || Qe != 2 || C45628s0.m50780j() < ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
                if ((C72996z1.m85843n5(bVar.f192524a) || C72996z1.m85844o5(bVar.f192524a)) && !WeChatBrands.Business.Entries.ContactNewFriendWeWeCom.checkAvailable(C79154b.this.f232427o)) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C88144b.m109791i(C79154b.this.f232427o, Scopes.PROFILE, str2, intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yw2.b$g */
    public static class C79163g {

        /* renamed from: a */
        public MaskLayout f232447a;

        /* renamed from: b */
        public Button f232448b;

        /* renamed from: c */
        public Button f232449c;

        /* renamed from: d */
        public TextView f232450d;

        /* renamed from: e */
        public TextView f232451e;

        /* renamed from: f */
        public TextView f232452f;

        /* renamed from: g */
        public TextView f232453g;

        /* renamed from: h */
        public TextView f232454h;

        /* renamed from: i */
        public TextView f232455i;

        /* renamed from: j */
        public TextView f232456j;

        /* renamed from: k */
        public ImageView f232457k;

        /* renamed from: l */
        public View f232458l;

        /* renamed from: m */
        public int[] f232459m = new int[3];

        /* renamed from: n */
        public String f232460n;
    }

    public C79154b(Context context) {
        super(context, new C72979k3());
        this.f232427o = context;
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72979k3 k3Var = (C72979k3) obj;
        if (k3Var == null) {
            k3Var = new C72979k3();
        }
        k3Var.convertFrom(cursor);
        return k3Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: yw2.b$g} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0524, code lost:
        if (r0.field_type == 2) goto L_0x0526;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0546 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x04c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            if (r27 != 0) goto L_0x00c1
            android.content.Context r1 = r6.f232427o
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r2 = 2131495640(0x7f0c0ad8, float:1.8614822E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            yw2.b$g r2 = new yw2.b$g
            r2.<init>()
            r3 = 2131305019(0x7f09223b, float:1.8228197E38)
            android.view.View r3 = r1.findViewById(r3)
            com.tencent.mm.ui.base.MaskLayout r3 = (com.tencent.p014mm.p136ui.base.MaskLayout) r3
            r2.f232447a = r3
            r3 = 2131305026(0x7f092242, float:1.8228211E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232454h = r3
            r3 = 2131305022(0x7f09223e, float:1.8228203E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232455i = r3
            r3 = 2131300429(0x7f09104d, float:1.8218887E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232456j = r3
            r3 = 2131305016(0x7f092238, float:1.822819E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.f232448b = r3
            android.view.View$OnClickListener r4 = r6.f232430r
            r3.setOnClickListener(r4)
            r3 = 2131305030(0x7f092246, float:1.822822E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.f232449c = r3
            android.view.View$OnClickListener r4 = r6.f232431s
            r3.setOnClickListener(r4)
            r3 = 2131305028(0x7f092244, float:1.8228215E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232450d = r3
            r3 = 2131305018(0x7f09223a, float:1.8228195E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232451e = r3
            r3 = 2131305020(0x7f09223c, float:1.82282E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232452f = r3
            r3 = 2131305023(0x7f09223f, float:1.8228205E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f232453g = r3
            r3 = 2131306583(0x7f092857, float:1.823137E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f232457k = r3
            android.content.Context r4 = r6.f232427o
            r5 = 2131756444(0x7f10059c, float:1.9143796E38)
            android.content.res.Resources r7 = r4.getResources()
            r8 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r7 = r7.getColor(r8)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r7)
            r3.setImageDrawable(r4)
            r3 = 2131305027(0x7f092243, float:1.8228213E38)
            android.view.View r3 = r1.findViewById(r3)
            r2.f232458l = r3
            r1.setTag(r2)
            r7 = r1
            goto L_0x00ca
        L_0x00c1:
            java.lang.Object r1 = r27.getTag()
            r2 = r1
            yw2.b$g r2 = (yw2.C79154b.C79163g) r2
            r7 = r27
        L_0x00ca:
            r8 = r2
            java.lang.Object r1 = r25.getItem(r26)
            r9 = r1
            com.tencent.mm.storage.k3 r9 = (com.tencent.p014mm.storage.C72979k3) r9
            com.tencent.mm.ui.base.MaskLayout r1 = r8.f232447a
            android.view.View r1 = r1.getContentView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            java.lang.String r3 = r9.field_talker
            r2.mo106849z(r1, r3)
            android.widget.TextView r1 = r8.f232454h
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r6.f232427o
            java.lang.String r4 = r9.field_displayName
            android.widget.TextView r5 = r8.f232454h
            float r5 = r5.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r4, r5)
            r1.setText(r2)
            long r11 = r9.field_fmsgSysRowId
            r1 = 0
            r5 = 2
            java.lang.String r4 = "MicroMsg.FMessageConversationUI"
            r14 = 8
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x0172
            java.lang.String r10 = "getView, fconv fmsgSysRowId is invalid, try getLastFmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r10)
            com.tencent.mm.storage.n3 r10 = fd0.C75743h.wx0()
            java.lang.String r11 = r9.field_talker
            com.tencent.mm.storage.m3 r10 = r10.mo101187Ow(r11)
            if (r10 != 0) goto L_0x014e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getView, lastFmsg is null, talker = "
            r0.append(r1)
            java.lang.String r1 = r9.field_talker
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            android.widget.Button r0 = r8.f232448b
            r0.setVisibility(r14)
            android.widget.Button r0 = r8.f232449c
            r0.setVisibility(r14)
            android.widget.TextView r0 = r8.f232450d
            r0.setVisibility(r14)
            android.widget.TextView r0 = r8.f232451e
            r0.setVisibility(r14)
            android.widget.TextView r0 = r8.f232455i
            r0.setVisibility(r14)
            return r7
        L_0x014e:
            android.content.Context r11 = r6.f232427o
            ae3.b r10 = ae3.C67030b.m79187b(r11, r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getView, lastFmsg talker = "
            r11.append(r12)
            java.lang.String r12 = r9.field_talker
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r23 = r0
            r24 = r7
            r27 = r8
            r8 = 0
            goto L_0x01c7
        L_0x0172:
            android.content.Context r10 = r6.f232427o
            int r13 = r9.field_fmsgIsSend
            int r13 = r13 % r5
            if (r13 != 0) goto L_0x017b
            r13 = 1
            goto L_0x017c
        L_0x017b:
            r13 = 0
        L_0x017c:
            java.lang.String r14 = r9.field_talker
            java.lang.String r15 = r9.field_fmsgContent
            int r1 = r9.field_fmsgType
            java.lang.String r2 = r9.field_contentFromUsername
            java.lang.String r5 = r9.field_contentNickname
            java.lang.String r3 = r9.field_contentPhoneNumMD5
            r23 = r0
            java.lang.String r0 = r9.field_contentFullPhoneNumMD5
            java.lang.String r6 = r9.field_contentVerifyContent
            r24 = r7
            int r7 = r9.field_addScene
            r27 = r8
            r8 = 0
            r16 = r1
            r17 = r2
            r18 = r5
            r19 = r3
            r20 = r0
            r21 = r6
            r22 = r7
            ae3.b r10 = ae3.C67030b.m79186a(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getView, lastFmsg sysrowid = "
            r0.append(r1)
            long r1 = r9.field_fmsgSysRowId
            r0.append(r1)
            java.lang.String r1 = ", talker = "
            r0.append(r1)
            java.lang.String r1 = r9.field_talker
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x01c7:
            int r0 = r9.field_state
            r1 = 1
            if (r0 != r1) goto L_0x01f0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r1 = r9.field_talker
            com.tencent.mm.storage.z1 r0 = r0.get(r1)
            if (r0 == 0) goto L_0x01f0
            long r1 = r0.f108320R1
            int r2 = (int) r1
            if (r2 == 0) goto L_0x01f0
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x01f0
            com.tencent.mm.storage.l3 r0 = fd0.C75743h.vx0()
            java.lang.String r1 = r9.field_talker
            r0.mo101171bF(r1, r8)
        L_0x01f0:
            if (r10 != 0) goto L_0x0226
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getView, fProvider is null, talker = "
            r0.append(r1)
            java.lang.String r1 = r9.field_talker
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r6 = r27
            android.widget.Button r0 = r6.f232448b
            r7 = 8
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232455i
            r0.setVisibility(r7)
            return r24
        L_0x0226:
            r6 = r27
            r7 = 8
            int r0 = r9.field_addScene
            r10.f192526c = r0
            boolean r0 = r10.f192529f
            if (r0 == 0) goto L_0x025c
            android.widget.TextView r0 = r6.f232455i
            r11 = r25
            android.content.Context r1 = r11.f232427o
            r2 = 2131830291(0x7f112613, float:1.9293575E38)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            di3.d r3 = di3.C86312j.m106911c(r23)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r12 = r11.f232427o
            java.lang.String r13 = r10.f192525b
            android.widget.TextView r14 = r6.f232455i
            float r14 = r14.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r12, r13, r14)
            r5[r8] = r3
            java.lang.String r1 = r1.getString(r2, r5)
            r0.setText(r1)
            goto L_0x0277
        L_0x025c:
            r11 = r25
            android.widget.TextView r0 = r6.f232455i
            di3.d r1 = di3.C86312j.m106911c(r23)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r2 = r11.f232427o
            java.lang.String r3 = r10.f192525b
            android.widget.TextView r5 = r6.f232455i
            float r5 = r5.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r2, r3, r5)
            r0.setText(r1)
        L_0x0277:
            android.widget.TextView r0 = r6.f232455i
            yw2.b$a r1 = new yw2.b$a
            r1.<init>(r11, r6)
            r0.post(r1)
            int r0 = r9.field_state
            r1 = 2
            if (r0 != r1) goto L_0x02db
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r11.f232428p
            java.lang.String r1 = r9.field_talker
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x02db
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r1 = r9.field_talker
            com.tencent.mm.storage.z1 r0 = r0.get(r1)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r11.f232428p
            java.lang.String r2 = r0.getUsername()
            boolean r3 = r0.mo62927s3()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.put(r2, r3)
            boolean r1 = r0.mo62927s3()
            if (r1 == 0) goto L_0x02db
            r1 = 1
            r9.field_state = r1
            java.lang.String r1 = r0.getUsername()
            java.lang.String r2 = r0.mo73978v2()
            com.tencent.p014mm.plugin.profile.C70142g.m82635g(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error status update username = "
            r1.append(r2)
            java.lang.String r0 = r0.getUsername()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x02db:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r1 = 259200(0x3f480, float:3.63217E-40)
            java.lang.String r2 = "VerifyUserTicketTimeExceed"
            int r0 = r0.mo107404b(r2, r1)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expired time , defaultExpireTime = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r2 = r9.field_state
            if (r2 == 0) goto L_0x0310
            r3 = 2
            if (r2 != r3) goto L_0x031d
        L_0x0310:
            long r2 = eb0.C31543z5.m39453c()
            long r12 = r9.field_lastModifiedTime
            long r2 = r2 - r12
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x031d
            r15 = 1
            goto L_0x031e
        L_0x031d:
            r15 = 0
        L_0x031e:
            int r0 = r9.field_state
            r1 = 2
            if (r0 != r1) goto L_0x032c
            if (r15 == 0) goto L_0x032c
            java.lang.String r0 = "isStateVerifyingButExpiretime"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r12 = 1
            goto L_0x032d
        L_0x032c:
            r12 = 0
        L_0x032d:
            r13 = 3
            if (r15 == 0) goto L_0x0332
            r0 = 3
            goto L_0x0334
        L_0x0332:
            int r0 = r9.field_state
        L_0x0334:
            r9.field_state = r0
            if (r0 == 0) goto L_0x03ae
            r3 = 1
            if (r0 == r3) goto L_0x0392
            r5 = 2
            if (r0 == r5) goto L_0x0376
            if (r0 == r13) goto L_0x035b
            android.widget.TextView r0 = r6.f232453g
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r7)
            goto L_0x0426
        L_0x035b:
            android.widget.TextView r0 = r6.f232453g
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r7)
            goto L_0x0426
        L_0x0376:
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232453g
            r0.setVisibility(r7)
            r15 = 1
            goto L_0x0427
        L_0x0392:
            r5 = 2
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232453g
            r0.setVisibility(r7)
            goto L_0x0426
        L_0x03ae:
            r3 = 1
            r5 = 2
            long r0 = r9.field_fmsgSysRowId
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x03ce
            java.lang.String r0 = "getView, fmsgSysRowId invalid, try use lastRecvFmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            com.tencent.mm.storage.n3 r0 = fd0.C75743h.wx0()
            java.lang.String r1 = r10.f192524a
            com.tencent.mm.storage.m3 r0 = r0.mo101190bD(r1)
            if (r0 != 0) goto L_0x03cb
            r15 = 0
            goto L_0x03d0
        L_0x03cb:
            int r15 = r0.field_type
            goto L_0x03d0
        L_0x03ce:
            int r15 = r9.field_recvFmsgType
        L_0x03d0:
            if (r15 != 0) goto L_0x03e2
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232448b
            r0.setTag(r10)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            goto L_0x0417
        L_0x03e2:
            if (r15 != r13) goto L_0x0408
            boolean r0 = r10.f192529f
            if (r0 == 0) goto L_0x03f8
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232449c
            r0.setTag(r10)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
            goto L_0x0417
        L_0x03f8:
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232448b
            r0.setTag(r10)
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r7)
            goto L_0x0417
        L_0x0408:
            android.widget.Button r0 = r6.f232449c
            r0.setVisibility(r8)
            android.widget.Button r0 = r6.f232449c
            r0.setTag(r10)
            android.widget.Button r0 = r6.f232448b
            r0.setVisibility(r7)
        L_0x0417:
            android.widget.TextView r0 = r6.f232450d
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232451e
            r0.setVisibility(r7)
            android.widget.TextView r0 = r6.f232453g
            r0.setVisibility(r7)
        L_0x0426:
            r15 = 0
        L_0x0427:
            r0 = 2131305025(0x7f092241, float:1.822821E38)
            r10 = r24
            android.view.View r0 = r10.findViewById(r0)
            r1 = 2131235728(0x7f081390, float:1.8087658E38)
            r0.setBackgroundResource(r1)
            android.widget.Button r14 = r6.f232448b
            android.widget.Button r2 = r6.f232449c
            com.tencent.mm.ui.base.MaskLayout r1 = r6.f232447a
            r0 = 2131305024(0x7f092240, float:1.8228207E38)
            android.view.View r0 = r10.findViewById(r0)
            yw2.b$b r13 = new yw2.b$b
            r28 = r0
            r0 = r13
            r16 = r1
            r1 = r25
            r17 = r2
            r2 = r28
            r3 = r14
            r14 = r4
            r4 = r17
            r5 = r16
            r0.<init>(r2, r3, r4, r5)
            r0 = r28
            r0.post(r13)
            long r0 = eb0.C31543z5.m39453c()
            r2 = 259200000(0xf731400, double:1.280618154E-315)
            if (r26 != 0) goto L_0x0482
            long r4 = r9.field_lastModifiedTime
            long r4 = r4 + r2
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0482
            android.widget.TextView r0 = r6.f232452f
            r0.setVisibility(r8)
            android.widget.TextView r0 = r6.f232452f
            android.content.Context r1 = r11.f232427o
            r2 = 2131830294(0x7f112616, float:1.9293581E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            goto L_0x04b9
        L_0x0482:
            if (r26 == 0) goto L_0x0493
            int r4 = r26 + -1
            java.lang.Object r4 = r11.getItem(r4)
            com.tencent.mm.storage.k3 r4 = (com.tencent.p014mm.storage.C72979k3) r4
            long r4 = r4.field_lastModifiedTime
            long r4 = r4 + r2
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x04b4
        L_0x0493:
            java.lang.Object r4 = r25.getItem(r26)
            com.tencent.mm.storage.k3 r4 = (com.tencent.p014mm.storage.C72979k3) r4
            long r4 = r4.field_lastModifiedTime
            long r4 = r4 + r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x04b4
            android.widget.TextView r0 = r6.f232452f
            r0.setVisibility(r8)
            android.widget.TextView r0 = r6.f232452f
            android.content.Context r1 = r11.f232427o
            r2 = 2131830293(0x7f112615, float:1.929358E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            goto L_0x04b9
        L_0x04b4:
            android.widget.TextView r0 = r6.f232452f
            r0.setVisibility(r7)
        L_0x04b9:
            android.widget.TextView r0 = r6.f232450d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04c3
            r3 = 1
            goto L_0x04c4
        L_0x04c3:
            r3 = 0
        L_0x04c4:
            int r0 = r9.field_state
            r1 = 1
            if (r1 != r0) goto L_0x0528
            java.util.HashMap<java.lang.String, com.tencent.mm.storage.m3> r0 = r11.f232429q
            java.lang.String r2 = r9.field_talker
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L_0x04f0
            com.tencent.mm.storage.n3 r0 = fd0.C75743h.wx0()
            java.lang.String r2 = r9.field_talker
            com.tencent.mm.storage.m3 r0 = r0.mo101187Ow(r2)
            java.util.HashMap<java.lang.String, com.tencent.mm.storage.m3> r2 = r11.f232429q
            java.lang.String r4 = r9.field_talker
            r2.put(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = r9.field_talker
            r0[r8] = r2
            java.lang.String r2 = "put item.field_talker = %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
            goto L_0x04fb
        L_0x04f0:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = r9.field_talker
            r0[r8] = r2
            java.lang.String r2 = "get item.field_talker = %s,"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
        L_0x04fb:
            java.util.HashMap<java.lang.String, com.tencent.mm.storage.m3> r0 = r11.f232429q
            java.lang.String r2 = r9.field_talker
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.storage.m3 r0 = (com.tencent.p014mm.storage.C72985m3) r0
            if (r0 == 0) goto L_0x0528
            int r2 = r0.field_isSend
            if (r2 != r1) goto L_0x0512
            int r2 = r0.field_type
            if (r2 == r1) goto L_0x0510
            goto L_0x0512
        L_0x0510:
            r2 = 2
            goto L_0x0526
        L_0x0512:
            boolean r2 = r0.mo101179l2()
            if (r2 == 0) goto L_0x051d
            int r2 = r0.field_type
            r4 = 3
            if (r2 == r4) goto L_0x0510
        L_0x051d:
            int r2 = r0.field_isSend
            if (r2 != r1) goto L_0x0528
            int r0 = r0.field_type
            r2 = 2
            if (r0 != r2) goto L_0x0529
        L_0x0526:
            r0 = 1
            goto L_0x052a
        L_0x0528:
            r2 = 2
        L_0x0529:
            r0 = 0
        L_0x052a:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5[r8] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r5[r1] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r5[r2] = r4
            java.lang.String r4 = "isShowVerifyingButtton = %s. isStateVerifyingButExpiretime =  %s, isAddedButonIsend =  %s, "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r5)
            if (r3 != 0) goto L_0x0551
            if (r12 != 0) goto L_0x0551
            if (r0 == 0) goto L_0x054b
            goto L_0x0551
        L_0x054b:
            android.widget.ImageView r0 = r6.f232457k
            r0.setVisibility(r7)
            goto L_0x0556
        L_0x0551:
            android.widget.ImageView r0 = r6.f232457k
            r0.setVisibility(r8)
        L_0x0556:
            android.view.View r0 = r6.f232458l
            android.widget.TextView r3 = r6.f232450d
            r4 = 4
            r3.setVisibility(r4)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            android.widget.TextView r5 = r6.f232450d
            r5.measure(r3, r4)
            android.widget.TextView r3 = r6.f232450d
            int r3 = r3.getMeasuredWidth()
            if (r3 <= 0) goto L_0x0580
            android.content.Context r4 = r11.f232427o
            r5 = 2131165329(0x7f070091, float:1.7944872E38)
            int r4 = kg3.C76577a.m92157h(r4, r5)
            int r3 = r3 + r4
            r0.setMinimumWidth(r3)
        L_0x0580:
            android.widget.TextView r0 = r6.f232450d
            if (r15 == 0) goto L_0x0586
            r15 = 0
            goto L_0x0588
        L_0x0586:
            r15 = 8
        L_0x0588:
            r0.setVisibility(r15)
            int[] r0 = r6.f232459m
            int r3 = r9.field_state
            if (r3 != r1) goto L_0x0593
            r5 = 1
            goto L_0x0594
        L_0x0593:
            r5 = 2
        L_0x0594:
            r0[r8] = r5
            r4 = 3
            if (r3 != r4) goto L_0x059b
            r5 = 2
            goto L_0x059c
        L_0x059b:
            r5 = 1
        L_0x059c:
            r0[r1] = r5
            int r1 = r9.field_addScene
            r0[r2] = r1
            java.lang.String r0 = r9.field_talker
            r6.f232460n = r0
            android.widget.TextView r0 = r6.f232456j
            yw2.b$c r1 = new yw2.b$c
            r1.<init>(r11, r6)
            r0.setOnClickListener(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C79154b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo7998r(C75743h.vx0().getAll());
            notifyDataSetChanged();
            return;
        }
        MMHandlerThread.postToMainThread(new C79158d());
    }
}

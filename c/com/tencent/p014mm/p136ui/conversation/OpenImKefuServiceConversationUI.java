package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import fn3.C45804b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46020f;
import he0.C46021h;
import he0.C46027q;
import j20.C117292a;
import k20.C9556a;
import kb0.C76529i;
import kg3.C76577a;
import kj3.C76592n;
import kj3.C76593o;
import kotlin.Metadata;
import l31.C61212e;
import lb0.C88394b;
import ne0.C47224a;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C90449z73;
import uo3.C78253a;
import vo3.C90852c;
import wc3.C78538u;
import zj3.C79387w;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI;", "<init>", "()V", "a", "OpenImKefuChattingUIFragment", "OpenImKefuServiceConversationFmUI", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI */
public final class OpenImKefuServiceConversationUI extends BaseConversationUI {

    /* renamed from: j */
    public static final C44924a f121846j = new C44924a((C8480h) null);

    /* renamed from: d */
    public View f121847d;

    /* renamed from: e */
    public boolean f121848e;

    /* renamed from: f */
    public final C13601g f121849f = C36568h.m40985a(new C44930e(this));

    /* renamed from: g */
    public final C13601g f121850g = C36568h.m40985a(new C44929d(this));

    /* renamed from: h */
    public final C13601g f121851h = C36568h.m40985a(new C44927b(this));

    /* renamed from: i */
    public final C13601g f121852i = C36568h.m40985a(new C44928c(this));

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI$BaseConversationFmUI;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI */
    public static final class OpenImKefuServiceConversationFmUI extends BaseConversationUI.BaseConversationFmUI implements MStorageEx.IOnStorageChange {

        /* renamed from: d */
        public String f121853d;

        /* renamed from: e */
        public TextView f121854e;

        /* renamed from: f */
        public ListView f121855f;

        /* renamed from: g */
        public C44997m1 f121856g;

        /* renamed from: h */
        public String f121857h = "";

        /* renamed from: i */
        public C72976h2 f121858i;

        /* renamed from: j */
        public boolean f121859j;

        /* renamed from: n */
        public C78253a f121860n;

        /* renamed from: o */
        public int f121861o;

        /* renamed from: p */
        public int f121862p;

        /* renamed from: q */
        public boolean f121863q = true;

        /* renamed from: r */
        public final C11184p0 f121864r = new C44923a(this);

        /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$a */
        public static final class C44923a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ OpenImKefuServiceConversationFmUI f121865d;

            public C44923a(OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
                this.f121865d = openImKefuServiceConversationFmUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                String str = null;
                boolean z = false;
                if (itemId == 1) {
                    OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f121865d;
                    String str2 = openImKefuServiceConversationFmUI.f121857h;
                    openImKefuServiceConversationFmUI.getClass();
                    if (str2 == null || str2.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "closeConversation talker invalid");
                        return;
                    }
                    C45804b.m51082a(3, str2, openImKefuServiceConversationFmUI.f121858i);
                    Activity context = openImKefuServiceConversationFmUI.getContext();
                    Activity context2 = openImKefuServiceConversationFmUI.getContext();
                    String string = context2 != null ? context2.getString(C0966R.string.hez) : null;
                    Activity context3 = openImKefuServiceConversationFmUI.getContext();
                    String string2 = context3 != null ? context3.getString(C0966R.string.hex) : null;
                    Activity context4 = openImKefuServiceConversationFmUI.getContext();
                    if (context4 != null) {
                        str = context4.getString(C0966R.string.f7926wf);
                    }
                    C76879j.m92708B(context, string, "", string2, str, new C45011u1(str2, openImKefuServiceConversationFmUI), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                } else if (itemId == 2) {
                    OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI2 = this.f121865d;
                    String str3 = openImKefuServiceConversationFmUI2.f121857h;
                    openImKefuServiceConversationFmUI2.getClass();
                    if (str3 == null || str3.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "deleteConversationAndMsg talker invalid");
                        return;
                    }
                    C45804b.m51082a(1, str3, openImKefuServiceConversationFmUI2.f121858i);
                    Activity context5 = openImKefuServiceConversationFmUI2.getContext();
                    Activity context6 = openImKefuServiceConversationFmUI2.getContext();
                    String string3 = context6 != null ? context6.getString(C0966R.string.eyo) : null;
                    Activity context7 = openImKefuServiceConversationFmUI2.getContext();
                    String string4 = context7 != null ? context7.getString(C0966R.string.f7944x1) : null;
                    Activity context8 = openImKefuServiceConversationFmUI2.getContext();
                    if (context8 != null) {
                        str = context8.getString(C0966R.string.f7926wf);
                    }
                    C76879j.m92708B(context5, string3, "", string4, str, new C45014v1(str3, openImKefuServiceConversationFmUI2), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                }
            }
        }

        public int getLayoutId() {
            return C0966R.C0971layout.b4l;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r4 = r4.getIntent();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityCreated(android.os.Bundle r4) {
            /*
                r3 = this;
                super.onActivityCreated(r4)
                androidx.fragment.app.FragmentActivity r4 = r3.thisActivity()
                if (r4 == 0) goto L_0x0016
                android.content.Intent r4 = r4.getIntent()
                if (r4 == 0) goto L_0x0016
                java.lang.String r0 = "Contact_User"
                java.lang.String r4 = r4.getStringExtra(r0)
                goto L_0x0017
            L_0x0016:
                r4 = 0
            L_0x0017:
                r3.f121853d = r4
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r4
                java.lang.String r4 = "MicroMsg.OpenImKefuServiceConversationUI"
                java.lang.String r1 = "alvinluo startOpenImKefuServiceConversationUI superUsername: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
                r4 = 2131833835(0x7f1133eb, float:1.9300763E38)
                java.lang.String r4 = r3.getString(r4)
                r3.setMMTitle((java.lang.String) r4)
                r4 = 2131300459(0x7f09106b, float:1.8218948E38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.ListView r4 = (android.widget.ListView) r4
                r3.f121855f = r4
                r4 = 2131301625(0x7f0914f9, float:1.8221313E38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f121854e = r4
                if (r4 == 0) goto L_0x004e
                r0 = 2131833836(0x7f1133ec, float:1.9300765E38)
                r4.setText(r0)
            L_0x004e:
                com.tencent.mm.ui.conversation.b2 r4 = new com.tencent.mm.ui.conversation.b2
                r4.<init>(r3)
                r3.setBackBtn(r4)
                com.tencent.mm.ui.conversation.m1 r4 = new com.tencent.mm.ui.conversation.m1
                java.lang.String r0 = r3.f121853d
                androidx.fragment.app.FragmentActivity r1 = r3.thisActivity()
                com.tencent.mm.ui.conversation.x1 r2 = new com.tencent.mm.ui.conversation.x1
                r2.<init>(r3)
                r4.<init>(r0, r1, r2)
                r3.f121856g = r4
                android.widget.ListView r0 = r3.f121855f
                if (r0 != 0) goto L_0x006d
                goto L_0x0070
            L_0x006d:
                r0.setAdapter(r4)
            L_0x0070:
                android.widget.ListView r4 = r3.f121855f
                if (r4 == 0) goto L_0x007c
                com.tencent.mm.ui.conversation.y1 r0 = new com.tencent.mm.ui.conversation.y1
                r0.<init>(r3)
                r4.setOnItemClickListener(r0)
            L_0x007c:
                android.widget.ListView r4 = r3.f121855f
                if (r4 == 0) goto L_0x0088
                com.tencent.mm.ui.conversation.z1 r0 = new com.tencent.mm.ui.conversation.z1
                r0.<init>(r3)
                r4.setOnTouchListener(r0)
            L_0x0088:
                uo3.a r4 = new uo3.a
                androidx.fragment.app.FragmentActivity r0 = r3.thisActivity()
                r4.<init>(r0)
                r3.f121860n = r4
                android.widget.ListView r4 = r3.f121855f
                if (r4 == 0) goto L_0x009f
                com.tencent.mm.ui.conversation.a2 r0 = new com.tencent.mm.ui.conversation.a2
                r0.<init>(r3)
                r4.setOnItemLongClickListener(r0)
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI.onActivityCreated(android.os.Bundle):void");
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108594g(contextMenu, "menu");
            C87412m.m108594g(view, "v");
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f121857h);
            if (z1Var == null) {
                Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f121857h);
                return;
            }
            C87412m.m108592e(contextMenuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            if (z1Var.f108320R1 >= 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, C0966R.string.f361116hf2);
            }
            contextMenu.add(adapterContextMenuInfo.position, 2, 0, C0966R.string.gm7);
        }

        public void onDestroy() {
            super.onDestroy();
            C44997m1 m1Var = this.f121856g;
            if (m1Var != null) {
                m1Var.mo70227D();
            }
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        }

        public void onPause() {
            super.onPause();
            C44997m1 m1Var = this.f121856g;
            if (m1Var != null) {
                m1Var.mo103859E();
            }
            ((C119157j) C119157j.f356862d).mo183870a(new C45009t1(this));
        }

        public void onResume() {
            C44997m1 m1Var;
            Log.m105925i("MicroMsg.OpenImKefuServiceConversationUI", "onResume chattingClosed: %s", Boolean.valueOf(this.f219287ui.mChattingClosed));
            super.onResume();
            if (this.f219287ui.mChattingClosed && (m1Var = this.f121856g) != null) {
                m1Var.mo103860F();
            }
            if (this.f121863q) {
                this.f121863q = false;
                ListView listView = this.f121855f;
                if (listView != null) {
                    listView.requestFocus();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$a */
    public static final class C44924a {

        /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$a$a */
        public static final class C44925a implements C46021h.C46022a {

            /* renamed from: a */
            public boolean f121866a;

            /* renamed from: b */
            public C89779i0 f121867b;

            /* renamed from: c */
            public final /* synthetic */ C32226l<C46020f, C13598b0> f121868c;

            /* renamed from: d */
            public final /* synthetic */ BaseConversationUI f121869d;

            /* renamed from: e */
            public final /* synthetic */ boolean f121870e;

            /* renamed from: f */
            public final /* synthetic */ boolean f121871f;

            /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$a$a$a */
            public static final class C44926a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C44925a f121872d;

                public C44926a(C44925a aVar) {
                    this.f121872d = aVar;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    Log.m105924i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting loading cancel");
                    this.f121872d.f121866a = true;
                }
            }

            public C44925a(C32226l<? super C46020f, C13598b0> lVar, BaseConversationUI baseConversationUI, boolean z, boolean z2) {
                this.f121868c = lVar;
                this.f121869d = baseConversationUI;
                this.f121870e = z;
                this.f121871f = z2;
            }

            /* renamed from: a */
            public void mo33215a(C46027q qVar) {
                C46020f fVar = qVar != null ? qVar.f124111d : null;
                this.f121868c.invoke(fVar);
                Object[] objArr = new Object[2];
                objArr[0] = fVar != null ? Boolean.valueOf(fVar.isValid()) : null;
                boolean z = true;
                objArr[1] = Boolean.valueOf(this.f121866a);
                Log.m105925i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting getContact %s, isCancelled: %b", objArr);
                C89779i0 i0Var = this.f121867b;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (!this.f121866a) {
                    if (fVar != null && fVar.isValid()) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("finish_direct", true);
                        this.f121869d.startChatting(fVar.getUsername(), bundle, this.f121870e, this.f121871f);
                        return;
                    }
                }
                if (qVar == null || qVar.f124109b != -3601) {
                    z = false;
                }
                if (z) {
                    String string = this.f121869d.getResources().getString(C0966R.string.hfb);
                    C87412m.m108593f(string, "context.resources.getStr…firm_get_contact_deleted)");
                    String string2 = this.f121869d.getResources().getString(C0966R.string.f8028zq);
                    C87412m.m108593f(string2, "context.resources.getStr…mmui.R.string.app_i_know)");
                    C76879j.m92754y(this.f121869d, "", string, string2, (DialogInterface.OnClickListener) null);
                    return;
                }
                BaseConversationUI baseConversationUI = this.f121869d;
                C76912y0.makeText((Context) baseConversationUI, (CharSequence) baseConversationUI.getResources().getString(C0966R.string.hfd), 0).show();
            }

            /* renamed from: b */
            public void mo33216b(String str) {
                Log.m105924i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting try fetch contact, show loading");
                BaseConversationUI baseConversationUI = this.f121869d;
                this.f121867b = C76879j.m92723Q(baseConversationUI, "", baseConversationUI.getString(C0966R.string.a4d), true, true, new C44926a(this));
            }
        }

        public C44924a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo70221a(BaseConversationUI baseConversationUI, String str, boolean z, boolean z2, C32226l<? super C46020f, C13598b0> lVar) {
            Log.m105924i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting username: " + str + ", needAnim: " + z + ", post: " + z2);
            if (str == null || str.length() == 0) {
                Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting talker is empty");
            } else {
                ((C46021h) C86312j.m106911c(C46021h.class)).Ss0(str, new C44925a(lVar, baseConversationUI, z, z2));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$b */
    public static final class C44927b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceConversationUI f121873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44927b(OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
            super(0);
            this.f121873d = openImKefuServiceConversationUI;
        }

        public Object invoke() {
            Intent intent = this.f121873d.getIntent();
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("key_back_to_launcher_ui_when_finish", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$c */
    public static final class C44928c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceConversationUI f121874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44928c(OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
            super(0);
            this.f121874d = openImKefuServiceConversationUI;
        }

        public Object invoke() {
            Intent intent = this.f121874d.getIntent();
            int i = -1;
            if (intent != null) {
                i = intent.getIntExtra("open_im_kefu_conversation_list_ui_from_scene", -1);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$d */
    public static final class C44929d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceConversationUI f121875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44929d(OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
            super(0);
            this.f121875d = openImKefuServiceConversationUI;
        }

        public Object invoke() {
            Intent intent = this.f121875d.getIntent();
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("key_is_confirm_page_shown", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$e */
    public static final class C44930e extends C87413o implements C32224a<OpenIMKefuStartConversationRequest> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceConversationUI f121876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44930e(OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
            super(0);
            this.f121876d = openImKefuServiceConversationUI;
        }

        public Object invoke() {
            Intent intent = this.f121876d.getIntent();
            if (intent != null) {
                return (OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request");
            }
            return null;
        }
    }

    /* renamed from: H7 */
    public final int mo70219H7() {
        return ((Number) ((C36570n) this.f121852i).getValue()).intValue();
    }

    /* renamed from: I7 */
    public final OpenIMKefuStartConversationRequest mo70220I7() {
        return (OpenIMKefuStartConversationRequest) ((C36570n) this.f121849f).getValue();
    }

    public ChattingUIFragment getChattingUIFragment() {
        return new OpenImKefuChattingUIFragment();
    }

    public void onBackPressed() {
        boolean z = false;
        if (((Boolean) ((C36570n) this.f121851h).getValue()).booleanValue()) {
            Intent intent = new Intent(this, LauncherUI.class);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
            finish();
            z = true;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C78538u.m94869e(this, this.f121847d);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6655kx, (ViewGroup) null);
        this.f121847d = inflate;
        setContentView(inflate);
        this.conversationFm = new OpenImKefuServiceConversationFmUI();
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165167i(C0966R.C0970id.gvl, this.conversationFm, (String) null, 1);
        beginTransaction.mo165162d();
        C78538u.m94869e(this, this.f121847d);
        this.f121848e = false;
        C47224a.m52533d(2);
        if (mo70219H7() == 1) {
            C47224a.m52533d(1);
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.OpenImKefuServiceConversationUI).mo86179qs(this, C76986a.KFSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        r0 = r0.f108520i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r14 = this;
            super.onResume()
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r0 = r14.mo70220I7()
            r1 = 1
            r2 = 0
            java.lang.String r3 = ""
            r4 = 3
            java.lang.String r5 = "MicroMsg.OpenImKefuServiceConversationUI"
            r6 = 2
            if (r0 == 0) goto L_0x0073
            boolean r0 = r14.f121848e
            if (r0 != 0) goto L_0x00dd
            r14.f121848e = r1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r4 = r14.mo70220I7()
            gy3.C87412m.m108591d(r4)
            int r4 = r4.f108517f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            boolean r2 = r14.f121848e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r1] = r2
            rx3.g r1 = r14.f121850g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "alvinluo handleJump from startConversationRequest getContactScene: %s, hasJumped: %b, isConfirmPageShown: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$a r6 = f121846j
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r0 = r14.mo70220I7()
            if (r0 == 0) goto L_0x0058
            te3.s3 r0 = r0.f108520i
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.f141289h
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 != 0) goto L_0x005d
            r8 = r3
            goto L_0x005e
        L_0x005d:
            r8 = r0
        L_0x005e:
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r0 = r14.mo70220I7()
            gy3.C87412m.m108591d(r0)
            boolean r9 = r0.f108525q
            r10 = 0
            com.tencent.mm.ui.conversation.c2 r11 = new com.tencent.mm.ui.conversation.c2
            r11.<init>(r14)
            r7 = r14
            r6.mo70221a(r7, r8, r9, r10, r11)
            goto L_0x00dd
        L_0x0073:
            android.content.Intent r0 = r14.getIntent()
            if (r0 == 0) goto L_0x0080
            java.lang.String r7 = "open_im_kefu_jump_chatting"
            boolean r0 = r0.getBooleanExtra(r7, r2)
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            if (r0 == 0) goto L_0x00dd
            boolean r7 = r14.f121848e
            if (r7 != 0) goto L_0x00dd
            r14.f121848e = r1
            android.content.Intent r7 = r14.getIntent()
            if (r7 == 0) goto L_0x0099
            java.lang.String r8 = "open_im_kefu_chatting_username"
            java.lang.String r7 = r7.getStringExtra(r8)
            if (r7 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = r7
        L_0x0099:
            int r7 = r14.mo70219H7()
            if (r7 == r6) goto L_0x00a1
            r11 = 1
            goto L_0x00a2
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r14.mo70219H7()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7[r1] = r0
            boolean r0 = r14.f121848e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7[r4] = r0
            java.lang.String r0 = "alvinluo handleJump fromScene: %s, needJump: %b, hasJumped: %b, neeChattingAnim: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)
            com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$a r8 = f121846j
            r12 = 0
            com.tencent.mm.ui.conversation.q1 r13 = com.tencent.p014mm.p136ui.conversation.C45001q1.f122062d
            r9 = r14
            r10 = r3
            r8.mo70221a(r9, r10, r11, r12, r13)
            int r0 = r14.mo70219H7()
            if (r0 != r6) goto L_0x00dd
            r0 = 25
            ne0.C47224a.m52531b(r3, r0, r2)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI.onResume():void");
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment;", "Lcom/tencent/mm/ui/chatting/ChattingUIFragment;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment */
    public static final class OpenImKefuChattingUIFragment extends ChattingUIFragment {

        /* renamed from: R */
        public C76593o f121877R;

        /* renamed from: S */
        public final C90449z73 f121878S = new C90449z73();

        /* renamed from: T */
        public byte[] f121879T;

        /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment$a */
        public static final class C44931a implements C76593o.C76594a {

            /* renamed from: a */
            public final /* synthetic */ OpenImKefuChattingUIFragment f121880a;

            public C44931a(OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
                this.f121880a = openImKefuChattingUIFragment;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: org.json.JSONObject} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: org.json.JSONObject} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: org.json.JSONObject} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo70225a() {
                /*
                    r5 = this;
                    com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment r0 = r5.f121880a
                    r0.hideVKB()
                    com.tencent.mm.ui.conversation.o1 r0 = com.tencent.p014mm.p136ui.conversation.C74718o1.f219681a
                    com.tencent.mm.ui.conversation.l1 r1 = new com.tencent.mm.ui.conversation.l1
                    com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment r2 = r5.f121880a
                    ck3.b r2 = r2.f215220f
                    java.lang.String r3 = "chattingContext"
                    gy3.C87412m.m108593f(r2, r3)
                    com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment r3 = r5.f121880a
                    te3.z73 r4 = r3.f121878S
                    byte[] r3 = r3.f121879T
                    r1.<init>(r2, r4, r3)
                    com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment r2 = r5.f121880a
                    te3.z73 r2 = r2.f121878S
                    java.lang.String r2 = r2.f259968x
                    r3 = 0
                    if (r2 == 0) goto L_0x0045
                    kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0030 }
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0030 }
                    r4.<init>(r2)     // Catch:{ all -> 0x0030 }
                    java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r4)     // Catch:{ all -> 0x0030 }
                    goto L_0x003b
                L_0x0030:
                    r2 = move-exception
                    kotlin.Result$Companion r4 = kotlin.Result.Companion
                    java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                    java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
                L_0x003b:
                    boolean r4 = kotlin.Result.m168120isFailureimpl(r2)
                    if (r4 == 0) goto L_0x0042
                    goto L_0x0043
                L_0x0042:
                    r3 = r2
                L_0x0043:
                    org.json.JSONObject r3 = (org.json.JSONObject) r3
                L_0x0045:
                    r0.mo103866a(r1, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment.C44931a.mo70225a():void");
            }
        }

        public OpenImKefuChattingUIFragment() {
        }

        /* renamed from: P */
        public void mo70223P() {
            byte[] bArr;
            super.mo70223P();
            try {
                byte[] byteArrayExtra = getByteArrayExtra("key_appbrand_chat_info");
                if (byteArrayExtra != null) {
                    this.f121878S.parseFrom(byteArrayExtra);
                }
                try {
                    Bitmap createBitmap = BitmapUtil.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(-1);
                    bArr = BitmapUtil.Bitmap2Bytes(createBitmap);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BaseChattingUIFragment", e, "obtainMessageDefaultImg fail", new Object[0]);
                    bArr = new byte[0];
                }
                this.f121879T = bArr;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.BaseChattingUIFragment", e2, "parse OpenIMStartChattingExtraInfo exception", new Object[0]);
            }
        }

        public void onViewAttachedToWindow(View view) {
            Class cls = C76529i.class;
            super.onViewAttachedToWindow(view);
            if (this.f121878S.f259951d) {
                boolean z = false;
                if (this.f121877R == null) {
                    ChatFooter k1 = ((C79387w) this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1();
                    C76593o oVar = new C76593o(getActivity(), k1, k1);
                    this.f121877R = oVar;
                    oVar.f224184q = false;
                }
                C90449z73 z732 = this.f121878S;
                Log.m105925i("MicroMsg.BaseChattingUIFragment", "appBrandServiceImageBubble %s, %s", z732.f259956i, z732.f259954g);
                String str = this.f121878S.f259967w;
                if (!(str == null || str.length() == 0)) {
                    C76593o oVar2 = this.f121877R;
                    C87412m.m108591d(oVar2);
                    oVar2.f224178h.setText(this.f121878S.f259967w);
                }
                String str2 = this.f121878S.f259956i;
                if (!(str2 == null || str2.length() == 0)) {
                    String str3 = C88394b.f255384g;
                    C88394b bVar = C88394b.C88418q.f255427a;
                    C76593o oVar3 = this.f121877R;
                    C87412m.m108591d(oVar3);
                    bVar.mo122797p(oVar3, "file://" + this.f121878S.f259956i, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).Ij0(C76577a.m92151b(getContext(), 75), C76577a.m92151b(getContext(), 60)));
                } else {
                    String str4 = this.f121878S.f259954g;
                    if (str4 == null || str4.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        String str5 = C88394b.f255384g;
                        C88394b bVar2 = C88394b.C88418q.f255427a;
                        C76593o oVar4 = this.f121877R;
                        C87412m.m108591d(oVar4);
                        bVar2.mo122797p(oVar4, this.f121878S.f259954g, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).Ij0(C76577a.m92151b(getContext(), 75), C76577a.m92151b(getContext(), 60)));
                    }
                }
                C76593o oVar5 = this.f121877R;
                C87412m.m108591d(oVar5);
                oVar5.f224185r = new C44931a(this);
                C76593o oVar6 = this.f121877R;
                C87412m.m108591d(oVar6);
                Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "show");
                C86709a0.m107525e().postToWorker(new C76592n(oVar6));
            }
        }

        public OpenImKefuChattingUIFragment(boolean z) {
            super(z);
        }
    }
}

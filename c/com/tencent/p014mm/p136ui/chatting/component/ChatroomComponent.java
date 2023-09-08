package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatroomMemberDataUpdatedEvent;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TrackRemoveTipEvent;
import com.tencent.p014mm.chatroom.p015ui.DelChatroomMemberUI;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.roomsdk.model.factory.C72946e;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C75604z3;
import eb0.C97625j3;
import ed0.C75610d;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nm2.C25231f;
import ob0.C11385n;
import ob0.C117747y;
import p195li.C46860d;
import p270xi.C91212b;
import p530fx.C45819c;
import p530fx.C75818e;
import p644pi.C77089d;
import p740wo.C53193b;
import p910lj.C76701a;
import pg3.C35488c;
import pg3.C77084b;
import pg3.C77085e;
import pg3.C77086f;
import qe0.C47802c;
import qo3.C77407n;
import sb0.C48340e;
import t22.C118355y;
import te3.C51866wq2;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79357g;
import zt3.C119157j;

@C91212b(exportInterface = C79357g.class)
/* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent */
public class ChatroomComponent extends C73412a implements C79357g, C11385n, MStorageEx.IOnStorageChange {

    /* renamed from: t */
    public static int f215454t = -1;

    /* renamed from: e */
    public boolean f215455e = false;

    /* renamed from: f */
    public Map<String, String> f215456f = new HashMap();

    /* renamed from: g */
    public ProgressDialog f215457g = null;

    /* renamed from: h */
    public ProgressDialog f215458h = null;

    /* renamed from: i */
    public IListener f215459i;

    /* renamed from: j */
    public final MStorage.IOnStorageChange f215460j;

    /* renamed from: n */
    public IListener f215461n;

    /* renamed from: o */
    public boolean f215462o;

    /* renamed from: p */
    public Integer f215463p;

    /* renamed from: q */
    public C72940a f215464q;

    /* renamed from: r */
    public C72946e f215465r;

    /* renamed from: s */
    public boolean f215466s;

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$f */
    public class C44779f implements Runnable {

        /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$f$a */
        public class C44780a implements C35488c {

            /* renamed from: a */
            public final /* synthetic */ String f121534a;

            public C44780a(String str) {
                this.f121534a = str;
            }

            /* renamed from: a */
            public void mo10150a(int i, int i2, String str, C77084b bVar) {
                C35488c cVar = (C35488c) bVar;
                C67391b bVar2 = ChatroomComponent.this.f215752d;
                String str2 = this.f121534a;
                bVar2.f193282f.mo91586a();
                if (TextUtils.equals(str2, bVar2.mo91577r())) {
                    Log.m105924i("MicroMsg.ActionCallbackFunc", "talker has changed, return");
                } else if (Util.isTopActivity(ChatroomComponent.this.f215752d.mo91565f())) {
                    Log.m105924i("MicroMsg.ActionCallbackFunc", "cpan[refresh top btn]");
                    ChatroomComponent.this.f215462o = ((C53193b) C86312j.m106911c(C53193b.class)).i90(ChatroomComponent.this.f215752d.mo91577r());
                    ((C79343c0) ChatroomComponent.this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102628n3();
                }
            }
        }

        public C44779f() {
        }

        public void run() {
            if (ChatroomComponent.this.f215752d == null) {
                Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomMemberDetail] mChattingContext is null!");
                return;
            }
            C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(ChatroomComponent.this.f215752d.mo91577r());
            if (Lo != null && Lo.mo69798z2()) {
                Log.m105918d("MicroMsg.ChattingUI.ChatroomComponent", "cpan[doScene NetSceneGetChatroomMemberDetail]");
                String r = ChatroomComponent.this.f215752d.mo91577r();
                C72940a l = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(ChatroomComponent.this.f215752d.mo91577r()).mo71501l(ChatroomComponent.this.f215752d.mo91577r(), Lo.mo69791s2());
                l.f212613b = new C44780a(r);
                l.mo100865c();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$g */
    public class C44781g implements MStorage.IOnStorageChange {
        public C44781g() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Class cls = C79348e.class;
            Log.m105926v("MicroMsg.ChattingUI.ChatroomComponent", "roommember watcher notify " + str);
            if (((C79348e) ChatroomComponent.this.f215752d.f193278b.mo102812a(cls)).mo70075s4()) {
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                chatroomComponent.f215462o = C48340e.m53676q(((C79348e) chatroomComponent.f215752d.f193278b.mo102812a(cls)).mo70076s5());
            } else {
                ChatroomComponent.this.f215462o = ((C53193b) C86312j.m106911c(C53193b.class)).i90(ChatroomComponent.this.f215752d.mo91577r());
            }
            ChatroomComponent chatroomComponent2 = ChatroomComponent.this;
            if (chatroomComponent2.f215455e) {
                C45612m0.m50684a(chatroomComponent2.f215752d.mo91577r(), ChatroomComponent.this.f215456f);
            } else {
                ((HashMap) chatroomComponent2.f215456f).clear();
            }
            if (!Util.isNullOrNil(str)) {
                ChatroomComponent.this.f215752d.mo91540A();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$a */
    public class C73330a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f215468d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f215469e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f215470f;

        /* renamed from: g */
        public final /* synthetic */ int f215471g;

        /* renamed from: h */
        public final /* synthetic */ LinkedList f215472h;

        /* renamed from: i */
        public final /* synthetic */ int f215473i;

        /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$a$a */
        public class C73331a extends C77086f {
            public C73331a() {
            }

            /* renamed from: a */
            public void mo10150a(int i, int i2, String str, C77084b bVar) {
                C77086f fVar = (C77086f) bVar;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                objArr[2] = Util.nullAs(str, "");
                objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
                Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
                if (this.f225171a != 0) {
                    ProgressDialog progressDialog = ChatroomComponent.this.f215458h;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    C76879j.m92754y(ChatroomComponent.this.f215752d.mo91565f(), ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.iju), "", ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.a18), new C73509k(this));
                    C73330a aVar = C73330a.this;
                    if (aVar.f215471g == 1) {
                        ChatroomComponent chatroomComponent = ChatroomComponent.this;
                        C72963f4 f4Var = aVar.f215469e;
                        int intValue = chatroomComponent.f215463p.intValue();
                        C73330a aVar2 = C73330a.this;
                        chatroomComponent.mo102158e6(f4Var, intValue, aVar2.f215470f, aVar2.f215472h.size(), 1, 3, (String) C73330a.this.f215470f.get(0));
                        return;
                    }
                    return;
                }
                C73330a aVar3 = C73330a.this;
                ChatroomComponent chatroomComponent2 = ChatroomComponent.this;
                chatroomComponent2.f215464q = ChatroomComponent.m86473Y5(chatroomComponent2, aVar3.f215469e, aVar3.f215470f, aVar3.f215472h, aVar3.f215473i, aVar3.f215471g, true);
            }
        }

        public C73330a(boolean z, C72963f4 f4Var, LinkedList linkedList, int i, LinkedList linkedList2, int i2) {
            this.f215468d = z;
            this.f215469e = f4Var;
            this.f215470f = linkedList;
            this.f215471g = i;
            this.f215472h = linkedList2;
            this.f215473i = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f215468d) {
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                chatroomComponent.f215464q = null;
                C75818e J7 = DelChatroomMemberUI.m80264J7(chatroomComponent.f215752d.mo91577r(), this.f215469e, 2, (String) this.f215470f.get(0), new C73331a());
                ChatroomComponent chatroomComponent2 = ChatroomComponent.this;
                ProgressDialog progressDialog = chatroomComponent2.f215458h;
                if (progressDialog == null) {
                    chatroomComponent2.f215458h = C76879j.m92723Q(chatroomComponent2.f215752d.mo91565f(), chatroomComponent2.f215752d.mo91565f().getString(C0966R.string.a3h), chatroomComponent2.f215752d.mo91565f().getString(C0966R.string.i64), true, true, new C73520l(chatroomComponent2, J7));
                } else {
                    progressDialog.show();
                }
            } else {
                ChatroomComponent.m86473Y5(ChatroomComponent.this, this.f215469e, this.f215470f, this.f215472h, this.f215473i, this.f215471g, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$b */
    public class C73332b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f215476d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f215477e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f215478f;

        public C73332b(int i, C72963f4 f4Var, LinkedList linkedList) {
            this.f215476d = i;
            this.f215477e = f4Var;
            this.f215478f = linkedList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f215476d == 1) {
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                C72963f4 f4Var = this.f215477e;
                int intValue = chatroomComponent.f215463p.intValue();
                LinkedList linkedList = this.f215478f;
                chatroomComponent.mo102158e6(f4Var, intValue, linkedList, 1, 1, 1, (String) linkedList.get(0));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$c */
    public class C73333c implements C35488c {
        public C73333c() {
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C35488c cVar = (C35488c) bVar;
            if (Util.isTopActivity(ChatroomComponent.this.f215752d.mo91565f())) {
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                if (!chatroomComponent.mo102157d6(chatroomComponent.f215752d.mo91565f(), i, i2, str)) {
                    Log.m105919d("MicroMsg.ActionCallbackFunc", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 610, Integer.valueOf(i2), Integer.valueOf(i), Util.nullAsNil(str));
                    C76879j.m92748s(ChatroomComponent.this.f215752d.mo91565f(), ChatroomComponent.this.f215752d.mo91572m().getString(C0966R.string.fs4), ChatroomComponent.this.f215752d.mo91572m().getString(C0966R.string.a3h));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$d */
    public class C73334d extends C77085e {

        /* renamed from: c */
        public final /* synthetic */ C72940a f215481c;

        public C73334d(C72940a aVar) {
            this.f215481c = aVar;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C72963f4 f4Var;
            C77085e eVar = (C77085e) bVar;
            if (Util.isTopActivity(ChatroomComponent.this.f215752d.mo91565f())) {
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                if (!chatroomComponent.mo102157d6(chatroomComponent.f215752d.mo91565f(), i, i2, str) && (f4Var = eVar.f225169a) != null) {
                    f4Var.mo108743W2(f4Var.f230723F | 128);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).yy0(f4Var.mo108774y2(), f4Var);
                    C76701a.makeText((Context) ChatroomComponent.this.f215752d.mo91565f(), (CharSequence) ChatroomComponent.this.f215752d.mo91572m().getString(C0966R.string.fs6), 0).show();
                    if (this.f215481c.f212612a) {
                        C115669n.INSTANCE.idkeyStat(219, 24, (long) eVar.f225170b, true);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$e */
    public class C73335e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72940a f215483d;

        public C73335e(ChatroomComponent chatroomComponent, C72940a aVar) {
            this.f215483d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f215483d.cancel();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$h */
    public class C73336h implements DialogInterface.OnClickListener {
        public C73336h(ChatroomComponent chatroomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$i */
    public class C73337i implements DialogInterface.OnClickListener {
        public C73337i(ChatroomComponent chatroomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$j */
    public class C73338j implements DialogInterface.OnClickListener {
        public C73338j(ChatroomComponent chatroomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$k */
    public class C73339k implements C11182m0 {
        public C73339k() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.i4i));
            e0Var.mo107142f(1, ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.i4j));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$l */
    public class C73340l implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215485d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList f215486e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f215487f;

        /* renamed from: g */
        public final /* synthetic */ int f215488g;

        /* renamed from: h */
        public final /* synthetic */ int f215489h;

        /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$l$a */
        public class C73341a extends C77086f {
            public C73341a() {
            }

            /* renamed from: a */
            public void mo10150a(int i, int i2, String str, C77084b bVar) {
                C77086f fVar = (C77086f) bVar;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                String str2 = "";
                objArr[2] = Util.nullAs(str, str2);
                objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
                Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "revokeRecord errType:%s errCode:%s errMsg:%s ret:%s", objArr);
                ProgressDialog progressDialog = ChatroomComponent.this.f215457g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                String listToString = Util.listToString(C73340l.this.f215487f, ";");
                if (this.f225171a != 0) {
                    if (Util.isNullOrNil(str)) {
                        str = ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.ijx);
                    }
                    if (fVar != null) {
                        str2 = Util.nullAs(fVar.f225172b, str2);
                        str = Util.nullAs(fVar.f225173c, ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.ijx));
                    }
                    C76879j.m92754y(ChatroomComponent.this.f215752d.mo91565f(), str, str2, ChatroomComponent.this.f215752d.mo91565f().getString(C0966R.string.lkg), new C73649x(this));
                    C73340l lVar = C73340l.this;
                    ChatroomComponent.this.mo102158e6(lVar.f215485d, 4, lVar.f215486e, lVar.f215487f.size(), C73340l.this.f215487f.size(), 3, listToString);
                    return;
                }
                C73340l lVar2 = C73340l.this;
                ChatroomComponent.this.mo102158e6(lVar2.f215485d, 4, lVar2.f215486e, lVar2.f215487f.size(), C73340l.this.f215487f.size(), 2, listToString);
            }
        }

        public C73340l(C72963f4 f4Var, LinkedList linkedList, LinkedList linkedList2, int i, int i2) {
            this.f215485d = f4Var;
            this.f215486e = linkedList;
            this.f215487f = linkedList2;
            this.f215488g = i;
            this.f215489h = i2;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                ChatroomComponent.this.f215463p = 3;
                ChatroomComponent.this.mo102153Z5(this.f215485d, this.f215486e, this.f215487f, this.f215488g, this.f215489h, true);
            } else if (itemId == 1) {
                C75818e J7 = DelChatroomMemberUI.m80264J7(ChatroomComponent.this.f215752d.mo91577r(), this.f215485d, 1, (String) null, new C73341a());
                ChatroomComponent chatroomComponent = ChatroomComponent.this;
                ProgressDialog progressDialog = chatroomComponent.f215457g;
                if (progressDialog == null) {
                    chatroomComponent.f215457g = C76879j.m92723Q(chatroomComponent.f215752d.mo91565f(), chatroomComponent.f215752d.mo91565f().getString(C0966R.string.a3h), chatroomComponent.f215752d.mo91565f().getString(C0966R.string.ijy), true, true, new C73505j(chatroomComponent, J7));
                } else {
                    progressDialog.show();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.ChatroomComponent$m */
    public class C73342m implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f215492a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList f215493b;

        /* renamed from: c */
        public final /* synthetic */ LinkedList f215494c;

        public C73342m(C72963f4 f4Var, LinkedList linkedList, LinkedList linkedList2) {
            this.f215492a = f4Var;
            this.f215493b = linkedList;
            this.f215494c = linkedList2;
        }

        public void onDismiss() {
            ChatroomComponent.this.mo102158e6(this.f215492a, 2, this.f215493b, this.f215494c.size(), 0, 1, "");
        }
    }

    public ChatroomComponent() {
        C40008f fVar = C40008f.f107254d;
        this.f215459i = new IListener<ChatroomMemberDataUpdatedEvent>(fVar) {
            {
                this.__eventId = 1070867558;
            }

            public boolean callback(IEvent iEvent) {
                ChatroomMemberDataUpdatedEvent chatroomMemberDataUpdatedEvent = (ChatroomMemberDataUpdatedEvent) iEvent;
                ChatroomComponent.this.f215752d.mo91558S();
                if (!(chatroomMemberDataUpdatedEvent instanceof ChatroomMemberDataUpdatedEvent) || ChatroomComponent.this.f215752d.mo91577r() == null || Util.isNullOrNil(chatroomMemberDataUpdatedEvent.f107408d.f107409a) || !chatroomMemberDataUpdatedEvent.f107408d.f107409a.equals(ChatroomComponent.this.f215752d.mo91577r())) {
                    return false;
                }
                ChatroomComponent.this.mo102156c6();
                return false;
            }
        };
        this.f215460j = new C44781g();
        this.f215461n = new IListener<TrackRemoveTipEvent>(fVar) {
            {
                this.__eventId = -1360452258;
            }

            public boolean callback(IEvent iEvent) {
                TrackRemoveTipEvent trackRemoveTipEvent = (TrackRemoveTipEvent) iEvent;
                if (((trackRemoveTipEvent instanceof TrackRemoveTipEvent) && !ChatroomComponent.this.f215752d.mo91577r().equals(trackRemoveTipEvent.f193959d.f193960a)) || !C72996z1.m85820U5(ChatroomComponent.this.f215752d.mo91577r())) {
                    return false;
                }
                C76879j.m92748s(ChatroomComponent.this.f215752d.mo91565f(), ChatroomComponent.this.f215752d.mo91572m().getString(C0966R.string.k5l), (String) null);
                return false;
            }
        };
        this.f215462o = false;
        this.f215463p = 0;
        this.f215464q = null;
        this.f215466s = false;
    }

    /* renamed from: Y5 */
    public static C72940a m86473Y5(ChatroomComponent chatroomComponent, C72963f4 f4Var, LinkedList linkedList, LinkedList linkedList2, int i, int i2, boolean z) {
        chatroomComponent.getClass();
        C72940a a = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(chatroomComponent.f215752d.mo91577r()).mo71490a(chatroomComponent.f215752d.mo91577r(), linkedList2, i);
        ChatroomComponent chatroomComponent2 = chatroomComponent;
        boolean z2 = z;
        int i3 = i2;
        C72963f4 f4Var2 = f4Var;
        LinkedList linkedList3 = linkedList;
        LinkedList linkedList4 = linkedList2;
        a.f212613b = new C73526m(chatroomComponent2, z2, i3, f4Var2, linkedList3, linkedList4);
        a.f212614c = new C73564p(chatroomComponent2, z2, i3, f4Var2, linkedList3, linkedList4);
        if (z) {
            a.mo100865c();
        } else {
            a.mo100867d(chatroomComponent.f215752d.mo91565f(), chatroomComponent.f215752d.mo91572m().getString(C0966R.string.a3h), chatroomComponent.f215752d.mo91572m().getString(C0966R.string.i64), true, true, new C73578q(chatroomComponent, a));
        }
        return a;
    }

    /* renamed from: E3 */
    public boolean mo102148E3() {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f215752d.mo91577r());
        return Lo != null && Lo.mo69797y2();
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (!this.f215466s) {
            mo102154a6();
        }
        this.f215466s = false;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f215466s = true;
        mo102154a6();
    }

    /* renamed from: R2 */
    public void mo102149R2(List<String> list, String str, C72963f4 f4Var) {
        C72940a p = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f215752d.mo91577r()).mo71505p(this.f215752d.mo91582w() ? this.f215752d.mo91577r() : "", list, 2, str, f4Var);
        p.f212613b = new C73334d(p);
        p.f212614c = new C73333c();
        p.mo100867d(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.a3h), this.f215752d.mo91572m().getString(C0966R.string.f361213i71), true, true, new C73335e(this, p));
    }

    /* renamed from: S1 */
    public boolean mo102150S1() {
        if (!this.f215462o) {
            return ((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70079x5();
        }
    }

    /* renamed from: U */
    public void mo102151U(long j, LinkedList<String> linkedList, int i, int i2) {
        C72963f4 f4Var;
        long j2 = j;
        int i3 = i2;
        Class cls = C75700k0.class;
        C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(this.f215752d.mo91577r());
        if (Lo == null) {
            C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.i6m), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6g), new C73336h(this));
            return;
        }
        this.f215752d.mo91577r();
        LinkedList linkedList2 = new LinkedList();
        List<String> r2 = Lo.mo69790r2();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (r2 != null && r2.contains(next)) {
                linkedList2.add(next);
            }
        }
        if (linkedList2.size() == 0) {
            if (linkedList.size() == 1) {
                C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.i6f), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6g), new C73337i(this));
            } else {
                C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.i6a), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6g), new C73338j(this));
            }
            if (i3 == 1) {
                mo102158e6(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j), 5, linkedList, 0, 0, 1, "");
                return;
            }
            return;
        }
        if (i3 == 1) {
            this.f215463p = 1;
        }
        if (j2 != -1) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
            if (!Util.isNullOrNil(b002.mo108764r2())) {
                if (!((b002.f230723F & 4096) > 0)) {
                    if (C31543z5.m39451a() - b002.getCreateTime() <= 120000) {
                        C77407n nVar = new C77407n((Context) this.f215752d.mo91565f(), 1, false);
                        nVar.f225771i = new C73339k();
                        nVar.f225782p = new C73340l(b002, linkedList, linkedList2, i, i2);
                        LinkedList<String> linkedList3 = linkedList;
                        nVar.f225761d = new C73342m(b002, linkedList, linkedList2);
                        nVar.mo107573q();
                        return;
                    }
                    LinkedList<String> linkedList4 = linkedList;
                    Log.m105918d("MicroMsg.ChattingUI.ChatroomComponent", "dealDelChatroomMember 2 minute excede");
                    this.f215463p = 6;
                    f4Var = b002;
                }
            }
            LinkedList<String> linkedList5 = linkedList;
            f4Var = b002;
        } else {
            LinkedList<String> linkedList6 = linkedList;
            f4Var = null;
        }
        mo102153Z5(f4Var, linkedList, linkedList2, i, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = ((com.tencent.p014mm.storage.C44662n1) ((a11.C39479c) f40.C86709a0.m107533q(a11.C39479c.class)).mo62084mr()).mo69799Lo(r5.f215752d.mo91577r());
     */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102152U1() {
        /*
            r5 = this;
            ck3.b r0 = r5.f215752d
            java.lang.String r0 = r0.mo91577r()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            ck3.b r1 = r5.f215752d
            java.lang.String r1 = r1.mo91577r()
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69799Lo(r1)
            if (r0 == 0) goto L_0x0033
            int r0 = r0.field_chatroomStatus
            long r0 = (long) r0
            r2 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0033
            r0 = 1
            return r0
        L_0x0033:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.ChatroomComponent.mo102152U1():boolean");
    }

    /* renamed from: Z5 */
    public final void mo102153Z5(C72963f4 f4Var, LinkedList<String> linkedList, LinkedList<String> linkedList2, int i, int i2, boolean z) {
        C72963f4 f4Var2 = f4Var;
        LinkedList<String> linkedList3 = linkedList;
        int i3 = i2;
        boolean z2 = z;
        if (linkedList.size() == 1) {
            C76879j.m92709C(this.f215752d.mo91565f(), z2 ? this.f215752d.mo91572m().getString(C0966R.string.i6_, new Object[]{mo102155b6(linkedList3.get(0))}) : this.f215752d.mo91572m().getString(C0966R.string.i69, new Object[]{mo102155b6(linkedList3.get(0))}), (String) null, z2 ? this.f215752d.mo91572m().getString(C0966R.string.i6i) : this.f215752d.mo91572m().getString(C0966R.string.i6h), this.f215752d.mo91572m().getString(C0966R.string.f7926wf), true, new C73330a(z, f4Var, linkedList, i2, linkedList2, i), new C73332b(i3, f4Var2, linkedList3));
            return;
        }
        Intent intent = new Intent(this.f215752d.mo91565f(), DelChatroomMemberUI.class);
        intent.putExtra("members", Util.listToString(linkedList2, ","));
        intent.putExtra("origin_members", Util.listToString(linkedList3, ","));
        intent.putExtra("select_record_report_opt", this.f215463p);
        intent.putExtra("RoomInfo_Id", this.f215752d.mo91577r());
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("local_scene", i3);
        intent.putExtra("revoke_record", z2);
        if (f4Var2 != null) {
            intent.putExtra("msg_id", f4Var.getMsgId());
        }
        C67391b bVar = this.f215752d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C67391b bVar2 = bVar;
        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: a6 */
    public final void mo102154a6() {
        C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
        boolean z = true;
        boolean z2 = false;
        if (C72996z1.m85820U5(this.f215752d.mo91577r())) {
            String r = this.f215752d.mo91577r();
            C51866wq2 wq22 = C45612m0.f123381a;
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(r);
            if (Lo != null) {
                if (Lo.field_isShowname <= 0) {
                    z = false;
                }
                z2 = z;
            }
            this.f215455e = z2;
            if (z2) {
                C45612m0.m50684a(this.f215752d.mo91577r(), this.f215456f);
            } else {
                ((HashMap) this.f215456f).clear();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("chatroom display  ");
            sb.append(this.f215455e ? "show " : "not show");
            Log.m105918d("MicroMsg.ChattingUI.ChatroomComponent", sb.toString());
        } else if (eVar.mo70075s4()) {
            this.f215455e = true;
        } else {
            this.f215455e = false;
            ((HashMap) this.f215456f).clear();
        }
    }

    /* renamed from: b6 */
    public final String mo102155b6(String str) {
        String str2 = null;
        if (!((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70075s4() && !this.f215752d.mo91582w()) {
            return null;
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            return str;
        }
        if (!Util.isNullOrNil(z1Var.mo73969n2())) {
            str2 = z1Var.mo73969n2();
        } else {
            C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(this.f215752d.mo91577r());
            if (Lo != null) {
                str2 = Lo.mo69789q2(z1Var.getUsername());
            }
        }
        if (Util.isNullOrNil(str2)) {
            str2 = z1Var.mo73969n2();
        }
        return Util.isNullOrNil(str2) ? z1Var.mo62909j3() : str2;
    }

    /* renamed from: c6 */
    public final void mo102156c6() {
        if (this.f215752d.mo91574o() == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomMemberDetail() talker == null");
        } else if (C72996z1.m85820U5(this.f215752d.mo91577r())) {
            Log.m105918d("MicroMsg.ChattingUI.ChatroomComponent", "cpan[changeTalker]");
            this.f215752d.mo91571l().postDelayed(new C44779f(), 1000);
        }
    }

    /* renamed from: d6 */
    public boolean mo102157d6(Activity activity, int i, int i2, String str) {
        return C74785j2.C6981a.m7247a(activity, i, i2, str, 7) || C1468a.m1500a(activity, i, i2, new Intent().setClass(activity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str);
    }

    /* renamed from: e */
    public void mo70065e() {
        if (this.f215752d.mo91582w()) {
            this.f215462o = ((C53193b) C86312j.m106911c(C53193b.class)).mo73721AO(this.f215752d.mo91577r(), true);
        }
    }

    /* renamed from: e6 */
    public final void mo102158e6(C72963f4 f4Var, int i, LinkedList<String> linkedList, int i2, int i3, int i4, String str) {
        C25231f.m32169a(this.f215752d.mo91577r(), linkedList != null ? linkedList.size() : 0, i2, i, i3, i4, Util.safeParseLong(f4Var != null ? f4Var.mo108764r2() : ""), str);
    }

    /* renamed from: f6 */
    public final void mo102159f6() {
        C97625j3.m125815e().mo123470p(610, this);
        C97625j3.m125812b().mo105907v().remove(this);
        C97625j3.m125815e().mo123470p(551, this);
        C72946e eVar = this.f215465r;
        if (eVar != null) {
            Log.m105924i("MicroMsg.RoomWatchCallbackFactory", "dead");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(eVar.f212625a, eVar.f212628d);
        }
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105902q().remove(this.f215460j);
            this.f215459i.dead();
            this.f215461n.dead();
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        Class cls = C45819c.class;
        C97625j3.m125815e().mo123455a(610, this);
        C97625j3.m125815e().mo123455a(551, this);
        C97625j3.m125812b().mo105907v().add(this);
        C97625j3.m125812b().mo105902q().add(this.f215460j);
        C72946e eVar = this.f215465r;
        if (eVar != null) {
            Log.m105924i("MicroMsg.RoomWatchCallbackFactory", "dead");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(eVar.f212625a, eVar.f212628d);
        }
        C72946e eVar2 = (C72946e) ((C45819c) C86312j.m106911c(cls)).mo71192mK(this.f215752d.mo91577r()).mo71500k(700);
        eVar2.f212626b = new C30829t(this);
        eVar2.f212627c = new C73593s(this);
        Log.m105924i("MicroMsg.RoomWatchCallbackFactory", "alive");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(eVar2.f212625a, eVar2.f212628d);
        this.f215465r = eVar2;
        this.f215459i.alive();
        this.f215461n.alive();
        if (C72996z1.m85820U5(this.f215752d.mo91577r()) && C45612m0.m50707x(this.f215752d.mo91577r())) {
            Log.m105919d("MicroMsg.ChattingUI.ChatroomComponent", "chattingui find chatroom contact need update %s", this.f215752d.mo91577r());
            C31519v2.m39436a().mo55987c(this.f215752d.mo91577r(), "");
        }
        if (C75610d.m90860b() != null && !this.f215752d.mo91577r().equals(((C118355y) C75610d.m90860b()).f353752u)) {
            Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "chatting oncreate end track %s", ((C118355y) C75610d.m90860b()).f353752u);
            ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
            exitTrackRoomEvent.f193553d.f193554a = this.f215752d.mo91577r();
            exitTrackRoomEvent.publish();
        }
        mo102156c6();
        if (this.f215752d.mo91574o() == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() talker == null");
        } else if (C72996z1.m85820U5(this.f215752d.mo91577r())) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f215752d.mo91577r();
            objArr[1] = Boolean.valueOf(this.f215462o);
            if (f215454t == -1) {
                f215454t = 1;
            }
            objArr[2] = Integer.valueOf(f215454t);
            Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() username:%s, isInChatRoom:%s, sw:%s", objArr);
            String r = this.f215752d.mo91577r();
            if (this.f215462o) {
                if (f215454t == -1) {
                    f215454t = 1;
                }
                if (f215454t == 1) {
                    ((C119157j) C119157j.f356862d).mo183878i(new C30830u(this, r), 1000);
                }
            }
        }
        Class cls2 = C77089d.class;
        Class cls3 = C39479c.class;
        if (C72996z1.m85807K5(this.f215752d.mo91577r())) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls3)).mo62084mr()).mo69799Lo(this.f215752d.mo91577r());
            if (Lo != null) {
                Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f215752d.mo91577r(), Integer.valueOf(Lo.field_chatroomStatus));
                if ((((long) Lo.field_chatroomStatus) & 2097152) == 2097152 && Util.isNullOrNil(Lo.field_associateOpenIMRoomName)) {
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate getRoomInfo %s", this.f215752d.mo91577r());
                    ((C45819c) C86312j.m106911c(cls)).mo71192mK(this.f215752d.mo91577r()).mo71504o(this.f215752d.mo91577r()).mo100865c();
                    String r2 = this.f215752d.mo91577r();
                    boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, true);
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "ifCheckAllConversation %s, excludeUsername %s", Boolean.valueOf(g), r2);
                    if (g) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C30831v(this, r2));
                        return;
                    }
                    return;
                }
                if (Lo.field_openIMRoomMigrateStatus == 1) {
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate migration %s", this.f215752d.mo91577r());
                    ((C77089d) C86312j.m106911c(cls2)).yx0().mo72067b(this.f215752d.mo91577r(), Lo.field_associateOpenIMRoomName);
                    String r3 = this.f215752d.mo91577r();
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration %s", r3);
                    ((C119157j) C119157j.f356862d).mo183875f(new C30832w(this, r3));
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
        } else if (C72996z1.m85847r5(this.f215752d.mo91577r())) {
            C46860d yx02 = ((C77089d) C86312j.m106911c(cls2)).yx0();
            String r4 = this.f215752d.mo91577r();
            yx02.getClass();
            Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", Util.nullAs(r4, ""));
            yx02.f126045d = r4;
            C44661m1 Lo2 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls3)).mo62084mr()).mo69799Lo(this.f215752d.mo91577r());
            if (Lo2 != null) {
                Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f215752d.mo91577r(), Integer.valueOf(Lo2.field_chatroomStatus));
                int i = Lo2.field_openIMRoomMigrateStatus;
                if (i == 3) {
                    String string = this.f215752d.mo91572m().getString(C0966R.string.b69);
                    String string2 = this.f215752d.mo91572m().getString(C0966R.string.b6a);
                    String string3 = this.f215752d.mo91572m().getString(C0966R.string.b6_);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(string);
                    stringBuffer.append("");
                    stringBuffer.append("<_wc_custom_link_ href=\"");
                    stringBuffer.append("weixin://jump/chatroom/");
                    stringBuffer.append(Lo2.field_associateOpenIMRoomName);
                    stringBuffer.append("\">");
                    stringBuffer.append(string2);
                    stringBuffer.append("</_wc_custom_link_>");
                    stringBuffer.append(string3);
                    C72963f4 f4Var = new C72963f4();
                    f4Var.mo108740T2(0);
                    f4Var.mo108749c3(this.f215752d.mo91577r());
                    f4Var.mo100991d(3);
                    f4Var.mo108732L2(stringBuffer.toString());
                    f4Var.mo108733M2(C75604z3.m90841m(this.f215752d.mo91577r(), System.currentTimeMillis() / 1000));
                    f4Var.setType(10000);
                    f4Var.mo108735O2(f4Var.mo108762o2());
                    f4Var.f230740X = 1;
                    f4Var.f230755r = true;
                    C75604z3.m90852x(f4Var);
                    Lo2.field_openIMRoomMigrateStatus = 4;
                    boolean replace = ((C44662n1) ((C39479c) C86709a0.m107533q(cls3)).mo62084mr()).replace(Lo2);
                    C46860d.m52180d(Lo2.field_associateOpenIMRoomName, this.f215752d.mo91577r(), 2);
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "insert migration finish system msg.(result:%s)", Boolean.valueOf(replace));
                    return;
                }
                if (i == 2) {
                    C46860d yx03 = ((C77089d) C86312j.m106911c(cls2)).yx0();
                    String str = Lo2.field_associateOpenIMRoomName;
                    Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "removeMigrateTask %s %s, %s", Util.nullAs(str, ""), Util.nullAs(yx03.f126044c.get(str), ""), Boolean.valueOf(yx03.f126043b.contains(str)));
                    if (yx03.f126043b.contains(str)) {
                        yx03.f126043b.remove(str);
                    }
                    Log.m105924i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail remove from cur room");
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
        }
    }

    public CharSequence getDisplayName(String str) {
        Class cls = C75339i.class;
        C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        String Si = ((C75339i) C86312j.m106911c(cls)).mo62515Si(str);
        if (!eVar.mo70071q1() && !Util.isNullOrNil(Si)) {
            return C47802c.m53111a(z1Var, Si);
        }
        if (((HashMap) this.f215456f).containsKey(str)) {
            String str2 = (String) ((HashMap) this.f215456f).get(str);
            if (!Util.isNullOrNil(str2)) {
                return C72996z1.m85843n5(str) ? C47802c.m53111a(z1Var, str2) : str2;
            }
        }
        return eVar.mo70071q1() ? eVar.mo70076s5().mo73035n2(str) : C47802c.m53111a(z1Var, ((C75339i) C86312j.m106911c(cls)).getDisplayName(str));
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo102159f6();
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Class cls = C77089d.class;
        C46860d yx02 = ((C77089d) C86312j.m106911c(cls)).yx0();
        yx02.getClass();
        boolean z = true;
        Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", Util.nullAs("", ""));
        yx02.f126045d = "";
        if (C72996z1.m85847r5(this.f215752d.mo91577r())) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f215752d.mo91577r());
            if (Lo != null) {
                if (Lo.field_openIMRoomMigrateStatus != 2) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate start migrate");
                    ((C77089d) C86312j.m106911c(cls)).yx0().mo72067b(Lo.field_associateOpenIMRoomName, this.f215752d.mo91577r());
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate member is null");
        }
    }

    /* renamed from: o4 */
    public boolean mo102161o4() {
        return this.f215455e;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Class cls = C79348e.class;
        C67391b bVar = this.f215752d;
        if (bVar == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "[onNotifyChange] mChattingContext is null!");
        } else if (((C79348e) bVar.f193278b.mo102812a(cls)).mo70075s4()) {
            this.f215462o = C48340e.m53676q(((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70076s5());
        } else {
            this.f215462o = ((C53193b) C86312j.m106911c(C53193b.class)).i90(this.f215752d.mo91577r());
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " sceneType:" + yVar.getType());
        this.f215752d.mo91561b();
        C67391b bVar = this.f215752d;
        if (!bVar.f193283g) {
            Log.m105924i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd fragment not foreground, return");
        } else if (Util.isTopActivity(bVar.mo91565f()) && !mo102157d6(this.f215752d.mo91565f(), i, i2, str)) {
            this.f215752d.mo91558S();
            if (i == 0 && i2 == 0 && yVar.getType() == 551) {
                Log.m105924i("MicroMsg.ChattingUI.ChatroomComponent", "cpan[refresh top btn]");
                this.f215462o = ((C53193b) C86312j.m106911c(C53193b.class)).i90(this.f215752d.mo91577r());
                ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102628n3();
            }
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo102159f6();
    }

    /* renamed from: w0 */
    public boolean mo102162w0() {
        C44661m1 Lo;
        if (!C72996z1.m85807K5(this.f215752d.mo91577r()) || !C45612m0.m50704u() || (Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f215752d.mo91577r())) == null) {
            return false;
        }
        int i = Lo.field_chatroomStatus;
        return (((long) i) & 131072) != 131072 && (((long) i) & 65536) == 65536;
    }
}

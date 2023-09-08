package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lc3.C10485b;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.InviteFriendBanner */
public class InviteFriendBanner extends C78802b {

    /* renamed from: h */
    public View f24652h;

    /* renamed from: i */
    public int f24653i;

    /* renamed from: j */
    public IListener f24654j;

    /* renamed from: com.tencent.mm.ui.conversation.banner.InviteFriendBanner$a */
    public class C6953a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f24656d;

        public C6953a(InviteFriendBanner inviteFriendBanner, Context context) {
            this.f24656d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/InviteFriendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("Invite_friends", 1);
            C88144b.m109791i(this.f24656d, "subapp", ".ui.pluginapp.InviteFriendsBy3rdUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(14034, 1);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/InviteFriendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public InviteFriendBanner(Context context) {
        super(context);
        View inflate = View.inflate(context, C0966R.C0971layout.b1u, (ViewGroup) null);
        this.f24652h = inflate;
        if (inflate != null) {
            this.f24653i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InviteFriendsControlFlags"), 0);
            View view = this.f24652h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/InviteFriendBanner", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/conversation/banner/InviteFriendBanner", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f24652h.setPadding(0, -C76577a.m92151b(context, C0966R.dimen.f3925j5), 0, 0);
            if ((this.f24653i & 1) > 0) {
                View view2 = this.f24652h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/banner/InviteFriendBanner", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/InviteFriendBanner", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f24652h.setPadding(0, 0, 0, 0);
            }
            this.f24652h.setOnClickListener(new C6953a(this, context));
            this.f24654j = new IListener<DynamicConfigUpdatedEvent>(C40008f.f107254d) {
                {
                    this.__eventId = -443124368;
                }

                public boolean callback(IEvent iEvent) {
                    DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
                    Log.m105924i("MicroMsg.InviteFriendBanner", "dynamic config file change");
                    InviteFriendBanner.this.f24653i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InviteFriendsControlFlags"), 0);
                    InviteFriendBanner inviteFriendBanner = InviteFriendBanner.this;
                    if ((inviteFriendBanner.f24653i & 1) > 0) {
                        inviteFriendBanner.f24652h.post(new C6958p(this));
                    }
                    return true;
                }
            };
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return -1;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        this.f24654j.alive();
        View view = this.f24652h;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: f */
    public void mo7971f() {
        this.f24654j.dead();
    }

    public View getView() {
        return this.f24652h;
    }
}

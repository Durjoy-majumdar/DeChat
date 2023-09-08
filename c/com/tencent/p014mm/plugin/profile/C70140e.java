package com.tencent.p014mm.plugin.profile;

import com.tencent.p014mm.autogen.events.ChatroomMemberInviteerUpdatedEvent;
import com.tencent.p014mm.plugin.profile.NewContactWidgetNormal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31519v2;
import eb0.C75597w2;
import eb0.C97625j3;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.profile.e */
public class C70140e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatroomMemberInviteerUpdatedEvent f202474d;

    /* renamed from: e */
    public final /* synthetic */ NewContactWidgetNormal.C7012318 f202475e;

    /* renamed from: com.tencent.mm.plugin.profile.e$a */
    public class C70141a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ String f202476a;

        public C70141a(String str) {
            this.f202476a = str;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, NewContactWidgetNormal.this.f202429q, Boolean.valueOf(z));
            if (z) {
                String j3 = C97625j3.m125812b().mo105907v().get(str).mo62909j3();
                NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                newContactWidgetNormal.mo96543m(newContactWidgetNormal.f202421f, newContactWidgetNormal.f202419d, this.f202476a, j3, newContactWidgetNormal.f202420e, newContactWidgetNormal.f202428p);
            }
        }
    }

    public C70140e(NewContactWidgetNormal.C7012318 r1, ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent) {
        this.f202475e = r1;
        this.f202474d = chatroomMemberInviteerUpdatedEvent;
    }

    public void run() {
        String str = this.f202474d.f193513d.f193515b;
        NewContactWidgetNormal.this.f202419d.getIntent().putExtra("inviteer", str);
        NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
        String c = newContactWidgetNormal.mo96532c(newContactWidgetNormal.f202428p, this.f202474d.f193513d.f193515b);
        Log.m105925i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] inviter:%s inviterDisplayName:%s", str, c);
        if (Util.isNullOrNil(c)) {
            ((LinkedList) NewContactWidgetNormal.this.f202432t).add(str);
            C31519v2.m39436a().mo55988e(str, "", new C70141a(str));
            return;
        }
        NewContactWidgetNormal newContactWidgetNormal2 = NewContactWidgetNormal.this;
        newContactWidgetNormal2.mo96543m(newContactWidgetNormal2.f202421f, newContactWidgetNormal2.f202419d, str, c, newContactWidgetNormal2.f202420e, newContactWidgetNormal2.f202428p);
    }
}

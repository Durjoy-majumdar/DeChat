package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import f40.C86709a0;
import p910lj.C76701a;
import pg3.C77084b;
import pg3.C77086f;

/* renamed from: com.tencent.mm.chatroom.ui.i1 */
public class C67967i1 extends C77086f {

    /* renamed from: d */
    public final /* synthetic */ String f195091d;

    /* renamed from: e */
    public final /* synthetic */ C72940a f195092e;

    /* renamed from: f */
    public final /* synthetic */ ModRemarkRoomNameUI f195093f;

    public C67967i1(ModRemarkRoomNameUI modRemarkRoomNameUI, String str, C72940a aVar) {
        this.f195093f = modRemarkRoomNameUI;
        this.f195091d = str;
        this.f195092e = aVar;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C77086f fVar = (C77086f) bVar;
        Class cls = C39479c.class;
        if (i2 == 0) {
            ModRemarkRoomNameUI modRemarkRoomNameUI = this.f195093f;
            C76701a.makeText((Context) modRemarkRoomNameUI, (CharSequence) modRemarkRoomNameUI.getString(C0966R.string.a3s), 0).show();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f195093f.f10155o);
            if (Lo != null) {
                Lo.field_chatroomname = this.f195093f.f10155o;
                Lo.field_selfDisplayName = this.f195091d;
                ((C39479c) C86709a0.m107533q(cls)).mo62084mr().update(Lo, new String[0]);
                this.f195093f.finish();
                return;
            }
            return;
        }
        this.f195092e.cancel();
        C76701a.makeText((Context) this.f195093f.getContext(), (CharSequence) Util.nullAs(this.f225173c, this.f195093f.getString(C0966R.string.f7966xq)), 1).show();
    }
}

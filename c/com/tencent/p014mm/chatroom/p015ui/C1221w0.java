package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import java.util.List;
import te3.C48768av3;

/* renamed from: com.tencent.mm.chatroom.ui.w0 */
public class C1221w0 implements C87581a<Void, C48768av3> {

    /* renamed from: a */
    public final /* synthetic */ ManageChatroomUI f10263a;

    public C1221w0(ManageChatroomUI manageChatroomUI) {
        this.f10263a = manageChatroomUI;
    }

    public Object call(Object obj) {
        C48768av3 av32 = (C48768av3) obj;
        if (av32 == null || Util.isNullOrNil((List) av32.f130782e)) {
            return null;
        }
        ManageChatroomUI manageChatroomUI = this.f10263a;
        manageChatroomUI.f108076j = av32;
        ManageChatroomUI.m43240H7(manageChatroomUI);
        return null;
    }
}

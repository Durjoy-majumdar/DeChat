package ux2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: ux2.h */
public class C78312h implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI f229395d;

    public C78312h(TalkRoomUI talkRoomUI) {
        this.f229395d = talkRoomUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C97625j3.m125812b().mo105906u().mo119676J(144641, Integer.valueOf(Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(144641, (Object) null), 0) + 1));
        this.f229395d.onBackPressed();
    }
}

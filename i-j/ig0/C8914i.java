package ig0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.friend.p022ui.RecommendFriendUI;

/* renamed from: ig0.i */
public class C8914i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecommendFriendUI f28209d;

    public C8914i(RecommendFriendUI recommendFriendUI) {
        this.f28209d = recommendFriendUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f28209d.finish();
    }
}

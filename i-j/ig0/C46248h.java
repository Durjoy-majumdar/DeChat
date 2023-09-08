package ig0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.friend.p022ui.RecommendFriendUI;
import f40.C86709a0;
import hg0.C46058m0;

/* renamed from: ig0.h */
public class C46248h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C46058m0 f124667d;

    /* renamed from: e */
    public final /* synthetic */ RecommendFriendUI f124668e;

    public C46248h(RecommendFriendUI recommendFriendUI, C46058m0 m0Var) {
        this.f124668e = recommendFriendUI;
        this.f124667d = m0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f124667d);
        this.f124668e.finish();
    }
}

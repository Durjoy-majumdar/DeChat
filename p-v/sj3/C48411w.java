package sj3;

import android.view.View;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import pj3.C47510b;
import yl3.C53534a;

/* renamed from: sj3.w */
public class C48411w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f129591d;

    /* renamed from: e */
    public final /* synthetic */ BizChatroomInfoUI f129592e;

    public C48411w(BizChatroomInfoUI bizChatroomInfoUI, int i) {
        this.f129592e = bizChatroomInfoUI;
        this.f129591d = i;
    }

    public void run() {
        BizChatroomInfoUI bizChatroomInfoUI = this.f129592e;
        View v = ((C47510b) bizChatroomInfoUI.f121450e).mo72518v(this.f129591d, bizChatroomInfoUI.getListView());
        if (v != null) {
            C53534a.m60078a(this.f129592e.getContext(), v);
        }
    }
}

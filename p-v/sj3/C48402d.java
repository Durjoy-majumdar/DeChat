package sj3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sj3.d */
public class C48402d implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45082x0 f129578d;

    /* renamed from: e */
    public final /* synthetic */ BizChatFavUI f129579e;

    public C48402d(BizChatFavUI bizChatFavUI, C45082x0 x0Var) {
        this.f129579e = bizChatFavUI;
        this.f129578d = x0Var;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i < this.f129579e.f121359e.getHeaderViewsCount()) {
            Log.m105928w("MicroMsg.BizChatFavUI", "on header view long click, ignore");
            return true;
        }
        C45082x0 x0Var = this.f129578d;
        BizChatFavUI bizChatFavUI = this.f129579e;
        x0Var.mo70437c(view, i, j, bizChatFavUI, bizChatFavUI.f121361g);
        return true;
    }
}

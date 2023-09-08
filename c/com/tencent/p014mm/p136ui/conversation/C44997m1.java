package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.database.Cursor;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.conversation.C74697k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import eb0.C97625j3;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.tencent.mm.ui.conversation.m1 */
public final class C44997m1 extends C74697k {

    /* renamed from: H */
    public final String f122053H;

    /* renamed from: I */
    public HashSet<String> f122054I = new HashSet<>();

    public C44997m1(String str, Context context, C6975i1.C6977b bVar) {
        super(context, bVar);
        this.f122053H = str;
        C97625j3.m125812b().mo105908w().add(this);
    }

    /* renamed from: o */
    public void mo1333o() {
        mo7998r(((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(6, (List<String>) null, this.f122053H, -1));
        Object[] objArr = new Object[1];
        Cursor g = mo7992g();
        objArr[0] = g != null ? Integer.valueOf(g.getCount()) : null;
        Log.m105925i("MicroMsg.OpenImKefuConversationAdapter", "alvinluo resetCursor count: %s", objArr);
        C6975i1.C6977b bVar = this.f24699h;
        if (bVar != null) {
            bVar.mo1327a((Object) null);
        }
        notifyDataSetChanged();
    }

    /* renamed from: u */
    public void mo70183u(String str, C74697k.C74703f fVar) {
        ImageView imageView = null;
        LinearLayout linearLayout = fVar != null ? fVar.f219643a : null;
        if (linearLayout != null) {
            linearLayout.setDescendantFocusability(393216);
        }
        ImageView imageView2 = fVar != null ? fVar.f219644b : null;
        if (imageView2 != null) {
            imageView2.setClickable(false);
        }
        if (fVar != null) {
            imageView = fVar.f219644b;
        }
        if (imageView != null) {
            imageView.setLongClickable(false);
        }
        if (!this.f122054I.contains(str)) {
            this.f122054I.add(str);
        }
    }

    /* renamed from: w */
    public void mo70184w() {
        C97625j3.m125812b().mo105908w().remove(this);
    }
}

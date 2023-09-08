package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconStruct;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import p534gl.C32482o;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$g$$a */
public final /* synthetic */ class y1$g$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72843y1.C72848g f212310d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f212311e;

    public /* synthetic */ y1$g$$a(C72843y1.C72848g gVar, RecyclerView.C16631z zVar) {
        this.f212310d = gVar;
        this.f212311e = zVar;
    }

    public final void onClick(View view) {
        C72843y1.C72848g gVar = this.f212310d;
        RecyclerView.C16631z zVar = this.f212311e;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(zVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", gVar, array);
        C72843y1 y1Var = C72843y1.this;
        int j = zVar.mo17363j();
        if (TextUtils.isEmpty(y1Var.f212285i)) {
            Log.m105924i("MicroMsg.emoji.SuggestEmoticonBubble", "Whoops! navToSearch without any input");
            y1Var.f212281e.dismiss();
        } else {
            y1Var.mo100684c((List<C32482o>) null, 0);
            SuggestEmoiconStruct suggestEmoiconStruct = y1Var.f212291o;
            suggestEmoiconStruct.f79171g = (long) j;
            suggestEmoiconStruct.f79168d = 3;
            suggestEmoiconStruct.f79183s = Util.milliSecondsToNow(y1Var.f212293q);
            y1Var.f212291o.mo86054n();
            y1Var.f212291o.f79171g = 0;
            if (y1Var.f212295s != null) {
                Log.m105924i("MicroMsg.emoji.SuggestEmoticonBubble", "Call `onSearchMore`");
                ChatFooter$$a chatFooter$$a = (ChatFooter$$a) y1Var.f212295s;
                ChatFooter chatFooter = chatFooter$$a.f211975a;
                chatFooter.f211868f.mo100205q(chatFooter$$a.f211976b, new ChatFooter$$b(chatFooter));
            }
            y1Var.f212281e.dismiss();
        }
        C117292a.m165361g(gVar, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package sj3;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sb0.C48334c;

/* renamed from: sj3.e */
public class C13684e implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatFavUI f38732d;

    public C13684e(BizChatFavUI bizChatFavUI) {
        this.f38732d = bizChatFavUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        BizChatFavUI bizChatFavUI = this.f38732d;
        long j2 = ((C48334c) this.f38732d.f121360f.getItem(i)).field_bizChatLocalId;
        bizChatFavUI.getClass();
        Intent intent = new Intent(bizChatFavUI, ChattingUI.class);
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", bizChatFavUI.f121362h);
        intent.putExtra("key_biz_chat_id", j2);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_need_send_video", false);
        intent.putExtra("key_is_biz_chat", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        BizChatFavUI bizChatFavUI2 = bizChatFavUI;
        C117292a.m165358d(bizChatFavUI2, aVar.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizChatFavUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bizChatFavUI2, "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        MMHandlerThread.postToMainThreadDelayed(new C13685g(bizChatFavUI), 500);
        C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

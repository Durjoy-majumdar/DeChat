package ux2;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import sx2.C118318d;

/* renamed from: ux2.d */
public class C118633d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI f354982d;

    /* renamed from: ux2.d$a */
    public class C118634a implements DialogInterface.OnClickListener {
        public C118634a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C118633d.this.f354982d.f347432r = false;
            C118318d.yx0().mo183116i();
            C118633d.this.f354982d.finish();
        }
    }

    public C118633d(TalkRoomUI talkRoomUI) {
        this.f354982d = talkRoomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TalkRoomUI talkRoomUI = this.f354982d;
        C76879j.m92750u(talkRoomUI, talkRoomUI.getString(C0966R.string.jtd), this.f354982d.getString(C0966R.string.jtc), new C118634a(), (DialogInterface.OnClickListener) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package ux2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77390c0;

/* renamed from: ux2.e */
public class C78310e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI f229393d;

    public C78310e(TalkRoomUI talkRoomUI) {
        this.f229393d = talkRoomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TalkRoomUI talkRoomUI = this.f229393d;
        talkRoomUI.getClass();
        boolean z = false;
        if (Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(144641, (Object) null), 0) <= 0) {
            C77390c0 c0Var = new C77390c0(talkRoomUI, C0966R.style.a69);
            LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(MMApplicationContext.getContext()).inflate(C0966R.C0971layout.c88, (ViewGroup) null);
            linearLayout.setMinimumWidth(10000);
            c0Var.setCanceledOnTouchOutside(true);
            c0Var.setOnDismissListener(new C78312h(talkRoomUI));
            c0Var.setCancelable(false);
            ((Button) linearLayout.findViewById(C0966R.C0970id.f358422f12)).setOnClickListener(new C78309b(talkRoomUI, c0Var));
            c0Var.setContentView(linearLayout);
            c0Var.show();
            z = true;
        }
        if (!z) {
            this.f229393d.onBackPressed();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

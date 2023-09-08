package wf1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;
import tf0.C13883o1;

/* renamed from: wf1.g */
public final class C15179g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Intent f41333d;

    /* renamed from: e */
    public final /* synthetic */ C15162a f41334e;

    /* renamed from: f */
    public final /* synthetic */ Activity f41335f;

    /* renamed from: g */
    public final /* synthetic */ int f41336g;

    /* renamed from: h */
    public final /* synthetic */ DialogInterface.OnClickListener f41337h;

    /* renamed from: i */
    public final /* synthetic */ C101218e0 f41338i;

    public C15179g(Intent intent, C15162a aVar, Activity activity, int i, DialogInterface.OnClickListener onClickListener, C101218e0 e0Var) {
        this.f41333d = intent;
        this.f41334e = aVar;
        this.f41335f = activity;
        this.f41336g = i;
        this.f41337h = onClickListener;
        this.f41338i = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15191k.f41360a.mo14127b("room_live_start_create_finder", "154");
        Intent intent = this.f41333d;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("key_create_scene", this.f41334e.mo14113c3().f41434e);
        ((C13883o1) C86312j.m106911c(C13883o1.class)).b30(this.f41335f, intent, this.f41336g);
        DialogInterface.OnClickListener onClickListener = this.f41337h;
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) null, -1);
        }
        this.f41338i.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

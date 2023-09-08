package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.chatting.C73688g2;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C88990b;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.widget.c */
public class C74972c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ MMTextView f220510d;

    public C74972c(MMTextView mMTextView) {
        this.f220510d = mMTextView;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        MMTextView mMTextView = this.f220510d;
        MMTextView.C74961b bVar = mMTextView.f220440e;
        boolean z = false;
        if (bVar == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        C73688g2 g2Var = (C73688g2) bVar;
        g2Var.getClass();
        if (mMTextView.getTag() instanceof C74243t8) {
            C74243t8 t8Var = (C74243t8) mMTextView.getTag();
            if (!(t8Var.f212238a == null || g2Var.f216345a == null)) {
                CharSequence text = mMTextView.getText();
                Activity f = g2Var.f216345a.mo91565f();
                C72963f4 f4Var = t8Var.f212238a;
                boolean x = g2Var.f216345a.mo91583x();
                Intent intent = new Intent(f, TextPreviewUI.class);
                intent.putExtra("key_chat_text", text);
                intent.putExtra("Chat_Msg_Id", f4Var.getMsgId());
                intent.putExtra("is_group_chat", x);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity = f;
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListDoubleClickListener", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/storage/MsgInfo;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListDoubleClickListener", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/storage/MsgInfo;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111199h(f);
                z = true;
            }
        }
        C117292a.m165362h(z, this, "com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return z;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/widget/MMTextView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

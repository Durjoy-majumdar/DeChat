package com.tencent.p014mm.plugin.pwdgroup.p089ui.widget;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView */
public class MMCallBackScrollView extends ScrollView {

    /* renamed from: d */
    public int f53261d;

    /* renamed from: e */
    public int f53262e = 0;

    /* renamed from: f */
    public C18973b f53263f;

    /* renamed from: g */
    public MMHandler f53264g = new C18972a();

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView$a */
    public class C18972a extends MMHandler {
        public C18972a() {
        }

        public void handleMessage(Message message) {
            int scrollY = MMCallBackScrollView.this.getScrollY();
            MMCallBackScrollView mMCallBackScrollView = MMCallBackScrollView.this;
            if (scrollY == mMCallBackScrollView.f53261d) {
                mMCallBackScrollView.mo24148a(0);
                return;
            }
            mMCallBackScrollView.f53261d = scrollY;
            MMHandler mMHandler = mMCallBackScrollView.f53264g;
            mMHandler.sendMessageDelayed(mMHandler.obtainMessage(), 5);
            MMCallBackScrollView.this.mo24148a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView$b */
    public interface C18973b {
    }

    public MMCallBackScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo24148a(int i) {
        C18973b bVar = this.f53263f;
        if (bVar != null && this.f53262e != i) {
            this.f53262e = i;
            View view = FacingCreateChatRoomAllInOneUI.this.f53198F;
            if (view == null) {
                return;
            }
            if (i == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$12", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$12", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$12", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$12", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f53261d = getScrollY();
        int action = motionEvent.getAction();
        if (action == 1) {
            MMHandler mMHandler = this.f53264g;
            if (mMHandler != null) {
                mMHandler.sendMessageDelayed(mMHandler.obtainMessage(), 5);
            }
        } else if (action == 2) {
            mo24148a(1);
        }
        return onTouchEvent;
    }

    public void setMMOnScrollListener(C18973b bVar) {
        this.f53263f = bVar;
    }

    public MMCallBackScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

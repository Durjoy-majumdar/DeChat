package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameLibraryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView */
public class GameDropdownView extends TextView implements View.OnClickListener, PopupWindow.OnDismissListener, C111847h {

    /* renamed from: d */
    public Context f113852d;

    /* renamed from: e */
    public C42192c f113853e;

    /* renamed from: f */
    public LinkedList<String> f113854f;

    /* renamed from: g */
    public int f113855g = 0;

    /* renamed from: h */
    public int f113856h = 0;

    /* renamed from: i */
    public C42191b f113857i = null;

    /* renamed from: j */
    public View f113858j = null;

    /* renamed from: n */
    public View.OnClickListener f113859n = new C42190a();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView$a */
    public class C42190a implements View.OnClickListener {
        public C42190a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (GameDropdownView.this.f113853e.getContentView() == null || !(GameDropdownView.this.f113853e.getContentView() instanceof ViewGroup)) {
                GameDropdownView.this.f113853e.dismiss();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            GameDropdownView.this.setCurrentSelection(((ViewGroup) GameDropdownView.this.f113853e.getContentView()).indexOfChild(view));
            GameDropdownView.this.f113853e.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView$b */
    public interface C42191b {
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView$c */
    public static class C42192c extends PopupWindow {

        /* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView$c$a */
        public class C42193a implements View.OnTouchListener {
            public C42193a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getAction() == 4) {
                    C42192c.this.dismiss();
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C42192c(Context context) {
            super(context);
            setWindowLayoutMode(-1, -2);
            setBackgroundDrawable(new BitmapDrawable());
            setFocusable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new C42193a());
            setAnimationStyle(C0966R.C0968anim.f2416ch);
        }
    }

    public GameDropdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113852d = context;
        this.f113853e = new C42192c(context);
        setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    public void setCurrentSelection(int i) {
        if (this.f113853e.getContentView() != null && (this.f113853e.getContentView() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.f113853e.getContentView();
            int i2 = this.f113856h;
            if (i <= i2 && this.f113855g <= i2 && (viewGroup.getChildAt(i) instanceof TextView) && (viewGroup.getChildAt(this.f113855g) instanceof TextView)) {
                ((TextView) viewGroup.getChildAt(this.f113855g)).setTextColor(this.f113852d.getResources().getColor(C0966R.color.f3563xt));
                ((TextView) viewGroup.getChildAt(i)).setTextColor(this.f113852d.getResources().getColor(C0966R.color.a7f));
                setText(this.f113854f.get(i));
                C42191b bVar = this.f113857i;
                if (!(bVar == null || this.f113855g == i)) {
                    GameLibraryUI.C42211f fVar = (GameLibraryUI.C42211f) bVar;
                    fVar.getClass();
                    LinkedList linkedList = new LinkedList();
                    linkedList.addAll(GameLibraryUI.this.f114028o.keySet());
                    if (i <= linkedList.size() - 1) {
                        GameLibraryUI.this.f114029p = ((Integer) linkedList.get(i)).intValue();
                        Log.m105925i("MicroMsg.GameLibraryUI", "Selected SortType: %d", Integer.valueOf(GameLibraryUI.this.f114029p));
                        GameLibraryUI gameLibraryUI = GameLibraryUI.this;
                        gameLibraryUI.f114032s = 0;
                        gameLibraryUI.mo66228I7();
                        GameLibraryUI gameLibraryUI2 = GameLibraryUI.this;
                        C40314g.m43484c(gameLibraryUI2, 11, 1111, gameLibraryUI2.f114029p + gameLibraryUI2.f114012B, 2, gameLibraryUI2.f114011A, (String) null);
                    }
                }
                this.f113855g = i;
            }
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f113853e.isShowing()) {
            this.f113853e.dismiss();
        } else {
            View view2 = this.f113858j;
            if (view2 == null) {
                this.f113853e.showAsDropDown(this);
            } else {
                this.f113853e.showAsDropDown(view2);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDismiss() {
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }

    public void setAnchorView(View view) {
        this.f113858j = view;
    }

    public void setOnSelectionChangedListener(C42191b bVar) {
        this.f113857i = bVar;
    }
}

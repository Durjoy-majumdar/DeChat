package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C74346y1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.ui.chatting.z3 */
public class C74352z3 {

    /* renamed from: b */
    public static C74352z3 f218403b;

    /* renamed from: a */
    public Object f218404a;

    /* renamed from: com.tencent.mm.ui.chatting.z3$a */
    public static class C74353a implements View.OnHoverListener {

        /* renamed from: d */
        public C74354b f218405d;

        public C74353a(C74354b bVar) {
            this.f218405d = bVar;
        }

        public boolean onHover(View view, MotionEvent motionEvent) {
            boolean z;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C74354b bVar = this.f218405d;
            boolean z2 = false;
            if (bVar != null) {
                C74346y1.C74347b bVar2 = (C74346y1.C74347b) bVar;
                Object tag = view.getTag();
                if (tag == null || !(tag instanceof C74243t8)) {
                    Log.m105924i("MicroMsg.ChattingItemAvatarOnHoverHelper", "The Tag of the View is not a instance of ItemDataTag or is null.");
                } else {
                    C74243t8 t8Var = (C74243t8) view.getTag();
                    String str = t8Var.f217968b;
                    String s = C75592q0.m90789s();
                    if (Util.isNullOrNil(s) || s.equals(str)) {
                        Log.m105926v("MicroMsg.ChattingItemAvatarOnHoverHelper", "Can't talk to self and self username can't be null.");
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        Context context = view.getContext();
                        if (bVar2.f218383d == null) {
                            Resources resources = context.getResources();
                            bVar2.f218387h = (int) (resources.getDimension(C0966R.dimen.f3916iv) + (resources.getDimension(C0966R.dimen.f3623g) * 2.0f));
                            View inflate = View.inflate(context, C0966R.C0971layout.f6858qg, (ViewGroup) null);
                            bVar2.f218384e = inflate;
                            bVar2.f218385f = inflate.findViewById(C0966R.C0970id.l4h);
                            View findViewById = bVar2.f218384e.findViewById(C0966R.C0970id.f6194zy);
                            bVar2.f218386g = findViewById;
                            findViewById.setOnClickListener(bVar2);
                            bVar2.f218385f.setOnClickListener(bVar2);
                            bVar2.f218386g.setOnTouchListener(bVar2.f218393q);
                            bVar2.f218385f.setOnTouchListener(bVar2.f218393q);
                            C76901s0 s0Var = new C76901s0(bVar2.f218384e, -2, bVar2.f218387h, false);
                            bVar2.f218383d = s0Var;
                            s0Var.setOutsideTouchable(true);
                            Rect rect = new Rect();
                            if (context instanceof Activity) {
                                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            }
                            bVar2.f218390n = rect.top;
                            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                            if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
                                bVar2.f218388i = context.getResources().getDimensionPixelSize(C0966R.dimen.f3678b8);
                            } else {
                                bVar2.f218388i = context.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
                            }
                            bVar2.f218383d.setBackgroundDrawable(new ColorDrawable(16777215));
                            bVar2.f218396t = new MTimerHandler(Looper.getMainLooper(), bVar2.f218397u, false);
                            Log.m105924i("MicroMsg.ChattingItemAvatarOnHoverHelper", "Create a new PopupWindow.");
                        }
                        C76901s0 s0Var2 = bVar2.f218383d;
                        int action = motionEvent.getAction();
                        if (action == 9) {
                            bVar2.f218394r = view2;
                            view2.setOnTouchListener(bVar2);
                            if (s0Var2.isShowing()) {
                                s0Var2.dismiss();
                            }
                            if (!bVar2.f218391o) {
                                bVar2.f218386g.setTag(t8Var);
                                bVar2.f218385f.setTag(t8Var);
                                View view3 = bVar2.f218386g;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View view5 = bVar2.f218385f;
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                int[] iArr = new int[2];
                                view2.getLocationInWindow(iArr);
                                int i = iArr[1];
                                view.getWidth();
                                int height = view.getHeight();
                                bVar2.f218389j = 0;
                                int i2 = bVar2.f218390n + bVar2.f218388i;
                                int i3 = bVar2.f218387h;
                                if (i > i2 + i3) {
                                    bVar2.f218389j = ((-height) - i3) - 0;
                                }
                                if (bVar2.f218389j >= 0) {
                                    bVar2.f218384e.setBackgroundResource(C0966R.C0969drawable.byo);
                                } else {
                                    bVar2.f218384e.setBackgroundResource(C0966R.C0969drawable.byp);
                                }
                                bVar2.f218396t.startTimer((long) bVar2.f218395s);
                            }
                        } else if (action == 10) {
                            bVar2.f218391o = false;
                            bVar2.f218394r = null;
                        }
                        z2 = true;
                    }
                }
                C117292a.m165362h(z2, this, "com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return z2;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.z3$b */
    public interface C74354b {
    }
}

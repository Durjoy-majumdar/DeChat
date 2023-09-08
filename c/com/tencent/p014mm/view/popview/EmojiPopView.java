package com.tencent.p014mm.view.popview;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import f40.C86709a0;
import hq3.C98502c;
import hq3.C98503d;
import hq3.C98504e;
import j61.C60778e;
import java.util.Collections;
import java.util.List;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p490dl.C97489o;
import p490dl.C97491p;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.view.popview.EmojiPopView */
public class EmojiPopView extends AbstractPopView implements C11385n {

    /* renamed from: A */
    public final Runnable f285753A;

    /* renamed from: f */
    public EmojiStatusView f285754f;

    /* renamed from: g */
    public ProgressBar f285755g;

    /* renamed from: h */
    public View f285756h;

    /* renamed from: i */
    public View f285757i;

    /* renamed from: j */
    public View f285758j;

    /* renamed from: n */
    public View f285759n;

    /* renamed from: o */
    public View f285760o;

    /* renamed from: p */
    public TextView f285761p;

    /* renamed from: q */
    public TextView f285762q;

    /* renamed from: r */
    public WindowManager.LayoutParams f285763r;

    /* renamed from: s */
    public int f285764s;

    /* renamed from: t */
    public String f285765t;

    /* renamed from: u */
    public EmojiInfo f285766u;

    /* renamed from: v */
    public String f285767v;

    /* renamed from: w */
    public C60778e f285768w;

    /* renamed from: x */
    public int f285769x;

    /* renamed from: y */
    public boolean f285770y;

    /* renamed from: z */
    public C89779i0 f285771z;

    /* renamed from: com.tencent.mm.view.popview.EmojiPopView$a */
    public class C97339a implements Runnable {

        /* renamed from: com.tencent.mm.view.popview.EmojiPopView$a$a */
        public class C97340a implements DialogInterface.OnCancelListener {
            public C97340a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                EmojiPopView.this.f285770y = false;
            }
        }

        public C97339a() {
        }

        public void run() {
            EmojiPopView emojiPopView = EmojiPopView.this;
            if (emojiPopView.f285771z == null) {
                emojiPopView.f285771z = C89779i0.m112248e(emojiPopView.getContext(), EmojiPopView.this.getContext().getString(C0966R.string.c_x), true, 0, new C97340a());
            }
        }
    }

    /* renamed from: com.tencent.mm.view.popview.EmojiPopView$b */
    public class C97341b implements AbsEmojiView.C92684b {
        public C97341b() {
        }

        /* renamed from: a */
        public void mo126734a(int i) {
            Log.m105925i("MicroMsg.EmojiPopView", "onStatus: %s", Integer.valueOf(i));
            if (i == 1) {
                EmojiPopView.this.f285755g.setVisibility(8);
                EmojiPopView.this.f285754f.setVisibility(0);
                return;
            }
            EmojiPopView.this.f285754f.setVisibility(4);
            EmojiPopView.this.f285755g.setVisibility(0);
        }
    }

    public EmojiPopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    public static void m125296e(EmojiPopView emojiPopView) {
        Log.m105925i("MicroMsg.EmojiPopView", "top: %s, %s, %s", emojiPopView.f285765t, Integer.valueOf(emojiPopView.f285764s), Boolean.valueOf(emojiPopView.f285770y));
        if (!emojiPopView.f285770y) {
            int i = emojiPopView.f285764s;
            if (i == 0 || i == 1) {
                Log.m105924i("MicroMsg.EmojiPopView", "showLoading");
                emojiPopView.f285770y = true;
                emojiPopView.postDelayed(emojiPopView.f285753A, 100);
                emojiPopView.f285768w = new C60778e(emojiPopView.f285764s, 3, Collections.singletonList(emojiPopView.f285765t));
                C86709a0.m107529k().f251779b.mo123460f(emojiPopView.f285768w);
            }
        }
    }

    /* renamed from: a */
    public void mo104700a() {
        mo136463f();
        super.mo104700a();
    }

    /* renamed from: d */
    public void mo104703d(View view) {
        mo104702c(view.getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f285763r.x = iArr[0] - ((getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        this.f285763r.y = (iArr[1] - getMeasuredHeight()) - this.f220883e;
        int i = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (view.getMeasuredWidth() / 2);
        if (measuredWidth < getWidth() / 2) {
            this.f285763r.x = measuredWidth - C76577a.m92151b(getContext(), 32);
            this.f285756h.setBackgroundResource(C0966R.C0969drawable.emoji_left_popup_bg);
            this.f285759n.setBackgroundResource(C0966R.C0969drawable.emoji_left_popup_left_bg);
            this.f285760o.setBackgroundResource(C0966R.C0969drawable.emoji_left_popup_right_bg);
            this.f285761p.setBackgroundResource(C0966R.C0969drawable.emoji_left_popup_option_all_bg);
        } else if ((getWidth() / 2) + measuredWidth > i) {
            this.f285763r.x = (measuredWidth + C76577a.m92151b(getContext(), 32)) - getMeasuredWidth();
            this.f285756h.setBackgroundResource(C0966R.C0969drawable.emoji_right_popup_bg);
            this.f285759n.setBackgroundResource(C0966R.C0969drawable.emoji_right_popup_left_bg);
            this.f285760o.setBackgroundResource(C0966R.C0969drawable.emoji_right_popup_right_bg);
            this.f285761p.setBackgroundResource(C0966R.C0969drawable.emoji_right_popup_option_all_bg);
        } else {
            this.f285756h.setBackgroundResource(C0966R.C0969drawable.emoji_popup_bg);
            this.f285759n.setBackgroundResource(C0966R.C0969drawable.emoji_popup_left_bg);
            this.f285760o.setBackgroundResource(C0966R.C0969drawable.emoji_popup_right_bg);
            this.f285761p.setBackgroundResource(C0966R.C0969drawable.emoji_popup_option_all_bg);
        }
    }

    /* renamed from: f */
    public final void mo136463f() {
        Log.m105924i("MicroMsg.EmojiPopView", "hideLoading");
        this.f285770y = false;
        removeCallbacks(this.f285753A);
        C89779i0 i0Var = this.f285771z;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: g */
    public final void mo136464g() {
        C76879j.m92707A(getContext(), getContext().getString(C0966R.string.c_w), "", "", getContext().getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.f285763r;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107529k().f251779b.mo123470p(698, this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        List singletonList = Collections.singletonList(this.f285765t);
        Log.m105925i("MicroMsg.EmojiPopView", "onSceneEnd: %s, %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), this.f285765t, Integer.valueOf(this.f285764s));
        C60778e eVar = this.f285768w;
        if (eVar != null && yVar == eVar) {
            int i3 = eVar.f173111g;
            if (i3 == 3) {
                if (i == 0 && i2 == 0) {
                    if (this.f285764s == 0) {
                        C97489o.m125592g().mo136771m(true);
                        C97489o.m125592g().mo136769k(true);
                    } else {
                        C97489o.m125592g().mo136770l(true);
                    }
                    C30790w2.m39221h().mo57717d().c40(this.f285764s, singletonList);
                    C30764p2.f82718j.mo57680g();
                    mo104700a();
                    return;
                }
                mo136464g();
                mo136463f();
            } else if (i3 != 2) {
            } else {
                if (i == 0 && i2 == 0) {
                    if (this.f285764s == 0) {
                        C97489o.m125592g().mo136771m(true);
                        C97489o.m125592g().mo136769k(true);
                    } else {
                        C97489o.m125592g().mo136770l(true);
                    }
                    C30790w2.m39221h().mo57717d().mo142037LL(singletonList, this.f285764s);
                    C30764p2 p2Var = C30764p2.f82718j;
                    if (p2Var.mo57678e() || C30777t2.f82756d.wx0()) {
                        p2Var.mo57680g();
                    }
                    C97491p.f286143a.mo136773a(true);
                    mo104700a();
                    return;
                }
                mo136464g();
                mo136463f();
            }
        }
    }

    public void setEmojiInfo(EmojiInfo emojiInfo) {
        if (emojiInfo == null) {
            this.f285754f.setVisibility(4);
            this.f285755g.setVisibility(0);
            Log.m105924i("MicroMsg.EmojiPopView", "emoji is null. set null");
        } else if (!emojiInfo.getMd5().equals(this.f285765t)) {
            this.f285765t = emojiInfo.getMd5();
            this.f285766u = emojiInfo;
            this.f285754f.setStatusListener(new C97341b());
            this.f285754f.setEmojiInfo(emojiInfo);
            boolean z = EmojiDebugUI.f266600g;
            if (EmojiDebugUI.f266602i) {
                this.f285762q.setText(emojiInfo.field_meanings);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPopupType(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r1 == r2) goto L_0x0016
            r6 = 3
            if (r1 == r6) goto L_0x0016
            r6 = 4
            if (r1 != r6) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r6 = 0
            goto L_0x0017
        L_0x0016:
            r6 = 1
        L_0x0017:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r7 == 0) goto L_0x004d
            if (r6 == 0) goto L_0x002d
            java.lang.Class<vy.b> r7 = p733vy.C37873b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            vy.b r7 = (p733vy.C37873b) r7
            boolean r7 = r7.mo61224e()
            if (r7 != 0) goto L_0x004d
        L_0x002d:
            r7 = -1
            if (r1 == r7) goto L_0x004d
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r0.f285766u
            if (r7 == 0) goto L_0x004d
            boolean r7 = r7.mo62678k()
            if (r7 != 0) goto L_0x004d
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r0.f285766u
            int r8 = r7.field_catalog
            r9 = 18
            if (r8 == r9) goto L_0x004d
            com.tencent.mm.api.IEmojiInfo$a r7 = r7.mo62647T1()
            com.tencent.mm.api.IEmojiInfo$a r8 = com.tencent.p014mm.api.IEmojiInfo.C40005a.STATUS_SUCCESS
            if (r7 == r8) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r7 = 0
            goto L_0x004e
        L_0x004d:
            r7 = 1
        L_0x004e:
            r0.f285769x = r4
            r8 = 8
            if (r7 == 0) goto L_0x017f
            android.view.View r1 = r0.f285758j
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r0.f285759n
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r0.f285760o
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r0.f285757i
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r1 = r0.f285761p
            r1.setVisibility(r8)
            android.widget.TextView r1 = r0.f285762q
            r1.setVisibility(r8)
            com.tencent.mm.emoji.view.EmojiStatusView r1 = r0.f285754f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            android.content.Context r2 = r25.getContext()
            r3 = 28
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r1.f44468w = r2
            return
        L_0x017f:
            com.tencent.mm.emoji.view.EmojiStatusView r7 = r0.f285754f
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r7
            android.content.Context r9 = r25.getContext()
            r10 = 16
            int r9 = kg3.C76577a.m92151b(r9, r10)
            r7.f44468w = r9
            if (r1 == 0) goto L_0x02e4
            if (r1 != r3) goto L_0x0199
            goto L_0x02e4
        L_0x0199:
            if (r6 == 0) goto L_0x0516
            android.view.View r2 = r0.f285758j
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r13 = "setPopupType"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r0.f285759n
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r5)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r20 = "setPopupType"
            java.lang.String r21 = "(I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r2 = r0.f285760o
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r0.f285757i
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r2 = r0.f285761p
            r2.setVisibility(r4)
            android.widget.TextView r2 = r0.f285762q
            r2.setVisibility(r4)
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r0.f285766u
            java.lang.String r2 = r2.field_groupId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x02bc
            android.widget.TextView r2 = r0.f285761p
            r2.setVisibility(r8)
        L_0x02bc:
            java.lang.Class<z51.g> r2 = z51.C39315g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.g r2 = (z51.C39315g) r2
            zc3.b r2 = r2.getProvider()
            java.lang.String r3 = r0.f285765t
            java.lang.String r2 = r2.mo138012T(r3)
            r0.f285767v = r2
            android.widget.TextView r3 = r0.f285762q
            r3.setText(r2)
            java.lang.String r2 = r0.f285767v
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0516
            android.widget.TextView r2 = r0.f285762q
            r2.setVisibility(r8)
            goto L_0x0516
        L_0x02e4:
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r0.f285766u
            boolean r3 = u61.C101964h.m134228j(r3)
            if (r3 == 0) goto L_0x0405
            android.view.View r3 = r0.f285758j
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r6.mo10233c(r5)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r6.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r3 = r0.f285759n
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r6)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r3 = r0.f285760o
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r6)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r3 = r0.f285757i
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r6)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r3 = r0.f285761p
            r3.setVisibility(r4)
            android.widget.TextView r3 = r0.f285761p
            r4 = 2131825109(0x7f1111d5, float:1.9283065E38)
            r3.setText(r4)
            r0.f285769x = r2
            goto L_0x0516
        L_0x0405:
            android.view.View r2 = r0.f285758j
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r0.f285759n
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r0.f285760o
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r12 = "setPopupType"
            java.lang.String r13 = "(I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r11 = "setPopupType"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r0.f285757i
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r19 = "setPopupType"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/view/popview/EmojiPopView"
            java.lang.String r18 = "setPopupType"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r2 = r0.f285761p
            r2.setVisibility(r8)
            android.widget.TextView r2 = r0.f285762q
            r2.setVisibility(r8)
            boolean r2 = com.tencent.p014mm.emoji.debug.EmojiDebugUI.f266600g
            boolean r2 = com.tencent.p014mm.emoji.debug.EmojiDebugUI.f266602i
            if (r2 == 0) goto L_0x0516
            android.widget.TextView r2 = r0.f285762q
            r2.setVisibility(r4)
        L_0x0516:
            r0.f285764s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.popview.EmojiPopView.setPopupType(int):void");
    }

    public EmojiPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285764s = -1;
        this.f285769x = 0;
        this.f285770y = false;
        this.f285753A = new C97339a();
        View.inflate(context, C0966R.C0971layout.a28, this);
        this.f285756h = findViewById(C0966R.C0970id.cgz);
        this.f285754f = (EmojiStatusView) findViewById(C0966R.C0970id.f39);
        this.f285755g = (ProgressBar) findViewById(C0966R.C0970id.i7j);
        this.f285757i = findViewById(C0966R.C0970id.ch4);
        this.f285758j = findViewById(C0966R.C0970id.f357924ch1);
        this.f285759n = findViewById(C0966R.C0970id.f357926ch3);
        this.f285760o = findViewById(C0966R.C0970id.f357923ch0);
        this.f285761p = (TextView) findViewById(C0966R.C0970id.f357925ch2);
        this.f285762q = (TextView) findViewById(C0966R.C0970id.ch5);
        setBackground((Drawable) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 262400, 1);
        this.f285763r = layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        this.f285759n.setOnClickListener(new C98502c(this));
        this.f285760o.setOnClickListener(new C98503d(this));
        this.f285761p.setOnClickListener(new C98504e(this));
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107529k().f251779b.mo123455a(698, this);
        }
    }
}

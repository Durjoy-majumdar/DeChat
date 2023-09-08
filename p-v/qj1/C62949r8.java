package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C0668l;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.p797ui.p798at.FinderLiveAtGroupMemberDialog;
import com.tencent.p014mm.plugin.finder.live.p797ui.p798at.FinderLiveAtSomeoneDialog;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import cq1.C57962a;
import d60.C58124b;
import dd3.C58256b;
import di3.C7335d;
import di3.C86312j;
import fe1.C8014g;
import fh1.C45793z0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ky2.C10432i;
import nj3.C76912y0;
import o40.C61926c;
import p629ny.C76979h;
import qk1.C63221i1;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49765hx0;
import te3.C50317lw0;
import te3.C64234an2;
import te3.C64311db1;

/* renamed from: qj1.r8 */
public final class C62949r8 extends C62660c {

    /* renamed from: V */
    public static final long f178618V;

    /* renamed from: W */
    public static final long f178619W;

    /* renamed from: X */
    public static final /* synthetic */ int f178620X = 0;

    /* renamed from: A */
    public final RecyclerView f178621A;

    /* renamed from: B */
    public C63221i1 f178622B;

    /* renamed from: C */
    public final ArrayList<String> f178623C;

    /* renamed from: D */
    public C12322e5 f178624D;

    /* renamed from: E */
    public SmileyPanel f178625E;

    /* renamed from: F */
    public Context f178626F;

    /* renamed from: G */
    public C62974s9 f178627G;

    /* renamed from: H */
    public boolean f178628H;

    /* renamed from: I */
    public int f178629I;

    /* renamed from: J */
    public String f178630J;

    /* renamed from: K */
    public C49765hx0 f178631K;

    /* renamed from: L */
    public boolean f178632L;

    /* renamed from: M */
    public long f178633M;

    /* renamed from: N */
    public int f178634N;

    /* renamed from: P */
    public long f178635P;

    /* renamed from: Q */
    public C64311db1 f178636Q;

    /* renamed from: R */
    public boolean f178637R;

    /* renamed from: S */
    public ArrayList<C12644g> f178638S;

    /* renamed from: T */
    public String f178639T;

    /* renamed from: U */
    public boolean f178640U;

    /* renamed from: p */
    public final C58124b f178641p;

    /* renamed from: q */
    public final int f178642q = 1;

    /* renamed from: r */
    public final int f178643r = 2;

    /* renamed from: s */
    public int f178644s = 120;

    /* renamed from: t */
    public final LinearLayout f178645t;

    /* renamed from: u */
    public final View f178646u;

    /* renamed from: v */
    public final MMEditText f178647v;

    /* renamed from: w */
    public final TextView f178648w;

    /* renamed from: x */
    public final ImageView f178649x;

    /* renamed from: y */
    public final TextView f178650y;

    /* renamed from: z */
    public final WeImageView f178651z;

    /* renamed from: qj1.r8$b */
    public static final class C12643b implements View.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f36228d;

        public C12643b(C62949r8 r8Var) {
            this.f36228d = r8Var;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            CharSequence charSequence;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            int i2 = 0;
            if (i == 67 && keyEvent.getAction() == 0) {
                int selectionEnd = this.f36228d.f178647v.getSelectionEnd();
                Editable text = this.f36228d.f178647v.getText();
                if (text != null) {
                    int i3 = selectionEnd - 1;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    charSequence = text.subSequence(i3, selectionEnd);
                } else {
                    charSequence = null;
                }
                if (C87412m.m108589b(String.valueOf(charSequence), " ")) {
                    CharSequence subSequence = text.subSequence(0, selectionEnd);
                    int length = subSequence.length() - 1;
                    while (true) {
                        if (-1 >= length) {
                            break;
                        } else if (subSequence.charAt(length) == '@') {
                            i2 = length;
                            break;
                        } else {
                            length--;
                        }
                    }
                    MMEditText mMEditText = this.f36228d.f178647v;
                    mMEditText.setText(mMEditText.getText().replace(i2, selectionEnd, ""));
                    this.f36228d.f178647v.setSelection(i2);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: qj1.r8$g */
    public static final class C12644g {

        /* renamed from: a */
        public final C49765hx0 f36229a;

        /* renamed from: b */
        public final int f36230b;

        /* renamed from: c */
        public final int f36231c;

        public C12644g(C49765hx0 hx02, int i, int i2) {
            C87412m.m108594g(hx02, "contact");
            this.f36229a = hx02;
            this.f36230b = i;
            this.f36231c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12644g)) {
                return false;
            }
            C12644g gVar = (C12644g) obj;
            return C87412m.m108589b(this.f36229a, gVar.f36229a) && this.f36230b == gVar.f36230b && this.f36231c == gVar.f36231c;
        }

        public int hashCode() {
            return (((this.f36229a.hashCode() * 31) + this.f36230b) * 31) + this.f36231c;
        }

        public String toString() {
            return "AtWxContact(contact=" + this.f36229a + ", preIndex=" + this.f36230b + ", suffixIndex=" + this.f36231c + ')';
        }
    }

    /* renamed from: qj1.r8$i */
    public static final class C12645i implements View.OnClickListener {

        /* renamed from: d */
        public static final C12645i f36232d = new C12645i();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$inputParent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$inputParent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r8$a */
    public static final class C62950a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178652d;

        public C62950a(C62949r8 r8Var) {
            this.f178652d = r8Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62949r8 r8Var = this.f178652d;
            boolean z = r8Var.f178629I != r8Var.f178643r;
            if (!z) {
                r8Var.mo87883p1();
                Context context = r8Var.f178626F;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).showVKB();
            } else {
                r8Var.f178625E.setVisibility(0);
                ImageView imageView = r8Var.f178649x;
                Drawable drawable = r8Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
                C74933u4.m89769f(drawable, -1);
                imageView.setImageDrawable(drawable);
                r8Var.f178629I = r8Var.f178643r;
                r8Var.f178625E.setAlpha(0.0f);
                r8Var.f178625E.animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
                Context context2 = r8Var.f178626F;
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context2).hideVKB();
                r8Var.mo87882o1(r8Var.f178634N);
            }
            if (z) {
                ImageView imageView2 = r8Var.f178649x;
                Drawable drawable2 = r8Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
                C74933u4.m89769f(drawable2, -1);
                imageView2.setImageDrawable(drawable2);
            } else {
                ImageView imageView3 = r8Var.f178649x;
                Drawable drawable3 = r8Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
                C74933u4.m89769f(drawable3, -1);
                imageView3.setImageDrawable(drawable3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r8$c */
    public static final class C62951c implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178653d;

        /* renamed from: qj1.r8$c$a */
        public static final class C62952a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C62949r8 f178654d;

            public C62952a(C62949r8 r8Var) {
                this.f178654d = r8Var;
            }

            public final void run() {
                C62949r8 r8Var = this.f178654d;
                int i = C62949r8.f178620X;
                r8Var.mo87877g1();
            }
        }

        public C62951c(C62949r8 r8Var) {
            this.f178653d = r8Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
            if ((r5 != null ? !z04.C112551y.m153811k(r5) : false) != false) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                qj1.r8 r5 = r4.f178653d
                int r0 = r5.f178644s
                com.tencent.mm.ui.widget.MMEditText r1 = r5.f178647v
                qn3.c r1 = qn3.C77382c.m93286b(r1)
                r2 = 1
                r1.f225611e = r2
                r1.f225610d = r0
                com.tencent.mm.ui.tools.p0$a r3 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
                r1.f225612f = r3
                r1.f225607a = r2
                qj1.x8 r3 = new qj1.x8
                r3.<init>(r5, r0)
                r1.mo107499d(r3)
                qj1.r8 r5 = r4.f178653d
                com.tencent.mm.ui.widget.MMEditText r0 = r5.f178647v
                qj1.r8$c$a r1 = new qj1.r8$c$a
                r1.<init>(r5)
                r0.post(r1)
                qj1.r8 r5 = r4.f178653d
                com.tencent.mm.ui.widget.MMEditText r5 = r5.f178647v
                android.text.Editable r5 = r5.getText()
                r0 = 0
                if (r5 == 0) goto L_0x003c
                int r5 = r5.length()
                if (r5 <= 0) goto L_0x003c
                r5 = 1
                goto L_0x003d
            L_0x003c:
                r5 = 0
            L_0x003d:
                if (r5 == 0) goto L_0x0053
                qj1.r8 r5 = r4.f178653d
                com.tencent.mm.ui.widget.MMEditText r5 = r5.f178647v
                android.text.Editable r5 = r5.getText()
                if (r5 == 0) goto L_0x004f
                boolean r5 = z04.C112551y.m153811k(r5)
                r5 = r5 ^ r2
                goto L_0x0050
            L_0x004f:
                r5 = 0
            L_0x0050:
                if (r5 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r2 = 0
            L_0x0054:
                qj1.r8 r5 = r4.f178653d
                boolean r0 = r5.f178628H
                if (r2 != r0) goto L_0x005b
                return
            L_0x005b:
                r5.f178628H = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.C62951c.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            if (charSequence == null || (str = charSequence.subSequence(i, i3 + i).toString()) == null) {
                str = "";
            }
            if (C87412m.m108589b(str, "@")) {
                this.f178653d.f178651z.performClick();
            }
        }
    }

    /* renamed from: qj1.r8$d */
    public static final class C62953d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178655d;

        public C62953d(C62949r8 r8Var) {
            this.f178655d = r8Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:217:0x07de  */
        /* JADX WARNING: Removed duplicated region for block: B:218:0x07e2  */
        /* JADX WARNING: Removed duplicated region for block: B:226:0x07f6  */
        /* JADX WARNING: Removed duplicated region for block: B:229:0x07fc  */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x080d  */
        /* JADX WARNING: Removed duplicated region for block: B:268:0x087e  */
        /* JADX WARNING: Removed duplicated region for block: B:326:0x09ca  */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x09d3  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0203  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x02ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r53) {
            /*
                r52 = this;
                r6 = r52
                ak1.g0 r7 = ak1.C0073g0.ANCHOR_COMMENT
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r53
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r52
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                qj1.r8 r14 = r6.f178655d
                int r0 = qj1.C62949r8.f178620X
                r14.getClass()
                java.lang.Class<ak1.o> r15 = ak1.C54108o.class
                java.lang.Class<cl1.z0> r12 = cl1.C0702z0.class
                java.lang.Class<cl1.o> r13 = cl1.C54991o.class
                java.lang.Class<cl1.j> r11 = cl1.C39975j.class
                java.lang.String r10 = "Finder.LiveInputPlugin"
                java.lang.String r0 = "msgSendClick source:send btn!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                com.tencent.mm.ui.widget.MMEditText r0 = r14.f178647v
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x09e5
                com.tencent.mm.ui.widget.MMEditText r0 = r14.f178647v
                android.text.Editable r0 = r0.getText()
                java.lang.String r9 = ""
                if (r0 == 0) goto L_0x0050
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x0051
            L_0x0050:
                r0 = r9
            L_0x0051:
                com.tencent.mm.ui.widget.MMEditText r1 = r14.f178647v
                r8 = 0
                r1.setText(r8)
                int r1 = r0.length()
                r5 = 0
                if (r1 != 0) goto L_0x0060
                r1 = 1
                goto L_0x0061
            L_0x0060:
                r1 = 0
            L_0x0061:
                r3 = 2
                if (r1 != 0) goto L_0x00e9
                java.util.ArrayList<qj1.r8$g> r1 = r14.f178638S
                if (r1 == 0) goto L_0x0071
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x006f
                goto L_0x0071
            L_0x006f:
                r1 = 0
                goto L_0x0072
            L_0x0071:
                r1 = 1
            L_0x0072:
                if (r1 == 0) goto L_0x0076
                goto L_0x00e9
            L_0x0076:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                z04.k r2 = new z04.k
                java.lang.String r4 = "@.*? "
                r2.<init>((java.lang.String) r4)
                y04.h r2 = z04.C66723k.m78722b(r2, r0, r5, r3, r8)
                y04.g r2 = (y04.C66483g) r2
                y04.g$a r4 = new y04.g$a
                r4.<init>(r2)
            L_0x008d:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r4.next()
                z04.g r2 = (z04.C66716g) r2
                java.lang.String r2 = r2.getValue()
                java.lang.String r5 = "@"
                java.lang.String r2 = z04.C112550d0.m153777M(r2, r5)
                java.lang.String r5 = " "
                java.lang.String r2 = z04.C112550d0.m153780P(r2, r5)
                r1.add(r2)
                r5 = 0
                goto L_0x008d
            L_0x00af:
                java.util.ArrayList<qj1.r8$g> r2 = r14.f178638S
                if (r2 == 0) goto L_0x00e5
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00bc:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x00df
                java.lang.Object r5 = r2.next()
                r8 = r5
                qj1.r8$g r8 = (qj1.C62949r8.C12644g) r8
                te3.hx0 r8 = r8.f36229a
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
                if (r8 == 0) goto L_0x00d3
                java.lang.String r8 = r8.nickname
                if (r8 != 0) goto L_0x00d4
            L_0x00d3:
                r8 = r9
            L_0x00d4:
                boolean r8 = r1.contains(r8)
                if (r8 == 0) goto L_0x00dd
                r4.add(r5)
            L_0x00dd:
                r8 = 0
                goto L_0x00bc
            L_0x00df:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r4)
                goto L_0x00e6
            L_0x00e5:
                r1 = 0
            L_0x00e6:
                r14.f178638S = r1
                goto L_0x00f0
            L_0x00e9:
                java.util.ArrayList<qj1.r8$g> r1 = r14.f178638S
                if (r1 == 0) goto L_0x00f0
                r1.clear()
            L_0x00f0:
                er1.j4 r1 = er1.C58739j4.f168176a
                java.lang.String r8 = r1.mo83716k(r0)
                int r0 = r8.length()
                if (r0 != 0) goto L_0x00fe
                r0 = 1
                goto L_0x00ff
            L_0x00fe:
                r0 = 0
            L_0x00ff:
                if (r0 == 0) goto L_0x0103
                goto L_0x09e5
            L_0x0103:
                cj1.h5 r17 = cj1.C0548h5.f1327a
                d60.b r0 = r14.f178641p
                java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                androidx.lifecycle.i0 r1 = r14.mo87696x0(r1)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r1 = r1.f182392d
                cj1.h5$b r21 = cj1.C0548h5.C0550b.Comment
                r22 = 0
                r23 = 8
                r24 = 0
                r18 = r0
                r19 = r1
                cj1.C0548h5.m491b(r17, r18, r19, r21, r22, r23, r24)
                long r4 = r14.f178633M
                boolean r2 = r14.f178632L
                te3.hx0 r1 = r14.f178631K
                java.lang.String r0 = ", clientMsgId:"
                r17 = r4
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                java.lang.String r4 = "PARAM_FINDER_LIVE_BOX_MSG_CONTENT"
                r19 = r5
                java.lang.String r5 = "PARAM_FINDER_LIVE_BOX_MSG_TYPE"
                r20 = r5
                java.lang.String r5 = "button_type"
                r21 = r4
                if (r1 == 0) goto L_0x03be
                boolean r23 = r14.mo87881n1()
                if (r23 != 0) goto L_0x02d8
                ok1.e r4 = ok1.C62042e.f176370a
                boolean r24 = r4.mo87027N0()
                if (r24 == 0) goto L_0x01b1
                di3.d r24 = di3.C86312j.m106911c(r15)
                ak1.o r24 = (ak1.C54108o) r24
                r24.getClass()
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x019c }
                r3.<init>()     // Catch:{ all -> 0x019c }
                r26 = r0
                r25 = 2
                java.lang.String r0 = java.lang.String.valueOf(r25)     // Catch:{ all -> 0x018d }
                r3.put(r5, r0)     // Catch:{ all -> 0x018d }
                java.lang.String r3 = java.lang.String.valueOf(r25)     // Catch:{ all -> 0x018d }
                r27 = 0
                r28 = 4
                r29 = 0
                r30 = r26
                r0 = r24
                r31 = r1
                r1 = r7
                r24 = r2
                r2 = r3
                r3 = r27
                r33 = r4
                r32 = r21
                r4 = r28
                r34 = r5
                r6 = r19
                r19 = r7
                r7 = r20
                r5 = r29
                ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x01ae }
                goto L_0x01af
            L_0x018d:
                r31 = r1
                r24 = r2
                r33 = r4
                r34 = r5
                r6 = r19
                r32 = r21
                r30 = r26
                goto L_0x01aa
            L_0x019c:
                r30 = r0
                r31 = r1
                r24 = r2
                r33 = r4
                r34 = r5
                r6 = r19
                r32 = r21
            L_0x01aa:
                r19 = r7
                r7 = r20
            L_0x01ae:
            L_0x01af:
                r5 = 1
                goto L_0x01f9
            L_0x01b1:
                r30 = r0
                r31 = r1
                r24 = r2
                r33 = r4
                r34 = r5
                r6 = r19
                r32 = r21
                r19 = r7
                r7 = r20
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ak1.w r0 = (ak1.C54116w) r0
                r0.getClass()
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.String r2 = "content"
                r1.put(r2, r8)
                ak1.f0$o0 r36 = ak1.C54067f0.C54076o0.REPLY
                java.lang.String r37 = r1.toString()
                r38 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 252(0xfc, float:3.53E-43)
                r46 = 0
                r35 = r0
                ak1.C54116w.Ex0(r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46)
                int r1 = r0.f151905I
                r5 = 1
                int r1 = r1 + r5
                r0.f151905I = r1
            L_0x01f9:
                qg1.c0$a r0 = qg1.C47824c0.f128387v
                b50.j r1 = b50.C54424j.f152652a
                d50.e r1 = r1.mo75237a()
                if (r1 == 0) goto L_0x0206
                java.lang.String r1 = r1.f166192B
                goto L_0x0207
            L_0x0206:
                r1 = 0
            L_0x0207:
                androidx.lifecycle.i0 r2 = r14.mo87696x0(r12)
                cl1.z0 r2 = (cl1.C0702z0) r2
                int r2 = r2.mo671e3()
                r3 = r31
                te3.xs0 r0 = r0.mo72575a(r3, r8, r1, r2)
                te3.hj1 r1 = new te3.hj1
                r1.<init>()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r2.getClass()
                al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
                if (r2 == 0) goto L_0x022c
                al1.l r3 = r2.f151988c
                if (r3 == 0) goto L_0x022c
                int r3 = r3.f152031k
                goto L_0x022d
            L_0x022c:
                r3 = 0
            L_0x022d:
                r1.f134677n = r3
                if (r2 == 0) goto L_0x0238
                al1.l r2 = r2.f151988c
                if (r2 == 0) goto L_0x0238
                int r2 = r2.f152031k
                goto L_0x0239
            L_0x0238:
                r2 = 0
            L_0x0239:
                r1.f134675i = r2
                java.lang.String r2 = r0.f144904f
                fj1.b r3 = r14.mo87684A0()
                r4 = r33
                r4.mo87061a(r2, r3)
                qg1.c0 r2 = new qg1.c0
                fj1.b r3 = r14.mo87684A0()
                qj1.q9 r5 = new qj1.q9
                r16 = r8
                r53 = r15
                r15 = 0
                r8 = r5
                r47 = r9
                r9 = r14
                r15 = r10
                r10 = r16
                r21 = r7
                r7 = r11
                r11 = r24
                r22 = r7
                r48 = r12
                r7 = r13
                r12 = r17
                r8.<init>(r9, r10, r11, r12)
                r2.<init>(r0, r3, r1, r5)
                nr3.e r1 = r2.mo9225i()
                android.content.Context r2 = r14.f178626F
                gy3.C87412m.m108592e(r2, r6)
                com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
                r1.mo11397F(r2)
                fj1.b r1 = r14.mo87684A0()
                cj1.f2 r0 = r4.mo87065b(r0, r1)
                if (r0 == 0) goto L_0x02ca
                androidx.lifecycle.i0 r1 = r14.mo87696x0(r7)
                cl1.o r1 = (cl1.C54991o) r1
                java.util.List<cj1.o5> r1 = r1.f154224L2
                r1.add(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "selfcomment add reply msg, content:"
                r1.append(r2)
                java.lang.String r2 = r0.getContent()
                r1.append(r2)
                r2 = r30
                r1.append(r2)
                te3.xs0 r0 = r0.f1301a
                java.lang.String r0 = r0.f144904f
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_MSG
                r3 = 0
                r4 = 2
                d60.C58124b.C7172a.m7372a(r0, r1, r3, r4, r3)
                r0 = r3
                r12 = r16
                r4 = r21
                r11 = r32
                r5 = r47
                r13 = 20057(0x4e59, float:2.8106E-41)
                goto L_0x03ae
            L_0x02ca:
                r2 = r30
                r12 = r16
                r4 = r21
                r11 = r32
                r5 = r47
                r13 = 20057(0x4e59, float:2.8106E-41)
                goto L_0x03ad
            L_0x02d8:
                r3 = r1
                r24 = r2
                r34 = r5
                r16 = r8
                r47 = r9
                r5 = r11
                r48 = r12
                r53 = r15
                r6 = r19
                r32 = r21
                r4 = 2
                r2 = r0
                r19 = r7
                r15 = r10
                r7 = r13
                r21 = r20
                androidx.lifecycle.i0 r0 = r14.mo87696x0(r5)
                cl1.j r0 = (cl1.C39975j) r0
                androidx.lifecycle.z<te3.lw0> r1 = r0.f107170j
                java.lang.Object r1 = r1.getValue()
                te3.lw0 r1 = (te3.C50317lw0) r1
                if (r1 == 0) goto L_0x0306
                java.lang.String r9 = r1.f137677e
                if (r9 != 0) goto L_0x0308
            L_0x0306:
                r9 = r47
            L_0x0308:
                te3.lw0 r1 = new te3.lw0
                r1.<init>()
                r8 = 1
                r1.f137676d = r8
                r1.f137677e = r9
                b50.j r8 = b50.C54424j.f152652a
                d50.e r8 = r8.mo75237a()
                if (r8 == 0) goto L_0x031d
                java.lang.String r8 = r8.f166192B
                goto L_0x031e
            L_0x031d:
                r8 = 0
            L_0x031e:
                te3.xs0 r10 = new te3.xs0
                r10.<init>()
                r10.f144902d = r3
                te3.vu0 r3 = new te3.vu0
                r3.<init>()
                r12 = r16
                r3.f143698d = r12
                te3.lh1 r11 = new te3.lh1
                r11.<init>()
                r11.f137422d = r8
                r3.f143699e = r11
                byte[] r3 = r3.toByteArray()
                pe3.b r3 = pe3.C89349b.m111674a(r3)
                r10.f144906h = r3
                r3 = 20002(0x4e22, float:2.8029E-41)
                r10.f144903e = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r8 = eb0.C75592q0.m90789s()
                r3.append(r8)
                r22 = r5
                long r4 = java.lang.System.currentTimeMillis()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r10.f144904f = r3
                te3.hx0 r3 = new te3.hx0
                r3.<init>()
                com.tencent.mm.protocal.protobuf.FinderContact r4 = new com.tencent.mm.protocal.protobuf.FinderContact
                r4.<init>()
                java.lang.String r5 = eb0.C75592q0.m90789s()
                r4.username = r5
                fj1.b r5 = fj1.C45795b.f123698n
                if (r5 == 0) goto L_0x0380
                androidx.lifecycle.i0 r5 = r5.mo71262a(r7)
                cl1.o r5 = (cl1.C54991o) r5
                java.lang.String r5 = r5.mo75977P3()
                if (r5 != 0) goto L_0x0384
            L_0x0380:
                java.lang.String r5 = eb0.C75592q0.m90783m()
            L_0x0384:
                r4.nickname = r5
                r5 = r47
                r4.headUrl = r5
                r3.f134919d = r4
                r10.f144914s = r3
                r10.f144910o = r1
                r0.mo62582j3(r9, r10)
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_BOX_MSG
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = r21
                r13 = 20057(0x4e59, float:2.8106E-41)
                r3.putInt(r4, r13)
                r11 = r32
                r3.putString(r11, r12)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                r0.statusChange(r1, r3)
            L_0x03ad:
                r0 = 0
            L_0x03ae:
                r14.f178631K = r0
                rx3.b0 r8 = rx3.C13598b0.f38549a
                r0 = r8
                r9 = r11
                r11 = r12
                r50 = r48
                r8 = 20057(0x4e59, float:2.8106E-41)
                r12 = r5
                r5 = r22
                goto L_0x0695
            L_0x03be:
                r24 = r2
                r34 = r5
                r5 = r9
                r22 = r11
                r48 = r12
                r53 = r15
                r6 = r19
                r4 = r20
                r11 = r21
                r2 = r0
                r19 = r7
                r12 = r8
                r15 = r10
                r7 = r13
                r13 = 20057(0x4e59, float:2.8106E-41)
                java.util.ArrayList<qj1.r8$g> r8 = r14.f178638S
                if (r8 == 0) goto L_0x068b
                boolean r0 = r8.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x03e4
                goto L_0x03e5
            L_0x03e4:
                r8 = 0
            L_0x03e5:
                if (r8 == 0) goto L_0x068b
                boolean r0 = r14.mo87881n1()
                java.lang.String r1 = "notify@all"
                r9 = 20032(0x4e40, float:2.8071E-41)
                if (r0 != 0) goto L_0x056c
                qg1.c0$a r0 = qg1.C47824c0.f128387v
                java.util.ArrayList r0 = new java.util.ArrayList
                r10 = 10
                int r13 = sx3.C36907w.m41090l(r8, r10)
                r0.<init>(r13)
                java.util.Iterator r8 = r8.iterator()
            L_0x0402:
                boolean r13 = r8.hasNext()
                if (r13 == 0) goto L_0x0414
                java.lang.Object r13 = r8.next()
                qj1.r8$g r13 = (qj1.C62949r8.C12644g) r13
                te3.hx0 r13 = r13.f36229a
                r0.add(r13)
                goto L_0x0402
            L_0x0414:
                r13 = r48
                androidx.lifecycle.i0 r8 = r14.mo87696x0(r13)
                cl1.z0 r8 = (cl1.C0702z0) r8
                int r8 = r8.mo671e3()
                te3.xs0 r3 = new te3.xs0
                r3.<init>()
                java.util.Iterator r21 = r0.iterator()
            L_0x0429:
                boolean r23 = r21.hasNext()
                if (r23 == 0) goto L_0x0449
                java.lang.Object r23 = r21.next()
                r10 = r23
                te3.hx0 r10 = (te3.C49765hx0) r10
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f134919d
                if (r10 == 0) goto L_0x043e
                java.lang.String r10 = r10.username
                goto L_0x043f
            L_0x043e:
                r10 = 0
            L_0x043f:
                boolean r10 = gy3.C87412m.m108589b(r10, r1)
                if (r10 == 0) goto L_0x0446
                goto L_0x044b
            L_0x0446:
                r10 = 10
                goto L_0x0429
            L_0x0449:
                r23 = 0
            L_0x044b:
                te3.hx0 r23 = (te3.C49765hx0) r23
                if (r23 == 0) goto L_0x046e
                r3.f144903e = r9
                r3.f144912q = r8
                if (r8 <= 0) goto L_0x0457
                r1 = 1
                goto L_0x0458
            L_0x0457:
                r1 = 0
            L_0x0458:
                r3.f144911p = r1
                te3.zt0 r1 = new te3.zt0
                r1.<init>()
                r1.f146211d = r12
                byte[] r1 = r1.toByteArray()
                pe3.b r1 = pe3.C89349b.m111674a(r1)
                r3.f144906h = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x046f
            L_0x046e:
                r1 = 0
            L_0x046f:
                if (r1 != 0) goto L_0x0496
                r1 = 20034(0x4e42, float:2.8074E-41)
                r3.f144903e = r1
                r3.f144912q = r8
                if (r8 <= 0) goto L_0x047b
                r1 = 1
                goto L_0x047c
            L_0x047b:
                r1 = 0
            L_0x047c:
                r3.f144911p = r1
                te3.zt0 r1 = new te3.zt0
                r1.<init>()
                r1.f146211d = r12
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>(r0)
                r1.f146212e = r8
                byte[] r0 = r1.toByteArray()
                pe3.b r0 = pe3.C89349b.m111674a(r0)
                r3.f144906h = r0
            L_0x0496:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = eb0.C75592q0.m90789s()
                r0.append(r1)
                long r8 = java.lang.System.currentTimeMillis()
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                r3.f144904f = r0
                te3.hj1 r0 = new te3.hj1
                r0.<init>()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                al1.i r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
                if (r1 == 0) goto L_0x04c4
                al1.l r8 = r1.f151988c
                if (r8 == 0) goto L_0x04c4
                int r8 = r8.f152031k
                goto L_0x04c5
            L_0x04c4:
                r8 = 0
            L_0x04c5:
                r0.f134677n = r8
                if (r1 == 0) goto L_0x04d0
                al1.l r1 = r1.f151988c
                if (r1 == 0) goto L_0x04d0
                int r1 = r1.f152031k
                goto L_0x04d1
            L_0x04d0:
                r1 = 0
            L_0x04d1:
                r0.f134675i = r1
                ok1.e r1 = ok1.C62042e.f176370a
                java.lang.String r8 = r3.f144904f
                fj1.b r9 = r14.mo87684A0()
                r1.mo87061a(r8, r9)
                qg1.c0 r10 = new qg1.c0
                fj1.b r9 = r14.mo87684A0()
                qj1.n9 r8 = new qj1.n9
                r16 = r8
                r21 = r4
                r4 = r9
                r9 = r14
                r47 = r5
                r5 = r10
                r10 = r12
                r49 = r11
                r11 = r24
                r51 = r12
                r50 = r13
                r12 = r17
                r8.<init>(r9, r10, r11, r12)
                r5.<init>(r3, r4, r0, r8)
                nr3.e r0 = r5.mo9225i()
                android.content.Context r4 = r14.f178626F
                gy3.C87412m.m108592e(r4, r6)
                com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
                r0.mo11397F(r4)
                fj1.b r0 = r14.mo87684A0()
                cj1.f2 r0 = r1.mo87065b(r3, r0)
                if (r0 == 0) goto L_0x055e
                androidx.lifecycle.i0 r1 = r14.mo87696x0(r7)
                cl1.o r1 = (cl1.C54991o) r1
                java.util.List<cj1.o5> r1 = r1.f154224L2
                r1.add(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "selfcomment add at msg, content:"
                r1.append(r3)
                java.lang.String r3 = r0.getContent()
                r1.append(r3)
                r1.append(r2)
                te3.xs0 r0 = r0.f1301a
                java.lang.String r0 = r0.f144904f
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_MSG
                r3 = 2
                r4 = 0
                d60.C58124b.C7172a.m7372a(r0, r1, r4, r3, r4)
                r0 = r4
                r4 = r21
                r5 = r22
                r12 = r47
                r9 = r49
                r11 = r51
                r8 = 20057(0x4e59, float:2.8106E-41)
                goto L_0x0686
            L_0x055e:
                r4 = r21
                r5 = r22
                r12 = r47
                r9 = r49
                r11 = r51
                r8 = 20057(0x4e59, float:2.8106E-41)
                goto L_0x0685
            L_0x056c:
                r21 = r4
                r47 = r5
                r49 = r11
                r51 = r12
                r5 = r22
                r50 = r48
                androidx.lifecycle.i0 r0 = r14.mo87696x0(r5)
                cl1.j r0 = (cl1.C39975j) r0
                androidx.lifecycle.z<te3.lw0> r3 = r0.f107170j
                java.lang.Object r3 = r3.getValue()
                te3.lw0 r3 = (te3.C50317lw0) r3
                if (r3 == 0) goto L_0x058c
                java.lang.String r3 = r3.f137677e
                if (r3 != 0) goto L_0x058e
            L_0x058c:
                r3 = r47
            L_0x058e:
                te3.lw0 r4 = new te3.lw0
                r4.<init>()
                r10 = 1
                r4.f137676d = r10
                r4.f137677e = r3
                java.util.ArrayList r10 = new java.util.ArrayList
                r12 = 10
                int r11 = sx3.C36907w.m41090l(r8, r12)
                r10.<init>(r11)
                java.util.Iterator r8 = r8.iterator()
            L_0x05a7:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x05b9
                java.lang.Object r11 = r8.next()
                qj1.r8$g r11 = (qj1.C62949r8.C12644g) r11
                te3.hx0 r11 = r11.f36229a
                r10.add(r11)
                goto L_0x05a7
            L_0x05b9:
                te3.xs0 r8 = new te3.xs0
                r8.<init>()
                java.util.Iterator r11 = r10.iterator()
            L_0x05c2:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x05e1
                java.lang.Object r13 = r11.next()
                r12 = r13
                te3.hx0 r12 = (te3.C49765hx0) r12
                com.tencent.mm.protocal.protobuf.FinderContact r12 = r12.f134919d
                if (r12 == 0) goto L_0x05d6
                java.lang.String r12 = r12.username
                goto L_0x05d7
            L_0x05d6:
                r12 = 0
            L_0x05d7:
                boolean r12 = gy3.C87412m.m108589b(r12, r1)
                if (r12 == 0) goto L_0x05de
                goto L_0x05e2
            L_0x05de:
                r12 = 10
                goto L_0x05c2
            L_0x05e1:
                r13 = 0
            L_0x05e2:
                te3.hx0 r13 = (te3.C49765hx0) r13
                if (r13 == 0) goto L_0x05fe
                r8.f144903e = r9
                te3.zt0 r1 = new te3.zt0
                r1.<init>()
                r11 = r51
                r1.f146211d = r11
                byte[] r1 = r1.toByteArray()
                pe3.b r1 = pe3.C89349b.m111674a(r1)
                r8.f144906h = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0601
            L_0x05fe:
                r11 = r51
                r1 = 0
            L_0x0601:
                if (r1 != 0) goto L_0x061f
                r1 = 20034(0x4e42, float:2.8074E-41)
                r8.f144903e = r1
                te3.zt0 r1 = new te3.zt0
                r1.<init>()
                r1.f146211d = r11
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>(r10)
                r1.f146212e = r9
                byte[] r1 = r1.toByteArray()
                pe3.b r1 = pe3.C89349b.m111674a(r1)
                r8.f144906h = r1
            L_0x061f:
                te3.hx0 r1 = new te3.hx0
                r1.<init>()
                com.tencent.mm.protocal.protobuf.FinderContact r9 = new com.tencent.mm.protocal.protobuf.FinderContact
                r9.<init>()
                java.lang.String r10 = eb0.C75592q0.m90789s()
                r9.username = r10
                fj1.b r10 = fj1.C45795b.f123698n
                if (r10 == 0) goto L_0x063f
                androidx.lifecycle.i0 r10 = r10.mo71262a(r7)
                cl1.o r10 = (cl1.C54991o) r10
                java.lang.String r10 = r10.mo75977P3()
                if (r10 != 0) goto L_0x0643
            L_0x063f:
                java.lang.String r10 = eb0.C75592q0.m90783m()
            L_0x0643:
                r9.nickname = r10
                r12 = r47
                r9.headUrl = r12
                r1.f134919d = r9
                r8.f144914s = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r9 = eb0.C75592q0.m90789s()
                r1.append(r9)
                long r9 = java.lang.System.currentTimeMillis()
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r8.f144904f = r1
                r8.f144910o = r4
                r0.mo62582j3(r3, r8)
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_BOX_MSG
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = r21
                r8 = 20057(0x4e59, float:2.8106E-41)
                r3.putInt(r4, r8)
                r9 = r49
                r3.putString(r9, r11)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                r0.statusChange(r1, r3)
            L_0x0685:
                r0 = 0
            L_0x0686:
                r14.f178638S = r0
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0695
            L_0x068b:
                r9 = r11
                r11 = r12
                r50 = r48
                r8 = 20057(0x4e59, float:2.8106E-41)
                r12 = r5
                r5 = r22
                r0 = 0
            L_0x0695:
                if (r0 != 0) goto L_0x09b9
                boolean r0 = r14.mo87881n1()
                if (r0 != 0) goto L_0x0975
                dj1.z$b r0 = dj1.C58294z.f166917x
                r1 = r50
                androidx.lifecycle.i0 r3 = r14.mo87696x0(r1)
                cl1.z0 r3 = (cl1.C0702z0) r3
                int r3 = r3.mo671e3()
                r4 = 1
                te3.r41 r0 = r0.mo8522a(r11, r4, r3)
                cj1.r0 r3 = cj1.C54804r0.f153631a
                android.content.Context r4 = r14.f178626F
                fj1.b r13 = r14.mo87684A0()
                qj1.p9 r10 = new qj1.p9
                r8 = r10
                r9 = r14
                r22 = r5
                r5 = r10
                r10 = r11
                r11 = r24
                r21 = r6
                r16 = r12
                r6 = r13
                r23 = r15
                r15 = 10
                r12 = r17
                r8.<init>(r9, r10, r11, r12)
                java.lang.String r3 = r3.mo75763e(r4, r6, r0, r5)
                r0.f185130j = r3
                te3.hx0 r3 = new te3.hx0
                r3.<init>()
                ok1.e r4 = ok1.C62042e.f176370a
                fj1.b r5 = r14.mo87684A0()
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r4.mo87050W(r5)
                r3.f134919d = r5
                androidx.lifecycle.i0 r5 = r14.mo87696x0(r7)
                cl1.o r5 = (cl1.C54991o) r5
                java.util.LinkedList r5 = r5.mo76016o3()
                r3.f134930r = r5
                int r5 = r4.mo87036R()
                r3.f134926n = r5
                int r5 = r4.mo87036R()
                r3.f134926n = r5
                r0.f185132o = r3
                r3 = 1
                r0.f185127g = r3
                r5 = 0
                java.lang.String r6 = qj1.C62949r8.m74148m1(r14, r5, r3, r5)
                r0.f185124d = r6
                cj1.j5 r3 = new cj1.j5
                r3.<init>(r0)
                re1.a r5 = gg1.C32444a.f86200t2
                java.lang.Object r5 = r5.mo60266n()
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x07ae
                java.lang.String r5 = r0.f185126f
                java.lang.String r6 = "123"
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                if (r5 == 0) goto L_0x07ae
                te3.xs0 r5 = new te3.xs0
                r5.<init>()
                r6 = 20031(0x4e3f, float:2.807E-41)
                r5.f144903e = r6
                te3.eu0 r8 = new te3.eu0
                r8.<init>()
                r9 = 1
                r8.f183030d = r9
                r9 = 55
                r8.f183031e = r9
                r9 = 65
                r8.f183032f = r9
                pe3.b r9 = new pe3.b
                byte[] r8 = r8.toByteArray()
                r9.<init>(r8)
                r5.f144906h = r9
                long r8 = java.lang.System.currentTimeMillis()
                r5.f144913r = r8
                cj1.d2 r8 = new cj1.d2
                r8.<init>(r5)
                androidx.lifecycle.i0 r5 = r14.mo87696x0(r1)
                cl1.z0 r5 = (cl1.C0702z0) r5
                java.util.List<cj1.o5> r5 = r5.f1672f
                r5.add(r8)
                androidx.lifecycle.i0 r5 = r14.mo87696x0(r7)
                cl1.o r5 = (cl1.C54991o) r5
                java.util.List<cj1.o5> r5 = r5.f154224L2
                r5.add(r8)
                te3.xs0 r5 = new te3.xs0
                r5.<init>()
                r5.f144903e = r6
                te3.eu0 r6 = new te3.eu0
                r6.<init>()
                r8 = 2
                r6.f183030d = r8
                r6.f183031e = r15
                r8 = 12
                r6.f183032f = r8
                pe3.b r8 = new pe3.b
                byte[] r6 = r6.toByteArray()
                r8.<init>(r6)
                r5.f144906h = r8
                long r8 = java.lang.System.currentTimeMillis()
                r5.f144913r = r8
                cj1.d2 r6 = new cj1.d2
                r6.<init>(r5)
                androidx.lifecycle.i0 r5 = r14.mo87696x0(r1)
                cl1.z0 r5 = (cl1.C0702z0) r5
                java.util.List<cj1.o5> r5 = r5.f1672f
                r5.add(r6)
                androidx.lifecycle.i0 r5 = r14.mo87696x0(r7)
                cl1.o r5 = (cl1.C54991o) r5
                java.util.List<cj1.o5> r5 = r5.f154224L2
                r5.add(r6)
            L_0x07ae:
                fj1.b r5 = r14.mo87684A0()
                boolean r4 = r4.mo87046U0(r5)
                if (r4 != 0) goto L_0x0931
                fh1.f r4 = fh1.C8035f.f26736a
                te3.r41 r5 = r3.f1344a
                java.lang.String r6 = "msg"
                gy3.C87412m.m108594g(r5, r6)
                er1.j4 r6 = er1.C58739j4.f168176a
                boolean r6 = r6.mo83692U()
                if (r6 == 0) goto L_0x08eb
                java.lang.String r6 = r5.f185126f
                if (r6 == 0) goto L_0x07da
                java.lang.String r8 = "开始弹幕雨"
                r9 = 0
                boolean r6 = z04.C112550d0.m153801u(r6, r8, r9)
                r8 = 1
                if (r6 != r8) goto L_0x07db
                r6 = 1
                goto L_0x07dc
            L_0x07da:
                r8 = 1
            L_0x07db:
                r6 = 0
            L_0x07dc:
                if (r6 == 0) goto L_0x07e2
                fh1.C8035f.f26738c = r8
                r10 = 0
                goto L_0x07f8
            L_0x07e2:
                java.lang.String r6 = r5.f185126f
                if (r6 == 0) goto L_0x07f2
                java.lang.String r9 = "停止弹幕雨"
                r10 = 0
                boolean r6 = z04.C112550d0.m153801u(r6, r9, r10)
                if (r6 != r8) goto L_0x07f3
                r6 = 1
                goto L_0x07f4
            L_0x07f2:
                r10 = 0
            L_0x07f3:
                r6 = 0
            L_0x07f4:
                if (r6 == 0) goto L_0x07f8
                fh1.C8035f.f26738c = r10
            L_0x07f8:
                java.lang.String r9 = r5.f185126f
                if (r9 != 0) goto L_0x07fe
                r9 = r16
            L_0x07fe:
                rx3.l r6 = r4.mo9118b(r9)
                A r8 = r6.f38555d
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                r9 = 2
                if (r8 == r9) goto L_0x087e
                r11 = 4
                if (r8 == r11) goto L_0x0812
                goto L_0x08eb
            L_0x0812:
                r8 = 1
                r5.f185136s = r8
                r5.f185137t = r9
                te3.hx0 r8 = r5.f185132o
                if (r8 != 0) goto L_0x081c
                goto L_0x0827
            L_0x081c:
                java.util.LinkedList<te3.aw0> r9 = r8.f134930r
                if (r9 != 0) goto L_0x0825
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
            L_0x0825:
                r8.f134930r = r9
            L_0x0827:
                te3.hx0 r8 = r5.f185132o
                if (r8 == 0) goto L_0x0855
                java.util.LinkedList<te3.aw0> r8 = r8.f134930r
                if (r8 == 0) goto L_0x0855
                java.util.Iterator r8 = r8.iterator()
            L_0x0833:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x084b
                java.lang.Object r9 = r8.next()
                r12 = r9
                te3.aw0 r12 = (te3.C48770aw0) r12
                int r12 = r12.f130789d
                if (r12 != r11) goto L_0x0846
                r12 = 1
                goto L_0x0847
            L_0x0846:
                r12 = 0
            L_0x0847:
                if (r12 == 0) goto L_0x0833
                r8 = r9
                goto L_0x084c
            L_0x084b:
                r8 = 0
            L_0x084c:
                te3.aw0 r8 = (te3.C48770aw0) r8
                if (r8 == 0) goto L_0x0855
                te3.aw0 r4 = r4.mo9117a(r8)
                goto L_0x085a
            L_0x0855:
                te3.aw0 r4 = new te3.aw0
                r4.<init>()
            L_0x085a:
                B r6 = r6.f38556e
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r4.f130791f = r6
                r4.f130789d = r11
                te3.hx0 r6 = r5.f185132o
                if (r6 == 0) goto L_0x0871
                java.util.LinkedList<te3.aw0> r6 = r6.f134930r
                if (r6 == 0) goto L_0x0871
                r6.clear()
            L_0x0871:
                te3.hx0 r5 = r5.f185132o
                if (r5 == 0) goto L_0x08eb
                java.util.LinkedList<te3.aw0> r5 = r5.f134930r
                if (r5 == 0) goto L_0x08eb
                r5.add(r4)
                goto L_0x08eb
            L_0x087e:
                r8 = 1
                r5.f185136s = r8
                r8 = 3
                r5.f185137t = r8
                te3.hx0 r8 = r5.f185132o
                if (r8 != 0) goto L_0x0889
                goto L_0x0894
            L_0x0889:
                java.util.LinkedList<te3.aw0> r9 = r8.f134930r
                if (r9 != 0) goto L_0x0892
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
            L_0x0892:
                r8.f134930r = r9
            L_0x0894:
                te3.hx0 r8 = r5.f185132o
                if (r8 == 0) goto L_0x08c3
                java.util.LinkedList<te3.aw0> r8 = r8.f134930r
                if (r8 == 0) goto L_0x08c3
                java.util.Iterator r8 = r8.iterator()
            L_0x08a0:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x08b9
                java.lang.Object r9 = r8.next()
                r11 = r9
                te3.aw0 r11 = (te3.C48770aw0) r11
                int r11 = r11.f130789d
                r12 = 2
                if (r11 != r12) goto L_0x08b4
                r11 = 1
                goto L_0x08b5
            L_0x08b4:
                r11 = 0
            L_0x08b5:
                if (r11 == 0) goto L_0x08a0
                r8 = r9
                goto L_0x08ba
            L_0x08b9:
                r8 = 0
            L_0x08ba:
                te3.aw0 r8 = (te3.C48770aw0) r8
                if (r8 == 0) goto L_0x08c3
                te3.aw0 r4 = r4.mo9117a(r8)
                goto L_0x08c8
            L_0x08c3:
                te3.aw0 r4 = new te3.aw0
                r4.<init>()
            L_0x08c8:
                B r6 = r6.f38556e
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r4.f130791f = r6
                r6 = 2
                r4.f130789d = r6
                te3.hx0 r6 = r5.f185132o
                if (r6 == 0) goto L_0x08e0
                java.util.LinkedList<te3.aw0> r6 = r6.f134930r
                if (r6 == 0) goto L_0x08e0
                r6.clear()
            L_0x08e0:
                te3.hx0 r5 = r5.f185132o
                if (r5 == 0) goto L_0x08eb
                java.util.LinkedList<te3.aw0> r5 = r5.f134930r
                if (r5 == 0) goto L_0x08eb
                r5.add(r4)
            L_0x08eb:
                androidx.lifecycle.i0 r4 = r14.mo87696x0(r1)
                cl1.z0 r4 = (cl1.C0702z0) r4
                java.util.List<cj1.o5> r4 = r4.f1672f
                r4.add(r3)
                androidx.lifecycle.i0 r1 = r14.mo87696x0(r1)
                cl1.z0 r1 = (cl1.C0702z0) r1
                r1.mo669c3(r3)
                androidx.lifecycle.i0 r1 = r14.mo87696x0(r7)
                cl1.o r1 = (cl1.C54991o) r1
                java.util.List<cj1.o5> r1 = r1.f154224L2
                r1.add(r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "selfcomment add comment msg, content:"
                r1.append(r3)
                java.lang.String r3 = r0.f185126f
                r1.append(r3)
                r1.append(r2)
                java.lang.String r0 = r0.f185130j
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6 = r23
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                y50.k r0 = y50.C53496k.f150436a
                r0.mo74169b()
                goto L_0x0933
            L_0x0931:
                r6 = r23
            L_0x0933:
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_MSG
                r2 = 2
                r3 = 0
                d60.C58124b.C7172a.m7372a(r0, r1, r3, r2, r3)
                ok1.e r0 = ok1.C62042e.f176370a
                boolean r0 = r0.mo87027N0()
                if (r0 == 0) goto L_0x0972
                di3.d r0 = di3.C86312j.m106911c(r53)
                ak1.o r0 = (ak1.C54108o) r0
                r0.getClass()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x096d }
                r1.<init>()     // Catch:{ all -> 0x096d }
                r5 = 1
                java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x096d }
                r3 = r34
                r1.put(r3, r2)     // Catch:{ all -> 0x096d }
                java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x096d }
                r3 = 0
                r4 = 4
                r7 = 0
                r1 = r19
                r10 = r22
                r12 = 1
                r5 = r7
                ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0970 }
                goto L_0x09be
            L_0x096d:
                r10 = r22
                r12 = 1
            L_0x0970:
                goto L_0x09be
            L_0x0972:
                r10 = r22
                goto L_0x09bd
            L_0x0975:
                r10 = r5
                r21 = r6
                r16 = r12
                r6 = r15
                r12 = 1
                androidx.lifecycle.i0 r0 = r14.mo87696x0(r10)
                cl1.j r0 = (cl1.C39975j) r0
                androidx.lifecycle.z<te3.lw0> r1 = r0.f107170j
                java.lang.Object r1 = r1.getValue()
                te3.lw0 r1 = (te3.C50317lw0) r1
                if (r1 == 0) goto L_0x0990
                java.lang.String r1 = r1.f137677e
                if (r1 != 0) goto L_0x0992
            L_0x0990:
                r1 = r16
            L_0x0992:
                te3.lw0 r2 = new te3.lw0
                r2.<init>()
                r2.f137676d = r12
                r2.f137677e = r1
                nk1.h r3 = nk1.C47272h.f126894a
                te3.xs0 r2 = r3.mo72298c(r2, r11)
                r0.mo62582j3(r1, r2)
                d60.b r0 = r14.f178641p
                d60.b$b r1 = d60.C58124b.C58125b.POST_BOX_MSG
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r2.putInt(r4, r8)
                r2.putString(r9, r11)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                r0.statusChange(r1, r2)
                goto L_0x09be
            L_0x09b9:
                r10 = r5
                r21 = r6
                r6 = r15
            L_0x09bd:
                r12 = 1
            L_0x09be:
                androidx.lifecycle.i0 r0 = r14.mo87696x0(r10)
                cl1.j r0 = (cl1.C39975j) r0
                boolean r0 = r0.mo62578e3()
                if (r0 == 0) goto L_0x09d3
                java.lang.String r0 = "inBox, keep show keyboard"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                r14.mo87879i1()
                goto L_0x09e5
            L_0x09d3:
                r14.mo87883p1()
                android.content.Context r0 = r14.f178626F
                r1 = r21
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
                r0.hideVKB()
                r14.mo87878h1(r12)
            L_0x09e5:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r52
                j20.C117292a.m165361g(r4, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.C62953d.onClick(android.view.View):void");
        }
    }

    /* renamed from: qj1.r8$e */
    public static final class C62954e implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178656d;

        public C62954e(C62949r8 r8Var) {
            this.f178656d = r8Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i("Finder.LiveInputPlugin", "onTouch");
            this.f178656d.mo87883p1();
            Context context = this.f178656d.f178626F;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            this.f178656d.mo87878h1(true);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: qj1.r8$f */
    public static final class C62955f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178657d;

        /* renamed from: qj1.r8$f$a */
        public static final class C62956a implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C62949r8 f178658d;

            /* renamed from: qj1.r8$f$a$a */
            public static final class C62957a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C62949r8 f178659d;

                public C62957a(C62949r8 r8Var) {
                    this.f178659d = r8Var;
                }

                public final void run() {
                    C62949r8 r8Var = this.f178659d;
                    int i = C62949r8.f178620X;
                    r8Var.mo87885r1();
                }
            }

            public C62956a(C62949r8 r8Var) {
                this.f178658d = r8Var;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C13598b0 b0Var;
                Class cls = C54116w.class;
                String str = this.f178658d.f178639T;
                if (str != null) {
                    if (C87412m.m108589b(str, "notify@all")) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c).Jx0(1, (List<String>) null, (String) null);
                    } else {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c2).Jx0(2, C26236u.m33719b(str), (String) null);
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                    ((C54116w) c3).Jx0(0, (List<String>) null, (String) null);
                }
                C62949r8 r8Var = this.f178658d;
                r8Var.f178639T = null;
                r8Var.f178647v.postDelayed(new C62957a(r8Var), 200);
            }
        }

        /* renamed from: qj1.r8$f$b */
        public static final class C62958b implements C57962a {

            /* renamed from: a */
            public final /* synthetic */ C62949r8 f178660a;

            public C62958b(C62949r8 r8Var) {
                this.f178660a = r8Var;
            }

            /* renamed from: a */
            public void mo64632a(String str, String str2) {
                C87412m.m108594g(str, "displayName");
                C87412m.m108594g(str2, "username");
                C62949r8 r8Var = this.f178660a;
                r8Var.f178639T = str2;
                C62949r8.m74145e1(r8Var, str2, str);
            }
        }

        public C62955f(C62949r8 r8Var) {
            this.f178657d = r8Var;
        }

        public final void onClick(View view) {
            String str;
            Class cls = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62949r8 r8Var = this.f178657d;
            int i = C62949r8.f178620X;
            if (r8Var.mo87881n1()) {
                C62949r8 r8Var2 = this.f178657d;
                if (r8Var2.f178631K != null) {
                    Context context = r8Var2.f178626F;
                    C76912y0.m92767f(context, context.getResources().getString(C0966R.string.e9i));
                } else {
                    C50317lw0 value = ((C39975j) r8Var2.mo87696x0(C39975j.class)).f107170j.getValue();
                    if (value == null || (str = value.f137677e) == null) {
                        str = "";
                    }
                    FinderLiveAtGroupMemberDialog finderLiveAtGroupMemberDialog = new FinderLiveAtGroupMemberDialog(str, r8Var2.f178626F, Boolean.TRUE, new C62883m9(r8Var2));
                    finderLiveAtGroupMemberDialog.show();
                    finderLiveAtGroupMemberDialog.f126908o = new C62869l9(r8Var2);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (((C54991o) this.f178657d.mo87696x0(cls)).mo75986U3().f183215f == 1 && this.f178657d.f178631K == null) {
                C62949r8 r8Var3 = this.f178657d;
                FinderLiveAtSomeoneDialog finderLiveAtSomeoneDialog = new FinderLiveAtSomeoneDialog(r8Var3.f178626F, Boolean.FALSE, new C62958b(r8Var3));
                finderLiveAtSomeoneDialog.show();
                finderLiveAtSomeoneDialog.f126908o = new C62956a(this.f178657d);
            } else {
                String string = ((C54991o) this.f178657d.mo87696x0(cls)).mo75986U3().f183215f == 1 ? this.f178657d.f178626F.getResources().getString(C0966R.string.e9i) : this.f178657d.f178626F.getResources().getString(C0966R.string.e9j);
                C87412m.m108593f(string, "if (business(LiveCommonS…ips_v2)\n                }");
                C76912y0.m92767f(this.f178657d.f178626F, string);
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            wVar.getClass();
            C54116w.Ex0(wVar, C54067f0.C54076o0.AT_BTN_CLICK, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r8$h */
    public static final class C62959h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178661d;

        public C62959h(C62949r8 r8Var) {
            this.f178661d = r8Var;
        }

        public final void run() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", false);
            this.f178661d.f178641p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
        }
    }

    /* renamed from: qj1.r8$j */
    public static final class C62960j implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178662d;

        public C62960j(C62949r8 r8Var) {
            this.f178662d = r8Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f178662d.f178625E.setAlpha(1.0f);
            this.f178662d.f178625E.setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: qj1.r8$k */
    public static final class C62961k implements InputFilter {

        /* renamed from: d */
        public static final C62961k f178663d = new C62961k();

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return null;
        }
    }

    /* renamed from: qj1.r8$l */
    public static final class C62962l extends C45078p0 {
        public C62962l(int i, C45078p0.C45079a aVar) {
            super(i, aVar);
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return charSequence == null ? "" : charSequence;
        }
    }

    static {
        C32444a aVar = C32444a.f86121a;
        long longValue = C32444a.f86151h1.mo60266n().longValue();
        f178618V = longValue;
        f178619W = longValue;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62949r8(android.view.ViewGroup r19, d60.C58124b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 0
            r0.<init>(r1, r2, r4)
            r0.f178641p = r2
            r2 = 1
            r0.f178642q = r2
            r4 = 2
            r0.f178643r = r4
            r4 = 120(0x78, float:1.68E-43)
            r0.f178644s = r4
            r4 = 2131307602(0x7f092c52, float:1.8233436E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 2131307563(0x7f092c2b, float:1.8233357E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0.f178645t = r5
            r5 = 2131307604(0x7f092c54, float:1.823344E38)
            android.view.View r5 = r1.findViewById(r5)
            qj1.r8$i r6 = qj1.C62949r8.C12645i.f36232d
            r5.setOnClickListener(r6)
            r0.f178646u = r5
            r6 = 2131307606(0x7f092c56, float:1.8233444E38)
            android.view.View r6 = r1.findViewById(r6)
            com.tencent.mm.ui.widget.MMEditText r6 = (com.tencent.p014mm.p136ui.widget.MMEditText) r6
            r0.f178647v = r6
            r7 = 2131307767(0x7f092cf7, float:1.823377E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f178648w = r7
            r8 = 2131307598(0x7f092c4e, float:1.8233428E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f178649x = r8
            r9 = 2131307603(0x7f092c53, float:1.8233438E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f178650y = r9
            r9 = 2131307454(0x7f092bbe, float:1.8233136E38)
            android.view.View r9 = r1.findViewById(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            r0.f178651z = r9
            r10 = 2131307610(0x7f092c5a, float:1.8233452E38)
            android.view.View r10 = r1.findViewById(r10)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r0.f178621A = r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0.f178623C = r11
            android.content.Context r11 = r19.getContext()
            com.tencent.mm.api.SmileyPanel r11 = p248ug.C78160t0.m94372c(r11, r2)
            java.lang.String r12 = "getSmileyPanel(root.context, true)"
            gy3.C87412m.m108593f(r11, r12)
            r0.f178625E = r11
            android.content.Context r11 = r19.getContext()
            java.lang.String r12 = "root.context"
            gy3.C87412m.m108593f(r11, r12)
            r0.f178626F = r11
            java.lang.String r11 = ""
            r0.f178630J = r11
            r11 = 0
            r0.f178629I = r11
            android.content.Context r12 = r19.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131756168(0x7f100488, float:1.9143236E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)
            r13 = -1
            com.tencent.p014mm.p136ui.C74933u4.m89769f(r12, r13)
            r8.setImageDrawable(r12)
            qj1.r8$a r12 = new qj1.r8$a
            r12.<init>(r0)
            r8.setOnClickListener(r12)
            qk1.i1 r8 = new qk1.i1
            android.content.Context r12 = r0.f178626F
            r8.<init>(r12)
            r0.f178622B = r8
            r10.setAdapter(r8)
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r12 = r0.f166287d
            android.content.Context r12 = r12.getContext()
            r8.<init>(r12)
            r8.setItemPrefetchEnabled(r2)
            r8.mo16974W(r11)
            r10.setLayoutManager(r8)
            androidx.recyclerview.widget.f r8 = new androidx.recyclerview.widget.f
            r8.<init>()
            r10.setItemAnimator(r8)
            di3.d r8 = di3.C86312j.m106911c(r3)
            l31.e r8 = (l31.C61212e) r8
            java.lang.String r12 = "finder_live_room_fast_comment"
            r8.o30(r10, r12)
            qj1.h9 r8 = new qj1.h9
            r8.<init>(r0)
            qk1.i1 r10 = r0.f178622B
            if (r10 == 0) goto L_0x0110
            r10.f179402f = r8
        L_0x0110:
            qj1.i9 r8 = new qj1.i9
            r8.<init>(r0)
            qk1.i1 r10 = r0.f178622B
            if (r10 == 0) goto L_0x011b
            r10.f179403g = r8
        L_0x011b:
            boolean r8 = eb0.C45628s0.m50756U()
            if (r8 != 0) goto L_0x018e
            qk1.i1 r8 = r0.f178622B
            if (r8 == 0) goto L_0x0146
            java.util.ArrayList<qk1.i1$b> r10 = r8.f179401e
            qk1.i1$b r12 = new qk1.i1$b
            android.content.Context r13 = r8.f179400d
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131827395(0x7f111ac3, float:1.9287701E38)
            java.lang.String r13 = r13.getString(r14)
            java.lang.String r14 = "context.resources.getStr…ast_comment_location_tip)"
            gy3.C87412m.m108593f(r13, r14)
            r14 = 0
            r12.<init>(r13, r11, r14)
            r10.add(r12)
            r8.notifyDataSetChanged()
        L_0x0146:
            qj1.c9 r8 = new qj1.c9
            r8.<init>(r0)
            qj1.e9 r10 = new qj1.e9
            r10.<init>(r0)
            qj1.f9 r12 = new qj1.f9
            r12.<init>(r0)
            bl3.r r13 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
            bl3.r$a r13 = r13.mo62446e(r14)
            java.lang.Class<fe1.g> r14 = fe1.C8014g.class
            bl3.c r13 = r13.mo62447c(r14)
            fe1.g r13 = (fe1.C8014g) r13
            boolean r14 = r13.mo9103H()
            if (r14 != 0) goto L_0x016f
            r8.invoke()
            goto L_0x018e
        L_0x016f:
            long r14 = eb0.C31543z5.m39451a()
            long r16 = r13.mo9106t1()
            long r14 = r14 - r16
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            int r8 = up1.C37521f.f99296U
            r13 = r3
            long r2 = (long) r8
            int r8 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x018a
            r12.invoke()
            goto L_0x018f
        L_0x018a:
            r10.invoke()
            goto L_0x018f
        L_0x018e:
            r13 = r3
        L_0x018f:
            r18.mo87886s1()
            android.content.Context r2 = r0.f178626F
            int r2 = com.tencent.p014mm.sdk.platformtools.KeyBoardUtil.getKeyBordHeightPx(r2)
            r0.f178634N = r2
            int r2 = r0.f178644s
            r0.mo87884q1(r2)
            qj1.r8$b r2 = new qj1.r8$b
            r2.<init>(r0)
            r6.setOnKeyListener(r2)
            qj1.r8$c r2 = new qj1.r8$c
            r2.<init>(r0)
            r6.addTextChangedListener(r2)
            boolean r2 = r18.mo82893g0()
            if (r2 == 0) goto L_0x01cb
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r1 = r19.getContext()
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
            r2.setMarginEnd(r1)
        L_0x01cb:
            di3.d r1 = di3.C86312j.m106911c(r13)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "finder_live_room_reply_btn"
            r1.o30(r7, r2)
            di3.d r1 = di3.C86312j.m106911c(r13)
            l31.e r1 = (l31.C61212e) r1
            r2 = 8
            r3 = 25561(0x63d9, float:3.5819E-41)
            r1.mo86175pO(r7, r2, r3)
            qj1.r8$d r1 = new qj1.r8$d
            r1.<init>(r0)
            r7.setOnClickListener(r1)
            qj1.r8$e r1 = new qj1.r8$e
            r1.<init>(r0)
            r4.setOnTouchListener(r1)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            int r2 = com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel.f211589f
            r2 = 14
            r1.setEntranceScene(r2)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r1.mo100191d()
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r2 = 1
            r1.mo100192e(r2)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r1.mo100193f(r11, r11)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r1.mo76247r(r11)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r2 = 4
            r1.setVisibility(r2)
            com.tencent.mm.api.SmileyPanel r1 = r0.f178625E
            r1.mo100197i()
            qj1.r8$f r1 = new qj1.r8$f
            r1.<init>(r0)
            r9.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        r7 = r4.f179406j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r4 = r4.f179404h;
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74140Z0(qj1.C62949r8 r23, te3.C64311db1 r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.z0> r3 = cl1.C0702z0.class
            boolean r4 = r0.f178637R
            java.lang.String r5 = "Finder.LiveInputPlugin"
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = "doSendLocationMsg: mounted = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x023f
        L_0x0015:
            if (r1 != 0) goto L_0x001e
            java.lang.String r0 = "doSendLocationMsg: finderLocation is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x023f
        L_0x001e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "doSendLocationMsg: longitude:"
            r4.append(r6)
            float r6 = r1.f182661d
            r4.append(r6)
            java.lang.String r6 = ", latitude:"
            r4.append(r6)
            float r6 = r1.f182662e
            r4.append(r6)
            java.lang.String r6 = ", city:"
            r4.append(r6)
            java.lang.String r6 = r1.f182663f
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            qk1.i1 r4 = r0.f178622B
            if (r4 == 0) goto L_0x004f
            r4.mo88129G4(r1)
        L_0x004f:
            qk1.i1 r4 = r0.f178622B
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L_0x0064
            java.lang.String r7 = r4.f179406j
            if (r7 == 0) goto L_0x0064
            java.lang.String r4 = r4.f179404h
            if (r4 == 0) goto L_0x0064
            java.lang.String r8 = "<%@>"
            java.lang.String r4 = z04.C112551y.m153814n(r4, r8, r7, r6)
            goto L_0x0065
        L_0x0064:
            r4 = r5
        L_0x0065:
            boolean r7 = r23.mo87881n1()
            r8 = 1
            java.lang.String r9 = "liveData"
            java.lang.String r10 = ""
            r11 = 20035(0x4e43, float:2.8075E-41)
            if (r7 != 0) goto L_0x019a
            qg1.c0$a r7 = qg1.C47824c0.f128387v
            fj1.b r7 = r23.mo87684A0()
            androidx.lifecycle.i0 r12 = r0.mo87696x0(r3)
            cl1.z0 r12 = (cl1.C0702z0) r12
            int r12 = r12.mo671e3()
            gy3.C87412m.m108594g(r7, r9)
            te3.xs0 r9 = new te3.xs0
            r9.<init>()
            te3.lu0 r13 = new te3.lu0
            r13.<init>()
            r13.f137642d = r1
            r13.f137643e = r4
            byte[] r4 = r13.toByteArray()
            pe3.b r4 = pe3.C89349b.m111674a(r4)
            r9.f144906h = r4
            r9.f144912q = r12
            if (r12 <= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            r9.f144911p = r8
            r9.f144903e = r11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = eb0.C75592q0.m90789s()
            r4.append(r8)
            long r11 = java.lang.System.currentTimeMillis()
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r9.f144904f = r4
            te3.hx0 r4 = new te3.hx0
            r4.<init>()
            ok1.e r8 = ok1.C62042e.f176370a
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r8.mo87050W(r7)
            r4.f134919d = r11
            androidx.lifecycle.i0 r2 = r7.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.LinkedList<te3.aw0> r2 = r2.f154320h
            r4.f134930r = r2
            int r2 = r8.mo87036R()
            r4.f134926n = r2
            r9.f144914s = r4
            te3.hj1 r2 = new te3.hj1
            r2.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            al1.i r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r4 == 0) goto L_0x00f4
            al1.l r7 = r4.f151988c
            if (r7 == 0) goto L_0x00f4
            int r7 = r7.f152031k
            goto L_0x00f5
        L_0x00f4:
            r7 = 0
        L_0x00f5:
            r2.f134677n = r7
            if (r4 == 0) goto L_0x0100
            al1.l r4 = r4.f151988c
            if (r4 == 0) goto L_0x0100
            int r4 = r4.f152031k
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            r2.f134675i = r4
            qg1.c0 r4 = new qg1.c0
            fj1.b r7 = r23.mo87684A0()
            qj1.b9 r11 = new qj1.b9
            r11.<init>(r0)
            r4.<init>(r9, r7, r2, r11)
            r4.mo9225i()
            r0.f178640U = r6
            fj1.b r2 = r23.mo87684A0()
            boolean r2 = r8.mo87046U0(r2)
            if (r2 != 0) goto L_0x0142
            java.lang.String r2 = r9.f144904f
            fj1.b r4 = r23.mo87684A0()
            r8.mo87061a(r2, r4)
            cj1.y3 r2 = new cj1.y3
            r2.<init>(r9)
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r3)
            cl1.z0 r4 = (cl1.C0702z0) r4
            java.util.List<cj1.o5> r4 = r4.f1672f
            r4.add(r2)
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r3)
            cl1.z0 r3 = (cl1.C0702z0) r3
            r3.mo669c3(r2)
        L_0x0142:
            y50.k r2 = y50.C53496k.f150436a
            r2.mo74169b()
            d60.b r0 = r0.f178641p
            d60.b$b r2 = d60.C58124b.C58125b.POST_MSG
            r3 = 2
            d60.C58124b.C7172a.m7372a(r0, r2, r5, r3, r5)
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r11 = r0
            ak1.w r11 = (ak1.C54116w) r11
            java.lang.String r0 = r1.f182666i
            java.lang.String r2 = r1.f182664g
            java.lang.String r1 = r1.f182663f
            r11.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            if (r0 != 0) goto L_0x0169
            r0 = r10
        L_0x0169:
            java.lang.String r4 = "poi_id"
            r3.put(r4, r0)
            if (r2 != 0) goto L_0x0171
            r2 = r10
        L_0x0171:
            java.lang.String r0 = "poi_name"
            r3.put(r0, r2)
            if (r1 != 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r10 = r1
        L_0x017a:
            java.lang.String r0 = "city_name"
            r3.put(r0, r10)
            ak1.f0$o0 r12 = ak1.C54067f0.C54076o0.SEND_LOCATION_BTN_CLICK
            java.lang.String r13 = r3.toString()
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 252(0xfc, float:3.53E-43)
            r22 = 0
            ak1.C54116w.Ex0(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x023f
        L_0x019a:
            java.lang.Class<cl1.j> r3 = cl1.C39975j.class
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r3)
            cl1.j r3 = (cl1.C39975j) r3
            androidx.lifecycle.z<te3.lw0> r5 = r3.f107170j
            java.lang.Object r5 = r5.getValue()
            te3.lw0 r5 = (te3.C50317lw0) r5
            if (r5 == 0) goto L_0x01b0
            java.lang.String r5 = r5.f137677e
            if (r5 != 0) goto L_0x01b1
        L_0x01b0:
            r5 = r10
        L_0x01b1:
            te3.lw0 r6 = new te3.lw0
            r6.<init>()
            int r7 = ks3.C46740q.f125820a
            r6.f137676d = r8
            r6.f137677e = r5
            fj1.b r7 = r23.mo87684A0()
            gy3.C87412m.m108594g(r7, r9)
            te3.xs0 r7 = new te3.xs0
            r7.<init>()
            te3.lu0 r8 = new te3.lu0
            r8.<init>()
            r8.f137642d = r1
            r8.f137643e = r4
            byte[] r1 = r8.toByteArray()
            pe3.b r1 = pe3.C89349b.m111674a(r1)
            r7.f144906h = r1
            r7.f144903e = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = eb0.C75592q0.m90789s()
            r1.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r7.f144904f = r1
            te3.hx0 r1 = new te3.hx0
            r1.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r8 = new com.tencent.mm.protocal.protobuf.FinderContact
            r8.<init>()
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r8.username = r9
            fj1.b r9 = fj1.C45795b.f123698n
            if (r9 == 0) goto L_0x0216
            androidx.lifecycle.i0 r2 = r9.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.mo75977P3()
            if (r2 != 0) goto L_0x021a
        L_0x0216:
            java.lang.String r2 = eb0.C75592q0.m90783m()
        L_0x021a:
            r8.nickname = r2
            r8.headUrl = r10
            r1.f134919d = r8
            r7.f144914s = r1
            r7.f144910o = r6
            r3.mo62582j3(r5, r7)
            d60.b r0 = r0.f178641p
            d60.b$b r1 = d60.C58124b.C58125b.POST_BOX_MSG
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "PARAM_FINDER_LIVE_BOX_MSG_TYPE"
            r2.putInt(r3, r11)
            java.lang.String r3 = "PARAM_FINDER_LIVE_BOX_MSG_CONTENT"
            r2.putString(r3, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r0.statusChange(r1, r2)
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.m74140Z0(qj1.r8, te3.db1):void");
    }

    /* renamed from: a1 */
    public static final void m74141a1(C62949r8 r8Var, float f, float f2) {
        r8Var.getClass();
        Log.m105924i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f + ", latitude:" + f2);
        C64234an2 an22 = new C64234an2();
        an22.f182094d = f;
        an22.f182095e = f2;
        an22.f182099i = 0;
        an22.f182096f = 1;
        ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an22, false, new C62791g9(r8Var, f, f2));
    }

    /* renamed from: b1 */
    public static final void m74142b1(C62949r8 r8Var) {
        r8Var.getClass();
        Log.m105924i("Finder.LiveInputPlugin", "getPoiInfoError");
        Context context = r8Var.f178626F;
        C76912y0.m92767f(context, context.getString(C0966R.string.dp8));
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        wVar.getClass();
        C54116w.Ex0(wVar, C54067f0.C54076o0.GET_CITY_INFO_FAIL, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: c1 */
    public static final void m74143c1(C62949r8 r8Var) {
        r8Var.getClass();
        Log.m105924i("Finder.LiveInputPlugin", "handlePoiNoPermission");
        Context context = r8Var.f178626F;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9107u((MMActivity) context);
        r8Var.f178640U = true;
    }

    /* renamed from: d1 */
    public static final void m74144d1(C62949r8 r8Var, boolean z, long j, String str) {
        if (z) {
            r8Var.getClass();
            C61926c.m72668M(new C62842k9(j, str, r8Var));
            r8Var.f178632L = false;
        }
        C45793z0 z0Var = (C45793z0) r8Var.mo87685B0(C45793z0.class);
        if (z0Var != null) {
            z0Var.mo71261m3();
        }
    }

    /* renamed from: e1 */
    public static final void m74145e1(C62949r8 r8Var, String str, String str2) {
        String obj = r8Var.f178647v.getText().toString();
        int selectionEnd = r8Var.f178647v.getSelectionEnd();
        int length = obj.length();
        if (selectionEnd > length) {
            selectionEnd = length;
        }
        int i = selectionEnd - 1;
        if (i < 0) {
            i = 0;
        }
        String str3 = "@";
        if (C87412m.m108589b(obj.subSequence(i, selectionEnd).toString(), str3)) {
            str3 = "";
        }
        if (selectionEnd > obj.length()) {
            selectionEnd = obj.length();
        }
        StringBuilder sb = new StringBuilder();
        String substring = obj.substring(0, selectionEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(str3);
        sb.append(str2);
        sb.append(8197);
        String substring2 = obj.substring(selectionEnd, obj.length());
        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring2);
        String sb4 = sb.toString();
        int length2 = str3.length() + str2.length() + selectionEnd + 1;
        r8Var.f178647v.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(r8Var.f178626F, sb4));
        r8Var.f178647v.setSelection(length2);
        if (r8Var.f178638S == null) {
            r8Var.f178638S = new ArrayList<>();
        }
        ArrayList<C12644g> arrayList = r8Var.f178638S;
        if (arrayList != null) {
            C49765hx0 hx02 = new C49765hx0();
            FinderContact finderContact = new FinderContact();
            finderContact.username = str;
            finderContact.nickname = str2;
            hx02.f134919d = finderContact;
            arrayList.add(new C12644g(hx02, selectionEnd, length2));
        }
        r8Var.f178631K = null;
    }

    /* renamed from: f1 */
    public static final void m74146f1(C62949r8 r8Var, float f, float f2) {
        r8Var.getClass();
        Log.m105924i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f + ", latitude:" + f2);
        C64234an2 an22 = new C64234an2();
        an22.f182094d = f;
        an22.f182095e = f2;
        an22.f182099i = 0;
        an22.f182096f = 1;
        ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an22, false, new C62963r9(r8Var, f, f2));
    }

    /* renamed from: j1 */
    public static void m74147j1(C62949r8 r8Var, int i, int i2, String str, String str2, C32224a aVar, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            aVar = null;
        }
        r8Var.getClass();
        C61926c.m72668M(new C63159z8(i, i2, r8Var, str, str2, aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089 A[Catch:{ all -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a A[Catch:{ all -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d A[Catch:{ all -> 0x00ab }] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m74148m1(qj1.C62949r8 r3, java.lang.Boolean r4, int r5, java.lang.Object r6) {
        /*
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0006
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        L_0x0006:
            r3.getClass()
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r0 = r0.mo77630e(r5)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.mo75977P3()
            if (r0 == 0) goto L_0x001d
            goto L_0x0120
        L_0x001d:
            boolean r0 = r3.mo87881n1()
            r1 = 0
            if (r0 == 0) goto L_0x00cc
            java.lang.Class<cl1.j> r4 = cl1.C39975j.class
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r4)
            cl1.j r3 = (cl1.C39975j) r3
            androidx.lifecycle.z<te3.lw0> r3 = r3.f107170j
            java.lang.Object r3 = r3.getValue()
            te3.lw0 r3 = (te3.C50317lw0) r3
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f137677e
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            java.lang.String r4 = "Finder.FinderLiveBoxUtil"
            r5 = 0
            if (r3 == 0) goto L_0x0048
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            java.lang.String r2 = "getUsernameFromUserInfo()"
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r3, r2)
            goto L_0x011f
        L_0x0056:
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x00ab }
            a11.c r0 = (a11.C39479c) r0     // Catch:{ all -> 0x00ab }
            eb0.m2 r0 = r0.mo62084mr()     // Catch:{ all -> 0x00ab }
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0     // Catch:{ all -> 0x00ab }
            com.tencent.mm.storage.m1 r3 = r0.mo69799Lo(r3)     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0078
            java.lang.String r3 = "getGroupUserName member == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x00ab }
            gy3.C87412m.m108593f(r3, r2)     // Catch:{ all -> 0x00ab }
            goto L_0x011f
        L_0x0078:
            java.lang.String r3 = r3.field_selfDisplayName     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x0085
            int r0 = r3.length()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r0 = 0
            goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 != 0) goto L_0x011f
            java.lang.String r3 = eb0.C75592q0.m90783m()     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x0099
            int r0 = r3.length()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x009f
            r0 = r3
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            if (r0 != 0) goto L_0x0120
            java.lang.String r3 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x00ab }
            gy3.C87412m.m108593f(r3, r2)     // Catch:{ all -> 0x00ab }
            goto L_0x011f
        L_0x00ab:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getGroupUserName exception: "
            r5.append(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.String r3 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r3, r2)
            goto L_0x011f
        L_0x00cc:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x00e3
            ok1.e r4 = ok1.C62042e.f176370a
            fj1.b r6 = r3.mo87684A0()
            boolean r4 = r4.mo87087i1(r6, r1)
            if (r4 == 0) goto L_0x00e3
            java.lang.String r0 = "***"
            goto L_0x0120
        L_0x00e3:
            ok1.e r4 = ok1.C62042e.f176370a
            boolean r4 = r4.mo87027N0()
            if (r4 == 0) goto L_0x00fe
            fe1.d$b r3 = fe1.C58961d.f168673a
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            fe1.q r3 = r3.mo84155b(r4)
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = r3.mo84196w1()
            goto L_0x011f
        L_0x00fe:
            androidx.lifecycle.i0 r4 = r3.mo87696x0(r5)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154190D
            if (r4 == 0) goto L_0x010f
            java.lang.String r3 = eb0.C75592q0.m90783m()
            if (r3 != 0) goto L_0x011f
            goto L_0x011d
        L_0x010f:
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r5)
            cl1.o r3 = (cl1.C54991o) r3
            te3.fs0 r3 = r3.mo75986U3()
            java.lang.String r3 = r3.f183213d
            if (r3 != 0) goto L_0x011f
        L_0x011d:
            java.lang.String r3 = ""
        L_0x011f:
            r0 = r3
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.m74148m1(qj1.r8, java.lang.Boolean, int, java.lang.Object):java.lang.String");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("Finder.LiveInputPlugin", "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87877g1() {
        /*
            r7 = this;
            java.lang.Class<lg1.h> r0 = lg1.C46854h.class
            qj1.c r0 = r7.mo87687E0(r0)
            lg1.h r0 = (lg1.C46854h) r0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x001c
            int r3 = r0.mo14483f0()
            if (r3 != 0) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            if (r3 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            qj1.e5 r0 = r7.f178624D
        L_0x001e:
            if (r0 == 0) goto L_0x00a8
            android.view.ViewGroup r3 = r0.f166287d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r3, r4)
            r4 = r3
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            boolean r5 = r7.mo82893g0()
            if (r5 != 0) goto L_0x005d
            android.view.View r5 = r7.f178646u
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0041
            r1 = r5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0041:
            if (r1 == 0) goto L_0x0045
            int r2 = r1.bottomMargin
        L_0x0045:
            android.view.View r1 = r7.f178646u
            int r1 = r1.getHeight()
            int r2 = r2 + r1
            android.content.Context r1 = r7.f178626F
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r1 = r1.getDimensionPixelOffset(r5)
            int r2 = r2 + r1
            r4.bottomMargin = r2
            goto L_0x008b
        L_0x005d:
            boolean r5 = r0 instanceof qj1.C12322e5
            if (r5 == 0) goto L_0x008b
            android.view.View r5 = r7.f178646u
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x006e
            r1 = r5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x006e:
            if (r1 == 0) goto L_0x0072
            int r2 = r1.bottomMargin
        L_0x0072:
            android.view.View r1 = r7.f178646u
            int r1 = r1.getHeight()
            int r2 = r2 + r1
            android.content.Context r1 = r7.f178626F
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r1 = r1.getDimensionPixelOffset(r5)
            int r1 = r1 * 2
            int r2 = r2 + r1
            r4.bottomMargin = r2
        L_0x008b:
            android.view.ViewGroup r0 = r0.f166287d
            r0.setLayoutParams(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lxltest2 adjustCommentPluginBottomMargin "
            r0.append(r1)
            int r1 = r4.bottomMargin
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.LiveInputPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.mo87877g1():void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        if (i > 0 && i != this.f178634N) {
            this.f178634N = i;
        }
        if (z) {
            this.f178629I = this.f178642q;
            mo87883p1();
            mo87882o1(i);
        } else if (this.f178629I == this.f178642q) {
            this.f178629I = 0;
            this.f178625E.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            mo87882o1(0);
        }
    }

    /* renamed from: h1 */
    public final void mo87878h1(boolean z) {
        this.f178629I = 0;
        mo10792g(4);
        this.f178647v.clearFocus();
        Object systemService = this.f166287d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f178647v.getWindowToken(), 0);
        mo87880l1(false);
        if (z) {
            this.f166287d.post(new C62959h(this));
        }
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f178625E.setOnTextOperationListener(new C62830j9(this));
        this.f178637R = true;
        Layout.getDesiredWidth(this.f178648w.getText(), this.f178648w.getPaint());
        C74942w4.m89786c(this.f178626F, C0966R.dimen.f3758d_);
        this.f178648w.getPaddingStart();
        this.f178648w.getPaddingEnd();
    }

    /* renamed from: i1 */
    public final void mo87879i1() {
        MMEditText mMEditText = this.f178647v;
        Context context = this.f178626F;
        mMEditText.setHint(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, m74148m1(this, (Boolean) null, 1, (Object) null) + XVFSFile.PATH_SEPARATOR_CHAR));
        this.f178647v.setText((CharSequence) null);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        if (this.f178629I == this.f178643r) {
            this.f178625E.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            this.f178629I = 0;
            mo87882o1(0);
        } else {
            mo87878h1(true);
        }
        return true;
    }

    /* renamed from: l1 */
    public final void mo87880l1(boolean z) {
        Class cls = C54991o.class;
        ((C54991o) mo87696x0(cls)).f154286Z = z;
        C58124b bVar = this.f178641p;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((C54991o) mo87696x0(cls)).f154286Z);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: n1 */
    public final boolean mo87881n1() {
        String str;
        C50317lw0 value = ((C39975j) mo87696x0(C39975j.class)).f107170j.getValue();
        if (!(value == null || (str = value.f137677e) == null)) {
            if (!(str.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public final void mo87882o1(int i) {
        if (this.f166287d.getContext() instanceof Activity) {
            ViewGroup.LayoutParams layoutParams = this.f178646u.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!mo82893g0()) {
                layoutParams2.bottomMargin = C75044y4.m89991c(this.f178626F) + i;
            } else {
                layoutParams2.bottomMargin = i;
            }
            this.f178646u.setLayoutParams(layoutParams);
            mo87877g1();
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i);
            if (!mo82893g0()) {
                layoutParams3.bottomMargin = C75044y4.m89991c(this.f178626F);
            } else {
                layoutParams3.setMarginEnd(C75044y4.m89991c(this.f178626F));
            }
            this.f178625E.setLayoutParams(layoutParams3);
            if (this.f178625E.getParent() == null) {
                this.f178645t.addView(this.f178625E, layoutParams3);
            }
        }
    }

    /* renamed from: p1 */
    public final void mo87883p1() {
        if (this.f178625E.getVisibility() == 0) {
            ImageView imageView = this.f178649x;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            this.f178625E.animate().alpha(0.0f).setDuration(220).setListener(new C62960j(this)).start();
        }
    }

    /* renamed from: q1 */
    public final void mo87884q1(int i) {
        Log.m105924i("Finder.LiveInputPlugin", "setInputEtFilter maxTextNum:" + i);
        this.f178647v.setFilters(new InputFilter[]{C62961k.f178663d, new C62962l(i, C45078p0.C45079a.MODE_CHINESE_AS_2)});
    }

    /* renamed from: r1 */
    public final void mo87885r1() {
        this.f178647v.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f166287d.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f178647v, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87886s1() {
        /*
            r12 = this;
            java.util.ArrayList<java.lang.String> r0 = r12.f178623C
            fj1.b r1 = r12.mo87684A0()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.o r1 = (cl1.C54991o) r1
            java.util.List<te3.v81> r1 = r1.f154390y2
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.v81 r1 = (te3.C51660v81) r1
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.util.LinkedList<java.lang.String> r1 = r1.f143383d
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            if (r1 != 0) goto L_0x0024
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0024:
            int r3 = r0.size()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0034
            int r3 = r1.size()
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0076
        L_0x0034:
            int r3 = r0.size()
            int r6 = r1.size()
            if (r3 == r6) goto L_0x0046
            r0.clear()
            r0.addAll(r1)
        L_0x0044:
            r0 = 1
            goto L_0x0076
        L_0x0046:
            java.util.Iterator r3 = r0.iterator()
            r6 = 0
        L_0x004b:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0032
            java.lang.Object r7 = r3.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x0072
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.get(r6)
            java.lang.Object r6 = r1.get(r6)
            boolean r6 = gy3.C87412m.m108589b(r7, r6)
            if (r6 != 0) goto L_0x0070
            r0.clear()
            r0.addAll(r1)
            goto L_0x0044
        L_0x0070:
            r6 = r8
            goto L_0x004b
        L_0x0072:
            sx3.C64197v.m75542k()
            throw r2
        L_0x0076:
            if (r0 == 0) goto L_0x0121
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<java.lang.String> r1 = r12.f178623C
            r0.addAll(r1)
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
            r6 = 0
        L_0x0088:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x00b5
            java.lang.String r7 = (java.lang.String) r7
            r9 = 2
            java.lang.String r10 = "<%@>"
            boolean r9 = z04.C112550d0.m153803w(r7, r10, r5, r9, r2)
            if (r9 == 0) goto L_0x00b3
            int r9 = r0.size()
            int r9 = r9 - r4
            if (r6 != r9) goto L_0x00b3
            qk1.i1 r3 = r12.f178622B
            if (r3 == 0) goto L_0x00af
            r3.mo88128F4(r7)
        L_0x00af:
            r0.remove(r7)
            r3 = 1
        L_0x00b3:
            r6 = r8
            goto L_0x0088
        L_0x00b5:
            sx3.C64197v.m75542k()
            throw r2
        L_0x00b9:
            if (r3 != 0) goto L_0x00c2
            qk1.i1 r1 = r12.f178622B
            if (r1 == 0) goto L_0x00c2
            r1.mo88128F4(r2)
        L_0x00c2:
            qk1.i1 r1 = r12.f178622B
            if (r1 == 0) goto L_0x0121
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<qk1.i1$b> r6 = r1.f179401e
            r3.addAll(r6)
            java.util.ArrayList<qk1.i1$b> r6 = r1.f179401e
            qk1.l1 r7 = qk1.C63235l1.f179445d
            sx3.C64175a0.m75512t(r6, r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x00db:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x011e
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.Iterator r7 = r3.iterator()
        L_0x00eb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0101
            java.lang.Object r8 = r7.next()
            r9 = r8
            qk1.i1$b r9 = (qk1.C63221i1.C63223b) r9
            java.lang.String r9 = r9.f179410a
            boolean r9 = gy3.C87412m.m108589b(r9, r6)
            if (r9 == 0) goto L_0x00eb
            goto L_0x0102
        L_0x0101:
            r8 = r2
        L_0x0102:
            qk1.i1$b r8 = (qk1.C63221i1.C63223b) r8
            if (r8 == 0) goto L_0x0109
            long r7 = r8.f179412c
            goto L_0x010b
        L_0x0109:
            r7 = 0
        L_0x010b:
            java.util.ArrayList<qk1.i1$b> r9 = r1.f179401e
            int r10 = r9.size()
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x0115
            r10 = 0
        L_0x0115:
            qk1.i1$b r11 = new qk1.i1$b
            r11.<init>(r6, r4, r7)
            r9.add(r10, r11)
            goto L_0x00db
        L_0x011e:
            r1.notifyDataSetChanged()
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.mo87886s1():void");
    }

    /* JADX WARNING: type inference failed for: r11v33, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0329, code lost:
        if (gy3.C87412m.m108589b(r4, r5 != null ? r5.username : null) == false) goto L_0x032b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0453  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r29, android.os.Bundle r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            java.lang.String r2 = "status"
            r3 = r29
            gy3.C87412m.m108594g(r3, r2)
            super.mo3210u0(r29, r30)
            int r2 = r29.ordinal()
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 7
            if (r2 == r5) goto L_0x045f
            r5 = 39
            if (r2 == r5) goto L_0x0037
            r1 = 47
            if (r2 == r1) goto L_0x045f
            r1 = 118(0x76, float:1.65E-43)
            if (r2 == r1) goto L_0x0032
            r1 = 27
            if (r2 == r1) goto L_0x045f
            r1 = 28
            if (r2 == r1) goto L_0x045f
            goto L_0x0469
        L_0x0032:
            r28.mo87886s1()
            goto L_0x0469
        L_0x0037:
            r2 = 0
            if (r1 == 0) goto L_0x0041
            java.lang.String r5 = "PARAM_FINDER_LIVE_NEED_NOTIFY_SEND_MSG_RESULT"
            boolean r5 = r1.getBoolean(r5, r2)
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            r0.f178632L = r5
            r6 = 0
            if (r5 == 0) goto L_0x0062
            if (r1 == 0) goto L_0x0055
            java.lang.String r5 = "PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID"
            long r5 = r1.getLong(r5, r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r5, r6)
            long r5 = r5.longValue()
            r0.f178633M = r5
            goto L_0x0064
        L_0x0062:
            r0.f178633M = r6
        L_0x0064:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f178651z
            r5.setVisibility(r2)
            java.lang.String r5 = "PARAM_IS_ENTERING_COMMENT"
            if (r1 == 0) goto L_0x0072
            boolean r6 = r1.getBoolean(r5)
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 == 0) goto L_0x045b
            if (r1 == 0) goto L_0x0088
            java.lang.String r6 = "PARAM_ENTER_COMMENT_AT_NAME"
            byte[] r6 = r1.getByteArray(r6)
            if (r6 == 0) goto L_0x0088
            te3.hx0 r7 = new te3.hx0
            r7.<init>()
            r7.parseFrom(r6)
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            java.lang.Class<tf0.p1> r6 = tf0.C64916p1.class
            qj1.s9 r9 = r0.f178627G
            if (r9 != 0) goto L_0x0094
            qj1.s9 r9 = new qj1.s9
            r9.<init>(r0)
        L_0x0094:
            r0.f178627G = r9
            java.lang.Class<cl1.z0> r10 = cl1.C0702z0.class
            qj1.r8 r11 = r9.f178684d
            java.lang.Class<fh1.z0> r12 = fh1.C45793z0.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r11 = r11.mo87685B0(r12)
            fh1.z0 r11 = (fh1.C45793z0) r11
            if (r11 == 0) goto L_0x00a7
            r11.mo71261m3()
        L_0x00a7:
            qj1.r8 r11 = r9.f178684d
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r10)
            cl1.z0 r11 = (cl1.C0702z0) r11
            boolean r11 = r11.mo670d3()
            r12 = 2
            r13 = 1
            if (r11 == 0) goto L_0x027a
            qj1.r8 r11 = r9.f178684d
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r10)
            cl1.z0 r11 = (cl1.C0702z0) r11
            java.util.List<? extends te3.cp2> r11 = r11.f1669A
            if (r11 == 0) goto L_0x00cc
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r11 = 0
            goto L_0x00cd
        L_0x00cc:
            r11 = 1
        L_0x00cd:
            if (r11 != 0) goto L_0x027a
            android.view.View r11 = r9.f178685e
            if (r11 != 0) goto L_0x00e5
            qj1.r8 r11 = r9.f178684d
            android.view.ViewGroup r11 = r11.f166287d
            r14 = 2131300693(0x7f091155, float:1.8219423E38)
            android.view.View r11 = r11.findViewById(r14)
            if (r11 == 0) goto L_0x00e4
            r11.setOnClickListener(r9)
            goto L_0x00e5
        L_0x00e4:
            r11 = 0
        L_0x00e5:
            r9.f178685e = r11
            android.widget.CheckBox r14 = r9.f178686f
            if (r14 != 0) goto L_0x00f9
            if (r11 == 0) goto L_0x00f8
            r14 = 2131299513(0x7f090cb9, float:1.821703E38)
            android.view.View r11 = r11.findViewById(r14)
            r14 = r11
            android.widget.CheckBox r14 = (android.widget.CheckBox) r14
            goto L_0x00f9
        L_0x00f8:
            r14 = 0
        L_0x00f9:
            r9.f178686f = r14
            android.widget.TextView r11 = r9.f178687g
            if (r11 != 0) goto L_0x010e
            android.view.View r11 = r9.f178685e
            if (r11 == 0) goto L_0x010d
            r14 = 2131300091(0x7f090efb, float:1.8218202E38)
            android.view.View r11 = r11.findViewById(r14)
            android.widget.TextView r11 = (android.widget.TextView) r11
            goto L_0x010e
        L_0x010d:
            r11 = 0
        L_0x010e:
            r9.f178687g = r11
            qj1.r8 r11 = r9.f178684d
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r10)
            cl1.z0 r11 = (cl1.C0702z0) r11
            java.util.List<? extends te3.cp2> r11 = r11.f1669A
            if (r11 == 0) goto L_0x0134
            java.util.Iterator r11 = r11.iterator()
            r14 = 0
        L_0x0121:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0135
            java.lang.Object r15 = r11.next()
            te3.cp2 r15 = (te3.C49035cp2) r15
            int r8 = r15.f131890e
            int r15 = r15.f131891f
            int r8 = r8 + r15
            int r14 = r14 + r8
            goto L_0x0121
        L_0x0134:
            r14 = 0
        L_0x0135:
            qj1.r8 r8 = r9.f178684d
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r10)
            cl1.z0 r8 = (cl1.C0702z0) r8
            java.util.List<? extends te3.cp2> r8 = r8.f1669A
            if (r8 == 0) goto L_0x0156
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x0146:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x0157
            java.lang.Object r15 = r8.next()
            te3.cp2 r15 = (te3.C49035cp2) r15
            int r15 = r15.f131890e
            int r11 = r11 + r15
            goto L_0x0146
        L_0x0156:
            r11 = 0
        L_0x0157:
            if (r14 <= 0) goto L_0x022a
            if (r14 >= r11) goto L_0x015d
            goto L_0x022a
        L_0x015d:
            android.view.View r4 = r9.f178685e
            if (r4 != 0) goto L_0x0162
            goto L_0x01a2
        L_0x0162:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r8.mo10233c(r15)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r18 = "checkDanmakuConfig"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r17 = "checkDanmakuConfig"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x01a2:
            android.widget.TextView r4 = r9.f178687g
            if (r4 != 0) goto L_0x01a8
            goto L_0x0276
        L_0x01a8:
            if (r14 <= r11) goto L_0x0203
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ak1.w r8 = (ak1.C54116w) r8
            qj1.r8 r15 = r9.f178684d
            androidx.lifecycle.i0 r15 = r15.mo87696x0(r10)
            cl1.z0 r15 = (cl1.C0702z0) r15
            int r15 = r15.mo672f3()
            if (r15 == r12) goto L_0x01c7
            r3 = 3
            if (r15 == r3) goto L_0x01c5
            r3 = 0
            goto L_0x01c8
        L_0x01c5:
            r3 = 1
            goto L_0x01c8
        L_0x01c7:
            r3 = 2
        L_0x01c8:
            r8.Wx0(r2, r13, r3)
            android.widget.CheckBox r3 = r9.f178686f
            if (r3 != 0) goto L_0x01d0
            goto L_0x01dd
        L_0x01d0:
            qj1.r8 r8 = r9.f178684d
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r10)
            cl1.z0 r8 = (cl1.C0702z0) r8
            boolean r8 = r8.f1670B
            r3.setChecked(r8)
        L_0x01dd:
            android.widget.CheckBox r3 = r9.f178686f
            if (r3 != 0) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r3.setVisibility(r2)
        L_0x01e5:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131827284(0x7f111a54, float:1.9287476E38)
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r10[r13] = r11
            java.lang.String r3 = r3.getString(r8, r10)
            goto L_0x0226
        L_0x0203:
            qj1.r8 r3 = r9.f178684d
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r10)
            cl1.z0 r3 = (cl1.C0702z0) r3
            r3.f1670B = r2
            android.widget.CheckBox r3 = r9.f178686f
            if (r3 != 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            r8 = 8
            r3.setVisibility(r8)
        L_0x0217:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131827285(0x7f111a55, float:1.9287478E38)
            java.lang.String r3 = r3.getString(r8)
        L_0x0226:
            r4.setText(r3)
            goto L_0x0276
        L_0x022a:
            android.view.View r3 = r9.f178685e
            if (r3 != 0) goto L_0x022f
            goto L_0x026c
        L_0x022f:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r4)
            java.lang.Object[] r18 = r8.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r20 = "checkDanmakuConfig"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r8.mo10231a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r19 = "checkDanmakuConfig"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x026c:
            android.widget.CheckBox r3 = r9.f178686f
            if (r3 != 0) goto L_0x0271
            goto L_0x0276
        L_0x0271:
            r4 = 8
            r3.setVisibility(r4)
        L_0x0276:
            r9.mo87906a()
            goto L_0x02dd
        L_0x027a:
            android.view.View r3 = r9.f178685e
            if (r3 != 0) goto L_0x027f
            goto L_0x02bc
        L_0x027f:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r4)
            java.lang.Object[] r18 = r8.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r20 = "changeToInputMode"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r8.mo10231a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku"
            java.lang.String r19 = "changeToInputMode"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02bc:
            qj1.r8 r3 = r9.f178684d
            r4 = 120(0x78, float:1.68E-43)
            r3.f178644s = r4
            r3.mo87884q1(r4)
            com.tencent.mm.ui.widget.MMEditText r8 = r3.f178647v
            qn3.c r8 = qn3.C77382c.m93286b(r8)
            r8.f225611e = r13
            r8.f225610d = r4
            com.tencent.mm.ui.tools.p0$a r9 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
            r8.f225612f = r9
            r8.f225607a = r13
            qj1.x8 r9 = new qj1.x8
            r9.<init>(r3, r4)
            r8.mo107499d(r9)
        L_0x02dd:
            r0.mo10792g(r2)
            android.widget.ImageView r3 = r0.f178649x
            android.view.ViewGroup r4 = r0.f166287d
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r8 = 2131756168(0x7f100488, float:1.9143236E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            r8 = -1
            com.tencent.p014mm.p136ui.C74933u4.m89769f(r4, r8)
            r3.setImageDrawable(r4)
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0306
            java.lang.String r4 = "PARAM_FINDER_LIVE_AUTO_INPUT_MSG"
            java.lang.String r4 = r1.getString(r4)
            if (r4 != 0) goto L_0x0307
        L_0x0306:
            r4 = r3
        L_0x0307:
            if (r1 == 0) goto L_0x030c
            r1.getBoolean(r5, r2)
        L_0x030c:
            r0.mo87880l1(r13)
            if (r7 == 0) goto L_0x0408
            te3.hx0 r4 = r0.f178631K
            if (r4 == 0) goto L_0x032b
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x031c
            java.lang.String r4 = r4.username
            goto L_0x031d
        L_0x031c:
            r4 = 0
        L_0x031d:
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r7.f134919d
            if (r5 == 0) goto L_0x0324
            java.lang.String r5 = r5.username
            goto L_0x0325
        L_0x0324:
            r5 = 0
        L_0x0325:
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x03f9
        L_0x032b:
            java.lang.Class<cl1.j> r4 = cl1.C39975j.class
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r4)
            cl1.j r4 = (cl1.C39975j) r4
            boolean r5 = r4.mo62578e3()
            if (r5 == 0) goto L_0x0362
            nk1.h r5 = nk1.C47272h.f126894a
            androidx.lifecycle.z<te3.lw0> r4 = r4.f107170j
            java.lang.Object r4 = r4.getValue()
            te3.lw0 r4 = (te3.C50317lw0) r4
            if (r4 == 0) goto L_0x0349
            java.lang.String r4 = r4.f137677e
            if (r4 != 0) goto L_0x034a
        L_0x0349:
            r4 = r3
        L_0x034a:
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r7.f134919d
            if (r8 == 0) goto L_0x0352
            java.lang.String r9 = r8.username
            if (r9 != 0) goto L_0x0353
        L_0x0352:
            r9 = r3
        L_0x0353:
            if (r8 == 0) goto L_0x035b
            java.lang.String r8 = r8.nickname
            if (r8 != 0) goto L_0x035a
            goto L_0x035b
        L_0x035a:
            r3 = r8
        L_0x035b:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r3 = r5.mo72299d(r4, r9, r3, r8)
            goto L_0x036c
        L_0x0362:
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r7.f134919d
            if (r4 == 0) goto L_0x036c
            java.lang.String r4 = r4.nickname
            if (r4 != 0) goto L_0x036b
            goto L_0x036c
        L_0x036b:
            r3 = r4
        L_0x036c:
            r20 = r3
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r0.f178626F
            android.content.res.Resources r5 = r4.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r12]
            di3.d r9 = di3.C86312j.m106911c(r6)
            java.lang.String r10 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r9, r10)
            r21 = r9
            tf0.p1 r21 = (tf0.C64916p1) r21
            android.view.ViewGroup r9 = r0.f166287d
            android.content.Context r9 = r9.getContext()
            java.lang.String r11 = "root.context"
            gy3.C87412m.m108593f(r9, r11)
            com.tencent.mm.ui.widget.MMEditText r12 = r0.f178647v
            android.text.TextPaint r12 = r12.getPaint()
            java.lang.String r14 = "inputEt.paint"
            gy3.C87412m.m108593f(r12, r14)
            r15 = 0
            java.lang.String r24 = m74148m1(r0, r15, r13, r15)
            r25 = 0
            r26 = 8
            r27 = 0
            r22 = r9
            r23 = r12
            java.lang.CharSequence r9 = tf0.C64916p1.C64917a.m76441h(r21, r22, r23, r24, r25, r26, r27)
            r8[r2] = r9
            di3.d r6 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r6, r10)
            r17 = r6
            tf0.p1 r17 = (tf0.C64916p1) r17
            android.view.ViewGroup r6 = r0.f166287d
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108593f(r6, r11)
            com.tencent.mm.ui.widget.MMEditText r9 = r0.f178647v
            android.text.TextPaint r9 = r9.getPaint()
            gy3.C87412m.m108593f(r9, r14)
            r21 = 0
            r22 = 8
            r23 = 0
            r18 = r6
            r19 = r9
            java.lang.CharSequence r6 = tf0.C64916p1.C64917a.m76441h(r17, r18, r19, r20, r21, r22, r23)
            r8[r13] = r6
            r6 = 2131828706(0x7f111fe2, float:1.929036E38)
            java.lang.String r5 = r5.getString(r6, r8)
            android.text.SpannableString r3 = r3.mo107057T1(r4, r5)
            com.tencent.mm.ui.widget.MMEditText r4 = r0.f178647v
            r4.setHint(r3)
            com.tencent.mm.ui.widget.MMEditText r3 = r0.f178647v
            r4 = 0
            r3.setText(r4)
        L_0x03f9:
            r0.f178631K = r7
            com.tencent.mm.ui.widget.MMEditText r3 = r0.f178647v
            qj1.s8 r4 = new qj1.s8
            r4.<init>(r0)
            r5 = 100
            r3.postDelayed(r4, r5)
            goto L_0x0434
        L_0x0408:
            int r3 = r4.length()
            if (r3 != 0) goto L_0x0410
            r3 = 1
            goto L_0x0411
        L_0x0410:
            r3 = 0
        L_0x0411:
            if (r3 == 0) goto L_0x0429
            com.tencent.mm.ui.widget.MMEditText r3 = r0.f178647v
            android.text.Editable r3 = r3.getText()
            if (r3 == 0) goto L_0x0423
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0422
            goto L_0x0423
        L_0x0422:
            r13 = 0
        L_0x0423:
            if (r13 == 0) goto L_0x042e
            r28.mo87879i1()
            goto L_0x042e
        L_0x0429:
            com.tencent.mm.ui.widget.MMEditText r3 = r0.f178647v
            r3.setText(r4)
        L_0x042e:
            r3 = 0
            r0.f178631K = r3
            r28.mo87885r1()
        L_0x0434:
            if (r1 == 0) goto L_0x043d
            java.lang.String r3 = "PARAM_ENTER_COMMENT_HIDE_AT_ENTRANCE"
            boolean r1 = r1.getBoolean(r3)
            goto L_0x043e
        L_0x043d:
            r1 = 0
        L_0x043e:
            if (r1 != 0) goto L_0x0453
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r3 = r28.mo87684A0()
            boolean r1 = r1.mo87032P0(r3)
            if (r1 == 0) goto L_0x044d
            goto L_0x0453
        L_0x044d:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f178651z
            r1.setVisibility(r2)
            goto L_0x0469
        L_0x0453:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f178651z
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0469
        L_0x045b:
            r0.mo87878h1(r2)
            goto L_0x0469
        L_0x045f:
            r2 = 8
            r0.mo10792g(r2)
            com.tencent.mm.ui.widget.MMEditText r1 = r0.f178647v
            com.tencent.p014mm.sdk.platformtools.Util.hideVKB(r1)
        L_0x0469:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62949r8.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178625E.setOnTextOperationListener((ChatFooterPanel.C72719a) null);
        this.f178637R = false;
    }
}

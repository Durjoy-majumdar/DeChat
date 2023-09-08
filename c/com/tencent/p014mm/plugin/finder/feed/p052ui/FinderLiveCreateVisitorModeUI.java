package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58739j4;
import f12.C7970a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import nj3.C88989a;
import ok1.C62042e;
import p196ln.C76706g;
import p599lr.C61381b;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qg1.C12233y;
import up1.C27696y;
import vf1.C14717a2;
import vf1.C14727b2;
import vf1.C14736c2;
import vf1.C14849y1;
import vf1.C14854z1;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI */
public final class FinderLiveCreateVisitorModeUI extends MMFinderUI {

    /* renamed from: I */
    public static final /* synthetic */ int f14487I = 0;

    /* renamed from: A */
    public String f14488A;

    /* renamed from: B */
    public String f14489B;

    /* renamed from: C */
    public String f14490C;

    /* renamed from: D */
    public String f14491D;

    /* renamed from: E */
    public String f14492E;

    /* renamed from: F */
    public int f14493F = 28;

    /* renamed from: G */
    public int f14494G;

    /* renamed from: H */
    public KeyboardHeightProvider f14495H;

    /* renamed from: o */
    public final String f14496o = "FinderLiveCreateVisitorModeUI";

    /* renamed from: p */
    public final int f14497p = 1000;

    /* renamed from: q */
    public final int f14498q = 1001;

    /* renamed from: r */
    public View f14499r;

    /* renamed from: s */
    public ImageView f14500s;

    /* renamed from: t */
    public MMEditText f14501t;

    /* renamed from: u */
    public ImageView f14502u;

    /* renamed from: v */
    public View f14503v;

    /* renamed from: w */
    public Button f14504w;

    /* renamed from: x */
    public int f14505x;

    /* renamed from: y */
    public boolean f14506y = true;

    /* renamed from: z */
    public String f14507z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI$a */
    public static final class C2958a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCreateVisitorModeUI f14508d;

        public C2958a(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
            this.f14508d = finderLiveCreateVisitorModeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14508d.hideVKB();
            this.f14508d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI$b */
    public static final class C2959b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCreateVisitorModeUI f14509d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI$b$a */
        public static final class C2960a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveCreateVisitorModeUI f14510d;

            public C2960a(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
                this.f14510d = finderLiveCreateVisitorModeUI;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: Q1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo531Q1(int r17, boolean r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r17
                    com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI r2 = r0.f14510d
                    java.lang.String r2 = r2.f14496o
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "onKeyboardHeightChanged, height:"
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r4 = ", isResized:"
                    r3.append(r4)
                    r4 = r18
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                    com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI r2 = r0.f14510d
                    r3 = 1
                    r4 = 0
                    if (r1 <= 0) goto L_0x002e
                    r5 = 1
                    goto L_0x002f
                L_0x002e:
                    r5 = 0
                L_0x002f:
                    android.widget.Button r6 = r2.f14504w
                    if (r6 == 0) goto L_0x0038
                    android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                    goto L_0x0039
                L_0x0038:
                    r6 = 0
                L_0x0039:
                    boolean r8 = r6 instanceof android.widget.RelativeLayout.LayoutParams
                    if (r8 == 0) goto L_0x0040
                    android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
                    goto L_0x0041
                L_0x0040:
                    r6 = 0
                L_0x0041:
                    android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r8 = r8.getResources()
                    r9 = 2131165363(0x7f0700b3, float:1.794494E38)
                    int r8 = r8.getDimensionPixelOffset(r9)
                    if (r6 == 0) goto L_0x0122
                    r10 = 12
                    r11 = 3
                    if (r5 == 0) goto L_0x00fe
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
                    int r5 = r5.y
                    android.widget.Button r12 = r2.f14504w
                    if (r12 == 0) goto L_0x006a
                    int r12 = r12.getHeight()
                    goto L_0x006b
                L_0x006a:
                    r12 = 0
                L_0x006b:
                    r13 = 2
                    int[] r13 = new int[r13]
                    android.view.View r14 = r2.f14503v
                    if (r14 == 0) goto L_0x0075
                    r14.getLocationOnScreen(r13)
                L_0x0075:
                    r13 = r13[r3]
                    android.view.View r14 = r2.f14503v
                    if (r14 == 0) goto L_0x007f
                    int r3 = r14.getHeight()
                L_0x007f:
                    java.lang.String r14 = r2.f14496o
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    java.lang.String r7 = "adjustConfirmBtn screenHeight:"
                    r15.append(r7)
                    r15.append(r5)
                    java.lang.String r7 = ",confirmBtnContainerH:"
                    r15.append(r7)
                    r15.append(r12)
                    java.lang.String r7 = ",descContainerY:"
                    r15.append(r7)
                    r15.append(r13)
                    java.lang.String r7 = ",itemHeight:"
                    r15.append(r7)
                    r15.append(r3)
                    java.lang.String r7 = ",height:"
                    r15.append(r7)
                    r15.append(r1)
                    java.lang.String r7 = r15.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
                    if (r12 == 0) goto L_0x00ed
                    if (r13 == 0) goto L_0x00ed
                    int r7 = r5 - r8
                    int r7 = r7 - r12
                    int r13 = r13 + r3
                    int r7 = r7 - r13
                    if (r7 > r1) goto L_0x00c1
                    goto L_0x00ed
                L_0x00c1:
                    android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r3 = r3.getResources()
                    int r3 = r3.getDimensionPixelOffset(r9)
                    int r5 = r5 - r1
                    int r5 = r5 - r13
                    int r5 = r5 - r12
                    android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r4 = r4.getResources()
                    r7 = 2131165355(0x7f0700ab, float:1.7944925E38)
                    int r4 = r4.getDimensionPixelOffset(r7)
                    int r5 = r5 - r4
                    r6.removeRule(r11)
                    r6.addRule(r10)
                    if (r3 <= r5) goto L_0x00e9
                    r3 = r5
                L_0x00e9:
                    int r1 = r1 + r3
                    r6.bottomMargin = r1
                    goto L_0x0108
                L_0x00ed:
                    android.view.View r1 = r2.f14503v
                    if (r1 == 0) goto L_0x0108
                    int r1 = r1.getId()
                    r6.removeRule(r10)
                    r6.addRule(r11, r1)
                    r6.bottomMargin = r4
                    goto L_0x0108
                L_0x00fe:
                    r6.removeRule(r11)
                    r6.addRule(r10)
                    int r1 = r2.f14494G
                    r6.bottomMargin = r1
                L_0x0108:
                    android.widget.Button r1 = r2.f14504w
                    if (r1 == 0) goto L_0x0111
                    android.view.ViewParent r1 = r1.getParent()
                    goto L_0x0112
                L_0x0111:
                    r1 = 0
                L_0x0112:
                    boolean r3 = r1 instanceof android.view.ViewGroup
                    if (r3 == 0) goto L_0x011a
                    r7 = r1
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    goto L_0x011b
                L_0x011a:
                    r7 = 0
                L_0x011b:
                    if (r7 == 0) goto L_0x0122
                    android.widget.Button r1 = r2.f14504w
                    r7.updateViewLayout(r1, r6)
                L_0x0122:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI.C2959b.C2960a.mo531Q1(int, boolean):void");
            }
        }

        public C2959b(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
            this.f14509d = finderLiveCreateVisitorModeUI;
        }

        public final void run() {
            FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f14509d;
            if (finderLiveCreateVisitorModeUI.f14495H == null) {
                finderLiveCreateVisitorModeUI.f14495H = new KeyboardHeightProvider(finderLiveCreateVisitorModeUI);
                FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI2 = this.f14509d;
                KeyboardHeightProvider keyboardHeightProvider = finderLiveCreateVisitorModeUI2.f14495H;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C2960a(finderLiveCreateVisitorModeUI2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f14509d.f14495H;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: N7 */
    public static final void m2852N7(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        String str = finderLiveCreateVisitorModeUI.f14492E;
        boolean z = false;
        if (str == null || str.length() == 0) {
            String str2 = finderLiveCreateVisitorModeUI.f14496o;
            Log.m105924i(str2, "continuePost nickNameStr:" + finderLiveCreateVisitorModeUI.f14492E + " is empty!");
            finderLiveCreateVisitorModeUI.mo3015O7(true);
            return;
        }
        String str3 = finderLiveCreateVisitorModeUI.f14490C;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (!z && C87412m.m108589b(finderLiveCreateVisitorModeUI.f14490C, finderLiveCreateVisitorModeUI.f14491D) && finderLiveCreateVisitorModeUI.f14506y) {
            String str4 = finderLiveCreateVisitorModeUI.f14490C;
            str3 = str4 != null ? C112550d0.m153780P(str4, "/96") : null;
        }
        String str5 = finderLiveCreateVisitorModeUI.f14492E;
        if (str5 == null) {
            str5 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        new C12233y(str5, str3, new C14849y1(finderLiveCreateVisitorModeUI)).mo9225i();
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f14496o;
    }

    /* renamed from: O7 */
    public final void mo3015O7(boolean z) {
        Button button = this.f14504w;
        if (button != null) {
            button.setEnabled(z);
        }
        if (z) {
            if (C85875k4.m106211z()) {
                Button button2 = this.f14504w;
                if (button2 != null) {
                    button2.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    return;
                }
                return;
            }
            Button button3 = this.f14504w;
            if (button3 != null) {
                button3.setTextColor(getContext().getResources().getColor(C0966R.color.f2975b6));
            }
        } else if (C85875k4.m106211z()) {
            Button button4 = this.f14504w;
            if (button4 != null) {
                button4.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
            }
        } else {
            Button button5 = this.f14504w;
            if (button5 != null) {
                button5.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.afw;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap extractThumbNail;
        String str;
        Editable text;
        if (i == this.f14497p) {
            if (intent != null && i2 == -1) {
                setIntent(new Intent());
                getIntent().putExtra("key_source_img_path", C7013o.m7260b(getContext(), intent, C7970a.m8127a()));
                ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88200k(this, getIntent(), this.f14498q);
            }
        } else if (i == this.f14498q && intent != null && i2 == -1) {
            String stringExtra = intent.getStringExtra("key_result_img_path");
            this.f14489B = stringExtra;
            boolean z = false;
            Log.m105925i(this.f14496o, "avatar path %s file length %d KB", stringExtra, Long.valueOf(C86013q1.m106451l(stringExtra) / ((long) 1024)));
            String str2 = this.f14489B;
            if (!Util.isNullOrNil(str2) && (extractThumbNail = BitmapUtil.extractThumbNail(str2, 256, 256, false)) != null) {
                ImageView imageView = this.f14500s;
                if (imageView != null) {
                    imageView.setImageBitmap(extractThumbNail);
                }
                C58739j4 j4Var = C58739j4.f168176a;
                MMEditText mMEditText = this.f14501t;
                if (mMEditText == null || (text = mMEditText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                String k = j4Var.mo83716k(str);
                this.f14492E = k;
                if (k.length() == 0) {
                    z = true;
                }
                mo3015O7(!z);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String f;
        super.onCreate(bundle);
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86214x0.mo60266n().intValue();
        if (intValue > 0 && intValue < Integer.MAX_VALUE) {
            this.f14493F = intValue;
        }
        String str = "";
        setMMTitle(str);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al8));
        setBackBtn(new C2958a(this), C0966R.raw.icons_filled_back);
        int i = 0;
        this.f14506y = C32444a.f86218y0.mo60266n().intValue() == 0;
        String str2 = this.f14496o;
        Log.m105924i(str2, "initConfigValue filterMyAvatarUrl:" + this.f14506y);
        Intent intent = getIntent();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        this.f14488A = intent != null ? intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME") : null;
        Intent intent2 = getIntent();
        this.f14507z = intent2 != null ? intent2.getStringExtra("KEY_ALIAS_VISITOR_AVATAR") : null;
        Intent intent3 = getIntent();
        this.f14505x = intent3 != null ? intent3.getIntExtra("KEY_SOURCE", 0) : 0;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        this.f14499r = findViewById(C0966R.C0970id.f357480a23);
        this.f14500s = (ImageView) findViewById(C0966R.C0970id.a27);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.l9z);
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.f358857hg1);
        this.f14501t = mMEditText;
        if (mMEditText != null) {
            String str3 = this.f14488A;
            if (str3 == null) {
                str3 = str;
            }
            mMEditText.setText(str3);
        }
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.hfw);
        this.f14502u = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C14854z1(this));
        }
        this.f14504w = (Button) findViewById(C0966R.C0970id.f357756bl2);
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(C75592q0.m90789s());
        if (!(Lo == null || (f = Lo.mo93597f()) == null)) {
            str = f;
        }
        this.f14491D = str;
        String str4 = this.f14507z;
        this.f14490C = str4 == null || str4.length() == 0 ? this.f14491D : this.f14507z;
        ImageView imageView3 = this.f14500s;
        if (imageView3 != null) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(this.f14490C, (C27696y) null, 2, (C8480h) null), imageView3, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        }
        View view = this.f14499r;
        if (view != null) {
            view.setOnClickListener(new C14717a2(this));
        }
        int i2 = this.f14493F;
        int i3 = i2 / 2;
        C62042e.m72802O1(C62042e.f176370a, this.f14501t, (TextView) null, i2, i3 <= 0 ? i2 : i3, false, new C14727b2(this), 16, (Object) null);
        this.f14503v = findViewById(C0966R.C0970id.jzh);
        mo3015O7(false);
        Button button = this.f14504w;
        if (button != null) {
            button.setOnClickListener(new C14736c2(this));
        }
        Button button2 = this.f14504w;
        ViewGroup.LayoutParams layoutParams = button2 != null ? button2.getLayoutParams() : null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        }
        this.f14494G = i;
        if (i <= 0) {
            this.f14494G = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3761db);
        }
        if (this.f14505x == 1) {
            Button button3 = this.f14504w;
            if (button3 != null) {
                button3.setBackgroundResource(C0966R.C0969drawable.a0e);
            }
        } else {
            Button button4 = this.f14504w;
            if (button4 != null) {
                button4.setBackgroundResource(C0966R.C0969drawable.f5151yi);
            }
        }
        String str5 = this.f14496o;
        Log.m105924i(str5, "initConfirmBtnConfig:" + this.f14494G + ", sourceType:" + this.f14505x);
        String str6 = this.f14496o;
        StringBuilder sb = new StringBuilder();
        sb.append("maxNickNameLength:");
        sb.append(this.f14493F);
        Log.m105924i(str6, sb.toString());
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f14495H;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        View decorView;
        super.onResume();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new C2959b(this));
        }
    }
}

package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39691c;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.appbrand.C81812e1;
import com.tencent.p014mm.plugin.appbrand.C81895h2;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.IXWebBroadcastListener;
import cz2.C45241s;
import cz2.C45242t;
import cz2.C75315q;
import cz2.C75316r;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C59741c0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kr0.C76628m0;
import nj3.C88989a;
import org.json.JSONObject;
import p235sm.C64053t0;
import qy2.C63347a;
import qy2.C77459z;
import qz2.C47914d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import vz2.C78501d;
import yz2.C79274u0;
import yz2.C79276v0;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/ui/widget/a$d;", "<init>", "()V", "a", "b", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 */
public final class TextStatusDoWhatActivityV2 extends MMSecDataActivity implements C74965a.C74969d {

    /* renamed from: X0 */
    public static final C5642a f206792X0 = new C5642a((C8480h) null);

    /* renamed from: A */
    public final C13601g f206793A = C36568h.m40985a(new C71385r(this));

    /* renamed from: B */
    public MMEditText f206794B;

    /* renamed from: C */
    public View f206795C;

    /* renamed from: D */
    public WeImageView f206796D;

    /* renamed from: E */
    public ImageView f206797E;

    /* renamed from: F */
    public View f206798F;

    /* renamed from: G */
    public View f206799G;

    /* renamed from: H */
    public TextView f206800H;

    /* renamed from: I */
    public View f206801I;

    /* renamed from: J */
    public final C13601g f206802J = C36568h.m40985a(new C71383p(this));

    /* renamed from: K */
    public final C13601g f206803K = C36568h.m40985a(new C71376g(this));

    /* renamed from: L */
    public final C13601g f206804L = C36568h.m40985a(new C71386s(this));

    /* renamed from: M */
    public final C13601g f206805M = C36568h.m40985a(C71375f.f206852d);

    /* renamed from: N */
    public String f206806N = "userdefine";

    /* renamed from: P */
    public int f206807P;

    /* renamed from: Q */
    public int f206808Q;

    /* renamed from: Q0 */
    public final C71379l f206809Q0;

    /* renamed from: R */
    public boolean f206810R;

    /* renamed from: R0 */
    public final int f206811R0;

    /* renamed from: S */
    public boolean f206812S;

    /* renamed from: S0 */
    public View f206813S0;

    /* renamed from: T */
    public boolean f206814T;

    /* renamed from: T0 */
    public EditText f206815T0;

    /* renamed from: U */
    public long f206816U;

    /* renamed from: U0 */
    public WeImageView f206817U0;

    /* renamed from: V */
    public long f206818V = 150;

    /* renamed from: V0 */
    public C71371b f206819V0;

    /* renamed from: W */
    public final TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1 f206820W;

    /* renamed from: W0 */
    public View f206821W0;

    /* renamed from: X */
    public final TextStatusDoWhatActivityV2$configUpdateListener$1 f206822X;

    /* renamed from: Y */
    public final ArrayList<C9493c> f206823Y;

    /* renamed from: Z */
    public HashMap<String, String> f206824Z;

    /* renamed from: d */
    public WxRecyclerView f206825d;

    /* renamed from: e */
    public TextView f206826e;

    /* renamed from: f */
    public ViewGroup f206827f;

    /* renamed from: g */
    public boolean f206828g;

    /* renamed from: h */
    public String f206829h = "";

    /* renamed from: i */
    public C47914d f206830i;

    /* renamed from: j */
    public C77459z f206831j;

    /* renamed from: n */
    public boolean f206832n = true;

    /* renamed from: o */
    public final C13601g f206833o = C36568h.m40985a(new C71372c(this));

    /* renamed from: p */
    public final C13601g f206834p = C36568h.m40985a(new C71384q(this));

    /* renamed from: p0 */
    public final C71381n f206835p0;

    /* renamed from: q */
    public final C13601g f206836q = C36568h.m40985a(new C71374e(this));

    /* renamed from: r */
    public final C13601g f206837r = C36568h.m40985a(new C71373d(this));

    /* renamed from: s */
    public final String f206838s = "wxb1320569c2a2b6d2";

    /* renamed from: t */
    public final String f206839t = "pages/emoji-panel/emoji-panel.html";

    /* renamed from: u */
    public final String f206840u = "gh_8672f34b4389@app";

    /* renamed from: v */
    public C64053t0.C13730a f206841v;

    /* renamed from: w */
    public C76628m0 f206842w;

    /* renamed from: x */
    public final String f206843x = "config";

    /* renamed from: x0 */
    public final C71382o f206844x0;

    /* renamed from: y */
    public final String f206845y = "key_from_scene";

    /* renamed from: y0 */
    public final C71380m f206846y0;

    /* renamed from: z */
    public final String f206847z = "from_custom_status_icon_experiment";

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$a */
    public static final class C5642a {
        public C5642a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo6664a(Context context, Bundle bundle, Integer num) {
            C87412m.m108594g(context, "context");
            Intent intent = new Intent(context, TextStatusDoWhatActivityV2.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("KEY_IS_ENTER", true);
            intent.putExtras(bundle);
            if (num == null || !(context instanceof Activity)) {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                int intValue = num.intValue();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(intValue));
                aVar2.mo10233c(intent);
                C117292a.m165364j((Activity) context, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$j */
    public static final class C5643j extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f21591d;

        public C5643j(C59741c0 c0Var) {
            this.f21591d = c0Var;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            float f = this.f21591d.f170634d;
            rect.bottom = ((int) f) / 2;
            rect.left = ((int) f) / 2;
            rect.right = ((int) f) / 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$k */
    public static final class C5644k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f21592d;

        public C5644k(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            this.f21592d = textStatusDoWhatActivityV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f21592d.hideVKB();
            this.f21592d.onBackPressed();
            this.f21592d.getContext().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b */
    public final class C71371b implements TextWatcher {
        public C71371b() {
        }

        /* JADX WARNING: type inference failed for: r1v10, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r32) {
            /*
                r31 = this;
                r0 = r31
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                android.widget.EditText r2 = r1.f206815T0
                if (r2 == 0) goto L_0x000d
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r1 = r1.f206819V0
                r2.removeTextChangedListener(r1)
            L_0x000d:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                com.tencent.mm.ui.widget.MMEditText r2 = r1.f206794B
                if (r2 == 0) goto L_0x0018
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r1 = r1.f206819V0
                r2.removeTextChangedListener(r1)
            L_0x0018:
                java.lang.String r1 = java.lang.String.valueOf(r32)
                v51.h r2 = new v51.h
                java.lang.String r3 = java.lang.String.valueOf(r32)
                r4 = 0
                r2.<init>(r3, r4)
                com.tencent.mm.ui.tools.p0$a r3 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
                int r5 = r2.mo108328a(r3)
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r6 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                r6.mo98422K7()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "afterTextChanged inputCount:"
                r6.append(r7)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "MicroMsg.TextStatus.TextStatusDoWhatActivityV2"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                java.lang.String.valueOf(r32)
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r6 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                int r8 = r6.f206811R0
                r9 = 0
                r10 = 1
                if (r5 <= r8) goto L_0x00a5
                java.lang.String r1 = r2.mo108329b(r8, r3)
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r2 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                com.tencent.mm.ui.widget.MMEditText r3 = r2.f206794B
                if (r3 == 0) goto L_0x005d
                goto L_0x0063
            L_0x005d:
                android.widget.EditText r3 = r2.f206815T0
                if (r3 == 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r3 = r9
            L_0x0063:
                if (r3 == 0) goto L_0x0077
                java.lang.CharSequence r1 = vl3.C102226d.m134696a(r2, r1)
                r3.setText(r1)
                android.text.Editable r1 = r3.getText()
                int r1 = r1.length()
                r3.setSelection(r1)
            L_0x0077:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                qy2.z r2 = r1.f206831j
                if (r2 == 0) goto L_0x0082
                int r3 = r2.f229409q
                int r3 = r3 + r10
                r2.f229409q = r3
            L_0x0082:
                com.tencent.mm.plugin.textstatus.ui.CustomStatusView r1 = r1.mo98424M7()
                android.widget.TextView r1 = r1.f206693j
                if (r1 != 0) goto L_0x008b
                goto L_0x008e
            L_0x008b:
                r1.setVisibility(r4)
            L_0x008e:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                android.widget.TextView r1 = r1.f206826e
                if (r1 != 0) goto L_0x0095
                goto L_0x0098
            L_0x0095:
                r1.setVisibility(r4)
            L_0x0098:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r1.f206825d
                if (r1 == 0) goto L_0x0177
                r2 = 3
                r3 = 2
                r1.performHapticFeedback(r2, r3)
                goto L_0x0177
            L_0x00a5:
                com.tencent.mm.plugin.textstatus.ui.CustomStatusView r2 = r6.mo98424M7()
                android.widget.TextView r2 = r2.f206693j
                r3 = 4
                if (r2 != 0) goto L_0x00af
                goto L_0x00b2
            L_0x00af:
                r2.setVisibility(r3)
            L_0x00b2:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r2 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                android.widget.TextView r2 = r2.f206826e
                if (r2 != 0) goto L_0x00b9
                goto L_0x00bc
            L_0x00b9:
                r2.setVisibility(r3)
            L_0x00bc:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r2 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.f206824Z
                if (r3 == 0) goto L_0x0177
                b03.c r5 = r2.mo98425N7()
                boolean r5 = r5.mo62312x()
                java.lang.String r6 = "userdefine"
                if (r5 == 0) goto L_0x011a
                boolean r5 = r3.containsKey(r1)
                if (r5 == 0) goto L_0x00fa
                java.lang.Object r1 = r3.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00de
                goto L_0x00df
            L_0x00de:
                r6 = r1
            L_0x00df:
                r2.f206806N = r6
                b03.c r11 = r2.mo98425N7()
                android.widget.ImageView r12 = r2.f206797E
                java.lang.String r13 = r2.f206806N
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 124(0x7c, float:1.74E-43)
                r20 = 0
                b03.C39691c.m42340S(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x0177
            L_0x00fa:
                r2.f206806N = r6
                b03.c r21 = r2.mo98425N7()
                android.widget.ImageView r1 = r2.f206797E
                java.lang.String r2 = r2.f206806N
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 124(0x7c, float:1.74E-43)
                r30 = 0
                r22 = r1
                r23 = r2
                b03.C39691c.m42340S(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x0177
            L_0x011a:
                b03.c r5 = r2.mo98425N7()
                boolean r5 = r5.mo62310v()
                if (r5 == 0) goto L_0x0177
                boolean r5 = r3.containsKey(r1)
                if (r5 == 0) goto L_0x0153
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                b03.c r11 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                com.tencent.mm.ui.widget.imageview.WeImageView r12 = r2.f206817U0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 124(0x7c, float:1.74E-43)
                r20 = 0
                r13 = r3
                b03.C39691c.m42340S(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                qz2.d r5 = new qz2.d
                r5.<init>(r1, r3)
                r2.f206830i = r5
                java.lang.String r1 = "afterTextChanged:  contains "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
                goto L_0x0177
            L_0x0153:
                java.lang.String r3 = "afterTextChanged: not contains "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r3)
                b03.c r11 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                com.tencent.mm.ui.widget.imageview.WeImageView r12 = r2.f206817U0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 124(0x7c, float:1.74E-43)
                r20 = 0
                java.lang.String r13 = "userdefine"
                b03.C39691c.m42340S(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                qz2.d r3 = new qz2.d
                r3.<init>(r1, r6)
                r2.f206830i = r3
            L_0x0177:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                android.widget.EditText r2 = r1.f206815T0
                if (r2 == 0) goto L_0x0182
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r1 = r1.f206819V0
                r2.addTextChangedListener(r1)
            L_0x0182:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                com.tencent.mm.ui.widget.MMEditText r2 = r1.f206794B
                if (r2 == 0) goto L_0x018d
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r1 = r1.f206819V0
                r2.addTextChangedListener(r1)
            L_0x018d:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                android.view.View r1 = r1.f206813S0
                if (r1 == 0) goto L_0x019d
                r2 = 2131300095(0x7f090eff, float:1.821821E38)
                android.view.View r1 = r1.findViewById(r2)
                r9 = r1
                android.widget.Button r9 = (android.widget.Button) r9
            L_0x019d:
                if (r9 != 0) goto L_0x01a0
                goto L_0x01ae
            L_0x01a0:
                if (r32 == 0) goto L_0x01a9
                int r1 = r32.length()
                if (r1 != 0) goto L_0x01a9
                r4 = 1
            L_0x01a9:
                r1 = r4 ^ 1
                r9.setEnabled(r1)
            L_0x01ae:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r1 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                r1.mo98430S7()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.C71371b.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
            if ((r3.length() == 0) == false) goto L_0x004b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onTextChanged() called with: s = "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = ", start = "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", before = "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = ", count = "
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = r0.toString()
                java.lang.String r5 = "MicroMsg.TextStatus.TextStatusDoWhatActivityV2"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r4 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.this
                com.tencent.mm.ui.widget.MMEditText r5 = r4.f206794B
                if (r5 == 0) goto L_0x005d
                r6 = 1
                r0 = 0
                if (r3 == 0) goto L_0x004a
                java.lang.String r3 = r3.toString()
                if (r3 == 0) goto L_0x004a
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0046
                r3 = 1
                goto L_0x0047
            L_0x0046:
                r3 = 0
            L_0x0047:
                if (r3 != 0) goto L_0x004a
                goto L_0x004b
            L_0x004a:
                r6 = 0
            L_0x004b:
                if (r6 == 0) goto L_0x0053
                java.lang.String r3 = ""
                r5.setHint(r3)
                goto L_0x005d
            L_0x0053:
                r3 = 2131837874(0x7f1143b2, float:1.9308955E38)
                java.lang.String r3 = r4.getString(r3)
                r5.setHint(r3)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.C71371b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$c */
    public static final class C71372c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71372c(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206849d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return this.f206849d.findViewById(C0966R.C0970id.al_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$d */
    public static final class C71373d extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71373d(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206850d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return (ResultReceiver) this.f206850d.getIntent().getParcelableExtra("CALLBACK");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$e */
    public static final class C71374e extends C87413o implements C32224a<CustomStatusView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71374e(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206851d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return (CustomStatusView) this.f206851d.findViewById(C0966R.C0970id.nke);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$f */
    public static final class C71375f extends C87413o implements C32224a<C39691c> {

        /* renamed from: d */
        public static final C71375f f206852d = new C71375f();

        public C71375f() {
            super(0);
        }

        public Object invoke() {
            return IStatusIconHelperKt.m39109a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$g */
    public static final class C71376g extends C87413o implements C32224a<NestedBounceView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71376g(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206853d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return (NestedBounceView) this.f206853d.findViewById(C0966R.C0970id.mu_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$h */
    public static final class C71377h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206854d;

        public C71377h(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            this.f206854d = textStatusDoWhatActivityV2;
        }

        public final void run() {
            ViewTreeObserver viewTreeObserver;
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f206854d;
            ViewGroup viewGroup = textStatusDoWhatActivityV2.f206827f;
            if (textStatusDoWhatActivityV2.mo98425N7().mo62311w() && viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(new C79274u0(viewGroup, textStatusDoWhatActivityV2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$i */
    public static final class C71378i extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206855b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<GridLayoutManager> f206856c;

        public C71378i(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, C8479f0<GridLayoutManager> f0Var) {
            this.f206855b = textStatusDoWhatActivityV2;
            this.f206856c = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.getAdapter();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo118c(int r3) {
            /*
                r2 = this;
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 r0 = r2.f206855b
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.f206825d
                if (r0 == 0) goto L_0x0015
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0015
                int r3 = r0.getItemViewType(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0016
            L_0x0015:
                r3 = 0
            L_0x0016:
                r0 = -1
                if (r3 != 0) goto L_0x001a
                goto L_0x0029
            L_0x001a:
                int r1 = r3.intValue()
                if (r1 != r0) goto L_0x0029
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                goto L_0x007d
            L_0x0029:
                r0 = 1
                if (r3 != 0) goto L_0x002d
                goto L_0x003c
            L_0x002d:
                int r1 = r3.intValue()
                if (r1 != r0) goto L_0x003c
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                goto L_0x007d
            L_0x003c:
                r0 = 2
                if (r3 != 0) goto L_0x0040
                goto L_0x004f
            L_0x0040:
                int r1 = r3.intValue()
                if (r1 != r0) goto L_0x004f
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                goto L_0x007d
            L_0x004f:
                r0 = 3
                if (r3 != 0) goto L_0x0053
                goto L_0x0062
            L_0x0053:
                int r1 = r3.intValue()
                if (r1 != r0) goto L_0x0062
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                goto L_0x007d
            L_0x0062:
                r0 = 4
                if (r3 != 0) goto L_0x0066
                goto L_0x0075
            L_0x0066:
                int r3 = r3.intValue()
                if (r3 != r0) goto L_0x0075
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                goto L_0x007d
            L_0x0075:
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r3 = r2.f206856c
                T r3 = r3.f27484d
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
            L_0x007d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.C71378i.mo118c(int):int");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$l */
    public static final class C71379l implements C75315q {

        /* renamed from: a */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206857a;

        public C71379l(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            this.f206857a = textStatusDoWhatActivityV2;
        }

        /* renamed from: a */
        public void mo98435a(String str, String str2) {
            C87412m.m108594g(str, "iconId");
            C87412m.m108594g(str2, "customStatusWord");
            Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "onCustomStatusConfirm onItemClick() called with: iconId = " + str + ", customStatusWord = " + str2);
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f206857a;
            textStatusDoWhatActivityV2.getClass();
            textStatusDoWhatActivityV2.f206829h = str2;
            TextStatusDoWhatActivityV2.m83898H7(this.f206857a, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$m */
    public static final class C71380m implements C75316r {
        /* renamed from: a */
        public void mo98436a(String str) {
            C87412m.m108594g(str, "action");
            Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "onCustomStatusItemClickListener onClick() called with: action = " + str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$n */
    public static final class C71381n implements C45241s {

        /* renamed from: a */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206858a;

        public C71381n(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            this.f206858a = textStatusDoWhatActivityV2;
        }

        /* renamed from: a */
        public void mo70748a(View view, String str) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(str, "iconId");
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f206858a;
            C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
            if (textStatusDoWhatActivityV2.mo98425N7().mo62310v() && C87412m.m108589b(str, "userdefine")) {
                TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f206858a;
                C77459z zVar = textStatusDoWhatActivityV22.f206831j;
                if (zVar != null) {
                    zVar.f229408p++;
                }
                TextStatusDoWhatActivityV2.m83899I7(textStatusDoWhatActivityV22, str);
            } else if (!this.f206858a.mo98424M7().f206686B) {
                TextStatusDoWhatActivityV2.m83898H7(this.f206858a, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$o */
    public static final class C71382o implements C45242t {

        /* renamed from: a */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206859a;

        public C71382o(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            this.f206859a = textStatusDoWhatActivityV2;
        }

        /* renamed from: a */
        public void mo70749a(View view, String str, String str2) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(str, "iconId");
            C87412m.m108594g(str2, "customStatusTitle");
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f206859a;
            C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
            if (!textStatusDoWhatActivityV2.mo98424M7().f206686B) {
                TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f206859a;
                textStatusDoWhatActivityV22.getClass();
                textStatusDoWhatActivityV22.f206829h = str2;
                TextStatusDoWhatActivityV2 textStatusDoWhatActivityV23 = this.f206859a;
                textStatusDoWhatActivityV23.f206812S = true;
                TextStatusDoWhatActivityV2.m83898H7(textStatusDoWhatActivityV23, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$p */
    public static final class C71383p extends C87413o implements C32224a<NestedScrollView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71383p(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206860d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return (NestedScrollView) this.f206860d.findViewById(C0966R.C0970id.j48);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$q */
    public static final class C71384q extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71384q(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206861d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return this.f206861d.findViewById(C0966R.C0970id.koz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$r */
    public static final class C71385r extends C87413o implements C32224a<TransitionDrawable> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71385r(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206862d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            Drawable drawable = this.f206862d.getResources().getDrawable(C0966R.C0969drawable.clx);
            C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            return (TransitionDrawable) drawable;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$s */
    public static final class C71386s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71386s(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206863d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            return (TextView) this.f206863d.findViewById(C0966R.C0970id.kyn);
        }
    }

    public TextStatusDoWhatActivityV2() {
        C40008f fVar = C40008f.f107254d;
        this.f206820W = new TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1(this, fVar);
        this.f206822X = new TextStatusDoWhatActivityV2$configUpdateListener$1(this, fVar);
        this.f206823Y = new ArrayList<>();
        this.f206835p0 = new C71381n(this);
        this.f206844x0 = new C71382o(this);
        this.f206846y0 = new C71380m();
        this.f206809Q0 = new C71379l(this);
        this.f206811R0 = 10;
        this.f206819V0 = new C71371b();
    }

    /* renamed from: H7 */
    public static final void m83898H7(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, String str) {
        if (textStatusDoWhatActivityV2.f206828g) {
            C77459z zVar = textStatusDoWhatActivityV2.f206831j;
            if (zVar != null) {
                zVar.f229399d.f147238g.f147088e = str;
            } else {
                zVar = new C77459z();
                zVar.f229399d.f147238g.f147088e = str;
                zVar.f229405j = 0;
                zVar.f229403h = "";
                zVar.f229404i = 0;
                zVar.f229406n = 0;
                zVar.f229407o = 0;
            }
            C77459z zVar2 = zVar;
            zVar2.f229397B = (long) textStatusDoWhatActivityV2.f206808Q;
            zVar2.f229396A = (long) textStatusDoWhatActivityV2.f206807P;
            boolean a = textStatusDoWhatActivityV2.mo98425N7().mo62289a(str);
            Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "doClickIcon: iconId:" + str + " canCustomStatusTitle:" + a);
            if (a) {
                zVar2.f229399d.f147238g.f147092i = textStatusDoWhatActivityV2.f206829h;
            }
            TextStatusEditActivity.f206867L1.mo98499b(textStatusDoWhatActivityV2, zVar2, true, textStatusDoWhatActivityV2.f206810R, (ResultReceiver) textStatusDoWhatActivityV2.getIntent().getParcelableExtra("CALLBACK"), textStatusDoWhatActivityV2.f206812S);
            C119179t tVar = C119157j.f356862d;
            C79276v0 v0Var = new C79276v0(textStatusDoWhatActivityV2);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(v0Var, 50, false);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("STATUS_TYPE_CUSTOM_TITLE", textStatusDoWhatActivityV2.f206829h);
        intent.putExtra("STATUS_TYPE_IMG", str);
        C77459z zVar3 = textStatusDoWhatActivityV2.f206831j;
        intent.putExtra("ClkCustomIconCount", zVar3 != null ? zVar3.f229408p : 0);
        C77459z zVar4 = textStatusDoWhatActivityV2.f206831j;
        intent.putExtra("CustomTitleTooLongCount", zVar4 != null ? zVar4.f229409q : 0);
        intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", textStatusDoWhatActivityV2.f206810R);
        intent.putExtra("KEY_CLK_USER_DEFINE_ICON_COUNT", textStatusDoWhatActivityV2.f206807P);
        intent.putExtra("KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT", textStatusDoWhatActivityV2.f206808Q);
        textStatusDoWhatActivityV2.setResult(-1, intent);
        textStatusDoWhatActivityV2.f206832n = false;
        textStatusDoWhatActivityV2.finish();
        textStatusDoWhatActivityV2.getContext().overridePendingTransition(0, C0966R.C0968anim.f2469dt);
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        r4 = r4.f229399d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m83899I7(com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2 r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = 2131300667(0x7f09113b, float:1.821937E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f206813S0 = r1
            r1 = 2131316054(0x7f094d56, float:1.8250579E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f206821W0 = r1
            android.view.View r1 = r0.f206813S0
            r2 = 0
            if (r1 == 0) goto L_0x002e
            b03.p r3 = b03.C39718p.f106569a
            qy2.z r4 = r0.f206831j
            if (r4 == 0) goto L_0x0026
            uz2.u r4 = r4.f229399d
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = r4.f147252x
            goto L_0x0027
        L_0x0026:
            r4 = r2
        L_0x0027:
            int r3 = r3.mo62351b(r4)
            r1.setBackgroundResource(r3)
        L_0x002e:
            android.view.View r1 = r0.f206813S0
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = kg3.C76577a.m92155f(r3, r4)
            float r3 = (float) r3
            r4 = 1
            if (r1 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            b03.c0 r5 = new b03.c0
            r5.<init>(r4, r4, r3)
            r1.setOutlineProvider(r5)
        L_0x0048:
            if (r1 != 0) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r1.setClipToOutline(r4)
        L_0x004e:
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x005c
            r3 = 2131300665(0x7f091139, float:1.8219366E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.EditText r1 = (android.widget.EditText) r1
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            r0.f206815T0 = r1
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x006d
            r3 = 2131300666(0x7f09113a, float:1.8219368E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            r0.f206817U0 = r1
            b03.c r5 = r23.mo98425N7()
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r0.f206817U0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 124(0x7c, float:1.74E-43)
            r14 = 0
            java.lang.String r7 = "userdefine"
            b03.C39691c.m42340S(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r0.f206813S0
            r3 = 0
            if (r1 != 0) goto L_0x008a
            goto L_0x00c8
        L_0x008a:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.mo10233c(r6)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r18 = "showCustomDialog"
            java.lang.String r19 = "(Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r17 = "showCustomDialog"
            java.lang.String r18 = "(Ljava/lang/String;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x00c8:
            android.view.View r1 = r0.f206821W0
            if (r1 != 0) goto L_0x00cd
            goto L_0x010c
        L_0x00cd:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r8 = "showCustomDialog"
            java.lang.String r9 = "(Ljava/lang/String;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r7 = "showCustomDialog"
            java.lang.String r8 = "(Ljava/lang/String;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x010c:
            android.view.View r1 = r0.f206821W0
            if (r1 == 0) goto L_0x0115
            yz2.j1 r5 = yz2.C16085j1.f43232d
            r1.setOnClickListener(r5)
        L_0x0115:
            java.lang.String r1 = r0.f206829h
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r4 = 0
        L_0x011f:
            if (r4 == 0) goto L_0x0133
            android.widget.EditText r3 = r0.f206815T0
            if (r3 == 0) goto L_0x0128
            r3.setText(r1)
        L_0x0128:
            android.widget.EditText r3 = r0.f206815T0
            if (r3 == 0) goto L_0x0133
            int r1 = r1.length()
            r3.setSelection(r1)
        L_0x0133:
            r23.mo98422K7()
            android.widget.EditText r1 = r0.f206815T0
            if (r1 == 0) goto L_0x013f
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r3 = r0.f206819V0
            r1.removeTextChangedListener(r3)
        L_0x013f:
            android.widget.EditText r1 = r0.f206815T0
            if (r1 == 0) goto L_0x0148
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$b r3 = r0.f206819V0
            r1.addTextChangedListener(r3)
        L_0x0148:
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x015a
            r3 = 2131300653(0x7f09112d, float:1.8219342E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.InputPanelLinearLayout r1 = (com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout) r1
            if (r1 == 0) goto L_0x015a
            r1.mo104200a(r0)
        L_0x015a:
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x0171
            r3 = 2131306719(0x7f0928df, float:1.8231645E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0171
            yz2.k1 r3 = new yz2.k1
            r3.<init>(r0)
            r1.setOnClickListener(r3)
        L_0x0171:
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x018a
            r3 = 2131298457(0x7f090899, float:1.8214888E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r1 == 0) goto L_0x018a
            yz2.l1 r3 = new yz2.l1
            r4 = r24
            r3.<init>(r0, r4)
            r1.setOnClickListener(r3)
        L_0x018a:
            android.view.View r1 = r0.f206813S0
            if (r1 == 0) goto L_0x0198
            r2 = 2131315852(0x7f094c8c, float:1.8250169E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x0198:
            r0.f206826e = r2
            android.widget.EditText r1 = r0.f206815T0
            if (r1 == 0) goto L_0x01a1
            r1.requestFocus()
        L_0x01a1:
            super.showVKB()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.m83899I7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2, java.lang.String):void");
    }

    /* renamed from: J7 */
    public static final void m83900J7(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        View view;
        if (!textStatusDoWhatActivityV2.mo98425N7().mo62311w()) {
            Log.m105928w("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel: error expt");
        } else if (System.currentTimeMillis() - textStatusDoWhatActivityV2.f206816U > textStatusDoWhatActivityV2.f206818V) {
            textStatusDoWhatActivityV2.f206816U = System.currentTimeMillis();
            boolean z = textStatusDoWhatActivityV2.f206814T;
            if (z) {
                Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel: isEmojiPanelShow:%s", Boolean.valueOf(z));
                textStatusDoWhatActivityV2.mo98428Q7();
                MMEditText mMEditText = textStatusDoWhatActivityV2.f206794B;
                if (mMEditText != null) {
                    mMEditText.requestFocus();
                }
                super.showVKB();
                return;
            }
            C76628m0 m0Var = textStatusDoWhatActivityV2.f206842w;
            if (m0Var != null && (view = ((C81895h2) m0Var).getView()) != null) {
                Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel:isSelectStatusIconMode:%s this.translationY:%s", Boolean.FALSE, Float.valueOf(view.getTranslationY()));
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!(view.getTranslationY() == 0.0f)) {
                    textStatusDoWhatActivityV2.f206814T = true;
                    MMEditText mMEditText2 = textStatusDoWhatActivityV2.f206794B;
                    if (mMEditText2 != null) {
                        mMEditText2.setCursorVisible(false);
                    }
                    WeImageView weImageView = textStatusDoWhatActivityV2.f206796D;
                    if (weImageView != null) {
                        if (!(weImageView.getRotation() == -90.0f)) {
                            ObjectAnimator.ofFloat(weImageView, "rotation", new float[]{90.0f, -90.0f}).setDuration(150).start();
                        }
                    }
                    View view3 = textStatusDoWhatActivityV2.f206798F;
                    if (view3 != null) {
                        view3.setBackground((TransitionDrawable) ((C36570n) textStatusDoWhatActivityV2.f206793A).getValue());
                    }
                    ((TransitionDrawable) ((C36570n) textStatusDoWhatActivityV2.f206793A).getValue()).startTransition(150);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
                    ofFloat.setInterpolator(new AccelerateInterpolator());
                    ofFloat.setDuration(150);
                    ofFloat.start();
                    textStatusDoWhatActivityV2.hideVKB();
                    C76628m0 m0Var2 = textStatusDoWhatActivityV2.f206842w;
                    C87412m.m108591d(m0Var2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                    C13598b0 b0Var = C13598b0.f38549a;
                    ((C81895h2) m0Var2).mo114295h0("onRequestStatusEmojiPanelShow", jSONObject);
                }
            }
        }
    }

    /* renamed from: K7 */
    public final void mo98422K7() {
        Editable text;
        CharSequence i0;
        View view = this.f206813S0;
        Button button = view != null ? (Button) view.findViewById(C0966R.C0970id.f357588am1) : null;
        if (button != null) {
            EditText editText = this.f206815T0;
            boolean z = false;
            if (((editText == null || (text = editText.getText()) == null || (i0 = C112550d0.m153799i0(text)) == null) ? 0 : i0.length()) > 0) {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: L7 */
    public final View mo98423L7() {
        Object value = ((C36570n) this.f206833o).getValue();
        C87412m.m108593f(value, "<get-btnBack>(...)");
        return (View) value;
    }

    /* renamed from: M7 */
    public final CustomStatusView mo98424M7() {
        Object value = ((C36570n) this.f206836q).getValue();
        C87412m.m108593f(value, "<get-customStatusView>(...)");
        return (CustomStatusView) value;
    }

    /* renamed from: N7 */
    public final C39691c mo98425N7() {
        return (C39691c) ((C36570n) this.f206805M).getValue();
    }

    /* renamed from: O7 */
    public final View mo98426O7() {
        Object value = ((C36570n) this.f206834p).getValue();
        C87412m.m108593f(value, "<get-titleLayout>(...)");
        return (View) value;
    }

    /* renamed from: P7 */
    public final void mo98427P7() {
        View view = this.f206813S0;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f206821W0;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        EditText editText = this.f206815T0;
        if (editText != null) {
            editText.setText("");
        }
        hideVKB();
    }

    /* renamed from: Q7 */
    public final void mo98428Q7() {
        View view;
        if (!mo98425N7().mo62311w()) {
            Log.m105928w("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "hideEmojiPanel: error expt");
            return;
        }
        C76628m0 m0Var = this.f206842w;
        if (m0Var != null && (view = ((C81895h2) m0Var).getView()) != null) {
            Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "hideEmojiPanel: isSelectStatusIconMode:%s this.translationY:%s , stack:%s ", Boolean.FALSE, Float.valueOf(view.getTranslationY()), Util.getStack());
            if (view.getTranslationY() == 0.0f) {
                this.f206814T = false;
                MMEditText mMEditText = this.f206794B;
                if (mMEditText != null) {
                    mMEditText.setCursorVisible(true);
                }
                MMEditText mMEditText2 = this.f206794B;
                if (mMEditText2 != null) {
                    mMEditText2.requestFocus();
                }
                WeImageView weImageView = this.f206796D;
                if (weImageView != null) {
                    if (!(weImageView.getRotation() == 90.0f)) {
                        ObjectAnimator.ofFloat(weImageView, "rotation", new float[]{-90.0f, 90.0f}).setDuration(150).start();
                    }
                }
                View view2 = this.f206798F;
                if (view2 != null) {
                    view2.setBackground((TransitionDrawable) ((C36570n) this.f206793A).getValue());
                }
                ((TransitionDrawable) ((C36570n) this.f206793A).getValue()).reverseTransition(150);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) view.getHeight()});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.setDuration(150);
                ofFloat.start();
                C76628m0 m0Var2 = this.f206842w;
                C87412m.m108591d(m0Var2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                C13598b0 b0Var = C13598b0.f38549a;
                ((C81895h2) m0Var2).mo114295h0("onRequestStatusEmojiPanelDismiss", jSONObject);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r1 = (qz2.C47914d) r1;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.String> mo98429R7(java.util.ArrayList<jq3.C9493c> r4) {
        /*
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0011:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r4.next()
            jq3.c r1 = (jq3.C9493c) r1
            boolean r2 = r1 instanceof qz2.C47914d
            if (r2 == 0) goto L_0x0011
            qz2.d r1 = (qz2.C47914d) r1
            java.lang.String r2 = r1.f128569d
            if (r2 == 0) goto L_0x0011
            java.lang.String r1 = r1.f128570e
            if (r1 == 0) goto L_0x0011
            r0.put(r2, r1)
            goto L_0x0011
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.mo98429R7(java.util.ArrayList):java.util.HashMap");
    }

    /* renamed from: S7 */
    public final void mo98430S7() {
        MMEditText mMEditText = this.f206794B;
        boolean z = false;
        if (mMEditText != null) {
            Editable text = mMEditText.getText();
            if (text != null && (C112551y.m153811k(text) ^ true)) {
                z = true;
            }
        }
        if (z) {
            TextView textView = this.f206800H;
            if (textView != null) {
                textView.setTextColor(getResources().getColor(C0966R.color.f2975b6));
                return;
            }
            return;
        }
        TextView textView2 = this.f206800H;
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor("#4cFFFFFF"));
        }
    }

    public void finish() {
        if (this.f206832n) {
            if (this.f206828g) {
                C78501d.f229945a.mo108458d(this.f206831j, 3);
                ResultReceiver resultReceiver = (ResultReceiver) ((C36570n) this.f206837r).getValue();
                if (resultReceiver != null) {
                    resultReceiver.send(0, (Bundle) null);
                }
            }
            Intent intent = new Intent();
            C77459z zVar = this.f206831j;
            intent.putExtra("ClkCustomIconCount", zVar != null ? zVar.f229408p : 0);
            C77459z zVar2 = this.f206831j;
            intent.putExtra("CustomTitleTooLongCount", zVar2 != null ? zVar2.f229409q : 0);
            setResult(0, intent);
        }
        super.finish();
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.ixf;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3e;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (z) {
            View view = this.f206813S0;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                View view2 = this.f206813S0;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            return;
        }
        View view3 = this.f206813S0;
        ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            View view4 = this.f206813S0;
            if (view4 != null) {
                view4.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        View view = this.f206813S0;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            mo98427P7();
        } else if (mo98424M7().f206686B) {
            this.f206806N = "userdefine";
            ImageView imageView = this.f206797E;
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) null);
            }
            MMEditText mMEditText = this.f206794B;
            if (mMEditText != null) {
                mMEditText.setText("");
            }
            C39691c.m42340S(mo98425N7(), this.f206797E, this.f206806N, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
            mo98424M7().mo98319c();
            hideVKB();
            mo98428Q7();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0434  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 109(0x6d, float:1.53E-43)
            r0.supportRequestWindowFeature(r1)
            super.onCreate(r23)
            r1 = 0
            r0.setActionbarColor(r1)
            android.view.Window r2 = r22.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r3)
            android.view.Window r2 = r22.getWindow()
            in3.C87773e.m109211d(r2)
            android.view.Window r2 = r22.getWindow()
            android.content.res.Resources r3 = r22.getResources()
            r4 = 2131099794(0x7f060092, float:1.7811951E38)
            int r3 = r3.getColor(r4)
            r2.setNavigationBarColor(r3)
            java.lang.String r2 = ""
            r0.setMMTitle((java.lang.String) r2)
            r22.hideActionbarLine()
            r22.hideActionBarOperationArea()
            androidx.appcompat.app.ActionBar r3 = r22.getSupportActionBar()
            if (r3 == 0) goto L_0x0048
            r3.mo91104o()
        L_0x0048:
            r3 = 2131312684(0x7f09402c, float:1.8243743E38)
            android.view.View r3 = r0.findViewById(r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r3
            r0.f206825d = r3
            r3 = 2131307096(0x7f092a58, float:1.823241E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.f206827f = r3
            b03.c r3 = r22.mo98425N7()
            boolean r3 = r3.mo62311w()
            r4 = 1
            if (r3 != 0) goto L_0x006b
            goto L_0x012a
        L_0x006b:
            di0.o r3 = new di0.o
            r3.<init>()
            java.lang.String r5 = r0.f206838s
            r3.f250930b = r5
            java.lang.String r5 = r0.f206840u
            r3.f250929a = r5
            java.lang.String r5 = r0.f206839t
            r3.f250934f = r5
            b03.c r5 = r22.mo98425N7()
            uz2.e1 r5 = r5.mo62290b()
            java.lang.String r6 = r5.f147102e
            java.lang.String r7 = "weapp_panel"
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            java.lang.String r7 = "MicroMsg.TextStatus.TextStatusDoWhatActivityV2"
            if (r6 != 0) goto L_0x00d6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "initEmojiPanel: error configId:"
            r6.append(r8)
            java.lang.String r8 = r5.f147102e
            r6.append(r8)
            r8 = 32
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            if (r6 == 0) goto L_0x00d6
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "config error ! configId:"
            r8.append(r9)
            java.lang.String r9 = r5.f147102e
            r8.append(r9)
            java.lang.String r9 = "  key:"
            r8.append(r9)
            long r9 = r5.f147101d
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            nj3.C76912y0.m92773l(r6, r8)
        L_0x00d6:
            java.util.LinkedList<uz2.d1> r6 = r5.f147104g
            if (r6 == 0) goto L_0x00e3
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r6 = 0
            goto L_0x00e4
        L_0x00e3:
            r6 = 1
        L_0x00e4:
            if (r6 == 0) goto L_0x00eb
            java.lang.String r6 = "initEmojiPanel: config.icons isNullOrEmpty "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
        L_0x00eb:
            yz2.h1 r6 = new yz2.h1
            r6.<init>(r5, r0)
            r3.f250937i = r6
            r3.f250931c = r1
            r5 = 1190(0x4a6, float:1.668E-42)
            r3.f250939k = r5
            r3.f250935g = r4
            eb0.C31543z5.m39453c()
            java.lang.Class<kr0.x0> r5 = kr0.C76630x0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kr0.x0 r5 = (kr0.C76630x0) r5
            kr0.m0 r5 = r5.mo106891XS(r0)
            r0.f206842w = r5
            if (r5 == 0) goto L_0x0112
            com.tencent.mm.plugin.appbrand.h2 r5 = (com.tencent.p014mm.plugin.appbrand.C81895h2) r5
            r5.mo114296i0(r3)
        L_0x0112:
            yz2.i1 r3 = new yz2.i1
            r3.<init>(r0)
            r0.f206841v = r3
            java.lang.Class<sm.t0> r3 = p235sm.C64053t0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sm.t0 r3 = (p235sm.C64053t0) r3
            java.lang.String r5 = r0.f206838s
            sm.t0$a r6 = r0.f206841v
            if (r6 == 0) goto L_0x0542
            r3.mo88810Bz(r5, r6)
        L_0x012a:
            android.view.ViewGroup r3 = r0.f206827f
            if (r3 == 0) goto L_0x0136
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$h r5 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$h
            r5.<init>(r0)
            r3.post(r5)
        L_0x0136:
            android.content.Intent r3 = r22.getIntent()
            java.lang.String r5 = "SET_TEXT_PARAMS"
            byte[] r3 = r3.getByteArrayExtra(r5)
            if (r3 == 0) goto L_0x014c
            qy2.z r5 = new qy2.z
            r5.<init>()
            r5.parseFrom(r3)
            r0.f206831j = r5
        L_0x014c:
            qy2.z r3 = r0.f206831j
            if (r3 != 0) goto L_0x0157
            qy2.z r3 = new qy2.z
            r3.<init>()
            r0.f206831j = r3
        L_0x0157:
            qy2.z r3 = r0.f206831j
            if (r3 != 0) goto L_0x015f
            r22.finish()
            return
        L_0x015f:
            android.content.Intent r5 = r22.getIntent()
            java.lang.String r6 = "KEY_CUSTOM_TITLE"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 != 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r5
        L_0x016d:
            r0.f206829h = r2
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r5 = "KEY_CLK_USER_DEFINE_ICON_COUNT"
            int r2 = r2.getIntExtra(r5, r1)
            r0.f206807P = r2
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r5 = "KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT"
            int r2 = r2.getIntExtra(r5, r1)
            r0.f206808Q = r2
            long r5 = eb0.C31543z5.m39453c()
            r3.f229405j = r5
            uz2.u r2 = r3.f229399d
            b03.p r5 = b03.C39718p.f106569a
            android.content.Intent r6 = r22.getIntent()
            int r7 = r5.mo62352c()
            java.lang.String r8 = "KEY_DEFAULT_BACKGROUND_ID"
            int r6 = r6.getIntExtra(r8, r7)
            java.lang.String r6 = r5.mo62350a(r6)
            r2.f147252x = r6
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r6 = "KEY_IS_ENTER"
            boolean r2 = r2.getBooleanExtra(r6, r1)
            r0.f206828g = r2
            uz2.u r2 = r3.f229399d
            java.lang.String r2 = r2.f147252x
            int r2 = r5.mo62351b(r2)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r2)
            android.view.ViewGroup r3 = r0.f206827f
            if (r3 != 0) goto L_0x01c2
            goto L_0x01ce
        L_0x01c2:
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r22.getResources()
            r5.<init>(r6, r2)
            r3.setBackground(r5)
        L_0x01ce:
            java.util.ArrayList<jq3.c> r2 = r0.f206823Y
            b03.c r3 = r22.mo98425N7()
            java.util.ArrayList r3 = r3.mo62296h()
            r2.addAll(r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f206825d
            if (r2 != 0) goto L_0x01e0
            goto L_0x01ef
        L_0x01e0:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$buildItemConverts$1 r5 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$buildItemConverts$1
            r5.<init>(r0)
            java.util.ArrayList<jq3.c> r6 = r0.f206823Y
            r3.<init>(r5, r6, r1)
            r2.setAdapter(r3)
        L_0x01ef:
            b03.c r2 = r22.mo98425N7()
            java.util.ArrayList r2 = r2.mo62295g()
            java.util.HashMap r2 = r0.mo98429R7(r2)
            r0.f206824Z = r2
            android.view.WindowManager r2 = r22.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getWidth()
            android.view.WindowManager r3 = r22.getWindowManager()
            android.view.Display r3 = r3.getDefaultDisplay()
            int r3 = r3.getHeight()
            int r2 = java.lang.Math.min(r2, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f206825d
            if (r3 == 0) goto L_0x0222
            int r3 = r3.getPaddingLeft()
            goto L_0x0223
        L_0x0222:
            r3 = 0
        L_0x0223:
            int r2 = r2 - r3
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f206825d
            if (r3 == 0) goto L_0x022d
            int r3 = r3.getPaddingRight()
            goto L_0x022e
        L_0x022d:
            r3 = 0
        L_0x022e:
            int r2 = r2 - r3
            android.content.res.Resources r3 = r22.getResources()
            r5 = 2131167244(0x7f07080c, float:1.7948756E38)
            float r3 = r3.getDimension(r5)
            gy3.c0 r5 = new gy3.c0
            r5.<init>()
            android.content.res.Resources r6 = r22.getResources()
            r7 = 2131167243(0x7f07080b, float:1.7948754E38)
            float r6 = r6.getDimension(r7)
            r5.f170634d = r6
            float r2 = (float) r2
            float r2 = r2 + r6
            float r3 = r3 + r6
            float r2 = r2 / r3
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            int r2 = (int) r2
            r6.<init>(r0, r2)
            r3.f27484d = r6
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$i r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$i
            r2.<init>(r0, r3)
            r6.f44666B = r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f206825d
            if (r2 != 0) goto L_0x0269
            goto L_0x0270
        L_0x0269:
            T r3 = r3.f27484d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r3
            r2.setLayoutManager(r3)
        L_0x0270:
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f206825d
            if (r2 == 0) goto L_0x027c
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$j r3 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$j
            r3.<init>(r5)
            r2.mo17085h0(r3)
        L_0x027c:
            androidx.appcompat.app.AppCompatActivity r2 = r22.getContext()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            r5 = 6
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r5)
            int r2 = r2 + r3
            android.view.View r3 = r22.mo98423L7()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r3, r6)
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r3.topMargin = r2
            android.view.View r3 = r22.mo98426O7()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            gy3.C87412m.m108592e(r3, r6)
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r3.topMargin = r2
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            r7 = 40
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r7)
            rx3.g r7 = r0.f206803K
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.String r8 = "<get-nestedBounceView>(...)"
            gy3.C87412m.m108593f(r7, r8)
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r7 = (com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView) r7
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            gy3.C87412m.m108592e(r7, r6)
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            r8 = 24
            int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r6, r8)
            int r2 = r2 + r6
            int r2 = r2 + r3
            r7.topMargin = r2
            rx3.g r2 = r0.f206804L
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r3 = "<get-tvTitle>(...)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextPaint r2 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r2)
            android.view.View r2 = r22.mo98423L7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$k r3 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$k
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            com.tencent.mm.plugin.textstatus.ui.CustomStatusView r2 = r22.mo98424M7()
            b03.c r3 = r22.mo98425N7()
            boolean r3 = r3.mo62311w()
            r6 = 8
            if (r3 != 0) goto L_0x0334
            b03.c r3 = r22.mo98425N7()
            boolean r3 = r3.mo62312x()
            if (r3 == 0) goto L_0x031b
            goto L_0x0334
        L_0x031b:
            b03.c r3 = r22.mo98425N7()
            boolean r3 = r3.mo62310v()
            if (r3 != 0) goto L_0x032f
            b03.c r3 = r22.mo98425N7()
            boolean r3 = r3.mo62272B()
            if (r3 == 0) goto L_0x0337
        L_0x032f:
            r2.setVisibility(r6)
            goto L_0x0406
        L_0x0334:
            r2.setVisibility(r1)
        L_0x0337:
            r3 = 2131300670(0x7f09113e, float:1.8219376E38)
            android.view.View r3 = r2.findViewById(r3)
            r0.f206795C = r3
            r3 = 2131301700(0x7f091544, float:1.8221465E38)
            android.view.View r3 = r2.findViewById(r3)
            com.tencent.mm.ui.widget.MMEditText r3 = (com.tencent.p014mm.p136ui.widget.MMEditText) r3
            r0.f206794B = r3
            r3 = 2131315704(0x7f094bf8, float:1.8249869E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 2131306732(0x7f0928ec, float:1.8231671E38)
            android.view.View r3 = r2.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r0.f206796D = r3
            r3 = 2131307080(0x7f092a48, float:1.8232377E38)
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3 = 2131306731(0x7f0928eb, float:1.823167E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f206797E = r3
            r3 = 2131314340(0x7f0946a4, float:1.8247102E38)
            android.view.View r3 = r2.findViewById(r3)
            r0.f206798F = r3
            r3 = 2131300674(0x7f091142, float:1.8219384E38)
            android.view.View r3 = r2.findViewById(r3)
            r0.f206799G = r3
            r3 = 2131315788(0x7f094c4c, float:1.825004E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f206800H = r3
            r22.mo98430S7()
            yz2.y0 r3 = new yz2.y0
            r3.<init>(r0)
            r2.setExpandListener(r3)
            yz2.z0 r3 = new yz2.z0
            r3.<init>(r0)
            r2.setFoldListener(r3)
            yz2.a1 r3 = new yz2.a1
            r3.<init>(r0)
            r2.setHideEmojiPanelListener(r3)
            yz2.b1 r3 = new yz2.b1
            r3.<init>(r0)
            r2.setConfirmListener(r3)
            android.widget.TextView r3 = r0.f206800H
            if (r3 == 0) goto L_0x03bf
            yz2.c1 r7 = new yz2.c1
            r7.<init>(r0)
            r3.setOnClickListener(r7)
        L_0x03bf:
            r3 = 2131315687(0x7f094be7, float:1.8249834E38)
            android.view.View r3 = r2.findViewById(r3)
            r0.f206801I = r3
            if (r3 == 0) goto L_0x03d2
            yz2.d1 r7 = new yz2.d1
            r7.<init>(r0)
            r3.setOnClickListener(r7)
        L_0x03d2:
            android.view.View r3 = r0.f206798F
            if (r3 == 0) goto L_0x03de
            yz2.e1 r7 = new yz2.e1
            r7.<init>(r2, r0)
            r3.setOnClickListener(r7)
        L_0x03de:
            yz2.f1 r3 = new yz2.f1
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            com.tencent.mm.ui.widget.MMEditText r2 = r0.f206794B
            if (r2 == 0) goto L_0x03f2
            yz2.g1 r3 = new yz2.g1
            r3.<init>(r0)
            r2.setOnClickListener(r3)
        L_0x03f2:
            com.tencent.mm.ui.widget.MMEditText r2 = r0.f206794B
            if (r2 != 0) goto L_0x03f7
            goto L_0x03fa
        L_0x03f7:
            r2.setImeOptions(r5)
        L_0x03fa:
            com.tencent.mm.ui.widget.MMEditText r2 = r0.f206794B
            if (r2 == 0) goto L_0x0406
            yz2.x0 r3 = new yz2.x0
            r3.<init>(r0)
            r2.setOnEditorActionListener(r3)
        L_0x0406:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_EDUCATION_FLAG_INT
            int r2 = r2.mo119689j(r3, r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            if (r2 != r4) goto L_0x041c
            r2 = 1
            goto L_0x041d
        L_0x041c:
            r2 = 0
        L_0x041d:
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN
            boolean r7 = r7.mo119686g(r8, r1)
            if (r2 == 0) goto L_0x0524
            if (r7 != 0) goto L_0x0524
            qy2.z r2 = r0.f206831j
            if (r2 != 0) goto L_0x0434
            goto L_0x0436
        L_0x0434:
            r2.f229406n = r4
        L_0x0436:
            r2 = 2131301377(0x7f091401, float:1.822081E38)
            android.view.View r2 = r0.findViewById(r2)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r4.mo10233c(r5)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r10 = "showEducationLayout"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = r4.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r9 = "showEducationLayout"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f206825d
            if (r2 != 0) goto L_0x047c
            goto L_0x047f
        L_0x047c:
            r2.setVisibility(r6)
        L_0x047f:
            com.tencent.mm.plugin.textstatus.ui.CustomStatusView r2 = r22.mo98424M7()
            r2.setVisibility(r6)
            android.view.View r2 = r22.mo98426O7()
            r4 = 4
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r4)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r10 = "showEducationLayout"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = r15.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r9 = "showEducationLayout"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r2 = r22.mo98423L7()
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r6)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r17 = "showEducationLayout"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r4.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2"
            java.lang.String r16 = "showEducationLayout"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            qy2.C77448f0.m93396h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r1.mo119677K(r3, r5)
            r1 = 2131301375(0x7f0913ff, float:1.8220806E38)
            android.view.View r1 = r0.findViewById(r1)
            yz2.m1 r2 = new yz2.m1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0524:
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$configUpdateListener$1 r1 = r0.f206822X
            r1.alive()
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1 r1 = r0.f206820W
            r1.alive()
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            o31.b r2 = o31.C11345b.TextStatusDoWhatActivity
            l31.e r1 = r1.mo86178qr(r0, r2)
            o31.a r2 = o31.C76986a.TextState
            r1.mo86179qs(r0, r2)
            return
        L_0x0542:
            java.lang.String r1 = "weAppDataCallback"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C76628m0 m0Var = this.f206842w;
        if (m0Var != null) {
            ((C81895h2) m0Var).mo114293g0();
        }
        if (this.f206841v != null) {
            C64053t0 t0Var = (C64053t0) C86312j.m106911c(C64053t0.class);
            String str = this.f206838s;
            C64053t0.C13730a aVar = this.f206841v;
            if (aVar != null) {
                t0Var.mo88812eW(str, aVar);
            } else {
                C87412m.m108603p("weAppDataCallback");
                throw null;
            }
        }
        this.f206822X.dead();
        this.f206820W.dead();
        if (this.f206810R && this.f206832n) {
            IStatusIconHelperKt.m39109a().mo62308t();
        }
    }

    public void onPause() {
        super.onPause();
        C76628m0 m0Var = this.f206842w;
        if (m0Var != null) {
            ((C81812e1) m0Var).mo114188A();
        }
    }

    public void onResume() {
        super.onResume();
        C76628m0 m0Var = this.f206842w;
        if (m0Var != null) {
            ((C81812e1) m0Var).mo114189C();
        }
    }

    public void showVKB() {
        super.showVKB();
    }
}

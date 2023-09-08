package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import af0.C16458b;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bf0.C16793a;
import bf0.C16794b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.base.HorizontalListViewV2;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyMyRecordUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C86497v5;
import f40.C86709a0;
import f62.C75707s0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C35136m;
import p196ln.C76706g;
import p200lx.C76736w;
import q32.C77299a;
import q32.C77300b;
import q32.C77301c;
import qo3.C77407n;
import r32.C47921a;
import r32.C47922b;
import r32.C47924e;
import s32.C110719a;
import s32.C110720d;
import s32.C13618c;
import s32.C13619e;
import s32.C22294b;
import s32.C22295i;
import sf0.C48374j0;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI */
public class LuckyMoneyF2FQRCodeUI extends LuckyMoneyBaseUI implements ScreenShotUtil.ScreenShotCallback {

    /* renamed from: b1 */
    public static final /* synthetic */ int f53003b1 = 0;

    /* renamed from: A */
    public List<View> f53004A;

    /* renamed from: B */
    public C77407n f53005B;

    /* renamed from: C */
    public ViewGroup f53006C;

    /* renamed from: D */
    public ViewGroup f53007D;

    /* renamed from: E */
    public View f53008E;

    /* renamed from: F */
    public String f53009F;

    /* renamed from: G */
    public MTimerHandler f53010G;

    /* renamed from: H */
    public C77301c f53011H;

    /* renamed from: I */
    public String f53012I;

    /* renamed from: J */
    public int f53013J;

    /* renamed from: K */
    public long f53014K;

    /* renamed from: L */
    public String f53015L;

    /* renamed from: M */
    public ValueAnimator f53016M;

    /* renamed from: N */
    public float f53017N;

    /* renamed from: P */
    public float f53018P;

    /* renamed from: Q */
    public DisplayMetrics f53019Q;

    /* renamed from: Q0 */
    public Bitmap f53020Q0;

    /* renamed from: R */
    public String f53021R;

    /* renamed from: R0 */
    public Bitmap f53022R0;

    /* renamed from: S */
    public String f53023S;

    /* renamed from: S0 */
    public Bitmap f53024S0;

    /* renamed from: T */
    public SensorManager f53025T;

    /* renamed from: T0 */
    public Bitmap f53026T0;

    /* renamed from: U */
    public float f53027U;

    /* renamed from: U0 */
    public Bitmap f53028U0;

    /* renamed from: V */
    public int[] f53029V;

    /* renamed from: V0 */
    public Bitmap f53030V0;

    /* renamed from: W */
    public C86497v5.C86498c f53031W = new C18905a();

    /* renamed from: W0 */
    public Bitmap f53032W0;

    /* renamed from: X */
    public C11182m0 f53033X = new C4828c();

    /* renamed from: X0 */
    public Bitmap f53034X0;

    /* renamed from: Y */
    public C11184p0 f53035Y = new C4829d();

    /* renamed from: Y0 */
    public C16458b f53036Y0 = new C18900e();

    /* renamed from: Z */
    public Bitmap f53037Z;

    /* renamed from: Z0 */
    public C16458b f53038Z0 = new C18901f();

    /* renamed from: a1 */
    public final SensorEventListener f53039a1 = new C18907b();

    /* renamed from: g */
    public View f53040g;

    /* renamed from: h */
    public View f53041h;

    /* renamed from: i */
    public View f53042i;

    /* renamed from: j */
    public ImageView f53043j;

    /* renamed from: n */
    public TextView f53044n;

    /* renamed from: o */
    public TextView f53045o;

    /* renamed from: p */
    public ImageView f53046p;

    /* renamed from: p0 */
    public Bitmap f53047p0;

    /* renamed from: q */
    public TextView f53048q;

    /* renamed from: r */
    public TextView f53049r;

    /* renamed from: s */
    public HorizontalListViewV2 f53050s;

    /* renamed from: t */
    public List<String> f53051t;

    /* renamed from: u */
    public Map<String, String> f53052u;

    /* renamed from: v */
    public Queue<Pair<String, Integer>> f53053v;

    /* renamed from: w */
    public C18903h f53054w;

    /* renamed from: x */
    public TextView f53055x;

    /* renamed from: x0 */
    public Bitmap f53056x0;

    /* renamed from: y */
    public Button f53057y;

    /* renamed from: y0 */
    public Bitmap f53058y0;

    /* renamed from: z */
    public ShuffleView f53059z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$c */
    public class C4828c implements C11182m0 {
        public C4828c() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (Util.isNullOrNil(LuckyMoneyF2FQRCodeUI.this.f53023S)) {
                e0Var.mo107125a(1, C0966R.string.gg7);
            } else {
                e0Var.mo107154n(1, LuckyMoneyF2FQRCodeUI.this.getString(C0966R.string.gg7), LuckyMoneyF2FQRCodeUI.this.f53023S, 0);
            }
            e0Var.mo107142f(2, LuckyMoneyF2FQRCodeUI.this.getString(C0966R.string.gf4));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$d */
    public class C4829d implements C11184p0 {
        public C4829d() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI.f53013J > 0) {
                    luckyMoneyF2FQRCodeUI.doSceneProgress(new C47921a(luckyMoneyF2FQRCodeUI.f53009F), false);
                } else {
                    C76879j.m92726T(luckyMoneyF2FQRCodeUI, luckyMoneyF2FQRCodeUI.getString(C0966R.string.gg8));
                }
            } else if (itemId == 2) {
                Intent intent = new Intent();
                intent.setClass(LuckyMoneyF2FQRCodeUI.this.getContext(), LuckyMoneyMyRecordUI.class);
                intent.putExtra("key_type", 2);
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = LuckyMoneyF2FQRCodeUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI3 = luckyMoneyF2FQRCodeUI2;
                C117292a.m165358d(luckyMoneyF2FQRCodeUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyF2FQRCodeUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyF2FQRCodeUI3, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$e */
    public class C18900e implements C16458b {
        public C18900e() {
        }

        /* renamed from: a */
        public C16794b mo14934a(Random random) {
            int nextInt = random.nextInt(100);
            if (nextInt < 16) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI.f53058y0 == null) {
                    luckyMoneyF2FQRCodeUI.f53058y0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI, C0966R.C0969drawable.c6l, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53058y0);
            } else if (nextInt < 33) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI2.f53020Q0 == null) {
                    luckyMoneyF2FQRCodeUI2.f53020Q0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI2, C0966R.C0969drawable.c6m, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53020Q0);
            } else if (nextInt < 50) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI3 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI3.f53022R0 == null) {
                    luckyMoneyF2FQRCodeUI3.f53022R0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI3, C0966R.C0969drawable.c6n, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53022R0);
            } else if (nextInt < 70) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI4 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI4.f53037Z == null) {
                    luckyMoneyF2FQRCodeUI4.f53037Z = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI4, C0966R.C0969drawable.c6g, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53037Z);
            } else if (nextInt < 90) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI5 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI5.f53047p0 == null) {
                    luckyMoneyF2FQRCodeUI5.f53047p0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI5, C0966R.C0969drawable.c6h, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53047p0);
            } else {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI6 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI6.f53056x0 == null) {
                    luckyMoneyF2FQRCodeUI6.f53056x0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI6, C0966R.C0969drawable.c6i, 36);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53056x0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$f */
    public class C18901f implements C16458b {
        public C18901f() {
        }

        /* renamed from: a */
        public C16794b mo14934a(Random random) {
            int nextInt = random.nextInt(100);
            if (nextInt < 10) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI.f53030V0 == null) {
                    luckyMoneyF2FQRCodeUI.f53030V0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI, C0966R.C0969drawable.c6l, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53030V0);
            } else if (nextInt < 20) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI2.f53032W0 == null) {
                    luckyMoneyF2FQRCodeUI2.f53032W0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI2, C0966R.C0969drawable.c6m, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53032W0);
            } else if (nextInt < 30) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI3 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI3.f53034X0 == null) {
                    luckyMoneyF2FQRCodeUI3.f53034X0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI3, C0966R.C0969drawable.c6n, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53034X0);
            } else if (nextInt < 50) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI4 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI4.f53024S0 == null) {
                    luckyMoneyF2FQRCodeUI4.f53024S0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI4, C0966R.C0969drawable.c6g, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53024S0);
            } else if (nextInt < 75) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI5 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI5.f53026T0 == null) {
                    luckyMoneyF2FQRCodeUI5.f53026T0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI5, C0966R.C0969drawable.c6h, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53026T0);
            } else {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI6 = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI6.f53028U0 == null) {
                    luckyMoneyF2FQRCodeUI6.f53028U0 = LuckyMoneyF2FQRCodeUI.m19853J7(luckyMoneyF2FQRCodeUI6, C0966R.C0969drawable.c6i, 32);
                }
                return new C16793a(LuckyMoneyF2FQRCodeUI.this.f53028U0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$g */
    public class C18902g implements MTimerHandler.CallBack {
        public C18902g() {
        }

        public boolean onTimerExpired() {
            LuckyMoneyF2FQRCodeUI.this.doSceneProgress(new C47924e(), false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h */
    public class C18903h extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h$a */
        public class C18904a {

            /* renamed from: a */
            public ImageView f53064a;

            /* renamed from: b */
            public ImageView f53065b;

            public C18904a(C18903h hVar) {
            }
        }

        public C18903h(C18905a aVar) {
        }

        public int getCount() {
            return ((ArrayList) LuckyMoneyF2FQRCodeUI.this.f53051t).size();
        }

        public Object getItem(int i) {
            return (String) ((ArrayList) LuckyMoneyF2FQRCodeUI.this.f53051t).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            /*
                r3 = this;
                r6 = 0
                if (r5 != 0) goto L_0x002f
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI r5 = com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.this
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r0 = 2131496374(0x7f0c0db6, float:1.8616311E38)
                android.view.View r5 = r5.inflate(r0, r6)
                r0 = 2131308595(0x7f093033, float:1.823545E38)
                android.view.View r0 = r5.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1 = 2131308588(0x7f09302c, float:1.8235436E38)
                android.view.View r1 = r5.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h$a r2 = new com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h$a
                r2.<init>(r3)
                r2.f53064a = r0
                r2.f53065b = r1
                r5.setTag(r2)
                goto L_0x0036
            L_0x002f:
                java.lang.Object r0 = r5.getTag()
                r2 = r0
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$h$a r2 = (com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.C18903h.C18904a) r2
            L_0x0036:
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI r0 = com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.this
                java.util.Map<java.lang.String, java.lang.String> r1 = r0.f53052u
                java.util.List<java.lang.String> r0 = r0.f53051t
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.lang.Object r4 = r0.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r4 = r1.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                android.widget.ImageView r0 = r2.f53064a
                com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81595a(r0, r6, r4)
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI r6 = com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.this
                java.lang.String r6 = r6.f53015L
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x006c
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI r6 = com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.this
                java.lang.String r6 = r6.f53015L
                boolean r4 = r6.equals(r4)
                if (r4 == 0) goto L_0x006c
                android.widget.ImageView r4 = r2.f53065b
                r6 = 0
                r4.setVisibility(r6)
                goto L_0x0072
            L_0x006c:
                android.widget.ImageView r4 = r2.f53065b
                r6 = 4
                r4.setVisibility(r6)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI.C18903h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$a */
    public class C18905a implements C86497v5.C86498c {

        /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$a$a */
        public class C18906a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f53067d;

            /* renamed from: e */
            public final /* synthetic */ String f53068e;

            /* renamed from: f */
            public final /* synthetic */ String f53069f;

            public C18906a(String str, String str2, String str3) {
                this.f53067d = str;
                this.f53068e = str2;
                this.f53069f = str3;
            }

            public void run() {
                if (!((ArrayList) LuckyMoneyF2FQRCodeUI.this.f53051t).contains(this.f53067d)) {
                    ((ArrayList) LuckyMoneyF2FQRCodeUI.this.f53051t).add(0, this.f53067d);
                    if (!C45628s0.m50740E(this.f53068e)) {
                        C68097n nVar = new C68097n();
                        nVar.f195728a = this.f53068e;
                        ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                    }
                    ((HashMap) LuckyMoneyF2FQRCodeUI.this.f53052u).put(this.f53067d, this.f53068e);
                    ShuffleView shuffleView = LuckyMoneyF2FQRCodeUI.this.f53059z;
                    if (((ArrayList) shuffleView.f53082d).size() > 0) {
                        if (shuffleView.f53087i.isStarted()) {
                            shuffleView.f53087i.end();
                        }
                        if (shuffleView.f53086h.isStarted()) {
                            shuffleView.f53086h.end();
                        }
                        View view = shuffleView.f53093r;
                        if (view != null) {
                            shuffleView.f53091p = view;
                            ((ArrayList) shuffleView.f53082d).remove(view);
                            ValueAnimator valueAnimator = shuffleView.f53084f;
                            if (valueAnimator != null) {
                                valueAnimator.start();
                            }
                            shuffleView.mo23922i(shuffleView.f53094s);
                            if (shuffleView.f53097v > 0) {
                                int random = (int) (Math.random() * ((double) shuffleView.f53097v));
                                shuffleView.f53094s = random;
                                shuffleView.f53093r = (View) ((ArrayList) shuffleView.f53082d).get(random);
                            } else {
                                shuffleView.f53093r = null;
                                shuffleView.f53094s = 0;
                            }
                        } else {
                            shuffleView.mo23923j((int) (Math.random() * ((double) shuffleView.f53097v)));
                            shuffleView.f53091p = shuffleView.f53093r;
                            shuffleView.f53087i.addListener(new C22295i(shuffleView));
                        }
                    }
                    LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                    ((ArrayList) luckyMoneyF2FQRCodeUI.f53004A).remove(luckyMoneyF2FQRCodeUI.f53059z.getExitView());
                    LuckyMoneyF2FQRCodeUI.this.f53010G.startTimer(0, 60000);
                    ((LinkedList) LuckyMoneyF2FQRCodeUI.this.f53053v).add(new Pair(this.f53068e, Integer.valueOf(Util.getInt(this.f53069f, 0))));
                }
            }
        }

        public C18905a() {
        }

        /* renamed from: C1 */
        public void mo23909C1(C35136m.C35138c cVar) {
        }

        /* renamed from: Y */
        public void mo23910Y(C35136m.C35137a aVar) {
            Map<String, String> parseXml = XmlParser.parseXml(C48374j0.m53718g(aVar.f94242a.f227631h), "sysmsg", (String) null);
            if (parseXml != null) {
                String str = parseXml.get(".sysmsg.sendId");
                String str2 = parseXml.get(".sysmsg.username");
                String str3 = parseXml.get(".sysmsg.amount");
                String str4 = parseXml.get(".sysmsg.receiveId");
                if (Util.getInt(parseXml.get(".sysmsg.islucky"), 0) > 0) {
                    LuckyMoneyF2FQRCodeUI.this.f53015L = str2;
                }
                if (!Util.isNullOrNil(str, str2, str3)) {
                    LuckyMoneyF2FQRCodeUI.this.runOnUiThread(new C18906a(str4, str2, str3));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$b */
    public class C18907b implements SensorEventListener {

        /* renamed from: d */
        public float f53071d = ((float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3913iq));

        /* renamed from: e */
        public int f53072e;

        /* renamed from: f */
        public float f53073f;

        /* renamed from: g */
        public ValueAnimator f53074g;

        /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI$b$a */
        public class C18908a implements ValueAnimator.AnimatorUpdateListener {
            public C18908a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = LuckyMoneyF2FQRCodeUI.this.f53040g;
                view.setPadding(view.getPaddingLeft(), (int) floatValue, LuckyMoneyF2FQRCodeUI.this.f53040g.getPaddingRight(), LuckyMoneyF2FQRCodeUI.this.f53040g.getPaddingBottom());
                C18907b bVar = C18907b.this;
                float f = floatValue / ((float) bVar.f53072e);
                if (f <= 1.0f) {
                    LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                    luckyMoneyF2FQRCodeUI.f53048q.setAlpha((1.0f - f) + luckyMoneyF2FQRCodeUI.f53027U);
                    LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = LuckyMoneyF2FQRCodeUI.this;
                    luckyMoneyF2FQRCodeUI2.f53049r.setAlpha(f * luckyMoneyF2FQRCodeUI2.f53027U);
                    return;
                }
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI3 = LuckyMoneyF2FQRCodeUI.this;
                luckyMoneyF2FQRCodeUI3.f53048q.setAlpha(luckyMoneyF2FQRCodeUI3.f53027U);
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI4 = LuckyMoneyF2FQRCodeUI.this;
                luckyMoneyF2FQRCodeUI4.f53049r.setAlpha(luckyMoneyF2FQRCodeUI4.f53027U);
            }
        }

        public C18907b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.m105924i("LuckyMoneyF2FQRCodeUI", "onAccuracyChanged");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = LuckyMoneyF2FQRCodeUI.this;
                if (luckyMoneyF2FQRCodeUI.f53013J > 0) {
                    if (this.f53072e == 0) {
                        this.f53072e = C78538u.m94865a(luckyMoneyF2FQRCodeUI) + ((int) this.f53071d);
                    }
                    float f = sensorEvent.values[1];
                    if (((double) Math.abs(f - this.f53073f)) >= 0.05d) {
                        this.f53073f = f;
                        Log.m105919d("LuckyMoneyF2FQRCodeUI", "[onSensorChanged] y:%s ", Float.valueOf(f));
                        if (f < -3.0f) {
                            f = -3.0f;
                        } else if (f > 0.0f) {
                            f = 0.0f;
                        }
                        int i = this.f53072e;
                        float f2 = ((f / 3.0f) * ((float) i)) + ((float) i);
                        Log.m105919d("LuckyMoneyF2FQRCodeUI", "paddingTop:%s nowPaddingTop:%s", Float.valueOf(f2), Integer.valueOf(LuckyMoneyF2FQRCodeUI.this.f53040g.getPaddingTop()));
                        ValueAnimator valueAnimator = this.f53074g;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{(float) LuckyMoneyF2FQRCodeUI.this.f53040g.getPaddingTop(), f2}).setDuration(200);
                        this.f53074g = duration;
                        duration.addUpdateListener(new C18908a());
                        this.f53074g.start();
                    }
                }
            }
        }
    }

    /* renamed from: J7 */
    public static Bitmap m19853J7(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI, int i, int i2) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(luckyMoneyF2FQRCodeUI.getResources(), i), i2, i2, false);
    }

    /* renamed from: K7 */
    public final void mo23902K7() {
        int width = this.f53050s.getWidth() - (this.f53051t.size() * getResources().getDimensionPixelSize(C0966R.dimen.f3624h));
        if (width > 0) {
            int i = width / 2;
            this.f53050s.setPadding(i, 0, i, 0);
            return;
        }
        this.f53050s.setPadding(0, 0, 0, 0);
    }

    /* renamed from: L7 */
    public final void mo23903L7() {
        if (!Util.isNullOrNil(this.f53012I)) {
            this.f53046p.setImageBitmap(((C76736w) C86312j.m106911c(C76736w.class)).mo106916zO(this, this.f53012I, 1, -3041484, -2598591));
        }
        if (this.f53013J <= 0) {
            this.f53046p.setPadding(C76577a.m92151b(this, 5), C76577a.m92151b(this, 5), C76577a.m92151b(this, 5), C76577a.m92151b(this, 5));
            this.f53046p.setImageResource(C0966R.C0969drawable.c6f);
            this.f53055x.setVisibility(8);
            this.f53057y.setVisibility(0);
            this.f53048q.setVisibility(4);
            View view = this.f53040g;
            view.setPadding(view.getPaddingLeft(), C78538u.m94865a(this), this.f53040g.getPaddingRight(), this.f53040g.getPaddingBottom());
            if (((ArrayList) this.f53051t).size() > 0) {
                this.f53049r.setText(getString(C0966R.string.ggb));
            } else {
                this.f53049r.setText(getString(C0966R.string.ggc));
            }
        } else {
            this.f53046p.setPadding(0, 0, 0, 0);
            this.f53048q.setText(getString(C0966R.string.ggh));
            this.f53048q.setVisibility(0);
            this.f53049r.setText(getString(C0966R.string.ggh));
            this.f53055x.setText(getString(C0966R.string.ggg, new Object[]{Integer.valueOf(this.f53013J)}));
            this.f53055x.setVisibility(0);
            this.f53057y.setVisibility(8);
        }
    }

    /* renamed from: M7 */
    public final void mo23904M7() {
        if (this.f53004A.size() != this.f53013J) {
            Log.m105925i("LuckyMoneyF2FQRCodeUI", "shuffle cards: %d", Integer.valueOf(this.f53004A.size()), Integer.valueOf(this.f53013J));
            this.f53004A.clear();
            for (int i = 0; i < this.f53013J; i++) {
                View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b9p, this.f53059z, false);
                ((FrameLayout.LayoutParams) inflate.getLayoutParams()).gravity = 81;
                this.f53004A.add(inflate);
            }
            this.f53059z.setAllShuffleCards(this.f53004A);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9q;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53019Q = getResources().getDisplayMetrics();
        this.f53051t = new ArrayList();
        this.f53052u = new HashMap();
        this.f53053v = new LinkedList();
        this.f53004A = new ArrayList();
        int[] iArr = new int[6];
        this.f53029V = iArr;
        iArr[0] = iArr[0] + 1;
        this.f53010G = new MTimerHandler(new C18902g(), true);
        this.f53041h = findViewById(C0966R.C0970id.gf8);
        this.f53040g = findViewById(C0966R.C0970id.lpm);
        this.f53049r = (TextView) findViewById(C0966R.C0970id.gf4);
        this.f53048q = (TextView) findViewById(C0966R.C0970id.gf5);
        this.f53027U = this.f53049r.getAlpha();
        this.f53046p = (ImageView) this.f53041h.findViewById(C0966R.C0970id.f358677gf3);
        this.f53050s = (HorizontalListViewV2) findViewById(C0966R.C0970id.gf6);
        C18903h hVar = new C18903h((C18905a) null);
        this.f53054w = hVar;
        this.f53050s.setAdapter((ListAdapter) hVar);
        this.f53050s.setOnItemClickListener(new C13618c(this));
        this.f53050s.setOnScrollStateChangedListener(new C110720d(this));
        Button button = (Button) findViewById(C0966R.C0970id.f358676gf2);
        this.f53057y = button;
        button.setOnClickListener(new C13619e(this));
        this.f53055x = (TextView) findViewById(C0966R.C0970id.gf_);
        this.f53042i = findViewById(C0966R.C0970id.gf9);
        setBackBtn(new C110719a(this));
        setMMTitle(getString(C0966R.string.ggj));
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C22294b(this));
        setActionbarColor(getResources().getColor(C0966R.color.a2o));
        hideActionbarLine();
        this.f53006C = (ViewGroup) findViewById(C0966R.C0970id.gex);
        this.f53007D = (ViewGroup) findViewById(C0966R.C0970id.gew);
        View findViewById = findViewById(C0966R.C0970id.gez);
        this.f53008E = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
        this.f53025T = sensorManager;
        sensorManager.registerListener(this.f53039a1, sensorManager.getDefaultSensor(1), 3);
        this.f53011H = new C77301c(2, 3);
        ShuffleView shuffleView = (ShuffleView) findViewById(C0966R.C0970id.gfa);
        this.f53059z = shuffleView;
        ShuffleView.C18918n nVar = new ShuffleView.C18918n();
        nVar.f53116c = 4;
        nVar.f53114a = 2;
        nVar.f53115b = 4;
        nVar.f53118e = 300;
        nVar.f53117d = 0.0f;
        shuffleView.setShuffleSetting(nVar);
        ShuffleView.f53077E = this.f53019Q;
        this.f53059z.setExitAnimator(ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(300));
        this.f53059z.setExitAnimatorListener(new C18923a(this));
        this.f53059z.setCardListener(new C18924b(this));
        HashSet hashSet = new HashSet();
        hashSet.add("touch_card.m4a");
        hashSet.add("select_card.m4a");
        for (int i = 1; i <= 8; i++) {
            hashSet.add("music" + i + ".m4a");
        }
        hashSet.add("packet_received.m4a");
        hashSet.add("most_lucky.m4a");
        hashSet.add("whistle.m4a");
        C77301c cVar = this.f53011H;
        cVar.getClass();
        C86709a0.m107525e().postToWorker(new C77299a(cVar, hashSet, new WeakReference(this)));
        cVar.f225418a.setOnLoadCompleteListener(new C77300b(cVar));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f53016M = ofFloat;
        ofFloat.setDuration(300);
        this.f53016M.setStartDelay(3000);
        this.f53016M.addUpdateListener(new C105450c(this));
        mo23903L7();
        getWindow().addFlags(128);
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
    }

    public void onDestroy() {
        C115669n.INSTANCE.mo160131h(14007, Integer.valueOf(this.f53029V[0]), Integer.valueOf(this.f53029V[1]), Integer.valueOf(this.f53029V[2]), Integer.valueOf(this.f53029V[3]), Integer.valueOf(this.f53029V[4]), Integer.valueOf(this.f53029V[5]));
        C77301c cVar = this.f53011H;
        cVar.f225421d = true;
        cVar.f225418a.release();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f53025T;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f53039a1);
        }
    }

    public void onResume() {
        super.onResume();
        doSceneProgress(new C47924e(), true);
        this.f53010G.startTimer(60000);
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120968d("ffopenwxhb", this.f53031W, true);
        addSceneEndListener(1990);
        addSceneEndListener(1987);
        addSceneEndListener(1971);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        ScreenShotUtil.setScreenShotCallback(this, this);
        SensorManager sensorManager = this.f53025T;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f53039a1, sensorManager.getDefaultSensor(1), 3);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("LuckyMoneyF2FQRCodeUI", "errType: %d,errCode: %d,errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C47924e) {
                Log.m105918d("LuckyMoneyF2FQRCodeUI", "sendId:" + this.f53009F);
                C47924e eVar = (C47924e) yVar;
                if (!Util.isNullOrNil(this.f53009F, eVar.f128607g) && !this.f53009F.equals(eVar.f128607g)) {
                    ((ArrayList) this.f53051t).clear();
                    ((HashMap) this.f53052u).clear();
                    ((LinkedList) this.f53053v).clear();
                    this.f53054w.notifyDataSetChanged();
                    this.f53015L = "";
                }
                if (!Util.isNullOrNil(eVar.f128607g)) {
                    this.f53009F = eVar.f128607g;
                }
                this.f53012I = eVar.f128608h;
                this.f53013J = eVar.f128611n;
                this.f53021R = eVar.f128610j;
                this.f53023S = eVar.f128609i;
                mo23903L7();
                mo23904M7();
                if (this.f53013J == 0) {
                    this.f53010G.stopTimer();
                }
                if (((ArrayList) this.f53051t).size() == 0 && !Util.isNullOrNil(this.f53009F)) {
                    doSceneProgress(new C69267u1(this.f53009F, 5, 0, (String) null, "v1.0"), false);
                }
            } else if (yVar instanceof C47921a) {
                this.f53009F = "";
                this.f53012I = "";
                this.f53013J = 0;
                ((ArrayList) this.f53051t).clear();
                this.f53015L = "";
                this.f53054w.notifyDataSetChanged();
                mo23903L7();
                mo23904M7();
                this.f53010G.stopTimer();
                if (!Util.isNullOrNil(this.f53021R)) {
                    C76879j.m92726T(this, this.f53021R);
                }
                this.f53023S = "";
            } else if (yVar instanceof C69267u1) {
                C69158a0 a0Var = ((C69267u1) yVar).f199337h;
                this.f53014K = a0Var.f198975r;
                LinkedList<C69236j1> linkedList = a0Var.f198951M;
                if (linkedList != null && linkedList.size() > 0) {
                    for (int i3 = 0; i3 < linkedList.size(); i3++) {
                        C69236j1 j1Var = linkedList.get(i3);
                        if (!Util.isNullOrNil(j1Var.f199217i)) {
                            if (!((ArrayList) this.f53051t).contains(j1Var.f199217i)) {
                                ((ArrayList) this.f53051t).add(j1Var.f199217i);
                                String str2 = j1Var.f199219n;
                                if (!Util.isNullOrNil(j1Var.f199218j)) {
                                    this.f53015L = str2;
                                }
                                ((HashMap) this.f53052u).put(j1Var.f199217i, str2);
                            }
                        }
                    }
                    mo23902K7();
                    this.f53054w.notifyDataSetChanged();
                }
            } else if (yVar instanceof C47922b) {
                Log.m105924i("LuckyMoneyF2FQRCodeUI", "onSceneEnd NetSceneF2FLuckyMoneyInvalid");
                C47922b bVar = (C47922b) yVar;
                int i4 = bVar.f128595g;
                String str3 = bVar.f128596h;
                Log.m105925i("LuckyMoneyF2FQRCodeUI", "retcode:%d", Integer.valueOf(i), Integer.valueOf(i2), str);
            }
        } else if (!Util.isNullOrNil(str)) {
            C76879j.m92748s(this, str, getString(C0966R.string.a3h));
        }
        return true;
    }

    public void onScreenShot(String str, long j) {
        Log.m105924i("LuckyMoneyF2FQRCodeUI", "screenShot");
        if (this.f53013J > 0) {
            String str2 = this.f53012I;
            Log.m105924i("LuckyMoneyF2FQRCodeUI", "invalidQRCode");
            doSceneProgress(new C47922b(str2), false);
            Log.m105924i("LuckyMoneyF2FQRCodeUI", "getQRCode");
            doSceneProgress(new C47924e(), false);
            mo23903L7();
            int[] iArr = this.f53029V;
            iArr[1] = iArr[1] + 1;
            C76879j.m92748s(this, getString(C0966R.string.ggi), (String) null);
        }
    }

    public void onStop() {
        super.onStop();
        this.f53010G.stopTimer();
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120966D("ffopenwxhb", this.f53031W, true);
        removeSceneEndListener(1990);
        removeSceneEndListener(1987);
        removeSceneEndListener(1971);
        ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
    }
}

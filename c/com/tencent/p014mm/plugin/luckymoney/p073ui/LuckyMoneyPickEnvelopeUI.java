package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.luckymoney.model.C42511a;
import com.tencent.p014mm.plugin.luckymoney.model.C42512b;
import com.tencent.p014mm.plugin.luckymoney.model.C42513c;
import com.tencent.p014mm.plugin.luckymoney.model.C42516e;
import com.tencent.p014mm.plugin.luckymoney.model.C42519p;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.luckymoney.model.C69207e0;
import com.tencent.p014mm.plugin.luckymoney.model.C69217g0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyEnvelopeTouchRecyclerView;
import com.tencent.p014mm.plugin.luckymoney.scaledLayout.C56850a;
import com.tencent.p014mm.plugin.luckymoney.scaledLayout.ScaleLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUPwdConfirmUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import eb0.C75592q0;
import f32.C75672b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hp3.C87581a;
import ir3.C76371a;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C9506m;
import jq3.C9507n;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import nr3.C89059e;
import ob0.C89132b;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C77407n;
import te3.C51758vz;
import te3.C77994sf2;
import te3.C77999tf2;
import te3.C78007w82;
import zo3.C79405a;
import zt3.C119157j;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI */
public class LuckyMoneyPickEnvelopeUI extends MMActivity {

    /* renamed from: x0 */
    public static final /* synthetic */ int f200516x0 = 0;

    /* renamed from: A */
    public Dialog f200517A;

    /* renamed from: B */
    public View f200518B;

    /* renamed from: C */
    public C56850a f200519C;

    /* renamed from: D */
    public Button f200520D;

    /* renamed from: E */
    public TextView f200521E;

    /* renamed from: F */
    public LinkedList<String> f200522F;

    /* renamed from: G */
    public RecyclerView.C0130p f200523G;

    /* renamed from: H */
    public boolean f200524H = true;

    /* renamed from: I */
    public Boolean f200525I;

    /* renamed from: J */
    public String f200526J;

    /* renamed from: K */
    public String f200527K;

    /* renamed from: L */
    public String f200528L;

    /* renamed from: M */
    public String f200529M;

    /* renamed from: N */
    public long f200530N;

    /* renamed from: P */
    public boolean f200531P = false;

    /* renamed from: Q */
    public int f200532Q;

    /* renamed from: R */
    public int f200533R;

    /* renamed from: S */
    public int f200534S;

    /* renamed from: T */
    public int f200535T;

    /* renamed from: U */
    public int f200536U;

    /* renamed from: V */
    public int f200537V;

    /* renamed from: W */
    public int f200538W;

    /* renamed from: X */
    public int f200539X;

    /* renamed from: Y */
    public boolean f200540Y = false;

    /* renamed from: Z */
    public IListener<RefreshLuckyMoneyEnvelopeListEvent> f200541Z = new IListener<RefreshLuckyMoneyEnvelopeListEvent>(C40008f.f107254d) {
        {
            this.__eventId = 220103977;
        }

        public boolean callback(IEvent iEvent) {
            RefreshLuckyMoneyEnvelopeListEvent refreshLuckyMoneyEnvelopeListEvent = (RefreshLuckyMoneyEnvelopeListEvent) iEvent;
            MMHandlerThread.postToMainThread(new C69578c4(this));
            return false;
        }
    };

    /* renamed from: d */
    public boolean f200542d = false;

    /* renamed from: e */
    public boolean f200543e = false;

    /* renamed from: f */
    public int f200544f = 0;

    /* renamed from: g */
    public View f200545g;

    /* renamed from: h */
    public LuckyMoneyEnvelopeTouchRecyclerView f200546h;

    /* renamed from: i */
    public ScaleLayoutManager f200547i;

    /* renamed from: j */
    public C69496o f200548j;

    /* renamed from: n */
    public View f200549n;

    /* renamed from: o */
    public RecyclerView f200550o;

    /* renamed from: p */
    public GridLayoutManager f200551p;

    /* renamed from: p0 */
    public boolean f200552p0 = false;

    /* renamed from: q */
    public C69496o f200553q;

    /* renamed from: r */
    public View f200554r;

    /* renamed from: s */
    public List<C69497p> f200555s = new ArrayList();

    /* renamed from: t */
    public boolean f200556t = false;

    /* renamed from: u */
    public int f200557u = -1;

    /* renamed from: v */
    public int f200558v = -1;

    /* renamed from: w */
    public boolean f200559w = false;

    /* renamed from: x */
    public boolean f200560x = false;

    /* renamed from: y */
    public int f200561y = 0;

    /* renamed from: z */
    public String f200562z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$l */
    public static abstract class C56855l extends C9507n {
        public C56855l(View view) {
            super(view);
        }

        /* renamed from: B */
        public abstract void mo80272B(boolean z);

        /* renamed from: z */
        public abstract void mo80273z(C69497p pVar, int i);
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$q */
    public class C56856q extends C56855l {

        /* renamed from: A */
        public View f162897A;

        /* renamed from: B */
        public View f162898B;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$q$a */
        public class C56857a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f162900d;

            public C56857a(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i) {
                this.f162900d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C115669n.INSTANCE.mo160131h(22302, 3);
                Intent intent = new Intent(LuckyMoneyPickEnvelopeUI.this.getContext(), WalletPayUPwdConfirmUI.class);
                if (this.f162900d == 1) {
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click HistoryEnvelopeEntranceVH: %s", Integer.valueOf(C56856q.this.mo17364k()));
                }
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = luckyMoneyPickEnvelopeUI;
                C117292a.m165358d(luckyMoneyPickEnvelopeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyPickEnvelopeUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyPickEnvelopeUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C56856q(View view, int i) {
            super(view);
            view.setOnClickListener(new C56857a(LuckyMoneyPickEnvelopeUI.this, i));
            if (i == 1) {
                View findViewById = view.findViewById(C0966R.C0970id.f358613og3);
                this.f162897A = findViewById;
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = LuckyMoneyPickEnvelopeUI.this.f200532Q;
                layoutParams.height = LuckyMoneyPickEnvelopeUI.this.f200533R;
                this.f162897A.setLayoutParams(layoutParams);
                View findViewById2 = view.findViewById(C0966R.C0970id.g1r);
                this.f162898B = findViewById2;
                ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                layoutParams2.width = LuckyMoneyPickEnvelopeUI.this.f200534S;
                layoutParams2.height = LuckyMoneyPickEnvelopeUI.this.f200535T;
                this.f162898B.setLayoutParams(layoutParams2);
                ((TextView) view.findViewById(C0966R.C0970id.og4)).setTextSize(1, 12.0f);
            }
        }

        /* renamed from: B */
        public void mo80272B(boolean z) {
        }

        /* renamed from: z */
        public void mo80273z(C69497p pVar, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$a */
    public class C69479a implements DialogInterface.OnCancelListener {
        public C69479a(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$b */
    public class C69480b implements C87581a<Object, C89132b.C89134c<C51758vz>> {

        /* renamed from: a */
        public final /* synthetic */ String f200564a;

        public C69480b(String str) {
            this.f200564a = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            Dialog dialog = LuckyMoneyPickEnvelopeUI.this.f200517A;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", Integer.valueOf(((C51758vz) cVar.f256796d).f143780d));
                T t = cVar.f256796d;
                if (t != null && ((C51758vz) t).f143780d == 0) {
                    Intent intent = new Intent();
                    C77994sf2 H7 = LuckyMoneyPickEnvelopeUI.m81899H7(LuckyMoneyPickEnvelopeUI.this, this.f200564a);
                    if (H7 != null) {
                        try {
                            intent.putExtra("key_envelope_source", H7.toByteArray());
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", e, "", new Object[0]);
                        }
                    }
                    LuckyMoneyPickEnvelopeUI.this.setResult(-1, intent);
                    if (!Util.isNullOrNil(LuckyMoneyPickEnvelopeUI.this.f200528L)) {
                        C75026b.m89952b(LuckyMoneyPickEnvelopeUI.this.getContext(), LuckyMoneyPickEnvelopeUI.this.findViewById(C0966R.C0970id.f358753gv2), LuckyMoneyPickEnvelopeUI.this.getContext().getString(C0966R.string.gfq), new C69698u3(this));
                        return null;
                    }
                    LuckyMoneyPickEnvelopeUI.this.finish();
                    return null;
                } else if (t == null || Util.isNullOrNil(((C51758vz) t).f143781e)) {
                    return null;
                } else {
                    C75228t.m90211D(LuckyMoneyPickEnvelopeUI.this.getContext(), ((C51758vz) cVar.f256796d).f143781e);
                    return null;
                }
            } else {
                C75228t.m90209B(LuckyMoneyPickEnvelopeUI.this.getContext(), cVar.f256795c);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$c */
    public class C69481c implements MenuItem.OnMenuItemClickListener {
        public C69481c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
            int i = luckyMoneyPickEnvelopeUI.f200557u;
            String str = i >= 0 ? ((C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(i)).f200615b.f228202f : "";
            C115669n nVar = C115669n.INSTANCE;
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
            nVar.mo160131h(18892, 2, Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200558v + 1), Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200557u + 1), luckyMoneyPickEnvelopeUI2.f200527K, str, luckyMoneyPickEnvelopeUI2.f200526J, Integer.valueOf(luckyMoneyPickEnvelopeUI2.f200548j.getItemCount() - 1), Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.mo95738N7()));
            if (!Util.isNullOrNil(LuckyMoneyPickEnvelopeUI.this.f200529M)) {
                nVar.mo160131h(22104, LuckyMoneyPickEnvelopeUI.this.f200529M, 4, Long.valueOf(Util.ticksToNow(LuckyMoneyPickEnvelopeUI.this.f200530N) / 1000));
            }
            LuckyMoneyPickEnvelopeUI.this.setResult(0);
            LuckyMoneyPickEnvelopeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$d */
    public class C69482d implements View.OnClickListener {
        public C69482d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "switchMode，old is : %s， pos is ：%s", Integer.valueOf(luckyMoneyPickEnvelopeUI.f200544f), Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u));
            int i = luckyMoneyPickEnvelopeUI.f200557u;
            String str = (i < 0 || i >= ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) ? "" : ((C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(luckyMoneyPickEnvelopeUI.f200557u)).f200615b.f228202f;
            if (luckyMoneyPickEnvelopeUI.f200544f == 1) {
                luckyMoneyPickEnvelopeUI.f200544f = 0;
                View view2 = luckyMoneyPickEnvelopeUI.f200545g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = luckyMoneyPickEnvelopeUI.f200549n;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int i2 = luckyMoneyPickEnvelopeUI.f200557u;
                if (i2 >= 0 && i2 < luckyMoneyPickEnvelopeUI.f200548j.getItemCount()) {
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "switchMode scroll to pos: %s", Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u));
                    LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = luckyMoneyPickEnvelopeUI.f200546h;
                    ScaleLayoutManager scaleLayoutManager = luckyMoneyPickEnvelopeUI.f200547i;
                    int h0 = scaleLayoutManager.mo23964h0(luckyMoneyPickEnvelopeUI.f200557u);
                    if (scaleLayoutManager.f53140y == 1) {
                        luckyMoneyEnvelopeTouchRecyclerView.scrollBy(0, h0);
                    } else {
                        luckyMoneyEnvelopeTouchRecyclerView.scrollBy(h0, 0);
                    }
                    luckyMoneyPickEnvelopeUI.mo95744T7(luckyMoneyPickEnvelopeUI.f200557u, true);
                    luckyMoneyPickEnvelopeUI.mo95746V7();
                }
                C115669n.INSTANCE.mo160131h(18892, 5, Integer.valueOf(luckyMoneyPickEnvelopeUI.f200558v + 1), Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u + 1), luckyMoneyPickEnvelopeUI.f200527K, str, luckyMoneyPickEnvelopeUI.f200526J, Integer.valueOf(luckyMoneyPickEnvelopeUI.f200548j.getItemCount() - 1), Integer.valueOf(luckyMoneyPickEnvelopeUI.mo95738N7()));
            } else {
                luckyMoneyPickEnvelopeUI.f200544f = 1;
                View view6 = luckyMoneyPickEnvelopeUI.f200549n;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view8 = luckyMoneyPickEnvelopeUI.f200545g;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "switchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyPickEnvelopeUI.mo95743S7();
                C115669n.INSTANCE.mo160131h(18892, 4, Integer.valueOf(luckyMoneyPickEnvelopeUI.f200558v + 1), Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u + 1), luckyMoneyPickEnvelopeUI.f200527K, str, luckyMoneyPickEnvelopeUI.f200526J, Integer.valueOf(luckyMoneyPickEnvelopeUI.f200548j.getItemCount() - 1), Integer.valueOf(luckyMoneyPickEnvelopeUI.mo95738N7()));
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_PICK_UI_MODE_SWITCH_INT_SYNC, Integer.valueOf(luckyMoneyPickEnvelopeUI.f200544f));
            luckyMoneyPickEnvelopeUI.mo95739O7(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$e */
    public class C69483e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f200568d;

        public C69483e(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, View view) {
            this.f200568d = view;
        }

        public void run() {
            if (this.f200568d.getHeight() != 0) {
                View view = this.f200568d;
                float height = (float) (view.getHeight() / 2);
                if (view != null) {
                    view.setOutlineProvider(new C79405a(true, true, height));
                }
                if (view != null) {
                    view.setClipToOutline(true);
                    return;
                }
                return;
            }
            View view2 = this.f200568d;
            float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 16);
            if (view2 != null) {
                view2.setOutlineProvider(new C79405a(true, true, b));
            }
            if (view2 != null) {
                view2.setClipToOutline(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$f */
    public class C69484f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f200569d;

        public C69484f(String str) {
            this.f200569d = str;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.LuckyMoneyPickEnvelopeUI", "click exchange tv");
            Uri.Builder buildUpon = Uri.parse(this.f200569d).buildUpon();
            buildUpon.appendQueryParameter("sessionId", LuckyMoneyPickEnvelopeUI.this.f200526J);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", buildUpon.build().toString());
            intent.putExtra("showShare", false);
            intent.putExtra("KRightBtn", true);
            C75228t.m90218K(LuckyMoneyPickEnvelopeUI.this.getContext(), intent, 1);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[3];
            objArr[0] = 3;
            objArr[1] = Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200525I.booleanValue() ? 2 : 1);
            objArr[2] = LuckyMoneyPickEnvelopeUI.this.f200526J;
            nVar.mo160131h(18890, objArr);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$g */
    public class C69485g extends ScaleLayoutManager {
        public C69485g(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, Context context, int i) {
            super(context, i);
        }

        /* renamed from: l0 */
        public void mo23968l0() {
            this.f53131I -= 31.0f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$h */
    public class C69486h implements LuckyMoneyEnvelopeTouchRecyclerView.C69394a {
        public C69486h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$i */
    public class C69487i extends C30870z1 {
        public C69487i() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
            int i = LuckyMoneyPickEnvelopeUI.f200516x0;
            luckyMoneyPickEnvelopeUI.mo95735K7((C77994sf2) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$j */
    public class C69488j implements DialogInterface.OnCancelListener {
        public C69488j(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$k */
    public class C69489k implements C75097a.C75099b<C78007w82> {

        /* renamed from: a */
        public final /* synthetic */ boolean f200573a;

        public C69489k(boolean z) {
            this.f200573a = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
            C78007w82 w822 = (C78007w82) obj;
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C78007w82 w822 = (C78007w82) obj;
            Dialog dialog = LuckyMoneyPickEnvelopeUI.this.f200517A;
            if (dialog != null && dialog.isShowing()) {
                LuckyMoneyPickEnvelopeUI.this.f200517A.dismiss();
            }
            LuckyMoneyPickEnvelopeUI.this.f200560x = false;
            Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source net callback");
            if (w822 != null) {
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", Integer.valueOf(w822.f228340d));
                if (w822.f228340d == 0) {
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
                    luckyMoneyPickEnvelopeUI.f200561y = w822.f228344h;
                    luckyMoneyPickEnvelopeUI.f200562z = w822.f228343g;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_LAST_RECEIVE_TIMESTAMP_LONG_SYNC, Long.valueOf(w822.f228348o));
                    if (this.f200573a) {
                        ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).clear();
                    }
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "hasMore: %s, pagedata: %s", Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200561y), LuckyMoneyPickEnvelopeUI.this.f200562z);
                    LuckyMoneyPickEnvelopeUI.this.mo95745U7(w822, this.f200573a);
                    if (this.f200573a) {
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
                        luckyMoneyPickEnvelopeUI2.getClass();
                        luckyMoneyPickEnvelopeUI2.f200546h.post(new C69671q3(luckyMoneyPickEnvelopeUI2));
                        LuckyMoneyPickEnvelopeUI.this.mo95743S7();
                        return;
                    }
                    return;
                }
                C75228t.m90210C(w822.f228341e);
                return;
            }
            C75228t.m90209B(LuckyMoneyPickEnvelopeUI.this.getContext(), "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$m */
    public class C69490m extends C56855l {

        /* renamed from: U */
        public static final /* synthetic */ int f200575U = 0;

        /* renamed from: A */
        public View f200576A;

        /* renamed from: B */
        public ImageView f200577B;

        /* renamed from: C */
        public TextView f200578C;

        /* renamed from: D */
        public ImageView f200579D;

        /* renamed from: E */
        public View f200580E;

        /* renamed from: F */
        public TextView f200581F;

        /* renamed from: G */
        public View f200582G;

        /* renamed from: H */
        public ImageView f200583H;

        /* renamed from: I */
        public ProgressBar f200584I;

        /* renamed from: J */
        public TextView f200585J;

        /* renamed from: K */
        public TextView f200586K;

        /* renamed from: L */
        public ViewGroup f200587L;

        /* renamed from: M */
        public ProgressBar f200588M;

        /* renamed from: N */
        public Button f200589N;

        /* renamed from: P */
        public ImageView f200590P;

        /* renamed from: Q */
        public ViewGroup f200591Q;

        /* renamed from: R */
        public TextView f200592R;

        /* renamed from: S */
        public TextView f200593S;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$m$a */
        public class C69491a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C69497p f200595d;

            public C69491a(C69497p pVar) {
                this.f200595d = pVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C69490m mVar = C69490m.this;
                C77994sf2 sf22 = this.f200595d.f200615b;
                int i = C69490m.f200575U;
                mVar.mo95753C(sf22, true);
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$m$b */
        public class C69492b implements C75672b.C75673a {

            /* renamed from: a */
            public final /* synthetic */ C77994sf2 f200597a;

            /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$m$b$a */
            public class C69493a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ boolean f200599d;

                public C69493a(boolean z) {
                    this.f200599d = z;
                }

                public void run() {
                    C69490m.this.f200588M.setVisibility(8);
                    Dialog dialog = LuckyMoneyPickEnvelopeUI.this.f200517A;
                    if (dialog != null && dialog.isShowing()) {
                        LuckyMoneyPickEnvelopeUI.this.f200517A.dismiss();
                    }
                    C69492b bVar = C69492b.this;
                    C77994sf2 sf22 = bVar.f200597a;
                    if (sf22.f228205i == 1 || sf22.f228209p == 1) {
                        Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
                    } else if (!this.f200599d) {
                        View view = C69490m.this.f200582G;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C69490m.this.f200583H.setVisibility(0);
                        C69490m.this.f200584I.setVisibility(8);
                        C69490m.this.f200585J.setVisibility(0);
                    } else {
                        View view3 = C69490m.this.f200582G;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }

            public C69492b(C77994sf2 sf22) {
                this.f200597a = sf22;
            }

            public void onComplete(boolean z) {
                C69493a aVar = new C69493a(z);
                if (MMHandlerThread.isMainThread()) {
                    aVar.run();
                } else {
                    C69490m.this.f200582G.post(aVar);
                }
            }
        }

        public C69490m(View view, int i) {
            super(view);
            this.f200576A = view.findViewById(C0966R.C0970id.f358607og2);
            this.f200587L = (ViewGroup) view.findViewById(C0966R.C0970id.g1r);
            this.f200577B = (ImageView) view.findViewById(C0966R.C0970id.f358612g24);
            this.f200580E = view.findViewById(C0966R.C0970id.g2a);
            this.f200578C = (TextView) view.findViewById(C0966R.C0970id.g28);
            this.f200579D = (ImageView) view.findViewById(C0966R.C0970id.g1p);
            this.f200581F = (TextView) view.findViewById(C0966R.C0970id.g2f);
            this.f200582G = view.findViewById(C0966R.C0970id.g2i);
            this.f200583H = (ImageView) view.findViewById(C0966R.C0970id.g2e);
            this.f200584I = (ProgressBar) view.findViewById(C0966R.C0970id.g1o);
            this.f200585J = (TextView) view.findViewById(C0966R.C0970id.g2g);
            this.f200586K = (TextView) view.findViewById(C0966R.C0970id.g25);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.g2h);
            this.f200589N = (Button) view.findViewById(C0966R.C0970id.g29);
            this.f200590P = (ImageView) view.findViewById(C0966R.C0970id.f358609g21);
            this.f200591Q = (ViewGroup) view.findViewById(C0966R.C0970id.g2_);
            this.f200592R = (TextView) view.findViewById(C0966R.C0970id.f358610g22);
            this.f200593S = (TextView) view.findViewById(C0966R.C0970id.f358608g20);
            C75228t.m90240d(this.f200592R);
            C75228t.m90240d(this.f200593S);
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f200589N.setBackgroundResource(C0966R.C0969drawable.c_e);
                this.f200589N.setText(C0966R.string.f360994gi2);
            }
            this.f200588M = (ProgressBar) view.findViewById(C0966R.C0970id.g2d);
            if (C85875k4.m106211z()) {
                this.f200587L.setBackgroundResource(C0966R.C0969drawable.aed);
            } else {
                this.f200587L.setBackgroundResource(C0966R.C0969drawable.aeb);
            }
            this.f200587L.setEnabled(false);
        }

        /* renamed from: B */
        public void mo80272B(boolean z) {
        }

        /* renamed from: C */
        public final void mo95753C(C77994sf2 sf22, boolean z) {
            if (z) {
                this.f200583H.setVisibility(8);
                this.f200584I.setVisibility(0);
                this.f200585J.setVisibility(8);
            } else if ("0".equals(sf22.f228202f)) {
                Log.m105918d("MicroMsg.LuckyMoneyPickEnvelopeUI", "default envelope");
                return;
            } else {
                this.f200588M.setVisibility(0);
            }
            ((C75672b) C86312j.m106911c(C75672b.class)).ng0(this.f200577B, sf22, new C69492b(sf22), 0, 0, 0);
        }

        /* renamed from: z */
        public void mo80273z(C69497p pVar, int i) {
            this.f44854d.setSelected(pVar.f200614a);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f200579D, C75592q0.m90789s(), 0.06f);
            this.f200581F.setText(LuckyMoneyPickEnvelopeUI.this.getString(C0966R.string.gjt, new Object[]{((C76979h) C86312j.m106911c(C76979h.class)).op0(LuckyMoneyPickEnvelopeUI.this.getContext(), C75592q0.m90783m(), C76577a.m92157h(LuckyMoneyPickEnvelopeUI.this.getContext(), C0966R.dimen.f3962lk))}));
            this.f200577B.setImageBitmap((Bitmap) null);
            View view = this.f200582G;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C77994sf2 sf22 = pVar.f200615b;
            if (sf22 != null) {
                this.f200578C.setText(sf22.f228200d);
                this.f200592R.setText(pVar.f200615b.f228200d);
                C77994sf2 sf23 = pVar.f200615b;
                if (sf23.f228203g != null) {
                    mo95753C(sf23, false);
                }
                this.f200582G.setOnClickListener(new C69491a(pVar));
                if (!Util.isNullOrNil(pVar.f200615b.f228204h)) {
                    this.f200586K.setText(pVar.f200615b.f228204h);
                    this.f200586K.setVisibility(0);
                } else {
                    this.f200586K.setText("");
                }
                TextView textView = this.f200593S;
                if (textView != null) {
                    textView.setText(pVar.f200615b.f228198C);
                }
                View view3 = this.f200582G;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$n */
    public class C69494n extends C56855l {

        /* renamed from: A */
        public int f200601A;

        /* renamed from: B */
        public View f200602B;

        /* renamed from: C */
        public View f200603C;

        /* renamed from: D */
        public ImageView f200604D;

        /* renamed from: E */
        public TextView f200605E;

        /* renamed from: F */
        public TextView f200606F;

        /* renamed from: G */
        public WeImageView f200607G;

        /* renamed from: H */
        public ViewGroup f200608H;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$n$a */
        public class C69495a implements View.OnTouchListener {

            /* renamed from: d */
            public final /* synthetic */ C69497p f200610d;

            public C69495a(C69497p pVar) {
                this.f200610d = pVar;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getAction() == 0) {
                    C69494n nVar = C69494n.this;
                    nVar.f200607G.setIconColor(LuckyMoneyPickEnvelopeUI.this.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                    C69494n nVar2 = C69494n.this;
                    nVar2.f200605E.setTextColor(LuckyMoneyPickEnvelopeUI.this.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                } else {
                    C69494n nVar3 = C69494n.this;
                    nVar3.f200607G.setIconColor(LuckyMoneyPickEnvelopeUI.this.getContext().getResources().getColor(C0966R.color.a2u));
                    C69494n nVar4 = C69494n.this;
                    nVar4.f200605E.setTextColor(LuckyMoneyPickEnvelopeUI.this.getContext().getResources().getColor(C0966R.color.a2u));
                    Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "on click ");
                    C77994sf2 sf22 = this.f200610d.f200615b;
                    C75228t.m90224Q(sf22.f228213t, sf22.f228214u, 0, 1100);
                    C69494n nVar5 = C69494n.this;
                    if (nVar5.f200601A == 1) {
                        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click CreateEnvelopeVH: %s", Integer.valueOf(nVar5.mo17364k()));
                    }
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C69494n(View view, int i) {
            super(view);
            this.f200601A = i;
            this.f200602B = view.findViewById(C0966R.C0970id.ofe);
            this.f200603C = view.findViewById(C0966R.C0970id.g1s);
            this.f200604D = (ImageView) view.findViewById(C0966R.C0970id.g1u);
            this.f200605E = (TextView) view.findViewById(C0966R.C0970id.g1w);
            this.f200606F = (TextView) view.findViewById(C0966R.C0970id.g1v);
            this.f200607G = (WeImageView) view.findViewById(C0966R.C0970id.g1x);
            this.f200608H = (ViewGroup) view.findViewById(C0966R.C0970id.g1y);
            if (this.f200601A == 1) {
                ViewGroup.LayoutParams layoutParams = this.f200602B.getLayoutParams();
                layoutParams.width = LuckyMoneyPickEnvelopeUI.this.f200532Q;
                layoutParams.height = LuckyMoneyPickEnvelopeUI.this.f200533R;
                this.f200602B.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.f200603C.getLayoutParams();
                layoutParams2.width = LuckyMoneyPickEnvelopeUI.this.f200534S;
                layoutParams2.height = LuckyMoneyPickEnvelopeUI.this.f200535T;
                this.f200603C.setLayoutParams(layoutParams2);
                this.f200603C.setMinimumHeight(LuckyMoneyPickEnvelopeUI.this.f200533R);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f200604D.getLayoutParams();
                double d = ((double) LuckyMoneyPickEnvelopeUI.this.f200534S) * 0.7d;
                layoutParams3.width = (int) d;
                layoutParams3.height = (int) (d * 0.871d);
                layoutParams3.topMargin = (int) (((double) LuckyMoneyPickEnvelopeUI.this.f200535T) * 0.13d);
                this.f200604D.setLayoutParams(layoutParams3);
            }
        }

        /* renamed from: B */
        public void mo80272B(boolean z) {
        }

        /* renamed from: z */
        public void mo80273z(C69497p pVar, int i) {
            this.f44854d.setSelected(pVar.f200614a);
            C77994sf2 sf22 = pVar.f200615b;
            if (sf22 != null) {
                this.f200605E.setText(sf22.f228215v);
                this.f200606F.setText(pVar.f200615b.f228216w);
                C85875k4.m106189j0(this.f200605E.getPaint(), 0.8f);
                C85875k4.m106189j0(this.f200606F.getPaint(), 0.8f);
                if (this.f200601A == 1) {
                    this.f200605E.setTextSize(1, 12.0f);
                    this.f200606F.setTextSize(1, 10.0f);
                }
                this.f200608H.setClickable(true);
                this.f200608H.setOnTouchListener(new C69495a(pVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$o */
    public class C69496o extends C9506m<C56855l> {

        /* renamed from: e */
        public int f200612e;

        public C69496o(int i) {
            this.f200612e = i;
        }

        /* renamed from: F4 */
        public void mo10187F4(C9507n nVar, int i) {
            new ArrayList();
            ((C56855l) nVar).mo80273z((C69497p) ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).get(i), i);
        }

        /* renamed from: G4 */
        public void mo10188G4(C9507n nVar, int i, List list) {
            ((C56855l) nVar).mo80273z((C69497p) ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).get(i), i);
        }

        /* renamed from: O4 */
        public C9507n mo10189O4(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new C69498r(this.f200612e == 1 ? LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d_l, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b_8, viewGroup, false), this.f200612e);
            } else if (i == 2) {
                return new C69490m(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b_6, viewGroup, false), this.f200612e);
            } else if (i == 3) {
                C115669n.INSTANCE.mo160131h(22302, 1);
                return new C56856q(this.f200612e == 1 ? LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d_j, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b_7, viewGroup, false), this.f200612e);
            } else if (i == 4) {
                return new C69494n(this.f200612e == 1 ? LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d_i, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b9f, viewGroup, false), this.f200612e);
            } else {
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "wrong type: %s", Integer.valueOf(i));
                return null;
            }
        }

        public int getItemCount() {
            return ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).size();
        }

        public long getItemId(int i) {
            return (long) ((C69497p) ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).get(i)).hashCode();
        }

        public int getItemViewType(int i) {
            C69497p pVar = (C69497p) ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).get(i);
            if (pVar.f200616c) {
                return 3;
            }
            int i2 = pVar.f200615b.f228208o;
            if (i2 == 3) {
                return 2;
            }
            return i2 == 4 ? 4 : 1;
        }

        /* renamed from: u5 */
        public void onViewRecycled(C56855l lVar) {
            if (lVar instanceof C69498r) {
                C69498r rVar = (C69498r) lVar;
                ListScrollPAGView listScrollPAGView = rVar.f200628K;
                if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
                    rVar.f200628K.mo21226m();
                    rVar.f200628K.mo21222i(rVar.f200629L);
                    rVar.f200629L = null;
                }
                ListScrollPAGView listScrollPAGView2 = rVar.f200623F;
                if (listScrollPAGView2 != null && listScrollPAGView2.getVisibility() == 0) {
                    rVar.f200623F.mo21226m();
                    rVar.f200623F.mo21222i(rVar.f200624G);
                    ListScrollPAGView listScrollPAGView3 = rVar.f200623F;
                    ListScrollPAGView.C17719f fVar = rVar.f200625H;
                    synchronized (listScrollPAGView3) {
                        listScrollPAGView3.f48764s.remove(fVar);
                    }
                    rVar.f200624G = null;
                    rVar.f200625H = null;
                }
            }
            super.onViewRecycled(lVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p */
    public static class C69497p {

        /* renamed from: a */
        public boolean f200614a = false;

        /* renamed from: b */
        public C77994sf2 f200615b;

        /* renamed from: c */
        public boolean f200616c;
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$r */
    public class C69498r extends C56855l {

        /* renamed from: Q0 */
        public static final /* synthetic */ int f200617Q0 = 0;

        /* renamed from: A */
        public int f200618A;

        /* renamed from: B */
        public ImageView f200619B;

        /* renamed from: C */
        public ImageView f200620C;

        /* renamed from: D */
        public ImageView f200621D;

        /* renamed from: E */
        public View f200622E;

        /* renamed from: F */
        public ListScrollPAGView f200623F;

        /* renamed from: G */
        public ListScrollPAGView.C17718h f200624G;

        /* renamed from: H */
        public ListScrollPAGView.C17719f f200625H;

        /* renamed from: I */
        public boolean f200626I = false;

        /* renamed from: J */
        public View f200627J;

        /* renamed from: K */
        public ListScrollPAGView f200628K;

        /* renamed from: L */
        public ListScrollPAGView.C17718h f200629L;

        /* renamed from: M */
        public View f200630M;

        /* renamed from: N */
        public ViewGroup f200631N;

        /* renamed from: P */
        public View f200632P;

        /* renamed from: Q */
        public TextView f200633Q;

        /* renamed from: R */
        public ImageView f200634R;

        /* renamed from: S */
        public TextView f200635S;

        /* renamed from: T */
        public View f200636T;

        /* renamed from: U */
        public ImageView f200637U;

        /* renamed from: V */
        public ProgressBar f200638V;

        /* renamed from: W */
        public TextView f200639W;

        /* renamed from: X */
        public TextView f200640X;

        /* renamed from: Y */
        public TextView f200641Y;

        /* renamed from: Z */
        public ViewGroup f200642Z;

        /* renamed from: p0 */
        public ProgressBar f200643p0;

        /* renamed from: x0 */
        public Button f200644x0;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$r$a */
        public class C69499a implements View.OnLongClickListener {
            public C69499a(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C69498r.m81928C(C69498r.this, view, 0, (String) null);
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$r$b */
        public class C69500b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C69497p f200647d;

            public C69500b(C69497p pVar) {
                this.f200647d = pVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C69498r rVar = C69498r.this;
                C77994sf2 sf22 = this.f200647d.f200615b;
                int i = C69498r.f200617Q0;
                rVar.mo95759E(sf22, true);
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C69498r(View view, int i) {
            super(view);
            this.f200618A = i;
            this.f200642Z = (ViewGroup) view.findViewById(C0966R.C0970id.g1r);
            this.f200619B = (ImageView) view.findViewById(C0966R.C0970id.f358612g24);
            this.f200620C = (ImageView) view.findViewById(C0966R.C0970id.g2a);
            this.f200621D = (ImageView) view.findViewById(C0966R.C0970id.g2c);
            this.f200622E = view.findViewById(C0966R.C0970id.o0v);
            this.f200623F = (ListScrollPAGView) view.findViewById(C0966R.C0970id.o0u);
            this.f200627J = view.findViewById(C0966R.C0970id.o0t);
            this.f200628K = (ListScrollPAGView) view.findViewById(C0966R.C0970id.o0s);
            this.f200630M = view.findViewById(C0966R.C0970id.o0r);
            this.f200631N = (ViewGroup) view.findViewById(C0966R.C0970id.g2_);
            this.f200632P = view.findViewById(C0966R.C0970id.g1q);
            this.f200633Q = (TextView) view.findViewById(C0966R.C0970id.g28);
            this.f200634R = (ImageView) view.findViewById(C0966R.C0970id.g1p);
            this.f200635S = (TextView) view.findViewById(C0966R.C0970id.g2f);
            this.f200636T = view.findViewById(C0966R.C0970id.g2i);
            this.f200637U = (ImageView) view.findViewById(C0966R.C0970id.g2e);
            this.f200638V = (ProgressBar) view.findViewById(C0966R.C0970id.g1o);
            this.f200639W = (TextView) view.findViewById(C0966R.C0970id.g2g);
            this.f200640X = (TextView) view.findViewById(C0966R.C0970id.g25);
            this.f200641Y = (TextView) view.findViewById(C0966R.C0970id.g2h);
            this.f200644x0 = (Button) view.findViewById(C0966R.C0970id.g29);
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f200644x0.setBackgroundResource(C0966R.C0969drawable.c_e);
                this.f200644x0.setText(C0966R.string.f360994gi2);
            }
            this.f200643p0 = (ProgressBar) view.findViewById(C0966R.C0970id.g2d);
            if (C85875k4.m106211z()) {
                this.f200642Z.setBackgroundResource(C0966R.C0969drawable.aed);
            } else {
                this.f200642Z.setBackgroundResource(C0966R.C0969drawable.aeb);
            }
            if (i == 0) {
                C69499a aVar = new C69499a(LuckyMoneyPickEnvelopeUI.this);
                view.setOnLongClickListener(aVar);
                this.f200636T.setOnLongClickListener(aVar);
            }
        }

        /* renamed from: C */
        public static void m81928C(C69498r rVar, View view, int i, String str) {
            C77994sf2 sf22;
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
            if (luckyMoneyPickEnvelopeUI.f200559w) {
                if (i != 1) {
                    View E0 = luckyMoneyPickEnvelopeUI.f200546h.mo17020E0(view);
                    int N0 = LuckyMoneyPickEnvelopeUI.this.f200546h.mo17029N0(E0);
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
                    View n = luckyMoneyPickEnvelopeUI2.f200519C.mo80268n(luckyMoneyPickEnvelopeUI2.f200547i);
                    if (N0 >= 0 && N0 < ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).size() && E0 == n) {
                        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "delete pos: %s", Integer.valueOf(N0));
                        C69497p pVar = (C69497p) ((ArrayList) LuckyMoneyPickEnvelopeUI.this.f200555s).get(N0);
                        if (pVar != null && (sf22 = pVar.f200615b) != null) {
                            if ("0".equals(sf22.f228202f)) {
                                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "can not delete default envelope");
                                return;
                            }
                            C77407n nVar = new C77407n((Context) LuckyMoneyPickEnvelopeUI.this.getContext(), 1, true);
                            TextView textView = new TextView(LuckyMoneyPickEnvelopeUI.this.getContext());
                            textView.setPadding(0, 0, 0, C76577a.m92151b(LuckyMoneyPickEnvelopeUI.this.getContext(), 9));
                            textView.setMinHeight(C76577a.m92157h(LuckyMoneyPickEnvelopeUI.this.getContext(), C0966R.dimen.f3639x));
                            textView.setTextSize(14.0f);
                            textView.setTextColor(LuckyMoneyPickEnvelopeUI.this.getResources().getColor(C0966R.color.f3552xi));
                            textView.setText(C0966R.string.gi8);
                            textView.setGravity(81);
                            nVar.mo107569n(textView, true);
                            nVar.f225771i = new C56869r4(rVar);
                            nVar.f225782p = new C69685s4(rVar, pVar);
                            nVar.mo107573q();
                        }
                    }
                } else if (Util.isNullOrNil(str)) {
                } else {
                    if ("0".equals(str)) {
                        Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "can not delete default envelope");
                        return;
                    }
                    C77407n nVar2 = new C77407n((Context) LuckyMoneyPickEnvelopeUI.this.getContext(), 1, true);
                    TextView textView2 = new TextView(LuckyMoneyPickEnvelopeUI.this.getContext());
                    textView2.setPadding(0, 0, 0, C76577a.m92151b(LuckyMoneyPickEnvelopeUI.this.getContext(), 9));
                    textView2.setMinHeight(C76577a.m92157h(LuckyMoneyPickEnvelopeUI.this.getContext(), C0966R.dimen.f3639x));
                    textView2.setTextSize(14.0f);
                    textView2.setTextColor(LuckyMoneyPickEnvelopeUI.this.getResources().getColor(C0966R.color.f3552xi));
                    textView2.setText(C0966R.string.gi8);
                    textView2.setGravity(81);
                    nVar2.mo107569n(textView2, true);
                    nVar2.f225771i = new C56868p4(rVar);
                    nVar2.f225782p = new C69673q4(rVar, str);
                    nVar2.mo107573q();
                }
            }
        }

        /* renamed from: B */
        public void mo80272B(boolean z) {
            this.f44854d.setSelected(z);
        }

        /* renamed from: D */
        public final void mo95758D() {
            View view = this.f200636T;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200637U.setVisibility(8);
            this.f200638V.setVisibility(8);
            this.f200639W.setVisibility(8);
            this.f200636T.setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: E */
        public final void mo95759E(C77994sf2 sf22, boolean z) {
            int i;
            int i2;
            int i3;
            C77999tf2 tf22;
            int i4;
            int i5;
            C77994sf2 sf23 = sf22;
            Class cls = C75672b.class;
            if (z) {
                this.f200637U.setVisibility(8);
                this.f200638V.setVisibility(0);
                this.f200639W.setVisibility(8);
            } else if ("0".equals(sf23.f228202f)) {
                Log.m105918d("MicroMsg.LuckyMoneyPickEnvelopeUI", "default envelope");
                return;
            } else {
                this.f200643p0.setVisibility(0);
            }
            if (this.f200621D != null) {
                C77999tf2 tf23 = sf23.f228203g;
                if (tf23 == null || Util.isNullOrNil(tf23.f228251o) || Util.isNullOrNil(sf23.f228203g.f228252p)) {
                    this.f200621D.setVisibility(8);
                } else {
                    this.f200621D.post(new C69634l4(this));
                    this.f200621D.setVisibility(0);
                    if (this.f200618A == 1) {
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
                        int i6 = luckyMoneyPickEnvelopeUI.f200537V;
                        i4 = luckyMoneyPickEnvelopeUI.f200538W;
                        i5 = i6;
                    } else {
                        i5 = 0;
                        i4 = 0;
                    }
                    ((C75672b) C86312j.m106911c(cls)).P30(this.f200621D, sf22, new C69640m4(this, sf23), i5, i4);
                }
            }
            this.f200619B.setVisibility(0);
            if (this.f200618A == 1) {
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
                int i7 = luckyMoneyPickEnvelopeUI2.f200534S;
                i2 = luckyMoneyPickEnvelopeUI2.f200535T;
                i3 = i7;
                i = C76577a.m92151b(MMApplicationContext.getContext(), 3);
            } else {
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            ((C75672b) C86312j.m106911c(cls)).ng0(this.f200619B, sf22, new C69692t4(this, sf23), i3, i2, i);
            if (this.f200618A != 1 && this.f200627J != null && this.f200622E != null) {
                if (LuckyMoneyPickEnvelopeUI.this.f200540Y || (tf22 = sf23.f228203g) == null || Util.isNullOrNil(tf22.f228260x)) {
                    this.f200628K.mo21226m();
                    this.f200623F.mo21226m();
                    View view = this.f200627J;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view2 = this.f200622E;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                int i8 = sf23.f228203g.f228242D;
                long currentTimeMillis = System.currentTimeMillis();
                if (i8 == 2) {
                    C56861d4 d4Var = new C56861d4(this);
                    this.f200624G = d4Var;
                    this.f200625H = new C69585e4(this);
                    this.f200623F.mo21212d(d4Var);
                    this.f200623F.mo21213e(this.f200625H);
                    this.f200623F.setRepeatCount(0);
                    this.f200623F.setScaleMode(3);
                    View view4 = this.f200627J;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f200628K.mo21226m();
                    this.f200621D.post(new C69592f4(this));
                    C69198d0.f199107a.mo95352b(sf23, 1, this.f29679z, new C69598g4(this, currentTimeMillis, sf23));
                    return;
                }
                View view6 = this.f200627J;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(4);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C56865h4 h4Var = new C56865h4(this);
                this.f200629L = h4Var;
                this.f200628K.mo21212d(h4Var);
                this.f200628K.mo21213e(new C69612i4(this));
                this.f200628K.setRepeatCount(0);
                this.f200628K.setScaleMode(3);
                View view8 = this.f200622E;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200623F.mo21226m();
                View view10 = this.f200627J;
                float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
                if (view10 != null) {
                    view10.setOutlineProvider(new C79405a(true, true, b));
                }
                if (view10 != null) {
                    view10.setClipToOutline(true);
                }
                this.f200619B.post(new C69621j4(this));
                C69198d0.f199107a.mo95352b(sf23, 1, this.f29679z, new C69627k4(this, currentTimeMillis, sf23));
            }
        }

        /* renamed from: z */
        public void mo80273z(C69497p pVar, int i) {
            C69497p pVar2 = pVar;
            this.f44854d.setSelected(pVar2.f200614a);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f200634R, C75592q0.m90789s(), 0.06f);
            this.f200635S.setText(LuckyMoneyPickEnvelopeUI.this.getString(C0966R.string.gjt, new Object[]{((C76979h) C86312j.m106911c(C76979h.class)).op0(LuckyMoneyPickEnvelopeUI.this.getContext(), C75592q0.m90783m(), C76577a.m92157h(LuckyMoneyPickEnvelopeUI.this.getContext(), C0966R.dimen.f3962lk))}));
            this.f200619B.setVisibility(0);
            this.f200619B.setImageBitmap((Bitmap) null);
            this.f200621D.setImageBitmap((Bitmap) null);
            View view = this.f200636T;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f200618A == 1) {
                this.f200631N.setBackgroundResource(C0966R.C0969drawable.cqk);
            } else {
                this.f200631N.setBackgroundResource(C0966R.C0969drawable.ady);
            }
            this.f200642Z.setBackgroundResource(C0966R.C0969drawable.aeb);
            this.f200620C.setVisibility(0);
            this.f200620C.setImageResource(C0966R.C0969drawable.c6e);
            ListScrollPAGView listScrollPAGView = this.f200628K;
            if (listScrollPAGView != null) {
                listScrollPAGView.mo21226m();
                this.f200628K.mo21222i(this.f200629L);
                this.f200629L = null;
                View view3 = this.f200627J;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ListScrollPAGView listScrollPAGView2 = this.f200623F;
            if (listScrollPAGView2 != null) {
                listScrollPAGView2.mo21226m();
                this.f200623F.mo21222i(this.f200624G);
                ListScrollPAGView listScrollPAGView3 = this.f200623F;
                ListScrollPAGView.C17719f fVar = this.f200625H;
                synchronized (listScrollPAGView3) {
                    listScrollPAGView3.f48764s.remove(fVar);
                }
                this.f200624G = null;
                this.f200625H = null;
                View view5 = this.f200622E;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f200618A == 1) {
                C77999tf2 tf22 = pVar2.f200615b.f228203g;
                ViewGroup.LayoutParams layoutParams = this.f200632P.getLayoutParams();
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
                layoutParams.width = luckyMoneyPickEnvelopeUI.f200532Q;
                layoutParams.height = luckyMoneyPickEnvelopeUI.f200533R;
                this.f200632P.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.f200636T.getLayoutParams();
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
                layoutParams2.width = luckyMoneyPickEnvelopeUI2.f200532Q;
                layoutParams2.height = luckyMoneyPickEnvelopeUI2.f200533R;
                this.f200636T.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = this.f200642Z.getLayoutParams();
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = LuckyMoneyPickEnvelopeUI.this;
                layoutParams3.width = luckyMoneyPickEnvelopeUI3.f200534S;
                layoutParams3.height = luckyMoneyPickEnvelopeUI3.f200535T;
                this.f200642Z.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = this.f200620C.getLayoutParams();
                layoutParams4.height = LuckyMoneyPickEnvelopeUI.this.f200536U;
                this.f200620C.setLayoutParams(layoutParams4);
                ViewGroup.LayoutParams layoutParams5 = this.f200644x0.getLayoutParams();
                int i2 = LuckyMoneyPickEnvelopeUI.this.f200539X;
                layoutParams5.width = i2;
                layoutParams5.height = i2;
                this.f200644x0.setLayoutParams(layoutParams5);
                if (tf22 != null && !Util.isNullOrNil(tf22.f228251o) && !Util.isNullOrNil(tf22.f228252p)) {
                    ViewGroup.LayoutParams layoutParams6 = this.f200621D.getLayoutParams();
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI4 = LuckyMoneyPickEnvelopeUI.this;
                    layoutParams6.width = luckyMoneyPickEnvelopeUI4.f200537V;
                    layoutParams6.height = luckyMoneyPickEnvelopeUI4.f200538W;
                    this.f200621D.setLayoutParams(layoutParams6);
                } else {
                    this.f200621D.setVisibility(8);
                }
                if (tf22 != null && !Util.isNullOrNil(tf22.f228260x) && tf22.f228242D == 1) {
                    View view7 = this.f200627J;
                    float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 4);
                    if (view7 != null) {
                        view7.setOutlineProvider(new C79405a(true, true, b));
                    }
                    if (view7 != null) {
                        view7.setClipToOutline(true);
                    }
                    ViewGroup.LayoutParams layoutParams7 = this.f200627J.getLayoutParams();
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI5 = LuckyMoneyPickEnvelopeUI.this;
                    layoutParams7.width = luckyMoneyPickEnvelopeUI5.f200534S;
                    layoutParams7.height = luckyMoneyPickEnvelopeUI5.f200535T;
                    this.f200627J.setLayoutParams(layoutParams7);
                    View view8 = this.f200622E;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    if (tf22 != null && !Util.isNullOrNil(tf22.f228260x) && tf22.f228242D == 2) {
                        ViewGroup.LayoutParams layoutParams8 = this.f200622E.getLayoutParams();
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI6 = LuckyMoneyPickEnvelopeUI.this;
                        layoutParams8.width = luckyMoneyPickEnvelopeUI6.f200537V;
                        layoutParams8.height = luckyMoneyPickEnvelopeUI6.f200538W;
                        this.f200622E.setLayoutParams(layoutParams8);
                        ViewGroup.LayoutParams layoutParams9 = this.f200630M.getLayoutParams();
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI7 = LuckyMoneyPickEnvelopeUI.this;
                        layoutParams9.width = luckyMoneyPickEnvelopeUI7.f200534S;
                        layoutParams9.height = luckyMoneyPickEnvelopeUI7.f200535T;
                        this.f200630M.setLayoutParams(layoutParams9);
                        View view10 = this.f200627J;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        View view11 = view10;
                        C117292a.m165358d(view11, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view12 = this.f200627J;
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        View view13 = view12;
                        C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view12.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view14 = this.f200622E;
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(8);
                        View view15 = view14;
                        C117292a.m165358d(view15, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f200633Q.setVisibility(8);
                this.f200640X.setVisibility(8);
                C69652n4 n4Var = new C69652n4(this, pVar2);
                C69659o4 o4Var = new C69659o4(this, pVar2);
                this.f44854d.setOnClickListener(n4Var);
                this.f44854d.setOnLongClickListener(o4Var);
                this.f200636T.setOnClickListener(n4Var);
                this.f200636T.setOnLongClickListener(o4Var);
            }
            C77994sf2 sf22 = pVar2.f200615b;
            if (sf22 != null) {
                this.f200633Q.setText(sf22.f228200d);
                if (pVar2.f200615b.f228203g != null) {
                    this.f200620C.setImageResource(C0966R.C0969drawable.cgb);
                    mo95759E(pVar2.f200615b, false);
                }
                if (this.f200618A == 0) {
                    this.f200636T.setOnClickListener(new C69500b(pVar2));
                }
                if (!Util.isNullOrNil(pVar2.f200615b.f228204h)) {
                    this.f200640X.setText(pVar2.f200615b.f228204h);
                    this.f200640X.setVisibility(0);
                } else {
                    this.f200640X.setText("");
                }
                this.f200640X.setOnTouchListener((View.OnTouchListener) null);
                this.f200640X.setClickable(false);
                if (pVar2.f200615b.f228208o == 2) {
                    this.f200641Y.setVisibility(0);
                } else {
                    this.f200641Y.setVisibility(8);
                }
                C77994sf2 sf23 = pVar2.f200615b;
                if (sf23.f228208o != 1 || Util.isNullOrNil(sf23.f228211r)) {
                    C77994sf2 sf24 = pVar2.f200615b;
                    if (sf24.f228209p == 1) {
                        this.f44854d.setSelected(false);
                        this.f200642Z.setEnabled(false);
                        this.f200640X.setVisibility(0);
                        if (!Util.isNullOrNil(pVar2.f200615b.f228210q)) {
                            this.f200640X.setText(pVar2.f200615b.f228210q);
                        }
                        mo95758D();
                    } else if (sf24.f228205i == 1) {
                        this.f44854d.setSelected(false);
                        this.f200642Z.setEnabled(false);
                        if (!Util.isNullOrNil(pVar2.f200615b.f228204h)) {
                            this.f200640X.setText(pVar2.f200615b.f228204h);
                            this.f200640X.setVisibility(0);
                        }
                        View view16 = this.f200636T;
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view17 = view16;
                        C117292a.m165358d(view17, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover2", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view16.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover2", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f200637U.setVisibility(8);
                        this.f200638V.setVisibility(8);
                        this.f200639W.setVisibility(8);
                        this.f200636T.setOnClickListener((View.OnClickListener) null);
                    } else {
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI8 = LuckyMoneyPickEnvelopeUI.this;
                        String str = sf24.f228202f;
                        int i3 = LuckyMoneyPickEnvelopeUI.f200516x0;
                        if (luckyMoneyPickEnvelopeUI8.mo95740P7(str)) {
                            this.f44854d.setSelected(false);
                            this.f200642Z.setEnabled(false);
                            this.f200640X.setText(C0966R.string.gfs);
                            this.f200640X.setVisibility(0);
                            mo95758D();
                        } else {
                            this.f200642Z.setEnabled(true);
                            if (Util.isNullOrNil(this.f200640X.getText())) {
                                this.f200640X.setVisibility(4);
                            }
                            View view18 = this.f200636T;
                            C9556a aVar9 = new C9556a();
                            aVar9.mo10233c(8);
                            View view19 = view18;
                            C117292a.m165358d(view19, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view18.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                            C117292a.m165359e(view19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else {
                    this.f200640X.setVisibility(0);
                    this.f200640X.setText(pVar2.f200615b.f228211r);
                }
                if (this.f200618A == 0) {
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI9 = LuckyMoneyPickEnvelopeUI.this;
                    if (luckyMoneyPickEnvelopeUI9.f200556t) {
                        int b2 = C76577a.m92151b(luckyMoneyPickEnvelopeUI9.getContext(), 256);
                        int b3 = C76577a.m92151b(LuckyMoneyPickEnvelopeUI.this.getContext(), v2helper.EMethodSetSpkEnhance);
                        float f = ((float) b2) * 1.0993f;
                        Math.round(f);
                        int round = (((Math.round(f * 1.72f) - b3) / 2) - C76577a.m92151b(LuckyMoneyPickEnvelopeUI.this.getContext(), 12)) + ((int) (C76577a.m92165p(MMApplicationContext.getContext()) * 1.0f));
                        RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) this.f200642Z.getLayoutParams();
                        layoutParams10.topMargin = round;
                        this.f200642Z.setLayoutParams(layoutParams10);
                        View view20 = this.f200630M;
                        if (view20 != null) {
                            RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) view20.getLayoutParams();
                            layoutParams11.topMargin = round;
                            this.f200630M.setLayoutParams(layoutParams11);
                            return;
                        }
                        return;
                    }
                    int b4 = C76577a.m92151b(luckyMoneyPickEnvelopeUI9.getContext(), 3);
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) this.f200642Z.getLayoutParams();
                    layoutParams12.topMargin = b4;
                    this.f200642Z.setLayoutParams(layoutParams12);
                    View view21 = this.f200630M;
                    if (view21 != null) {
                        RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) view21.getLayoutParams();
                        layoutParams13.topMargin = b4;
                        this.f200630M.setLayoutParams(layoutParams13);
                    }
                }
            }
        }
    }

    /* renamed from: H7 */
    public static C77994sf2 m81899H7(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, String str) {
        Iterator it = ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).iterator();
        while (it.hasNext()) {
            C69497p pVar = (C69497p) it.next();
            if (pVar.f200615b.f228202f.equals(str)) {
                return pVar.f200615b;
            }
        }
        return null;
    }

    /* renamed from: I7 */
    public static void m81900I7(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i) {
        luckyMoneyPickEnvelopeUI.getClass();
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumbMode doSelectItem newPos: %s lastSelect：%s", Integer.valueOf(i), Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u));
        if (i != luckyMoneyPickEnvelopeUI.f200557u && i >= 0 && i < ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) {
            C69497p pVar = (C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(i);
            C77994sf2 sf22 = pVar.f200615b;
            if (sf22 == null || !(sf22.f228205i == 1 || sf22.f228209p == 1)) {
                if (pVar.f200616c) {
                    luckyMoneyPickEnvelopeUI.f200557u = -2;
                } else {
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", Integer.valueOf(i));
                    int i2 = luckyMoneyPickEnvelopeUI.f200557u;
                    if (i2 >= 0 && i2 < ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) {
                        ((C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(luckyMoneyPickEnvelopeUI.f200557u)).f200614a = false;
                        luckyMoneyPickEnvelopeUI.mo95744T7(luckyMoneyPickEnvelopeUI.f200557u, false);
                    }
                    pVar.f200614a = true;
                    luckyMoneyPickEnvelopeUI.f200557u = i;
                    luckyMoneyPickEnvelopeUI.mo95744T7(i, true);
                }
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumb mode finalSelect: %s", Integer.valueOf(luckyMoneyPickEnvelopeUI.f200557u));
                return;
            }
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", Integer.valueOf(i));
            int i3 = luckyMoneyPickEnvelopeUI.f200557u;
            if (i3 >= 0 && i3 < ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) {
                ((C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(luckyMoneyPickEnvelopeUI.f200557u)).f200614a = false;
                luckyMoneyPickEnvelopeUI.mo95744T7(luckyMoneyPickEnvelopeUI.f200557u, false);
                luckyMoneyPickEnvelopeUI.f200557u = -1;
            }
        }
    }

    /* renamed from: J7 */
    public static void m81901J7(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, String str) {
        luckyMoneyPickEnvelopeUI.getClass();
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do delete show source: %s", str);
        luckyMoneyPickEnvelopeUI.f200517A = C76879j.m92721O(luckyMoneyPickEnvelopeUI.getContext(), (String) null, 3, C0966R.style.f8510l3, luckyMoneyPickEnvelopeUI.getString(C0966R.string.gas), true, false, new C69707v3(luckyMoneyPickEnvelopeUI));
        new C42513c(str).mo9225i().mo123062e(new C69722x3(luckyMoneyPickEnvelopeUI, str));
    }

    /* renamed from: K7 */
    public final void mo95735K7(C77994sf2 sf22) {
        C77994sf2 sf23;
        C77994sf2 sf24 = sf22;
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click confirm: %s", Integer.valueOf(this.f200557u));
        if (sf24 != null) {
            String str = !Util.isNullOrNil(sf24.f228202f) ? sf24.f228202f : "0";
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumbMode click confirm: %s", str);
            mo95736L7(str);
        } else {
            int i = this.f200557u;
            if (i >= 0 && i < ((ArrayList) this.f200555s).size()) {
                C69497p pVar = (C69497p) ((ArrayList) this.f200555s).get(this.f200557u);
                if (pVar.f200614a && (sf23 = pVar.f200615b) != null) {
                    String str2 = sf23.f228202f;
                    if (sf23.f228208o == 3) {
                        String str3 = sf23.f228199D;
                        int i2 = this.f200557u;
                        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do doCheckAndUseTimeLimitPromo: %s", str2);
                        this.f200517A = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gfn), true, false, new C69678r3(this));
                        new C42511a(str2, str3).mo9225i().mo123062e(new C69684s3(this, str2, i2)).mo11397F(this);
                        C115669n.INSTANCE.mo160131h(22104, pVar.f200615b.f228202f, 3);
                    } else {
                        mo95736L7(str2);
                    }
                }
            }
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(16822, 3);
        int i3 = this.f200557u;
        if (i3 >= 0 && i3 < ((ArrayList) this.f200555s).size()) {
            nVar.mo160131h(18892, 1, Integer.valueOf(this.f200558v + 1), Integer.valueOf(this.f200557u + 1), this.f200527K, ((C69497p) ((ArrayList) this.f200555s).get(this.f200557u)).f200615b.f228202f, this.f200526J, Integer.valueOf(this.f200548j.getItemCount() - 1), Integer.valueOf(mo95738N7()));
        }
    }

    /* renamed from: L7 */
    public final void mo95736L7(String str) {
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm source: %s", str);
        this.f200517A = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, false, new C69479a(this));
        C89059e i = new C42512b(str).mo9225i();
        i.mo11397F(this);
        i.mo123062e(new C69480b(str));
    }

    /* renamed from: M7 */
    public final void mo95737M7(boolean z) {
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source: %s, %s", Boolean.valueOf(z), this.f200562z);
        if (z) {
            this.f200562z = "";
        }
        this.f200517A = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, false, new C69488j(this));
        this.f200560x = true;
        C42519p g = C42519p.m46167g();
        g.f221004c = new C42516e(this.f200562z, 1);
        g.mo104792c(new C69489k(z), true);
    }

    /* renamed from: N7 */
    public final int mo95738N7() {
        return this.f200544f == 1 ? 2 : 1;
    }

    /* renamed from: O7 */
    public final void mo95739O7(boolean z) {
        boolean z2 = false;
        boolean z3 = true;
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initActionBarModeSwitch， mViewMode: %s isInitial:%s", Integer.valueOf(this.f200544f), Boolean.valueOf(z));
        if (!this.f200542d) {
            if (getSupportActionBar() == null) {
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "getSupportActionBar() == null");
                return;
            }
            View j = getSupportActionBar().mo91099j();
            if (j == null) {
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "actionBarCustomView() == null");
                return;
            }
            View findViewById = j.findViewById(C0966R.C0970id.f359398kp3);
            TextView textView = (TextView) j.findViewById(16908308);
            WeImageView weImageView = (WeImageView) j.findViewById(C0966R.C0970id.f359396kp1);
            if (findViewById == null || textView == null || weImageView == null) {
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "subview == null");
            } else if (z) {
                textView.setPadding(0, 0, 0, 0);
                textView.setTextColor(getResources().getColor(C0966R.color.FG_0));
                int b = C76577a.m92151b(MMApplicationContext.getContext(), 4);
                int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 12);
                findViewById.setPadding(b2, b, b2, b);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = -2;
                findViewById.setLayoutParams(layoutParams);
                if (C85875k4.m106211z()) {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.cqn);
                } else {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.cqo);
                }
                findViewById.setOnClickListener(new C69482d());
                findViewById.post(new C69483e(this, findViewById));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams2.height = C74942w4.m89784a(getContext(), 16);
                layoutParams2.width = C74942w4.m89784a(getContext(), 16);
                layoutParams2.rightMargin = C74942w4.m89784a(getContext(), 4);
                weImageView.setLayoutParams(layoutParams2);
                if (this.f200544f != 1) {
                    z3 = false;
                }
                weImageView.setImageDrawable(z3 ? C74933u4.m89768e(getContext(), C0966R.raw.lucky_money_pick_top_title_icon_thumb, getResources().getColor(C0966R.color.FG_0)) : C74933u4.m89768e(getContext(), C0966R.raw.lucky_money_pick_top_title_icon_normal, getResources().getColor(C0966R.color.FG_0)));
                weImageView.setVisibility(0);
            } else {
                if (this.f200544f == 1) {
                    z2 = true;
                }
                weImageView.setImageDrawable(z2 ? C74933u4.m89768e(getContext(), C0966R.raw.lucky_money_pick_top_title_icon_thumb, getResources().getColor(C0966R.color.FG_0)) : C74933u4.m89768e(getContext(), C0966R.raw.lucky_money_pick_top_title_icon_normal, getResources().getColor(C0966R.color.FG_0)));
            }
        }
    }

    /* renamed from: P7 */
    public final boolean mo95740P7(String str) {
        LinkedList<String> linkedList = this.f200522F;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        Iterator<String> it = this.f200522F.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = r0.f200615b;
     */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95741Q7() {
        /*
            r3 = this;
            int r0 = r3.f200557u
            r1 = 0
            if (r0 < 0) goto L_0x002b
            java.util.List<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p> r2 = r3.f200555s
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            if (r0 < r2) goto L_0x0010
            goto L_0x002b
        L_0x0010:
            java.util.List<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p> r0 = r3.f200555s
            int r2 = r3.f200557u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p r0 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI.C69497p) r0
            boolean r2 = r0.f200614a
            if (r2 == 0) goto L_0x002b
            te3.sf2 r0 = r0.f200615b
            if (r0 == 0) goto L_0x002b
            int r0 = r0.f228208o
            r2 = 3
            if (r0 != r2) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI.mo95741Q7():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = r0.f200615b;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95742R7() {
        /*
            r3 = this;
            int r0 = r3.f200557u
            r1 = 0
            if (r0 < 0) goto L_0x002b
            java.util.List<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p> r2 = r3.f200555s
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            if (r0 < r2) goto L_0x0010
            goto L_0x002b
        L_0x0010:
            java.util.List<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p> r0 = r3.f200555s
            int r2 = r3.f200557u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$p r0 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI.C69497p) r0
            boolean r2 = r0.f200614a
            if (r2 == 0) goto L_0x002b
            te3.sf2 r0 = r0.f200615b
            if (r0 == 0) goto L_0x002b
            int r0 = r0.f228208o
            r2 = 4
            if (r0 != r2) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI.mo95742R7():boolean");
    }

    /* renamed from: S7 */
    public final void mo95743S7() {
        C69496o oVar;
        int i;
        if ((this.f200544f == 1) && this.f200549n.getVisibility() == 0 && (oVar = this.f200553q) != null && this.f200550o != null && this.f200551p != null && (i = this.f200557u) >= 0 && i < oVar.getItemCount()) {
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumb scroll，pos: %s", Integer.valueOf(this.f200557u));
            GridLayoutManager gridLayoutManager = this.f200551p;
            int i2 = this.f200557u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(this.f200533R / 4));
            aVar.mo10233c(Integer.valueOf(i2));
            GridLayoutManager gridLayoutManager2 = gridLayoutManager;
            C117292a.m165358d(gridLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "runScrollThumb", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            gridLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(gridLayoutManager2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "runScrollThumb", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    /* renamed from: T7 */
    public final void mo95744T7(int i, boolean z) {
        C56855l lVar = (C56855l) this.f200546h.mo17023I0(i);
        C56855l lVar2 = (C56855l) this.f200550o.mo17023I0(i);
        if (lVar != null) {
            lVar.mo80272B(z);
            if (lVar instanceof C69498r) {
                C69498r rVar = (C69498r) lVar;
                ListScrollPAGView listScrollPAGView = rVar.f200628K;
                boolean z2 = true;
                if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
                    if (z) {
                        if (!(this.f200544f == 1)) {
                            C69198d0 d0Var = C69198d0.f199107a;
                            ListScrollPAGView listScrollPAGView2 = rVar.f200628K;
                            C87412m.m108594g(listScrollPAGView2, "pagView");
                            listScrollPAGView2.mo21226m();
                            listScrollPAGView2.setProgress(0.0d);
                            ((C119157j) C119157j.f356862d).mo183875f(new C69207e0(listScrollPAGView2));
                        }
                    }
                    C69198d0 d0Var2 = C69198d0.f199107a;
                    ListScrollPAGView listScrollPAGView3 = rVar.f200628K;
                    C87412m.m108594g(listScrollPAGView3, "pagView");
                    ((C119157j) C119157j.f356862d).mo183895z(new C69217g0(listScrollPAGView3));
                }
                ListScrollPAGView listScrollPAGView4 = rVar.f200623F;
                if (listScrollPAGView4 != null && listScrollPAGView4.getVisibility() == 0) {
                    if (z) {
                        if (this.f200544f != 1) {
                            z2 = false;
                        }
                        if (!z2) {
                            rVar.f200626I = false;
                            C69198d0 d0Var3 = C69198d0.f199107a;
                            ListScrollPAGView listScrollPAGView5 = rVar.f200623F;
                            C87412m.m108594g(listScrollPAGView5, "pagView");
                            listScrollPAGView5.mo21226m();
                            listScrollPAGView5.setProgress(0.0d);
                            ((C119157j) C119157j.f356862d).mo183875f(new C69207e0(listScrollPAGView5));
                        }
                    }
                    rVar.f200626I = false;
                    C69198d0 d0Var4 = C69198d0.f199107a;
                    ListScrollPAGView listScrollPAGView6 = rVar.f200623F;
                    C87412m.m108594g(listScrollPAGView6, "pagView");
                    ((C119157j) C119157j.f356862d).mo183895z(new C69217g0(listScrollPAGView6));
                }
            }
        }
        if (lVar2 != null) {
            lVar2.mo80272B(z);
        }
    }

    /* renamed from: U7 */
    public final void mo95745U7(C78007w82 w822, boolean z) {
        C78007w82 w823 = w822;
        Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "update by resp");
        this.f200559w = w823.f228347n == 1;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL2_STRING_SYNC;
        if (!Util.isNullOrNil(w823.f228345i)) {
            ArrayList arrayList = new ArrayList(Util.stringToList((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, ""), ","));
            LinkedList<String> linkedList = w823.f228346j;
            this.f200522F = linkedList;
            Iterator<String> it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String next = it.next();
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "show illegal id: %s", next);
                    z2 = true;
                }
            }
            if (z2) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Util.listToString(arrayList, ","));
                C76879j.m92711E(this, w823.f228345i, "", getString(C0966R.string.f8029zr), false, new C69664p3(this));
            }
        }
        LinkedList<C77994sf2> linkedList2 = w823.f228342f;
        if (linkedList2 != null) {
            if (linkedList2.isEmpty()) {
                View view = this.f200554r;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f200545g;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f200549n;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "updateByResp", "(Lcom/tencent/mm/protocal/protobuf/GetShowSourceResp;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "list size: %s", Integer.valueOf(w823.f228342f.size()));
                int i = -1;
                boolean z3 = !Util.isNullOrNil(this.f200528L);
                Iterator<C77994sf2> it4 = w823.f228342f.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    C77994sf2 next2 = it4.next();
                    if (next2.f228209p == 1 || next2.f228205i == 1 || mo95740P7(next2.f228202f)) {
                        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "filter unused envelope: %s", next2.f228202f);
                    } else {
                        C69497p pVar = new C69497p();
                        pVar.f200615b = next2;
                        if (z) {
                            if (!z3) {
                                boolean z4 = (next2.f228205i == 1 || next2.f228209p == 1 || mo95740P7(next2.f228202f)) ? false : true;
                                pVar.f200614a = next2.f228206j == 1 && z4;
                                if (i < 0 && z4) {
                                    i = i2;
                                }
                            } else if (next2.f228202f.equals(this.f200528L)) {
                                pVar.f200614a = true;
                            }
                            if (pVar.f200614a) {
                                this.f200557u = i2;
                            }
                        }
                        if (next2.f228208o == 3) {
                            String str = next2.f228202f;
                            this.f200529M = str;
                            C115669n.INSTANCE.mo160131h(22104, str, 1);
                        }
                        C77999tf2 tf22 = next2.f228203g;
                        if (tf22 != null && !Util.isNullOrNil(tf22.f228251o)) {
                            this.f200556t = true;
                        }
                        ((ArrayList) this.f200555s).add(pVar);
                        i2++;
                    }
                }
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "final envelopeModelList.size: %s, mSelectPos：%s, is_show_expired_entry：%s", Integer.valueOf(((ArrayList) this.f200555s).size()), Integer.valueOf(this.f200557u), Integer.valueOf(w823.f228349p));
                if (this.f200557u < 0) {
                    if (i >= 0) {
                        this.f200557u = i;
                    } else {
                        this.f200557u = 0;
                    }
                    ((C69497p) ((ArrayList) this.f200555s).get(this.f200557u)).f200614a = true;
                }
                if (w823.f228349p == 1) {
                    C69497p pVar2 = new C69497p();
                    pVar2.f200615b = new C77994sf2();
                    pVar2.f200616c = true;
                    ((ArrayList) this.f200555s).add(pVar2);
                }
                if (this.f200524H) {
                    this.f200524H = false;
                    int i3 = this.f200557u;
                    this.f200558v = i3;
                    if (i3 >= 0 && i3 < ((ArrayList) this.f200555s).size()) {
                        this.f200527K = ((C69497p) ((ArrayList) this.f200555s).get(this.f200558v)).f200615b.f228202f;
                    }
                }
            }
        }
        this.f200548j.notifyDataSetChanged();
        this.f200553q.notifyDataSetChanged();
        mo95746V7();
    }

    /* renamed from: V7 */
    public final void mo95746V7() {
        int i = this.f200557u;
        if (i == -1) {
            this.f200520D.setEnabled(false);
            this.f200520D.setText(C0966R.string.gg4);
            this.f200520D.setVisibility(0);
        } else if (i == -2) {
            if (!this.f200531P) {
                C115669n.INSTANCE.mo160131h(22302, 2);
                this.f200531P = true;
            }
            this.f200521E.setVisibility(4);
            this.f200520D.setVisibility(4);
        } else if (mo95742R7()) {
            this.f200521E.setVisibility(4);
            this.f200520D.setVisibility(4);
        } else {
            this.f200520D.setEnabled(true);
            if (mo95741Q7()) {
                this.f200520D.setText(C0966R.string.gft);
            } else {
                this.f200520D.setText(C0966R.string.gg4);
            }
            if (this.f200557u == 0) {
                this.f200521E.setVisibility(4);
            } else {
                this.f200521E.setVisibility(0);
            }
            this.f200520D.setVisibility(0);
        }
        List<C69497p> list = this.f200555s;
        if (list != null && ((ArrayList) list).isEmpty()) {
            this.f200520D.setVisibility(4);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_9;
    }

    public void initView() {
        this.f200545g = findViewById(C0966R.C0970id.og5);
        this.f200546h = (LuckyMoneyEnvelopeTouchRecyclerView) findViewById(C0966R.C0970id.g2n);
        this.f200554r = findViewById(C0966R.C0970id.g2k);
        this.f200520D = (Button) findViewById(C0966R.C0970id.g2l);
        this.f200521E = (TextView) findViewById(C0966R.C0970id.f358615nx3);
        C69496o oVar = new C69496o(0);
        this.f200548j = oVar;
        oVar.setHasStableIds(true);
        this.f200546h.setAdapter(this.f200548j);
        this.f200546h.setItemAnimator((RecyclerView.C16616j) null);
        C69485g gVar = new C69485g(this, this, 0);
        this.f200547i = gVar;
        gVar.assertNotInLayoutOrScroll((String) null);
        if (gVar.f199403Q != 0.8f) {
            gVar.f199403Q = 0.8f;
            gVar.removeAllViews();
        }
        this.f200546h.setLayoutManager(this.f200547i);
        C56850a aVar = new C56850a();
        this.f200519C = aVar;
        aVar.f162887g = this;
        aVar.mo75025b(this.f200546h);
        this.f200546h.f199954y1 = new C69486h();
        getIntent().getStringExtra("key_exchange_title");
        getIntent().getStringExtra("key_exchange_url");
        this.f200520D.setOnClickListener(new C69487i());
        String string = getResources().getString(C0966R.string.f360999n41);
        C75228t.m90253j0(this.f200521E, string, 0, string.length(), new C7092q((C7092q.C7093a) new C69570b4(this), true), getContext());
        Class cls = C32735h.class;
        int a = C76371a.m91795a(8);
        int i = C74783i3.m89537a(getContext()).f24704a;
        if (i <= 0) {
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.right - rect.left;
        }
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "calculateThumbItemSize : %s", Integer.valueOf(i));
        int i2 = (i - (a * 4)) / 3;
        this.f200532Q = i2;
        float f = (float) i2;
        int i3 = (int) (1.72f * f);
        this.f200533R = i3;
        int i4 = (int) (f / 1.0993f);
        this.f200534S = i4;
        float f2 = (float) i4;
        this.f200535T = (int) (1.656f * f2);
        this.f200536U = (int) (1.38f * f2);
        this.f200537V = i2;
        this.f200538W = i3;
        this.f200539X = (int) (f2 / 2.9f);
        this.f200549n = findViewById(C0966R.C0970id.og6);
        C69496o oVar2 = new C69496o(1);
        this.f200553q = oVar2;
        oVar2.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.og7);
        this.f200550o = recyclerView;
        recyclerView.setAdapter(this.f200553q);
        this.f200550o.setItemAnimator((RecyclerView.C16616j) null);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.f200551p = gridLayoutManager;
        gridLayoutManager.f44666B = new C69728y3(this);
        this.f200550o.mo17043c(new C69734z3(this));
        this.f200550o.setLayoutManager(this.f200551p);
        this.f200550o.mo17085h0(new C69563a4(this));
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_android_lucky_money_thumb_mode_close_config, false);
        boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_android_lucky_money_thumb_machine_close_config, false);
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initThumbMode, isOpenOldMachineCheck：%s", Boolean.valueOf(wf4));
        boolean booleanValue = ((!wf4 || Runtime.getRuntime().maxMemory() > 268435456 || Build.VERSION.SDK_INT >= 26) ? Boolean.FALSE : Boolean.TRUE).booleanValue();
        this.f200542d = wf || booleanValue;
        this.f200543e = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_android_lucky_money_thumb_mode_pag_close_config, false);
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initThumbMode, closeThumbModeConfig1 ：%s, oldMachine:%s, needCloseThumbMode:%s isCloseThumbPagView：%s", Boolean.valueOf(wf), Boolean.valueOf(booleanValue), Boolean.valueOf(this.f200542d), Boolean.valueOf(this.f200543e));
        if (this.f200542d) {
            this.f200544f = 0;
        } else {
            this.f200544f = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_PICK_UI_MODE_SWITCH_INT_SYNC, 0)).intValue();
        }
        if (this.f200544f == 1) {
            View view = this.f200549n;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f200545g;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = this.f200545g;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f200549n;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo95739O7(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1 && intent != null) {
            C77994sf2 sf22 = new C77994sf2();
            sf22.f228202f = intent.getStringExtra("key_source_materialId");
            sf22.f228208o = intent.getIntExtra("key_source_material_flag", 0);
            sf22.f228199D = intent.getStringExtra("key_source_timelimit_promo_signature");
            mo95735K7(sf22);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        C78007w82 f;
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
        initView();
        setMMTitle((int) C0966R.string.gic);
        this.f200530N = Util.currentTicks();
        getIntent().getByteArrayExtra("key_source_resp");
        boolean booleanExtra = getIntent().getBooleanExtra("key_has_source", true);
        boolean z = false;
        this.f200525I = Boolean.valueOf(getIntent().getBooleanExtra("key_has_reddot", false));
        this.f200526J = getIntent().getStringExtra("key_session_id");
        String stringExtra = getIntent().getStringExtra("key_exchange_url");
        this.f200528L = getIntent().getStringExtra("packetId");
        HashMap<String, Long> hashMap = C69242l1.f199264a;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_android_lucky_money_dynamic_pick_close_switch, false);
        Log.m105925i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigPick：%s ", Boolean.valueOf(wf));
        this.f200540Y = wf;
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "onCreate scroll packageid: %s", this.f200528L);
        if (booleanExtra) {
            boolean booleanExtra2 = getIntent().getBooleanExtra("key_has_resp", false);
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "onCreate hasResp: %s", Boolean.valueOf(booleanExtra2));
            if (booleanExtra2 && (f = C42519p.m46167g().mo66604a()) != null && f.f228340d == 0) {
                this.f200562z = f.f228343g;
                this.f200561y = f.f228344h;
                mo95745U7(f, true);
                this.f200546h.post(new C69671q3(this));
                mo95743S7();
                z = true;
            }
            if (!z) {
                mo95737M7(true);
            }
        } else {
            this.f200559w = false;
            this.f200561y = 0;
            this.f200557u = 0;
            C69497p pVar = new C69497p();
            pVar.f200614a = true;
            C77994sf2 sf22 = new C77994sf2();
            pVar.f200615b = sf22;
            sf22.f228202f = "0";
            sf22.f228200d = getString(C0966R.string.gf6);
            ((ArrayList) this.f200555s).add(pVar);
            this.f200548j.notifyDataSetChanged();
            this.f200553q.notifyDataSetChanged();
        }
        setBackBtn(new C69481c());
        if (!Util.isNullOrNil(stringExtra)) {
            addTextOptionMenu(1, getString(C0966R.string.gfm), C76577a.m92153d(getContext(), C0966R.color.a1g), (MenuItem.OnMenuItemClickListener) new C69484f(stringExtra));
        }
        mo95746V7();
        this.f200541Z.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f200541Z.dead();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}

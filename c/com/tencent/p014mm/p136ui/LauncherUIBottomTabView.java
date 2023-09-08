package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct;
import com.tencent.p014mm.p136ui.C74809q;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import jw2.C99069d;
import kg3.C76577a;
import p626nv.C109759g;
import p919sl.C77724a;
import te3.tg4;

/* renamed from: com.tencent.mm.ui.LauncherUIBottomTabView */
public class LauncherUIBottomTabView extends RelativeLayout implements C74809q {

    /* renamed from: K */
    public static int f214353K = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd));

    /* renamed from: L */
    public static int f214354L = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a6l));

    /* renamed from: A */
    public Context f214355A;

    /* renamed from: B */
    public View.OnClickListener f214356B = new C73069a();

    /* renamed from: C */
    public MMHandler f214357C = new C73070b();

    /* renamed from: D */
    public LinearLayout f214358D;

    /* renamed from: E */
    public int f214359E = 0;

    /* renamed from: F */
    public int f214360F = 0;

    /* renamed from: G */
    public int f214361G = 0;

    /* renamed from: H */
    public boolean f214362H = false;

    /* renamed from: I */
    public int f214363I = 0;

    /* renamed from: J */
    public boolean f214364J = false;

    /* renamed from: d */
    public int f214365d = 0;

    /* renamed from: e */
    public C74809q.C45035a f214366e;

    /* renamed from: f */
    public C73071c f214367f;

    /* renamed from: g */
    public C73071c f214368g;

    /* renamed from: h */
    public C73071c f214369h;

    /* renamed from: i */
    public C73071c f214370i;

    /* renamed from: j */
    public int f214371j = 0;

    /* renamed from: n */
    public int f214372n;

    /* renamed from: o */
    public int f214373o;

    /* renamed from: p */
    public int f214374p;

    /* renamed from: q */
    public int f214375q = 0;

    /* renamed from: r */
    public int f214376r;

    /* renamed from: s */
    public int f214377s;

    /* renamed from: t */
    public int f214378t;

    /* renamed from: u */
    public int f214379u;

    /* renamed from: v */
    public int f214380v;

    /* renamed from: w */
    public int f214381w;

    /* renamed from: x */
    public long f214382x = 0;

    /* renamed from: y */
    public int f214383y = -1;

    /* renamed from: z */
    public int f214384z = 0;

    /* renamed from: com.tencent.mm.ui.LauncherUIBottomTabView$a */
    public class C73069a implements View.OnClickListener {
        public C73069a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            if (LauncherUIBottomTabView.this.f214383y == intValue && intValue == 0 && System.currentTimeMillis() - LauncherUIBottomTabView.this.f214382x <= 300) {
                Log.m105926v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
                LauncherUIBottomTabView.this.f214357C.removeMessages(0);
                ((C77724a) MvvmEventCenter.getEvent(C77724a.class)).publish(Integer.valueOf(LauncherUIBottomTabView.this.f214359E));
                LauncherUIBottomTabView.this.f214382x = System.currentTimeMillis();
                LauncherUIBottomTabView.this.f214383y = intValue;
                C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (intValue == 0) {
                DoubleClickWechatReportStruct doubleClickWechatReportStruct = new DoubleClickWechatReportStruct();
                doubleClickWechatReportStruct.f194195d = 1;
                doubleClickWechatReportStruct.f194196e = (long) LauncherUIBottomTabView.this.f214359E;
                doubleClickWechatReportStruct.f194197f = 0;
                doubleClickWechatReportStruct.f194198g = doubleClickWechatReportStruct.mo86045b("UserName", "", true);
                doubleClickWechatReportStruct.mo86054n();
            }
            LauncherUIBottomTabView launcherUIBottomTabView = LauncherUIBottomTabView.this;
            if (launcherUIBottomTabView.f214366e != null) {
                if (intValue == 0 && launcherUIBottomTabView.f214383y == 0) {
                    Log.m105926v("MicroMsg.LauncherUITabView", "do double click check");
                    LauncherUIBottomTabView.this.f214357C.sendEmptyMessageDelayed(0, 300);
                } else {
                    Log.m105926v("MicroMsg.LauncherUITabView", "directly dispatch tab click event");
                    LauncherUIBottomTabView.this.f214382x = System.currentTimeMillis();
                    LauncherUIBottomTabView launcherUIBottomTabView2 = LauncherUIBottomTabView.this;
                    launcherUIBottomTabView2.f214383y = intValue;
                    launcherUIBottomTabView2.f214366e.onTabClick(intValue);
                    C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            LauncherUIBottomTabView.this.f214382x = System.currentTimeMillis();
            LauncherUIBottomTabView.this.f214383y = intValue;
            Log.m105929w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", (Integer) view.getTag());
            C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUIBottomTabView$b */
    public class C73070b extends MMHandler {
        public C73070b() {
        }

        public void handleMessage(Message message) {
            Log.m105926v("MicroMsg.LauncherUITabView", "onMainTabClick");
            LauncherUIBottomTabView.this.f214366e.onTabClick(0);
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUIBottomTabView$c */
    public class C73071c implements C115619a {

        /* renamed from: d */
        public View f214387d;

        /* renamed from: e */
        public TabIconView f214388e;

        /* renamed from: f */
        public TextView f214389f;

        /* renamed from: g */
        public TextView f214390g;

        /* renamed from: h */
        public ImageView f214391h;

        /* renamed from: i */
        public String f214392i;

        public C73071c() {
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f214387d;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            int i = 4;
            this.f214390g.setVisibility(4);
            ImageView imageView = this.f214391h;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            if (z) {
                int i = tg4.f354435d;
                if (i > 99) {
                    this.f214390g.setText("");
                    this.f214390g.setBackgroundResource(C0966R.raw.badge_count_more);
                    this.f214390g.setTextSize(0, (float) C76577a.m92155f(LauncherUIBottomTabView.this.getContext(), C0966R.dimen.ary));
                    this.f214390g.setVisibility(0);
                    this.f214391h.setVisibility(4);
                    return true;
                }
                this.f214390g.setText(String.valueOf(i));
                this.f214390g.setTextSize(0, ((float) C76577a.m92155f(LauncherUIBottomTabView.this.getContext(), C0966R.dimen.ary)) * C76577a.m92161l(LauncherUIBottomTabView.this.getContext()));
                this.f214390g.setVisibility(0);
                this.f214390g.setBackgroundResource(C45081s1.m49933b(LauncherUIBottomTabView.this.getContext(), tg4.f354435d));
                this.f214391h.setVisibility(4);
                return true;
            }
            this.f214390g.setText("");
            this.f214390g.setVisibility(4);
            return true;
        }

        public String getPath() {
            return this.f214392i;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            if (z) {
                this.f214390g.setText(LauncherUIBottomTabView.this.getResources().getString(C0966R.string.k66));
                this.f214390g.setBackgroundResource(C0966R.C0969drawable.ake);
                this.f214390g.setTextSize(0, (float) C76577a.m92155f(LauncherUIBottomTabView.this.getContext(), C0966R.dimen.f3694bn));
                this.f214390g.setVisibility(0);
                this.f214391h.setVisibility(4);
                return true;
            }
            this.f214390g.setText("");
            this.f214390g.setVisibility(4);
            return true;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            C115624i.m162566b(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return C115624i.m162576l(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    public LauncherUIBottomTabView(Context context) {
        super(context);
        this.f214355A = context;
        mo101394c();
    }

    private void setFriendUnreadMargin(int i) {
        Log.m105924i("MicroMsg.LauncherUITabView", "setFriendUnreadMargin: leftMargin:" + i);
        TextView textView = this.f214368g.f214390g;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
                this.f214368g.f214390g.setLayoutParams(layoutParams);
            }
        }
    }

    private void setTextBold(boolean z) {
        TextView textView;
        Log.m105924i("MicroMsg.LauncherUITabView", "setTextBold: isBold:" + z);
        C73071c cVar = this.f214368g;
        if (cVar != null && (textView = cVar.f214390g) != null) {
            if (z) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            } else {
                C85875k4.m106193l0(textView.getPaint());
            }
        }
    }

    /* renamed from: a */
    public void mo69852a(boolean z) {
        C73071c cVar = this.f214370i;
        cVar.getClass();
        if (!C115624i.m162576l(z, cVar)) {
            C99069d dVar = C99069d.f290418a;
            C99069d.f290432o = z ? 1 : 0;
            this.f214364J = z;
            int i = 4;
            this.f214370i.f214390g.setVisibility(4);
            ImageView imageView = this.f214370i.f214391h;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            C73071c cVar2 = this.f214370i;
            C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
            cVar2.getClass();
            C115624i.m162566b(cVar2, nVar, z);
        }
    }

    /* renamed from: b */
    public final C73071c mo101393b(int i, ViewGroup viewGroup) {
        C73071c cVar = new C73071c();
        if (C76577a.m92148D(getContext())) {
            cVar.f214387d = LayoutInflater.from((Activity) getContext()).inflate(C0966R.C0971layout.bc8, (ViewGroup) null);
        } else {
            cVar.f214387d = LayoutInflater.from((Activity) getContext()).inflate(C0966R.C0971layout.bc7, (ViewGroup) null);
        }
        cVar.f214388e = (TabIconView) cVar.f214387d.findViewById(C0966R.C0970id.f2a);
        cVar.f214389f = (TextView) cVar.f214387d.findViewById(C0966R.C0970id.f2s);
        TextView textView = (TextView) cVar.f214387d.findViewById(C0966R.C0970id.l0c);
        cVar.f214390g = textView;
        textView.setBackgroundResource(C45081s1.m49932a(getContext()));
        cVar.f214391h = (ImageView) cVar.f214387d.findViewById(C0966R.C0970id.c97);
        cVar.f214387d.setTag(Integer.valueOf(i));
        cVar.f214387d.setOnClickListener(this.f214356B);
        cVar.f214389f.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3964lm)) * C76577a.m92161l(getContext()));
        return cVar;
    }

    /* renamed from: c */
    public final void mo101394c() {
        Class cls = C109759g.class;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f214358D = linearLayout;
        linearLayout.setBackgroundColor(getResources().getColor(C0966R.color.f2928b));
        this.f214358D.setOrientation(0);
        addView(this.f214358D, new RelativeLayout.LayoutParams(-1, -2));
        this.f214384z = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f3683bc)) * C76577a.m92161l(getContext()));
        LinearLayout linearLayout2 = this.f214358D;
        C73071c b = mo101393b(0, linearLayout2);
        b.f214389f.setText(C0966R.string.gmq);
        b.f214389f.setTextColor(getResources().getColor(C0966R.color.FG_0));
        b.f214388e.mo101561a(C0966R.raw.icons_filled_chats_hl, C0966R.raw.icons_outlined_chats_middle, C0966R.raw.icons_outlined_chats, C76577a.m92148D(getContext()));
        b.f214390g.setVisibility(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.f214384z);
        layoutParams.weight = 1.0f;
        linearLayout2.addView(b.f214387d, layoutParams);
        this.f214367f = b;
        LinearLayout linearLayout3 = this.f214358D;
        C73071c b2 = mo101393b(1, linearLayout3);
        b2.f214389f.setText(C0966R.string.glk);
        b2.f214389f.setTextColor(getResources().getColor(C0966R.color.FG_0));
        b2.f214388e.mo101561a(C0966R.raw.icons_filled_contacts_hl, C0966R.raw.icons_outlined_contacts_middle, C0966R.raw.icons_outlined_contacts, C76577a.m92148D(getContext()));
        b2.f214390g.setVisibility(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, this.f214384z);
        layoutParams2.weight = 1.0f;
        linearLayout3.addView(b2.f214387d, layoutParams2);
        this.f214369h = b2;
        LinearLayout linearLayout4 = this.f214358D;
        C73071c b3 = mo101393b(2, linearLayout4);
        b3.f214389f.setText(C0966R.string.gli);
        b3.f214389f.setTextColor(getResources().getColor(C0966R.color.FG_0));
        b3.f214388e.mo101561a(C0966R.raw.icons_filled_discover_hl, C0966R.raw.icons_outlined_discover_middle, C0966R.raw.icons_outlined_discover, C76577a.m92148D(getContext()));
        b3.f214390g.setVisibility(4);
        b3.f214392i = "discovery";
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(b3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, this.f214384z);
        layoutParams3.weight = 1.0f;
        linearLayout4.addView(b3.f214387d, layoutParams3);
        this.f214368g = b3;
        LinearLayout linearLayout5 = this.f214358D;
        C73071c b4 = mo101393b(3, linearLayout5);
        b4.f214389f.setText(C0966R.string.gmk);
        b4.f214389f.setTextColor(getResources().getColor(C0966R.color.FG_0));
        b4.f214388e.mo101561a(C0966R.raw.icons_filled_me_hl, C0966R.raw.icons_outlined_me, C0966R.raw.icons_outlined_me, C76577a.m92148D(getContext()));
        b4.f214390g.setVisibility(4);
        b4.f214392i = "me";
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(b4);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, this.f214384z);
        layoutParams4.weight = 1.0f;
        linearLayout5.addView(b4.f214387d, layoutParams4);
        this.f214370i = b4;
        int color = getResources().getColor(C0966R.color.a6y);
        this.f214371j = color;
        this.f214372n = (color & 16711680) >> 16;
        this.f214373o = (color & 65280) >> 8;
        this.f214374p = color & 255;
        int color2 = getResources().getColor(C0966R.color.FG_0);
        this.f214375q = color2;
        int i = (16711680 & color2) >> 16;
        this.f214376r = i;
        int i2 = (65280 & color2) >> 8;
        this.f214377s = i2;
        int i3 = color2 & 255;
        this.f214378t = i3;
        this.f214379u = this.f214372n - i;
        this.f214380v = this.f214373o - i2;
        this.f214381w = this.f214374p - i3;
    }

    /* renamed from: d */
    public final void mo101395d(int i) {
        C73071c cVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : this.f214370i : this.f214368g : this.f214369h : this.f214367f;
        if (cVar != null) {
            try {
                String trim = cVar.f214390g.getText().toString().trim();
                WeChatTabRedDotEvent weChatTabRedDotEvent = new WeChatTabRedDotEvent();
                WeChatTabRedDotEvent.C28853a aVar = weChatTabRedDotEvent.f79062d;
                aVar.f79063a = i;
                aVar.f79065c = Util.getInt(trim, 0);
                weChatTabRedDotEvent.f79062d.f79064b = cVar.f214391h.getVisibility() == 0;
                weChatTabRedDotEvent.publish();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LauncherUITabView", e, "notify tab reddot tabIndex [%d]", Integer.valueOf(i));
            }
        }
    }

    /* renamed from: e */
    public final void mo101396e() {
        View view = this.f214367f.f214387d;
        Boolean bool = Boolean.FALSE;
        view.setTag(C0966R.C0970id.f358507fj2, bool);
        this.f214367f.f214387d.setSelected(false);
        this.f214368g.f214387d.setTag(C0966R.C0970id.f358507fj2, bool);
        this.f214368g.f214387d.setSelected(false);
        this.f214369h.f214387d.setTag(C0966R.C0970id.f358507fj2, bool);
        this.f214369h.f214387d.setSelected(false);
        this.f214370i.f214387d.setTag(C0966R.C0970id.f358507fj2, bool);
        this.f214370i.f214387d.setSelected(false);
    }

    /* renamed from: f */
    public void mo101397f(boolean z) {
        C73071c cVar = this.f214368g;
        cVar.getClass();
        if (!C115624i.m162576l(z, cVar)) {
            if (!z || this.f214368g.f214390g.getVisibility() != 0) {
                this.f214362H = z;
                setFriendUnreadMargin(-f214353K);
                int i = 0;
                setTextBold(false);
                this.f214368g.f214390g.setVisibility(4);
                ImageView imageView = this.f214368g.f214391h;
                if (!z) {
                    i = 4;
                }
                imageView.setVisibility(i);
                C73071c cVar2 = this.f214368g;
                C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
                cVar2.getClass();
                C115624i.m162566b(cVar2, nVar, z);
                mo101395d(2);
                return;
            }
            Log.m105924i("MicroMsg.LauncherUITabView", "unreadTV is VISIBLE just return!");
        }
    }

    /* renamed from: g */
    public void mo101398g(boolean z, String str) {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_COUNTER;
        C73071c cVar = this.f214368g;
        cVar.getClass();
        if (!C115624i.m162576l(z, cVar)) {
            Log.m105924i("MicroMsg.LauncherUITabView", "showFriendTextPoint show:" + z + " text:" + str);
            if (!z || TextUtils.isEmpty(str)) {
                setTextBold(false);
                this.f214368g.f214390g.setText("");
                this.f214368g.f214390g.setVisibility(4);
                int i = this.f214361G;
                if (i > 0) {
                    mo101401i(i);
                } else {
                    C73071c cVar2 = this.f214368g;
                    cVar2.getClass();
                    C115624i.m162566b(cVar2, nVar, false);
                    boolean z2 = this.f214362H;
                    if (z2) {
                        mo101397f(z2);
                    }
                }
            } else {
                this.f214368g.f214390g.setText(str);
                this.f214368g.f214390g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.ary)) * C76577a.m92161l(getContext()));
                this.f214368g.f214390g.setVisibility(0);
                this.f214368g.f214390g.setBackgroundResource(C45081s1.m49933b(getContext(), 20));
                this.f214368g.f214391h.setVisibility(4);
                if (C76577a.m92148D(this.f214355A)) {
                    setFriendUnreadMargin(-f214354L);
                } else {
                    setFriendUnreadMargin(-f214353K);
                }
                setTextBold(true);
                C73071c cVar3 = this.f214368g;
                cVar3.getClass();
                C115624i.m162566b(cVar3, nVar, true);
            }
            mo101395d(2);
        }
    }

    public int getContactTabUnread() {
        return this.f214360F;
    }

    public int getCurIdx() {
        return this.f214365d;
    }

    public int getFriendTabUnread() {
        return this.f214361G;
    }

    public TextView getFriendUnreadCountView() {
        return this.f214368g.f214390g;
    }

    public int getMainTabUnread() {
        return this.f214359E;
    }

    public boolean getSettingsPoint() {
        return this.f214364J;
    }

    public int getSettingsTabUnread() {
        return this.f214363I;
    }

    public boolean getShowFriendPoint() {
        return this.f214362H;
    }

    /* renamed from: h */
    public void mo101400h(int i) {
        this.f214360F = i;
        if (i <= 0) {
            this.f214369h.f214390g.setText("");
            this.f214369h.f214390g.setVisibility(4);
        } else if (i > 99) {
            this.f214369h.f214390g.setText("");
            this.f214369h.f214390g.setBackgroundResource(C0966R.raw.badge_count_more);
            this.f214369h.f214390g.setTextSize(0, (float) C76577a.m92155f(getContext(), C0966R.dimen.ary));
            this.f214369h.f214390g.setVisibility(0);
            this.f214369h.f214391h.setVisibility(4);
        } else {
            this.f214369h.f214390g.setText(String.valueOf(i));
            this.f214369h.f214390g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.ary)) * C76577a.m92161l(getContext()));
            this.f214369h.f214390g.setBackgroundResource(C45081s1.m49933b(getContext(), i));
            this.f214369h.f214390g.setVisibility(0);
            this.f214369h.f214391h.setVisibility(4);
        }
        mo101395d(1);
    }

    /* renamed from: i */
    public void mo101401i(int i) {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_COUNTER;
        this.f214361G = i;
        C73071c cVar = this.f214368g;
        boolean z = i > 0;
        cVar.getClass();
        if (!C115624i.m162576l(z, cVar)) {
            setFriendUnreadMargin(-f214353K);
            setTextBold(false);
            if (i > 0) {
                if (i > 99) {
                    this.f214368g.f214390g.setText("");
                    this.f214368g.f214390g.setBackgroundResource(C0966R.raw.badge_count_more);
                    this.f214368g.f214390g.setTextSize(0, (float) C76577a.m92155f(getContext(), C0966R.dimen.ary));
                    this.f214368g.f214390g.setVisibility(0);
                    this.f214368g.f214391h.setVisibility(4);
                } else {
                    this.f214368g.f214390g.setText(String.valueOf(i));
                    this.f214368g.f214390g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.ary)) * C76577a.m92161l(getContext()));
                    this.f214368g.f214390g.setVisibility(0);
                    this.f214368g.f214390g.setBackgroundResource(C45081s1.m49933b(getContext(), i));
                    this.f214368g.f214391h.setVisibility(4);
                }
                C73071c cVar2 = this.f214368g;
                cVar2.getClass();
                C115624i.m162566b(cVar2, nVar, true);
            } else {
                this.f214368g.f214390g.setText("");
                this.f214368g.f214390g.setVisibility(4);
                C73071c cVar3 = this.f214368g;
                cVar3.getClass();
                C115624i.m162566b(cVar3, nVar, false);
            }
            mo101395d(2);
        }
    }

    /* renamed from: j */
    public void mo101402j(int i) {
        Log.m105925i("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", Integer.valueOf(i));
        this.f214359E = i;
        if (i <= 0) {
            this.f214367f.f214390g.setText("");
            this.f214367f.f214390g.setVisibility(4);
        } else if (i > 99) {
            this.f214367f.f214390g.setText("");
            this.f214367f.f214390g.setBackgroundResource(C0966R.raw.badge_count_more);
            this.f214367f.f214390g.setTextSize(0, (float) C76577a.m92155f(getContext(), C0966R.dimen.ary));
            this.f214367f.f214390g.setVisibility(0);
            this.f214367f.f214390g.setContentDescription(getContext().getString(C0966R.string.k6u));
            this.f214367f.f214391h.setVisibility(4);
        } else {
            this.f214367f.f214390g.setText(String.valueOf(i));
            this.f214367f.f214390g.setBackgroundResource(C45081s1.m49933b(getContext(), i));
            this.f214367f.f214390g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.ary)) * C76577a.m92161l(getContext()));
            this.f214367f.f214390g.setVisibility(0);
            this.f214367f.f214390g.setContentDescription((CharSequence) null);
            this.f214367f.f214391h.setVisibility(4);
        }
        mo101395d(0);
    }

    /* renamed from: k */
    public void mo101403k(int i) {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_COUNTER;
        this.f214363I = i;
        C73071c cVar = this.f214370i;
        boolean z = i > 0;
        cVar.getClass();
        if (!C115624i.m162576l(z, cVar)) {
            if (i > 0) {
                if (i > 99) {
                    this.f214370i.f214390g.setText("");
                    this.f214370i.f214390g.setBackgroundResource(C0966R.raw.badge_count_more);
                    this.f214370i.f214390g.setTextSize(0, (float) C76577a.m92155f(getContext(), C0966R.dimen.ary));
                    this.f214370i.f214390g.setVisibility(0);
                    this.f214370i.f214391h.setVisibility(4);
                } else {
                    this.f214370i.f214390g.setText(String.valueOf(i));
                    this.f214370i.f214390g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.ary)) * C76577a.m92161l(getContext()));
                    this.f214370i.f214390g.setVisibility(0);
                    this.f214370i.f214390g.setBackgroundResource(C45081s1.m49933b(getContext(), i));
                    this.f214370i.f214391h.setVisibility(4);
                }
                C73071c cVar2 = this.f214370i;
                cVar2.getClass();
                C115624i.m162566b(cVar2, nVar, true);
            } else {
                this.f214370i.f214390g.setText("");
                this.f214370i.f214390g.setVisibility(4);
                C73071c cVar3 = this.f214370i;
                cVar3.getClass();
                C115624i.m162566b(cVar3, nVar, false);
            }
            mo101395d(3);
        }
    }

    public void setOnTabClickListener(C74809q.C45035a aVar) {
        this.f214366e = aVar;
    }

    public void setTo(int i) {
        this.f214365d = i;
        if (i == 0) {
            this.f214367f.f214388e.setFocusAlpha(255);
            this.f214368g.f214388e.setFocusAlpha(0);
            this.f214369h.f214388e.setFocusAlpha(0);
            this.f214370i.f214388e.setFocusAlpha(0);
            this.f214367f.f214389f.setTextColor(this.f214371j);
            this.f214368g.f214389f.setTextColor(this.f214375q);
            this.f214369h.f214389f.setTextColor(this.f214375q);
            this.f214370i.f214389f.setTextColor(this.f214375q);
            mo101396e();
            this.f214367f.f214387d.setTag(C0966R.C0970id.f358507fj2, Boolean.TRUE);
            this.f214367f.f214387d.setSelected(true);
        } else if (i == 1) {
            this.f214367f.f214388e.setFocusAlpha(0);
            this.f214368g.f214388e.setFocusAlpha(0);
            this.f214369h.f214388e.setFocusAlpha(255);
            this.f214370i.f214388e.setFocusAlpha(0);
            this.f214367f.f214389f.setTextColor(this.f214375q);
            this.f214368g.f214389f.setTextColor(this.f214375q);
            this.f214369h.f214389f.setTextColor(this.f214371j);
            this.f214370i.f214389f.setTextColor(this.f214375q);
            mo101396e();
            this.f214369h.f214387d.setTag(C0966R.C0970id.f358507fj2, Boolean.TRUE);
            this.f214369h.f214387d.setSelected(true);
        } else if (i == 2) {
            this.f214367f.f214388e.setFocusAlpha(0);
            this.f214368g.f214388e.setFocusAlpha(255);
            this.f214369h.f214388e.setFocusAlpha(0);
            this.f214370i.f214388e.setFocusAlpha(0);
            this.f214367f.f214389f.setTextColor(this.f214375q);
            this.f214368g.f214389f.setTextColor(this.f214371j);
            this.f214369h.f214389f.setTextColor(this.f214375q);
            this.f214370i.f214389f.setTextColor(this.f214375q);
            mo101396e();
            this.f214368g.f214387d.setTag(C0966R.C0970id.f358507fj2, Boolean.TRUE);
            this.f214368g.f214387d.setSelected(true);
        } else if (i == 3) {
            this.f214367f.f214388e.setFocusAlpha(0);
            this.f214368g.f214388e.setFocusAlpha(0);
            this.f214369h.f214388e.setFocusAlpha(0);
            this.f214370i.f214388e.setFocusAlpha(255);
            this.f214367f.f214389f.setTextColor(this.f214375q);
            this.f214368g.f214389f.setTextColor(this.f214375q);
            this.f214369h.f214389f.setTextColor(this.f214375q);
            this.f214370i.f214389f.setTextColor(this.f214371j);
            mo101396e();
            this.f214370i.f214387d.setTag(C0966R.C0970id.f358507fj2, Boolean.TRUE);
            this.f214370i.f214387d.setSelected(true);
        }
        this.f214382x = System.currentTimeMillis();
        this.f214383y = this.f214365d;
    }

    public LauncherUIBottomTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214355A = context;
        mo101394c();
    }

    public LauncherUIBottomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214355A = context;
        mo101394c();
    }
}

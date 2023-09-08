package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.p136ui.tools.C74850p1;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p287zz.C16418h;
import p287zz.C79442f;
import p626nv.C109759g;
import te3.C50244lc3;
import te3.tg4;

/* renamed from: com.tencent.mm.ui.f3 */
public class C74755f3 extends C74850p1 implements C11385n {

    /* renamed from: w */
    public static final int[] f219816w = {2, 1, 10, 20};

    /* renamed from: x */
    public static final int[] f219817x = {2, 1, 10};

    /* renamed from: y */
    public static final int[] f219818y = {2, 1, 10};

    /* renamed from: q */
    public LayoutInflater f219819q;

    /* renamed from: r */
    public C74758c f219820r;

    /* renamed from: s */
    public SparseArray<C74760e> f219821s;

    /* renamed from: t */
    public Context f219822t;

    /* renamed from: u */
    public C73155b3 f219823u = null;

    /* renamed from: v */
    public boolean f219824v;

    /* renamed from: com.tencent.mm.ui.f3$a */
    public class C74756a implements DialogInterface.OnClickListener {
        public C74756a(C74755f3 f3Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.PlusSubMenuHelper", "onDialogClick() ");
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$b */
    public class C74757b implements DialogInterface.OnClickListener {
        public C74757b(C74755f3 f3Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.PlusSubMenuHelper", "onDialogClick() ");
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$c */
    public class C74758c extends BaseAdapter {
        public C74758c(C73248c3 c3Var) {
        }

        public int getCount() {
            return C74755f3.this.f219821s.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C74755f3 f3Var = C74755f3.this;
            C74762g gVar = new C74762g(f3Var.f219822t, C74755f3.this.f219821s.get(i));
            LayoutInflater layoutInflater = f3Var.f219819q;
            boolean z = i == getCount() - 1;
            View inflate = layoutInflater.inflate(C0966R.C0971layout.bfl, viewGroup, false);
            gVar.f219839f = inflate;
            gVar.f219840g = (TextView) inflate.findViewById(C0966R.C0970id.knx);
            gVar.f219841h = (ImageView) gVar.f219839f.findViewById(C0966R.C0970id.f15);
            gVar.f219842i = (TextView) gVar.f219839f.findViewById(C0966R.C0970id.hdx);
            gVar.f219843j = (TextView) gVar.f219839f.findViewById(C0966R.C0970id.l07);
            gVar.f219844n = gVar.f219839f.findViewById(C0966R.C0970id.hbo);
            if (!Util.isNullOrNil(gVar.f219838e.f219831b.f219832a)) {
                gVar.f219840g.setText(gVar.f219838e.f219831b.f219832a);
            }
            if (gVar.f219838e.f219831b.f219835d > 0) {
                gVar.f219840g.setTextColor(C76577a.m92153d(MMApplicationContext.getContext(), gVar.f219838e.f219831b.f219835d));
            }
            if (gVar.f219838e.f219831b.f219833b > 0) {
                gVar.f219841h.setVisibility(0);
                gVar.f219841h.setImageResource(gVar.f219838e.f219831b.f219833b);
            } else {
                gVar.f219841h.setVisibility(8);
            }
            gVar.f219838e.f219831b.getClass();
            if (!Util.isNullOrNil("")) {
                ImageView imageView = gVar.f219841h;
                gVar.f219838e.f219831b.getClass();
                imageView.setContentDescription("");
            }
            gVar.f219843j.setBackgroundResource(C45081s1.m49932a(gVar.f219837d));
            if (z) {
                gVar.f219839f.setBackgroundResource(C0966R.C0969drawable.avo);
            } else {
                gVar.f219839f.setBackgroundResource(C0966R.C0969drawable.avn);
            }
            gVar.f219842i.setTextSize(0, (float) C76577a.m92155f(gVar.f219837d, C0966R.dimen.arz));
            C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
            gVar.f219838e.getClass();
            gVar.f219838e.getClass();
            if (!C115624i.m162576l(gVar.f219838e.f219830a, gVar)) {
                gVar.f219838e.getClass();
                gVar.f219838e.getClass();
                if (gVar.f219838e.f219830a) {
                    View view2 = gVar.f219844n;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C115624i.m162566b(gVar, nVar, true);
                } else {
                    gVar.f219842i.setVisibility(8);
                    gVar.f219843j.setVisibility(8);
                    View view4 = gVar.f219844n;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C115624i.m162566b(gVar, C115631n.MMNEWTIPS_SHOWTYPE_NEW, false);
                    C115624i.m162566b(gVar, C115631n.MMNEWTIPS_SHOWTYPE_COUNTER, false);
                    C115624i.m162566b(gVar, nVar, false);
                }
            }
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(gVar);
            return gVar.f219839f;
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$d */
    public static class C74759d {

        /* renamed from: a */
        public int f219826a;

        /* renamed from: b */
        public int f219827b;

        /* renamed from: c */
        public int f219828c;

        /* renamed from: d */
        public int f219829d;

        public C74759d(int i, int i2, int i3, int i4) {
            this.f219826a = i;
            this.f219827b = i2;
            this.f219828c = i3;
            this.f219829d = i4;
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$e */
    public static class C74760e {

        /* renamed from: a */
        public boolean f219830a = false;

        /* renamed from: b */
        public C74761f f219831b;

        public C74760e(C74761f fVar) {
            this.f219831b = fVar;
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$f */
    public static class C74761f {

        /* renamed from: a */
        public String f219832a;

        /* renamed from: b */
        public int f219833b;

        /* renamed from: c */
        public int f219834c;

        /* renamed from: d */
        public int f219835d;

        /* renamed from: e */
        public String f219836e;

        public C74761f(int i, String str, String str2, int i2, int i3) {
            this(i, str, str2, i2, i3, "");
        }

        public C74761f(int i, String str, String str2, int i2, int i3, String str3) {
            this.f219832a = str;
            this.f219833b = i2;
            this.f219834c = i;
            this.f219835d = i3;
            this.f219836e = str3;
        }
    }

    /* renamed from: com.tencent.mm.ui.f3$g */
    public static class C74762g implements C115619a {

        /* renamed from: d */
        public Context f219837d;

        /* renamed from: e */
        public C74760e f219838e;

        /* renamed from: f */
        public View f219839f;

        /* renamed from: g */
        public TextView f219840g;

        /* renamed from: h */
        public ImageView f219841h;

        /* renamed from: i */
        public TextView f219842i;

        /* renamed from: j */
        public TextView f219843j;

        /* renamed from: n */
        public View f219844n;

        public C74762g(Context context, C74760e eVar) {
            this.f219837d = context;
            this.f219838e = eVar;
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f219839f;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                View view = this.f219844n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            View view3 = this.f219844n;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            if (z) {
                this.f219843j.setVisibility(0);
                if (tg4.f354435d > 99) {
                    this.f219843j.setText("");
                    this.f219843j.setBackgroundResource(C0966R.raw.badge_count_more);
                    return true;
                }
                TextView textView = this.f219843j;
                textView.setText("" + tg4.f354435d);
                this.f219843j.setBackgroundResource(C45081s1.m49933b(this.f219837d, tg4.f354435d));
                return true;
            }
            this.f219843j.setVisibility(8);
            return true;
        }

        public String getPath() {
            return this.f219838e.f219831b.f219836e;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            if (z) {
                this.f219842i.setVisibility(0);
                return true;
            }
            this.f219842i.setVisibility(8);
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

    public C74755f3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f219822t = appCompatActivity;
        this.f219819q = LayoutInflater.from(appCompatActivity);
        this.f220078n = false;
        this.f220079o = C0966R.style.f8430i8;
        if (C73155b3.f214719h == null) {
            C73155b3.f214719h = new C73155b3();
        }
        this.f219823u = C73155b3.f214719h;
    }

    /* renamed from: f */
    public static C74761f m89494f(int i) {
        int i2 = i;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC;
        Context context = MMApplicationContext.getContext();
        if (i2 == 22) {
            ((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar, 0)).intValue();
        } else if (i2 != 24) {
            if (i2 != 2147483646) {
                switch (i2) {
                    case 1:
                        return HomeUI.f214252R.booleanValue() ? new C74761f(1, context.getString(C0966R.string.grn), "", C0966R.raw.ofm_add_green_icon, C0966R.color.akw) : new C74761f(1, context.getString(C0966R.string.grn), "", C0966R.raw.ofm_add_icon, 0);
                    case 2:
                        return HomeUI.f214253S.booleanValue() ? new C74761f(2, context.getString(C0966R.string.grr), "", C0966R.raw.ofm_group_chat_green_icon, C0966R.color.akw) : new C74761f(2, context.getString(C0966R.string.grr), "", C0966R.raw.ofm_group_chat_icon, 0);
                    case 3:
                        return new C74761f(3, context.getString(C0966R.string.gru), "", C0966R.raw.camera, 0);
                    case 4:
                        return 1 == Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VOIPCallType"), 0) ? new C74761f(4, context.getString(C0966R.string.grx), "", C0966R.raw.ofm_video_icon, 0) : new C74761f(4, context.getString(C0966R.string.gro), "", C0966R.raw.ofm_audio_icon, 0);
                    case 5:
                        return new C74761f(5, context.getString(C0966R.string.iuv), "", C0966R.raw.ofm_pic_icon, 0);
                    case 6:
                        return new C74761f(6, context.getString(C0966R.string.itu), "", C0966R.raw.ofm_favourite_icon, 0);
                    case 7:
                        return new C74761f(7, context.getString(C0966R.string.itw), "", C0966R.raw.ofm_card_icon, 0);
                    case 8:
                        return new C74761f(8, context.getString(C0966R.string.f360372c82), "", C0966R.raw.ofm_emostore_icon, 0);
                    case 9:
                        return new C74761f(9, context.getString(C0966R.string.f361310iv1), "", C0966R.raw.ofm_myqrcode_icon, 0);
                    case 10:
                        return new C74761f(10, context.getString(C0966R.string.cw5), "", C0966R.raw.ofm_qrcode_icon, 0);
                    case 11:
                        return new C74761f(11, context.getString(C0966R.string.jbx), "", C0966R.raw.ofm_moment_icon, 0);
                    case 12:
                        return new C74761f(12, context.getString(C0966R.string.fbf), "", C0966R.raw.ofm_gamecenter_icon, 0);
                    case 13:
                        return new C74761f(13, context.getString(C0966R.string.j5_), "", C0966R.raw.ofm_shake_icon, 0);
                    case 14:
                        return new C74761f(14, context.getString(C0966R.string.f361088h63), "", C0966R.raw.ofm_nearby_icon, 0);
                    default:
                        switch (i2) {
                            case 16:
                                return new C74761f(16, context.getString(C0966R.string.iph), "", C0966R.raw.ofm_webwechat_icon, 0);
                            case 17:
                                return new C74761f(17, context.getString(C0966R.string.gph), "", C0966R.raw.ofm_groupmessage_icon, 0);
                            case 18:
                                return new C74761f(18, context.getString(C0966R.string.cw7), "", C0966R.raw.ofm_radar_icon, 0);
                            case 19:
                                return new C74761f(19, context.getString(C0966R.string.cw_), "", C0966R.raw.actionbar_facefriend_icon, 0);
                            case 20:
                                if (((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar, 0)).intValue() <= 1) {
                                    return new C74761f(20, context.getString(C0966R.string.f7494hs), "", C0966R.raw.receipt_payment_icon, 0, "plus_receiveorpay");
                                }
                                break;
                        }
                }
            } else {
                return new C74761f(2147483646, "TIT", "", C0966R.raw.ofm_card_icon, 0);
            }
        } else if (((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar, 0)).intValue() == 8) {
            return new C74761f(24, context.getString(C0966R.string.hlu), "", C0966R.raw.receipt_payment_icon, 0);
        }
        return null;
    }

    /* renamed from: b */
    public BaseAdapter mo103922b() {
        if (this.f219820r == null) {
            this.f219820r = new C74758c((C73248c3) null);
        }
        return this.f219820r;
    }

    /* renamed from: d */
    public boolean mo103923d() {
        int i = 0;
        this.f219823u.mo101597a(false);
        if (this.f219823u.f214724e.size() != 0) {
            this.f219821s = this.f219823u.f214724e;
        } else {
            Log.m105924i("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
            SparseArray<C74760e> sparseArray = this.f219821s;
            if (sparseArray != null) {
                sparseArray.clear();
            } else {
                this.f219821s = new SparseArray<>();
            }
            int i2 = 0;
            for (int f : WeChatBrands.Business.Entries.HomeMoreFeedback.banned() ? f219818y : Util.isOverseasUser(this.f219822t) ? f219817x : f219816w) {
                C74761f f2 = m89494f(f);
                C74760e eVar = new C74760e(f2);
                if (f2 != null) {
                    this.f219821s.put(i2, eVar);
                }
                i2++;
            }
        }
        try {
            if (((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SUBMENU_SHOW_TIT_BOOLEAN, Boolean.FALSE)).booleanValue()) {
                while (true) {
                    if (i >= this.f219821s.size()) {
                        break;
                    } else if (this.f219821s.get(i).f219831b.f219834c == 2147483646) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == this.f219821s.size()) {
                    SparseArray<C74760e> sparseArray2 = this.f219821s;
                    sparseArray2.put(sparseArray2.size(), new C74760e(m89494f(2147483646)));
                }
            }
        } catch (Exception unused) {
        }
        C74758c cVar = this.f219820r;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        super.mo103923d();
        return true;
    }

    /* renamed from: e */
    public final void mo103924e(boolean z) {
        C86709a0.m107528h();
        ((C79442f) C86312j.m106911c(C79442f.class)).mo109167hy(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue());
        this.f219824v = z;
    }

    /* renamed from: g */
    public final boolean mo103925g() {
        String topActivityName2 = Util.getTopActivityName2(this.f219822t);
        if (Util.isNullOrNil(topActivityName2) || !topActivityName2.equals("LauncherUI")) {
            Log.m105925i("MicroMsg.PlusSubMenuHelper", "LauncherUI is not on ActivityTask Top：%s", topActivityName2);
            return false;
        }
        Log.m105924i("MicroMsg.PlusSubMenuHelper", "LauncherUI is on ActivityTask Top ");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x06df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r20, android.view.View r21, int r22, long r23) {
        /*
            r19 = this;
            r7 = r19
            android.content.Context r0 = r7.f219822t
            boolean r1 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L_0x000d
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            r0.supportInvalidateOptionsMenu()
        L_0x000d:
            android.util.SparseArray<com.tencent.mm.ui.f3$e> r0 = r7.f219821s
            r1 = r22
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.ui.f3$e r0 = (com.tencent.p014mm.p136ui.C74755f3.C74760e) r0
            com.tencent.mm.ui.f3$f r0 = r0.f219831b
            int r8 = r0.f219834c
            java.lang.Class<ct.c> r0 = p327ct.C30914c.class
            java.lang.Class<xz.f> r9 = p275xz.C15919f.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.widget.recent.b> r10 = com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b.class
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.add(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2.add(r1)
            java.lang.Object[] r6 = r2.toArray()
            r2.clear()
            java.lang.String r1 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r2 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r3 = "processOnItemClick"
            java.lang.String r4 = "(II)V"
            r5 = r19
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 11104(0x2b60, float:1.556E-41)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r6 = 0
            r4[r6] = r5
            r1.mo160131h(r2, r4)
            di3.d r2 = di3.C86312j.m106911c(r10)
            if (r2 == 0) goto L_0x006c
            di3.d r2 = di3.C86312j.m106911c(r10)
            com.tencent.mm.plugin.appbrand.widget.recent.b r2 = (com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b) r2
            r4 = 300(0x12c, float:4.2E-43)
            r5 = 8
            r2.Es0(r4, r5)
        L_0x006c:
            r2 = 22
            java.lang.String r4 = "(II)V"
            java.lang.String r5 = "processOnItemClick"
            java.lang.String r10 = "com/tencent/mm/ui/PlusSubMenuHelper"
            if (r8 == r2) goto L_0x06a0
            r2 = 24
            java.lang.String r11 = "MicroMsg.PlusSubMenuHelper"
            r12 = 3
            r13 = 2
            if (r8 == r2) goto L_0x05b7
            java.lang.String r2 = ""
            r14 = 0
            switch(r8) {
                case 1: goto L_0x046e;
                case 2: goto L_0x038f;
                case 3: goto L_0x0349;
                case 4: goto L_0x02e8;
                case 5: goto L_0x027d;
                case 6: goto L_0x0267;
                case 7: goto L_0x024c;
                case 8: goto L_0x0237;
                case 9: goto L_0x0227;
                case 10: goto L_0x01ae;
                case 11: goto L_0x014b;
                case 12: goto L_0x011d;
                case 13: goto L_0x010a;
                case 14: goto L_0x008c;
                default: goto L_0x0084;
            }
        L_0x0084:
            switch(r8) {
                case 16: goto L_0x052f;
                case 17: goto L_0x04fe;
                case 18: goto L_0x04f3;
                case 19: goto L_0x04e8;
                case 20: goto L_0x0489;
                default: goto L_0x0087;
            }
        L_0x0087:
            switch(r8) {
                case 2147483645: goto L_0x0563;
                case 2147483646: goto L_0x054e;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x061e
        L_0x008c:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 4103(0x1007, float:5.75E-42)
            java.lang.Object r0 = r0.mo119684e(r1, r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsFalse(r0)
            java.lang.String r1 = "nearby"
            if (r0 != 0) goto L_0x00ad
            android.content.Context r0 = r7.f219822t
            java.lang.String r2 = ".ui.NearbyFriendsIntroUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x00ad:
            eb0.o4 r0 = eb0.C75590o4.m90741b()
            java.lang.String r2 = ".ui.NearbyPersonalInfoUI"
            if (r0 != 0) goto L_0x00bc
            android.content.Context r0 = r7.f219822t
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x00bc:
            java.lang.String r9 = r0.mo105937d()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            int r0 = r0.f222065b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r6)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0103
            if (r0 != 0) goto L_0x00d7
            goto L_0x0103
        L_0x00d7:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 4104(0x1008, float:5.751E-42)
            java.lang.Object r0 = r0.mo119684e(r1, r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            if (r0 == 0) goto L_0x00f7
            com.tencent.mm.ui.MainTabUI r0 = r0.mo101375O7()
            java.lang.String r1 = "tab_find_friend"
            r0.mo101428l(r1)
        L_0x00f7:
            android.content.Context r0 = r7.f219822t
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            uc3.C78146a.m94352a(r0, r1)
            goto L_0x061e
        L_0x0103:
            android.content.Context r0 = r7.f219822t
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x010a:
            com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent r0 = new com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent
            r0.<init>()
            r0.publish()
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = "shake"
            java.lang.String r2 = ".ui.ShakeReportUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x011d:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x0131
            android.content.Context r0 = r7.f219822t
            nj3.C76912y0.m92771j(r0, r14)
            j20.C117292a.m165361g(r7, r10, r10, r5, r4)
            goto L_0x06b3
        L_0x0131:
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = "game"
            java.lang.String r2 = ".ui.GameCenterUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            r0.<init>()
            com.tencent.mm.ui.e3 r1 = new com.tencent.mm.ui.e3
            r1.<init>(r7)
            r11 = 100
            r0.postDelayed(r1, r11)
            goto L_0x061e
        L_0x014b:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x015f
            android.content.Context r0 = r7.f219822t
            nj3.C76912y0.m92771j(r0, r14)
            j20.C117292a.m165361g(r7, r10, r10, r5, r4)
            goto L_0x06b3
        L_0x015f:
            r0 = 10
            com.tencent.p014mm.plugin.report.service.C85405m.m105411a(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 68377(0x10b19, float:9.5817E-41)
            java.lang.Object r0 = r0.mo119684e(r1, r14)
            java.lang.String r0 = (java.lang.String) r0
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            r9.mo119676J(r1, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            jr2.l r1 = jr2.C99019x.m128969a()
            if (r1 == 0) goto L_0x0197
            jr2.l r1 = jr2.C99019x.m128969a()
            os2.x r1 = (os2.C100421x) r1
            int r1 = r1.mo139896kD()
            if (r1 <= 0) goto L_0x0197
            r0 = 0
        L_0x0197:
            hy.o0$a r1 = new hy.o0$a
            r1.<init>()
            r1.f223351g = r0
            java.lang.Class<hy.o0> r0 = p166hy.C98567o0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hy.o0 r0 = (p166hy.C98567o0) r0
            android.content.Context r2 = r7.f219822t
            r9 = 5
            r0.yb0(r2, r14, r9, r1)
            goto L_0x061e
        L_0x01ae:
            r0 = 11265(0x2c01, float:1.5786E-41)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r2[r6] = r9
            r1.mo160131h(r0, r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "CLICK_ENTER_SCAN"
            r0.putBoolean(r1, r3)
            android.content.Context r1 = r7.f219822t
            boolean r0 = p182kk.C61104a.m71653i(r1, r3, r0)
            r1 = 6
            if (r0 != 0) goto L_0x0212
            android.content.Context r0 = r7.f219822t
            boolean r0 = p182kk.C61104a.m71665u(r0)
            if (r0 != 0) goto L_0x0212
            android.content.Context r0 = r7.f219822t
            boolean r0 = p182kk.C61104a.m71647c(r0, r3)
            if (r0 != 0) goto L_0x0212
            android.content.Context r0 = r7.f219822t
            boolean r0 = p182kk.C61104a.m71659o(r0, r3)
            if (r0 != 0) goto L_0x0212
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "key_scan_entry_scene"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "key_scan_report_enter_scene"
            r0.putExtra(r2, r1)
            java.lang.String r2 = "key_config_black_interval"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "key_enable_multi_code"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "key_enable_scan_code_product_merge"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "key_scan_goods_enable_dynamic_wording"
            r0.putExtra(r2, r3)
            android.content.Context r2 = r7.f219822t
            java.lang.String r9 = "scanner"
            java.lang.String r11 = ".ui.BaseScanUI"
            ke3.C88144b.m109791i(r2, r9, r11, r0, r14)
        L_0x0212:
            java.lang.Class<uk2.c> r0 = uk2.C14201c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            uk2.c r0 = (uk2.C14201c) r0
            uk2.b r0 = r0.mo12578gN()
            int r2 = p182kk.C61104a.m71654j()
            r0.mo6118a(r1, r2)
            goto L_0x061e
        L_0x0227:
            android.content.Context r0 = r7.f219822t
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "setting"
            java.lang.String r9 = ".ui.setting.SelfQRCodeUI"
            ke3.C88144b.m109791i(r0, r2, r9, r1, r14)
            goto L_0x061e
        L_0x0237:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "preceding_scence"
            r0.putExtra(r1, r13)
            android.content.Context r1 = r7.f219822t
            java.lang.String r2 = "emoji"
            java.lang.String r9 = ".ui.v2.EmojiStoreV2UI"
            ke3.C88144b.m109791i(r1, r2, r9, r0, r14)
            goto L_0x061e
        L_0x024c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0[r6] = r1
            java.lang.String r1 = " walletMallV2 switch is ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            android.content.Context r0 = r7.f219822t
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "mall"
            java.lang.String r9 = ".ui.MallIndexUIv2"
            ke3.C88144b.m109791i(r0, r2, r9, r1, r14)
            goto L_0x061e
        L_0x0267:
            java.lang.Class<xq.e> r0 = p272xq.C102712e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xq.e r0 = (p272xq.C102712e) r0
            android.content.Context r1 = r7.f219822t
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r9 = ".ui.FavoriteIndexUI"
            r0.F20(r1, r9, r2)
            goto L_0x061e
        L_0x027d:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x0291
            android.content.Context r0 = r7.f219822t
            nj3.C76912y0.m92771j(r0, r14)
            j20.C117292a.m165361g(r7, r10, r10, r5, r4)
            goto L_0x06b3
        L_0x0291:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.Object r0 = r0.mo119684e(r13, r14)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "sns_userName"
            r1.putExtra(r2, r0)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1.setFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 68389(0x10b25, float:9.5833E-41)
            java.lang.Object r0 = r0.mo119684e(r2, r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r6)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            int r0 = r0 + r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.mo119676J(r2, r0)
            java.lang.String r0 = "sns_adapter_type"
            r1.putExtra(r0, r3)
            android.content.Context r0 = r7.f219822t
            java.lang.String r2 = "sns"
            java.lang.String r9 = ".ui.SnsTimeLineUserPagerUI"
            ke3.C88144b.m109791i(r0, r2, r9, r1, r14)
            goto L_0x061e
        L_0x02e8:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r1 = r0.f154883d
            r1.f154885a = r3
            r0.publish()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0342
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Talkroom is on: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r0)
            android.content.Context r12 = r7.f219822t
            r0 = 2131837619(0x7f1142b3, float:1.9308438E38)
            java.lang.String r13 = r12.getString(r0)
            android.content.Context r0 = r7.f219822t
            r1 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r15 = r0.getString(r1)
            android.content.Context r0 = r7.f219822t
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r16 = r0.getString(r1)
            com.tencent.mm.ui.c3 r0 = new com.tencent.mm.ui.c3
            r0.<init>(r7)
            com.tencent.mm.ui.d3 r1 = new com.tencent.mm.ui.d3
            r1.<init>(r7)
            java.lang.String r14 = ""
            r17 = r0
            r18 = r1
            nj3.C76879j.m92707A(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x061e
        L_0x0342:
            android.content.Context r0 = r7.f219822t
            com.tencent.p014mm.p136ui.contact.VoipAddressUI.m89067j8(r0)
            goto L_0x061e
        L_0x0349:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = r7.f219822t
            java.lang.String r2 = "com.tencent.mm.ui.tools.ShareImageRedirectUI"
            r0.setClassName(r1, r2)
            android.content.Context r1 = r7.f219822t
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r14 = "processOnItemClick"
            java.lang.String r15 = "(II)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r2.mo10231a(r6)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r12 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r13 = "processOnItemClick"
            java.lang.String r14 = "(II)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x061e
        L_0x038f:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r7.f219822t
            java.lang.Class<com.tencent.mm.ui.mvvm.MvvmSelectContactUI> r2 = com.tencent.p014mm.p136ui.mvvm.MvvmSelectContactUI.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r7.f219822t
            r2 = 2131820847(0x7f11012f, float:1.927442E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "titile"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "list_type"
            r0.putExtra(r1, r6)
            int[] r1 = new int[r12]
            com.tencent.p014mm.p136ui.contact.C74560s1.m89276e()
            int r2 = com.tencent.p014mm.p136ui.contact.C74560s1.f219163d
            r1[r6] = r2
            r2 = 256(0x100, float:3.59E-43)
            r1[r3] = r2
            r2 = 512(0x200, float:7.175E-43)
            r1[r13] = r2
            int r1 = com.tencent.p014mm.p136ui.contact.C74560s1.m89278g(r1)
            java.lang.String r2 = "list_attr"
            r0.putExtra(r2, r1)
            r1 = 7
            java.lang.String r2 = "scene"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "menu_mode"
            r0.putExtra(r1, r13)
            java.lang.String r1 = "recommend_chatroom"
            r0.putExtra(r1, r3)
            java.util.HashSet r1 = com.tencent.p014mm.p136ui.contact.C74560s1.m89274c()
            java.lang.String r2 = ","
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.setToString(r1, r2)
            java.lang.String r2 = "block_contact"
            r0.putExtra(r2, r1)
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.String r2 = "always_select_contact"
            r0.putExtra(r2, r1)
            java.lang.Class<un3.i> r1 = un3.C78244i.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<un3.j> r1 = un3.C14265j.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<un3.d> r1 = un3.C14263d.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.i> r1 = xm3.C78904i.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<vm3.b> r1 = vm3.C78436b.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<vm3.g> r1 = vm3.C78444g.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<vm3.a> r1 = vm3.C65764a.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.c0> r1 = xm3.C78877c0.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.f0> r1 = xm3.C78889f0.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.a> r1 = xm3.C78870a.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.y> r1 = xm3.C78938y.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.z> r1 = xm3.C78944z.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.r> r1 = xm3.C78928r.class
            yb2.C79062b.m95631b(r0, r1)
            java.lang.Class<xm3.n> r1 = xm3.C78917n.class
            yb2.C79062b.m95631b(r0, r1)
            android.content.Context r1 = r7.f219822t
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r14 = "processOnItemClick"
            java.lang.String r15 = "(II)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r2.mo10231a(r6)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r12 = "com/tencent/mm/ui/PlusSubMenuHelper"
            java.lang.String r13 = "processOnItemClick"
            java.lang.String r14 = "(II)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x061e
        L_0x046e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "invite_friend_scene"
            r0.putExtra(r1, r13)
            android.content.Context r0 = r7.f219822t
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "subapp"
            java.lang.String r9 = ".ui.pluginapp.AddMoreFriendsUI"
            ke3.C88144b.m109791i(r0, r2, r9, r1, r14)
            goto L_0x061e
        L_0x0489:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomeMorePayment
            android.content.Context r11 = r7.f219822t
            boolean r2 = r2.checkAvailable(r11)
            if (r2 != 0) goto L_0x0495
            goto L_0x061e
        L_0x0495:
            java.lang.Class<nv.g> r2 = p626nv.C109759g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            nv.g r2 = (p626nv.C109759g) r2
            nv.e r2 = r2.V40()
            r11 = 4
            com.tencent.mm.plugin.newtips.model.l r2 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r2
            r2.mo175762a(r11)
            di3.d r2 = di3.C86312j.m106911c(r9)
            xz.f r2 = (p275xz.C15919f) r2
            android.content.Context r9 = r7.f219822t
            r2.mo14561Du(r9)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ct.c r2 = (p327ct.C30914c) r2
            ct.d r2 = r2.mo17862sM()
            l20.a r2 = (l20.C21388a) r2
            r9 = 262159(0x4000f, float:3.67363E-40)
            r11 = 266248(0x41008, float:3.73093E-40)
            boolean r2 = r2.mo33494b(r9, r11)
            if (r2 == 0) goto L_0x061e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            l20.a r0 = (l20.C21388a) r0
            r0.mo33499h(r9, r11)
            r0 = 14396(0x383c, float:2.0173E-41)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r2[r6] = r9
            r1.mo160131h(r0, r2)
            goto L_0x061e
        L_0x04e8:
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = "pwdgroup"
            java.lang.String r2 = ".ui.FacingCreateChatRoomAllInOneUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x04f3:
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = "radar"
            java.lang.String r2 = ".ui.RadarSearchUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x04fe:
            int r0 = eb0.C75592q0.m90785o()
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0509
            r0 = 1
            goto L_0x050a
        L_0x0509:
            r0 = 0
        L_0x050a:
            if (r0 == 0) goto L_0x0517
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = "masssend"
            java.lang.String r2 = ".ui.MassSendHistoryUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x0517:
            android.content.Context r0 = r7.f219822t
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "Contact_User"
            java.lang.String r9 = "masssendapp"
            android.content.Intent r1 = r1.putExtra(r2, r9)
            java.lang.String r2 = "profile"
            java.lang.String r9 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r0, r2, r9, r1, r14)
            goto L_0x061e
        L_0x052f:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105884J()
            java.lang.String r1 = "webwx"
            if (r0 == 0) goto L_0x0545
            android.content.Context r0 = r7.f219822t
            java.lang.String r2 = ".ui.WebWXLogoutUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x0545:
            android.content.Context r0 = r7.f219822t
            java.lang.String r2 = ".ui.WebWeiXinIntroductionUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            goto L_0x061e
        L_0x054e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "key_from_scene"
            r0.putExtra(r1, r13)
            android.content.Context r1 = r7.f219822t
            java.lang.String r2 = "offline"
            java.lang.String r9 = ".ui.WalletOfflineEntranceUI"
            ke3.C88144b.m109791i(r1, r2, r9, r0, r14)
            goto L_0x061e
        L_0x0563:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CROWDTEST_FEEDBACK_LINK_STRING
            java.lang.Object r1 = r1.mo119685f(r9, r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0599
            java.lang.String r2 = "rawUrl"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "showShare"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "show_bottom"
            r0.putExtra(r1, r6)
            android.content.Context r1 = r7.f219822t
            java.lang.String r2 = "webview"
            java.lang.String r9 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r2, r9, r0, r14)
            goto L_0x061e
        L_0x0599:
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = wc3.C90945m.f260967a
            boolean r1 = eb0.C45628s0.m50756U()
            if (r1 != 0) goto L_0x05ab
            int r1 = qe3.C12212g.m11775a()
            wc3.C90945m.m114059i(r0, r1)
            goto L_0x061e
        L_0x05ab:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r1 = qe3.C12212g.m11775a()
            wc3.C90945m.m114060j(r0, r1)
            goto L_0x061e
        L_0x05b7:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 2540(0x9ec, float:3.559E-42)
            r0.mo123455a(r1, r7)
            java.lang.String r0 = "OfflineH5 getConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            te3.lc3 r1 = new te3.lc3
            r1.<init>()
            java.lang.Class<zz.f> r0 = p287zz.C79442f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zz.f r0 = (p287zz.C79442f) r0
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC
            java.lang.Object r0 = r0.Ev0(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x05e6
            java.lang.String r0 = "OfflineH5 get PayIBGQuickGetOverseaWalletConfig failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x060e
        L_0x05e6:
            java.lang.String r2 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Exception -> 0x05f5 }
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x05f5 }
            java.lang.String r0 = "OfflineH5 getConfig success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x05f5 }
            goto L_0x060e
        L_0x05f5:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "OfflineH5 parse PayIBGQuickGetOverseaWalletConfig fail, "
            r2.append(r9)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x060e:
            java.lang.String r0 = r1.f137303f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0621
            java.lang.String r0 = "OfflineH5 has no cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r7.mo103924e(r6)
        L_0x061e:
            r1 = r4
            goto L_0x06b0
        L_0x0621:
            long r14 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r16
            r21 = r4
            long r3 = r1.f137305h
            long r2 = r14 - r3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r0[r6] = r4
            long r14 = r1.f137305h
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r9 = 1
            r0[r9] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0[r13] = r4
            java.lang.String r4 = "currentTime ：%s ,lastTime：%s,internalTime ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0696
            int r0 = r1.f137304g
            long r14 = (long) r0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0696
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f137303f
            r0[r6] = r2
            java.lang.String r2 = "OfflineH5 dont expired，url：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r0)
            java.lang.String r0 = r1.f137303f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0691
            java.lang.String r0 = r1.f137303f
            java.lang.String r2 = "wxpay://bizmall/hk_offlinepay"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x068a
            java.lang.String r0 = "goto native hk offlinepay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            android.content.Context r1 = r7.f219822t
            r0.startHKOfflinePrePay(r1, r13)
            goto L_0x0691
        L_0x068a:
            android.content.Context r0 = r7.f219822t
            java.lang.String r1 = r1.f137303f
            p287zz.C16418h.m15246b(r0, r1, r6)
        L_0x0691:
            r1 = 1
            r7.mo103924e(r1)
            goto L_0x06ae
        L_0x0696:
            r1 = 1
            java.lang.String r0 = "OfflineH5 is expired"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r7.mo103924e(r6)
            goto L_0x06ae
        L_0x06a0:
            r21 = r4
            r1 = 1
            di3.d r0 = di3.C86312j.m106911c(r9)
            xz.f r0 = (p275xz.C15919f) r0
            android.content.Context r2 = r7.f219822t
            r0.Mv0(r2, r1)
        L_0x06ae:
            r1 = r21
        L_0x06b0:
            j20.C117292a.m165361g(r7, r10, r10, r5, r1)
        L_0x06b3:
            com.tencent.mm.ui.b3 r0 = r7.f219823u
            android.util.SparseArray<com.tencent.mm.ui.f3$d> r1 = r0.f214722c
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0722
            android.util.SparseArray<com.tencent.mm.ui.f3$d> r1 = r0.f214722c
            java.lang.Object r1 = r1.get(r8)
            com.tencent.mm.ui.f3$d r1 = (com.tencent.p014mm.p136ui.C74755f3.C74759d) r1
            if (r1 == 0) goto L_0x0722
            int r2 = r1.f219827b
            r3 = 1
            if (r2 != r3) goto L_0x0722
            android.util.SparseIntArray r2 = r0.f214721b
            int r4 = r1.f219826a
            int r1 = r1.f219828c
            r2.put(r4, r1)
            int r1 = r0.f214720a
            int r1 = r1 - r3
            r0.f214720a = r1
            boolean r1 = r0.f214726g
            if (r1 != 0) goto L_0x06df
            goto L_0x0722
        L_0x06df:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L_0x06e4:
            android.util.SparseIntArray r2 = r0.f214721b
            int r2 = r2.size()
            if (r6 >= r2) goto L_0x0710
            android.util.SparseIntArray r2 = r0.f214721b
            int r2 = r2.keyAt(r6)
            android.util.SparseIntArray r3 = r0.f214721b
            int r3 = r3.get(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "|"
            r1.append(r2)
            int r6 = r6 + 1
            goto L_0x06e4
        L_0x0710:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 299010(0x49002, float:4.19002E-40)
            java.lang.String r1 = r1.toString()
            r0.mo119676J(r2, r1)
        L_0x0722:
            r19.mo104068a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C74755f3.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Log.m105925i("MicroMsg.PlusSubMenuHelper", "on Scene End：errType %s , errCode：%s，errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() == 2540) {
            if (i == 0 && i2 == 0) {
                C50244lc3 lc32 = (C50244lc3) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                if (lc32.f137301d == 0) {
                    Log.m105925i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", lc32.f137303f, Integer.valueOf(lc32.f137304g));
                    if (!this.f219824v && mo103925g() && !Util.isNullOrNil(lc32.f137303f)) {
                        if (lc32.f137303f.equals("wxpay://bizmall/hk_offlinepay")) {
                            Log.m105924i("MicroMsg.PlusSubMenuHelper", "goto native hk offlinepay");
                            ((C76324c) C86312j.m106911c(C76324c.class)).startHKOfflinePrePay(this.f219822t, 2);
                        } else {
                            Log.m105924i("MicroMsg.PlusSubMenuHelper", "on Scene End jump h5 ");
                            C16418h.m15246b(this.f219822t, lc32.f137303f, false);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    lc32.f137305h = currentTimeMillis;
                    Log.m105925i("MicroMsg.PlusSubMenuHelper", "on Scene End currentTime ：%s ", Long.valueOf(currentTimeMillis));
                    Class cls = C79442f.class;
                    Log.m105924i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig");
                    try {
                        str2 = new String(lc32.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                        try {
                            Log.m105924i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig success");
                        } catch (IOException e) {
                            e = e;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str2 = " ";
                        Log.m105920e("MicroMsg.PlusSubMenuHelper", "save config exp, " + e.getLocalizedMessage());
                        ((C79442f) C86312j.m106911c(cls)).mo109159GK(C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                        ((C79442f) C86312j.m106911c(cls)).mo109170rQ(true);
                        C86709a0.m107524d().mo123470p(2540, this);
                    }
                    ((C79442f) C86312j.m106911c(cls)).mo109159GK(C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                    ((C79442f) C86312j.m106911c(cls)).mo109170rQ(true);
                } else {
                    Log.m105924i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f219824v && mo103925g()) {
                        Context context = this.f219822t;
                        C76879j.m92711E(context, lc32.f137302e, "", context.getString(C0966R.string.lkg), false, new C74756a(this));
                    }
                }
            } else {
                Log.m105924i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f219824v && mo103925g()) {
                    Context context2 = this.f219822t;
                    C76879j.m92711E(context2, str, "", context2.getString(C0966R.string.lkg), false, new C74757b(this));
                }
            }
            C86709a0.m107524d().mo123470p(2540, this);
        }
    }
}

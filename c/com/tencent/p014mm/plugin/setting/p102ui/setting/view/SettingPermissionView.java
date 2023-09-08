package com.tencent.p014mm.plugin.setting.p102ui.setting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bh3.C113177k;
import cc0.C92411b;
import ch3.C113346a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import gn2.C116976a;
import gn2.C116977b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.xwalk.core.XWalkEnvironment;
import p702ts.C78083b;
import qo3.C77407n;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView;", "Landroid/widget/FrameLayout;", "Lts/b$a;", "r", "Lts/b$a;", "getOnAddr", "()Lts/b$a;", "setOnAddr", "(Lts/b$a;)V", "onAddr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView */
public final class SettingPermissionView extends FrameLayout {

    /* renamed from: s */
    public static final List<String> f347179s = C64197v.m75537f("chatting", "radar", "face2face_group", "sns", "finder", WeChatBrands.Business.GROUP_LIVE, "scan", "shake", "story", "search", "nearby", "game", "nearby_appbrand", "mine", "status", "fav", "card", "musicplayer", "net_check", "wifi_info", WeChatBrands.Business.GROUP_PAY, "biz", "webview", "contact", "emoji", "sport", "mail", "voiceprint", "add_contact", "contact_remark", "wechatout", "savefile", XWalkEnvironment.MODULE_APPBRAND);

    /* renamed from: t */
    public static final List<String> f347180t = C64197v.m75537f(FirebaseAnalytics.C113379b.LOCATION, "contact", "storage", "camera", "microphone", "bluetooth", "healthy", "overlay");

    /* renamed from: d */
    public View f347181d;

    /* renamed from: e */
    public Context f347182e;

    /* renamed from: f */
    public String f347183f;

    /* renamed from: g */
    public String f347184g;

    /* renamed from: h */
    public TextView f347185h;

    /* renamed from: i */
    public TextView f347186i;

    /* renamed from: j */
    public MultiProcessMMKV f347187j;

    /* renamed from: n */
    public C77407n f347188n;

    /* renamed from: o */
    public TextView f347189o;

    /* renamed from: p */
    public boolean f347190p;

    /* renamed from: q */
    public final C92411b.C92412a f347191q = new C116976a(this);

    /* renamed from: r */
    public C78083b.C78084a f347192r = new C116977b(this);

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView$a */
    public static final class C115735a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingPermissionView f347193d;

        public C115735a(SettingPermissionView settingPermissionView) {
            this.f347193d = settingPermissionView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x017f  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0198  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r17) {
            /*
                r16 = this;
                r6 = r16
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r17
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$init$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r16
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView r0 = r6.f347193d
                java.util.List<java.lang.String> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView.f347179s
                java.lang.Class<bh3.k> r1 = bh3.C113177k.class
                qo3.n r2 = new qo3.n
                android.content.Context r3 = r0.getContext()
                r4 = 1
                r5 = 0
                r2.<init>((android.content.Context) r3, (int) r4, (boolean) r5)
                r0.f347188n = r2
                android.content.Context r2 = r0.getContext()
                r3 = 2131497404(0x7f0c11bc, float:1.86184E38)
                r7 = 0
                android.view.View r2 = android.view.View.inflate(r2, r3, r7)
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
                gy3.C87412m.m108592e(r2, r3)
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout r2 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r2
                android.content.Context r3 = r0.getContext()
                r8 = 12
                int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r8)
                float r3 = (float) r3
                android.content.Context r9 = r0.getContext()
                int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r9, r8)
                float r8 = (float) r8
                r9 = 0
                r2.mo153905b(r3, r8, r9, r9)
                r3 = 2131299699(0x7f090d73, float:1.8217407E38)
                android.view.View r3 = r2.findViewById(r3)
                r8 = 2131314757(0x7f094845, float:1.8247948E38)
                android.view.View r8 = r2.findViewById(r8)
                com.tencent.mm.ui.widget.MMSwitchBtn r8 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r8
                r9 = 2131315360(0x7f094aa0, float:1.8249171E38)
                android.view.View r9 = r2.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r10 = 2131300828(0x7f0911dc, float:1.8219697E38)
                android.view.View r10 = r2.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r11 = 2131314773(0x7f094855, float:1.824798E38)
                android.view.View r11 = r2.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r12 = 2131317002(0x7f09510a, float:1.8252501E38)
                android.view.View r12 = r2.findViewById(r12)
                android.widget.TextView r12 = (android.widget.TextView) r12
                r0.f347189o = r12
                java.util.HashMap<java.lang.String, java.lang.String> r12 = ch3.C113346a.f339124d
                java.lang.String r13 = r0.f347184g
                java.lang.String r14 = "business"
                if (r13 == 0) goto L_0x01c9
                java.lang.Object r12 = r12.get(r13)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r9.setText(r12)
                android.text.TextPaint r9 = r9.getPaint()
                r12 = 1061997773(0x3f4ccccd, float:0.8)
                com.tencent.p014mm.p136ui.C85875k4.m106189j0(r9, r12)
                di3.d r9 = di3.C86312j.m106911c(r1)
                bh3.k r9 = (bh3.C113177k) r9
                java.lang.String r12 = r0.f347183f
                java.lang.String r13 = "permission"
                if (r12 == 0) goto L_0x01c4
                java.lang.String r15 = r0.f347184g
                if (r15 == 0) goto L_0x01bf
                android.util.Pair r9 = r9.mo165702Oz(r12, r15)
                if (r9 == 0) goto L_0x00e0
                android.content.Context r12 = r0.getContext()
                java.lang.Object r9 = r9.first
                java.lang.String r15 = "it.first"
                gy3.C87412m.m108593f(r9, r15)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                java.lang.String r9 = r12.getString(r9)
                r10.setText(r9)
            L_0x00e0:
                android.content.Context r9 = r0.getContext()
                r10 = 2131836214(0x7f113d36, float:1.9305588E38)
                java.lang.Object[] r12 = new java.lang.Object[r4]
                java.util.HashMap<java.lang.String, java.lang.String> r15 = ch3.C113346a.f339123c
                java.lang.String r7 = r0.f347183f
                if (r7 == 0) goto L_0x01ba
                java.lang.Object r7 = r15.get(r7)
                r12[r5] = r7
                java.lang.String r7 = r9.getString(r10, r12)
                r11.setText(r7)
                gn2.c r7 = new gn2.c
                r7.<init>(r0)
                r3.setOnClickListener(r7)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r0.f347187j
                if (r3 == 0) goto L_0x01b2
                java.lang.String r7 = r0.f347184g
                if (r7 == 0) goto L_0x01ad
                java.lang.String r9 = r0.f347183f
                if (r9 == 0) goto L_0x01a8
                boolean r9 = r0.mo176036a(r9, r7)
                boolean r3 = r3.getBoolean(r7, r9)
                r8.setCheck(r3)
                gn2.d r7 = new gn2.d
                r7.<init>(r0)
                r8.setSwitchListener(r7)
                boolean r7 = eb0.C45628s0.m50756U()
                r8 = 8
                if (r7 == 0) goto L_0x0169
                di3.d r1 = di3.C86312j.m106911c(r1)
                bh3.k r1 = (bh3.C113177k) r1
                java.lang.String r7 = r0.f347183f
                if (r7 == 0) goto L_0x0164
                java.lang.String r9 = r0.f347184g
                if (r9 == 0) goto L_0x015f
                boolean r1 = r1.mo165700GT(r7, r9)
                if (r1 == 0) goto L_0x0169
                android.widget.TextView r1 = r0.f347189o
                if (r1 != 0) goto L_0x0144
                goto L_0x0147
            L_0x0144:
                r1.setVisibility(r8)
            L_0x0147:
                if (r3 == 0) goto L_0x017b
                java.lang.Class<ts.c> r1 = p702ts.C78085c.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ts.c r1 = (p702ts.C78085c) r1
                if (r1 == 0) goto L_0x017b
                cc0.b r1 = r1.mo108056ms()
                if (r1 == 0) goto L_0x017b
                cc0.b$a r3 = r0.f347191q
                r1.mo126409c(r3, r4, r5)
                goto L_0x017b
            L_0x015f:
                gy3.C87412m.m108603p(r14)
                r0 = 0
                throw r0
            L_0x0164:
                r0 = 0
                gy3.C87412m.m108603p(r13)
                throw r0
            L_0x0169:
                android.widget.TextView r1 = r0.f347189o
                if (r1 != 0) goto L_0x016e
                goto L_0x0173
            L_0x016e:
                java.lang.String r3 = ""
                r1.setText(r3)
            L_0x0173:
                android.widget.TextView r1 = r0.f347189o
                if (r1 != 0) goto L_0x0178
                goto L_0x017b
            L_0x0178:
                r1.setVisibility(r8)
            L_0x017b:
                qo3.n r1 = r0.f347188n
                if (r1 == 0) goto L_0x0186
                gn2.e r3 = new gn2.e
                r3.<init>(r0)
                r1.f225761d = r3
            L_0x0186:
                if (r1 == 0) goto L_0x018f
                gn2.f r3 = new gn2.f
                r3.<init>(r0, r2)
                r1.f225771i = r3
            L_0x018f:
                if (r1 == 0) goto L_0x0194
                r1.mo107559d(r4)
            L_0x0194:
                qo3.n r0 = r0.f347188n
                if (r0 == 0) goto L_0x019b
                r0.mo107573q()
            L_0x019b:
                java.lang.String r0 = "com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$init$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            L_0x01a8:
                gy3.C87412m.m108603p(r13)
                r0 = 0
                throw r0
            L_0x01ad:
                r0 = 0
                gy3.C87412m.m108603p(r14)
                throw r0
            L_0x01b2:
                r0 = 0
                java.lang.String r1 = "mmkv"
                gy3.C87412m.m108603p(r1)
                throw r0
            L_0x01ba:
                r0 = 0
                gy3.C87412m.m108603p(r13)
                throw r0
            L_0x01bf:
                r0 = r7
                gy3.C87412m.m108603p(r14)
                throw r0
            L_0x01c4:
                r0 = r7
                gy3.C87412m.m108603p(r13)
                throw r0
            L_0x01c9:
                r0 = r7
                gy3.C87412m.m108603p(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView.C115735a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingPermissionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo176038c(attributeSet, 0);
        mo176037b(context);
    }

    /* renamed from: a */
    public final boolean mo176036a(String str, String str2) {
        return !((C113177k) C86312j.m106911c(C113177k.class)).mo165700GT(str, str2);
    }

    /* renamed from: b */
    public final void mo176037b(Context context) {
        String str;
        this.f347182e = context;
        if (context != null) {
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cm_, this);
            C87412m.m108593f(inflate, "getInflater(mContext)\n  …n_item_view_layout, this)");
            this.f347181d = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.m5z);
            C87412m.m108593f(findViewById, "root.findViewById(R.id.permission_switch_title)");
            this.f347185h = (TextView) findViewById;
            View view = this.f347181d;
            if (view != null) {
                View findViewById2 = view.findViewById(C0966R.C0970id.m5y);
                C87412m.m108593f(findViewById2, "root.findViewById(R.id.permission_switch_desc)");
                this.f347186i = (TextView) findViewById2;
                TextView textView = this.f347185h;
                if (textView != null) {
                    HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
                    HashMap<String, String> hashMap2 = C113346a.f339124d;
                    String str2 = this.f347184g;
                    if (str2 != null) {
                        textView.setText(hashMap2.get(str2));
                        TextView textView2 = this.f347186i;
                        if (textView2 != null) {
                            MultiProcessMMKV multiProcessMMKV = this.f347187j;
                            if (multiProcessMMKV != null) {
                                String str3 = this.f347184g;
                                if (str3 != null) {
                                    String str4 = this.f347183f;
                                    if (str4 == null) {
                                        C87412m.m108603p("permission");
                                        throw null;
                                    } else if (str3 != null) {
                                        if (multiProcessMMKV.getBoolean(str3, mo176036a(str4, str3))) {
                                            str = "";
                                        } else {
                                            Context context2 = this.f347182e;
                                            if (context2 != null) {
                                                str = context2.getString(C0966R.string.f361320lz3);
                                            } else {
                                                C87412m.m108603p("mContext");
                                                throw null;
                                            }
                                        }
                                        textView2.setText(str);
                                        View view2 = this.f347181d;
                                        if (view2 != null) {
                                            view2.setBackgroundResource(C0966R.C0969drawable.f357309b63);
                                            View view3 = this.f347181d;
                                            if (view3 != null) {
                                                view3.setOnClickListener(new C115735a(this));
                                                MultiProcessMMKV multiProcessMMKV2 = this.f347187j;
                                                if (multiProcessMMKV2 != null) {
                                                    String str5 = this.f347184g;
                                                    if (str5 != null) {
                                                        String str6 = this.f347183f;
                                                        if (str6 == null) {
                                                            C87412m.m108603p("permission");
                                                            throw null;
                                                        } else if (str5 != null) {
                                                            this.f347190p = multiProcessMMKV2.getBoolean(str5, mo176036a(str6, str5));
                                                        } else {
                                                            C87412m.m108603p("business");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("business");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("mmkv");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("root");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("root");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("business");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("business");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mmkv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mItemStatusTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("business");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mItemNameTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        } else {
            C87412m.m108603p("mContext");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r6 == null) goto L_0x0072;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo176038c(android.util.AttributeSet r6, int r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            int[] r1 = tm2.C118492c.f354640a
            r2 = 0
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1, r7, r2)
            java.lang.String r7 = "context.obtainStyledAttr…MPermission, defStyle, 0)"
            gy3.C87412m.m108593f(r6, r7)
            r7 = 1
            r0 = -1
            int r1 = r6.getInt(r7, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r1.intValue()
            if (r7 > r3) goto L_0x002a
            java.util.List<java.lang.String> r4 = f347180t
            int r4 = r4.size()
            if (r3 > r4) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            r4 = 0
            if (r3 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r4
        L_0x0030:
            if (r1 == 0) goto L_0x0041
            int r1 = r1.intValue()
            java.util.List<java.lang.String> r3 = f347180t
            int r1 = r1 - r7
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0044
        L_0x0041:
            java.lang.String r1 = "unknown_permission"
        L_0x0044:
            r5.f347183f = r1
            int r6 = r6.getInt(r2, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r0 = r6.intValue()
            if (r7 > r0) goto L_0x005d
            java.util.List<java.lang.String> r1 = f347179s
            int r1 = r1.size()
            if (r0 > r1) goto L_0x005d
            r2 = 1
        L_0x005d:
            if (r2 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r6 = r4
        L_0x0061:
            if (r6 == 0) goto L_0x0072
            int r6 = r6.intValue()
            java.util.List<java.lang.String> r0 = f347179s
            int r6 = r6 - r7
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0075
        L_0x0072:
            java.lang.String r6 = "unknown_business"
        L_0x0075:
            r5.f347184g = r6
            java.lang.Class<bh3.k> r6 = bh3.C113177k.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            bh3.k r6 = (bh3.C113177k) r6
            java.lang.String r7 = r5.f347183f
            if (r7 == 0) goto L_0x008f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r6.mo165717vM(r7)
            java.lang.String r7 = "getService(IPluginSensit…ionConfigMMkv(permission)"
            gy3.C87412m.m108593f(r6, r7)
            r5.f347187j = r6
            return
        L_0x008f:
            java.lang.String r6 = "permission"
            gy3.C87412m.m108603p(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView.mo176038c(android.util.AttributeSet, int):void");
    }

    public final C78083b.C78084a getOnAddr() {
        return this.f347192r;
    }

    public final void setOnAddr(C78083b.C78084a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f347192r = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingPermissionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo176038c(attributeSet, i);
        mo176037b(context);
    }
}

package er1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MenuItem;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76874e0;
import nj3.C76879j;
import o40.C61926c;
import org.json.JSONObject;
import p763ym.C39072t;
import p763ym.C79138l;
import qo3.C77398g;
import qo3.C77407n;
import r60.C101350i;
import rs1.C13442s8;
import sx3.C64197v;
import t60.C64207e;
import te3.C49712hj1;
import te3.C51827wf3;
import te3.C51967xf3;
import x60.C102564a;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: er1.p2 */
public final class C7853p2 {

    /* renamed from: a */
    public static final C7853p2 f26439a = new C7853p2();

    /* renamed from: er1.p2$a */
    public static final class C7854a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f26440a;

        /* renamed from: b */
        public final /* synthetic */ Activity f26441b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f26442c;

        public C7854a(MenuItem menuItem, Activity activity, C77407n nVar) {
            this.f26440a = menuItem;
            this.f26441b = activity;
            this.f26442c = nVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C7848o2(this.f26440a, this.f26441b, bitmap, this.f26442c));
            }
        }
    }

    /* renamed from: er1.p2$b */
    public static final class C7855b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f26443d;

        /* renamed from: e */
        public final /* synthetic */ Context f26444e;

        /* renamed from: f */
        public final /* synthetic */ C51827wf3 f26445f;

        public C7855b(boolean z, Context context, C51827wf3 wf32) {
            this.f26443d = z;
            this.f26444e = context;
            this.f26445f = wf32;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C58417y0.class;
            dialogInterface.dismiss();
            Log.m105924i("Finder.FinderSdkShareUtil", "dialog ok isInstall:" + this.f26443d);
            C49712hj1 hj12 = null;
            String str = "";
            if (this.f26443d) {
                C7853p2 p2Var = C7853p2.f26439a;
                Context context = this.f26444e;
                C51827wf3 wf32 = this.f26445f;
                String str2 = wf32.f144027n;
                if (str2 == null) {
                    str2 = str;
                }
                String str3 = wf32.f144029p;
                if (str3 != null) {
                    str = str3;
                }
                p2Var.mo8963f(context, str2, str, 1);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f26444e);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Cx0(1, "miaojian_post_tips", "{\"if_has_set\": 1}", hj12);
                return;
            }
            C45685m mVar = C45685m.f123489a;
            Context context2 = this.f26444e;
            C51827wf3 wf33 = this.f26445f;
            String str4 = wf33.f144028o;
            if (str4 != null) {
                str = str4;
            }
            String str5 = wf33.f144024h;
            C87412m.m108591d(str5);
            mVar.mo71188c(context2, str, str5);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f26444e);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(1, "miaojian_post_tips", "{\"if_has_set\": 0}", hj12);
        }
    }

    /* renamed from: er1.p2$c */
    public static final class C7856c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C7856c f26446d = new C7856c();

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("Finder.FinderSdkShareUtil", "dialog cancel");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: er1.p2$d */
    public static final class C7857d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f26447d;

        /* renamed from: e */
        public final /* synthetic */ Activity f26448e;

        /* renamed from: f */
        public final /* synthetic */ String f26449f;

        /* renamed from: g */
        public final /* synthetic */ C51827wf3 f26450g;

        public C7857d(boolean z, Activity activity, String str, C51827wf3 wf32) {
            this.f26447d = z;
            this.f26448e = activity;
            this.f26449f = str;
            this.f26450g = wf32;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C58417y0.class;
            dialogInterface.dismiss();
            Log.m105924i("Finder.FinderSdkShareUtil", "dialog ok isInstall:" + this.f26447d);
            C49712hj1 hj12 = null;
            String str = "";
            if (this.f26447d) {
                C7853p2 p2Var = C7853p2.f26439a;
                Activity activity = this.f26448e;
                String str2 = this.f26449f;
                String str3 = this.f26450g.f144029p;
                if (str3 != null) {
                    str = str3;
                }
                p2Var.mo8963f(activity, str2, str, 3);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f26448e);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Cx0(1, "miaojian_createsame_tips", "{\"if_has_set\": 1}", hj12);
                return;
            }
            C45685m mVar = C45685m.f123489a;
            Activity activity2 = this.f26448e;
            C51827wf3 wf32 = this.f26450g;
            String str4 = wf32.f144028o;
            if (str4 != null) {
                str = str4;
            }
            String str5 = wf32.f144024h;
            C87412m.m108591d(str5);
            mVar.mo71188c(activity2, str, str5);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f26448e);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(1, "miaojian_createsame_tips", "{\"if_has_set\": 0}", hj12);
        }
    }

    /* renamed from: er1.p2$e */
    public static final class C7858e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C7858e f26451d = new C7858e();

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("Finder.FinderSdkShareUtil", "dialog cancel");
            dialogInterface.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8958a(android.app.Activity r11, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r12, nj3.C76874e0 r13, qo3.C77407n r14, int r15) {
        /*
            r10 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r11, r2)
            java.lang.String r2 = "feed"
            gy3.C87412m.m108594g(r12, r2)
            java.lang.String r2 = "menu"
            gy3.C87412m.m108594g(r13, r2)
            java.lang.String r2 = "sheet"
            gy3.C87412m.m108594g(r14, r2)
            er1.w3 r2 = er1.C58784w3.f168295a
            r3 = 0
            r4 = 1
            int r2 = er1.C58784w3.m68441q(r2, r3, r4, r3)
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99375d1
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r7 = "Finder.FinderSdkShareUtil"
            r8 = 0
            if (r6 == 0) goto L_0x00e2
            r6 = 2
            if (r2 == r6) goto L_0x003d
            r6 = 3
            if (r2 != r6) goto L_0x00e2
        L_0x003d:
            java.lang.Class<ht1.v4> r6 = ht1.C8808v4.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.v4 r6 = (ht1.C8808v4) r6
            boolean r6 = r6.mo9635e()
            if (r6 == 0) goto L_0x004d
            goto L_0x00e2
        L_0x004d:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r12.mo3513o()
            java.lang.String r2 = r2.getFromAppId()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r12.mo3513o()
            java.lang.String r2 = r2.getFromAppExtInfo()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            if (r2 == 0) goto L_0x0099
            wp1.j r2 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            java.lang.String r5 = r5.getFromAppId()
            te3.wf3 r2 = r2.mo14352d(r5)
            if (r2 == 0) goto L_0x0094
            java.lang.String r2 = r2.f144027n
            if (r2 == 0) goto L_0x0094
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x008f
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            if (r2 != r4) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            if (r2 == 0) goto L_0x0099
            r2 = 1
            goto L_0x0109
        L_0x0099:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "appid:"
            r2.append(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            java.lang.String r5 = r5.getFromAppId()
            r2.append(r5)
            java.lang.String r5 = ", extInfo:"
            r2.append(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            java.lang.String r5 = r5.getFromAppExtInfo()
            r2.append(r5)
            java.lang.String r5 = ", sync link:"
            r2.append(r5)
            wp1.j r5 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r12.mo3513o()
            java.lang.String r6 = r6.getFromAppId()
            te3.wf3 r5 = r5.mo14352d(r6)
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r5.f144027n
            goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            goto L_0x0108
        L_0x00e2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "SAME_STYLE_SWITCH "
            r6.append(r9)
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6.append(r5)
            java.lang.String r5 = ", "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
        L_0x0108:
            r2 = 0
        L_0x0109:
            if (r2 == 0) goto L_0x01d3
            wp1.j r2 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r12.mo3513o()
            java.lang.String r2 = r2.getFromAppId()
            java.lang.String r5 = "appid"
            gy3.C87412m.m108594g(r2, r5)
            java.util.HashMap<java.lang.String, te3.wf3> r6 = wp1.C15587j.f42219e
            java.lang.Object r2 = r6.get(r2)
            te3.wf3 r2 = (te3.C51827wf3) r2
            if (r2 == 0) goto L_0x0127
            java.lang.String r2 = r2.f144020d
            goto L_0x0128
        L_0x0127:
            r2 = r3
        L_0x0128:
            java.lang.String r7 = ""
            if (r2 != 0) goto L_0x012d
            r2 = r7
        L_0x012d:
            int r9 = r2.length()
            if (r9 != 0) goto L_0x0135
            r9 = 1
            goto L_0x0136
        L_0x0135:
            r9 = 0
        L_0x0136:
            if (r9 == 0) goto L_0x0144
            r2 = 2131829166(0x7f1121ae, float:1.9291293E38)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r9 = "context.getString(R.stri…er_miaojian_samekind_tip)"
            gy3.C87412m.m108593f(r2, r9)
        L_0x0144:
            r9 = 2131755642(0x7f10027a, float:1.914217E38)
            android.view.MenuItem r13 = r13.mo107151k(r15, r2, r9, r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            java.lang.String r12 = r12.getFromAppId()
            gy3.C87412m.m108594g(r12, r5)
            boolean r15 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r15 == 0) goto L_0x0169
            java.lang.Object r12 = r6.get(r12)
            te3.wf3 r12 = (te3.C51827wf3) r12
            if (r12 == 0) goto L_0x0175
            java.lang.String r12 = r12.f144031r
            if (r12 != 0) goto L_0x0176
            goto L_0x0175
        L_0x0169:
            java.lang.Object r12 = r6.get(r12)
            te3.wf3 r12 = (te3.C51827wf3) r12
            if (r12 == 0) goto L_0x0175
            java.lang.String r12 = r12.f144021e
            if (r12 != 0) goto L_0x0176
        L_0x0175:
            r12 = r7
        L_0x0176:
            int r15 = r12.length()
            if (r15 != 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r4 = 0
        L_0x017e:
            if (r4 != 0) goto L_0x01ba
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r15 = r15.mo62446e(r1)
            bl3.c r15 = r15.mo62447c(r0)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11871f2()
            pl1.n0 r2 = new pl1.n0
            up1.y r4 = up1.C27696y.RAW_IMAGE
            r2.<init>(r12, r4)
            pl1.e0$a r12 = pl1.C11978e0.C11979a.COMMON
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r12 = r0.mo11867O2(r12)
            l60.b r12 = r15.mo85956b(r2, r12)
            er1.p2$a r15 = new er1.p2$a
            r15.<init>(r13, r11, r14)
            r12.getClass()
            r12.f291320d = r15
            r12.mo85953c()
        L_0x01ba:
            java.lang.Class<dp1.y0> r12 = dp1.C58417y0.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            dp1.y0 r12 = (dp1.C58417y0) r12
            rs1.s8$a r13 = rs1.C13442s8.f38060Q0
            rs1.s8 r11 = r13.mo12873f(r11)
            if (r11 == 0) goto L_0x01ce
            te3.hj1 r3 = r11.mo12861q3()
        L_0x01ce:
            java.lang.String r11 = "miaojian_createsame"
            r12.Cx0(r8, r11, r7, r3)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7853p2.mo8958a(android.app.Activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0, qo3.n, int):void");
    }

    /* renamed from: b */
    public final void mo8959b(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "errMsg");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errCode", i);
        jSONObject.put("errmsg", str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "retJson.toString()");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C61926c.m72668M(new C7864r2(jSONObject2));
        }
        ((C39072t) C86312j.m106911c(C39072t.class)).r10(str2 == null ? "" : str2, jSONObject.toString(), str3 == null ? "" : str3, -1, "");
    }

    /* renamed from: c */
    public final C77398g mo8960c(Context context, C51827wf3 wf32) {
        boolean z;
        Class cls = C58417y0.class;
        C87412m.m108594g(context, "context");
        C49712hj1 hj12 = null;
        String str = "";
        if (wf32 == null || Util.isNullOrNil(wf32.f144029p)) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            y0Var.Cx0(1, "post_actionsheet_miaojian", str, f != null ? f.mo12861q3() : null);
            return null;
        }
        if (Util.isNullOrNil(wf32.f144029p)) {
            z = false;
        } else {
            C45685m mVar = C45685m.f123489a;
            String str2 = wf32.f144029p;
            if (str2 == null) {
                str2 = str;
            }
            String str3 = wf32.f144030q;
            if (str3 == null) {
                str3 = str;
            }
            z = mVar.mo71187b(context, str2, str3);
        }
        if (z) {
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            String str4 = wf32.f144027n;
            if (str4 == null) {
                str4 = str;
            }
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f2 = aVar.mo12873f(context);
            y0Var2.Cx0(1, "post_actionsheet_miaojian", str4, f2 != null ? f2.mo12861q3() : null);
            C58417y0 y0Var3 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f3 = aVar.mo12873f(context);
            if (f3 != null) {
                hj12 = f3.mo12861q3();
            }
            y0Var3.Cx0(0, "miaojian_post_tips", "{\"if_has_set\": 1}", hj12);
        } else {
            C58417y0 y0Var4 = (C58417y0) C86312j.m106911c(cls);
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            C13442s8 f4 = aVar2.mo12873f(context);
            y0Var4.Cx0(1, "post_actionsheet_miaojian", str, f4 != null ? f4.mo12861q3() : null);
            C58417y0 y0Var5 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f5 = aVar2.mo12873f(context);
            if (f5 != null) {
                hj12 = f5.mo12861q3();
            }
            y0Var5.Cx0(0, "miaojian_post_tips", "{\"if_has_set\": 0}", hj12);
        }
        String l5 = ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(context, wf32.f144024h);
        if (l5 != null) {
            str = l5;
        }
        return C76879j.m92707A(context, z ? context.getString(C0966R.string.enj, new Object[]{str}) : context.getString(C0966R.string.eni, new Object[]{str}), "", context.getString(C0966R.string.a18), context.getString(C0966R.string.f7926wf), new C7855b(z, context, wf32), C7856c.f26446d);
    }

    /* renamed from: d */
    public final C77398g mo8961d(BaseFinderFeed baseFinderFeed, Activity activity, C51827wf3 wf32) {
        boolean z;
        Activity activity2 = activity;
        C51827wf3 wf33 = wf32;
        Class cls = C58417y0.class;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(activity2, "context");
        Log.m105924i("Finder.FinderSdkShareUtil", "onClickPostSameStyle");
        String str = "";
        C49712hj1 hj12 = null;
        if (Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
            Intent intent = new Intent();
            intent.putExtra("key_create_scene", 5);
            intent.putExtra("key_router_to_profile", false);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(activity2, intent);
            C115669n.INSTANCE.mo160131h(20694, 1);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity2);
            y0Var.Cx0(1, "miaojian_createsame", str, f != null ? f.mo12861q3() : null);
            return null;
        } else if (wf33 == null || Util.isNullOrNil(wf33.f144029p)) {
            return null;
        } else {
            if (Util.isNullOrNil(wf33.f144029p)) {
                z = false;
            } else {
                C45685m mVar = C45685m.f123489a;
                String str2 = wf33.f144029p;
                if (str2 == null) {
                    str2 = str;
                }
                String str3 = wf33.f144030q;
                if (str3 == null) {
                    str3 = str;
                }
                z = mVar.mo71187b(activity2, str2, str3);
            }
            if (z) {
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                String fromAppExtInfo = baseFinderFeed.mo3513o().getFromAppExtInfo();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8 f2 = aVar.mo12873f(activity2);
                y0Var2.Cx0(1, "miaojian_createsame", fromAppExtInfo, f2 != null ? f2.mo12861q3() : null);
                C58417y0 y0Var3 = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f3 = aVar.mo12873f(activity2);
                if (f3 != null) {
                    hj12 = f3.mo12861q3();
                }
                y0Var3.Cx0(0, "miaojian_createsame_tips", "{\"if_has_set\": 1}", hj12);
            } else {
                C58417y0 y0Var4 = (C58417y0) C86312j.m106911c(cls);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                C13442s8 f4 = aVar2.mo12873f(activity2);
                y0Var4.Cx0(1, "miaojian_createsame", str, f4 != null ? f4.mo12861q3() : null);
                C58417y0 y0Var5 = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f5 = aVar2.mo12873f(activity2);
                if (f5 != null) {
                    hj12 = f5.mo12861q3();
                }
                y0Var5.Cx0(0, "miaojian_createsame_tips", "{\"if_has_set\": 0}", hj12);
            }
            String l5 = ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(activity2, wf33.f144024h);
            if (l5 == null) {
                l5 = str;
            }
            StringBuilder sb = new StringBuilder();
            String str4 = wf33.f144027n;
            if (str4 != null) {
                str = str4;
            }
            sb.append(str);
            sb.append(baseFinderFeed.mo3513o().getFromAppExtInfo());
            String sb4 = sb.toString();
            Log.m105924i("Finder.FinderSdkShareUtil", "universalLink " + sb4);
            return C76879j.m92707A(activity, z ? activity2.getString(C0966R.string.enj, new Object[]{l5}) : activity2.getString(C0966R.string.eni, new Object[]{l5}), "", activity2.getString(C0966R.string.a18), activity2.getString(C0966R.string.f7926wf), new C7857d(z, activity2, sb4, wf33), C7858e.f26451d);
        }
    }

    /* renamed from: e */
    public final void mo8962e(int i, HashMap<Integer, C51827wf3> hashMap, C76874e0 e0Var, Activity activity) {
        LinkedList<C51827wf3> linkedList;
        C87412m.m108594g(hashMap, "actionMap");
        C87412m.m108594g(activity, "context");
        C49712hj1 hj12 = null;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        C51967xf3 xf32 = c != null ? c.mo75251m2().f132498i : null;
        if (!(xf32 == null || (linkedList = xf32.f144633d) == null)) {
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C51827wf3 wf32 = (C51827wf3) next;
                    int i4 = i2 + i;
                    hashMap.put(Integer.valueOf(i4), wf32);
                    if (e0Var != null) {
                        e0Var.mo107142f(i4, wf32.f144020d);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
        if (f != null) {
            hj12 = f.mo12861q3();
        }
        y0Var.Cx0(0, "post_actionsheet_miaojian", "", hj12);
    }

    /* renamed from: f */
    public final void mo8963f(Context context, String str, String str2, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "uri");
        C87412m.m108594g(str2, "packageName");
        Log.m105924i("Finder.FinderSdkShareUtil", "startPostAction " + str2 + ", " + str);
        Intent intent = new Intent();
        intent.setData(Uri.parse(str + "&finderScene=" + i));
        intent.setPackage(str2);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderSdkShareUtil", "startPostAction", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/FinderSdkShareUtil", "startPostAction", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception e) {
            Log.m105920e("Finder.FinderSdkShareUtil", "startPostAction: error " + e.getMessage());
        }
    }
}

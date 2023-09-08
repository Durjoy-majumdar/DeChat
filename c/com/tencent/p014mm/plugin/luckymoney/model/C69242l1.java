package com.tencent.p014mm.plugin.luckymoney.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.C2CNYPredownloadImgEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.luckymoney.p073ui.SelectLuckyMoneyContactUI;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g32.C75846b;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20937c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Set;
import ke3.C88144b;
import o90.C100301b;
import p196ln.C76705f;
import p196ln.C76706g;
import p206nj.C76861g;
import p629ny.C76979h;
import p680ru.C77569h;
import p763ym.C53543s;
import te3.C50052jy2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.l1 */
public class C69242l1 {

    /* renamed from: a */
    public static HashMap<String, Long> f199264a = new HashMap<>();

    /* renamed from: b */
    public static int f199265b = Integer.MAX_VALUE;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.l1$a */
    public class C69243a implements Animation.AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.l1$b */
    public class C69244b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f199266a;

        /* renamed from: b */
        public final /* synthetic */ ScaleAnimation f199267b;

        public C69244b(View view, ScaleAnimation scaleAnimation) {
            this.f199266a = view;
            this.f199267b = scaleAnimation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f199266a.startAnimation(this.f199267b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    static {
        new C100301b(10, C69242l1.class);
    }

    /* renamed from: a */
    public static void m81595a(ImageView imageView, String str, String str2) {
        if (imageView != null) {
            C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
            if (Util.isNullOrNil(str2)) {
                str2 = ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93581h(str);
            }
            fVar.D20(imageView, str2, 0.1f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m81596b(android.app.Activity r12, int r13, java.lang.String r14, ob0.C117747y r15, android.os.Bundle r16, boolean r17, android.content.DialogInterface.OnClickListener r18, yq3.C79148e.C79149a r19, int r20) {
        /*
            r1 = r12
            r0 = r15
            java.lang.String r2 = "MicroMsg.LuckyMoneyUtil"
            java.lang.String r3 = "dealWithRealNameVerifyErr call"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = 0
            r4 = 416(0x1a0, float:5.83E-43)
            r5 = r13
            if (r5 == r4) goto L_0x0015
            java.lang.String r0 = "don't need realname verify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x0015:
            r11 = 2
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x003e
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.luckymoney.model.C69251n1
            if (r5 == 0) goto L_0x003e
            com.tencent.mm.plugin.luckymoney.model.n1 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69251n1) r0
            ob0.c r0 = r0.f199283e
            if (r0 == 0) goto L_0x003e
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.tg2 r0 = (te3.C64727tg2) r0
            te3.qv3 r0 = r0.f185557d
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = sf0.C48374j0.m53717f(r0)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0038 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)
        L_0x003e:
            r5 = 0
        L_0x003f:
            if (r5 == 0) goto L_0x0083
            java.lang.String r0 = "dealWithRealNameVerifyErr json is not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = "real_name_info"
            boolean r6 = r5.has(r0)
            if (r6 == 0) goto L_0x0052
            org.json.JSONObject r5 = r5.optJSONObject(r0)
        L_0x0052:
            java.lang.String r0 = "guide_flag"
            java.lang.String r0 = r5.optString(r0, r4)
            java.lang.String r6 = "guide_wording"
            java.lang.String r6 = r5.optString(r6)
            r7 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r7 = r12.getString(r7)
            java.lang.String r8 = "left_button_wording"
            java.lang.String r7 = r5.optString(r8, r7)
            r8 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r8 = r12.getString(r8)
            java.lang.String r9 = "right_button_wording"
            java.lang.String r8 = r5.optString(r9, r8)
            java.lang.String r9 = "upload_credit_url"
            java.lang.String r4 = r5.optString(r9, r4)
            r5 = r0
            r0 = r4
            r4 = r6
            goto L_0x0087
        L_0x0083:
            r0 = r4
            r5 = r0
            r7 = r5
            r8 = r7
        L_0x0087:
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00a8
            java.lang.String r0 = "showRealnameDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r3 = 0
            r1 = r12
            r2 = r4
            r4 = r7
            r5 = r8
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            boolean r3 = a63.C67008a.m79172h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00e9
        L_0x00a8:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00c9
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x00c9
            java.lang.String r3 = "showUploadCreditDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r9 = 0
            r1 = r12
            r2 = r4
            r3 = r0
            r4 = r7
            r5 = r8
            r6 = r17
            r7 = r9
            a63.C67008a.m79173i(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            goto L_0x00e9
        L_0x00c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "guide_flag="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ";upload_credit_url=null?"
            r1.append(r4)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x00e9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81596b(android.app.Activity, int, java.lang.String, ob0.y, android.os.Bundle, boolean, android.content.DialogInterface$OnClickListener, yq3.e$a, int):boolean");
    }

    /* renamed from: c */
    public static String m81597c(Context context, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (j < 3600000) {
            return "";
        }
        long timeInMillis = j - new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return new SimpleDateFormat("HH:mm").format(new Date(j));
        }
        Time time = new Time();
        time.set(j);
        return C72714e.m85106a(context.getString(C0966R.string.eyj, new Object[]{" "}), time).toString();
    }

    /* renamed from: d */
    public static int m81598d(Context context) {
        if (f199265b == Integer.MAX_VALUE) {
            f199265b = context.getResources().getColor(C0966R.color.a2m);
        }
        return f199265b;
    }

    /* renamed from: e */
    public static String m81599e(String str) {
        Class cls = C75700k0.class;
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str);
        if (Lo != null) {
            return Lo.mo93597f();
        }
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var == null || !z1Var.getUsername().equals(str) || z1Var.f149499G == 4) {
            return null;
        }
        C86709a0.m107528h();
        byte[] f4 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69697f4(str);
        if (Util.isNullOrNil(f4)) {
            return null;
        }
        try {
            return ((C50052jy2) new C50052jy2().parseFrom(f4)).f136409U;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.LuckyMoneyUtil", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: f */
    public static long m81600f(String str) {
        long longValue;
        synchronized (C69242l1.class) {
            try {
                longValue = f199264a.get(str).longValue();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e, "", new Object[0]);
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return longValue;
    }

    /* renamed from: g */
    public static String m81601g() {
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SELFINFO_SMALLIMGURL_STRING, (Object) null);
    }

    /* renamed from: h */
    public static String m81602h(String str) {
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || !z1Var.getUsername().equals(str)) {
            return null;
        }
        return z1Var.getNickname();
    }

    /* renamed from: i */
    public static void m81603i(MMActivity mMActivity, int i, int i2, int i3, boolean z) {
        if (i2 != 0 || i3 <= 1) {
            m81604j(mMActivity, i, z);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(mMActivity, SelectLuckyMoneyContactUI.class);
        intent.putExtra("key_friends_num", i3);
        if (z) {
            intent.putExtra("scene_from", 5);
        }
        mMActivity.startActivityForResult(intent, i);
    }

    /* renamed from: j */
    public static void m81604j(MMActivity mMActivity, int i, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        if (z) {
            intent.putExtra("scene_from", 5);
        }
        C88144b.m109802t(mMActivity, ".ui.transmit.SelectConversationUI", intent, i);
    }

    /* renamed from: k */
    public static void m81605k(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(str2);
            f4Var.mo100991d(3);
            f4Var.mo108732L2(str);
            f4Var.mo108733M2(C75604z3.m90841m(str2, System.currentTimeMillis() / 1000));
            f4Var.setType(10000);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        }
    }

    /* renamed from: l */
    public static boolean m81606l(int i) {
        return i == 2;
    }

    /* renamed from: m */
    public static boolean m81607m() {
        return ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8;
    }

    /* renamed from: n */
    public static boolean m81608n(int i) {
        Set<String> set = C45628s0.f123410p;
        Log.m105925i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser sceneid :%s ", Integer.valueOf(i));
        if (i == 1005) {
            Log.m105924i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use union luckymoney ");
            return true;
        }
        Log.m105924i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use normal luckymoney ");
        return false;
    }

    /* renamed from: o */
    public static boolean m81609o(String str) {
        Log.m105925i("MicroMsg.LuckyMoneyUtil", "union luckymoney logic：OpenUnionLuckyMoney switch is ：%s", Boolean.TRUE);
        return C45628s0.m50749N(str);
    }

    /* renamed from: p */
    public static void m81610p(ImageView imageView, String str, String str2, boolean z) {
        Log.m105925i("MicroMsg.LuckyMoneyUtil", "load url: %s", str);
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        if (!Util.isNullOrNil(str)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C75846b.zx0().Dx0();
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59364t = z;
            if (z) {
                bVar.f59365u = 0.0f;
            }
            if (!Util.isNullOrNil(str2)) {
                bVar.f59352h = str2;
                bVar.f59349e = true;
            } else {
                bVar.f59349e = false;
            }
            C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
        }
    }

    /* renamed from: q */
    public static boolean m81611q() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_busi_luckymoney_normal_new_style_open_config, true);
        Log.m105925i("MicroMsg.LuckyMoneyUtil", "openNewStyleConfig：%s ", Boolean.valueOf(wf));
        return wf;
    }

    /* renamed from: r */
    public static void m81612r(View view) {
        View view2 = view;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.4f, 0.98f, 0.4f, 0.98f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.98f, 1.0f, 0.98f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(50);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new C69243a());
        if (view2 != null) {
            view2.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: s */
    public static void m81613s(View view, Animation.AnimationListener animationListener) {
        View view2 = view;
        Animation.AnimationListener animationListener2 = animationListener;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new C69244b(view2, scaleAnimation2));
        if (animationListener2 != null) {
            scaleAnimation2.setAnimationListener(animationListener2);
        }
        if (view2 != null) {
            view2.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: t */
    public static boolean m81614t(String str, String str2, int i) {
        Class cls = C77569h.class;
        Class cls2 = C53543s.class;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.LuckyMoneyUtil", Util.nullAsNil(str) + ", " + Util.nullAsNil(str2));
            return false;
        }
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108732L2(str);
        f4Var.mo100991d(2);
        f4Var.mo108749c3(str2);
        f4Var.mo108733M2(C75604z3.m90843o(str2));
        f4Var.mo108740T2(1);
        if (i == 3) {
            f4Var.setType(469762097);
        } else {
            f4Var.setType(436207665);
        }
        long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        if (my02 < 0) {
            Log.m105920e("MicroMsg.LuckyMoneyUtil", C76861g.m92660c() + "insert msg failed :" + my02);
            return false;
        }
        if (f4Var.mo101020w3()) {
            ((C77569h) C86312j.m106911c(cls)).mo35239e8(f4Var, C40339m.m43520a(f4Var));
        } else {
            ((C77569h) C86312j.m106911c(cls)).mo35228B1(f4Var);
        }
        f4Var.setMsgId(my02);
        C68070l lVar = new C68070l();
        lVar.field_xml = f4Var.getContent();
        String processXml = Util.processXml(str);
        C68070l.C68072b bVar = null;
        if (!(processXml == null || (bVar = C68070l.C68072b.m80422u(processXml, f4Var.mo108775z2())) == null)) {
            lVar.field_title = bVar.f195570f;
            lVar.field_description = bVar.f195574g;
        }
        lVar.field_type = 2001;
        lVar.field_msgId = my02;
        if (bVar != null && bVar.f195582i == 2001 && bVar.f195492H == 1) {
            if (TextUtils.isEmpty(bVar.f195620r1) || TextUtils.isEmpty(bVar.f195624s1) || bVar.f195628t1 <= 0) {
                Log.m105920e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
                C2CNYPredownloadImgEvent c2CNYPredownloadImgEvent = new C2CNYPredownloadImgEvent();
                C2CNYPredownloadImgEvent.C67664a aVar = new C2CNYPredownloadImgEvent.C67664a();
                c2CNYPredownloadImgEvent.f193503d = aVar;
                aVar.f193505b = bVar.f195624s1;
                aVar.f193504a = bVar.f195620r1;
                aVar.f193506c = bVar.f195628t1;
                c2CNYPredownloadImgEvent.publish();
            }
        }
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135038a0(my02);
        if (a0 != null && a0.field_msgId == my02) {
            ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135037Lo(lVar, new String[0]);
        } else if (!((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135039jo(lVar)) {
            Log.m105920e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + my02);
        }
        return true;
    }

    /* renamed from: u */
    public static void m81615u(TextView textView) {
        textView.setShadowLayer(8.0f, 0.0f, 0.0f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3137gl));
    }

    /* renamed from: v */
    public static void m81616v(Context context, TextView textView, String str) {
        if (textView != null) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, str, textView.getTextSize()));
        }
    }

    /* renamed from: w */
    public static void m81617w(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageResource(C0966R.C0969drawable.f5017ua);
            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
            if (animationDrawable != null) {
                animationDrawable.start();
            }
        }
    }

    /* renamed from: x */
    public static void m81618x(ImageView imageView) {
        AnimationDrawable animationDrawable;
        if (imageView != null && (imageView.getDrawable() instanceof AnimationDrawable) && (animationDrawable = (AnimationDrawable) imageView.getDrawable()) != null) {
            animationDrawable.stop();
        }
    }
}

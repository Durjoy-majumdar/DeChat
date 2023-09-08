package com.tencent.p014mm.plugin.newtips.model;

import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.wxmm.v2encoder;
import f40.C86718e;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.newtips.model.i */
public class C115624i {
    /* renamed from: a */
    public static void m162565a(C115619a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.NewTips.NewTipsHelper", "clearCompatTag() iNewTipsView == null");
            return;
        }
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, false);
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_NEW, false);
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, false);
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, false);
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, false);
        aVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_COUNTER, false);
    }

    /* renamed from: b */
    public static boolean m162566b(C115619a aVar, C115631n nVar, boolean z) {
        byte b;
        byte b2;
        if (aVar == null || aVar.mo64133e() == null) {
            return false;
        }
        try {
            b = ((Byte) aVar.mo64133e().getTag(C0966R.C0970id.f358847he0)).byteValue();
        } catch (Exception e) {
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "editOldNewTipsTag() getTag(R.id.new_tips_tag_show_type_old) [%s]", e.toString());
            b = 0;
        }
        Log.m105919d("MicroMsg.NewTips.NewTipsHelper", "editOldNewTipsTag() path:%s origin state:%s", aVar.getPath(), Long.toBinaryString((long) b));
        switch (nVar.ordinal()) {
            case 1:
                if (!z) {
                    b2 = b & 31;
                    break;
                } else {
                    b2 = b | 32;
                    break;
                }
            case 2:
                if (!z) {
                    b2 = b & 47;
                    break;
                } else {
                    b2 = b | v2encoder.enumCODEC_vcodec2;
                    break;
                }
            case 3:
                if (!z) {
                    b2 = b & 55;
                    break;
                } else {
                    b2 = b | 8;
                    break;
                }
            case 4:
                if (!z) {
                    b2 = b & 59;
                    break;
                } else {
                    b2 = b | 4;
                    break;
                }
            case 5:
                if (!z) {
                    b2 = b & 61;
                    break;
                } else {
                    b2 = b | 2;
                    break;
                }
            case 6:
                if (!z) {
                    b2 = b & 62;
                    break;
                } else {
                    b2 = b | 1;
                    break;
                }
            default:
                aVar.mo64133e().setTag(C0966R.C0970id.f358847he0, Byte.valueOf(b));
                Log.m105919d("MicroMsg.NewTips.NewTipsHelper", "editOldNewTipsTag() path:%s showType:%s result:%s", aVar.getPath(), nVar.f346867d, Long.toBinaryString((long) b));
                return true;
        }
        b = (byte) b2;
        aVar.mo64133e().setTag(C0966R.C0970id.f358847he0, Byte.valueOf(b));
        Log.m105919d("MicroMsg.NewTips.NewTipsHelper", "editOldNewTipsTag() path:%s showType:%s result:%s", aVar.getPath(), nVar.f346867d, Long.toBinaryString((long) b));
        return true;
    }

    /* renamed from: c */
    public static int m162567c(String str) {
        if (Util.isEqual(str, "me")) {
            return 1;
        }
        if (Util.isEqual(str, "discovery")) {
            return 2;
        }
        if (Util.isEqual(str, "plus")) {
            return 3;
        }
        if (Util.isEqual(str, "plus_receiveorpay")) {
            return 4;
        }
        if (Util.isEqual(str, "pay_receiveorpay")) {
            return 5;
        }
        if (Util.isEqual(str, "topstories")) {
            return 6;
        }
        if (Util.isEqual(str, "topstories_wow")) {
            return 7;
        }
        if (Util.isEqual(str, "topstories_top")) {
            return 8;
        }
        if (Util.isEqual(str, "search")) {
            return 9;
        }
        if (Util.isEqual(str, "dining_nearby")) {
            return 10;
        }
        if (Util.isEqual(str, "shopping")) {
            return 11;
        }
        if (Util.isEqual(str, "game")) {
            return 12;
        }
        if (Util.isEqual(str, WeChatBrands.Business.GROUP_PAY)) {
            return 13;
        }
        if (Util.isEqual(str, "card")) {
            return 14;
        }
        if (Util.isEqual(str, "textstate_history")) {
            return 37;
        }
        if (Util.isEqual(str, FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
            return 36;
        }
        if (Util.isEqual(str, "wallet")) {
            return 15;
        }
        if (Util.isEqual(str, "grouppayreddot")) {
            return 16;
        }
        if (Util.isEqual(str, "facingreceivereddot")) {
            return 17;
        }
        if (Util.isEqual(str, "facingreceiveremerchantapplydot")) {
            return 40;
        }
        if (Util.isEqual(str, "facingreceiveremerchantdot")) {
            return 41;
        }
        if (Util.isEqual(str, "f2fhongbaoreddot")) {
            return 18;
        }
        if (Util.isEqual(str, "rewardcodereddot")) {
            return 19;
        }
        if (Util.isEqual(str, "transfertoreddot")) {
            return 20;
        }
        if (Util.isEqual(str, "transtobankreddot")) {
            return 21;
        }
        if (Util.isEqual(str, "mobiletransferreddot")) {
            return 22;
        }
        if (Util.isEqual(str, "finder")) {
            return 24;
        }
        if (Util.isEqual(str, "chatroom")) {
            return 25;
        }
        if (Util.isEqual(str, "chatroommgr")) {
            return 26;
        }
        if (Util.isEqual(str, "useww")) {
            return 27;
        }
        if (Util.isEqual(str, "finder_tl_hot_tab")) {
            return 28;
        }
        if (Util.isEqual(str, "finder_tl_nearby_tab")) {
            return 29;
        }
        if (Util.isEqual(str, "screenShare")) {
            return 35;
        }
        if (Util.isEqual(str, "setting")) {
            return 30;
        }
        if (Util.isEqual(str, "about")) {
            return 38;
        }
        if (Util.isEqual(str, "versionIntro")) {
            return 39;
        }
        if (Util.isEqual(str, "privacyUpdate")) {
            return 42;
        }
        if (Util.isEqual(str, "general")) {
            return 31;
        }
        if (Util.isEqual(str, "wechattools")) {
            return 32;
        }
        if (Util.isEqual(str, "inputmethod")) {
            return 33;
        }
        if (Util.isEqual(str, "plugin")) {
            return 34;
        }
        if (Util.isEqual(str, "weapp")) {
            return 43;
        }
        if (Util.isEqual(str, "stickernavright")) {
            return 44;
        }
        return Util.isEqual(str, "sticker") ? 45 : 0;
    }

    /* renamed from: d */
    public static String m162568d(int i) {
        if (i == 1) {
            return "me";
        }
        if (i == 2) {
            return "discovery";
        }
        if (i == 3) {
            return "plus";
        }
        if (i == 4) {
            return "plus_receiveorpay";
        }
        if (i == 5) {
            return "pay_receiveorpay";
        }
        if (i == 6) {
            return "topstories";
        }
        if (i == 7) {
            return "topstories_wow";
        }
        if (i == 8) {
            return "topstories_top";
        }
        if (i == 9) {
            return "search";
        }
        if (i == 10) {
            return "dining_nearby";
        }
        if (i == 11) {
            return "shopping";
        }
        if (i == 12) {
            return "game";
        }
        if (i == 13) {
            return WeChatBrands.Business.GROUP_PAY;
        }
        if (i == 14) {
            return "card";
        }
        if (i == 37) {
            return "textstate_history";
        }
        if (i == 36) {
            return FFmpegMetadataRetriever.METADATA_KEY_ALBUM;
        }
        if (i == 15) {
            return "wallet";
        }
        if (i == 16) {
            return "grouppayreddot";
        }
        if (i == 17) {
            return "facingreceivereddot";
        }
        if (i == 40) {
            return "facingreceiveremerchantapplydot";
        }
        if (i == 41) {
            return "facingreceiveremerchantdot";
        }
        if (i == 18) {
            return "f2fhongbaoreddot";
        }
        if (i == 19) {
            return "rewardcodereddot";
        }
        if (i == 20) {
            return "transfertoreddot";
        }
        if (i == 21) {
            return "transtobankreddot";
        }
        if (i == 22) {
            return "mobiletransferreddot";
        }
        if (i == 24) {
            return "finder";
        }
        if (i == 25) {
            return "chatroom";
        }
        if (i == 26) {
            return "chatroommgr";
        }
        if (i == 27) {
            return "useww";
        }
        if (i == 28) {
            return "finder_tl_hot_tab";
        }
        if (i == 29) {
            return "finder_tl_nearby_tab";
        }
        if (i == 35) {
            return "screenShare";
        }
        if (i == 30) {
            return "setting";
        }
        if (i == 38) {
            return "about";
        }
        if (i == 39) {
            return "versionIntro";
        }
        if (i == 42) {
            return "privacyUpdate";
        }
        if (i == 31) {
            return "general";
        }
        if (i == 32) {
            return "wechattools";
        }
        if (i == 33) {
            return "inputmethod";
        }
        if (i == 34) {
            return "plugin";
        }
        if (i == 43) {
            return "weapp";
        }
        if (i == 44) {
            return "stickernavright";
        }
        if (i == 45) {
            return "sticker";
        }
        return null;
    }

    /* renamed from: e */
    public static C115631n m162569e(C115619a aVar) {
        byte b;
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_NONE;
        if (aVar == null) {
            Log.m105924i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() curNewTip is null");
            return nVar;
        } else if (aVar.mo64133e() == null) {
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() path:%s root is null", aVar.getPath());
            return nVar;
        } else {
            try {
                b = ((Byte) aVar.mo64133e().getTag(C0966R.C0970id.hdy)).byteValue();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() getTag(R.id.new_tips_tag_show_type_new) [%s]", e.toString());
                b = 0;
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() path:%s state:%s", aVar.getPath(), Long.toBinaryString((long) b));
            return b != 1 ? b != 2 ? b != 4 ? b != 8 ? b != 16 ? b != 32 ? nVar : C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT : C115631n.MMNEWTIPS_SHOWTYPE_NEW : C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE : C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON : C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON : C115631n.MMNEWTIPS_SHOWTYPE_COUNTER;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r2 = (byte) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r5.mo64140o(r7, (com.tencent.p014mm.plugin.newtips.model.C115631n) r6.first);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r7 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r5.mo64133e().setTag(com.tencent.p014mm.C0966R.C0970id.hdy, java.lang.Byte.valueOf(r2));
        r5.mo64133e().setTag(com.tencent.p014mm.C0966R.C0970id.hdz, r6.second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r5.mo64133e().setTag(com.tencent.p014mm.C0966R.C0970id.hdy, 0);
        r5.mo64133e().setTag(com.tencent.p014mm.C0966R.C0970id.hdz, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        return new android.util.Pair<>(java.lang.Byte.valueOf(r2), java.lang.Boolean.valueOf(r0));
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Byte, java.lang.Boolean> m162570f(com.tencent.p014mm.plugin.newtips.model.C115619a r5, android.util.Pair<com.tencent.p014mm.plugin.newtips.model.C115631n, te3.tg4> r6, boolean r7) {
        /*
            java.lang.Object r0 = r6.first
            com.tencent.mm.plugin.newtips.model.n r0 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r0
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x004c;
                case 2: goto L_0x0042;
                case 3: goto L_0x0035;
                case 4: goto L_0x0029;
                case 5: goto L_0x001d;
                case 6: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0057
        L_0x000d:
            m162571g(r5)
            goto L_0x0057
        L_0x0011:
            java.lang.Object r0 = r6.second
            te3.tg4 r0 = (te3.tg4) r0
            boolean r0 = r5.mo25958g(r7, r0)
            if (r7 == 0) goto L_0x0058
            r2 = 1
            goto L_0x004a
        L_0x001d:
            java.lang.Object r0 = r6.second
            te3.tg4 r0 = (te3.tg4) r0
            boolean r0 = r5.mo64139n(r7, r0)
            if (r7 == 0) goto L_0x0058
            r2 = 2
            goto L_0x004a
        L_0x0029:
            java.lang.Object r0 = r6.second
            te3.tg4 r0 = (te3.tg4) r0
            boolean r0 = r5.mo64135j(r7, r0)
            if (r7 == 0) goto L_0x0058
            r2 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.Object r0 = r6.second
            te3.tg4 r0 = (te3.tg4) r0
            boolean r0 = r5.mo25962i(r7, r0)
            if (r7 == 0) goto L_0x0058
            r2 = 8
            goto L_0x004a
        L_0x0042:
            boolean r0 = r5.mo25960h(r7)
            if (r7 == 0) goto L_0x0058
            r2 = 16
        L_0x004a:
            byte r2 = (byte) r2
            goto L_0x0059
        L_0x004c:
            boolean r0 = r5.mo25956f(r7)
            if (r0 == 0) goto L_0x0058
            if (r7 == 0) goto L_0x0058
            r2 = 32
            goto L_0x004a
        L_0x0057:
            r0 = 0
        L_0x0058:
            r2 = 0
        L_0x0059:
            java.lang.Object r3 = r6.first
            com.tencent.mm.plugin.newtips.model.n r3 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r3
            r5.mo64140o(r7, r3)
            r3 = 2131310195(0x7f093673, float:1.8238695E38)
            r4 = 2131310194(0x7f093672, float:1.8238693E38)
            if (r7 == 0) goto L_0x007d
            android.view.View r7 = r5.mo64133e()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r7.setTag(r4, r1)
            android.view.View r5 = r5.mo64133e()
            java.lang.Object r6 = r6.second
            r5.setTag(r3, r6)
            goto L_0x0090
        L_0x007d:
            android.view.View r6 = r5.mo64133e()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6.setTag(r4, r7)
            android.view.View r5 = r5.mo64133e()
            r6 = 0
            r5.setTag(r3, r6)
        L_0x0090:
            android.util.Pair r5 = new android.util.Pair
            java.lang.Byte r6 = java.lang.Byte.valueOf(r2)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.newtips.model.C115624i.m162570f(com.tencent.mm.plugin.newtips.model.a, android.util.Pair, boolean):android.util.Pair");
    }

    /* renamed from: g */
    public static void m162571g(C115619a aVar) {
        C115631n e = m162569e(aVar);
        if (e != C115631n.MMNEWTIPS_SHOWTYPE_NONE) {
            Pair pair = new Pair(e, new tg4());
            if (aVar != null) {
                Pair<Byte, Boolean> f = m162570f(aVar, pair, false);
                Object[] objArr = new Object[6];
                objArr[0] = aVar.getPath();
                Object obj = pair.first;
                if (obj == null) {
                    obj = "null";
                }
                objArr[1] = obj;
                objArr[2] = m162577m((tg4) pair.second);
                objArr[3] = Boolean.FALSE;
                objArr[4] = f.first;
                objArr[5] = f.second;
                Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "showNewTips() path:%s pair:(%s, %s) show:%s state:%s result:%s", objArr);
            }
        }
    }

    /* renamed from: h */
    public static boolean m162572h(C115619a aVar) {
        byte b;
        if (aVar == null) {
            Log.m105924i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() curNewTip is null");
            return true;
        } else if (aVar.mo64133e() == null) {
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s root is null", aVar.getPath());
            return true;
        } else {
            try {
                b = ((Byte) aVar.mo64133e().getTag(C0966R.C0970id.f358847he0)).byteValue();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s getTag(R.id.new_tips_tag_show_type_old) [%s]", aVar.getPath(), e.toString());
                b = 0;
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s state:%s", aVar.getPath(), Long.toBinaryString((long) b));
            return b != 0;
        }
    }

    /* renamed from: i */
    public static boolean m162573i(C115619a aVar) {
        byte b;
        if (aVar == null) {
            Log.m105924i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() curNewTip is null");
            return false;
        } else if (aVar.mo64133e() == null) {
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() path:%s root is null", aVar.getPath());
            return false;
        } else {
            try {
                b = ((Byte) aVar.mo64133e().getTag(C0966R.C0970id.hdy)).byteValue();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() getTag(R.id.new_tips_tag_show_type_new) [%s]", e.toString());
                b = 0;
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() path:%s state:%s", aVar.getPath(), Long.toBinaryString((long) b));
            return b != 0;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r10 != r4) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r10 != r4) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008e, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009b, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a2, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a9, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b6, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00bd, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00c4, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00c7, code lost:
        if (r10 == r7) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00ce, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00d5, code lost:
        if (r10 != r5) goto L_0x00d8;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m162574j(jc2.C117343c r9, com.tencent.p014mm.plugin.newtips.model.C115631n r10) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9.f351294c
            r2 = 1
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            int r9 = r9.f351293b
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON
            com.tencent.mm.plugin.newtips.model.n r3 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON
            com.tencent.mm.plugin.newtips.model.n r4 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            com.tencent.mm.plugin.newtips.model.n r5 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_COUNTER
            com.tencent.mm.plugin.newtips.model.n r6 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NEW
            com.tencent.mm.plugin.newtips.model.n r7 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            com.tencent.mm.plugin.newtips.model.n r8 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NONE
            if (r10 != r8) goto L_0x001e
            goto L_0x00d9
        L_0x001e:
            switch(r9) {
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009e;
                case 9: goto L_0x0091;
                case 10: goto L_0x0084;
                case 11: goto L_0x0076;
                case 12: goto L_0x0068;
                case 13: goto L_0x005a;
                case 14: goto L_0x004c;
                case 15: goto L_0x0044;
                case 16: goto L_0x003c;
                case 17: goto L_0x003c;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x0021;
                case 24: goto L_0x002e;
                case 25: goto L_0x00c7;
                case 26: goto L_0x00c7;
                case 27: goto L_0x00c7;
                case 28: goto L_0x0021;
                case 29: goto L_0x0021;
                case 30: goto L_0x004c;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00c7;
                case 36: goto L_0x00c7;
                case 37: goto L_0x00c7;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x0023;
                case 43: goto L_0x00c7;
                case 44: goto L_0x0026;
                case 45: goto L_0x0026;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00d8
        L_0x0023:
            if (r10 != r4) goto L_0x0026
            r0 = 1
        L_0x0026:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r4) goto L_0x00d8
            goto L_0x00d7
        L_0x002e:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x003c:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r4) goto L_0x00d8
            goto L_0x00d7
        L_0x0044:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x004c:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x005a:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x0068:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x0076:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x0084:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x0091:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x009e:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00a5:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00ac:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 == r4) goto L_0x00d7
            if (r10 == r3) goto L_0x00d7
            if (r10 == r1) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00b9:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00c0:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00c7:
            if (r10 != r7) goto L_0x00d8
            goto L_0x00d7
        L_0x00ca:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
            goto L_0x00d7
        L_0x00d1:
            if (r10 == r7) goto L_0x00d7
            if (r10 == r6) goto L_0x00d7
            if (r10 != r5) goto L_0x00d8
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            r2 = r0
        L_0x00d9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.newtips.model.C115624i.m162574j(jc2.c, com.tencent.mm.plugin.newtips.model.n):boolean");
    }

    /* renamed from: k */
    public static void m162575k(String str, boolean z) {
        Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "setLocalNewTipsState() uniqueId:%s isReject:%s", str, Boolean.valueOf(z));
        MultiProcessMMKV.getMMKV("new_tips_" + C86718e.m107549h()).edit().putBoolean(str, z).commit();
    }

    /* renamed from: l */
    public static boolean m162576l(boolean z, C115619a aVar) {
        if (!m162573i(aVar)) {
            return false;
        }
        if (!z) {
            return true;
        }
        m162571g(aVar);
        return false;
    }

    /* renamed from: m */
    public static String m162577m(tg4 tg4) {
        if (tg4 == null) {
            return "null";
        }
        return "TipsInfo{num=" + tg4.f354435d + ", title='" + tg4.f354436e + '\'' + ", url='" + tg4.f354437f + '\'' + '}';
    }
}

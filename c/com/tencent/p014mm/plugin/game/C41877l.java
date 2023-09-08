package com.tencent.p014mm.plugin.game;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.game.autogen.chatroom.HalfScreen;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.WeappJumpInfo;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import cy1.C30962e;
import cy1.C7141g;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import kr0.C76630x0;
import ly1.C46913v0;
import ly1.C46914w0;
import org.json.JSONException;
import org.json.JSONObject;
import oy1.C11785d;
import p763ym.C39072t;
import py1.C47544a3;
import py1.C47605j1;
import py1.C47621l3;
import py1.C47628m3;
import py1.C47637n5;
import py1.C47655q2;
import py1.C47669s2;
import py1.C47713z2;
import qo3.C89779i0;
import qy1.C47890b;
import rw1.C48093a;
import sw1.C48478n;
import sw1.C48484q;
import uy1.C52642c;
import vx1.C53037a;
import vx1.C53038b;
import vx1.C53039c;
import w10.C53065b;
import yw1.C53601h;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.game.l */
public class C41877l extends C86301e implements C48478n {
    public int Fm0(int i) {
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            return 0;
        }
        return ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66010mL(i2);
    }

    /* renamed from: Go */
    public boolean mo65675Go() {
        int i = C48093a.f128946b;
        return i == 1 || i == 3;
    }

    public void Jc0() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_HISTORY_DELETED_BOOLEAN, Boolean.TRUE);
        ((C119157j) C119157j.f356862d).mo183875f(new l$$f(this));
    }

    /* renamed from: Jw */
    public String mo65677Jw(int i) {
        String str;
        int i2;
        Class cls = C48484q.class;
        if (i == 1) {
            str = MMApplicationContext.getContext().getString(C0966R.string.f9m);
            i2 = 1;
        } else if (i != 2) {
            return "";
        } else {
            str = MMApplicationContext.getContext().getString(C0966R.string.fb6);
            i2 = 2;
        }
        Cursor TE = ((C48484q) C86312j.m106911c(cls)).xi0().mo66002TE(i2);
        C42119w wVar = null;
        if (TE != null) {
            if (TE.moveToFirst()) {
                wVar = new C42119w();
                wVar.convertFrom(TE);
            }
            TE.close();
        }
        if (wVar == null) {
            return str;
        }
        wVar.mo66075l2();
        String str2 = wVar.f113491q1.f113529c;
        if (Util.isNullOrNil(str2)) {
            str2 = wVar.f113493s1.f113525b;
        }
        if (Util.isNullOrNil(str2)) {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.f88);
        }
        int mL = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(i2);
        if (mL <= 1) {
            return str2;
        }
        return MMApplicationContext.getContext().getString(C0966R.string.fae, new Object[]{Integer.valueOf(mL), str2});
    }

    /* renamed from: PW */
    public int mo65678PW(Context context, String str, String str2) {
        C47655q2 q2Var;
        C47669s2 s2Var;
        C47628m3 m3Var;
        String str3;
        Log.m105925i("MicroMsg.GameExternalService", "fromUsername:%s, toUsername:%s", str, str2);
        if (context != null && !Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            C47605j1 i = C41853c.m45375i();
            if (i == null || (q2Var = i.f127804h) == null || (s2Var = q2Var.f127946d) == null) {
                Log.m105924i("MicroMsg.GameExternalService", "no Gift info");
            } else {
                Log.m105925i("MicroMsg.GameExternalService", "GiftEntranceType:%d", Integer.valueOf(s2Var.f127994d));
                C47669s2 s2Var2 = i.f127804h.f127946d;
                int i2 = s2Var2.f127994d;
                if (i2 != 1) {
                    if (i2 == 2 && (m3Var = s2Var2.f127996f) != null && !Util.isNullOrNil(m3Var.f127870d)) {
                        String str4 = i.f127804h.f127946d.f127996f.f127871e;
                        if (Util.isNullOrNil(str4)) {
                            str3 = "?from_username=" + URLEncoder.encode(str) + "&to_username=" + URLEncoder.encode(str2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("from_username", str);
                            hashMap.put("to_username", str2);
                            str3 = C52642c.m58983a(str4, hashMap);
                        }
                        Log.m105925i("MicroMsg.GameExternalService", "Gift Weapp, AppId:%s, Path:%s", i.f127804h.f127946d.f127996f.f127870d, str3);
                        C47628m3 m3Var2 = i.f127804h.f127946d.f127996f;
                        String str5 = m3Var2.f127870d;
                        int i3 = m3Var2.f127872f;
                        MMHandler mMHandler = C52642c.f146980a;
                        C86299o oVar = new C86299o();
                        oVar.f250930b = str5;
                        oVar.f250934f = str3;
                        oVar.f250931c = i3;
                        oVar.f250939k = 1079;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
                        return 71;
                    }
                } else if (!Util.isNullOrNil(s2Var2.f127995e)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("from_username", str);
                    hashMap2.put("to_username", str2);
                    String a = C52642c.m58983a(i.f127804h.f127946d.f127995e, hashMap2);
                    Log.m105925i("MicroMsg.GameExternalService", "Gift jumpUrl:%s", a);
                    C52642c.m59001s(context, a);
                    return 40;
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: Pf */
    public void mo65679Pf(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ((C53039c) ((C48484q) C86312j.m106911c(C48484q.class)).mo66103Jx()).mo73746Lo(arrayList);
    }

    public List<C48478n.C13792e> Qj0() {
        List<C53037a> Yt = ((C53039c) ((C48484q) C86312j.m106911c(C48484q.class)).mo66103Jx()).mo73747Yt(C86709a0.m107523b().mo121111i());
        if (Util.isNullOrNil((List) Yt)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) Yt).iterator();
        while (it.hasNext()) {
            arrayList.add(xx0((C53037a) it.next()));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b A[Catch:{ all -> 0x0046, all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050 A[Catch:{ all -> 0x0046, all -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Vk0() {
        /*
            r5 = this;
            java.lang.Class<sw1.q> r0 = sw1.C48484q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.q r0 = (sw1.C48484q) r0
            vx1.b r0 = r0.mo66103Jx()
            f40.e r1 = f40.C86709a0.m107523b()
            java.lang.String r1 = r1.mo121111i()
            vx1.c r0 = (vx1.C53039c) r0
            r0.getClass()
            java.lang.String r2 = "userId"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT count(*) FROM GameLocalVideoInfo WHERE userId = "
            r2.append(r3)
            java.lang.String r1 = zh3.C91753f.m115264e(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            zh3.f r0 = r0.f148057d
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r0.rawQuery(r1, r2, r3)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0048
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r4 != r1) goto L_0x0048
            goto L_0x0049
        L_0x0046:
            r1 = move-exception
            goto L_0x0059
        L_0x0048:
            r1 = 0
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0052
        L_0x0050:
            r3 = 0
        L_0x0052:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0046 }
            cy3.C58003b.m67160a(r0, r2)
            int r0 = (int) r3
            return r0
        L_0x0059:
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.C41877l.Vk0():int");
    }

    public void W20(List<C48478n.C13793h> list, int i, C48478n.C48481f fVar) {
        C48478n.C48481f fVar2 = fVar;
        C46914w0 w0Var = new C46914w0();
        C87412m.m108594g(list, "videoFiles");
        if (!list.isEmpty()) {
            for (C48478n.C13793h hVar : list) {
                String str = hVar.f38917a;
                String str2 = hVar.f38920d;
                C47890b.m53202c(new C53065b(str, 0, 1, 2, 2, 0, hVar.f38923g, hVar.f38924h, str2, 34, (C8480h) null));
            }
            String d = VFSStrategy.m163776d("gameCenterVideos");
            ArrayList arrayList = new ArrayList();
            ((C119157j) C119157j.f356862d).mo183875f(new C46913v0(list, d, w0Var, arrayList, i, fVar));
        } else if (fVar2 != null) {
            fVar2.mo6931a("videoFiles is empty");
        }
    }

    public void Yd0(Context context, C48478n.C13793h hVar, C48478n.C48481f fVar) {
        vx0(context, hVar, 2, fVar);
    }

    public void Zs0(C53065b bVar) {
        C47890b.m53202c(bVar);
    }

    public void ew0(Context context) {
        C47544a3 a3Var;
        C47605j1 i = C41853c.m45375i();
        if (i != null && (a3Var = i.f127801e) != null && !Util.isNullOrNil(a3Var.f127560d)) {
            C52642c.m59001s(context, i.f127801e.f127560d);
        }
    }

    /* renamed from: fa */
    public void mo65686fa() {
        HalfScreen halfScreen;
        C47621l3 l3Var = C48093a.f128947c;
        if (l3Var == null) {
            Log.m105920e("MicroMsg.GameExternalService", "gamelog.account , manage , jumpAccountPage error ,JumpInfo is null");
            return;
        }
        Context context = MMApplicationContext.getContext();
        JumpInfo jumpInfo = new JumpInfo();
        jumpInfo.jump_type = l3Var.f127855d;
        jumpInfo.jump_url = l3Var.f127856e;
        C47713z2 z2Var = l3Var.f127858g;
        WeappJumpInfo weappJumpInfo = null;
        if (z2Var != null) {
            halfScreen = new HalfScreen();
            halfScreen.type = z2Var.f128181d;
            halfScreen.screen_height_dp = z2Var.f128182e;
            halfScreen.screen_height_percent = z2Var.f128183f;
        } else {
            halfScreen = null;
        }
        jumpInfo.half_screen = halfScreen;
        C47637n5 n5Var = l3Var.f127857f;
        if (n5Var != null) {
            weappJumpInfo = new WeappJumpInfo();
            weappJumpInfo.appid = n5Var.f127893d;
            weappJumpInfo.path = n5Var.f127894e;
        }
        jumpInfo.weapp_jump_info = weappJumpInfo;
        C53601h.m60129h(context, jumpInfo);
    }

    /* renamed from: jZ */
    public void mo65687jZ(int i) {
        Log.m105924i("GameAccountManager", "gamelog.account, manage ,jsapi handleAccountStateChanged state = " + i);
        if (i == 1) {
            C48093a.m53460a();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
            C48093a.f128946b = 1;
        } else if (i == 2) {
            C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
            xi02.getClass();
            xi02.execSQL("GameRawMessage", "update GameRawMessage set isHidden = 0 where isHidden = 2 and showType = 1");
            C48093a.f128946b = 0;
        } else if (i == 3) {
            C48093a.m53461b();
            C48093a.f128946b = 0;
        } else {
            Log.m105920e("GameAccountManager", "gamelog.account, manage , notify AccountStateChanged state = " + i);
        }
    }

    public void jg0(MMFragmentActivity mMFragmentActivity, C48478n.C13793h hVar, C48478n.C48481f fVar) {
        vx0(mMFragmentActivity, hVar, 1, fVar);
    }

    /* renamed from: kS */
    public void mo65689kS() {
        C46914w0 w0Var = new C46914w0();
        Class cls = C48484q.class;
        String i = C86709a0.m107523b().mo121111i();
        C53038b Jx = ((C48484q) C86312j.m106911c(cls)).mo66103Jx();
        C87412m.m108593f(i, "userId");
        List<C53037a> Yt = ((C53039c) Jx).mo73747Yt(i);
        ArrayList arrayList = (ArrayList) Yt;
        if (!arrayList.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C53037a aVar = (C53037a) it.next();
                if (currentTimeMillis - aVar.field_createTime > 2592000000L) {
                    arrayList2.add(aVar.field_fileId);
                }
            }
            if (arrayList2.isEmpty()) {
                w0Var.mo72120b(Yt, 3);
                return;
            }
            ((C53039c) ((C48484q) C86312j.m106911c(cls)).mo66103Jx()).mo73746Lo(arrayList2);
            w0Var.mo72120b(((C53039c) ((C48484q) C86312j.m106911c(cls)).mo66103Jx()).mo73747Yt(i), 3);
            Log.m105924i("MicroMsg.MiniGameVideoProcessor", "gamelog.init , manage video , clearExpiredVideo, expiredVideoIdList size = " + arrayList2.size());
        }
    }

    /* renamed from: pN */
    public void mo65690pN(String str, C48478n.C13791d dVar) {
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            Uri parse = Uri.parse(str);
            String str2 = parse.getHost() + parse.getPath();
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z && dVar != null) {
                dVar.mo5391a((C48478n.C13790c) null);
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str2), C30962e.C30963a.class, new C7141g(dVar));
        } else if (dVar != null) {
            dVar.mo5391a((C48478n.C13790c) null);
        }
    }

    /* renamed from: r6 */
    public void mo65691r6(Context context, C48478n.C13793h hVar, C48478n.C48481f fVar) {
        C47890b.m53201b(hVar.f38917a, 3, 103, 2, 0, hVar.f38920d, hVar.f38924h, hVar.f38923g);
        ((C119157j) C119157j.f356862d).mo183875f(new l$$g(this, hVar, fVar, context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw r1;
     */
    /* renamed from: rR */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sw1.C48478n.C13792e mo65692rR(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<sw1.q> r0 = sw1.C48484q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.q r0 = (sw1.C48484q) r0
            vx1.b r0 = r0.mo66103Jx()
            vx1.c r0 = (vx1.C53039c) r0
            r0.getClass()
            r1 = 0
            if (r5 != 0) goto L_0x0016
            r5 = r1
            goto L_0x0050
        L_0x0016:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT * FROM GameLocalVideoInfo WHERE fileId = "
            r2.append(r3)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            zh3.f r0 = r0.f148057d
            r3 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r1, r3)
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0047
            vx1.a r0 = new vx1.a     // Catch:{ all -> 0x0058 }
            r0.<init>()     // Catch:{ all -> 0x0058 }
            r0.convertFrom(r5)     // Catch:{ all -> 0x0058 }
            r2.f27484d = r0     // Catch:{ all -> 0x0058 }
        L_0x0047:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0058 }
            cy3.C58003b.m67160a(r5, r1)
            T r5 = r2.f27484d
            vx1.a r5 = (vx1.C53037a) r5
        L_0x0050:
            if (r5 == 0) goto L_0x0057
            sw1.n$e r5 = r4.xx0(r5)
            return r5
        L_0x0057:
            return r1
        L_0x0058:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.C41877l.mo65692rR(java.lang.String):sw1.n$e");
    }

    /* renamed from: rp */
    public void mo65693rp(Context context, C48478n.C13793h hVar, C48478n.C48482g gVar) {
        if (C86013q1.m106450k(hVar.f38919c)) {
            C11785d dVar = new C11785d(hVar, 3);
            C89779i0 e = C89779i0.m112248e(context, context.getString(C0966R.string.mug), true, 3, new l$$a(dVar));
            ((C119157j) C119157j.f356862d).mo183875f(new l$$b(this, dVar, context, gVar, e));
        } else if (gVar != null) {
            gVar.mo5395a("file not exist");
        }
    }

    /* renamed from: tC */
    public void mo65694tC(C48478n.C48479a aVar) {
        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_LIFE_HISTORY_DELETED_BOOLEAN, Boolean.FALSE)).booleanValue()) {
            ((C119157j) C119157j.f356862d).mo183875f(new l$$e(this, aVar));
        } else if (aVar != null) {
            aVar.mo71895a((C48478n.C48480b) null);
        }
    }

    public final void vx0(Context context, C48478n.C13793h hVar, int i, C48478n.C48481f fVar) {
        Context context2 = context;
        C48478n.C13793h hVar2 = hVar;
        int i2 = i;
        C48478n.C48481f fVar2 = fVar;
        if (i2 == 2) {
            C47890b.m53201b(hVar2.f38917a, 3, 102, 2, 0, hVar2.f38920d, hVar2.f38924h, hVar2.f38923g);
        } else {
            C47890b.m53201b(hVar2.f38917a, 3, 101, 2, 0, hVar2.f38920d, hVar2.f38924h, hVar2.f38923g);
        }
        if (C86013q1.m106450k(hVar2.f38919c)) {
            C11785d dVar = new C11785d(hVar2, i2);
            C89779i0 e = C89779i0.m112248e(context2, context2.getString(C0966R.string.mug), true, 3, new l$$c(dVar));
            ((C119157j) C119157j.f356862d).mo183875f(new l$$d(this, dVar, context, e, fVar, i, hVar));
        } else if (fVar2 != null) {
            fVar2.mo6931a("file not exist");
        }
    }

    public final void wx0(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent();
        intent.putExtra("start_time", System.currentTimeMillis());
        intent.putExtra("default_game_tab_key", str);
        intent.putExtra("key_game_url_ext_param", str2);
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_open_by_sdk", true);
        bundle.putString("key_back_appid", str4);
        bundle.putString("key_open_business_type", str5);
        intent.putExtra("key_bundle_ext_data", bundle);
        intent.putExtra("key_game_profile_tab_type", "tab_type=" + str3 + "&game_tab_key=" + str4 + "&jump_from=game");
        C88144b.m109791i(MMApplicationContext.getContext(), "game", ".ui.GameCenterUI", intent, (Bundle) null);
    }

    /* renamed from: x1 */
    public void mo65697x1(String str, String str2, String str3) {
        JSONObject jSONObject;
        String str4 = str3;
        Class cls = C39072t.class;
        Log.m105925i("MicroMsg.GameExternalService", "businessType:%s; appid:%s; extInfo:%s", str, str2, str4);
        try {
            JSONObject jSONObject2 = new JSONObject(str4);
            String optString = jSONObject2.optString("gameMethodName");
            String str5 = "1";
            if (TextUtils.equals(optString, "openGameCenter")) {
                String optString2 = jSONObject2.optString("gameParams");
                if (Util.isNullOrNil(optString2)) {
                    wx0(Scopes.PROFILE, (String) null, "1", str2, str);
                    return;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject(optString2);
                    String optString3 = jSONObject3.optString("fromGameParam");
                    String optString4 = jSONObject3.optString("profileTabType", str5);
                    String optString5 = jSONObject3.optString("tabKey");
                    if (Util.isNullOrNil(optString5)) {
                        wx0(Scopes.PROFILE, optString3, optString4, str2, str);
                    } else {
                        wx0(optString5, optString3, optString4, str2, str);
                    }
                } catch (JSONException unused) {
                    ((C39072t) C86312j.m106911c(cls)).r10(str, "json is invalid gameParams is not json", str2, -3, "json is invalid  gameParams is not jso");
                }
            } else if (TextUtils.equals(optString, "openGameLifeProfile")) {
                StringBuilder sb = new StringBuilder("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/homepage.html");
                sb.append("?");
                sb.append("from_appid=");
                sb.append(str2);
                String optString6 = jSONObject2.optString("gameParams");
                if (!Util.isNullOrNil(optString6)) {
                    try {
                        jSONObject = new JSONObject(optString6);
                    } catch (JSONException e) {
                        Log.m105920e("MicroMsg.GameExternalService", e.getMessage());
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (jSONObject.optBoolean("withPkgid", false)) {
                            sb.append("&wechat_pkgid=gamelife_homepage");
                        }
                        String optString7 = jSONObject.optString("fromGameParam");
                        if (!Util.isNullOrNil(optString7)) {
                            try {
                                String encode = URLEncoder.encode(optString7, "UTF-8");
                                sb.append("&fromGameParam=");
                                sb.append(encode);
                            } catch (UnsupportedEncodingException e2) {
                                Log.m105920e("MicroMsg.GameExternalService", e2.getMessage());
                            }
                        }
                        String optString8 = jSONObject.optString("profileTabType");
                        if (!Util.isNullOrNil(optString8)) {
                            str5 = optString8;
                        }
                        sb.append("&tab_type=");
                        sb.append(str5);
                    }
                    sb.append("&game_tab_key=");
                    sb.append(str2);
                    sb.append("&jump_from=game");
                }
                String sb4 = sb.toString();
                Log.m105925i("MicroMsg.GameExternalService", "before GameJumpUtil.jumpWebView url :%s", sb4);
                Context context = MMApplicationContext.getContext();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_open_by_sdk", true);
                bundle.putString("key_back_appid", str2);
                bundle.putString("key_open_business_type", str);
                Intent intent = new Intent();
                intent.putExtra("key_bundle_ext_data", bundle);
                intent.putExtra("rawUrl", sb4);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                if (!Util.isNullOrNil((String) null)) {
                    intent.putExtra("KGamePreloadData", (String) null);
                }
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else {
                ((C39072t) C86312j.m106911c(cls)).r10(str, "json is invalid unSupport gameMethodName", str2, -3, "json is invalid  unSupport gameMethodName");
            }
        } catch (JSONException unused2) {
            ((C39072t) C86312j.m106911c(cls)).r10(str, "json is invalid", str2, -3, "json is invalid");
        }
    }

    public final C48478n.C13792e xx0(C53037a aVar) {
        C48478n.C13792e eVar = new C48478n.C13792e();
        eVar.f38908b = aVar.field_appId;
        eVar.f38907a = aVar.field_fileId;
        eVar.f38910d = aVar.field_filePath;
        eVar.f38911e = aVar.field_createTime;
        eVar.f38909c = aVar.field_appName;
        eVar.f38914h = aVar.field_title;
        eVar.f38915i = aVar.field_desc;
        eVar.f38912f = aVar.field_durationSec;
        eVar.f38913g = aVar.field_coverPath;
        eVar.f38916j = aVar.field_extJsonData;
        return eVar;
    }
}

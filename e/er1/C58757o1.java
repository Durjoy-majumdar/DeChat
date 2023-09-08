package er1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C87592u3;
import java.util.Map;
import je1.C9367q1;
import jm2.C117361f;
import ob0.C89132b;
import ot1.C11767a;
import p185kq.C10383h;
import p204mr.C61568m;
import rn3.C90065r0;
import rx3.C13598b0;
import te3.C49946j51;

/* renamed from: er1.o1 */
public final class C58757o1 implements C87592u3 {

    /* renamed from: a */
    public static final C58757o1 f168227a = new C58757o1();

    /* renamed from: er1.o1$a */
    public static final class C45686a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public static final C45686a<T> f123490a = new C45686a<>();

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Log.m105924i("Finder.FinderOpenSdkApi", "openLive failed, errCode: " + ((Integer) obj));
        }
    }

    /* renamed from: er1.o1$b */
    public static final class C45687b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public static final C45687b<T> f123491a = new C45687b<>();

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("Finder.FinderOpenSdkApi", "openLive succ");
        }
    }

    /* renamed from: er1.o1$c */
    public static final class C45688c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f123492a;

        /* renamed from: b */
        public final /* synthetic */ Context f123493b;

        public C45688c(String str, Context context) {
            this.f123492a = str;
            this.f123493b = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                FinderContact finderContact = ((FinderUserPageResponse) cVar.f256796d).contact;
                String str = finderContact != null ? finderContact.username : null;
                if (!(str == null || str.length() == 0)) {
                    Log.m105924i("Finder.FinderOpenSdkApi", "realUsername:" + str);
                    String str2 = this.f123492a;
                    Intent intent = new Intent();
                    intent.putExtra("finder_username", str);
                    intent.putExtra("key_extra_info", str2);
                    String e7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(11, 8, 32, intent);
                    if (!Util.isNullOrNil(this.f123492a)) {
                        C115669n.INSTANCE.mo160131h(21140, e7, this.f123492a, 0, str);
                    }
                    ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(e7);
                    ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this.f123493b, intent);
                } else {
                    Log.m105924i("Finder.FinderOpenSdkApi", "realUsername empty");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.o1$d */
    public static final class C58758d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C87592u3.C60207a f168228a;

        public C58758d(C87592u3.C60207a aVar) {
            this.f168228a = aVar;
        }

        public Object call(Object obj) {
            int i;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i2 = cVar.f256793a;
            if (i2 == 0 && (i = cVar.f256794b) == 0) {
                C87592u3.C60207a aVar = this.f168228a;
                if (aVar == null) {
                    return null;
                }
                ((C90065r0) aVar).mo124358a(i2, i, ((FinderUserPageResponse) cVar.f256796d).contact);
                return C13598b0.f38549a;
            }
            C87592u3.C60207a aVar2 = this.f168228a;
            if (aVar2 == null) {
                return null;
            }
            ((C90065r0) aVar2).mo124358a(i2, cVar.f256794b, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo83750a(Context context, String str, String str2, String str3, String str4) {
        Class cls = C58684b.class;
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "feedId");
        C87412m.m108594g(str3, "nonceId");
        if (context == null) {
            Log.m105924i("Finder.FinderOpenSdkApi", "openFeed context null");
            return;
        }
        Log.m105924i("Finder.FinderOpenSdkApi", "openFeed appid:" + str + ", feedId:" + str2 + ", nonceId:" + str3 + ", notGetRelatedList:" + str4);
        boolean b = C87412m.m108589b(str4, "0");
        Intent intent = new Intent();
        intent.putExtra("from_user", C75592q0.m90789s());
        intent.putExtra("feed_encrypted_object_id", str2);
        intent.putExtra("feed_object_nonceId", str3);
        intent.putExtra("key_need_related_list", b);
        intent.putExtra("key_comment_scene", 39);
        intent.putExtra("key_reuqest_scene", 0);
        intent.putExtra("key_session_id", "");
        intent.putExtra("key_extra_info", "");
        String e7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(11, 8, 39, intent);
        if (!Util.isNullOrNil(str)) {
            C115669n.INSTANCE.mo160131h(21140, e7, str, str2, "");
        }
        intent.putExtra("report_scene", 0);
        intent.putExtra("tab_type", 9);
        if (C11767a.f34453a.mo11660b("entrance") != 0) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        ((C58684b) C86312j.m106911c(cls)).Zx0(context, intent);
        C117361f.INSTANCE.mo182041q(540999685);
    }

    /* renamed from: b */
    public void mo83751b(Context context, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C87412m.m108594g(str4, "appid");
        C87412m.m108594g(str5, "feedId");
        C87412m.m108594g(str6, "nonceId");
        if (context == null) {
            Log.m105924i("Finder.FinderOpenSdkApi", "openLive context null");
            return;
        }
        Log.m105924i("Finder.FinderOpenSdkApi", "openLive appid:" + str4 + ", feedId:" + str5 + ", nonceId:" + str6);
        String R1 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76802R1(11, 8, 65);
        if (!Util.isNullOrNil(new String[0])) {
            C115669n.INSTANCE.mo160131h(21140, R1, str4, "", "");
        }
        ((C61568m) C86312j.m106911c(C61568m.class)).mo74891sS(str4);
        ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(R1);
        C58759o4.m68333c(C58759o4.f168229a, "", str2, C45686a.f123490a, str3, 0, C45687b.f123491a, R1, str, (C49946j51) null, 0, (Intent) null, (Map) null, 3840, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d7 A[SYNTHETIC, Splitter:B:14:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0120  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo83752c(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r16 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            java.lang.String r0 = "html5Info"
            java.lang.String r7 = "miniAppInfo"
            java.lang.String r8 = "appid"
            gy3.C87412m.m108594g(r1, r8)
            java.lang.String r8 = "path"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.String r9 = "desc"
            gy3.C87412m.m108594g(r3, r9)
            java.lang.String r10 = "extendingUrl"
            gy3.C87412m.m108594g(r4, r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r11 = "localIdentifier"
            r10.put(r11, r2)
            java.lang.String r11 = "remoteUrl"
            java.lang.String r12 = ""
            r10.put(r11, r12)
            java.lang.String r11 = "fromAppType"
            r13 = 1
            r10.put(r11, r13)
            java.lang.String r11 = "paramsJson"
            r10.put(r11, r12)
            r10.put(r9, r3)
            java.lang.String r9 = "extendUrl"
            r10.put(r9, r4)
            java.lang.String r14 = "Finder.FinderOpenSdkApi"
            if (r5 == 0) goto L_0x00d4
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r15.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "jump json:"
            r15.append(r11)     // Catch:{ all -> 0x00ca }
            r15.append(r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = r15.toString()     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r11)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo     // Catch:{ all -> 0x00ca }
            r11.<init>()     // Catch:{ all -> 0x00ca }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x00ca }
            r15.<init>(r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r9 = "jumpType"
            int r9 = r15.getInt(r9)     // Catch:{ all -> 0x00ca }
            r11.jumpinfo_type = r9     // Catch:{ all -> 0x00ca }
            java.lang.String r9 = "wording"
            java.lang.String r9 = r15.optString(r9)     // Catch:{ all -> 0x00ca }
            r11.wording = r9     // Catch:{ all -> 0x00ca }
            java.lang.String r9 = "iconurl"
            java.lang.String r9 = r15.getString(r9)     // Catch:{ all -> 0x00ca }
            r11.icon_url = r9     // Catch:{ all -> 0x00ca }
            java.lang.String r9 = "reportInfo"
            java.lang.String r9 = r15.optString(r9)     // Catch:{ all -> 0x00ca }
            r11.report_info = r9     // Catch:{ all -> 0x00ca }
            boolean r9 = r15.has(r7)     // Catch:{ all -> 0x00ca }
            if (r9 == 0) goto L_0x00aa
            org.json.JSONObject r7 = r15.getJSONObject(r7)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.protocal.protobuf.MiniAppInfo r9 = new com.tencent.mm.protocal.protobuf.MiniAppInfo     // Catch:{ all -> 0x00ca }
            r9.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r7.optString(r8)     // Catch:{ all -> 0x00ca }
            r9.path = r8     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "appusername"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x00ca }
            r9.appusername = r7     // Catch:{ all -> 0x00ca }
            r11.mini_app_info = r9     // Catch:{ all -> 0x00ca }
        L_0x00aa:
            boolean r7 = r15.has(r0)     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x00c6
            org.json.JSONObject r0 = r15.getJSONObject(r0)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.protocal.protobuf.Html5Info r7 = new com.tencent.mm.protocal.protobuf.Html5Info     // Catch:{ all -> 0x00ca }
            r7.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "url"
            java.lang.String r0 = r0.optString(r8)     // Catch:{ all -> 0x00ca }
            r7.url = r0     // Catch:{ all -> 0x00ca }
            r7.style = r13     // Catch:{ all -> 0x00ca }
            r11.html5_info = r7     // Catch:{ all -> 0x00ca }
        L_0x00c6:
            r7 = 2
            r11.source = r7     // Catch:{ all -> 0x00ca }
            goto L_0x00d5
        L_0x00ca:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "shareVideo"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r8, r7)
        L_0x00d4:
            r11 = 0
        L_0x00d5:
            if (r6 == 0) goto L_0x00fd
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fc }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r7 = "finderEventInfo"
            org.json.JSONObject r0 = r0.optJSONObject(r7)     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00fd
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x00fc }
            java.lang.String r8 = "finderNickname"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Exception -> 0x00fc }
            if (r8 != 0) goto L_0x00ef
            r8 = r12
        L_0x00ef:
            java.lang.String r9 = "eventName"
            java.lang.String r0 = r0.optString(r9)     // Catch:{ Exception -> 0x00fc }
            if (r0 != 0) goto L_0x00f8
            r0 = r12
        L_0x00f8:
            r7.<init>(r8, r0)     // Catch:{ Exception -> 0x00fc }
            goto L_0x00fe
        L_0x00fc:
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            te3.m44 r8 = new te3.m44
            r8.<init>()
            r9 = 2
            r8.f184200d = r9
            te3.pv3 r9 = new te3.pv3
            r9.<init>()
            r9.f184892d = r12
            r9.f184893e = r1
            java.lang.String r10 = r10.toString()
            r9.f184894f = r10
            r9.f184895g = r13
            r9.f184896h = r11
            if (r7 == 0) goto L_0x012c
            A r10 = r7.f38555d
            java.lang.String r10 = (java.lang.String) r10
            r9.f184898j = r10
            B r7 = r7.f38556e
            java.lang.String r7 = (java.lang.String) r7
            r9.f184897i = r7
        L_0x012c:
            r9.f184899n = r6
            r8.f184201e = r9
            byte[] r7 = r8.toByteArray()
            java.lang.String r8 = "KEY_POST_FROM_SHARE"
            r0.putExtra(r8, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[shareVideo] appid:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = " path:"
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = " desc:"
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = " extendingUrl:"
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = " jumpJson:"
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = " extraData:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            er1.b r1 = (er1.C58684b) r1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r2, r3)
            r1.getClass()
            java.lang.Class<lr.b> r1 = p599lr.C61381b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            lr.b r1 = (p599lr.C61381b) r1
            qo1.i r1 = r1.Yp0()
            r1.mo88191c(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58757o1.mo83752c(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public void mo83753d(String str, C87592u3.C60207a aVar) {
        if (!(str == null || str.length() == 0)) {
            Log.m105924i("Finder.FinderOpenSdkApi", "getFinderContact username:" + str);
            new C9367q1(str, 17).mo9225i().mo123420E(new C58758d(aVar));
        }
    }

    /* renamed from: e */
    public void mo83754e(Context context, String str, String str2) {
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "username");
        if (context == null) {
            Log.m105924i("Finder.FinderOpenSdkApi", "openProfile context null");
            return;
        }
        Log.m105924i("Finder.FinderOpenSdkApi", "openProfile appid:" + str + ", username:" + str2);
        new C9367q1(str2, 17).mo9225i().mo123420E(new C45688c(str, context));
    }
}

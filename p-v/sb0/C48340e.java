package sb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.z3$$g;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p248ug.C52556a;
import p248ug.C52573x;
import p823sg.C90193h;
import rb0.C48009v0;
import sb0.C48335d;
import sb0.C48354k;
import te3.C51725vq1;
import te3.C52251ze;

/* renamed from: sb0.e */
public class C48340e {

    /* renamed from: a */
    public static String f129426a;

    /* renamed from: b */
    public static String f129427b;

    /* renamed from: c */
    public static AtomicInteger f129428c = new AtomicInteger(0);

    /* renamed from: d */
    public static final Object f129429d = new Object();

    /* renamed from: sb0.e$a */
    public class C48341a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f129430d;

        /* renamed from: e */
        public final /* synthetic */ boolean f129431e;

        /* renamed from: f */
        public final /* synthetic */ z3$$g f129432f;

        /* renamed from: sb0.e$a$a */
        public class C48342a implements Runnable {
            public C48342a() {
            }

            public void run() {
                z3$$g z3__g = C48341a.this.f129432f;
                if (z3__g != null) {
                    z3__g.mo24604c();
                }
            }
        }

        public C48341a(String str, boolean z, z3$$g z3__g) {
            this.f129430d = str;
            this.f129431e = z;
            this.f129432f = z3__g;
        }

        public void run() {
            C48009v0.Dx0().mo73021Lo(this.f129430d);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69763f(this.f129430d);
            C48335d Ax0 = C48009v0.Ax0();
            String str = this.f129430d;
            Ax0.getClass();
            String str2 = "delete from " + "BizChatInfo" + " where " + "brandUserName" + " = '" + str + "' ";
            boolean execSQL = Ax0.f129417d.execSQL("BizChatInfo", str2);
            Log.m105925i("MicroMsg.BizChatInfoStorage", "deleteByBrandUserName sql %s,%s", str2, Boolean.valueOf(execSQL));
            if (execSQL) {
                C48334c cVar = new C48334c();
                C48335d.C48337b.C48339b bVar = new C48335d.C48337b.C48339b();
                bVar.f129424b = -1;
                bVar.f129423a = C48335d.C48337b.C48338a.DELETE;
                bVar.f129425c = cVar;
                Ax0.f129418e.event(bVar);
                Ax0.f129418e.doNotify();
            }
            C86013q1.m106445f(C52556a.m58840a(this.f129430d));
            if (this.f129431e) {
                C48354k Bx0 = C48009v0.Bx0();
                String str3 = this.f129430d;
                Bx0.getClass();
                String str4 = "delete from " + "BizChatUserInfo" + " where " + "brandUserName" + " = '" + str3 + "' ";
                boolean execSQL2 = Bx0.f129458e.execSQL("BizChatUserInfo", str4);
                Log.m105925i("MicroMsg.BizChatUserInfoStorage", "deleteByBrandUserName sql %s,%s", str4, Boolean.valueOf(execSQL2));
                if (execSQL2) {
                    new C48353j();
                    Bx0.f129459f.event(new C48354k.C48356b.C48357a());
                    Bx0.f129459f.doNotify();
                }
                C48009v0.xx0().mo73051jo(this.f129430d);
                C86013q1.m106445f(C48340e.m53671l(this.f129430d));
            }
            MMHandlerThread.postToMainThread(new C48342a());
        }

        public String toString() {
            return super.toString() + "|deleteMsgByTalkers";
        }
    }

    /* renamed from: sb0.e$b */
    public class C48343b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f129434d;

        /* renamed from: e */
        public final /* synthetic */ String f129435e;

        /* renamed from: f */
        public final /* synthetic */ String f129436f;

        public C48343b(String str, String str2, String str3) {
            this.f129434d = str;
            this.f129435e = str2;
            this.f129436f = str3;
        }

        public void run() {
            C48334c Lo = C48009v0.Ax0().mo73039Lo(this.f129434d);
            if (Lo != null) {
                if (Lo.field_chatVersion < Util.getInt(this.f129435e, Integer.MAX_VALUE)) {
                    Lo.field_needToUpdate = true;
                    C48009v0.Ax0().mo73040Ow(Lo);
                }
                if (Lo.mo73037p2()) {
                    C48009v0.yx0().mo73059f(Lo.field_bizChatServId, this.f129436f, 5000);
                } else {
                    C48009v0.yx0().mo73061g(Lo.field_bizChatServId, this.f129436f, 5000);
                }
            }
        }
    }

    /* renamed from: sb0.e$c */
    public static final class C48344c {

        /* renamed from: a */
        public static final Random f129437a = new Random(Util.nowMilliSecond());
    }

    /* renamed from: a */
    public static boolean m53660a(C48334c cVar, String str, String str2, C51725vq1 vq12) {
        boolean z;
        if (!(cVar == null || str == null || vq12 == null || Util.isNullOrNil(cVar.field_brandUserName))) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 1) {
                    if (Util.isNullOrNil(str2)) {
                        JSONObject jSONObject = jSONArray.getJSONObject(0);
                        String string = jSONObject.getString("id");
                        C48353j jVar = C48009v0.Bx0().get(string);
                        if (jVar == null) {
                            jVar = new C48353j();
                            z = true;
                        } else {
                            z = false;
                        }
                        jVar.field_userId = string;
                        jVar.field_userName = jSONObject.getString("nick_name");
                        jVar.field_headImageUrl = jSONObject.getString("head_img_url");
                        jVar.field_profileUrl = jSONObject.getString("profile_url");
                        jVar.field_UserVersion = jSONObject.getInt("ver");
                        String str3 = jVar.field_brandUserName;
                        if (str3 == null || str3.length() == 0) {
                            jVar.field_brandUserName = cVar.field_brandUserName;
                            z = true;
                        }
                        String str4 = jVar.field_addMemberUrl;
                        if (str4 == null || str4.length() == 0) {
                            jVar.field_addMemberUrl = cVar.field_addMemberUrl;
                            z = true;
                        }
                        if (!C48009v0.Bx0().mo73075Lo(jVar)) {
                            C48009v0.Bx0().insert(jVar);
                        }
                        if (z) {
                            C48009v0.yx0().mo73064j(jVar.field_userId, jVar.field_brandUserName);
                        }
                        C48334c cVar2 = new C48334c();
                        cVar2.field_bizChatServId = jVar.field_userId;
                        cVar2.field_brandUserName = jVar.field_brandUserName;
                        cVar2.field_chatName = jVar.field_userName;
                        cVar2.field_chatType = 1;
                        C48334c n = m53673n(cVar2);
                        if (n == null) {
                            return false;
                        }
                        cVar.field_bizChatLocalId = n.field_bizChatLocalId;
                        cVar.field_chatName = jVar.field_userName;
                        return true;
                    }
                }
                LinkedList<C52251ze> linkedList = new LinkedList<>();
                if (!Util.isNullOrNil(str2)) {
                    C52251ze zeVar = new C52251ze();
                    zeVar.f145847d = str2;
                    linkedList.add(zeVar);
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    C48353j jVar2 = new C48353j();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    jVar2.field_userId = jSONObject2.getString("id");
                    jVar2.field_userName = jSONObject2.getString("nick_name");
                    jVar2.field_brandUserName = cVar.field_brandUserName;
                    jVar2.field_headImageUrl = jSONObject2.getString("head_img_url");
                    jVar2.field_profileUrl = jSONObject2.getString("profile_url");
                    jVar2.field_UserVersion = jSONObject2.getInt("ver");
                    jVar2.field_addMemberUrl = cVar.field_addMemberUrl;
                    if (!C48009v0.Bx0().mo73075Lo(jVar2)) {
                        C48009v0.Bx0().insert(jVar2);
                    }
                    C52251ze zeVar2 = new C52251ze();
                    zeVar2.f145847d = jVar2.field_userId;
                    linkedList.add(zeVar2);
                }
                vq12.f143624e = linkedList;
                cVar.field_bizChatLocalId = -1;
                return true;
            } catch (JSONException e) {
                Log.m105925i("MicroMsg.BizChatInfoStorageLogic", "parse memberJson Exception:%s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.BizChatInfoStorageLogic", e, "", new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m53661b(String str, boolean z, z3$$g z3__g) {
        if (Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.BizChatInfoStorageLogic", "delEnterpriseChatConvAndHeadImg, empty brandUserName");
            return;
        }
        Log.m105918d("MicroMsg.BizChatInfoStorageLogic", "deleteMsgByTalkers");
        C86709a0.m107525e().postToWorker(new C48341a(str, z, z3__g));
    }

    /* renamed from: c */
    public static void m53662c(String str) {
        synchronized (f129429d) {
            f129426a = str;
        }
    }

    /* renamed from: d */
    public static String m53663d(String str) {
        return 2 + Util.nowSecond() + str + C48344c.f129437a.nextInt();
    }

    /* renamed from: e */
    public static C48353j m53664e(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo brandUserName==null");
            return null;
        }
        C36650f Lo = C48009v0.xx0().mo73049Lo(str);
        if (Lo == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatMyUserInfo==null");
            return null;
        }
        C48353j jVar = C48009v0.Bx0().get(Lo.field_userId);
        if (jVar == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatUserInfo==null");
        }
        return jVar;
    }

    /* renamed from: f */
    public static String m53665f(String str) {
        C48353j jVar = C48009v0.Bx0().get(str);
        if (jVar != null) {
            return jVar.field_headImageUrl;
        }
        return null;
    }

    /* renamed from: g */
    public static String m53666g(String str) {
        if (str == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource msgSource==null");
            return null;
        }
        int indexOf = str.indexOf("<enterprise_info>") + 17;
        int indexOf2 = str.indexOf("</enterprise_info>");
        if (indexOf == -1 || indexOf2 == -1 || indexOf >= indexOf2) {
            Log.m105929w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource error start:%s,end:%s", Integer.valueOf(indexOf), Integer.valueOf(indexOf2));
            return null;
        }
        String substring = str.substring(indexOf, indexOf2);
        return str.replace(substring, substring.replace("<", "&lt;").replace(">", "&gt;"));
    }

    /* renamed from: h */
    public static long m53667h(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "chatId == null");
            return -1;
        }
        C48334c Lo = C48009v0.Ax0().mo73039Lo(str);
        if (Lo != null) {
            return Lo.field_bizChatLocalId;
        }
        Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo == null");
        return -1;
    }

    /* renamed from: i */
    public static int m53668i(long j) {
        List<String> o2 = C48009v0.Ax0().mo73042a0(j).mo73036o2();
        if (o2 != null) {
            return o2.size();
        }
        Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getMembersCountByBizChatId list == null");
        return 0;
    }

    /* renamed from: j */
    public static String m53669j() {
        String str;
        synchronized (f129429d) {
            str = f129426a;
        }
        return str;
    }

    /* renamed from: k */
    public static String m53670k(C48334c cVar) {
        String str;
        String format;
        if (cVar == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getMsgSource bizChatInfo=%s");
            return null;
        }
        Log.m105918d("MicroMsg.BizChatInfoStorageLogic", "format msgSource");
        String str2 = cVar.field_bizChatServId;
        if (str2 == null) {
            Log.m105919d("MicroMsg.BizChatInfoStorageLogic", "getMsgSource field_bizChatId=%s", str2);
            return null;
        }
        C48353j e = m53664e(cVar.field_brandUserName);
        if (e == null || (str = e.field_userId) == null) {
            Log.m105919d("MicroMsg.BizChatInfoStorageLogic", " bizChatMyUserInfo.field_userId is null getMsgSource field_bizChatId=%s", cVar.field_bizChatServId);
            return null;
        }
        f129427b = str;
        synchronized (f129429d) {
            String str3 = e.field_userId;
            format = String.format("<msgsource><enterprise_info><qy_msg_type>%d</qy_msg_type><bizchat_id>%s</bizchat_id><bizchat_ver>%d</bizchat_ver><user_id>%s</user_id><climsgid>%s</climsgid></enterprise_info></msgsource>", new Object[]{1, cVar.field_bizChatServId, Integer.valueOf(cVar.field_chatVersion), str3, m53663d(str3)});
            f129426a = format;
        }
        Log.m105919d("MicroMsg.BizChatInfoStorageLogic", "send msgSource:%s", format);
        return f129426a;
    }

    /* renamed from: l */
    public static String m53671l(String str) {
        if (Util.isNullOrNil(str)) {
            str = "tempUser";
        }
        return C7970a.m8128b() + C90193h.m112878f(str.getBytes()) + "/" + "user/";
    }

    /* renamed from: m */
    public static String m53672m(String str) {
        if (str == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "getUserName bizChatId == null");
            return null;
        }
        C48353j jVar = C48009v0.Bx0().get(str);
        if (jVar != null) {
            return jVar.field_userName;
        }
        Log.m105924i("MicroMsg.BizChatInfoStorageLogic", "getUserName userInfo == null");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (rb0.C48009v0.Ax0().mo73044qq(r4) != false) goto L_0x004e;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sb0.C48334c m53673n(sb0.C48334c r4) {
        /*
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = r4.field_bizChatServId
            if (r0 != 0) goto L_0x0007
            goto L_0x0074
        L_0x0007:
            sb0.d r0 = rb0.C48009v0.Ax0()
            java.lang.String r1 = r4.field_bizChatServId
            sb0.c r0 = r0.mo73039Lo(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0040
            int r2 = r4.field_chatVersion
            int r3 = r0.field_chatVersion
            if (r2 > r3) goto L_0x0022
            java.lang.String r2 = r0.field_brandUserName
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004d
        L_0x0022:
            java.lang.String r2 = r4.field_chatName
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = r4.field_chatName
            r0.field_chatName = r2
        L_0x002e:
            java.lang.String r2 = r4.field_brandUserName
            r0.field_brandUserName = r2
            r0.field_needToUpdate = r1
            int r4 = r4.field_chatType
            r0.field_chatType = r4
            sb0.d r4 = rb0.C48009v0.Ax0()
            r4.mo73040Ow(r0)
            goto L_0x004d
        L_0x0040:
            r4.field_needToUpdate = r1
            sb0.d r1 = rb0.C48009v0.Ax0()
            boolean r1 = r1.mo73044qq(r4)
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            boolean r0 = r4.mo73038q2()
            if (r0 == 0) goto L_0x0073
            boolean r0 = r4.mo73037p2()
            r1 = 5000(0x1388, float:7.006E-42)
            if (r0 == 0) goto L_0x0068
            sb0.h r0 = rb0.C48009v0.yx0()
            java.lang.String r2 = r4.field_bizChatServId
            java.lang.String r3 = r4.field_brandUserName
            r0.mo73059f(r2, r3, r1)
            goto L_0x0073
        L_0x0068:
            sb0.h r0 = rb0.C48009v0.yx0()
            java.lang.String r2 = r4.field_bizChatServId
            java.lang.String r3 = r4.field_brandUserName
            r0.mo73061g(r2, r3, r1)
        L_0x0073:
            return r4
        L_0x0074:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sb0.C48340e.m53673n(sb0.c):sb0.c");
    }

    /* renamed from: o */
    public static boolean m53674o(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith("@qy_u") || str.endsWith("@qy_g");
    }

    /* renamed from: p */
    public static boolean m53675p(String str) {
        if (str != null) {
            return str.endsWith("@qy_g");
        }
        Log.m105924i("MicroMsg.BizChatInfoStorageLogic", "isGroupChat chatId == null");
        return false;
    }

    /* renamed from: q */
    public static boolean m53676q(C48334c cVar) {
        if (cVar == null) {
            return false;
        }
        List<String> o2 = cVar.mo73036o2();
        String Pk = ((C52573x) C86312j.m106911c(C52573x.class)).mo71125Pk(cVar.field_brandUserName);
        if (Pk == null) {
            Log.m105928w("MicroMsg.BaseBizChatInfo", "bizchat myUserId is null");
            return false;
        }
        for (String equals : o2) {
            if (Pk.equals(equals)) {
                return true;
            }
        }
        Log.m105929w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom myUserId is %s", Pk);
        Log.m105929w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom memberlist is %s", Arrays.toString(o2.toArray()));
        return false;
    }

    /* renamed from: r */
    public static void m53677r(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.BizChatInfoStorageLogic", "qy_chat_update %s, %s, %s", str, str2, str3);
        C86709a0.m107525e().postToWorker(new C48343b(str2, str3, str));
    }

    /* renamed from: s */
    public static void m53678s(C48334c cVar) {
        if (cVar == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo is null");
            return;
        }
        C48329b Dx0 = C48009v0.Dx0();
        boolean bF = Dx0.mo73026bF(Dx0.mo73024Yt(cVar.field_bizChatLocalId));
        boolean l2 = cVar.mo73033l2(16);
        Log.m105919d("MicroMsg.BizChatInfoStorageLogic", "convPlaceTop: %s ,bizChatPlaceTop: %s, chatName: %s ", Boolean.valueOf(bF), Boolean.valueOf(l2), cVar.field_chatName);
        if (l2 && !bF) {
            C48009v0.Dx0().mo73029mI(cVar.field_bizChatLocalId);
        } else if (!l2 && bF) {
            C48009v0.Dx0().mo73030mL(cVar.field_bizChatLocalId);
        }
    }
}

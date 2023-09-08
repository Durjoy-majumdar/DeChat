package ud2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C75340n;
import di3.C86301e;
import di3.C86312j;
import eb0.C45626r0;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import lc3.C10485b;
import p773yy.C79168k;
import te3.C64464jb3;
import te3.C77946ib3;
import vd2.C37721g;
import vd2.C78389h;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ud2.h */
public class C78150h extends C86301e implements C37721g {

    /* renamed from: d */
    public Map<String, C78389h> f229003d = new HashMap();

    /* renamed from: e */
    public C14179e f229004e = null;

    /* renamed from: f */
    public LinkedList<C64464jb3> f229005f = null;

    public C78389h Ax0(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Class cls = C79168k.class;
        C78389h hVar = (C78389h) ((HashMap) this.f229003d).get(str7);
        int i = 1;
        if (hVar != null) {
            Log.m105925i("MicroMsg.PluginPatMsg", "find %s (%s) in cache", str7, hVar);
            return hVar;
        }
        C78389h hVar2 = new C78389h();
        Log.m105925i("MicroMsg.PluginPatMsg", "parseDisplayTemplate realtime templateStr:%s ", str7);
        boolean z = (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SendPatUserShowBitVal", 2) & 2) != 0;
        Matcher matcher = C75340n.f221504a.matcher(str7);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                String group = matcher.group(0);
                String substring = group.substring(2, group.length() - i);
                Log.m105925i("MicroMsg.SysMsgTemplateHelper", "parse template, group:%s,value:%s", group, substring);
                arrayList.add(new C75340n.C75341a(group, substring));
                i = 1;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SysMsgTemplateHelper", e, "parseParams error!", new Object[0]);
            }
        }
        Iterator it = arrayList.iterator();
        String str8 = str7;
        while (it.hasNext()) {
            C75340n.C75341a aVar = (C75340n.C75341a) it.next();
            if (!TextUtils.isEmpty(aVar.f221506b)) {
                if (!aVar.f221506b.endsWith("@textstatusicon")) {
                    String c = C45626r0.m50733c(aVar.f221506b, str4);
                    int indexOf = str8.indexOf(aVar.f221505a);
                    ((ArrayList) hVar2.f229704b).add(Pair.create(Integer.valueOf(indexOf), Integer.valueOf(indexOf + c.length())));
                    ((ArrayList) hVar2.f229705c).add(aVar.f221506b);
                    str8 = str8.replace(aVar.f221505a, c);
                } else if (z) {
                    String str9 = "";
                    String replace = aVar.f221506b.replace("@textstatusicon", str9);
                    if (TextUtils.equals(replace, "fromusername")) {
                        boolean BS = ((C79168k) C86312j.m106911c(cls)).mo74105BS(str5);
                        if (BS) {
                            str9 = "​";
                        }
                        int indexOf2 = str8.indexOf(aVar.f221505a);
                        if (BS) {
                            ((LinkedList) hVar2.f229706d).add(new C78389h.C78390a(indexOf2, str9.length() + indexOf2, str5));
                        }
                        str8 = str8.replace(aVar.f221505a, str9);
                    } else if (TextUtils.equals(replace, "pattedusername")) {
                        boolean BS2 = ((C79168k) C86312j.m106911c(cls)).mo74105BS(str6);
                        if (BS2) {
                            str9 = "​";
                        }
                        int indexOf3 = str8.indexOf(aVar.f221505a);
                        if (BS2) {
                            ((LinkedList) hVar2.f229706d).add(new C78389h.C78390a(indexOf3, str9.length() + indexOf3, str6));
                        }
                        str8 = str8.replace(aVar.f221505a, str9);
                    } else {
                        str8 = str8.replace(aVar.f221505a, str9);
                    }
                    String str10 = str4;
                }
            }
        }
        hVar2.f229703a = str8;
        ((HashMap) this.f229003d).put(str7, hVar2);
        return hVar2;
    }

    public C78389h Bx0(C77946ib3 ib32, String str) {
        return ib32 == null ? new C78389h() : Ax0(ib32.f227607d, ib32.f227608e, ib32.f227609f, str);
    }

    public boolean isPatEnable() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("DisableSendPat", 1);
        Log.m105925i("MicroMsg.PluginPatMsg", "disable sendPat %d", Integer.valueOf(b));
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || b == 0;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        xx0();
        LinkedList<C64464jb3> b = this.f229004e.mo73082b();
        this.f229005f = b;
        if (b == null) {
            this.f229005f = new LinkedList<>();
        }
    }

    public void vx0(long j, C77946ib3 ib32) {
        requireAccountInitialized();
        synchronized (this.f229005f) {
            C64464jb3 jb32 = new C64464jb3();
            jb32.f183777d = j;
            jb32.f183778e = ib32;
            this.f229005f.addFirst(jb32);
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C78149g(this), "sync_pat_recv_record_thread");
    }

    public void wx0() {
        ((HashMap) this.f229003d).clear();
    }

    public final C14179e xx0() {
        if (this.f229004e == null) {
            synchronized (this) {
                if (this.f229004e == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C86709a0.m107535s().f251807e + "patmsg/");
                    sb.append("pat_recv_record");
                    this.f229004e = new C14179e(sb.toString());
                }
            }
        }
        return this.f229004e;
    }

    public C64464jb3 yx0(long j) {
        requireAccountInitialized();
        synchronized (this.f229005f) {
            Iterator<C64464jb3> it = this.f229005f.iterator();
            while (it.hasNext()) {
                C64464jb3 next = it.next();
                C77946ib3 ib32 = next.f183778e;
                if (ib32 != null && ib32.f227612i == j) {
                    return next;
                }
            }
            return null;
        }
    }

    public boolean zx0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_revoke_pat_msg_enable, 1) == 1;
    }
}

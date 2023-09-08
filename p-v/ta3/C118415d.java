package ta3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l20.C21388a;
import la3.C117468g;
import p327ct.C30914c;
import ra3.C118229a;

/* renamed from: ta3.d */
public class C118415d {

    /* renamed from: c */
    public static final C118415d f353896c = new C118415d();

    /* renamed from: a */
    public Map<String, Integer> f353897a;

    /* renamed from: b */
    public String f353898b;

    public C118415d() {
        String[] split;
        this.f353897a = new HashMap();
        this.f353898b = "";
        this.f353898b = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WELAB_REDPOINT_STRING, (Object) null);
        Log.m105924i("WeLabRedPointMgr", "load red tag " + this.f353898b);
        if (!TextUtils.isEmpty(this.f353898b)) {
            for (String str : this.f353898b.split("&")) {
                if (!TextUtils.isEmpty(str) && (split = str.split("=")) != null && split.length == 2) {
                    this.f353897a.put(split[0], Integer.valueOf(Util.safeParseInt(split[1])));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo183207a(C118229a aVar) {
        if (aVar.field_RedPoint == 1) {
            return !(aVar.mo183026o2() || aVar.field_Switch == 3) && !mo183208b(aVar.field_LabsAppId);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo183208b(String str) {
        return ((HashMap) this.f353897a).containsKey(str) && ((Integer) ((HashMap) this.f353897a).get(str)).intValue() == 1;
    }

    /* renamed from: c */
    public void mo183209c(C118229a aVar) {
        if (aVar.field_RedPoint == 1 && !mo183208b(aVar.field_LabsAppId) && aVar.mo183027p2()) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(266267, true);
        }
    }

    /* renamed from: d */
    public final void mo183210d() {
        List<C118229a> d = C117468g.f351552c.mo182175d();
        boolean isEmpty = ((ArrayList) d).isEmpty();
        boolean z = true;
        Iterator it = ((ArrayList) d).iterator();
        while (true) {
            if (it.hasNext()) {
                C118229a aVar = (C118229a) it.next();
                if (aVar != null && f353896c.mo183207a(aVar)) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33499h(266267, 266241);
        }
    }
}

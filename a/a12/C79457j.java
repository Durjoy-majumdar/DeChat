package a12;

import a70.C79471a;
import bx3.C79852a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import te3.C90430p93;
import tw0.C37285a;
import tw0.C90584e;
import x02.C38431f;
import y02.C91361e;
import zw3.C91941a;

/* renamed from: a12.j */
public class C79457j extends C79852a {
    /* renamed from: a */
    public boolean mo109447a() {
        return super.mo109447a();
    }

    /* renamed from: b */
    public void mo109448b(Map<String, String> map) {
        C38431f.m41873d(2);
        String str = C79471a.f233023k;
        String a = C79471a.m96436a();
        LinkedList linkedList = new LinkedList();
        for (String next : map.keySet()) {
            C90430p93 p932 = new C90430p93();
            p932.f259737d = next;
            p932.f259738e = map.get(next);
            linkedList.add(p932);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C90430p93 p933 = (C90430p93) it.next();
            sb.append(p933.f259737d);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(p933.f259738e);
            sb.append("\n");
        }
        Log.m105925i("Tinker.TinkerPatchRequestCallback", "checkAvailableUpdate BaseID:%s PatchID:%s config:%s", str, a, sb.toString());
        C86709a0.m107524d().mo123460f(new C91361e(str, a, linkedList, true));
    }

    /* renamed from: c */
    public void mo109449c() {
        C91941a.m115469d().mo125793c("uin", String.valueOf(((long) C86718e.m107549h()) & Util.MAX_32BIT_VALUE)).mo125793c("network", String.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 3 : 2)).mo125793c("flavor-version", String.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wechat_flavor_version, 0)));
        List<C37285a> c102 = ((C90584e) C86312j.m106911c(C90584e.class)).c10();
        if (c102 != null) {
            for (C37285a next : c102) {
                C91941a.m115469d().mo125793c(Integer.toHexString(next.field_key), String.valueOf(next.field_dau));
            }
        }
    }
}

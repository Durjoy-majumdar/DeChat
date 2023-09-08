package i52;

import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.plugin.magicbrush.pkg.MagicPkgCheckerListener;
import com.tencent.p014mm.plugin.report.service.C115669n;
import d42.C31066c0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: i52.a */
public class C33206a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MagicPkgCheckerListener f90101d;

    public C33206a(MagicPkgCheckerListener magicPkgCheckerListener) {
        this.f90101d = magicPkgCheckerListener;
    }

    public void run() {
        MagicPkgCheckerListener magicPkgCheckerListener = this.f90101d;
        Set<String> set = MagicPkgCheckerListener.f81661e;
        magicPkgCheckerListener.getClass();
        C115669n.INSTANCE.mo175913w(1909, 2, 1);
        HashSet hashSet = new HashSet();
        List<WxaMagicPkgInfo> f = C87661e.m109006d().mo122083f();
        if (f != null && !f.isEmpty()) {
            for (WxaMagicPkgInfo next : f) {
                if (C87661e.m109006d().mo122079a(next.f81564d)) {
                    C87661e.m109006d().mo122080b(next.f81564d, "", true, (C31066c0) null);
                    C115669n.INSTANCE.mo175913w(1909, 3, 1);
                }
                hashSet.add(next.f81564d);
            }
        }
        Iterator it = ((CopyOnWriteArraySet) MagicPkgCheckerListener.f81661e).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashSet.contains(str) && C87661e.m109006d().mo122079a(str)) {
                C87661e.m109006d().mo122080b(str, "", true, (C31066c0) null);
                C115669n.INSTANCE.mo175913w(1909, 4, 1);
            }
        }
    }
}

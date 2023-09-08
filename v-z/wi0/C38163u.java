package wi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90364q0;
import um0.C22655d;

/* renamed from: wi0.u */
public final class C38163u {

    /* renamed from: a */
    public static final C38163u f100827a = new C38163u();

    /* renamed from: b */
    public static final CopyOnWriteArrayList<String> f100828b = new CopyOnWriteArrayList<>(C64197v.m75534c("wxfedb0854e2b1820d", "wx97b7aebac2183fd2", "wxa06c02b5c00ff39b", "wxf337cbaa27790d8e"));

    /* renamed from: c */
    public static final ConcurrentHashMap<String, String> f100829c = new ConcurrentHashMap<>(C90364q0.m113148g(new C13604l("wxfedb0854e2b1820d", "gh_a23053671f48@app"), new C13604l("wx97b7aebac2183fd2", "gh_232f4c80080c@app"), new C13604l("wxa06c02b5c00ff39b", "gh_f93dfd4799d3@app"), new C13604l("wxf337cbaa27790d8e", "gh_c9d570035c3b@app")));

    /* renamed from: d */
    public static final ConcurrentHashMap<String, Integer> f100830d = new ConcurrentHashMap<>(C90364q0.m113148g(new C13604l("wxfedb0854e2b1820d", Integer.valueOf(C22655d.CTRL_INDEX)), new C13604l("wx97b7aebac2183fd2", Integer.valueOf(C22655d.CTRL_INDEX)), new C13604l("wxa06c02b5c00ff39b", Integer.valueOf(C22655d.CTRL_INDEX)), new C13604l("wxf337cbaa27790d8e", Integer.valueOf(C22655d.CTRL_INDEX))));

    /* renamed from: a */
    public final void mo61557a(String str, String str2, int i) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        Log.m105924i("MicroMsg.AppBrand.NonStandardAppConstants", "register, username:" + str + ", appId:" + str2 + ", scene:" + i);
        f100828b.add(str2);
        f100829c.put(str2, str);
        f100830d.put(str2, Integer.valueOf(i));
    }
}

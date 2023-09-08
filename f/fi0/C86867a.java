package fi0;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Map;

/* renamed from: fi0.a */
public interface C86867a extends Closeable {
    /* renamed from: D0 */
    int mo113572D0();

    /* renamed from: H */
    boolean mo113573H(WxaPkg.Info info);

    /* renamed from: a0 */
    InputStream mo113574a0(WxaPkg.Info info);

    /* renamed from: t */
    boolean mo113576t(FileChannel fileChannel);

    /* renamed from: u */
    int mo113577u();

    /* renamed from: z */
    Map<String, WxaPkg.Info> mo113578z(FileChannel fileChannel, C86009m1 m1Var);
}

package tf0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.pigeon.FlutterAccountPigeon;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import wx3.C15601d;

/* renamed from: tf0.f1 */
public final class C64910f1 implements FlutterAccountPigeon.FlutterAccountHost, FlutterPlugin {

    /* renamed from: d */
    public C0000n0 f186943d;

    public C64910f1() {
        C0000n0 b = C53930o0.m60555b();
        C53930o0.m60556c(b, (CancellationException) null);
        this.f186943d = b;
    }

    public void getAvatarPath(String str, Boolean bool, FlutterAccountPigeon.Result result) {
        boolean booleanValue = bool.booleanValue();
        C87412m.m108594g(str, "username");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f186943d, C53872d1.f151119c, (C53934p0) null, new C64904e1(str, booleanValue, result, (C15601d<? super C64904e1>) null), 2, (Object) null);
    }

    public String getUin() {
        String i = C86709a0.m107523b().mo121111i();
        C87412m.m108593f(i, "account().uinString");
        return i;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterAccountPigeon.FlutterAccountHost.CC.m35783d(flutterPluginBinding.getBinaryMessenger(), this);
        this.f186943d = C53930o0.m60555b();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterAccountPigeon.FlutterAccountHost.CC.m35783d(flutterPluginBinding.getBinaryMessenger(), (FlutterAccountPigeon.FlutterAccountHost) null);
        C53930o0.m60558e(this.f186943d, (CancellationException) null, 1, (Object) null);
    }
}

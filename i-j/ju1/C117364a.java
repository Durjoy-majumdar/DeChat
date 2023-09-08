package ju1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.pigeon.FlutterFilePigeon;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: ju1.a */
public final class C117364a implements FlutterFilePigeon.FlutterFileHost, FlutterPlugin {
    public void createDirectory(String str, Boolean bool, FlutterFilePigeon.Result result) {
        bool.booleanValue();
        C87412m.m108594g(str, "path");
        C87412m.m108594g(result, "result");
        if (!C86013q1.m106461v(str)) {
            result.error(new IllegalStateException("Unable to create directory: " + str));
            return;
        }
        result.success(C86013q1.m106448i(str, true));
    }

    public void createFile(String str, FlutterFilePigeon.Result<String> result) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(result, "result");
        if (!C86013q1.m106444e(str)) {
            result.error(new IllegalStateException("Unable to create file: " + str));
            return;
        }
        result.success(C86013q1.m106448i(str, true));
    }

    public String getDefaultImageCacheDirectory() {
        String i = C86013q1.m106448i(VFSStrategy.m163776d("flutter/cached_images_default"), false);
        Log.m105924i("MicroMsg.FlutterFilePlugin", "getDefaultImageCacheDirectory: " + i + ' ' + MMApplicationContext.getContext().getCacheDir().getAbsolutePath());
        if (i != null) {
            return i;
        }
        return MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + "/flutter/cached_images_default";
    }

    public String getGeneralCacheDirectory() {
        String i = C86013q1.m106448i(VFSStrategy.m163776d("flutter_temp"), false);
        C87412m.m108591d(i);
        return i;
    }

    public String getRealPath(String str) {
        C87412m.m108594g(str, "path");
        String i = C86013q1.m106448i(str, true);
        C87412m.m108591d(i);
        return i;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterFilePigeon.FlutterFileHost.CC.m163977g(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterFilePigeon.FlutterFileHost.CC.m163977g(flutterPluginBinding.getBinaryMessenger(), (FlutterFilePigeon.FlutterFileHost) null);
    }
}

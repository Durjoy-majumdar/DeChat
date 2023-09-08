package p172io.flutter.plugin.platform;

import android.content.Context;
import android.util.SparseArray;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import p172io.flutter.view.TextureRegistry;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo182094d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController;", "Lio/flutter/plugin/platform/CustomPlatformViewsController;", "Landroid/content/Context;", "context", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "Lio/flutter/embedding/engine/dart/DartExecutor;", "dartExecutor", "Lrx3/b0;", "attach", "onDetachedFromJNI", "", "engineId", "I", "getEngineId", "()I", "Landroid/util/SparseArray;", "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;", "textureEntryList", "Landroid/util/SparseArray;", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "skylineChannelHandler", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "<init>", "(I)V", "Companion", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: io.flutter.plugin.platform.SkylinePlatformViewsController */
public final class SkylinePlatformViewsController extends CustomPlatformViewsController {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "SkylinePlatformViewsController";
    private final int engineId;
    private final PlatformViewsChannel.PlatformViewsHandler skylineChannelHandler = new SkylinePlatformViewsController$skylineChannelHandler$1(this);
    /* access modifiers changed from: private */
    public SparseArray<TextureRegistry.SurfaceTextureEntry> textureEntryList = new SparseArray<>();

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController$Companion;", "", "()V", "TAG", "", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
    /* renamed from: io.flutter.plugin.platform.SkylinePlatformViewsController$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public SkylinePlatformViewsController(int i) {
        this.engineId = i;
    }

    public void attach(Context context, TextureRegistry textureRegistry, DartExecutor dartExecutor) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(textureRegistry, "textureRegistry");
        C87412m.m108594g(dartExecutor, "dartExecutor");
        super.attach(context, textureRegistry, dartExecutor);
        this.platformViewsChannel.setPlatformViewsHandler(this.skylineChannelHandler);
    }

    public final int getEngineId() {
        return this.engineId;
    }

    public void onDetachedFromJNI() {
        SkylineTextureLogic.INSTANCE.destroy(this.engineId);
        int size = this.textureEntryList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.textureEntryList.get(this.textureEntryList.keyAt(i));
            if (surfaceTextureEntry != null) {
                surfaceTextureEntry.release();
            }
            i = i2;
        }
        this.textureEntryList.clear();
        super.onDetachedFromJNI();
    }
}

package com.tencent.magicbrush.biz;

import com.google.android.gms.dynamite.ProviderConstants;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import p1021pd.C89345a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH J!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH J!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007¨\u0006!"}, mo182094d2 = {"Lcom/tencent/magicbrush/biz/MBBizManager;", "", "", "jsEngine", "jsContext", "nativeCreate", "inst", "Lrx3/b0;", "nativeDestroy", "", "bizName", "nativeNotifyBizConnected", "nativeNotifyBizDisconnected", "serviceName", "msg", "nativeOnReceiveMsgFromPublicService", "nativeOnReceiveMsgFromBiz", "path", "Ljava/nio/ByteBuffer;", "result", "nativeOnReadFileCallback", "onCreatePublicService", "onDestroyPublicService", "to", "onPostMsgToBiz", "onPostMsgToPublicService", "from", "readFileFromBiz", "alias", "version", "onRequirePlugin", "stack", "onJsException", "lib-magicbrush-nano_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class MBBizManager {

    /* renamed from: a */
    public final C89345a f235101a;

    /* renamed from: b */
    public final String f235102b;

    /* renamed from: c */
    public long f235103c;

    /* renamed from: com.tencent.magicbrush.biz.MBBizManager$a */
    public static final class C80306a extends C87413o implements C32226l<ByteBuffer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MBBizManager f235104d;

        /* renamed from: e */
        public final /* synthetic */ String f235105e;

        /* renamed from: f */
        public final /* synthetic */ String f235106f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80306a(MBBizManager mBBizManager, String str, String str2) {
            super(1);
            this.f235104d = mBBizManager;
            this.f235105e = str;
            this.f235106f = str2;
        }

        public Object invoke(Object obj) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer == null || byteBuffer.isDirect()) {
                MBBizManager mBBizManager = this.f235104d;
                mBBizManager.nativeOnReadFileCallback(mBBizManager.f235103c, this.f235105e, this.f235106f, byteBuffer);
                return C13598b0.f38549a;
            }
            throw new IllegalArgumentException("read file callback buffer must be direct");
        }
    }

    public MBBizManager(C89345a aVar, String str) {
        C87412m.m108594g(aVar, "delegate");
        C87412m.m108594g(str, "bizName");
        this.f235101a = aVar;
        this.f235102b = str;
    }

    private final native long nativeCreate(long j, long j2);

    private final native void nativeDestroy(long j);

    private final native void nativeNotifyBizConnected(long j, String str);

    private final native void nativeNotifyBizDisconnected(long j, String str);

    /* access modifiers changed from: private */
    public final native void nativeOnReadFileCallback(long j, String str, String str2, ByteBuffer byteBuffer);

    private final native void nativeOnReceiveMsgFromBiz(long j, String str, String str2);

    private final native void nativeOnReceiveMsgFromPublicService(long j, String str, String str2);

    /* renamed from: b */
    public final void mo111589b(long j, long j2) {
        this.f235103c = nativeCreate(j, j2);
    }

    /* renamed from: c */
    public final void mo111590c() {
        long j = this.f235103c;
        if (j != 0) {
            nativeDestroy(j);
            this.f235103c = 0;
        }
    }

    /* renamed from: d */
    public final void mo111591d(String str) {
        C87412m.m108594g(str, "bizName");
        long j = this.f235103c;
        if (j != 0) {
            nativeNotifyBizConnected(j, str);
            return;
        }
        throw new IllegalStateException("You forgot to call MBBizManager::bindTo");
    }

    /* renamed from: e */
    public final void mo111592e(String str) {
        C87412m.m108594g(str, "bizName");
        long j = this.f235103c;
        if (j != 0) {
            nativeNotifyBizDisconnected(j, str);
            return;
        }
        throw new IllegalStateException("You forgot to call MBBizManager::bindTo");
    }

    /* renamed from: f */
    public final void mo111593f(String str, String str2) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "msg");
        long j = this.f235103c;
        if (j != 0) {
            nativeOnReceiveMsgFromBiz(j, str, str2);
            return;
        }
        throw new IllegalStateException("You forgot to call MBBizManager::bindTo");
    }

    /* renamed from: g */
    public final void mo111594g(String str, String str2) {
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(str2, "msg");
        long j = this.f235103c;
        if (j != 0) {
            nativeOnReceiveMsgFromPublicService(j, str, str2);
            return;
        }
        throw new IllegalStateException("You forgot to call MBBizManager::bindTo");
    }

    public final String onCreatePublicService(String str) {
        C87412m.m108594g(str, "serviceName");
        return this.f235101a.mo121584a(str, this.f235102b, false);
    }

    public final void onDestroyPublicService(String str) {
        C87412m.m108594g(str, "serviceName");
        this.f235101a.mo121587e(str, this.f235102b);
    }

    public final void onJsException(String str, String str2) {
        C87412m.m108594g(str, "msg");
        C87412m.m108594g(str2, "stack");
        this.f235101a.mo121583O(this.f235102b, str, str2);
    }

    public final void onPostMsgToBiz(String str, String str2) {
        C87412m.m108594g(str, "to");
        C87412m.m108594g(str2, "msg");
        this.f235101a.mo121586c(this.f235102b, str, str2);
    }

    public final void onPostMsgToPublicService(String str, String str2) {
        C87412m.m108594g(str, "to");
        C87412m.m108594g(str2, "msg");
        this.f235101a.mo121590h(this.f235102b, str, str2);
    }

    public final String onRequirePlugin(String str, String str2) {
        C87412m.m108594g(str, "alias");
        C87412m.m108594g(str2, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        return this.f235101a.mo121588f(this.f235102b, str, str2);
    }

    public final void readFileFromBiz(String str, String str2) {
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "path");
        this.f235101a.mo121589g(this.f235102b, str, str2, new C80306a(this, str, str2));
    }
}

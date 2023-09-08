package com.tencent.mars.cdn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import rx3.C13598b0;
import vx3.C90875b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\u00020\u0001:\u0004+*,-B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0014\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b'\u0010 ¨\u0006."}, mo182094d2 = {"Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "", "", "socketFd", "bindSocketToMobileImpl", "", "host", "resolveHostByCellularImpl", "Landroid/content/Context;", "context", "", "syncActiveMobileNetwork", "Lrx3/b0;", "delayUnregister", "reflectCallBind", "Landroid/net/Network;", "network", "onMobileNetworkReady", "onMobileUnAvailable", "activeMobileNetwork", "negativeMobileNetwork", "bindSocketToMobile", "hostDomain", "resolveHostByCellular", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil$BindAndDnsReturnKt;", "bindSocketToCellularAndDnsByCellular", "mMobileNetwork", "Landroid/net/Network;", "Landroid/net/ConnectivityManager$NetworkCallback;", "mMobileNetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "mMobileNetId", "I", "Ljava/lang/Object;", "mLock", "Ljava/lang/Object;", "kSuccess", "kNoCellularNetwork", "kDnsFail", "kBindFail", "<init>", "()V", "Companion", "BindAndDnsReturnKt", "DelayUnregister", "MobileNetworkCallback", "wechat-commons-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class CronetMultiNetLinkWaysUtil {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "CronetMultiNetLinkWaysUtil.cronet";
    /* access modifiers changed from: private */
    public static CronetMultiNetLinkWaysUtil mInstance;
    private final int kBindFail;
    private final int kDnsFail;
    private final int kNoCellularNetwork;
    private final int kSuccess;
    private Object mLock;
    private int mMobileNetId;
    /* access modifiers changed from: private */
    public Network mMobileNetwork;
    private ConnectivityManager.NetworkCallback mMobileNetworkCallback;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil$BindAndDnsReturnKt;", "", "_hostIpStr", "", "_resultCode", "", "(Ljava/lang/String;I)V", "hostIpStr", "getHostIpStr", "()Ljava/lang/String;", "resultCode", "getResultCode", "()I", "wechat-commons-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class BindAndDnsReturnKt {
        private final String hostIpStr;
        private final int resultCode;

        public BindAndDnsReturnKt(String str, int i) {
            C87412m.m108594g(str, "_hostIpStr");
            this.resultCode = i;
            this.hostIpStr = str;
        }

        public final String getHostIpStr() {
            return this.hostIpStr;
        }

        public final int getResultCode() {
            return this.resultCode;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil$Companion;", "", "()V", "TAG", "", "mInstance", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "instance", "wechat-commons-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final CronetMultiNetLinkWaysUtil instance() {
            if (CronetMultiNetLinkWaysUtil.mInstance == null) {
                CronetMultiNetLinkWaysUtil.mInstance = new CronetMultiNetLinkWaysUtil((C8480h) null);
            }
            CronetMultiNetLinkWaysUtil access$getMInstance$cp = CronetMultiNetLinkWaysUtil.mInstance;
            C87412m.m108591d(access$getMInstance$cp);
            return access$getMInstance$cp;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil$DelayUnregister;", "Ljava/util/TimerTask;", "Lrx3/b0;", "run", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "mReceiver", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "getMReceiver", "()Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "setMReceiver", "(Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "<init>", "()V", "receiver", "context", "(Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;Landroid/content/Context;)V", "wechat-commons-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    public static final class DelayUnregister extends TimerTask {
        private Context mContext;
        private CronetMultiNetLinkWaysUtil mReceiver;

        public DelayUnregister() {
        }

        public final Context getMContext() {
            return this.mContext;
        }

        public final CronetMultiNetLinkWaysUtil getMReceiver() {
            return this.mReceiver;
        }

        public void run() {
            CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil = this.mReceiver;
            if (cronetMultiNetLinkWaysUtil != null) {
                cronetMultiNetLinkWaysUtil.negativeMobileNetwork(this.mContext);
            }
        }

        public final void setMContext(Context context) {
            this.mContext = context;
        }

        public final void setMReceiver(CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil) {
            this.mReceiver = cronetMultiNetLinkWaysUtil;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public DelayUnregister(CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil, Context context) {
            this();
            C87412m.m108594g(cronetMultiNetLinkWaysUtil, "receiver");
            this.mReceiver = cronetMultiNetLinkWaysUtil;
            this.mContext = context;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil$MobileNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lrx3/b0;", "onAvailable", "onUnavailable", "onLost", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "mReceiver", "Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "getMReceiver", "()Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;", "setMReceiver", "(Lcom/tencent/mars/cdn/CronetMultiNetLinkWaysUtil;)V", "<init>", "()V", "receiver", "wechat-commons-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    public static final class MobileNetworkCallback extends ConnectivityManager.NetworkCallback {
        private CronetMultiNetLinkWaysUtil mReceiver;

        public MobileNetworkCallback() {
        }

        public final CronetMultiNetLinkWaysUtil getMReceiver() {
            return this.mReceiver;
        }

        public void onAvailable(Network network) {
            C87412m.m108594g(network, "network");
            Log.m105924i(CronetMultiNetLinkWaysUtil.TAG, "network available " + network);
            CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil = this.mReceiver;
            if (cronetMultiNetLinkWaysUtil != null) {
                cronetMultiNetLinkWaysUtil.onMobileNetworkReady(network);
            }
        }

        public void onLost(Network network) {
            C87412m.m108594g(network, "network");
            Log.m105924i(CronetMultiNetLinkWaysUtil.TAG, "network onLost");
            CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil = this.mReceiver;
            if (cronetMultiNetLinkWaysUtil != null) {
                cronetMultiNetLinkWaysUtil.onMobileUnAvailable();
            }
        }

        public void onUnavailable() {
            Log.m105924i(CronetMultiNetLinkWaysUtil.TAG, "network onUnavailable");
            CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil = this.mReceiver;
            if (cronetMultiNetLinkWaysUtil != null) {
                cronetMultiNetLinkWaysUtil.onMobileUnAvailable();
            }
        }

        public final void setMReceiver(CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil) {
            this.mReceiver = cronetMultiNetLinkWaysUtil;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public MobileNetworkCallback(CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil) {
            this();
            C87412m.m108594g(cronetMultiNetLinkWaysUtil, "receiver");
            this.mReceiver = cronetMultiNetLinkWaysUtil;
        }
    }

    private CronetMultiNetLinkWaysUtil() {
        this.mMobileNetId = -1;
        this.mLock = new Object();
        this.kNoCellularNetwork = 1;
        this.kDnsFail = 2;
        this.kBindFail = 3;
    }

    public /* synthetic */ CronetMultiNetLinkWaysUtil(C8480h hVar) {
        this();
    }

    private final int bindSocketToMobileImpl(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Build.VERSION.SDK_INT: ");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(i2);
        Log.m105924i(TAG, sb.toString());
        if (i2 < 23) {
            return reflectCallBind(i);
        }
        try {
            FileDescriptor fileDescriptor = new FileDescriptor();
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i);
            Network network = this.mMobileNetwork;
            if (network != null) {
                network.bindSocket(fileDescriptor);
            }
            Log.m105924i(TAG, "bind socket success");
            return 0;
        } catch (Exception e) {
            Log.m105920e(TAG, "bind socket failed: " + e.getMessage());
            return -1;
        }
    }

    private final void delayUnregister(Context context) {
        Timer timer = new Timer();
        CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil = mInstance;
        C87412m.m108591d(cronetMultiNetLinkWaysUtil);
        timer.schedule(new DelayUnregister(cronetMultiNetLinkWaysUtil, context), 30000);
    }

    private final int reflectCallBind(int i) {
        Log.m105924i(TAG, "try to call reflection version");
        try {
            Class<?> cls = Class.forName("android.net.NetworkUtils");
            Object newInstance = cls.newInstance();
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getDeclaredMethod("bindSocketToNetwork", new Class[]{cls2, cls2}).invoke(newInstance, new Object[]{Integer.valueOf(i), Integer.valueOf(this.mMobileNetId)});
            C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) invoke).intValue();
            Log.m105924i(TAG, "call reflection bind ret: " + intValue);
            return intValue;
        } catch (Exception e) {
            Log.m105920e(TAG, "call reflection bind error: " + e.getMessage());
            return -1;
        }
    }

    private final String resolveHostByCellularImpl(String str) {
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new String();
        Object obj = new Object();
        synchronized (obj) {
            C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new CronetMultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1(this, str, f0Var, obj), 31, (Object) null);
            try {
                obj.wait(2000);
            } catch (Exception e) {
                Log.m105920e(TAG, "dns by cellular fail: " + e);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Log.m105924i(TAG, "host:" + str + ", ip:" + ((String) f0Var.f27484d));
        return (String) f0Var.f27484d;
    }

    private final boolean syncActiveMobileNetwork(Context context) {
        synchronized (this.mLock) {
            if (this.mMobileNetwork == null) {
                activeMobileNetwork(context);
                try {
                    this.mLock.wait(1000);
                } catch (Exception e) {
                    try {
                        Log.m105920e(TAG, "cronet activeMobileNetwork error: " + e);
                    } catch (Throwable th) {
                        delayUnregister(context);
                        throw th;
                    }
                }
                delayUnregister(context);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("get mobile network success: ");
        sb.append(this.mMobileNetwork != null);
        Log.m105924i(TAG, sb.toString());
        return this.mMobileNetwork != null;
    }

    public final void activeMobileNetwork(Context context) {
        if (context == null) {
            Log.m105928w(TAG, "activeMobileNetwork context is null");
            return;
        }
        Log.m105924i(TAG, "start active mobile network");
        if (this.mMobileNetworkCallback == null) {
            this.mMobileNetworkCallback = new MobileNetworkCallback(this);
        }
        Object systemService = context.getSystemService("connectivity");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        NetworkRequest build = builder.build();
        ConnectivityManager.NetworkCallback networkCallback = this.mMobileNetworkCallback;
        C87412m.m108591d(networkCallback);
        ((ConnectivityManager) systemService).requestNetwork(build, networkCallback);
    }

    public final BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular(int i, String str, Context context) {
        C87412m.m108594g(str, "hostDomain");
        if (!syncActiveMobileNetwork(context)) {
            return new BindAndDnsReturnKt(new String(), this.kNoCellularNetwork);
        }
        String resolveHostByCellularImpl = resolveHostByCellularImpl(str);
        return resolveHostByCellularImpl.length() == 0 ? new BindAndDnsReturnKt(new String(), this.kDnsFail) : bindSocketToMobileImpl(i) != 0 ? new BindAndDnsReturnKt(new String(), this.kBindFail) : new BindAndDnsReturnKt(resolveHostByCellularImpl, this.kSuccess);
    }

    public final int bindSocketToMobile(int i, Context context) {
        if (!syncActiveMobileNetwork(context)) {
            return -1;
        }
        return bindSocketToMobileImpl(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void negativeMobileNetwork(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "CronetMultiNetLinkWaysUtil.cronet"
            java.lang.String r1 = "cronet negativeMobileNetwork"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "CronetMultiNetLinkWaysUtil.cronet"
            java.lang.String r0 = "negativeMobileNetwork context == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            return
        L_0x0011:
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            gy3.C87412m.m108592e(r3, r0)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.net.ConnectivityManager$NetworkCallback r1 = r2.mMobileNetworkCallback     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x002e
            java.lang.String r3 = "CronetMultiNetLinkWaysUtil.cronet"
            java.lang.String r1 = "cronet already negativeMobileNetwork"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            return
        L_0x002e:
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0037 }
            r3.unregisterNetworkCallback(r1)     // Catch:{ Exception -> 0x0037 }
            r3 = 0
            r2.mMobileNetworkCallback = r3     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.CronetMultiNetLinkWaysUtil.negativeMobileNetwork(android.content.Context):void");
    }

    public final void onMobileNetworkReady(Network network) {
        C87412m.m108594g(network, "network");
        this.mMobileNetwork = network;
        this.mMobileNetId = network.hashCode() / 11;
        Log.m105924i(TAG, "receive net id is " + this.mMobileNetId);
        synchronized (this.mLock) {
            this.mLock.notifyAll();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public final void onMobileUnAvailable() {
        this.mMobileNetwork = null;
        this.mMobileNetworkCallback = null;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public final String resolveHostByCellular(String str, Context context) {
        C87412m.m108594g(str, "hostDomain");
        return !syncActiveMobileNetwork(context) ? "" : resolveHostByCellularImpl(str);
    }
}
